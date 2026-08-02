package ru.yandex.taxi.masstransit.overlay.routes;

import defpackage.ay30;
import defpackage.bms;
import defpackage.ha2;
import defpackage.k110;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.sjh;
import defpackage.su30;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.masstransit.experiment.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.routes.MtRoutesOverlayPresenter$attachView$4", f = "MtRoutesOverlayPresenter.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesOverlayPresenter$attachView$4 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ay30 this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/f;", "summaryExp", "Lk110;", "stopsExp", "Lsu30;", "routes", "Lkotlin/Triple;", "<anonymous>", "(Lru/yandex/taxi/masstransit/experiment/f;Lk110;Lsu30;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.overlay.routes.MtRoutesOverlayPresenter$attachView$4$1", f = "MtRoutesOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.overlay.routes.MtRoutesOverlayPresenter$attachView$4$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.L$0 = (f) obj;
            anonymousClass1.L$1 = (k110) obj2;
            anonymousClass1.L$2 = (su30) obj3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f fVar = (f) this.L$0;
            k110 k110Var = (k110) this.L$1;
            su30 su30Var = (su30) this.L$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return new Triple(fVar, k110Var, su30Var);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesOverlayPresenter$attachView$4(ay30 ay30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ay30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesOverlayPresenter$attachView$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesOverlayPresenter$attachView$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ha2 n = e.n(this.this$0.D.b(), d.b(this.this$0.B.a), e.t(new ru.yandex.taxi.masstransit.datasource.routing.e(this.this$0.E.i)), new AnonymousClass1(4, null));
            this.this$0.z.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(n, mdh.b);
            ay30 ay30Var = this.this$0;
            o oVar = new o(F, new MtRoutesOverlayPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            pi00 pi00Var = new pi00(20, ay30Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(pi00Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
