package defpackage;

/* loaded from: classes.dex */
public final class twt0 implements qar {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ twt0(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.jj2
    public final f531 a(gl11 gl11Var) {
        Object obj = this.c;
        sj2 sj2Var = obj == null ? null : (sj2) gl11Var.a.invoke(obj);
        int[] iArr = g531.a;
        float f = this.a;
        float f2 = this.b;
        wj2 eg01Var = sj2Var != null ? new eg01(sj2Var, f, f2) : new dxf0(f, f2);
        qc20 qc20Var = new qc20();
        qc20Var.a = new ofa0(eg01Var);
        return qc20Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof twt0) {
            twt0 twt0Var = (twt0) obj;
            if (twt0Var.a == this.a && twt0Var.b == this.b && jl40.l(twt0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + g8e.c(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public twt0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public twt0() {
        this(7, null);
    }
}
