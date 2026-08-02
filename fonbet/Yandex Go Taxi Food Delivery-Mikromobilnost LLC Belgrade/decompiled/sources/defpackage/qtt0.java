package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qtt0 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;

    public qtt0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtt0)) {
            return false;
        }
        qtt0 qtt0Var = (qtt0) obj;
        return jl40.l(this.a, qtt0Var.a) && jl40.l(this.b, qtt0Var.b) && this.c.equals(qtt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("WalletPaymentMethodData(trustId=", this.a, ", title=", this.b, ", icon=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
