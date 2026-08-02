package defpackage;

/* loaded from: classes2.dex */
public final class qww {
    public final String a;
    public final String b;

    public qww(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qww)) {
            return false;
        }
        qww qwwVar = (qww) obj;
        return this.a.equals(qwwVar.a) && this.b.equals(qwwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewInvite(webViewUrl=");
        sb.append(this.a);
        sb.append(", skipText=");
        return b64.p(sb, this.b, ')');
    }
}
