package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ux11 implements m1j {
    public final Set a;
    public final String b;
    public final i911 c;
    public final String d;

    public ux11(Set set, String str, i911 i911Var, String str2) {
        this.a = set;
        this.b = str;
        this.c = i911Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux11)) {
            return false;
        }
        ux11 ux11Var = (ux11) obj;
        return jl40.l(this.a, ux11Var.a) && this.b.equals(ux11Var.b) && this.c.equals(ux11Var.c) && jl40.l(this.d, ux11Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UndergroundBoardingPositions(wagons=" + this.a + ", contentDescription=" + ((Object) this.b) + ", transportType=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
