package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ru71 {
    public static final mr71 Companion = new mr71();
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final boolean d;

    public ru71(int i, boolean z, Boolean bool, Boolean bool2, boolean z2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, qo71.b);
            throw null;
        }
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru71)) {
            return false;
        }
        ru71 ru71Var = (ru71) obj;
        return this.a == ru71Var.a && jl40.l(this.b, ru71Var.b) && jl40.l(this.c, ru71Var.c) && this.d == ru71Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.a + ", ageRestrictedUser=" + this.b + ", hasUserConsent=" + this.c + ", hasCmpValue=" + this.d + Extension.C_BRAKE;
    }

    public ru71(Boolean bool, boolean z) {
        this.a = false;
        this.b = bool;
        this.c = null;
        this.d = z;
    }
}
