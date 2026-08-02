package defpackage;

/* loaded from: classes.dex */
public final class dkr implements in0 {
    public final String a;

    public /* synthetic */ dkr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkr) {
            return this.a.equals(((dkr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "StringAnnotation(value=", this.a);
    }
}
