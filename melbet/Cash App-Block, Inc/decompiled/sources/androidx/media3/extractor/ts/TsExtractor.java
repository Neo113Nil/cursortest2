package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.text.SubtitleParser;
import app.cash.zipline.CallResult;
import com.android.volley.Response;
import com.bumptech.glide.GlideBuilder$1;
import java.util.Collections;
import java.util.List;
import net.idrnd.misnap.iad.IadFrame;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class TsExtractor implements Extractor {
    public final SparseIntArray continuityCounters;
    public final PsDurationReader durationReader;
    public final int extractorFlags;
    public boolean hasOutputSeekMap;
    public ExtractorOutput output;
    public final DefaultTsPayloadReaderFactory payloadReaderFactory;
    public int pcrPid;
    public boolean pendingSeekToStart;
    public int remainingPmts;
    public final SubtitleParser.Factory subtitleParserFactory;
    public final List timestampAdjusters;
    public final SparseBooleanArray trackIds;
    public final SparseBooleanArray trackPids;
    public boolean tracksEnded;
    public PsBinarySearchSeeker tsBinarySearchSeeker;
    public final ParsableByteArray tsPacketBuffer = new ParsableByteArray(new byte[9400], 0);
    public final SparseArray tsPayloadReaders;

    public TsExtractor(int i, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.payloadReaderFactory = defaultTsPayloadReaderFactory;
        this.extractorFlags = i;
        this.subtitleParserFactory = factory;
        this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.trackIds = sparseBooleanArray;
        this.trackPids = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.tsPayloadReaders = sparseArray;
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new PsDurationReader(1);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (TsPayloadReader) sparseArray2.valueAt(i2));
        }
        CallResult callResult = new CallResult();
        callResult.serviceNames = this;
        callResult.result = new VorbisBitArray(new byte[4], 4);
        sparseArray.put(0, new SectionReader(callResult));
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if ((this.extractorFlags & 1) == 0) {
            extractorOutput = new Response(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        ExtractorInput extractorInput2;
        int i;
        ?? r1;
        boolean z;
        long j;
        long length = extractorInput.getLength();
        if (this.tracksEnded) {
            long j2 = -9223372036854775807L;
            PsDurationReader psDurationReader = this.durationReader;
            if (length != -1 && !psDurationReader.isDurationRead) {
                int i2 = this.pcrPid;
                TimestampAdjuster timestampAdjuster = psDurationReader.scrTimestampAdjuster;
                ParsableByteArray parsableByteArray = psDurationReader.packetBuffer;
                if (i2 <= 0) {
                    psDurationReader.finishReadDuration(extractorInput);
                    return 0;
                }
                if (psDurationReader.isLastScrValueRead) {
                    if (psDurationReader.lastScrValue == -9223372036854775807L) {
                        psDurationReader.finishReadDuration(extractorInput);
                        return 0;
                    }
                    if (psDurationReader.isFirstScrValueRead) {
                        long j3 = psDurationReader.firstScrValue;
                        if (j3 == -9223372036854775807L) {
                            psDurationReader.finishReadDuration(extractorInput);
                            return 0;
                        }
                        psDurationReader.durationUs = timestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(psDurationReader.lastScrValue) - timestampAdjuster.adjustTsTimestamp(j3);
                        psDurationReader.finishReadDuration(extractorInput);
                        return 0;
                    }
                    int min = (int) Math.min(112800L, extractorInput.getLength());
                    if (extractorInput.getPosition() != 0) {
                        iadFrame.b = 0L;
                        return 1;
                    }
                    parsableByteArray.reset(min);
                    extractorInput.resetPeekPosition();
                    extractorInput.peekFully(0, min, parsableByteArray.data);
                    int i3 = parsableByteArray.position;
                    int i4 = parsableByteArray.limit;
                    while (true) {
                        if (i3 >= i4) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (parsableByteArray.data[i3] == 71) {
                            j = TsUtil.readPcrFromPacket(parsableByteArray, i3, i2);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3++;
                    }
                    psDurationReader.firstScrValue = j;
                    psDurationReader.isFirstScrValueRead = true;
                    return 0;
                }
                long length2 = extractorInput.getLength();
                int min2 = (int) Math.min(112800L, length2);
                long j4 = length2 - min2;
                if (extractorInput.getPosition() != j4) {
                    iadFrame.b = j4;
                    return 1;
                }
                parsableByteArray.reset(min2);
                extractorInput.resetPeekPosition();
                extractorInput.peekFully(0, min2, parsableByteArray.data);
                int i5 = parsableByteArray.position;
                int i6 = parsableByteArray.limit;
                int i7 = i6 - 188;
                while (true) {
                    if (i7 < i5) {
                        break;
                    }
                    byte[] bArr = parsableByteArray.data;
                    int i8 = -4;
                    int i9 = 0;
                    while (true) {
                        if (i8 > 4) {
                            break;
                        }
                        int i10 = (i8 * 188) + i7;
                        if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                            i9 = 0;
                        } else {
                            i9++;
                            if (i9 == 5) {
                                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i7, i2);
                                if (readPcrFromPacket != -9223372036854775807L) {
                                    j2 = readPcrFromPacket;
                                    break;
                                }
                            }
                        }
                        i8++;
                    }
                    i7--;
                }
                psDurationReader.lastScrValue = j2;
                psDurationReader.isLastScrValueRead = true;
                return 0;
            }
            if (this.hasOutputSeekMap) {
                i = 1;
                z = false;
            } else {
                this.hasOutputSeekMap = true;
                long j5 = psDurationReader.durationUs;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(new GlideBuilder$1(), new HuffmanTreeGroup(this.pcrPid, psDurationReader.scrTimestampAdjuster), j5, j5 + 1, 0L, length, 188L, 940);
                    this.tsBinarySearchSeeker = psBinarySearchSeeker;
                    this.output.seekMap(psBinarySearchSeeker.seekMap);
                } else {
                    z = false;
                    i = 1;
                    this.output.seekMap(new SeekMap.Unseekable(j5));
                }
            }
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = z;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    iadFrame.b = 0L;
                    return i;
                }
            }
            PsBinarySearchSeeker psBinarySearchSeeker2 = this.tsBinarySearchSeeker;
            if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.seekOperationParams != null) {
                return psBinarySearchSeeker2.handlePendingSeek(extractorInput, iadFrame);
            }
            extractorInput2 = extractorInput;
            r1 = z;
        } else {
            extractorInput2 = extractorInput;
            i = 1;
            r1 = 0;
        }
        ParsableByteArray parsableByteArray2 = this.tsPacketBuffer;
        byte[] bArr2 = parsableByteArray2.data;
        if (9400 - parsableByteArray2.position < 188) {
            int bytesLeft = parsableByteArray2.bytesLeft();
            if (bytesLeft > 0) {
                System.arraycopy(bArr2, parsableByteArray2.position, bArr2, r1, bytesLeft);
            }
            parsableByteArray2.reset(bytesLeft, bArr2);
        }
        while (true) {
            int bytesLeft2 = parsableByteArray2.bytesLeft();
            SparseArray sparseArray = this.tsPayloadReaders;
            if (bytesLeft2 >= 188) {
                int i11 = parsableByteArray2.position;
                int i12 = parsableByteArray2.limit;
                byte[] bArr3 = parsableByteArray2.data;
                while (i11 < i12 && bArr3[i11] != 71) {
                    i11++;
                }
                parsableByteArray2.setPosition(i11);
                int i13 = i11 + 188;
                int i14 = parsableByteArray2.limit;
                if (i13 > i14) {
                    return r1;
                }
                int readInt = parsableByteArray2.readInt();
                if ((8388608 & readInt) != 0) {
                    parsableByteArray2.setPosition(i13);
                    return r1;
                }
                int i15 = (4194304 & readInt) != 0 ? 1 : r1;
                int i16 = (2096896 & readInt) >> 8;
                boolean z2 = (readInt & 32) != 0 ? true : r1;
                TsPayloadReader tsPayloadReader = (readInt & 16) != 0 ? (TsPayloadReader) sparseArray.get(i16) : null;
                if (tsPayloadReader == null) {
                    parsableByteArray2.setPosition(i13);
                    return r1;
                }
                int i17 = readInt & 15;
                SparseIntArray sparseIntArray = this.continuityCounters;
                int i18 = sparseIntArray.get(i16, i17 - 1);
                sparseIntArray.put(i16, i17);
                if (i18 == i17) {
                    parsableByteArray2.setPosition(i13);
                    return r1;
                }
                if (i17 != ((i18 + 1) & 15)) {
                    tsPayloadReader.seek();
                }
                if (z2) {
                    int readUnsignedByte = parsableByteArray2.readUnsignedByte();
                    i15 |= (parsableByteArray2.readUnsignedByte() & 64) != 0 ? 2 : r1;
                    parsableByteArray2.skipBytes(readUnsignedByte - 1);
                }
                boolean z3 = this.tracksEnded;
                if (z3 || !this.trackPids.get(i16, r1)) {
                    parsableByteArray2.setLimit(i13);
                    tsPayloadReader.consume(i15, parsableByteArray2);
                    parsableByteArray2.setLimit(i14);
                }
                if (!z3 && this.tracksEnded && length != -1) {
                    this.pendingSeekToStart = true;
                }
                parsableByteArray2.setPosition(i13);
                return r1;
            }
            int i19 = parsableByteArray2.limit;
            int read = extractorInput2.read(bArr2, i19, 9400 - i19);
            if (read == -1) {
                int i20 = r1;
                while (i20 < sparseArray.size()) {
                    TsPayloadReader tsPayloadReader2 = (TsPayloadReader) sparseArray.valueAt(i20);
                    if (tsPayloadReader2 instanceof PesReader) {
                        PesReader pesReader = (PesReader) tsPayloadReader2;
                        if (pesReader.state == 3 && pesReader.payloadSize == -1) {
                            pesReader.consume(i, new ParsableByteArray());
                        }
                    }
                    i20++;
                    i = 1;
                }
                return -1;
            }
            parsableByteArray2.setLimit(i19 + read);
            i = 1;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        PsBinarySearchSeeker psBinarySearchSeeker;
        long j3;
        SparseArray sparseArray = this.tsPayloadReaders;
        List list = this.timestampAdjusters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) list.get(i);
            synchronized (timestampAdjuster) {
                j3 = timestampAdjuster.timestampOffsetUs;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                timestampAdjuster.reset(j2);
            }
        }
        if (j2 != 0 && (psBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            psBinarySearchSeeker.setSeekTargetUs(j2);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((TsPayloadReader) sparseArray.valueAt(i2)).seek();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sniff(ExtractorInput extractorInput) {
        byte[] bArr = this.tsPacketBuffer.data;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            defaultExtractorInput.skipFully(i, false);
            return true;
        }
        return false;
    }
}
