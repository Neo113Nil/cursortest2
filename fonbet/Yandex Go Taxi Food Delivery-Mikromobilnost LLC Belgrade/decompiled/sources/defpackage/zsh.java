package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zsh extends lth {
    public final String a;
    public final String b;
    public final Integer c;

    public zsh(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsh)) {
            return false;
        }
        zsh zshVar = (zsh) obj;
        return jl40.l(this.a, zshVar.a) && jl40.l(this.b, zshVar.b) && jl40.l(this.c, zshVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return oo31.j(b64.v("OrderCreateRequested(type=", this.a, ", deliveryId=", this.b, ", revision="), this.c, Extension.C_BRAKE);
    }
}
