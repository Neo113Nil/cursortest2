package defpackage;

/* loaded from: classes4.dex */
public final class gn extends kn {
    public final ggk a;

    public gn(ggk ggkVar) {
        this.a = ggkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn) && this.a == ((gn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(pollingResult=" + this.a + ")";
    }
}
