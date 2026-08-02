package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r57 {
    public final d37 a;
    public final d37 b;

    public r57(d37 d37Var, d37 d37Var2) {
        this.a = d37Var;
        this.b = d37Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r57)) {
            return false;
        }
        r57 r57Var = (r57) obj;
        return this.a.equals(r57Var.a) && this.b.equals(r57Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonsState(cancelButton=" + this.a + ", confirmButton=" + this.b + Extension.C_BRAKE;
    }
}
