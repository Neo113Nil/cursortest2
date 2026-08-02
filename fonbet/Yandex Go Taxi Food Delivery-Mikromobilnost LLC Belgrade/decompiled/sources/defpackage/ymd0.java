package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ymd0 {
    public static final xmd0 Companion = new xmd0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ymd0(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wmd0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymd0)) {
            return false;
        }
        ymd0 ymd0Var = (ymd0) obj;
        return jl40.l(this.a, ymd0Var.a) && jl40.l(this.b, ymd0Var.b) && jl40.l(this.c, ymd0Var.c) && jl40.l(this.d, ymd0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("PlusSubscriptionPurchaseParam(subscriptionId=", this.a, ", paymentMethodId=", this.b, ", eventSource="), this.c, ", plusContext=", this.d, Extension.C_BRAKE);
    }

    public ymd0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
