package kotlin.text;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorLifecycle implements Runnable {
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishKtorLifecycle(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.CatchingFishParcelableFAB;
                return;
            default:
                CatchingFishBundleGradle catchingFishBundleGradle = CatchingFishGradleCameraX.CatchingFishToolbar;
                synchronized (catchingFishBundleGradle) {
                    try {
                        int i2 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
                            int i3 = catchingFishBundleGradle.CatchingFishSnackbar;
                            while (i2 < i3) {
                                CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) objArr[i2];
                                boolean showLayoutBounds = catchingFishGradleCameraX.getShowLayoutBounds();
                                Class cls = CatchingFishGradleCameraX.CatchingFishLiveDataRoom;
                                catchingFishGradleCameraX.setShowLayoutBounds(CatchingFishRobolectricHilt.CatchingFishSpannableWidget());
                                if (showLayoutBounds != catchingFishGradleCameraX.getShowLayoutBounds()) {
                                    CatchingFishGradleCameraX.CatchingFishUnitTesting(catchingFishGradleCameraX.getRoot());
                                }
                                i2++;
                            }
                        } else {
                            Object[] objArr2 = catchingFishBundleGradle.CatchingFishParcelableFAB;
                            int i4 = catchingFishBundleGradle.CatchingFishSnackbar;
                            while (i2 < i4) {
                                CatchingFishGradleCameraX.CatchingFishUnitTesting(((CatchingFishGradleCameraX) objArr2[i2]).getRoot());
                                i2++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
