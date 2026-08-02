package com.anythink.core.basead.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.basead.a.c;
import com.anythink.core.basead.a.d;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.y;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12687a = "play.google.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12688b = "market.android.com";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12689c = "details?";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12690d = "market";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12691e = "market://";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12692f = "e";

    private static String a(Context context, Intent intent, String str) {
        if (context == null || intent == null || !k.l().b(t.b().p()).aZ()) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            s c9 = t.b().c();
            if (c9 != null) {
                str = c9.getDefaultMarketSchemePackageName();
            } else {
                t.b();
                str = "com.android.vending";
            }
        }
        List<ResolveInfo> a9 = y.a(context, intent);
        if (a9 == null || a9.size() <= 1) {
            return "";
        }
        String str2 = a9.get(0).activityInfo.packageName;
        for (int i = 0; i < a9.size(); i++) {
            String str3 = a9.get(i).activityInfo.packageName;
            if (TextUtils.equals(str, a9.get(i).activityInfo.packageName)) {
                return str;
            }
        }
        return str2;
    }

    public static d b(Context context, String str, w wVar, x xVar) {
        if (a(str, xVar != null ? xVar.f14954o : null)) {
            com.anythink.core.common.u.e.a(wVar, xVar, 1, false, 0, "");
            if (wVar != null && TextUtils.isEmpty(wVar.H())) {
                com.anythink.core.common.u.e.b(wVar, xVar, 2);
            }
            return new d.a().a(4).a();
        }
        d b9 = b(context, str, wVar != null ? wVar.ax() : "");
        if (b9.a() != 0 && wVar != null && TextUtils.isEmpty(wVar.H())) {
            com.anythink.core.common.u.e.b(wVar, xVar, 1);
        }
        return b9;
    }

    public static boolean c(String str) {
        Uri parse;
        try {
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.getHost() != null) {
                if (parse.getHost().equals("play.google.com")) {
                    return true;
                }
                return parse.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals("market");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        t.b();
        if (!d(str)) {
            return false;
        }
        com.anythink.core.d.b k9 = k.k(k.l());
        return (k9 == null || TextUtils.equals(k9.x(), "1")) && !TextUtils.isEmpty(m.p(t.b().g()));
    }

    private static String f(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String g(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf(f12689c))));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static d b(Context context, String str, String str2) {
        if (c(str)) {
            return b(context, new c.a().a(g(str)).a(true).b(str2).a());
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && !scheme.startsWith("http")) {
            return b(context, new c.a().a(str).a(e(str)).b(str2).a());
        }
        return new d.a().a(2).a();
    }

    public static cc a(String str) {
        cc ccVar = new cc();
        ccVar.f14691l = 8;
        ccVar.f14693n = false;
        ccVar.f14692m = true;
        ccVar.f14694o = str;
        try {
            if (Uri.parse(str).getScheme().equals("intent")) {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    ccVar.f14691l = 10;
                    ccVar.f14694o = stringExtra;
                    return ccVar;
                }
            }
        } catch (Throwable unused) {
        }
        if (d(str)) {
            String f2 = f(str);
            ccVar.f14691l = 9;
            ccVar.f14694o = f2;
        }
        return ccVar;
    }

    public static void b(String str) {
        y.a(str);
    }

    private static d b(Context context, c cVar) {
        Intent intent;
        String str = "";
        int i = 1;
        ResolveInfo resolveInfo = null;
        try {
            Uri parse = Uri.parse(cVar.a());
            if (parse.getScheme().equals("intent")) {
                intent = Intent.parseUri(cVar.a(), 1);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
            } else if (parse.getScheme().equals("android-app")) {
                intent = Intent.parseUri(cVar.a(), 2);
                intent.setComponent(null);
                intent.setSelector(null);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                intent2.setData(parse);
                intent = intent2;
            }
            if (TextUtils.isEmpty(intent.getPackage())) {
                if (cVar.b()) {
                    str = "com.android.vending";
                    intent.setPackage("com.android.vending");
                } else if (d(cVar.a())) {
                    str = a(context, intent, cVar.c());
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                }
            }
            intent.addFlags(268435456);
            resolveInfo = context.getPackageManager().resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
            context.startActivity(intent);
            i = 0;
        } catch (Throwable unused) {
            if (resolveInfo != null) {
                i = 3;
            }
        }
        return new d.a().a(i).a(str).a();
    }

    public static cc a(Context context, String str, w wVar) {
        cc ccVar = new cc();
        ccVar.f14693n = !str.startsWith("http");
        ccVar.f14694o = str;
        ccVar.f14695p = false;
        if (!a(str, wVar != null ? wVar.r() : null)) {
            String ax = wVar != null ? wVar.ax() : "";
            if (d(str)) {
                ccVar.f14694o = str;
                boolean e9 = e(str);
                if (a(context, new c.a().a(str).a(e9).b(ax).a())) {
                    ccVar.f14692m = true;
                    if (e9) {
                        ccVar.f14691l = 3;
                        return ccVar;
                    }
                    ccVar.f14691l = 4;
                    return ccVar;
                }
                if (a(context, new c.a().a(str).a(false).b(ax).a())) {
                    ccVar.f14692m = true;
                    ccVar.f14691l = 4;
                    return ccVar;
                }
            } else if (!str.startsWith("http")) {
                ccVar.f14694o = str;
                if (a(context, new c.a().a(str).a(false).b(ax).a())) {
                    ccVar.f14692m = true;
                    ccVar.f14691l = 5;
                    return ccVar;
                }
            } else if (c(str)) {
                String g9 = g(str);
                ccVar.f14693n = true;
                ccVar.f14694o = g9;
                if (a(context, new c.a().a(g9).a(true).b(ax).a())) {
                    ccVar.f14692m = true;
                    ccVar.f14691l = 1;
                    return ccVar;
                }
                if (a(context, new c.a().a(g9).a(false).b(ax).a())) {
                    ccVar.f14692m = true;
                    ccVar.f14691l = 2;
                }
            }
            return ccVar;
        }
        ccVar.f14695p = true;
        return ccVar;
    }

    public static boolean b(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context, String str, w wVar, x xVar) {
        return b(context, str, wVar, xVar).a() == 0;
    }

    public static boolean a(String str, com.anythink.core.common.h.y yVar) {
        List<String> bB;
        if (!TextUtils.isEmpty(str) && yVar != null && (bB = yVar.bB()) != null && !bB.isEmpty()) {
            for (int i = 0; i < bB.size(); i++) {
                String str2 = bB.get(i);
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    ab.a("OfferUrlHandler", "needFilterDeeplinkByScheme url:" + str + ",and scheme:" + str2);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String str, String str2) {
        return b(context, str, str2).a() == 0;
    }

    private static boolean a(Context context, c cVar) {
        return b(context, cVar).a() == 0;
    }

    public static void a(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e9) {
            e9.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static boolean a(w wVar, x xVar) {
        if (wVar == null || xVar == null) {
            return false;
        }
        by R8 = t.b().R();
        boolean z6 = R8.b() == 1;
        boolean z9 = R8.a() == 1;
        String m9 = m.m();
        if (TextUtils.isEmpty(m9)) {
            com.anythink.core.common.u.e.a(xVar, wVar, 5);
            return false;
        }
        if (!z6) {
            com.anythink.core.common.u.e.a(xVar, wVar, 3);
            return false;
        }
        if (!z9) {
            com.anythink.core.common.u.e.a(xVar, wVar, 1);
            return false;
        }
        String k9 = wVar.k();
        String l9 = wVar.l();
        if (!TextUtils.isEmpty(k9) && !TextUtils.isEmpty(l9)) {
            try {
                Object d9 = m.d(m9);
                Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                Object newInstance = cls.newInstance();
                cls.getField("userName").set(newInstance, k9);
                cls.getField(com.anythink.expressad.a.f18390K).set(newInstance, l9);
                cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(d9, newInstance);
                com.anythink.core.common.u.e.a(xVar, wVar, 0);
                return true;
            } catch (Throwable th) {
                th.getMessage();
                com.anythink.core.common.u.e.a(xVar, wVar, 2);
                return false;
            }
        }
        com.anythink.core.common.u.e.a(xVar, wVar, 4);
        return false;
    }
}
