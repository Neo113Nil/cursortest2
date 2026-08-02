package androidx.media3.extractor.avi;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.CueEncoder;
import androidx.paging.PagingConfig;
import androidx.room.CoroutinesRoom;
import com.android.volley.Response;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AviExtractor implements Extractor {
    public AviMainHeaderChunk aviHeader;
    public final PagingConfig chunkHeaderHolder;
    public ChunkReader[] chunkReaders;
    public ChunkReader currentChunkReader;
    public long durationUs;
    public ExtractorOutput extractorOutput;
    public int hdrlSize;
    public int idx1BodySize;
    public long moviEnd;
    public long moviStart;
    public final boolean parseSubtitlesDuringExtraction;
    public long pendingReposition;
    public final ParsableByteArray scratch;
    public boolean seekMapHasBeenOutput;
    public int state;
    public final CoroutinesRoom.Companion subtitleParserFactory;

    public AviExtractor(int i, CoroutinesRoom.Companion companion) {
        this.subtitleParserFactory = companion;
        this.parseSubtitlesDuringExtraction = (i & 1) == 0;
        this.scratch = new ParsableByteArray(12);
        this.chunkHeaderHolder = new PagingConfig();
        this.extractorOutput = new CueEncoder(13);
        this.chunkReaders = new ChunkReader[0];
        this.moviStart = -1L;
        this.moviEnd = -1L;
        this.hdrlSize = -1;
        this.durationUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.state = 0;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new Response(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        boolean z;
        ChunkReader chunkReader;
        int i;
        int i2;
        ChunkReader chunkReader2;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j = this.pendingReposition;
            if (j < position || j > 262144 + position) {
                iadFrame.b = j;
                z = true;
                this.pendingReposition = -1L;
                if (!z) {
                    return 1;
                }
                int i3 = this.state;
                int i4 = 4;
                ChunkReader chunkReader3 = null;
                PagingConfig pagingConfig = this.chunkHeaderHolder;
                ParsableByteArray parsableByteArray = this.scratch;
                switch (i3) {
                    case 0:
                        if (!sniff(extractorInput)) {
                            throw ParserException.createForMalformedContainer(null, "AVI Header List not found");
                        }
                        extractorInput.skipFully(12);
                        this.state = 1;
                        return 0;
                    case 1:
                        extractorInput.readFully(parsableByteArray.data, 0, 12);
                        parsableByteArray.setPosition(0);
                        pagingConfig.getClass();
                        pagingConfig.pageSize = parsableByteArray.readLittleEndianInt();
                        pagingConfig.prefetchDistance = parsableByteArray.readLittleEndianInt();
                        pagingConfig.initialLoadSize = 0;
                        if (pagingConfig.pageSize != 1414744396) {
                            throw ParserException.createForMalformedContainer(null, "LIST expected, found: " + pagingConfig.pageSize);
                        }
                        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
                        pagingConfig.initialLoadSize = readLittleEndianInt;
                        if (readLittleEndianInt == 1819436136) {
                            this.hdrlSize = pagingConfig.prefetchDistance;
                            this.state = 2;
                            return 0;
                        }
                        throw ParserException.createForMalformedContainer(null, "hdrl expected, found: " + pagingConfig.initialLoadSize);
                    case 2:
                        int i5 = this.hdrlSize - 4;
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(i5);
                        extractorInput.readFully(parsableByteArray2.data, 0, i5);
                        ListChunk parseFrom = ListChunk.parseFrom(1819436136, parsableByteArray2);
                        int i6 = parseFrom.f888type;
                        if (i6 != 1819436136) {
                            throw ParserException.createForMalformedContainer(null, "Unexpected header list type " + i6);
                        }
                        AviMainHeaderChunk aviMainHeaderChunk = (AviMainHeaderChunk) parseFrom.getChild(AviMainHeaderChunk.class);
                        if (aviMainHeaderChunk == null) {
                            throw ParserException.createForMalformedContainer(null, "AviHeader not found");
                        }
                        this.aviHeader = aviMainHeaderChunk;
                        this.durationUs = aviMainHeaderChunk.totalFrames * aviMainHeaderChunk.frameDurationUs;
                        ArrayList arrayList = new ArrayList();
                        ImmutableList.Itr listIterator = parseFrom.children.listIterator(0);
                        int i7 = 0;
                        while (listIterator.hasNext()) {
                            AviChunk aviChunk = (AviChunk) listIterator.next();
                            if (aviChunk.getType() == 1819440243) {
                                ListChunk listChunk = (ListChunk) aviChunk;
                                int i8 = i7 + 1;
                                AviStreamHeaderChunk aviStreamHeaderChunk = (AviStreamHeaderChunk) listChunk.getChild(AviStreamHeaderChunk.class);
                                StreamFormatChunk streamFormatChunk = (StreamFormatChunk) listChunk.getChild(StreamFormatChunk.class);
                                if (aviStreamHeaderChunk == null) {
                                    Log.w("AviExtractor", "Missing Stream Header");
                                } else if (streamFormatChunk == null) {
                                    Log.w("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j2 = aviStreamHeaderChunk.rate;
                                    String str = Util.DEVICE_DEBUG_INFO;
                                    long scaleLargeValue = Util.scaleLargeValue(aviStreamHeaderChunk.length, 1000000 * aviStreamHeaderChunk.scale, j2, RoundingMode.DOWN);
                                    Format format2 = streamFormatChunk.f889format;
                                    Format.Builder buildUpon = format2.buildUpon();
                                    buildUpon.id = Integer.toString(i7);
                                    int i9 = aviStreamHeaderChunk.suggestedBufferSize;
                                    if (i9 != 0) {
                                        buildUpon.maxInputSize = i9;
                                    }
                                    StreamNameChunk streamNameChunk = (StreamNameChunk) listChunk.getChild(StreamNameChunk.class);
                                    if (streamNameChunk != null) {
                                        buildUpon.label = streamNameChunk.name;
                                    }
                                    int trackType = MimeTypes.getTrackType(format2.sampleMimeType);
                                    if (trackType == 1 || trackType == 2) {
                                        TrackOutput track = this.extractorOutput.track(i7, trackType);
                                        track.format(new Format(buildUpon));
                                        track.durationUs(scaleLargeValue);
                                        this.durationUs = Math.max(this.durationUs, scaleLargeValue);
                                        chunkReader = new ChunkReader(i7, aviStreamHeaderChunk, track);
                                        if (chunkReader != null) {
                                            arrayList.add(chunkReader);
                                        }
                                        i7 = i8;
                                    }
                                }
                                chunkReader = null;
                                if (chunkReader != null) {
                                }
                                i7 = i8;
                            }
                        }
                        this.chunkReaders = (ChunkReader[]) arrayList.toArray(new ChunkReader[0]);
                        this.extractorOutput.endTracks();
                        this.state = 3;
                        return 0;
                    case 3:
                        if (this.moviStart != -1) {
                            long position2 = extractorInput.getPosition();
                            long j3 = this.moviStart;
                            if (position2 != j3) {
                                this.pendingReposition = j3;
                                return 0;
                            }
                        }
                        extractorInput.peekFully(0, 12, parsableByteArray.data);
                        extractorInput.resetPeekPosition();
                        parsableByteArray.setPosition(0);
                        pagingConfig.getClass();
                        pagingConfig.pageSize = parsableByteArray.readLittleEndianInt();
                        pagingConfig.prefetchDistance = parsableByteArray.readLittleEndianInt();
                        pagingConfig.initialLoadSize = 0;
                        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
                        int i10 = pagingConfig.pageSize;
                        if (i10 == 1179011410) {
                            extractorInput.skipFully(12);
                            return 0;
                        }
                        if (i10 != 1414744396 || readLittleEndianInt2 != 1769369453) {
                            this.pendingReposition = extractorInput.getPosition() + pagingConfig.prefetchDistance + 8;
                            return 0;
                        }
                        long position3 = extractorInput.getPosition();
                        this.moviStart = position3;
                        this.moviEnd = position3 + pagingConfig.prefetchDistance + 8;
                        if (!this.seekMapHasBeenOutput) {
                            AviMainHeaderChunk aviMainHeaderChunk2 = this.aviHeader;
                            aviMainHeaderChunk2.getClass();
                            if ((aviMainHeaderChunk2.flags & 16) == 16) {
                                this.state = 4;
                                this.pendingReposition = this.moviEnd;
                                return 0;
                            }
                            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                            this.seekMapHasBeenOutput = true;
                        }
                        this.pendingReposition = extractorInput.getPosition() + 12;
                        this.state = 6;
                        return 0;
                    case 4:
                        extractorInput.readFully(parsableByteArray.data, 0, 8);
                        parsableByteArray.setPosition(0);
                        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
                        int readLittleEndianInt4 = parsableByteArray.readLittleEndianInt();
                        if (readLittleEndianInt3 != 829973609) {
                            this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt4;
                            return 0;
                        }
                        this.state = 5;
                        this.idx1BodySize = readLittleEndianInt4;
                        return 0;
                    case 5:
                        ParsableByteArray parsableByteArray3 = new ParsableByteArray(this.idx1BodySize);
                        extractorInput.readFully(parsableByteArray3.data, 0, this.idx1BodySize);
                        if (parsableByteArray3.bytesLeft() >= 16) {
                            int i11 = parsableByteArray3.position;
                            parsableByteArray3.skipBytes(8);
                            long readLittleEndianInt5 = parsableByteArray3.readLittleEndianInt();
                            long j4 = this.moviStart;
                            r20 = readLittleEndianInt5 <= j4 ? j4 + 8 : 0L;
                            parsableByteArray3.setPosition(i11);
                        }
                        while (parsableByteArray3.bytesLeft() >= 16) {
                            int readLittleEndianInt6 = parsableByteArray3.readLittleEndianInt();
                            int readLittleEndianInt7 = parsableByteArray3.readLittleEndianInt();
                            long readLittleEndianInt8 = parsableByteArray3.readLittleEndianInt() + r20;
                            parsableByteArray3.skipBytes(i4);
                            ChunkReader[] chunkReaderArr = this.chunkReaders;
                            int length = chunkReaderArr.length;
                            while (true) {
                                if (i2 < length) {
                                    chunkReader2 = chunkReaderArr[i2];
                                    i2 = (chunkReader2.chunkId == readLittleEndianInt6 || chunkReader2.alternativeChunkId == readLittleEndianInt6) ? 0 : i2 + 1;
                                } else {
                                    chunkReader2 = null;
                                }
                            }
                            if (chunkReader2 != null) {
                                boolean z2 = (readLittleEndianInt7 & 16) == 16;
                                if (chunkReader2.firstIndexChunkOffset == -1) {
                                    chunkReader2.firstIndexChunkOffset = readLittleEndianInt8;
                                }
                                if (z2) {
                                    if (chunkReader2.indexSize == chunkReader2.keyFrameIndices.length) {
                                        long[] jArr = chunkReader2.keyFrameOffsets;
                                        chunkReader2.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = chunkReader2.keyFrameIndices;
                                        chunkReader2.keyFrameIndices = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = chunkReader2.keyFrameOffsets;
                                    int i12 = chunkReader2.indexSize;
                                    jArr2[i12] = readLittleEndianInt8;
                                    chunkReader2.keyFrameIndices[i12] = chunkReader2.indexChunkCount;
                                    chunkReader2.indexSize = i12 + 1;
                                }
                                chunkReader2.indexChunkCount++;
                            }
                            i4 = 4;
                        }
                        for (ChunkReader chunkReader4 : this.chunkReaders) {
                            chunkReader4.keyFrameOffsets = Arrays.copyOf(chunkReader4.keyFrameOffsets, chunkReader4.indexSize);
                            chunkReader4.keyFrameIndices = Arrays.copyOf(chunkReader4.keyFrameIndices, chunkReader4.indexSize);
                            if ((chunkReader4.chunkId & 1651965952) == 1651965952 && chunkReader4.streamHeaderChunk.sampleSize != 0 && (i = chunkReader4.indexSize) > 0) {
                                chunkReader4.chunkCount = i;
                            }
                        }
                        this.seekMapHasBeenOutput = true;
                        int length2 = this.chunkReaders.length;
                        ExtractorOutput extractorOutput = this.extractorOutput;
                        long j5 = this.durationUs;
                        if (length2 == 0) {
                            extractorOutput.seekMap(new SeekMap.Unseekable(j5));
                        } else {
                            extractorOutput.seekMap(new SeekMap.Unseekable(this, j5, 2));
                        }
                        this.state = 6;
                        this.pendingReposition = this.moviStart;
                        return 0;
                    case 6:
                        if (extractorInput.getPosition() >= this.moviEnd) {
                            return -1;
                        }
                        ChunkReader chunkReader5 = this.currentChunkReader;
                        if (chunkReader5 != null) {
                            int i13 = chunkReader5.bytesRemainingInCurrentChunk;
                            int sampleData = i13 - chunkReader5.trackOutput.sampleData((DataReader) extractorInput, i13, false);
                            chunkReader5.bytesRemainingInCurrentChunk = sampleData;
                            boolean z3 = sampleData == 0;
                            if (z3) {
                                if (chunkReader5.currentChunkSize > 0) {
                                    TrackOutput trackOutput = chunkReader5.trackOutput;
                                    int i14 = chunkReader5.currentChunkIndex;
                                    trackOutput.sampleMetadata((chunkReader5.durationUs * i14) / chunkReader5.chunkCount, Arrays.binarySearch(chunkReader5.keyFrameIndices, i14) >= 0 ? 1 : 0, chunkReader5.currentChunkSize, 0, null);
                                }
                                chunkReader5.currentChunkIndex++;
                            }
                            if (z3) {
                                this.currentChunkReader = null;
                            }
                            return 0;
                        }
                        if ((extractorInput.getPosition() & 1) == 1) {
                            extractorInput.skipFully(1);
                        }
                        extractorInput.peekFully(0, 12, parsableByteArray.data);
                        parsableByteArray.setPosition(0);
                        int readLittleEndianInt9 = parsableByteArray.readLittleEndianInt();
                        if (readLittleEndianInt9 == 1414744396) {
                            parsableByteArray.setPosition(8);
                            extractorInput.skipFully(parsableByteArray.readLittleEndianInt() == 1769369453 ? 12 : 8);
                            extractorInput.resetPeekPosition();
                            return 0;
                        }
                        int readLittleEndianInt10 = parsableByteArray.readLittleEndianInt();
                        if (readLittleEndianInt9 == 1263424842) {
                            this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt10 + 8;
                            return 0;
                        }
                        extractorInput.skipFully(8);
                        extractorInput.resetPeekPosition();
                        for (ChunkReader chunkReader6 : this.chunkReaders) {
                            if (chunkReader6.chunkId == readLittleEndianInt9 || chunkReader6.alternativeChunkId == readLittleEndianInt9) {
                                chunkReader3 = chunkReader6;
                                if (chunkReader3 != null) {
                                    this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt10;
                                    return 0;
                                }
                                chunkReader3.currentChunkSize = readLittleEndianInt10;
                                chunkReader3.bytesRemainingInCurrentChunk = readLittleEndianInt10;
                                this.currentChunkReader = chunkReader3;
                                return 0;
                            }
                        }
                        if (chunkReader3 != null) {
                        }
                        break;
                    default:
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return 0;
                }
            } else {
                extractorInput.skipFully((int) (j - position));
            }
        }
        z = false;
        this.pendingReposition = -1L;
        if (!z) {
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (ChunkReader chunkReader : this.chunkReaders) {
            if (chunkReader.indexSize == 0) {
                chunkReader.currentChunkIndex = 0;
            } else {
                chunkReader.currentChunkIndex = chunkReader.keyFrameIndices[Util.binarySearchFloor(chunkReader.keyFrameOffsets, j, true)];
            }
        }
        if (j != 0) {
            this.state = 6;
        } else if (this.chunkReaders.length == 0) {
            this.state = 0;
        } else {
            this.state = 3;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.scratch;
        extractorInput.peekFully(0, 12, parsableByteArray.data);
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readLittleEndianInt() != 1179011410) {
            return false;
        }
        parsableByteArray.skipBytes(4);
        return parsableByteArray.readLittleEndianInt() == 541677121;
    }
}
