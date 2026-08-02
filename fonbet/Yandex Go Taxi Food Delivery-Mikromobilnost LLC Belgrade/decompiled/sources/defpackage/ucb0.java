package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ucb0 implements vcb0 {
    public final String a;
    public final Set b;

    public ucb0(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    @Override // defpackage.vcb0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb0)) {
            return false;
        }
        ucb0 ucb0Var = (ucb0) obj;
        return jl40.l(this.a, ucb0Var.a) && this.b.equals(ucb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Settings(filterId=" + tab0.a(this.a) + ", selectedSettings=" + this.b + Extension.C_BRAKE;
    }
}
