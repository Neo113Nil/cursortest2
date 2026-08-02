package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    public static final Drop$$ExternalSyntheticBUOutline0 DoubleIdentity = new Drop$$ExternalSyntheticBUOutline0(12);
    public final Rgb$eotf$1 eotf;
    public final Rgb$$ExternalSyntheticLambda1 eotfFunc;
    public final DoubleFunction eotfOrig;
    public final float[] inverseTransform;
    public final boolean isSrgb;
    public final float max;
    public final float min;
    public final Rgb$eotf$1 oetf;
    public final Rgb$$ExternalSyntheticLambda1 oetfFunc;
    public final DoubleFunction oetfOrig;
    public final float[] primaries;
    public final TransferParameters transferParameters;
    public final float[] transform;
    public final WhitePoint whitePoint;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e0, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.graphics.colorspace.Rgb$eotf$1] */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.graphics.colorspace.Rgb$eotf$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        final int i2 = 1;
        this.oetf = new Function1(this) { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            public final /* synthetic */ Rgb this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                Rgb rgb = this.this$0;
                switch (i3) {
                    case 0:
                        return Double.valueOf(rgb.eotfOrig.invoke(RangesKt___RangesKt.coerceIn(((Number) obj).doubleValue(), rgb.min, rgb.max)));
                    default:
                        return Double.valueOf(RangesKt___RangesKt.coerceIn(rgb.oetfOrig.invoke(((Number) obj).doubleValue()), rgb.min, rgb.max));
                }
            }
        };
        final int i3 = 0;
        this.oetfFunc = new Rgb$$ExternalSyntheticLambda1(this, i3);
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1(this) { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            public final /* synthetic */ Rgb this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                Rgb rgb = this.this$0;
                switch (i32) {
                    case 0:
                        return Double.valueOf(rgb.eotfOrig.invoke(RangesKt___RangesKt.coerceIn(((Number) obj).doubleValue(), rgb.min, rgb.max)));
                    default:
                        return Double.valueOf(RangesKt___RangesKt.coerceIn(rgb.oetfOrig.invoke(((Number) obj).doubleValue()), rgb.min, rgb.max));
                }
            }
        };
        this.eotfFunc = new Rgb$$ExternalSyntheticLambda1(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            a$$ExternalSyntheticBUOutline0.m$3("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            Drop$$ExternalSyntheticBUOutline0.m("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.primaries = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = whitePoint.x;
            r44 = 1;
            float f21 = whitePoint.y;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.transform = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                a$$ExternalSyntheticBUOutline0.m(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.transform = fArr2;
        }
        this.inverseTransform = Illuminant.inverse3x3(this.transform);
        float area = Illuminant.area(fArr3);
        float[] fArr4 = ColorSpaces.SrgbPrimaries;
        if (area / Illuminant.area(ColorSpaces.Ntsc1953Primaries) > 0.9f) {
            float[] fArr5 = ColorSpaces.SrgbPrimaries;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[r44];
            float f41 = fArr5[r44];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = RecyclerView.DECELERATION_RATE;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[r44] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[r44];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= RecyclerView.DECELERATION_RATE && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= RecyclerView.DECELERATION_RATE) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= RecyclerView.DECELERATION_RATE && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= RecyclerView.DECELERATION_RATE) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= RecyclerView.DECELERATION_RATE) {
                    }
                }
            }
        } else {
            f4 = RecyclerView.DECELERATION_RATE;
        }
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = ColorSpaces.SrgbPrimaries;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (Float.compare(fArr3[i5], fArr7[i5]) != 0 && Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (Illuminant.compare(whitePoint, Illuminant.D65) && f == f4 && f2 == f3) {
                float[] fArr8 = ColorSpaces.SrgbPrimaries;
                Rgb rgb = ColorSpaces.Srgb;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(doubleFunction.invoke(d) - rgb.oetfOrig.invoke(d)) <= 0.001d && Math.abs(doubleFunction2.invoke(d) - rgb.eotfOrig.invoke(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.isSrgb = z;
        }
        z = r44;
        this.isSrgb = z;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = rgb.transferParameters;
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            return Intrinsics.areEqual(transferParameters2, transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int i) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int i) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.min;
        int floatToIntBits = (hashCode + (f == RecyclerView.DECELERATION_RATE ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.max;
        int floatToIntBits2 = (floatToIntBits + (f2 == RecyclerView.DECELERATION_RATE ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int hashCode2 = floatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (transferParameters != null) {
            return hashCode2;
        }
        return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float f, float f2, float f3) {
        double d = f;
        Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda1 = this.eotfFunc;
        float invoke = (float) rgb$$ExternalSyntheticLambda1.invoke(d);
        float invoke2 = (float) rgb$$ExternalSyntheticLambda1.invoke(f2);
        float invoke3 = (float) rgb$$ExternalSyntheticLambda1.invoke(f3);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke);
        float f5 = (fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke);
        return (Float.floatToRawIntBits(f4) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(f5));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float f, float f2, float f3) {
        double d = f;
        Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda1 = this.eotfFunc;
        float invoke = (float) rgb$$ExternalSyntheticLambda1.invoke(d);
        float invoke2 = (float) rgb$$ExternalSyntheticLambda1.invoke(f2);
        float invoke3 = (float) rgb$$ExternalSyntheticLambda1.invoke(f3);
        float[] fArr = this.transform;
        return (fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo716xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda1 = this.oetfFunc;
        return ColorKt.Color((float) rgb$$ExternalSyntheticLambda1.invoke(f5), (float) rgb$$ExternalSyntheticLambda1.invoke(f6), (float) rgb$$ExternalSyntheticLambda1.invoke(f7), f4, colorSpace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, r4, r0, RecyclerView.DECELERATION_RATE, 1.0f, transferParameters, i);
        double d;
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        double d2 = transferParameters.gamma;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = transferParameters.f;
        double d4 = transferParameters.e;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    int i5 = i4;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                        case 1:
                            float[] fArr3 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                        case 2:
                            double d6 = transferParameters2.a;
                            return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                        case 3:
                            double d7 = transferParameters2.a;
                            double d8 = transferParameters2.b;
                            double d9 = transferParameters2.c;
                            return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                        case 4:
                            float[] fArr4 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                        case 5:
                            float[] fArr5 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                        case 6:
                            double d10 = transferParameters2.a;
                            double d11 = transferParameters2.b;
                            double d12 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = transferParameters2.a;
                            double d14 = transferParameters2.b;
                            double d15 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d5) {
                        int i52 = i5;
                        TransferParameters transferParameters2 = transferParameters;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                            case 1:
                                float[] fArr3 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                            case 2:
                                double d6 = transferParameters2.a;
                                return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                            case 3:
                                double d7 = transferParameters2.a;
                                double d8 = transferParameters2.b;
                                double d9 = transferParameters2.c;
                                return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                            case 4:
                                float[] fArr4 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                            case 5:
                                float[] fArr5 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                            case 6:
                                double d10 = transferParameters2.a;
                                double d11 = transferParameters2.b;
                                double d12 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = transferParameters2.a;
                                double d14 = transferParameters2.b;
                                double d15 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d5) {
                        int i52 = i6;
                        TransferParameters transferParameters2 = transferParameters;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                            case 1:
                                float[] fArr3 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                            case 2:
                                double d6 = transferParameters2.a;
                                return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                            case 3:
                                double d7 = transferParameters2.a;
                                double d8 = transferParameters2.b;
                                double d9 = transferParameters2.c;
                                return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                            case 4:
                                float[] fArr4 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                            case 5:
                                float[] fArr5 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                            case 6:
                                double d10 = transferParameters2.a;
                                double d11 = transferParameters2.b;
                                double d12 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = transferParameters2.a;
                                double d14 = transferParameters2.b;
                                double d15 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d5) {
                        int i52 = i7;
                        TransferParameters transferParameters2 = transferParameters;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                            case 1:
                                float[] fArr3 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                            case 2:
                                double d6 = transferParameters2.a;
                                return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                            case 3:
                                double d7 = transferParameters2.a;
                                double d8 = transferParameters2.b;
                                double d9 = transferParameters2.c;
                                return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                            case 4:
                                float[] fArr4 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                            case 5:
                                float[] fArr5 = ColorSpaces.SrgbPrimaries;
                                return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                            case 6:
                                double d10 = transferParameters2.a;
                                double d11 = transferParameters2.b;
                                double d12 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = transferParameters2.a;
                                double d14 = transferParameters2.b;
                                double d15 = transferParameters2.c;
                                return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    int i52 = i2;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                        case 1:
                            float[] fArr3 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                        case 2:
                            double d6 = transferParameters2.a;
                            return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                        case 3:
                            double d7 = transferParameters2.a;
                            double d8 = transferParameters2.b;
                            double d9 = transferParameters2.c;
                            return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                        case 4:
                            float[] fArr4 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                        case 5:
                            float[] fArr5 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                        case 6:
                            double d10 = transferParameters2.a;
                            double d11 = transferParameters2.b;
                            double d12 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = transferParameters2.a;
                            double d14 = transferParameters2.b;
                            double d15 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    int i52 = i3;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                        case 1:
                            float[] fArr3 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                        case 2:
                            double d6 = transferParameters2.a;
                            return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                        case 3:
                            double d7 = transferParameters2.a;
                            double d8 = transferParameters2.b;
                            double d9 = transferParameters2.c;
                            return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                        case 4:
                            float[] fArr4 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                        case 5:
                            float[] fArr5 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                        case 6:
                            double d10 = transferParameters2.a;
                            double d11 = transferParameters2.b;
                            double d12 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = transferParameters2.a;
                            double d14 = transferParameters2.b;
                            double d15 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    int i52 = i8;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                        case 1:
                            float[] fArr3 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                        case 2:
                            double d6 = transferParameters2.a;
                            return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                        case 3:
                            double d7 = transferParameters2.a;
                            double d8 = transferParameters2.b;
                            double d9 = transferParameters2.c;
                            return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                        case 4:
                            float[] fArr4 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                        case 5:
                            float[] fArr5 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                        case 6:
                            double d10 = transferParameters2.a;
                            double d11 = transferParameters2.b;
                            double d12 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = transferParameters2.a;
                            double d14 = transferParameters2.b;
                            double d15 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    int i52 = i9;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgEotf$ui_graphics(transferParameters2, d5);
                        case 1:
                            float[] fArr3 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Eotf$ui_graphics(transferParameters2, d5);
                        case 2:
                            double d6 = transferParameters2.a;
                            return d5 >= transferParameters2.d ? Math.pow((d6 * d5) + transferParameters2.b, transferParameters2.gamma) : transferParameters2.c * d5;
                        case 3:
                            double d7 = transferParameters2.a;
                            double d8 = transferParameters2.b;
                            double d9 = transferParameters2.c;
                            return d5 >= transferParameters2.d ? Math.pow((d7 * d5) + d8, transferParameters2.gamma) + transferParameters2.e : (d9 * d5) + transferParameters2.f;
                        case 4:
                            float[] fArr4 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferHlgOetf$ui_graphics(transferParameters2, d5);
                        case 5:
                            float[] fArr5 = ColorSpaces.SrgbPrimaries;
                            return ColorSpaces.transferSt2048Oetf$ui_graphics(transferParameters2, d5);
                        case 6:
                            double d10 = transferParameters2.a;
                            double d11 = transferParameters2.b;
                            double d12 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d12 ? (Math.pow(d5, 1.0d / transferParameters2.gamma) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = transferParameters2.a;
                            double d14 = transferParameters2.b;
                            double d15 = transferParameters2.c;
                            return d5 >= transferParameters2.d * d15 ? (Math.pow(d5 - transferParameters2.e, 1.0d / transferParameters2.gamma) - d14) / d13 : (d5 - transferParameters2.f) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        this(str, fArr, whitePoint, null, r11, r12, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2 = DoubleIdentity;
        if (d == 1.0d) {
            doubleFunction = doubleFunction2;
        } else {
            final int i2 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction2;
    }
}
