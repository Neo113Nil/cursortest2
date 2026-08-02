package defpackage;

/* loaded from: classes.dex */
public final class e0u implements in0 {
    public final String a;

    public e0u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0u) {
            return this.a.equals(((e0u) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
