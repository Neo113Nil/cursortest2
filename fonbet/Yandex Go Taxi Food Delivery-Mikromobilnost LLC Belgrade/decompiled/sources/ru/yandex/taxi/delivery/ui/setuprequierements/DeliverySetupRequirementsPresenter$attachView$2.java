package ru.yandex.taxi.delivery.ui.setuprequierements;

import defpackage.lpi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lhpi;", "models", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.setuprequierements.DeliverySetupRequirementsPresenter$attachView$2", f = "DeliverySetupRequirementsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySetupRequirementsPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ lpi $mvpView;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySetupRequirementsPresenter$attachView$2(lpi lpiVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = lpiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliverySetupRequirementsPresenter$attachView$2 deliverySetupRequirementsPresenter$attachView$2 = new DeliverySetupRequirementsPresenter$attachView$2(this.$mvpView, continuation);
        deliverySetupRequirementsPresenter$attachView$2.L$0 = obj;
        return deliverySetupRequirementsPresenter$attachView$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliverySetupRequirementsPresenter$attachView$2 deliverySetupRequirementsPresenter$attachView$2 = (DeliverySetupRequirementsPresenter$attachView$2) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliverySetupRequirementsPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$mvpView.Pe(list);
        return zy11.a;
    }
}
