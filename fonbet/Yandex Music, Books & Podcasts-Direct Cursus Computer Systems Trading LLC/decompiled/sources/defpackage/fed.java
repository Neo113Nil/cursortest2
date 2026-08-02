package defpackage;

/* loaded from: classes5.dex */
public final class fed extends hed {
    public final shd a;

    public fed(shd shdVar) {
        this.a = shdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fed) && this.a.equals(((fed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectionError(error=" + this.a + ")";
    }
}
