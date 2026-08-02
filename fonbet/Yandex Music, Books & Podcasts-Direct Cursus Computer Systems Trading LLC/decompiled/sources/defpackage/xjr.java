package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xjr extends bkp implements b5f {
    public final bz2 h;
    public final x3f i;
    public final j6w j;
    public final b5f[] k;
    public final uhp l;
    public final j4f m;
    public boolean n;
    public String o;
    public String p;

    public xjr(bz2 bz2Var, x3f x3fVar, j6w j6wVar, b5f[] b5fVarArr) {
        bz2Var.getClass();
        this.h = bz2Var;
        this.i = x3fVar;
        this.j = j6wVar;
        this.k = b5fVarArr;
        this.l = x3fVar.b;
        this.m = x3fVar.a;
        int ordinal = j6wVar.ordinal();
        if (b5fVarArr != null) {
            b5f b5fVar = b5fVarArr[ordinal];
            if (b5fVar == null && b5fVar == this) {
                return;
            }
            b5fVarArr[ordinal] = this;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void C(int i) {
        if (this.n) {
            E(String.valueOf(i));
        } else {
            this.h.C(i);
        }
    }

    @Override // defpackage.b5f
    public final void D(w4f w4fVar) {
        w4fVar.getClass();
        if (this.o == null || (w4fVar instanceof q5f)) {
            v(z4f.a, w4fVar);
        } else {
            wxf.L(w4fVar, this.p);
            throw null;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void E(String str) {
        str.getClass();
        this.h.G(str);
    }

    @Override // defpackage.l6b
    public final uhp a() {
        return this.l;
    }

    @Override // defpackage.bkp, defpackage.wq5
    public final void b(mhp mhpVar) {
        mhpVar.getClass();
        bz2 bz2Var = this.h;
        bz2Var.getClass();
        bz2Var.b = false;
        bz2Var.B(this.j.b);
    }

    @Override // defpackage.bkp
    public final void b0(mhp mhpVar, int i) {
        mhpVar.getClass();
        int ordinal = this.j.ordinal();
        bz2 bz2Var = this.h;
        boolean z = true;
        if (ordinal == 1) {
            if (!bz2Var.b) {
                bz2Var.B(',');
            }
            bz2Var.y();
            return;
        }
        if (ordinal == 2) {
            if (bz2Var.b) {
                this.n = true;
                bz2Var.y();
                return;
            }
            if (i % 2 == 0) {
                bz2Var.B(',');
                bz2Var.y();
            } else {
                bz2Var.B(':');
                bz2Var.I();
                z = false;
            }
            this.n = z;
            return;
        }
        if (ordinal != 3) {
            if (!bz2Var.b) {
                bz2Var.B(',');
            }
            bz2Var.y();
            c3x.O(this.i, mhpVar);
            E(mhpVar.f(i));
            bz2Var.B(':');
            bz2Var.I();
            return;
        }
        if (i == 0) {
            this.n = true;
        }
        if (i == 1) {
            bz2Var.B(',');
            bz2Var.I();
            this.n = false;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final wq5 c(mhp mhpVar) {
        b5f b5fVar;
        mhpVar.getClass();
        x3f x3fVar = this.i;
        j6w t0 = szf.t0(x3fVar, mhpVar);
        char c = t0.a;
        bz2 bz2Var = this.h;
        bz2Var.B(c);
        bz2Var.b = true;
        String str = this.o;
        if (str != null) {
            String str2 = this.p;
            if (str2 == null) {
                str2 = mhpVar.i();
            }
            bz2Var.y();
            bz2Var.G(str);
            bz2Var.B(':');
            E(str2);
            this.o = null;
            this.p = null;
        }
        if (this.j == t0) {
            return this;
        }
        b5f[] b5fVarArr = this.k;
        return (b5fVarArr == null || (b5fVar = b5fVarArr[t0.ordinal()]) == null) ? new xjr(bz2Var, x3fVar, t0, b5fVarArr) : b5fVar;
    }

    @Override // defpackage.b5f
    public final x3f d() {
        return this.i;
    }

    @Override // defpackage.bkp, defpackage.wq5
    public final boolean e(mhp mhpVar) {
        mhpVar.getClass();
        return this.m.a;
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void f(double d) {
        boolean z = this.n;
        bz2 bz2Var = this.h;
        if (z) {
            E(String.valueOf(d));
        } else {
            ((que) bz2Var.c).z(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw ghh.g(Double.valueOf(d), ((que) bz2Var.c).toString());
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void h(byte b) {
        if (this.n) {
            E(String.valueOf((int) b));
        } else {
            this.h.A(b);
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final l6b i(mhp mhpVar) {
        mhpVar.getClass();
        boolean a = yjr.a(mhpVar);
        j6w j6wVar = this.j;
        x3f x3fVar = this.i;
        bz2 bz2Var = this.h;
        if (a) {
            if (!(bz2Var instanceof kq5)) {
                bz2Var = new kq5((que) bz2Var.c, this.n);
            }
            return new xjr(bz2Var, x3fVar, j6wVar, null);
        }
        if (mhpVar.isInline() && mhpVar.equals(x4f.a)) {
            if (!(bz2Var instanceof jq5)) {
                bz2Var = new jq5((que) bz2Var.c, this.n);
            }
            return new xjr(bz2Var, x3fVar, j6wVar, null);
        }
        if (this.o != null) {
            this.p = mhpVar.i();
        }
        return this;
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void n(mhp mhpVar, int i) {
        mhpVar.getClass();
        E(mhpVar.f(i));
    }

    @Override // defpackage.bkp, defpackage.wq5
    public final void q(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        if (obj != null || this.m.e) {
            super.q(mhpVar, i, t9fVar, obj);
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void r(long j) {
        if (this.n) {
            E(String.valueOf(j));
        } else {
            this.h.D(j);
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void u() {
        bz2 bz2Var = this.h;
        bz2Var.getClass();
        ((que) bz2Var.c).z("null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, defpackage.emr.e) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 != defpackage.em4.a) goto L20;
     */
    @Override // defpackage.bkp, defpackage.l6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(t9f t9fVar, Object obj) {
        String p;
        t9fVar.getClass();
        x3f x3fVar = this.i;
        boolean z = t9fVar instanceof p8;
        em4 em4Var = x3fVar.a.k;
        if (!z) {
            int ordinal = em4Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    ivf a = t9fVar.getDescriptor().a();
                    if (!Intrinsics.d(a, emr.b)) {
                    }
                    p = wxf.p(x3fVar, t9fVar.getDescriptor());
                } else if (ordinal != 2) {
                    b6e.s();
                    return;
                }
            }
            p = null;
        }
        if (z) {
            p8 p8Var = (p8) t9fVar;
            if (obj == null) {
                tiu.g(p8Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            t9f D = hyf.D(p8Var, this, obj);
            if (p != null) {
                wxf.j(t9fVar, D, p);
                wxf.o(D.getDescriptor().a());
            }
            t9fVar = D;
        }
        if (p != null) {
            String i = t9fVar.getDescriptor().i();
            this.o = p;
            this.p = i;
        }
        t9fVar.serialize(this, obj);
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void w(short s) {
        if (this.n) {
            E(String.valueOf((int) s));
        } else {
            this.h.F(s);
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void x(boolean z) {
        if (this.n) {
            E(String.valueOf(z));
        } else {
            ((que) this.h.c).z(String.valueOf(z));
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void y(float f) {
        boolean z = this.n;
        bz2 bz2Var = this.h;
        if (z) {
            E(String.valueOf(f));
        } else {
            ((que) bz2Var.c).z(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw ghh.g(Float.valueOf(f), ((que) bz2Var.c).toString());
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public final void z(char c) {
        E(String.valueOf(c));
    }
}
