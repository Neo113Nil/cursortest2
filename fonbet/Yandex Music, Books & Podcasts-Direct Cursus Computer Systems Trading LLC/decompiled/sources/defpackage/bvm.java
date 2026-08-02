package defpackage;

/* loaded from: classes4.dex */
public final class bvm extends fvm {
    public final String a;

    public bvm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvm) && this.a.equals(((bvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ExternalFailure(text=", this.a, ")");
    }
}
