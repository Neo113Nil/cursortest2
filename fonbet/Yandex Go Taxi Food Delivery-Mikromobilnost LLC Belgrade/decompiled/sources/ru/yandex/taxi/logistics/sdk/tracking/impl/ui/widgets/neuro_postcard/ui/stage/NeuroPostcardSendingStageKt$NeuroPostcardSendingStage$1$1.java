package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.stage;

import defpackage.j460;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.stage.NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1", f = "NeuroPostcardSendingStage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $animationStarted$delegate;
    final /* synthetic */ tls $setStageAsShown;
    final /* synthetic */ j460 $stage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1(j460 j460Var, tls tlsVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$stage = j460Var;
        this.$setStageAsShown = tlsVar;
        this.$animationStarted$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1(this.$stage, this.$setStageAsShown, this.$animationStarted$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1 neuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1 = (NeuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        neuroPostcardSendingStageKt$NeuroPostcardSendingStage$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$animationStarted$delegate.setValue(Boolean.valueOf(!this.$stage.b));
        this.$setStageAsShown.invoke(this.$stage);
        return zy11.a;
    }
}
