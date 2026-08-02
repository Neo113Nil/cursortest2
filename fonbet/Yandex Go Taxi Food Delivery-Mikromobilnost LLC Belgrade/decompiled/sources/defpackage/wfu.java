package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class wfu implements b70 {
    public static final List a = scc.g("a", "hex");

    public static vfu c(xdx xdxVar, c cVar) {
        Double d = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new vfu(d.doubleValue(), str);
                }
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, vfu vfuVar) {
        bfxVar.A1("a");
        l80.c.a(bfxVar, cVar, Double.valueOf(vfuVar.a));
        bfxVar.A1("hex");
        foe foeVar = l80.a;
        bfxVar.r0(vfuVar.b);
    }
}
