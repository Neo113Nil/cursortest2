package ru.yandex.taxi.logistics.sdk.deliverydashboard.data;

import defpackage.lf60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardContentRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.data.DeliveryDashboardDataSourceImpl$fetchDashboardContent$2", f = "DeliveryDashboardDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryDashboardDataSourceImpl$fetchDashboardContent$2 extends SuspendLambda implements tls {
    final /* synthetic */ DashboardContentRequestDto $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDashboardDataSourceImpl$fetchDashboardContent$2(a aVar, DashboardContentRequestDto dashboardContentRequestDto, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = dashboardContentRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveryDashboardDataSourceImpl$fetchDashboardContent$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DeliveryDashboardDataSourceImpl$fetchDashboardContent$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ((DeliveryDashboardApi) this.this$0.i.get()).a(this.$request, new lf60());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
