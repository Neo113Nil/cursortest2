package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class tyt implements b70 {
    public static final List a = scc.g("relativeCenter", "relativeRadius");

    public static lyt c(xdx xdxVar, c cVar) {
        myt mytVar = null;
        nyt nytVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                mytVar = (myt) l80.a(uyt.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new lyt(mytVar, nytVar);
                }
                nytVar = (nyt) l80.a(vyt.a).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, lyt lytVar) {
        bfxVar.A1("relativeCenter");
        l80.a(uyt.a).a(bfxVar, cVar, lytVar.a);
        bfxVar.A1("relativeRadius");
        l80.a(vyt.a).a(bfxVar, cVar, lytVar.b);
    }
}
