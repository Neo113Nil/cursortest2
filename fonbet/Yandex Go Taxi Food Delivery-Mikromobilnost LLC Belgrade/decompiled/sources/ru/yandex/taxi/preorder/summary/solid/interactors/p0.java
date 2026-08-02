package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.a7t0;
import defpackage.arv0;
import defpackage.b8r;
import defpackage.c4r0;
import defpackage.c8r;
import defpackage.ck31;
import defpackage.jqr;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class p0 {
    public final wiq0 a;
    public final arv0 b;
    public final c4r0 c;
    public final b8r d;
    public final c8r e;
    public final ck31 f;
    public final tt2 g;

    public p0(wiq0 wiq0Var, arv0 arv0Var, c4r0 c4r0Var, b8r b8rVar, c8r c8rVar, ck31 ck31Var, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = arv0Var;
        this.c = c4r0Var;
        this.d = b8rVar;
        this.e = c8rVar;
        this.f = ck31Var;
        this.g = tt2Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        int i = 3;
        kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new jqr(new g0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.f).i(), this), new TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2(this, null), i), new jqr(new o0(new k0(new m0(new i0(((a7t0) this.b).a), this)), this), new TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5(this, null), i)}, 2));
        this.g.getClass();
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(K, uyj.a), suspendLambda);
    }
}
