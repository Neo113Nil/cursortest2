package defpackage;

import android.graphics.LinearGradient;
import androidx.compose.ui.layout.e;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xab1 {
    public static final void a(f530 f530Var, jt1 jt1Var, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(380139498);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(jt1Var) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar.e(zlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i6 & 1, (i6 & 1171) != 1170)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            if (i5 != 0) {
                jt1Var = x4c.b;
            }
            z910 d = pi6.d(jt1Var, false);
            boolean k = btsVar.k(d) | ((i6 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new q0v(23, d, zlsVar);
                btsVar.o0(Q);
            }
            e.a(f530Var, (wls) Q, btsVar, i6 & 14, 0);
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        jt1 jt1Var2 = jt1Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var2, (Object) jt1Var2, (Object) zlsVar, i, i2, 7);
        }
    }

    public static final LinearGradient b(long j, long j2, List list, List list2, int i) {
        qva1.e(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), qva1.b(list), qva1.c(list2, list), bwa1.f(i));
    }

    public static final String c(String str, String str2) {
        String p = unr0.p("handlePromiseResult(\"", str, "\", \"\", ", oyr.p("generateError(\"", str2, "\")"), Extension.C_BRAKE);
        jst.e.getClass();
        return p;
    }
}
