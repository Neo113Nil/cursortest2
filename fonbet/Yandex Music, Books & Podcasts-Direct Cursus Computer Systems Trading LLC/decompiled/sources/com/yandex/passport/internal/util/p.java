package com.yandex.passport.internal.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r0 = r0.get(0).topActivity;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        ComponentName componentName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks == null || runningTasks.size() == 0 || componentName == null) {
                return false;
            }
            return TextUtils.equals(componentName.getPackageName(), context.getPackageName());
        } catch (SecurityException unused) {
        }
        return false;
    }
}
