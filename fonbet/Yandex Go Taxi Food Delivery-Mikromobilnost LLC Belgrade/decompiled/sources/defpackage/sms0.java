package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sms0 {
    public final rbv a;
    public final boolean b;

    public sms0(mbv mbvVar, boolean z) {
        this.a = mbvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sms0)) {
            return false;
        }
        sms0 sms0Var = (sms0) obj;
        return jl40.l(this.a, sms0Var.a) && this.b == sms0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SkinSelectionEntity(selectionImage=" + this.a + ", showOnboarding=" + this.b + Extension.C_BRAKE;
    }
}
