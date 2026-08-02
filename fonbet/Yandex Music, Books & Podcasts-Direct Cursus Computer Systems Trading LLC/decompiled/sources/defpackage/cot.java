package defpackage;

/* loaded from: classes3.dex */
public final class cot extends fot {
    public final int a;

    public cot(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cot) && this.a == ((cot) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Http(code=", ")");
    }
}
