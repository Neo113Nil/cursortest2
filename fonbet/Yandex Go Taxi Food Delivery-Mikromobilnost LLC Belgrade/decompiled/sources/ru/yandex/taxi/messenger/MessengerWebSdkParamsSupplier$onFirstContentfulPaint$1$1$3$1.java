package ru.yandex.taxi.messenger;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.yb20;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "authorized", "Lyb20;", "metricaParameters", "Lkotlin/Pair;", "<anonymous>", "(ZLyb20;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1", f = "MessengerWebSdkParamsSupplier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1 messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1 = new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1(3, (Continuation) obj3);
        messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1.Z$0 = booleanValue;
        messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1.L$0 = (yb20) obj2;
        return messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$3$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        yb20 yb20Var = (yb20) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(Boolean.valueOf(z), yb20Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
