package com.datadog.android.rum;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DdRumContentProvider extends ContentProvider {
    public static final long createTimeNs = System.nanoTime();
    public static int processImportance;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (processImportance != 0) {
            return true;
        }
        Context context = getContext();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        Object systemService = context != null ? context.getSystemService("activity") : null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        int myPid = Process.myPid();
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == myPid) {
                    runningAppProcessInfo = next;
                    break;
                }
            }
            runningAppProcessInfo = runningAppProcessInfo;
        }
        int i = runningAppProcessInfo != null ? runningAppProcessInfo.importance : 100;
        processImportance = i;
        Log.w("DdRumContentProvider", "processImportance:" + i);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
