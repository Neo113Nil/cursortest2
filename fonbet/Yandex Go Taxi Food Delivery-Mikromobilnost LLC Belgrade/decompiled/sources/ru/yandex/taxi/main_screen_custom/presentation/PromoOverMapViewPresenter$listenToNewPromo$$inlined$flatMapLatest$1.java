package ru.yandex.taxi.main_screen_custom.presentation;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.g92;
import defpackage.i0z;
import defpackage.mq30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vom;
import defpackage.vpr;
import defpackage.wof0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.domain.MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main_screen_custom.presentation.PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1", f = "PromoOverMapViewPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1(Continuation continuation, v vVar) {
        super(3, continuation);
        this.this$0 = vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1 promoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1 = new PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        promoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        promoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1.L$1 = obj2;
        return promoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr s;
        kotlinx.coroutines.flow.internal.g c;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            switch (wof0.a[((Screen) obj2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    s = kotlinx.coroutines.flow.e.s(this.this$0.D.b(), vom.I);
                    break;
                case 5:
                    mq30 mq30Var = (mq30) this.this$0.E;
                    c = ((ru.yandex.taxi.masstransit.repository.a) mq30Var.a).c(MtSummaryCommunicationsParam.CommunicationState.MtScreenType.MASSTRANSIT_MAIN, kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.d(mq30Var.b.b), new i0z(25)), null);
                    s = new i(new g(kotlinx.coroutines.flow.e.X(new ru.yandex.taxi.masstransit.domain.p(new ru.yandex.taxi.masstransit.domain.n(new ru.yandex.taxi.masstransit.domain.l(c)), mq30Var), new MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$flatMapLatest$1(null, mq30Var)), this.this$0.z));
                    break;
                case 6:
                    v vVar = this.this$0;
                    s = new m(kotlinx.coroutines.flow.e.s(new k(vVar.K.a.a, vVar.A), vom.J));
                    break;
                case 7:
                    s = new q(kotlinx.coroutines.flow.e.s(new o(((com.yandex.go.delivery.tracking.objects_over_map.e) this.this$0.L).b(), this.this$0.B), vom.K));
                    break;
                default:
                    s = new g92(2, Optional.empty());
                    break;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(s, vprVar, this) == coroutineSingletons) {
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
