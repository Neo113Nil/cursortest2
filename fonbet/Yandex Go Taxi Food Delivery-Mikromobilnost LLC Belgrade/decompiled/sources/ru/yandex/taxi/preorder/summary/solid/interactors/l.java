package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class l {
    public final tt2 a;
    public final wiq0 b;
    public final ru.yandex.taxi.preorder.repositories.g c;

    public l(tt2 tt2Var, wiq0 wiq0Var, ru.yandex.taxi.preorder.repositories.g gVar) {
        this.a = tt2Var;
        this.b = wiq0Var;
        this.c = gVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2(this, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
