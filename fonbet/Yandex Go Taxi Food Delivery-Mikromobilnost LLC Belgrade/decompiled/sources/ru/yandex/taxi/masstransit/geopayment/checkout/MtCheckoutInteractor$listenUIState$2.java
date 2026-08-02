package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.b7z0;
import defpackage.ciu0;
import defpackage.e3n;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.ke30;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oez0;
import defpackage.onb;
import defpackage.pi00;
import defpackage.pnb;
import defpackage.pzt0;
import defpackage.qnb;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u0f0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wye;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zls;
import defpackage.zy11;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2", f = "MtCheckoutInteractor.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutInteractor$listenUIState$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$1", f = "MtCheckoutInteractor.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, k kVar) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                zjb zjbVar = (zjb) kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.this$0.b).d).a.getValue();
                if (zjbVar instanceof yjb) {
                    k kVar = this.this$0;
                    yjb yjbVar = (yjb) zjbVar;
                    CheckoutResponse checkoutResponse = yjbVar.a;
                    CheckoutResponse.TransportItem transportItem = checkoutResponse.h;
                    String str = transportItem.a;
                    String str2 = yjbVar.b.c;
                    String str3 = checkoutResponse.f;
                    String str4 = checkoutResponse.b;
                    String str5 = checkoutResponse.c;
                    Object obj2 = transportItem.d;
                    this.L$0 = null;
                    this.label = 1;
                    if (kVar.d(str, str2, str3, str4, str5, false, true, obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzjb;", "checkout", "Lzy11;", "<anonymous>", "(Lzjb;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$2", f = "MtCheckoutInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, k kVar) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.this$0);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((zjb) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            zjb zjbVar = (zjb) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ke30 ke30Var = this.this$0.l;
            if (zjbVar instanceof yjb) {
                oez0 oez0Var = ((yjb) zjbVar).a.k.d;
                if ((oez0Var != null ? oez0Var.b : null) != null) {
                    Date date = oez0Var.b;
                    r0 r0Var = ke30Var.d;
                    b7z0 b7z0Var = ke30Var.b;
                    long a = b7z0Var.a();
                    o430 o430Var = e3n.b;
                    long V = kp50.V(date.getTime() - a, DurationUnit.MILLISECONDS);
                    pzt0 pzt0Var = ke30Var.h;
                    if (pzt0Var == null || !pzt0Var.isActive() || !e3n.d(ke30Var.j, V)) {
                        ke30Var.a();
                        if (e3n.c(V, 0L) <= 0) {
                            e3n e3nVar = new e3n(0L);
                            r0Var.getClass();
                            r0Var.m(null, e3nVar);
                        } else {
                            ke30Var.i = b7z0Var.uptimeMillis();
                            ke30Var.j = V;
                            e3n e3nVar2 = new e3n(V);
                            r0Var.getClass();
                            r0Var.m(null, e3nVar2);
                            tse tseVar = ke30Var.a;
                            ke30Var.c.getClass();
                            ke30Var.h = tje.N(tseVar, uyj.a, null, new MtCheckoutTimerInteractor$startTimer$1(ke30Var, null), 2);
                        }
                    }
                } else {
                    ke30Var.a();
                }
            } else {
                ke30Var.a();
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqnb;", "mapped", "", "mosmetroAwaiting", "<anonymous>", "(Lqnb;Z)Lqnb;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$4", f = "MtCheckoutInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, (Continuation) obj3);
            anonymousClass4.L$0 = (qnb) obj;
            anonymousClass4.Z$0 = booleanValue;
            return anonymousClass4.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qnb qnbVar = (qnb) this.L$0;
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if ((qnbVar instanceof CheckoutUIState$PaymentCheckoutUIState) && z) {
                CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState = (CheckoutUIState$PaymentCheckoutUIState) qnbVar;
                if (!checkoutUIState$PaymentCheckoutUIState.i) {
                    u0f0 u0f0Var = checkoutUIState$PaymentCheckoutUIState.e;
                    u0f0 u0f0Var2 = new u0f0(u0f0Var.a, u0f0Var.b, u0f0Var.c, u0f0Var.d, u0f0Var.e, true, u0f0Var.g, u0f0Var.h, u0f0Var.i, u0f0Var.j);
                    wye wyeVar = checkoutUIState$PaymentCheckoutUIState.d;
                    wye wyeVar2 = new wye(wyeVar.a, wyeVar.b, wyeVar.c, wyeVar.d, false, wyeVar.f, wyeVar.g, wyeVar.h, wyeVar.i);
                    ciu0 ciu0Var = checkoutUIState$PaymentCheckoutUIState.g;
                    return new CheckoutUIState$PaymentCheckoutUIState(checkoutUIState$PaymentCheckoutUIState.a, checkoutUIState$PaymentCheckoutUIState.b, checkoutUIState$PaymentCheckoutUIState.c, wyeVar2, u0f0Var2, checkoutUIState$PaymentCheckoutUIState.f, ciu0Var != null ? new ciu0(ciu0Var.a, ciu0Var.b, false, false) : null, true, checkoutUIState$PaymentCheckoutUIState.i, checkoutUIState$PaymentCheckoutUIState.j, checkoutUIState$PaymentCheckoutUIState.k, checkoutUIState$PaymentCheckoutUIState.l, checkoutUIState$PaymentCheckoutUIState.m, checkoutUIState$PaymentCheckoutUIState.n, checkoutUIState$PaymentCheckoutUIState.o, checkoutUIState$PaymentCheckoutUIState.p, checkoutUIState$PaymentCheckoutUIState.q, checkoutUIState$PaymentCheckoutUIState.r, checkoutUIState$PaymentCheckoutUIState.s, true);
                }
            }
            return ((qnbVar instanceof onb) && z) ? pnb.a : qnbVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutInteractor$listenUIState$2(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtCheckoutInteractor$listenUIState$2 mtCheckoutInteractor$listenUIState$2 = new MtCheckoutInteractor$listenUIState$2(continuation, this.this$0);
        mtCheckoutInteractor$listenUIState$2.L$0 = obj;
        return mtCheckoutInteractor$listenUIState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutInteractor$listenUIState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            kotlinx.coroutines.flow.e.H(tseVar, new jqr(kVar.l.g, new AnonymousClass1(null, kVar), 3));
            kotlinx.coroutines.flow.e.H(tseVar, new jqr(kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.this$0.b).d), new AnonymousClass2(null, this.this$0), 3));
            gci0 d = kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.this$0.b).d);
            gci0 d2 = kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.this$0.b).c);
            gci0 d3 = kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.this$0.b).b);
            ru.yandex.taxi.masstransit.geopayment.experiment.b bVar = new ru.yandex.taxi.masstransit.geopayment.experiment.b(ru.yandex.taxi.experiments.d.a(this.this$0.g.a));
            ru.yandex.taxi.masstransit.geopayment.experiment.d dVar = new ru.yandex.taxi.masstransit.geopayment.experiment.d(ru.yandex.taxi.experiments.d.a(this.this$0.h.a));
            k kVar2 = this.this$0;
            h hVar = new h(kVar2.d.b(), kVar2);
            k kVar3 = this.this$0;
            m0 m0Var = new m0(new f(new tpr[]{d, d2, d3, bVar, dVar, hVar, ((l) kVar3.k).f, kVar3.l.e}, kVar3), kVar3.m, new AnonymousClass4(3, null));
            pi00 pi00Var = new pi00(9, this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (m0Var.collect(pi00Var, this) == coroutineSingletons) {
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
