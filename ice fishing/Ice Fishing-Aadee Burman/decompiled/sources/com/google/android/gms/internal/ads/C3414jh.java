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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3414jh implements InterfaceC3727pN, InterfaceC4213yO {

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicInteger f31276N = new AtomicInteger(0);

    /* renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f31277O = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public ByteBuffer f31278A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f31279B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC4168xg f31280C;

    /* renamed from: D, reason: collision with root package name */
    public int f31281D;

    /* renamed from: E, reason: collision with root package name */
    public int f31282E;

    /* renamed from: F, reason: collision with root package name */
    public long f31283F;

    /* renamed from: G, reason: collision with root package name */
    public final String f31284G;

    /* renamed from: H, reason: collision with root package name */
    public final int f31285H;
    public Integer J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f31287K;

    /* renamed from: L, reason: collision with root package name */
    public volatile C3200fh f31288L;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31290n;

    /* renamed from: u, reason: collision with root package name */
    public final C3146eh f31291u;

    /* renamed from: v, reason: collision with root package name */
    public final C3649o f31292v;

    /* renamed from: w, reason: collision with root package name */
    public final C2486Bg f31293w;

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f31294x;

    /* renamed from: y, reason: collision with root package name */
    public final R5 f31295y;

    /* renamed from: z, reason: collision with root package name */
    public C4051vO f31296z;

    /* renamed from: I, reason: collision with root package name */
    public final Object f31286I = new Object();

    /* renamed from: M, reason: collision with root package name */
    public final HashSet f31289M = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (((java.lang.Boolean) r1.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32409x2)).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3414jh(Context context, C2486Bg c2486Bg, InterfaceC4061vh interfaceC4061vh, Integer num) {
        VG vg;
        VG lVar;
        this.f31290n = context;
        this.f31293w = c2486Bg;
        this.J = num;
        this.f31294x = new WeakReference(interfaceC4061vh);
        C3146eh c3146eh = new C3146eh();
        this.f31291u = c3146eh;
        C3649o c3649o = new C3649o(context);
        this.f31292v = c3649o;
        if (u2.z.m()) {
            u2.z.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        f31276N.incrementAndGet();
        EN en = new EN(context, new Qx(14, this));
        final boolean z3 = true;
        AbstractC2772Sd.H(!en.f24604v);
        en.f24588e = new C3534lt(11, c3649o);
        AbstractC2772Sd.H(!en.f24604v);
        en.f24589f = new C3105du(9, c3146eh);
        AbstractC2772Sd.H(!en.f24604v);
        en.f24604v = true;
        C4051vO c4051vO = new C4051vO(en);
        this.f31296z = c4051vO;
        c4051vO.f34696w.b();
        c4051vO.f34695v.T1(this);
        this.f31281D = 0;
        this.f31283F = 0L;
        this.f31282E = 0;
        this.f31287K = new ArrayList();
        this.f31288L = null;
        String p9 = interfaceC4061vh != null ? interfaceC4061vh.p() : null;
        this.f31284G = (String) (p9 == null ? NA.f26470n : new C2909aB(p9)).a();
        this.f31285H = interfaceC4061vh != null ? interfaceC4061vh.r() : 0;
        final String E8 = C4835j.f39730C.f39735c.E(context, interfaceC4061vh.C().f41388n);
        if (!this.f31279B || this.f31278A.limit() <= 0) {
            C3301ha c3301ha = AbstractC3569ma.f32016F2;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            }
            if (c2486Bg.i) {
                z3 = false;
            }
            if (c2486Bg.f23929l) {
                final int i = 0;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3414jh f31072u;

                    {
                        this.f31072u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3613nH mo14c() {
                        switch (i) {
                            case 0:
                                C3414jh c3414jh = this.f31072u;
                                c3414jh.getClass();
                                C3414jh c3414jh2 = true != z3 ? null : c3414jh;
                                C2486Bg c2486Bg2 = c3414jh.f31293w;
                                return new C3522lh(E8, c3414jh2, c2486Bg2.f23922d, c2486Bg2.f23923e, c2486Bg2.f23930m, c2486Bg2.f23931n);
                            case 1:
                                C3414jh c3414jh3 = this.f31072u;
                                c3414jh3.getClass();
                                S0.l lVar2 = new S0.l(21);
                                C3414jh c3414jh4 = true != z3 ? null : c3414jh3;
                                C2486Bg c2486Bg3 = c3414jh3.f31293w;
                                C3939tK c3939tK = new C3939tK(E8, c2486Bg3.f23922d, c2486Bg3.f23923e, true, lVar2);
                                if (c3414jh4 != null) {
                                    c3939tK.k(c3414jh4);
                                }
                                return c3939tK;
                            default:
                                C3414jh c3414jh5 = this.f31072u;
                                c3414jh5.getClass();
                                C3414jh c3414jh6 = true != z3 ? null : c3414jh5;
                                C2486Bg c2486Bg4 = c3414jh5.f31293w;
                                C3093dh c3093dh = new C3093dh(E8, c3414jh6, c2486Bg4.f23922d, c2486Bg4.f23923e, c2486Bg4.f23926h);
                                c3414jh5.f31289M.add(new WeakReference(c3093dh));
                                return c3093dh;
                        }
                    }
                };
            } else if (c2486Bg.f23926h > 0) {
                final int i6 = 2;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3414jh f31072u;

                    {
                        this.f31072u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3613nH mo14c() {
                        switch (i6) {
                            case 0:
                                C3414jh c3414jh = this.f31072u;
                                c3414jh.getClass();
                                C3414jh c3414jh2 = true != z3 ? null : c3414jh;
                                C2486Bg c2486Bg2 = c3414jh.f31293w;
                                return new C3522lh(E8, c3414jh2, c2486Bg2.f23922d, c2486Bg2.f23923e, c2486Bg2.f23930m, c2486Bg2.f23931n);
                            case 1:
                                C3414jh c3414jh3 = this.f31072u;
                                c3414jh3.getClass();
                                S0.l lVar2 = new S0.l(21);
                                C3414jh c3414jh4 = true != z3 ? null : c3414jh3;
                                C2486Bg c2486Bg3 = c3414jh3.f31293w;
                                C3939tK c3939tK = new C3939tK(E8, c2486Bg3.f23922d, c2486Bg3.f23923e, true, lVar2);
                                if (c3414jh4 != null) {
                                    c3939tK.k(c3414jh4);
                                }
                                return c3939tK;
                            default:
                                C3414jh c3414jh5 = this.f31072u;
                                c3414jh5.getClass();
                                C3414jh c3414jh6 = true != z3 ? null : c3414jh5;
                                C2486Bg c2486Bg4 = c3414jh5.f31293w;
                                C3093dh c3093dh = new C3093dh(E8, c3414jh6, c2486Bg4.f23922d, c2486Bg4.f23923e, c2486Bg4.f23926h);
                                c3414jh5.f31289M.add(new WeakReference(c3093dh));
                                return c3093dh;
                        }
                    }
                };
            } else {
                final int i9 = 1;
                vg = new VG(this) { // from class: com.google.android.gms.internal.ads.ih

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3414jh f31072u;

                    {
                        this.f31072u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.VG
                    /* renamed from: c */
                    public final InterfaceC3613nH mo14c() {
                        switch (i9) {
                            case 0:
                                C3414jh c3414jh = this.f31072u;
                                c3414jh.getClass();
                                C3414jh c3414jh2 = true != z3 ? null : c3414jh;
                                C2486Bg c2486Bg2 = c3414jh.f31293w;
                                return new C3522lh(E8, c3414jh2, c2486Bg2.f23922d, c2486Bg2.f23923e, c2486Bg2.f23930m, c2486Bg2.f23931n);
                            case 1:
                                C3414jh c3414jh3 = this.f31072u;
                                c3414jh3.getClass();
                                S0.l lVar2 = new S0.l(21);
                                C3414jh c3414jh4 = true != z3 ? null : c3414jh3;
                                C2486Bg c2486Bg3 = c3414jh3.f31293w;
                                C3939tK c3939tK = new C3939tK(E8, c2486Bg3.f23922d, c2486Bg3.f23923e, true, lVar2);
                                if (c3414jh4 != null) {
                                    c3939tK.k(c3414jh4);
                                }
                                return c3939tK;
                            default:
                                C3414jh c3414jh5 = this.f31072u;
                                c3414jh5.getClass();
                                C3414jh c3414jh6 = true != z3 ? null : c3414jh5;
                                C2486Bg c2486Bg4 = c3414jh5.f31293w;
                                C3093dh c3093dh = new C3093dh(E8, c3414jh6, c2486Bg4.f23922d, c2486Bg4.f23923e, c2486Bg4.f23926h);
                                c3414jh5.f31289M.add(new WeakReference(c3093dh));
                                return c3093dh;
                        }
                    }
                };
            }
            lVar = c2486Bg.i ? new S0.l(10, this, vg) : vg;
            ByteBuffer byteBuffer = this.f31278A;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.f31278A.limit()];
                this.f31278A.get(bArr);
                lVar = new S0.s(12, lVar, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.f31278A.limit()];
            this.f31278A.get(bArr2);
            lVar = new C3308hh(bArr2, 0);
        }
        C3105du c3105du = new C3105du(14, ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32341q)).booleanValue() ? C2866Yb.f28692x : C2866Yb.f28691w);
        V2 v22 = new V2(9);
        R5 r52 = new R5();
        r52.f27173u = lVar;
        r52.f27174v = c3105du;
        r52.f27175w = v22;
        r52.f27172n = com.anythink.basead.exoplayer.h.o.f7742d;
        this.f31295y = r52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void b(int i) {
        this.f31282E += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void c(AbstractC3557mF abstractC3557mF, C2971bJ c2971bJ, boolean z3) {
        if (abstractC3557mF instanceof InterfaceC4157xM) {
            synchronized (this.f31286I) {
                this.f31287K.add((InterfaceC4157xM) abstractC3557mF);
            }
        } else if (abstractC3557mF instanceof C3200fh) {
            this.f31288L = (C3200fh) abstractC3557mF;
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f31294x.get();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue() && interfaceC4061vh != null && this.f31288L.f30294H) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f31288L.J));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f31288L.f30296K));
                u2.D.f41234l.post(new RunnableC3973u0(14, interfaceC4061vh, hashMap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void d(int i) {
        InterfaceC4168xg interfaceC4168xg = this.f31280C;
        if (interfaceC4168xg != null) {
            interfaceC4168xg.T(i);
        }
    }

    public final void finalize() {
        f31276N.decrementAndGet();
        if (u2.z.m()) {
            u2.z.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void i(C3035cd c3035cd) {
        InterfaceC4168xg interfaceC4168xg = this.f31280C;
        if (interfaceC4168xg != null) {
            interfaceC4168xg.s(c3035cd.f29501a, c3035cd.f29502b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void j(DP dp) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f31294x.get();
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue() || interfaceC4061vh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = dp.f24430n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = dp.f24431o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = dp.f24427k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC4061vh.d("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void k(DP dp) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f31294x.get();
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue() || interfaceC4061vh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(dp.f24442z));
        hashMap.put("bitRate", String.valueOf(dp.f24426j));
        int i = dp.f24438v;
        int length = String.valueOf(i).length();
        int i6 = dp.f24439w;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i6).length());
        sb.append(i);
        sb.append("x");
        sb.append(i6);
        hashMap.put("resolution", sb.toString());
        String str = dp.f24430n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = dp.f24431o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = dp.f24427k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC4061vh.d("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void l(C2971bJ c2971bJ, boolean z3, int i) {
        this.f31281D += i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void n(IOException iOException) {
        InterfaceC4168xg interfaceC4168xg = this.f31280C;
        if (interfaceC4168xg != null) {
            if (this.f31293w.f23927j) {
                interfaceC4168xg.u(iOException);
            } else {
                interfaceC4168xg.t("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void o(DN dn) {
        InterfaceC4168xg interfaceC4168xg = this.f31280C;
        if (interfaceC4168xg != null) {
            interfaceC4168xg.t("onPlayerError", dn);
        }
    }

    public final long p() {
        if (this.f31288L != null && this.f31288L.f30295I && this.f31288L.J) {
            return Math.min(this.f31281D, this.f31288L.f30297L);
        }
        return 0L;
    }

    public final long q() {
        if (this.f31288L != null && this.f31288L.f30295I) {
            C3200fh c3200fh = this.f31288L;
            if (c3200fh.f30293G != null) {
                AtomicLong atomicLong = c3200fh.f30299N;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (c3200fh) {
                    try {
                        if (c3200fh.f30298M == null) {
                            c3200fh.f30298M = AbstractC3413jg.f31268a.b(new CallableC3549m7(3, c3200fh));
                        }
                    } finally {
                    }
                }
                if (c3200fh.f30298M.isDone()) {
                    try {
                        c3200fh.f30299N.compareAndSet(-1L, ((Long) c3200fh.f30298M.get()).longValue());
                        return c3200fh.f30299N.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f31286I) {
            while (true) {
                ArrayList arrayList = this.f31287K;
                if (!arrayList.isEmpty()) {
                    long j6 = this.f31283F;
                    Map j9 = ((InterfaceC4157xM) arrayList.remove(0)).j();
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
                                    if (entry.getKey() != null && AbstractC3043cl.D("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f31283F = j6 + j10;
                }
            }
        }
        return this.f31283F;
    }

    public final void r(boolean z3) {
        C3327i c3327i;
        boolean equals;
        if (this.f31296z == null) {
            return;
        }
        int i = 0;
        while (true) {
            C4051vO c4051vO = this.f31296z;
            c4051vO.f34696w.b();
            PN pn = c4051vO.f34695v;
            pn.P0();
            int length = pn.f26765A.length;
            if (i >= 2) {
                return;
            }
            C3649o c3649o = this.f31292v;
            synchronized (c3649o.f32825c) {
                c3327i = c3649o.f32827e;
            }
            c3327i.getClass();
            C3273h c3273h = new C3273h(c3327i);
            boolean z6 = !z3;
            SparseBooleanArray sparseBooleanArray = c3273h.f30694E;
            if (sparseBooleanArray.get(i) != z6) {
                if (z3) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            C3327i c3327i2 = new C3327i(c3273h);
            synchronized (c3649o.f32825c) {
                equals = c3649o.f32827e.equals(c3327i2);
                c3649o.f32827e = c3327i2;
            }
            if (!equals) {
                if (c3327i2.f30978A && c3649o.f32826d == null) {
                    AbstractC2968bG.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                VN vn = c3649o.f32823a;
                if (vn != null) {
                    vn.f28189z.c(10);
                }
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4213yO
    public final void s() {
        InterfaceC4168xg interfaceC4168xg = this.f31280C;
        if (interfaceC4168xg != null) {
            interfaceC4168xg.q();
        }
    }

    public final EQ t(Uri uri) {
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        List list = Collections.EMPTY_LIST;
        C3500lC c3500lC2 = C3500lC.f31745x;
        C3812r1 c3812r1 = C3812r1.f33455a;
        C2954b2 c2954b2 = new C2954b2("", new C(), uri != null ? new L0(uri, c3500lC2) : null, new C4135x0(), C3062d3.f29665C);
        int i = this.f31293w.f23924f;
        R5 r52 = this.f31295y;
        r52.f27172n = i;
        c2954b2.f29185b.getClass();
        return new EQ(c2954b2, (VG) r52.f27173u, (C3105du) r52.f27174v, (V2) r52.f27175w, r52.f27172n);
    }

    public final void u(Uri[] uriArr, ByteBuffer byteBuffer, boolean z3) {
        Object c4053vQ;
        if (this.f31296z != null) {
            this.f31278A = byteBuffer;
            this.f31279B = z3;
            int length = uriArr.length;
            if (length == 1) {
                c4053vQ = t(uriArr[0]);
            } else {
                XP[] xpArr = new XP[length];
                for (int i = 0; i < uriArr.length; i++) {
                    xpArr[i] = t(uriArr[i]);
                }
                c4053vQ = new C4053vQ(new C3084dP(7), xpArr);
            }
            C4051vO c4051vO = this.f31296z;
            c4051vO.f34696w.b();
            PN pn = c4051vO.f34695v;
            pn.P0();
            List singletonList = Collections.singletonList(c4053vQ);
            pn.P0();
            pn.P0();
            pn.X1(pn.f26771D0);
            pn.m2();
            pn.Y++;
            ArrayList arrayList = pn.f26779I;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < singletonList.size(); i6++) {
                C3458kO c3458kO = new C3458kO((XP) singletonList.get(i6), pn.J);
                arrayList2.add(c3458kO);
                arrayList.add(i6, new NN(c3458kO.f31420b, c3458kO.f31419a));
            }
            KQ kq = pn.f26777G0;
            int size = arrayList2.size();
            kq.getClass();
            pn.f26777G0 = new KQ(new Random(kq.f25923a.nextLong())).a(size);
            C3835rO c3835rO = new C3835rO(arrayList, pn.f26777G0);
            boolean g4 = c3835rO.g();
            int i9 = c3835rO.f33584d;
            if (!g4 && i9 < 0) {
                throw new U7.m();
            }
            int k9 = c3835rO.k(false);
            C3566mO c22 = pn.c2(pn.f26771D0, c3835rO, pn.e2(c3835rO, k9, com.anythink.basead.exoplayer.b.f6382b));
            int i10 = c22.f31952e;
            if (i10 == 1) {
                i10 = 1;
            } else {
                if (!c3835rO.g()) {
                    if (k9 != -1) {
                        if (k9 < i9) {
                            i10 = 2;
                        }
                    }
                }
                i10 = 4;
            }
            C3566mO d2 = PN.d2(c22, i10);
            long u3 = AbstractC3159eu.u(com.anythink.basead.exoplayer.b.f6382b);
            KQ kq2 = pn.f26777G0;
            VN vn = pn.f26774F;
            vn.getClass();
            vn.f28189z.b(17, new TN(arrayList2, kq2, k9, u3)).a();
            pn.a2(d2, 0, (pn.f26771D0.f31949b.f32905a.equals(d2.f31949b.f32905a) || pn.f26771D0.f31948a.g()) ? false : true, 4, pn.Z1(d2), -1);
            C4051vO c4051vO2 = this.f31296z;
            c4051vO2.f34696w.b();
            PN pn2 = c4051vO2.f34695v;
            pn2.P0();
            C3566mO c3566mO = pn2.f26771D0;
            if (c3566mO.f31952e == 1) {
                C3566mO e9 = c3566mO.e(null);
                C3566mO d22 = PN.d2(e9, true != e9.f31948a.g() ? 2 : 4);
                pn2.Y++;
                C3212ft c3212ft = pn2.f26774F.f28189z;
                c3212ft.getClass();
                C3104dt g9 = C3212ft.g();
                g9.f29857a = c3212ft.f30468a.obtainMessage(29);
                g9.a();
                pn2.a2(d22, 1, false, 5, com.anythink.basead.exoplayer.b.f6382b, -1);
            }
            f31277O.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3727pN
    public final void e(C2971bJ c2971bJ, boolean z3) {
    }
}
