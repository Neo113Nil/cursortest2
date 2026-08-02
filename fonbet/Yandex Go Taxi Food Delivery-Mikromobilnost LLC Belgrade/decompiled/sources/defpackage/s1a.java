package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s1a implements t1a {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public s1a(CharSequence charSequence, String str, List list, CharSequence charSequence2, CharSequence charSequence3, String str2, String str3) {
        this.a = charSequence;
        this.b = str;
        this.c = list;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1a)) {
            return false;
        }
        s1a s1aVar = (s1a) obj;
        return jl40.l(this.a, s1aVar.a) && jl40.l(this.b, s1aVar.b) && jl40.l(this.c, s1aVar.c) && jl40.l(this.d, s1aVar.d) && jl40.l(this.e, s1aVar.e) && jl40.l(this.f, s1aVar.f) && jl40.l(this.g, s1aVar.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int b = unr0.b(smw0.b(smw0.b(unr0.c(smw0.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "PreFinishSuccess(hint=", ", number=", ", buttons=");
        r.append(this.c);
        r.append(", powerBankNumber=");
        r.append((Object) this.d);
        r.append(", orderTariff=");
        r.append((Object) this.e);
        r.append(", chargerIconUrl=");
        r.append(this.f);
        r.append(", mainChargerIconUrl=");
        return oyr.t(r, this.g, Extension.C_BRAKE);
    }
}
