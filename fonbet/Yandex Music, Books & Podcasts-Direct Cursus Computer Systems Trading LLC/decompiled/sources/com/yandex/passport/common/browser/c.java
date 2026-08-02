package com.yandex.passport.common.browser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.logger.d;
import defpackage.c7;
import defpackage.r7o;
import defpackage.rdb;
import defpackage.t75;
import defpackage.t7o;
import defpackage.yfx;
import defpackage.z0j;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Uri a = Uri.parse("https://yandex.ru/");

    public static final String a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.VIEW", a);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 196608);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            rdb rdbVar = b.k;
            rdbVar.getClass();
            c7 c7Var = new c7(0, rdbVar);
            while (c7Var.hasNext()) {
                if (TextUtils.equals(str, ((b) c7Var.next()).a)) {
                    return str;
                }
            }
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 196608);
        queryIntentActivities.getClass();
        b bVar = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            for (b bVar2 : b.values()) {
                if (Intrinsics.d(resolveInfo.activityInfo.packageName, bVar2.a) && (bVar == null || bVar.ordinal() > bVar2.ordinal())) {
                    bVar = bVar2;
                }
            }
        }
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    public static final String b(Context context) {
        context.getClass();
        return String.format("%s.%s://%s/", Arrays.copyOf(new Object[]{context.getPackageName(), "passport", LegacyAccountType.STRING_SOCIAL}, 3));
    }

    public static boolean c(Context context) {
        String str;
        List c = t75.c(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = new ArrayList();
        }
        new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = c.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return str != null;
    }

    public static Serializable d(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        try {
            if (c(context)) {
                str2 = context.getPackageName();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "This app is browser and support chrome tab. Current packageName = " + str2, 8);
                }
                try {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Open url in current browser", 8);
                    }
                    yfx w = new z0j(6).w();
                    ((Intent) w.b).setPackage(str2);
                    w.p(context, parse);
                } catch (Exception e) {
                    d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error open url in current browser. Fallback with FLAG_ACTIVITY_NEW_TASK", e);
                    }
                    yfx w2 = new z0j(6).w();
                    ((Intent) w2.b).setPackage(str2).setFlags(268435456);
                    w2.p(context, parse);
                }
            } else {
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                str2 = a(packageManager);
                yfx w3 = new z0j(6).w();
                ((Intent) w3.b).setPackage(str2).setFlags(268435456);
                w3.p(context, parse);
            }
        } catch (Exception e2) {
            try {
                d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error searching for the best browser. Fallback to startActivity", e2);
                }
                context.startActivity(new Intent("android.intent.action.VIEW", parse).setFlags(268435456));
                str2 = null;
            } catch (Exception unused) {
                r7o r7oVar = z7o.b;
                return new t7o(new RuntimeException("Url could not be opened"));
            }
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "OpenExternalUrl: " + parse, 8);
        }
        r7o r7oVar2 = z7o.b;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r5.isEmpty() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable e(Context context, String str) {
        context.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        PackageManager packageManager = context.getPackageManager();
        if (Intrinsics.d(parse.getScheme(), "http") || Intrinsics.d(parse.getScheme(), "https")) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", parse), 0);
            queryIntentActivities.getClass();
            if (!queryIntentActivities.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : queryIntentActivities) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj;
                    resolveInfo.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://example.com/help?key=value"));
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                    queryIntentActivities2.getClass();
                    if (queryIntentActivities2.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
            }
            return d(context, str);
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "URL can be handled by other app: " + parse, 8);
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse).setFlags(268435456));
            r7o r7oVar = z7o.b;
            return "opened_in_another_app";
        } catch (Exception e) {
            d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to open URL in other app, fallback to browser", e);
            }
        }
    }
}
