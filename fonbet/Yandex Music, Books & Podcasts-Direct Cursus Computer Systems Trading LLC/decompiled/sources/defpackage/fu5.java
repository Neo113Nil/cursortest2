package defpackage;

import j$.time.ZonedDateTime;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class fu5 {
    public final gs4 a;
    public final uu5 b;

    public fu5(gs4 gs4Var, uu5 uu5Var) {
        this.a = gs4Var;
        this.b = uu5Var;
    }

    public final pw5 a(us5 us5Var) {
        us5Var.getClass();
        gs4 gs4Var = this.a;
        int i = ((gw5) gs4Var.a).a;
        wy5 wy5Var = (wy5) gs4Var.b;
        wy5Var.getClass();
        return pcg.P(wy5Var, this.b, ocg.E(us5Var, i), us5Var.e);
    }

    public final String b(us5 us5Var) {
        us5Var.getClass();
        h06 E = ocg.E(us5Var, 0);
        StringBuilder sb = new StringBuilder();
        String str = E.e;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                sb.append(str);
                sb.append(" · ");
            }
        }
        ZonedDateTime zonedDateTime = E.f;
        zonedDateTime.getClass();
        sb.append(((sld) this.b.e).I(zonedDateTime));
        String str2 = E.g;
        if (str2 != null) {
            String str3 = StringsKt.U(str2) ? null : str2;
            if (str3 != null) {
                sb.append(" · ");
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
