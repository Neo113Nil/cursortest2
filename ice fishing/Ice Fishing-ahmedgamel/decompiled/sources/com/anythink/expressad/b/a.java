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
    public static final String f18884a = "Anythink SDK M";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18885b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, Long> f18886c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Set<String> f18887d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final String f18888e = "2";

    /* renamed from: f, reason: collision with root package name */
    private static final int f18889f = 1;

    /* renamed from: g, reason: collision with root package name */
    private String f18890g;

    /* renamed from: h, reason: collision with root package name */
    private long f18891h;
    private com.anythink.expressad.foundation.c.c i;

    /* renamed from: j, reason: collision with root package name */
    private Context f18892j;

    /* renamed from: k, reason: collision with root package name */
    private c f18893k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.out.f f18894l;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.f.a f18896n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18897o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18900r;

    /* renamed from: m, reason: collision with root package name */
    private q.c f18895m = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18898p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18899q = true;

    public a(Context context, String str) {
        this.i = null;
        this.f18892j = null;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18896n = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18896n = com.anythink.expressad.f.b.c();
        }
        this.f18897o = this.f18896n.s();
        Context applicationContext = context.getApplicationContext();
        this.f18892j = applicationContext;
        this.f18890g = str;
        if (this.i == null) {
            this.i = com.anythink.expressad.foundation.c.c.a(applicationContext);
        }
    }

    private void a(String str) {
        this.f18890g = str;
    }

    private boolean c() {
        return this.f18899q;
    }

    private com.anythink.expressad.out.f d() {
        return this.f18894l;
    }

    private com.anythink.expressad.foundation.c.c e() {
        return this.i;
    }

    private static void f() {
    }

    private void g() {
        c cVar = this.f18893k;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.f18893k.b();
    }

    private static void h() {
    }

    private static void i() {
    }

    private static void j() {
    }

    private int k() {
        try {
            com.anythink.expressad.f.a aVar = this.f18896n;
            if (aVar != null) {
                return aVar.k();
            }
            return 1;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 1;
        }
    }

    private void l() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            com.anythink.core.common.d.n.a(this.f18892j).a(intent);
        } catch (Exception unused) {
        }
    }

    private static boolean m() {
        return false;
    }

    public final void a(q.c cVar) {
        this.f18895m = cVar;
    }

    public final void b() {
        try {
            this.f18895m = null;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a() {
        this.f18899q = false;
    }

    private void a(com.anythink.expressad.out.f fVar) {
        this.f18894l = fVar;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        try {
            Intent intent = new Intent(this.f18892j, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", dVar.bl());
            this.f18892j.startActivity(intent);
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
            Map<String, Long> map = f18886c;
            if (map == null) {
                return true;
            }
            if (map.containsKey(bh) && (l9 = f18886c.get(bh)) != null) {
                if (l9.longValue() > System.currentTimeMillis() || f18887d.contains(dVar.bh())) {
                    return false;
                }
            }
            f18886c.put(dVar.bh(), Long.valueOf(System.currentTimeMillis() + (dVar.Z() * 1000)));
            return true;
        } catch (Exception e9) {
            if (!com.anythink.expressad.a.f18405a) {
                return true;
            }
            e9.printStackTrace();
            return true;
        }
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.f18892j, dVar, this.f18890g, str, true, false, com.anythink.expressad.b.b.a.f18945k);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z6) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, false, z6, com.anythink.expressad.b.b.a.f18943h);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z6, boolean z9, int i) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, z6, z9, i);
    }

    private static String a(int i) {
        if (i == 1) {
            return com.anythink.expressad.foundation.g.g.a.c.f20280n;
        }
        if (i == 2) {
            return com.anythink.expressad.foundation.g.g.a.c.f20281o;
        }
        if (i == 3) {
            return com.anythink.expressad.foundation.g.g.a.c.f20283q;
        }
        if (i != 4) {
            return "";
        }
        return com.anythink.expressad.foundation.g.g.a.c.f20282p;
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String[] strArr, boolean z6) {
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
            }, str2, false, z6, com.anythink.expressad.b.b.a.f18943h);
        }
    }

    private void a(final boolean z6, final com.anythink.expressad.out.k kVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (z6 && !a.f18885b && com.anythink.expressad.a.f18419p) {
                    a.a(a.this);
                }
                if (a.this.f18895m == null || a.f18885b || !com.anythink.expressad.a.f18419p) {
                    return;
                }
                a.this.f18895m.b(kVar);
            }
        });
    }

    private void a(com.anythink.expressad.b.a.b bVar, com.anythink.expressad.foundation.d.d dVar, int i, boolean z6) {
        if (dVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f18891h;
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
            sb.append(this.f18891h / 1000);
            gVar.b(sb.toString());
            gVar.a(Integer.parseInt(dVar.ae()));
            gVar.b(dVar.R());
            gVar.a(this.f18890g);
            gVar.e(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                gVar.f(URLEncoder.encode(bVar.i(), com.anythink.expressad.foundation.g.a.bR));
            }
            if (this.f18897o) {
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
            if (z6) {
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
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            com.anythink.core.common.d.n.a(aVar.f18892j).a(intent);
        } catch (Exception unused) {
        }
    }
}
