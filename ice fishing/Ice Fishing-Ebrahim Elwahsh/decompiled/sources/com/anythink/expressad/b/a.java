package com.anythink.expressad.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.out.LoadingActivity;
import com.anythink.expressad.out.q;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18255a = "Anythink SDK M";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18256b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, Long> f18257c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Set<String> f18258d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final String f18259e = "2";

    /* renamed from: f, reason: collision with root package name */
    private static final int f18260f = 1;

    /* renamed from: g, reason: collision with root package name */
    private String f18261g;

    /* renamed from: h, reason: collision with root package name */
    private long f18262h;
    private com.anythink.expressad.foundation.c.c i;

    /* renamed from: j, reason: collision with root package name */
    private Context f18263j;

    /* renamed from: k, reason: collision with root package name */
    private c f18264k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.out.f f18265l;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.f.a f18267n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18268o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18271r;

    /* renamed from: m, reason: collision with root package name */
    private q.c f18266m = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18269p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18270q = true;

    public a(Context context, String str) {
        this.i = null;
        this.f18263j = null;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18267n = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18267n = com.anythink.expressad.f.b.c();
        }
        this.f18268o = this.f18267n.s();
        Context applicationContext = context.getApplicationContext();
        this.f18263j = applicationContext;
        this.f18261g = str;
        if (this.i == null) {
            this.i = com.anythink.expressad.foundation.c.c.a(applicationContext);
        }
    }

    private void a(String str) {
        this.f18261g = str;
    }

    private boolean c() {
        return this.f18270q;
    }

    private com.anythink.expressad.out.f d() {
        return this.f18265l;
    }

    private com.anythink.expressad.foundation.c.c e() {
        return this.i;
    }

    private static void f() {
    }

    private void g() {
        c cVar = this.f18264k;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.f18264k.b();
    }

    private static void h() {
    }

    private static void i() {
    }

    private static void j() {
    }

    private int k() {
        try {
            com.anythink.expressad.f.a aVar = this.f18267n;
            if (aVar != null) {
                return aVar.k();
            }
            return 1;
        } catch (Exception e6) {
            e6.printStackTrace();
            return 1;
        }
    }

    private void l() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            com.anythink.core.common.d.n.a(this.f18263j).a(intent);
        } catch (Exception unused) {
        }
    }

    private static boolean m() {
        return false;
    }

    public final void a(q.c cVar) {
        this.f18266m = cVar;
    }

    public final void b() {
        try {
            this.f18266m = null;
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public final void a() {
        this.f18270q = false;
    }

    private void a(com.anythink.expressad.out.f fVar) {
        this.f18265l = fVar;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        try {
            Intent intent = new Intent(this.f18263j, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", dVar.bl());
            this.f18263j.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private static boolean a(com.anythink.expressad.foundation.d.d dVar) {
        Long l9;
        if (dVar == null) {
            return true;
        }
        try {
            if (2 != dVar.R() && 3 != dVar.R()) {
                return true;
            }
            String bh = dVar.bh();
            Map<String, Long> map = f18257c;
            if (map == null) {
                return true;
            }
            if (map.containsKey(bh) && (l9 = f18257c.get(bh)) != null) {
                if (l9.longValue() > System.currentTimeMillis() || f18258d.contains(dVar.bh())) {
                    return false;
                }
            }
            f18257c.put(dVar.bh(), Long.valueOf(System.currentTimeMillis() + (dVar.Z() * 1000)));
            return true;
        } catch (Exception e6) {
            if (!com.anythink.expressad.a.f17776a) {
                return true;
            }
            e6.printStackTrace();
            return true;
        }
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.f18263j, dVar, this.f18261g, str, true, false, com.anythink.expressad.b.b.a.f18316k);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z8) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, false, z8, com.anythink.expressad.b.b.a.f18314h);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z8, boolean z9, int i) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, z8, z9, i);
    }

    private static String a(int i) {
        if (i == 1) {
            return com.anythink.expressad.foundation.g.g.a.c.f19651n;
        }
        if (i == 2) {
            return com.anythink.expressad.foundation.g.g.a.c.f19652o;
        }
        if (i == 3) {
            return com.anythink.expressad.foundation.g.g.a.c.f19654q;
        }
        if (i != 4) {
            return "";
        }
        return com.anythink.expressad.foundation.g.g.a.c.f19653p;
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String[] strArr, boolean z8) {
        if (context == null || dVar == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        c cVar = new c(context.getApplicationContext());
        for (String str2 : strArr) {
            cVar.a(str, dVar, new e() { // from class: com.anythink.expressad.b.a.1
                @Override // com.anythink.expressad.b.e
                public final void a() {
                }

                @Override // com.anythink.expressad.b.e
                public final void b() {
                }

                @Override // com.anythink.expressad.b.e
                public final void c() {
                }

                @Override // com.anythink.expressad.b.e
                public final void d() {
                }

                @Override // com.anythink.expressad.b.e
                public final void e() {
                }
            }, str2, false, z8, com.anythink.expressad.b.b.a.f18314h);
        }
    }

    private void a(final boolean z8, final com.anythink.expressad.out.k kVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (z8 && !a.f18256b && com.anythink.expressad.a.f17790p) {
                    a.a(a.this);
                }
                if (a.this.f18266m == null || a.f18256b || !com.anythink.expressad.a.f17790p) {
                    return;
                }
                a.this.f18266m.b(kVar);
            }
        });
    }

    private void a(com.anythink.expressad.b.a.b bVar, com.anythink.expressad.foundation.d.d dVar, int i, boolean z8) {
        if (dVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f18262h;
            com.anythink.expressad.foundation.d.g gVar = new com.anythink.expressad.foundation.d.g();
            gVar.i(dVar.ac());
            gVar.c(i);
            gVar.h(String.valueOf(currentTimeMillis));
            gVar.g(dVar.bh());
            gVar.e(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                gVar.f(URLEncoder.encode(bVar.i(), com.anythink.expressad.foundation.g.a.bR));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18262h / 1000);
            gVar.b(sb.toString());
            gVar.a(Integer.parseInt(dVar.ae()));
            gVar.b(dVar.R());
            gVar.a(this.f18261g);
            gVar.e(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                gVar.f(URLEncoder.encode(bVar.i(), com.anythink.expressad.foundation.g.a.bR));
            }
            if (this.f18268o) {
                gVar.d(bVar.a());
                if (!TextUtils.isEmpty(bVar.d())) {
                    gVar.d(URLEncoder.encode(bVar.d(), com.anythink.expressad.foundation.g.a.bR));
                }
                if (!TextUtils.isEmpty(bVar.f())) {
                    gVar.e(URLEncoder.encode(bVar.f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.e())) {
                    gVar.c(URLEncoder.encode(bVar.e(), com.anythink.expressad.foundation.g.a.bR));
                }
            }
            if (z8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            y.b(com.anythink.expressad.foundation.d.g.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean a(int i, String str) {
        try {
            if (i == 2) {
                if (u.a.a(str)) {
                    return true;
                }
            } else if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            com.anythink.core.common.d.n.a(aVar.f18263j).a(intent);
        } catch (Exception unused) {
        }
    }
}
