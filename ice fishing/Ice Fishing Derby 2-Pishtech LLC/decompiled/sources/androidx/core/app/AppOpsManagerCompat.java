package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static String permissionToOp(String str) {
        String permissionToOp;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        permissionToOp = AppOpsManager.permissionToOp(str);
        return permissionToOp;
    }

    public static int noteOp(Context context, String str, int i, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    public static int noteOpNoThrow(Context context, String str, int i, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        Object systemService;
        int noteProxyOp;
        if (Build.VERSION.SDK_INT < 23) {
            return 1;
        }
        systemService = context.getSystemService((Class<Object>) AppOpsManager.class);
        noteProxyOp = ((AppOpsManager) systemService).noteProxyOp(str, str2);
        return noteProxyOp;
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        Object systemService;
        int noteProxyOpNoThrow;
        if (Build.VERSION.SDK_INT < 23) {
            return 1;
        }
        systemService = context.getSystemService((Class<Object>) AppOpsManager.class);
        noteProxyOpNoThrow = ((AppOpsManager) systemService).noteProxyOpNoThrow(str, str2);
        return noteProxyOpNoThrow;
    }
}
