package defpackage;

/* loaded from: classes8.dex */
public final class ue20 {
    public static final ue20 d = new ue20(ie20.a, new se20(new le20(new rkj(0)), new le20(new rkj(0)), new le20(new rkj(0)), new le20(new rkj(0))), false);
    public final je20 a;
    public final se20 b;
    public final boolean c;

    public ue20(je20 je20Var, se20 se20Var, boolean z) {
        this.a = je20Var;
        this.b = se20Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue20)) {
            return false;
        }
        ue20 ue20Var = (ue20) obj;
        return jl40.l(this.a, ue20Var.a) && this.b.equals(ue20Var.b) && this.c == ue20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MicroWidgetBackgroundSettings(background=");
        sb.append(this.a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", withRipple=");
        return unr0.u(sb, this.c, ')');
    }
}
