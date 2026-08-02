package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rzj0 {
    public final szj0 a;
    public final v8u0 b;
    public final v8u0 c;

    public rzj0(szj0 szj0Var, v8u0 v8u0Var, v8u0 v8u0Var2) {
        this.a = szj0Var;
        this.b = v8u0Var;
        this.c = v8u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzj0)) {
            return false;
        }
        rzj0 rzj0Var = (rzj0) obj;
        return this.a.equals(rzj0Var.a) && this.b.equals(rzj0Var.b) && this.c.equals(rzj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ResultPageDataEntity(loading=" + this.a + ", timeout=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
