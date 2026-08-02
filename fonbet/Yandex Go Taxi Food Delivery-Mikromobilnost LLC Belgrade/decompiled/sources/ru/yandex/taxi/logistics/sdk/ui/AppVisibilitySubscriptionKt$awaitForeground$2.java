package ru.yandex.taxi.logistics.sdk.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/yandex/taxi/logistics/sdk/ui/AppVisibilitySubscription$State;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionKt$awaitForeground$2", f = "AppVisibilitySubscription.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AppVisibilitySubscriptionKt$awaitForeground$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppVisibilitySubscriptionKt$awaitForeground$2 appVisibilitySubscriptionKt$awaitForeground$2 = new AppVisibilitySubscriptionKt$awaitForeground$2(2, continuation);
        appVisibilitySubscriptionKt$awaitForeground$2.L$0 = obj;
        return appVisibilitySubscriptionKt$awaitForeground$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppVisibilitySubscriptionKt$awaitForeground$2) create((AppVisibilitySubscription$State) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppVisibilitySubscription$State appVisibilitySubscription$State = (AppVisibilitySubscription$State) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(appVisibilitySubscription$State == AppVisibilitySubscription$State.FOREGROUND);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
