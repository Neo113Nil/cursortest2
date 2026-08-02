package io.appmetrica.analytics.rtmwrapper.internal;

import android.content.Context;
import io.appmetrica.analytics.rtm.internal.client.CrashesDirectoryProvider;
import java.io.File;

/* loaded from: classes9.dex */
public class CrashesDirectoryProviderWrapper implements CrashesDirectoryProvider {
    private final RtmCrashesDirectoryProvider a;

    public CrashesDirectoryProviderWrapper(RtmCrashesDirectoryProvider rtmCrashesDirectoryProvider) {
        this.a = rtmCrashesDirectoryProvider;
    }

    @Override // io.appmetrica.analytics.rtm.internal.client.CrashesDirectoryProvider
    public File getCrashesDirectory(Context context) {
        return this.a.getCrashesDirectory(context);
    }

    @Override // io.appmetrica.analytics.rtm.internal.client.CrashesDirectoryProvider
    public File getCrashesTriggerDirectory(Context context) {
        return this.a.getCrashesTriggerDirectory(context);
    }
}
