package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions.DeliveryOptionsRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2", f = "ExtendExpirationDateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2 extends SuspendLambda implements tls {
    final /* synthetic */ DeliveryOptionsRequestDto $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2(a aVar, DeliveryOptionsRequestDto deliveryOptionsRequestDto, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = deliveryOptionsRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((ExtendExpirationDateApi) this.this$0.i.get()).a(this.$request);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
