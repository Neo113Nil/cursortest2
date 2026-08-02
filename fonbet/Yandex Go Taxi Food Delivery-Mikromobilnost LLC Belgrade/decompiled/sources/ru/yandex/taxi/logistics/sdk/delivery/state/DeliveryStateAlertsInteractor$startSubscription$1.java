package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.cc7;
import defpackage.eci0;
import defpackage.ey4;
import defpackage.hwh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryStateAlertsInteractor$startSubscription$1", f = "DeliveryStateAlertsInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryStateAlertsInteractor$startSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryId;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljw40;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryStateAlertsInteractor$startSubscription$1$3", f = "DeliveryStateAlertsInteractor.kt", l = {41, 39}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryStateAlertsInteractor$startSubscription$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ String $deliveryId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(h hVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$deliveryId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$deliveryId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            if (kotlinx.coroutines.flow.e.u(r2, r0, r6) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r7 == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                hwh hwhVar = this.this$0.b;
                String str = this.$deliveryId;
                this.L$0 = null;
                this.L$1 = vprVar;
                this.label = 1;
                obj = ((b) hwhVar).a(str, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) this.L$1;
                kotlin.b.b(obj);
            }
            kotlinx.coroutines.flow.g gVar = new kotlinx.coroutines.flow.g((Iterable) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryStateAlertsInteractor$startSubscription$1(h hVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryStateAlertsInteractor$startSubscription$1(this.this$0, this.$deliveryId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryStateAlertsInteractor$startSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            eci0 eci0Var = hVar.a.e;
            String str = this.$deliveryId;
            n nVar = new n(new ey4(new cc7(eci0Var, str, 5), 6), new AnonymousClass3(hVar, str, null));
            e eVar = new e(this.this$0, this.$deliveryId);
            this.label = 1;
            if (nVar.collect(eVar, this) == coroutineSingletons) {
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
