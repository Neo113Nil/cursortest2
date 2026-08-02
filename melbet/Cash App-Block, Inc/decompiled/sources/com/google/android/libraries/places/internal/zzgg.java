package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzgg {
    public final String zza;
    public final int zzb;
    public final zzgf zzc;
    public final boolean zzd;
    public final int zze;

    public zzgg(WifiInfo wifiInfo, ScanResult scanResult) {
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        boolean isEmpty = TextUtils.isEmpty(str2);
        zzgf zzgfVar = zzgf.zzd;
        if (!isEmpty) {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            if (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) {
                zzgfVar = zzgf.zza;
            } else if (upperCase.matches(".*WPA[0-9]*-PSK.*")) {
                zzgfVar = zzgf.zzb;
            } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                zzgfVar = zzgf.zzc;
            }
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = zzgfVar;
        this.zzd = z;
        this.zze = i2;
    }
}
