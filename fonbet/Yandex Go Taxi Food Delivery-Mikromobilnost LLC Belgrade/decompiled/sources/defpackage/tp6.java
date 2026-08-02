package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tp6 {
    public final String a;
    public final vp6 b;

    public tp6(String str, vp6 vp6Var) {
        this.a = str;
        this.b = vp6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp6)) {
            return false;
        }
        tp6 tp6Var = (tp6) obj;
        return jl40.l(this.a, tp6Var.a) && this.b.equals(tp6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BudgetSearchSectionEntity(tabTitle=" + this.a + ", searchField=" + this.b + Extension.C_BRAKE;
    }
}
