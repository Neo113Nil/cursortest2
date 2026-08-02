package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public final class vec implements b70 {
    public static final vec a = new vec();
    public static final List b = scc.g(RemoteBioParameters.X, RemoteBioParameters.Y);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        iec iecVar = (iec) obj;
        bfxVar.A1(RemoteBioParameters.X);
        foe foeVar = l80.c;
        foeVar.a(bfxVar, cVar, Double.valueOf(iecVar.a));
        bfxVar.A1(RemoteBioParameters.Y);
        foeVar.a(bfxVar, cVar, Double.valueOf(iecVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Double d = null;
        Double d2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new iec(d.doubleValue(), d2.doubleValue());
                }
                d2 = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
