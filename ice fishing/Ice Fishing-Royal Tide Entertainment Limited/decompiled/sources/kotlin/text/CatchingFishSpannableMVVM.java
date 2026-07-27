package kotlin.text;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishSpannableMVVM implements Runnable {
    public final /* synthetic */ ArrayList CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ AdjustAttribution CatchingFishWorkManager;

    public /* synthetic */ CatchingFishSpannableMVVM(ArrayList arrayList, AdjustAttribution adjustAttribution, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = arrayList;
        this.CatchingFishWorkManager = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = this.CatchingFishDaggerWebsocket;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(this.CatchingFishWorkManager);
                    }
                }
                break;
            case 1:
                ArrayList arrayList2 = this.CatchingFishDaggerWebsocket;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener2 = adjustTimeoutCallback.getOnAttributionReadListener();
                        if (onAttributionReadListener2 != null) {
                            onAttributionReadListener2.onAttributionRead(this.CatchingFishWorkManager);
                        }
                        adjustTimeoutCallback.setOnAttributionReadListener(null);
                    }
                }
                break;
            case 2:
                ArrayList arrayList3 = this.CatchingFishDaggerWebsocket;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    OnAttributionReadListener onAttributionReadListener3 = (OnAttributionReadListener) obj3;
                    if (onAttributionReadListener3 != null) {
                        onAttributionReadListener3.onAttributionRead(this.CatchingFishWorkManager);
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.CatchingFishDaggerWebsocket;
                int size4 = arrayList4.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj4;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener4 = adjustTimeoutCallback2.getOnAttributionReadListener();
                        if (onAttributionReadListener4 != null) {
                            onAttributionReadListener4.onAttributionRead(this.CatchingFishWorkManager);
                        }
                        adjustTimeoutCallback2.setOnAttributionReadListener(null);
                    }
                }
                break;
        }
    }
}
