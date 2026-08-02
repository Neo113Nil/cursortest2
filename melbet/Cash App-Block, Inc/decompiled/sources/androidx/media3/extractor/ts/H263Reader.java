package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Collections;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class H263Reader implements ElementaryStreamReader {
    public static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final CsdBuffer csdBuffer;
    public String formatId;
    public boolean hasOutputFormat;
    public TrackOutput output;
    public long pesTimeUs;
    public final boolean[] prefixFlags = new boolean[4];
    public SampleReader sampleReader;
    public long totalBytesWritten;
    public final NalUnitTargetBuffer userData;
    public final ParsableByteArray userDataParsable;
    public final SeiReader userDataReader;

    public final class CsdBuffer {
        public static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        public boolean isFilling;
        public int length;
        public int state;
        public int volStartPosition;

        public final void onData(int i, int i2, byte[] bArr) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length + i3;
                if (length < i4) {
                    this.data = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }

    public final class SampleReader {
        public boolean lookingForVopCodingType;
        public final TrackOutput output;
        public boolean readingSample;
        public boolean sampleIsKeyframe;
        public long samplePosition;
        public long sampleTimeUs;
        public int startCodeValue;
        public int vopBytesRead;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public final void onData(int i, int i2, byte[] bArr) {
            if (this.lookingForVopCodingType) {
                int i3 = this.vopBytesRead;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.vopBytesRead = (i2 - i) + i3;
                } else {
                    this.sampleIsKeyframe = ((bArr[i4] & 192) >> 6) == 0;
                    this.lookingForVopCodingType = false;
                }
            }
        }

        public final void onDataEnd(long j, int i, boolean z) {
            Trace.checkState(this.sampleTimeUs != -9223372036854775807L);
            if (this.startCodeValue == 182 && z && this.readingSample) {
                this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, (int) (j - this.samplePosition), i, null);
            }
            if (this.startCodeValue != 179) {
                this.samplePosition = j;
            }
        }
    }

    public H263Reader(SeiReader seiReader) {
        this.userDataReader = seiReader;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.data = new byte[128];
        this.csdBuffer = csdBuffer;
        this.pesTimeUs = -9223372036854775807L;
        this.userData = new NalUnitTargetBuffer(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE);
        this.userDataParsable = new ParsableByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.sampleReader.getClass();
        this.output.getClass();
        int i5 = parsableByteArray.position;
        int i6 = parsableByteArray.limit;
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray.bytesLeft(), parsableByteArray);
        while (true) {
            int findNalUnit = OpusUtil.findNalUnit(bArr, i5, i6, this.prefixFlags);
            CsdBuffer csdBuffer = this.csdBuffer;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (findNalUnit == i6) {
                if (!this.hasOutputFormat) {
                    csdBuffer.onData(i5, i6, bArr);
                }
                this.sampleReader.onData(i5, i6, bArr);
                if (nalUnitTargetBuffer != null) {
                    nalUnitTargetBuffer.appendToNalUnit(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = findNalUnit + 3;
            byte b = parsableByteArray.data[i7];
            int i8 = b & 255;
            int i9 = findNalUnit - i5;
            if (this.hasOutputFormat) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    csdBuffer.onData(i5, findNalUnit, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = csdBuffer.state;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            csdBuffer.isFilling = false;
                            csdBuffer.length = 0;
                            csdBuffer.state = 0;
                        } else {
                            csdBuffer.state = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                csdBuffer.length -= i10;
                                csdBuffer.isFilling = false;
                                TrackOutput trackOutput = this.output;
                                int i12 = csdBuffer.volStartPosition;
                                String str = this.formatId;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
                                VorbisBitArray vorbisBitArray = new VorbisBitArray(copyOf, copyOf.length);
                                vorbisBitArray.skipBytes(i12);
                                vorbisBitArray.skipBytes(4);
                                vorbisBitArray.skipBit();
                                vorbisBitArray.skipBits(8);
                                if (vorbisBitArray.readBit()) {
                                    vorbisBitArray.skipBits(4);
                                    vorbisBitArray.skipBits(3);
                                }
                                int readBits = vorbisBitArray.readBits(4);
                                if (readBits == 15) {
                                    int readBits2 = vorbisBitArray.readBits(8);
                                    int readBits3 = vorbisBitArray.readBits(8);
                                    if (readBits3 == 0) {
                                        Log.w("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (vorbisBitArray.readBit()) {
                                            vorbisBitArray.skipBits(2);
                                            vorbisBitArray.skipBits(1);
                                            if (vorbisBitArray.readBit()) {
                                                vorbisBitArray.skipBits(15);
                                                vorbisBitArray.skipBit();
                                                vorbisBitArray.skipBits(15);
                                                vorbisBitArray.skipBit();
                                                vorbisBitArray.skipBits(15);
                                                vorbisBitArray.skipBit();
                                                vorbisBitArray.skipBits(3);
                                                vorbisBitArray.skipBits(11);
                                                vorbisBitArray.skipBit();
                                                vorbisBitArray.skipBits(15);
                                                vorbisBitArray.skipBit();
                                            }
                                        }
                                        if (vorbisBitArray.readBits(2) != 0) {
                                            Log.w("H263Reader", "Unhandled video object layer shape");
                                        }
                                        vorbisBitArray.skipBit();
                                        int readBits4 = vorbisBitArray.readBits(16);
                                        vorbisBitArray.skipBit();
                                        if (vorbisBitArray.readBit()) {
                                            if (readBits4 == 0) {
                                                Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i13 = 0;
                                                for (int i14 = readBits4 - 1; i14 > 0; i14 >>= 1) {
                                                    i13++;
                                                }
                                                vorbisBitArray.skipBits(i13);
                                            }
                                        }
                                        vorbisBitArray.skipBit();
                                        int readBits5 = vorbisBitArray.readBits(13);
                                        vorbisBitArray.skipBit();
                                        int readBits6 = vorbisBitArray.readBits(13);
                                        vorbisBitArray.skipBit();
                                        vorbisBitArray.skipBit();
                                        Format.Builder builder = new Format.Builder();
                                        builder.id = str;
                                        builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                        builder.sampleMimeType = MimeTypes.normalizeMimeType("video/mp4v-es");
                                        builder.width = readBits5;
                                        builder.height = readBits6;
                                        builder.pixelWidthHeightRatio = f;
                                        builder.initializationData = Collections.singletonList(copyOf);
                                        NavAction$$ExternalSyntheticOutline0.m(builder, trackOutput);
                                        this.hasOutputFormat = true;
                                    } else {
                                        f = readBits2 / readBits3;
                                        if (vorbisBitArray.readBit()) {
                                        }
                                        if (vorbisBitArray.readBits(2) != 0) {
                                        }
                                        vorbisBitArray.skipBit();
                                        int readBits42 = vorbisBitArray.readBits(16);
                                        vorbisBitArray.skipBit();
                                        if (vorbisBitArray.readBit()) {
                                        }
                                        vorbisBitArray.skipBit();
                                        int readBits52 = vorbisBitArray.readBits(13);
                                        vorbisBitArray.skipBit();
                                        int readBits62 = vorbisBitArray.readBits(13);
                                        vorbisBitArray.skipBit();
                                        vorbisBitArray.skipBit();
                                        Format.Builder builder2 = new Format.Builder();
                                        builder2.id = str;
                                        builder2.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                        builder2.sampleMimeType = MimeTypes.normalizeMimeType("video/mp4v-es");
                                        builder2.width = readBits52;
                                        builder2.height = readBits62;
                                        builder2.pixelWidthHeightRatio = f;
                                        builder2.initializationData = Collections.singletonList(copyOf);
                                        NavAction$$ExternalSyntheticOutline0.m(builder2, trackOutput);
                                        this.hasOutputFormat = true;
                                    }
                                } else if (readBits < 7) {
                                    f = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO[readBits];
                                    if (vorbisBitArray.readBit()) {
                                    }
                                    if (vorbisBitArray.readBits(2) != 0) {
                                    }
                                    vorbisBitArray.skipBit();
                                    int readBits422 = vorbisBitArray.readBits(16);
                                    vorbisBitArray.skipBit();
                                    if (vorbisBitArray.readBit()) {
                                    }
                                    vorbisBitArray.skipBit();
                                    int readBits522 = vorbisBitArray.readBits(13);
                                    vorbisBitArray.skipBit();
                                    int readBits622 = vorbisBitArray.readBits(13);
                                    vorbisBitArray.skipBit();
                                    vorbisBitArray.skipBit();
                                    Format.Builder builder22 = new Format.Builder();
                                    builder22.id = str;
                                    builder22.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                    builder22.sampleMimeType = MimeTypes.normalizeMimeType("video/mp4v-es");
                                    builder22.width = readBits522;
                                    builder22.height = readBits622;
                                    builder22.pixelWidthHeightRatio = f;
                                    builder22.initializationData = Collections.singletonList(copyOf);
                                    NavAction$$ExternalSyntheticOutline0.m(builder22, trackOutput);
                                    this.hasOutputFormat = true;
                                } else {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (vorbisBitArray.readBit()) {
                                    }
                                    if (vorbisBitArray.readBits(2) != 0) {
                                    }
                                    vorbisBitArray.skipBit();
                                    int readBits4222 = vorbisBitArray.readBits(16);
                                    vorbisBitArray.skipBit();
                                    if (vorbisBitArray.readBit()) {
                                    }
                                    vorbisBitArray.skipBit();
                                    int readBits5222 = vorbisBitArray.readBits(13);
                                    vorbisBitArray.skipBit();
                                    int readBits6222 = vorbisBitArray.readBits(13);
                                    vorbisBitArray.skipBit();
                                    vorbisBitArray.skipBit();
                                    Format.Builder builder222 = new Format.Builder();
                                    builder222.id = str;
                                    builder222.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                    builder222.sampleMimeType = MimeTypes.normalizeMimeType("video/mp4v-es");
                                    builder222.width = readBits5222;
                                    builder222.height = readBits6222;
                                    builder222.pixelWidthHeightRatio = f;
                                    builder222.initializationData = Collections.singletonList(copyOf);
                                    NavAction$$ExternalSyntheticOutline0.m(builder222, trackOutput);
                                    this.hasOutputFormat = true;
                                }
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            Log.w("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            csdBuffer.isFilling = false;
                            csdBuffer.length = 0;
                            csdBuffer.state = 0;
                        } else {
                            i4 = 0;
                            csdBuffer.volStartPosition = csdBuffer.length;
                            csdBuffer.state = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            csdBuffer.isFilling = false;
                            csdBuffer.length = 0;
                            csdBuffer.state = 0;
                        } else {
                            csdBuffer.state = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        csdBuffer.state = 1;
                        csdBuffer.isFilling = true;
                    }
                }
                csdBuffer.onData(i4, 3, CsdBuffer.START_CODE);
            }
            this.sampleReader.onData(i5, findNalUnit, bArr);
            if (nalUnitTargetBuffer != null) {
                if (i9 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(i5, findNalUnit, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (nalUnitTargetBuffer.endNalUnit(i3)) {
                    int unescapeStream = OpusUtil.unescapeStream(nalUnitTargetBuffer.nalLength, (byte[]) nalUnitTargetBuffer.nalData);
                    String str2 = Util.DEVICE_DEBUG_INFO;
                    byte[] bArr2 = (byte[]) nalUnitTargetBuffer.nalData;
                    ParsableByteArray parsableByteArray2 = this.userDataParsable;
                    parsableByteArray2.reset(unescapeStream, bArr2);
                    this.userDataReader.consume(this.pesTimeUs, parsableByteArray2);
                }
                if (i8 == 178) {
                    z = true;
                    if (parsableByteArray.data[findNalUnit + 2] == 1) {
                        nalUnitTargetBuffer.startNalUnit(i8);
                    }
                    int i15 = i - findNalUnit;
                    this.sampleReader.onDataEnd(this.totalBytesWritten - i15, i15, this.hasOutputFormat);
                    SampleReader sampleReader = this.sampleReader;
                    long j = this.pesTimeUs;
                    sampleReader.startCodeValue = i8;
                    sampleReader.sampleIsKeyframe = false;
                    sampleReader.readingSample = (i8 != 182 || i8 == 179) ? z : false;
                    sampleReader.lookingForVopCodingType = i8 != 182 ? z : false;
                    sampleReader.vopBytesRead = 0;
                    sampleReader.sampleTimeUs = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i152 = i - findNalUnit;
            this.sampleReader.onDataEnd(this.totalBytesWritten - i152, i152, this.hasOutputFormat);
            SampleReader sampleReader2 = this.sampleReader;
            long j2 = this.pesTimeUs;
            sampleReader2.startCodeValue = i8;
            sampleReader2.sampleIsKeyframe = false;
            sampleReader2.readingSample = (i8 != 182 || i8 == 179) ? z : false;
            sampleReader2.lookingForVopCodingType = i8 != 182 ? z : false;
            sampleReader2.vopBytesRead = 0;
            sampleReader2.sampleTimeUs = j2;
            i6 = i;
            i5 = i2;
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
        this.userDataReader.createTracks(extractorOutput, zzcjkVar);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        this.sampleReader.getClass();
        if (z) {
            this.sampleReader.onDataEnd(this.totalBytesWritten, 0, this.hasOutputFormat);
            SampleReader sampleReader = this.sampleReader;
            sampleReader.readingSample = false;
            sampleReader.lookingForVopCodingType = false;
            sampleReader.sampleIsKeyframe = false;
            sampleReader.startCodeValue = -1;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        this.pesTimeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        OpusUtil.clearPrefixFlags(this.prefixFlags);
        CsdBuffer csdBuffer = this.csdBuffer;
        csdBuffer.isFilling = false;
        csdBuffer.length = 0;
        csdBuffer.state = 0;
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.readingSample = false;
            sampleReader.lookingForVopCodingType = false;
            sampleReader.sampleIsKeyframe = false;
            sampleReader.startCodeValue = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
    }
}
