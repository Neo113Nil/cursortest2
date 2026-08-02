package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wec0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final fr d;

    public wec0(String str, String str2, CharSequence charSequence, fr frVar) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wec0)) {
            return false;
        }
        wec0 wec0Var = (wec0) obj;
        return jl40.l(this.a, wec0Var.a) && jl40.l(this.b, wec0Var.b) && jl40.l(this.c, wec0Var.c) && jl40.l(this.d, wec0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        fr frVar = this.d;
        return hashCode + (frVar != null ? frVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(imageTag=", this.a, ", imageUrl=", this.b, ", contentDescription=");
        v.append((Object) this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
