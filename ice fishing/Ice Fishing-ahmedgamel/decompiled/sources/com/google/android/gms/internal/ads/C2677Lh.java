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
import r2.C4896a;
import r2.C4906k;
import s2.InterfaceC4919a;
import v2.C5101e;
import v2.InterfaceC5099c;

/* renamed from: com.google.android.gms.internal.ads.Lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2677Lh extends WebViewClient implements InterfaceC4919a, InterfaceC2579Fl {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f26924j0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC2745Ph f26925A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC2857Wb f26926B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2873Xb f26927C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2579Fl f26928D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26929E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26930F;

    /* renamed from: G, reason: collision with root package name */
    public int f26931G;

    /* renamed from: H, reason: collision with root package name */
    public String f26932H;

    /* renamed from: I, reason: collision with root package name */
    public String f26933I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f26934K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f26935L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f26936M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC5099c f26937N;

    /* renamed from: O, reason: collision with root package name */
    public C3059ce f26938O;

    /* renamed from: P, reason: collision with root package name */
    public C4896a f26939P;

    /* renamed from: Q, reason: collision with root package name */
    public C2907Zd f26940Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC2488Af f26941R;

    /* renamed from: S, reason: collision with root package name */
    public C3230fo f26942S;

    /* renamed from: T, reason: collision with root package name */
    public C3387ik f26943T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f26944U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f26945V;

    /* renamed from: W, reason: collision with root package name */
    public int f26946W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f26947X;
    public final HashSet Y;

    /* renamed from: Z, reason: collision with root package name */
    public final BinderC2903Yp f26948Z;

    /* renamed from: i0, reason: collision with root package name */
    public androidx.fragment.app.A f26949i0;

    /* renamed from: n, reason: collision with root package name */
    public final C2575Fh f26950n;

    /* renamed from: u, reason: collision with root package name */
    public final C3091d9 f26951u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f26952v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f26953w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4919a f26954x;

    /* renamed from: y, reason: collision with root package name */
    public v2.l f26955y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2728Oh f26956z;

    public C2677Lh(C2575Fh c2575Fh, C3091d9 c3091d9, boolean z6, BinderC2903Yp binderC2903Yp) {
        C3059ce c3059ce = new C3059ce(c2575Fh, c2575Fh.d0(), new C3216fa(c2575Fh.getContext()));
        this.f26952v = new HashMap();
        this.f26953w = new Object();
        this.f26931G = 0;
        this.f26932H = "";
        this.f26933I = "";
        this.f26951u = c3091d9;
        this.f26950n = c2575Fh;
        this.J = z6;
        this.f26938O = c3059ce;
        this.f26940Q = null;
        this.Y = new HashSet(Arrays.asList(((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32792E6)).split(",")));
        this.f26948Z = binderC2903Yp;
    }

    public static WebResourceResponse o() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.r1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean v(C2575Fh c2575Fh) {
        St st = c2575Fh.f25606n.f25842C;
        return st != null && st.b();
    }

    public static final boolean w(boolean z6, C2575Fh c2575Fh) {
        return (!z6 || c2575Fh.f25606n.j0().b() || c2575Fh.f25606n.R().equals("interstitial_mb")) ? false : true;
    }

    public final void A() {
        InterfaceC2488Af interfaceC2488Af = this.f26941R;
        if (interfaceC2488Af != null) {
            C2575Fh c2575Fh = this.f26950n;
            ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
            WeakHashMap weakHashMap = O.X.f2142a;
            if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.isAttachedToWindow()) {
                n(viewTreeObserverOnGlobalLayoutListenerC2592Gh, interfaceC2488Af, 10);
                return;
            }
            androidx.fragment.app.A a9 = this.f26949i0;
            if (a9 != null) {
                c2575Fh.removeOnAttachStateChangeListener(a9);
            }
            androidx.fragment.app.A a10 = new androidx.fragment.app.A(1, this, interfaceC2488Af);
            this.f26949i0 = a10;
            c2575Fh.addOnAttachStateChangeListener(a10);
        }
    }

    public final void B() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh;
        S0.l lVar;
        InterfaceC2728Oh interfaceC2728Oh = this.f26956z;
        C2575Fh c2575Fh = this.f26950n;
        if (interfaceC2728Oh != null && ((this.f26944U && this.f26946W <= 0) || this.f26945V || this.f26930F)) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() && (lVar = (viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n).f25869p0) != null) {
                AbstractC2991bG.j((C3808qa) lVar.f2927v, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25867n0, "awfllc");
            }
            InterfaceC2728Oh interfaceC2728Oh2 = this.f26956z;
            boolean z6 = false;
            if (!this.f26945V && !this.f26930F) {
                z6 = true;
            }
            interfaceC2728Oh2.C(this.f26932H, this.f26931G, this.f26933I, z6);
            this.f26956z = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh2 = c2575Fh.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh2.f25868o0 == null) {
            S0.l lVar2 = viewTreeObserverOnGlobalLayoutListenerC2592Gh2.f25869p0;
            lVar2.getClass();
            C3700oa d9 = C3808qa.d();
            viewTreeObserverOnGlobalLayoutListenerC2592Gh2.f25868o0 = d9;
            ((HashMap) lVar2.f2926u).put("native:view_load", d9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void D() {
        InterfaceC2579Fl interfaceC2579Fl = this.f26928D;
        if (interfaceC2579Fl != null) {
            interfaceC2579Fl.D();
        }
    }

    public final void E(C5101e c5101e, boolean z6, boolean z9, String str) {
        boolean z10;
        C2575Fh c2575Fh = this.f26950n;
        boolean G02 = c2575Fh.f25606n.G0();
        boolean z11 = false;
        boolean z12 = w(G02, c2575Fh) || z9;
        if (z12 || !z6) {
            z10 = G02;
            z11 = true;
        } else {
            z10 = G02;
        }
        a(new AdOverlayInfoParcel(c5101e, z12 ? null : this.f26954x, z10 ? null : this.f26955y, this.f26937N, c2575Fh.f25606n.f25880x, c2575Fh, z11 ? null : this.f26928D, str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
        InterfaceC2579Fl interfaceC2579Fl = this.f26928D;
        if (interfaceC2579Fl != null) {
            interfaceC2579Fl.L();
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        C5101e c5101e;
        C2907Zd c2907Zd = this.f26940Q;
        if (c2907Zd != null) {
            synchronized (c2907Zd.f29675E) {
                r1 = c2907Zd.f29681L != null;
            }
        }
        c4.e eVar = C4906k.f40186C.f40190b;
        c4.e.q(this.f26950n.getContext(), adOverlayInfoParcel, !r1, this.f26942S);
        InterfaceC2488Af interfaceC2488Af = this.f26941R;
        if (interfaceC2488Af != null) {
            String str = adOverlayInfoParcel.f24346E;
            if (str == null && (c5101e = adOverlayInfoParcel.f24358n) != null) {
                str = c5101e.f41125u;
            }
            ((C4244yf) interfaceC2488Af).a(str);
        }
    }

    public final void b(String str, InterfaceC3272gc interfaceC3272gc) {
        synchronized (this.f26953w) {
            try {
                HashMap hashMap = this.f26952v;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(interfaceC3272gc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f26953w) {
            try {
                List list = (List) this.f26952v.get(str);
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
        InterfaceC2488Af interfaceC2488Af = this.f26941R;
        if (interfaceC2488Af != null) {
            C4244yf c4244yf = (C4244yf) interfaceC2488Af;
            synchronized (c4244yf.f35978h) {
                c4244yf.f35972b.keySet();
                ND c9 = QC.c(Collections.EMPTY_MAP);
                C4187xc c4187xc = new C4187xc(1, c4244yf);
                C3383ig c3383ig = AbstractC3436jg.f32062h;
                C3901sD t6 = QC.t(c9, c4187xc, c3383ig);
                P3.a s9 = QC.s(t6, 10L, TimeUnit.SECONDS, AbstractC3436jg.f32058d);
                t6.a(new LD(0, t6, new C3680o7(c4244yf, s9)), c3383ig);
                C4244yf.f35970l.add(s9);
            }
            this.f26941R = null;
        }
        androidx.fragment.app.A a9 = this.f26949i0;
        if (a9 != null) {
            this.f26950n.removeOnAttachStateChangeListener(a9);
        }
        synchronized (this.f26953w) {
            try {
                this.f26952v.clear();
                this.f26954x = null;
                this.f26955y = null;
                this.f26956z = null;
                this.f26925A = null;
                this.f26926B = null;
                this.f26927C = null;
                this.f26929E = false;
                this.J = false;
                this.f26934K = false;
                this.f26935L = false;
                this.f26937N = null;
                this.f26939P = null;
                this.f26938O = null;
                C2907Zd c2907Zd = this.f26940Q;
                if (c2907Zd != null) {
                    c2907Zd.B(true);
                    this.f26940Q = null;
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
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.a9, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse e(String str, Map map) {
        WebResourceResponse webResourceResponse;
        WebResourceResponse webResourceResponse2;
        int i;
        C3324ha c3324ha;
        s2.r rVar;
        ?? r17;
        boolean z6;
        long j6;
        Closeable closeable;
        Throwable th;
        final boolean z9;
        WebResourceResponse webResourceResponse3;
        boolean z10;
        String sb;
        try {
            HashMap hashMap = new HashMap();
            C2575Fh c2575Fh = this.f26950n;
            St st = c2575Fh.f25606n.f25842C;
            if (st != null) {
                hashMap = st.f28432w0;
            }
            String g9 = AbstractC3066cl.g(str, c2575Fh.getContext(), this.f26947X, hashMap);
            if (!g9.equals(str)) {
                return s(g9, map);
            }
            X8 a9 = X8.a(Uri.parse(str));
            if (a9 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    webResourceResponse2 = null;
                    List q8 = com.bumptech.glide.manager.o.d(new PA('-')).q(parse.getQueryParameter("range"));
                    if (q8.size() == 2) {
                        int parseInt = Integer.parseInt((String) q8.get(0));
                        int parseInt2 = Integer.parseInt((String) q8.get(1)) + 1;
                        if (parseInt > 0) {
                            a9.f29273A = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        c3324ha = AbstractC3592ma.f33062j5;
                        rVar = s2.r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                            U8 k9 = C4906k.f40186C.f40197j.k(a9);
                            if (k9 == null || !k9.a()) {
                                r17 = webResourceResponse2;
                            } else {
                                synchronized (k9) {
                                    z6 = k9.f28702u;
                                }
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z6));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(k9.d()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(k9.c()));
                                synchronized (k9) {
                                    j6 = k9.f28704w;
                                }
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(j6));
                                ParcelFileDescriptor.AutoCloseInputStream b9 = k9.b();
                                closeable = b9;
                                if (i != -1) {
                                    int i4 = GC.f25741a;
                                    r17 = new C3624n5(b9, i);
                                }
                                r17 = closeable;
                            }
                            if (r17 != 0) {
                            }
                        } else {
                            String p9 = c2575Fh.f25606n.p();
                            if (p9 == null) {
                                p9 = "";
                            }
                            a9.f29274B = p9;
                            a9.f29275C = c2575Fh.f25606n.r();
                            long longValue = (a9.f29282z ? (Long) rVar.f40509c.a(AbstractC3592ma.f33081l5) : (Long) rVar.f40509c.a(AbstractC3592ma.f33071k5)).longValue();
                            C4906k c4906k = C4906k.f40186C;
                            c4906k.f40198k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Z8 o4 = V2.o(c2575Fh.getContext(), a9);
                            try {
                                C2984b9 c2984b9 = (C2984b9) o4.f32256n.get(longValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(c2984b9.f30017b));
                                        hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(c2984b9.f30018c));
                                        hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(c2984b9.f30020e));
                                        hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(c2984b9.f30019d));
                                        ?? r42 = c2984b9.f30016a;
                                        Closeable closeable2 = r42;
                                        if (i != -1) {
                                            long j9 = i;
                                            try {
                                                int i6 = GC.f25741a;
                                                closeable2 = new C3624n5(r42, j9);
                                            } catch (InterruptedException e9) {
                                                e = e9;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                try {
                                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                                        C4906k.f40186C.f40196h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o4.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    C4906k.f40186C.f40198k.getClass();
                                                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i9 = 1;
                                                    final boolean z11 = z10;
                                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2677Lh f35816u;

                                                        {
                                                            this.f35816u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i9) {
                                                                case 0:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                                case 1:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                                default:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime2, z11);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    w2.z.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z9 = z10;
                                                    th = th;
                                                    C4906k.f40186C.f40198k.getClass();
                                                    final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i10 = 2;
                                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2677Lh f35816u;

                                                        {
                                                            this.f35816u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i10) {
                                                                case 0:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                                case 1:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                                default:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime3, z9);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    w2.z.k(sb3.toString());
                                                    throw th;
                                                }
                                            } catch (ExecutionException e10) {
                                                e = e10;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                try {
                                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                                        C4906k.f40186C.f40196h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o4.cancel(true);
                                                    C4906k.f40186C.f40198k.getClass();
                                                    final long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i11 = 0;
                                                    final boolean z12 = z10;
                                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2677Lh f35816u;

                                                        {
                                                            this.f35816u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i11) {
                                                                case 0:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                                case 1:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                                default:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime4, z12);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                                    sb4.append("Cache connection took ");
                                                    sb4.append(elapsedRealtime4);
                                                    sb4.append("ms");
                                                    sb = sb4.toString();
                                                    w2.z.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z9 = z10;
                                                    th = th;
                                                    C4906k.f40186C.f40198k.getClass();
                                                    final long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i102 = 2;
                                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2677Lh f35816u;

                                                        {
                                                            this.f35816u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i102) {
                                                                case 0:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                                case 1:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                                default:
                                                                    this.f35816u.f26950n.M0(elapsedRealtime32, z9);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    w2.z.k(sb32.toString());
                                                    throw th;
                                                }
                                            } catch (TimeoutException e11) {
                                                e = e11;
                                                webResourceResponse3 = r42;
                                                z10 = true;
                                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                                }
                                                o4.cancel(true);
                                                C4906k.f40186C.f40198k.getClass();
                                                final long elapsedRealtime42 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                final int i112 = 0;
                                                final boolean z122 = z10;
                                                w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                    /* renamed from: u, reason: collision with root package name */
                                                    public final /* synthetic */ C2677Lh f35816u;

                                                    {
                                                        this.f35816u = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        switch (i112) {
                                                            case 0:
                                                                this.f35816u.f26950n.M0(elapsedRealtime42, z122);
                                                                break;
                                                            case 1:
                                                                this.f35816u.f26950n.M0(elapsedRealtime42, z122);
                                                                break;
                                                            default:
                                                                this.f35816u.f26950n.M0(elapsedRealtime42, z122);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb42 = new StringBuilder(String.valueOf(elapsedRealtime42).length() + 24);
                                                sb42.append("Cache connection took ");
                                                sb42.append(elapsedRealtime42);
                                                sb42.append("ms");
                                                sb = sb42.toString();
                                                w2.z.k(sb);
                                                r17 = webResourceResponse3;
                                                if (r17 != 0) {
                                                }
                                            }
                                        }
                                        c4906k.f40198k.getClass();
                                        final long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        w2.D.f41627l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wh
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                C2677Lh.this.f26950n.M0(elapsedRealtime5, true);
                                            }
                                        });
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                        sb5.append("Cache connection took ");
                                        sb5.append(elapsedRealtime5);
                                        sb5.append("ms");
                                        w2.z.k(sb5.toString());
                                        closeable = closeable2;
                                        r17 = closeable;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z9 = true;
                                        C4906k.f40186C.f40198k.getClass();
                                        final long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        final int i1022 = 2;
                                        w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                            /* renamed from: u, reason: collision with root package name */
                                            public final /* synthetic */ C2677Lh f35816u;

                                            {
                                                this.f35816u = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                switch (i1022) {
                                                    case 0:
                                                        this.f35816u.f26950n.M0(elapsedRealtime322, z9);
                                                        break;
                                                    case 1:
                                                        this.f35816u.f26950n.M0(elapsedRealtime322, z9);
                                                        break;
                                                    default:
                                                        this.f35816u.f26950n.M0(elapsedRealtime322, z9);
                                                        break;
                                                }
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        w2.z.k(sb322.toString());
                                        throw th;
                                    }
                                } catch (InterruptedException e12) {
                                    e = e12;
                                    webResourceResponse3 = webResourceResponse2;
                                } catch (ExecutionException e13) {
                                    e = e13;
                                    webResourceResponse3 = webResourceResponse2;
                                    z10 = true;
                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                    }
                                    o4.cancel(true);
                                    C4906k.f40186C.f40198k.getClass();
                                    final long elapsedRealtime422 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i1122 = 0;
                                    final boolean z1222 = z10;
                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2677Lh f35816u;

                                        {
                                            this.f35816u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i1122) {
                                                case 0:
                                                    this.f35816u.f26950n.M0(elapsedRealtime422, z1222);
                                                    break;
                                                case 1:
                                                    this.f35816u.f26950n.M0(elapsedRealtime422, z1222);
                                                    break;
                                                default:
                                                    this.f35816u.f26950n.M0(elapsedRealtime422, z1222);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb422 = new StringBuilder(String.valueOf(elapsedRealtime422).length() + 24);
                                    sb422.append("Cache connection took ");
                                    sb422.append(elapsedRealtime422);
                                    sb422.append("ms");
                                    sb = sb422.toString();
                                    w2.z.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                } catch (TimeoutException e14) {
                                    e = e14;
                                    webResourceResponse3 = webResourceResponse2;
                                    z10 = true;
                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                    }
                                    o4.cancel(true);
                                    C4906k.f40186C.f40198k.getClass();
                                    final long elapsedRealtime4222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i11222 = 0;
                                    final boolean z12222 = z10;
                                    w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2677Lh f35816u;

                                        {
                                            this.f35816u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i11222) {
                                                case 0:
                                                    this.f35816u.f26950n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                                case 1:
                                                    this.f35816u.f26950n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                                default:
                                                    this.f35816u.f26950n.M0(elapsedRealtime4222, z12222);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb4222 = new StringBuilder(String.valueOf(elapsedRealtime4222).length() + 24);
                                    sb4222.append("Cache connection took ");
                                    sb4222.append(elapsedRealtime4222);
                                    sb4222.append("ms");
                                    sb = sb4222.toString();
                                    w2.z.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                }
                            } catch (InterruptedException e15) {
                                e = e15;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                            } catch (ExecutionException e16) {
                                e = e16;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                }
                                o4.cancel(true);
                                C4906k.f40186C.f40198k.getClass();
                                final long elapsedRealtime42222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i112222 = 0;
                                final boolean z122222 = z10;
                                w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2677Lh f35816u;

                                    {
                                        this.f35816u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i112222) {
                                            case 0:
                                                this.f35816u.f26950n.M0(elapsedRealtime42222, z122222);
                                                break;
                                            case 1:
                                                this.f35816u.f26950n.M0(elapsedRealtime42222, z122222);
                                                break;
                                            default:
                                                this.f35816u.f26950n.M0(elapsedRealtime42222, z122222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb42222 = new StringBuilder(String.valueOf(elapsedRealtime42222).length() + 24);
                                sb42222.append("Cache connection took ");
                                sb42222.append(elapsedRealtime42222);
                                sb42222.append("ms");
                                sb = sb42222.toString();
                                w2.z.k(sb);
                                r17 = webResourceResponse3;
                                if (r17 != 0) {
                                }
                            } catch (TimeoutException e17) {
                                e = e17;
                                webResourceResponse3 = webResourceResponse2;
                                z10 = false;
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33109o5)).booleanValue()) {
                                }
                                o4.cancel(true);
                                C4906k.f40186C.f40198k.getClass();
                                final long elapsedRealtime422222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i1122222 = 0;
                                final boolean z1222222 = z10;
                                w2.D.f41627l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2677Lh f35816u;

                                    {
                                        this.f35816u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i1122222) {
                                            case 0:
                                                this.f35816u.f26950n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                            case 1:
                                                this.f35816u.f26950n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                            default:
                                                this.f35816u.f26950n.M0(elapsedRealtime422222, z1222222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb422222 = new StringBuilder(String.valueOf(elapsedRealtime422222).length() + 24);
                                sb422222.append("Cache connection took ");
                                sb422222.append(elapsedRealtime422222);
                                sb422222.append("ms");
                                sb = sb422222.toString();
                                w2.z.k(sb);
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
                c3324ha = AbstractC3592ma.f33062j5;
                rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                }
            } else {
                webResourceResponse = null;
            }
            return (x2.f.c() && ((Boolean) AbstractC2687Ma.f27088b.r()).booleanValue()) ? s(str, map) : webResourceResponse;
        } catch (Exception e18) {
            e = e18;
            C4906k.f40186C.f40196h.d("AdWebViewClient.interceptRequest", e);
            return o();
        } catch (NoClassDefFoundError e19) {
            e = e19;
            C4906k.f40186C.f40196h.d("AdWebViewClient.interceptRequest", e);
            return o();
        }
    }

    public final void f(Uri uri) {
        w2.z.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f26952v;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            w2.z.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32793E7)).booleanValue() || C4906k.f40186C.f40196h.a() == null) {
                return;
            }
            AbstractC3436jg.f32055a.execute(new RunnableC3134e(23, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        C3324ha c3324ha = AbstractC3592ma.f32783D6;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && this.Y.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) rVar.f40509c.a(AbstractC3592ma.f32801F6)).intValue()) {
                w2.z.k("Parsing gmsg query params on BG thread: ".concat(path));
                w2.D d9 = C4906k.f40186C.f40191c;
                d9.getClass();
                RunnableFutureC2989bE o4 = QC.o(new E2.v(2, uri), d9.f41637k);
                o4.a(new LD(0, o4, new C2590Gf(this, list, path, uri)), AbstractC3436jg.f32060f);
                return;
            }
        }
        w2.D d10 = C4906k.f40186C.f40191c;
        t(w2.D.o(uri), list, path);
    }

    public final void h(int i, int i4) {
        C3059ce c3059ce = this.f26938O;
        if (c3059ce != null) {
            c3059ce.B(i, i4);
        }
        C2907Zd c2907Zd = this.f26940Q;
        if (c2907Zd != null) {
            synchronized (c2907Zd.f29675E) {
                c2907Zd.f29686y = i;
                c2907Zd.f29687z = i4;
            }
        }
    }

    public final void i(InterfaceC4919a interfaceC4919a, InterfaceC2857Wb interfaceC2857Wb, v2.l lVar, InterfaceC2873Xb interfaceC2873Xb, InterfaceC5099c interfaceC5099c, boolean z6, C3380ic c3380ic, C4896a c4896a, Qx qx, InterfaceC2488Af interfaceC2488Af, C2821Tp c2821Tp, C4260yv c4260yv, C3230fo c3230fo, C3326hc c3326hc, InterfaceC2579Fl interfaceC2579Fl, C2841Vb c2841Vb, C2841Vb c2841Vb2, C3326hc c3326hc2, C2712Ni c2712Ni, C3768po c3768po, C3548lk c3548lk, C3387ik c3387ik, C3334hk c3334hk) {
        St st;
        C2575Fh c2575Fh = this.f26950n;
        C4896a c4896a2 = c4896a == null ? new C4896a(c2575Fh.getContext(), interfaceC2488Af) : c4896a;
        this.f26940Q = new C2907Zd(c2575Fh, qx);
        this.f26941R = interfaceC2488Af;
        C3324ha c3324ha = AbstractC3592ma.f32751A1;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            b("/adMetadata", new C2841Vb(0, interfaceC2857Wb));
        }
        if (interfaceC2873Xb != null) {
            b("/appEvent", new C2841Vb(1, interfaceC2873Xb));
        }
        b("/backButton", AbstractC3218fc.f31044e);
        b("/refresh", AbstractC3218fc.f31045f);
        b("/canOpenApp", C2950ac.f29834u);
        b("/canOpenURLs", C2950ac.f29838y);
        b("/canOpenIntents", C2950ac.f29835v);
        b("/close", AbstractC3218fc.f31040a);
        b("/customClose", AbstractC3218fc.f31041b);
        b("/instrument", AbstractC3218fc.i);
        b("/delayPageLoaded", AbstractC3218fc.f31049k);
        b("/delayPageClosed", AbstractC3218fc.f31050l);
        b("/getLocationInfo", AbstractC3218fc.f31051m);
        b("/log", AbstractC3218fc.f31042c);
        b("/mraid", new C3432jc(c4896a2, this.f26940Q, qx));
        C3059ce c3059ce = this.f26938O;
        if (c3059ce != null) {
            b("/mraidLoaded", c3059ce);
        }
        C4896a c4896a3 = c4896a2;
        b("/open", new C3648nc(c4896a3, this.f26940Q, c2821Tp, c3230fo, c2712Ni, c3548lk, c3334hk));
        b("/precache", new C2950ac(26));
        b("/touch", C2950ac.f29837x);
        b("/video", AbstractC3218fc.f31046g);
        b("/videoMeta", AbstractC3218fc.f31047h);
        if (c2821Tp == null || c4260yv == null) {
            b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni));
            b("/httpTrack", C2950ac.f29836w);
        } else {
            b("/click", new C3228fm(interfaceC2579Fl, c2712Ni, c4260yv, c2821Tp));
            b("/httpTrack", new C3111dc(6, c4260yv, c2821Tp));
        }
        boolean a9 = C4906k.f40186C.f40212y.a(c2575Fh.getContext());
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
        if (a9) {
            HashMap hashMap = new HashMap();
            St st2 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25842C;
            if (st2 != null) {
                hashMap = st2.f28432w0;
            }
            b("/logScionEvent", new C3111dc(1, c2575Fh.getContext(), hashMap));
        }
        if (c3380ic != null) {
            b("/setInterstitialProperties", new C2841Vb(2, c3380ic));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (c3326hc != null && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.ka)).booleanValue()) {
            b("/inspectorNetworkExtras", c3326hc);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Da)).booleanValue() && c2841Vb != null) {
            b("/shareSheet", c2841Vb);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.H8)).booleanValue() && c3768po != null) {
            b("/onDeviceStorageEvent", new C2841Vb(3, c3768po));
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ia)).booleanValue() && c2841Vb2 != null) {
            b("/inspectorOutOfContextTest", c2841Vb2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Na)).booleanValue() && c3326hc2 != null) {
            b("/inspectorStorage", c3326hc2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Wc)).booleanValue()) {
            b("/bindPlayStoreOverlay", AbstractC3218fc.f31054p);
            b("/presentPlayStoreOverlay", AbstractC3218fc.f31055q);
            b("/expandPlayStoreOverlay", AbstractC3218fc.f31056r);
            b("/collapsePlayStoreOverlay", AbstractC3218fc.f31057s);
            b("/closePlayStoreOverlay", AbstractC3218fc.f31058t);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33044h4)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", AbstractC3218fc.f31060v);
            b("/resetPAID", AbstractC3218fc.f31059u);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.qd)).booleanValue() && (st = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25842C) != null && st.f28422r0) {
            b("/writeToLocalStorage", AbstractC3218fc.f31061w);
            b("/clearLocalStorageKeys", AbstractC3218fc.f31062x);
        }
        this.f26954x = interfaceC4919a;
        this.f26955y = lVar;
        this.f26926B = interfaceC2857Wb;
        this.f26927C = interfaceC2873Xb;
        this.f26937N = interfaceC5099c;
        this.f26939P = c4896a3;
        this.f26928D = interfaceC2579Fl;
        this.f26942S = c3230fo;
        this.f26943T = c3387ik;
        this.f26929E = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, InterfaceC2488Af interfaceC2488Af, int i) {
        boolean z6;
        Bitmap bitmap;
        C4244yf c4244yf = (C4244yf) interfaceC2488Af;
        boolean z9 = c4244yf.f35977g.f36139v;
        if (!z9 || (z6 = c4244yf.f35979j) || i <= 0) {
            return;
        }
        if (z9 && !z6) {
            w2.D d9 = C4906k.f40186C.f40191c;
            Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    } catch (RuntimeException e9) {
                        e = e9;
                        int i4 = w2.z.f41712b;
                        x2.i.d("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                        if (c4244yf.f35977g.f36139v) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e10) {
                    e = e10;
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
                        int i6 = w2.z.f41712b;
                        x2.i.f("Width or height of view is zero");
                    } catch (RuntimeException e11) {
                        int i9 = w2.z.f41712b;
                        x2.i.d("Fail to capture the webview", e11);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                AbstractC2659Kg.i("Failed to capture the webview bitmap.");
            } else {
                c4244yf.f35979j = true;
                RunnableC3996u0 runnableC3996u0 = new RunnableC3996u0(10, c4244yf, bitmap2);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    runnableC3996u0.run();
                } else {
                    AbstractC3436jg.f32055a.execute(runnableC3996u0);
                }
            }
        }
        if (c4244yf.f35977g.f36139v || c4244yf.f35979j) {
            return;
        }
        w2.D.f41627l.postDelayed(new RunnableC2812Tg(this, view, c4244yf, i), 100L);
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        InterfaceC4919a interfaceC4919a = this.f26954x;
        if (interfaceC4919a != null) {
            interfaceC4919a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        w2.z.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f26953w) {
            try {
                C2575Fh c2575Fh = this.f26950n;
                if (c2575Fh.f25606n.n0()) {
                    w2.z.k("Blank page loaded, 1...");
                    c2575Fh.n();
                    return;
                }
                this.f26944U = true;
                InterfaceC2745Ph interfaceC2745Ph = this.f26925A;
                if (interfaceC2745Ph != null) {
                    interfaceC2745Ph.mo7c();
                    this.f26925A = null;
                }
                B();
                C2575Fh c2575Fh2 = this.f26950n;
                if (c2575Fh2.f25606n.y0() != null) {
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.rd)).booleanValue() || (toolbar = c2575Fh2.f25606n.y0().f41111P) == null) {
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
        this.f26930F = true;
        this.f26931G = i;
        this.f26932H = str;
        this.f26933I = str2;
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
    
        r0 = r2.C4906k.f40186C.f40194f;
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
    public final WebResourceResponse s(String str, Map map) {
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
                w2.D d9 = C4906k.f40186C.f40191c;
                try {
                    C2575Fh c2575Fh = this.f26950n;
                    d9.B(c2575Fh.getContext(), c2575Fh.f25606n.f25880x.f41845n, httpURLConnection, 60000);
                    x2.f fVar = new x2.f();
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
                        int i4 = w2.z.f41712b;
                        x2.i.f("Protocol is null");
                        webResourceResponse = o();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i6 = w2.z.f41712b;
                        x2.i.f(sb2);
                        webResourceResponse = o();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i9 = w2.z.f41712b;
                    x2.i.a(sb4);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof InterfaceC4084vh)) {
                int i = w2.z.f41712b;
                x2.i.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) webView;
            InterfaceC2488Af interfaceC2488Af = this.f26941R;
            if (interfaceC2488Af != null) {
                ((C4244yf) interfaceC2488Af).b(1, uri, requestHeaders);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return e(uri, requestHeaders);
            }
            if (interfaceC4084vh.h0() != null) {
                C2677Lh h02 = interfaceC4084vh.h0();
                synchronized (h02.f26953w) {
                    h02.f26929E = false;
                    h02.J = true;
                    AbstractC3436jg.f32060f.execute(new RunnableC3134e(22, h02));
                }
            }
            if (interfaceC4084vh.j0().b()) {
                str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33186x0);
            } else if (interfaceC4084vh.G0()) {
                str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33178w0);
            } else {
                str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33168v0);
            }
            C4906k c4906k = C4906k.f40186C;
            w2.D d9 = c4906k.f40191c;
            Context context = interfaceC4084vh.getContext();
            String str2 = interfaceC4084vh.C().f41845n;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", c4906k.f40191c.E(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                w2.p a9 = new w2.r(context).a(0, str, hashMap, null);
                String str3 = (String) a9.f32256n.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e9) {
                int i4 = w2.z.f41712b;
                x2.i.g("Could not fetch MRAID JS.", e9);
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
                    case com.anythink.expressad.video.module.a.a.f22514Q /* 126 */:
                    case com.anythink.expressad.video.module.a.a.f22515R /* 127 */:
                    case 128:
                    case com.anythink.expressad.video.module.a.a.f22517T /* 129 */:
                    case com.anythink.expressad.video.module.a.a.f22518U /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        w2.z.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
            return true;
        }
        boolean z6 = this.f26929E;
        C2575Fh c2575Fh = this.f26950n;
        if (z6 && webView == c2575Fh.f25606n) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC4919a interfaceC4919a = this.f26954x;
                if (interfaceC4919a != null) {
                    interfaceC4919a.onAdClicked();
                    InterfaceC2488Af interfaceC2488Af = this.f26941R;
                    if (interfaceC2488Af != null) {
                        ((C4244yf) interfaceC2488Af).a(str);
                    }
                    this.f26954x = null;
                }
                InterfaceC2579Fl interfaceC2579Fl = this.f26928D;
                if (interfaceC2579Fl != null) {
                    interfaceC2579Fl.D();
                    this.f26928D = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh2 = c2575Fh.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.willNotDraw()) {
            x2.i.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            C3464k7 c3464k7 = viewTreeObserverOnGlobalLayoutListenerC2592Gh2.f25874u;
            C3236fu c3236fu = viewTreeObserverOnGlobalLayoutListenerC2592Gh2.f25876v;
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vd)).booleanValue() || c3236fu == null) {
                if (c3464k7 != null && c3464k7.a(parse)) {
                    parse = c3464k7.b(parse, c2575Fh.getContext(), c2575Fh, c2575Fh.j());
                }
            } else if (c3464k7 != null && c3464k7.a(parse)) {
                parse = c3236fu.a(parse, c2575Fh.getContext(), c2575Fh, c2575Fh.j());
            }
        } catch (C3518l7 unused) {
            x2.i.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        C4896a c4896a = this.f26939P;
        if (c4896a == null || c4896a.a()) {
            E(new C5101e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, viewTreeObserverOnGlobalLayoutListenerC2592Gh2.p());
        } else {
            c4896a.b(str);
        }
        return true;
    }

    public final void t(Map map, List list, String str) {
        if (w2.z.m()) {
            w2.z.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                w2.z.k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3272gc) it.next()).e(this.f26950n, map);
        }
    }

    public final void x(C2712Ni c2712Ni, C2821Tp c2821Tp, C4260yv c4260yv) {
        c("/click");
        if (c2821Tp != null && c4260yv != null) {
            b("/click", new C3228fm(this.f26928D, c2712Ni, c4260yv, c2821Tp));
            return;
        }
        InterfaceC2579Fl interfaceC2579Fl = this.f26928D;
        C2950ac c2950ac = AbstractC3218fc.f31040a;
        b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni));
    }

    public final void y(C2712Ni c2712Ni, C2821Tp c2821Tp, C3230fo c3230fo) {
        c("/open");
        b("/open", new C3648nc(this.f26939P, this.f26940Q, c2821Tp, c3230fo, c2712Ni, null, null));
    }

    public final boolean z() {
        boolean z6;
        synchronized (this.f26953w) {
            z6 = this.f26934K;
        }
        return z6;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e(str, Collections.EMPTY_MAP);
    }
}
