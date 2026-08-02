package defpackage;

/* loaded from: classes.dex */
public final class csj {
    public final String a;

    public csj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csj) && this.a.equals(((csj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
