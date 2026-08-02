package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final class q941 implements ehr0 {
    public final float a;
    public final float b;
    public final float c;

    public q941(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ehr0
    public final ix80 a(long j, LayoutDirection layoutDirection, fwi fwiVar) {
        float f = (this.b * 0.92f) + 0.08f;
        float max = Math.max(0.0f, f <= 0.7f ? f : ((1.0f - f) / 0.3f) * 0.7f) * this.c;
        float w0 = fwiVar.w0(0.0f);
        float w02 = fwiVar.w0(32.0f);
        int i = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f2 = w0 * 0.5f;
        float f3 = this.a;
        float f4 = f3 - f2;
        float f5 = f3 + f2;
        float max2 = Math.max(w02, (Float.intBitsToFloat(i) - w0) * 0.5f * f * 1.8f);
        float f6 = f4 - max2;
        float max3 = Math.max(f6, 0.0f);
        float f7 = max2 > 0.0f ? (max3 - f6) / max2 : 0.0f;
        float f8 = f5 + max2;
        float min = Math.min(f8, intBitsToFloat);
        float f9 = max2 > 0.0f ? (f8 - min) / max2 : 0.0f;
        int i2 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        float f10 = max > intBitsToFloat2 ? intBitsToFloat2 : max;
        jb2 a = nb2.a();
        a.m(0.0f, f4);
        float f11 = (f4 + max3) * 0.5f;
        float f12 = 1.0f - f7;
        a.h(0.0f, f11, (f7 * 0.0f) + (f10 * f12), (f7 * max3) + (f12 * f11), f10, max3);
        float f13 = f10;
        a.l(f13, 0.0f);
        a.l(Float.intBitsToFloat(i2), 0.0f);
        a.l(Float.intBitsToFloat(i2), intBitsToFloat);
        a.l(f13, intBitsToFloat);
        a.l(f13, min);
        float f14 = 1.0f - f9;
        float f15 = (f5 + min) * 0.5f;
        a.h((f9 * 0.0f) + (f13 * f14), (min * f9) + (f14 * f15), 0.0f, f15, 0.0f, f5);
        a.g();
        return new fx80(a);
    }
}
