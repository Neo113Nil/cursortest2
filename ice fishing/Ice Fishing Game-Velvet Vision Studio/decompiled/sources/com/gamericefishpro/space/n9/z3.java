package com.gamericefishpro.space.n9;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3 {
    public static final com.gamericefishpro.space.ua.h a;

    static {
        com.gamericefishpro.space.ua.b bVar = com.gamericefishpro.space.ua.d.e;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        com.gamericefishpro.space.hj.c.l(24, objArr);
        a = com.gamericefishpro.space.ua.d.h(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.gamericefishpro.space.i9.n4 n4Var, com.gamericefishpro.space.ua.m mVar, com.gamericefishpro.space.ua.m mVar2, com.gamericefishpro.space.ua.o oVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        y3 y3Var;
        char c;
        int iC = c(n4Var);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(n4Var, mVar2) == com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (n4Var == com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && oVar.v.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (mVar.containsKey(n4Var) && (y3Var = (y3) mVar.get(n4Var)) != null) {
                int iOrdinal = y3Var.ordinal();
                com.gamericefishpro.space.i9.o4 o4Var = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.gamericefishpro.space.i9.o4 o4Var2 = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(n4Var, mVar2) == o4Var ? f(n4Var, cArr, str3, z2) : e(n4Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(n4Var, mVar2) == o4Var2 ? e(n4Var, cArr, str2, z) : f(n4Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(n4Var, mVar2) != o4Var2) {
                        return f(n4Var, cArr, str3, z2);
                    }
                } else if (g(n4Var, mVar2) != o4Var) {
                    return e(n4Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(com.gamericefishpro.space.i9.n4 n4Var) {
        if (n4Var == com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (n4Var == com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (n4Var == com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return n4Var == com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.gamericefishpro.space.i9.n4 n4Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < n4Var.a()) ? "0" : String.valueOf(str.charAt(n4Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= n4Var.a()) {
            strValueOf = String.valueOf(str2.charAt(n4Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.gamericefishpro.space.i9.n4 n4Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(n4Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= n4Var.a()) {
                char cCharAt = str.charAt(n4Var.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(com.gamericefishpro.space.i9.n4 n4Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(n4Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= n4Var.a()) {
                char cCharAt = str.charAt(n4Var.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final com.gamericefishpro.space.i9.o4 g(com.gamericefishpro.space.i9.n4 n4Var, com.gamericefishpro.space.ua.m mVar) {
        Object obj = mVar.get(n4Var);
        if (obj == null) {
            obj = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.gamericefishpro.space.i9.o4) obj;
    }
}
