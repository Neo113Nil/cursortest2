package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes7.dex */
public final class xi10 implements wi10 {
    public final Context a;

    public xi10(Context context) {
        this.a = context;
    }

    public final vi10 a() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        Object systemService = this.a.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return new vi10(memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, freeMemory, memoryInfo.lowMemory);
    }
}
