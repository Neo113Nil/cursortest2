package ru.yandex.taxi.logistics.sdk;

import defpackage.f92;
import defpackage.mvg;
import defpackage.npe;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.LogisticsDialogManagerDelegate$onFirstContentfulPaint$1", f = "LogisticsDialogManagerDelegate.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LogisticsDialogManagerDelegate$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    final /* synthetic */ npe $coreFeatures;
    Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsDialogManagerDelegate$onFirstContentfulPaint$1(npe npeVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.$coreFeatures = npeVar;
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogisticsDialogManagerDelegate$onFirstContentfulPaint$1(this.$coreFeatures, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogisticsDialogManagerDelegate$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            f92 f92Var = ((com.yandex.delivery.utils.dialogmanager.impl.b) ((y8g) this.$coreFeatures).a0.get()).b;
            ocz oczVar = new ocz(i2, this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (f92Var.collect(oczVar, this) == coroutineSingletons) {
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
