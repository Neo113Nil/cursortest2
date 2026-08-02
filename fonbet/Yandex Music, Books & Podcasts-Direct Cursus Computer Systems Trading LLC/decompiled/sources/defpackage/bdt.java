package defpackage;

/* loaded from: classes3.dex */
public final class bdt {
    public final Class a;

    public bdt(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdt) && this.a.equals(((bdt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypeSpec(klass=" + this.a + ")";
    }
}
