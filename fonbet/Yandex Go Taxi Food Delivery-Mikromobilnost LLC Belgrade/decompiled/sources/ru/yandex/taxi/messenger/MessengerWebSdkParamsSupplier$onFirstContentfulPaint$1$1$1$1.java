package ru.yandex.taxi.messenger;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "fcm", CoreConstants.Transport.HMS}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1", f = "MessengerWebSdkParamsSupplier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1 messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1 = new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1(3, (Continuation) obj3);
        messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1.L$0 = (String) obj;
        messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1.L$1 = (String) obj2;
        return messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(str, str2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
