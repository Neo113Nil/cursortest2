package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.node.s;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class zjo extends e530 implements ejt {
    public tls a;
    public Rect b;

    public final void E0(Rect rect) {
        wz40 wz40Var = new wz40(new Rect[16]);
        wz40Var.d(wz40Var.c, tje.V(this).getSystemGestureExclusionRects());
        Rect rect2 = this.b;
        if (rect2 != null) {
            wz40Var.j(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            wz40Var.b(rect);
        }
        tje.V(this).setSystemGestureExclusionRects(wz40Var.f());
        this.b = rect;
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        Rect rect;
        tls tlsVar = this.a;
        if (tlsVar == null) {
            zii0 j = gwk0.o(sVar).j(sVar, true);
            rect = new Rect(m810.b(j.a), m810.b(j.b), m810.b(j.c), m810.b(j.d));
        } else {
            zii0 zii0Var = (zii0) tlsVar.invoke(sVar);
            rzx o = gwk0.o(sVar);
            long e = zii0Var.e();
            float f = zii0Var.d;
            float f2 = zii0Var.c;
            long T = o.T(sVar, e);
            long T2 = o.T(sVar, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(zii0Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            long T3 = o.T(sVar, (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(zii0Var.a) << 32));
            long T4 = o.T(sVar, (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32));
            int i = (int) (T >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (T2 >> 32);
            int i3 = (int) (T3 >> 32);
            int i4 = (int) (T4 >> 32);
            float[] fArr = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)};
            for (int i5 = 0; i5 < 3; i5++) {
                intBitsToFloat = Math.min(intBitsToFloat, fArr[i5]);
            }
            int i6 = (int) (T & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float intBitsToFloat2 = Float.intBitsToFloat(i6);
            int i7 = (int) (T2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float intBitsToFloat3 = Float.intBitsToFloat(i7);
            int i8 = (int) (T3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float intBitsToFloat4 = Float.intBitsToFloat(i8);
            int i9 = (int) (T4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float[] fArr2 = {intBitsToFloat3, intBitsToFloat4, Float.intBitsToFloat(i9)};
            for (int i10 = 0; i10 < 3; i10++) {
                intBitsToFloat2 = Math.min(intBitsToFloat2, fArr2[i10]);
            }
            float intBitsToFloat5 = Float.intBitsToFloat(i);
            float[] fArr3 = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)};
            for (int i11 = 0; i11 < 3; i11++) {
                intBitsToFloat5 = Math.max(intBitsToFloat5, fArr3[i11]);
            }
            float intBitsToFloat6 = Float.intBitsToFloat(i6);
            float[] fArr4 = {Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)};
            for (int i12 = 0; i12 < 3; i12++) {
                intBitsToFloat6 = Math.max(intBitsToFloat6, fArr4[i12]);
            }
            rect = new Rect(m810.b(intBitsToFloat), m810.b(intBitsToFloat2), m810.b(intBitsToFloat5), m810.b(intBitsToFloat6));
        }
        E0(rect);
    }

    @Override // defpackage.e530
    public final void onDetach() {
        E0(null);
    }
}
