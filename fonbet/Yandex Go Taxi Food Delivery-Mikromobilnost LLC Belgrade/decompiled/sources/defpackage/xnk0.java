package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xnk0 {
    public final String a;
    public final String b;
    public final bdc c;

    public xnk0(String str, String str2, bdc bdcVar) {
        this.a = str;
        this.b = str2;
        this.c = bdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnk0)) {
            return false;
        }
        xnk0 xnk0Var = (xnk0) obj;
        return this.a.equals(xnk0Var.a) && this.b.equals(xnk0Var.b) && this.c.equals(xnk0Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Timer(timer=", this.a, ", contentDescription=", this.b, ", textColor=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
