package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zfe {
    public final CharSequence a;
    public final wib b;
    public final boolean c;
    public final boolean d;

    public zfe(String str, wib wibVar, boolean z, boolean z2) {
        this.a = str;
        this.b = wibVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfe)) {
            return false;
        }
        zfe zfeVar = (zfe) obj;
        return jl40.l(this.a, zfeVar.a) && jl40.l(this.b, zfeVar.b) && this.c == zfeVar.c && this.d == zfeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FooterButton(title=");
        sb.append((Object) this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", enabled=");
        return smw0.k(", isLoading=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
