package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class wap {
    public final String a;
    public final Map b;
    public final String c;

    public wap(String str, Map map, String str2) {
        this.a = str;
        this.b = map;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wap)) {
            return false;
        }
        wap wapVar = (wap) obj;
        return this.a.equals(wapVar.a) && this.b.equals(wapVar.b) && jl40.l(this.c, wapVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyInvitationContent(webPageUrl=");
        sb.append(this.a);
        sb.append(", webPageHeaders=");
        sb.append(this.b);
        sb.append(", skipButtonText=");
        return b64.p(sb, this.c, ')');
    }
}
