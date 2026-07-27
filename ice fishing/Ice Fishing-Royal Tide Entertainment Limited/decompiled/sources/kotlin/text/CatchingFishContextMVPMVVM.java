package kotlin.text;

import android.content.ComponentName;
import android.os.PowerManager;
import androidx.core.app.JobIntentService;

/* loaded from: classes.dex */
public final class CatchingFishContextMVPMVVM {
    public boolean CatchingFishCoroutine;
    public final PowerManager.WakeLock CatchingFishParcelableFAB;
    public final PowerManager.WakeLock CatchingFishSnackbar;

    public CatchingFishContextMVPMVVM(JobIntentService jobIntentService, ComponentName componentName) {
        jobIntentService.getApplicationContext();
        PowerManager powerManager = (PowerManager) jobIntentService.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.CatchingFishParcelableFAB = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.CatchingFishSnackbar = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    public final void CatchingFishParcelableFAB() {
        synchronized (this) {
            try {
                if (this.CatchingFishCoroutine) {
                    this.CatchingFishCoroutine = false;
                    this.CatchingFishSnackbar.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
