package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.VorbisBitArray;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.GlideBuilder$1;
import com.google.android.libraries.places.internal.zzcjk;
import com.plaid.internal.EnumC0170g;
import net.idrnd.misnap.iad.IadFrame;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class PsExtractor implements Extractor {
    public boolean foundAllTracks;
    public boolean foundAudioTrack;
    public boolean foundVideoTrack;
    public boolean hasOutputSeekMap;
    public long lastTrackPosition;
    public ExtractorOutput output;
    public PsBinarySearchSeeker psBinarySearchSeeker;
    public final TimestampAdjuster timestampAdjuster = new TimestampAdjuster(0);
    public final ParsableByteArray psPacketBuffer = new ParsableByteArray(4096);
    public final SparseArray psPayloadReaders = new SparseArray();
    public final PsDurationReader durationReader = new PsDurationReader(0);

    public final class PesReader {
        public boolean dtsFlag;
        public final ElementaryStreamReader pesPayloadReader;
        public final VorbisBitArray pesScratch = new VorbisBitArray(new byte[64], 64);
        public boolean ptsFlag;
        public boolean seenFirstDts;
        public long timeUs;
        public final TimestampAdjuster timestampAdjuster;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.pesPayloadReader = elementaryStreamReader;
            this.timestampAdjuster = timestampAdjuster;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        char c;
        int i;
        int i2;
        ElementaryStreamReader elementaryStreamReader;
        long j;
        this.output.getClass();
        long length = extractorInput.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = -9223372036854775807L;
        PsDurationReader psDurationReader = this.durationReader;
        if (i3 != 0) {
            c = 3;
            if (!psDurationReader.isDurationRead) {
                TimestampAdjuster timestampAdjuster = psDurationReader.scrTimestampAdjuster;
                ParsableByteArray parsableByteArray = psDurationReader.packetBuffer;
                if (!psDurationReader.isLastScrValueRead) {
                    long length2 = extractorInput.getLength();
                    int min = (int) Math.min(20000L, length2);
                    long j3 = length2 - min;
                    if (extractorInput.getPosition() != j3) {
                        iadFrame.b = j3;
                        return 1;
                    }
                    parsableByteArray.reset(min);
                    extractorInput.resetPeekPosition();
                    extractorInput.peekFully(0, min, parsableByteArray.data);
                    int i4 = parsableByteArray.position;
                    int i5 = parsableByteArray.limit - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (PsDurationReader.peekIntAtPosition(i5, parsableByteArray.data) == 442) {
                            parsableByteArray.setPosition(i5 + 4);
                            long readScrValueFromPack = PsDurationReader.readScrValueFromPack(parsableByteArray);
                            if (readScrValueFromPack != -9223372036854775807L) {
                                j2 = readScrValueFromPack;
                                break;
                            }
                        }
                        i5--;
                    }
                    psDurationReader.lastScrValue = j2;
                    psDurationReader.isLastScrValueRead = true;
                    return 0;
                }
                if (psDurationReader.lastScrValue == -9223372036854775807L) {
                    psDurationReader.finishReadDuration(extractorInput);
                    return 0;
                }
                if (psDurationReader.isFirstScrValueRead) {
                    long j4 = psDurationReader.firstScrValue;
                    if (j4 == -9223372036854775807L) {
                        psDurationReader.finishReadDuration(extractorInput);
                        return 0;
                    }
                    psDurationReader.durationUs = timestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(psDurationReader.lastScrValue) - timestampAdjuster.adjustTsTimestamp(j4);
                    psDurationReader.finishReadDuration(extractorInput);
                    return 0;
                }
                int min2 = (int) Math.min(20000L, extractorInput.getLength());
                if (extractorInput.getPosition() != 0) {
                    iadFrame.b = 0L;
                    return 1;
                }
                parsableByteArray.reset(min2);
                extractorInput.resetPeekPosition();
                extractorInput.peekFully(0, min2, parsableByteArray.data);
                int i6 = parsableByteArray.position;
                int i7 = parsableByteArray.limit;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    if (PsDurationReader.peekIntAtPosition(i6, parsableByteArray.data) == 442) {
                        parsableByteArray.setPosition(i6 + 4);
                        long readScrValueFromPack2 = PsDurationReader.readScrValueFromPack(parsableByteArray);
                        if (readScrValueFromPack2 != -9223372036854775807L) {
                            j = readScrValueFromPack2;
                            break;
                        }
                    }
                    i6++;
                }
                psDurationReader.firstScrValue = j;
                psDurationReader.isFirstScrValueRead = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.hasOutputSeekMap) {
            i = i3;
            i2 = 4;
        } else {
            this.hasOutputSeekMap = true;
            long j5 = psDurationReader.durationUs;
            if (j5 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(new GlideBuilder$1(), new AndroidSvg(psDurationReader.scrTimestampAdjuster), j5, j5 + 1, 0L, length, 188L, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                this.psBinarySearchSeeker = psBinarySearchSeeker;
                this.output.seekMap(psBinarySearchSeeker.seekMap);
            } else {
                i = i3;
                i2 = 4;
                this.output.seekMap(new SeekMap.Unseekable(j5));
            }
        }
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.seekOperationParams != null) {
            return psBinarySearchSeeker2.handlePendingSeek(extractorInput, iadFrame);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = i != 0 ? length - extractorInput.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        ParsableByteArray parsableByteArray2 = this.psPacketBuffer;
        if (!extractorInput.peekFully(parsableByteArray2.data, 0, i2, true)) {
            return -1;
        }
        parsableByteArray2.setPosition(0);
        int readInt = parsableByteArray2.readInt();
        if (readInt == 441) {
            return -1;
        }
        if (readInt == 442) {
            extractorInput.peekFully(0, 10, parsableByteArray2.data);
            parsableByteArray2.setPosition(9);
            extractorInput.skipFully((parsableByteArray2.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (readInt == 443) {
            extractorInput.peekFully(0, 2, parsableByteArray2.data);
            parsableByteArray2.setPosition(0);
            extractorInput.skipFully(parsableByteArray2.readUnsignedShort() + 6);
            return 0;
        }
        if (((readInt & (-256)) >> 8) != 1) {
            extractorInput.skipFully(1);
            return 0;
        }
        int i8 = readInt & 255;
        SparseArray sparseArray = this.psPayloadReaders;
        PesReader pesReader = (PesReader) sparseArray.get(i8);
        if (!this.foundAllTracks) {
            if (pesReader == null) {
                if (i8 == 189) {
                    elementaryStreamReader = new Ac3Reader("video/mp2p");
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((readInt & 224) == 192) {
                    elementaryStreamReader = new MpegAudioReader(null, 0, "video/mp2p");
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((readInt & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 224) {
                    elementaryStreamReader = new H262Reader(null, "video/mp2p");
                    this.foundVideoTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else {
                    elementaryStreamReader = null;
                }
                if (elementaryStreamReader != null) {
                    elementaryStreamReader.createTracks(this.output, new zzcjk(i8, 256));
                    pesReader = new PesReader(elementaryStreamReader, this.timestampAdjuster);
                    sparseArray.put(i8, pesReader);
                }
            }
            if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + 8192 : 1048576L)) {
                this.foundAllTracks = true;
                this.output.endTracks();
            }
        }
        extractorInput.peekFully(0, 2, parsableByteArray2.data);
        parsableByteArray2.setPosition(0);
        int readUnsignedShort = parsableByteArray2.readUnsignedShort() + 6;
        if (pesReader == null) {
            extractorInput.skipFully(readUnsignedShort);
            return 0;
        }
        parsableByteArray2.reset(readUnsignedShort);
        extractorInput.readFully(parsableByteArray2.data, 0, readUnsignedShort);
        parsableByteArray2.setPosition(6);
        ElementaryStreamReader elementaryStreamReader2 = pesReader.pesPayloadReader;
        VorbisBitArray vorbisBitArray = pesReader.pesScratch;
        parsableByteArray2.readBytes(0, 3, vorbisBitArray.data);
        vorbisBitArray.setPosition(0);
        vorbisBitArray.skipBits(8);
        pesReader.ptsFlag = vorbisBitArray.readBit();
        pesReader.dtsFlag = vorbisBitArray.readBit();
        vorbisBitArray.skipBits(6);
        parsableByteArray2.readBytes(0, vorbisBitArray.readBits(8), vorbisBitArray.data);
        vorbisBitArray.setPosition(0);
        TimestampAdjuster timestampAdjuster2 = pesReader.timestampAdjuster;
        pesReader.timeUs = 0L;
        if (pesReader.ptsFlag) {
            vorbisBitArray.skipBits(4);
            vorbisBitArray.skipBits(1);
            vorbisBitArray.skipBits(1);
            long readBits = (vorbisBitArray.readBits(3) << 30) | (vorbisBitArray.readBits(15) << 15) | vorbisBitArray.readBits(15);
            vorbisBitArray.skipBits(1);
            if (!pesReader.seenFirstDts && pesReader.dtsFlag) {
                vorbisBitArray.skipBits(4);
                vorbisBitArray.skipBits(1);
                vorbisBitArray.skipBits(1);
                vorbisBitArray.skipBits(1);
                timestampAdjuster2.adjustTsTimestamp((vorbisBitArray.readBits(3) << 30) | (vorbisBitArray.readBits(15) << 15) | vorbisBitArray.readBits(15));
                pesReader.seenFirstDts = true;
            }
            pesReader.timeUs = timestampAdjuster2.adjustTsTimestamp(readBits);
        }
        elementaryStreamReader2.packetStarted(4, pesReader.timeUs);
        elementaryStreamReader2.consume(parsableByteArray2);
        elementaryStreamReader2.packetFinished(false);
        parsableByteArray2.setLimit(parsableByteArray2.data.length);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.psPayloadReaders;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
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
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.setSeekTargetUs(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            PesReader pesReader = (PesReader) sparseArray.valueAt(i);
            pesReader.seenFirstDts = false;
            pesReader.pesPayloadReader.seek();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        byte[] bArr = new byte[14];
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            defaultExtractorInput.advancePeekPosition(bArr[13] & 7, false);
            defaultExtractorInput.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }
}
