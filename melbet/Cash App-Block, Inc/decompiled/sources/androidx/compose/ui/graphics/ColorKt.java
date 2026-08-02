package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Illuminant;
import androidx.compose.ui.graphics.colorspace.Oklab;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1;
import androidx.compose.ui.graphics.colorspace.Rgb$eotf$1;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import kotlin.ULong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class ColorKt {
    public static final RectangleShapeKt$RectangleShape$1 RectangleShape = new RectangleShapeKt$RectangleShape$1();
    public static ReusableGraphicsLayerScope reusableGraphicsLayerScope;

    public static final AndroidCanvas Canvas(AndroidImageBitmap androidImageBitmap) {
        android.graphics.Canvas canvas = AndroidCanvas_androidKt.EmptyCanvas;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.internalCanvas = new android.graphics.Canvas(asAndroidBitmap(androidImageBitmap));
        return androidCanvas;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float minValue;
        float maxValue;
        int i4;
        int i5;
        int i6;
        int i7;
        float minValue2;
        float maxValue2;
        int i8;
        int i9;
        int i10;
        boolean isSrgb = colorSpace.isSrgb();
        float f5 = RecyclerView.DECELERATION_RATE;
        if (isSrgb) {
            float f6 = f4 < RecyclerView.DECELERATION_RATE ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < RecyclerView.DECELERATION_RATE ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < RecyclerView.DECELERATION_RATE ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            if (f3 >= RecyclerView.DECELERATION_RATE) {
                f5 = f3;
            }
            float f9 = f5 <= 1.0f ? f5 : 1.0f;
            ULong.Companion companion = ULong.Companion;
            long j = (i13 | ((int) ((f9 * 255.0f) + 0.5f))) << 32;
            int i14 = Color.$r8$clinit;
            return j;
        }
        if (((int) (colorSpace.model >> 32)) != 3) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i15 = colorSpace.id;
        if (i15 == -1) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float minValue3 = colorSpace.getMinValue(0);
        float maxValue3 = colorSpace.getMaxValue(0);
        if (f >= minValue3) {
            minValue3 = f;
        }
        if (minValue3 <= maxValue3) {
            maxValue3 = minValue3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(maxValue3);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    minValue = colorSpace.getMinValue(1);
                    maxValue = colorSpace.getMaxValue(1);
                    if (f2 >= minValue) {
                        minValue = f2;
                    }
                    if (minValue <= maxValue) {
                        maxValue = minValue;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(maxValue);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                minValue2 = colorSpace.getMinValue(2);
                                maxValue2 = colorSpace.getMaxValue(2);
                                if (f3 >= minValue2) {
                                    minValue2 = f3;
                                }
                                if (minValue2 <= maxValue2) {
                                    maxValue2 = minValue2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(maxValue2);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            if (f4 >= RecyclerView.DECELERATION_RATE) {
                                                f5 = f4;
                                            }
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s3) << 16) | ((((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            ULong.Companion companion2 = ULong.Companion;
                                            int i27 = Color.$r8$clinit;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += PKIFailureInfo.certRevoked;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                short s32 = (short) i10;
                                if (f4 >= RecyclerView.DECELERATION_RATE) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s32) << 16) | ((((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                ULong.Companion companion22 = ULong.Companion;
                                int i272 = Color.$r8$clinit;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += PKIFailureInfo.certRevoked;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                    }
                    if (minValue2 <= maxValue2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(maxValue2);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    short s322 = (short) i10;
                    if (f4 >= RecyclerView.DECELERATION_RATE) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & s322) << 16) | ((((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    ULong.Companion companion222 = ULong.Companion;
                    int i2722 = Color.$r8$clinit;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += PKIFailureInfo.certRevoked;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        minValue = colorSpace.getMinValue(1);
        maxValue = colorSpace.getMaxValue(1);
        if (f2 >= minValue) {
        }
        if (minValue <= maxValue) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(maxValue);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        minValue2 = colorSpace.getMinValue(2);
        maxValue2 = colorSpace.getMaxValue(2);
        if (f3 >= minValue2) {
        }
        if (minValue2 <= maxValue2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(maxValue2);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        short s3222 = (short) i10;
        if (f4 >= RecyclerView.DECELERATION_RATE) {
        }
        long j2222 = (i15 & 63) | ((s4 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & s3222) << 16) | ((((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        ULong.Companion companion2222 = ULong.Companion;
        int i27222 = Color.$r8$clinit;
        return j2222;
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static AndroidImageBitmap m683ImageBitmapx__hDU$default(int i, int i2, int i3) {
        android.graphics.ColorSpace colorSpace;
        android.graphics.ColorSpace rgb;
        android.graphics.ColorSpace obtainAndroidColorSpace;
        Rgb rgb2 = ColorSpaces.Srgb;
        m695toBitmapConfig1JJdX4A(i3);
        Bitmap.Config m695toBitmapConfig1JJdX4A = m695toBitmapConfig1JJdX4A(i3);
        if (Intrinsics.areEqual(rgb2, rgb2)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.Aces)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.Acescg)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.AdobeRgb)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.Bt2020)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.Bt709)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.CieLab)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.CieXyz)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.DciP3)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.DisplayP3)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.ExtendedSrgb)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.LinearExtendedSrgb)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.LinearSrgb)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.Ntsc1953)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.areEqual(rgb2, ColorSpaces.ProPhotoRgb)) {
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.areEqual(rgb2, ColorSpaces.SmpteC)) {
                if (Build.VERSION.SDK_INT >= 34 && (obtainAndroidColorSpace = PlayerView.Api34.obtainAndroidColorSpace(rgb2)) != null) {
                    rgb = obtainAndroidColorSpace;
                } else if (rgb2 != null) {
                    String str = rgb2.name;
                    float[] xyz$ui_graphics = rgb2.whitePoint.toXyz$ui_graphics();
                    TransferParameters transferParameters = rgb2.transferParameters;
                    ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f, transferParameters.gamma) : null;
                    float[] fArr = rgb2.transform;
                    final int i4 = 0;
                    if (transferParameters2 != null) {
                        ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, rgb2.primaries, xyz$ui_graphics, transferParameters2);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                            rgb = rgb3;
                        } else {
                            colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters2);
                        }
                    } else {
                        float[] fArr2 = rgb2.primaries;
                        final Rgb$eotf$1 rgb$eotf$1 = rgb2.oetf;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = i4;
                                Function1 function1 = rgb$eotf$1;
                                switch (i5) {
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final Rgb$eotf$1 rgb$eotf$12 = rgb2.eotf;
                        final int i5 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr2, xyz$ui_graphics, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i52 = i5;
                                Function1 function1 = rgb$eotf$12;
                                switch (i52) {
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, rgb2.min, rgb2.max);
                    }
                } else {
                    colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, m695toBitmapConfig1JJdX4A, true, rgb));
            }
            colorSpace = android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, m695toBitmapConfig1JJdX4A, true, rgb));
    }

    public static final AndroidPaint Paint() {
        return new AndroidPaint(new android.graphics.Paint(7));
    }

    public static final long TransformOrigin(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
        int i = TransformOrigin.$r8$clinit;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long UncheckedColor(float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (colorSpace.isSrgb()) {
            ULong.Companion companion = ULong.Companion;
            long j = ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32;
            int i10 = Color.$r8$clinit;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i18 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i15 = i21 == 0 ? 0 : 512;
                                    i14 = 31;
                                } else {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                long max = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(RecyclerView.DECELERATION_RATE, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.id & 63);
                                                ULong.Companion companion2 = ULong.Companion;
                                                int i23 = Color.$r8$clinit;
                                                return max;
                                            }
                                            i14 = i22;
                                        } else if (i22 >= -10) {
                                            int i24 = (i21 | 8388608) >> (1 - i22);
                                            if ((i24 & 4096) != 0) {
                                                i24 += PKIFailureInfo.certRevoked;
                                            }
                                            i14 = 0;
                                            i15 = i24 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                }
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long max2 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(RecyclerView.DECELERATION_RATE, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.id & 63);
                                ULong.Companion companion22 = ULong.Companion;
                                int i232 = Color.$r8$clinit;
                                return max2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += PKIFailureInfo.certRevoked;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long max22 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(RecyclerView.DECELERATION_RATE, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.id & 63);
                    ULong.Companion companion222 = ULong.Companion;
                    int i2322 = Color.$r8$clinit;
                    return max22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += PKIFailureInfo.certRevoked;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i182 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long max222 = ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(RecyclerView.DECELERATION_RATE, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.id & 63);
        ULong.Companion companion2222 = ULong.Companion;
        int i23222 = Color.$r8$clinit;
        return max222;
    }

    public static final void addOutline(AndroidPath androidPath, ColorKt colorKt) {
        if (colorKt instanceof Outline$Rectangle) {
            AndroidPath.addRect$default(androidPath, ((Outline$Rectangle) colorKt).rect);
            return;
        }
        if (colorKt instanceof Outline$Rounded) {
            AndroidPath.addRoundRect$default(androidPath, ((Outline$Rounded) colorKt).roundRect);
        } else if (colorKt instanceof Outline$Generic) {
            AndroidPath.m664addPathUv8p0NA$default(androidPath, ((Outline$Generic) colorKt).path);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public static final Bitmap asAndroidBitmap(AndroidImageBitmap androidImageBitmap) {
        if (androidImageBitmap instanceof AndroidImageBitmap) {
            return androidImageBitmap.bitmap;
        }
        a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m684compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m674convertvNxB06k = Color.m674convertvNxB06k(j, Color.m679getColorSpaceimpl(j2));
        float m677getAlphaimpl = Color.m677getAlphaimpl(j2);
        float m677getAlphaimpl2 = Color.m677getAlphaimpl(m674convertvNxB06k);
        float f3 = 1.0f - m677getAlphaimpl2;
        float f4 = (m677getAlphaimpl * f3) + m677getAlphaimpl2;
        float m681getRedimpl = Color.m681getRedimpl(m674convertvNxB06k);
        float m681getRedimpl2 = Color.m681getRedimpl(j2);
        float f5 = RecyclerView.DECELERATION_RATE;
        if (f4 == RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        } else {
            f = (((m681getRedimpl2 * m677getAlphaimpl) * f3) + (m681getRedimpl * m677getAlphaimpl2)) / f4;
        }
        float m680getGreenimpl = Color.m680getGreenimpl(m674convertvNxB06k);
        float m680getGreenimpl2 = Color.m680getGreenimpl(j2);
        if (f4 == RecyclerView.DECELERATION_RATE) {
            f2 = 0.0f;
        } else {
            f2 = (((m680getGreenimpl2 * m677getAlphaimpl) * f3) + (m680getGreenimpl * m677getAlphaimpl2)) / f4;
        }
        float m678getBlueimpl = Color.m678getBlueimpl(m674convertvNxB06k);
        float m678getBlueimpl2 = Color.m678getBlueimpl(j2);
        if (f4 != RecyclerView.DECELERATION_RATE) {
            f5 = (((m678getBlueimpl2 * m677getAlphaimpl) * f3) + (m678getBlueimpl * m677getAlphaimpl2)) / f4;
        }
        return UncheckedColor(f, f2, f5, f4, Color.m679getColorSpaceimpl(j2));
    }

    public static final void drawOutline(Canvas canvas, ColorKt colorKt, AndroidPaint androidPaint) {
        if (colorKt instanceof Outline$Rectangle) {
            Rect rect = ((Outline$Rectangle) colorKt).rect;
            canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, androidPaint);
            return;
        }
        if (!(colorKt instanceof Outline$Rounded)) {
            if (colorKt instanceof Outline$Generic) {
                canvas.drawPath(((Outline$Generic) colorKt).path, androidPaint);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        Outline$Rounded outline$Rounded = (Outline$Rounded) colorKt;
        RoundRect roundRect = outline$Rounded.roundRect;
        long j = roundRect.bottomLeftCornerRadius;
        AndroidPath androidPath = outline$Rounded.roundRectPath;
        if (androidPath != null) {
            canvas.drawPath(androidPath, androidPaint);
        } else {
            canvas.drawRoundRect(roundRect.left, roundRect.top, roundRect.right, roundRect.bottom, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j)), androidPaint);
        }
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static void m685drawOutlinewDX37Ww$default(DrawScope drawScope, ColorKt colorKt, long j) {
        boolean z = colorKt instanceof Outline$Rectangle;
        Fill fill = Fill.INSTANCE;
        if (z) {
            Rect rect = ((Outline$Rectangle) colorKt).rect;
            float f = rect.left;
            float f2 = rect.top;
            drawScope.mo735drawRectnJ9OG0(j, (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32), size(rect), 1.0f, fill, null, 3);
            return;
        }
        if (!(colorKt instanceof Outline$Rounded)) {
            if (colorKt instanceof Outline$Generic) {
                drawScope.mo732drawPathLG529CI(((Outline$Generic) colorKt).path, j, 1.0f, fill);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        Outline$Rounded outline$Rounded = (Outline$Rounded) colorKt;
        AndroidPath androidPath = outline$Rounded.roundRectPath;
        if (androidPath != null) {
            drawScope.mo732drawPathLG529CI(androidPath, j, 1.0f, fill);
            return;
        }
        RoundRect roundRect = outline$Rounded.roundRect;
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.bottomLeftCornerRadius >> 32));
        float f3 = roundRect.left;
        float f4 = roundRect.top;
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax);
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        drawScope.mo736drawRoundRectuAw5IA(j, floatToRawIntBits, (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), fill);
    }

    public static final android.graphics.Paint getNativePaint(Paint paint) {
        if (!(paint instanceof AndroidPaint)) {
            InlineClassHelperKt.throwIllegalArgumentException("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + Reflection.factory.getOrCreateKotlinClass(paint.getClass()).getQualifiedName());
        }
        return ((AndroidPaint) paint).internalPaint;
    }

    public static final Modifier graphicsLayer(Modifier modifier, Function1 function1) {
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static Modifier m686graphicsLayerAp8cVGQ$default(Modifier modifier, float f, float f2, float f3, float f4, Shape shape, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = TransformOrigin.Center;
        Shape shape2 = (i & 2048) != 0 ? RectangleShape : shape;
        long j2 = GraphicsLayerScopeKt.DefaultShadowColor;
        return modifier.then(new GraphicsLayerElement(f5, f6, f7, f8, RecyclerView.DECELERATION_RATE, j, shape2, false, j2, j2, 0));
    }

    /* renamed from: graphicsLayer-_6ThJ44$default, reason: not valid java name */
    public static Modifier m687graphicsLayer_6ThJ44$default(Modifier modifier, float f, float f2, float f3, float f4, Shape shape, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 256) != 0 ? 0.0f : f4;
        long j = TransformOrigin.Center;
        Shape shape2 = (i & 2048) != 0 ? RectangleShape : shape;
        boolean z = (i & 4096) == 0;
        long j2 = GraphicsLayerScopeKt.DefaultShadowColor;
        return modifier.then(new GraphicsLayerElement(f5, f6, f7, RecyclerView.DECELERATION_RATE, f8, j, shape2, z, j2, j2, (i & 65536) != 0 ? 0 : 1));
    }

    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m688isIdentity58bKbWc(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == RecyclerView.DECELERATION_RATE && fArr[2] == RecyclerView.DECELERATION_RATE && fArr[3] == RecyclerView.DECELERATION_RATE && fArr[4] == RecyclerView.DECELERATION_RATE && fArr[5] == 1.0f && fArr[6] == RecyclerView.DECELERATION_RATE && fArr[7] == RecyclerView.DECELERATION_RATE && fArr[8] == RecyclerView.DECELERATION_RATE && fArr[9] == RecyclerView.DECELERATION_RATE && fArr[10] == 1.0f && fArr[11] == RecyclerView.DECELERATION_RATE && fArr[12] == RecyclerView.DECELERATION_RATE && fArr[13] == RecyclerView.DECELERATION_RATE && fArr[14] == RecyclerView.DECELERATION_RATE && fArr[15] == 1.0f;
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m689lerpjxsXWHM(float f, long j, long j2) {
        Oklab oklab = ColorSpaces.Oklab;
        long m674convertvNxB06k = Color.m674convertvNxB06k(j, oklab);
        long m674convertvNxB06k2 = Color.m674convertvNxB06k(j2, oklab);
        float m677getAlphaimpl = Color.m677getAlphaimpl(m674convertvNxB06k);
        float m681getRedimpl = Color.m681getRedimpl(m674convertvNxB06k);
        float m680getGreenimpl = Color.m680getGreenimpl(m674convertvNxB06k);
        float m678getBlueimpl = Color.m678getBlueimpl(m674convertvNxB06k);
        float m677getAlphaimpl2 = Color.m677getAlphaimpl(m674convertvNxB06k2);
        float m681getRedimpl2 = Color.m681getRedimpl(m674convertvNxB06k2);
        float m680getGreenimpl2 = Color.m680getGreenimpl(m674convertvNxB06k2);
        float m678getBlueimpl2 = Color.m678getBlueimpl(m674convertvNxB06k2);
        if (f < RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m674convertvNxB06k(UncheckedColor(TransactorKt.lerp(m681getRedimpl, m681getRedimpl2, f), TransactorKt.lerp(m680getGreenimpl, m680getGreenimpl2, f), TransactorKt.lerp(m678getBlueimpl, m678getBlueimpl2, f), TransactorKt.lerp(m677getAlphaimpl, m677getAlphaimpl2, f), oklab), Color.m679getColorSpaceimpl(j2));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m690luminance8_81llA(long j) {
        androidx.compose.ui.graphics.colorspace.ColorSpace m679getColorSpaceimpl = Color.m679getColorSpaceimpl(j);
        if (!Illuminant.m719equalsimpl0(m679getColorSpaceimpl.model, 12884901888L)) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) Illuminant.m720toStringimpl(m679getColorSpaceimpl.model)));
        }
        Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda1 = ((Rgb) m679getColorSpaceimpl).eotfFunc;
        double invoke = rgb$$ExternalSyntheticLambda1.invoke(Color.m681getRedimpl(j));
        float invoke2 = (float) ((rgb$$ExternalSyntheticLambda1.invoke(Color.m678getBlueimpl(j)) * 0.0722d) + (rgb$$ExternalSyntheticLambda1.invoke(Color.m680getGreenimpl(j)) * 0.7152d) + (invoke * 0.2126d));
        if (invoke2 < RecyclerView.DECELERATION_RATE) {
            invoke2 = 0.0f;
        }
        if (invoke2 > 1.0f) {
            return 1.0f;
        }
        return invoke2;
    }

    /* renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m691setFromEL8BTi8(android.graphics.Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m692setFromtUYjHk(android.graphics.Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final long size(Rect rect) {
        float f = rect.right - rect.left;
        float f2 = rect.bottom - rect.top;
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m693toAndroidBlendModes9anfk8(int i) {
        return i == 0 ? android.graphics.BlendMode.CLEAR : i == 1 ? android.graphics.BlendMode.SRC : i == 2 ? android.graphics.BlendMode.DST : i == 3 ? android.graphics.BlendMode.SRC_OVER : i == 4 ? android.graphics.BlendMode.DST_OVER : i == 5 ? android.graphics.BlendMode.SRC_IN : i == 6 ? android.graphics.BlendMode.DST_IN : i == 7 ? android.graphics.BlendMode.SRC_OUT : i == 8 ? android.graphics.BlendMode.DST_OUT : i == 9 ? android.graphics.BlendMode.SRC_ATOP : i == 10 ? android.graphics.BlendMode.DST_ATOP : i == 11 ? android.graphics.BlendMode.XOR : i == 12 ? android.graphics.BlendMode.PLUS : i == 13 ? android.graphics.BlendMode.MODULATE : i == 14 ? android.graphics.BlendMode.SCREEN : i == 15 ? android.graphics.BlendMode.OVERLAY : i == 16 ? android.graphics.BlendMode.DARKEN : i == 17 ? android.graphics.BlendMode.LIGHTEN : i == 18 ? android.graphics.BlendMode.COLOR_DODGE : i == 19 ? android.graphics.BlendMode.COLOR_BURN : i == 20 ? android.graphics.BlendMode.HARD_LIGHT : i == 21 ? android.graphics.BlendMode.SOFT_LIGHT : i == 22 ? android.graphics.BlendMode.DIFFERENCE : i == 23 ? android.graphics.BlendMode.EXCLUSION : i == 24 ? android.graphics.BlendMode.MULTIPLY : i == 25 ? android.graphics.BlendMode.HUE : i == 26 ? android.graphics.BlendMode.SATURATION : i == 27 ? android.graphics.BlendMode.COLOR : i == 28 ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final android.graphics.Rect toAndroidRect(IntRect intRect) {
        return new android.graphics.Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final RectF toAndroidRectF(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m694toArgb8_81llA(long j) {
        float[] fArr = ColorSpaces.SrgbPrimaries;
        long m674convertvNxB06k = Color.m674convertvNxB06k(j, ColorSpaces.Srgb) >>> 32;
        ULong.Companion companion = ULong.Companion;
        return (int) m674convertvNxB06k;
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m695toBitmapConfig1JJdX4A(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Rect toComposeRect(RectF rectF) {
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final int writeValidRootInUnitRange(float f, float[] fArr, int i) {
        float f2 = RecyclerView.DECELERATION_RATE;
        if (f >= RecyclerView.DECELERATION_RATE) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public abstract Rect getBounds();

    public static final long Color(int i) {
        long j = i;
        ULong.Companion companion = ULong.Companion;
        long j2 = j << 32;
        int i2 = Color.$r8$clinit;
        return j2;
    }

    public static final long Color(long j) {
        long j2 = j << 32;
        ULong.Companion companion = ULong.Companion;
        int i = Color.$r8$clinit;
        return j2;
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
