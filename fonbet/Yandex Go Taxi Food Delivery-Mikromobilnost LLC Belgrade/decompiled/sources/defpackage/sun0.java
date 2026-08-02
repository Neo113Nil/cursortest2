package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sun0 {
    public final boolean a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;

    public sun0(boolean z, String str, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        this.a = z;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = list;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = charSequence5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sun0)) {
            return false;
        }
        sun0 sun0Var = (sun0) obj;
        return this.a == sun0Var.a && jl40.l(this.b, sun0Var.b) && jl40.l(this.c, sun0Var.c) && jl40.l(this.d, sun0Var.d) && jl40.l(this.e, sun0Var.e) && jl40.l(this.f, sun0Var.f) && jl40.l(this.g, sun0Var.g) && jl40.l(this.h, sun0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + smw0.b(smw0.b(unr0.c(smw0.b(smw0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ScootersInsuranceSuggestV2UiState(isLoading=", ", topImageTag=", this.b, ", title=", this.a);
        vfc.A(v, this.c, ", subtitle=", this.d, ", groups=");
        v.append(this.e);
        v.append(", rejectButtonText=");
        v.append((Object) this.f);
        v.append(", confirmButtonText=");
        v.append((Object) this.g);
        v.append(", bottomProviderInfoText=");
        v.append((Object) this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
