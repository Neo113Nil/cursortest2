package com.anythink.basead.webtemplet;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.basead.ui.web.BaseWebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.expressad.video.module.a.a.m;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WTWebView extends BaseWebView {

    /* renamed from: A, reason: collision with root package name */
    private c f12169A;

    /* renamed from: a, reason: collision with root package name */
    k f12170a;

    /* renamed from: b, reason: collision with root package name */
    j f12171b;

    /* renamed from: c, reason: collision with root package name */
    c f12172c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f12173d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f12174e;

    /* renamed from: f, reason: collision with root package name */
    boolean f12175f;

    /* renamed from: h, reason: collision with root package name */
    private final String f12176h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.core.common.t.b f12177j;

    /* renamed from: k, reason: collision with root package name */
    private w f12178k;

    /* renamed from: l, reason: collision with root package name */
    private x f12179l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12180m;

    /* renamed from: n, reason: collision with root package name */
    private Object f12181n;

    /* renamed from: o, reason: collision with root package name */
    private f f12182o;

    /* renamed from: p, reason: collision with root package name */
    private a f12183p;

    /* renamed from: q, reason: collision with root package name */
    private Object f12184q;

    /* renamed from: r, reason: collision with root package name */
    private final List<i> f12185r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f12186s;

    /* renamed from: t, reason: collision with root package name */
    private String f12187t;

    /* renamed from: u, reason: collision with root package name */
    private long f12188u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12189v;

    /* renamed from: w, reason: collision with root package name */
    private long f12190w;

    /* renamed from: x, reason: collision with root package name */
    private long f12191x;

    /* renamed from: y, reason: collision with root package name */
    private long f12192y;

    /* renamed from: z, reason: collision with root package name */
    private long f12193z;

    public interface a {
        void a();
    }

    public WTWebView(Context context) {
        super(context);
        this.f12176h = "WTWebView";
        this.i = m.ai;
        this.f12173d = false;
        this.f12174e = false;
        this.f12184q = new Object();
        this.f12175f = false;
        this.f12185r = Collections.synchronizedList(new ArrayList());
        this.f12186s = false;
        this.f12187t = "";
        this.f12189v = false;
        this.f12190w = 0L;
        this.f12191x = 0L;
        this.f12192y = 0L;
        this.f12193z = 0L;
        this.f12169A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f12190w == 0) {
                    WTWebView.this.f12190w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i, String str, String str2) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, i, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    public Object getJsCommunicationObject() {
        return this.f12181n;
    }

    public Object getJsObject(String str) {
        f fVar = this.f12182o;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public void h5ShowException(String str) {
        String str2;
        if (this.f12177j != null) {
            com.anythink.core.common.t.d.a().b(this.f12177j);
            this.f12177j = null;
        }
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.optInt("error_code", 0);
            str2 = jSONObject.optString("error_message", "");
        } catch (Throwable unused) {
            str2 = com.anythink.core.common.v.m.f17596e;
        }
        a(i == -999 ? 3 : 2, i + "," + str2);
        c cVar = this.f12172c;
        if (cVar != null) {
            cVar.a(this, i, str2, getUrl());
        }
        a(String.valueOf(i), str2);
    }

    public void initData(w wVar, x xVar, boolean z6) {
        y yVar;
        this.f12178k = wVar;
        this.f12179l = xVar;
        this.f12180m = z6;
        if (xVar == null || (yVar = xVar.f14954o) == null) {
            return;
        }
        this.i = yVar.bM();
    }

    public boolean isPreload() {
        return this.f12180m;
    }

    public void jsCallInitSuccess() {
        this.f12191x = System.currentTimeMillis();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (TextUtils.isEmpty(this.f12187t)) {
            this.f12187t = str;
            this.f12188u = System.currentTimeMillis();
            if (this.f12177j == null) {
                this.f12177j = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.webtemplet.WTWebView.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        WTWebView.this.h5ShowException("{\"error_code\":-999,\"error_message\":\"render timeout\"}");
                    }
                };
                com.anythink.core.common.t.d.a().a(this.f12177j, this.i, true);
            }
        }
        super.loadUrl(str);
    }

    public void notifyInnerAdEvent(final int i, final Map<String, Object> map) {
        if (this.f12186s) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.WTWebView.5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:17:0x01e5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x01e6  */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    String str;
                    String str2;
                    ?? r1 = i;
                    String str3 = "";
                    if (r1 == 101) {
                        str = b.a.f12213k;
                    } else if (r1 != 301) {
                        if (r1 == 305) {
                            Map map2 = map;
                            r1 = b.a.f12217o;
                            if (map2 != null) {
                                JSONObject jSONObject = new JSONObject();
                                Object obj = map.get("wt_view_width");
                                if (obj != null) {
                                    jSONObject.put("view_width", obj);
                                }
                                Object obj2 = map.get("wt_view_height");
                                if (obj2 != null) {
                                    jSONObject.put("view_height", obj2);
                                }
                                str3 = jSONObject.toString();
                            }
                        } else if (r1 == 107) {
                            str = b.a.f12216n;
                        } else {
                            if (r1 != 108) {
                                switch (r1) {
                                    case 110:
                                        str = b.a.f12209f;
                                        break;
                                    case 111:
                                        str = b.a.f12208e;
                                        break;
                                    case 112:
                                        str = b.a.f12210g;
                                        break;
                                    case 113:
                                        Map map3 = map;
                                        r1 = b.a.f12205b;
                                        if (map3 != null) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            Object obj3 = map.get("click_type");
                                            if (obj3 != null) {
                                                jSONObject2.put("cl_s_type", obj3);
                                            }
                                            Object obj4 = map.get(g.a.f11958g);
                                            if (obj3 != null) {
                                                jSONObject2.put("cl_area", obj4);
                                            }
                                            str3 = jSONObject2.toString();
                                            break;
                                        }
                                        break;
                                    case 114:
                                        str = b.a.f12204a;
                                        break;
                                    case 115:
                                        str = b.a.f12206c;
                                        break;
                                    default:
                                        switch (r1) {
                                            case 121:
                                                if (map != null) {
                                                    try {
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        Object obj5 = map.get(g.a.f11959h);
                                                        if (obj5 != null) {
                                                            jSONObject3.put(g.a.f11959h, obj5);
                                                        }
                                                        str3 = jSONObject3.toString();
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                                str2 = str3;
                                                str3 = b.a.f12211h;
                                                break;
                                            case 122:
                                                str = b.a.i;
                                                break;
                                            case 123:
                                                Map map4 = map;
                                                r1 = b.a.f12212j;
                                                if (map4 != null) {
                                                    JSONObject jSONObject4 = new JSONObject();
                                                    Object obj6 = map.get("video_length");
                                                    if (obj6 != null) {
                                                        jSONObject4.put("duration", obj6);
                                                    }
                                                    str3 = jSONObject4.toString();
                                                    break;
                                                }
                                                break;
                                            case 124:
                                                str = b.a.f12215m;
                                                break;
                                            case 125:
                                                Map map5 = map;
                                                r1 = b.a.f12218p;
                                                if (map5 != null) {
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    Object obj7 = map.get(g.a.f11961k);
                                                    if (obj7 != null) {
                                                        jSONObject5.put(g.a.f13735C, obj7);
                                                    }
                                                    str3 = jSONObject5.toString();
                                                    break;
                                                }
                                                break;
                                            default:
                                                str2 = "";
                                                break;
                                        }
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    return;
                                }
                                com.anythink.basead.webtemplet.a.c.a().a((WebView) WTWebView.this, str3, str2);
                                return;
                            }
                            Map map6 = map;
                            r1 = b.a.f12214l;
                            if (map6 != null) {
                                JSONObject jSONObject6 = new JSONObject();
                                Object obj8 = map.get(g.a.i);
                                if (obj8 != null) {
                                    jSONObject6.put("error_message", obj8);
                                }
                                str3 = jSONObject6.toString();
                            }
                        }
                        str2 = str3;
                        str3 = r1;
                        if (TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        str = b.a.f12207d;
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            JSONObject jSONObject8 = new JSONObject();
                            String B3 = WTWebView.this.f12178k.B();
                            if (!TextUtils.isEmpty(B3)) {
                                if (WTWebView.this.f12178k.ab() <= 0 && WTWebView.this.f12178k.ac() <= 0) {
                                    com.anythink.basead.b.f.a();
                                    int[] a9 = com.anythink.core.common.v.h.a(com.anythink.basead.b.f.a(1, B3));
                                    if (a9 != null) {
                                        jSONObject8.put("image_width", a9[0]);
                                        jSONObject8.put("image_height", a9[1]);
                                    }
                                }
                                jSONObject8.put("image_width", WTWebView.this.f12178k.ab());
                                jSONObject8.put("image_height", WTWebView.this.f12178k.ac());
                            }
                            if (!TextUtils.isEmpty(WTWebView.this.f12178k.E()) && WTWebView.this.f12178k.V() > 0 && WTWebView.this.f12178k.W() > 0) {
                                jSONObject8.put("video_width", WTWebView.this.f12178k.V());
                                jSONObject8.put("video_height", WTWebView.this.f12178k.W());
                            }
                            jSONObject7.put(b.c.f12226g, jSONObject8);
                            str3 = jSONObject7.toString();
                        } catch (Throwable unused2) {
                        }
                    }
                    String str4 = str3;
                    str3 = str;
                    str2 = str4;
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
            }, 2);
            return;
        }
        synchronized (this.f12185r) {
            this.f12185r.add(new i(i, map));
        }
    }

    public void offerDataInject() {
        this.f12192y = System.currentTimeMillis();
        String str = "";
        try {
            if (getContext() == null) {
                t.b().g();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("offer_data", new JSONObject(this.f12178k.aw()));
            JSONObject jSONObject2 = new JSONObject();
            String B3 = this.f12178k.B();
            if (!TextUtils.isEmpty(B3)) {
                if (this.f12178k.ab() <= 0 && this.f12178k.ac() <= 0) {
                    com.anythink.basead.b.f.a();
                    int[] a9 = com.anythink.core.common.v.h.a(com.anythink.basead.b.f.a(1, B3));
                    if (a9 != null) {
                        jSONObject2.put("image_width", a9[0]);
                        jSONObject2.put("image_height", a9[1]);
                    }
                }
                jSONObject2.put("image_width", this.f12178k.ab());
                jSONObject2.put("image_height", this.f12178k.ac());
            }
            if (!TextUtils.isEmpty(this.f12178k.E()) && this.f12178k.V() > 0 && this.f12178k.W() > 0) {
                jSONObject2.put("video_width", this.f12178k.V());
                jSONObject2.put("video_height", this.f12178k.W());
            }
            jSONObject.put(b.c.f12226g, jSONObject2);
            str = jSONObject.toString();
        } catch (Throwable unused) {
        }
        com.anythink.basead.webtemplet.a.c.a().a((WebView) this, b.C0066b.f12219a, str);
        this.f12193z = System.currentTimeMillis();
        this.f12186s = true;
        synchronized (this.f12185r) {
            try {
                if (!this.f12185r.isEmpty()) {
                    for (i iVar : this.f12185r) {
                        notifyInnerAdEvent(iVar.f12300a, iVar.f12301b);
                    }
                    this.f12185r.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.core.basead.ui.web.BaseWebView, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12175f) {
            return;
        }
        this.f12175f = true;
        notifyInnerAdEvent(BaseATView.a.f10561L, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        if (i == i6 && i4 == i9) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("wt_view_width", Integer.valueOf(i));
            hashMap.put("wt_view_height", Integer.valueOf(i4));
            notifyInnerAdEvent(BaseATView.a.f10565P, hashMap);
        } catch (Throwable unused) {
        }
    }

    public void prepare(a aVar) {
        this.f12183p = aVar;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.basead.webtemplet.WTWebView.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                try {
                    if (WTWebView.this.f12173d) {
                        return false;
                    }
                    WTWebView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    WTWebView.this.f12173d = true;
                    WTWebView.this.c();
                    return false;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            }
        });
    }

    public void release() {
        try {
            if (this.f12177j != null) {
                com.anythink.core.common.t.d.a().b(this.f12177j);
                this.f12177j = null;
            }
            setVisibility(8);
            setDownloadListener(null);
            this.f12181n = null;
            if (this.f12169A != null) {
                this.f12169A = null;
            }
            if (this.f12172c != null) {
                this.f12172c = null;
            }
            destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void renderSuccess() {
        if (this.f12177j != null) {
            com.anythink.core.common.t.d.a().b(this.f12177j);
            this.f12177j = null;
        }
        this.f12174e = true;
        c cVar = this.f12172c;
        if (cVar != null) {
            cVar.b(this);
        }
        c();
        a(1, "");
        if (!this.f12178k.ae() || TextUtils.isEmpty(this.f12178k.D())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(g.a.f11959h, this.f12178k.D());
        notifyInnerAdEvent(121, hashMap);
    }

    public void sendEventDA(final String str) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.WTWebView.4
            @Override // java.lang.Runnable
            public final void run() {
                w unused = WTWebView.this.f12178k;
                com.anythink.core.common.u.e.a(WTWebView.this.f12179l, str);
            }
        }, 2);
    }

    public void setJsCommunicationObject(Object obj) {
        this.f12181n = obj;
    }

    public void setWebViewListener(c cVar) {
        this.f12172c = cVar;
        j jVar = this.f12171b;
        if (jVar != null) {
            jVar.a(this.f12169A);
        }
        k kVar = this.f12170a;
        if (kVar != null) {
            kVar.a(this.f12169A);
        }
    }

    public void setWebViewTransparent() {
        setBackgroundColor(0);
        setBackgroundDrawable(null);
        setBackground(null);
    }

    private void b() {
        Class cls = Boolean.TYPE;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a aVar;
        synchronized (this.f12184q) {
            try {
                if (this.f12173d && this.f12174e && (aVar = this.f12183p) != null) {
                    aVar.a();
                    this.f12183p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        a(1, "");
        if (!this.f12178k.ae() || TextUtils.isEmpty(this.f12178k.D())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(g.a.f11959h, this.f12178k.D());
        notifyInnerAdEvent(121, hashMap);
    }

    @Override // com.anythink.core.basead.ui.web.BaseWebView
    public final void a() {
        Class cls = Boolean.TYPE;
        super.a();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
        j jVar = new j();
        this.f12171b = jVar;
        jVar.f12302a = this;
        jVar.f12303b = new g(this);
        setWebChromeClient(this.f12171b);
        k kVar = new k();
        this.f12170a = kVar;
        kVar.f12307a = new g(this);
        setWebViewClient(this.f12170a);
        this.f12182o = new f(this);
        setWebViewTransparent();
    }

    public WTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12176h = "WTWebView";
        this.i = m.ai;
        this.f12173d = false;
        this.f12174e = false;
        this.f12184q = new Object();
        this.f12175f = false;
        this.f12185r = Collections.synchronizedList(new ArrayList());
        this.f12186s = false;
        this.f12187t = "";
        this.f12189v = false;
        this.f12190w = 0L;
        this.f12191x = 0L;
        this.f12192y = 0L;
        this.f12193z = 0L;
        this.f12169A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f12190w == 0) {
                    WTWebView.this.f12190w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i, String str, String str2) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, i, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    public WTWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12176h = "WTWebView";
        this.i = m.ai;
        this.f12173d = false;
        this.f12174e = false;
        this.f12184q = new Object();
        this.f12175f = false;
        this.f12185r = Collections.synchronizedList(new ArrayList());
        this.f12186s = false;
        this.f12187t = "";
        this.f12189v = false;
        this.f12190w = 0L;
        this.f12191x = 0L;
        this.f12192y = 0L;
        this.f12193z = 0L;
        this.f12169A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f12190w == 0) {
                    WTWebView.this.f12190w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i4, String str, String str2) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, i4, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i4 + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f12172c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    private static int a(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName)) {
                return 0;
            }
            return packageInfo.versionName.equals("77.0.3865.92") ? 5 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.anythink.basead.webtemplet.adformat.a a9;
        Object obj = this.f12181n;
        if (obj == null || !(obj instanceof com.anythink.basead.webtemplet.adformat.e) || (a9 = ((com.anythink.basead.webtemplet.adformat.e) obj).a()) == null) {
            return;
        }
        a9.a(str, str2);
    }

    private synchronized void a(int i, String str) {
        if (!this.f12189v && !this.f12727g) {
            this.f12189v = true;
            w wVar = this.f12178k;
            x xVar = this.f12179l;
            long currentTimeMillis = System.currentTimeMillis();
            long j6 = this.f12188u;
            com.anythink.core.common.u.e.a(wVar, xVar, i, currentTimeMillis - j6, str, this.f12190w, this.f12191x, this.f12192y, this.f12193z, j6);
        }
    }
}
