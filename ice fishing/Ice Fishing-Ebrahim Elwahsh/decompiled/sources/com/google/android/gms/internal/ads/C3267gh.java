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

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3267gh implements DN, LO {

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicInteger f31034N = new AtomicInteger(0);

    /* renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f31035O = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public ByteBuffer f31036A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f31037B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC4019ug f31038C;

    /* renamed from: D, reason: collision with root package name */
    public int f31039D;

    /* renamed from: E, reason: collision with root package name */
    public int f31040E;

    /* renamed from: F, reason: collision with root package name */
    public long f31041F;

    /* renamed from: G, reason: collision with root package name */
    public final String f31042G;

    /* renamed from: H, reason: collision with root package name */
    public final int f31043H;
    public Integer J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f31045K;

    /* renamed from: L, reason: collision with root package name */
    public volatile C2995bh f31046L;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31048n;

    /* renamed from: u, reason: collision with root package name */
    public final C2940ah f31049u;

    /* renamed from: v, reason: collision with root package name */
    public final C3554m f31050v;

    /* renamed from: w, reason: collision with root package name */
    public final C4235yg f31051w;

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f31052x;

    /* renamed from: y, reason: collision with root package name */
    public final O5 f31053y;

    /* renamed from: z, reason: collision with root package name */
    public IO f31054z;

    /* renamed from: I, reason: collision with root package name */
    public final Object f31044I = new Object();

    /* renamed from: M, reason: collision with root package name */
    public final HashSet f31047M = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (((java.lang.Boolean) r1.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31828x2)).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3267gh(Context context, C4235yg c4235yg, InterfaceC3858rh interfaceC3858rh, Integer num) {
        ZG zg;
        ZG c2881Yl;
        this.f31048n = context;
        this.f31051w = c4235yg;
        this.J = num;
        this.f31052x = new WeakReference(interfaceC3858rh);
        C2940ah c2940ah = new C2940ah();
        this.f31049u = c2940ah;
        C3554m c3554m = new C3554m(context);
        this.f31050v = c3554m;
        if (t2.C.m()) {
            t2.C.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        f31034N.incrementAndGet();
        SN sn = new SN(context, new Rx(14, this));
        final boolean z8 = true;
        PA.T(!sn.f27557v);
        sn.f27541e = new Mt(10, c3554m);
        PA.T(!sn.f27557v);
        sn.f27542f = new Mu(8, c2940ah);
        PA.T(!sn.f27557v);
        sn.f27557v = true;
        IO io = new IO(sn);
        this.f31054z = io;
        io.f25557w.b();
        io.f25556v.w1(this);
        this.f31039D = 0;
        this.f31041F = 0L;
        this.f31040E = 0;
        this.f31045K = new ArrayList();
        this.f31046L = null;
        String p6 = interfaceC3858rh != null ? interfaceC3858rh.p() : null;
        this.f31042G = (String) (p6 == null ? QA.f27125n : new C3080dB(p6)).a();
        this.f31043H = interfaceC3858rh != null ? interfaceC3858rh.r() : 0;
        final String E8 = p2.j.f39798C.f39803c.E(context, interfaceC3858rh.w().f41217n);
        if (!this.f31037B || this.f31036A.limit() <= 0) {
            C3151ea c3151ea = AbstractC3368ia.f31436F2;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            }
            if (c4235yg.i) {
                z8 = false;
            }
            if (c4235yg.f35373l) {
                final int i = 0;
                zg = new ZG(this) { // from class: com.google.android.gms.internal.ads.eh

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3267gh f30451u;

                    {
                        this.f30451u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.ZG
                    /* renamed from: a */
                    public final InterfaceC3572mH mo9a() {
                        switch (i) {
                            case 0:
                                C3267gh c3267gh = this.f30451u;
                                c3267gh.getClass();
                                C3267gh c3267gh2 = true != z8 ? null : c3267gh;
                                C4235yg c4235yg2 = c3267gh.f31051w;
                                return new C3374ih(E8, c3267gh2, c4235yg2.f35366d, c4235yg2.f35367e, c4235yg2.f35374m, c4235yg2.f35375n);
                            case 1:
                                C3267gh c3267gh3 = this.f30451u;
                                c3267gh3.getClass();
                                C4164xG c4164xG = new C4164xG(4);
                                C3267gh c3267gh4 = true != z8 ? null : c3267gh3;
                                C4235yg c4235yg3 = c3267gh3.f31051w;
                                AK ak = new AK(E8, c4235yg3.f35366d, c4235yg3.f35367e, true, c4164xG);
                                if (c3267gh4 != null) {
                                    ak.a(c3267gh4);
                                }
                                return ak;
                            default:
                                C3267gh c3267gh5 = this.f30451u;
                                c3267gh5.getClass();
                                C3267gh c3267gh6 = true != z8 ? null : c3267gh5;
                                C4235yg c4235yg4 = c3267gh5.f31051w;
                                C2893Zg c2893Zg = new C2893Zg(E8, c3267gh6, c4235yg4.f35366d, c4235yg4.f35367e, c4235yg4.f35370h);
                                c3267gh5.f31047M.add(new WeakReference(c2893Zg));
                                return c2893Zg;
                        }
                    }
                };
            } else if (c4235yg.f35370h > 0) {
                final int i4 = 2;
                zg = new ZG(this) { // from class: com.google.android.gms.internal.ads.eh

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3267gh f30451u;

                    {
                        this.f30451u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.ZG
                    /* renamed from: a */
                    public final InterfaceC3572mH mo9a() {
                        switch (i4) {
                            case 0:
                                C3267gh c3267gh = this.f30451u;
                                c3267gh.getClass();
                                C3267gh c3267gh2 = true != z8 ? null : c3267gh;
                                C4235yg c4235yg2 = c3267gh.f31051w;
                                return new C3374ih(E8, c3267gh2, c4235yg2.f35366d, c4235yg2.f35367e, c4235yg2.f35374m, c4235yg2.f35375n);
                            case 1:
                                C3267gh c3267gh3 = this.f30451u;
                                c3267gh3.getClass();
                                C4164xG c4164xG = new C4164xG(4);
                                C3267gh c3267gh4 = true != z8 ? null : c3267gh3;
                                C4235yg c4235yg3 = c3267gh3.f31051w;
                                AK ak = new AK(E8, c4235yg3.f35366d, c4235yg3.f35367e, true, c4164xG);
                                if (c3267gh4 != null) {
                                    ak.a(c3267gh4);
                                }
                                return ak;
                            default:
                                C3267gh c3267gh5 = this.f30451u;
                                c3267gh5.getClass();
                                C3267gh c3267gh6 = true != z8 ? null : c3267gh5;
                                C4235yg c4235yg4 = c3267gh5.f31051w;
                                C2893Zg c2893Zg = new C2893Zg(E8, c3267gh6, c4235yg4.f35366d, c4235yg4.f35367e, c4235yg4.f35370h);
                                c3267gh5.f31047M.add(new WeakReference(c2893Zg));
                                return c2893Zg;
                        }
                    }
                };
            } else {
                final int i9 = 1;
                zg = new ZG(this) { // from class: com.google.android.gms.internal.ads.eh

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C3267gh f30451u;

                    {
                        this.f30451u = this;
                    }

                    @Override // com.google.android.gms.internal.ads.ZG
                    /* renamed from: a */
                    public final InterfaceC3572mH mo9a() {
                        switch (i9) {
                            case 0:
                                C3267gh c3267gh = this.f30451u;
                                c3267gh.getClass();
                                C3267gh c3267gh2 = true != z8 ? null : c3267gh;
                                C4235yg c4235yg2 = c3267gh.f31051w;
                                return new C3374ih(E8, c3267gh2, c4235yg2.f35366d, c4235yg2.f35367e, c4235yg2.f35374m, c4235yg2.f35375n);
                            case 1:
                                C3267gh c3267gh3 = this.f30451u;
                                c3267gh3.getClass();
                                C4164xG c4164xG = new C4164xG(4);
                                C3267gh c3267gh4 = true != z8 ? null : c3267gh3;
                                C4235yg c4235yg3 = c3267gh3.f31051w;
                                AK ak = new AK(E8, c4235yg3.f35366d, c4235yg3.f35367e, true, c4164xG);
                                if (c3267gh4 != null) {
                                    ak.a(c3267gh4);
                                }
                                return ak;
                            default:
                                C3267gh c3267gh5 = this.f30451u;
                                c3267gh5.getClass();
                                C3267gh c3267gh6 = true != z8 ? null : c3267gh5;
                                C4235yg c4235yg4 = c3267gh5.f31051w;
                                C2893Zg c2893Zg = new C2893Zg(E8, c3267gh6, c4235yg4.f35366d, c4235yg4.f35367e, c4235yg4.f35370h);
                                c3267gh5.f31047M.add(new WeakReference(c2893Zg));
                                return c2893Zg;
                        }
                    }
                };
            }
            c2881Yl = c4235yg.i ? new C2881Yl(21, this, zg) : zg;
            ByteBuffer byteBuffer = this.f31036A;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.f31036A.limit()];
                this.f31036A.get(bArr);
                c2881Yl = new C2881Yl(22, c2881Yl, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.f31036A.limit()];
            this.f31036A.get(bArr2);
            c2881Yl = new C3104dh(bArr2, 0);
        }
        Mu mu = new Mu(13, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31760q)).booleanValue() ? C2837Wb.f28398x : C2837Wb.f28397w);
        T2 t22 = new T2(9);
        O5 o52 = new O5();
        o52.f26649u = c2881Yl;
        o52.f26650v = mu;
        o52.f26651w = t22;
        o52.f26648n = com.anythink.basead.exoplayer.h.o.f7899d;
        this.f31053y = o52;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void b(int i) {
        this.f31040E += i;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void c(int i) {
        InterfaceC4019ug interfaceC4019ug = this.f31038C;
        if (interfaceC4019ug != null) {
            interfaceC4019ug.T(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.DN
    public final void e(AbstractC3624nF abstractC3624nF, C3197fJ c3197fJ, boolean z8) {
        if (abstractC3624nF instanceof KM) {
            synchronized (this.f31044I) {
                this.f31045K.add((KM) abstractC3624nF);
            }
        } else if (abstractC3624nF instanceof C2995bh) {
            this.f31046L = (C2995bh) abstractC3624nF;
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f31052x.get();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() && interfaceC3858rh != null && this.f31046L.f29541H) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f31046L.J));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f31046L.f29543K));
                t2.G.f40858l.post(new MD(15, interfaceC3858rh, hashMap));
            }
        }
    }

    public final void finalize() {
        f31034N.decrementAndGet();
        if (t2.C.m()) {
            t2.C.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.DN
    public final void g(C3197fJ c3197fJ, boolean z8, int i) {
        this.f31039D += i;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void h(C3100dd c3100dd) {
        InterfaceC4019ug interfaceC4019ug = this.f31038C;
        if (interfaceC4019ug != null) {
            interfaceC4019ug.u(c3100dd.f30071a, c3100dd.f30072b);
        }
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void i(RN rn) {
        InterfaceC4019ug interfaceC4019ug = this.f31038C;
        if (interfaceC4019ug != null) {
            interfaceC4019ug.v("onPlayerError", rn);
        }
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void j(TP tp) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f31052x.get();
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() || interfaceC3858rh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = tp.f27775n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = tp.f27776o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = tp.f27772k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC3858rh.a("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void l(TP tp) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f31052x.get();
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() || interfaceC3858rh == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(tp.f27787z));
        hashMap.put("bitRate", String.valueOf(tp.f27771j));
        int i = tp.f27783v;
        int length = String.valueOf(i).length();
        int i4 = tp.f27784w;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append("x");
        sb.append(i4);
        hashMap.put("resolution", sb.toString());
        String str = tp.f27775n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = tp.f27776o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = tp.f27772k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC3858rh.a("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void o(IOException iOException) {
        InterfaceC4019ug interfaceC4019ug = this.f31038C;
        if (interfaceC4019ug != null) {
            if (this.f31051w.f35371j) {
                interfaceC4019ug.w(iOException);
            } else {
                interfaceC4019ug.v("onLoadError", iOException);
            }
        }
    }

    public final long p() {
        if (this.f31046L != null && this.f31046L.f29542I && this.f31046L.J) {
            return Math.min(this.f31039D, this.f31046L.f29544L);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.LO
    public final void q() {
        InterfaceC4019ug interfaceC4019ug = this.f31038C;
        if (interfaceC4019ug != null) {
            interfaceC4019ug.s();
        }
    }

    public final long r() {
        if (this.f31046L != null && this.f31046L.f29542I) {
            C2995bh c2995bh = this.f31046L;
            if (c2995bh.f29540G != null) {
                AtomicLong atomicLong = c2995bh.f29546N;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (c2995bh) {
                    try {
                        if (c2995bh.f29545M == null) {
                            c2995bh.f29545M = AbstractC3212fg.f30738a.b(new CallableC3454k7(3, c2995bh));
                        }
                    } finally {
                    }
                }
                if (c2995bh.f29545M.isDone()) {
                    try {
                        c2995bh.f29546N.compareAndSet(-1L, ((Long) c2995bh.f29545M.get()).longValue());
                        return c2995bh.f29546N.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f31044I) {
            while (true) {
                ArrayList arrayList = this.f31045K;
                if (!arrayList.isEmpty()) {
                    long j9 = this.f31041F;
                    Map h9 = ((KM) arrayList.remove(0)).h();
                    long j10 = 0;
                    if (h9 != null) {
                        Iterator it = h9.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && AbstractC3035cL.D("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f31041F = j9 + j10;
                }
            }
        }
        return this.f31041F;
    }

    public final void s(boolean z8) {
        C3286h c3286h;
        boolean equals;
        if (this.f31054z == null) {
            return;
        }
        int i = 0;
        while (true) {
            IO io = this.f31054z;
            io.f25557w.b();
            C3093dO c3093dO = io.f25556v;
            c3093dO.P0();
            int length = c3093dO.f30002A.length;
            if (i >= 2) {
                return;
            }
            C3554m c3554m = this.f31050v;
            synchronized (c3554m.f32632c) {
                c3286h = c3554m.f32634e;
            }
            c3286h.getClass();
            C3232g c3232g = new C3232g(c3286h);
            boolean z9 = !z8;
            SparseBooleanArray sparseBooleanArray = c3232g.f30933E;
            if (sparseBooleanArray.get(i) != z9) {
                if (z8) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            C3286h c3286h2 = new C3286h(c3232g);
            synchronized (c3554m.f32632c) {
                equals = c3554m.f32634e.equals(c3286h2);
                c3554m.f32634e = c3286h2;
            }
            if (!equals) {
                if (c3286h2.f31121A && c3554m.f32633d == null) {
                    AbstractC3217fl.I("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                C3365iO c3365iO = c3554m.f32630a;
                if (c3365iO != null) {
                    c3365iO.f31382z.c(10);
                }
            }
            i++;
        }
    }

    public final RQ t(Uri uri) {
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        List list = Collections.EMPTY_LIST;
        C3675oC c3675oC2 = C3675oC.f33115x;
        C3987u1 c3987u1 = C3987u1.f34507a;
        C3235g2 c3235g2 = new C3235g2("", new C(), uri != null ? new N0(uri, c3675oC2) : null, new C4256z0(), C3181f3.f30581B);
        int i = this.f31051w.f35368f;
        O5 o52 = this.f31053y;
        o52.f26648n = i;
        c3235g2.f30939b.getClass();
        return new RQ(c3235g2, (ZG) o52.f26649u, (Mu) o52.f26650v, (T2) o52.f26651w, o52.f26648n);
    }

    public final void u(Uri[] uriArr, ByteBuffer byteBuffer, boolean z8) {
        Object iq;
        if (this.f31054z != null) {
            this.f31036A = byteBuffer;
            this.f31037B = z8;
            int length = uriArr.length;
            if (length == 1) {
                iq = t(uriArr[0]);
            } else {
                AbstractC3473kQ[] abstractC3473kQArr = new AbstractC3473kQ[length];
                for (int i = 0; i < uriArr.length; i++) {
                    abstractC3473kQArr[i] = t(uriArr[i]);
                }
                iq = new IQ(new C3796qP(7), abstractC3473kQArr);
            }
            IO io = this.f31054z;
            io.f25557w.b();
            C3093dO c3093dO = io.f25556v;
            c3093dO.P0();
            List singletonList = Collections.singletonList(iq);
            c3093dO.P0();
            c3093dO.P0();
            c3093dO.B1(c3093dO.f30014G0);
            c3093dO.Q1();
            c3093dO.f30034Z++;
            ArrayList arrayList = c3093dO.J;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < singletonList.size(); i4++) {
                C4172xO c4172xO = new C4172xO((AbstractC3473kQ) singletonList.get(i4), c3093dO.f30020K);
                arrayList2.add(c4172xO);
                arrayList.add(i4, new C2984bO(c4172xO.f35145b, c4172xO.f35144a));
            }
            XQ xq = c3093dO.f30019J0;
            int size = arrayList2.size();
            xq.getClass();
            c3093dO.f30019J0 = new XQ(new Random(xq.f28649a.nextLong())).a(size);
            EO eo = new EO(arrayList, c3093dO.f30019J0);
            boolean g9 = eo.g();
            int i9 = eo.f24713d;
            if (!g9 && i9 < 0) {
                throw new Q7.m();
            }
            int k6 = eo.k(false);
            C4280zO G12 = c3093dO.G1(c3093dO.f30014G0, eo, c3093dO.I1(eo, k6, com.anythink.basead.exoplayer.b.f6539b));
            int i10 = G12.f35534e;
            if (i10 == 1) {
                i10 = 1;
            } else {
                if (!eo.g()) {
                    if (k6 != -1) {
                        if (k6 < i9) {
                            i10 = 2;
                        }
                    }
                }
                i10 = 4;
            }
            C4280zO H1 = C3093dO.H1(G12, i10);
            long u7 = AbstractC3548lu.u(com.anythink.basead.exoplayer.b.f6539b);
            XQ xq2 = c3093dO.f30019J0;
            C3365iO c3365iO = c3093dO.f30011F;
            c3365iO.getClass();
            c3365iO.f31382z.b(17, new C3257gO(arrayList2, xq2, k6, u7)).a();
            c3093dO.E1(H1, 0, (c3093dO.f30014G0.f35531b.f24043a.equals(H1.f35531b.f24043a) || c3093dO.f30014G0.f35530a.g()) ? false : true, 4, c3093dO.D1(H1), -1);
            IO io2 = this.f31054z;
            io2.f25557w.b();
            C3093dO c3093dO2 = io2.f25556v;
            c3093dO2.P0();
            C4280zO c4280zO = c3093dO2.f30014G0;
            if (c4280zO.f35534e == 1) {
                C4280zO e6 = c4280zO.e(null);
                C4280zO H12 = C3093dO.H1(e6, true != e6.f35530a.g() ? 2 : 4);
                c3093dO2.f30034Z++;
                C3709ot c3709ot = c3093dO2.f30011F.f31382z;
                c3709ot.getClass();
                C3333ht g10 = C3709ot.g();
                g10.f31278a = c3709ot.f33230a.obtainMessage(29);
                g10.a();
                c3093dO2.E1(H12, 1, false, 5, com.anythink.basead.exoplayer.b.f6539b, -1);
            }
            f31035O.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.DN
    public final void k(C3197fJ c3197fJ, boolean z8) {
    }
}
