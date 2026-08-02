package androidx.camera.core.impl;

import androidx.camera.core.CameraIdentifier;
import com.stripe.hcaptcha.HCaptcha;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraPresenceProvider$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraPresenceProvider f$0;

    public /* synthetic */ CameraPresenceProvider$$ExternalSyntheticLambda3(CameraPresenceProvider cameraPresenceProvider, HCaptcha hCaptcha) {
        this.$r8$classId = 0;
        this.f$0 = cameraPresenceProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CameraPresenceProvider cameraPresenceProvider = this.f$0;
        switch (i) {
            case 0:
                Set set = CollectionsKt.toSet(cameraPresenceProvider.currentFilteredIds);
                if (set.isEmpty()) {
                    return;
                }
                set.getClass();
                return;
            case 1:
                Iterator it = cameraPresenceProvider.currentFilteredIds.iterator();
                while (it.hasNext()) {
                    cameraPresenceProvider.conditionallySetupCameraStateObserver(((CameraIdentifier) it.next()).getInternalId());
                }
                return;
            default:
                synchronized (cameraPresenceProvider.retryLock) {
                    try {
                        ScheduledFuture scheduledFuture = cameraPresenceProvider.retryScanFuture;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        StringUtilsKt.d("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        cameraPresenceProvider.scheduleRetryAttempt(3, cameraPresenceProvider.currentFilteredIds);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ CameraPresenceProvider$$ExternalSyntheticLambda3(CameraPresenceProvider cameraPresenceProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraPresenceProvider;
    }
}
