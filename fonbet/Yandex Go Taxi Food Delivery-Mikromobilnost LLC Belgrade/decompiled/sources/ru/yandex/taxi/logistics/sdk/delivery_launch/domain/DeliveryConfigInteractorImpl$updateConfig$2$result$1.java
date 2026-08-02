package ru.yandex.taxi.logistics.sdk.delivery_launch.domain;

import defpackage.m0i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfpc;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto;", "<anonymous>", "(Ltse;)Lfpc;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_launch.domain.DeliveryConfigInteractorImpl$updateConfig$2$result$1", f = "DeliveryConfigInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryConfigInteractorImpl$updateConfig$2$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ m0i $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryConfigInteractorImpl$updateConfig$2$result$1(a aVar, m0i m0iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = m0iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryConfigInteractorImpl$updateConfig$2$result$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryConfigInteractorImpl$updateConfig$2$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ru.yandex.taxi.logistics.sdk.delivery_launch.data.b bVar = this.this$0.a;
        m0i m0iVar = this.$params;
        this.label = 1;
        Object b = bVar.b(m0iVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
