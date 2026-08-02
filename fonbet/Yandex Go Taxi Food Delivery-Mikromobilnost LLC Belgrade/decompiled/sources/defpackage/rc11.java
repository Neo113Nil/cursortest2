package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrc11;", "Ltc11;", "Companion", "pc11", "qc11", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class rc11 implements tc11 {
    public static final qc11 Companion = new qc11();
    public final int a;
    public final boolean b;
    public final String c;

    public /* synthetic */ rc11(int i, String str, boolean z, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc11)) {
            return false;
        }
        rc11 rc11Var = (rc11) obj;
        return this.a == rc11Var.a && this.b == rc11Var.b && jl40.l(this.c, rc11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TipsButtonsDto(buttonsCount=");
        sb.append(this.a);
        sb.append(", isCustomAllowed=");
        sb.append(this.b);
        sb.append(", customButtonTextKey=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public rc11() {
        this.a = 0;
        this.b = false;
        this.c = "";
    }
}
