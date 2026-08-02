package ru.yandex.taxi.statebar.controller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.statebar.controller.LocationErrorsStateBarController$launchClickHandler$1", f = "LocationErrorsStateBarController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationErrorsStateBarController$launchClickHandler$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationErrorsStateBarController$launchClickHandler$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationErrorsStateBarController$launchClickHandler$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocationErrorsStateBarController$launchClickHandler$1 locationErrorsStateBarController$launchClickHandler$1 = (LocationErrorsStateBarController$launchClickHandler$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        locationErrorsStateBarController$launchClickHandler$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n0 n0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        pzt0 pzt0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        ru.yandex.taxi.statebar.a aVar = bVar.i;
        if (aVar != null && (n0Var = aVar.g) != null) {
            pzt0Var = tje.N(bVar.j, null, null, new LocationErrorsStateBarController$launchClickHandler$1$invokeSuspend$$inlined$safeCollectIn$1(n0Var, null, bVar), 3);
        }
        bVar.s = pzt0Var;
        return zy11.a;
    }
}
