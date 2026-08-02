package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    public static final SparseArray sActiveWakeLocks = new SparseArray();
    public static int mNextId = 1;

    public static void completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
