package defpackage;

/* loaded from: classes3.dex */
public final class quo implements wuo {
    public final String a;

    public quo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quo) && this.a.equals(((quo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Navigate(url=", this.a, ")");
    }
}
