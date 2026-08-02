package defpackage;

/* loaded from: classes3.dex */
public final class wls implements lns {
    public final String a;

    public wls(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wls) && this.a.equals(((wls) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Function(name="), this.a, ')');
    }
}
