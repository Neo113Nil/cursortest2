package ru.yandex.taxi.masstransit;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.an30;
import defpackage.bn30;
import defpackage.dz00;
import defpackage.e310;
import defpackage.i3g;
import defpackage.i6r;
import defpackage.k110;
import defpackage.mvg;
import defpackage.mz00;
import defpackage.ny61;
import defpackage.o950;
import defpackage.pj40;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tse;
import defpackage.um30;
import defpackage.vm30;
import defpackage.vz00;
import defpackage.wls;
import defpackage.wm30;
import defpackage.ym30;
import defpackage.zm30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.address.interactor.i;
import ru.yandex.taxi.masstransit.model.MtInitState$GeoPayment;
import ru.yandex.taxi.masstransit.model.MtMasstransitOverlayOwner;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onLaunch$1", f = "MassTransitModeRouterImpl.kt", l = {175, 177, 194, 202}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MassTransitModeRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ bn30 $initState;
    final /* synthetic */ mz00 $payload;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onLaunch$1$3", f = "MassTransitModeRouterImpl.kt", l = {199}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onLaunch$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                i iVar = this.this$0.G;
                this.label = 1;
                if (iVar.f(this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onLaunch$1$4", f = "MassTransitModeRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onLaunch$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass4.invokeSuspend(zy11Var);
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
            d dVar = this.this$0;
            ru.yandex.taxi.deeplinks.a.c(tseVar, dVar.O, new c(dVar));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitModeRouterImpl$onLaunch$1(d dVar, bn30 bn30Var, mz00 mz00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$initState = bn30Var;
        this.$payload = mz00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MassTransitModeRouterImpl$onLaunch$1 massTransitModeRouterImpl$onLaunch$1 = new MassTransitModeRouterImpl$onLaunch$1(this.this$0, this.$initState, this.$payload, continuation);
        massTransitModeRouterImpl$onLaunch$1.L$0 = obj;
        return massTransitModeRouterImpl$onLaunch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MassTransitModeRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0060, code lost:
    
        if (r15.a(r14) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0141 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pj40 pj40Var;
        d dVar;
        e310 e310Var;
        pzt0 pzt0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.layers.b bVar = this.this$0.E;
            this.L$0 = tseVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    dVar = (d) this.L$5;
                    e310Var = (e310) this.L$3;
                    kotlin.b.b(obj);
                    dVar.e0 = e310Var;
                    pzt0Var = this.this$0.h0;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
                    o950 lifecycle = this.this$0.getLifecycle();
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    return b0.b(lifecycle, state, anonymousClass4, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                pj40Var = (pj40) this.L$1;
                kotlin.b.b(obj);
                k110 k110Var = (k110) obj;
                boolean z = k110Var.b;
                d dVar2 = this.this$0;
                if (!z) {
                    dVar2.r(new qu(9));
                    return zy11Var;
                }
                i6r i6rVar = dVar2.J;
                vz00 vz00Var = new vz00(dVar2, 0);
                i6rVar.getClass();
                pj40Var.getClass();
                i3g i3gVar = new i3g(i6rVar, pj40Var, vz00Var);
                d dVar3 = this.this$0;
                bn30 bn30Var = this.$initState;
                mz00 mz00Var = this.$payload;
                ru.yandex.taxi.masstransit.router.e c = i3gVar.c();
                c.b(k110Var, mz00Var, dVar3.o(), MtMasstransitOverlayOwner.MASSTRANSIT_FEATURE);
                dVar3.f0 = c;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = i3gVar;
                this.L$4 = null;
                this.L$5 = dVar2;
                this.label = 3;
                if (d.R(dVar3, i3gVar, bn30Var, this) != coroutineSingletons) {
                    dVar = dVar2;
                    e310Var = i3gVar;
                    dVar.e0 = e310Var;
                    pzt0Var = this.this$0.h0;
                    if (pzt0Var != null) {
                    }
                    tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
                    o950 lifecycle2 = this.this$0.getLifecycle();
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    AnonymousClass4 anonymousClass42 = new AnonymousClass4(this.this$0, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    if (b0.b(lifecycle2, state2, anonymousClass42, this) != coroutineSingletons) {
                    }
                }
            }
            kotlin.b.b(obj);
        }
        bn30 bn30Var2 = this.$initState;
        pj40Var = bn30Var2 instanceof vm30 ? ((vm30) bn30Var2).a : bn30Var2 instanceof MtInitState$GeoPayment ? ((MtInitState$GeoPayment) bn30Var2).b : bn30Var2 instanceof um30 ? ((um30) bn30Var2).d : bn30Var2 instanceof zm30 ? ((zm30) bn30Var2).b : bn30Var2 instanceof ym30 ? ((ym30) bn30Var2).e : bn30Var2 instanceof wm30 ? ((wm30) bn30Var2).b : bn30Var2 instanceof an30 ? ((an30) bn30Var2).c : pj40.c;
        dz00 dz00Var = this.this$0.N;
        this.L$0 = tseVar;
        this.L$1 = pj40Var;
        this.label = 2;
        obj = dz00Var.a.b(this);
    }
}
