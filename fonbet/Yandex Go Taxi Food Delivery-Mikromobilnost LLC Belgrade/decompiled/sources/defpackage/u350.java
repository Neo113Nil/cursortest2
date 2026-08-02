package defpackage;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;

/* loaded from: classes2.dex */
public final class u350 {
    public final SubscriptionConfiguration a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public u350(SubscriptionConfiguration subscriptionConfiguration, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = subscriptionConfiguration;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u350)) {
            return false;
        }
        u350 u350Var = (u350) obj;
        return this.a.equals(u350Var.a) && jl40.l(this.b, u350Var.b) && jl40.l(this.c, u350Var.c) && jl40.l(this.d, u350Var.d) && this.e == u350Var.e && this.f == u350Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.f) + unr0.e((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativePayButtonConfig(config=");
        sb.append(this.a);
        sb.append(", offerText=");
        sb.append(this.b);
        sb.append(", offerSubText=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", isOfferTrial=");
        sb.append(this.e);
        sb.append(", isShowLoadingNeeded=");
        return unr0.u(sb, this.f, ')');
    }
}
