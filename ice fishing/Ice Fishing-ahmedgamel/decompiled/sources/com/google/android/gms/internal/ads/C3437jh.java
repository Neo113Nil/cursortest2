package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3437jh implements InterfaceC3750pN, InterfaceC4236yO {

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicInteger f32063N = new AtomicInteger(0);

    /* renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f32064O = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public ByteBuffer f32065A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f32066B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC4191xg f32067C;

    /* renamed from: D, reason: collision with root package name */
    public int f32068D;

    /* renamed from: E, reason: collision with root package name */
    public int f32069E;

    /* renamed from: F, reason: collision with root package name */
    public long f32070F;

    /* renamed from: G, reason: collision with root package name */
    public final String f32071G;

    /* renamed from: H, reason: collision with root package name */
    public final int f32072H;
    public Integer J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f32074K;

    /* renamed from: L, reason: collision with root package name */
    public volatile C3223fh f32075L;

    /* renamed from: n, reason: collision with root package name */
    public final Context f32077n;

    /* renamed from: u, reason: collision with root package name */
    public final C3169eh f32078u;

    /* renamed from: v, reason: collision with root package name */
    public final C3672o f32079v;

    /* renamed from: w, reason: collision with root package name */
    public final C2506Bg f32080w;

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f32081x;

    /* renamed from: y, reason: collision with root package name */
    public final R5 f32082y;

    /* renamed from: z, reason: collision with root package name */
    public C4074vO f32083z;

    /* renamed from: I, reason: collision with root package name */
    public final Object f32073I = new Object();

    /* renamed from: M, reason: collision with root package name */
    public final HashSet f32076M = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (((java.lang.Boolean) r1.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f33188x2)).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3437jh(Context context, C2506Bg c2506Bg, InterfaceC4084vh interfaceC4084vh, Integer num) {
        VG vg;
        VG lVar;
        this.f32077n = context;
        this.f32080w = c2506Bg;
        this.J = num;
        this.f32081x = new WeakReference(interfaceC4084vh);
        C3169eh c3169eh = new C3169eh();
        this.f32078u = c3169eh;
        C3672o c3672o = new C3672o(context);
        this.f32079v = c3672o;
        if (w2.z.m()) {
            w2.z.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        f32063N.incrementAndGet();
        EN en = new EN(context, new Qx(14, this));
        final boolean z6 = true;
        AbstractC2792Sd.H(!en.f25365v);
        en.f25349e = new C3557lt(11, c3672o);
        AbstractC2792Sd.H(!en.f25365v);
        en.f25350f = new C3128du(9, c3169eh);
        AbstractC2792Sd.H(!en.f25365v);
        en.f25365v = true;
        C4074vO c4074vO = new C4074vO(en);
        this.f32083z = c4074vO;
        c4074vO.f35459w.b();
        c4074vO.f35458v.T1(this);
        this.f32068D = 0;
        this.f32070F = 0L;
        this.f32069E = 0;
        this.f32074K = new ArrayList();
        this.f32075L = null;
        String p9 = interfaceC4084vh != null ? interfaceC4084vh.p() : null;
        this.f32071G = (String) (p9 == null ? NA.f27254n : new C2932aB(p9)).a();
        this.f32072H = interfaceC4084vh != null ? interfaceC4084vh.r() : 0;
        final String E8 = C4906k.f40186C.f40191c.E(context, interfaceC4084vh.C().f41845n);
        if (!this.f32066B || this.f32065A.limit() <= 0) {
            C3324ha c3324ha = AbstractC3592ma.f32797F2;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            }
            if (c2506Bg.i) {
                z6 = false;
            }
            if (c2506Bg.f24702l) {
                final int i = 0;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3437jh f31843u;

                    {
                        this.f31843u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3636nH mo13c() {
                        switch (i) {
                            case 0:
                                C3437jh c3437jh = this.f31843u;
                                c3437jh.getClass();
                                C3437jh c3437jh2 = true != z6 ? null : c3437jh;
                                C2506Bg c2506Bg2 = c3437jh.f32080w;
                                return new C3545lh(E8, c3437jh2, c2506Bg2.f24695d, c2506Bg2.f24696e, c2506Bg2.f24703m, c2506Bg2.f24704n);
                            case 1:
                                C3437jh c3437jh3 = this.f31843u;
                                c3437jh3.getClass();
                                S0.l lVar2 = new S0.l(24);
                                C3437jh c3437jh4 = true != z6 ? null : c3437jh3;
                                C2506Bg c2506Bg3 = c3437jh3.f32080w;
                                C3962tK c3962tK = new C3962tK(E8, c2506Bg3.f24695d, c2506Bg3.f24696e, true, lVar2);
                                if (c3437jh4 != null) {
                                    c3962tK.m(c3437jh4);
                                }
                                return c3962tK;
                            default:
                                C3437jh c3437jh5 = this.f31843u;
                                c3437jh5.getClass();
                                C3437jh c3437jh6 = true != z6 ? null : c3437jh5;
                                C2506Bg c2506Bg4 = c3437jh5.f32080w;
                                C3116dh c3116dh = new C3116dh(E8, c3437jh6, c2506Bg4.f24695d, c2506Bg4.f24696e, c2506Bg4.f24699h);
                                c3437jh5.f32076M.add(new WeakReference(c3116dh));
                                return c3116dh;
                        }
                    }
                };
            } else if (c2506Bg.f24699h > 0) {
                final int i4 = 2;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3437jh f31843u;

                    {
                        this.f31843u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3636nH mo13c() {
                        switch (i4) {
                            case 0:
                                C3437jh c3437jh = this.f31843u;
                                c3437jh.getClass();
                                C3437jh c3437jh2 = true != z6 ? null : c3437jh;
                                C2506Bg c2506Bg2 = c3437jh.f32080w;
                                return new C3545lh(E8, c3437jh2, c2506Bg2.f24695d, c2506Bg2.f24696e, c2506Bg2.f24703m, c2506Bg2.f24704n);
                            case 1:
                                C3437jh c3437jh3 = this.f31843u;
                                c3437jh3.getClass();
                                S0.l lVar2 = new S0.l(24);
                                C3437jh c3437jh4 = true != z6 ? null : c3437jh3;
                                C2506Bg c2506Bg3 = c3437jh3.f32080w;
                                C3962tK c3962tK = new C3962tK(E8, c2506Bg3.f24695d, c2506Bg3.f24696e, true, lVar2);
                                if (c3437jh4 != null) {
                                    c3962tK.m(c3437jh4);
                                }
                                return c3962tK;
                            default:
                                C3437jh c3437jh5 = this.f31843u;
                                c3437jh5.getClass();
                                C3437jh c3437jh6 = true != z6 ? null : c3437jh5;
                                C2506Bg c2506Bg4 = c3437jh5.f32080w;
                                C3116dh c3116dh = new C3116dh(E8, c3437jh6, c2506Bg4.f24695d, c2506Bg4.f24696e, c2506Bg4.f24699h);
                                c3437jh5.f32076M.add(new WeakReference(c3116dh));
                                return c3116dh;
                        }
                    }
                };
            } else {
                final int i6 = 1;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3437jh f31843u;

                    {
                        this.f31843u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3636nH mo13c() {
                        switch (i6) {
                            case 0:
                                C3437jh c3437jh = this.f31843u;
                                c3437jh.getClass();
                                C3437jh c3437jh2 = true != z6 ? null : c3437jh;
                                C2506Bg c2506Bg2 = c3437jh.f32080w;
                                return new C3545lh(E8, c3437jh2, c2506Bg2.f24695d, c2506Bg2.f24696e, c2506Bg2.f24703m, c2506Bg2.f24704n);
                            case 1:
                                C3437jh c3437jh3 = this.f31843u;
                                c3437jh3.getClass();
                                S0.l lVar2 = new S0.l(24);
                                C3437jh c3437jh4 = true != z6 ? null : c3437jh3;
                                C2506Bg c2506Bg3 = c3437jh3.f32080w;
                                C3962tK c3962tK = new C3962tK(E8, c2506Bg3.f24695d, c2506Bg3.f24696e, true, lVar2);
                                if (c3437jh4 != null) {
                                    c3962tK.m(c3437jh4);
                                }
                                return c3962tK;
                            default:
                                C3437jh c3437jh5 = this.f31843u;
                                c3437jh5.getClass();
                                C3437jh c3437jh6 = true != z6 ? null : c3437jh5;
                                C2506Bg c2506Bg4 = c3437jh5.f32080w;
                                C3116dh c3116dh = new C3116dh(E8, c3437jh6, c2506Bg4.f24695d, c2506Bg4.f24696e, c2506Bg4.f24699h);
                                c3437jh5.f32076M.add(new WeakReference(c3116dh));
                                return c3116dh;
                        }
                    }
                };
            }
            lVar = c2506Bg.i ? new S0.l(13, this, vg) : vg;
            ByteBuffer byteBuffer = this.f32065A;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.f32065A.limit()];
                this.f32065A.get(bArr);
                lVar = new S0.s(14, lVar, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.f32065A.limit()];
            this.f32065A.get(bArr2);
            lVar = new C3331hh(bArr2, 0);
        }
        C3128du c3128du = new C3128du(14, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33121q)).booleanValue() ? C2889Yb.f29467x : C2889Yb.f29466w);
        V2 v22 = new V2(9);
        R5 r52 = new R5();
        r52.f27929u = lVar;
        r52.f27930v = c3128du;
        r52.f27931w = v22;
        r52.f27928n = com.anythink.basead.exoplayer.h.o.f8528d;
        this.f32082y = r52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void b(int i) {
        this.f32069E += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void c(AbstractC3580mF abstractC3580mF, C2994bJ c2994bJ, boolean z6) {
        if (abstractC3580mF instanceof InterfaceC4180xM) {
            synchronized (this.f32073I) {
                this.f32074K.add((InterfaceC4180xM) abstractC3580mF);
            }
        } else if (abstractC3580mF instanceof C3223fh) {
            this.f32075L = (C3223fh) abstractC3580mF;
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f32081x.get();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() && interfaceC4084vh != null && this.f32075L.f31082H) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f32075L.J));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f32075L.f31084K));
                w2.D.f41627l.post(new RunnableC3996u0(14, interfaceC4084vh, hashMap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void d(int i) {
        InterfaceC4191xg interfaceC4191xg = this.f32067C;
        if (interfaceC4191xg != null) {
            interfaceC4191xg.T(i);
        }
    }

    public final void finalize() {
        f32063N.decrementAndGet();
        if (w2.z.m()) {
            w2.z.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void i(C3058cd c3058cd) {
        InterfaceC4191xg interfaceC4191xg = this.f32067C;
        if (interfaceC4191xg != null) {
            interfaceC4191xg.s(c3058cd.f30286a, c3058cd.f30287b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void j(DP dp) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f32081x.get();
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() || interfaceC4084vh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = dp.f25175n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = dp.f25176o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = dp.f25172k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC4084vh.d("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void k(DP dp) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f32081x.get();
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() || interfaceC4084vh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(dp.f25187z));
        hashMap.put("bitRate", String.valueOf(dp.f25171j));
        int i = dp.f25183v;
        int length = String.valueOf(i).length();
        int i4 = dp.f25184w;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append("x");
        sb.append(i4);
        hashMap.put("resolution", sb.toString());
        String str = dp.f25175n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = dp.f25176o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = dp.f25172k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC4084vh.d("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void l(C2994bJ c2994bJ, boolean z6, int i) {
        this.f32068D += i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void n(IOException iOException) {
        InterfaceC4191xg interfaceC4191xg = this.f32067C;
        if (interfaceC4191xg != null) {
            if (this.f32080w.f24700j) {
                interfaceC4191xg.u(iOException);
            } else {
                interfaceC4191xg.t("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void o(DN dn) {
        InterfaceC4191xg interfaceC4191xg = this.f32067C;
        if (interfaceC4191xg != null) {
            interfaceC4191xg.t("onPlayerError", dn);
        }
    }

    public final long p() {
        if (this.f32075L != null && this.f32075L.f31083I && this.f32075L.J) {
            return Math.min(this.f32068D, this.f32075L.f31085L);
        }
        return 0L;
    }

    public final long q() {
        if (this.f32075L != null && this.f32075L.f31083I) {
            C3223fh c3223fh = this.f32075L;
            if (c3223fh.f31081G != null) {
                AtomicLong atomicLong = c3223fh.f31087N;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (c3223fh) {
                    try {
                        if (c3223fh.f31086M == null) {
                            c3223fh.f31086M = AbstractC3436jg.f32055a.b(new CallableC3572m7(3, c3223fh));
                        }
                    } finally {
                    }
                }
                if (c3223fh.f31086M.isDone()) {
                    try {
                        c3223fh.f31087N.compareAndSet(-1L, ((Long) c3223fh.f31086M.get()).longValue());
                        return c3223fh.f31087N.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f32073I) {
            while (true) {
                ArrayList arrayList = this.f32074K;
                if (!arrayList.isEmpty()) {
                    long j6 = this.f32070F;
                    Map j9 = ((InterfaceC4180xM) arrayList.remove(0)).j();
                    long j10 = 0;
                    if (j9 != null) {
                        Iterator it = j9.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && AbstractC3066cl.D("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f32070F = j6 + j10;
                }
            }
        }
        return this.f32070F;
    }

    public final void r(boolean z6) {
        C3350i c3350i;
        boolean equals;
        if (this.f32083z == null) {
            return;
        }
        int i = 0;
        while (true) {
            C4074vO c4074vO = this.f32083z;
            c4074vO.f35459w.b();
            PN pn = c4074vO.f35458v;
            pn.O0();
            int length = pn.f27547A.length;
            if (i >= 2) {
                return;
            }
            C3672o c3672o = this.f32079v;
            synchronized (c3672o.f33612c) {
                c3350i = c3672o.f33614e;
            }
            c3350i.getClass();
            C3296h c3296h = new C3296h(c3350i);
            boolean z9 = !z6;
            SparseBooleanArray sparseBooleanArray = c3296h.f31460E;
            if (sparseBooleanArray.get(i) != z9) {
                if (z6) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            C3350i c3350i2 = new C3350i(c3296h);
            synchronized (c3672o.f33612c) {
                equals = c3672o.f33614e.equals(c3350i2);
                c3672o.f33614e = c3350i2;
            }
            if (!equals) {
                if (c3350i2.f31751A && c3672o.f33613d == null) {
                    AbstractC2991bG.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                VN vn = c3672o.f33610a;
                if (vn != null) {
                    vn.f28985z.c(10);
                }
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4236yO
    public final void s() {
        InterfaceC4191xg interfaceC4191xg = this.f32067C;
        if (interfaceC4191xg != null) {
            interfaceC4191xg.q();
        }
    }

    public final HQ t(Uri uri) {
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        List list = Collections.EMPTY_LIST;
        C3523lC c3523lC2 = C3523lC.f32525x;
        C3835r1 c3835r1 = C3835r1.f34222a;
        C2977b2 c2977b2 = new C2977b2("", new C(), uri != null ? new L0(uri, c3523lC2) : null, new C4158x0(), C3085d3.f30437C);
        int i = this.f32080w.f24697f;
        R5 r52 = this.f32082y;
        r52.f27928n = i;
        c2977b2.f29973b.getClass();
        return new HQ(c2977b2, (VG) r52.f27929u, (C3128du) r52.f27930v, (V2) r52.f27931w, r52.f27928n);
    }

    public final void u(Uri[] uriArr, ByteBuffer byteBuffer, boolean z6) {
        Object c4238yQ;
        if (this.f32083z != null) {
            this.f32065A = byteBuffer;
            this.f32066B = z6;
            int length = uriArr.length;
            if (length == 1) {
                c4238yQ = t(uriArr[0]);
            } else {
                AbstractC2947aQ[] abstractC2947aQArr = new AbstractC2947aQ[length];
                for (int i = 0; i < uriArr.length; i++) {
                    abstractC2947aQArr[i] = t(uriArr[i]);
                }
                c4238yQ = new C4238yQ(new C3107dP(7), abstractC2947aQArr);
            }
            C4074vO c4074vO = this.f32083z;
            c4074vO.f35459w.b();
            PN pn = c4074vO.f35458v;
            pn.O0();
            List singletonList = Collections.singletonList(c4238yQ);
            pn.O0();
            pn.O0();
            pn.X1(pn.f27592y0);
            pn.m2();
            pn.Y++;
            ArrayList arrayList = pn.f27557I;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < singletonList.size(); i4++) {
                C3481kO c3481kO = new C3481kO((AbstractC2947aQ) singletonList.get(i4), pn.J);
                arrayList2.add(c3481kO);
                arrayList.add(i4, new NN(c3481kO.f32199b, c3481kO.f32198a));
            }
            NQ nq = pn.f27550B0;
            int size = arrayList2.size();
            nq.getClass();
            pn.f27550B0 = new NQ(new Random(nq.f27273a.nextLong())).a(size);
            C3858rO c3858rO = new C3858rO(arrayList, pn.f27550B0);
            boolean g9 = c3858rO.g();
            int i6 = c3858rO.f34352d;
            if (!g9 && i6 < 0) {
                throw new U7.m();
            }
            int k9 = c3858rO.k(false);
            C3589mO c22 = pn.c2(pn.f27592y0, c3858rO, pn.e2(c3858rO, k9, com.anythink.basead.exoplayer.b.f7168b));
            int i9 = c22.f32732e;
            if (i9 == 1) {
                i9 = 1;
            } else {
                if (!c3858rO.g()) {
                    if (k9 != -1) {
                        if (k9 < i6) {
                            i9 = 2;
                        }
                    }
                }
                i9 = 4;
            }
            C3589mO d22 = PN.d2(c22, i9);
            long u6 = AbstractC3182eu.u(com.anythink.basead.exoplayer.b.f7168b);
            NQ nq2 = pn.f27550B0;
            VN vn = pn.f27554F;
            vn.getClass();
            vn.f28985z.b(17, new TN(arrayList2, nq2, k9, u6)).a();
            pn.a2(d22, 0, (pn.f27592y0.f32729b.f34406a.equals(d22.f32729b.f34406a) || pn.f27592y0.f32728a.g()) ? false : true, 4, pn.Z1(d22), -1);
            C4074vO c4074vO2 = this.f32083z;
            c4074vO2.f35459w.b();
            PN pn2 = c4074vO2.f35458v;
            pn2.O0();
            C3589mO c3589mO = pn2.f27592y0;
            if (c3589mO.f32732e == 1) {
                C3589mO e9 = c3589mO.e(null);
                C3589mO d23 = PN.d2(e9, true != e9.f32728a.g() ? 2 : 4);
                pn2.Y++;
                C3235ft c3235ft = pn2.f27554F.f28985z;
                c3235ft.getClass();
                C3127dt g10 = C3235ft.g();
                g10.f30645a = c3235ft.f31231a.obtainMessage(29);
                g10.a();
                pn2.a2(d23, 1, false, 5, com.anythink.basead.exoplayer.b.f7168b, -1);
            }
            f32064O.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3750pN
    public final void e(C2994bJ c2994bJ, boolean z6) {
    }
}
