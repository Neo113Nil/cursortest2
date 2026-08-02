package ru.yandex.taxi.preorder.tollroad.compose.navigation;

import android.content.Context;
import defpackage.auk0;
import defpackage.ebg;
import defpackage.i130;
import defpackage.i3y;
import defpackage.kdd0;
import defpackage.mu5;
import defpackage.nqz0;
import defpackage.ohk0;
import defpackage.pgd;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xtk0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.tollroad.compose.interactor.d;

/* loaded from: classes6.dex */
public final class b extends pgd {
    public final Context F;
    public final i130 G;
    public final kdd0 H;
    public final d I;
    public final ru.yandex.taxi.preorder.tollroad.compose.interactor.a J;
    public final yvf0 K;
    public final nqz0 L;
    public final i3y M;
    public final mu5 N;

    public b(Context context, i130 i130Var, kdd0 kdd0Var, d dVar, ru.yandex.taxi.preorder.tollroad.compose.interactor.a aVar, ebg ebgVar, nqz0 nqz0Var) {
        super(0);
        this.F = context;
        this.G = i130Var;
        this.H = kdd0Var;
        this.I = dVar;
        this.J = aVar;
        this.K = ebgVar;
        this.L = nqz0Var;
        this.M = kotlin.a.a(new auk0(this, 0));
        this.N = new mu5(new ohk0(7, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        r0 r0Var = this.L.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        tje.N(o(), null, null, new RoadsPaneRouter$onAttach$1(this, null), 3);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        r0 r0Var = this.L.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        xtk0 xtk0Var = this.J.d;
        xtk0Var.a.t4(xtk0Var.b);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.N;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G.a();
    }
}
