package androidx.compose.foundation.layout;

import defpackage.b2c;
import defpackage.fma;
import defpackage.g40;
import defpackage.gz2;
import defpackage.hz2;
import defpackage.iz2;
import defpackage.k48;
import defpackage.px0;
import defpackage.q2r;
import defpackage.yci;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        k48 k48Var = k48.b;
        a = new FillElement(k48Var, 1.0f);
        k48 k48Var2 = k48.a;
        b = new FillElement(k48Var2, 1.0f);
        k48 k48Var3 = k48.c;
        c = new FillElement(k48Var3, 1.0f);
        gz2 gz2Var = b2c.o;
        d = new WrapContentElement(k48Var, false, new px0(gz2Var, 1), gz2Var);
        gz2 gz2Var2 = b2c.n;
        e = new WrapContentElement(k48Var, false, new px0(gz2Var2, 1), gz2Var2);
        hz2 hz2Var = b2c.l;
        int i2 = 5;
        f = new WrapContentElement(k48Var2, false, new q2r(i2, hz2Var), hz2Var);
        hz2 hz2Var2 = b2c.k;
        g = new WrapContentElement(k48Var2, false, new q2r(i2, hz2Var2), hz2Var2);
        iz2 iz2Var = b2c.f;
        int i3 = 6;
        h = new WrapContentElement(k48Var3, false, new q2r(i3, iz2Var), iz2Var);
        iz2 iz2Var2 = b2c.b;
        i = new WrapContentElement(k48Var3, false, new q2r(i3, iz2Var2), iz2Var2);
    }

    public static final yci a(yci yciVar, float f2, float f3) {
        return yciVar.f(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static final yci b(yci yciVar, float f2) {
        return yciVar.f(f2 == 1.0f ? b : new FillElement(k48.a, f2));
    }

    public static final yci c(yci yciVar, float f2) {
        return yciVar.f(f2 == 1.0f ? c : new FillElement(k48.c, f2));
    }

    public static final yci d(yci yciVar, float f2) {
        return yciVar.f(f2 == 1.0f ? a : new FillElement(k48.b, f2));
    }

    public static final yci e(yci yciVar, float f2) {
        return yciVar.f(new SizeElement(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final yci f(yci yciVar, float f2, float f3) {
        return yciVar.f(new SizeElement(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static /* synthetic */ yci g(yci yciVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(yciVar, f2, f3);
    }

    public static final yci h(yci yciVar, float f2) {
        return yciVar.f(new SizeElement(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final yci i(yci yciVar, float f2) {
        return yciVar.f(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final yci j(yci yciVar, float f2, float f3) {
        return yciVar.f(new SizeElement(f2, f3, f2, f3, false));
    }

    public static yci k(yci yciVar, float f2, float f3, float f4, float f5, int i2) {
        return yciVar.f(new SizeElement(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final yci l(float f2) {
        return new SizeElement(f2, 0.0f, f2, 0.0f, false, 10);
    }

    public static final yci m(yci yciVar, float f2) {
        return yciVar.f(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final yci n(long j, yci yciVar) {
        return o(yciVar, fma.c(j), fma.b(j));
    }

    public static final yci o(yci yciVar, float f2, float f3) {
        return yciVar.f(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final yci p(yci yciVar, float f2, float f3, float f4, float f5) {
        return yciVar.f(new SizeElement(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ yci q(yci yciVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return p(yciVar, f2, f3, f4, f5);
    }

    public static final yci r(yci yciVar, float f2) {
        return yciVar.f(new SizeElement(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final yci s(yci yciVar, float f2, float f3) {
        return yciVar.f(new SizeElement(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static /* synthetic */ yci t(yci yciVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return s(yciVar, f2, f3);
    }

    public static final yci u(yci yciVar, hz2 hz2Var, boolean z) {
        return yciVar.f((!Intrinsics.d(hz2Var, b2c.l) || z) ? (!Intrinsics.d(hz2Var, b2c.k) || z) ? new WrapContentElement(k48.a, z, new q2r(5, hz2Var), hz2Var) : g : f);
    }

    public static final yci w(yci yciVar, g40 g40Var, boolean z) {
        return yciVar.f((!Intrinsics.d(g40Var, b2c.f) || z) ? (!Intrinsics.d(g40Var, b2c.b) || z) ? new WrapContentElement(k48.c, z, new q2r(6, g40Var), g40Var) : i : h);
    }

    public static /* synthetic */ yci x(yci yciVar, iz2 iz2Var, int i2) {
        if ((i2 & 1) != 0) {
            iz2Var = b2c.f;
        }
        return w(yciVar, iz2Var, (i2 & 2) == 0);
    }

    public static final yci y(yci yciVar, gz2 gz2Var, boolean z) {
        return yciVar.f((!Intrinsics.d(gz2Var, b2c.o) || z) ? (!Intrinsics.d(gz2Var, b2c.n) || z) ? new WrapContentElement(k48.b, z, new px0(gz2Var, 1), gz2Var) : e : d);
    }

    public static /* synthetic */ yci z(yci yciVar, int i2) {
        gz2 gz2Var = b2c.n;
        if ((i2 & 1) != 0) {
            gz2Var = b2c.o;
        }
        return y(yciVar, gz2Var, (i2 & 2) == 0);
    }
}
