package com.plaid.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class E0 {
    public final Context a;

    public E0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D0 a(D0 d0) {
        String[] strArr;
        String networkOperator;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk", 20901);
        jSONObject.put("accept", "json");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("device", jSONObject2);
        jSONObject2.put("os", "and");
        jSONObject2.put("ver", "" + Build.VERSION.SDK_INT);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str)) {
            str2 = Recorder$$ExternalSyntheticOutline2.m(str, " ", str2);
        }
        jSONObject2.put("model", str2);
        try {
            networkOperator = ((TelephonyManager) this.a.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(networkOperator)) {
            strArr = new String[]{networkOperator.substring(0, 3), networkOperator.substring(3)};
            if (strArr.length == 2) {
                jSONObject2.put("mcc", strArr[0]);
                jSONObject2.put("mnc", strArr[1]);
            }
            jSONObject2.put("ip", d0.a);
            if (d0.b != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("msg", C0330x7.a(d0.b.getMessage()));
                Exception exc = d0.b;
                if (exc instanceof r) {
                    r rVar = (r) exc;
                    EnumC0223l7 enumC0223l7 = rVar.a;
                    if (enumC0223l7 != null) {
                        jSONObject3.put("st", enumC0223l7.getCode());
                    }
                    if (rVar.a() != null) {
                        jSONObject3.put("er", rVar.a().getCode());
                    }
                }
                jSONObject.put(BreadcrumbHelper.Category.ERROR, jSONObject3);
            }
            return new D0(d0.a, d0.b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
        }
        strArr = new String[0];
        if (strArr.length == 2) {
        }
        jSONObject2.put("ip", d0.a);
        if (d0.b != null) {
        }
        return new D0(d0.a, d0.b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
    }
}
