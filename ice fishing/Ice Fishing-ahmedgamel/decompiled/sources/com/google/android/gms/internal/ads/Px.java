package com.google.android.gms.internal.ads;

import S7.AbstractC0410y;
import X.InterfaceC0417f;
import a8.InterfaceC0451a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class Px {

    /* renamed from: a, reason: collision with root package name */
    public final X7.e f27668a;

    /* renamed from: b, reason: collision with root package name */
    public final C3128du f27669b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.d f27670c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.d f27671d;

    /* renamed from: e, reason: collision with root package name */
    public final a8.d f27672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27673f;

    /* renamed from: g, reason: collision with root package name */
    public C3561lx f27674g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27675h;
    public final InterfaceC0417f i;

    /* renamed from: j, reason: collision with root package name */
    public final C2734On f27676j;

    public Px(InterfaceC0417f adQualityDataStore, C4042ut c4042ut, C2734On dataPinger, C3609mr c3609mr) {
        kotlin.jvm.internal.h.e(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.h.e(dataPinger, "dataPinger");
        this.f27676j = dataPinger;
        this.f27668a = AbstractC0410y.b(new S7.S((ExecutorService) c4042ut.f35366u));
        this.f27669b = new C3128du(5);
        this.f27670c = new a8.d();
        this.f27671d = new a8.d();
        this.f27672e = new a8.d();
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
                int i = kx.f26801w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kx.f26801w = i - Integer.MIN_VALUE;
                    Object obj = kx.f26799u;
                    A7.a aVar = A7.a.f215n;
                    r42 = kx.f26801w;
                    u7.v vVar = u7.v.f41073a;
                    if (r42 != 0) {
                        Q3.b.s(obj);
                        a8.d dVar2 = px.f27672e;
                        kx.f26798n = dVar2;
                        kx.f26801w = 1;
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
                            Q3.b.s(obj);
                            return vVar;
                        }
                        InterfaceC0451a interfaceC0451a = kx.f26798n;
                        Q3.b.s(obj);
                        r42 = interfaceC0451a;
                        C3831qx c3831qx = (C3831qx) obj;
                        if (c3831qx != null && c3831qx.A() != 0) {
                            for (Map.Entry entry : c3831qx.B().entrySet()) {
                                C3561lx c3561lx = (C3561lx) ((C3615mx) entry.getValue()).s();
                                Object value = entry.getValue();
                                kotlin.jvm.internal.h.d(value, "<get-value>(...)");
                                C3615mx c3615mx = (C3615mx) value;
                                InterfaceC2996bL M8 = c3615mx.M();
                                Long l9 = M8 != null ? (Long) AbstractC5119j.E(M8) : null;
                                boolean z6 = false;
                                boolean z9 = c3615mx.N() > c3615mx.O() && !c3615mx.G();
                                if (l9 != null) {
                                    if (c3615mx.K() - l9.longValue() > com.anythink.basead.exoplayer.f.f7973a) {
                                        z6 = true;
                                    }
                                }
                                if (z9 || z6) {
                                    c3561lx.h();
                                    ((C3615mx) c3561lx.f28504u).W(true);
                                }
                                px.f27676j.a((C3615mx) c3561lx.j());
                            }
                            kx.f26798n = null;
                            kx.f26801w = 3;
                            if (px.a(kx) == aVar) {
                                return aVar;
                            }
                        }
                        return vVar;
                    }
                    ?? r43 = kx.f26798n;
                    Q3.b.s(obj);
                    dVar = r43;
                    I0.j jVar = ((X.D) px.i).f3644b;
                    kx.f26798n = dVar;
                    kx.f26801w = 2;
                    obj = V7.o.b(jVar, kx);
                    r42 = dVar;
                }
            }
            if (r42 != 0) {
            }
            I0.j jVar2 = ((X.D) px.i).f3644b;
            kx.f26798n = dVar;
            kx.f26801w = 2;
            obj = V7.o.b(jVar2, kx);
            r42 = dVar;
        } finally {
            ((a8.d) r42).d(null);
        }
        kx = new Kx(px, cVar);
        Object obj2 = kx.f26799u;
        A7.a aVar2 = A7.a.f215n;
        r42 = kx.f26801w;
        u7.v vVar2 = u7.v.f41073a;
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
        boolean z6;
        px.getClass();
        try {
            if (cVar instanceof Dx) {
                dx = (Dx) cVar;
                int i4 = dx.f25261x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    dx.f25261x = i4 - Integer.MIN_VALUE;
                    Object obj = dx.f25259v;
                    A7.a aVar = A7.a.f215n;
                    i = dx.f25261x;
                    if (i != 0) {
                        Q3.b.s(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        dx.f25262y = str;
                        a8.d dVar2 = px.f27670c;
                        dx.f25257n = dVar2;
                        dx.f25258u = currentTimeMillis;
                        dx.f25261x = 1;
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
                        j6 = dx.f25258u;
                        dVar = dx.f25257n;
                        str2 = dx.f25262y;
                        Q3.b.s(obj);
                    }
                    z6 = px.f27673f;
                    u7.v vVar = u7.v.f41073a;
                    if (!z6) {
                        return vVar;
                    }
                    px.f27673f = true;
                    C3561lx c3561lx = (C3561lx) C3615mx.R().s();
                    px.f27674g = c3561lx;
                    c3561lx.h();
                    ((C3615mx) c3561lx.f28504u).S(str2);
                    c3561lx.h();
                    ((C3615mx) c3561lx.f28504u).Y(j6);
                    return vVar;
                }
            }
            z6 = px.f27673f;
            u7.v vVar2 = u7.v.f41073a;
            if (!z6) {
            }
        } finally {
            dVar.d(null);
        }
        dx = new Dx(px, cVar);
        Object obj2 = dx.f25259v;
        A7.a aVar2 = A7.a.f215n;
        i = dx.f25261x;
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
        C4316zx c4316zx;
        int i;
        a8.d dVar;
        a8.d dVar2;
        long j6;
        C3561lx c3561lx;
        px.getClass();
        try {
            if (cVar instanceof C4316zx) {
                c4316zx = (C4316zx) cVar;
                int i4 = c4316zx.f36249x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c4316zx.f36249x = i4 - Integer.MIN_VALUE;
                    Object obj = c4316zx.f36247v;
                    Object obj2 = A7.a.f215n;
                    i = c4316zx.f36249x;
                    u7.v vVar = u7.v.f41073a;
                    if (i != 0) {
                        Q3.b.s(obj);
                        dVar = px.f27671d;
                        c4316zx.f36245n = dVar;
                        c4316zx.f36249x = 1;
                    } else if (i == 1) {
                        dVar = c4316zx.f36245n;
                        Q3.b.s(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                Q3.b.s(obj);
                                c4316zx.f36249x = 4;
                                return px.c(c4316zx) != obj2 ? vVar : obj2;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Q3.b.s(obj);
                            return vVar;
                        }
                        j6 = c4316zx.f36246u;
                        dVar2 = c4316zx.f36245n;
                        Q3.b.s(obj);
                        try {
                            c3561lx = px.f27674g;
                            if (c3561lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3561lx.h();
                            ((C3615mx) c3561lx.f28504u).b0(j6);
                            dVar2.d(null);
                            c4316zx.f36245n = null;
                            c4316zx.f36249x = 3;
                        } finally {
                        }
                    }
                    if (!px.f27675h) {
                        return vVar;
                    }
                    px.f27675h = true;
                    dVar2.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    dVar2 = px.f27670c;
                    c4316zx.f36245n = dVar2;
                    c4316zx.f36246u = currentTimeMillis;
                    c4316zx.f36249x = 2;
                    if (dVar2.c(c4316zx) != obj2) {
                        j6 = currentTimeMillis;
                        c3561lx = px.f27674g;
                        if (c3561lx != null) {
                        }
                    }
                }
            }
            if (!px.f27675h) {
            }
        } finally {
        }
        c4316zx = new C4316zx(px, cVar);
        Object obj3 = c4316zx.f36247v;
        Object obj22 = A7.a.f215n;
        i = c4316zx.f36249x;
        u7.v vVar2 = u7.v.f41073a;
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
        C3561lx c3561lx;
        px.getClass();
        try {
            if (cVar instanceof Ox) {
                ox = (Ox) cVar;
                int i4 = ox.f27473x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    ox.f27473x = i4 - Integer.MIN_VALUE;
                    Object obj = ox.f27471v;
                    A7.a aVar = A7.a.f215n;
                    i = ox.f27473x;
                    u7.v vVar = u7.v.f41073a;
                    if (i != 0) {
                        Q3.b.s(obj);
                        dVar = px.f27671d;
                        ox.f27469n = dVar;
                        ox.f27473x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = ox.f27470u;
                            dVar2 = ox.f27469n;
                            Q3.b.s(obj);
                            try {
                                c3561lx = px.f27674g;
                                if (c3561lx != null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3615mx) c3561lx.f28504u).Q() > 0) {
                                    C3561lx c3561lx2 = px.f27674g;
                                    if (c3561lx2 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList = Collections.unmodifiableList(((C3615mx) c3561lx2.f28504u).P());
                                    kotlin.jvm.internal.h.d(unmodifiableList, "getAdClickTimestampsMsList(...)");
                                    Object D8 = AbstractC5119j.D(unmodifiableList);
                                    kotlin.jvm.internal.h.d(D8, "last(...)");
                                    long longValue = j6 - ((Number) D8).longValue();
                                    C3561lx c3561lx3 = px.f27674g;
                                    if (c3561lx3 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    c3561lx3.h();
                                    ((C3615mx) c3561lx3.f28504u).C();
                                    if (longValue < com.anythink.basead.exoplayer.f.f7973a) {
                                        C3561lx c3561lx4 = px.f27674g;
                                        if (c3561lx4 == null) {
                                            kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                            throw null;
                                        }
                                        int F8 = ((C3615mx) c3561lx4.f28504u).F() + 1;
                                        c3561lx4.h();
                                        ((C3615mx) c3561lx4.f28504u).U(F8);
                                    }
                                }
                                C3561lx c3561lx5 = px.f27674g;
                                if (c3561lx5 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3615mx) c3561lx5.f28504u).N() > 0) {
                                    C3561lx c3561lx6 = px.f27674g;
                                    if (c3561lx6 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList2 = Collections.unmodifiableList(((C3615mx) c3561lx6.f28504u).M());
                                    kotlin.jvm.internal.h.d(unmodifiableList2, "getAppBackgroundTimestampsMsList(...)");
                                    Object D9 = AbstractC5119j.D(unmodifiableList2);
                                    kotlin.jvm.internal.h.d(D9, "last(...)");
                                    long longValue2 = j6 - ((Number) D9).longValue();
                                    C3561lx c3561lx7 = px.f27674g;
                                    if (c3561lx7 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    long I8 = ((C3615mx) c3561lx7.f28504u).I() + longValue2;
                                    c3561lx7.h();
                                    ((C3615mx) c3561lx7.f28504u).X(I8);
                                }
                                C3561lx c3561lx8 = px.f27674g;
                                if (c3561lx8 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                c3561lx8.h();
                                ((C3615mx) c3561lx8.f28504u).A(j6);
                                return vVar;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        dVar = ox.f27469n;
                        Q3.b.s(obj);
                    }
                    if (px.f27675h) {
                        return vVar;
                    }
                    px.f27675h = false;
                    dVar.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    a8.d dVar3 = px.f27670c;
                    ox.f27469n = dVar3;
                    ox.f27470u = currentTimeMillis;
                    ox.f27473x = 2;
                    if (dVar3.c(ox) != aVar) {
                        dVar2 = dVar3;
                        j6 = currentTimeMillis;
                        c3561lx = px.f27674g;
                        if (c3561lx != null) {
                        }
                    }
                    return aVar;
                }
            }
            if (px.f27675h) {
            }
        } finally {
            dVar.d(null);
        }
        ox = new Ox(px, cVar);
        Object obj2 = ox.f27471v;
        A7.a aVar2 = A7.a.f215n;
        i = ox.f27473x;
        u7.v vVar2 = u7.v.f41073a;
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
        InterfaceC0451a interfaceC0451a;
        long j6;
        Object obj;
        C3561lx c3561lx;
        C3615mx c3615mx;
        px.getClass();
        try {
            if (cVar instanceof Ix) {
                ix = (Ix) cVar;
                int i4 = ix.f26379x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    ix.f26379x = i4 - Integer.MIN_VALUE;
                    Object obj2 = ix.f26377v;
                    Object obj3 = A7.a.f215n;
                    i = ix.f26379x;
                    u7.v vVar = u7.v.f41073a;
                    a8.d dVar = px.f27670c;
                    if (i != 0) {
                        Q3.b.s(obj2);
                        ix.f26375n = dVar;
                        ix.f26379x = 1;
                        if (dVar.c(ix) != obj3) {
                            interfaceC0451a = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        interfaceC0451a = (InterfaceC0451a) ix.f26375n;
                        Q3.b.s(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Q3.b.s(obj2);
                                return vVar;
                            }
                            c3615mx = (C3615mx) ix.f26375n;
                            Q3.b.s(obj2);
                            if (px.f27676j.a(c3615mx)) {
                                String D8 = c3615mx.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                ix.f26375n = null;
                                ix.f26379x = 4;
                                if (px.k(D8, ix) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j6 = ix.f26376u;
                        Object obj4 = (InterfaceC0451a) ix.f26375n;
                        Q3.b.s(obj2);
                        obj = obj4;
                        try {
                            c3561lx = px.f27674g;
                            if (c3561lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j6 - ((C3615mx) c3561lx.f28504u).J();
                            C3561lx c3561lx2 = px.f27674g;
                            if (c3561lx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I8 = J - ((C3615mx) c3561lx2.f28504u).I();
                            c3561lx.h();
                            ((C3615mx) c3561lx.f28504u).T(I8);
                            C3561lx c3561lx3 = px.f27674g;
                            if (c3561lx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3561lx3.h();
                            ((C3615mx) c3561lx3.f28504u).a0(j6);
                            C3561lx c3561lx4 = px.f27674g;
                            if (c3561lx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3615mx = (C3615mx) c3561lx4.j();
                            ((a8.d) obj).d(null);
                            ix.f26375n = c3615mx;
                            ix.f26379x = 3;
                        } finally {
                        }
                    }
                    if (px.f27673f) {
                        return vVar;
                    }
                    px.f27673f = false;
                    ((a8.d) interfaceC0451a).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ix.f26375n = dVar;
                    ix.f26376u = currentTimeMillis;
                    ix.f26379x = 2;
                    if (dVar.c(ix) != obj3) {
                        j6 = currentTimeMillis;
                        obj = dVar;
                        c3561lx = px.f27674g;
                        if (c3561lx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (px.f27673f) {
            }
        } finally {
        }
        ix = new Ix(px, cVar);
        Object obj22 = ix.f26377v;
        Object obj32 = A7.a.f215n;
        i = ix.f26379x;
        u7.v vVar2 = u7.v.f41073a;
        a8.d dVar2 = px.f27670c;
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
        InterfaceC0451a interfaceC0451a;
        long j6;
        Object obj;
        C3561lx c3561lx;
        C3615mx c3615mx;
        px.getClass();
        try {
            if (cVar instanceof Mx) {
                mx = (Mx) cVar;
                int i4 = mx.f27165x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    mx.f27165x = i4 - Integer.MIN_VALUE;
                    Object obj2 = mx.f27163v;
                    Object obj3 = A7.a.f215n;
                    i = mx.f27165x;
                    u7.v vVar = u7.v.f41073a;
                    a8.d dVar = px.f27670c;
                    if (i != 0) {
                        Q3.b.s(obj2);
                        mx.f27161n = dVar;
                        mx.f27165x = 1;
                        if (dVar.c(mx) != obj3) {
                            interfaceC0451a = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        interfaceC0451a = (InterfaceC0451a) mx.f27161n;
                        Q3.b.s(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Q3.b.s(obj2);
                                return vVar;
                            }
                            c3615mx = (C3615mx) mx.f27161n;
                            Q3.b.s(obj2);
                            if (px.f27676j.a(c3615mx)) {
                                String D8 = c3615mx.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                mx.f27161n = null;
                                mx.f27165x = 4;
                                if (px.k(D8, mx) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j6 = mx.f27162u;
                        Object obj4 = (InterfaceC0451a) mx.f27161n;
                        Q3.b.s(obj2);
                        obj = obj4;
                        try {
                            c3561lx = px.f27674g;
                            if (c3561lx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j6 - ((C3615mx) c3561lx.f28504u).J();
                            C3561lx c3561lx2 = px.f27674g;
                            if (c3561lx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I8 = J - ((C3615mx) c3561lx2.f28504u).I();
                            c3561lx.h();
                            ((C3615mx) c3561lx.f28504u).T(I8);
                            C3561lx c3561lx3 = px.f27674g;
                            if (c3561lx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3561lx3.h();
                            ((C3615mx) c3561lx3.f28504u).Z(j6);
                            C3561lx c3561lx4 = px.f27674g;
                            if (c3561lx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3561lx4.h();
                            ((C3615mx) c3561lx4.f28504u).V();
                            C3561lx c3561lx5 = px.f27674g;
                            if (c3561lx5 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3615mx = (C3615mx) c3561lx5.j();
                            ((a8.d) obj).d(null);
                            mx.f27161n = c3615mx;
                            mx.f27165x = 3;
                        } finally {
                        }
                    }
                    if (px.f27673f) {
                        return vVar;
                    }
                    px.f27673f = false;
                    ((a8.d) interfaceC0451a).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    mx.f27161n = dVar;
                    mx.f27162u = currentTimeMillis;
                    mx.f27165x = 2;
                    if (dVar.c(mx) != obj3) {
                        j6 = currentTimeMillis;
                        obj = dVar;
                        c3561lx = px.f27674g;
                        if (c3561lx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (px.f27673f) {
            }
        } finally {
        }
        mx = new Mx(px, cVar);
        Object obj22 = mx.f27163v;
        Object obj32 = A7.a.f215n;
        i = mx.f27165x;
        u7.v vVar2 = u7.v.f41073a;
        a8.d dVar2 = px.f27670c;
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
        C3561lx c3561lx;
        px.getClass();
        try {
            if (cVar instanceof Fx) {
                fx = (Fx) cVar;
                int i4 = fx.f25687x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fx.f25687x = i4 - Integer.MIN_VALUE;
                    Object obj = fx.f25685v;
                    A7.a aVar = A7.a.f215n;
                    i = fx.f25687x;
                    if (i != 0) {
                        Q3.b.s(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        a8.d dVar2 = px.f27670c;
                        fx.f25684u = dVar2;
                        fx.f25683n = currentTimeMillis;
                        fx.f25687x = 1;
                        if (dVar2.c(fx) == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                        j6 = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = fx.f25683n;
                        dVar = fx.f25684u;
                        Q3.b.s(obj);
                    }
                    c3561lx = px.f27674g;
                    if (c3561lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    c3561lx.h();
                    ((C3615mx) c3561lx.f28504u).B(j6);
                    dVar.d(null);
                    return u7.v.f41073a;
                }
            }
            c3561lx = px.f27674g;
            if (c3561lx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        fx = new Fx(px, cVar);
        Object obj2 = fx.f25685v;
        A7.a aVar2 = A7.a.f215n;
        i = fx.f25687x;
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
        C4154wx c4154wx;
        A7.a aVar;
        int i;
        a8.d dVar;
        InterfaceC0451a interfaceC0451a;
        Throwable th;
        Object i4;
        try {
            if (cVar instanceof C4154wx) {
                c4154wx = (C4154wx) cVar;
                int i6 = c4154wx.f35690w;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c4154wx.f35690w = i6 - Integer.MIN_VALUE;
                    Object obj = c4154wx.f35688u;
                    aVar = A7.a.f215n;
                    i = c4154wx.f35690w;
                    if (i != 0) {
                        Q3.b.s(obj);
                        dVar = this.f27672e;
                        c4154wx.f35687n = dVar;
                        c4154wx.f35690w = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0451a = c4154wx.f35687n;
                            try {
                                Q3.b.s(obj);
                                ((a8.d) interfaceC0451a).d(null);
                                return u7.v.f41073a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((a8.d) interfaceC0451a).d(null);
                                throw th;
                            }
                        }
                        ?? r22 = c4154wx.f35687n;
                        Q3.b.s(obj);
                        dVar = r22;
                    }
                    InterfaceC0417f interfaceC0417f = this.i;
                    C4208xx c4208xx = new C4208xx(2, null);
                    c4154wx.f35687n = dVar;
                    c4154wx.f35690w = 2;
                    i4 = ((X.D) interfaceC0417f).i(c4208xx, c4154wx);
                    if (i4 != aVar) {
                        interfaceC0451a = dVar;
                        obj = i4;
                        ((a8.d) interfaceC0451a).d(null);
                        return u7.v.f41073a;
                    }
                    return aVar;
                }
            }
            InterfaceC0417f interfaceC0417f2 = this.i;
            C4208xx c4208xx2 = new C4208xx(2, null);
            c4154wx.f35687n = dVar;
            c4154wx.f35690w = 2;
            i4 = ((X.D) interfaceC0417f2).i(c4208xx2, c4154wx);
            if (i4 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            interfaceC0451a = dVar;
            th = th3;
            ((a8.d) interfaceC0451a).d(null);
            throw th;
        }
        c4154wx = new C4154wx(this, cVar);
        Object obj2 = c4154wx.f35688u;
        aVar = A7.a.f215n;
        i = c4154wx.f35690w;
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
        C4100vx c4100vx;
        int i;
        a8.d dVar;
        C3561lx c3561lx;
        try {
            if (cVar instanceof C4100vx) {
                c4100vx = (C4100vx) cVar;
                int i4 = c4100vx.f35543x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c4100vx.f35543x = i4 - Integer.MIN_VALUE;
                    Object obj = c4100vx.f35541v;
                    A7.a aVar = A7.a.f215n;
                    i = c4100vx.f35543x;
                    if (i != 0) {
                        Q3.b.s(obj);
                        a8.d dVar2 = this.f27670c;
                        c4100vx.f35540u = dVar2;
                        c4100vx.f35539n = j6;
                        c4100vx.f35543x = 1;
                        if (dVar2.c(c4100vx) == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = c4100vx.f35539n;
                        dVar = c4100vx.f35540u;
                        Q3.b.s(obj);
                    }
                    c3561lx = this.f27674g;
                    if (c3561lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long J = j6 - ((C3615mx) c3561lx.f28504u).J();
                    C3561lx c3561lx2 = this.f27674g;
                    if (c3561lx2 == null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long I8 = J - ((C3615mx) c3561lx2.f28504u).I();
                    c3561lx.h();
                    ((C3615mx) c3561lx.f28504u).T(I8);
                    dVar.d(null);
                    return u7.v.f41073a;
                }
            }
            c3561lx = this.f27674g;
            if (c3561lx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        c4100vx = new C4100vx(this, cVar);
        Object obj2 = c4100vx.f35541v;
        A7.a aVar2 = A7.a.f215n;
        i = c4100vx.f35543x;
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
        C3561lx c3561lx;
        a8.d dVar;
        C3615mx c3615mx;
        InterfaceC0451a interfaceC0451a;
        try {
            if (cVar instanceof Ax) {
                ax = (Ax) cVar;
                int i4 = ax.f24546x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    ax.f24546x = i4 - Integer.MIN_VALUE;
                    Object obj2 = ax.f24544v;
                    A7.a aVar = A7.a.f215n;
                    i = ax.f24546x;
                    if (i != 0) {
                        Q3.b.s(obj2);
                        a8.d dVar2 = this.f27670c;
                        ax.f24542n = dVar2;
                        ax.f24546x = 1;
                        Object c9 = dVar2.c(ax);
                        obj = dVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0451a = (InterfaceC0451a) ax.f24542n;
                                try {
                                    Q3.b.s(obj2);
                                    ((a8.d) interfaceC0451a).d(null);
                                    return u7.v.f41073a;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            dVar = ax.f24543u;
                            c3615mx = (C3615mx) ax.f24542n;
                            Q3.b.s(obj2);
                            try {
                                InterfaceC0417f interfaceC0417f = this.i;
                                Bx bx = new Bx(c3615mx, null);
                                ax.f24542n = dVar;
                                ax.f24543u = null;
                                ax.f24546x = 3;
                                obj2 = ((X.D) interfaceC0417f).i(bx, ax);
                                if (obj2 != aVar) {
                                    interfaceC0451a = dVar;
                                    ((a8.d) interfaceC0451a).d(null);
                                    return u7.v.f41073a;
                                }
                                return aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC0451a = dVar;
                                throw th;
                            }
                        }
                        Object obj3 = (InterfaceC0451a) ax.f24542n;
                        Q3.b.s(obj2);
                        obj = obj3;
                    }
                    c3561lx = this.f27674g;
                    if (c3561lx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    C3615mx c3615mx2 = (C3615mx) c3561lx.j();
                    ((a8.d) obj).d(null);
                    ax.f24542n = c3615mx2;
                    dVar = this.f27672e;
                    ax.f24543u = dVar;
                    ax.f24546x = 2;
                    if (dVar.c(ax) != aVar) {
                        c3615mx = c3615mx2;
                        InterfaceC0417f interfaceC0417f2 = this.i;
                        Bx bx2 = new Bx(c3615mx, null);
                        ax.f24542n = dVar;
                        ax.f24543u = null;
                        ax.f24546x = 3;
                        obj2 = ((X.D) interfaceC0417f2).i(bx2, ax);
                        if (obj2 != aVar) {
                        }
                    }
                    return aVar;
                }
            }
            c3561lx = this.f27674g;
            if (c3561lx != null) {
            }
        } finally {
            ((a8.d) obj).d(null);
        }
        ax = new Ax(this, cVar);
        Object obj22 = ax.f24544v;
        A7.a aVar2 = A7.a.f215n;
        i = ax.f24546x;
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
        C3992tx c3992tx;
        A7.a aVar;
        int i;
        a8.d dVar;
        Throwable th;
        InterfaceC0451a interfaceC0451a;
        Object i4;
        try {
            if (cVar instanceof C3992tx) {
                c3992tx = (C3992tx) cVar;
                int i6 = c3992tx.f35204x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c3992tx.f35204x = i6 - Integer.MIN_VALUE;
                    Object obj = c3992tx.f35202v;
                    aVar = A7.a.f215n;
                    i = c3992tx.f35204x;
                    if (i != 0) {
                        Q3.b.s(obj);
                        c3992tx.f35200n = str;
                        dVar = this.f27672e;
                        c3992tx.f35201u = dVar;
                        c3992tx.f35204x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0451a = (InterfaceC0451a) c3992tx.f35200n;
                            try {
                                Q3.b.s(obj);
                                ((a8.d) interfaceC0451a).d(null);
                                return u7.v.f41073a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((a8.d) interfaceC0451a).d(null);
                                throw th;
                            }
                        }
                        a8.d dVar2 = c3992tx.f35201u;
                        String str2 = (String) c3992tx.f35200n;
                        Q3.b.s(obj);
                        dVar = dVar2;
                        str = str2;
                    }
                    InterfaceC0417f interfaceC0417f = this.i;
                    C4046ux c4046ux = new C4046ux(str, null);
                    c3992tx.f35200n = dVar;
                    c3992tx.f35201u = null;
                    c3992tx.f35204x = 2;
                    i4 = ((X.D) interfaceC0417f).i(c4046ux, c3992tx);
                    if (i4 != aVar) {
                        a8.d dVar3 = dVar;
                        obj = i4;
                        interfaceC0451a = dVar3;
                        ((a8.d) interfaceC0451a).d(null);
                        return u7.v.f41073a;
                    }
                    return aVar;
                }
            }
            InterfaceC0417f interfaceC0417f2 = this.i;
            C4046ux c4046ux2 = new C4046ux(str, null);
            c3992tx.f35200n = dVar;
            c3992tx.f35201u = null;
            c3992tx.f35204x = 2;
            i4 = ((X.D) interfaceC0417f2).i(c4046ux2, c3992tx);
            if (i4 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            a8.d dVar4 = dVar;
            th = th3;
            interfaceC0451a = dVar4;
            ((a8.d) interfaceC0451a).d(null);
            throw th;
        }
        c3992tx = new C3992tx(this, cVar);
        Object obj2 = c3992tx.f35202v;
        aVar = A7.a.f215n;
        i = c3992tx.f35204x;
        if (i != 0) {
        }
    }
}
