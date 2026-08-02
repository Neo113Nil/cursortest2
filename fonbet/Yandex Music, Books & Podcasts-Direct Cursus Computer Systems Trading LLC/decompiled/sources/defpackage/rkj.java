package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rkj {
    public final String a;
    public final Set b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public rkj(int i, String str, String str2, String str3, String str4, String str5) {
        q5b q5bVar = q5b.a;
        str2 = (i & 4) != 0 ? null : str2;
        str4 = (i & 16) != 0 ? null : str4;
        str.getClass();
        q5bVar.getClass();
        this.a = str;
        this.b = q5bVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkj)) {
            return false;
        }
        rkj rkjVar = (rkj) obj;
        return Intrinsics.d(this.a, rkjVar.a) && this.b.equals(rkjVar.b) && Intrinsics.d(this.c, rkjVar.c) && Intrinsics.d(this.d, rkjVar.d) && Intrinsics.d(this.e, rkjVar.e) && Intrinsics.d(this.f, rkjVar.f);
    }

    public final int hashCode() {
        int f = su4.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferRequestParams(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", featureId=");
        su4.v(sb, this.c, ", campaignId=", this.d, ", communicationId=");
        return ouj.q(sb, this.e, ", utmCampaign=", this.f, ")");
    }
}
