package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vea implements wea {
    public final CharSequence a;
    public final List b;
    public final CharSequence c;
    public final List d;
    public final uea e;

    public vea(CharSequence charSequence, List list, CharSequence charSequence2, List list2, uea ueaVar) {
        this.a = charSequence;
        this.b = list;
        this.c = charSequence2;
        this.d = list2;
        this.e = ueaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vea)) {
            return false;
        }
        vea veaVar = (vea) obj;
        return jl40.l(this.a, veaVar.a) && jl40.l(this.b, veaVar.b) && jl40.l(this.c, veaVar.c) && jl40.l(this.d, veaVar.d) && jl40.l(this.e, veaVar.e);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int c2 = unr0.c((c + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        uea ueaVar = this.e;
        return c2 + (ueaVar != null ? ueaVar.hashCode() : 0);
    }

    public final String toString() {
        return "Success(title=" + ((Object) this.a) + ", terms=" + this.b + ", activeUntil=" + ((Object) this.c) + ", buttons=" + this.d + ", termsLink=" + this.e + Extension.C_BRAKE;
    }
}
