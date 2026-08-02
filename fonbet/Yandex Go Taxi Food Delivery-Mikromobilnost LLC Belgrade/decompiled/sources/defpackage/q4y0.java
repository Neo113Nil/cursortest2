package defpackage;

/* loaded from: classes6.dex */
public final class q4y0 extends r4y0 {
    public final float a;

    public q4y0(int i) {
        this.a = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4y0) && Float.compare(this.a, ((q4y0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a) * 31;
    }

    public final String toString() {
        return x4e.f("Divider(height=", ", color=null)", this.a);
    }

    public q4y0() {
        this(0);
    }
}
