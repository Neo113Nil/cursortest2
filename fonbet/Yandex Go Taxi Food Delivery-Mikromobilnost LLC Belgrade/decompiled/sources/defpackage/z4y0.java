package defpackage;

/* loaded from: classes14.dex */
public final class z4y0 implements r1y0 {
    public final o2y0 a;

    public z4y0(o2y0 o2y0Var) {
        this.a = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z4y0) {
            return jl40.l(getId(), ((z4y0) obj).getId());
        }
        return false;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return getId().hashCode();
    }

    @Override // defpackage.w201
    public final i501 q() {
        return f501.a;
    }
}
