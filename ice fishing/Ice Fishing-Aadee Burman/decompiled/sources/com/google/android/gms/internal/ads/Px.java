package com.google.android.gms.internal.ads;

import S7.AbstractC0406y;
import X.InterfaceC0413f;
import a8.InterfaceC0447a;
import g1.C4523c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class Px {

    /* renamed from: a, reason: collision with root package name */
    public final X7.e f26881a;

    /* renamed from: b, reason: collision with root package name */
    public final C3105du f26882b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.d f26883c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.d f26884d;

    /* renamed from: e, reason: collision with root package name */
    public final a8.d f26885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26886f;

    /* renamed from: g, reason: collision with root package name */
    public C3538lx f26887g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26888h;
    public final InterfaceC0413f i;

    /* renamed from: j, reason: collision with root package name */
    public final C2697Nn f26889j;

    public Px(InterfaceC0413f adQualityDataStore, C4019ut c4019ut, C2697Nn dataPinger, C3586mr c3586mr) {
        kotlin.jvm.internal.h.e(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.h.e(dataPinger, "dataPinger");
        this.f26889j = dataPinger;
        this.f26881a = AbstractC0406y.b(new S7.S((ExecutorService) c4019ut.f34603u));
        this.f26882b = new C3105du(5);
        this.f26883c = new a8.d();
        this.f26884d = new a8.d();
        this.f26885e = new a8.d();
        this.i = adQualityDataStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006c, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.Px, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [a8.a] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Px px, B7.c cVar) {
        Kx kx;
        ?? r42;
        a8.d dVar;
        px.getClass();
        try {
            if (cVar instanceof Kx) {
                kx = (Kx) cVar;
                int i = kx.f26001w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kx.f26001w = i - Integer.MIN_VALUE;
                    Object obj = kx.f25999u;
                    A7.a aVar = A7.a.f58n;
                    r42 = kx.f26001w;
                    u7.v vVar = u7.v.f41350a;
                    if (r42 != 0) {
                        com.bumptech.glide.d.k(obj);
                        a8.d dVar2 = px.f26885e;
                        kx.f25998n = dVar2;
                        kx.f26001w = 1;
                        if (dVar2.c(kx) != aVar) {
                            dVar = dVar2;
                        }
                        return aVar;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.d.k(obj);
                            return vVar;
                        }
                        InterfaceC0447a interfaceC0447a = kx.f25998n;
                        com.bumptech.glide.d.k(obj);
                        r42 = interfaceC0447a;
                        C3808qx c3808qx = (C3808qx) obj;
                        if (c3808qx != null && c3808qx.A() != 0) {
                            for (Map.Entry entry : c3808qx.B().entrySet()) {
                                C3538lx c3538lx = (C3538lx) ((C3592mx) entry.getValue()).s();
                                Object value = entry.getValue();
                                kotlin.jvm.internal.h.d(value, "<get-value>(...)");
                                C3592mx c3592mx = (C3592mx) value;
                                InterfaceC2973bL M8 = c3592mx.M();
                                Long l9 = M8 != null ? (Long) AbstractC5129j.G(M8) : null;
                                boolean z3 = false;
                                boolean z6 = c3592mx.N() > c3592mx.O() && !c3592mx.G();
                                if (l9 != null) {
                                    if (c3592mx.K() - l9.longValue() > com.anythink.basead.exoplayer.f.f7187a) {
                                        z3 = true;
                                    }
                                }
                                if (z6 || z3) {
                                    c3538lx.h();
                                    ((C3592mx) c3538lx.f27721u).W(true);
                                }
                                px.f26889j.a((C3592mx) c3538lx.j());
                            }
                            kx.f25998n = null;
                            kx.f26001w = 3;
                            if (px.a(kx) == aVar) {
                                return aVar;
                            }
                        }
                        return vVar;
                    }
                    ?? r43 = kx.f25998n;
                    com.bumptech.glide.d.k(obj);
                    dVar = r43;
                    C4523c c4523c = ((X.D) px.i).f3482b;
                    kx.f25998n = dVar;
                    kx.f26001w = 2;
                    obj = V7.o.b(c4523c, kx);
                    r42 = dVar;
                }
            }
            if (r42 != 0) {
            }
            C4523c c4523c2 = ((X.D) px.i).f3482b;
            kx.f25998n = dVar;
            kx.f26001w = 2;
            obj = V7.o.b(c4523c2, kx);
            r42 = dVar;
        } finally {
            ((a8.d) r42).d(null);
        }
        kx = new Kx(px, cVar);
        Object obj2 = kx.f25999u;
        A7.a aVar2 = A7.a.f58n;
        r42 = kx.f26001w;
        u7.v vVar2 = u7.v.f41350a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0053, B:18:0x005d), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Px px, String str, B7.c cVar) {
        Dx dx;
        int i;
        String str2;
        a8.d dVar;
        long j6;
        boolean z3;
        px.getClass();
        try {
            if (cVar instanceof Dx) {
                dx = (Dx) cVar;
                int i6 = dx.f24500x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    dx.f24500x = i6 - Integer.MIN_VALUE;
                    Object obj = dx.f24498v;
                    A7.a aVar = A7.a.f58n;
                    i = dx.f24500x;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        dx.f24501y = str;
                        a8.d dVar2 = px.f26883c;
                        dx.f24496n = dVar2;
                        dx.f24497u = currentTimeMillis;
                        dx.f24500x = 1;
                        if (dVar2.c(dx) == aVar) {
                            return aVar;
                        }
                        str2 = str;
                        dVar = dVar2;
                        j6 = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = dx.f24497u;
                        dVar = dx.f24496n;
                        str2 = dx.f24501y;
                        com.bumptech.glide.d.k(obj);
                    }
                    z3 = px.f26886f;
                    u7.v vVar = u7.v.f41350a;
                    if (!z3) {
                        return vVar;
                    }
                    px.f26886f = true;
                    C3538lx c3538lx = (C3538lx) C3592mx.R().s();
                    px.f26887g = c3538lx;
                    c3538lx.h();
                    ((C3592mx) c3538lx.f27721u).S(str2);
                    c3538lx.h();
                    ((C3592mx) c3538lx.f27721u).Y(j6);
                    return vVar;
                }
            }
            z3 = px.f26886f;
            u7.v vVar2 = u7.v.f41350a;
            if (!z3) {
            }
        } finally {
            dVar.d(null);
        }
        dx = new Dx(px, cVar);
        Object obj2 = dx.f24498v;
        A7.a aVar2 = A7.a.f58n;
        i = dx.f24500x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r10.b(r7, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        if (r2.c(r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #0 {all -> 0x00aa, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a4, B:30:0x00a9), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00aa, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a4, B:30:0x00a9), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:36:0x005f, B:40:0x0067), top: B:35:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Px px, B7.c cVar) {
        C4293zx c4293zx;
        int i;
        a8.d dVar;
        a8.d dVar2;
        long j6;
        C3538lx c3538lx;
        px.getClass();
        try {
            if (cVar instanceof C4293zx) {
                c4293zx = (C4293zx) cVar;
                int i6 = c4293zx.f35480x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c4293zx.f35480x = i6 - Integer.MIN_VALUE;
                    Object obj = c4293zx.f35478v;
                    Object obj2 = A7.a.f58n;
                    i = c4293zx.f35480x;
                    u7.v vVar = u7.v.f41350a;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        dVar = px.f26884d;
                        c4293zx.f35476n = dVar;
                        c4293zx.f35480x = 1;
                    } else if (i == 1) {
                        dVar = c4293zx.f35476n;
                        com.bumptech.glide.d.k(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                com.bumptech.glide.d.k(obj);
                                c4293zx.f35480x = 4;
                                return px.c(c4293zx) != obj2 ? vVar : obj2;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.d.k(obj);
                            return vVar;
                        }
                        j6 = c4293zx.f35477u;
                        dVar2 = c4293zx.f35476n;
                        com.bumptech.glide.d.k(obj);
                        try {
                            c3538lx = px.f26887g;
                            if (c3538lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3538lx.h();
                            ((C3592mx) c3538lx.f27721u).b0(j6);
                            dVar2.d(null);
                            c4293zx.f35476n = null;
                            c4293zx.f35480x = 3;
                        } finally {
                        }
                    }
                    if (!px.f26888h) {
                        return vVar;
                    }
                    px.f26888h = true;
                    dVar2.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    dVar2 = px.f26883c;
                    c4293zx.f35476n = dVar2;
                    c4293zx.f35477u = currentTimeMillis;
                    c4293zx.f35480x = 2;
                    if (dVar2.c(c4293zx) != obj2) {
                        j6 = currentTimeMillis;
                        c3538lx = px.f26887g;
                        if (c3538lx != null) {
                        }
                    }
                }
            }
            if (!px.f26888h) {
            }
        } finally {
        }
        c4293zx = new C4293zx(px, cVar);
        Object obj3 = c4293zx.f35478v;
        Object obj22 = A7.a.f58n;
        i = c4293zx.f35480x;
        u7.v vVar2 = u7.v.f41350a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x004f, code lost:
    
        if (r2.c(r0) != r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:12:0x0073, B:15:0x0079, B:18:0x0085, B:20:0x0089, B:22:0x00ad, B:24:0x00bd, B:26:0x00c1, B:27:0x00d5, B:28:0x00d8, B:30:0x00dc, B:31:0x00df, B:32:0x00e0, B:33:0x00e3, B:34:0x00e4, B:36:0x00e8, B:38:0x00f2, B:40:0x00f6, B:42:0x011a, B:43:0x012e, B:44:0x0131, B:45:0x0132, B:46:0x0135, B:47:0x0136, B:49:0x013a, B:52:0x0148, B:53:0x014b, B:54:0x014c, B:55:0x014f, B:56:0x0150, B:57:0x0153), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:12:0x0073, B:15:0x0079, B:18:0x0085, B:20:0x0089, B:22:0x00ad, B:24:0x00bd, B:26:0x00c1, B:27:0x00d5, B:28:0x00d8, B:30:0x00dc, B:31:0x00df, B:32:0x00e0, B:33:0x00e3, B:34:0x00e4, B:36:0x00e8, B:38:0x00f2, B:40:0x00f6, B:42:0x011a, B:43:0x012e, B:44:0x0131, B:45:0x0132, B:46:0x0135, B:47:0x0136, B:49:0x013a, B:52:0x0148, B:53:0x014b, B:54:0x014c, B:55:0x014f, B:56:0x0150, B:57:0x0153), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Px px, B7.c cVar) {
        Ox ox;
        int i;
        a8.d dVar;
        a8.d dVar2;
        long j6;
        C3538lx c3538lx;
        px.getClass();
        try {
            if (cVar instanceof Ox) {
                ox = (Ox) cVar;
                int i6 = ox.f26690x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    ox.f26690x = i6 - Integer.MIN_VALUE;
                    Object obj = ox.f26688v;
                    A7.a aVar = A7.a.f58n;
                    i = ox.f26690x;
                    u7.v vVar = u7.v.f41350a;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        dVar = px.f26884d;
                        ox.f26686n = dVar;
                        ox.f26690x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = ox.f26687u;
                            dVar2 = ox.f26686n;
                            com.bumptech.glide.d.k(obj);
                            try {
                                c3538lx = px.f26887g;
                                if (c3538lx != null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3592mx) c3538lx.f27721u).Q() > 0) {
                                    C3538lx c3538lx2 = px.f26887g;
                                    if (c3538lx2 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList = Collections.unmodifiableList(((C3592mx) c3538lx2.f27721u).P());
                                    kotlin.jvm.internal.h.d(unmodifiableList, "getAdClickTimestampsMsList(...)");
                                    Object F8 = AbstractC5129j.F(unmodifiableList);
                                    kotlin.jvm.internal.h.d(F8, "last(...)");
                                    long longValue = j6 - ((Number) F8).longValue();
                                    C3538lx c3538lx3 = px.f26887g;
                                    if (c3538lx3 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    c3538lx3.h();
                                    ((C3592mx) c3538lx3.f27721u).C();
                                    if (longValue < com.anythink.basead.exoplayer.f.f7187a) {
                                        C3538lx c3538lx4 = px.f26887g;
                                        if (c3538lx4 == null) {
                                            kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                            throw null;
                                        }
                                        int F9 = ((C3592mx) c3538lx4.f27721u).F() + 1;
                                        c3538lx4.h();
                                        ((C3592mx) c3538lx4.f27721u).U(F9);
                                    }
                                }
                                C3538lx c3538lx5 = px.f26887g;
                                if (c3538lx5 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3592mx) c3538lx5.f27721u).N() > 0) {
                                    C3538lx c3538lx6 = px.f26887g;
                                    if (c3538lx6 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList2 = Collections.unmodifiableList(((C3592mx) c3538lx6.f27721u).M());
                                    kotlin.jvm.internal.h.d(unmodifiableList2, "getAppBackgroundTimestampsMsList(...)");
                                    Object F10 = AbstractC5129j.F(unmodifiableList2);
                                    kotlin.jvm.internal.h.d(F10, "last(...)");
                                    long longValue2 = j6 - ((Number) F10).longValue();
                                    C3538lx c3538lx7 = px.f26887g;
                                    if (c3538lx7 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    long I8 = ((C3592mx) c3538lx7.f27721u).I() + longValue2;
                                    c3538lx7.h();
                                    ((C3592mx) c3538lx7.f27721u).X(I8);
                                }
                                C3538lx c3538lx8 = px.f26887g;
                                if (c3538lx8 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                c3538lx8.h();
                                ((C3592mx) c3538lx8.f27721u).A(j6);
                                return vVar;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        dVar = ox.f26686n;
                        com.bumptech.glide.d.k(obj);
                    }
                    if (px.f26888h) {
                        return vVar;
                    }
                    px.f26888h = false;
                    dVar.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    a8.d dVar3 = px.f26883c;
                    ox.f26686n = dVar3;
                    ox.f26687u = currentTimeMillis;
                    ox.f26690x = 2;
                    if (dVar3.c(ox) != aVar) {
                        dVar2 = dVar3;
                        j6 = currentTimeMillis;
                        c3538lx = px.f26887g;
                        if (c3538lx != null) {
                        }
                    }
                    return aVar;
                }
            }
            if (px.f26888h) {
            }
        } finally {
            dVar.d(null);
        }
        ox = new Ox(px, cVar);
        Object obj2 = ox.f26688v;
        A7.a aVar2 = A7.a.f58n;
        i = ox.f26690x;
        u7.v vVar2 = u7.v.f41350a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r14.c(r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #1 {all -> 0x00f9, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:38:0x00fb, B:39:0x00fe, B:40:0x00ff, B:41:0x0102, B:42:0x0103, B:43:0x0106, B:44:0x0107, B:45:0x010a), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:38:0x00fb, B:39:0x00fe, B:40:0x00ff, B:41:0x0102, B:42:0x0103, B:43:0x0106, B:44:0x0107, B:45:0x010a), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(Px px, B7.c cVar) {
        Ix ix;
        int i;
        InterfaceC0447a interfaceC0447a;
        long j6;
        Object obj;
        C3538lx c3538lx;
        C3592mx c3592mx;
        px.getClass();
        try {
            if (cVar instanceof Ix) {
                ix = (Ix) cVar;
                int i6 = ix.f25626x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    ix.f25626x = i6 - Integer.MIN_VALUE;
                    Object obj2 = ix.f25624v;
                    Object obj3 = A7.a.f58n;
                    i = ix.f25626x;
                    u7.v vVar = u7.v.f41350a;
                    a8.d dVar = px.f26883c;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj2);
                        ix.f25622n = dVar;
                        ix.f25626x = 1;
                        if (dVar.c(ix) != obj3) {
                            interfaceC0447a = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        interfaceC0447a = (InterfaceC0447a) ix.f25622n;
                        com.bumptech.glide.d.k(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.d.k(obj2);
                                return vVar;
                            }
                            c3592mx = (C3592mx) ix.f25622n;
                            com.bumptech.glide.d.k(obj2);
                            if (px.f26889j.a(c3592mx)) {
                                String D8 = c3592mx.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                ix.f25622n = null;
                                ix.f25626x = 4;
                                if (px.k(D8, ix) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j6 = ix.f25623u;
                        Object obj4 = (InterfaceC0447a) ix.f25622n;
                        com.bumptech.glide.d.k(obj2);
                        obj = obj4;
                        try {
                            c3538lx = px.f26887g;
                            if (c3538lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j6 - ((C3592mx) c3538lx.f27721u).J();
                            C3538lx c3538lx2 = px.f26887g;
                            if (c3538lx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I8 = J - ((C3592mx) c3538lx2.f27721u).I();
                            c3538lx.h();
                            ((C3592mx) c3538lx.f27721u).T(I8);
                            C3538lx c3538lx3 = px.f26887g;
                            if (c3538lx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3538lx3.h();
                            ((C3592mx) c3538lx3.f27721u).a0(j6);
                            C3538lx c3538lx4 = px.f26887g;
                            if (c3538lx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3592mx = (C3592mx) c3538lx4.j();
                            ((a8.d) obj).d(null);
                            ix.f25622n = c3592mx;
                            ix.f25626x = 3;
                        } finally {
                        }
                    }
                    if (px.f26886f) {
                        return vVar;
                    }
                    px.f26886f = false;
                    ((a8.d) interfaceC0447a).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ix.f25622n = dVar;
                    ix.f25623u = currentTimeMillis;
                    ix.f25626x = 2;
                    if (dVar.c(ix) != obj3) {
                        j6 = currentTimeMillis;
                        obj = dVar;
                        c3538lx = px.f26887g;
                        if (c3538lx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (px.f26886f) {
            }
        } finally {
        }
        ix = new Ix(px, cVar);
        Object obj22 = ix.f25624v;
        Object obj32 = A7.a.f58n;
        i = ix.f25626x;
        u7.v vVar2 = u7.v.f41350a;
        a8.d dVar2 = px.f26883c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r14.c(r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x0107, TRY_ENTER, TryCatch #1 {all -> 0x0107, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:37:0x00d4, B:40:0x0109, B:41:0x010c, B:42:0x010d, B:43:0x0110, B:44:0x0111, B:45:0x0114, B:46:0x0115, B:47:0x0118, B:48:0x0119, B:49:0x011c), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:37:0x00d4, B:40:0x0109, B:41:0x010c, B:42:0x010d, B:43:0x0110, B:44:0x0111, B:45:0x0114, B:46:0x0115, B:47:0x0118, B:48:0x0119, B:49:0x011c), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(Px px, B7.c cVar) {
        Mx mx;
        int i;
        InterfaceC0447a interfaceC0447a;
        long j6;
        Object obj;
        C3538lx c3538lx;
        C3592mx c3592mx;
        px.getClass();
        try {
            if (cVar instanceof Mx) {
                mx = (Mx) cVar;
                int i6 = mx.f26380x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    mx.f26380x = i6 - Integer.MIN_VALUE;
                    Object obj2 = mx.f26378v;
                    Object obj3 = A7.a.f58n;
                    i = mx.f26380x;
                    u7.v vVar = u7.v.f41350a;
                    a8.d dVar = px.f26883c;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj2);
                        mx.f26376n = dVar;
                        mx.f26380x = 1;
                        if (dVar.c(mx) != obj3) {
                            interfaceC0447a = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        interfaceC0447a = (InterfaceC0447a) mx.f26376n;
                        com.bumptech.glide.d.k(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.d.k(obj2);
                                return vVar;
                            }
                            c3592mx = (C3592mx) mx.f26376n;
                            com.bumptech.glide.d.k(obj2);
                            if (px.f26889j.a(c3592mx)) {
                                String D8 = c3592mx.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                mx.f26376n = null;
                                mx.f26380x = 4;
                                if (px.k(D8, mx) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j6 = mx.f26377u;
                        Object obj4 = (InterfaceC0447a) mx.f26376n;
                        com.bumptech.glide.d.k(obj2);
                        obj = obj4;
                        try {
                            c3538lx = px.f26887g;
                            if (c3538lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j6 - ((C3592mx) c3538lx.f27721u).J();
                            C3538lx c3538lx2 = px.f26887g;
                            if (c3538lx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I8 = J - ((C3592mx) c3538lx2.f27721u).I();
                            c3538lx.h();
                            ((C3592mx) c3538lx.f27721u).T(I8);
                            C3538lx c3538lx3 = px.f26887g;
                            if (c3538lx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3538lx3.h();
                            ((C3592mx) c3538lx3.f27721u).Z(j6);
                            C3538lx c3538lx4 = px.f26887g;
                            if (c3538lx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3538lx4.h();
                            ((C3592mx) c3538lx4.f27721u).V();
                            C3538lx c3538lx5 = px.f26887g;
                            if (c3538lx5 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3592mx = (C3592mx) c3538lx5.j();
                            ((a8.d) obj).d(null);
                            mx.f26376n = c3592mx;
                            mx.f26380x = 3;
                        } finally {
                        }
                    }
                    if (px.f26886f) {
                        return vVar;
                    }
                    px.f26886f = false;
                    ((a8.d) interfaceC0447a).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    mx.f26376n = dVar;
                    mx.f26377u = currentTimeMillis;
                    mx.f26380x = 2;
                    if (dVar.c(mx) != obj3) {
                        j6 = currentTimeMillis;
                        obj = dVar;
                        c3538lx = px.f26887g;
                        if (c3538lx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (px.f26886f) {
            }
        } finally {
        }
        mx = new Mx(px, cVar);
        Object obj22 = mx.f26378v;
        Object obj32 = A7.a.f58n;
        i = mx.f26380x;
        u7.v vVar2 = u7.v.f41350a;
        a8.d dVar2 = px.f26883c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004e, B:14:0x0052, B:18:0x0062, B:19:0x0067), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004e, B:14:0x0052, B:18:0x0062, B:19:0x0067), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(Px px, B7.c cVar) {
        Fx fx;
        int i;
        a8.d dVar;
        long j6;
        C3538lx c3538lx;
        px.getClass();
        try {
            if (cVar instanceof Fx) {
                fx = (Fx) cVar;
                int i6 = fx.f24897x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    fx.f24897x = i6 - Integer.MIN_VALUE;
                    Object obj = fx.f24895v;
                    A7.a aVar = A7.a.f58n;
                    i = fx.f24897x;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        a8.d dVar2 = px.f26883c;
                        fx.f24894u = dVar2;
                        fx.f24893n = currentTimeMillis;
                        fx.f24897x = 1;
                        if (dVar2.c(fx) == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                        j6 = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = fx.f24893n;
                        dVar = fx.f24894u;
                        com.bumptech.glide.d.k(obj);
                    }
                    c3538lx = px.f26887g;
                    if (c3538lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    c3538lx.h();
                    ((C3592mx) c3538lx.f27721u).B(j6);
                    dVar.d(null);
                    return u7.v.f41350a;
                }
            }
            c3538lx = px.f26887g;
            if (c3538lx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        fx = new Fx(px, cVar);
        Object obj2 = fx.f24895v;
        A7.a aVar2 = A7.a.f58n;
        i = fx.f24897x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r8.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v4, types: [a8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B7.c cVar) {
        C4131wx c4131wx;
        A7.a aVar;
        int i;
        a8.d dVar;
        InterfaceC0447a interfaceC0447a;
        Throwable th;
        Object i6;
        try {
            if (cVar instanceof C4131wx) {
                c4131wx = (C4131wx) cVar;
                int i9 = c4131wx.f34909w;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c4131wx.f34909w = i9 - Integer.MIN_VALUE;
                    Object obj = c4131wx.f34907u;
                    aVar = A7.a.f58n;
                    i = c4131wx.f34909w;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        dVar = this.f26885e;
                        c4131wx.f34906n = dVar;
                        c4131wx.f34909w = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0447a = c4131wx.f34906n;
                            try {
                                com.bumptech.glide.d.k(obj);
                                ((a8.d) interfaceC0447a).d(null);
                                return u7.v.f41350a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((a8.d) interfaceC0447a).d(null);
                                throw th;
                            }
                        }
                        ?? r22 = c4131wx.f34906n;
                        com.bumptech.glide.d.k(obj);
                        dVar = r22;
                    }
                    InterfaceC0413f interfaceC0413f = this.i;
                    C4185xx c4185xx = new C4185xx(2, null);
                    c4131wx.f34906n = dVar;
                    c4131wx.f34909w = 2;
                    i6 = ((X.D) interfaceC0413f).i(c4185xx, c4131wx);
                    if (i6 != aVar) {
                        interfaceC0447a = dVar;
                        obj = i6;
                        ((a8.d) interfaceC0447a).d(null);
                        return u7.v.f41350a;
                    }
                    return aVar;
                }
            }
            InterfaceC0413f interfaceC0413f2 = this.i;
            C4185xx c4185xx2 = new C4185xx(2, null);
            c4131wx.f34906n = dVar;
            c4131wx.f34909w = 2;
            i6 = ((X.D) interfaceC0413f2).i(c4185xx2, c4131wx);
            if (i6 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            interfaceC0447a = dVar;
            th = th3;
            ((a8.d) interfaceC0447a).d(null);
            throw th;
        }
        c4131wx = new C4131wx(this, cVar);
        Object obj2 = c4131wx.f34907u;
        aVar = A7.a.f58n;
        i = c4131wx.f34909w;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:12:0x0046, B:15:0x004c, B:17:0x0059, B:21:0x0072, B:22:0x0075, B:23:0x0078, B:24:0x007b), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:12:0x0046, B:15:0x004c, B:17:0x0059, B:21:0x0072, B:22:0x0075, B:23:0x0078, B:24:0x007b), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j6, B7.c cVar) {
        C4077vx c4077vx;
        int i;
        a8.d dVar;
        C3538lx c3538lx;
        try {
            if (cVar instanceof C4077vx) {
                c4077vx = (C4077vx) cVar;
                int i6 = c4077vx.f34774x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c4077vx.f34774x = i6 - Integer.MIN_VALUE;
                    Object obj = c4077vx.f34772v;
                    A7.a aVar = A7.a.f58n;
                    i = c4077vx.f34774x;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        a8.d dVar2 = this.f26883c;
                        c4077vx.f34771u = dVar2;
                        c4077vx.f34770n = j6;
                        c4077vx.f34774x = 1;
                        if (dVar2.c(c4077vx) == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = c4077vx.f34770n;
                        dVar = c4077vx.f34771u;
                        com.bumptech.glide.d.k(obj);
                    }
                    c3538lx = this.f26887g;
                    if (c3538lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long J = j6 - ((C3592mx) c3538lx.f27721u).J();
                    C3538lx c3538lx2 = this.f26887g;
                    if (c3538lx2 == null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long I8 = J - ((C3592mx) c3538lx2.f27721u).I();
                    c3538lx.h();
                    ((C3592mx) c3538lx.f27721u).T(I8);
                    dVar.d(null);
                    return u7.v.f41350a;
                }
            }
            c3538lx = this.f26887g;
            if (c3538lx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        c4077vx = new C4077vx(this, cVar);
        Object obj2 = c4077vx.f34772v;
        A7.a aVar2 = A7.a.f58n;
        i = c4077vx.f34774x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005b, code lost:
    
        if (r8 != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:35:0x005d, B:37:0x0061, B:41:0x00a5, B:42:0x00aa), top: B:34:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #1 {all -> 0x00a3, blocks: (B:35:0x005d, B:37:0x0061, B:41:0x00a5, B:42:0x00aa), top: B:34:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(B7.c cVar) {
        Ax ax;
        int i;
        Object obj;
        C3538lx c3538lx;
        a8.d dVar;
        C3592mx c3592mx;
        InterfaceC0447a interfaceC0447a;
        try {
            if (cVar instanceof Ax) {
                ax = (Ax) cVar;
                int i6 = ax.f23774x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    ax.f23774x = i6 - Integer.MIN_VALUE;
                    Object obj2 = ax.f23772v;
                    A7.a aVar = A7.a.f58n;
                    i = ax.f23774x;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj2);
                        a8.d dVar2 = this.f26883c;
                        ax.f23770n = dVar2;
                        ax.f23774x = 1;
                        Object c9 = dVar2.c(ax);
                        obj = dVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0447a = (InterfaceC0447a) ax.f23770n;
                                try {
                                    com.bumptech.glide.d.k(obj2);
                                    ((a8.d) interfaceC0447a).d(null);
                                    return u7.v.f41350a;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            dVar = ax.f23771u;
                            c3592mx = (C3592mx) ax.f23770n;
                            com.bumptech.glide.d.k(obj2);
                            try {
                                InterfaceC0413f interfaceC0413f = this.i;
                                Bx bx = new Bx(c3592mx, null);
                                ax.f23770n = dVar;
                                ax.f23771u = null;
                                ax.f23774x = 3;
                                obj2 = ((X.D) interfaceC0413f).i(bx, ax);
                                if (obj2 != aVar) {
                                    interfaceC0447a = dVar;
                                    ((a8.d) interfaceC0447a).d(null);
                                    return u7.v.f41350a;
                                }
                                return aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC0447a = dVar;
                                throw th;
                            }
                        }
                        Object obj3 = (InterfaceC0447a) ax.f23770n;
                        com.bumptech.glide.d.k(obj2);
                        obj = obj3;
                    }
                    c3538lx = this.f26887g;
                    if (c3538lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    C3592mx c3592mx2 = (C3592mx) c3538lx.j();
                    ((a8.d) obj).d(null);
                    ax.f23770n = c3592mx2;
                    dVar = this.f26885e;
                    ax.f23771u = dVar;
                    ax.f23774x = 2;
                    if (dVar.c(ax) != aVar) {
                        c3592mx = c3592mx2;
                        InterfaceC0413f interfaceC0413f2 = this.i;
                        Bx bx2 = new Bx(c3592mx, null);
                        ax.f23770n = dVar;
                        ax.f23771u = null;
                        ax.f23774x = 3;
                        obj2 = ((X.D) interfaceC0413f2).i(bx2, ax);
                        if (obj2 != aVar) {
                        }
                    }
                    return aVar;
                }
            }
            c3538lx = this.f26887g;
            if (c3538lx != null) {
            }
        } finally {
            ((a8.d) obj).d(null);
        }
        ax = new Ax(this, cVar);
        Object obj22 = ax.f23772v;
        A7.a aVar2 = A7.a.f58n;
        i = ax.f23774x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r9.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, B7.c cVar) {
        C3969tx c3969tx;
        A7.a aVar;
        int i;
        a8.d dVar;
        Throwable th;
        InterfaceC0447a interfaceC0447a;
        Object i6;
        try {
            if (cVar instanceof C3969tx) {
                c3969tx = (C3969tx) cVar;
                int i9 = c3969tx.f34430x;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c3969tx.f34430x = i9 - Integer.MIN_VALUE;
                    Object obj = c3969tx.f34428v;
                    aVar = A7.a.f58n;
                    i = c3969tx.f34430x;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        c3969tx.f34426n = str;
                        dVar = this.f26885e;
                        c3969tx.f34427u = dVar;
                        c3969tx.f34430x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0447a = (InterfaceC0447a) c3969tx.f34426n;
                            try {
                                com.bumptech.glide.d.k(obj);
                                ((a8.d) interfaceC0447a).d(null);
                                return u7.v.f41350a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((a8.d) interfaceC0447a).d(null);
                                throw th;
                            }
                        }
                        a8.d dVar2 = c3969tx.f34427u;
                        String str2 = (String) c3969tx.f34426n;
                        com.bumptech.glide.d.k(obj);
                        dVar = dVar2;
                        str = str2;
                    }
                    InterfaceC0413f interfaceC0413f = this.i;
                    C4023ux c4023ux = new C4023ux(str, null);
                    c3969tx.f34426n = dVar;
                    c3969tx.f34427u = null;
                    c3969tx.f34430x = 2;
                    i6 = ((X.D) interfaceC0413f).i(c4023ux, c3969tx);
                    if (i6 != aVar) {
                        a8.d dVar3 = dVar;
                        obj = i6;
                        interfaceC0447a = dVar3;
                        ((a8.d) interfaceC0447a).d(null);
                        return u7.v.f41350a;
                    }
                    return aVar;
                }
            }
            InterfaceC0413f interfaceC0413f2 = this.i;
            C4023ux c4023ux2 = new C4023ux(str, null);
            c3969tx.f34426n = dVar;
            c3969tx.f34427u = null;
            c3969tx.f34430x = 2;
            i6 = ((X.D) interfaceC0413f2).i(c4023ux2, c3969tx);
            if (i6 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            a8.d dVar4 = dVar;
            th = th3;
            interfaceC0447a = dVar4;
            ((a8.d) interfaceC0447a).d(null);
            throw th;
        }
        c3969tx = new C3969tx(this, cVar);
        Object obj2 = c3969tx.f34428v;
        aVar = A7.a.f58n;
        i = c3969tx.f34430x;
        if (i != 0) {
        }
    }
}
