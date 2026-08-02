package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uc8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ThemedImageUrlEntity f;

    public uc8(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc8)) {
            return false;
        }
        uc8 uc8Var = (uc8) obj;
        return jl40.l(this.a, uc8Var.a) && jl40.l(this.b, uc8Var.b) && jl40.l(this.c, uc8Var.c) && jl40.l(this.d, uc8Var.d) && jl40.l(this.e, uc8Var.e) && this.f.equals(uc8Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.f.hashCode() + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardData(trustId=", this.a, ", cardId=", this.b, ", ybId=");
        g8e.D(v, this.c, ", title=", this.d, ", description=");
        v.append(this.e);
        v.append(", logo=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
