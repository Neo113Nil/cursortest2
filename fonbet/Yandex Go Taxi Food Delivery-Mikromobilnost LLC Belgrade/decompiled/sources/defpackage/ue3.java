package defpackage;

/* loaded from: classes10.dex */
public final class ue3 {
    public static final ue3 c = new ue3(new te3().a);
    public final int a;
    public se3 b;

    static {
        x4e.x(0, 1, 2, 3, 4);
    }

    public ue3(int i) {
        this.a = i;
    }

    public final se3 a() {
        if (this.b == null) {
            this.b = new se3(this);
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ue3.class == obj.getClass() && this.a == ((ue3) obj).a;
    }

    public final int hashCode() {
        return (((((527 + this.a) * 961) + 1) * 31) + 1) * 31;
    }
}
