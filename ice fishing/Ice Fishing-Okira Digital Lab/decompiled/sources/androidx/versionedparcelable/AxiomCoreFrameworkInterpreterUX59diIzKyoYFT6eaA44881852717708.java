package androidx.versionedparcelable;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreFrameworkInterpreterUX59diIzKyoYFT6eaA44881852717708 implements Runnable {
    public final /* synthetic */ ArrayList LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ AdjustAttribution YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ AxiomCoreFrameworkInterpreterUX59diIzKyoYFT6eaA44881852717708(ArrayList arrayList, AdjustAttribution adjustAttribution, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = arrayList;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        AdjustAttribution adjustAttribution = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i2 = 0;
        ArrayList arrayList = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(adjustAttribution);
                    }
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener2 = adjustTimeoutCallback.getOnAttributionReadListener();
                        if (onAttributionReadListener2 != null) {
                            onAttributionReadListener2.onAttributionRead(adjustAttribution);
                        }
                        adjustTimeoutCallback.setOnAttributionReadListener(null);
                    }
                }
                break;
            case 2:
                int size3 = arrayList.size();
                while (i2 < size3) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    OnAttributionReadListener onAttributionReadListener3 = (OnAttributionReadListener) obj3;
                    if (onAttributionReadListener3 != null) {
                        onAttributionReadListener3.onAttributionRead(adjustAttribution);
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
                        OnAttributionReadListener onAttributionReadListener4 = adjustTimeoutCallback2.getOnAttributionReadListener();
                        if (onAttributionReadListener4 != null) {
                            onAttributionReadListener4.onAttributionRead(adjustAttribution);
                        }
                        adjustTimeoutCallback2.setOnAttributionReadListener(null);
                    }
                }
                break;
        }
    }
}
