package defpackage;

/* loaded from: classes.dex */
public abstract class r3x {
    public abstract u6x a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r3x) {
            return a().equals(((r3x) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
