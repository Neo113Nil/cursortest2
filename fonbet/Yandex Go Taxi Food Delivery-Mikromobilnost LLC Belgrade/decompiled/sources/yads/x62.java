package yads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import defpackage.hl61;

/* loaded from: classes7.dex */
public final class x62 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final hl61 a;

    public x62(hl61 hl61Var) {
        this.a = hl61Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.a.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
