package ru.yandex.taxi.masstransit.main.router;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.bo30;
import defpackage.c0g;
import defpackage.dz00;
import defpackage.i3g;
import defpackage.k110;
import defpackage.m010;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o950;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.s14;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wr30;
import defpackage.wu30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.router.MtMainFlexRouter$onLaunch$3", f = "MtMainFlexRouter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainFlexRouter$onLaunch$3 extends SuspendLambda implements wls {
    final /* synthetic */ bo30 $component;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.main.router.MtMainFlexRouter$onLaunch$3$1", f = "MtMainFlexRouter.kt", l = {91}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.main.router.MtMainFlexRouter$onLaunch$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bo30 $component;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, bo30 bo30Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$component = bo30Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            m010 m010Var;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tje.N(tseVar, null, null, new MtMainFlexRouter$onLaunch$3$1$invokeSuspend$$inlined$collectLatestIn$1(e.K(((wu30) this.this$0.G.get()).f(), e.t((mth) this.this$0.M.a)), null, this.$component), 3);
                pwy0 w6 = ((c0g) ((i3g) ((s14) this.$component).c).a).w6();
                q5z.h(w6);
                tje.N(tseVar, null, null, new MtMainFlexRouter$onLaunch$3$1$invokeSuspend$$inlined$safeCollectIn$1(w6.a(), null, this.$component), 3);
                wr30 wr30Var = this.this$0.L;
                tje.N(tseVar, null, null, new MtMainFlexRouter$onLaunch$3$1$invokeSuspend$$inlined$safeCollectIn$2(e.X(wr30Var.b(), new MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1(null, wr30Var)), null, this.$component), 3);
                b bVar = this.this$0;
                m010 m010Var2 = bVar.E;
                dz00 dz00Var = bVar.K;
                this.L$0 = null;
                this.L$1 = m010Var2;
                this.label = 1;
                obj = dz00Var.a.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                m010Var = m010Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m010Var = (m010) this.L$1;
                kotlin.b.b(obj);
            }
            m010Var.c.c(((k110) obj).b(), EmptyList.a, false);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainFlexRouter$onLaunch$3(b bVar, bo30 bo30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$component = bo30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainFlexRouter$onLaunch$3(this.this$0, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainFlexRouter$onLaunch$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o950 lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
