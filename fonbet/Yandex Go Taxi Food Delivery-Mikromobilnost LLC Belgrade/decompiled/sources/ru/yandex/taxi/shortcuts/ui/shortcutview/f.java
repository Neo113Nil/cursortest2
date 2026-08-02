package ru.yandex.taxi.shortcuts.ui.shortcutview;

import android.os.SystemClock;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import defpackage.bkt0;
import defpackage.c3s0;
import defpackage.e6v;
import defpackage.ga5;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.j800;
import defpackage.jc00;
import defpackage.kc00;
import defpackage.ms2;
import defpackage.ney;
import defpackage.o1s0;
import defpackage.o3s0;
import defpackage.o4s0;
import defpackage.os2;
import defpackage.pzr0;
import defpackage.pzt0;
import defpackage.q3s0;
import defpackage.qc5;
import defpackage.sxr0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u8w0;
import defpackage.w6r;
import defpackage.wr00;
import defpackage.yaf0;
import java.util.HashMap;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes6.dex */
public final class f extends qc5 {
    public final tt2 A;
    public final bkt0 B;
    public final pzr0 C;
    public final sxr0 D;
    public final ms2 E;
    public final o1s0 F;
    public final j800 G;
    public final o3s0 H;
    public final com.yandex.go.shortcuts.impl.router.b I;
    public final ru.yandex.taxi.perf.screen.c J;
    public final jc00 K;
    public final u8w0 L;
    public final com.yandex.go.shortcuts.impl.router.a M;
    public final w6r N;
    public final com.yandex.go.shortcuts.impl.b O;
    public final q3s0 P;
    public final h3y Q;
    public final wr00 R;
    public final o4s0 S;
    public ga5 T;
    public pzt0 U;
    public pzt0 V;
    public boolean W;
    public boolean Z;

    public f(ney neyVar, tt2 tt2Var, bkt0 bkt0Var, pzr0 pzr0Var, sxr0 sxr0Var, ms2 ms2Var, o1s0 o1s0Var, j800 j800Var, o3s0 o3s0Var, com.yandex.go.shortcuts.impl.router.b bVar, ru.yandex.taxi.perf.screen.c cVar, jc00 jc00Var, u8w0 u8w0Var, com.yandex.go.shortcuts.impl.router.a aVar, w6r w6rVar, com.yandex.go.shortcuts.impl.b bVar2, q3s0 q3s0Var, h3y h3yVar, wr00 wr00Var, o4s0 o4s0Var) {
        super(c3s0.class, neyVar);
        this.A = tt2Var;
        this.B = bkt0Var;
        this.C = pzr0Var;
        this.D = sxr0Var;
        this.E = ms2Var;
        this.F = o1s0Var;
        this.G = j800Var;
        this.H = o3s0Var;
        this.I = bVar;
        this.J = cVar;
        this.K = jc00Var;
        this.L = u8w0Var;
        this.M = aVar;
        this.N = w6rVar;
        this.O = bVar2;
        this.P = q3s0Var;
        this.Q = h3yVar;
        this.R = wr00Var;
        this.S = o4s0Var;
        this.W = true;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        com.yandex.go.shortcuts.impl.analytic.a aVar = (com.yandex.go.shortcuts.impl.analytic.a) this.D;
        aVar.h.b();
        pzt0 pzt0Var = this.V;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G.k = null;
        com.yandex.go.shortcuts.impl.router.b bVar = this.I;
        pzt0 pzt0Var2 = bVar.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        bVar.g = null;
        bVar.b.c.clear();
        ((HashMap) this.M.d.getValue()).clear();
        aVar.p.clear();
    }

    @Override // defpackage.qc5
    public final void Lg() {
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void Mg(e6v e6vVar) {
        if (Eg() && this.c) {
            ((ru.yandex.taxi.persuggest.source.f) this.N).c(FinalSuggestScreen.ADDRESSES_SUFFIX);
            if (e6vVar instanceof ga5) {
                ga5 ga5Var = (ga5) e6vVar;
                if (ga5Var.getBase().e == BaseShortcutModel$Source.ITEMS && ga5Var.getBase().f == OfferType.MEDIA && !((c3s0) Dg()).ub(e6vVar) && this.T == null) {
                    this.T = ga5Var;
                    ((c3s0) Dg()).r7(e6vVar);
                    return;
                }
            }
            pzt0 pzt0Var = this.V;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.V = com.yandex.go.coroutines.b.g(Jg(), null, null, new ShortcutsViewPresenter$onItemClick$1(this, e6vVar, null), 3);
        }
    }

    public final void Ng(boolean z, boolean z2) {
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        o1s0 o1s0Var = this.F;
        if (o1s0Var.a() != yaf0.b) {
            if (o1s0Var.a() == yaf0.c) {
                ic00 ic00Var = ((kc00) this.K).a;
                ic00Var.getClass();
                if (ic00Var instanceof hc00) {
                    return;
                }
            }
            Milestone milestone = Milestone.MainScreenData;
            ms2 ms2Var = this.E;
            ms2Var.getClass();
            ((os2) ms2Var).d(milestone, SystemClock.elapsedRealtime());
            this.U = tje.N(Jg(), null, null, new ShortcutsViewPresenter$startObserveViewModelChanges$1(this, z, z2, null), 3);
        }
    }

    @Override // defpackage.qc5
    public final void onStart() {
        Ng(false, this.W);
        this.W = false;
    }
}
