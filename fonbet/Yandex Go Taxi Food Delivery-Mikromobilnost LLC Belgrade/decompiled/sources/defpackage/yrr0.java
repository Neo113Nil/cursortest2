package defpackage;

import android.content.Context;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import com.yandex.go.sharing_personal_goals.c;
import defpackage.agd;
import defpackage.edd;
import defpackage.lsr0;
import defpackage.orr0;
import defpackage.rol0;
import defpackage.rsr0;
import defpackage.tje;
import defpackage.tls;
import defpackage.xrr0;
import defpackage.yfd;
import defpackage.yrr0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class yrr0 extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final y50 H;
    public final mu5 I;

    public yrr0(final rsr0 rsr0Var, final c cVar, Context context, w030 w030Var, y50 y50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = y50Var;
        this.I = new mu5(new tls() { // from class: com.yandex.go.sharing_personal_goals.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final yrr0 yrr0Var = yrr0.this;
                final xrr0 xrr0Var = new xrr0(yrr0Var);
                SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = ((orr0) ((agd) yfdVar).a).a;
                rsr0 rsr0Var2 = rsr0Var;
                rsr0Var2.getClass();
                m0 m0Var = new m0(new rol0(new SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1(rsr0Var2, sharingPersonalGoalsServiceName, null)), e.d(rsr0Var2.b.a), new SharingPersonalGoalsUiStateInteractor$uiStateFlow$1(3, null));
                agd agdVar = (agd) yfdVar;
                agdVar.c = m0Var;
                final c cVar2 = cVar;
                agdVar.e = new tls() { // from class: com.yandex.go.sharing_personal_goals.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(yrr0.this.o(), null, null, new SharingPersonalGoalsRouterImpl$content$1$1$1(cVar2, (lsr0) obj2, xrr0Var, yfdVar, null), 3);
                        return zy11.a;
                    }
                };
                edd.a.getClass();
                agdVar.g = edd.b;
                return zy11.a;
            }
        });
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.I;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
