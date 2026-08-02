package ru.yandex.taxi.logistics.sdk.management;

import defpackage.f6i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.DeliveriesManagerImpl$createDelivery$1", f = "DeliveriesManagerImpl.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerImpl$createDelivery$1 extends SuspendLambda implements wls {
    final /* synthetic */ f6i $deliveryDraft;
    final /* synthetic */ List<UUID> $localUuids;
    final /* synthetic */ boolean $needValidation;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerImpl$createDelivery$1(f fVar, f6i f6iVar, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$deliveryDraft = f6iVar;
        this.$localUuids = list;
        this.$needValidation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveriesManagerImpl$createDelivery$1(this.this$0, this.$deliveryDraft, this.$localUuids, this.$needValidation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveriesManagerImpl$createDelivery$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d dVar = this.this$0.d;
            f6i f6iVar = this.$deliveryDraft;
            List<UUID> list = this.$localUuids;
            boolean z = this.$needValidation;
            this.label = 1;
            if (dVar.b(f6iVar, list, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
