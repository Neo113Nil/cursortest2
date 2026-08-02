package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ti90 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;
    public final String d;

    public ti90(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti90)) {
            return false;
        }
        ti90 ti90Var = (ti90) obj;
        return jl40.l(this.a, ti90Var.a) && jl40.l(this.b, ti90Var.b) && jl40.l(this.c, ti90Var.c) && jl40.l(this.d, ti90Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.c;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PartnerWithActionEntity(title=", this.a, ", description=", this.b, ", themedImage=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
