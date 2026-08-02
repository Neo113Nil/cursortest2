package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class urm0 {
    public final boolean a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;
    public final CharSequence f;
    public final CharSequence g;

    public urm0(boolean z, String str, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = z;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = list;
        this.f = charSequence3;
        this.g = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urm0)) {
            return false;
        }
        urm0 urm0Var = (urm0) obj;
        return this.a == urm0Var.a && jl40.l(this.b, urm0Var.b) && jl40.l(this.c, urm0Var.c) && jl40.l(this.d, urm0Var.d) && jl40.l(this.e, urm0Var.e) && jl40.l(this.f, urm0Var.f) && jl40.l(this.g, urm0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + smw0.b(unr0.c(smw0.b(smw0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ScootersActivePassesV3FreezeUiState(inProgress=", ", topImageTag=", this.b, ", title=", this.a);
        vfc.A(v, this.c, ", subtitle=", this.d, ", details=");
        v.append(this.e);
        v.append(", rejectButtonText=");
        v.append((Object) this.f);
        v.append(", confirmButtonText=");
        return xvz.n(v, this.g, Extension.C_BRAKE);
    }
}
