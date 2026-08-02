package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x9o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public x9o(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9o)) {
            return false;
        }
        x9o x9oVar = (x9o) obj;
        return jl40.l(this.a, x9oVar.a) && jl40.l(this.b, x9oVar.b) && jl40.l(this.c, x9oVar.c) && jl40.l(this.d, x9oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("ErrorScreenText(errorTitleText=", this.a, ", errorSubtitleText=", this.b, ", closeButtonText="), this.c, ", reloadButtonText=", this.d, Extension.C_BRAKE);
    }
}
