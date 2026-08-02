package app.cash.cdp.backend.android;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import app.cash.cdp.api.providers.DeviceInfo;

/* loaded from: classes.dex */
public final class AndroidDeviceInfoProvider {
    public final String deviceId;
    public final TelephonyManager telephonyManager;

    public AndroidDeviceInfoProvider(Context context, String str) {
        this.deviceId = str;
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        this.telephonyManager = (TelephonyManager) systemService;
    }

    public final DeviceInfo getDeviceInfo() {
        String str;
        String str2;
        Build.MANUFACTURER.getClass();
        Build.MODEL.getClass();
        TelephonyManager telephonyManager = this.telephonyManager;
        String simCountryIso = telephonyManager.getSimCountryIso();
        String simOperator = telephonyManager.getSimOperator();
        simCountryIso.getClass();
        DeviceInfo.Screen.Orientation orientation = null;
        try {
            simOperator.getClass();
            str = simOperator.substring(0, 3);
        } catch (IndexOutOfBoundsException unused) {
            str = null;
        }
        try {
            simOperator.getClass();
            str2 = simOperator.substring(3, simOperator.length());
        } catch (IndexOutOfBoundsException unused2) {
            str2 = null;
        }
        DeviceInfo.Sim sim = new DeviceInfo.Sim(simCountryIso, str, str2);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        String valueOf = String.valueOf(displayMetrics.densityDpi);
        int i3 = Resources.getSystem().getConfiguration().orientation;
        if (i3 == 1) {
            orientation = DeviceInfo.Screen.Orientation.PORTRAIT;
        } else if (i3 == 2) {
            orientation = DeviceInfo.Screen.Orientation.LANDSCAPE;
        }
        return new DeviceInfo(this.deviceId, new DeviceInfo.Screen(i2, i, valueOf, orientation), sim);
    }
}
