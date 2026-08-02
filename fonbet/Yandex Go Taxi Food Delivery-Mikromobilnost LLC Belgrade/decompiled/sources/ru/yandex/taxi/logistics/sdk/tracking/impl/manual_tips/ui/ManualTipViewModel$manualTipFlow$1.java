package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import defpackage.gf00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "currentTip", "Lru/yandex/taxi/logistics/sdk/tracking/impl/manual_tips/ui/ErrorType;", "error", "Lgf00;", "<anonymous>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/tracking/impl/manual_tips/ui/ErrorType;)Lgf00;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.ManualTipViewModel$manualTipFlow$1", f = "ManualTipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ManualTipViewModel$manualTipFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualTipViewModel$manualTipFlow$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ManualTipViewModel$manualTipFlow$1 manualTipViewModel$manualTipFlow$1 = new ManualTipViewModel$manualTipFlow$1(this.this$0, (Continuation) obj3);
        manualTipViewModel$manualTipFlow$1.L$0 = (String) obj;
        manualTipViewModel$manualTipFlow$1.L$1 = (ErrorType) obj2;
        return manualTipViewModel$manualTipFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        ErrorType errorType = (ErrorType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gf00 gf00Var = this.this$0.A;
        return new gf00(gf00Var.a, gf00Var.b, gf00Var.c, gf00Var.d, str, errorType);
    }
}
