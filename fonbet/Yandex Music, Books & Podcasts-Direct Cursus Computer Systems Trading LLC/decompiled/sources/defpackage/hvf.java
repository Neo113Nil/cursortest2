package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class hvf {
    public static final bvf a = new bvf(null, 0, false, 0.0f, new usf(1), 0.0f, false, gld.e(g.a), zsd.l(), ia6.b(0, 0, 15), c5b.a, 0, 0, 0, false, bxj.a, 0, 0);

    public static final fvf a(int i, int i2, hq5 hq5Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        apo apoVar = fvf.w;
        boolean d = ((oq5) hq5Var).d(i2) | ((((i3 & 14) ^ 6) > 4 && ((oq5) hq5Var).d(i)) || (i3 & 6) == 4);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (d || K == gq5.a) {
            K = new gvf(i, i2);
            oq5Var.k0(K);
        }
        return (fvf) o2g.g0(objArr, apoVar, (Function0) K, oq5Var, 0, 4);
    }
}
