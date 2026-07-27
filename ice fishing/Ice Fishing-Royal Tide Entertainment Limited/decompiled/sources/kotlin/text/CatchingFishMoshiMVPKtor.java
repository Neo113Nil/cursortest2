package kotlin.text;

import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMVPKtor implements Runnable {
    public final /* synthetic */ ArrayList CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ String CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMoshiMVPKtor(ArrayList arrayList, String str, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = arrayList;
        this.CatchingFishWorkManager = str;
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
                    OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(this.CatchingFishWorkManager);
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
                    OnAdidReadListener onAdidReadListener2 = (OnAdidReadListener) obj2;
                    if (onAdidReadListener2 != null) {
                        onAdidReadListener2.onAdidRead(this.CatchingFishWorkManager);
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
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj3;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener3 = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener3 != null) {
                            onAdidReadListener3.onAdidRead(this.CatchingFishWorkManager);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
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
                        OnAdidReadListener onAdidReadListener4 = adjustTimeoutCallback2.getOnAdidReadListener();
                        if (onAdidReadListener4 != null) {
                            onAdidReadListener4.onAdidRead(this.CatchingFishWorkManager);
                        }
                        adjustTimeoutCallback2.setOnAdidReadListener(null);
                    }
                }
                break;
        }
    }
}
