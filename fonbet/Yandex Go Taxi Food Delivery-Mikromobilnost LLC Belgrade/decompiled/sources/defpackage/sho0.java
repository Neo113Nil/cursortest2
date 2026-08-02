package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sho0 implements tho0 {
    public final String a;
    public final Set b;

    public sho0(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sho0)) {
            return false;
        }
        sho0 sho0Var = (sho0) obj;
        return jl40.l(this.a, sho0Var.a) && this.b.equals(sho0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartNewVerification(storyId=" + this.a + ", requiredExams=" + this.b + Extension.C_BRAKE;
    }
}
