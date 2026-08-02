package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.bvf0;
import defpackage.f770;
import defpackage.j770;
import defpackage.mea0;
import defpackage.mfz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.FeedbackStateHolder$openPaymentsForTips$1", f = "FeedbackStateHolder.kt", l = {166}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackStateHolder$openPaymentsForTips$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $availableTypes;
    final /* synthetic */ mfz0 $tipModel;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackStateHolder$openPaymentsForTips$1(e eVar, List list, mfz0 mfz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$availableTypes = list;
        this.$tipModel = mfz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackStateHolder$openPaymentsForTips$1(this.this$0, this.$availableTypes, this.$tipModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackStateHolder$openPaymentsForTips$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.logistics.payment.a aVar = this.this$0.i;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(aVar.a, this);
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
        mea0 mea0Var = (mea0) obj;
        boolean G = kotlin.collections.a.G(this.$availableTypes, mea0Var != null ? mea0Var.b : null);
        final e eVar = this.this$0;
        if (G) {
            eVar.b(this.$tipModel);
        } else {
            j770 j770Var = eVar.k;
            final List<String> list = this.$availableTypes;
            final mfz0 mfz0Var = this.$tipModel;
            j770Var.a.a(new f770(list, new tls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.b
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    e eVar2 = e.this;
                    tje.N(bvf0.a(eVar2.j.a), null, null, new FeedbackStateHolder$onPaymentClosed$1(list, (String) obj2, eVar2, mfz0Var, null), 3);
                    return zy11.a;
                }
            }));
        }
        return zy11.a;
    }
}
