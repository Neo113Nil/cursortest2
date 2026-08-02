package ru.yandex.taxi.masstransit.overlay.routes;

import defpackage.ay30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx30;
import defpackage.zx30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.routes.MtRoutesOverlayPresenter$attachView$3", f = "MtRoutesOverlayPresenter.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesOverlayPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ yx30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ay30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesOverlayPresenter$attachView$3(ay30 ay30Var, yx30 yx30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ay30Var;
        this.$mvpView = yx30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesOverlayPresenter$attachView$3(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesOverlayPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr M2 = this.this$0.x.M2();
            yx30 yx30Var = this.$mvpView;
            o oVar = new o(M2, new MtRoutesOverlayPresenter$attachView$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            zx30 zx30Var = new zx30(yx30Var, 2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(zx30Var, this) == coroutineSingletons) {
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
