package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xmq0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ThemedImageUrlEntity e;
    public final v24 f;

    public xmq0(String str, String str2, String str3, boolean z, ThemedImageUrlEntity themedImageUrlEntity, v24 v24Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = themedImageUrlEntity;
        this.f = v24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmq0)) {
            return false;
        }
        xmq0 xmq0Var = (xmq0) obj;
        return jl40.l(this.a, xmq0Var.a) && jl40.l(this.b, xmq0Var.b) && jl40.l(this.c, xmq0Var.c) && this.d == xmq0Var.d && this.e.equals(xmq0Var.e) && jl40.l(this.f, xmq0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c = xvz.c(this.e, unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
        v24 v24Var = this.f;
        return c + (v24Var != null ? Boolean.hashCode(v24Var.a) : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelfTopupPayloadEntity(sourceAgreementId=", this.a, ", title=", this.b, ", subtitle=");
        tse0.y(this.c, ", spoilerEnabled=", ", themedImage=", v, this.d);
        v.append(this.e);
        v.append(", autoTopupWidget=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
