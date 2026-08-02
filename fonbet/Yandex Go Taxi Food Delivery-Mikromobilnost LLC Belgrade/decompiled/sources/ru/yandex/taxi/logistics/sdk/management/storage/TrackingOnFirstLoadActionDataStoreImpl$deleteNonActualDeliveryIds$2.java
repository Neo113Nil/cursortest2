package ru.yandex.taxi.logistics.sdk.management.storage;

import defpackage.ez40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.storage.TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2", f = "TrackingOnFirstLoadActionDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $actualDeliveries;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2(f fVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$actualDeliveries = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2 trackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2 = new TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2(this.this$0, this.$actualDeliveries, continuation);
        trackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2.L$0 = obj;
        return trackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2 trackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2 = (TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterable iterable = (Set) ez40Var.c(this.this$0.b);
        if (iterable == null) {
            iterable = EmptySet.a;
        }
        ez40Var.g(this.this$0.b, kotlin.collections.a.N0(kotlin.collections.a.U(iterable, kotlin.collections.a.N0(this.$actualDeliveries))));
        return zy11.a;
    }
}
