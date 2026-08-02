package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqpn;", "Lxpn;", "Companion", "opn", "ppn", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class qpn extends xpn {
    public static final ppn Companion = new ppn();
    public final String a;
    public final Object b;

    public qpn(String str, int i, Object obj) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpn)) {
            return false;
        }
        qpn qpnVar = (qpn) obj;
        return jl40.l(this.a, qpnVar.a) && jl40.l(this.b, qpnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "SetRequirement(requirementName=" + this.a + ", requirementValue=" + this.b + Extension.C_BRAKE;
    }

    public qpn() {
        this.a = "";
        this.b = null;
    }
}
