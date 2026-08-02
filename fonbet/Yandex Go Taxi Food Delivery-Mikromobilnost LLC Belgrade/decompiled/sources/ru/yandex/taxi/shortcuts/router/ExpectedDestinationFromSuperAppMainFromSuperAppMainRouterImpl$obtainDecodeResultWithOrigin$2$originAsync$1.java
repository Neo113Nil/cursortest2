package ru.yandex.taxi.shortcuts.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lynv0;", "<anonymous>", "(Ltse;)Lynv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.router.ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1", f = "ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ynv0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        b = this.this$0.c.b(null, null);
        return b;
    }
}
