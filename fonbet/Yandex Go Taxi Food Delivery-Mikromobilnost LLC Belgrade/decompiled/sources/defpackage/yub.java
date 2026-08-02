package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class yub implements ehr0 {
    public static final yub b = new yub(0);
    public static final yub c = new yub(1);
    public static final yub d = new yub(2);
    public final /* synthetic */ int a;

    public /* synthetic */ yub(int i) {
        this.a = i;
    }

    @Override // defpackage.ehr0
    public final ix80 a(long j, LayoutDirection layoutDirection, fwi fwiVar) {
        switch (this.a) {
            case 0:
                float c2 = cjs0.c(j) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(c2) << 32) | (Float.floatToRawIntBits(c2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                return new hx80(ora1.b(wwg.b(0L, j), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits));
            case 1:
                float f0 = fwiVar.f0(30.0f);
                return new gx80(new zii0(0.0f, -f0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + f0));
            case 2:
                float f02 = fwiVar.f0(30.0f);
                return new gx80(new zii0(-f02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + f02, Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
            default:
                float w0 = fwiVar.w0(8.0f);
                float w02 = fwiVar.w0(12.0f);
                float w03 = fwiVar.w0(6.0f);
                jb2 a = nb2.a();
                int i = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
                float intBitsToFloat = Float.intBitsToFloat(i) - w03;
                Path path = a.a;
                a.m(0.0f, w0);
                float f = 2.0f * w0;
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(0.0f, 0.0f, f, f);
                path.arcTo(a.b, 180.0f, 90.0f, false);
                int i2 = (int) (j >> 32);
                a.l(Float.intBitsToFloat(i2) - w0, 0.0f);
                float intBitsToFloat2 = Float.intBitsToFloat(i2) - f;
                float intBitsToFloat3 = Float.intBitsToFloat(i2);
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(intBitsToFloat2, 0.0f, intBitsToFloat3, f);
                path.arcTo(a.b, 270.0f, 90.0f, false);
                a.l(Float.intBitsToFloat(i2), intBitsToFloat - w0);
                float intBitsToFloat4 = Float.intBitsToFloat(i2) - f;
                float f2 = intBitsToFloat - f;
                float intBitsToFloat5 = Float.intBitsToFloat(i2);
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(intBitsToFloat4, f2, intBitsToFloat5, intBitsToFloat);
                path.arcTo(a.b, 0.0f, 90.0f, false);
                float f3 = w02 / 2.0f;
                a.l((Float.intBitsToFloat(i2) / 2.0f) + f3, intBitsToFloat);
                a.l(Float.intBitsToFloat(i2) / 2.0f, Float.intBitsToFloat(i));
                a.l((Float.intBitsToFloat(i2) / 2.0f) - f3, intBitsToFloat);
                a.l(w0, intBitsToFloat);
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(0.0f, f2, f, intBitsToFloat);
                path.arcTo(a.b, 90.0f, 90.0f, false);
                a.g();
                return new fx80(a);
        }
    }
}
