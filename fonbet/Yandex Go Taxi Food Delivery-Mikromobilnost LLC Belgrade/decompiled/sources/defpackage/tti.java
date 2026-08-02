package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tti {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public tti(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tti)) {
            return false;
        }
        tti ttiVar = (tti) obj;
        return jl40.l(this.a, ttiVar.a) && jl40.l(this.b, ttiVar.b) && jl40.l(this.c, ttiVar.c) && jl40.l(this.d, ttiVar.d) && jl40.l(this.e, ttiVar.e) && jl40.l(this.f, ttiVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int b2 = unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        return b2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryTimeIntervalsSummaryItem(leadIcon=", this.a, ", leadIconTag=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", trailTitle=");
        return g8e.r(v, this.e, ", badge=", this.f, Extension.C_BRAKE);
    }

    public /* synthetic */ tti(int i) {
        this(null, null, "", null, "", null);
    }

    public tti() {
        this(0);
    }
}
