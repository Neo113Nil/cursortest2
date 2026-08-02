package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.support.BrazeFileUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", f = "DefaultInAppMessageViewLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(Continuation<? super DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        Activity activity = BrazeInAppMessageManager.INSTANCE.getInstance().getActivity();
        if (activity != null) {
            BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(activity));
        }
        return Unit.INSTANCE;
    }
}
