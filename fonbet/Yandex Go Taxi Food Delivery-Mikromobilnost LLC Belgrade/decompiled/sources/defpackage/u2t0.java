package defpackage;

/* loaded from: classes10.dex */
public abstract class u2t0 extends h5u0 implements px40, b3t0 {
    public static final int $stable = 0;
    private t2t0 next;

    public u2t0(double d) {
        i2t0 j = q2t0.j();
        t2t0 t2t0Var = new t2t0(j.g(), d);
        if (!(j instanceof akt)) {
            t2t0Var.b = new t2t0(1L, d);
        }
        this.next = t2t0Var;
    }

    @Override // defpackage.oz40
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    @Override // defpackage.oz40
    public tls component2() {
        return new quq0(25, this);
    }

    @Override // defpackage.px40
    public double getDoubleValue() {
        return ((t2t0) q2t0.t(this.next, this)).c;
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.next;
    }

    @Override // defpackage.b3t0
    public e3t0 getPolicy() {
        return ngd0.F;
    }

    @Override // defpackage.g5u0
    public j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        if (((t2t0) j5u0Var2).c == ((t2t0) j5u0Var3).c) {
            return j5u0Var2;
        }
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 j5u0Var) {
        this.next = (t2t0) j5u0Var;
    }

    @Override // defpackage.px40
    public void setDoubleValue(double d) {
        i2t0 j;
        t2t0 t2t0Var = (t2t0) q2t0.h(this.next);
        if (t2t0Var.c == d) {
            return;
        }
        t2t0 t2t0Var2 = this.next;
        synchronized (q2t0.c) {
            j = q2t0.j();
            ((t2t0) q2t0.o(t2t0Var2, this, j, t2t0Var)).c = d;
        }
        q2t0.n(j, this);
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((t2t0) q2t0.h(this.next)).c + ")@" + hashCode();
    }
}
