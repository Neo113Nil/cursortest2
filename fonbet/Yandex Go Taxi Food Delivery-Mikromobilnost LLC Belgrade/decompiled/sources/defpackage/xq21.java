package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xq21 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final ArrayList f;

    public xq21(String str, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq21)) {
            return false;
        }
        xq21 xq21Var = (xq21) obj;
        return jl40.l(this.a, xq21Var.a) && jl40.l(this.b, xq21Var.b) && jl40.l(this.c, xq21Var.c) && jl40.l(this.d, xq21Var.d) && jl40.l(this.e, xq21Var.e) && this.f.equals(xq21Var.f);
    }

    public final int hashCode() {
        int b = smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        CharSequence charSequence = this.d;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        return this.f.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("UserPhotoUploadingInfo(imageUrl=", this.a, ", verificationStatus=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", statusText=");
        v.append((Object) this.e);
        v.append(", buttons=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
