package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yg90 {
    public final String a;
    public final ThemedImageUrlEntity b;

    public yg90(String str, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg90)) {
            return false;
        }
        yg90 yg90Var = (yg90) obj;
        return jl40.l(this.a, yg90Var.a) && this.b.equals(yg90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerByBicEntity(title=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
