package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class BN implements YN {

    /* renamed from: p, reason: collision with root package name */
    public static final C3523lC f24651p;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f24652a;

    /* renamed from: b, reason: collision with root package name */
    public final K7 f24653b;

    /* renamed from: c, reason: collision with root package name */
    public final C4265z f24654c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24655d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24656e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24657f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24658g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24659h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f24660j;

    /* renamed from: k, reason: collision with root package name */
    public final long f24661k;

    /* renamed from: l, reason: collision with root package name */
    public final long f24662l;

    /* renamed from: m, reason: collision with root package name */
    public final C3793qC f24663m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f24664n;

    /* renamed from: o, reason: collision with root package name */
    public long f24665o;

    static {
        PB pb = RB.f27933u;
        Object[] objArr = {"file", "content", "data", "android.resource", com.anythink.basead.exoplayer.j.y.f9055a, "asset"};
        AbstractC2792Sd.j(objArr, 6);
        f24651p = RB.p(objArr, 6);
    }

    public BN() {
        C4265z c4265z = new C4265z();
        C3793qC c3793qC = C3793qC.f33993z;
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(com.anythink.basead.exoplayer.d.f7549b, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f7549b, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f7549b, com.anythink.basead.exoplayer.d.f7549b, "maxBufferMs", "minBufferMs");
        l(com.anythink.basead.exoplayer.d.f7549b, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f24652a = new U7();
        this.f24653b = new K7();
        this.f24654c = c4265z;
        long u6 = AbstractC3182eu.u(50000L);
        this.f24655d = u6;
        long u9 = AbstractC3182eu.u(1000L);
        this.f24656e = u9;
        this.f24657f = u6;
        this.f24658g = u6;
        this.f24659h = u9;
        this.i = u9;
        this.f24660j = AbstractC3182eu.u(com.anythink.basead.exoplayer.i.a.f8669f);
        this.f24661k = u9;
        this.f24662l = AbstractC3182eu.u(0L);
        this.f24664n = new ConcurrentHashMap();
        this.f24663m = C3793qC.a(c3793qC);
        this.f24665o = -1L;
    }

    public static void l(int i, int i4, String str, String str2) {
        if (!(i >= i4)) {
            throw new IllegalArgumentException(AbstractC2659Kg.x("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(XN xn, InterfaceC3780q[] interfaceC3780qArr) {
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        IO io = xn.f29296a;
        Integer num = (Integer) this.f24663m.get(io.f26242a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        AN an = (AN) concurrentHashMap.get(io);
        an.getClass();
        if (intValue == -1) {
            boolean k9 = k(xn);
            int length = interfaceC3780qArr.length;
            int i = 0;
            int i4 = 0;
            while (true) {
                int i6 = com.anythink.basead.exoplayer.b.aY;
                if (i >= length) {
                    break;
                }
                InterfaceC3780q interfaceC3780q = interfaceC3780qArr[i];
                if (interfaceC3780q != null) {
                    int i9 = interfaceC3780q.c().f24417c;
                    if (i9 != -1) {
                        if (i9 == 0) {
                            i6 = 144310272;
                        } else if (i9 != 1) {
                            i6 = i9 != 2 ? i9 != 4 ? 131072 : 26214400 : k9 ? 19660800 : 131072000;
                        }
                    }
                    i4 += i6;
                }
                i++;
            }
            String str = AbstractC3182eu.f30782a;
            intValue = Math.max(com.anythink.basead.exoplayer.b.aY, Math.min(i4, 210239488));
        }
        an.f24448c = intValue;
        i();
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void b(IO io) {
        long id = Thread.currentThread().getId();
        long j6 = this.f24665o;
        AbstractC2792Sd.I("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j6 == -1 || j6 == id);
        this.f24665o = id;
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an == null) {
            AN an2 = new AN();
            an2.f24446a = 1;
            concurrentHashMap.put(io, an2);
        } else {
            an.f24446a++;
        }
        AN an3 = (AN) concurrentHashMap.get(io);
        an3.getClass();
        Integer num = (Integer) this.f24663m.get(io.f26242a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = com.anythink.basead.exoplayer.b.aY;
        }
        an3.f24448c = intValue;
        an3.f24447b = false;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean c(XN xn) {
        int i;
        boolean z6;
        boolean z9;
        int i4;
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        IO io = xn.f29296a;
        AN an = (AN) concurrentHashMap.get(io);
        an.getClass();
        AN an2 = (AN) this.f24664n.get(io);
        an2.getClass();
        synchronized (an2) {
            i = an2.f24449d;
        }
        int i6 = i * com.anythink.basead.exoplayer.b.aX;
        AN an3 = (AN) this.f24664n.get(io);
        an3.getClass();
        int i9 = an3.f24448c;
        if (io.equals(IO.f26241c)) {
            return i6 < i9;
        }
        boolean k9 = k(xn);
        long j6 = k9 ? this.f24656e : this.f24655d;
        long j9 = k9 ? this.f24658g : this.f24657f;
        float f2 = xn.f29300e;
        if (f2 > 1.0f) {
            j6 = Math.min(AbstractC3182eu.y(j6, f2), j9);
        }
        long j10 = xn.f29299d;
        if (j10 < Math.max(j6, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= maxMemory) {
                long freeMemory = runtime.freeMemory();
                C4265z c4265z = this.f24654c;
                synchronized (c4265z) {
                    i4 = c4265z.f36043v * com.anythink.basead.exoplayer.b.aX;
                }
                if (freeMemory + i4 < maxMemory / 25) {
                    z6 = false;
                    z9 = k9 ? i6 < i9 : !(!z6 && i6 >= i9);
                    an.f24447b = z9;
                    if (!z9 && k9 && !z6) {
                        AbstractC2991bG.t("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                    }
                    if (!an.f24447b && j10 < 500000) {
                        AbstractC2991bG.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                }
            }
            z6 = true;
            if (k9) {
            }
            an.f24447b = z9;
            if (!z9) {
                AbstractC2991bG.t("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!an.f24447b) {
                AbstractC2991bG.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j9 || i6 >= i9) {
            an.f24447b = false;
        }
        return an.f24447b;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void d(IO io) {
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an != null) {
            int i = an.f24446a - 1;
            an.f24446a = i;
            if (i == 0) {
                concurrentHashMap.remove(io);
                i();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f24665o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final long e() {
        return this.f24662l;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void f(IO io) {
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        AN an = (AN) concurrentHashMap.get(io);
        if (an != null) {
            int i = an.f24446a - 1;
            an.f24446a = i;
            if (i == 0) {
                concurrentHashMap.remove(io);
                i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean g(XN xn) {
        long j6;
        boolean z6;
        int i;
        boolean z9 = xn.f29301f;
        boolean k9 = k(xn);
        long j9 = xn.f29299d;
        float f2 = xn.f29300e;
        String str = AbstractC3182eu.f30782a;
        if (f2 != 1.0f) {
            j9 = Math.round(j9 / f2);
        }
        if (z9) {
            if (k9) {
                j6 = this.f24661k;
                z6 = true;
            } else {
                j6 = this.f24660j;
                z6 = false;
            }
        } else if (k9) {
            j6 = this.i;
            z6 = true;
        } else {
            j6 = this.f24659h;
            z6 = false;
        }
        long j10 = xn.f29302g;
        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
            j6 = Math.min(j10 / 2, j6);
        }
        if (j6 > 0 && j9 < j6) {
            if (!z6) {
                IO io = xn.f29296a;
                AN an = (AN) this.f24664n.get(io);
                an.getClass();
                synchronized (an) {
                    i = an.f24449d;
                }
                int i4 = i * com.anythink.basead.exoplayer.b.aX;
                AN an2 = (AN) this.f24664n.get(io);
                an2.getClass();
                if (i4 >= an2.f24448c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final InterfaceC4049v h(IO io) {
        return new C3504ku(this, io);
    }

    public final void i() {
        ConcurrentHashMap concurrentHashMap = this.f24664n;
        boolean isEmpty = concurrentHashMap.isEmpty();
        C4265z c4265z = this.f24654c;
        int i = 0;
        if (isEmpty) {
            synchronized (c4265z) {
                c4265z.C(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((AN) it.next()).f24448c;
            }
            c4265z.C(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean j() {
        Iterator it = this.f24664n.values().iterator();
        while (it.hasNext()) {
            if (((AN) it.next()).f24447b) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(XN xn) {
        Object obj = xn.f29298c.f34406a;
        K7 k72 = this.f24653b;
        AbstractC3627n8 abstractC3627n8 = xn.f29297b;
        L0 l02 = abstractC3627n8.b(abstractC3627n8.o(obj, k72).f26619c, this.f24652a, 0L).f28691b.f29973b;
        if (l02 == null) {
            return false;
        }
        String scheme = l02.f26806a.getScheme();
        return TextUtils.isEmpty(scheme) || f24651p.contains(scheme);
    }
}
