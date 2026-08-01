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
import p2.C4826a;
import p2.C4835j;
import q2.InterfaceC4870a;
import t2.C5037e;
import t2.InterfaceC5035c;

/* renamed from: com.google.android.gms.internal.ads.Lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2657Lh extends WebViewClient implements InterfaceC4870a, InterfaceC2542El {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f26127o0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC2725Ph f26128A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC2834Wb f26129B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2850Xb f26130C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2542El f26131D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26132E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26133F;

    /* renamed from: G, reason: collision with root package name */
    public int f26134G;

    /* renamed from: H, reason: collision with root package name */
    public String f26135H;

    /* renamed from: I, reason: collision with root package name */
    public String f26136I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f26137K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f26138L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f26139M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC5035c f26140N;

    /* renamed from: O, reason: collision with root package name */
    public C3036ce f26141O;

    /* renamed from: P, reason: collision with root package name */
    public C4826a f26142P;

    /* renamed from: Q, reason: collision with root package name */
    public C2884Zd f26143Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC2468Af f26144R;

    /* renamed from: S, reason: collision with root package name */
    public C3153eo f26145S;

    /* renamed from: T, reason: collision with root package name */
    public C3364ik f26146T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f26147U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f26148V;

    /* renamed from: W, reason: collision with root package name */
    public int f26149W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f26150X;
    public final HashSet Y;

    /* renamed from: Z, reason: collision with root package name */
    public final BinderC2880Yp f26151Z;

    /* renamed from: n, reason: collision with root package name */
    public final C2555Fh f26152n;

    /* renamed from: n0, reason: collision with root package name */
    public androidx.fragment.app.A f26153n0;

    /* renamed from: u, reason: collision with root package name */
    public final C3068d9 f26154u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f26155v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f26156w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4870a f26157x;

    /* renamed from: y, reason: collision with root package name */
    public t2.l f26158y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2708Oh f26159z;

    public C2657Lh(C2555Fh c2555Fh, C3068d9 c3068d9, boolean z3, BinderC2880Yp binderC2880Yp) {
        C3036ce c3036ce = new C3036ce(c2555Fh, c2555Fh.d0(), new C3193fa(c2555Fh.getContext()));
        this.f26155v = new HashMap();
        this.f26156w = new Object();
        this.f26134G = 0;
        this.f26135H = "";
        this.f26136I = "";
        this.f26154u = c3068d9;
        this.f26152n = c2555Fh;
        this.J = z3;
        this.f26141O = c3036ce;
        this.f26143Q = null;
        this.Y = new HashSet(Arrays.asList(((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32011E6)).split(",")));
        this.f26151Z = binderC2880Yp;
    }

    public static WebResourceResponse o() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32352r1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean v(C2555Fh c2555Fh) {
        St st = c2555Fh.f24817n.f25054C;
        return st != null && st.b();
    }

    public static final boolean w(boolean z3, C2555Fh c2555Fh) {
        return (!z3 || c2555Fh.f24817n.i0().b() || c2555Fh.f24817n.R().equals("interstitial_mb")) ? false : true;
    }

    public final void A() {
        InterfaceC2468Af interfaceC2468Af = this.f26144R;
        if (interfaceC2468Af != null) {
            C2555Fh c2555Fh = this.f26152n;
            ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
            WeakHashMap weakHashMap = O.X.f2054a;
            if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.isAttachedToWindow()) {
                n(viewTreeObserverOnGlobalLayoutListenerC2572Gh, interfaceC2468Af, 10);
                return;
            }
            androidx.fragment.app.A a9 = this.f26153n0;
            if (a9 != null) {
                c2555Fh.removeOnAttachStateChangeListener(a9);
            }
            androidx.fragment.app.A a10 = new androidx.fragment.app.A(1, this, interfaceC2468Af);
            this.f26153n0 = a10;
            c2555Fh.addOnAttachStateChangeListener(a10);
        }
    }

    public final void B() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh;
        S0.l lVar;
        InterfaceC2708Oh interfaceC2708Oh = this.f26159z;
        C2555Fh c2555Fh = this.f26152n;
        if (interfaceC2708Oh != null && ((this.f26147U && this.f26149W <= 0) || this.f26148V || this.f26133F)) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32409x2)).booleanValue() && (lVar = (viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n).f25088u0) != null) {
                AbstractC2968bG.j((C3785qa) lVar.f2798v, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25085s0, "awfllc");
            }
            InterfaceC2708Oh interfaceC2708Oh2 = this.f26159z;
            boolean z3 = false;
            if (!this.f26148V && !this.f26133F) {
                z3 = true;
            }
            interfaceC2708Oh2.z(this.f26135H, this.f26134G, this.f26136I, z3);
            this.f26159z = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh2 = c2555Fh.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh2.f25086t0 == null) {
            S0.l lVar2 = viewTreeObserverOnGlobalLayoutListenerC2572Gh2.f25088u0;
            lVar2.getClass();
            C3677oa d2 = C3785qa.d();
            viewTreeObserverOnGlobalLayoutListenerC2572Gh2.f25086t0 = d2;
            ((HashMap) lVar2.f2797u).put("native:view_load", d2);
        }
    }

    public final void D(C5037e c5037e, boolean z3, boolean z6, String str) {
        boolean z9;
        C2555Fh c2555Fh = this.f26152n;
        boolean H02 = c2555Fh.f24817n.H0();
        boolean z10 = false;
        boolean z11 = w(H02, c2555Fh) || z6;
        if (z11 || !z3) {
            z9 = H02;
            z10 = true;
        } else {
            z9 = H02;
        }
        a(new AdOverlayInfoParcel(c5037e, z11 ? null : this.f26157x, z9 ? null : this.f26158y, this.f26140N, c2555Fh.f24817n.f25093x, c2555Fh, z10 ? null : this.f26131D, str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void J() {
        InterfaceC2542El interfaceC2542El = this.f26131D;
        if (interfaceC2542El != null) {
            interfaceC2542El.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
        InterfaceC2542El interfaceC2542El = this.f26131D;
        if (interfaceC2542El != null) {
            interfaceC2542El.M();
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        C5037e c5037e;
        C2884Zd c2884Zd = this.f26143Q;
        if (c2884Zd != null) {
            synchronized (c2884Zd.f28898E) {
                r1 = c2884Zd.f28904L != null;
            }
        }
        a4.e eVar = C4835j.f39733C.f39737b;
        a4.e.n(this.f26152n.getContext(), adOverlayInfoParcel, !r1, this.f26145S);
        InterfaceC2468Af interfaceC2468Af = this.f26144R;
        if (interfaceC2468Af != null) {
            String str = adOverlayInfoParcel.f23566E;
            if (str == null && (c5037e = adOverlayInfoParcel.f23578n) != null) {
                str = c5037e.f40837u;
            }
            ((C4221yf) interfaceC2468Af).a(str);
        }
    }

    public final void b(String str, InterfaceC3249gc interfaceC3249gc) {
        synchronized (this.f26156w) {
            try {
                HashMap hashMap = this.f26155v;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(interfaceC3249gc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f26156w) {
            try {
                List list = (List) this.f26155v.get(str);
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
        InterfaceC2468Af interfaceC2468Af = this.f26144R;
        if (interfaceC2468Af != null) {
            C4221yf c4221yf = (C4221yf) interfaceC2468Af;
            synchronized (c4221yf.f35188h) {
                c4221yf.f35182b.keySet();
                ND c9 = QC.c(Collections.EMPTY_MAP);
                C4164xc c4164xc = new C4164xc(1, c4221yf);
                C3360ig c3360ig = AbstractC3413jg.f31275h;
                C3878sD t6 = QC.t(c9, c4164xc, c3360ig);
                N3.a s9 = QC.s(t6, 10L, TimeUnit.SECONDS, AbstractC3413jg.f31271d);
                t6.a(new LD(0, t6, new C3657o7(c4221yf, s9)), c3360ig);
                C4221yf.f35180l.add(s9);
            }
            this.f26144R = null;
        }
        androidx.fragment.app.A a9 = this.f26153n0;
        if (a9 != null) {
            this.f26152n.removeOnAttachStateChangeListener(a9);
        }
        synchronized (this.f26156w) {
            try {
                this.f26155v.clear();
                this.f26157x = null;
                this.f26158y = null;
                this.f26159z = null;
                this.f26128A = null;
                this.f26129B = null;
                this.f26130C = null;
                this.f26132E = false;
                this.J = false;
                this.f26137K = false;
                this.f26138L = false;
                this.f26140N = null;
                this.f26142P = null;
                this.f26141O = null;
                C2884Zd c2884Zd = this.f26143Q;
                if (c2884Zd != null) {
                    c2884Zd.C(true);
                    this.f26143Q = null;
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
        C3301ha c3301ha;
        q2.r rVar;
        ?? r17;
        boolean z3;
        long j6;
        Closeable closeable;
        Throwable th;
        final boolean z6;
        WebResourceResponse webResourceResponse3;
        boolean z9;
        String sb;
        try {
            HashMap hashMap = new HashMap();
            C2555Fh c2555Fh = this.f26152n;
            St st = c2555Fh.f24817n.f25054C;
            if (st != null) {
                hashMap = st.f27649w0;
            }
            String g4 = AbstractC3043cl.g(str, c2555Fh.getContext(), this.f26150X, hashMap);
            if (!g4.equals(str)) {
                return s(g4, map);
            }
            X8 a9 = X8.a(Uri.parse(str));
            if (a9 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    webResourceResponse2 = null;
                    List q8 = com.bumptech.glide.manager.p.d(new PA('-')).q(parse.getQueryParameter("range"));
                    if (q8.size() == 2) {
                        int parseInt = Integer.parseInt((String) q8.get(0));
                        int parseInt2 = Integer.parseInt((String) q8.get(1)) + 1;
                        if (parseInt > 0) {
                            a9.f28493A = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        c3301ha = AbstractC3569ma.f32283j5;
                        rVar = q2.r.f40207e;
                        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                            U8 k9 = C4835j.f39733C.f39744j.k(a9);
                            if (k9 == null || !k9.a()) {
                                r17 = webResourceResponse2;
                            } else {
                                synchronized (k9) {
                                    z3 = k9.f27905u;
                                }
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z3));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(k9.d()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(k9.c()));
                                synchronized (k9) {
                                    j6 = k9.f27907w;
                                }
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(j6));
                                ParcelFileDescriptor.AutoCloseInputStream b9 = k9.b();
                                closeable = b9;
                                if (i != -1) {
                                    int i6 = GC.f24951a;
                                    r17 = new C3601n5(b9, i);
                                }
                                r17 = closeable;
                            }
                            if (r17 != 0) {
                            }
                        } else {
                            String p9 = c2555Fh.f24817n.p();
                            if (p9 == null) {
                                p9 = "";
                            }
                            a9.f28494B = p9;
                            a9.f28495C = c2555Fh.f24817n.r();
                            long longValue = (a9.f28502z ? (Long) rVar.f40210c.a(AbstractC3569ma.f32302l5) : (Long) rVar.f40210c.a(AbstractC3569ma.f32292k5)).longValue();
                            C4835j c4835j = C4835j.f39733C;
                            c4835j.f39745k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Z8 o6 = V2.o(c2555Fh.getContext(), a9);
                            try {
                                C2961b9 c2961b9 = (C2961b9) o6.f31479n.get(longValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(c2961b9.f29229b));
                                        hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(c2961b9.f29230c));
                                        hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(c2961b9.f29232e));
                                        hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(c2961b9.f29231d));
                                        ?? r42 = c2961b9.f29228a;
                                        Closeable closeable2 = r42;
                                        if (i != -1) {
                                            long j9 = i;
                                            try {
                                                int i9 = GC.f24951a;
                                                closeable2 = new C3601n5(r42, j9);
                                            } catch (InterruptedException e9) {
                                                e = e9;
                                                webResourceResponse3 = r42;
                                                z9 = true;
                                                try {
                                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                                        C4835j.f39733C.f39743h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o6.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    C4835j.f39733C.f39745k.getClass();
                                                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i10 = 1;
                                                    final boolean z10 = z9;
                                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2657Lh f35037u;

                                                        {
                                                            this.f35037u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i10) {
                                                                case 0:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime2, z10);
                                                                    break;
                                                                case 1:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime2, z10);
                                                                    break;
                                                                default:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime2, z10);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    u2.z.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z6 = z9;
                                                    th = th;
                                                    C4835j.f39733C.f39745k.getClass();
                                                    final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i11 = 2;
                                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2657Lh f35037u;

                                                        {
                                                            this.f35037u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i11) {
                                                                case 0:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime3, z6);
                                                                    break;
                                                                case 1:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime3, z6);
                                                                    break;
                                                                default:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime3, z6);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    u2.z.k(sb3.toString());
                                                    throw th;
                                                }
                                            } catch (ExecutionException e10) {
                                                e = e10;
                                                webResourceResponse3 = r42;
                                                z9 = true;
                                                try {
                                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                                        C4835j.f39733C.f39743h.d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    o6.cancel(true);
                                                    C4835j.f39733C.f39745k.getClass();
                                                    final long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i12 = 0;
                                                    final boolean z11 = z9;
                                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2657Lh f35037u;

                                                        {
                                                            this.f35037u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i12) {
                                                                case 0:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime4, z11);
                                                                    break;
                                                                case 1:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime4, z11);
                                                                    break;
                                                                default:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime4, z11);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                                    sb4.append("Cache connection took ");
                                                    sb4.append(elapsedRealtime4);
                                                    sb4.append("ms");
                                                    sb = sb4.toString();
                                                    u2.z.k(sb);
                                                    r17 = webResourceResponse3;
                                                    if (r17 != 0) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z6 = z9;
                                                    th = th;
                                                    C4835j.f39733C.f39745k.getClass();
                                                    final long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    final int i112 = 2;
                                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                        /* renamed from: u, reason: collision with root package name */
                                                        public final /* synthetic */ C2657Lh f35037u;

                                                        {
                                                            this.f35037u = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            switch (i112) {
                                                                case 0:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime32, z6);
                                                                    break;
                                                                case 1:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime32, z6);
                                                                    break;
                                                                default:
                                                                    this.f35037u.f26152n.N0(elapsedRealtime32, z6);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    u2.z.k(sb32.toString());
                                                    throw th;
                                                }
                                            } catch (TimeoutException e11) {
                                                e = e11;
                                                webResourceResponse3 = r42;
                                                z9 = true;
                                                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                                }
                                                o6.cancel(true);
                                                C4835j.f39733C.f39745k.getClass();
                                                final long elapsedRealtime42 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                final int i122 = 0;
                                                final boolean z112 = z9;
                                                u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                                    /* renamed from: u, reason: collision with root package name */
                                                    public final /* synthetic */ C2657Lh f35037u;

                                                    {
                                                        this.f35037u = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        switch (i122) {
                                                            case 0:
                                                                this.f35037u.f26152n.N0(elapsedRealtime42, z112);
                                                                break;
                                                            case 1:
                                                                this.f35037u.f26152n.N0(elapsedRealtime42, z112);
                                                                break;
                                                            default:
                                                                this.f35037u.f26152n.N0(elapsedRealtime42, z112);
                                                                break;
                                                        }
                                                    }
                                                });
                                                StringBuilder sb42 = new StringBuilder(String.valueOf(elapsedRealtime42).length() + 24);
                                                sb42.append("Cache connection took ");
                                                sb42.append(elapsedRealtime42);
                                                sb42.append("ms");
                                                sb = sb42.toString();
                                                u2.z.k(sb);
                                                r17 = webResourceResponse3;
                                                if (r17 != 0) {
                                                }
                                            }
                                        }
                                        c4835j.f39745k.getClass();
                                        final long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        u2.D.f41237l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wh
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                C2657Lh.this.f26152n.N0(elapsedRealtime5, true);
                                            }
                                        });
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                        sb5.append("Cache connection took ");
                                        sb5.append(elapsedRealtime5);
                                        sb5.append("ms");
                                        u2.z.k(sb5.toString());
                                        closeable = closeable2;
                                        r17 = closeable;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z6 = true;
                                        C4835j.f39733C.f39745k.getClass();
                                        final long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        final int i1122 = 2;
                                        u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                            /* renamed from: u, reason: collision with root package name */
                                            public final /* synthetic */ C2657Lh f35037u;

                                            {
                                                this.f35037u = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                switch (i1122) {
                                                    case 0:
                                                        this.f35037u.f26152n.N0(elapsedRealtime322, z6);
                                                        break;
                                                    case 1:
                                                        this.f35037u.f26152n.N0(elapsedRealtime322, z6);
                                                        break;
                                                    default:
                                                        this.f35037u.f26152n.N0(elapsedRealtime322, z6);
                                                        break;
                                                }
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        u2.z.k(sb322.toString());
                                        throw th;
                                    }
                                } catch (InterruptedException e12) {
                                    e = e12;
                                    webResourceResponse3 = webResourceResponse2;
                                } catch (ExecutionException e13) {
                                    e = e13;
                                    webResourceResponse3 = webResourceResponse2;
                                    z9 = true;
                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                    }
                                    o6.cancel(true);
                                    C4835j.f39733C.f39745k.getClass();
                                    final long elapsedRealtime422 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i1222 = 0;
                                    final boolean z1122 = z9;
                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2657Lh f35037u;

                                        {
                                            this.f35037u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i1222) {
                                                case 0:
                                                    this.f35037u.f26152n.N0(elapsedRealtime422, z1122);
                                                    break;
                                                case 1:
                                                    this.f35037u.f26152n.N0(elapsedRealtime422, z1122);
                                                    break;
                                                default:
                                                    this.f35037u.f26152n.N0(elapsedRealtime422, z1122);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb422 = new StringBuilder(String.valueOf(elapsedRealtime422).length() + 24);
                                    sb422.append("Cache connection took ");
                                    sb422.append(elapsedRealtime422);
                                    sb422.append("ms");
                                    sb = sb422.toString();
                                    u2.z.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                } catch (TimeoutException e14) {
                                    e = e14;
                                    webResourceResponse3 = webResourceResponse2;
                                    z9 = true;
                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                    }
                                    o6.cancel(true);
                                    C4835j.f39733C.f39745k.getClass();
                                    final long elapsedRealtime4222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    final int i12222 = 0;
                                    final boolean z11222 = z9;
                                    u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                        /* renamed from: u, reason: collision with root package name */
                                        public final /* synthetic */ C2657Lh f35037u;

                                        {
                                            this.f35037u = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            switch (i12222) {
                                                case 0:
                                                    this.f35037u.f26152n.N0(elapsedRealtime4222, z11222);
                                                    break;
                                                case 1:
                                                    this.f35037u.f26152n.N0(elapsedRealtime4222, z11222);
                                                    break;
                                                default:
                                                    this.f35037u.f26152n.N0(elapsedRealtime4222, z11222);
                                                    break;
                                            }
                                        }
                                    });
                                    StringBuilder sb4222 = new StringBuilder(String.valueOf(elapsedRealtime4222).length() + 24);
                                    sb4222.append("Cache connection took ");
                                    sb4222.append(elapsedRealtime4222);
                                    sb4222.append("ms");
                                    sb = sb4222.toString();
                                    u2.z.k(sb);
                                    r17 = webResourceResponse3;
                                    if (r17 != 0) {
                                    }
                                }
                            } catch (InterruptedException e15) {
                                e = e15;
                                webResourceResponse3 = webResourceResponse2;
                                z9 = false;
                            } catch (ExecutionException e16) {
                                e = e16;
                                webResourceResponse3 = webResourceResponse2;
                                z9 = false;
                                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                }
                                o6.cancel(true);
                                C4835j.f39733C.f39745k.getClass();
                                final long elapsedRealtime42222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i122222 = 0;
                                final boolean z112222 = z9;
                                u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2657Lh f35037u;

                                    {
                                        this.f35037u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i122222) {
                                            case 0:
                                                this.f35037u.f26152n.N0(elapsedRealtime42222, z112222);
                                                break;
                                            case 1:
                                                this.f35037u.f26152n.N0(elapsedRealtime42222, z112222);
                                                break;
                                            default:
                                                this.f35037u.f26152n.N0(elapsedRealtime42222, z112222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb42222 = new StringBuilder(String.valueOf(elapsedRealtime42222).length() + 24);
                                sb42222.append("Cache connection took ");
                                sb42222.append(elapsedRealtime42222);
                                sb42222.append("ms");
                                sb = sb42222.toString();
                                u2.z.k(sb);
                                r17 = webResourceResponse3;
                                if (r17 != 0) {
                                }
                            } catch (TimeoutException e17) {
                                e = e17;
                                webResourceResponse3 = webResourceResponse2;
                                z9 = false;
                                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32329o5)).booleanValue()) {
                                }
                                o6.cancel(true);
                                C4835j.f39733C.f39745k.getClass();
                                final long elapsedRealtime422222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                final int i1222222 = 0;
                                final boolean z1122222 = z9;
                                u2.D.f41237l.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xh

                                    /* renamed from: u, reason: collision with root package name */
                                    public final /* synthetic */ C2657Lh f35037u;

                                    {
                                        this.f35037u = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i1222222) {
                                            case 0:
                                                this.f35037u.f26152n.N0(elapsedRealtime422222, z1122222);
                                                break;
                                            case 1:
                                                this.f35037u.f26152n.N0(elapsedRealtime422222, z1122222);
                                                break;
                                            default:
                                                this.f35037u.f26152n.N0(elapsedRealtime422222, z1122222);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb422222 = new StringBuilder(String.valueOf(elapsedRealtime422222).length() + 24);
                                sb422222.append("Cache connection took ");
                                sb422222.append(elapsedRealtime422222);
                                sb422222.append("ms");
                                sb = sb422222.toString();
                                u2.z.k(sb);
                                r17 = webResourceResponse3;
                                if (r17 != 0) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z6 = false;
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
                c3301ha = AbstractC3569ma.f32283j5;
                rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                }
            } else {
                webResourceResponse = null;
            }
            return (v2.f.c() && ((Boolean) AbstractC2667Ma.f26299b.r()).booleanValue()) ? s(str, map) : webResourceResponse;
        } catch (Exception e18) {
            e = e18;
            C4835j.f39733C.f39743h.d("AdWebViewClient.interceptRequest", e);
            return o();
        } catch (NoClassDefFoundError e19) {
            e = e19;
            C4835j.f39733C.f39743h.d("AdWebViewClient.interceptRequest", e);
            return o();
        }
    }

    public final void f(Uri uri) {
        u2.z.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f26155v;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            u2.z.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32012E7)).booleanValue() || C4835j.f39733C.f39743h.a() == null) {
                return;
            }
            AbstractC3413jg.f31268a.execute(new RunnableC3111e(23, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        C3301ha c3301ha = AbstractC3569ma.f32003D6;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && this.Y.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) rVar.f40210c.a(AbstractC3569ma.f32020F6)).intValue()) {
                u2.z.k("Parsing gmsg query params on BG thread: ".concat(path));
                u2.D d2 = C4835j.f39733C.f39738c;
                d2.getClass();
                RunnableFutureC2966bE o6 = QC.o(new C2.w(2, uri), d2.f41247k);
                o6.a(new LD(0, o6, new C2570Gf(this, list, path, uri)), AbstractC3413jg.f31273f);
                return;
            }
        }
        u2.D d9 = C4835j.f39733C.f39738c;
        t(u2.D.o(uri), list, path);
    }

    public final void h(int i, int i6) {
        C3036ce c3036ce = this.f26141O;
        if (c3036ce != null) {
            c3036ce.C(i, i6);
        }
        C2884Zd c2884Zd = this.f26143Q;
        if (c2884Zd != null) {
            synchronized (c2884Zd.f28898E) {
                c2884Zd.f28909y = i;
                c2884Zd.f28910z = i6;
            }
        }
    }

    public final void i(InterfaceC4870a interfaceC4870a, InterfaceC2834Wb interfaceC2834Wb, t2.l lVar, InterfaceC2850Xb interfaceC2850Xb, InterfaceC5035c interfaceC5035c, boolean z3, C3357ic c3357ic, C4826a c4826a, Qx qx, InterfaceC2468Af interfaceC2468Af, C2800Tp c2800Tp, C4237yv c4237yv, C3153eo c3153eo, C3303hc c3303hc, InterfaceC2542El interfaceC2542El, C2818Vb c2818Vb, C2818Vb c2818Vb2, C3303hc c3303hc2, C2692Ni c2692Ni, C3691oo c3691oo, C3525lk c3525lk, C3364ik c3364ik, C3311hk c3311hk) {
        St st;
        C2555Fh c2555Fh = this.f26152n;
        C4826a c4826a2 = c4826a == null ? new C4826a(c2555Fh.getContext(), interfaceC2468Af) : c4826a;
        this.f26143Q = new C2884Zd(c2555Fh, qx);
        this.f26144R = interfaceC2468Af;
        C3301ha c3301ha = AbstractC3569ma.f31970A1;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            b("/adMetadata", new C2818Vb(0, interfaceC2834Wb));
        }
        if (interfaceC2850Xb != null) {
            b("/appEvent", new C2818Vb(1, interfaceC2850Xb));
        }
        b("/backButton", AbstractC3195fc.f30256e);
        b("/refresh", AbstractC3195fc.f30257f);
        b("/canOpenApp", C2927ac.f29059u);
        b("/canOpenURLs", C2927ac.f29063y);
        b("/canOpenIntents", C2927ac.f29060v);
        b("/close", AbstractC3195fc.f30252a);
        b("/customClose", AbstractC3195fc.f30253b);
        b("/instrument", AbstractC3195fc.i);
        b("/delayPageLoaded", AbstractC3195fc.f30261k);
        b("/delayPageClosed", AbstractC3195fc.f30262l);
        b("/getLocationInfo", AbstractC3195fc.f30263m);
        b("/log", AbstractC3195fc.f30254c);
        b("/mraid", new C3409jc(c4826a2, this.f26143Q, qx));
        C3036ce c3036ce = this.f26141O;
        if (c3036ce != null) {
            b("/mraidLoaded", c3036ce);
        }
        C4826a c4826a3 = c4826a2;
        b("/open", new C3625nc(c4826a3, this.f26143Q, c2800Tp, c3153eo, c2692Ni, c3525lk, c3311hk));
        b("/precache", new C2927ac(26));
        b("/touch", C2927ac.f29062x);
        b("/video", AbstractC3195fc.f30258g);
        b("/videoMeta", AbstractC3195fc.f30259h);
        if (c2800Tp == null || c4237yv == null) {
            b("/click", new C3088dc(0, interfaceC2542El, c2692Ni));
            b("/httpTrack", C2927ac.f29061w);
        } else {
            b("/click", new C3151em(interfaceC2542El, c2692Ni, c4237yv, c2800Tp));
            b("/httpTrack", new C3088dc(6, c4237yv, c2800Tp));
        }
        boolean a9 = C4835j.f39733C.f39759y.a(c2555Fh.getContext());
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
        if (a9) {
            HashMap hashMap = new HashMap();
            St st2 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25054C;
            if (st2 != null) {
                hashMap = st2.f27649w0;
            }
            b("/logScionEvent", new C3088dc(1, c2555Fh.getContext(), hashMap));
        }
        if (c3357ic != null) {
            b("/setInterstitialProperties", new C2818Vb(2, c3357ic));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (c3303hc != null && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.ka)).booleanValue()) {
            b("/inspectorNetworkExtras", c3303hc);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Da)).booleanValue() && c2818Vb != null) {
            b("/shareSheet", c2818Vb);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.H8)).booleanValue() && c3691oo != null) {
            b("/onDeviceStorageEvent", new C2818Vb(3, c3691oo));
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ia)).booleanValue() && c2818Vb2 != null) {
            b("/inspectorOutOfContextTest", c2818Vb2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Na)).booleanValue() && c3303hc2 != null) {
            b("/inspectorStorage", c3303hc2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Wc)).booleanValue()) {
            b("/bindPlayStoreOverlay", AbstractC3195fc.f30266p);
            b("/presentPlayStoreOverlay", AbstractC3195fc.f30267q);
            b("/expandPlayStoreOverlay", AbstractC3195fc.f30268r);
            b("/collapsePlayStoreOverlay", AbstractC3195fc.f30269s);
            b("/closePlayStoreOverlay", AbstractC3195fc.f30270t);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32264h4)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", AbstractC3195fc.f30272v);
            b("/resetPAID", AbstractC3195fc.f30271u);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.qd)).booleanValue() && (st = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25054C) != null && st.f27639r0) {
            b("/writeToLocalStorage", AbstractC3195fc.f30273w);
            b("/clearLocalStorageKeys", AbstractC3195fc.f30274x);
        }
        this.f26157x = interfaceC4870a;
        this.f26158y = lVar;
        this.f26129B = interfaceC2834Wb;
        this.f26130C = interfaceC2850Xb;
        this.f26140N = interfaceC5035c;
        this.f26142P = c4826a3;
        this.f26131D = interfaceC2542El;
        this.f26145S = c3153eo;
        this.f26146T = c3364ik;
        this.f26132E = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, InterfaceC2468Af interfaceC2468Af, int i) {
        boolean z3;
        Bitmap bitmap;
        C4221yf c4221yf = (C4221yf) interfaceC2468Af;
        boolean z6 = c4221yf.f35187g.f35366v;
        if (!z6 || (z3 = c4221yf.f35189j) || i <= 0) {
            return;
        }
        if (z6 && !z3) {
            u2.D d2 = C4835j.f39733C.f39738c;
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
                        int i6 = u2.z.f41322b;
                        v2.i.d("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                        if (c4221yf.f35187g.f35366v) {
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
                        int i9 = u2.z.f41322b;
                        v2.i.f("Width or height of view is zero");
                    } catch (RuntimeException e11) {
                        int i10 = u2.z.f41322b;
                        v2.i.d("Fail to capture the webview", e11);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                AbstractC2639Kg.i("Failed to capture the webview bitmap.");
            } else {
                c4221yf.f35189j = true;
                RunnableC3973u0 runnableC3973u0 = new RunnableC3973u0(10, c4221yf, bitmap2);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    runnableC3973u0.run();
                } else {
                    AbstractC3413jg.f31268a.execute(runnableC3973u0);
                }
            }
        }
        if (c4221yf.f35187g.f35366v || c4221yf.f35189j) {
            return;
        }
        u2.D.f41237l.postDelayed(new RunnableC2791Tg(this, view, c4221yf, i), 100L);
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        InterfaceC4870a interfaceC4870a = this.f26157x;
        if (interfaceC4870a != null) {
            interfaceC4870a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        u2.z.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f26156w) {
            try {
                C2555Fh c2555Fh = this.f26152n;
                if (c2555Fh.f24817n.n0()) {
                    u2.z.k("Blank page loaded, 1...");
                    c2555Fh.n();
                    return;
                }
                this.f26147U = true;
                InterfaceC2725Ph interfaceC2725Ph = this.f26128A;
                if (interfaceC2725Ph != null) {
                    interfaceC2725Ph.mo8c();
                    this.f26128A = null;
                }
                B();
                C2555Fh c2555Fh2 = this.f26152n;
                if (c2555Fh2.f24817n.z0() != null) {
                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.rd)).booleanValue() || (toolbar = c2555Fh2.f24817n.z0().f40823P) == null) {
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
        this.f26133F = true;
        this.f26134G = i;
        this.f26135H = str;
        this.f26136I = str2;
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
    
        r0 = p2.C4835j.f39733C.f39741f;
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
                u2.D d2 = C4835j.f39733C.f39738c;
                try {
                    C2555Fh c2555Fh = this.f26152n;
                    d2.B(c2555Fh.getContext(), c2555Fh.f24817n.f25093x.f41391n, httpURLConnection, 60000);
                    v2.f fVar = new v2.f();
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
                        int i6 = u2.z.f41322b;
                        v2.i.f("Protocol is null");
                        webResourceResponse = o();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i9 = u2.z.f41322b;
                        v2.i.f(sb2);
                        webResourceResponse = o();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i10 = u2.z.f41322b;
                    v2.i.a(sb4);
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
            if (!(webView instanceof InterfaceC4061vh)) {
                int i = u2.z.f41322b;
                v2.i.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) webView;
            InterfaceC2468Af interfaceC2468Af = this.f26144R;
            if (interfaceC2468Af != null) {
                ((C4221yf) interfaceC2468Af).b(1, uri, requestHeaders);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return e(uri, requestHeaders);
            }
            if (interfaceC4061vh.g0() != null) {
                C2657Lh g02 = interfaceC4061vh.g0();
                synchronized (g02.f26156w) {
                    g02.f26132E = false;
                    g02.J = true;
                    AbstractC3413jg.f31273f.execute(new RunnableC3111e(22, g02));
                }
            }
            if (interfaceC4061vh.i0().b()) {
                str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32407x0);
            } else if (interfaceC4061vh.H0()) {
                str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32398w0);
            } else {
                str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32388v0);
            }
            C4835j c4835j = C4835j.f39733C;
            u2.D d2 = c4835j.f39738c;
            Context context = interfaceC4061vh.getContext();
            String str2 = interfaceC4061vh.C().f41391n;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", c4835j.f39738c.E(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                u2.p a9 = new u2.r(context).a(0, str, hashMap, null);
                String str3 = (String) a9.f31479n.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e9) {
                int i6 = u2.z.f41322b;
                v2.i.g("Could not fetch MRAID JS.", e9);
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
                    case com.anythink.expressad.video.module.a.a.f21727Q /* 126 */:
                    case com.anythink.expressad.video.module.a.a.f21728R /* 127 */:
                    case 128:
                    case com.anythink.expressad.video.module.a.a.f21730T /* 129 */:
                    case com.anythink.expressad.video.module.a.a.f21731U /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        u2.z.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            f(parse);
            return true;
        }
        boolean z3 = this.f26132E;
        C2555Fh c2555Fh = this.f26152n;
        if (z3 && webView == c2555Fh.f24817n) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC4870a interfaceC4870a = this.f26157x;
                if (interfaceC4870a != null) {
                    interfaceC4870a.onAdClicked();
                    InterfaceC2468Af interfaceC2468Af = this.f26144R;
                    if (interfaceC2468Af != null) {
                        ((C4221yf) interfaceC2468Af).a(str);
                    }
                    this.f26157x = null;
                }
                InterfaceC2542El interfaceC2542El = this.f26131D;
                if (interfaceC2542El != null) {
                    interfaceC2542El.J();
                    this.f26131D = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh2 = c2555Fh.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.willNotDraw()) {
            v2.i.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            C3441k7 c3441k7 = viewTreeObserverOnGlobalLayoutListenerC2572Gh2.f25087u;
            C3213fu c3213fu = viewTreeObserverOnGlobalLayoutListenerC2572Gh2.f25089v;
            if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.vd)).booleanValue() || c3213fu == null) {
                if (c3441k7 != null && c3441k7.a(parse)) {
                    parse = c3441k7.b(parse, c2555Fh.getContext(), c2555Fh, c2555Fh.j());
                }
            } else if (c3441k7 != null && c3441k7.a(parse)) {
                parse = c3213fu.a(parse, c2555Fh.getContext(), c2555Fh, c2555Fh.j());
            }
        } catch (C3495l7 unused) {
            v2.i.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        C4826a c4826a = this.f26142P;
        if (c4826a == null || c4826a.a()) {
            D(new C5037e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, viewTreeObserverOnGlobalLayoutListenerC2572Gh2.p());
        } else {
            c4826a.b(str);
        }
        return true;
    }

    public final void t(Map map, List list, String str) {
        if (u2.z.m()) {
            u2.z.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                u2.z.k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3249gc) it.next()).e(this.f26152n, map);
        }
    }

    public final void x(C2692Ni c2692Ni, C2800Tp c2800Tp, C4237yv c4237yv) {
        c("/click");
        if (c2800Tp != null && c4237yv != null) {
            b("/click", new C3151em(this.f26131D, c2692Ni, c4237yv, c2800Tp));
            return;
        }
        InterfaceC2542El interfaceC2542El = this.f26131D;
        C2927ac c2927ac = AbstractC3195fc.f30252a;
        b("/click", new C3088dc(0, interfaceC2542El, c2692Ni));
    }

    public final void y(C2692Ni c2692Ni, C2800Tp c2800Tp, C3153eo c3153eo) {
        c("/open");
        b("/open", new C3625nc(this.f26142P, this.f26143Q, c2800Tp, c3153eo, c2692Ni, null, null));
    }

    public final boolean z() {
        boolean z3;
        synchronized (this.f26156w) {
            z3 = this.f26137K;
        }
        return z3;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e(str, Collections.EMPTY_MAP);
    }
}
