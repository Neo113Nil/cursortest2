package ru.yandex.taxi.preorder.map;

import defpackage.fqr;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1", f = "RouteOverlayIconHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayIconHolder$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $renderComboInner;
    final /* synthetic */ wls $renderDestination;
    final /* synthetic */ wls $renderSource;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$1", f = "RouteOverlayIconHolder.kt", l = {426}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ wls $renderSource;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, wls wlsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$renderSource = wlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$renderSource, continuation);
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
                n nVar = this.this$0;
                kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(nVar.r, new RouteOverlayIconHolder$sourceIconFlow$$inlined$flatMapLatest$1(null, nVar));
                nVar.g.getClass();
                mth mthVar = new mth(new j0(null, kotlinx.coroutines.flow.e.F(X, uyj.a), new RouteOverlayIconHolder$attach$1$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
                wls wlsVar = this.$renderSource;
                o oVar = new o(mthVar, new RouteOverlayIconHolder$attach$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                fqr fqrVar = new fqr(wlsVar, 1);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(fqrVar, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$2", f = "RouteOverlayIconHolder.kt", l = {426}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ wls $renderDestination;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n nVar, wls wlsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$renderDestination = wlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$renderDestination, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                n nVar = this.this$0;
                kotlinx.coroutines.flow.internal.g b = nVar.d.b(nVar.t);
                tpr t = kotlinx.coroutines.flow.e.t(new f(((com.yandex.go.taxi.tariffs.internal.repository.k) nVar.c).j.a()));
                ru.yandex.taxi.delivery.pin.k kVar = nVar.m;
                tpr t2 = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.delivery.pin.h(((com.yandex.go.taxi.tariffs.internal.repository.k) kVar.a).j.b(), kVar, nVar.k.a.getColor(mqg0.component_black)));
                gci0 gci0Var = nVar.J;
                com.yandex.go.summary.branding_pin.i iVar = (com.yandex.go.summary.branding_pin.i) nVar.i;
                d dVar = new d(new tpr[]{b, t, t2, gci0Var, kotlinx.coroutines.flow.e.t(new com.yandex.go.summary.branding_pin.d(((com.yandex.go.taxi.tariffs.internal.repository.k) iVar.a).j.b(), iVar)), nVar.v, nVar.e.a(), nVar.q.b()}, nVar);
                nVar.g.getClass();
                mth mthVar = new mth(new j0(null, new jqr(kotlinx.coroutines.flow.e.F(dVar, uyj.a), new RouteOverlayIconHolder$destinationIconFlow$2(null, nVar), 3), new RouteOverlayIconHolder$attach$1$2$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
                wls wlsVar = this.$renderDestination;
                o oVar = new o(mthVar, new RouteOverlayIconHolder$attach$1$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                fqr fqrVar = new fqr(wlsVar, 2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(fqrVar, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$3", f = "RouteOverlayIconHolder.kt", l = {426}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$attach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ wls $renderComboInner;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(n nVar, wls wlsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$renderComboInner = wlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$renderComboInner, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                n nVar = this.this$0;
                n0 n0Var = nVar.I;
                tpr a = nVar.e.a();
                com.yandex.go.summary.branding_pin.i iVar = (com.yandex.go.summary.branding_pin.i) nVar.i;
                mth mthVar = new mth(new j0(null, new jqr(kotlinx.coroutines.flow.e.n(n0Var, a, kotlinx.coroutines.flow.e.t(new com.yandex.go.summary.branding_pin.b(((com.yandex.go.taxi.tariffs.internal.repository.k) iVar.a).j.b(), iVar)), new RouteOverlayIconHolder$comboInnerIconFlow$1(null, nVar)), new RouteOverlayIconHolder$comboInnerIconFlow$2(null, nVar), 3), new RouteOverlayIconHolder$attach$1$3$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
                wls wlsVar = this.$renderComboInner;
                o oVar = new o(mthVar, new RouteOverlayIconHolder$attach$1$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                fqr fqrVar = new fqr(wlsVar, 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(fqrVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$attach$1(n nVar, wls wlsVar, wls wlsVar2, wls wlsVar3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$renderSource = wlsVar;
        this.$renderDestination = wlsVar2;
        this.$renderComboInner = wlsVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteOverlayIconHolder$attach$1 routeOverlayIconHolder$attach$1 = new RouteOverlayIconHolder$attach$1(this.this$0, this.$renderSource, this.$renderDestination, this.$renderComboInner, continuation);
        routeOverlayIconHolder$attach$1.L$0 = obj;
        return routeOverlayIconHolder$attach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouteOverlayIconHolder$attach$1 routeOverlayIconHolder$attach$1 = (RouteOverlayIconHolder$attach$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeOverlayIconHolder$attach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$renderSource, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$renderDestination, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, this.$renderComboInner, null), 3);
        return zy11.a;
    }
}
