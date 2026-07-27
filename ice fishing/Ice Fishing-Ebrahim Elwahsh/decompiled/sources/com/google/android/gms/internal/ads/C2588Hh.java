package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p2.C4856a;
import q2.InterfaceC4877a;
import s2.C4997e;
import s2.InterfaceC4995c;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2588Hh extends WebViewClient implements InterfaceC4877a, InterfaceC2524Dl {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f25380o0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC2656Lh f25381A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC2769Sb f25382B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2786Tb f25383C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2524Dl f25384D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f25385E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25386F;

    /* renamed from: G, reason: collision with root package name */
    public int f25387G;

    /* renamed from: H, reason: collision with root package name */
    public String f25388H;

    /* renamed from: I, reason: collision with root package name */
    public String f25389I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f25390K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f25391L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f25392M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC4995c f25393N;

    /* renamed from: O, reason: collision with root package name */
    public C2890Zd f25394O;

    /* renamed from: P, reason: collision with root package name */
    public C4856a f25395P;

    /* renamed from: Q, reason: collision with root package name */
    public C2839Wd f25396Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC4180xf f25397R;

    /* renamed from: S, reason: collision with root package name */
    public C3165eo f25398S;

    /* renamed from: T, reason: collision with root package name */
    public C3270gk f25399T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f25400U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f25401V;

    /* renamed from: W, reason: collision with root package name */
    public int f25402W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f25403X;
    public final HashSet Y;

    /* renamed from: Z, reason: collision with root package name */
    public final BinderC2949aq f25404Z;

    /* renamed from: n, reason: collision with root package name */
    public final C2486Bh f25405n;

    /* renamed from: n0, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC3912sh f25406n0;

    /* renamed from: u, reason: collision with root package name */
    public final C2914a9 f25407u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f25408v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25409w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4877a f25410x;

    /* renamed from: y, reason: collision with root package name */
    public s2.l f25411y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2639Kh f25412z;

    public C2588Hh(C2486Bh c2486Bh, C2914a9 c2914a9, boolean z8, BinderC2949aq binderC2949aq) {
        C2890Zd c2890Zd = new C2890Zd(c2486Bh, c2486Bh.g0(), new C3042ca(c2486Bh.getContext()));
        this.f25408v = new HashMap();
        this.f25409w = new Object();
        this.f25387G = 0;
        this.f25388H = "";
        this.f25389I = "";
        this.f25407u = c2914a9;
        this.f25405n = c2486Bh;
        this.J = z8;
        this.f25394O = c2890Zd;
        this.f25396Q = null;
        this.Y = new HashSet(Arrays.asList(((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31431E6)).split(",")));
        this.f25404Z = binderC2949aq;
    }

    public static WebResourceResponse q() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31771r1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean v(C2486Bh c2486Bh) {
        Ut ut = c2486Bh.f24059n.f24465C;
        return ut != null && ut.b();
    }

    public static final boolean x(boolean z8, C2486Bh c2486Bh) {
        return (!z8 || c2486Bh.f24059n.e0().b() || c2486Bh.f24059n.P().equals("interstitial_mb")) ? false : true;
    }

    public final boolean A() {
        boolean z8;
        synchronized (this.f25409w) {
            z8 = this.f25390K;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        InterfaceC2524Dl interfaceC2524Dl = this.f25384D;
        if (interfaceC2524Dl != null) {
            interfaceC2524Dl.C();
        }
    }

    public final void D() {
        InterfaceC4180xf interfaceC4180xf = this.f25397R;
        if (interfaceC4180xf != null) {
            C2486Bh c2486Bh = this.f25405n;
            ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
            WeakHashMap weakHashMap = O.X.f2240a;
            if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.isAttachedToWindow()) {
                o(viewTreeObserverOnGlobalLayoutListenerC2520Dh, interfaceC4180xf, 10);
                return;
            }
            ViewOnAttachStateChangeListenerC3912sh viewOnAttachStateChangeListenerC3912sh = this.f25406n0;
            if (viewOnAttachStateChangeListenerC3912sh != null) {
                c2486Bh.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3912sh);
            }
            ViewOnAttachStateChangeListenerC3912sh viewOnAttachStateChangeListenerC3912sh2 = new ViewOnAttachStateChangeListenerC3912sh(this, interfaceC4180xf);
            this.f25406n0 = viewOnAttachStateChangeListenerC3912sh2;
            c2486Bh.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3912sh2);
        }
    }

    public final void E() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh;
        C2881Yl c2881Yl;
        InterfaceC2639Kh interfaceC2639Kh = this.f25412z;
        C2486Bh c2486Bh = this.f25405n;
        if (interfaceC2639Kh != null && ((this.f25400U && this.f25402W <= 0) || this.f25401V || this.f25386F)) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() && (c2881Yl = (viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n).f24499u0) != null) {
                AbstractC2655Lg.j((C3636na) c2881Yl.f28863v, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24496s0, "awfllc");
            }
            InterfaceC2639Kh interfaceC2639Kh2 = this.f25412z;
            boolean z8 = false;
            if (!this.f25401V && !this.f25386F) {
                z8 = true;
            }
            interfaceC2639Kh2.k(this.f25388H, this.f25387G, this.f25389I, z8);
            this.f25412z = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh2 = c2486Bh.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh2.f24497t0 == null) {
            C2881Yl c2881Yl2 = viewTreeObserverOnGlobalLayoutListenerC2520Dh2.f24499u0;
            c2881Yl2.getClass();
            C3528la d2 = C3636na.d();
            viewTreeObserverOnGlobalLayoutListenerC2520Dh2.f24497t0 = d2;
            ((HashMap) c2881Yl2.f28862u).put("native:view_load", d2);
        }
    }

    public final void F(C4997e c4997e, boolean z8, boolean z9, String str) {
        boolean z10;
        C2486Bh c2486Bh = this.f25405n;
        boolean G02 = c2486Bh.f24059n.G0();
        boolean z11 = false;
        boolean z12 = x(G02, c2486Bh) || z9;
        if (z12 || !z8) {
            z10 = G02;
            z11 = true;
        } else {
            z10 = G02;
        }
        a(new AdOverlayInfoParcel(c4997e, z12 ? null : this.f25410x, z10 ? null : this.f25411y, this.f25393N, c2486Bh.f24059n.f24504x, c2486Bh, z11 ? null : this.f25384D, str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
        InterfaceC2524Dl interfaceC2524Dl = this.f25384D;
        if (interfaceC2524Dl != null) {
            interfaceC2524Dl.L();
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        C4997e c4997e;
        C2839Wd c2839Wd = this.f25396Q;
        if (c2839Wd != null) {
            synchronized (c2839Wd.f28404E) {
                r1 = c2839Wd.f28410L != null;
            }
        }
        L2.i iVar = p2.j.f39798C.f39802b;
        L2.i.y(this.f25405n.getContext(), adOverlayInfoParcel, !r1, this.f25398S);
        InterfaceC4180xf interfaceC4180xf = this.f25397R;
        if (interfaceC4180xf != null) {
            String str = adOverlayInfoParcel.f23719E;
            if (str == null && (c4997e = adOverlayInfoParcel.f23731n) != null) {
                str = c4997e.f40466u;
            }
            ((C4072vf) interfaceC4180xf).a(str);
        }
    }

    public final void b(String str, InterfaceC2990bc interfaceC2990bc) {
        synchronized (this.f25409w) {
            try {
                HashMap hashMap = this.f25408v;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(interfaceC2990bc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f25409w) {
            try {
                List list = (List) this.f25408v.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        InterfaceC4180xf interfaceC4180xf = this.f25397R;
        if (interfaceC4180xf != null) {
            C4072vf c4072vf = (C4072vf) interfaceC4180xf;
            synchronized (c4072vf.f34827h) {
                c4072vf.f34821b.keySet();
                OD c4 = C3686oN.c(Collections.EMPTY_MAP);
                C3907sc c3907sc = new C3907sc(1, c4072vf);
                C3157eg c3157eg = AbstractC3212fg.f30745h;
                C3945tD y6 = C3686oN.y(c4, c3907sc, c3157eg);
                J3.a w9 = C3686oN.w(y6, 10L, TimeUnit.SECONDS, AbstractC3212fg.f30741d);
                y6.c(new MD(0, y6, new C3562m7(c4072vf, w9)), c3157eg);
                C4072vf.f34819l.add(w9);
            }
            this.f25397R = null;
        }
        ViewOnAttachStateChangeListenerC3912sh viewOnAttachStateChangeListenerC3912sh = this.f25406n0;
        if (viewOnAttachStateChangeListenerC3912sh != null) {
            this.f25405n.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3912sh);
        }
        synchronized (this.f25409w) {
            try {
                this.f25408v.clear();
                this.f25410x = null;
                this.f25411y = null;
                this.f25412z = null;
                this.f25381A = null;
                this.f25382B = null;
                this.f25383C = null;
                this.f25385E = false;
                this.J = false;
                this.f25390K = false;
                this.f25391L = false;
                this.f25393N = null;
                this.f25395P = null;
                this.f25394O = null;
                C2839Wd c2839Wd = this.f25396Q;
                if (c2839Wd != null) {
                    c2839Wd.x(true);
                    this.f25396Q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029e A[Catch: NoClassDefFoundError -> 0x001c, Exception -> 0x001f, TryCatch #14 {Exception -> 0x001f, NoClassDefFoundError -> 0x001c, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0022, B:8:0x0032, B:11:0x0039, B:13:0x0045, B:15:0x0061, B:17:0x007d, B:19:0x0094, B:20:0x0097, B:21:0x009e, B:24:0x00b8, B:27:0x00c2, B:29:0x00d0, B:31:0x00e7, B:81:0x022c, B:53:0x0200, B:56:0x02f6, B:59:0x030a, B:61:0x0310, B:63:0x031e, B:70:0x0264, B:71:0x029d, B:52:0x01cb, B:86:0x0148, B:104:0x00dc, B:105:0x029e, B:107:0x02a8, B:109:0x02ae, B:112:0x02b1, B:113:0x02b2, B:114:0x02cf, B:117:0x02d2, B:118:0x02d3, B:120:0x02e1, B:125:0x02ee, B:129:0x02f1, B:116:0x02d0, B:111:0x02af), top: B:2:0x000c, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: NoClassDefFoundError -> 0x001c, Exception -> 0x001f, TRY_ENTER, TryCatch #14 {Exception -> 0x001f, NoClassDefFoundError -> 0x001c, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0022, B:8:0x0032, B:11:0x0039, B:13:0x0045, B:15:0x0061, B:17:0x007d, B:19:0x0094, B:20:0x0097, B:21:0x009e, B:24:0x00b8, B:27:0x00c2, B:29:0x00d0, B:31:0x00e7, B:81:0x022c, B:53:0x0200, B:56:0x02f6, B:59:0x030a, B:61:0x0310, B:63:0x031e, B:70:0x0264, B:71:0x029d, B:52:0x01cb, B:86:0x0148, B:104:0x00dc, B:105:0x029e, B:107:0x02a8, B:109:0x02ae, B:112:0x02b1, B:113:0x02b2, B:114:0x02cf, B:117:0x02d2, B:118:0x02d3, B:120:0x02e1, B:125:0x02ee, B:129:0x02f1, B:116:0x02d0, B:111:0x02af), top: B:2:0x000c, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f6 A[Catch: NoClassDefFoundError -> 0x001c, Exception -> 0x001f, TryCatch #14 {Exception -> 0x001f, NoClassDefFoundError -> 0x001c, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0022, B:8:0x0032, B:11:0x0039, B:13:0x0045, B:15:0x0061, B:17:0x007d, B:19:0x0094, B:20:0x0097, B:21:0x009e, B:24:0x00b8, B:27:0x00c2, B:29:0x00d0, B:31:0x00e7, B:81:0x022c, B:53:0x0200, B:56:0x02f6, B:59:0x030a, B:61:0x0310, B:63:0x031e, B:70:0x0264, B:71:0x029d, B:52:0x01cb, B:86:0x0148, B:104:0x00dc, B:105:0x029e, B:107:0x02a8, B:109:0x02ae, B:112:0x02b1, B:113:0x02b2, B:114:0x02cf, B:117:0x02d2, B:118:0x02d3, B:120:0x02e1, B:125:0x02ee, B:129:0x02f1, B:116:0x02d0, B:111:0x02af), top: B:2:0x000c, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e A[Catch: all -> 0x0227, TryCatch #4 {all -> 0x0227, blocks: (B:76:0x020c, B:78:0x021e, B:80:0x0229), top: B:75:0x020c }] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.X8, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse e(String str, Map map) {
        WebResourceResponse webResourceResponse;
        WebResourceResponse webResourceResponse2;
        int i;
        C3151ea c3151ea;
        q2.r rVar;
        ?? r17;
        boolean z8;
        long j9;
        Closeable closeable;
        Throwable th;
        final boolean z9;
        WebResourceResponse webResourceResponse3;
        boolean z10;
        String sb;
        try {
            HashMap hashMap = new HashMap();
            C2486Bh c2486Bh = this.f25405n;
            Ut ut = c2486Bh.f24059n.f24465C;
            if (ut != null) {
                hashMap = ut.f28182w0;
            }
            String g9 = AbstractC3035cL.g(str, c2486Bh.getContext(), this.f25403X, hashMap);
            if (!g9.equals(str)) {
                return t(g9, map);
            }
            U8 a9 = U8.a(Uri.parse(str));
            if (a9 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    webResourceResponse2 = null;
                    List r9 = com.bumptech.glide.manager.o.d(new TA('-')).r(parse.getQueryParameter("range"));
                    if (r9.size() == 2) {
                        int parseInt = Integer.parseInt((String) r9.get(0));
                        int parseInt2 = Integer.parseInt((String) r9.get(1)) + 1;
                        if (parseInt > 0) {
                            a9.f27931A = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        c3151ea = AbstractC3368ia.f31702j5;
                        rVar = q2.r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                            R8 j10 = p2.j.f39798C.f39809j.j(a9);
                            if (j10 == null || !j10.a()) {
                                r17 = webResourceResponse2;
                            } else {
                                synchronized (j10) {
                                    z8 = j10.f27314u;
                                }
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z8));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(j10.d()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(j10.c()));
                                synchronized (j10) {
                                    j9 = j10.f27316w;
                                }
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(j9));
                                ParcelFileDescriptor.AutoCloseInputStream b9 = j10.b();
                                closeable = b9;
                                if (i != -1) {
                                    int i4 = JC.f25748a;
                                    r17 = new C3506l5(b9, i);
                                }
                                r17 = closeable;
                            }
                            if (r17 != 0) {
                            }
                        } else {
                            String p6 = c2486Bh.f24059n.p();
                            if (p6 == null) {
                                p6 = "";
                            }
                            a9.f27932B = p6;
                            a9.f27933C = c2486Bh.f24059n.r();
                            long longValue = (a9.f27940z ? (Long) rVar.f40119c.a(AbstractC3368ia.f31721l5) : (Long) rVar.f40119c.a(AbstractC3368ia.f31712k5)).longValue();
                            p2.j jVar = p2.j.f39798C;
                            jVar.f39810k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            W8 o9 = T2.o(c2486Bh.getContext(), a9);
                            try {
                                Y8 y8 = (Y8) o9.f31242n.get(longValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(y8.f28806b));
                                        hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(y8.f28807c));
                                        hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(y8.f28809e));
                                        hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(y8.f28808d));
                                        ?? r42 = y8.f28805a;
                                        Closeable closeable2 = r42;
                                        if (i != -1) {
                                            long j11 = i;
                                            try {
                                                int i9 = JC.f25748a;
                                                closeable2 = new C3506l5(r42, j11);
                                            } catch (InterruptedException e6) {
                                                e = e6;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                try {
                                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                                        p2.j.f39798C.f39808h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o9.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    p2.j.f39798C.f39810k.getClass();
                                                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i10 = 1;
                                                    final boolean z11 = z10;
                                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2588Hh f34638u;

                                                        {
                                                            this.f34638u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i10) {
                                                                case 0:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                                case 1:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                                default:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    t2.C.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z9 = z10;
                                                    th = th;
                                                    p2.j.f39798C.f39810k.getClass();
                                                    final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i11 = 2;
                                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2588Hh f34638u;

                                                        {
                                                            this.f34638u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i11) {
                                                                case 0:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                                case 1:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                                default:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    t2.C.k(sb3.toString());
                                                    throw th;
                                                }
                                            } catch (ExecutionException e9) {
                                                e = e9;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                try {
                                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                                        p2.j.f39798C.f39808h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o9.cancel(true);
                                                    p2.j.f39798C.f39810k.getClass();
                                                    final long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i12 = 0;
                                                    final boolean z12 = z10;
                                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2588Hh f34638u;

                                                        {
                                                            this.f34638u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i12) {
                                                                case 0:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                                case 1:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                                default:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                                    sb4.append("Cache connection took ");
                                                    sb4.append(elapsedRealtime4);
                                                    sb4.append("ms");
                                                    sb = sb4.toString();
                                                    t2.C.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z9 = z10;
                                                    th = th;
                                                    p2.j.f39798C.f39810k.getClass();
                                                    final long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i112 = 2;
                                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2588Hh f34638u;

                                                        {
                                                            this.f34638u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i112) {
                                                                case 0:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                                case 1:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                                default:
                                                                    this.f34638u.f25405n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    t2.C.k(sb32.toString());
                                                    throw th;
                                                }
                                            } catch (TimeoutException e10) {
                                                e = e10;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                                }
                                                o9.cancel(true);
                                                p2.j.f39798C.f39810k.getClass();
                                                final long elapsedRealtime42 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                final int i122 = 0;
                                                final boolean z122 = z10;
                                                t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                                    /* renamed from: u, reason: collision with root package name */
                                                    public final /* synthetic */ C2588Hh f34638u;

                                                    {
                                                        this.f34638u = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        switch (i122) {
                                                            case 0:
                                                                this.f34638u.f25405n.M0(elapsedRealtime42, z122);
                                                                break;
                                                            case 1:
                                                                this.f34638u.f25405n.M0(elapsedRealtime42, z122);
                                                                break;
                                                            default:
                                                                this.f34638u.f25405n.M0(elapsedRealtime42, z122);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb42 = new StringBuilder(String.valueOf(elapsedRealtime42).length() + 24);
                                                sb42.append("Cache connection took ");
                                                sb42.append(elapsedRealtime42);
                                                sb42.append("ms");
                                                sb = sb42.toString();
                                                t2.C.k(sb);
                                                r17 = webResourceResponse3;
                                                if (r17 != 0) {
                                                }
                                            }
                                        }
                                        jVar.f39810k.getClass();
                                        final long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        t2.G.f40858l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.th
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                C2588Hh.this.f25405n.M0(elapsedRealtime5, true);
                                            }
                                        });
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                        sb5.append("Cache connection took ");
                                        sb5.append(elapsedRealtime5);
                                        sb5.append("ms");
                                        t2.C.k(sb5.toString());
                                        closeable = closeable2;
                                        r17 = closeable;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z9 = true;
                                        p2.j.f39798C.f39810k.getClass();
                                        final long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        final int i1122 = 2;
                                        t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                            /* renamed from: u, reason: collision with root package name */
                                            public final /* synthetic */ C2588Hh f34638u;

                                            {
                                                this.f34638u = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                switch (i1122) {
                                                    case 0:
                                                        this.f34638u.f25405n.M0(elapsedRealtime322, z9);
                                                        break;
                                                    case 1:
                                                        this.f34638u.f25405n.M0(elapsedRealtime322, z9);
                                                        break;
                                                    default:
                                                        this.f34638u.f25405n.M0(elapsedRealtime322, z9);
                                                        break;
                                                }
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        t2.C.k(sb322.toString());
                                        throw th;
                                    }
                                } catch (InterruptedException e11) {
                                    e = e11;
                                    webResourceResponse3 = webResourceResponse2;
                                } catch (ExecutionException e12) {
                                    e = e12;
                                    webResourceResponse3 = webResourceResponse2;
                                    z10 = true;
                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                    }
                                    o9.cancel(true);
                                    p2.j.f39798C.f39810k.getClass();
                                    final long elapsedRealtime422 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i1222 = 0;
                                    final boolean z1222 = z10;
                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2588Hh f34638u;

                                        {
                                            this.f34638u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i1222) {
                                                case 0:
                                                    this.f34638u.f25405n.M0(elapsedRealtime422, z1222);
                                                    break;
                                                case 1:
                                                    this.f34638u.f25405n.M0(elapsedRealtime422, z1222);
                                                    break;
                                                default:
                                                    this.f34638u.f25405n.M0(elapsedRealtime422, z1222);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb422 = new StringBuilder(String.valueOf(elapsedRealtime422).length() + 24);
                                    sb422.append("Cache connection took ");
                                    sb422.append(elapsedRealtime422);
                                    sb422.append("ms");
                                    sb = sb422.toString();
                                    t2.C.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                } catch (TimeoutException e13) {
                                    e = e13;
                                    webResourceResponse3 = webResourceResponse2;
                                    z10 = true;
                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                    }
                                    o9.cancel(true);
                                    p2.j.f39798C.f39810k.getClass();
                                    final long elapsedRealtime4222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i12222 = 0;
                                    final boolean z12222 = z10;
                                    t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2588Hh f34638u;

                                        {
                                            this.f34638u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i12222) {
                                                case 0:
                                                    this.f34638u.f25405n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                                case 1:
                                                    this.f34638u.f25405n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                                default:
                                                    this.f34638u.f25405n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb4222 = new StringBuilder(String.valueOf(elapsedRealtime4222).length() + 24);
                                    sb4222.append("Cache connection took ");
                                    sb4222.append(elapsedRealtime4222);
                                    sb4222.append("ms");
                                    sb = sb4222.toString();
                                    t2.C.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                }
                            } catch (InterruptedException e14) {
                                e = e14;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                            } catch (ExecutionException e15) {
                                e = e15;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                }
                                o9.cancel(true);
                                p2.j.f39798C.f39810k.getClass();
                                final long elapsedRealtime42222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i122222 = 0;
                                final boolean z122222 = z10;
                                t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2588Hh f34638u;

                                    {
                                        this.f34638u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i122222) {
                                            case 0:
                                                this.f34638u.f25405n.M0(elapsedRealtime42222, z122222);
                                                break;
                                            case 1:
                                                this.f34638u.f25405n.M0(elapsedRealtime42222, z122222);
                                                break;
                                            default:
                                                this.f34638u.f25405n.M0(elapsedRealtime42222, z122222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb42222 = new StringBuilder(String.valueOf(elapsedRealtime42222).length() + 24);
                                sb42222.append("Cache connection took ");
                                sb42222.append(elapsedRealtime42222);
                                sb42222.append("ms");
                                sb = sb42222.toString();
                                t2.C.k(sb);
                                r17 = webResourceResponse3;
                                if (r17 != 0) {
                                }
                            } catch (TimeoutException e16) {
                                e = e16;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31748o5)).booleanValue()) {
                                }
                                o9.cancel(true);
                                p2.j.f39798C.f39810k.getClass();
                                final long elapsedRealtime422222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i1222222 = 0;
                                final boolean z1222222 = z10;
                                t2.G.f40858l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2588Hh f34638u;

                                    {
                                        this.f34638u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i1222222) {
                                            case 0:
                                                this.f34638u.f25405n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                            case 1:
                                                this.f34638u.f25405n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                            default:
                                                this.f34638u.f25405n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb422222 = new StringBuilder(String.valueOf(elapsedRealtime422222).length() + 24);
                                sb422222.append("Cache connection took ");
                                sb422222.append(elapsedRealtime422222);
                                sb422222.append("ms");
                                sb = sb422222.toString();
                                t2.C.k(sb);
                                r17 = webResourceResponse3;
                                if (r17 != 0) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z9 = false;
                            }
                            if (r17 != 0) {
                                return new WebResourceResponse("", "", 200, "OK", hashMap2, r17);
                            }
                            webResourceResponse = webResourceResponse2;
                        }
                    }
                } else {
                    webResourceResponse2 = null;
                }
                i = -1;
                c3151ea = AbstractC3368ia.f31702j5;
                rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                }
            } else {
                webResourceResponse = null;
            }
            return (u2.f.c() && ((Boolean) AbstractC2581Ha.f25375b.r()).booleanValue()) ? t(str, map) : webResourceResponse;
        } catch (Exception e17) {
            e = e17;
            p2.j.f39798C.f39808h.d("AdWebViewClient.interceptRequest", e);
            return q();
        } catch (NoClassDefFoundError e18) {
            e = e18;
            p2.j.f39798C.f39808h.d("AdWebViewClient.interceptRequest", e);
            return q();
        }
    }

    public final void f(Uri uri) {
        t2.C.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f25408v;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            t2.C.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31432E7)).booleanValue() || p2.j.f39798C.f39808h.a() == null) {
                return;
            }
            AbstractC3212fg.f30738a.execute(new RunnableC3068d(23, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        C3151ea c3151ea = AbstractC3368ia.f31423D6;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && this.Y.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) rVar.f40119c.a(AbstractC3368ia.f31440F6)).intValue()) {
                t2.C.k("Parsing gmsg query params on BG thread: ".concat(path));
                t2.G g9 = p2.j.f39798C.f39803c;
                g9.getClass();
                RunnableFutureC3083dE p6 = C3686oN.p(new B2.x(2, uri), g9.f40868k);
                p6.c(new MD(0, p6, new C2518Df(this, list, path, uri)), AbstractC3212fg.f30743f);
                return;
            }
        }
        t2.G g10 = p2.j.f39798C.f39803c;
        u(t2.G.o(uri), list, path);
    }

    public final void i(int i, int i4) {
        C2890Zd c2890Zd = this.f25394O;
        if (c2890Zd != null) {
            c2890Zd.x(i, i4);
        }
        C2839Wd c2839Wd = this.f25396Q;
        if (c2839Wd != null) {
            synchronized (c2839Wd.f28404E) {
                c2839Wd.f28415y = i;
                c2839Wd.f28416z = i4;
            }
        }
    }

    public final void l(InterfaceC4877a interfaceC4877a, InterfaceC2769Sb interfaceC2769Sb, s2.l lVar, InterfaceC2786Tb interfaceC2786Tb, InterfaceC4995c interfaceC4995c, boolean z8, C3153ec c3153ec, C4856a c4856a, Rx rx, InterfaceC4180xf interfaceC4180xf, C2834Vp c2834Vp, Av av, C3165eo c3165eo, C3044cc c3044cc, InterfaceC2524Dl interfaceC2524Dl, C2752Rb c2752Rb, C2752Rb c2752Rb2, C3044cc c3044cc2, C2657Li c2657Li, C3758po c3758po, C3484kk c3484kk, C3270gk c3270gk) {
        Ut ut;
        C2486Bh c2486Bh = this.f25405n;
        C4856a c4856a2 = c4856a == null ? new C4856a(c2486Bh.getContext(), interfaceC4180xf) : c4856a;
        this.f25396Q = new C2839Wd(c2486Bh, rx);
        this.f25397R = interfaceC4180xf;
        C3151ea c3151ea = AbstractC3368ia.f31393A1;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            b("/adMetadata", new C2752Rb(0, interfaceC2769Sb));
        }
        if (interfaceC2786Tb != null) {
            b("/appEvent", new C2752Rb(1, interfaceC2786Tb));
        }
        b("/backButton", AbstractC2935ac.f29214e);
        b("/refresh", AbstractC2935ac.f29215f);
        b("/canOpenApp", C2820Vb.f28262u);
        b("/canOpenURLs", C2820Vb.f28266y);
        b("/canOpenIntents", C2820Vb.f28263v);
        b("/close", AbstractC2935ac.f29210a);
        b("/customClose", AbstractC2935ac.f29211b);
        b("/instrument", AbstractC2935ac.i);
        b("/delayPageLoaded", AbstractC2935ac.f29219k);
        b("/delayPageClosed", AbstractC2935ac.f29220l);
        b("/getLocationInfo", AbstractC2935ac.f29221m);
        b("/log", AbstractC2935ac.f29212c);
        b("/mraid", new C3208fc(c4856a2, this.f25396Q, rx));
        C2890Zd c2890Zd = this.f25394O;
        if (c2890Zd != null) {
            b("/mraidLoaded", c2890Zd);
        }
        C4856a c4856a3 = c4856a2;
        b("/open", new C3370ic(c4856a3, this.f25396Q, c2834Vp, c3165eo, c2657Li, c3484kk));
        b("/precache", new C2820Vb(26));
        b("/touch", C2820Vb.f28265x);
        b("/video", AbstractC2935ac.f29216g);
        b("/videoMeta", AbstractC2935ac.f29217h);
        if (c2834Vp == null || av == null) {
            b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li));
            b("/httpTrack", C2820Vb.f28264w);
        } else {
            b("/click", new C3054cm(interfaceC2524Dl, c2657Li, av, c2834Vp));
            b("/httpTrack", new C2871Yb(6, av, c2834Vp));
        }
        boolean a9 = p2.j.f39798C.f39824y.a(c2486Bh.getContext());
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
        if (a9) {
            HashMap hashMap = new HashMap();
            Ut ut2 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24465C;
            if (ut2 != null) {
                hashMap = ut2.f28182w0;
            }
            b("/logScionEvent", new C2871Yb(1, c2486Bh.getContext(), hashMap));
        }
        if (c3153ec != null) {
            b("/setInterstitialProperties", new C2752Rb(2, c3153ec));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (c3044cc != null && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.ka)).booleanValue()) {
            b("/inspectorNetworkExtras", c3044cc);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Da)).booleanValue() && c2752Rb != null) {
            b("/shareSheet", c2752Rb);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.H8)).booleanValue() && c3758po != null) {
            b("/onDeviceStorageEvent", new C2752Rb(3, c3758po));
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Ia)).booleanValue() && c2752Rb2 != null) {
            b("/inspectorOutOfContextTest", c2752Rb2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Na)).booleanValue() && c3044cc2 != null) {
            b("/inspectorStorage", c3044cc2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Wc)).booleanValue()) {
            b("/bindPlayStoreOverlay", AbstractC2935ac.f29224p);
            b("/presentPlayStoreOverlay", AbstractC2935ac.f29225q);
            b("/expandPlayStoreOverlay", AbstractC2935ac.f29226r);
            b("/collapsePlayStoreOverlay", AbstractC2935ac.f29227s);
            b("/closePlayStoreOverlay", AbstractC2935ac.f29228t);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31683h4)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", AbstractC2935ac.f29230v);
            b("/resetPAID", AbstractC2935ac.f29229u);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.qd)).booleanValue() && (ut = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24465C) != null && ut.f28172r0) {
            b("/writeToLocalStorage", AbstractC2935ac.f29231w);
            b("/clearLocalStorageKeys", AbstractC2935ac.f29232x);
        }
        this.f25410x = interfaceC4877a;
        this.f25411y = lVar;
        this.f25382B = interfaceC2769Sb;
        this.f25383C = interfaceC2786Tb;
        this.f25393N = interfaceC4995c;
        this.f25395P = c4856a3;
        this.f25384D = interfaceC2524Dl;
        this.f25398S = c3165eo;
        this.f25399T = c3270gk;
        this.f25385E = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, InterfaceC4180xf interfaceC4180xf, int i) {
        boolean z8;
        Bitmap bitmap;
        C4072vf c4072vf = (C4072vf) interfaceC4180xf;
        boolean z9 = c4072vf.f34826g.f35010v;
        if (!z9 || (z8 = c4072vf.f34828j) || i <= 0) {
            return;
        }
        if (z9 && !z8) {
            t2.G g9 = p2.j.f39798C.f39803c;
            Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    } catch (RuntimeException e6) {
                        e = e6;
                        int i4 = t2.C.f40822b;
                        u2.i.d("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                        if (c4072vf.f34826g.f35010v) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e9) {
                    e = e9;
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i9 = t2.C.f40822b;
                        u2.i.f("Width or height of view is zero");
                    } catch (RuntimeException e10) {
                        int i10 = t2.C.f40822b;
                        u2.i.d("Fail to capture the webview", e10);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                AbstractC3194fG.g("Failed to capture the webview bitmap.");
            } else {
                c4072vf.f34828j = true;
                MD md = new MD(11, c4072vf, bitmap2);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    md.run();
                } else {
                    AbstractC3212fg.f30738a.execute(md);
                }
            }
        }
        if (c4072vf.f34826g.f35010v || c4072vf.f34828j) {
            return;
        }
        t2.G.f40858l.postDelayed(new RunnableC2740Qg(this, view, c4072vf, i), 100L);
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        InterfaceC4877a interfaceC4877a = this.f25410x;
        if (interfaceC4877a != null) {
            interfaceC4877a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        t2.C.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f25409w) {
            try {
                C2486Bh c2486Bh = this.f25405n;
                if (c2486Bh.f24059n.r0()) {
                    t2.C.k("Blank page loaded, 1...");
                    c2486Bh.l();
                    return;
                }
                this.f25400U = true;
                InterfaceC2656Lh interfaceC2656Lh = this.f25381A;
                if (interfaceC2656Lh != null) {
                    interfaceC2656Lh.mo4a();
                    this.f25381A = null;
                }
                E();
                C2486Bh c2486Bh2 = this.f25405n;
                if (c2486Bh2.f24059n.w0() != null) {
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.rd)).booleanValue() || (toolbar = c2486Bh2.f24059n.w0().f40452P) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f25386F = true;
        this.f25387G = i;
        this.f25388H = str;
        this.f25389I = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof InterfaceC3858rh)) {
                int i = t2.C.f40822b;
                u2.i.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) webView;
            InterfaceC4180xf interfaceC4180xf = this.f25397R;
            if (interfaceC4180xf != null) {
                ((C4072vf) interfaceC4180xf).b(1, uri, requestHeaders);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return e(uri, requestHeaders);
            }
            if (interfaceC3858rh.j0() != null) {
                C2588Hh j02 = interfaceC3858rh.j0();
                synchronized (j02.f25409w) {
                    j02.f25385E = false;
                    j02.J = true;
                    AbstractC3212fg.f30743f.execute(new RunnableC3068d(22, j02));
                }
            }
            if (interfaceC3858rh.e0().b()) {
                str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31826x0);
            } else if (interfaceC3858rh.G0()) {
                str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31816w0);
            } else {
                str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31807v0);
            }
            p2.j jVar = p2.j.f39798C;
            t2.G g9 = jVar.f39803c;
            Context context = interfaceC3858rh.getContext();
            String str2 = interfaceC3858rh.w().f41217n;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", jVar.f39803c.E(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                t2.q a9 = new t2.s(context).a(0, str, hashMap, null);
                String str3 = (String) a9.f31242n.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                int i4 = t2.C.f40822b;
                u2.i.g("Could not fetch MRAID JS.", e6);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case com.anythink.expressad.video.module.a.a.f21885Q /* 126 */:
                    case com.anythink.expressad.video.module.a.a.f21886R /* 127 */:
                    case 128:
                    case com.anythink.expressad.video.module.a.a.f21888T /* 129 */:
                    case com.anythink.expressad.video.module.a.a.f21889U /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        t2.C.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
            return true;
        }
        boolean z8 = this.f25385E;
        C2486Bh c2486Bh = this.f25405n;
        if (z8 && webView == c2486Bh.f24059n) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC4877a interfaceC4877a = this.f25410x;
                if (interfaceC4877a != null) {
                    interfaceC4877a.onAdClicked();
                    InterfaceC4180xf interfaceC4180xf = this.f25397R;
                    if (interfaceC4180xf != null) {
                        ((C4072vf) interfaceC4180xf).a(str);
                    }
                    this.f25410x = null;
                }
                InterfaceC2524Dl interfaceC2524Dl = this.f25384D;
                if (interfaceC2524Dl != null) {
                    interfaceC2524Dl.C();
                    this.f25384D = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh2 = c2486Bh.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.willNotDraw()) {
            u2.i.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            C3348i7 c3348i7 = viewTreeObserverOnGlobalLayoutListenerC2520Dh2.f24498u;
            C3280gu c3280gu = viewTreeObserverOnGlobalLayoutListenerC2520Dh2.f24500v;
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vd)).booleanValue() || c3280gu == null) {
                if (c3348i7 != null && c3348i7.a(parse)) {
                    parse = c3348i7.b(parse, c2486Bh.getContext(), c2486Bh, c2486Bh.h());
                }
            } else if (c3348i7 != null && c3348i7.a(parse)) {
                parse = c3280gu.a(parse, c2486Bh.getContext(), c2486Bh, c2486Bh.h());
            }
        } catch (C3400j7 unused) {
            u2.i.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        C4856a c4856a = this.f25395P;
        if (c4856a == null || c4856a.a()) {
            F(new C4997e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, viewTreeObserverOnGlobalLayoutListenerC2520Dh2.p());
        } else {
            c4856a.b(str);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0160, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        if (r0.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018b, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0197, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01af, code lost:
    
        r0 = p2.j.f39798C.f39806f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0138, code lost:
    
        if (r2 >= r1.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
    
        if (r1[r2].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0148, code lost:
    
        r3 = r1[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0155, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0157, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0117, code lost:
    
        r11 = r1.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse t(String str, Map map) {
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                t2.G g9 = p2.j.f39798C.f39803c;
                try {
                    C2486Bh c2486Bh = this.f25405n;
                    g9.B(c2486Bh.getContext(), c2486Bh.f24059n.f24504x.f41217n, httpURLConnection, 60000);
                    u2.f fVar = new u2.f();
                    webResourceResponse = null;
                    fVar.a(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    fVar.b(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i4 = t2.C.f40822b;
                        u2.i.f("Protocol is null");
                        webResourceResponse = q();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i9 = t2.C.f40822b;
                        u2.i.f(sb2);
                        webResourceResponse = q();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i10 = t2.C.f40822b;
                    u2.i.a(sb4);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void u(Map map, List list, String str) {
        if (t2.C.m()) {
            t2.C.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                t2.C.k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2990bc) it.next()).g(this.f25405n, map);
        }
    }

    public final void y(C2657Li c2657Li, C2834Vp c2834Vp, Av av) {
        c("/click");
        if (c2834Vp != null && av != null) {
            b("/click", new C3054cm(this.f25384D, c2657Li, av, c2834Vp));
            return;
        }
        InterfaceC2524Dl interfaceC2524Dl = this.f25384D;
        C2820Vb c2820Vb = AbstractC2935ac.f29210a;
        b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li));
    }

    public final void z(C2657Li c2657Li, C2834Vp c2834Vp, C3165eo c3165eo) {
        c("/open");
        b("/open", new C3370ic(this.f25395P, this.f25396Q, c2834Vp, c3165eo, c2657Li, null));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e(str, Collections.EMPTY_MAP);
    }
}
