package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sti {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public sti(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof sti)) {
            return false;
        }
        sti stiVar = (sti) obj;
        return jl40.l(this.a, stiVar.a) && jl40.l(this.b, stiVar.b) && jl40.l(this.c, stiVar.c) && jl40.l(this.d, stiVar.d) && jl40.l(this.e, stiVar.e) && jl40.l(this.f, stiVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryTimeIntervalsListScreen(title=", this.a, ", subtitle=", this.b, ", headerImage=");
        g8e.D(v, this.c, ", pickupHeaderTitle=", this.d, ", deliveryHeaderTitle=");
        return g8e.r(v, this.e, ", priceHeaderTitle=", this.f, Extension.C_BRAKE);
    }

    public /* synthetic */ sti(int i) {
        this("", "", null, "", "", "");
    }

    public sti() {
        this(0);
    }
}
