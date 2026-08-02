package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rvz0 {
    public final String a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;

    public rvz0(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvz0)) {
            return false;
        }
        rvz0 rvz0Var = (rvz0) obj;
        return jl40.l(this.a, rvz0Var.a) && jl40.l(this.b, rvz0Var.b) && jl40.l(this.c, rvz0Var.c) && jl40.l(this.d, rvz0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        return hashCode3 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TooltipState(tooltipText=", this.a, ", tooltipAction=", this.b, ", tooltipActionText=");
        v.append(this.c);
        v.append(", tooltipActionImage=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
