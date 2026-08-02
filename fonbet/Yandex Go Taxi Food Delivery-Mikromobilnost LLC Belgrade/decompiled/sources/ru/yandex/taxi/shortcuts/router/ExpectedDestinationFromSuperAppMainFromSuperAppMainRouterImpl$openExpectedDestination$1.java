package ru.yandex.taxi.shortcuts.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.shortcuts.router.ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl", f = "ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl.kt", l = {34}, m = "openExpectedDestination-0E7RQCE", v = 2)
/* loaded from: classes10.dex */
final class ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
