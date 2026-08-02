package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vsh extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final jw7 d;

    public vsh(String str, String str2, String str3, jw7 jw7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsh)) {
            return false;
        }
        vsh vshVar = (vsh) obj;
        return jl40.l(this.a, vshVar.a) && jl40.l(this.b, vshVar.b) && jl40.l(this.c, vshVar.c) && this.d.equals(vshVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderCancelFailed(type=", this.a, ", requestId=", this.b, ", deliveryId=");
        v.append(this.c);
        v.append(", message=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
