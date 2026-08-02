package defpackage;

/* loaded from: classes.dex */
public final class vcg {
    public final Object a;

    public vcg(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcg) && this.a == ((vcg) obj).a;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + 1520230490;
    }
}
