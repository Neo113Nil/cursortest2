package androidx.media3.extractor.flac;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSearchResult;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.ts.PsBinarySearchSeeker;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import coil3.svg.internal.AndroidSvg;
import com.google.common.collect.ImmutableList;
import java.nio.ByteOrder;
import java.util.Arrays;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FlacExtractor implements Extractor {
    public PsBinarySearchSeeker binarySearchSeeker;
    public int currentFrameBytesWritten;
    public long currentFrameFirstSampleNumber;
    public ExtractorOutput extractorOutput;
    public FlacStreamMetadata flacStreamMetadata;
    public int frameStartMarker;
    public Metadata id3Metadata;
    public int minFrameSize;
    public TrackOutput trackOutput;
    public final byte[] streamMarkerAndInfoBlock = new byte[42];
    public final ParsableByteArray buffer = new ParsableByteArray(new byte[32768], 0);
    public final boolean id3MetadataDisabled = false;
    public final IadFrame sampleNumberHolder = new IadFrame(2);
    public int state = 0;

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        FlacStreamMetadata flacStreamMetadata;
        int i;
        SeekMap unseekable;
        long j;
        long j2;
        boolean z;
        long readUtf8EncodedLong;
        long j3;
        int i2 = this.state;
        Metadata metadata = null;
        if (i2 == 0) {
            extractorInput.resetPeekPosition();
            long peekPosition = extractorInput.getPeekPosition();
            Metadata peekId3Data = new Id3Peeker(0).peekId3Data(extractorInput, !this.id3MetadataDisabled ? null : Id3Decoder.NO_FRAMES_PREDICATE, 0);
            if (peekId3Data != null && peekId3Data.entries.length != 0) {
                metadata = peekId3Data;
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - peekPosition));
            this.id3Metadata = metadata;
            this.state = 1;
            return 0;
        }
        byte[] bArr = this.streamMarkerAndInfoBlock;
        if (i2 == 1) {
            extractorInput.peekFully(0, bArr.length, bArr);
            extractorInput.resetPeekPosition();
            this.state = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            extractorInput.readFully(parsableByteArray.data, 0, 4);
            if (parsableByteArray.readUnsignedInt() != 1716281667) {
                throw ParserException.createForMalformedContainer(null, "Failed to read FLAC stream marker.");
            }
            this.state = 3;
            return 0;
        }
        int i5 = 6;
        if (i2 == 3) {
            int i6 = 0;
            FlacStreamMetadata flacStreamMetadata2 = this.flacStreamMetadata;
            boolean z2 = false;
            while (!z2) {
                extractorInput.resetPeekPosition();
                byte[] bArr2 = new byte[i3];
                VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr2, i3);
                int i7 = i6;
                extractorInput.peekFully(i7, i3, bArr2);
                boolean readBit = vorbisBitArray.readBit();
                int readBits = vorbisBitArray.readBits(r10);
                int readBits2 = vorbisBitArray.readBits(24) + i3;
                if (readBits == 0) {
                    byte[] bArr3 = new byte[38];
                    extractorInput.readFully(bArr3, i7, 38);
                    flacStreamMetadata2 = new FlacStreamMetadata(bArr3, i3);
                } else {
                    if (flacStreamMetadata2 == null) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return 0;
                    }
                    Metadata metadata2 = flacStreamMetadata2.metadata;
                    if (readBits == i4) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(readBits2);
                        extractorInput.readFully(parsableByteArray2.data, i7, readBits2);
                        flacStreamMetadata2 = new FlacStreamMetadata(flacStreamMetadata2.minBlockSizeSamples, flacStreamMetadata2.maxBlockSizeSamples, flacStreamMetadata2.minFrameSize, flacStreamMetadata2.maxFrameSize, flacStreamMetadata2.sampleRate, flacStreamMetadata2.channels, flacStreamMetadata2.bitsPerSample, flacStreamMetadata2.totalSamples, AacUtil.readSeekTableMetadataBlock(parsableByteArray2), flacStreamMetadata2.metadata);
                    } else {
                        if (readBits == i3) {
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray(readBits2);
                            extractorInput.readFully(parsableByteArray3.data, 0, readBits2);
                            parsableByteArray3.skipBytes(i3);
                            Metadata parseVorbisComments = AacUtil.parseVorbisComments(Arrays.asList((String[]) AacUtil.readVorbisCommentHeader(parsableByteArray3, false, false).mClientFragmentManager));
                            if (metadata2 != null) {
                                parseVorbisComments = metadata2.copyWithAppendedEntriesFrom(parseVorbisComments);
                            }
                            flacStreamMetadata = new FlacStreamMetadata(flacStreamMetadata2.minBlockSizeSamples, flacStreamMetadata2.maxBlockSizeSamples, flacStreamMetadata2.minFrameSize, flacStreamMetadata2.maxFrameSize, flacStreamMetadata2.sampleRate, flacStreamMetadata2.channels, flacStreamMetadata2.bitsPerSample, flacStreamMetadata2.totalSamples, flacStreamMetadata2.seekTable, parseVorbisComments);
                        } else if (readBits == i5) {
                            ParsableByteArray parsableByteArray4 = new ParsableByteArray(readBits2);
                            extractorInput.readFully(parsableByteArray4.data, 0, readBits2);
                            parsableByteArray4.skipBytes(4);
                            Metadata metadata3 = new Metadata(ImmutableList.of((Object) PictureFrame.fromPictureBlock(parsableByteArray4)));
                            if (metadata2 != null) {
                                metadata3 = metadata2.copyWithAppendedEntriesFrom(metadata3);
                            }
                            flacStreamMetadata = new FlacStreamMetadata(flacStreamMetadata2.minBlockSizeSamples, flacStreamMetadata2.maxBlockSizeSamples, flacStreamMetadata2.minFrameSize, flacStreamMetadata2.maxFrameSize, flacStreamMetadata2.sampleRate, flacStreamMetadata2.channels, flacStreamMetadata2.bitsPerSample, flacStreamMetadata2.totalSamples, flacStreamMetadata2.seekTable, metadata3);
                        } else {
                            extractorInput.skipFully(readBits2);
                        }
                        flacStreamMetadata2 = flacStreamMetadata;
                    }
                }
                String str = Util.DEVICE_DEBUG_INFO;
                this.flacStreamMetadata = flacStreamMetadata2;
                z2 = readBit;
                i3 = 4;
                i4 = 3;
                r10 = 7;
                i5 = 6;
                i6 = 0;
            }
            this.flacStreamMetadata.getClass();
            this.minFrameSize = Math.max(this.flacStreamMetadata.minFrameSize, 6);
            Format format2 = this.flacStreamMetadata.getFormat(bArr, this.id3Metadata);
            TrackOutput trackOutput = this.trackOutput;
            Format.Builder buildUpon = format2.buildUpon();
            buildUpon.containerMimeType = MimeTypes.normalizeMimeType("audio/flac");
            NavAction$$ExternalSyntheticOutline0.m(buildUpon, trackOutput);
            this.trackOutput.durationUs(this.flacStreamMetadata.getDurationUs());
            this.state = 4;
            return 0;
        }
        long j4 = 0;
        if (i2 == 4) {
            extractorInput.resetPeekPosition();
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            extractorInput.peekFully(0, 2, parsableByteArray5.data);
            int readUnsignedShort = parsableByteArray5.readUnsignedShort();
            if ((readUnsignedShort >> 2) != 16382) {
                extractorInput.resetPeekPosition();
                throw ParserException.createForMalformedContainer(null, "First frame does not start with sync code.");
            }
            extractorInput.resetPeekPosition();
            this.frameStartMarker = readUnsignedShort;
            ExtractorOutput extractorOutput = this.extractorOutput;
            String str2 = Util.DEVICE_DEBUG_INFO;
            long position = extractorInput.getPosition();
            long length = extractorInput.getLength();
            this.flacStreamMetadata.getClass();
            final FlacStreamMetadata flacStreamMetadata3 = this.flacStreamMetadata;
            AndroidSvg androidSvg = flacStreamMetadata3.seekTable;
            if (androidSvg != null && ((long[]) androidSvg.svg).length > 0) {
                unseekable = new SeekMap.Unseekable(flacStreamMetadata3, position, 1);
                i = 0;
            } else if (length == -1 || flacStreamMetadata3.totalSamples <= 0) {
                i = 0;
                unseekable = new SeekMap.Unseekable(flacStreamMetadata3.getDurationUs());
            } else {
                final int i8 = this.frameStartMarker;
                int i9 = flacStreamMetadata3.minFrameSize;
                ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(flacStreamMetadata3, 9);
                BinarySearchSeeker$TimestampSeeker binarySearchSeeker$TimestampSeeker = new BinarySearchSeeker$TimestampSeeker(flacStreamMetadata3, i8) { // from class: androidx.media3.extractor.flac.FlacBinarySearchSeeker$FlacTimestampSeeker
                    public final FlacStreamMetadata flacStreamMetadata;
                    public final int frameStartMarker;
                    public final IadFrame sampleNumberHolder = new IadFrame(2);

                    {
                        this.flacStreamMetadata = flacStreamMetadata3;
                        this.frameStartMarker = i8;
                    }

                    public final long findNextFrame(ExtractorInput extractorInput2) {
                        IadFrame iadFrame2;
                        FlacStreamMetadata flacStreamMetadata4;
                        int peek;
                        while (true) {
                            long peekPosition2 = extractorInput2.getPeekPosition();
                            long length2 = extractorInput2.getLength() - 6;
                            iadFrame2 = this.sampleNumberHolder;
                            flacStreamMetadata4 = this.flacStreamMetadata;
                            if (peekPosition2 >= length2) {
                                break;
                            }
                            long peekPosition3 = extractorInput2.getPeekPosition();
                            ParsableByteArray parsableByteArray6 = new ParsableByteArray(17);
                            int i10 = 0;
                            boolean checkAndReadFrameHeader = false;
                            extractorInput2.peekFully(0, 2, parsableByteArray6.data);
                            char peekChar = parsableByteArray6.peekChar(0, ByteOrder.BIG_ENDIAN);
                            int i11 = this.frameStartMarker;
                            if (peekChar != i11) {
                                extractorInput2.resetPeekPosition();
                                extractorInput2.advancePeekPosition((int) (peekPosition3 - extractorInput2.getPosition()));
                            } else {
                                byte[] bArr4 = parsableByteArray6.data;
                                while (i10 < 15 && (peek = extractorInput2.peek(2 + i10, 15 - i10, bArr4)) != -1) {
                                    i10 += peek;
                                }
                                parsableByteArray6.setLimit(i10 + 2);
                                extractorInput2.resetPeekPosition();
                                extractorInput2.advancePeekPosition((int) (peekPosition3 - extractorInput2.getPosition()));
                                checkAndReadFrameHeader = AacUtil.checkAndReadFrameHeader(parsableByteArray6, flacStreamMetadata4, i11, iadFrame2);
                            }
                            if (checkAndReadFrameHeader) {
                                break;
                            }
                            extractorInput2.advancePeekPosition(1);
                        }
                        if (extractorInput2.getPeekPosition() < extractorInput2.getLength() - 6) {
                            return iadFrame2.b;
                        }
                        extractorInput2.advancePeekPosition((int) (extractorInput2.getLength() - extractorInput2.getPeekPosition()));
                        return flacStreamMetadata4.totalSamples;
                    }

                    @Override // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
                    public final BinarySearchSeeker$TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput2, long j5) {
                        long position2 = extractorInput2.getPosition();
                        long findNextFrame = findNextFrame(extractorInput2);
                        long peekPosition2 = extractorInput2.getPeekPosition();
                        extractorInput2.advancePeekPosition(Math.max(6, this.flacStreamMetadata.minFrameSize));
                        long findNextFrame2 = findNextFrame(extractorInput2);
                        return (findNextFrame > j5 || findNextFrame2 <= j5) ? findNextFrame2 <= j5 ? new BinarySearchSeeker$TimestampSearchResult(-2, findNextFrame2, extractorInput2.getPeekPosition()) : new BinarySearchSeeker$TimestampSearchResult(-1, findNextFrame, position2) : new BinarySearchSeeker$TimestampSearchResult(0, -9223372036854775807L, peekPosition2);
                    }
                };
                long durationUs = flacStreamMetadata3.getDurationUs();
                long j5 = flacStreamMetadata3.totalSamples;
                int i10 = flacStreamMetadata3.maxFrameSize;
                if (i10 > 0) {
                    i = 0;
                    j = ((i10 + i9) / 2) + 1;
                } else {
                    i = 0;
                    int i11 = flacStreamMetadata3.minBlockSizeSamples;
                    j = 64 + (((((i11 != flacStreamMetadata3.maxBlockSizeSamples || i11 <= 0) ? 4096L : i11) * flacStreamMetadata3.channels) * flacStreamMetadata3.bitsPerSample) / 8);
                }
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(exoPlayerImplInternal$$ExternalSyntheticLambda2, binarySearchSeeker$TimestampSeeker, durationUs, j5, position, length, j, Math.max(6, i9));
                this.binarySearchSeeker = psBinarySearchSeeker;
                unseekable = psBinarySearchSeeker.seekMap;
            }
            extractorOutput.seekMap(unseekable);
            this.state = 5;
            return i;
        }
        if (i2 != 5) {
            Path$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        this.trackOutput.getClass();
        this.flacStreamMetadata.getClass();
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.binarySearchSeeker;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.seekOperationParams != null) {
            return psBinarySearchSeeker2.handlePendingSeek(extractorInput, iadFrame);
        }
        if (this.currentFrameFirstSampleNumber == -1) {
            FlacStreamMetadata flacStreamMetadata4 = this.flacStreamMetadata;
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition(1);
            byte[] bArr4 = new byte[1];
            extractorInput.peekFully(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            extractorInput.advancePeekPosition(2);
            r10 = z3 ? 7 : 6;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(r10);
            byte[] bArr5 = parsableByteArray6.data;
            int i12 = 0;
            while (i12 < r10) {
                int peek = extractorInput.peek(i12, r10 - i12, bArr5);
                if (peek == -1) {
                    break;
                }
                i12 += peek;
            }
            parsableByteArray6.setLimit(i12);
            extractorInput.resetPeekPosition();
            try {
                readUtf8EncodedLong = parsableByteArray6.readUtf8EncodedLong();
                if (!z3) {
                    readUtf8EncodedLong *= flacStreamMetadata4.maxBlockSizeSamples;
                }
                j3 = flacStreamMetadata4.totalSamples;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || readUtf8EncodedLong <= j3) {
                j4 = readUtf8EncodedLong;
                if (r4) {
                    throw ParserException.createForMalformedContainer(null, null);
                }
                this.currentFrameFirstSampleNumber = j4;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            ParsableByteArray parsableByteArray7 = this.buffer;
            int i13 = parsableByteArray7.limit;
            if (i13 < 32768) {
                int read = extractorInput.read(parsableByteArray7.data, i13, 32768 - i13);
                r4 = read == -1;
                if (!r4) {
                    parsableByteArray7.setLimit(i13 + read);
                } else if (parsableByteArray7.bytesLeft() == 0) {
                    long j6 = this.currentFrameFirstSampleNumber * 1000000;
                    FlacStreamMetadata flacStreamMetadata5 = this.flacStreamMetadata;
                    String str3 = Util.DEVICE_DEBUG_INFO;
                    this.trackOutput.sampleMetadata(j6 / flacStreamMetadata5.sampleRate, 1, this.currentFrameBytesWritten, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i14 = parsableByteArray7.position;
            int i15 = this.currentFrameBytesWritten;
            int i16 = this.minFrameSize;
            if (i15 < i16) {
                parsableByteArray7.skipBytes(Math.min(i16 - i15, parsableByteArray7.bytesLeft()));
            }
            this.flacStreamMetadata.getClass();
            int i17 = parsableByteArray7.position;
            while (true) {
                int i18 = parsableByteArray7.limit - 16;
                IadFrame iadFrame2 = this.sampleNumberHolder;
                if (i17 <= i18) {
                    parsableByteArray7.setPosition(i17);
                    if (AacUtil.checkAndReadFrameHeader(parsableByteArray7, this.flacStreamMetadata, this.frameStartMarker, iadFrame2)) {
                        parsableByteArray7.setPosition(i17);
                        j2 = iadFrame2.b;
                        break;
                    }
                    i17++;
                } else {
                    if (r4) {
                        while (true) {
                            int i19 = parsableByteArray7.limit;
                            if (i17 > i19 - this.minFrameSize) {
                                parsableByteArray7.setPosition(i19);
                                break;
                            }
                            parsableByteArray7.setPosition(i17);
                            try {
                                z = AacUtil.checkAndReadFrameHeader(parsableByteArray7, this.flacStreamMetadata, this.frameStartMarker, iadFrame2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (parsableByteArray7.position > parsableByteArray7.limit) {
                                z = false;
                            }
                            if (z) {
                                parsableByteArray7.setPosition(i17);
                                j2 = iadFrame2.b;
                                break;
                            }
                            i17++;
                        }
                    } else {
                        parsableByteArray7.setPosition(i17);
                    }
                    j2 = -1;
                }
            }
            int i20 = parsableByteArray7.position - i14;
            parsableByteArray7.setPosition(i14);
            this.trackOutput.sampleData(i20, parsableByteArray7);
            int i21 = this.currentFrameBytesWritten + i20;
            this.currentFrameBytesWritten = i21;
            if (j2 != -1) {
                long j7 = this.currentFrameFirstSampleNumber * 1000000;
                FlacStreamMetadata flacStreamMetadata6 = this.flacStreamMetadata;
                String str4 = Util.DEVICE_DEBUG_INFO;
                this.trackOutput.sampleMetadata(j7 / flacStreamMetadata6.sampleRate, 1, i21, 0, null);
                this.currentFrameBytesWritten = 0;
                this.currentFrameFirstSampleNumber = j2;
            }
            int length2 = parsableByteArray7.data.length - parsableByteArray7.limit;
            if (parsableByteArray7.bytesLeft() < 16 && length2 < 16) {
                int bytesLeft = parsableByteArray7.bytesLeft();
                byte[] bArr6 = parsableByteArray7.data;
                System.arraycopy(bArr6, parsableByteArray7.position, bArr6, 0, bytesLeft);
                parsableByteArray7.setPosition(0);
                parsableByteArray7.setLimit(bytesLeft);
            }
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
        } else {
            PsBinarySearchSeeker psBinarySearchSeeker = this.binarySearchSeeker;
            if (psBinarySearchSeeker != null) {
                psBinarySearchSeeker.setSeekTargetUs(j2);
            }
        }
        this.currentFrameFirstSampleNumber = j2 != 0 ? -1L : 0L;
        this.currentFrameBytesWritten = 0;
        this.buffer.reset(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        Metadata peekId3Data = new Id3Peeker(0).peekId3Data(extractorInput, Id3Decoder.NO_FRAMES_PREDICATE, 0);
        if (peekId3Data != null) {
            int length = peekId3Data.entries.length;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.data, 0, 4, false);
        return parsableByteArray.readUnsignedInt() == 1716281667;
    }
}
