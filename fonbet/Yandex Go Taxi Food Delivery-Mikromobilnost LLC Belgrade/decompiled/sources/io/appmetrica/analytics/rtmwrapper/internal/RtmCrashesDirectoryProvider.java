package io.appmetrica.analytics.rtmwrapper.internal;

import android.content.Context;
import java.io.File;

/* loaded from: classes9.dex */
public interface RtmCrashesDirectoryProvider {
    File getCrashesDirectory(Context context);

    File getCrashesTriggerDirectory(Context context);
}
