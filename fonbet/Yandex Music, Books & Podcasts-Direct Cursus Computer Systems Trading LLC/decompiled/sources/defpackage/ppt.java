package defpackage;

/* loaded from: classes.dex */
public final class ppt implements in0 {
    public final String a;

    public ppt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppt) {
            return this.a.equals(((ppt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
