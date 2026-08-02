package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* loaded from: classes9.dex */
public final class Ic extends C0676rb {
    public final File a(Context context) {
        return FileUtils.getFileFromAppStorage(context, "appmetrica_rtm_crashes");
    }

    public final File b(Context context) {
        return FileUtils.getFileFromAppStorage(context, "appmetrica_rtm_crashes_triggers");
    }
}
