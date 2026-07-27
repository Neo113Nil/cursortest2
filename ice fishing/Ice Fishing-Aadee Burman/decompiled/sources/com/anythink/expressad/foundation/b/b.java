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
    private static final String f18509g = "SDKController";

    /* renamed from: h, reason: collision with root package name */
    private static volatile b f18510h;
    private Context i;

    /* renamed from: m, reason: collision with root package name */
    private String f18520m;

    /* renamed from: n, reason: collision with root package name */
    private int f18521n;

    /* renamed from: j, reason: collision with root package name */
    private String f18517j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f18518k = "";

    /* renamed from: l, reason: collision with root package name */
    private boolean f18519l = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f18511a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f18512b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f18513c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final int f18514d = 4;

    /* renamed from: e, reason: collision with root package name */
    public final int f18515e = 5;

    /* renamed from: f, reason: collision with root package name */
    public final int f18516f = 6;

    private b() {
    }

    public static b a() {
        if (f18510h == null) {
            synchronized (b.class) {
                try {
                    if (f18510h == null) {
                        f18510h = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18510h;
    }

    private static String b() {
        return com.anythink.expressad.out.b.f20022a;
    }

    private void c() {
        a.c().b(this.f18517j);
        a.c().c(this.f18518k);
        a.c().d();
        a(this.i.getApplicationContext());
        t.a(this.i);
        this.f18519l = true;
    }

    private static void d() {
    }

    private void e() {
        a.c().b(this.f18517j);
        a.c().c(this.f18518k);
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
                if (map.containsKey(com.anythink.expressad.a.f17621d)) {
                    this.f18517j = (String) map.get(com.anythink.expressad.a.f17621d);
                }
                if (map.containsKey(com.anythink.expressad.a.f17622e)) {
                    this.f18518k = (String) map.get(com.anythink.expressad.a.f17622e);
                }
                a.c().b(this.f18517j);
                a.c().c(this.f18518k);
                a.c().d();
                a(this.i.getApplicationContext());
                t.a(this.i);
                this.f18519l = true;
            }
        }
    }

    private static void a(Context context) {
        String str;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(u.b.f12852f, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(u.a.f12845y, "");
                str = sharedPreferences.getString(u.a.f12846z, "");
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
