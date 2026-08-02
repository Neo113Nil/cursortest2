package defpackage;

/* loaded from: classes.dex */
public final class bd2 {
    public final Integer a;
    public final Object b;
    public final lsm c;
    public final td2 d;

    public bd2(Integer num, Object obj, lsm lsmVar, td2 td2Var) {
        this.a = num;
        this.b = obj;
        this.c = lsmVar;
        this.d = td2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bd2)) {
            return false;
        }
        bd2 bd2Var = (bd2) obj;
        Integer num = bd2Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.b.equals(bd2Var.b) || !this.c.equals(bd2Var.c)) {
            return false;
        }
        td2 td2Var = bd2Var.d;
        td2 td2Var2 = this.d;
        return td2Var2 == null ? td2Var == null : td2Var2.equals(td2Var);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        td2 td2Var = this.d;
        return ((td2Var != null ? td2Var.hashCode() : 0) ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
