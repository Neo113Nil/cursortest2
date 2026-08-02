package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {
    public static final float[] InverseM1;
    public static final float[] InverseM2;
    public static final float[] M1;
    public static final float[] M2;

    static {
        float[] mul3x3 = Illuminant.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, Illuminant.chromaticAdaptation(Adaptation$Companion$Bradford$1.Bradford.transform, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = Illuminant.inverse3x3(mul3x3);
        InverseM2 = Illuminant.inverse3x3(fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int i) {
        if (i == 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        return -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float f, float f2, float f3) {
        if (f < RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = InverseM2;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = InverseM1;
        return (Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float f, float f2, float f3) {
        if (f < RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = InverseM2;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = InverseM1;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo716xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = M1;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fastCbrt = TransactorKt.fastCbrt(f5);
        float fastCbrt2 = TransactorKt.fastCbrt(f6);
        float fastCbrt3 = TransactorKt.fastCbrt(f7);
        float[] fArr2 = M2;
        return ColorKt.Color((fArr2[6] * fastCbrt3) + (fArr2[3] * fastCbrt2) + (fArr2[0] * fastCbrt), (fArr2[7] * fastCbrt3) + (fArr2[4] * fastCbrt2) + (fArr2[1] * fastCbrt), (fArr2[8] * fastCbrt3) + (fArr2[5] * fastCbrt2) + (fArr2[2] * fastCbrt), f4, colorSpace);
    }
}
