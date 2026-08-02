package defpackage;

import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.e;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class y0w0 extends qc5 {
    public final w0w0 A;
    public final a1w0 B;
    public final e C;
    public final com.yandex.go.permission.location_with_agreement.interactor.e D;
    public final gei0 E;

    public y0w0(w0w0 w0w0Var, a1w0 a1w0Var, e eVar, com.yandex.go.permission.location_with_agreement.interactor.e eVar2, gei0 gei0Var, ney neyVar) {
        super(x0w0.class, neyVar);
        this.A = w0w0Var;
        this.B = a1w0Var;
        this.C = eVar;
        this.D = eVar2;
        this.E = gei0Var;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        Object value;
        super.Cg();
        e eVar = this.C;
        ((dae0) eVar.d).d(SuperAppMainOnboardingView.ONBOARDING_POPUP_ID);
        r0 r0Var = eVar.b.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, c1w0.a((c1w0) value, null, 13)));
    }
}
