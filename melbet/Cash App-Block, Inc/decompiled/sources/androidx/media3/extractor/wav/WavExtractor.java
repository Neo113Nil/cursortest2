package androidx.media3.extractor.wav;

import android.util.Pair;
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
import androidx.media3.extractor.TrackOutput;
import androidx.tracing.Trace;
import com.caverock.androidsvg.IntegerParser;
import com.plaid.internal.EnumC0170g;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class WavExtractor implements Extractor {
    public ExtractorOutput extractorOutput;
    public OutputWriter outputWriter;
    public TrackOutput trackOutput;
    public int state = 0;
    public long rf64SampleDataSize = -1;
    public int dataStartPosition = -1;
    public long dataEndPosition = -1;

    public final class ImaAdPcmOutputWriter implements OutputWriter {
        public static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE};
        public final ParsableByteArray decodedData;
        public final ExtractorOutput extractorOutput;

        /* renamed from: format, reason: collision with root package name */
        public final Format f898format;
        public final int framesPerBlock;
        public final byte[] inputData;
        public long outputFrameCount;
        public int pendingInputBytes;
        public int pendingOutputBytes;
        public long startTimeUs;
        public final int targetSampleSizeFrames;
        public final TrackOutput trackOutput;
        public final WavFormat wavFormat;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i = wavFormat.frameRateHz;
            int max = Math.max(1, i / 10);
            this.targetSampleSizeFrames = max;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = readLittleEndianUnsignedShort;
            int i2 = wavFormat.numChannels;
            int i3 = wavFormat.blockSize;
            int i4 = (((i3 - (i2 * 4)) * 8) / (wavFormat.bitsPerSample * i2)) + 1;
            if (readLittleEndianUnsignedShort != i4) {
                throw ParserException.createForMalformedContainer(null, "Expected frames per block: " + i4 + "; got: " + readLittleEndianUnsignedShort);
            }
            int ceilDivide = Util.ceilDivide(max, readLittleEndianUnsignedShort);
            this.inputData = new byte[ceilDivide * i3];
            this.decodedData = new ParsableByteArray(readLittleEndianUnsignedShort * 2 * i2 * ceilDivide);
            int i5 = ((i3 * i) * 8) / readLittleEndianUnsignedShort;
            Format.Builder builder = new Format.Builder();
            builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/raw");
            builder.averageBitrate = i5;
            builder.peakBitrate = i5;
            builder.maxInputSize = max * 2 * i2;
            builder.channelCount = i2;
            builder.sampleRate = i;
            builder.pcmEncoding = 2;
            this.f898format = new Format(builder);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void init(int i, long j) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, this.framesPerBlock, i, j);
            this.extractorOutput.seekMap(wavSeekMap);
            Format format2 = this.f898format;
            TrackOutput trackOutput = this.trackOutput;
            trackOutput.format(format2);
            trackOutput.durationUs(wavSeekMap.durationUs);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean sampleData(androidx.media3.extractor.ExtractorInput r25, long r26) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(androidx.media3.extractor.ExtractorInput, long):boolean");
        }

        public final void writeSampleMetadata(int i) {
            long j = this.startTimeUs;
            long j2 = this.outputFrameCount;
            WavFormat wavFormat = this.wavFormat;
            long j3 = wavFormat.frameRateHz;
            String str = Util.DEVICE_DEBUG_INFO;
            long scaleLargeValue = j + Util.scaleLargeValue(j2, 1000000L, j3, RoundingMode.DOWN);
            int i2 = i * 2 * wavFormat.numChannels;
            this.trackOutput.sampleMetadata(scaleLargeValue, 1, i2, this.pendingOutputBytes - i2, null);
            this.outputFrameCount += i;
            this.pendingOutputBytes -= i2;
        }
    }

    public interface OutputWriter {
        void init(int i, long j);

        void reset(long j);

        boolean sampleData(ExtractorInput extractorInput, long j);
    }

    public final class PassthroughOutputWriter implements OutputWriter {
        public final ExtractorOutput extractorOutput;

        /* renamed from: format, reason: collision with root package name */
        public final Format f899format;
        public long outputFrameCount;
        public int pendingOutputBytes;
        public long startTimeUs;
        public final int targetSampleSizeBytes;
        public final TrackOutput trackOutput;
        public final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i) {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i2 = wavFormat.numChannels;
            int i3 = wavFormat.frameRateHz;
            int i4 = (wavFormat.bitsPerSample * i2) / 8;
            int i5 = wavFormat.blockSize;
            if (i5 != i4) {
                throw ParserException.createForMalformedContainer(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.targetSampleSizeBytes = max;
            Format.Builder builder = new Format.Builder();
            builder.containerMimeType = MimeTypes.normalizeMimeType("audio/wav");
            builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
            builder.averageBitrate = i7;
            builder.peakBitrate = i7;
            builder.maxInputSize = max;
            builder.channelCount = i2;
            builder.sampleRate = i3;
            builder.pcmEncoding = i;
            this.f899format = new Format(builder);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void init(int i, long j) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, 1, i, j);
            this.extractorOutput.seekMap(wavSeekMap);
            Format format2 = this.f899format;
            TrackOutput trackOutput = this.trackOutput;
            trackOutput.format(format2);
            trackOutput.durationUs(wavSeekMap.durationUs);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final boolean sampleData(ExtractorInput extractorInput, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int sampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i2 - i, j2), true);
                if (sampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += sampleData;
                    j2 -= sampleData;
                }
            }
            WavFormat wavFormat = this.wavFormat;
            int i3 = wavFormat.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long j3 = this.startTimeUs;
                long j4 = this.outputFrameCount;
                long j5 = wavFormat.frameRateHz;
                String str = Util.DEVICE_DEBUG_INFO;
                long scaleLargeValue = j3 + Util.scaleLargeValue(j4, 1000000L, j5, RoundingMode.DOWN);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(scaleLargeValue, 1, i5, i6, null);
                this.outputFrameCount += i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0215, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021c, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        byte[] bArr;
        int i;
        this.trackOutput.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        int i2 = this.state;
        int i3 = 4;
        if (i2 == 0) {
            Trace.checkState(extractorInput.getPosition() == 0);
            int i4 = this.dataStartPosition;
            if (i4 != -1) {
                extractorInput.skipFully(i4);
                this.state = 4;
                return 0;
            }
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer(null, "Unsupported or unrecognized wav file type.");
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(8);
            IntegerParser peek = IntegerParser.peek(extractorInput, parsableByteArray);
            if (peek.pos != 1685272116) {
                extractorInput.resetPeekPosition();
            } else {
                extractorInput.advancePeekPosition(8);
                parsableByteArray.setPosition(0);
                extractorInput.peekFully(0, 8, parsableByteArray.data);
                j = parsableByteArray.readLittleEndianLong();
                extractorInput.skipFully(((int) peek.value) + 8);
            }
            this.rf64SampleDataSize = j;
            this.state = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                Trace.checkState(this.dataEndPosition != -1);
                long position = this.dataEndPosition - extractorInput.getPosition();
                OutputWriter outputWriter = this.outputWriter;
                outputWriter.getClass();
                return outputWriter.sampleData(extractorInput, position) ? -1 : 0;
            }
            extractorInput.resetPeekPosition();
            IntegerParser skipToChunk = WavHeaderReader.skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
            extractorInput.skipFully(8);
            Pair create = Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(skipToChunk.value));
            this.dataStartPosition = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.rf64SampleDataSize;
            if (j2 != -1 && longValue == BodyPartID.bodyIdMax) {
                longValue = j2;
            }
            this.dataEndPosition = this.dataStartPosition + longValue;
            long length = extractorInput.getLength();
            if (length != -1 && this.dataEndPosition > length) {
                Log.w("WavExtractor", "Data exceeds input length: " + this.dataEndPosition + ", " + length);
                this.dataEndPosition = length;
            }
            OutputWriter outputWriter2 = this.outputWriter;
            outputWriter2.getClass();
            outputWriter2.init(this.dataStartPosition, this.dataEndPosition);
            this.state = 4;
            return 0;
        }
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(16);
        long j3 = WavHeaderReader.skipToChunk(1718449184, extractorInput, parsableByteArray2).value;
        Trace.checkState(j3 >= 16);
        extractorInput.peekFully(0, 16, parsableByteArray2.data);
        parsableByteArray2.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray2.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray2.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray2.readLittleEndianUnsignedIntToInt();
        parsableByteArray2.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray2.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray2.readLittleEndianUnsignedShort();
        int i5 = ((int) j3) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            extractorInput.peekFully(0, i5, bArr);
            if (readLittleEndianUnsignedShort == 65534 && i5 == 24) {
                ParsableByteArray parsableByteArray3 = new ParsableByteArray(bArr);
                parsableByteArray3.readLittleEndianUnsignedShort();
                int readLittleEndianUnsignedShort5 = parsableByteArray3.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort5 != 0 && readLittleEndianUnsignedShort5 != readLittleEndianUnsignedShort4) {
                    throw ParserException.createForUnsupportedContainerFeature("validBits ( " + readLittleEndianUnsignedShort5 + ")  != bitsPerSample( " + readLittleEndianUnsignedShort4 + ") are not supported");
                }
                int readLittleEndianUnsignedIntToInt2 = parsableByteArray3.readLittleEndianUnsignedIntToInt();
                if ((readLittleEndianUnsignedIntToInt2 >> 18) != 0) {
                    throw ParserException.createForUnsupportedContainerFeature("invalid channel mask " + readLittleEndianUnsignedIntToInt2);
                }
                if (readLittleEndianUnsignedIntToInt2 != 0 && Integer.bitCount(readLittleEndianUnsignedIntToInt2) != readLittleEndianUnsignedShort2) {
                    throw ParserException.createForUnsupportedContainerFeature("invalid number of channels (" + Integer.bitCount(readLittleEndianUnsignedIntToInt2) + ") in channel mask " + readLittleEndianUnsignedIntToInt2);
                }
                readLittleEndianUnsignedShort = parsableByteArray3.readLittleEndianUnsignedShort();
                byte[] bArr2 = new byte[14];
                parsableByteArray3.readBytes(0, 14, bArr2);
                if (!Arrays.equals(bArr2, WavHeaderReader.WAVEEXT_SUBFORMAT) && !Arrays.equals(bArr2, WavHeaderReader.AMBISONIC_SUBFORMAT)) {
                    throw ParserException.createForUnsupportedContainerFeature("invalid wav format extension guid");
                }
            }
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        WavFormat wavFormat = new WavFormat();
        wavFormat.numChannels = readLittleEndianUnsignedShort2;
        wavFormat.frameRateHz = readLittleEndianUnsignedIntToInt;
        wavFormat.blockSize = readLittleEndianUnsignedShort3;
        wavFormat.bitsPerSample = readLittleEndianUnsignedShort4;
        wavFormat.extraData = bArr;
        if (readLittleEndianUnsignedShort == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, wavFormat);
        } else if (readLittleEndianUnsignedShort == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavFormat, "audio/g711-alaw", -1);
        } else if (readLittleEndianUnsignedShort == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavFormat, "audio/g711-mlaw", -1);
        } else {
            if (readLittleEndianUnsignedShort != 1) {
                if (readLittleEndianUnsignedShort != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + readLittleEndianUnsignedShort);
                }
                this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavFormat, "audio/raw", i);
            }
            i3 = Util.getPcmEncoding(readLittleEndianUnsignedShort4, ByteOrder.LITTLE_ENDIAN);
            i = i3;
            if (i != 0) {
            }
        }
        this.state = 3;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.state = j == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return WavHeaderReader.checkFileType(extractorInput);
    }
}
