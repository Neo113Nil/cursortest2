package ru.yandex.taxi.logistics.care.impl.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.care.impl.router.DeliveryCareRouterImpl$createCookiesUpdater$1", f = "DeliveryCareRouterImpl.kt", l = {160}, m = "ensureAndInjectCookies-gIAlu-s", v = 2)
/* loaded from: classes5.dex */
final class DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
