package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class gem {
    public final String a;
    public final String b;
    public final ypt c;
    public final String d;
    public final String e;
    public final jcv f;

    public gem(String str, String str2, ypt yptVar, String str3, String str4, jcv jcvVar) {
        this.a = str;
        this.b = str2;
        this.c = yptVar;
        this.d = str3;
        this.e = str4;
        this.f = jcvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gem)) {
            return false;
        }
        gem gemVar = (gem) obj;
        return Intrinsics.d(this.a, gemVar.a) && this.b.equals(gemVar.b) && this.c.equals(gemVar.c) && Intrinsics.d(this.d, gemVar.d) && Intrinsics.d(this.e, gemVar.e) && this.f.equals(gemVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PodcastsPromotion(title=", this.a, ", promoId=", this.b, ", urlScheme=");
        m.append(this.c);
        m.append(", subtitle=");
        m.append(this.d);
        m.append(", heading=");
        m.append(this.e);
        m.append(", image=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
