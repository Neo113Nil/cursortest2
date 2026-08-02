package com.knotapi.knot.services;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class Reporter$$ExternalSyntheticLambda13 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$initialize$0;
        lambda$initialize$0 = Reporter.lambda$initialize$0(runnable);
        return lambda$initialize$0;
    }
}
