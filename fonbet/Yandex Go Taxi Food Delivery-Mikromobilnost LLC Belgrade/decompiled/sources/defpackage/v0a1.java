package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public abstract class v0a1 {
    public static final void a(s5n s5nVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1679160216);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s5nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 m = an91.m(m4m0.b(an91.m(ljs0.g(ljs0.c(f530Var, 1.0f), 24.0f, 0.0f, 2), 8.0f, 0.0f, 2), ((el51) btsVar.m(gl51.a)).d(), cyk0.c(6.0f)), 8.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 a = cj6.a.a(c530.a, x4c.x);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new urm(15);
                btsVar.o0(Q);
            }
            aib1.b(fnq0.b(a, false, (tls) Q), s5nVar.c, btsVar, 0, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(s5nVar, f530Var, i, 17);
        }
    }

    public static lae0 b(zii0 zii0Var, zii0 zii0Var2, long j, PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection, fwi fwiVar) {
        float f = zii0Var2.b;
        float w0 = fwiVar.w0(8.0f);
        float w02 = fwiVar.w0(7.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (zii0Var.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (zii0Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float f2 = zii0Var.b;
        float f3 = zii0Var.d;
        float f4 = zii0Var.a;
        float f5 = zii0Var.c;
        float f6 = zii0Var2.a + w0;
        float f7 = zii0Var2.c - w0;
        float f8 = (int) (j >> 32);
        float f9 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = t9e0.a[popupModel$TextHintPopup$ArrowDirection.ordinal()];
        if (i == 1) {
            float f10 = intBitsToFloat - (f8 / 2.0f);
            float f11 = f7 - f8;
            if (f11 < f6) {
                f11 = f6;
            }
            return new lae0((m810.b(r0) << 32) | (m810.b(f3 + w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), Float.valueOf(c(intBitsToFloat - y6i0.c(f10, f6, f11), f8, fwiVar)));
        }
        if (i == 2) {
            float f12 = intBitsToFloat - (f8 / 2.0f);
            float f13 = f7 - f8;
            if (f13 < f6) {
                f13 = f6;
            }
            return new lae0((m810.b(r0) << 32) | (m810.b((f2 - f9) - w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), Float.valueOf(c(intBitsToFloat - y6i0.c(f12, f6, f13), f8, fwiVar)));
        }
        if (i == 3) {
            float f14 = f5 + w02;
            float f15 = intBitsToFloat2 - (f9 / 2.0f);
            float f16 = f + w0;
            if (f15 < f16) {
                f15 = f16;
            }
            return new lae0((m810.b(f14) << 32) | (m810.b(f15) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null);
        }
        if (i != 4) {
            w511.b();
            return null;
        }
        float f17 = (f4 - f8) - w02;
        float f18 = intBitsToFloat2 - (f9 / 2.0f);
        float f19 = f + w0;
        if (f18 < f19) {
            f18 = f19;
        }
        return new lae0((m810.b(f17) << 32) | (m810.b(f18) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null);
    }

    public static float c(float f, float f2, fwi fwiVar) {
        float w0 = fwiVar.w0(8.0f);
        float w02 = fwiVar.w0(24.0f) / 2.0f;
        float f3 = w0 + w02;
        float f4 = (f2 - w0) - w02;
        return f3 > f4 ? f2 / 2.0f : y6i0.c(f, f3, f4);
    }

    public static mv51 d() {
        return mv51.f;
    }

    public static final f530 e(f530 f530Var, tls tlsVar) {
        return f530Var.k(new s5t0(tlsVar));
    }
}
