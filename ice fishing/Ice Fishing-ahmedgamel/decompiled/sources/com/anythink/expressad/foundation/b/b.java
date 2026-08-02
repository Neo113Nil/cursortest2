package com.anythink.expressad.foundation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.expressad.foundation.g.f.n;
import com.anythink.expressad.foundation.h.t;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f19296g = "SDKController";

    /* renamed from: h, reason: collision with root package name */
    private static volatile b f19297h;
    private Context i;

    /* renamed from: m, reason: collision with root package name */
    private String f19307m;

    /* renamed from: n, reason: collision with root package name */
    private int f19308n;

    /* renamed from: j, reason: collision with root package name */
    private String f19304j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f19305k = "";

    /* renamed from: l, reason: collision with root package name */
    private boolean f19306l = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f19298a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f19299b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f19300c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final int f19301d = 4;

    /* renamed from: e, reason: collision with root package name */
    public final int f19302e = 5;

    /* renamed from: f, reason: collision with root package name */
    public final int f19303f = 6;

    private b() {
    }

    public static b a() {
        if (f19297h == null) {
            synchronized (b.class) {
                try {
                    if (f19297h == null) {
                        f19297h = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19297h;
    }

    private static String b() {
        return com.anythink.expressad.out.b.f20809a;
    }

    private void c() {
        a.c().b(this.f19304j);
        a.c().c(this.f19305k);
        a.c().d();
        a(this.i.getApplicationContext());
        t.a(this.i);
        this.f19306l = true;
    }

    private static void d() {
    }

    private void e() {
        a.c().b(this.f19304j);
        a.c().c(this.f19305k);
        a.c().d();
    }

    public final void a(Map map, final Context context) {
        if (context != null) {
            this.i = context.getApplicationContext();
            a.c().a(this.i);
            try {
                n.a(this.i);
            } catch (Exception unused) {
            }
            com.anythink.core.common.d.t.b().a(new Runnable() { // from class: com.anythink.expressad.foundation.b.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.expressad.foundation.h.n.j(context);
                }
            }, 300L);
            if (map != null) {
                if (map.containsKey(com.anythink.expressad.a.f18408d)) {
                    this.f19304j = (String) map.get(com.anythink.expressad.a.f18408d);
                }
                if (map.containsKey(com.anythink.expressad.a.f18409e)) {
                    this.f19305k = (String) map.get(com.anythink.expressad.a.f18409e);
                }
                a.c().b(this.f19304j);
                a.c().c(this.f19305k);
                a.c().d();
                a(this.i.getApplicationContext());
                t.a(this.i);
                this.f19306l = true;
            }
        }
    }

    private static void a(Context context) {
        String str;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(u.b.f13638f, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(u.a.f13631y, "");
                str = sharedPreferences.getString(u.a.f13632z, "");
                str2 = string;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.cs) && TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.ct)) {
                com.anythink.expressad.foundation.g.a.cs = str2;
                com.anythink.expressad.foundation.g.a.ct = str;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
