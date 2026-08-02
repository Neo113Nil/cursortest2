package ru.yandex.taxi.logistics.sdk.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lio2;", "<anonymous>", "(Ltse;)Lio2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.network.ApiCallImpl$awaitWithRetry$2", f = "ApiCallImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ApiCallImpl$awaitWithRetry$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $attempts;
    final /* synthetic */ long $delayMs;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCallImpl$awaitWithRetry$2(b bVar, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$attempts = i;
        this.$delayMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApiCallImpl$awaitWithRetry$2(this.this$0, this.$attempts, this.$delayMs, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApiCallImpl$awaitWithRetry$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        int i2 = this.$attempts;
        long j = this.$delayMs;
        this.label = 1;
        Object b = b.b(bVar, i2, j, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
