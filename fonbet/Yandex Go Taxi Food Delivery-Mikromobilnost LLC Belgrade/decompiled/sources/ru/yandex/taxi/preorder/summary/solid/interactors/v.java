package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.a7t0;
import defpackage.arv0;
import defpackage.jqr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class v {
    public final wiq0 a;
    public final arv0 b;
    public final tt2 c;

    public v(wiq0 wiq0Var, arv0 arv0Var, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = arv0Var;
        this.c = tt2Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(((a7t0) this.b).a), new ExitFromTrapInteractor$waitTrapModeExit$$inlined$flatMapLatest$1(null, this)), new ExitFromTrapInteractor$waitTrapModeExit$3(null, this), 3);
        this.c.getClass();
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, uyj.a), suspendLambda);
    }
}
