package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uk7 implements pwg {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;
    public final long f;
    public long g;

    public uk7(Looper looper, long j) {
        this.a = 2;
        this.c = new ArrayList();
        this.e = new y5h(this);
        this.b = looper;
        this.f = j;
    }

    @Override // defpackage.pwg
    public void a(h5n h5nVar) {
        if (h5nVar != null && ((ArrayList) this.c).size() > 0) {
            h5nVar.c((ArrayList) this.c);
            this.c = new ArrayList();
        }
        this.d = h5nVar;
    }

    public uk7 b(long j, a0o a0oVar) {
        long p;
        long p2;
        o97 b = ((a0o) this.c).b();
        o97 b2 = a0oVar.b();
        if (b == null) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b, 0);
        }
        if (!b.G()) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b2, 0);
        }
        long z = b.z(j);
        if (z == 0) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b2, 0);
        }
        vq1.B(b2);
        long H = b.H();
        long c = b.c(H);
        long j2 = z + H;
        long j3 = j2 - 1;
        long f = b.f(j3, j) + b.c(j3);
        long H2 = b2.H();
        long c2 = b2.c(H2);
        long j4 = this.g;
        if (f == c2) {
            p = j2 - H2;
        } else {
            if (f < c2) {
                throw new yy2();
            }
            if (c2 < c) {
                p2 = j4 - (b2.p(c, j) - H);
                return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, p2, b2, 0);
            }
            p = b.p(c2, j) - H2;
        }
        p2 = p + j4;
        return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, p2, b2, 0);
    }

    public uk7 c(long j, a0o a0oVar) {
        long p;
        long p2;
        o97 b = ((a0o) this.c).b();
        o97 b2 = a0oVar.b();
        if (b == null) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b, 1);
        }
        if (!b.G()) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b2, 1);
        }
        long z = b.z(j);
        if (z == 0) {
            return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, this.g, b2, 1);
        }
        vq1.B(b2);
        long H = b.H();
        long c = b.c(H);
        long j2 = z + H;
        long j3 = j2 - 1;
        long f = b.f(j3, j) + b.c(j3);
        long H2 = b2.H();
        long c2 = b2.c(H2);
        long j4 = this.g;
        if (f == c2) {
            p = j2 - H2;
        } else {
            if (f < c2) {
                throw new yy2();
            }
            if (c2 < c) {
                p2 = j4 - (b2.p(c, j) - H);
                return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, p2, b2, 1);
            }
            p = b.p(c2, j) - H2;
        }
        p2 = p + j4;
        return new uk7(j, a0oVar, (mu2) this.d, (xk3) this.b, p2, b2, 1);
    }

    public long d(long j) {
        long i;
        long j2;
        switch (this.a) {
            case 0:
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                i = o97Var.i(this.f, j);
                j2 = this.g;
                break;
            default:
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                i = o97Var2.i(this.f, j);
                j2 = this.g;
                break;
        }
        return i + j2;
    }

    public long e(long j) {
        long d;
        long J;
        switch (this.a) {
            case 0:
                d = d(j);
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                J = o97Var.J(this.f, j);
                break;
            default:
                d = d(j);
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                J = o97Var2.J(this.f, j);
                break;
        }
        return (J + d) - 1;
    }

    public long f() {
        switch (this.a) {
            case 0:
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                return o97Var.z(this.f);
            default:
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                return o97Var2.z(this.f);
        }
    }

    public long g(long j) {
        long h;
        long f;
        switch (this.a) {
            case 0:
                h = h(j);
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                f = o97Var.f(j - this.g, this.f);
                break;
            default:
                h = h(j);
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                f = o97Var2.f(j - this.g, this.f);
                break;
        }
        return f + h;
    }

    public long h(long j) {
        switch (this.a) {
            case 0:
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                return o97Var.c(j - this.g);
            default:
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                return o97Var2.c(j - this.g);
        }
    }

    public boolean i(long j, long j2) {
        switch (this.a) {
            case 0:
                o97 o97Var = (o97) this.e;
                vq1.B(o97Var);
                if (!o97Var.G() && j2 != -9223372036854775807L && g(j) > j2) {
                }
                break;
            default:
                o97 o97Var2 = (o97) this.e;
                vq1.B(o97Var2);
                if (!o97Var2.G() && j2 != -9223372036854775807L && g(j) > j2) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.pwg
    public void start() {
        this.c = new ArrayList();
        ((Looper) this.b).setMessageLogging((y5h) this.e);
    }

    @Override // defpackage.pwg
    public void stop() {
        ((Looper) this.b).setMessageLogging(null);
    }

    public /* synthetic */ uk7(long j, a0o a0oVar, mu2 mu2Var, xk3 xk3Var, long j2, o97 o97Var, int i) {
        this.a = i;
        this.f = j;
        this.c = a0oVar;
        this.d = mu2Var;
        this.g = j2;
        this.b = xk3Var;
        this.e = o97Var;
    }
}
