package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public abstract class xoc0 implements b70 {
    public static final List a = scc.g(RemoteBioParameters.X, RemoteBioParameters.Y);

    public static woc0 c(xdx xdxVar, c cVar) {
        Double d = null;
        Double d2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new woc0(d.doubleValue(), d2.doubleValue());
                }
                d2 = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, woc0 woc0Var) {
        bfxVar.A1(RemoteBioParameters.X);
        foe foeVar = l80.c;
        foeVar.a(bfxVar, cVar, Double.valueOf(woc0Var.a));
        bfxVar.A1(RemoteBioParameters.Y);
        foeVar.a(bfxVar, cVar, Double.valueOf(woc0Var.b));
    }
}
