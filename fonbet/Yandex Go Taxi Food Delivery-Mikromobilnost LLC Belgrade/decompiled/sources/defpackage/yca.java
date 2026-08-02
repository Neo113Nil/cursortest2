package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yca {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final vca e;

    public yca(String str, String str2, CharSequence charSequence, CharSequence charSequence2, vca vcaVar) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = vcaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yca)) {
            return false;
        }
        yca ycaVar = (yca) obj;
        return jl40.l(this.a, ycaVar.a) && jl40.l(this.b, ycaVar.b) && jl40.l(this.c, ycaVar.c) && jl40.l(this.d, ycaVar.d) && jl40.l(this.e, ycaVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = smw0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int hashCode2 = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        vca vcaVar = this.e;
        return hashCode2 + (vcaVar != null ? vcaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersOrderNotificationState(id=", this.a, ", iconUrl=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
