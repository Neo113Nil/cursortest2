package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class BN implements YN {

    /* renamed from: p, reason: collision with root package name */
    public static final C3500lC f23880p;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f23881a;

    /* renamed from: b, reason: collision with root package name */
    public final K7 f23882b;

    /* renamed from: c, reason: collision with root package name */
    public final C4242z f23883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23886f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23887g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23888h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f23889j;

    /* renamed from: k, reason: collision with root package name */
    public final long f23890k;

    /* renamed from: l, reason: collision with root package name */
    public final long f23891l;

    /* renamed from: m, reason: collision with root package name */
    public final C3770qC f23892m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f23893n;

    /* renamed from: o, reason: collision with root package name */
    public long f23894o;

    static {
        PB pb = RB.f27177u;
        Object[] objArr = {"file", "content", "data", "android.resource", com.anythink.basead.exoplayer.j.y.f8269a, "asset"};
        AbstractC2772Sd.j(objArr, 6);
        f23880p = RB.p(objArr, 6);
    }

    public BN() {
        C4242z c4242z = new C4242z();
        C3770qC c3770qC = C3770qC.f33209z;
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(com.anythink.basead.exoplayer.d.f6763b, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f6763b, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f6763b, com.anythink.basead.exoplayer.d.f6763b, "maxBufferMs", "minBufferMs");
        l(com.anythink.basead.exoplayer.d.f6763b, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f23881a = new U7();
        this.f23882b = new K7();
        this.f23883c = c4242z;
        long u3 = AbstractC3159eu.u(50000L);
        this.f23884d = u3;
        long u6 = AbstractC3159eu.u(1000L);
        this.f23885e = u6;
        this.f23886f = u3;
        this.f23887g = u3;
        this.f23888h = u6;
        this.i = u6;
        this.f23889j = AbstractC3159eu.u(com.anythink.basead.exoplayer.i.a.f7883f);
        this.f23890k = u6;
        this.f23891l = AbstractC3159eu.u(0L);
        this.f23893n = new ConcurrentHashMap();
        this.f23892m = C3770qC.a(c3770qC);
        this.f23894o = -1L;
    }

    public static void l(int i, int i6, String str, String str2) {
        if (!(i >= i6)) {
            throw new IllegalArgumentException(AbstractC2639Kg.x("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(XN xn, InterfaceC3757q[] interfaceC3757qArr) {
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        IO io = xn.f28516a;
        Integer num = (Integer) this.f23892m.get(io.f25499a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        AN an = (AN) concurrentHashMap.get(io);
        an.getClass();
        if (intValue == -1) {
            boolean k9 = k(xn);
            int length = interfaceC3757qArr.length;
            int i = 0;
            int i6 = 0;
            while (true) {
                int i9 = com.anythink.basead.exoplayer.b.aY;
                if (i >= length) {
                    break;
                }
                InterfaceC3757q interfaceC3757q = interfaceC3757qArr[i];
                if (interfaceC3757q != null) {
                    int i10 = interfaceC3757q.c().f23637c;
                    if (i10 != -1) {
                        if (i10 == 0) {
                            i9 = 144310272;
                        } else if (i10 != 1) {
                            i9 = i10 != 2 ? i10 != 4 ? 131072 : 26214400 : k9 ? 19660800 : 131072000;
                        }
                    }
                    i6 += i9;
                }
                i++;
            }
            String str = AbstractC3159eu.f29993a;
            intValue = Math.max(com.anythink.basead.exoplayer.b.aY, Math.min(i6, 210239488));
        }
        an.f23668c = intValue;
        i();
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void b(IO io) {
        long id = Thread.currentThread().getId();
        long j6 = this.f23894o;
        AbstractC2772Sd.I("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j6 == -1 || j6 == id);
        this.f23894o = id;
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an == null) {
            AN an2 = new AN();
            an2.f23666a = 1;
            concurrentHashMap.put(io, an2);
        } else {
            an.f23666a++;
        }
        AN an3 = (AN) concurrentHashMap.get(io);
        an3.getClass();
        Integer num = (Integer) this.f23892m.get(io.f25499a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = com.anythink.basead.exoplayer.b.aY;
        }
        an3.f23668c = intValue;
        an3.f23667b = false;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean c(XN xn) {
        int i;
        boolean z3;
        boolean z6;
        int i6;
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        IO io = xn.f28516a;
        AN an = (AN) concurrentHashMap.get(io);
        an.getClass();
        AN an2 = (AN) this.f23893n.get(io);
        an2.getClass();
        synchronized (an2) {
            i = an2.f23669d;
        }
        int i9 = i * com.anythink.basead.exoplayer.b.aX;
        AN an3 = (AN) this.f23893n.get(io);
        an3.getClass();
        int i10 = an3.f23668c;
        if (io.equals(IO.f25498c)) {
            return i9 < i10;
        }
        boolean k9 = k(xn);
        long j6 = k9 ? this.f23885e : this.f23884d;
        long j9 = k9 ? this.f23887g : this.f23886f;
        float f3 = xn.f28520e;
        if (f3 > 1.0f) {
            j6 = Math.min(AbstractC3159eu.y(j6, f3), j9);
        }
        long j10 = xn.f28519d;
        if (j10 < Math.max(j6, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= maxMemory) {
                long freeMemory = runtime.freeMemory();
                C4242z c4242z = this.f23883c;
                synchronized (c4242z) {
                    i6 = c4242z.f35259v * com.anythink.basead.exoplayer.b.aX;
                }
                if (freeMemory + i6 < maxMemory / 25) {
                    z3 = false;
                    z6 = k9 ? i9 < i10 : !(!z3 && i9 >= i10);
                    an.f23667b = z6;
                    if (!z6 && k9 && !z3) {
                        AbstractC2968bG.t("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                    }
                    if (!an.f23667b && j10 < 500000) {
                        AbstractC2968bG.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                }
            }
            z3 = true;
            if (k9) {
            }
            an.f23667b = z6;
            if (!z6) {
                AbstractC2968bG.t("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!an.f23667b) {
                AbstractC2968bG.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j9 || i9 >= i10) {
            an.f23667b = false;
        }
        return an.f23667b;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void d(IO io) {
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an != null) {
            int i = an.f23666a - 1;
            an.f23666a = i;
            if (i == 0) {
                concurrentHashMap.remove(io);
                i();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f23894o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final long e() {
        return this.f23891l;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void f(IO io) {
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an != null) {
            int i = an.f23666a - 1;
            an.f23666a = i;
            if (i == 0) {
                concurrentHashMap.remove(io);
                i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean g(XN xn) {
        long j6;
        boolean z3;
        int i;
        boolean z6 = xn.f28521f;
        boolean k9 = k(xn);
        long j9 = xn.f28519d;
        float f3 = xn.f28520e;
        String str = AbstractC3159eu.f29993a;
        if (f3 != 1.0f) {
            j9 = Math.round(j9 / f3);
        }
        if (z6) {
            if (k9) {
                j6 = this.f23890k;
                z3 = true;
            } else {
                j6 = this.f23889j;
                z3 = false;
            }
        } else if (k9) {
            j6 = this.i;
            z3 = true;
        } else {
            j6 = this.f23888h;
            z3 = false;
        }
        long j10 = xn.f28522g;
        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
            j6 = Math.min(j10 / 2, j6);
        }
        if (j6 > 0 && j9 < j6) {
            if (!z3) {
                IO io = xn.f28516a;
                AN an = (AN) this.f23893n.get(io);
                an.getClass();
                synchronized (an) {
                    i = an.f23669d;
                }
                int i6 = i * com.anythink.basead.exoplayer.b.aX;
                AN an2 = (AN) this.f23893n.get(io);
                an2.getClass();
                if (i6 >= an2.f23668c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final InterfaceC4026v h(IO io) {
        return new C3481ku(this, io);
    }

    public final void i() {
        ConcurrentHashMap concurrentHashMap = this.f23893n;
        boolean isEmpty = concurrentHashMap.isEmpty();
        C4242z c4242z = this.f23883c;
        int i = 0;
        if (isEmpty) {
            synchronized (c4242z) {
                c4242z.C(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((AN) it.next()).f23668c;
            }
            c4242z.C(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean j() {
        Iterator it = this.f23893n.values().iterator();
        while (it.hasNext()) {
            if (((AN) it.next()).f23667b) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(XN xn) {
        Object obj = xn.f28518c.f32905a;
        K7 k72 = this.f23882b;
        AbstractC3604n8 abstractC3604n8 = xn.f28517b;
        L0 l02 = abstractC3604n8.b(abstractC3604n8.o(obj, k72).f25867c, this.f23881a, 0L).f27894b.f29185b;
        if (l02 == null) {
            return false;
        }
        String scheme = l02.f26006a.getScheme();
        return TextUtils.isEmpty(scheme) || f23880p.contains(scheme);
    }
}
