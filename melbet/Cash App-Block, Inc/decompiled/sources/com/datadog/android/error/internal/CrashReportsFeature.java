package com.datadog.android.error.internal;

import android.content.Context;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.core.internal.DatadogCore;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class CrashReportsFeature implements Feature {
    public final DatadogCore sdkCore;
    public final AtomicBoolean initialized = new AtomicBoolean(false);
    public Thread.UncaughtExceptionHandler originalUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    public final String name = "crash";

    public CrashReportsFeature(DatadogCore datadogCore) {
        this.sdkCore = datadogCore;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(Context context) {
        context.getClass();
        this.originalUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        DatadogExceptionHandler datadogExceptionHandler = new DatadogExceptionHandler(this.sdkCore, context);
        datadogExceptionHandler.previousHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(datadogExceptionHandler);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        Thread.setDefaultUncaughtExceptionHandler(this.originalUncaughtExceptionHandler);
        this.initialized.set(false);
    }
}
