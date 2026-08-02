package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class pk0 {
    public static final b9r a = weo.Q(0.0f, 0.0f, null, 7);
    public static final b9r b;

    static {
        Object obj = riu.a;
        b = weo.Q(0.0f, 0.0f, new cma(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final sdr a(float f, tm0 tm0Var, String str, hq5 hq5Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            tm0Var = b;
        }
        tm0 tm0Var2 = tm0Var;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new cma(f), azt.c, tm0Var2, null, str, null, hq5Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final sdr b(float f, tm0 tm0Var, String str, Function1 function1, hq5 hq5Var, int i, int i2) {
        tm0 tm0Var2;
        int i3 = i2 & 2;
        b9r b9rVar = a;
        if (i3 != 0) {
            tm0Var = b9rVar;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1 function12 = (i2 & 16) != 0 ? null : function1;
        if (tm0Var == b9rVar) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(1125558999);
            boolean z = (((i & 896) ^ 384) > 256 && oq5Var.c(0.01f)) || (i & 384) == 256;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = weo.Q(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            tm0Var2 = (b9r) K;
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(1125668925);
            oq5Var2.p(false);
            tm0Var2 = tm0Var;
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), azt.a, tm0Var2, Float.valueOf(0.01f), str2, function12, hq5Var, (i & 14) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
    }

    public static final sdr c(Object obj, oct octVar, tm0 tm0Var, Float f, String str, Function1 function1, hq5 hq5Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        Object obj2 = gq5.a;
        if (K == obj2) {
            K = szf.g0(null);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Object K2 = oq5Var.K();
        if (K2 == obj2) {
            K2 = new fk0(obj, octVar, f);
            oq5Var.k0(K2);
        }
        fk0 fk0Var = (fk0) K2;
        Object o0 = szf.o0(function1, oq5Var);
        if (f != null && (tm0Var instanceof b9r)) {
            b9r b9rVar = (b9r) tm0Var;
            if (!Intrinsics.d(b9rVar.c, f)) {
                tm0Var = new b9r(b9rVar.a, b9rVar.b, f);
            }
        }
        Object o02 = szf.o0(tm0Var, oq5Var);
        Object K3 = oq5Var.K();
        if (K3 == obj2) {
            K3 = men.g(-1, 6, null);
            oq5Var.k0(K3);
        }
        Object obj3 = (lc4) K3;
        boolean h = oq5Var.h(obj3) | ((((i & 14) ^ 6) > 4 && oq5Var.h(obj)) || (i & 6) == 4);
        Object K4 = oq5Var.K();
        if (h || K4 == obj2) {
            K4 = new ha0(6, obj3, obj);
            oq5Var.k0(K4);
        }
        gld.D((Function0) K4, oq5Var);
        boolean h2 = oq5Var.h(obj3) | oq5Var.h(fk0Var) | oq5Var.f(o02) | oq5Var.f(o0);
        Object K5 = oq5Var.K();
        if (h2 || K5 == obj2) {
            Object xgVar = new xg(obj3, fk0Var, o02, o0, (Continuation) null, 1);
            oq5Var.k0(xgVar);
            K5 = xgVar;
        }
        gld.w(oq5Var, obj3, (Function2) K5);
        sdr sdrVar = (sdr) aqiVar.getValue();
        return sdrVar == null ? fk0Var.c : sdrVar;
    }
}
