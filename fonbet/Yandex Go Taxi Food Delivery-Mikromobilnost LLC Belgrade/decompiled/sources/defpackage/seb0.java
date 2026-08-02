package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lseb0;", "Lafi;", "Companion", "reb0", "qeb0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class seb0 implements afi {
    public static final reb0 Companion = new reb0();
    public final String a;
    public final agb0 b;

    public seb0(int i, String str, agb0 agb0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) != 0) {
            this.b = agb0Var;
        } else {
            agb0.Companion.getClass();
            this.b = agb0.g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seb0)) {
            return false;
        }
        seb0 seb0Var = (seb0) obj;
        return jl40.l(this.a, seb0Var.a) && jl40.l(this.b, seb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneDeliveryOption(label=" + this.a + ", selectScreenOptions=" + this.b + Extension.C_BRAKE;
    }

    public seb0() {
        agb0.Companion.getClass();
        agb0 agb0Var = agb0.g;
        this.a = "";
        this.b = agb0Var;
    }
}
