package defpackage;

/* loaded from: classes4.dex */
public final class d36 implements e36 {
    public final String a;

    public d36(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d36) && this.a.equals(((d36) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ShowMoreItem(url=", this.a, ")");
    }
}
