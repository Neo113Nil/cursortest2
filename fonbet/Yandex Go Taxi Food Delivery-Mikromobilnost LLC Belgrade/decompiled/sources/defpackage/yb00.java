package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.preorder.source.domain.a;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class yb00 {
    public final wiq0 a;
    public final arv0 b;
    public final c c;
    public final c9l0 d;
    public final e e;
    public final q4 f;
    public final tte0 g;
    public final c4r0 h;
    public final p i;
    public final c8r j;

    public yb00(wiq0 wiq0Var, arv0 arv0Var, c cVar, c9l0 c9l0Var, e eVar, q4 q4Var, tte0 tte0Var, c4r0 c4r0Var, p pVar, c8r c8rVar) {
        this.a = wiq0Var;
        this.b = arv0Var;
        this.c = cVar;
        this.d = c9l0Var;
        this.e = eVar;
        this.f = q4Var;
        this.g = tte0Var;
        this.h = c4r0Var;
        this.i = pVar;
        this.j = c8rVar;
    }

    public final void a(SelectionOrigin selectionOrigin, boolean z, boolean z2) {
        fnx0 l = ((k) this.a).l();
        if (l != null) {
            this.h.a(new gnx0(new fnx0(l.a, selectionOrigin), true));
        }
        ((a7t0) this.b).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        xb00 xb00Var = new xb00(z, this, bov0.e, z2);
        tte0 tte0Var = this.g;
        a aVar = tte0Var.a;
        aVar.a(tte0Var.c);
        aVar.e(xb00Var);
    }

    public final void b(k9s0 k9s0Var) {
        String str = k9s0Var.b;
        String str2 = k9s0Var.a;
        boolean z = true;
        if (str != null || str2 != null) {
            mi31 a = this.j.a(str, (str2 == null || evu0.J(str2)) ? "" : str2, null);
            if (a == null) {
                return;
            }
            SelectionOrigin selectionOrigin = k9s0Var.d;
            if (selectionOrigin == null) {
                selectionOrigin = SelectionOrigin.SHORTCUT;
            }
            pex0 pex0Var = a.a;
            if (str2 == null || evu0.J(str2)) {
                str2 = "";
            }
            this.h.a(new gnx0(new fnx0(pex0Var, str2, selectionOrigin), true));
        }
        String str3 = k9s0Var.c;
        ((a7t0) this.b).b(str3 != null ? new yqv0(SummaryUiState$Type.TRAP, str3) : new yqv0(SummaryUiState$Type.NORMAL, ""));
        xb00 xb00Var = new xb00(false, this, k9s0Var.e, z);
        tte0 tte0Var = this.g;
        a aVar = tte0Var.a;
        aVar.a(tte0Var.c);
        aVar.e(xb00Var);
    }
}
