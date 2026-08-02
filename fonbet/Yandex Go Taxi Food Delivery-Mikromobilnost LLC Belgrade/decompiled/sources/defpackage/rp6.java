package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rp6 {
    public final String a;
    public final ThemedImageUrlEntity b;
    public final String c;

    public rp6(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = themedImageUrlEntity;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp6)) {
            return false;
        }
        rp6 rp6Var = (rp6) obj;
        return jl40.l(this.a, rp6Var.a) && this.b.equals(rp6Var.b) && jl40.l(this.c, rp6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetHeaderButtonEntity(action=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", a11yDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
