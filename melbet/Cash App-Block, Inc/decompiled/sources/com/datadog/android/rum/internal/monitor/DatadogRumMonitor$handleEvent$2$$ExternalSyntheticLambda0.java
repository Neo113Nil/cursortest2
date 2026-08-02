package com.datadog.android.rum.internal.monitor;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.rum.internal.domain.scope.RumApplicationScope;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ DatadogRumMonitor f$0;
    public final /* synthetic */ RumRawEvent f$1;
    public final /* synthetic */ DatadogContext f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0(DatadogRumMonitor datadogRumMonitor, RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1) {
        this.f$0 = datadogRumMonitor;
        this.f$1 = rumRawEvent;
        this.f$2 = datadogContext;
        this.f$3 = function1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        RumViewScope activeView$dd_sdk_android_rum_release;
        DatadogRumMonitor datadogRumMonitor = this.f$0;
        RumRawEvent rumRawEvent = this.f$1;
        DatadogContext datadogContext = this.f$2;
        Function1 function1 = this.f$3;
        synchronized (datadogRumMonitor.rootScope) {
            DatadogRumMonitor.access$handleEventWithMethodCallPerf(datadogRumMonitor, rumRawEvent, datadogContext, function1);
        }
        datadogRumMonitor.handler.postDelayed(datadogRumMonitor.keepAliveRunnable, 300000L);
        RumApplicationScope rumApplicationScope = datadogRumMonitor.rootScope;
        RumSessionScope activeSession = rumApplicationScope.getActiveSession();
        return (activeSession == null || (activeView$dd_sdk_android_rum_release = activeSession.getActiveView$dd_sdk_android_rum_release()) == null) ? activeSession != null ? activeSession.getRumContext() : rumApplicationScope.rumContext : activeView$dd_sdk_android_rum_release.getRumContext();
    }
}
