package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t910 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ThemedImageUrlEntity d;
    public final String e;
    public final v24 f;
    public final String g;

    public t910(String str, String str2, boolean z, ThemedImageUrlEntity themedImageUrlEntity, String str3, v24 v24Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = themedImageUrlEntity;
        this.e = str3;
        this.f = v24Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t910)) {
            return false;
        }
        t910 t910Var = (t910) obj;
        return jl40.l(this.a, t910Var.a) && jl40.l(this.b, t910Var.b) && this.c == t910Var.c && this.d.equals(t910Var.d) && jl40.l(this.e, t910Var.e) && this.f.equals(t910Var.f) && jl40.l(this.g, t910Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(xvz.c(this.d, unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f.a);
        String str = this.g;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Me2MeTopupPayloadEntity(title=", this.a, ", description=", this.b, ", spoilerEnabled=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", partnerId=");
        v.append(this.e);
        v.append(", autoTopupWidget=");
        v.append(this.f);
        v.append(", onM2mSelectedAction=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
