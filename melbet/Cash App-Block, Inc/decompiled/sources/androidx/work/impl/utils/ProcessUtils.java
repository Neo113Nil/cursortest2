package androidx.work.impl.utils;

import android.app.Application;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;

/* loaded from: classes.dex */
public abstract class ProcessUtils {
    static {
        Logger$LogcatLogger.tagWithPrefix("ProcessUtils");
    }

    public static final boolean isDefaultProcess(Context context, Configuration configuration) {
        context.getClass();
        configuration.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        configuration.getClass();
        return processName.equals(context.getApplicationInfo().processName);
    }
}
