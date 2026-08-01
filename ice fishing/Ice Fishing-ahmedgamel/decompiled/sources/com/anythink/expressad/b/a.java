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
    public static final String f18097a = "Anythink SDK M";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18098b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, Long> f18099c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Set<String> f18100d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final String f18101e = "2";

    /* renamed from: f, reason: collision with root package name */
    private static final int f18102f = 1;

    /* renamed from: g, reason: collision with root package name */
    private String f18103g;

    /* renamed from: h, reason: collision with root package name */
    private long f18104h;
    private com.anythink.expressad.foundation.c.c i;

    /* renamed from: j, reason: collision with root package name */
    private Context f18105j;

    /* renamed from: k, reason: collision with root package name */
    private c f18106k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.out.f f18107l;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.f.a f18109n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18110o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18113r;

    /* renamed from: m, reason: collision with root package name */
    private q.c f18108m = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18111p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18112q = true;

    public a(Context context, String str) {
        this.i = null;
        this.f18105j = null;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18109n = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18109n = com.anythink.expressad.f.b.c();
        }
        this.f18110o = this.f18109n.s();
        Context applicationContext = context.getApplicationContext();
        this.f18105j = applicationContext;
        this.f18103g = str;
        if (this.i == null) {
            this.i = com.anythink.expressad.foundation.c.c.a(applicationContext);
        }
    }

    private void a(String str) {
        this.f18103g = str;
    }

    private boolean c() {
        return this.f18112q;
    }

    private com.anythink.expressad.out.f d() {
        return this.f18107l;
    }

    private com.anythink.expressad.foundation.c.c e() {
        return this.i;
    }

    private static void f() {
    }

    private void g() {
        c cVar = this.f18106k;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.f18106k.b();
    }

    private static void h() {
    }

    private static void i() {
    }

    private static void j() {
    }

    private int k() {
        try {
            com.anythink.expressad.f.a aVar = this.f18109n;
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
            com.anythink.core.common.d.n.a(this.f18105j).a(intent);
        } catch (Exception unused) {
        }
    }

    private static boolean m() {
        return false;
    }

    public final void a(q.c cVar) {
        this.f18108m = cVar;
    }

    public final void b() {
        try {
            this.f18108m = null;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a() {
        this.f18112q = false;
    }

    private void a(com.anythink.expressad.out.f fVar) {
        this.f18107l = fVar;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        try {
            Intent intent = new Intent(this.f18105j, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", dVar.bl());
            this.f18105j.startActivity(intent);
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
            Map<String, Long> map = f18099c;
            if (map == null) {
                return true;
            }
            if (map.containsKey(bh) && (l9 = f18099c.get(bh)) != null) {
                if (l9.longValue() > System.currentTimeMillis() || f18100d.contains(dVar.bh())) {
                    return false;
                }
            }
            f18099c.put(dVar.bh(), Long.valueOf(System.currentTimeMillis() + (dVar.Z() * 1000)));
            return true;
        } catch (Exception e9) {
            if (!com.anythink.expressad.a.f17618a) {
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
        a(this.f18105j, dVar, this.f18103g, str, true, false, com.anythink.expressad.b.b.a.f18158k);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z3) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, false, z3, com.anythink.expressad.b.b.a.f18156h);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String str2, boolean z3, boolean z6, int i) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, z3, z6, i);
    }

    private static String a(int i) {
        if (i == 1) {
            return com.anythink.expressad.foundation.g.g.a.c.f19493n;
        }
        if (i == 2) {
            return com.anythink.expressad.foundation.g.g.a.c.f19494o;
        }
        if (i == 3) {
            return com.anythink.expressad.foundation.g.g.a.c.f19496q;
        }
        if (i != 4) {
            return "";
        }
        return com.anythink.expressad.foundation.g.g.a.c.f19495p;
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.d dVar, String str, String[] strArr, boolean z3) {
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
            }, str2, false, z3, com.anythink.expressad.b.b.a.f18156h);
        }
    }

    private void a(final boolean z3, final com.anythink.expressad.out.k kVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (z3 && !a.f18098b && com.anythink.expressad.a.f17632p) {
                    a.a(a.this);
                }
                if (a.this.f18108m == null || a.f18098b || !com.anythink.expressad.a.f17632p) {
                    return;
                }
                a.this.f18108m.b(kVar);
            }
        });
    }

    private void a(com.anythink.expressad.b.a.b bVar, com.anythink.expressad.foundation.d.d dVar, int i, boolean z3) {
        if (dVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f18104h;
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
            sb.append(this.f18104h / 1000);
            gVar.b(sb.toString());
            gVar.a(Integer.parseInt(dVar.ae()));
            gVar.b(dVar.R());
            gVar.a(this.f18103g);
            gVar.e(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                gVar.f(URLEncoder.encode(bVar.i(), com.anythink.expressad.foundation.g.a.bR));
            }
            if (this.f18110o) {
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
            if (z3) {
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
            com.anythink.core.common.d.n.a(aVar.f18105j).a(intent);
        } catch (Exception unused) {
        }
    }
}
