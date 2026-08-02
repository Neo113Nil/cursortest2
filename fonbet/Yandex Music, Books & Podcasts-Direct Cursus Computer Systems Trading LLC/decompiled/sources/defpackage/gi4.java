package defpackage;

import android.net.Uri;
import java.net.URI;

/* loaded from: classes5.dex */
public final class gi4 {
    public final jzi a;
    public final g0c b;
    public boolean c;
    public boolean d;

    public /* synthetic */ gi4(jzi jziVar, g0c g0cVar) {
        this.a = jziVar;
        this.b = g0cVar;
    }

    public y7o a(cj4 cj4Var) {
        ft7 ft7Var;
        try {
            String str = cj4Var.c;
            if (str != null && !this.c) {
                this.c = true;
                try {
                    String uri = new URI(str).toString();
                    uri.getClass();
                    Uri parse = Uri.parse(uri);
                    parse.getClass();
                    ft7Var = new ft7(parse);
                } catch (Throwable unused) {
                    ft7Var = null;
                }
                if (ft7Var == null) {
                    return new y7o(null, pd.x(cj4Var));
                }
                ((x60) this.b).a(gut.u());
                this.a.m(ft7Var);
            }
            return ngg.F(ggm.retry);
        } catch (RuntimeException e) {
            cj4Var.getClass();
            String message = e instanceof r7w ? ((r7w) e).getMessage() : String.valueOf(e);
            q1c q1cVar = q1c.f;
            r1c r1cVar = r1c.a;
            String str2 = cj4Var.a;
            return new y7o(null, new k03(q1cVar, r1cVar, null, str2, hrg.s("Failed to handle 3ds challenge for response: ", su4.o(f1d.m("<VerificationResponse: status - ", str2, ", status code - ", cj4Var.b, ", rc - "), cj4Var.e, ">"), ", error: \"", message, "\"")));
        }
    }
}
