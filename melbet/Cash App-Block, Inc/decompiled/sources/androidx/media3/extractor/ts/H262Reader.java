package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.android.libraries.places.internal.zzcjk;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class H262Reader implements ElementaryStreamReader {
    public static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public final String containerMimeType;
    public final CsdBuffer csdBuffer;
    public String formatId;
    public long frameDurationUs;
    public boolean hasOutputFormat;
    public TrackOutput output;
    public long pesTimeUs;
    public final boolean[] prefixFlags = new boolean[4];
    public boolean sampleHasPicture;
    public boolean sampleIsKeyframe;
    public long samplePosition;
    public long sampleTimeUs;
    public boolean startedFirstSample;
    public long totalBytesWritten;
    public final NalUnitTargetBuffer userData;
    public final ParsableByteArray userDataParsable;
    public final SeiReader userDataReader;

    public final class CsdBuffer {
        public static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        public boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

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

    public H262Reader(SeiReader seiReader, String str) {
        this.userDataReader = seiReader;
        this.containerMimeType = str;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.data = new byte[128];
        this.csdBuffer = csdBuffer;
        if (seiReader != null) {
            this.userData = new NalUnitTargetBuffer(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void consume(ParsableByteArray parsableByteArray) {
        CsdBuffer csdBuffer;
        NalUnitTargetBuffer nalUnitTargetBuffer;
        int i;
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j4;
        this.output.getClass();
        int i5 = parsableByteArray.position;
        int i6 = parsableByteArray.limit;
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray.bytesLeft(), parsableByteArray);
        while (true) {
            int findNalUnit = OpusUtil.findNalUnit(bArr, i5, i6, this.prefixFlags);
            csdBuffer = this.csdBuffer;
            nalUnitTargetBuffer = this.userData;
            if (findNalUnit == i6) {
                break;
            }
            int i7 = findNalUnit + 3;
            int i8 = parsableByteArray.data[i7] & 255;
            int i9 = findNalUnit - i5;
            if (this.hasOutputFormat) {
                i = i6;
            } else {
                if (i9 > 0) {
                    csdBuffer.onData(i5, findNalUnit, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (csdBuffer.isFilling) {
                    int i11 = csdBuffer.length - i10;
                    csdBuffer.length = i11;
                    if (csdBuffer.sequenceExtensionPosition == 0 && i8 == 181) {
                        csdBuffer.sequenceExtensionPosition = i11;
                        i = i6;
                    } else {
                        csdBuffer.isFilling = false;
                        String str = this.formatId;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
                        int i12 = copyOf[4] & 255;
                        byte b = copyOf[5];
                        i = i6;
                        int i13 = ((b & 255) >> 4) | (i12 << 4);
                        int i14 = (copyOf[6] & 255) | ((b & 15) << 8);
                        int i15 = (copyOf[7] & 240) >> 4;
                        if (i15 == 2) {
                            f = i14 * 4;
                            i3 = i13 * 3;
                        } else if (i15 == 3) {
                            f = i14 * 16;
                            i3 = i13 * 9;
                        } else if (i15 != 4) {
                            f2 = 1.0f;
                            Format.Builder builder = new Format.Builder();
                            builder.id = str;
                            builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
                            builder.sampleMimeType = MimeTypes.normalizeMimeType("video/mpeg2");
                            builder.width = i13;
                            builder.height = i14;
                            builder.pixelWidthHeightRatio = f2;
                            builder.initializationData = Collections.singletonList(copyOf);
                            Format format2 = new Format(builder);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = FRAME_RATE_VALUES[i4];
                                byte b2 = copyOf[csdBuffer.sequenceExtensionPosition + 9];
                                int i16 = (b2 & 96) >> 5;
                                if (i16 != (b2 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(format2, Long.valueOf(j4));
                            this.output.format((Format) create.first);
                            this.frameDurationUs = ((Long) create.second).longValue();
                            this.hasOutputFormat = true;
                        } else {
                            f = i14 * 121;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        Format.Builder builder2 = new Format.Builder();
                        builder2.id = str;
                        builder2.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
                        builder2.sampleMimeType = MimeTypes.normalizeMimeType("video/mpeg2");
                        builder2.width = i13;
                        builder2.height = i14;
                        builder2.pixelWidthHeightRatio = f2;
                        builder2.initializationData = Collections.singletonList(copyOf);
                        Format format22 = new Format(builder2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(format22, Long.valueOf(j4));
                        this.output.format((Format) create2.first);
                        this.frameDurationUs = ((Long) create2.second).longValue();
                        this.hasOutputFormat = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        csdBuffer.isFilling = true;
                    }
                }
                csdBuffer.onData(0, 3, CsdBuffer.START_CODE);
            }
            if (nalUnitTargetBuffer != null) {
                if (i9 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(i5, findNalUnit, bArr);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (nalUnitTargetBuffer.endNalUnit(i2)) {
                    int unescapeStream = OpusUtil.unescapeStream(nalUnitTargetBuffer.nalLength, (byte[]) nalUnitTargetBuffer.nalData);
                    String str2 = Util.DEVICE_DEBUG_INFO;
                    byte[] bArr2 = (byte[]) nalUnitTargetBuffer.nalData;
                    ParsableByteArray parsableByteArray2 = this.userDataParsable;
                    parsableByteArray2.reset(unescapeStream, bArr2);
                    this.userDataReader.consume(this.sampleTimeUs, parsableByteArray2);
                }
                if (i8 == 178) {
                    z = true;
                    if (parsableByteArray.data[findNalUnit + 2] == 1) {
                        nalUnitTargetBuffer.startNalUnit(i8);
                    }
                    if (i8 != 0 || i8 == 179) {
                        int i17 = i - findNalUnit;
                        if (this.sampleHasPicture && this.hasOutputFormat) {
                            j3 = this.sampleTimeUs;
                            if (j3 != -9223372036854775807L) {
                                j = -9223372036854775807L;
                                this.output.sampleMetadata(j3, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i17, i17, null);
                                if (this.startedFirstSample || this.sampleHasPicture) {
                                    this.samplePosition = this.totalBytesWritten - i17;
                                    j2 = this.pesTimeUs;
                                    if (j2 == j) {
                                        long j5 = this.sampleTimeUs;
                                        j2 = j5 != j ? j5 + this.frameDurationUs : j;
                                    }
                                    this.sampleTimeUs = j2;
                                    z2 = false;
                                    this.sampleIsKeyframe = false;
                                    this.pesTimeUs = j;
                                    z3 = true;
                                    this.startedFirstSample = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.sampleHasPicture = i8 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.startedFirstSample) {
                        }
                        this.samplePosition = this.totalBytesWritten - i17;
                        j2 = this.pesTimeUs;
                        if (j2 == j) {
                        }
                        this.sampleTimeUs = j2;
                        z2 = false;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = j;
                        z3 = true;
                        this.startedFirstSample = true;
                        this.sampleHasPicture = i8 == 0 ? z3 : z2;
                    } else if (i8 == 184) {
                        this.sampleIsKeyframe = z;
                    }
                    i5 = i7;
                    i6 = i;
                }
            }
            z = true;
            if (i8 != 0) {
            }
            int i172 = i - findNalUnit;
            if (this.sampleHasPicture) {
                j3 = this.sampleTimeUs;
                if (j3 != -9223372036854775807L) {
                }
            }
            j = -9223372036854775807L;
            if (this.startedFirstSample) {
            }
            this.samplePosition = this.totalBytesWritten - i172;
            j2 = this.pesTimeUs;
            if (j2 == j) {
            }
            this.sampleTimeUs = j2;
            z2 = false;
            this.sampleIsKeyframe = false;
            this.pesTimeUs = j;
            z3 = true;
            this.startedFirstSample = true;
            this.sampleHasPicture = i8 == 0 ? z3 : z2;
            i5 = i7;
            i6 = i;
        }
        if (!this.hasOutputFormat) {
            csdBuffer.onData(i5, i6, bArr);
        }
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.appendToNalUnit(i5, i6, bArr);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        this.formatId = (String) zzcjkVar.zza;
        zzcjkVar.maybeThrowUninitializedError();
        this.output = extractorOutput.track(zzcjkVar.zze, 2);
        SeiReader seiReader = this.userDataReader;
        if (seiReader != null) {
            seiReader.createTracks(extractorOutput, zzcjkVar);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        this.output.getClass();
        if (z) {
            boolean z2 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z2 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
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
        csdBuffer.sequenceExtensionPosition = 0;
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }
}
