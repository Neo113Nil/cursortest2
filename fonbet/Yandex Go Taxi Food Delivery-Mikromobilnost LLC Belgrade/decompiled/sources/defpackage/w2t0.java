package defpackage;

/* loaded from: classes.dex */
public abstract class w2t0 extends h5u0 implements tx40, b3t0 {
    public static final int $stable = 0;
    private v2t0 next;

    public w2t0(float f) {
        i2t0 j = q2t0.j();
        v2t0 v2t0Var = new v2t0(j.g(), f);
        if (!(j instanceof akt)) {
            v2t0Var.b = new v2t0(1L, f);
        }
        this.next = v2t0Var;
    }

    @Override // defpackage.oz40
    public Float component1() {
        return Float.valueOf(getFloatValue());
    }

    @Override // defpackage.oz40
    public tls component2() {
        return new quq0(26, this);
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.next;
    }

    @Override // defpackage.tx40, defpackage.qor
    public float getFloatValue() {
        return ((v2t0) q2t0.t(this.next, this)).c;
    }

    @Override // defpackage.b3t0
    public e3t0 getPolicy() {
        return ngd0.F;
    }

    @Override // defpackage.g5u0
    public j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        if (((v2t0) j5u0Var2).c == ((v2t0) j5u0Var3).c) {
            return j5u0Var2;
        }
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 j5u0Var) {
        this.next = (v2t0) j5u0Var;
    }

    @Override // defpackage.tx40
    public void setFloatValue(float f) {
        i2t0 j;
        v2t0 v2t0Var = (v2t0) q2t0.h(this.next);
        if (v2t0Var.c == f) {
            return;
        }
        v2t0 v2t0Var2 = this.next;
        synchronized (q2t0.c) {
            j = q2t0.j();
            ((v2t0) q2t0.o(v2t0Var2, this, j, v2t0Var)).c = f;
        }
        q2t0.n(j, this);
    }

    public String toString() {
        return "MutableFloatState(value=" + ((v2t0) q2t0.h(this.next)).c + ")@" + hashCode();
    }
}
