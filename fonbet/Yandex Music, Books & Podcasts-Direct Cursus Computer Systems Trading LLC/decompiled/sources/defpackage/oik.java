package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class oik {
    public final String a;
    public final Set b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public oik(String str, String str2, String str3, String str4, String str5, boolean z) {
        q5b q5bVar = q5b.a;
        str.getClass();
        q5bVar.getClass();
        this.a = str;
        this.b = q5bVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oik)) {
            return false;
        }
        oik oikVar = (oik) obj;
        return Intrinsics.d(this.a, oikVar.a) && this.b.equals(oikVar.b) && Intrinsics.d(this.c, oikVar.c) && Intrinsics.d(this.d, oikVar.d) && Intrinsics.d(this.e, oikVar.e) && this.f == oikVar.f && this.g.equals(oikVar.g);
    }

    public final int hashCode() {
        int f = su4.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.e;
        return this.g.hashCode() + k5r.e((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaywallParams(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", featureId=");
        su4.v(sb, this.c, ", campaignId=", this.d, ", communicationId=null, utmCampaign=");
        sb.append(this.e);
        sb.append(", isCloseDisabled=");
        sb.append(this.f);
        sb.append(", clientPlace=");
        return su4.o(sb, this.g, ")");
    }
}
