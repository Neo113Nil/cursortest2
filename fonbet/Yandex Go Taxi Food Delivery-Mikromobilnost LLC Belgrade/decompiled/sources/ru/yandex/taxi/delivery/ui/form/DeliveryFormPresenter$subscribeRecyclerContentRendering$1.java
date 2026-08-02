package ru.yandex.taxi.delivery.ui.form;

import defpackage.fki;
import defpackage.hai;
import defpackage.mji0;
import defpackage.mvg;
import defpackage.nq0;
import defpackage.ny61;
import defpackage.wai;
import defpackage.wls;
import defpackage.x5i;
import defpackage.y5i;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_form_common_data.api.DeliveryDataProvider$UpdateState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmji0;", "it", "Lzy11;", "<anonymous>", "(Lmji0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeRecyclerContentRendering$1", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeRecyclerContentRendering$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$subscribeRecyclerContentRendering$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryFormPresenter$subscribeRecyclerContentRendering$1 deliveryFormPresenter$subscribeRecyclerContentRendering$1 = new DeliveryFormPresenter$subscribeRecyclerContentRendering$1(this.this$0, continuation);
        deliveryFormPresenter$subscribeRecyclerContentRendering$1.L$0 = obj;
        return deliveryFormPresenter$subscribeRecyclerContentRendering$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryFormPresenter$subscribeRecyclerContentRendering$1 deliveryFormPresenter$subscribeRecyclerContentRendering$1 = (DeliveryFormPresenter$subscribeRecyclerContentRendering$1) create((mji0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryFormPresenter$subscribeRecyclerContentRendering$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        mji0 mji0Var = (mji0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y5i y5iVar = this.this$0.I;
        DeliveryDataProvider$UpdateState deliveryDataProvider$UpdateState = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        y5iVar.i = deliveryDataProvider$UpdateState;
        r0 r0Var = y5iVar.k;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new x5i(((x5i) value).a, deliveryDataProvider$UpdateState)));
        List list = mji0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            hai haiVar = (hai) obj2;
            if ((haiVar instanceof nq0) && (((nq0) haiVar).a() instanceof fki)) {
                arrayList.add(obj2);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        e eVar = this.this$0;
        if (isEmpty) {
            eVar.x.a();
            this.this$0.B.a("empty_destination");
            ((wai) this.this$0.Dg()).close();
        } else {
            ((wai) eVar.Dg()).K4(mji0Var);
        }
        return zy11.a;
    }
}
