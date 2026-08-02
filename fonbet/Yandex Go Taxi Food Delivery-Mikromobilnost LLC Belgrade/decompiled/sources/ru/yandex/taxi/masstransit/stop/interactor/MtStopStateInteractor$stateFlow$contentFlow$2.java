package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z340;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz340;", "it", "Lzy11;", "<anonymous>", "(Lz340;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$stateFlow$contentFlow$2", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$stateFlow$contentFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$stateFlow$contentFlow$2(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopStateInteractor$stateFlow$contentFlow$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtStopStateInteractor$stateFlow$contentFlow$2 mtStopStateInteractor$stateFlow$contentFlow$2 = (MtStopStateInteractor$stateFlow$contentFlow$2) create((z340) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtStopStateInteractor$stateFlow$contentFlow$2.invokeSuspend(zy11Var);
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
        r0 r0Var = this.this$0.q;
        r0Var.getClass();
        r0Var.m(null, EmptySet.a);
        return zy11.a;
    }
}
