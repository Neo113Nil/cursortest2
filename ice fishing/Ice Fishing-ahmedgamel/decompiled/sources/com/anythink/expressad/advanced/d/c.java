package com.anythink.expressad.advanced.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.c.d;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.p;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.anythink.basead.f.c.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18613a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18614b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18615c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static String f18616g = "NativeAdvancedProvider";

    /* renamed from: C, reason: collision with root package name */
    private JSONObject f18619C;

    /* renamed from: E, reason: collision with root package name */
    private ATOutNativeAdvancedViewGroup f18621E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18622F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18623G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f18624H;

    /* renamed from: e, reason: collision with root package name */
    boolean f18627e;

    /* renamed from: f, reason: collision with root package name */
    e f18628f;

    /* renamed from: h, reason: collision with root package name */
    private String f18629h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.b f18630j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.c f18631k;

    /* renamed from: l, reason: collision with root package name */
    private b f18632l;

    /* renamed from: m, reason: collision with root package name */
    private p f18633m;

    /* renamed from: n, reason: collision with root package name */
    private d f18634n;

    /* renamed from: o, reason: collision with root package name */
    private ATNativeAdvancedView f18635o;

    /* renamed from: p, reason: collision with root package name */
    private ATNativeAdvancedWebview f18636p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.advanced.view.a f18637q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f18638r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18639s;

    /* renamed from: t, reason: collision with root package name */
    private int f18640t = -1;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18641u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f18642v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18643w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f18644x = 0;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18645y = false;

    /* renamed from: z, reason: collision with root package name */
    private int f18646z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f18617A = 0;

    /* renamed from: B, reason: collision with root package name */
    private Object f18618B = new Object();

    /* renamed from: D, reason: collision with root package name */
    private boolean f18620D = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f18625I = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18626d = false;
    private ViewTreeObserver.OnScrollChangedListener J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (c.this.f18625I) {
                c.this.f18625I = false;
                if (c.this.f18621E != null) {
                    c.this.f18621E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f18625I = true;
                        }
                    }, 1000L);
                }
                try {
                    c.this.j();
                } catch (Throwable unused) {
                }
            }
        }
    };

    public c(String str, String str2, Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        this.i = TextUtils.isEmpty(str) ? "" : str;
        this.f18629h = str2;
        if (this.f18631k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f18629h);
            this.f18631k = cVar;
            cVar.a(this);
        }
        if (this.f18636p == null) {
            try {
                this.f18636p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f18637q == null) {
                try {
                    this.f18637q = new com.anythink.expressad.advanced.view.a(this.f18629h, this.f18631k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f18637q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f18635o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f18635o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f18636p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f18636p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f18635o.addView(this.f18636p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f18621E == null) {
            this.f18621E = new ATOutNativeAdvancedViewGroup(t.b().g());
            this.f18621E.setLayoutParams((this.f18646z == 0 || this.f18617A == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f18646z, this.f18617A));
            this.f18621E.setProvider(this);
            this.f18621E.addView(this.f18635o);
            this.f18621E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    private void f(int i) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.f18636p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18690m, i);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f18636p, NativeAdvancedJsUtils.f18689l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h(int i) {
        if (this.f18643w) {
            this.f18642v = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18636p, NativeAdvancedJsUtils.f18686h, "mute", Integer.valueOf(i));
        }
    }

    private void i(int i) {
        if (this.f18645y) {
            this.f18644x = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18636p, NativeAdvancedJsUtils.f18687j, NativeAdvancedJsUtils.f18688k, Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f18622F && this.f18623G && this.f18624H) {
            com.anythink.expressad.advanced.c.b bVar = this.f18630j;
            com.anythink.expressad.foundation.d.d c9 = bVar != null ? bVar.c() : null;
            if (c9 != null) {
                c9.aL();
            }
            if (aa.a(this.f18635o.getAdvancedNativeWebview(), 0) || this.f18621E.getAlpha() < 0.5f || this.f18621E.getVisibility() != 0) {
                return;
            }
            com.anythink.expressad.advanced.c.c cVar = this.f18631k;
            if (cVar != null) {
                cVar.d();
            }
            a(c9);
        }
    }

    private void k() {
        com.anythink.expressad.advanced.c.c cVar = this.f18631k;
        if (cVar != null) {
            cVar.e();
        }
    }

    private com.anythink.expressad.f.c l() {
        return this.f18638r;
    }

    public final int d() {
        return this.f18640t;
    }

    public final void e(int i) {
        if (i == 1) {
            this.f18622F = false;
        } else if (i == 2) {
            this.f18623G = false;
        } else if (i == 3) {
            this.f18624H = false;
        }
        com.anythink.expressad.advanced.c.c cVar = this.f18631k;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    private void g(int i) {
        if (this.f18641u) {
            this.f18640t = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i4 = this.f18640t;
            if (i4 == 1) {
                this.f18631k.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.f18636p, NativeAdvancedJsUtils.f18684f, "", null);
            } else if (i4 == 0) {
                this.f18631k.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.f18636p, NativeAdvancedJsUtils.f18685g, "", null);
            }
        }
    }

    public final void b() {
        this.f18639s = false;
    }

    public final ATOutNativeAdvancedViewGroup c() {
        return this.f18621E;
    }

    public final void d(int i) {
        if (i == 1) {
            this.f18622F = true;
        } else if (i == 2) {
            this.f18623G = true;
        } else if (i == 3) {
            this.f18624H = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        if (this.f18620D) {
            this.f18619C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18636p, NativeAdvancedJsUtils.f18682d, "", jSONObject);
        }
    }

    public final boolean a() {
        return this.f18639s;
    }

    public final void c(int i) {
        this.f18645y = true;
        i(i);
    }

    private void a(JSONObject jSONObject) {
        this.f18620D = true;
        b(jSONObject);
    }

    private String h() {
        if (this.f18626d) {
            com.anythink.expressad.advanced.c.c cVar = this.f18631k;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.anythink.expressad.advanced.c.b bVar = this.f18630j;
        if (bVar != null) {
            return bVar.a();
        }
        return "";
    }

    private void i() {
        g(this.f18640t);
        h(this.f18642v);
        i(this.f18644x);
        b(this.f18619C);
        t.b().g();
        f(n.b());
    }

    public final void a(p pVar) {
        this.f18633m = pVar;
    }

    public final void e() {
        if (this.f18633m != null) {
            this.f18633m = null;
        }
        if (this.f18632l != null) {
            this.f18632l = null;
        }
        if (this.f18634n != null) {
            this.f18634n = null;
        }
        com.anythink.expressad.advanced.c.b bVar = this.f18630j;
        if (bVar != null) {
            bVar.a((ATNativeAdvancedView) null);
            this.f18630j.b();
        }
        com.anythink.expressad.advanced.c.c cVar = this.f18631k;
        if (cVar != null) {
            cVar.c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f18635o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.anythink.expressad.advanced.a.a.c(this.f18628f.f());
        com.anythink.expressad.advanced.view.a aVar = this.f18637q;
        if (aVar != null) {
            aVar.b();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f18621E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.J);
            this.f18621E.removeAllViews();
            this.f18621E = null;
        }
    }

    public final void a(int i) {
        this.f18641u = true;
        g(i);
    }

    public final void b(int i) {
        this.f18643w = true;
        h(i);
    }

    public final int f() {
        com.anythink.expressad.advanced.c.b bVar = this.f18630j;
        com.anythink.expressad.foundation.d.d c9 = bVar != null ? bVar.c() : null;
        if (c9 != null) {
            return TextUtils.isEmpty(c9.T()) ? 2 : 1;
        }
        return 0;
    }

    private void a(final com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (this.f18638r == null) {
                com.anythink.expressad.f.b.a();
                this.f18638r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f18629h);
            }
            this.f18634n = new d(this, this.f18633m, this.f18638r.a(), dVar);
            if (this.f18627e) {
                return;
            }
            this.f18627e = true;
            com.anythink.expressad.advanced.c.d.a(this.f18635o, dVar, this.i, this.f18629h, this.f18640t, new d.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.c.d.a
                public final void a() {
                    String unused = c.f18616g;
                    c.this.a(dVar, false);
                }

                @Override // com.anythink.expressad.advanced.c.d.a
                public final void b() {
                    c.this.f18627e = false;
                }
            });
        }
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        this.f18631k.a(this.f18634n);
        this.f18631k.a(dVar, this.f18635o, true);
    }

    private void b(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            return;
        }
        this.f18617A = i;
        this.f18646z = i4;
        this.f18621E.setLayoutParams(new ViewGroup.LayoutParams(i4, i));
    }

    public final void a(e eVar) {
        this.f18628f = eVar;
        this.f18625I = true;
        this.f18639s = true;
        this.f18635o.clearResStateAndRemoveClose();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c d9 = com.anythink.expressad.f.b.d(com.anythink.expressad.foundation.b.a.c().f(), this.f18629h);
        this.f18638r = d9;
        if (d9 == null) {
            this.f18638r = com.anythink.expressad.f.c.y();
        }
        b bVar = new b(this);
        this.f18632l = bVar;
        bVar.a(this.f18633m);
        if (this.f18630j == null) {
            this.f18630j = new com.anythink.expressad.advanced.c.b(this.i, this.f18629h);
        }
        b bVar2 = this.f18632l;
        if (bVar2 != null) {
            this.f18630j.a(bVar2);
        }
        this.f18635o.resetLoadState();
        this.f18630j.a(this.f18635o);
        this.f18630j.a(this.f18638r);
        this.f18630j.a(this.f18646z, this.f18617A);
        this.f18630j.a(this.f18640t);
        this.f18630j.a(eVar);
    }

    private void a(Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f18631k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f18629h);
            this.f18631k = cVar;
            cVar.a(this);
        }
        if (this.f18636p == null) {
            try {
                this.f18636p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f18637q == null) {
                try {
                    this.f18637q = new com.anythink.expressad.advanced.view.a(this.f18629h, this.f18631k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18636p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f18637q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f18635o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f18635o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f18636p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f18636p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f18635o.addView(this.f18636p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f18621E == null) {
            this.f18621E = new ATOutNativeAdvancedViewGroup(t.b().g());
            if (this.f18646z != 0 && this.f18617A != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f18646z, this.f18617A);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f18621E.setLayoutParams(layoutParams);
            this.f18621E.setProvider(this);
            this.f18621E.addView(this.f18635o);
            this.f18621E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    public final String a(String str) {
        com.anythink.expressad.advanced.c.b bVar = this.f18630j;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    public final void a(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            return;
        }
        this.f18617A = i;
        this.f18646z = i4;
        this.f18621E.setLayoutParams(new ViewGroup.LayoutParams(i4, i));
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z6) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        g(this.f18640t);
        h(this.f18642v);
        i(this.f18644x);
        b(this.f18619C);
        t.b().g();
        f(n.b());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f18621E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (dVar == null || !z6) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f18638r == null) {
                com.anythink.expressad.f.b.a();
                this.f18638r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f18629h);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f18634n = new d(cVar, this.f18633m, this.f18638r.a(), dVar2);
        }
        if (cVar.f18631k == null) {
            com.anythink.expressad.advanced.c.c cVar2 = new com.anythink.expressad.advanced.c.c(t.b().g(), cVar.i, cVar.f18629h);
            cVar.f18631k = cVar2;
            cVar2.a(this);
        }
        cVar.f18631k.a(cVar.f18634n);
        cVar.f18631k.a(dVar2, cVar.f18635o, true);
    }
}
