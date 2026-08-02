package defpackage;

/* loaded from: classes3.dex */
public final class yl1 implements am1 {
    public final boolean a;

    public yl1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl1) && this.a == ((yl1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vz1.q("Placeholder(isLoading=", ", count=3)", this.a);
    }
}
