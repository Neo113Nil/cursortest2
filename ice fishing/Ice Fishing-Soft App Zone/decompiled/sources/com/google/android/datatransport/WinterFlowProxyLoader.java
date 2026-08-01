package com.google.android.datatransport;

import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyLoader implements Runnable {
    public final /* synthetic */ ArrayList WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ AdjustThirdPartySharingResult WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowProxyLoader(ArrayList arrayList, AdjustThirdPartySharingResult adjustThirdPartySharingResult, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = arrayList;
        this.WinterFlowUnitTestResponse = adjustThirdPartySharingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        AdjustThirdPartySharingResult adjustThirdPartySharingResult = this.WinterFlowUnitTestResponse;
        int i2 = 0;
        ArrayList arrayList = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = adjustTimeoutCallback.getOnThirdPartySharingSettingsReadListener();
                        if (onThirdPartySharingSettingsReadListener != null) {
                            onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(adjustThirdPartySharingResult);
                        }
                        adjustTimeoutCallback.setOnThirdPartySharingSettingsReadListener(null);
                    }
                }
                break;
            default:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener2 = adjustTimeoutCallback2.getOnThirdPartySharingSettingsReadListener();
                        if (onThirdPartySharingSettingsReadListener2 != null) {
                            onThirdPartySharingSettingsReadListener2.onThirdPartySharingSettingsRead(adjustThirdPartySharingResult);
                        }
                        adjustTimeoutCallback2.setOnThirdPartySharingSettingsReadListener(null);
                    }
                }
                break;
        }
    }
}
