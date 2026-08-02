package ru.yandex.taxi.linked_order.interactor;

import defpackage.a3v;
import defpackage.eci0;
import defpackage.h3y;
import defpackage.ij00;
import defpackage.j58;
import defpackage.qoy;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ul00;
import defpackage.uyj;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class f0 {
    public static final /* synthetic */ int i = 0;
    public final ij00 a;
    public final ru.yandex.taxi.map.a b;
    public final qoy c;
    public final ul00 d;
    public final tt2 e;
    public final ru.yandex.taxi.linked_order.map.movement.a f;
    public final h3y g;
    public final a3v h;

    public f0(ij00 ij00Var, ru.yandex.taxi.map.a aVar, qoy qoyVar, ul00 ul00Var, tt2 tt2Var, j58 j58Var, ru.yandex.taxi.linked_order.map.movement.a aVar2, h3y h3yVar, a3v a3vVar) {
        this.a = ij00Var;
        this.b = aVar;
        this.c = qoyVar;
        this.d = ul00Var;
        this.e = tt2Var;
        this.f = aVar2;
        this.g = h3yVar;
        this.h = a3vVar;
    }

    public final kotlinx.coroutines.flow.k a(r0 r0Var, eci0 eci0Var) {
        return new kotlinx.coroutines.flow.k(new k(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(eci0Var, r0Var, new LinkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1(3, null))), new LinkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$flatMapLatest$1(null, this)), 0, BufferOverflow.DROP_OLDEST, 1), this), new LinkedOrderMapOverlayDataInteractor$listenCarGeometry$3(null, this));
    }

    public final s b(eci0 eci0Var) {
        return new s(new m0(new q(new o(kotlinx.coroutines.flow.e.t(new m(eci0Var)), this)), eci0Var, new LinkedOrderMapOverlayDataInteractor$listenCarImage$1(3, null)), this);
    }

    public final tpr c(tpr tprVar, tpr tprVar2, tpr tprVar3, tpr tprVar4) {
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.t(tprVar), kotlinx.coroutines.flow.e.t(new w(tprVar2)), new LinkedOrderMapOverlayDataInteractor$listenMapFocusType$2(3, null))), new LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1(null, this, tprVar3, tprVar4));
        this.e.getClass();
        return kotlinx.coroutines.flow.e.F(X, uyj.a);
    }
}
