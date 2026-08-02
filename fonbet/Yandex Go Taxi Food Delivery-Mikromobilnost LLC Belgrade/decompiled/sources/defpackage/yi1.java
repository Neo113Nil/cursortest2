package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yi1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ThemedImageUrlEntity d;
    public final String e;
    public final String f;

    public yi1(String str, String str2, boolean z, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = themedImageUrlEntity;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi1)) {
            return false;
        }
        yi1 yi1Var = (yi1) obj;
        return jl40.l(this.a, yi1Var.a) && jl40.l(this.b, yi1Var.b) && this.c == yi1Var.c && this.d.equals(yi1Var.d) && jl40.l(this.e, yi1Var.e) && jl40.l(this.f, yi1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(xvz.c(this.d, unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        String str2 = this.f;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AftTopupPayloadEntity(title=", this.a, ", description=", this.b, ", spoilerEnabled=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", cardId=");
        return g8e.r(v, this.e, ", partnerId=", this.f, Extension.C_BRAKE);
    }
}
