package com.anythink.core.common.u;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.u;

/* loaded from: classes.dex */
public final class h {
    private static void a(n nVar, int i, int i6, String str, String str2, int i9, Boolean bool, String str3, boolean z3, boolean z6, boolean z9, boolean z10) {
        u uVar = new u(nVar.aK(), null);
        uVar.f14075c = "1004684";
        uVar.a(nVar);
        uVar.f14076d = nVar.aJ();
        uVar.f14077e = nVar.aI();
        uVar.f14083l = String.valueOf(i);
        uVar.f14087p = String.valueOf(i9);
        uVar.f14088q = String.valueOf(nVar.aK());
        uVar.f14089r = z3 ? "1" : "2";
        uVar.f14090s = String.valueOf(i6);
        if (!TextUtils.isEmpty(str)) {
            uVar.f14091t = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14092u = str2;
        }
        uVar.f14093v = bool == null ? "0" : bool.booleanValue() ? "1" : "2";
        uVar.f14094w = str3;
        uVar.f14095x = z6 ? "1" : "2";
        uVar.f14096y = z9 ? "1" : "2";
        uVar.f14097z = String.valueOf(i);
        uVar.f14051A = z10 ? "1" : "2";
        e.b(uVar);
    }

    public static void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd) {
        String str2;
        String str3;
        try {
            String r9 = t.b().r();
            String str4 = "null";
            if (aTBaseAdAdapter == null) {
                str2 = "null";
                str3 = str2;
            } else {
                String obj = aTBaseAdAdapter.toString();
                n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
                if (trackingInfo == null) {
                    str3 = "null";
                } else {
                    str3 = trackingInfo.toString();
                }
                bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo != null) {
                    str4 = unitGroupInfo.toString();
                }
                str2 = str4;
                str4 = obj;
            }
            String str5 = "format: " + str + " | adapter: " + str4 + " | tracking: " + str3 + " | unitGroupInfo: " + str2;
            if (baseAd != null) {
                str5 = str5 + " | baseAd: " + baseAd.toString();
            }
            e.b("Empty ATAdInfo", str5, r9);
        } catch (Throwable unused) {
        }
    }
}
