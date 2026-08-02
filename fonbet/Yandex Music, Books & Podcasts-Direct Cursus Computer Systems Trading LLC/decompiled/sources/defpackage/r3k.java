package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class r3k {
    public static final float a = 56;
    public static final y2k b = new y2k(c5b.a, 0, 0, 0, bxj.b, 0, 0, 0, wvo.h, new usf(2), gld.e(g.a));
    public static final p3k c = new p3k(0);

    public static final long a(y2k y2kVar, int i) {
        int i2 = y2kVar.c;
        int i3 = y2kVar.b;
        long j = i * (i2 + i3);
        int i4 = -y2kVar.f;
        long j2 = ((j + i4) + y2kVar.d) - i2;
        int g = (int) (y2kVar.e == bxj.b ? y2kVar.g() >> 32 : y2kVar.g() & 4294967295L);
        long d = j2 - (g - yhn.d(y2kVar.n.a(g, i3, i4, r2), 0, g));
        if (d < 0) {
            return 0L;
        }
        return d;
    }

    public static final fp7 b(int i, Function0 function0, hq5 hq5Var, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        apo apoVar = fp7.K;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && ((oq5) hq5Var).d(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((oq5) hq5Var).c(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !((oq5) hq5Var).f(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z3 || K == gq5.a) {
            K = new q3k(i, 0.0f, function0);
            oq5Var.k0(K);
        }
        fp7 fp7Var = (fp7) o2g.g0(objArr, apoVar, (Function0) K, oq5Var, 0, 4);
        fp7Var.J.setValue(function0);
        return fp7Var;
    }
}
