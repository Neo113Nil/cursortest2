package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class u95 extends v95 {
    public final String a;
    public final gvp0 b;

    public u95(String str, gvp0 gvp0Var) {
        this.a = str;
        this.b = gvp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u95)) {
            return false;
        }
        u95 u95Var = (u95) obj;
        return jl40.l(this.a, u95Var.a) && this.b.equals(u95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToggleFilterOption(id=" + this.a + ", option=" + this.b + Extension.C_BRAKE;
    }
}
