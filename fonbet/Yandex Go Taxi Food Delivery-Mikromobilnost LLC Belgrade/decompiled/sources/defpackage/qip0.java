package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qip0 {
    public final String a;
    public final String b;
    public final tls c;

    public qip0(String str, String str2, tls tlsVar) {
        this.a = str;
        this.b = str2;
        this.c = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qip0)) {
            return false;
        }
        qip0 qip0Var = (qip0) obj;
        return jl40.l(this.a, qip0Var.a) && jl40.l(this.b, qip0Var.b) && this.c.equals(qip0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScrollTagModel(id=", this.a, ", text=", this.b, ", onClick=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
