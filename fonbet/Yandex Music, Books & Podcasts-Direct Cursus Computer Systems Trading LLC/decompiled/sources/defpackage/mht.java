package defpackage;

/* loaded from: classes3.dex */
public final class mht extends bfg {
    public final String a;

    public mht(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mht) && this.a.equals(((mht) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("DynamicString(value=", this.a, ")");
    }
}
