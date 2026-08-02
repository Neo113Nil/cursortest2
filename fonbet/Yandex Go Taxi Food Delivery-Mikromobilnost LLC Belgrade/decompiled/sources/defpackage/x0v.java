package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x0v {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public x0v(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0v)) {
            return false;
        }
        x0v x0vVar = (x0v) obj;
        return jl40.l(this.a, x0vVar.a) && jl40.l(this.b, x0vVar.b) && jl40.l(this.c, x0vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "HubOnboardingUiState(id=", this.a, ", title=", ", subtitle="), this.c, Extension.C_BRAKE);
    }
}
