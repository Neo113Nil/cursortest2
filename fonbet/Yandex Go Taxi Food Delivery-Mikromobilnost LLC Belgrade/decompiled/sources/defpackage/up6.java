package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class up6 {
    public final String a;
    public final q8u0 b;
    public final q8u0 c;

    public up6(String str, q8u0 q8u0Var, q8u0 q8u0Var2) {
        this.a = str;
        this.b = q8u0Var;
        this.c = q8u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up6)) {
            return false;
        }
        up6 up6Var = (up6) obj;
        return jl40.l(this.a, up6Var.a) && this.b.equals(up6Var.b) && this.c.equals(up6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BudgetStartSearchEntity(requestId=" + this.a + ", processingInfo=" + this.b + ", timeoutInfo=" + this.c + Extension.C_BRAKE;
    }
}
