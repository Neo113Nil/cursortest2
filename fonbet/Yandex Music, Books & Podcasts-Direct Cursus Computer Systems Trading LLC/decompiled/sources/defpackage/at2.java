package defpackage;

/* loaded from: classes.dex */
public abstract class at2 implements ogl {
    public final int b;
    public gxn d;
    public int e;
    public ndl f;
    public dzr g;
    public int h;
    public aoo i;
    public dsc[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public ct7 q;
    public final Object a = new Object();
    public final qdc c = new qdc(1);
    public long m = Long.MIN_VALUE;
    public sis p = sis.a;

    public at2(int i) {
        this.b = i;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return f(i, i2, i3, 0, 128, i4);
    }

    public static int f(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static boolean o(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final int D(qdc qdcVar, qg7 qg7Var, int i) {
        aoo aooVar = this.i;
        aooVar.getClass();
        int q = aooVar.q(qdcVar, qg7Var, i);
        if (q == -4) {
            if (qg7Var.f(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = qg7Var.k + this.k;
            qg7Var.k = j;
            this.m = Math.max(this.m, j);
            return q;
        }
        if (q == -5) {
            dsc dscVar = (dsc) qdcVar.c;
            dscVar.getClass();
            long j2 = dscVar.s;
            if (j2 != Long.MAX_VALUE) {
                bsc a = dscVar.a();
                a.r = j2 + this.k;
                qdcVar.c = new dsc(a);
            }
        }
        return q;
    }

    public abstract void E(long j, long j2);

    public final void F(dsc[] dscVarArr, aoo aooVar, long j, long j2, uvh uvhVar) {
        vq1.A(!this.n);
        this.i = aooVar;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = dscVarArr;
        this.k = j2;
        C(dscVarArr, j, j2, uvhVar);
    }

    public final int H(long j) {
        aoo aooVar = this.i;
        aooVar.getClass();
        return aooVar.x(j - this.k);
    }

    public abstract int I(dsc dscVar);

    public int J() {
        return 0;
    }

    public final pqb g(wjh wjhVar, dsc dscVar) {
        return h(wjhVar, dscVar, false, 4002);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pqb h(Throwable th, dsc dscVar, boolean z, int i) {
        int i2;
        if (dscVar != null && !this.o) {
            this.o = true;
            try {
                i2 = I(dscVar) & 7;
            } catch (pqb unused) {
            } finally {
                this.o = false;
            }
            return new pqb(1, th, i, k(), this.e, dscVar, dscVar != null ? 4 : i2, z);
        }
        i2 = 4;
        return new pqb(1, th, i, k(), this.e, dscVar, dscVar != null ? 4 : i2, z);
    }

    public fih j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.m == Long.MIN_VALUE;
    }

    public abstract boolean n();

    public abstract boolean p();

    public final boolean q() {
        if (l()) {
            return this.n;
        }
        aoo aooVar = this.i;
        aooVar.getClass();
        return aooVar.p();
    }

    public abstract void u();

    public abstract void w(long j, boolean z);

    public final void y() {
        ct7 ct7Var;
        synchronized (this.a) {
            ct7Var = this.q;
        }
        if (ct7Var != null) {
            synchronized (ct7Var.d) {
                ct7Var.g.getClass();
            }
        }
    }

    public void A() {
    }

    public void B() {
    }

    public void i() {
    }

    public void x() {
    }

    public void z() {
    }

    public void G(float f, float f2) {
    }

    @Override // defpackage.ogl
    public void a(int i, Object obj) {
    }

    public void v(boolean z, boolean z2) {
    }

    public void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
    }
}
