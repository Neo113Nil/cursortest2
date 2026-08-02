package defpackage;

/* loaded from: classes2.dex */
public final class www implements xww {
    public final String a;
    public final String b;

    public www(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof www)) {
            return false;
        }
        www wwwVar = (www) obj;
        return this.a.equals(wwwVar.a) && this.b.equals(wwwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(url=");
        sb.append(this.a);
        sb.append(", skipText=");
        return b64.p(sb, this.b, ')');
    }
}
