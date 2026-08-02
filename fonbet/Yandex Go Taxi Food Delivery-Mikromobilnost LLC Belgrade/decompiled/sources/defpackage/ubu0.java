package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ubu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final Long f;

    public ubu0(int i, Long l, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubu0)) {
            return false;
        }
        ubu0 ubu0Var = (ubu0) obj;
        return jl40.l(this.a, ubu0Var.a) && jl40.l(this.b, ubu0Var.b) && jl40.l(this.c, ubu0Var.c) && jl40.l(this.d, ubu0Var.d) && this.e == ubu0Var.e && jl40.l(this.f, ubu0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int b2 = oyr.b(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.f;
        return b2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("StickerEntity(id=", this.a, ", packId=", this.b, ", originalPackId=");
        g8e.D(v, this.c, ", text=", this.d, ", position=");
        v.append(this.e);
        v.append(", addedTimestamp=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
