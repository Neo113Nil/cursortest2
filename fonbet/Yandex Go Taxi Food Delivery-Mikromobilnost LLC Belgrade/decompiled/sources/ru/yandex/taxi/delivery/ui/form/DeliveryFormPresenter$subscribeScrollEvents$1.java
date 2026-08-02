package ru.yandex.taxi.delivery.ui.form;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.hvi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isUp", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeScrollEvents$1", f = "DeliveryFormPresenter.kt", l = {206}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeScrollEvents$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$subscribeScrollEvents$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryFormPresenter$subscribeScrollEvents$1 deliveryFormPresenter$subscribeScrollEvents$1 = new DeliveryFormPresenter$subscribeScrollEvents$1(this.this$0, continuation);
        deliveryFormPresenter$subscribeScrollEvents$1.Z$0 = ((Boolean) obj).booleanValue();
        return deliveryFormPresenter$subscribeScrollEvents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DeliveryFormPresenter$subscribeScrollEvents$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hvi hviVar = this.this$0.B;
            hviVar.getClass();
            String str = z ? "up" : "down";
            i d = ((j) hviVar.b).d("DeliveryDetailsCard.Scrolled");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("direction_scroll", str);
            pex0 m = ((k) hviVar.a).m();
            linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
            d.m();
            this.Z$0 = z;
            this.label = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
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
