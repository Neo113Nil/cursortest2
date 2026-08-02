package defpackage;

/* loaded from: classes3.dex */
public final class nl5 {
    public final String a;

    public nl5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl5) && this.a.equals(((nl5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 865716203;
    }

    public final String toString() {
        return hrg.q("ComplaintRequest(contentType=track, contentId=", this.a, ")");
    }
}
