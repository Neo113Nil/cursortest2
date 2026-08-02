package io.appmetrica.analytics.rtm.internal.client;

import android.content.Context;
import java.io.File;

/* loaded from: classes9.dex */
public interface CrashesDirectoryProvider {
    File getCrashesDirectory(Context context);

    File getCrashesTriggerDirectory(Context context);
}
