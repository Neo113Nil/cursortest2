package androidx.glance.session;

import android.content.Context;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.paging.FlowExtKt$simpleScan$1;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ Context $context$inlined;
    public final /* synthetic */ AppWidgetSession $session$inlined;
    public final /* synthetic */ TimerScopeKt$withTimer$2$1$blockScope$1 $this_runSession$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, AppWidgetSession appWidgetSession, Context context) {
        super(CoroutineExceptionHandler.Key.$$INSTANCE);
        this.$this_runSession$inlined = timerScopeKt$withTimer$2$1$blockScope$1;
        this.$session$inlined = appWidgetSession;
        this.$context$inlined = context;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        AppWidgetSession appWidgetSession = this.$session$inlined;
        Context context = this.$context$inlined;
        TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = this.$this_runSession$inlined;
        JobKt.launch$default(timerScopeKt$withTimer$2$1$blockScope$1, null, null, new FlowExtKt$simpleScan$1(appWidgetSession, context, th, timerScopeKt$withTimer$2$1$blockScope$1, (Continuation) null, 22), 3);
    }
}
