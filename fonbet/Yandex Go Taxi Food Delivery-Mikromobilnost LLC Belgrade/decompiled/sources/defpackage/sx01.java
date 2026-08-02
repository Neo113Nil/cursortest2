package defpackage;

/* loaded from: classes.dex */
public final class sx01 implements rx01 {
    public final Object a;
    public final Object b;

    public sx01(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.rx01
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.rx01
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rx01)) {
            return false;
        }
        rx01 rx01Var = (rx01) obj;
        return jl40.l(this.a, rx01Var.c()) && jl40.l(this.b, rx01Var.b());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
