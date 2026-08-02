package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jw40;
import defpackage.mea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.shi;
import defpackage.thi;
import defpackage.tse;
import defpackage.uhi;
import defpackage.w511;
import defpackage.wls;
import defpackage.yuj0;
import defpackage.z9h;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api.PayNowStateHolder$payNow$1", f = "PayNowStateHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayNowStateHolder$payNow$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayNowStateHolder$payNow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PayNowStateHolder$payNow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PayNowStateHolder$payNow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mea0 mea0Var = this.this$0.f;
            if (mea0Var != null) {
                a aVar2 = this.this$0;
                ru.yandex.taxi.logistics.sdk.pay_on_delivery.a aVar3 = aVar2.c;
                String str = aVar2.a;
                this.L$0 = aVar2;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = aVar3.a(str, mea0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = (a) this.L$0;
        b.b(obj);
        uhi uhiVar = (uhi) obj;
        z9h z9hVar = aVar.d;
        z9hVar.getClass();
        if (uhiVar instanceof shi) {
            jw40 jw40Var = ((shi) uhiVar).a;
            if (jw40Var != null) {
                z9hVar.b.b(new qej(jw40Var.a, jw40Var.b, jw40Var.c.a, null, null, false, jw40Var.f, null, 184));
            } else {
                yuj0 yuj0Var = z9hVar.a;
                z9hVar.b.b(new qej(yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]), null, yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), null, null, false, null, null, 184));
            }
        } else if (!(uhiVar instanceof thi)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
