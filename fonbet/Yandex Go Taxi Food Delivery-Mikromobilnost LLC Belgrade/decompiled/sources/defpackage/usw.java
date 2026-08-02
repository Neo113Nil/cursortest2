package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import defpackage.jxi;
import defpackage.usw;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.yx_platform_api.InternetConnectionManager$newTelephonyDisplayInfoListener$2$1;
import ru.yandex.yx_platform_api.NetworkReachabilityStatus;

/* loaded from: classes7.dex */
public final class usw {
    public final TelephonyManager a;
    public final ConnectivityManager b;
    public final WifiManager c;
    public TelephonyDisplayInfo d;
    public final i3y e = a.a(new ojw(14));
    public final i3y f;
    public final i3y g;

    public usw(TelephonyManager telephonyManager, ConnectivityManager connectivityManager, WifiManager wifiManager) {
        this.a = telephonyManager;
        this.b = connectivityManager;
        this.c = wifiManager;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: tsw
            public final /* synthetic */ usw b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                final usw uswVar = this.b;
                switch (i2) {
                    case 0:
                        return new PhoneStateListener() { // from class: ru.yandex.yx_platform_api.InternetConnectionManager$oldTelephonyDisplayInfoListener$2$1
                            @Override // android.telephony.PhoneStateListener
                            @jxi
                            public void onDisplayInfoChanged(TelephonyDisplayInfo newTelephonyDisplayInfo) {
                                try {
                                    super.onDisplayInfoChanged(newTelephonyDisplayInfo);
                                    usw.this.d = newTelephonyDisplayInfo;
                                } catch (SecurityException unused) {
                                }
                            }
                        };
                    default:
                        if (Build.VERSION.SDK_INT > 30) {
                            return new InternetConnectionManager$newTelephonyDisplayInfoListener$2$1(uswVar);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: tsw
            public final /* synthetic */ usw b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                final usw uswVar = this.b;
                switch (i22) {
                    case 0:
                        return new PhoneStateListener() { // from class: ru.yandex.yx_platform_api.InternetConnectionManager$oldTelephonyDisplayInfoListener$2$1
                            @Override // android.telephony.PhoneStateListener
                            @jxi
                            public void onDisplayInfoChanged(TelephonyDisplayInfo newTelephonyDisplayInfo) {
                                try {
                                    super.onDisplayInfoChanged(newTelephonyDisplayInfo);
                                    usw.this.d = newTelephonyDisplayInfo;
                                } catch (SecurityException unused) {
                                }
                            }
                        };
                    default:
                        if (Build.VERSION.SDK_INT > 30) {
                            return new InternetConnectionManager$newTelephonyDisplayInfoListener$2$1(uswVar);
                        }
                        return null;
                }
            }
        });
    }

    public final Map a(NetworkCapabilities networkCapabilities) {
        NetworkCapabilities networkCapabilities2;
        Pair pair;
        Integer num;
        SignalStrength signalStrength;
        Integer valueOf;
        int networkType;
        String str = JCP.RAW_PREFIX;
        if (networkCapabilities == null) {
            ConnectivityManager connectivityManager = this.b;
            networkCapabilities2 = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities2 == null) {
                return b.i(new Pair("type", JCP.RAW_PREFIX), new Pair("network_reachable", "UNREACHABLE"));
            }
        } else {
            networkCapabilities2 = networkCapabilities;
        }
        boolean hasTransport = networkCapabilities2.hasTransport(1);
        TelephonyManager telephonyManager = this.a;
        String str2 = null;
        if (hasTransport) {
            pair = new Pair(1, b(networkCapabilities2));
        } else if (networkCapabilities2.hasTransport(0)) {
            try {
                signalStrength = telephonyManager.getSignalStrength();
            } catch (SecurityException unused) {
            }
            if (signalStrength != null) {
                num = Integer.valueOf(signalStrength.getLevel());
                pair = new Pair(0, num);
            }
            num = null;
            pair = new Pair(0, num);
        } else {
            pair = networkCapabilities2.hasTransport(3) ? new Pair(3, null) : networkCapabilities2.hasTransport(2) ? new Pair(2, null) : networkCapabilities2.hasTransport(5) ? new Pair(5, b(networkCapabilities2)) : networkCapabilities2.hasTransport(6) ? new Pair(6, null) : (Build.VERSION.SDK_INT < 31 || !networkCapabilities2.hasTransport(8)) ? networkCapabilities2.hasTransport(4) ? new Pair(4, null) : new Pair(null, null) : new Pair(8, null);
        }
        Integer num2 = (Integer) pair.getFirst();
        Integer num3 = (Integer) pair.getSecond();
        if (num2 != null) {
            str = num2.intValue() == 1 ? "WIFI" : num2.intValue() == 0 ? "CELLULAR" : num2.intValue() == 3 ? "ETHERNET" : num2.intValue() == 2 ? "BLUETOOTH" : num2.intValue() == 4 ? "VPN" : num2.intValue() == 5 ? "WIFI_AWARE" : num2.intValue() == 6 ? "LOWPAN" : num2.intValue() == 8 ? "USB" : "OTHER";
        }
        if (networkCapabilities2.hasTransport(0)) {
            if (Build.VERSION.SDK_INT < 30) {
                try {
                    valueOf = Integer.valueOf(telephonyManager.getDataNetworkType());
                } catch (SecurityException | UnsupportedOperationException unused2) {
                }
            } else {
                TelephonyDisplayInfo telephonyDisplayInfo = this.d;
                if (telephonyDisplayInfo != null) {
                    networkType = telephonyDisplayInfo.getNetworkType();
                    valueOf = Integer.valueOf(networkType);
                }
                valueOf = null;
            }
            if ((valueOf != null && valueOf.intValue() == 1) || ((valueOf != null && valueOf.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 4) || ((valueOf != null && valueOf.intValue() == 7) || ((valueOf != null && valueOf.intValue() == 11) || (valueOf != null && valueOf.intValue() == 16)))))) {
                str2 = "2G";
            } else if ((valueOf != null && valueOf.intValue() == 3) || ((valueOf != null && valueOf.intValue() == 5) || ((valueOf != null && valueOf.intValue() == 6) || ((valueOf != null && valueOf.intValue() == 8) || ((valueOf != null && valueOf.intValue() == 9) || ((valueOf != null && valueOf.intValue() == 10) || ((valueOf != null && valueOf.intValue() == 12) || ((valueOf != null && valueOf.intValue() == 14) || ((valueOf != null && valueOf.intValue() == 15) || (valueOf != null && valueOf.intValue() == 17)))))))))) {
                str2 = "3G";
            } else if ((valueOf != null && valueOf.intValue() == 13) || ((valueOf != null && valueOf.intValue() == 18) || (valueOf != null && valueOf.intValue() == 19))) {
                str2 = "4G";
            } else if (valueOf != null && valueOf.intValue() == 20) {
                str2 = "5G";
            }
        }
        return b.i(new Pair("type", str), new Pair("generation", str2), new Pair("vpn", Boolean.valueOf(networkCapabilities2.hasTransport(4))), new Pair("strength", num3), new Pair("network_reachable", (networkCapabilities2.hasCapability(16) ? NetworkReachabilityStatus.REACHABLE : NetworkReachabilityStatus.UNREACHABLE).name()));
    }

    public final Integer b(NetworkCapabilities networkCapabilities) {
        int calculateSignalLevel;
        TransportInfo transportInfo = networkCapabilities.getTransportInfo();
        WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
        Integer valueOf = wifiInfo != null ? Integer.valueOf(wifiInfo.getRssi()) : null;
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        if (Build.VERSION.SDK_INT < 30) {
            return Integer.valueOf(WifiManager.calculateSignalLevel(intValue, 5));
        }
        calculateSignalLevel = this.c.calculateSignalLevel(intValue);
        return Integer.valueOf(calculateSignalLevel);
    }
}
