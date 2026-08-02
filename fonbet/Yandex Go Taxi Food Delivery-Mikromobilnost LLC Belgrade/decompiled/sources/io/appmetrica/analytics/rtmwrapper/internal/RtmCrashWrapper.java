package io.appmetrica.analytics.rtmwrapper.internal;

import android.content.Context;
import io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor;

/* loaded from: classes9.dex */
public class RtmCrashWrapper implements IRtmCrashWrapper {
    private final ExceptionProcessor a;

    public RtmCrashWrapper(RtmCrashesDirectoryProvider rtmCrashesDirectoryProvider, Context context) throws Throwable {
        this(new ExceptionProcessor(context, new CrashesDirectoryProviderWrapper(rtmCrashesDirectoryProvider)));
    }

    @Override // io.appmetrica.analytics.rtmwrapper.internal.IRtmCrashWrapper
    public void reportException(String str, Throwable th) {
        try {
            this.a.onException(str, th);
        } catch (Throwable unused) {
        }
    }

    public RtmCrashWrapper(ExceptionProcessor exceptionProcessor) {
        this.a = exceptionProcessor;
    }
}
