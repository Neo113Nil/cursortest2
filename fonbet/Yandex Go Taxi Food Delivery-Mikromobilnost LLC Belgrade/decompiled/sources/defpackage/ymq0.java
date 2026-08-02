package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ymq0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ThemedImageUrlEntity e;

    public ymq0(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymq0)) {
            return false;
        }
        ymq0 ymq0Var = (ymq0) obj;
        return jl40.l(this.a, ymq0Var.a) && jl40.l(this.b, ymq0Var.b) && jl40.l(this.c, ymq0Var.c) && this.d == ymq0Var.d && this.e.equals(ymq0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelfTransferPayloadEntity(targetAgreementId=", this.a, ", title=", this.b, ", subtitle=");
        tse0.y(this.c, ", spoilerEnabled=", ", themedImage=", v, this.d);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
