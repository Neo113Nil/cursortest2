package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public abstract class ync0 implements b70 {
    public static final List a = scc.g(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "link");

    public static wnc0 c(xdx xdxVar, c cVar) {
        vnc0 vnc0Var = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                xnc0 xnc0Var = xnc0.a;
                foe foeVar = l80.a;
                vnc0Var = (vnc0) new ep60(xnc0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new wnc0(vnc0Var, str);
                }
                foe foeVar2 = l80.a;
                str = xdxVar.nextString();
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, wnc0 wnc0Var) {
        bfxVar.A1(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        xnc0 xnc0Var = xnc0.a;
        foe foeVar = l80.a;
        vnc0 vnc0Var = wnc0Var.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            xnc0Var.a(bfxVar, cVar, vnc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            xnc0Var.a(ek00Var2, cVar, vnc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("link");
        bfxVar.r0(wnc0Var.b);
    }
}
