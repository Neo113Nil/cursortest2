package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.Logger$LogcatLogger;

/* loaded from: classes.dex */
public abstract class PackageManagerHelper {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        androidx.work.Logger$LogcatLogger.get().debug(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setComponentEnabled(Context context, Class cls, boolean z) {
        String str = TAG;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            logger$LogcatLogger.debug(str, sb.toString());
        } catch (Exception e) {
            Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
            StringBuilder sb2 = new StringBuilder();
            Boxes$$ExternalSyntheticOutline1.m(cls, sb2, "could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (logger$LogcatLogger2.mLoggingLevel <= 3) {
                Log.d(str, sb3, e);
            }
        }
    }
}
