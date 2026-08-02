package ru.yandex.taxi.masstransit.overlay.onmap;

import com.yandex.mapkit.geometry.Point;
import defpackage.bms;
import defpackage.ha2;
import defpackage.i350;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.NearestTransportTrackingInteractor$startTracking$1", f = "NearestTransportTrackingInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NearestTransportTrackingInteractor$startTracking$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $stopPointFlow;
    final /* synthetic */ tpr $vehicleIdFlow;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzy11;", "<unused var>", "", "vehicleId", "Lcom/yandex/mapkit/geometry/Point;", "stopPoint", "Lkotlin/Pair;", "<anonymous>", "(VLjava/lang/String;Lcom/yandex/mapkit/geometry/Point;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.NearestTransportTrackingInteractor$startTracking$1$1", f = "NearestTransportTrackingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.overlay.onmap.NearestTransportTrackingInteractor$startTracking$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.L$0 = (String) obj2;
            anonymousClass1.L$1 = (Point) obj3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            Point point = (Point) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(str, point);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestTransportTrackingInteractor$startTracking$1(i iVar, tpr tprVar, tpr tprVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$vehicleIdFlow = tprVar;
        this.$stopPointFlow = tprVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearestTransportTrackingInteractor$startTracking$1(this.this$0, this.$vehicleIdFlow, this.$stopPointFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NearestTransportTrackingInteractor$startTracking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ha2 n = kotlinx.coroutines.flow.e.n(this.this$0.d, this.$vehicleIdFlow, this.$stopPointFlow, new AnonymousClass1(4, null));
            i350 i350Var = new i350(5, this.this$0);
            this.label = 1;
            if (n.collect(i350Var, this) == coroutineSingletons) {
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
