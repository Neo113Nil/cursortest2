package android.content.Context;

import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDragEventNovaXStrike5085 implements Runnable {
    public final /* synthetic */ String FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ArrayList FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterDragEventNovaXStrike5085(ArrayList arrayList, String str, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = arrayList;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        String str = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 0;
        ArrayList arrayList = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(str);
                    }
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    OnAdidReadListener onAdidReadListener2 = (OnAdidReadListener) obj2;
                    if (onAdidReadListener2 != null) {
                        onAdidReadListener2.onAdidRead(str);
                    }
                }
                break;
            case 2:
                int size3 = arrayList.size();
                while (i2 < size3) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj3;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener3 = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener3 != null) {
                            onAdidReadListener3.onAdidRead(str);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
                    }
                }
                break;
            default:
                int size4 = arrayList.size();
                while (i2 < size4) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj4;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAdidReadListener onAdidReadListener4 = adjustTimeoutCallback2.getOnAdidReadListener();
                        if (onAdidReadListener4 != null) {
                            onAdidReadListener4.onAdidRead(str);
                        }
                        adjustTimeoutCallback2.setOnAdidReadListener(null);
                    }
                }
                break;
        }
    }
}
