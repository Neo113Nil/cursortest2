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
    public static final int f17826a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17827b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17828c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static String f17829g = "NativeAdvancedProvider";

    /* renamed from: C, reason: collision with root package name */
    private JSONObject f17832C;

    /* renamed from: E, reason: collision with root package name */
    private ATOutNativeAdvancedViewGroup f17834E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f17835F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17836G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17837H;

    /* renamed from: e, reason: collision with root package name */
    boolean f17840e;

    /* renamed from: f, reason: collision with root package name */
    e f17841f;

    /* renamed from: h, reason: collision with root package name */
    private String f17842h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.b f17843j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.c f17844k;

    /* renamed from: l, reason: collision with root package name */
    private b f17845l;

    /* renamed from: m, reason: collision with root package name */
    private p f17846m;

    /* renamed from: n, reason: collision with root package name */
    private d f17847n;

    /* renamed from: o, reason: collision with root package name */
    private ATNativeAdvancedView f17848o;

    /* renamed from: p, reason: collision with root package name */
    private ATNativeAdvancedWebview f17849p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.advanced.view.a f17850q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f17851r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17852s;

    /* renamed from: t, reason: collision with root package name */
    private int f17853t = -1;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17854u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f17855v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17856w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f17857x = 0;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17858y = false;

    /* renamed from: z, reason: collision with root package name */
    private int f17859z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f17830A = 0;

    /* renamed from: B, reason: collision with root package name */
    private Object f17831B = new Object();

    /* renamed from: D, reason: collision with root package name */
    private boolean f17833D = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f17838I = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17839d = false;
    private ViewTreeObserver.OnScrollChangedListener J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (c.this.f17838I) {
                c.this.f17838I = false;
                if (c.this.f17834E != null) {
                    c.this.f17834E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f17838I = true;
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
        this.f17842h = str2;
        if (this.f17844k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f17842h);
            this.f17844k = cVar;
            cVar.a(this);
        }
        if (this.f17849p == null) {
            try {
                this.f17849p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f17850q == null) {
                try {
                    this.f17850q = new com.anythink.expressad.advanced.view.a(this.f17842h, this.f17844k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f17850q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f17848o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f17848o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f17849p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f17849p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f17848o.addView(this.f17849p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f17834E == null) {
            this.f17834E = new ATOutNativeAdvancedViewGroup(t.b().g());
            this.f17834E.setLayoutParams((this.f17859z == 0 || this.f17830A == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f17859z, this.f17830A));
            this.f17834E.setProvider(this);
            this.f17834E.addView(this.f17848o);
            this.f17834E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    private void f(int i) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.f17849p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f17903m, i);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f17849p, NativeAdvancedJsUtils.f17902l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h(int i) {
        if (this.f17856w) {
            this.f17855v = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f17849p, NativeAdvancedJsUtils.f17899h, "mute", Integer.valueOf(i));
        }
    }

    private void i(int i) {
        if (this.f17858y) {
            this.f17857x = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f17849p, NativeAdvancedJsUtils.f17900j, NativeAdvancedJsUtils.f17901k, Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f17835F && this.f17836G && this.f17837H) {
            com.anythink.expressad.advanced.c.b bVar = this.f17843j;
            com.anythink.expressad.foundation.d.d c9 = bVar != null ? bVar.c() : null;
            if (c9 != null) {
                c9.aL();
            }
            if (aa.a(this.f17848o.getAdvancedNativeWebview(), 0) || this.f17834E.getAlpha() < 0.5f || this.f17834E.getVisibility() != 0) {
                return;
            }
            com.anythink.expressad.advanced.c.c cVar = this.f17844k;
            if (cVar != null) {
                cVar.d();
            }
            a(c9);
        }
    }

    private void k() {
        com.anythink.expressad.advanced.c.c cVar = this.f17844k;
        if (cVar != null) {
            cVar.e();
        }
    }

    private com.anythink.expressad.f.c l() {
        return this.f17851r;
    }

    public final int d() {
        return this.f17853t;
    }

    public final void e(int i) {
        if (i == 1) {
            this.f17835F = false;
        } else if (i == 2) {
            this.f17836G = false;
        } else if (i == 3) {
            this.f17837H = false;
        }
        com.anythink.expressad.advanced.c.c cVar = this.f17844k;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    private void g(int i) {
        if (this.f17854u) {
            this.f17853t = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i6 = this.f17853t;
            if (i6 == 1) {
                this.f17844k.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.f17849p, NativeAdvancedJsUtils.f17897f, "", null);
            } else if (i6 == 0) {
                this.f17844k.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.f17849p, NativeAdvancedJsUtils.f17898g, "", null);
            }
        }
    }

    public final void b() {
        this.f17852s = false;
    }

    public final ATOutNativeAdvancedViewGroup c() {
        return this.f17834E;
    }

    public final void d(int i) {
        if (i == 1) {
            this.f17835F = true;
        } else if (i == 2) {
            this.f17836G = true;
        } else if (i == 3) {
            this.f17837H = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        if (this.f17833D) {
            this.f17832C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f17849p, NativeAdvancedJsUtils.f17895d, "", jSONObject);
        }
    }

    public final boolean a() {
        return this.f17852s;
    }

    public final void c(int i) {
        this.f17858y = true;
        i(i);
    }

    private void a(JSONObject jSONObject) {
        this.f17833D = true;
        b(jSONObject);
    }

    private String h() {
        if (this.f17839d) {
            com.anythink.expressad.advanced.c.c cVar = this.f17844k;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.anythink.expressad.advanced.c.b bVar = this.f17843j;
        if (bVar != null) {
            return bVar.a();
        }
        return "";
    }

    private void i() {
        g(this.f17853t);
        h(this.f17855v);
        i(this.f17857x);
        b(this.f17832C);
        t.b().g();
        f(n.b());
    }

    public final void a(p pVar) {
        this.f17846m = pVar;
    }

    public final void e() {
        if (this.f17846m != null) {
            this.f17846m = null;
        }
        if (this.f17845l != null) {
            this.f17845l = null;
        }
        if (this.f17847n != null) {
            this.f17847n = null;
        }
        com.anythink.expressad.advanced.c.b bVar = this.f17843j;
        if (bVar != null) {
            bVar.a((ATNativeAdvancedView) null);
            this.f17843j.b();
        }
        com.anythink.expressad.advanced.c.c cVar = this.f17844k;
        if (cVar != null) {
            cVar.c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f17848o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.anythink.expressad.advanced.a.a.c(this.f17841f.f());
        com.anythink.expressad.advanced.view.a aVar = this.f17850q;
        if (aVar != null) {
            aVar.b();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f17834E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.J);
            this.f17834E.removeAllViews();
            this.f17834E = null;
        }
    }

    public final void a(int i) {
        this.f17854u = true;
        g(i);
    }

    public final void b(int i) {
        this.f17856w = true;
        h(i);
    }

    public final int f() {
        com.anythink.expressad.advanced.c.b bVar = this.f17843j;
        com.anythink.expressad.foundation.d.d c9 = bVar != null ? bVar.c() : null;
        if (c9 != null) {
            return TextUtils.isEmpty(c9.T()) ? 2 : 1;
        }
        return 0;
    }

    private void a(final com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (this.f17851r == null) {
                com.anythink.expressad.f.b.a();
                this.f17851r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f17842h);
            }
            this.f17847n = new d(this, this.f17846m, this.f17851r.a(), dVar);
            if (this.f17840e) {
                return;
            }
            this.f17840e = true;
            com.anythink.expressad.advanced.c.d.a(this.f17848o, dVar, this.i, this.f17842h, this.f17853t, new d.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.c.d.a
                public final void a() {
                    String unused = c.f17829g;
                    c.this.a(dVar, false);
                }

                @Override // com.anythink.expressad.advanced.c.d.a
                public final void b() {
                    c.this.f17840e = false;
                }
            });
        }
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        this.f17844k.a(this.f17847n);
        this.f17844k.a(dVar, this.f17848o, true);
    }

    private void b(int i, int i6) {
        if (i <= 0 || i6 <= 0) {
            return;
        }
        this.f17830A = i;
        this.f17859z = i6;
        this.f17834E.setLayoutParams(new ViewGroup.LayoutParams(i6, i));
    }

    public final void a(e eVar) {
        this.f17841f = eVar;
        this.f17838I = true;
        this.f17852s = true;
        this.f17848o.clearResStateAndRemoveClose();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c d2 = com.anythink.expressad.f.b.d(com.anythink.expressad.foundation.b.a.c().f(), this.f17842h);
        this.f17851r = d2;
        if (d2 == null) {
            this.f17851r = com.anythink.expressad.f.c.y();
        }
        b bVar = new b(this);
        this.f17845l = bVar;
        bVar.a(this.f17846m);
        if (this.f17843j == null) {
            this.f17843j = new com.anythink.expressad.advanced.c.b(this.i, this.f17842h);
        }
        b bVar2 = this.f17845l;
        if (bVar2 != null) {
            this.f17843j.a(bVar2);
        }
        this.f17848o.resetLoadState();
        this.f17843j.a(this.f17848o);
        this.f17843j.a(this.f17851r);
        this.f17843j.a(this.f17859z, this.f17830A);
        this.f17843j.a(this.f17853t);
        this.f17843j.a(eVar);
    }

    private void a(Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f17844k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.f17842h);
            this.f17844k = cVar;
            cVar.a(this);
        }
        if (this.f17849p == null) {
            try {
                this.f17849p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f17850q == null) {
                try {
                    this.f17850q = new com.anythink.expressad.advanced.view.a(this.f17842h, this.f17844k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17849p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f17850q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f17848o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f17848o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f17849p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f17849p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f17848o.addView(this.f17849p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f17834E == null) {
            this.f17834E = new ATOutNativeAdvancedViewGroup(t.b().g());
            if (this.f17859z != 0 && this.f17830A != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f17859z, this.f17830A);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f17834E.setLayoutParams(layoutParams);
            this.f17834E.setProvider(this);
            this.f17834E.addView(this.f17848o);
            this.f17834E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    public final String a(String str) {
        com.anythink.expressad.advanced.c.b bVar = this.f17843j;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    public final void a(int i, int i6) {
        if (i <= 0 || i6 <= 0) {
            return;
        }
        this.f17830A = i;
        this.f17859z = i6;
        this.f17834E.setLayoutParams(new ViewGroup.LayoutParams(i6, i));
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        g(this.f17853t);
        h(this.f17855v);
        i(this.f17857x);
        b(this.f17832C);
        t.b().g();
        f(n.b());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f17834E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (dVar == null || !z3) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f17851r == null) {
                com.anythink.expressad.f.b.a();
                this.f17851r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f17842h);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f17847n = new d(cVar, this.f17846m, this.f17851r.a(), dVar2);
        }
        if (cVar.f17844k == null) {
            com.anythink.expressad.advanced.c.c cVar2 = new com.anythink.expressad.advanced.c.c(t.b().g(), cVar.i, cVar.f17842h);
            cVar.f17844k = cVar2;
            cVar2.a(this);
        }
        cVar.f17844k.a(cVar.f17847n);
        cVar.f17844k.a(dVar2, cVar.f17848o, true);
    }
}
