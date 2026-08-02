package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sv40 implements vv40 {
    public final String a;
    public final ovi0 b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final Integer f;
    public final ArrayList g;
    public final fmc h;

    public sv40(String str, ovi0 ovi0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, ArrayList arrayList, fmc fmcVar) {
        this.a = str;
        this.b = ovi0Var;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = num;
        this.g = arrayList;
        this.h = fmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv40)) {
            return false;
        }
        sv40 sv40Var = (sv40) obj;
        return jl40.l(this.a, sv40Var.a) && this.b.equals(sv40Var.b) && jl40.l(this.c, sv40Var.c) && jl40.l(this.d, sv40Var.d) && jl40.l(this.e, sv40Var.e) && jl40.l(this.f, sv40Var.f) && this.g.equals(sv40Var.g) && jl40.l(this.h, sv40Var.h);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int b2 = ly3.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
        fmc fmcVar = this.h;
        return b2 + (fmcVar != null ? fmcVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(id=");
        sb.append(this.a);
        sb.append(", img=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", buttonText=");
        sb.append((Object) this.e);
        sb.append(", selectedRating=");
        sb.append(this.f);
        sb.append(", feedbackHintsUiStates=");
        sb.append(this.g);
        sb.append(", commentFieldUiState=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
