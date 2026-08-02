package defpackage;

import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class si90 {
    public final ti90 a;
    public final PartnerWithAction$Status b;

    public si90(ti90 ti90Var, PartnerWithAction$Status partnerWithAction$Status) {
        this.a = ti90Var;
        this.b = partnerWithAction$Status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si90)) {
            return false;
        }
        si90 si90Var = (si90) obj;
        return jl40.l(this.a, si90Var.a) && this.b == si90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerWithAction(partner=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
