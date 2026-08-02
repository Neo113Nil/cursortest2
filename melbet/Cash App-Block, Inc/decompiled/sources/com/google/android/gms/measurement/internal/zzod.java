package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.RegularImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzod {
    public final HashMap zza;

    public zzod(Map map) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    public final String zza() {
        StringBuilder sb = new StringBuilder();
        RegularImmutableList regularImmutableList = zzof.zza;
        int i = regularImmutableList.size;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) regularImmutableList.get(i2);
            HashMap hashMap = this.zza;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle zzb() {
        int zzf;
        HashMap hashMap = this.zza;
        if ("1".equals(hashMap.get("gdprApplies")) && "1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (hashMap.get("Version") == null) {
                if ("1".equals(hashMap.get("GoogleConsent")) && (zzf = zzf()) >= 0) {
                    String str2 = (String) hashMap.get("PurposeConsents");
                    if (TextUtils.isEmpty(str2)) {
                        return Bundle.EMPTY;
                    }
                    Bundle bundle = new Bundle();
                    if (str2.length() > 0) {
                        bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str2.length() > 6 && zzf >= 4) {
                        if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                            str = "granted";
                        }
                        bundle.putString("ad_user_data", str);
                    }
                    return bundle;
                }
                return Bundle.EMPTY;
            }
            if (zzf() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (zzf() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString("ad_user_data", str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int zzf() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
