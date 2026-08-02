package com.appsflyer.internal;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class AFc1bSDK$$ExternalSyntheticLambda0 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFc1bSDK.getCurrencyIso4217Code(runnable, threadPoolExecutor);
    }
}
