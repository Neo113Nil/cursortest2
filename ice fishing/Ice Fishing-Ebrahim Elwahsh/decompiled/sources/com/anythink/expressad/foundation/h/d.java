package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f19776a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f19777b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f19778c = "";

    /* renamed from: d, reason: collision with root package name */
    private static boolean f19779d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f19780e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f19781f = false;

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
        if (f19779d) {
            return f19777b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i = com.anythink.core.common.v.m.p() == 2 ? 0 : 1;
            String o9 = com.anythink.core.common.v.m.o();
            jSONObject.put("status", i);
            jSONObject.put("amazonId", o9);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                f19778c = jSONObject2;
                f19777b = com.anythink.core.express.a.a.a(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        f19779d = true;
        return f19777b;
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f19780e = false;
        }
        if (f19781f) {
            return f19780e;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f19780e = context.getPackageManager().checkPermission(com.anythink.core.express.a.a.b("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f19780e = true;
        }
        f19781f = true;
        return f19780e;
    }

    public static String a() {
        if (TextUtils.isEmpty(f19778c) && !f19779d) {
            c();
        }
        return f19778c;
    }
}
