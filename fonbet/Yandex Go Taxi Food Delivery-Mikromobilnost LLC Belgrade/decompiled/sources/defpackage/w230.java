package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w230 {
    public final String a;
    public final czh b;

    public w230(String str, czh czhVar) {
        this.a = str;
        this.b = czhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w230)) {
            return false;
        }
        w230 w230Var = (w230) obj;
        return jl40.l(this.a, w230Var.a) && jl40.l(this.b, w230Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ModalViewRouterData(id=" + this.a + ", router=" + this.b + Extension.C_BRAKE;
    }
}
