package ru.yandex.taxi.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3", f = "LbsProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3 lbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3 = (LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.getClass();
        return zy11.a;
    }
}
