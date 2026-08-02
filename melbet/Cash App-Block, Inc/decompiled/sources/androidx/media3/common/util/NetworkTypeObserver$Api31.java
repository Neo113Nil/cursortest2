package androidx.media3.common.util;

import android.content.Context;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.android.volley.NetworkResponse;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class NetworkTypeObserver$Api31 {

    public final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        public final NetworkResponse instance;

        public DisplayInfoCallback(NetworkResponse networkResponse) {
            this.instance = networkResponse;
        }

        public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            this.instance.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
        }
    }

    public static void disambiguate4gAnd5gNsa(Context context, NetworkResponse networkResponse) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            DisplayInfoCallback displayInfoCallback = new DisplayInfoCallback(networkResponse);
            telephonyManager.registerTelephonyCallback((Executor) networkResponse.data, displayInfoCallback);
            telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
        } catch (RuntimeException unused) {
            networkResponse.updateNetworkType(5);
        }
    }
}
