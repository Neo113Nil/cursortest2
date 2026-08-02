package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vtt0 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;

    public vtt0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtt0)) {
            return false;
        }
        vtt0 vtt0Var = (vtt0) obj;
        return jl40.l(this.a, vtt0Var.a) && jl40.l(this.b, vtt0Var.b) && this.c.equals(vtt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethod(trustId=", this.a, ", title=", this.b, ", icon=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
