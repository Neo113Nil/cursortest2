package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class y0q {
    public static final js3 a = new js3("NO_VALUE", 2);

    public static final x0q a(int i, int i2, oi3 oi3Var) {
        if (i < 0) {
            xq0.o(k5r.i(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            xq0.o(k5r.i(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && oi3Var != oi3.a) {
            l1j.p(oi3Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new x0q(i, i3, oi3Var);
    }

    public static /* synthetic */ x0q b(int i, int i2, oi3 oi3Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            oi3Var = oi3.a;
        }
        return a(i, i2, oi3Var);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final pjc d(u0q u0qVar, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return ((i == 0 || i == -3) && oi3Var == oi3.a) ? u0qVar : new vc4(u0qVar, coroutineContext, i, oi3Var);
    }
}
