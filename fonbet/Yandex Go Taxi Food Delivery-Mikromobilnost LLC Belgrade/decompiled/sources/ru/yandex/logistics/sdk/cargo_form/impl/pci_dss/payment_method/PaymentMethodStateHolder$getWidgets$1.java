package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method;

import defpackage.bms;
import defpackage.h6a0;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6a0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Lq6a0;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(ZLq6a0;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.PaymentMethodStateHolder$getWidgets$1", f = "PaymentMethodStateHolder.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PaymentMethodStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        PaymentMethodStateHolder$getWidgets$1 paymentMethodStateHolder$getWidgets$1 = new PaymentMethodStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        paymentMethodStateHolder$getWidgets$1.L$0 = (q6a0) obj2;
        paymentMethodStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return paymentMethodStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q6a0 q6a0Var = (q6a0) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (q6a0Var == null || this.this$0.e.C(q6a0Var)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar.a(q6a0Var, j6sVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Collections.singletonList((h6a0) obj);
    }
}
