package defpackage;

import android.content.Context;
import com.yandex.go.multimodal_route.interactors.b;
import com.yandex.go.multimodal_route.ui.onboarding.c;
import defpackage.agd;
import defpackage.alb0;
import defpackage.bu40;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt40;
import defpackage.ut40;
import defpackage.yfd;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class ut40 extends pgd {
    public final fl10 F;
    public final c G;
    public final b H;
    public final Context I;
    public final d130 J;
    public final mu5 K;

    public ut40(fl10 fl10Var, c cVar, b bVar, Context context, d130 d130Var) {
        super(0);
        this.F = fl10Var;
        this.G = cVar;
        this.H = bVar;
        this.I = context;
        this.J = d130Var;
        this.K = new mu5(new tls() { // from class: com.yandex.go.multimodal_route.ui.onboarding.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final ut40 ut40Var = ut40.this;
                final tt40 tt40Var = new tt40(ut40Var);
                ((agd) yfdVar).c = new rol0(new MultimodalRouteOnboardingRouter$content$1$1(ut40Var, yfdVar, null));
                tls tlsVar = new tls() { // from class: com.yandex.go.multimodal_route.ui.onboarding.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ut40 ut40Var2 = ut40.this;
                        tje.N(ut40Var2.o(), null, null, new MultimodalRouteOnboardingRouter$content$1$2$1(ut40Var2, yfdVar, (bu40) obj2, tt40Var, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar = (agd) yfdVar;
                agdVar.e = tlsVar;
                agdVar.g = new androidx.compose.runtime.internal.a(1625155190, new alb0(18, ut40Var), true);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.H.b.a("multimodal_route_onboarding").u("is_need_show_onboarding", false);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.I;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.J;
    }
}
