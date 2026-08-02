package ru.yandex.taxi.preorder.map;

import defpackage.bl00;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pj6;
import defpackage.sjh;
import defpackage.t3l0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzy11;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "Lpj6;", "comboInnerPin", "Lt3l0;", "<anonymous>", "(VLru/yandex/taxi/theme/ThemeType;Lcom/yandex/go/summary/branding_pin/api/BrandingPinState$ComboInnerPin;)Lru/yandex/taxi/preorder/map/model/RouteIcon;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$comboInnerIconFlow$1", f = "RouteOverlayIconHolder.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayIconHolder$comboInnerIconFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt3l0;", "<anonymous>", "(Ltse;)Lt3l0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$comboInnerIconFlow$1$1", f = "RouteOverlayIconHolder.kt", l = {229}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$comboInnerIconFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ pj6 $comboInnerPin;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, pj6 pj6Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$comboInnerPin = pj6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$comboInnerPin, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.combo.factory.a aVar = this.this$0.a;
                pj6 pj6Var = this.$comboInnerPin;
                this.label = 1;
                obj = aVar.a(pj6Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return new t3l0((bl00) obj, null, false, null, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$comboInnerIconFlow$1(Continuation continuation, n nVar) {
        super(4, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RouteOverlayIconHolder$comboInnerIconFlow$1 routeOverlayIconHolder$comboInnerIconFlow$1 = new RouteOverlayIconHolder$comboInnerIconFlow$1((Continuation) obj4, this.this$0);
        routeOverlayIconHolder$comboInnerIconFlow$1.L$0 = (pj6) obj3;
        return routeOverlayIconHolder$comboInnerIconFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pj6 pj6Var = (pj6) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean equals = pj6Var.equals(pj6.f);
            n nVar = this.this$0;
            if (equals) {
                return nVar.w;
            }
            nVar.g.getClass();
            sjh sjhVar = uyj.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, pj6Var, null);
            this.L$0 = null;
            this.label = 1;
            obj = tje.k0(sjhVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (t3l0) obj;
    }
}
