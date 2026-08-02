package ru.yandex.taxi.linked_order.provider;

import defpackage.ck;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.on2;
import defpackage.qoy;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.sny;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uoy;
import defpackage.uyj;
import defpackage.zuj0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class i {
    public final tt2 a;
    public final uoy b;
    public final qoy c;
    public final zuj0 d;
    public final i3y e;

    public i(on2 on2Var, tt2 tt2Var, uoy uoyVar, qoy qoyVar, zuj0 zuj0Var) {
        this.a = tt2Var;
        this.b = uoyVar;
        this.c = qoyVar;
        this.d = zuj0Var;
        this.e = kotlin.a.a(new ck(on2Var, 13));
    }

    public final Object a(sny snyVar, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LinkedOrderRemoteProvider$loadOrderInfo$2(this, snyVar, null), suspendLambda);
    }

    public final rol0 b(sny snyVar) {
        return new rol0(new LinkedOrderRemoteProvider$pollOrderInfo$1(this, snyVar, null));
    }
}
