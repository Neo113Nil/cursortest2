package defpackage;

/* loaded from: classes.dex */
public final class myg implements oyg {
    public final int a;

    public /* synthetic */ myg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof myg) {
            return this.a == ((myg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "RawRes(resId=", ")");
    }
}
