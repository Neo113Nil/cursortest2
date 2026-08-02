package defpackage;

/* loaded from: classes3.dex */
public final class ruo implements xuo {
    public final String a;

    public ruo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruo) && this.a.equals(((ruo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Navigate(url=", this.a, ")");
    }
}
