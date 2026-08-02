package com.anythink.expressad.reward.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.bt.module.AnythinkBTRootLayout;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.b.n;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20073a = "RewardCampaignsResourceManager";

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, a> f20074d = null;
    private static final int i = 100;

    /* renamed from: j, reason: collision with root package name */
    private static final int f20075j = 200;

    /* renamed from: k, reason: collision with root package name */
    private static final int f20076k = 101;

    /* renamed from: l, reason: collision with root package name */
    private static final int f20077l = 201;

    /* renamed from: m, reason: collision with root package name */
    private static final int f20078m = 102;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20079n = 202;

    /* renamed from: o, reason: collision with root package name */
    private static final int f20080o = 103;

    /* renamed from: p, reason: collision with root package name */
    private static final int f20081p = 203;

    /* renamed from: q, reason: collision with root package name */
    private static final int f20082q = 104;

    /* renamed from: r, reason: collision with root package name */
    private static final int f20083r = 204;

    /* renamed from: s, reason: collision with root package name */
    private static final int f20084s = 105;

    /* renamed from: t, reason: collision with root package name */
    private static final int f20085t = 205;

    /* renamed from: u, reason: collision with root package name */
    private static final int f20086u = 106;

    /* renamed from: v, reason: collision with root package name */
    private static final int f20087v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final int f20088w = 1;

    /* renamed from: b, reason: collision with root package name */
    private final h f20089b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, List<com.anythink.expressad.foundation.d.d>> f20090c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20091e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20092f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20093g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20094h;

    /* renamed from: x, reason: collision with root package name */
    private volatile List<WindVaneWebView> f20095x;

    /* renamed from: com.anythink.expressad.reward.a.c$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f20110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20111c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f20112d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f20113e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.videocommon.e.d f20114f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f20115g;

        public AnonymousClass3(boolean z3, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.d dVar, List list, String str, com.anythink.expressad.videocommon.e.d dVar2, String str2) {
            this.f20109a = z3;
            this.f20110b = windVaneWebView;
            this.f20111c = dVar;
            this.f20112d = list;
            this.f20113e = str;
            this.f20114f = dVar2;
            this.f20115g = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WindVaneWebView windVaneWebView;
            com.anythink.expressad.video.signal.a.j jVar;
            boolean z3 = this.f20109a;
            WindVaneWebView windVaneWebView2 = this.f20110b;
            String e9 = this.f20111c.N().e();
            com.anythink.expressad.foundation.d.d dVar = this.f20111c;
            List list = this.f20112d;
            String b9 = com.anythink.expressad.videocommon.b.i.a().b(this.f20111c.N().e());
            String str = this.f20113e;
            com.anythink.expressad.videocommon.e.d dVar2 = this.f20114f;
            String str2 = this.f20115g;
            boolean z6 = c.this.f20091e;
            try {
                a.C0142a c0142a = new a.C0142a();
                WindVaneWebView windVaneWebView3 = new WindVaneWebView(t.b().g());
                if (dVar != null) {
                    windVaneWebView3.setLocalRequestId(com.anythink.expressad.foundation.d.d.ab());
                }
                windVaneWebView3.setTempTypeForMetrics(2);
                c0142a.a(windVaneWebView3);
                String str3 = "";
                if (list == null || list.size() <= 0) {
                    windVaneWebView = windVaneWebView2;
                    jVar = new com.anythink.expressad.video.signal.a.j(null, dVar);
                    if (dVar != null) {
                        str3 = dVar.aa();
                    }
                } else {
                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9 = com.anythink.expressad.videocommon.b.e.a().a(str);
                    if (a9 != null && a9.size() > 0) {
                        for (int i = 0; i < list.size(); i++) {
                            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) list.get(i);
                            for (com.anythink.expressad.foundation.d.d dVar4 : a9) {
                                WindVaneWebView windVaneWebView4 = windVaneWebView2;
                                if (dVar4.bh().equals(dVar3.bh()) && dVar4.aa().equals(dVar3.aa())) {
                                    dVar3.aw();
                                    list.set(i, dVar3);
                                }
                                windVaneWebView2 = windVaneWebView4;
                            }
                        }
                    }
                    windVaneWebView = windVaneWebView2;
                    jVar = new com.anythink.expressad.video.signal.a.j(null, dVar, list);
                    str3 = ((com.anythink.expressad.foundation.d.d) list.get(0)).aa();
                }
                jVar.a(0);
                jVar.a(str);
                jVar.c(str2);
                jVar.a(dVar2);
                jVar.b(z3);
                String str4 = str3;
                windVaneWebView3.setWebViewListener(new l(str2, windVaneWebView, e9, str, c0142a, dVar, z6, str4));
                windVaneWebView3.setObject(jVar);
                windVaneWebView3.loadUrl(b9);
                windVaneWebView3.setRid(str4);
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.getLocalizedMessage();
                }
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f20117a;

        /* renamed from: b, reason: collision with root package name */
        boolean f20118b;

        /* renamed from: c, reason: collision with root package name */
        int f20119c;

        /* renamed from: d, reason: collision with root package name */
        int f20120d;

        /* renamed from: e, reason: collision with root package name */
        String f20121e;

        /* renamed from: f, reason: collision with root package name */
        String f20122f;

        /* renamed from: g, reason: collision with root package name */
        int f20123g;

        /* renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> f20124h;
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> i;

        public a(boolean z3, boolean z6, int i, int i6, String str, String str2, int i9, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
            this.f20117a = z3;
            this.f20118b = z6;
            this.f20119c = i;
            this.f20120d = i6;
            this.f20121e = str;
            this.f20122f = str2;
            this.f20123g = i9;
            this.f20124h = copyOnWriteArrayList;
            this.i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    public static class b extends com.anythink.expressad.atsignalcommon.b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f20125b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f20126c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f20127d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f20128e;

        /* renamed from: f, reason: collision with root package name */
        private int f20129f;

        /* renamed from: g, reason: collision with root package name */
        private String f20130g;

        /* renamed from: h, reason: collision with root package name */
        private String f20131h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private String f20132j;

        /* renamed from: k, reason: collision with root package name */
        private a.C0142a f20133k;

        /* renamed from: l, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20134l;

        /* renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> f20135m;

        /* renamed from: n, reason: collision with root package name */
        private com.anythink.expressad.videocommon.e.d f20136n;

        /* renamed from: o, reason: collision with root package name */
        private final j f20137o;

        /* renamed from: q, reason: collision with root package name */
        private boolean f20139q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f20140r;

        /* renamed from: t, reason: collision with root package name */
        private boolean f20142t;

        /* renamed from: u, reason: collision with root package name */
        private long f20143u;

        /* renamed from: s, reason: collision with root package name */
        private int f20141s = 0;

        /* renamed from: p, reason: collision with root package name */
        private boolean f20138p = false;

        public b(boolean z3, Handler handler, Runnable runnable, boolean z6, boolean z9, int i, String str, String str2, String str3, String str4, a.C0142a c0142a, com.anythink.expressad.foundation.d.d dVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, com.anythink.expressad.videocommon.e.d dVar2, j jVar, long j6) {
            this.f20125b = handler;
            this.f20126c = runnable;
            this.f20127d = z6;
            this.f20128e = z9;
            this.f20129f = i;
            this.f20130g = str;
            this.i = str2;
            this.f20131h = str3;
            this.f20132j = str4;
            this.f20133k = c0142a;
            this.f20134l = dVar;
            this.f20135m = copyOnWriteArrayList;
            this.f20136n = dVar2;
            this.f20137o = jVar;
            this.f20142t = z3;
            this.f20143u = j6;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final void a(String str, int i, int i6) {
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f20139q) {
                return;
            }
            if (!str.contains("wfr=1")) {
                com.anythink.expressad.videocommon.b.l.a().c(this.f20131h + "_" + this.f20132j + "_" + this.f20130g, true);
                Handler handler = this.f20125b;
                if (handler != null && (runnable = this.f20126c) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0142a c0142a = this.f20133k;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                j jVar = this.f20137o;
                if (jVar != null) {
                    jVar.a();
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(webView);
            this.f20139q = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            com.anythink.expressad.videocommon.b.l.a().c(this.f20131h + "_" + this.f20132j + "_" + this.f20130g, false);
            if (this.f20137o != null) {
                a.C0142a c0142a = this.f20133k;
                if (c0142a != null) {
                    c0142a.a(false);
                }
                this.f20137o.a(c.b(com.anythink.expressad.foundation.e.b.i, "onReceivedError： " + i + "  " + str, null, this.f20134l));
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
        public final void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f20131h, this.f20132j);
                        if (b9 != null && !b9.isEmpty()) {
                            for (View view : b9.values()) {
                                if (view instanceof AnythinkBTContainer) {
                                    ((AnythinkBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            Runnable runnable;
            if (this.f20140r) {
                return;
            }
            boolean z3 = this.f20138p;
            if (i == 1) {
                if (z3) {
                    com.anythink.expressad.videocommon.a.e(this.f20131h + "_" + this.f20132j);
                } else {
                    com.anythink.expressad.videocommon.a.d(this.f20131h + "_" + this.f20132j);
                }
                com.anythink.expressad.videocommon.a.a(this.f20131h + "_" + this.f20132j + "_" + this.f20130g, this.f20133k, true, this.f20138p);
                Handler handler = this.f20125b;
                if (handler != null && (runnable = this.f20126c) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.anythink.expressad.videocommon.b.l.a().c(this.f20131h + "_" + this.f20132j + "_" + this.f20130g, true);
                a.C0142a c0142a = this.f20133k;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                j jVar = this.f20137o;
                if (jVar != null) {
                    jVar.a();
                }
            } else {
                com.anythink.expressad.videocommon.b.l.a().c(this.f20131h + "_" + this.f20132j + "_" + this.f20130g, false);
                a.C0142a c0142a2 = this.f20133k;
                if (c0142a2 != null) {
                    c0142a2.a(false);
                }
                if (this.f20137o != null) {
                    this.f20137o.a(c.b(com.anythink.expressad.foundation.e.b.i, "readyState:".concat(String.valueOf(i)), null, this.f20134l));
                }
            }
            this.f20140r = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final String a(String str) {
            return com.anythink.expressad.videocommon.b.i.a().b(str);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String optString = new JSONObject(str).optString("id");
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(obj, optString);
                    com.anythink.expressad.video.bt.a.c.a();
                    String c9 = com.anythink.expressad.video.bt.a.c.c(optString);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.foundation.d.d a9 = com.anythink.expressad.video.bt.a.c.a(optString);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.videocommon.e.d b9 = com.anythink.expressad.video.bt.a.c.b(optString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(a9);
                    WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
                    if (windVaneWebView != null) {
                        c cVar = m.f20227a;
                        boolean z3 = this.f20142t;
                        int i = this.f20141s == 0 ? 3 : 6;
                        if (windVaneWebView != null) {
                            if (a9 != null && b9 != null && a9.N() != null && !TextUtils.isEmpty(c9)) {
                                if (TextUtils.isEmpty(a9.N().e())) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("id", optString);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("result", 1);
                                        jSONObject2.put("error", "data is null");
                                        jSONObject.put("data", jSONObject2);
                                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                                    } catch (Exception e9) {
                                        if (com.anythink.expressad.a.f17618a) {
                                            e9.getLocalizedMessage();
                                        }
                                    }
                                } else if (TextUtils.isEmpty(a9.N().e()) || !a9.N().e().contains(com.anythink.expressad.foundation.d.d.f18580d)) {
                                    new Handler(Looper.getMainLooper()).postDelayed(cVar.new AnonymousClass3(z3, windVaneWebView, a9, copyOnWriteArrayList, c9, b9, optString), i * 1000);
                                }
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("id", optString);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("result", 2);
                                jSONObject4.put("error", "data is null");
                                jSONObject3.put("data", jSONObject4);
                                com.anythink.expressad.atsignalcommon.windvane.h.a();
                                com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                            } catch (Exception e10) {
                                if (com.anythink.expressad.a.f17618a) {
                                    e10.getLocalizedMessage();
                                }
                            }
                        }
                        this.f20141s++;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.reward.a.c$c, reason: collision with other inner class name */
    public interface InterfaceC0126c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, com.anythink.expressad.foundation.e.c cVar);
    }

    public static final class d implements i.b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20144a = 497;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20145b = 313;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20146c = 859;

        /* renamed from: e, reason: collision with root package name */
        private int f20148e;

        /* renamed from: f, reason: collision with root package name */
        private final String f20149f;

        /* renamed from: g, reason: collision with root package name */
        private final String f20150g;

        /* renamed from: h, reason: collision with root package name */
        private final String f20151h;
        private com.anythink.expressad.foundation.d.d i;

        /* renamed from: j, reason: collision with root package name */
        private i f20152j;

        /* renamed from: k, reason: collision with root package name */
        private Handler f20153k;

        /* renamed from: l, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.d> f20154l;

        /* renamed from: d, reason: collision with root package name */
        private boolean f20147d = false;

        /* renamed from: m, reason: collision with root package name */
        private final long f20155m = System.currentTimeMillis();

        public d(int i, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, i iVar, Handler handler, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
            this.f20148e = i;
            this.f20149f = str;
            this.f20150g = str2;
            this.f20151h = str3;
            this.i = dVar;
            this.f20152j = iVar;
            this.f20153k = handler;
            this.f20154l = copyOnWriteArrayList;
        }

        public final void a(boolean z3) {
            this.f20147d = z3;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            com.anythink.expressad.videocommon.b.l.a().b(str, true);
            int i = this.f20148e;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f20150g);
                bundle.putString(com.anythink.expressad.a.f17642z, this.f20149f);
                bundle.putString("request_id", this.f20151h);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f20153k.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f20150g);
                bundle2.putString(com.anythink.expressad.a.f17642z, this.f20149f);
                bundle2.putString("request_id", this.f20151h);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f20153k.sendMessage(obtain2);
                if (this.f20147d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f20150g);
            bundle3.putString(com.anythink.expressad.a.f17642z, this.f20149f);
            bundle3.putString("request_id", this.f20151h);
            obtain3.setData(bundle3);
            this.f20153k.sendMessage(obtain3);
            i iVar = this.f20152j;
            if (iVar != null) {
                iVar.a(this.f20149f, this.f20150g, this.f20151h);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().b(str, false);
            int i = this.f20148e;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f20150g);
                bundle.putString(com.anythink.expressad.a.f17642z, this.f20149f);
                bundle.putString("request_id", this.f20151h);
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.f20153k.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f20150g);
                bundle2.putString(com.anythink.expressad.a.f17642z, this.f20149f);
                bundle2.putString("request_id", this.f20151h);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f20153k.sendMessage(obtain2);
                if (this.f20147d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f20150g);
            bundle3.putString(com.anythink.expressad.a.f17642z, this.f20149f);
            bundle3.putString("request_id", this.f20151h);
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.f20153k.sendMessage(obtain3);
            i iVar = this.f20152j;
            if (iVar != null) {
                try {
                    iVar.a(c.b(com.anythink.expressad.foundation.e.b.f18985g, str2, null, null));
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
        }
    }

    public static final class g implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20168a = 497;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20169b = 859;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20170c = 313;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20171d = 502;

        /* renamed from: f, reason: collision with root package name */
        private Context f20173f;

        /* renamed from: g, reason: collision with root package name */
        private String f20174g;

        /* renamed from: h, reason: collision with root package name */
        private String f20175h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20176j;

        /* renamed from: k, reason: collision with root package name */
        private int f20177k;

        /* renamed from: l, reason: collision with root package name */
        private Handler f20178l;

        /* renamed from: m, reason: collision with root package name */
        private i f20179m;

        /* renamed from: n, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.d> f20180n;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20172e = false;

        /* renamed from: o, reason: collision with root package name */
        private long f20181o = System.currentTimeMillis();

        public g(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, int i, Handler handler, i iVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
            this.f20173f = context;
            this.f20175h = str;
            this.f20174g = str2;
            this.i = str3;
            this.f20176j = dVar;
            this.f20177k = i;
            this.f20178l = handler;
            this.f20179m = iVar;
            this.f20180n = copyOnWriteArrayList;
        }

        public final void a(boolean z3) {
            this.f20172e = z3;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            com.anythink.expressad.videocommon.b.l.a().b(str, true);
            System.currentTimeMillis();
            int i = this.f20177k;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f20174g);
                bundle.putString(com.anythink.expressad.a.f17642z, this.f20175h);
                bundle.putString("request_id", this.i);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f20178l.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f20174g);
                bundle2.putString(com.anythink.expressad.a.f17642z, this.f20175h);
                bundle2.putString("request_id", this.i);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f20178l.sendMessage(obtain2);
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f20174g);
            bundle3.putString(com.anythink.expressad.a.f17642z, this.f20175h);
            bundle3.putString("request_id", this.i);
            obtain3.setData(bundle3);
            this.f20178l.sendMessage(obtain3);
            i iVar = this.f20179m;
            if (iVar != null) {
                iVar.a(this.f20175h, this.f20174g, this.i);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().b(str2, false);
            System.currentTimeMillis();
            int i = this.f20177k;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f20174g);
                bundle.putString(com.anythink.expressad.a.f17642z, this.f20175h);
                bundle.putString("request_id", this.i);
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.f20178l.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f20174g);
                bundle2.putString(com.anythink.expressad.a.f17642z, this.f20175h);
                bundle2.putString("request_id", this.i);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f20178l.sendMessage(obtain2);
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f20174g);
            bundle3.putString(com.anythink.expressad.a.f17642z, this.f20175h);
            bundle3.putString("request_id", this.i);
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.f20178l.sendMessage(obtain3);
            i iVar = this.f20179m;
            if (iVar != null) {
                try {
                    iVar.a(c.b(com.anythink.expressad.foundation.e.b.f18985g, "", null, null));
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
        }
    }

    public static final class h extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f20182a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0126c f20183b;

        /* renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, InterfaceC0126c> f20184c;

        /* renamed from: d, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d>> f20185d;

        public h(Looper looper) {
            super(looper);
            this.f20184c = new ConcurrentHashMap<>();
            this.f20185d = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, InterfaceC0126c interfaceC0126c) {
            this.f20184c.put(str + "_" + str2, interfaceC0126c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x015a, code lost:
        
            if (r19.aE().contains(0) != false) goto L238;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0315 A[Catch: Exception -> 0x032c, TryCatch #2 {Exception -> 0x032c, blocks: (B:92:0x030f, B:94:0x0315, B:96:0x032f, B:98:0x0337, B:191:0x0380, B:193:0x0386, B:197:0x0390, B:199:0x0396, B:201:0x03a0, B:210:0x03b1, B:213:0x03c1, B:216:0x03d1, B:219:0x03e1, B:222:0x03f0), top: B:22:0x00bd }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x032f A[Catch: Exception -> 0x032c, TryCatch #2 {Exception -> 0x032c, blocks: (B:92:0x030f, B:94:0x0315, B:96:0x032f, B:98:0x0337, B:191:0x0380, B:193:0x0386, B:197:0x0390, B:199:0x0396, B:201:0x03a0, B:210:0x03b1, B:213:0x03c1, B:216:0x03d1, B:219:0x03e1, B:222:0x03f0), top: B:22:0x00bd }] */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v25 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v3, types: [int] */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v32 */
        /* JADX WARN: Type inference failed for: r11v33 */
        /* JADX WARN: Type inference failed for: r11v34 */
        /* JADX WARN: Type inference failed for: r11v35 */
        /* JADX WARN: Type inference failed for: r11v36 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6, types: [com.anythink.expressad.foundation.d.d] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v19 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.BaseBundle, android.os.Bundle] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            boolean z3;
            ?? r12;
            com.anythink.expressad.videocommon.b.e a9;
            String str;
            ?? data = message.getData();
            String string = data.getString(com.anythink.expressad.a.f17642z);
            String string2 = data.getString("unit_id");
            String string3 = data.getString("request_id");
            String g4 = AbstractC4404f.g(string2, "_", string3);
            a aVar = (a) c.f20074d.get(g4);
            InterfaceC0126c interfaceC0126c = this.f20184c.get(g4);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.f20185d.get(g4);
            int i = message.what;
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            if (aVar != null && interfaceC0126c != null) {
                                String string4 = data.getString("message");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                int i6 = message.what;
                                ?? r11 = i6 != 200 ? i6 != 201 ? i6 != 203 ? i6 != 205 ? 880024 : 880005 : 880006 : 880007 : 880004;
                                String str2 = "resource download failed " + c.b(message.what) + " " + string4;
                                c.b(message.what);
                                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList2 = aVar.f20124h;
                                com.anythink.expressad.foundation.d.d dVar = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : aVar.f20124h.get(0);
                                try {
                                    try {
                                        try {
                                        } catch (Exception e9) {
                                            e = e9;
                                            r11 = 0;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    data = r11;
                                    r11 = 0;
                                }
                                if (!aVar.f20117a || aVar.i == null) {
                                    data = r11;
                                    com.anythink.expressad.videocommon.b.e a10 = com.anythink.expressad.videocommon.b.e.a();
                                    try {
                                        String str3 = aVar.f20121e;
                                        if (a10.a(str3, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList)) {
                                            interfaceC0126c.a(string, string2, string3, aVar.f20124h);
                                        } else {
                                            if (dVar != null && dVar.aE() != null && dVar.aE().size() > 0) {
                                                int i9 = message.what;
                                                if (i9 != 200) {
                                                    if (i9 != 201) {
                                                        if (i9 != 203) {
                                                            if (i9 == 205 && dVar.aE().contains(3)) {
                                                                r11 = str3;
                                                            }
                                                        } else if (dVar.aE().contains(1)) {
                                                            r11 = str3;
                                                        }
                                                    } else if (dVar.aE().contains(2)) {
                                                        r11 = str3;
                                                    }
                                                } else if (dVar.aE().contains(0)) {
                                                    r11 = str3;
                                                }
                                            }
                                            interfaceC0126c.a(aVar.f20124h, c.b(data, str2, null, null));
                                        }
                                        this.f20184c.remove(g4);
                                        c.f20074d.remove(g4);
                                        this.f20185d.remove(g4);
                                        break;
                                    } catch (Exception e12) {
                                        e = e12;
                                        r11 = 0;
                                    }
                                } else {
                                    int i10 = aVar.f20119c;
                                    try {
                                    } catch (Exception e13) {
                                        e = e13;
                                    }
                                    if (i10 == 1) {
                                        if (dVar != null && dVar.aE() != null && dVar.aE().size() > 0) {
                                            int i11 = message.what;
                                            if (i11 == 200) {
                                                r11 = r11;
                                                break;
                                            } else if (i11 != 201) {
                                                if (i11 != 203) {
                                                    if (i11 == 205) {
                                                        if (dVar.aE().contains(3)) {
                                                            r11 = r11;
                                                        } else {
                                                            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList3 = aVar.f20124h;
                                                            if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                                com.anythink.expressad.foundation.d.d dVar2 = aVar.f20124h.get(0);
                                                                if (dVar2.at().equals(dVar2.J()) && dVar.aE().contains(2)) {
                                                                    r11 = r11;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (dVar.aE().contains(1)) {
                                                    r11 = r11;
                                                }
                                            } else if (dVar.aE().contains(2)) {
                                                r11 = r11;
                                            }
                                            e = e11;
                                            data = r11;
                                            r11 = 0;
                                            interfaceC0126c.a(aVar.f20124h, c.b(data, str2, e, r11));
                                            r11 = r11;
                                        }
                                        try {
                                            interfaceC0126c.a(aVar.f20124h, c.b(r11, str2, null, null));
                                            this.f20184c.remove(g4);
                                            c.f20074d.remove(g4);
                                            this.f20185d.remove(g4);
                                            break;
                                        } catch (Exception e14) {
                                            e = e14;
                                            i10 = 0;
                                            data = r11;
                                            r12 = i10;
                                            r11 = r12;
                                            interfaceC0126c.a(aVar.f20124h, c.b(data, str2, e, r11));
                                            r11 = r11;
                                            return;
                                        }
                                    } else {
                                        r12 = 0;
                                        String string5 = data.getString("url");
                                        int i12 = message.what;
                                        if (i12 != 200) {
                                            if (i12 != 201) {
                                                if (i12 != 203) {
                                                    if (i12 == 205) {
                                                        if (dVar == null || dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(3)) {
                                                            aVar.i.clear();
                                                            c.f20074d.remove(g4);
                                                            c.f20074d.put(g4, aVar);
                                                        } else {
                                                            r11 = r11;
                                                        }
                                                    }
                                                    a9 = com.anythink.expressad.videocommon.b.e.a();
                                                    data = r11;
                                                    try {
                                                        str = aVar.f20121e;
                                                        try {
                                                            if (a9.a(str, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList)) {
                                                                r11 = str;
                                                                if (aVar.i.size() == 0) {
                                                                    interfaceC0126c.a(aVar.f20124h, c.b(data, str2, null, null));
                                                                    this.f20184c.remove(g4);
                                                                    c.f20074d.remove(g4);
                                                                    this.f20185d.remove(g4);
                                                                    break;
                                                                }
                                                            } else {
                                                                interfaceC0126c.a(string, string2, string3, aVar.f20124h);
                                                                this.f20184c.remove(g4);
                                                                c.f20074d.remove(g4);
                                                                this.f20185d.remove(g4);
                                                                break;
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            r11 = 0;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        data = data;
                                                        r11 = r12;
                                                        interfaceC0126c.a(aVar.f20124h, c.b(data, str2, e, r11));
                                                        r11 = r11;
                                                        return;
                                                    }
                                                } else if (dVar == null || dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(1)) {
                                                    for (int i13 = 0; i13 < aVar.i.size(); i13++) {
                                                        com.anythink.expressad.foundation.d.d dVar3 = aVar.i.get(i13);
                                                        if (dVar3.N() != null && dVar3.N().e().equals(string5)) {
                                                            aVar.i.remove(i13);
                                                        }
                                                    }
                                                    c.f20074d.remove(g4);
                                                    c.f20074d.put(g4, aVar);
                                                    a9 = com.anythink.expressad.videocommon.b.e.a();
                                                    data = r11;
                                                    str = aVar.f20121e;
                                                    if (a9.a(str, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList)) {
                                                    }
                                                } else {
                                                    r11 = r11;
                                                }
                                            } else if (dVar == null || dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(2)) {
                                                for (int i14 = 0; i14 < aVar.i.size(); i14++) {
                                                    com.anythink.expressad.foundation.d.d dVar4 = aVar.i.get(i14);
                                                    if (dVar4.N() != null && dVar4.N().d().equals(string5)) {
                                                        aVar.i.remove(i14);
                                                    }
                                                    if (!TextUtils.isEmpty(dVar4.J()) && dVar4.J().equals(string5)) {
                                                        aVar.i.remove(i14);
                                                    }
                                                }
                                                c.f20074d.remove(g4);
                                                c.f20074d.put(g4, aVar);
                                                a9 = com.anythink.expressad.videocommon.b.e.a();
                                                data = r11;
                                                str = aVar.f20121e;
                                                if (a9.a(str, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList)) {
                                                }
                                            } else {
                                                r11 = r11;
                                            }
                                        } else if (dVar == null || dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(0)) {
                                            for (int i15 = 0; i15 < aVar.i.size(); i15++) {
                                                if (aVar.i.get(i15).T().equals(string5)) {
                                                    aVar.i.remove(i15);
                                                }
                                            }
                                            c.f20074d.remove(g4);
                                            c.f20074d.put(g4, aVar);
                                            a9 = com.anythink.expressad.videocommon.b.e.a();
                                            data = r11;
                                            str = aVar.f20121e;
                                            if (a9.a(str, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList)) {
                                            }
                                        } else {
                                            r11 = r11;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    return;
            }
            if (aVar == null || interfaceC0126c == null) {
                return;
            }
            try {
                z3 = com.anythink.expressad.videocommon.b.e.a().a(aVar.f20121e, aVar.f20118b, aVar.f20120d, aVar.f20117a, aVar.f20119c, copyOnWriteArrayList);
            } catch (Exception e17) {
                if (com.anythink.expressad.a.f17618a) {
                    e17.getLocalizedMessage();
                }
                z3 = false;
            }
            if (z3) {
                interfaceC0126c.a(string, string2, string3, aVar.f20124h);
                this.f20184c.remove(g4);
                c.f20074d.remove(g4);
                this.f20185d.remove(g4);
            }
        }

        public final void a(Context context) {
            this.f20182a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
            this.f20185d.put(str, copyOnWriteArrayList);
        }
    }

    public interface i {
        void a(com.anythink.expressad.foundation.e.c cVar);

        void a(String str, String str2, String str3);
    }

    public interface j {
        void a();

        void a(com.anythink.expressad.foundation.e.c cVar);
    }

    public static class k extends com.anythink.expressad.atsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f20186a;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f20187b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f20188c;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f20189e;

        /* renamed from: f, reason: collision with root package name */
        private String f20190f;

        /* renamed from: g, reason: collision with root package name */
        private final j f20191g;

        /* renamed from: h, reason: collision with root package name */
        private final WindVaneWebView f20192h;
        private final String i;

        /* renamed from: j, reason: collision with root package name */
        private final String f20193j;

        /* renamed from: k, reason: collision with root package name */
        private final String f20194k;

        /* renamed from: l, reason: collision with root package name */
        private final a.C0142a f20195l;

        /* renamed from: m, reason: collision with root package name */
        private final com.anythink.expressad.foundation.d.d f20196m;

        /* renamed from: n, reason: collision with root package name */
        private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> f20197n;

        /* renamed from: o, reason: collision with root package name */
        private long f20198o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f20199p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f20200q;

        /* renamed from: r, reason: collision with root package name */
        private final Runnable f20201r;

        /* renamed from: s, reason: collision with root package name */
        private final Runnable f20202s;

        public k(Handler handler, Runnable runnable, boolean z3, boolean z6, final String str, final j jVar, WindVaneWebView windVaneWebView, final String str2, final String str3, final String str4, final a.C0142a c0142a, com.anythink.expressad.foundation.d.d dVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, long j6) {
            this.f20186a = handler;
            this.f20187b = runnable;
            this.f20188c = z3;
            this.f20189e = z6;
            this.f20190f = str;
            this.f20191g = jVar;
            this.f20192h = windVaneWebView;
            this.i = str2;
            this.f20193j = str4;
            this.f20194k = str3;
            this.f20195l = c0142a;
            this.f20196m = dVar;
            this.f20197n = copyOnWriteArrayList;
            this.f20198o = j6;
            Runnable runnable2 = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a9;
                    a.C0142a c0142a2;
                    if (jVar != null && (c0142a2 = c0142a) != null) {
                        c0142a2.a(true);
                        com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str + "_" + str2, true);
                        jVar.a();
                    }
                    a.C0142a c0142a3 = c0142a;
                    if (c0142a3 == null || (a9 = c0142a3.a()) == null) {
                        return;
                    }
                    try {
                        a9.release();
                    } catch (Exception unused) {
                    }
                }
            };
            this.f20202s = runnable2;
            this.f20201r = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a9;
                    a.C0142a c0142a2;
                    if (jVar != null && (c0142a2 = c0142a) != null) {
                        c0142a2.a(true);
                        com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str + "_" + str2, true);
                        jVar.a();
                    }
                    a.C0142a c0142a3 = c0142a;
                    if (c0142a3 == null || (a9 = c0142a3.a()) == null) {
                        return;
                    }
                    try {
                        a9.release();
                    } catch (Exception unused) {
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(runnable2, com.anythink.basead.exoplayer.f.f7187a);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f20186a;
            if (handler2 != null && (runnable2 = this.f20202s) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f20199p) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f20186a;
                if (handler3 != null && (runnable = this.f20201r) != null) {
                    handler3.postDelayed(runnable, com.anythink.basead.exoplayer.f.f7187a);
                }
            } else {
                com.anythink.expressad.videocommon.b.l.a().c(this.f20193j + "_" + this.f20190f + "_" + this.i, true);
                Runnable runnable3 = this.f20187b;
                if (runnable3 != null && (handler = this.f20186a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0142a c0142a = this.f20195l;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                if (this.f20188c) {
                    if (this.f20196m.B()) {
                        com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY, this.f20196m.ac(), this.f20195l);
                    } else {
                        com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f20196m.ac(), this.f20195l);
                    }
                } else if (this.f20196m.B()) {
                    com.anythink.expressad.videocommon.a.a(94, this.f20196m.ac(), this.f20195l);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f20196m.ac(), this.f20195l);
                }
                j jVar = this.f20191g;
                if (jVar != null) {
                    jVar.a();
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(webView);
            this.f20199p = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            com.anythink.expressad.videocommon.b.l.a().c(this.f20193j + "_" + this.f20190f + "_" + this.i, false);
            Handler handler = this.f20186a;
            if (handler != null) {
                if (this.f20201r != null) {
                    handler.removeCallbacks(this.f20202s);
                }
                Runnable runnable = this.f20201r;
                if (runnable != null) {
                    this.f20186a.removeCallbacks(runnable);
                }
            }
            try {
                a.C0142a c0142a = this.f20195l;
                if (c0142a != null) {
                    c0142a.a(false);
                }
                if (this.f20191g != null) {
                    this.f20191g.a(c.b(com.anythink.expressad.foundation.e.b.f18987j, i + "#" + str, null, this.f20196m));
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.getLocalizedMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            Object obj = "";
            (sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError())).toString();
            com.anythink.expressad.videocommon.b.l.a().c(this.f20193j + "_" + this.f20190f + "_" + this.i, false);
            Handler handler = this.f20186a;
            if (handler != null) {
                if (this.f20201r != null) {
                    handler.removeCallbacks(this.f20202s);
                }
                Runnable runnable = this.f20201r;
                if (runnable != null) {
                    this.f20186a.removeCallbacks(runnable);
                }
            }
            try {
                a.C0142a c0142a = this.f20195l;
                if (c0142a != null) {
                    c0142a.a(false);
                }
                if (this.f20191g != null) {
                    StringBuilder sb = new StringBuilder("onReceivedSslError:");
                    if (sslError != null) {
                        obj = Integer.valueOf(sslError.getPrimaryError());
                    }
                    sb.append(obj);
                    this.f20191g.a(c.b(com.anythink.expressad.foundation.e.b.f18987j, sb.toString(), null, this.f20196m));
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.getLocalizedMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.readyState(webView, i);
            Handler handler2 = this.f20186a;
            if (handler2 != null && (runnable2 = this.f20201r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f20186a;
            if (handler3 != null && (runnable = this.f20202s) != null) {
                handler3.removeCallbacks(runnable);
            }
            if (this.f20200q) {
                return;
            }
            if (i == 1) {
                Runnable runnable3 = this.f20187b;
                if (runnable3 != null && (handler = this.f20186a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.anythink.expressad.videocommon.b.l.a().c(this.f20193j + "_" + this.f20190f + "_" + this.i, true);
                a.C0142a c0142a = this.f20195l;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                if (this.f20188c) {
                    if (this.f20189e) {
                        com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY, this.f20196m.ac(), this.f20195l);
                    } else {
                        com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f20196m.ac(), this.f20195l);
                    }
                } else if (this.f20189e) {
                    com.anythink.expressad.videocommon.a.a(94, this.f20196m.ac(), this.f20195l);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f20196m.ac(), this.f20195l);
                }
                j jVar = this.f20191g;
                if (jVar != null) {
                    jVar.a();
                }
            } else if (this.f20191g != null) {
                this.f20191g.a(c.b(com.anythink.expressad.foundation.e.b.f18987j, "readyState:".concat(String.valueOf(i)), null, this.f20196m));
            }
            this.f20200q = true;
        }
    }

    public static class l extends com.anythink.expressad.atsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        private String f20217a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f20218b = false;

        /* renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f20219c;

        /* renamed from: e, reason: collision with root package name */
        private final String f20220e;

        /* renamed from: f, reason: collision with root package name */
        private final String f20221f;

        /* renamed from: g, reason: collision with root package name */
        private final a.C0142a f20222g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.expressad.foundation.d.d f20223h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private String f20224j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f20225k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f20226l;

        public l(String str, WindVaneWebView windVaneWebView, String str2, String str3, a.C0142a c0142a, com.anythink.expressad.foundation.d.d dVar, boolean z3, String str4) {
            this.f20219c = windVaneWebView;
            this.f20220e = str2;
            this.f20221f = str3;
            this.f20222g = c0142a;
            this.f20223h = dVar;
            this.f20217a = str;
            this.i = z3;
            this.f20224j = str4;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            if (this.f20225k) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f20219c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f20217a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) this.f20219c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        if (com.anythink.expressad.a.f17618a) {
                            e9.getLocalizedMessage();
                        }
                    }
                }
                com.anythink.expressad.videocommon.b.l.a().c(this.f20221f + "_" + this.f20224j + "_" + this.f20220e, true);
                a.C0142a c0142a = this.f20222g;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                String str2 = this.f20221f + "_" + this.f20223h.bh() + "_" + this.f20223h.aa() + "_" + this.f20220e;
                if (this.f20218b) {
                    if (this.f20223h.B()) {
                        com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY, this.f20223h.ac(), this.f20222g);
                    } else {
                        com.anythink.expressad.videocommon.a.a(str2, this.f20222g, false, this.i);
                    }
                } else if (this.f20223h.B()) {
                    com.anythink.expressad.videocommon.a.a(94, this.f20223h.ac(), this.f20222g);
                } else {
                    com.anythink.expressad.videocommon.a.a(str2, this.f20222g, false, this.i);
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(webView);
            this.f20225k = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().c(this.f20221f + "_" + this.f20224j + "_" + this.f20220e, false);
            a.C0142a c0142a = this.f20222g;
            if (c0142a != null) {
                c0142a.a(false);
            }
            if (this.f20219c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f20217a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.anythink.expressad.atsignalcommon.windvane.h.a();
                    com.anythink.core.express.d.a.a((WebView) this.f20219c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.getLocalizedMessage();
                    }
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            if (this.f20226l) {
                return;
            }
            if (this.f20219c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f20217a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.anythink.expressad.atsignalcommon.windvane.h.a();
                    com.anythink.core.express.d.a.a((WebView) this.f20219c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.getLocalizedMessage();
                    }
                }
            }
            String str = this.f20221f + "_" + this.f20223h.bh() + "_" + this.f20223h.aa() + "_" + this.f20220e;
            if (i == 1) {
                com.anythink.expressad.videocommon.b.l.a().c(this.f20221f + "_" + this.f20224j + "_" + this.f20220e, true);
                a.C0142a c0142a = this.f20222g;
                if (c0142a != null) {
                    c0142a.a(true);
                }
                if (this.f20218b) {
                    if (this.f20223h.B()) {
                        com.anythink.expressad.videocommon.a.a(str, this.f20222g, false, this.i);
                    } else {
                        com.anythink.expressad.videocommon.a.a(str, this.f20222g, false, this.i);
                    }
                } else if (this.f20223h.B()) {
                    com.anythink.expressad.videocommon.a.a(str, this.f20222g, false, this.i);
                } else {
                    com.anythink.expressad.videocommon.a.a(str, this.f20222g, false, this.i);
                }
            } else {
                com.anythink.expressad.videocommon.b.l.a().c(this.f20221f + "_" + this.f20224j + "_" + this.f20220e, false);
                a.C0142a c0142a2 = this.f20222g;
                if (c0142a2 != null) {
                    c0142a2.a(false);
                }
            }
            this.f20226l = true;
        }
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        private static final c f20227a = new c(0);

        private m() {
        }
    }

    public /* synthetic */ c(byte b9) {
        this();
    }

    private static String c(int i6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i6);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static int d(int i6) {
        return i6 != 200 ? i6 != 201 ? i6 != 203 ? i6 != 205 ? com.anythink.expressad.foundation.e.b.f19001x : com.anythink.expressad.foundation.e.b.f18984f : com.anythink.expressad.foundation.e.b.f18985g : com.anythink.expressad.foundation.e.b.f18986h : com.anythink.expressad.foundation.e.b.f18983e;
    }

    private static /* synthetic */ int e(int i6) {
        return i6 != 200 ? i6 != 201 ? i6 != 203 ? i6 != 205 ? com.anythink.expressad.foundation.e.b.f19001x : com.anythink.expressad.foundation.e.b.f18984f : com.anythink.expressad.foundation.e.b.f18985g : com.anythink.expressad.foundation.e.b.f18986h : com.anythink.expressad.foundation.e.b.f18983e;
    }

    private c() {
        this.f20092f = com.anythink.expressad.foundation.d.d.f18592q;
        this.f20093g = "down_type";
        this.f20094h = com.anythink.expressad.foundation.g.g.a.b.aw;
        this.f20095x = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f20074d = new HashMap();
        handlerThread.start();
        this.f20089b = new h(handlerThread.getLooper());
        this.f20090c = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String b(int i6) {
        synchronized (c.class) {
            if (i6 == 200) {
                return o.f8444a;
            }
            if (i6 == 201) {
                return "zip/html";
            }
            if (i6 == 203) {
                return "temp";
            }
            if (i6 != 205) {
                return com.anythink.core.common.v.m.f16809e;
            }
            return "tpl";
        }
    }

    public static c a() {
        return m.f20227a;
    }

    public final synchronized void a(final Context context, boolean z3, int i6, boolean z6, final int i9, final String str, final String str2, final String str3, final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, InterfaceC0126c interfaceC0126c, final i iVar) {
        String str4 = str2 + "_" + str3;
        f20074d.put(str4, new a(z3, z6, i6, copyOnWriteArrayList.size(), str2, str3, i9, copyOnWriteArrayList));
        this.f20089b.a(str2, str3, interfaceC0126c);
        this.f20089b.a(context);
        this.f20089b.a(str4, copyOnWriteArrayList);
        this.f20089b.post(new Runnable() { // from class: com.anythink.expressad.reward.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:131:0x0049 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x01bc A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String bm;
                com.anythink.expressad.foundation.d.d dVar;
                List<String> list;
                CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                    return;
                }
                try {
                    com.anythink.expressad.videocommon.b.l.a().a(copyOnWriteArrayList);
                    com.anythink.expressad.videocommon.b.e.a().a(str2, copyOnWriteArrayList, i9, new f(c.this.f20089b, str, str2, str3));
                    com.anythink.expressad.videocommon.b.e.a().d(str2);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.getLocalizedMessage();
                    }
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) it.next();
                    if (dVar2 != null) {
                        com.anythink.expressad.foundation.d.d.ab();
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 106;
                            Bundle bundle = new Bundle();
                            bundle.putString("unit_id", str2);
                            bundle.putString(com.anythink.expressad.a.f17642z, str);
                            bundle.putString("request_id", str3);
                            obtain.setData(bundle);
                            c.this.f20089b.sendMessage(obtain);
                        } catch (Exception unused) {
                        }
                        d.c N8 = dVar2.N();
                        if (N8 != null && !dVar2.j()) {
                            new HashMap();
                            String e10 = N8.e();
                            if (!TextUtils.isEmpty(e10) && !e10.contains(com.anythink.expressad.foundation.d.d.f18580d)) {
                                if (e10.contains(".zip")) {
                                    try {
                                        com.anythink.expressad.videocommon.b.i.a().b(e10, (i.a) new g(context, str, str2, str3, dVar2, 859, c.this.f20089b, iVar, copyOnWriteArrayList));
                                    } catch (Exception e11) {
                                        if (com.anythink.expressad.a.f17618a) {
                                            e11.getLocalizedMessage();
                                        }
                                    }
                                } else {
                                    try {
                                        com.anythink.expressad.videocommon.b.i.a().b(e10, new d(859, str, str2, str3, dVar2, iVar, c.this.f20089b, copyOnWriteArrayList));
                                    } catch (Exception e12) {
                                        if (com.anythink.expressad.a.f17618a) {
                                            e12.getLocalizedMessage();
                                        }
                                    }
                                }
                            }
                        }
                        String J = dVar2.J();
                        boolean j6 = dVar2.j();
                        boolean f3 = v.f(J);
                        if (!j6) {
                            c.a(c.this, context, str, str2, str3, dVar2, J, iVar, copyOnWriteArrayList);
                        } else if (f3) {
                            c.a(c.this, context, str, str2, str3, dVar2, J, iVar, copyOnWriteArrayList);
                        }
                        if (!TextUtils.isEmpty(dVar2.Q()) && !dVar2.j()) {
                            com.anythink.expressad.videocommon.b.i.a().a(dVar2.Q(), (i.a) null);
                        }
                        String bl = dVar2.bl();
                        if (!TextUtils.isEmpty(bl)) {
                            try {
                                com.anythink.expressad.foundation.g.d.b a9 = com.anythink.expressad.foundation.g.d.b.a(context);
                                try {
                                    e eVar = new e(c.this.f20089b, 0, str, str2, str3, dVar2);
                                    dVar2 = dVar2;
                                    a9.a(bl, eVar);
                                } catch (Exception e13) {
                                    e = e13;
                                    dVar2 = dVar2;
                                    if (com.anythink.expressad.a.f17618a) {
                                        e.getLocalizedMessage();
                                    }
                                    bm = dVar2.bm();
                                    if (!TextUtils.isEmpty(bm)) {
                                    }
                                    if (N8 != null) {
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                            }
                        }
                        bm = dVar2.bm();
                        if (!TextUtils.isEmpty(bm)) {
                            try {
                                dVar = dVar2;
                            } catch (Exception e15) {
                                e = e15;
                            }
                            try {
                                dVar2 = dVar;
                                com.anythink.expressad.foundation.g.d.b.a(context).a(bm, new e(c.this.f20089b, 0, str, str2, str3, dVar));
                            } catch (Exception e16) {
                                e = e16;
                                dVar2 = dVar;
                                if (com.anythink.expressad.a.f17618a) {
                                    e.getLocalizedMessage();
                                }
                                if (N8 != null) {
                                }
                            }
                        }
                        if (N8 != null) {
                            String d2 = N8.d();
                            if (!TextUtils.isEmpty(d2) && !dVar2.j()) {
                                if (dVar2.aD() != null) {
                                    dVar2.aD();
                                }
                                if (d2.contains(".zip")) {
                                    try {
                                        com.anythink.expressad.videocommon.b.i.a().b(d2, (i.a) new g(context, str, str2, str3, dVar2, 313, c.this.f20089b, iVar, copyOnWriteArrayList));
                                    } catch (Exception e17) {
                                        if (com.anythink.expressad.a.f17618a) {
                                            e17.getLocalizedMessage();
                                        }
                                    }
                                } else {
                                    try {
                                        com.anythink.expressad.videocommon.b.i.a().b(d2, new d(313, str, str2, str3, dVar2, iVar, c.this.f20089b, copyOnWriteArrayList));
                                    } catch (Exception e18) {
                                        if (com.anythink.expressad.a.f17618a) {
                                            e18.getLocalizedMessage();
                                        }
                                    }
                                }
                            }
                            List<d.c.a> f9 = N8.f();
                            if (f9 != null && f9.size() > 0) {
                                for (d.c.a aVar : f9) {
                                    if (aVar != null && (list = aVar.f18643b) != null && list.size() > 0) {
                                        for (String str5 : aVar.f18643b) {
                                            if (!TextUtils.isEmpty(str5)) {
                                                try {
                                                    com.anythink.expressad.foundation.d.d dVar3 = dVar2;
                                                    try {
                                                        dVar2 = dVar3;
                                                        com.anythink.expressad.foundation.g.d.b.a(context).a(str5, new e(c.this.f20089b, 1, str, str2, str3, dVar3));
                                                    } catch (Exception e19) {
                                                        e = e19;
                                                        dVar2 = dVar3;
                                                        if (com.anythink.expressad.a.f17618a) {
                                                            e.getLocalizedMessage();
                                                        }
                                                    }
                                                } catch (Exception e20) {
                                                    e = e20;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    private synchronized void c() {
    }

    public static final class e implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20156a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20157b = 1;

        /* renamed from: c, reason: collision with root package name */
        private Handler f20158c;

        /* renamed from: d, reason: collision with root package name */
        private int f20159d;

        /* renamed from: e, reason: collision with root package name */
        private String f20160e;

        /* renamed from: f, reason: collision with root package name */
        private String f20161f;

        /* renamed from: g, reason: collision with root package name */
        private String f20162g;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20163h;

        public e(Handler handler, int i, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar) {
            this.f20158c = handler;
            this.f20159d = i;
            this.f20161f = str;
            this.f20160e = str2;
            this.f20162g = str3;
            this.f20163h = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            com.anythink.expressad.videocommon.b.l.a();
            com.anythink.expressad.videocommon.b.l.c(str);
            Message obtain = Message.obtain();
            obtain.what = this.f20159d == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f20160e);
            bundle.putString(com.anythink.expressad.a.f17642z, this.f20161f);
            bundle.putString("request_id", this.f20162g);
            obtain.setData(bundle);
            this.f20158c.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.f20159d == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f20160e);
            bundle.putString(com.anythink.expressad.a.f17642z, this.f20161f);
            bundle.putString("request_id", this.f20162g);
            obtain.setData(bundle);
            this.f20158c.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.anythink.expressad.foundation.e.c b(int i6, String str, Throwable th, com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i6);
        cVar.a(th);
        cVar.a(str);
        cVar.a(dVar);
        return cVar;
    }

    public static final class f implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        private Handler f20164a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20165b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20166c;

        /* renamed from: d, reason: collision with root package name */
        private final String f20167d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f20164a = handler;
            this.f20166c = str;
            this.f20165b = str2;
            this.f20167d = str3;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            com.anythink.expressad.videocommon.b.l.a().a(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f20165b);
            bundle.putString(com.anythink.expressad.a.f17642z, this.f20166c);
            bundle.putString("request_id", this.f20167d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f20164a.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().a(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f20165b);
            bundle.putString(com.anythink.expressad.a.f17642z, this.f20166c);
            bundle.putString("request_id", this.f20167d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f20164a.sendMessage(obtain);
        }
    }

    private void a(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, String str4, i iVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || dVar.I()) {
            return;
        }
        if (str4.contains(".zip") && str4.contains(n.f22318b)) {
            boolean isEmpty = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().b(str4));
            try {
                g gVar = new g(context, str, str2, str3, dVar, 497, this.f20089b, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                com.anythink.expressad.videocommon.b.i.a().b(str4, (i.a) gVar);
                return;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.getLocalizedMessage();
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.j.a().c(str4));
        try {
            d dVar2 = new d(497, str, str2, str3, dVar, iVar, this.f20089b, copyOnWriteArrayList);
            dVar2.a(isEmpty2);
            com.anythink.expressad.videocommon.b.i.a().b(str4, dVar2);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f17618a) {
                e10.getLocalizedMessage();
            }
        }
    }

    public final synchronized void a(Context context, com.anythink.expressad.foundation.d.d dVar, final String str, final String str2, final String str3, final i iVar) {
        Throwable th;
        try {
            try {
                this.f20089b.a(context);
                if (dVar != null) {
                    try {
                        String at = dVar.at();
                        if (dVar.j()) {
                            com.anythink.expressad.videocommon.b.l.a().b(at, true);
                            Message obtain = Message.obtain();
                            obtain.what = 105;
                            Bundle bundle = new Bundle();
                            bundle.putString("unit_id", str2);
                            bundle.putString(com.anythink.expressad.a.f17642z, str);
                            bundle.putString("request_id", str3);
                            bundle.putString("url", at);
                            obtain.setData(bundle);
                            this.f20089b.sendMessage(obtain);
                            iVar.a(str, str2, str3);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (dVar != null && !TextUtils.isEmpty(dVar.at())) {
                    try {
                    } catch (Exception e9) {
                        e = e9;
                    }
                    try {
                        com.anythink.expressad.videocommon.b.i.a().b(dVar.at(), (i.a) new i.d() { // from class: com.anythink.expressad.reward.a.c.2
                            @Override // com.anythink.expressad.videocommon.b.i.a
                            public final void a(String str4) {
                                try {
                                    com.anythink.expressad.videocommon.b.l.a().b(str4, true);
                                    Message obtain2 = Message.obtain();
                                    obtain2.what = 105;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("unit_id", str2);
                                    bundle2.putString(com.anythink.expressad.a.f17642z, str);
                                    bundle2.putString("request_id", str3);
                                    bundle2.putString("url", str4);
                                    obtain2.setData(bundle2);
                                    c.this.f20089b.sendMessage(obtain2);
                                    i iVar2 = iVar;
                                    if (iVar2 != null) {
                                        iVar2.a(str, str2, str3);
                                    }
                                } catch (Exception e10) {
                                    com.anythink.expressad.videocommon.b.l.a().b(str4, false);
                                    Message obtain3 = Message.obtain();
                                    obtain3.what = 205;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("unit_id", str2);
                                    bundle3.putString(com.anythink.expressad.a.f17642z, str);
                                    bundle3.putString("request_id", str3);
                                    bundle3.putString("url", str4);
                                    obtain3.setData(bundle3);
                                    c.this.f20089b.sendMessage(obtain3);
                                    i iVar3 = iVar;
                                    if (iVar3 != null) {
                                        iVar3.a(c.b(com.anythink.expressad.foundation.e.b.f18984f, "", e10, null));
                                    }
                                }
                            }

                            @Override // com.anythink.expressad.videocommon.b.i.a
                            public final void a(String str4, String str5) {
                                try {
                                    com.anythink.expressad.videocommon.b.l.a().b(str5, false);
                                    Message obtain2 = Message.obtain();
                                    obtain2.what = 205;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("unit_id", str2);
                                    bundle2.putString(com.anythink.expressad.a.f17642z, str);
                                    bundle2.putString("request_id", str3);
                                    bundle2.putString("url", str5);
                                    bundle2.putString("message", str4);
                                    obtain2.setData(bundle2);
                                    c.this.f20089b.sendMessage(obtain2);
                                    i iVar2 = iVar;
                                    if (iVar2 != null) {
                                        try {
                                            iVar2.a(c.b(com.anythink.expressad.foundation.e.b.f18984f, "", null, null));
                                        } catch (Exception e10) {
                                            e10.getMessage();
                                        }
                                    }
                                } catch (Exception e11) {
                                    com.anythink.expressad.videocommon.b.l.a().b(str5, false);
                                    Message obtain3 = Message.obtain();
                                    obtain3.what = 105;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("unit_id", str2);
                                    bundle3.putString(com.anythink.expressad.a.f17642z, str);
                                    bundle3.putString("request_id", str3);
                                    bundle3.putString("url", str5);
                                    bundle3.putString("message", e11.getMessage());
                                    obtain3.setData(bundle3);
                                    c.this.f20089b.sendMessage(obtain3);
                                    i iVar3 = iVar;
                                    if (iVar3 != null) {
                                        try {
                                            iVar3.a(c.b(com.anythink.expressad.foundation.e.b.f18984f, "", e11, null));
                                        } catch (Exception e12) {
                                            e12.getMessage();
                                        }
                                    }
                                    if (com.anythink.expressad.a.f17618a) {
                                        e11.getLocalizedMessage();
                                    }
                                }
                            }
                        });
                    } catch (Exception e10) {
                        e = e10;
                        Exception exc = e;
                        if (com.anythink.expressad.a.f17618a) {
                            exc.getLocalizedMessage();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void a(boolean z3, Handler handler, boolean z6, boolean z9, WindVaneWebView windVaneWebView, String str, int i6, com.anythink.expressad.foundation.d.d dVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, String str2, String str3, String str4, String str5, com.anythink.expressad.videocommon.e.d dVar2, j jVar) {
        com.anythink.expressad.video.signal.a.j jVar2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (v.e(str)) {
                jVar.a();
                return;
            }
            new HashMap().put("type", "2");
            a.C0142a c0142a = new a.C0142a();
            try {
                WindVaneWebView windVaneWebView2 = new WindVaneWebView(t.b().g());
                if (dVar != null) {
                    windVaneWebView2.setLocalRequestId(com.anythink.expressad.foundation.d.d.ab());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                c0142a.a(windVaneWebView2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar, copyOnWriteArrayList);
                } else {
                    jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar);
                }
                com.anythink.expressad.video.signal.a.j jVar3 = jVar2;
                jVar3.a(i6);
                jVar3.a(str4);
                jVar3.a(dVar2);
                jVar3.b(z3);
                windVaneWebView2.setWebViewListener(new k(handler, null, z6, z9, str5, jVar, windVaneWebView, str, str3, str4, c0142a, dVar, copyOnWriteArrayList, currentTimeMillis));
                windVaneWebView2.setObject(jVar3);
                windVaneWebView2.loadUrl(str2);
                windVaneWebView2.setRid(str5);
            } catch (Exception unused) {
                c0142a.a(true);
                com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str5 + "_" + str, true);
                jVar.a();
            } catch (Throwable unused2) {
                c0142a.a(true);
                com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str5 + "_" + str, true);
                jVar.a();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getLocalizedMessage();
            }
            jVar.a(b(com.anythink.expressad.foundation.e.b.f18987j, "", e9, dVar));
        }
    }

    public final synchronized void a(boolean z3, Handler handler, boolean z6, boolean z9, String str, String str2, String str3, String str4, int i6, com.anythink.expressad.foundation.d.d dVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, String str5, String str6, com.anythink.expressad.videocommon.e.d dVar2, j jVar) {
        com.anythink.expressad.video.signal.a.j jVar2;
        this.f20091e = false;
        long currentTimeMillis = System.currentTimeMillis();
        this.f20091e = false;
        if (v.e(str4)) {
            jVar.a();
            return;
        }
        try {
            a.C0142a c0142a = new a.C0142a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(t.b().g());
            if (dVar != null) {
                windVaneWebView.setLocalRequestId(com.anythink.expressad.foundation.d.d.ab());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c0142a.a(windVaneWebView);
            com.anythink.expressad.video.bt.a.c.a();
            String b9 = com.anythink.expressad.video.bt.a.c.b();
            com.anythink.expressad.video.bt.a.c.a();
            String b10 = com.anythink.expressad.video.bt.a.c.b();
            c0142a.a(b10);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a9 != null && a9.size() > 0) {
                    for (int i9 = 0; i9 < copyOnWriteArrayList.size(); i9++) {
                        com.anythink.expressad.foundation.d.d dVar3 = copyOnWriteArrayList.get(i9);
                        for (com.anythink.expressad.foundation.d.d dVar4 : a9) {
                            if (dVar4.bh().equals(dVar3.bh()) && dVar4.aa().equals(dVar3.aa())) {
                                dVar3.aw();
                                copyOnWriteArrayList.set(i9, dVar3);
                            }
                        }
                    }
                }
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar, copyOnWriteArrayList);
            } else {
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar);
            }
            jVar2.a(i6);
            jVar2.a(str6);
            jVar2.c(b10);
            jVar2.d(b9);
            jVar2.p();
            jVar2.a(dVar2);
            jVar2.b(z3);
            windVaneWebView.setWebViewListener(new b(z3, handler, null, z6, z9, i6, str4, str2, str3, str, c0142a, dVar, copyOnWriteArrayList, dVar2, jVar, currentTimeMillis));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str5);
            windVaneWebView.setRid(str);
            AnythinkBTRootLayout anythinkBTRootLayout = new AnythinkBTRootLayout(t.b().g());
            anythinkBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTRootLayout.setInstanceId(b9);
            anythinkBTRootLayout.setUnitId(str3);
            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(t.b().g());
            anythinkBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTLayout.setInstanceId(b10);
            anythinkBTLayout.setUnitId(str3);
            anythinkBTLayout.setWebView(windVaneWebView);
            LinkedHashMap<String, View> b11 = com.anythink.expressad.video.bt.a.c.a().b(str3, str);
            b11.put(b10, anythinkBTLayout);
            b11.put(b9, anythinkBTRootLayout);
            anythinkBTRootLayout.addView(anythinkBTLayout, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e9) {
            jVar.a(b(com.anythink.expressad.foundation.e.b.i, "", e9, dVar));
            if (com.anythink.expressad.a.f17618a) {
                e9.getLocalizedMessage();
            }
        }
    }

    private void a(boolean z3, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.d dVar, List<com.anythink.expressad.foundation.d.d> list, com.anythink.expressad.videocommon.e.d dVar2, String str, String str2, int i6) {
        if (windVaneWebView != null) {
            if (dVar != null && dVar2 != null && dVar.N() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(dVar.N().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e9) {
                        if (com.anythink.expressad.a.f17618a) {
                            e9.getLocalizedMessage();
                            return;
                        }
                        return;
                    }
                }
                if (TextUtils.isEmpty(dVar.N().e()) || !dVar.N().e().contains(com.anythink.expressad.foundation.d.d.f18580d)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass3(z3, windVaneWebView, dVar, list, str, dVar2, str2), i6 * 1000);
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.getLocalizedMessage();
                }
            }
        }
    }

    private static void a(boolean z3, WindVaneWebView windVaneWebView, String str, int i6, com.anythink.expressad.foundation.d.d dVar, List<com.anythink.expressad.foundation.d.d> list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar2, String str4, boolean z6) {
        com.anythink.expressad.video.signal.a.j jVar;
        String str5;
        try {
            a.C0142a c0142a = new a.C0142a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(t.b().g());
            if (dVar != null) {
                windVaneWebView2.setLocalRequestId(com.anythink.expressad.foundation.d.d.ab());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0142a.a(windVaneWebView2);
            String str6 = "";
            if (list != null && list.size() > 0) {
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a9 != null && a9.size() > 0) {
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        com.anythink.expressad.foundation.d.d dVar3 = list.get(i9);
                        for (com.anythink.expressad.foundation.d.d dVar4 : a9) {
                            if (dVar4.bh().equals(dVar3.bh()) && dVar4.aa().equals(dVar3.aa())) {
                                dVar3.aw();
                                list.set(i9, dVar3);
                            }
                        }
                    }
                }
                com.anythink.expressad.video.signal.a.j jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar, list);
                str5 = list.get(0).aa();
                jVar = jVar2;
            } else {
                com.anythink.expressad.video.signal.a.j jVar3 = new com.anythink.expressad.video.signal.a.j(null, dVar);
                if (dVar != null) {
                    str6 = dVar.aa();
                }
                jVar = jVar3;
                str5 = str6;
            }
            jVar.a(i6);
            jVar.a(str3);
            jVar.c(str4);
            jVar.a(dVar2);
            jVar.b(z3);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, c0142a, dVar, z6, str5));
            windVaneWebView2.setObject(jVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getLocalizedMessage();
            }
        }
    }

    private static int a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return 0;
        }
        try {
            if (dVar.aD() != null) {
                return dVar.aD().f18531a;
            }
            return 0;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || dVar.I()) {
            return;
        }
        if (str4.contains(".zip") && str4.contains(n.f22318b)) {
            boolean isEmpty = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().b(str4));
            try {
                g gVar = new g(context, str, str2, str3, dVar, 497, cVar.f20089b, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                com.anythink.expressad.videocommon.b.i.a().b(str4, (i.a) gVar);
                return;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.getLocalizedMessage();
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.j.a().c(str4));
        try {
            d dVar2 = new d(497, str, str2, str3, dVar, iVar, cVar.f20089b, copyOnWriteArrayList);
            dVar2.a(isEmpty2);
            com.anythink.expressad.videocommon.b.i.a().b(str4, dVar2);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f17618a) {
                e10.getLocalizedMessage();
            }
        }
    }

    private static /* synthetic */ void a(c cVar, boolean z3, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.d dVar, List list, com.anythink.expressad.videocommon.e.d dVar2, String str, String str2, int i6) {
        if (windVaneWebView != null) {
            if (dVar != null && dVar2 != null && dVar.N() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(dVar.N().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e9) {
                        if (com.anythink.expressad.a.f17618a) {
                            e9.getLocalizedMessage();
                            return;
                        }
                        return;
                    }
                }
                if (TextUtils.isEmpty(dVar.N().e()) || !dVar.N().e().contains(com.anythink.expressad.foundation.d.d.f18580d)) {
                    new Handler(Looper.getMainLooper()).postDelayed(cVar.new AnonymousClass3(z3, windVaneWebView, dVar, list, str, dVar2, str2), i6 * 1000);
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.getLocalizedMessage();
                }
            }
        }
    }

    private static /* synthetic */ void a(boolean z3, WindVaneWebView windVaneWebView, String str, com.anythink.expressad.foundation.d.d dVar, List list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar2, String str4, boolean z6) {
        com.anythink.expressad.video.signal.a.j jVar;
        String str5;
        try {
            a.C0142a c0142a = new a.C0142a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(t.b().g());
            if (dVar != null) {
                windVaneWebView2.setLocalRequestId(com.anythink.expressad.foundation.d.d.ab());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0142a.a(windVaneWebView2);
            String str6 = "";
            if (list != null && list.size() > 0) {
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a9 != null && a9.size() > 0) {
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) list.get(i6);
                        for (com.anythink.expressad.foundation.d.d dVar4 : a9) {
                            if (dVar4.bh().equals(dVar3.bh()) && dVar4.aa().equals(dVar3.aa())) {
                                dVar3.aw();
                                list.set(i6, dVar3);
                            }
                        }
                    }
                }
                com.anythink.expressad.video.signal.a.j jVar2 = new com.anythink.expressad.video.signal.a.j(null, dVar, list);
                str5 = ((com.anythink.expressad.foundation.d.d) list.get(0)).aa();
                jVar = jVar2;
            } else {
                com.anythink.expressad.video.signal.a.j jVar3 = new com.anythink.expressad.video.signal.a.j(null, dVar);
                if (dVar != null) {
                    str6 = dVar.aa();
                }
                jVar = jVar3;
                str5 = str6;
            }
            jVar.a(0);
            jVar.a(str3);
            jVar.c(str4);
            jVar.a(dVar2);
            jVar.b(z3);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, c0142a, dVar, z6, str5));
            windVaneWebView2.setObject(jVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getLocalizedMessage();
            }
        }
    }
}
