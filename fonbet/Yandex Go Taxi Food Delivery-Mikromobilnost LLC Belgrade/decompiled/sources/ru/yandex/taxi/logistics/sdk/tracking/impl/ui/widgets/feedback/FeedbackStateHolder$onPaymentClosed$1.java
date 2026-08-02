package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.mfz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.FeedbackStateHolder$onPaymentClosed$1", f = "FeedbackStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackStateHolder$onPaymentClosed$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $availableTypes;
    final /* synthetic */ String $selectedPaymentType;
    final /* synthetic */ mfz0 $tipModel;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackStateHolder$onPaymentClosed$1(List list, String str, e eVar, mfz0 mfz0Var, Continuation continuation) {
        super(2, continuation);
        this.$availableTypes = list;
        this.$selectedPaymentType = str;
        this.this$0 = eVar;
        this.$tipModel = mfz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackStateHolder$onPaymentClosed$1(this.$availableTypes, this.$selectedPaymentType, this.this$0, this.$tipModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FeedbackStateHolder$onPaymentClosed$1 feedbackStateHolder$onPaymentClosed$1 = (FeedbackStateHolder$onPaymentClosed$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        feedbackStateHolder$onPaymentClosed$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (kotlin.collections.a.G(this.$availableTypes, this.$selectedPaymentType)) {
            this.this$0.b(this.$tipModel);
        }
        return zy11.a;
    }
}
