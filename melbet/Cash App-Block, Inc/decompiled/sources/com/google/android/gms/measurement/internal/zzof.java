package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.SingletonImmutableSet;

/* loaded from: classes.dex */
public abstract class zzof {
    public static final RegularImmutableList zza = ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean zzc(zzabw zzabwVar, RegularImmutableMap regularImmutableMap, RegularImmutableMap regularImmutableMap2, SingletonImmutableSet singletonImmutableSet, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        zzoe zzoeVar;
        char c;
        int zze = zze(zzabwVar);
        if (zze > 0 && (i2 != 1 || i != 1)) {
            cArr[zze] = '2';
        }
        if (zzi(zzabwVar, regularImmutableMap2) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && singletonImmutableSet.element.equals(str)) {
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = '1';
                }
                return true;
            }
            if (regularImmutableMap.containsKey(zzabwVar) && (zzoeVar = (zzoe) regularImmutableMap.get(zzabwVar)) != null) {
                int ordinal = zzoeVar.ordinal();
                zzabx zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    zzabx zzabxVar2 = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return zzi(zzabwVar, regularImmutableMap2) == zzabxVar ? zzh(zzabwVar, cArr, str3, z2) : zzg(zzabwVar, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return zzi(zzabwVar, regularImmutableMap2) == zzabxVar2 ? zzg(zzabwVar, cArr, str2, z) : zzh(zzabwVar, cArr, str3, z2);
                        }
                    } else if (zzi(zzabwVar, regularImmutableMap2) != zzabxVar2) {
                        return zzh(zzabwVar, cArr, str3, z2);
                    }
                } else if (zzi(zzabwVar, regularImmutableMap2) != zzabxVar) {
                    return zzg(zzabwVar, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (zze <= 0 || cArr[zze] == '2') {
            return false;
        }
        cArr[zze] = c;
        return false;
    }

    public static final int zze(zzabw zzabwVar) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String zzf(zzabw zzabwVar, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < zzabwVar.zza()) ? "0" : String.valueOf(str.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzabwVar.zza()) {
            str3 = String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean zzg(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int zze = zze(zzabwVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char charAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c;
        }
        return false;
    }

    public static final boolean zzh(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int zze = zze(zzabwVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char charAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c;
        }
        return false;
    }

    public static final zzabx zzi(zzabw zzabwVar, RegularImmutableMap regularImmutableMap) {
        Object obj = regularImmutableMap.get(zzabwVar);
        if (obj == null) {
            obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (zzabx) obj;
    }
}
