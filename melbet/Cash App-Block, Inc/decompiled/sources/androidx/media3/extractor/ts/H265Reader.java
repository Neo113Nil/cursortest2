package androidx.media3.extractor.ts;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil$H265ProfileTierLevel;
import androidx.media3.container.NalUnitUtil$H265SpsData;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class H265Reader implements ElementaryStreamReader {
    public String formatId;
    public boolean hasOutputFormat;
    public TrackOutput output;
    public SampleReader sampleReader;
    public final SeiReader seiReader;
    public long totalBytesWritten;
    public final boolean[] prefixFlags = new boolean[3];
    public final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32);
    public final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33);
    public final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34);
    public final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39);
    public final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40);
    public long pesTimeUs = -9223372036854775807L;
    public final ParsableByteArray seiWrapper = new ParsableByteArray();

    public final class SampleReader {
        public boolean isFirstPrefixNalUnit;
        public boolean isFirstSlice;
        public boolean lookingForFirstSliceFlag;
        public int nalUnitBytesRead;
        public boolean nalUnitHasKeyframeData;
        public long nalUnitPosition;
        public long nalUnitTimeUs;
        public final TrackOutput output;
        public boolean readingPrefix;
        public boolean readingSample;
        public boolean sampleIsKeyframe;
        public long samplePosition;
        public long sampleTimeUs;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public final void outputSample(int i) {
            long j = this.sampleTimeUs;
            if (j != -9223372036854775807L) {
                long j2 = this.nalUnitPosition;
                long j3 = this.samplePosition;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, i2, i, null);
            }
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        this.output.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = parsableByteArray.position;
            int i3 = parsableByteArray.limit;
            byte[] bArr = parsableByteArray.data;
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray.bytesLeft(), parsableByteArray);
            while (i2 < i3) {
                int findNalUnit = OpusUtil.findNalUnit(bArr, i2, i3, this.prefixFlags);
                if (findNalUnit == i3) {
                    nalUnitData$1(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[findNalUnit + 3] & 126) >> 1;
                if (findNalUnit <= 0 || bArr[findNalUnit - 1] != 0) {
                    i = 3;
                } else {
                    findNalUnit--;
                    i = 4;
                }
                int i5 = findNalUnit;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    nalUnitData$1(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.totalBytesWritten - i8;
                endNalUnit$1(j, this.pesTimeUs, i8, i7 < 0 ? -i7 : 0);
                startNalUnit(j, this.pesTimeUs, i8, i4);
                i2 = i5 + i6;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        this.formatId = (String) zzcjkVar.zza;
        zzcjkVar.maybeThrowUninitializedError();
        TrackOutput track = extractorOutput.track(zzcjkVar.zze, 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        this.seiReader.createTracks(extractorOutput, zzcjkVar);
    }

    public final void endNalUnit$1(long j, long j2, int i, int i2) {
        AdapterHelper adapterHelper = this.seiReader.reorderingBufferQueue;
        SampleReader sampleReader = this.sampleReader;
        boolean z = this.hasOutputFormat;
        if (sampleReader.readingPrefix && sampleReader.isFirstSlice) {
            sampleReader.sampleIsKeyframe = sampleReader.nalUnitHasKeyframeData;
            sampleReader.readingPrefix = false;
        } else if (sampleReader.isFirstPrefixNalUnit || sampleReader.isFirstSlice) {
            if (z && sampleReader.readingSample) {
                sampleReader.outputSample(i + ((int) (j - sampleReader.nalUnitPosition)));
            }
            sampleReader.samplePosition = sampleReader.nalUnitPosition;
            sampleReader.sampleTimeUs = sampleReader.nalUnitTimeUs;
            sampleReader.sampleIsKeyframe = sampleReader.nalUnitHasKeyframeData;
            sampleReader.readingSample = true;
        }
        if (!this.hasOutputFormat) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.vps;
            nalUnitTargetBuffer.endNalUnit(i2);
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.sps;
            nalUnitTargetBuffer2.endNalUnit(i2);
            NalUnitTargetBuffer nalUnitTargetBuffer3 = this.pps;
            nalUnitTargetBuffer3.endNalUnit(i2);
            if (nalUnitTargetBuffer.isCompleted && nalUnitTargetBuffer2.isCompleted && nalUnitTargetBuffer3.isCompleted) {
                String str = this.formatId;
                int i3 = nalUnitTargetBuffer.nalLength;
                byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i3 + nalUnitTargetBuffer3.nalLength];
                System.arraycopy((byte[]) nalUnitTargetBuffer.nalData, 0, bArr, 0, i3);
                System.arraycopy((byte[]) nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
                System.arraycopy((byte[]) nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
                NalUnitUtil$H265SpsData parseH265SpsNalUnit = OpusUtil.parseH265SpsNalUnit((byte[]) nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength, null);
                NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel = parseH265SpsNalUnit.profileTierLevel;
                String buildHevcCodecString = nalUnitUtil$H265ProfileTierLevel != null ? CodecSpecificDataUtil.buildHevcCodecString(nalUnitUtil$H265ProfileTierLevel.generalProfileSpace, nalUnitUtil$H265ProfileTierLevel.generalProfileIdc, nalUnitUtil$H265ProfileTierLevel.generalProfileCompatibilityFlags, nalUnitUtil$H265ProfileTierLevel.constraintBytes, nalUnitUtil$H265ProfileTierLevel.generalTierFlag, nalUnitUtil$H265ProfileTierLevel.generalLevelIdc) : null;
                Format.Builder builder = new Format.Builder();
                builder.id = str;
                builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                builder.sampleMimeType = MimeTypes.normalizeMimeType("video/hevc");
                builder.codecs = buildHevcCodecString;
                builder.width = parseH265SpsNalUnit.width;
                builder.height = parseH265SpsNalUnit.height;
                builder.decodedWidth = parseH265SpsNalUnit.decodedWidth;
                builder.decodedHeight = parseH265SpsNalUnit.decodedHeight;
                builder.colorInfo = new ColorInfo(parseH265SpsNalUnit.colorSpace, parseH265SpsNalUnit.colorRange, parseH265SpsNalUnit.colorTransfer, parseH265SpsNalUnit.bitDepthLumaMinus8 + 8, parseH265SpsNalUnit.bitDepthChromaMinus8 + 8, null);
                builder.pixelWidthHeightRatio = parseH265SpsNalUnit.pixelWidthHeightRatio;
                builder.maxNumReorderSamples = parseH265SpsNalUnit.maxNumReorderPics;
                builder.maxSubLayers = parseH265SpsNalUnit.maxSubLayersMinus1 + 1;
                builder.initializationData = Collections.singletonList(bArr);
                Format format2 = new Format(builder);
                this.output.format(format2);
                int i4 = format2.maxNumReorderSamples;
                Trace.checkState(i4 != -1);
                adapterHelper.setMaxSize(i4);
                this.hasOutputFormat = true;
            }
        }
        NalUnitTargetBuffer nalUnitTargetBuffer4 = this.prefixSei;
        boolean endNalUnit = nalUnitTargetBuffer4.endNalUnit(i2);
        ParsableByteArray parsableByteArray = this.seiWrapper;
        if (endNalUnit) {
            parsableByteArray.reset(OpusUtil.unescapeStream(nalUnitTargetBuffer4.nalLength, (byte[]) nalUnitTargetBuffer4.nalData), (byte[]) nalUnitTargetBuffer4.nalData);
            parsableByteArray.skipBytes(5);
            adapterHelper.add(j2, parsableByteArray);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer5 = this.suffixSei;
        if (nalUnitTargetBuffer5.endNalUnit(i2)) {
            parsableByteArray.reset(OpusUtil.unescapeStream(nalUnitTargetBuffer5.nalLength, (byte[]) nalUnitTargetBuffer5.nalData), (byte[]) nalUnitTargetBuffer5.nalData);
            parsableByteArray.skipBytes(5);
            adapterHelper.add(j2, parsableByteArray);
        }
    }

    public final void nalUnitData$1(int i, int i2, byte[] bArr) {
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader.lookingForFirstSliceFlag) {
            int i3 = sampleReader.nalUnitBytesRead;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                sampleReader.isFirstSlice = (bArr[i4] & 128) != 0;
                sampleReader.lookingForFirstSliceFlag = false;
            } else {
                sampleReader.nalUnitBytesRead = (i2 - i) + i3;
            }
        }
        if (!this.hasOutputFormat) {
            this.vps.appendToNalUnit(i, i2, bArr);
            this.sps.appendToNalUnit(i, i2, bArr);
            this.pps.appendToNalUnit(i, i2, bArr);
        }
        this.prefixSei.appendToNalUnit(i, i2, bArr);
        this.suffixSei.appendToNalUnit(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        this.output.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        if (z) {
            this.seiReader.reorderingBufferQueue.flushQueueDownToSize(0);
            endNalUnit$1(this.totalBytesWritten, this.pesTimeUs, 0, 0);
            startNalUnit(this.totalBytesWritten, this.pesTimeUs, 0, 48);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        this.pesTimeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
        OpusUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.seiReader.reorderingBufferQueue.flushQueueDownToSize(0);
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.lookingForFirstSliceFlag = false;
            sampleReader.isFirstSlice = false;
            sampleReader.isFirstPrefixNalUnit = false;
            sampleReader.readingSample = false;
            sampleReader.readingPrefix = false;
        }
    }

    public final void startNalUnit(long j, long j2, int i, int i2) {
        SampleReader sampleReader = this.sampleReader;
        boolean z = this.hasOutputFormat;
        sampleReader.isFirstSlice = false;
        sampleReader.isFirstPrefixNalUnit = false;
        sampleReader.nalUnitTimeUs = j2;
        sampleReader.nalUnitBytesRead = 0;
        sampleReader.nalUnitPosition = j;
        if (i2 >= 32 && i2 != 40) {
            if (sampleReader.readingSample && !sampleReader.readingPrefix) {
                if (z) {
                    sampleReader.outputSample(i);
                }
                sampleReader.readingSample = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                sampleReader.isFirstPrefixNalUnit = !sampleReader.readingPrefix;
                sampleReader.readingPrefix = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        sampleReader.nalUnitHasKeyframeData = z2;
        sampleReader.lookingForFirstSliceFlag = z2 || i2 <= 9;
        if (!this.hasOutputFormat) {
            this.vps.startNalUnit(i2);
            this.sps.startNalUnit(i2);
            this.pps.startNalUnit(i2);
        }
        this.prefixSei.startNalUnit(i2);
        this.suffixSei.startNalUnit(i2);
    }
}
