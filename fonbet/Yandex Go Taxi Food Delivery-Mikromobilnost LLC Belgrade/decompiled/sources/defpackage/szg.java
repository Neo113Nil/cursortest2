package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class szg extends vzg {
    public final Uri a;
    public final String b;
    public final String c;

    public szg(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szg)) {
            return false;
        }
        szg szgVar = (szg) obj;
        return this.a.equals(szgVar.a) && jl40.l(this.b, szgVar.b) && jl40.l(this.c, szgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Story(url=");
        sb.append(this.a);
        sb.append(", screenId=");
        sb.append(this.b);
        sb.append(", message=");
        return b64.p(sb, this.c, ')');
    }
}
