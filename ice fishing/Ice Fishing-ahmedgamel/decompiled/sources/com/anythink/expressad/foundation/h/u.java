package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f20492a = false;

    /* renamed from: b, reason: collision with root package name */
    public static char[] f20493b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* renamed from: c, reason: collision with root package name */
    public static LinearLayout f20494c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final String f20495d = "SDKUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f20496a = "com.android.vending";

        /* renamed from: b, reason: collision with root package name */
        public static final String f20497b = "market";

        /* renamed from: c, reason: collision with root package name */
        public static final String f20498c = "play.google.com";

        /* renamed from: d, reason: collision with root package name */
        public static final String f20499d = "market.android.com";

        /* renamed from: e, reason: collision with root package name */
        public static final String f20500e = "google.com";

        /* renamed from: f, reason: collision with root package name */
        public static final String f20501f = "market://";

        /* renamed from: g, reason: collision with root package name */
        public static final String f20502g = "details?id=";

        /* renamed from: h, reason: collision with root package name */
        public static final String f20503h = "market://details?id=com.package.name";

        private static Intent a() {
            return new Intent("android.intent.action.VIEW", Uri.parse(f20503h));
        }

        private static boolean b(Context context) {
            List<ResolveInfo> a9 = a(context);
            return a9 != null && a9.size() > 0;
        }

        private static boolean c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (parse.getHost().equals("play.google.com")) {
                        return true;
                    }
                    return parse.getHost().equals("market.android.com");
                }
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            return false;
        }

        private static String d(String str) {
            if (b(str)) {
                return str;
            }
            if (c(str)) {
                return "market://".concat(String.valueOf(str.substring(str.indexOf(f20502g))));
            }
            return null;
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(f20503h)), 0);
            } catch (Exception e9) {
                e9.printStackTrace();
                return null;
            }
        }

        private static boolean b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                return false;
            }
        }

        public static boolean a(String str) {
            return b(str) || c(str);
        }
    }

    public static void a() {
    }

    public static void b() {
    }

    private static String c() {
        return com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.AD_ANYTHINK_700);
    }

    private static void d() {
    }

    public static String a(String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File a9 = com.anythink.expressad.foundation.g.c.d.a(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_IMG);
        if (TextUtils.isEmpty(str)) {
            sb = "";
        } else if (str.lastIndexOf("/") == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
            sb = sb3.toString();
        }
        return new File(a9, sb).getAbsolutePath();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.hashCode());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
        return sb2.toString();
    }
}
