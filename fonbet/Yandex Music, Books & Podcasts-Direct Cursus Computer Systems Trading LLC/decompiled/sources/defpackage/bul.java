package defpackage;

/* loaded from: classes6.dex */
public final class bul implements dul {
    public final String a;
    public final String b;

    public bul(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bul)) {
            return false;
        }
        bul bulVar = (bul) obj;
        return this.a.equals(bulVar.a) && this.b.equals(bulVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Special(owner=", this.a, ", type=", this.b, ")");
    }
}
