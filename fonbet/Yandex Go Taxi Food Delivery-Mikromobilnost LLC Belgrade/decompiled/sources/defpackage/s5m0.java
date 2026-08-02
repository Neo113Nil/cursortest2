package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s5m0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;

    public s5m0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5m0)) {
            return false;
        }
        s5m0 s5m0Var = (s5m0) obj;
        return this.a.equals(s5m0Var.a) && jl40.l(this.b, s5m0Var.b) && jl40.l(this.c, s5m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsAccountDocumentButtonEntity(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", action=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
