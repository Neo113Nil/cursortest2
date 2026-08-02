package defpackage;

import android.net.Uri;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zsn implements ui4 {
    public final h03 a;
    public final h03 b;
    public final m40 c;
    public final g0c d;
    public boolean e;
    public boolean f;
    public boolean g;

    public zsn(h03 h03Var, h03 h03Var2, m40 m40Var, g0c g0cVar) {
        this.a = h03Var;
        this.b = h03Var2;
        this.c = m40Var;
        this.d = g0cVar;
    }

    @Override // defpackage.ui4
    public final jtp d(wi4 wi4Var) {
        wi4Var.getClass();
        String str = wi4Var.a;
        return str.equals("success") ? nif.d(fgk.a) : str.equals("wait_for_processing") ? nif.d(fgk.b) : nif.c(new k03(q1c.b, r1c.a, null, str, hrg.q("Unable to convert status ", str, " to PollingResult")));
    }

    @Override // defpackage.ui4
    public final y7o g(wi4 wi4Var) {
        ft7 ft7Var;
        wi4Var.getClass();
        String str = wi4Var.a;
        String str2 = wi4Var.e;
        String str3 = wi4Var.d;
        iek iekVar = wi4Var.g;
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -369265581) {
                if (hashCode == 210861611 && str.equals("wait_for_notification")) {
                    if (str2 != null) {
                        try {
                            if (!this.e) {
                                this.e = true;
                                try {
                                    String uri = new URI(str2).toString();
                                    uri.getClass();
                                    Uri parse = Uri.parse(uri);
                                    parse.getClass();
                                    ft7Var = new ft7(parse);
                                } catch (Throwable unused) {
                                    ft7Var = null;
                                }
                                if (ft7Var == null) {
                                    return new y7o(null, cxb.X(str2, "redirectURL", wi4Var));
                                }
                                this.a.invoke(ft7Var);
                            }
                        } catch (RuntimeException e) {
                            return new y7o(null, cxb.L(wi4Var, e));
                        }
                    }
                    if (!this.f && (Intrinsics.d(str3, "success") || Intrinsics.d(str3, "failed"))) {
                        this.f = true;
                        this.b.invoke(str3);
                    }
                    if (iekVar != null && !this.g && (iekVar.b.equals("amount_expected") || iekVar.b.equals("sms_code_expected"))) {
                        this.g = true;
                        ((x60) this.d).a(gut.K0(iekVar.a.a, iekVar.c, iekVar.e));
                        this.c.invoke(iekVar);
                    }
                    return ngg.F(ggm.retry);
                }
            } else if (str.equals("wait_for_processing")) {
                return ngg.F(ggm.done);
            }
        } else if (str.equals("success")) {
            return ngg.F(ggm.done);
        }
        return new y7o(null, cxb.o0(wi4Var));
    }
}
