package ru.yandex.taxi.preorder.summary.selector.analytics;

import com.yandex.go.taxi.tariffs.analytics.c;
import defpackage.clx0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.wiq0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class a {
    public final wiq0 a;
    public final uze0 b;
    public final clx0 c;
    public final tt2 d;
    public final c e;

    public a(wiq0 wiq0Var, uze0 uze0Var, clx0 clx0Var, tt2 tt2Var, c cVar) {
        this.a = wiq0Var;
        this.b = uze0Var;
        this.c = clx0Var;
        this.d = tt2Var;
        this.e = cVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2(this, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
