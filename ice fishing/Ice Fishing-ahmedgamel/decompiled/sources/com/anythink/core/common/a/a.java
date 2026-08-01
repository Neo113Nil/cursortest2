package com.anythink.core.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.af;
import com.anythink.core.common.h.bg;
import com.anythink.core.common.h.r;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f12090b;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, af> f12091a;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.e.o f12092c;

    private a() {
        if (t.b().g() != null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(t.b().g()));
        }
        this.f12091a = new ConcurrentHashMap<>(3);
    }

    private static void b(ad adVar) {
        if (TextUtils.isEmpty(adVar.i)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(adVar.i);
            r a9 = e.a(adVar.token, jSONObject, adVar.f13422d, true);
            if (a9 == null) {
                adVar.i = "";
                return;
            }
            adVar.i = jSONObject.toString();
            a9.d(adVar.f13424f);
            if (adVar.f13422d == 67) {
                com.anythink.core.common.f.c.a(t.b().g()).a(a9.v(), a9.az());
                com.anythink.core.common.f.b.a(t.b().g()).a(a9.w(), a9.az());
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String str) {
        com.anythink.core.common.v.af.a(context, u.b.f12854h, str + u.a.f12813A, 1);
    }

    private static boolean e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(u.a.f12813A);
        return com.anythink.core.common.v.af.b(context, u.b.f12854h, sb.toString(), 0) == 1;
    }

    public final String d(Context context, String str) {
        if (this.f12092c == null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(context.getApplicationContext()));
        }
        return this.f12092c.d(str);
    }

    public static a a() {
        if (f12090b == null) {
            synchronized (a.class) {
                try {
                    if (f12090b == null) {
                        f12090b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12090b;
    }

    public final ad a(String str, String str2) {
        af afVar = this.f12091a.get(str);
        if (afVar == null) {
            afVar = this.f12092c.b(str);
            this.f12091a.put(str, afVar);
        }
        return afVar.a(str2);
    }

    public final void b(final Context context, final String str) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f12092c == null) {
                    a.this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(context.getApplicationContext()));
                }
                a.this.f12092c.a(str);
            }
        }, 2);
        com.anythink.core.common.v.af.a(context, u.b.f12854h, str + u.a.f12813A);
    }

    public final void a(String str, ad adVar) {
        if (this.f12092c == null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(t.b().g()));
        }
        if (!TextUtils.isEmpty(adVar.i)) {
            try {
                JSONObject jSONObject = new JSONObject(adVar.i);
                r a9 = e.a(adVar.token, jSONObject, adVar.f13422d, true);
                if (a9 == null) {
                    adVar.i = "";
                } else {
                    adVar.i = jSONObject.toString();
                    a9.d(adVar.f13424f);
                    if (adVar.f13422d == 67) {
                        com.anythink.core.common.f.c.a(t.b().g()).a(a9.v(), a9.az());
                        com.anythink.core.common.f.b.a(t.b().g()).a(a9.w(), a9.az());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.f12092c.a(str, adVar);
    }

    public final void a(final ad adVar) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f12092c == null) {
                    a.this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(t.b().g()));
                }
                a.this.f12092c.a(adVar);
            }
        }, 2);
    }

    public final void a(Context context, String str, String str2, String str3) {
        if (this.f12092c == null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(context.getApplicationContext()));
        }
        this.f12092c.a(str, str2, str3);
    }

    public final bg a(Context context, String str) {
        if (this.f12092c == null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(context.getApplicationContext()));
        }
        return this.f12092c.c(str);
    }

    public final void a(Context context, String str, String str2) {
        if (this.f12092c == null) {
            this.f12092c = com.anythink.core.common.e.o.a(com.anythink.core.common.e.e.a(context.getApplicationContext()));
        }
        this.f12092c.a(str, str2);
    }
}
