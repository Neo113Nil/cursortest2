package com.netcetera.threeds.sdk.infrastructure;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class setHorizontalScrollBarEnabled {
    private static int get = 1;
    private static int initialize;
    private final ConnectivityManager ThreeDS2Service;
    private final WifiManager getWarnings;

    public interface getWarnings {
        String n_(WifiInfo wifiInfo);
    }

    public setHorizontalScrollBarEnabled(WifiManager wifiManager, ConnectivityManager connectivityManager) {
        this.getWarnings = wifiManager;
        this.ThreeDS2Service = connectivityManager;
    }

    public ButtonCustomization ThreeDS2Service(getWarnings getwarnings, setEdgeEffectColor setedgeeffectcolor) {
        WifiInfo wifiInfo;
        int i = get;
        int i2 = (i ^ 18) + ((i & 18) << 1);
        initialize = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        if (setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
            int i3 = get;
            int i4 = i3 & 105;
            int i5 = ((i3 | 105) & (~i4)) + (i4 << 1);
            initialize = i5 % 128;
            if (i5 % 2 == 0) {
                return ButtonCustomization.ThreeDS2Service();
            }
            ButtonCustomization.ThreeDS2Service();
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            int i6 = get;
            initialize = ((((i6 | 78) << 1) - (i6 ^ 78)) - 1) % 128;
            wifiInfo = this.getWarnings.getConnectionInfo();
            get = (initialize + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            if (setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.get)) {
                get = (initialize + 53) % 128;
                ButtonCustomization ThreeDS2Service = ButtonCustomization.ThreeDS2Service();
                int i7 = initialize;
                int i8 = (((i7 & (-28)) | ((~i7) & 27)) - (~((i7 & 27) << 1))) - 1;
                get = i8 % 128;
                if (i8 % 2 != 0) {
                    return ThreeDS2Service;
                }
                throw null;
            }
            Network activeNetwork = this.ThreeDS2Service.getActiveNetwork();
            if (activeNetwork != null) {
                int i9 = get;
                int i10 = i9 & 25;
                int i11 = (i9 ^ 25) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                initialize = i12 % 128;
                int i13 = i12 % 2;
                ConnectivityManager connectivityManager = this.ThreeDS2Service;
                if (i13 != 0) {
                    wifiInfo = (WifiInfo) connectivityManager.getNetworkCapabilities(activeNetwork).getTransportInfo();
                    int i14 = 66 / 0;
                } else {
                    wifiInfo = (WifiInfo) connectivityManager.getNetworkCapabilities(activeNetwork).getTransportInfo();
                }
            } else {
                wifiInfo = null;
            }
        }
        if (wifiInfo == null) {
            ButtonCustomization buttonCustomization = (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
            get = ((-2) - ((initialize + 62) ^ (-1))) % 128;
            return buttonCustomization;
        }
        int i15 = get;
        int i16 = i15 ^ 115;
        int i17 = (i15 & 115) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        initialize = i18 % 128;
        if (i18 % 2 == 0) {
            return ButtonCustomization.getWarnings(getwarnings.n_(wifiInfo));
        }
        ButtonCustomization.getWarnings(getwarnings.n_(wifiInfo));
        throw null;
    }
}
