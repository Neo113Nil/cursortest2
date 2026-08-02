package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f20405a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f20406b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f20407c = "";

    /* renamed from: d, reason: collision with root package name */
    private static boolean f20408d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f20409e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f20410f = false;

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
        if (f20408d) {
            return f20406b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i = com.anythink.core.common.v.m.p() == 2 ? 0 : 1;
            String o4 = com.anythink.core.common.v.m.o();
            jSONObject.put("status", i);
            jSONObject.put("amazonId", o4);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                f20407c = jSONObject2;
                f20406b = com.anythink.core.express.a.a.a(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        f20408d = true;
        return f20406b;
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f20409e = false;
        }
        if (f20410f) {
            return f20409e;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f20409e = context.getPackageManager().checkPermission(com.anythink.core.express.a.a.b("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f20409e = true;
        }
        f20410f = true;
        return f20409e;
    }

    public static String a() {
        if (TextUtils.isEmpty(f20407c) && !f20408d) {
            c();
        }
        return f20407c;
    }
}
