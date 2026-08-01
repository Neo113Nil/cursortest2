package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f19618a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f19619b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f19620c = "";

    /* renamed from: d, reason: collision with root package name */
    private static boolean f19621d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f19622e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f19623f = false;

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void b() {
    }

    private static String c() {
        if (f19621d) {
            return f19619b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i = com.anythink.core.common.v.m.p() == 2 ? 0 : 1;
            String o6 = com.anythink.core.common.v.m.o();
            jSONObject.put("status", i);
            jSONObject.put("amazonId", o6);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                f19620c = jSONObject2;
                f19619b = com.anythink.core.express.a.a.a(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        f19621d = true;
        return f19619b;
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f19622e = false;
        }
        if (f19623f) {
            return f19622e;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f19622e = context.getPackageManager().checkPermission(com.anythink.core.express.a.a.b("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f19622e = true;
        }
        f19623f = true;
        return f19622e;
    }

    public static String a() {
        if (TextUtils.isEmpty(f19620c) && !f19621d) {
            c();
        }
        return f19620c;
    }
}
