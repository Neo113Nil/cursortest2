package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x0a implements y0a {
    public final CharSequence a;
    public final CharSequence b;
    public final uj9 c;

    public x0a(CharSequence charSequence, CharSequence charSequence2, uj9 uj9Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0a)) {
            return false;
        }
        x0a x0aVar = (x0a) obj;
        return jl40.l(this.a, x0aVar.a) && jl40.l(this.b, x0aVar.b) && this.c.equals(x0aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TitleValue(title=", ", value=", ", valueAction=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
