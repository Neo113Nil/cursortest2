package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tk70 {
    public final String a;
    public final String b;
    public final rk70 c;
    public final sk70 d;
    public final ok70 e;
    public final nk70 f;

    static {
        int i = ol70.e;
    }

    public tk70(String str, String str2, rk70 rk70Var, sk70 sk70Var, ok70 ok70Var, nk70 nk70Var) {
        this.a = str;
        this.b = str2;
        this.c = rk70Var;
        this.d = sk70Var;
        this.e = ok70Var;
        this.f = nk70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk70)) {
            return false;
        }
        tk70 tk70Var = (tk70) obj;
        return jl40.l(this.a, tk70Var.a) && jl40.l(this.b, tk70Var.b) && jl40.l(this.c, tk70Var.c) && jl40.l(this.d, tk70Var.d) && jl40.l(this.e, tk70Var.e) && jl40.l(this.f, tk70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.c((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("ModalViewPayload(orderId=", this.a, ", type=", this.b, ", image=");
        v.append(this.c);
        v.append(", titleAndText=");
        v.append(this.d);
        v.append(", cancelItems=");
        v.append(this.e);
        v.append(", buttons=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
