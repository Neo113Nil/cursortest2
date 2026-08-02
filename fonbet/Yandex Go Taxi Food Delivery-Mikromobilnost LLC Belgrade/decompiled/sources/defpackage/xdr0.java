package defpackage;

import com.yandex.go.inapp_calls.experiment.o;
import com.yandex.go.inapp_calls.experiment.p;
import com.yandex.go.styling.interactor.a;
import com.yandex.go.user_profile.main_menu.log_out.domain.c;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import com.yandex.go.user_profile.settings.profile.data.b;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes13.dex */
public final class xdr0 {
    public final ydr0 a;
    public final a b;
    public final mgh c;
    public final q3g0 d;
    public final c e;
    public final j20 f;
    public final l8w0 g;
    public final p h;
    public final rkv i;
    public final qmp j;
    public final x2r0 k;
    public final jer0 l;
    public final com.yandex.go.settings.domain.c m;

    public xdr0(ydr0 ydr0Var, a aVar, mgh mghVar, q3g0 q3g0Var, c cVar, j20 j20Var, l8w0 l8w0Var, p pVar, rkv rkvVar, qmp qmpVar, x2r0 x2r0Var, jer0 jer0Var, com.yandex.go.settings.domain.c cVar2) {
        this.a = ydr0Var;
        this.b = aVar;
        this.c = mghVar;
        this.d = q3g0Var;
        this.e = cVar;
        this.f = j20Var;
        this.g = l8w0Var;
        this.h = pVar;
        this.i = rkvVar;
        this.j = qmpVar;
        this.k = x2r0Var;
        this.l = jer0Var;
        this.m = cVar2;
    }

    public final tpr a() {
        tpr g92Var;
        boolean a = this.g.a();
        int i = 2;
        if (a) {
            g92Var = this.e.a();
        } else {
            if (a) {
                w511.b();
                return null;
            }
            g92Var = new g92(i, MainMenuLogOutUiState.NONE);
        }
        com.yandex.go.settings.mvp.c cVar = new com.yandex.go.settings.mvp.c(((b) this.f).a());
        com.yandex.go.user_profile.settings.style.domain.b bVar = new com.yandex.go.user_profile.settings.style.domain.b(this.a.a.a());
        tpr a2 = this.b.a();
        tpr tprVar = (tpr) ((pgh) this.c).c.getValue();
        tpr b = d.b(this.d.a);
        jer0 jer0Var = this.l;
        return e.t(new com.yandex.go.settings.mvp.a(new tpr[]{bVar, a2, tprVar, b, jer0Var.d, g92Var, cVar, jer0Var.e, new o(d.b(this.h.a)), this.m.c}, this));
    }
}
