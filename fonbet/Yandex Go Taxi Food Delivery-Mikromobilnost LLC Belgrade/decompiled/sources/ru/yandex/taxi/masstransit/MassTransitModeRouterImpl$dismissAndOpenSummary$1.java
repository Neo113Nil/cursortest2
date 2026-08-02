package ru.yandex.taxi.masstransit;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b2v;
import defpackage.bhv0;
import defpackage.bov0;
import defpackage.bse0;
import defpackage.c2v;
import defpackage.cjv0;
import defpackage.ck31;
import defpackage.dse0;
import defpackage.e310;
import defpackage.e3n;
import defpackage.egz;
import defpackage.eja1;
import defpackage.ejv0;
import defpackage.i3g;
import defpackage.jst;
import defpackage.k9s0;
import defpackage.khv0;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oq30;
import defpackage.ose0;
import defpackage.pj40;
import defpackage.pq30;
import defpackage.qqo;
import defpackage.qz00;
import defpackage.sq30;
import defpackage.tq30;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$dismissAndOpenSummary$1", f = "MassTransitModeRouterImpl.kt", l = {545}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MassTransitModeRouterImpl$dismissAndOpenSummary$1 extends SuspendLambda implements wls {
    final /* synthetic */ sq30 $origin;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$dismissAndOpenSummary$1$1", f = "MassTransitModeRouterImpl.kt", l = {546}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$dismissAndOpenSummary$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                com.yandex.go.taxi.tariffs.interactor.b bVar = this.this$0.V;
                this.label = 1;
                if (bVar.b(null, this) == coroutineSingletons) {
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
    public MassTransitModeRouterImpl$dismissAndOpenSummary$1(d dVar, sq30 sq30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$origin = sq30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MassTransitModeRouterImpl$dismissAndOpenSummary$1(this.this$0, this.$origin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MassTransitModeRouterImpl$dismissAndOpenSummary$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o430 o430Var = e3n.b;
            long U = kp50.U(3, DurationUnit.SECONDS);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.a.x(U, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ((tq30) this.this$0.I.get()).a(this.$origin);
        sq30 sq30Var = this.$origin;
        bov0 bov0Var = new bov0(true, (khv0) new bhv0(0), sq30Var instanceof pq30 ? new ejv0(((pq30) sq30Var).a) : sq30Var instanceof oq30 ? cjv0.a : null, 8);
        List list = ((k) ((ck31) this.this$0.T.get())).j().a;
        if (list.isEmpty()) {
            jst.e.f("TRANSPORT_HUB_ROUTING:DISCOVERY", "TransportHubRouting", "verticals not ready");
        }
        int i2 = qz00.a[((MtMainRedirectExperiment) ((qqo) this.this$0.d0.getValue()).b()).b.ordinal()];
        if (i2 == 1) {
            d.S(this.this$0, this.$origin);
            d dVar = this.this$0;
            e310 e310Var = dVar.e0;
            pj40 pj40Var = e310Var != null ? ((i3g) e310Var).c : null;
            c2v c2vVar = (c2v) dVar.Q.get();
            String str2 = pj40Var != null ? pj40Var.a : null;
            str = pj40Var != null ? pj40Var.b : null;
            c2vVar.getClass();
            c2vVar.a = new b2v(str2, str);
            k9s0 k9s0Var = k9s0.f;
            dVar.W(new bse0(egz.F(bov0Var)), "open hub vertical");
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            boolean x = eja1.x(list);
            d dVar2 = this.this$0;
            if (x) {
                d.S(dVar2, this.$origin);
                d dVar3 = this.this$0;
                e310 e310Var2 = dVar3.e0;
                pj40 pj40Var2 = e310Var2 != null ? ((i3g) e310Var2).c : null;
                c2v c2vVar2 = (c2v) dVar3.Q.get();
                String str3 = pj40Var2 != null ? pj40Var2.a : null;
                str = pj40Var2 != null ? pj40Var2.b : null;
                c2vVar2.getClass();
                c2vVar2.a = new b2v(str3, str);
                k9s0 k9s0Var2 = k9s0.f;
                dVar3.W(new ose0(egz.F(bov0Var)), "open transport hub vertical");
            } else {
                dVar2.getClass();
                k9s0 k9s0Var3 = k9s0.f;
                dVar2.W(new dse0(egz.F(bov0Var)), "open transport routes");
            }
        }
        this.this$0.i();
        return zy11.a;
    }
}
