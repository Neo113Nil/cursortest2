package androidx.camera.core.impl;

import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraPresenceProvider$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraPresenceProvider f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CameraPresenceProvider$$ExternalSyntheticLambda9(CameraPresenceProvider cameraPresenceProvider, List list, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cameraPresenceProvider;
        this.f$1 = list;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                CameraPresenceProvider cameraPresenceProvider = this.f$0;
                cameraPresenceProvider.backgroundExecutor.execute(new CameraPresenceProvider$$ExternalSyntheticLambda9(cameraPresenceProvider, this.f$1, this.f$2, i));
                break;
            default:
                CameraPresenceProvider cameraPresenceProvider2 = this.f$0;
                List list = this.f$1;
                int i2 = this.f$2;
                if (cameraPresenceProvider2.isMonitoring.get() && Intrinsics.areEqual(cameraPresenceProvider2.currentFilteredIds, list)) {
                    StringUtilsKt.d("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i2);
                    PipeCameraPresenceSource pipeCameraPresenceSource = cameraPresenceProvider2.sourcePresenceObservable;
                    if (pipeCameraPresenceSource != null) {
                        pipeCameraPresenceSource.fetchData();
                    }
                    cameraPresenceProvider2.scheduleRetryAttempt(i2 - 1, list);
                    break;
                }
                break;
        }
    }
}
