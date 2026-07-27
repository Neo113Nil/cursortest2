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
    public static final int f17984a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17985b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17986c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static String f17987g = "NativeAdvancedProvider";

    /* renamed from: C, reason: collision with root package name */
    private JSONObject f17990C;

    /* renamed from: E, reason: collision with root package name */
    private ATOutNativeAdvancedViewGroup f17992E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f17993F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17994G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17995H;

    /* renamed from: e, reason: collision with root package name */
    boolean f17998e;

    /* renamed from: f, reason: collision with root package name */
    e f17999f;

    /* renamed from: h, reason: collision with root package name */
    private String f18000h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.b f18001j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.c f18002k;

    /* renamed from: l, reason: collision with root package name */
    private b f18003l;

    /* renamed from: m, reason: collision with root package name */
    private p f18004m;

    /* renamed from: n, reason: collision with root package name */
    private d f18005n;

    /* renamed from: o, reason: collision with root package name */
    private ATNativeAdvancedView f18006o;

    /* renamed from: p, reason: collision with root package name */
    private ATNativeAdvancedWebview f18007p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.advanced.view.a f18008q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f18009r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18010s;

    /* renamed from: t, reason: collision with root package name */
    private int f18011t = -1;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18012u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f18013v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18014w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f18015x = 0;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18016y = false;

    /* renamed from: z, reason: collision with root package name */
    private int f18017z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f17988A = 0;

    /* renamed from: B, reason: collision with root package name */
    private Object f17989B = new Object();

    /* renamed from: D, reason: collision with root package name */
    private boolean f17991D = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f17996I = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17997d = false;
    private ViewTreeObserver.OnScrollChangedListener J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (c.this.f17996I) {
                c.this.f17996I = false;
                if (c.this.f17992E != null) {
                    c.this.f17992E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f17996I = true;
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
        this.f18000h = str2;
        if (this.f18002k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f18000h);
            this.f18002k = cVar;
            cVar.a(this);
        }
        if (this.f18007p == null) {
            try {
                this.f18007p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f18008q == null) {
                try {
                    this.f18008q = new com.anythink.expressad.advanced.view.a(this.f18000h, this.f18002k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f18008q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f18006o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f18006o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f18007p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f18007p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f18006o.addView(this.f18007p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f17992E == null) {
            this.f17992E = new ATOutNativeAdvancedViewGroup(t.b().g());
            this.f17992E.setLayoutParams((this.f18017z == 0 || this.f17988A == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f18017z, this.f17988A));
            this.f17992E.setProvider(this);
            this.f17992E.addView(this.f18006o);
            this.f17992E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    private void f(int i) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.f18007p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18061m, i);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f18007p, NativeAdvancedJsUtils.f18060l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h(int i) {
        if (this.f18014w) {
            this.f18013v = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18007p, NativeAdvancedJsUtils.f18057h, "mute", Integer.valueOf(i));
        }
    }

    private void i(int i) {
        if (this.f18016y) {
            this.f18015x = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18007p, NativeAdvancedJsUtils.f18058j, NativeAdvancedJsUtils.f18059k, Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f17993F && this.f17994G && this.f17995H) {
            com.anythink.expressad.advanced.c.b bVar = this.f18001j;
            com.anythink.expressad.foundation.d.d c4 = bVar != null ? bVar.c() : null;
            if (c4 != null) {
                c4.aL();
            }
            if (aa.a(this.f18006o.getAdvancedNativeWebview(), 0) || this.f17992E.getAlpha() < 0.5f || this.f17992E.getVisibility() != 0) {
                return;
            }
            com.anythink.expressad.advanced.c.c cVar = this.f18002k;
            if (cVar != null) {
                cVar.d();
            }
            a(c4);
        }
    }

    private void k() {
        com.anythink.expressad.advanced.c.c cVar = this.f18002k;
        if (cVar != null) {
            cVar.e();
        }
    }

    private com.anythink.expressad.f.c l() {
        return this.f18009r;
    }

    public final int d() {
        return this.f18011t;
    }

    public final void e(int i) {
        if (i == 1) {
            this.f17993F = false;
        } else if (i == 2) {
            this.f17994G = false;
        } else if (i == 3) {
            this.f17995H = false;
        }
        com.anythink.expressad.advanced.c.c cVar = this.f18002k;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    private void g(int i) {
        if (this.f18012u) {
            this.f18011t = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i4 = this.f18011t;
            if (i4 == 1) {
                this.f18002k.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.f18007p, NativeAdvancedJsUtils.f18055f, "", null);
            } else if (i4 == 0) {
                this.f18002k.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.f18007p, NativeAdvancedJsUtils.f18056g, "", null);
            }
        }
    }

    public final void b() {
        this.f18010s = false;
    }

    public final ATOutNativeAdvancedViewGroup c() {
        return this.f17992E;
    }

    public final void d(int i) {
        if (i == 1) {
            this.f17993F = true;
        } else if (i == 2) {
            this.f17994G = true;
        } else if (i == 3) {
            this.f17995H = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        if (this.f17991D) {
            this.f17990C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f18007p, NativeAdvancedJsUtils.f18053d, "", jSONObject);
        }
    }

    public final boolean a() {
        return this.f18010s;
    }

    public final void c(int i) {
        this.f18016y = true;
        i(i);
    }

    private void a(JSONObject jSONObject) {
        this.f17991D = true;
        b(jSONObject);
    }

    private String h() {
        if (this.f17997d) {
            com.anythink.expressad.advanced.c.c cVar = this.f18002k;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.anythink.expressad.advanced.c.b bVar = this.f18001j;
        if (bVar != null) {
            return bVar.a();
        }
        return "";
    }

    private void i() {
        g(this.f18011t);
        h(this.f18013v);
        i(this.f18015x);
        b(this.f17990C);
        t.b().g();
        f(n.b());
    }

    public final void a(p pVar) {
        this.f18004m = pVar;
    }

    public final void e() {
        if (this.f18004m != null) {
            this.f18004m = null;
        }
        if (this.f18003l != null) {
            this.f18003l = null;
        }
        if (this.f18005n != null) {
            this.f18005n = null;
        }
        com.anythink.expressad.advanced.c.b bVar = this.f18001j;
        if (bVar != null) {
            bVar.a((ATNativeAdvancedView) null);
            this.f18001j.b();
        }
        com.anythink.expressad.advanced.c.c cVar = this.f18002k;
        if (cVar != null) {
            cVar.c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f18006o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.anythink.expressad.advanced.a.a.c(this.f17999f.f());
        com.anythink.expressad.advanced.view.a aVar = this.f18008q;
        if (aVar != null) {
            aVar.b();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f17992E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.J);
            this.f17992E.removeAllViews();
            this.f17992E = null;
        }
    }

    public final void a(int i) {
        this.f18012u = true;
        g(i);
    }

    public final void b(int i) {
        this.f18014w = true;
        h(i);
    }

    public final int f() {
        com.anythink.expressad.advanced.c.b bVar = this.f18001j;
        com.anythink.expressad.foundation.d.d c4 = bVar != null ? bVar.c() : null;
        if (c4 != null) {
            return TextUtils.isEmpty(c4.T()) ? 2 : 1;
        }
        return 0;
    }

    private void a(final com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (this.f18009r == null) {
                com.anythink.expressad.f.b.a();
                this.f18009r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f18000h);
            }
            this.f18005n = new d(this, this.f18004m, this.f18009r.a(), dVar);
            if (this.f17998e) {
                return;
            }
            this.f17998e = true;
            com.anythink.expressad.advanced.c.d.a(this.f18006o, dVar, this.i, this.f18000h, this.f18011t, new d.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.c.d.a
                public final void a() {
                    String unused = c.f17987g;
                    c.this.a(dVar, false);
                }

                @Override // com.anythink.expressad.advanced.c.d.a
                public final void b() {
                    c.this.f17998e = false;
                }
            });
        }
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        this.f18002k.a(this.f18005n);
        this.f18002k.a(dVar, this.f18006o, true);
    }

    private void b(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            return;
        }
        this.f17988A = i;
        this.f18017z = i4;
        this.f17992E.setLayoutParams(new ViewGroup.LayoutParams(i4, i));
    }

    public final void a(e eVar) {
        this.f17999f = eVar;
        this.f17996I = true;
        this.f18010s = true;
        this.f18006o.clearResStateAndRemoveClose();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c d2 = com.anythink.expressad.f.b.d(com.anythink.expressad.foundation.b.a.c().f(), this.f18000h);
        this.f18009r = d2;
        if (d2 == null) {
            this.f18009r = com.anythink.expressad.f.c.y();
        }
        b bVar = new b(this);
        this.f18003l = bVar;
        bVar.a(this.f18004m);
        if (this.f18001j == null) {
            this.f18001j = new com.anythink.expressad.advanced.c.b(this.i, this.f18000h);
        }
        b bVar2 = this.f18003l;
        if (bVar2 != null) {
            this.f18001j.a(bVar2);
        }
        this.f18006o.resetLoadState();
        this.f18001j.a(this.f18006o);
        this.f18001j.a(this.f18009r);
        this.f18001j.a(this.f18017z, this.f17988A);
        this.f18001j.a(this.f18011t);
        this.f18001j.a(eVar);
    }

    private void a(Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f18002k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f18000h);
            this.f18002k = cVar;
            cVar.a(this);
        }
        if (this.f18007p == null) {
            try {
                this.f18007p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f18008q == null) {
                try {
                    this.f18008q = new com.anythink.expressad.advanced.view.a(this.f18000h, this.f18002k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f18007p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f18008q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f18006o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f18006o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f18007p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f18007p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f18006o.addView(this.f18007p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f17992E == null) {
            this.f17992E = new ATOutNativeAdvancedViewGroup(t.b().g());
            if (this.f18017z != 0 && this.f17988A != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f18017z, this.f17988A);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f17992E.setLayoutParams(layoutParams);
            this.f17992E.setProvider(this);
            this.f17992E.addView(this.f18006o);
            this.f17992E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    public final String a(String str) {
        com.anythink.expressad.advanced.c.b bVar = this.f18001j;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    public final void a(int i, int i4) {
        if (i <= 0 || i4 <= 0) {
            return;
        }
        this.f17988A = i;
        this.f18017z = i4;
        this.f17992E.setLayoutParams(new ViewGroup.LayoutParams(i4, i));
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z8) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        g(this.f18011t);
        h(this.f18013v);
        i(this.f18015x);
        b(this.f17990C);
        t.b().g();
        f(n.b());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f17992E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (dVar == null || !z8) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f18009r == null) {
                com.anythink.expressad.f.b.a();
                this.f18009r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f18000h);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f18005n = new d(cVar, this.f18004m, this.f18009r.a(), dVar2);
        }
        if (cVar.f18002k == null) {
            com.anythink.expressad.advanced.c.c cVar2 = new com.anythink.expressad.advanced.c.c(t.b().g(), cVar.i, cVar.f18000h);
            cVar.f18002k = cVar2;
            cVar2.a(this);
        }
        cVar.f18002k.a(cVar.f18005n);
        cVar.f18002k.a(dVar2, cVar.f18006o, true);
    }
}
