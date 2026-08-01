package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4269zQ {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f35332a;

    /* renamed from: b, reason: collision with root package name */
    public final C2991bm f35333b;

    /* renamed from: c, reason: collision with root package name */
    public final C4274ze f35334c;

    /* renamed from: d, reason: collision with root package name */
    public final CQ f35335d;

    /* renamed from: e, reason: collision with root package name */
    public final C2781Sm f35336e;

    /* renamed from: f, reason: collision with root package name */
    public final U0 f35337f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f35338g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35339h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public C2971bJ f35340j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3543m1 f35341k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35342l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CQ f35343m;

    public C4269zQ(CQ cq, Uri uri, InterfaceC3613nH interfaceC3613nH, C4274ze c4274ze, CQ cq2, C2781Sm c2781Sm) {
        Objects.requireNonNull(cq);
        this.f35343m = cq;
        this.f35332a = uri;
        this.f35333b = new C2991bm(interfaceC3613nH);
        this.f35334c = c4274ze;
        this.f35335d = cq2;
        this.f35336e = c2781Sm;
        this.f35337f = new U0();
        this.f35339h = true;
        C3246gQ.f30569a.getAndIncrement();
        this.f35340j = b(null, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0262, code lost:
    
        if (r3 != 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0264, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0276, code lost:
    
        r0.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        if (r8.r() == (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026e, code lost:
    
        r27.f35337f.f27844n = r8.r();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5 A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147 A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187 A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6 A[Catch: all -> 0x00c8, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #3 {all -> 0x00c8, blocks: (B:155:0x0096, B:157:0x009c, B:21:0x00db, B:23:0x00e5, B:24:0x00f2, B:26:0x00fc, B:27:0x0109, B:29:0x0113, B:30:0x0120, B:32:0x012a, B:33:0x013d, B:35:0x0147, B:37:0x014e, B:41:0x0187, B:42:0x0191, B:44:0x019b, B:46:0x01a0, B:49:0x01ab, B:50:0x01cf, B:52:0x01e6, B:55:0x01ed, B:57:0x01f1, B:58:0x01f6, B:60:0x01fa, B:143:0x0158, B:146:0x0178, B:162:0x00a8, B:165:0x00cd), top: B:154:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        long j6;
        int i6;
        int i9;
        int i10;
        boolean z3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z6;
        List list5;
        int i11;
        C2991bm c2991bm;
        CQ cq;
        T1 t12;
        C2991bm c2991bm2;
        int i12;
        Q0 q02;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        String str4 = null;
        while (i16 == 0 && !this.f35338g) {
            try {
                long j9 = this.f35337f.f27844n;
                C2971bJ b9 = b(str4, j9);
                this.f35340j = b9;
                C2991bm c2991bm3 = this.f35333b;
                long g4 = c2991bm3.g(b9);
                if (this.f35338g) {
                    C4274ze c4274ze = this.f35334c;
                    if (c4274ze.r() != -1) {
                        this.f35337f.f27844n = c4274ze.r();
                    }
                    try {
                        this.f35333b.o();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                List list6 = (List) ((InterfaceC3613nH) c2991bm3.f29323u).j().get("ETag");
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i15);
                if (g4 != -1) {
                    g4 += j9;
                    CQ cq2 = this.f35343m;
                    cq2.getClass();
                    cq2.f24125H.post(new F(cq2, 2));
                }
                long j10 = g4;
                CQ cq3 = this.f35343m;
                Map j11 = ((InterfaceC3613nH) c2991bm3.f29323u).j();
                List list7 = (List) j11.get("icy-br");
                j6 = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(i15);
                        try {
                            i9 = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused2) {
                            i9 = -1;
                        }
                        if (i9 > 0) {
                            i10 = i9;
                            z3 = true;
                            list = (List) j11.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z3 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) j11.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z3 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) j11.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z3 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) j11.get("icy-pub");
                            if (list4 != null) {
                                z6 = ((String) list4.get(0)).equals("1");
                                z3 = true;
                            } else {
                                z6 = false;
                            }
                            list5 = (List) j11.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i14 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused3) {
                                    i14 = -1;
                                }
                                if (i14 > 0) {
                                    i11 = i14;
                                    z3 = true;
                                    cq3.J = z3 ? new T1(i10, i11, str, str2, str3, z6) : null;
                                    c2991bm = this.f35333b;
                                    cq = this.f35343m;
                                    t12 = cq.J;
                                    if (t12 != null || (i13 = t12.f27677f) == -1) {
                                        c2991bm2 = c2991bm;
                                    } else {
                                        C2545Eo c2545Eo = new C2545Eo();
                                        AbstractC2772Sd.i(i13 > 0);
                                        c2545Eo.f24651v = c2991bm;
                                        c2545Eo.f24649n = i13;
                                        c2545Eo.f24652w = this;
                                        c2545Eo.f24653x = new byte[1];
                                        c2545Eo.f24650u = i13;
                                        InterfaceC3543m1 o6 = cq.o(new BQ(0, true));
                                        this.f35341k = o6;
                                        o6.e(CQ.f24117v0);
                                        c2991bm2 = c2545Eo;
                                    }
                                    C4274ze c4274ze2 = this.f35334c;
                                    c4274ze2.l(c2991bm2, this.f35332a, ((InterfaceC3613nH) c2991bm.f29323u).j(), j9, j10, this.f35335d);
                                    if (cq.J != null && (q02 = (Q0) c4274ze2.f35361v) != null && (q02 instanceof C4137x2)) {
                                        ((C4137x2) q02).f34935q = true;
                                    }
                                    if (this.f35339h) {
                                        long j12 = this.i;
                                        Q0 q03 = (Q0) c4274ze2.f35361v;
                                        q03.getClass();
                                        q03.c(j9, j12);
                                        this.f35339h = false;
                                    }
                                    i16 = 0;
                                    while (true) {
                                        if (i16 != 0) {
                                            i12 = 0;
                                            break;
                                        }
                                        try {
                                            if (this.f35338g) {
                                                i12 = 0;
                                                i16 = 0;
                                                break;
                                            }
                                            try {
                                                C2781Sm c2781Sm = this.f35336e;
                                                synchronized (c2781Sm) {
                                                    while (!c2781Sm.f27548a) {
                                                        c2781Sm.wait();
                                                    }
                                                }
                                                U0 u02 = this.f35337f;
                                                Q0 q04 = (Q0) c4274ze2.f35361v;
                                                if (q04 == null) {
                                                    throw null;
                                                }
                                                K0 k02 = (K0) c4274ze2.f35362w;
                                                if (k02 == null) {
                                                    throw null;
                                                }
                                                i16 = q04.a(k02, u02);
                                                long r9 = c4274ze2.r();
                                                if (r9 > cq.f24118A + j9) {
                                                    synchronized (c2781Sm) {
                                                        c2781Sm.f27548a = false;
                                                    }
                                                    cq.f24125H.post(cq.f24124G);
                                                    j9 = r9;
                                                }
                                            } catch (InterruptedException unused4) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i6 = i16;
                                            if (i6 != 1) {
                                            }
                                            try {
                                                this.f35333b.o();
                                            } catch (IOException unused5) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        AbstractC2968bG.y("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused6) {
                                        AbstractC2968bG.y("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i11 = i14;
                                        cq3.J = z3 ? new T1(i10, i11, str, str2, str3, z6) : null;
                                        c2991bm = this.f35333b;
                                        cq = this.f35343m;
                                        t12 = cq.J;
                                        if (t12 != null) {
                                        }
                                        c2991bm2 = c2991bm;
                                        C4274ze c4274ze22 = this.f35334c;
                                        c4274ze22.l(c2991bm2, this.f35332a, ((InterfaceC3613nH) c2991bm.f29323u).j(), j9, j10, this.f35335d);
                                        if (cq.J != null) {
                                        }
                                        if (this.f35339h) {
                                        }
                                        i16 = 0;
                                        while (true) {
                                            if (i16 != 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            i11 = -1;
                            cq3.J = z3 ? new T1(i10, i11, str, str2, str3, z6) : null;
                            c2991bm = this.f35333b;
                            cq = this.f35343m;
                            t12 = cq.J;
                            if (t12 != null) {
                            }
                            c2991bm2 = c2991bm;
                            C4274ze c4274ze222 = this.f35334c;
                            c4274ze222.l(c2991bm2, this.f35332a, ((InterfaceC3613nH) c2991bm.f29323u).j(), j9, j10, this.f35335d);
                            if (cq.J != null) {
                                ((C4137x2) q02).f34935q = true;
                            }
                            if (this.f35339h) {
                            }
                            i16 = 0;
                            while (true) {
                                if (i16 != 0) {
                                }
                            }
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                AbstractC2968bG.y("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused7) {
                                AbstractC2968bG.y("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i10 = i9;
                                z3 = false;
                                list = (List) j11.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) j11.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) j11.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) j11.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) j11.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i11 = -1;
                                cq3.J = z3 ? new T1(i10, i11, str, str2, str3, z6) : null;
                                c2991bm = this.f35333b;
                                cq = this.f35343m;
                                t12 = cq.J;
                                if (t12 != null) {
                                }
                                c2991bm2 = c2991bm;
                                C4274ze c4274ze2222 = this.f35334c;
                                c4274ze2222.l(c2991bm2, this.f35332a, ((InterfaceC3613nH) c2991bm.f29323u).j(), j9, j10, this.f35335d);
                                if (cq.J != null) {
                                }
                                if (this.f35339h) {
                                }
                                i16 = 0;
                                while (true) {
                                    if (i16 != 0) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        i6 = i;
                        if (i6 != 1) {
                            C4274ze c4274ze3 = this.f35334c;
                            if (c4274ze3.r() != j6) {
                                this.f35337f.f27844n = c4274ze3.r();
                            }
                        }
                        this.f35333b.o();
                        throw th;
                    }
                }
                z3 = false;
                i10 = -1;
                list = (List) j11.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) j11.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) j11.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) j11.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) j11.get("icy-metaint");
                if (list5 != null) {
                }
                i11 = -1;
                cq3.J = z3 ? new T1(i10, i11, str, str2, str3, z6) : null;
                c2991bm = this.f35333b;
                cq = this.f35343m;
                t12 = cq.J;
                if (t12 != null) {
                }
                c2991bm2 = c2991bm;
                C4274ze c4274ze22222 = this.f35334c;
                c4274ze22222.l(c2991bm2, this.f35332a, ((InterfaceC3613nH) c2991bm.f29323u).j(), j9, j10, this.f35335d);
                if (cq.J != null) {
                }
                if (this.f35339h) {
                }
                i16 = 0;
                while (true) {
                    if (i16 != 0) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = i15;
                j6 = -1;
            }
        }
        return;
        i15 = i12;
    }

    public final C2971bJ b(String str, long j6) {
        Map map = CQ.f24116u0;
        if (str != null && !str.startsWith("W/")) {
            C3493l5 c3493l5 = new C3493l5(4);
            c3493l5.m(map.entrySet());
            c3493l5.e("If-Range", str);
            map = c3493l5.s(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.f35332a;
        AbstractC2772Sd.J(uri, "The uri must be set.");
        return new C2971bJ(uri, map, j6, -1L, 6);
    }
}
