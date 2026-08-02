package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ro10 {
    public final rr51 a;
    public final String b;
    public final fxy0 c;
    public final ThemedImageUrlEntity d;
    public final String e;
    public final ThemedImageUrlEntity f;
    public final String g;
    public final String h;
    public final int i;

    public ro10(rr51 rr51Var, String str, fxy0 fxy0Var, ThemedImageUrlEntity themedImageUrlEntity, String str2, ThemedImageUrlEntity themedImageUrlEntity2, String str3, String str4, int i) {
        this.a = rr51Var;
        this.b = str;
        this.c = fxy0Var;
        this.d = themedImageUrlEntity;
        this.e = str2;
        this.f = themedImageUrlEntity2;
        this.g = str3;
        this.h = str4;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro10)) {
            return false;
        }
        ro10 ro10Var = (ro10) obj;
        return jl40.l(this.a, ro10Var.a) && jl40.l(this.b, ro10Var.b) && jl40.l(this.c, ro10Var.c) && jl40.l(this.d, ro10Var.d) && jl40.l(this.e, ro10Var.e) && jl40.l(this.f, ro10Var.f) && jl40.l(this.g, ro10Var.g) && jl40.l(this.h, ro10Var.h) && this.i == ro10Var.i;
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int b = unr0.b((rr51Var == null ? 0 : rr51Var.hashCode()) * 31, 31, this.b);
        fxy0 fxy0Var = this.c;
        int hashCode = (b + (fxy0Var == null ? 0 : fxy0Var.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        int b2 = unr0.b((hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.e);
        ThemedImageUrlEntity themedImageUrlEntity2 = this.f;
        int b3 = unr0.b((b2 + (themedImageUrlEntity2 == null ? 0 : themedImageUrlEntity2.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return Integer.hashCode(this.i) + ((b3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantOffersBannerEntity(notifyDivData=");
        sb.append(this.a);
        sb.append(", bannerId=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", bannerImage=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", logo=");
        sb.append(this.f);
        sb.append(", title=");
        g8e.D(sb, this.g, ", subtitle=", this.h, ", duration=");
        return oyr.m(this.i, Extension.C_BRAKE, sb);
    }
}
