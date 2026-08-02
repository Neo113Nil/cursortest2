package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import com.yandex.go.coroutines.b;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import defpackage.ad5;
import defpackage.az91;
import defpackage.bvf0;
import defpackage.dvm;
import defpackage.ha2;
import defpackage.jqr;
import defpackage.py91;
import defpackage.pzt0;
import defpackage.swm;
import defpackage.tt2;
import defpackage.twm;
import defpackage.uvm;
import defpackage.uyj;
import defpackage.yzh;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.due_selector.impl.domain.interactor.d;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final d A;
    public final tt2 B;
    public final dvm C;
    public final ru.yandex.taxi.due_selector.impl.domain.interactor.a D;
    public final az91 E;
    public final AtomicBoolean F;
    public final swm G;
    public final swm H;
    public swm I;
    public pzt0 J;
    public final r0 K;
    public final String x;
    public final py91 y;
    public final yzh z;

    public a(String str, py91 py91Var, yzh yzhVar, d dVar, tt2 tt2Var, dvm dvmVar, ru.yandex.taxi.due_selector.impl.domain.interactor.a aVar, az91 az91Var) {
        super(twm.class);
        this.x = str;
        this.y = py91Var;
        this.z = yzhVar;
        this.A = dVar;
        this.B = tt2Var;
        this.C = dvmVar;
        this.D = aVar;
        this.E = az91Var;
        this.F = new AtomicBoolean(false);
        swm swmVar = new swm(DuePickerStateInfo$PickerState.LOADING);
        this.G = swmVar;
        this.H = new swm(DuePickerStateInfo$PickerState.ERROR);
        this.I = swmVar;
        this.K = bvf0.c(dVar.e.b());
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bvf0.j(this.D.g, null);
        this.C.b(this.x, DueAnalyticViewType.DEFAULT);
        r0 r0Var = this.A.h.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void Kg() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        az91 az91Var = this.E;
        d dVar = this.A;
        ha2 n = e.n(dVar.a(az91Var), this.K, dVar.h.b, new DuePickerStatePresenter$getDuePickerStateFlow$1(this, null));
        uvm uvmVar = this.D.a;
        o oVar = new o(new n(e.n(n, uvmVar.b, uvmVar.d, DuePickerStatePresenter$updatePickerValues$1.a), new DuePickerStatePresenter$updatePickerValues$2(this, null)), new DuePickerStatePresenter$updatePickerValues$3(this, null));
        this.B.getClass();
        this.J = b.h(Jg(), new jqr(e.F(oVar, uyj.a), new DuePickerStatePresenter$updatePickerValues$4(this, null), 3));
    }
}
