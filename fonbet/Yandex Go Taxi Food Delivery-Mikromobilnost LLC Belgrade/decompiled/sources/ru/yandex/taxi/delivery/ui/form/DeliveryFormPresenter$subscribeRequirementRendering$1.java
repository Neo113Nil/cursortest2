package ru.yandex.taxi.delivery.ui.form;

import defpackage.hvi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.smi;
import defpackage.wai;
import defpackage.wls;
import defpackage.zlj0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsmi;", "model", "Lzy11;", "<anonymous>", "(Lsmi;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeRequirementRendering$1", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeRequirementRendering$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$subscribeRequirementRendering$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryFormPresenter$subscribeRequirementRendering$1 deliveryFormPresenter$subscribeRequirementRendering$1 = new DeliveryFormPresenter$subscribeRequirementRendering$1(this.this$0, continuation);
        deliveryFormPresenter$subscribeRequirementRendering$1.L$0 = obj;
        return deliveryFormPresenter$subscribeRequirementRendering$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryFormPresenter$subscribeRequirementRendering$1 deliveryFormPresenter$subscribeRequirementRendering$1 = (DeliveryFormPresenter$subscribeRequirementRendering$1) create((smi) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryFormPresenter$subscribeRequirementRendering$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        smi smiVar = (smi) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        hvi hviVar = eVar.B;
        if (eVar.p0) {
            Iterator it = smiVar.a.iterator();
            while (it.hasNext()) {
                String str = ((zlj0) it.next()).a().i;
                hviVar.getClass();
                if (str != null) {
                    hvi.c(hviVar, str);
                }
            }
            if (smiVar.b != null) {
                hviVar.getClass();
                hvi.c(hviVar, "DeliveryDetailsCard.RequirementsBlock.Shown");
            }
            eVar.p0 = false;
        }
        ((wai) this.this$0.Dg()).V4(smiVar.b);
        return zy11.a;
    }
}
