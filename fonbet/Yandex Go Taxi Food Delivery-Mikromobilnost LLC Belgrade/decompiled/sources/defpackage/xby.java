package defpackage;

/* loaded from: classes.dex */
public abstract class xby extends he00 {
    public static final vby d = new vby(he00.c);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xby(he00 he00Var, tls tlsVar) {
        super(r0, he00Var.b);
        wy40 wy40Var = he00Var.a.a;
        wy40 wy40Var2 = new wy40(wy40Var.b);
        wy40Var2.a(wy40Var);
        fe00 fe00Var = new fe00(wy40Var2);
        tlsVar.invoke(fe00Var);
    }

    public static /* synthetic */ void l(xby xbyVar, String str, String str2, Throwable th, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        xbyVar.g(str, str2, str3, th);
    }

    public static void t(xby xbyVar, String str, Throwable th, String str2, int i) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        xbyVar.m(str).h(null, str2, th);
    }

    public static void y(xby xbyVar, String str, String str2, Throwable th, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        xbyVar.m(str).a(20, str2, th, str3);
    }

    public xby b(tls tlsVar) {
        return new wby(this, tlsVar);
    }

    public final void c(String str) {
        a(15, null, null, str);
    }

    public final void d(String str, String str2) {
        a(15, str, null, str2);
    }

    public final void e(String str, String str2, IllegalStateException illegalStateException) {
        m(str).i(str2, illegalStateException);
    }

    public final void f(String str, String str2, String str3) {
        m(str).d(str2, str3);
    }

    public final void g(String str, String str2, String str3, Throwable th) {
        m(str).h(str2, str3, th);
    }

    public final void h(String str, String str2, Throwable th) {
        a(15, str, th, str2);
    }

    public final void i(String str, Throwable th) {
        a(15, str, th, null);
    }

    public final void j(Throwable th) {
        a(15, null, th, null);
    }

    public final void k(Throwable th, String str) {
        a(15, null, th, str);
    }

    public xby m(String str) {
        return b(new vsq(str, 17));
    }

    public final void n(String str) {
        a(10, null, null, str);
    }

    public final void o(String str, String str2) {
        a(10, str, null, str2);
    }

    public final void p(String str, Throwable th) {
        a(10, null, th, str);
    }

    public final void q(String str) {
        a(15, null, null, str);
    }

    public final void r(String str, Throwable th) {
        a(15, null, th, str);
    }

    public final void s(Throwable th) {
        a(15, null, th, null);
    }

    public final void u(String str) {
        a(20, null, null, str);
    }

    public final void v(String str, Throwable th) {
        a(20, str, th, null);
    }

    public final void w(Throwable th) {
        a(20, null, th, null);
    }

    public final void x(Throwable th, String str) {
        a(20, null, th, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xby(he00 he00Var) {
        super(new fe00(r1), he00Var.b);
        wy40 wy40Var = he00Var.a.a;
        wy40 wy40Var2 = new wy40(wy40Var.b);
        wy40Var2.a(wy40Var);
    }
}
