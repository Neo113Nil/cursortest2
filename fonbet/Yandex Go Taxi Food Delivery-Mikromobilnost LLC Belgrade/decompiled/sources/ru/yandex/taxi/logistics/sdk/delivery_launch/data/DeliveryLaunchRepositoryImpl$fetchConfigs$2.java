package ru.yandex.taxi.logistics.sdk.delivery_launch.data;

import defpackage.m0i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.launch.DeliveryLaunchRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/launch/DeliveryLaunchResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_launch.data.DeliveryLaunchRepositoryImpl$fetchConfigs$2", f = "DeliveryLaunchRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryLaunchRepositoryImpl$fetchConfigs$2 extends SuspendLambda implements tls {
    final /* synthetic */ m0i $params;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryLaunchRepositoryImpl$fetchConfigs$2(b bVar, m0i m0iVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$params = m0iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveryLaunchRepositoryImpl$fetchConfigs$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DeliveryLaunchRepositoryImpl$fetchConfigs$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((DeliveryLaunchApi) this.this$0.i.get()).deliveryLaunch(new DeliveryLaunchRequestDto(this.$params.a));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
