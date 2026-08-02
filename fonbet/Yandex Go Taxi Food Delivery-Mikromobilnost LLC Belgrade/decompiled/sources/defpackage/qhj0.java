package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qhj0 {
    public final String a;
    public final String b;

    public qhj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhj0)) {
            return false;
        }
        qhj0 qhj0Var = (qhj0) obj;
        return this.a.equals(qhj0Var.a) && this.b.equals(qhj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("InfoScreenText(title=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
