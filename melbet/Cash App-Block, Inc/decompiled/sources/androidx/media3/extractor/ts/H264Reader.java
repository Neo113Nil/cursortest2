package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil$PpsData;
import androidx.media3.container.NalUnitUtil$SpsData;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.wav.WavFormat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.AdapterHelper;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class H264Reader implements ElementaryStreamReader {
    public final boolean allowNonIdrKeyframes;
    public final boolean detectAccessUnits;
    public String formatId;
    public boolean hasOutputFormat;
    public TrackOutput output;
    public boolean randomAccessIndicator;
    public SampleReader sampleReader;
    public final SeiReader seiReader;
    public long totalBytesWritten;
    public final boolean[] prefixFlags = new boolean[3];
    public final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7);
    public final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8);
    public final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6);
    public long pesTimeUs = -9223372036854775807L;
    public final ParsableByteArray seiWrapper = new ParsableByteArray();

    public final class SampleReader {
        public final boolean allowNonIdrKeyframes;
        public final WavFormat bitArray;
        public byte[] buffer;
        public int bufferLength;
        public final boolean detectAccessUnits;
        public long nalUnitStartPosition;
        public long nalUnitTimeUs;
        public int nalUnitType;
        public final TrackOutput output;
        public boolean randomAccessIndicator;
        public boolean sampleIsKeyframe;
        public long samplePosition;
        public long sampleTimeUs;
        public final SparseArray sps = new SparseArray();
        public final SparseArray pps = new SparseArray();
        public SliceHeaderData previousSliceHeader = new SliceHeaderData();
        public SliceHeaderData sliceHeader = new SliceHeaderData();
        public boolean isFilling = false;
        public boolean readingSample = false;

        public final class SliceHeaderData {
            public boolean bottomFieldFlag;
            public boolean bottomFieldFlagPresent;
            public int deltaPicOrderCnt0;
            public int deltaPicOrderCnt1;
            public int deltaPicOrderCntBottom;
            public boolean fieldPicFlag;
            public int frameNum;
            public boolean hasSliceType;
            public boolean idrPicFlag;
            public int idrPicId;
            public boolean isComplete;
            public int nalRefIdc;
            public int picOrderCntLsb;
            public int picParameterSetId;
            public int sliceType;
            public NalUnitUtil$SpsData spsData;
        }

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z;
            this.detectAccessUnits = z2;
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new WavFormat(bArr, 0, 0);
            SliceHeaderData sliceHeaderData = this.sliceHeader;
            sliceHeaderData.hasSliceType = false;
            sliceHeaderData.isComplete = false;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z;
        this.detectAccessUnits = z2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        this.output.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        int i2 = parsableByteArray.position;
        int i3 = parsableByteArray.limit;
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray.bytesLeft(), parsableByteArray);
        while (true) {
            int findNalUnit = OpusUtil.findNalUnit(bArr, i2, i3, this.prefixFlags);
            if (findNalUnit == i3) {
                this.nalUnitData(i2, i3, bArr);
                return;
            }
            int i4 = bArr[findNalUnit + 3] & 31;
            if (findNalUnit <= 0 || bArr[findNalUnit - 1] != 0) {
                i = 3;
            } else {
                findNalUnit--;
                i = 4;
            }
            int i5 = findNalUnit - i2;
            if (i5 > 0) {
                this.nalUnitData(i2, findNalUnit, bArr);
            }
            int i6 = i3 - findNalUnit;
            long j = this.totalBytesWritten - i6;
            H264Reader h264Reader = this;
            h264Reader.endNalUnit(j, this.pesTimeUs, i6, i5 < 0 ? -i5 : 0);
            h264Reader.startNalUnit(i4, j, h264Reader.pesTimeUs);
            i2 = findNalUnit + i;
            this = h264Reader;
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
        this.sampleReader = new SampleReader(track, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, zzcjkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b6, code lost:
    
        if (r3.bottomFieldFlag == r4.bottomFieldFlag) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c0, code lost:
    
        if (r9 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d2, code lost:
    
        if (r3.deltaPicOrderCntBottom == r4.deltaPicOrderCntBottom) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        if (r3.deltaPicOrderCnt1 == r4.deltaPicOrderCnt1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f1, code lost:
    
        if (r3.idrPicId == r4.idrPicId) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024c, code lost:
    
        if (r3 == 1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void endNalUnit(long j, long j2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        AdapterHelper adapterHelper = this.seiReader.reorderingBufferQueue;
        if (!this.hasOutputFormat || this.sampleReader.detectAccessUnits) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
            nalUnitTargetBuffer.endNalUnit(i2);
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
            nalUnitTargetBuffer2.endNalUnit(i2);
            boolean z4 = this.hasOutputFormat;
            boolean z5 = nalUnitTargetBuffer.isCompleted;
            if (z4) {
                if (z5) {
                    NalUnitUtil$SpsData parseSpsNalUnit = OpusUtil.parseSpsNalUnit(3, nalUnitTargetBuffer.nalLength, (byte[]) nalUnitTargetBuffer.nalData);
                    adapterHelper.setMaxSize(parseSpsNalUnit.maxNumReorderFrames);
                    this.sampleReader.sps.append(parseSpsNalUnit.seqParameterSetId, parseSpsNalUnit);
                    nalUnitTargetBuffer.reset();
                } else if (nalUnitTargetBuffer2.isCompleted) {
                    WavFormat wavFormat = new WavFormat((byte[]) nalUnitTargetBuffer2.nalData, 4, nalUnitTargetBuffer2.nalLength);
                    int readExpGolombCodeNum = wavFormat.readExpGolombCodeNum();
                    int readExpGolombCodeNum2 = wavFormat.readExpGolombCodeNum();
                    wavFormat.skipBit();
                    this.sampleReader.pps.append(readExpGolombCodeNum, new NalUnitUtil$PpsData(readExpGolombCodeNum, readExpGolombCodeNum2, wavFormat.readBit()));
                    nalUnitTargetBuffer2.reset();
                }
            } else if (z5 && nalUnitTargetBuffer2.isCompleted) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
                arrayList.add(Arrays.copyOf((byte[]) nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                NalUnitUtil$SpsData parseSpsNalUnit2 = OpusUtil.parseSpsNalUnit(3, nalUnitTargetBuffer.nalLength, (byte[]) nalUnitTargetBuffer.nalData);
                int i5 = parseSpsNalUnit2.maxNumReorderFrames;
                WavFormat wavFormat2 = new WavFormat((byte[]) nalUnitTargetBuffer2.nalData, 4, nalUnitTargetBuffer2.nalLength);
                int readExpGolombCodeNum3 = wavFormat2.readExpGolombCodeNum();
                int readExpGolombCodeNum4 = wavFormat2.readExpGolombCodeNum();
                wavFormat2.skipBit();
                NalUnitUtil$PpsData nalUnitUtil$PpsData = new NalUnitUtil$PpsData(readExpGolombCodeNum3, readExpGolombCodeNum4, wavFormat2.readBit());
                int i6 = parseSpsNalUnit2.profileIdc;
                int i7 = parseSpsNalUnit2.constraintsFlagsAndReservedZero2Bits;
                int i8 = parseSpsNalUnit2.levelIdc;
                byte[] bArr = CodecSpecificDataUtil.NAL_START_CODE;
                String format2 = String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
                TrackOutput trackOutput = this.output;
                Format.Builder builder = new Format.Builder();
                builder.id = this.formatId;
                builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                builder.sampleMimeType = MimeTypes.normalizeMimeType("video/avc");
                builder.codecs = format2;
                builder.width = parseSpsNalUnit2.width;
                builder.height = parseSpsNalUnit2.height;
                builder.colorInfo = new ColorInfo(parseSpsNalUnit2.colorSpace, parseSpsNalUnit2.colorRange, parseSpsNalUnit2.colorTransfer, parseSpsNalUnit2.bitDepthLumaMinus8 + 8, parseSpsNalUnit2.bitDepthChromaMinus8 + 8, null);
                builder.pixelWidthHeightRatio = parseSpsNalUnit2.pixelWidthHeightRatio;
                builder.initializationData = arrayList;
                builder.maxNumReorderSamples = i5;
                NavAction$$ExternalSyntheticOutline0.m(builder, trackOutput);
                this.hasOutputFormat = true;
                adapterHelper.setMaxSize(i5);
                this.sampleReader.sps.append(parseSpsNalUnit2.seqParameterSetId, parseSpsNalUnit2);
                this.sampleReader.pps.append(readExpGolombCodeNum3, nalUnitUtil$PpsData);
                nalUnitTargetBuffer.reset();
                nalUnitTargetBuffer2.reset();
            }
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sei;
        if (nalUnitTargetBuffer3.endNalUnit(i2)) {
            int unescapeStream = OpusUtil.unescapeStream(nalUnitTargetBuffer3.nalLength, (byte[]) nalUnitTargetBuffer3.nalData);
            byte[] bArr2 = (byte[]) nalUnitTargetBuffer3.nalData;
            ParsableByteArray parsableByteArray = this.seiWrapper;
            parsableByteArray.reset(unescapeStream, bArr2);
            parsableByteArray.setPosition(4);
            adapterHelper.add(j2, parsableByteArray);
        }
        SampleReader sampleReader = this.sampleReader;
        boolean z6 = this.hasOutputFormat;
        if (sampleReader.nalUnitType != 9) {
            if (sampleReader.detectAccessUnits) {
                SampleReader.SliceHeaderData sliceHeaderData = sampleReader.sliceHeader;
                SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.previousSliceHeader;
                if (sliceHeaderData.isComplete) {
                    if (sliceHeaderData2.isComplete) {
                        NalUnitUtil$SpsData nalUnitUtil$SpsData = sliceHeaderData.spsData;
                        nalUnitUtil$SpsData.getClass();
                        NalUnitUtil$SpsData nalUnitUtil$SpsData2 = sliceHeaderData2.spsData;
                        nalUnitUtil$SpsData2.getClass();
                        int i9 = nalUnitUtil$SpsData2.picOrderCountType;
                        if (sliceHeaderData.frameNum == sliceHeaderData2.frameNum) {
                            if (sliceHeaderData.picParameterSetId == sliceHeaderData2.picParameterSetId) {
                                if (sliceHeaderData.fieldPicFlag == sliceHeaderData2.fieldPicFlag) {
                                    if (sliceHeaderData.bottomFieldFlagPresent) {
                                        if (sliceHeaderData2.bottomFieldFlagPresent) {
                                        }
                                    }
                                    int i10 = sliceHeaderData.nalRefIdc;
                                    int i11 = sliceHeaderData2.nalRefIdc;
                                    if (i10 != i11) {
                                        if (i10 != 0) {
                                        }
                                    }
                                    int i12 = nalUnitUtil$SpsData.picOrderCountType;
                                    if (i12 == 0) {
                                        if (i9 == 0) {
                                            if (sliceHeaderData.picOrderCntLsb == sliceHeaderData2.picOrderCntLsb) {
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                        if (i9 == 1) {
                                            if (sliceHeaderData.deltaPicOrderCnt0 == sliceHeaderData2.deltaPicOrderCnt0) {
                                            }
                                        }
                                    }
                                    boolean z7 = sliceHeaderData.idrPicFlag;
                                    if (z7 == sliceHeaderData2.idrPicFlag) {
                                        if (z7) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (sampleReader.allowNonIdrKeyframes) {
                z = sampleReader.randomAccessIndicator;
            } else {
                SampleReader.SliceHeaderData sliceHeaderData3 = sampleReader.sliceHeader;
                z = sliceHeaderData3.hasSliceType && ((i4 = sliceHeaderData3.sliceType) == 7 || i4 == 2);
            }
            boolean z8 = sampleReader.sampleIsKeyframe;
            i3 = sampleReader.nalUnitType;
            if (i3 == 5) {
                if (z) {
                    z2 = true;
                }
                z2 = false;
            } else {
                z2 = true;
            }
            z3 = z8 | z2;
            sampleReader.sampleIsKeyframe = z3;
            sampleReader.nalUnitType = 24;
            if (z3) {
                return;
            }
            this.randomAccessIndicator = false;
            return;
        }
        if (z6 && sampleReader.readingSample) {
            long j3 = sampleReader.nalUnitStartPosition;
            int i13 = i + ((int) (j - j3));
            long j4 = sampleReader.sampleTimeUs;
            if (j4 != -9223372036854775807L) {
                long j5 = sampleReader.samplePosition;
                if (j3 != j5) {
                    sampleReader.output.sampleMetadata(j4, sampleReader.sampleIsKeyframe ? 1 : 0, (int) (j3 - j5), i13, null);
                }
            }
        }
        sampleReader.samplePosition = sampleReader.nalUnitStartPosition;
        sampleReader.sampleTimeUs = sampleReader.nalUnitTimeUs;
        sampleReader.sampleIsKeyframe = false;
        sampleReader.readingSample = true;
        if (sampleReader.allowNonIdrKeyframes) {
        }
        boolean z82 = sampleReader.sampleIsKeyframe;
        i3 = sampleReader.nalUnitType;
        if (i3 == 5) {
        }
        z3 = z82 | z2;
        sampleReader.sampleIsKeyframe = z3;
        sampleReader.nalUnitType = 24;
        if (z3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nalUnitData(int i, int i2, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int readSignedExpGolombCodedInt;
        int i7;
        if (!this.hasOutputFormat || this.sampleReader.detectAccessUnits) {
            this.sps.appendToNalUnit(i, i2, bArr);
            this.pps.appendToNalUnit(i, i2, bArr);
        }
        this.sei.appendToNalUnit(i, i2, bArr);
        SampleReader sampleReader = this.sampleReader;
        SparseArray sparseArray = sampleReader.pps;
        WavFormat wavFormat = sampleReader.bitArray;
        if (sampleReader.isFilling) {
            int i8 = i2 - i;
            byte[] bArr2 = sampleReader.buffer;
            int length = bArr2.length;
            int i9 = sampleReader.bufferLength + i8;
            if (length < i9) {
                sampleReader.buffer = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, sampleReader.buffer, sampleReader.bufferLength, i8);
            int i10 = sampleReader.bufferLength + i8;
            sampleReader.bufferLength = i10;
            wavFormat.extraData = sampleReader.buffer;
            wavFormat.frameRateHz = 0;
            wavFormat.blockSize = 0;
            wavFormat.numChannels = i10;
            wavFormat.bitsPerSample = 0;
            wavFormat.assertValidOffset();
            if (wavFormat.canReadBits(8)) {
                wavFormat.skipBit();
                int readBits = wavFormat.readBits(2);
                wavFormat.skipBits(5);
                if (wavFormat.canReadExpGolombCodedNum()) {
                    wavFormat.readExpGolombCodeNum();
                    if (wavFormat.canReadExpGolombCodedNum()) {
                        int readExpGolombCodeNum = wavFormat.readExpGolombCodeNum();
                        if (!sampleReader.detectAccessUnits) {
                            sampleReader.isFilling = false;
                            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.sliceHeader;
                            sliceHeaderData.sliceType = readExpGolombCodeNum;
                            sliceHeaderData.hasSliceType = true;
                            return;
                        }
                        if (wavFormat.canReadExpGolombCodedNum()) {
                            int readExpGolombCodeNum2 = wavFormat.readExpGolombCodeNum();
                            if (sparseArray.indexOfKey(readExpGolombCodeNum2) < 0) {
                                sampleReader.isFilling = false;
                                return;
                            }
                            NalUnitUtil$PpsData nalUnitUtil$PpsData = (NalUnitUtil$PpsData) sparseArray.get(readExpGolombCodeNum2);
                            SparseArray sparseArray2 = sampleReader.sps;
                            int i11 = nalUnitUtil$PpsData.seqParameterSetId;
                            boolean z5 = nalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag;
                            NalUnitUtil$SpsData nalUnitUtil$SpsData = (NalUnitUtil$SpsData) sparseArray2.get(i11);
                            boolean z6 = nalUnitUtil$SpsData.separateColorPlaneFlag;
                            int i12 = nalUnitUtil$SpsData.picOrderCntLsbLength;
                            int i13 = nalUnitUtil$SpsData.frameNumLength;
                            if (z6) {
                                if (!wavFormat.canReadBits(2)) {
                                    return;
                                } else {
                                    wavFormat.skipBits(2);
                                }
                            }
                            if (wavFormat.canReadBits(i13)) {
                                int readBits2 = wavFormat.readBits(i13);
                                if (nalUnitUtil$SpsData.frameMbsOnlyFlag) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!wavFormat.canReadBits(1)) {
                                        return;
                                    }
                                    z = wavFormat.readBit();
                                    if (z) {
                                        if (wavFormat.canReadBits(1)) {
                                            z2 = wavFormat.readBit();
                                            z3 = true;
                                            z4 = sampleReader.nalUnitType != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!wavFormat.canReadExpGolombCodedNum()) {
                                                return;
                                            } else {
                                                i3 = wavFormat.readExpGolombCodeNum();
                                            }
                                            i4 = nalUnitUtil$SpsData.picOrderCountType;
                                            if (i4 != 0) {
                                                if (!wavFormat.canReadBits(i12)) {
                                                    return;
                                                }
                                                i5 = wavFormat.readBits(i12);
                                                if (z5 && !z) {
                                                    if (wavFormat.canReadExpGolombCodedNum()) {
                                                        i7 = wavFormat.readSignedExpGolombCodedInt();
                                                        i6 = 0;
                                                        readSignedExpGolombCodedInt = 0;
                                                        SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.sliceHeader;
                                                        sliceHeaderData2.spsData = nalUnitUtil$SpsData;
                                                        sliceHeaderData2.nalRefIdc = readBits;
                                                        sliceHeaderData2.sliceType = readExpGolombCodeNum;
                                                        sliceHeaderData2.frameNum = readBits2;
                                                        sliceHeaderData2.picParameterSetId = readExpGolombCodeNum2;
                                                        sliceHeaderData2.fieldPicFlag = z;
                                                        sliceHeaderData2.bottomFieldFlagPresent = z3;
                                                        sliceHeaderData2.bottomFieldFlag = z2;
                                                        sliceHeaderData2.idrPicFlag = z4;
                                                        sliceHeaderData2.idrPicId = i3;
                                                        sliceHeaderData2.picOrderCntLsb = i5;
                                                        sliceHeaderData2.deltaPicOrderCntBottom = i7;
                                                        sliceHeaderData2.deltaPicOrderCnt0 = i6;
                                                        sliceHeaderData2.deltaPicOrderCnt1 = readSignedExpGolombCodedInt;
                                                        sliceHeaderData2.isComplete = true;
                                                        sliceHeaderData2.hasSliceType = true;
                                                        sampleReader.isFilling = false;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                if (i4 == 1 && !nalUnitUtil$SpsData.deltaPicOrderAlwaysZeroFlag) {
                                                    if (wavFormat.canReadExpGolombCodedNum()) {
                                                        int readSignedExpGolombCodedInt2 = wavFormat.readSignedExpGolombCodedInt();
                                                        if (!z5 || z) {
                                                            i6 = readSignedExpGolombCodedInt2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            readSignedExpGolombCodedInt = 0;
                                                            SampleReader.SliceHeaderData sliceHeaderData22 = sampleReader.sliceHeader;
                                                            sliceHeaderData22.spsData = nalUnitUtil$SpsData;
                                                            sliceHeaderData22.nalRefIdc = readBits;
                                                            sliceHeaderData22.sliceType = readExpGolombCodeNum;
                                                            sliceHeaderData22.frameNum = readBits2;
                                                            sliceHeaderData22.picParameterSetId = readExpGolombCodeNum2;
                                                            sliceHeaderData22.fieldPicFlag = z;
                                                            sliceHeaderData22.bottomFieldFlagPresent = z3;
                                                            sliceHeaderData22.bottomFieldFlag = z2;
                                                            sliceHeaderData22.idrPicFlag = z4;
                                                            sliceHeaderData22.idrPicId = i3;
                                                            sliceHeaderData22.picOrderCntLsb = i5;
                                                            sliceHeaderData22.deltaPicOrderCntBottom = i7;
                                                            sliceHeaderData22.deltaPicOrderCnt0 = i6;
                                                            sliceHeaderData22.deltaPicOrderCnt1 = readSignedExpGolombCodedInt;
                                                            sliceHeaderData22.isComplete = true;
                                                            sliceHeaderData22.hasSliceType = true;
                                                            sampleReader.isFilling = false;
                                                        }
                                                        if (wavFormat.canReadExpGolombCodedNum()) {
                                                            readSignedExpGolombCodedInt = wavFormat.readSignedExpGolombCodedInt();
                                                            i7 = 0;
                                                            i6 = readSignedExpGolombCodedInt2;
                                                            i5 = 0;
                                                            SampleReader.SliceHeaderData sliceHeaderData222 = sampleReader.sliceHeader;
                                                            sliceHeaderData222.spsData = nalUnitUtil$SpsData;
                                                            sliceHeaderData222.nalRefIdc = readBits;
                                                            sliceHeaderData222.sliceType = readExpGolombCodeNum;
                                                            sliceHeaderData222.frameNum = readBits2;
                                                            sliceHeaderData222.picParameterSetId = readExpGolombCodeNum2;
                                                            sliceHeaderData222.fieldPicFlag = z;
                                                            sliceHeaderData222.bottomFieldFlagPresent = z3;
                                                            sliceHeaderData222.bottomFieldFlag = z2;
                                                            sliceHeaderData222.idrPicFlag = z4;
                                                            sliceHeaderData222.idrPicId = i3;
                                                            sliceHeaderData222.picOrderCntLsb = i5;
                                                            sliceHeaderData222.deltaPicOrderCntBottom = i7;
                                                            sliceHeaderData222.deltaPicOrderCnt0 = i6;
                                                            sliceHeaderData222.deltaPicOrderCnt1 = readSignedExpGolombCodedInt;
                                                            sliceHeaderData222.isComplete = true;
                                                            sliceHeaderData222.hasSliceType = true;
                                                            sampleReader.isFilling = false;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i5 = 0;
                                            }
                                            i6 = 0;
                                            i7 = 0;
                                            readSignedExpGolombCodedInt = 0;
                                            SampleReader.SliceHeaderData sliceHeaderData2222 = sampleReader.sliceHeader;
                                            sliceHeaderData2222.spsData = nalUnitUtil$SpsData;
                                            sliceHeaderData2222.nalRefIdc = readBits;
                                            sliceHeaderData2222.sliceType = readExpGolombCodeNum;
                                            sliceHeaderData2222.frameNum = readBits2;
                                            sliceHeaderData2222.picParameterSetId = readExpGolombCodeNum2;
                                            sliceHeaderData2222.fieldPicFlag = z;
                                            sliceHeaderData2222.bottomFieldFlagPresent = z3;
                                            sliceHeaderData2222.bottomFieldFlag = z2;
                                            sliceHeaderData2222.idrPicFlag = z4;
                                            sliceHeaderData2222.idrPicId = i3;
                                            sliceHeaderData2222.picOrderCntLsb = i5;
                                            sliceHeaderData2222.deltaPicOrderCntBottom = i7;
                                            sliceHeaderData2222.deltaPicOrderCnt0 = i6;
                                            sliceHeaderData2222.deltaPicOrderCnt1 = readSignedExpGolombCodedInt;
                                            sliceHeaderData2222.isComplete = true;
                                            sliceHeaderData2222.hasSliceType = true;
                                            sampleReader.isFilling = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (sampleReader.nalUnitType != 5) {
                                }
                                if (z4) {
                                }
                                i4 = nalUnitUtil$SpsData.picOrderCountType;
                                if (i4 != 0) {
                                }
                                i6 = 0;
                                i7 = 0;
                                readSignedExpGolombCodedInt = 0;
                                SampleReader.SliceHeaderData sliceHeaderData22222 = sampleReader.sliceHeader;
                                sliceHeaderData22222.spsData = nalUnitUtil$SpsData;
                                sliceHeaderData22222.nalRefIdc = readBits;
                                sliceHeaderData22222.sliceType = readExpGolombCodeNum;
                                sliceHeaderData22222.frameNum = readBits2;
                                sliceHeaderData22222.picParameterSetId = readExpGolombCodeNum2;
                                sliceHeaderData22222.fieldPicFlag = z;
                                sliceHeaderData22222.bottomFieldFlagPresent = z3;
                                sliceHeaderData22222.bottomFieldFlag = z2;
                                sliceHeaderData22222.idrPicFlag = z4;
                                sliceHeaderData22222.idrPicId = i3;
                                sliceHeaderData22222.picOrderCntLsb = i5;
                                sliceHeaderData22222.deltaPicOrderCntBottom = i7;
                                sliceHeaderData22222.deltaPicOrderCnt0 = i6;
                                sliceHeaderData22222.deltaPicOrderCnt1 = readSignedExpGolombCodedInt;
                                sliceHeaderData22222.isComplete = true;
                                sliceHeaderData22222.hasSliceType = true;
                                sampleReader.isFilling = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        this.output.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        if (z) {
            this.seiReader.reorderingBufferQueue.flushQueueDownToSize(0);
            endNalUnit(this.totalBytesWritten, this.pesTimeUs, 0, 0);
            startNalUnit(9, this.totalBytesWritten, this.pesTimeUs);
            endNalUnit(this.totalBytesWritten, this.pesTimeUs, 0, 0);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        this.pesTimeUs = j;
        this.randomAccessIndicator = ((i & 2) != 0) | this.randomAccessIndicator;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = -9223372036854775807L;
        OpusUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.reorderingBufferQueue.flushQueueDownToSize(0);
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.isFilling = false;
            sampleReader.readingSample = false;
            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.sliceHeader;
            sliceHeaderData.hasSliceType = false;
            sliceHeaderData.isComplete = false;
        }
    }

    public final void startNalUnit(int i, long j, long j2) {
        if (!this.hasOutputFormat || this.sampleReader.detectAccessUnits) {
            this.sps.startNalUnit(i);
            this.pps.startNalUnit(i);
        }
        this.sei.startNalUnit(i);
        SampleReader sampleReader = this.sampleReader;
        boolean z = this.randomAccessIndicator;
        sampleReader.nalUnitType = i;
        sampleReader.nalUnitTimeUs = j2;
        sampleReader.nalUnitStartPosition = j;
        sampleReader.randomAccessIndicator = z;
        if (!sampleReader.allowNonIdrKeyframes || i != 1) {
            if (!sampleReader.detectAccessUnits) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        SampleReader.SliceHeaderData sliceHeaderData = sampleReader.previousSliceHeader;
        sampleReader.previousSliceHeader = sampleReader.sliceHeader;
        sampleReader.sliceHeader = sliceHeaderData;
        sliceHeaderData.hasSliceType = false;
        sliceHeaderData.isComplete = false;
        sampleReader.bufferLength = 0;
        sampleReader.isFilling = true;
    }
}
