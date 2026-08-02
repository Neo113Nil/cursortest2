package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z3m {
    public final String a;
    public final String b;
    public final CharSequence c;

    public z3m(CharSequence charSequence, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3m)) {
            return false;
        }
        z3m z3mVar = (z3m) obj;
        return jl40.l(this.a, z3mVar.a) && jl40.l(this.b, z3mVar.b) && jl40.l(this.c, z3mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.n(b64.v("DoneButton(id=", this.a, ", analyticsId=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }
}
