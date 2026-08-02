package defpackage;

/* loaded from: classes.dex */
public abstract class y2t0 extends h5u0 implements yx40, b3t0 {
    public static final int $stable = 0;
    private x2t0 next;

    public y2t0(int i) {
        i2t0 j = q2t0.j();
        x2t0 x2t0Var = new x2t0(j.g(), i);
        if (!(j instanceof akt)) {
            x2t0Var.b = new x2t0(1L, i);
        }
        this.next = x2t0Var;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // defpackage.oz40
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }

    @Override // defpackage.oz40
    public tls component2() {
        return new quq0(27, this);
    }

    public final int getDebuggerDisplayValue() {
        return ((x2t0) q2t0.h(this.next)).c;
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.next;
    }

    @Override // defpackage.yx40, defpackage.n6w
    public int getIntValue() {
        return ((x2t0) q2t0.t(this.next, this)).c;
    }

    @Override // defpackage.b3t0
    public e3t0 getPolicy() {
        return ngd0.F;
    }

    @Override // defpackage.g5u0
    public j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        if (((x2t0) j5u0Var2).c == ((x2t0) j5u0Var3).c) {
            return j5u0Var2;
        }
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 j5u0Var) {
        this.next = (x2t0) j5u0Var;
    }

    @Override // defpackage.yx40
    public void setIntValue(int i) {
        i2t0 j;
        x2t0 x2t0Var = (x2t0) q2t0.h(this.next);
        if (x2t0Var.c != i) {
            x2t0 x2t0Var2 = this.next;
            synchronized (q2t0.c) {
                j = q2t0.j();
                ((x2t0) q2t0.o(x2t0Var2, this, j, x2t0Var)).c = i;
            }
            q2t0.n(j, this);
        }
    }

    public String toString() {
        return "MutableIntState(value=" + ((x2t0) q2t0.h(this.next)).c + ")@" + hashCode();
    }
}
