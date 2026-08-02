package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CQ {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f24879a;

    /* renamed from: b, reason: collision with root package name */
    public final C3067cm f24880b;

    /* renamed from: c, reason: collision with root package name */
    public final C4297ze f24881c;

    /* renamed from: d, reason: collision with root package name */
    public final FQ f24882d;

    /* renamed from: e, reason: collision with root package name */
    public final C2818Tm f24883e;

    /* renamed from: f, reason: collision with root package name */
    public final U0 f24884f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f24885g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24886h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public C2994bJ f24887j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3566m1 f24888k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FQ f24890m;

    public CQ(FQ fq, Uri uri, InterfaceC3636nH interfaceC3636nH, C4297ze c4297ze, FQ fq2, C2818Tm c2818Tm) {
        Objects.requireNonNull(fq);
        this.f24890m = fq;
        this.f24879a = uri;
        this.f24880b = new C3067cm(interfaceC3636nH);
        this.f24881c = c4297ze;
        this.f24882d = fq2;
        this.f24883e = c2818Tm;
        this.f24884f = new U0();
        this.f24886h = true;
        C3429jQ.f32048a.getAndIncrement();
        this.f24887j = b(null, 0L);
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
    
        r27.f24884f.f28641n = r8.r();
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
        int i4;
        int i6;
        int i9;
        boolean z6;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z9;
        List list5;
        int i10;
        C3067cm c3067cm;
        FQ fq;
        T1 t12;
        C3067cm c3067cm2;
        int i11;
        Q0 q02;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        String str4 = null;
        while (i15 == 0 && !this.f24885g) {
            try {
                long j9 = this.f24884f.f28641n;
                C2994bJ b9 = b(str4, j9);
                this.f24887j = b9;
                C3067cm c3067cm3 = this.f24880b;
                long b10 = c3067cm3.b(b9);
                if (this.f24885g) {
                    C4297ze c4297ze = this.f24881c;
                    if (c4297ze.r() != -1) {
                        this.f24884f.f28641n = c4297ze.r();
                    }
                    try {
                        this.f24880b.o();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                List list6 = (List) ((InterfaceC3636nH) c3067cm3.f30365u).j().get("ETag");
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i14);
                if (b10 != -1) {
                    b10 += j9;
                    FQ fq2 = this.f24890m;
                    fq2.getClass();
                    fq2.f25564H.post(new F(fq2, 2));
                }
                long j10 = b10;
                FQ fq3 = this.f24890m;
                Map j11 = ((InterfaceC3636nH) c3067cm3.f30365u).j();
                List list7 = (List) j11.get("icy-br");
                j6 = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(i14);
                        try {
                            i6 = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused2) {
                            i6 = -1;
                        }
                        if (i6 > 0) {
                            i9 = i6;
                            z6 = true;
                            list = (List) j11.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z6 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) j11.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z6 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) j11.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z6 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) j11.get("icy-pub");
                            if (list4 != null) {
                                z9 = ((String) list4.get(0)).equals("1");
                                z6 = true;
                            } else {
                                z9 = false;
                            }
                            list5 = (List) j11.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i13 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused3) {
                                    i13 = -1;
                                }
                                if (i13 > 0) {
                                    i10 = i13;
                                    z6 = true;
                                    fq3.J = z6 ? new T1(i9, i10, str, str2, str3, z9) : null;
                                    c3067cm = this.f24880b;
                                    fq = this.f24890m;
                                    t12 = fq.J;
                                    if (t12 != null || (i12 = t12.f28460f) == -1) {
                                        c3067cm2 = c3067cm;
                                    } else {
                                        C2582Fo c2582Fo = new C2582Fo();
                                        AbstractC2792Sd.i(i12 > 0);
                                        c2582Fo.f25636v = c3067cm;
                                        c2582Fo.f25634n = i12;
                                        c2582Fo.f25637w = this;
                                        c2582Fo.f25638x = new byte[1];
                                        c2582Fo.f25635u = i12;
                                        InterfaceC3566m1 o4 = fq.o(new EQ(0, true));
                                        this.f24888k = o4;
                                        o4.e(FQ.f25556q0);
                                        c3067cm2 = c2582Fo;
                                    }
                                    C4297ze c4297ze2 = this.f24881c;
                                    c4297ze2.l(c3067cm2, this.f24879a, ((InterfaceC3636nH) c3067cm.f30365u).j(), j9, j10, this.f24882d);
                                    if (fq.J != null && (q02 = (Q0) c4297ze2.f36134v) != null && (q02 instanceof C4160x2)) {
                                        ((C4160x2) q02).f35716q = true;
                                    }
                                    if (this.f24886h) {
                                        long j12 = this.i;
                                        Q0 q03 = (Q0) c4297ze2.f36134v;
                                        q03.getClass();
                                        q03.c(j9, j12);
                                        this.f24886h = false;
                                    }
                                    i15 = 0;
                                    while (true) {
                                        if (i15 != 0) {
                                            i11 = 0;
                                            break;
                                        }
                                        try {
                                            if (this.f24885g) {
                                                i11 = 0;
                                                i15 = 0;
                                                break;
                                            }
                                            try {
                                                C2818Tm c2818Tm = this.f24883e;
                                                synchronized (c2818Tm) {
                                                    while (!c2818Tm.f28577a) {
                                                        c2818Tm.wait();
                                                    }
                                                }
                                                U0 u02 = this.f24884f;
                                                Q0 q04 = (Q0) c4297ze2.f36134v;
                                                if (q04 == null) {
                                                    throw null;
                                                }
                                                K0 k02 = (K0) c4297ze2.f36135w;
                                                if (k02 == null) {
                                                    throw null;
                                                }
                                                i15 = q04.a(k02, u02);
                                                long r9 = c4297ze2.r();
                                                if (r9 > fq.f25557A + j9) {
                                                    synchronized (c2818Tm) {
                                                        c2818Tm.f28577a = false;
                                                    }
                                                    fq.f25564H.post(fq.f25563G);
                                                    j9 = r9;
                                                }
                                            } catch (InterruptedException unused4) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i4 = i15;
                                            if (i4 != 1) {
                                            }
                                            try {
                                                this.f24880b.o();
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
                                        AbstractC2991bG.y("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused6) {
                                        AbstractC2991bG.y("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i10 = i13;
                                        fq3.J = z6 ? new T1(i9, i10, str, str2, str3, z9) : null;
                                        c3067cm = this.f24880b;
                                        fq = this.f24890m;
                                        t12 = fq.J;
                                        if (t12 != null) {
                                        }
                                        c3067cm2 = c3067cm;
                                        C4297ze c4297ze22 = this.f24881c;
                                        c4297ze22.l(c3067cm2, this.f24879a, ((InterfaceC3636nH) c3067cm.f30365u).j(), j9, j10, this.f24882d);
                                        if (fq.J != null) {
                                        }
                                        if (this.f24886h) {
                                        }
                                        i15 = 0;
                                        while (true) {
                                            if (i15 != 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            i10 = -1;
                            fq3.J = z6 ? new T1(i9, i10, str, str2, str3, z9) : null;
                            c3067cm = this.f24880b;
                            fq = this.f24890m;
                            t12 = fq.J;
                            if (t12 != null) {
                            }
                            c3067cm2 = c3067cm;
                            C4297ze c4297ze222 = this.f24881c;
                            c4297ze222.l(c3067cm2, this.f24879a, ((InterfaceC3636nH) c3067cm.f30365u).j(), j9, j10, this.f24882d);
                            if (fq.J != null) {
                                ((C4160x2) q02).f35716q = true;
                            }
                            if (this.f24886h) {
                            }
                            i15 = 0;
                            while (true) {
                                if (i15 != 0) {
                                }
                            }
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                AbstractC2991bG.y("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused7) {
                                AbstractC2991bG.y("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i9 = i6;
                                z6 = false;
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
                                i10 = -1;
                                fq3.J = z6 ? new T1(i9, i10, str, str2, str3, z9) : null;
                                c3067cm = this.f24880b;
                                fq = this.f24890m;
                                t12 = fq.J;
                                if (t12 != null) {
                                }
                                c3067cm2 = c3067cm;
                                C4297ze c4297ze2222 = this.f24881c;
                                c4297ze2222.l(c3067cm2, this.f24879a, ((InterfaceC3636nH) c3067cm.f30365u).j(), j9, j10, this.f24882d);
                                if (fq.J != null) {
                                }
                                if (this.f24886h) {
                                }
                                i15 = 0;
                                while (true) {
                                    if (i15 != 0) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        i4 = i;
                        if (i4 != 1) {
                            C4297ze c4297ze3 = this.f24881c;
                            if (c4297ze3.r() != j6) {
                                this.f24884f.f28641n = c4297ze3.r();
                            }
                        }
                        this.f24880b.o();
                        throw th;
                    }
                }
                z6 = false;
                i9 = -1;
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
                i10 = -1;
                fq3.J = z6 ? new T1(i9, i10, str, str2, str3, z9) : null;
                c3067cm = this.f24880b;
                fq = this.f24890m;
                t12 = fq.J;
                if (t12 != null) {
                }
                c3067cm2 = c3067cm;
                C4297ze c4297ze22222 = this.f24881c;
                c4297ze22222.l(c3067cm2, this.f24879a, ((InterfaceC3636nH) c3067cm.f30365u).j(), j9, j10, this.f24882d);
                if (fq.J != null) {
                }
                if (this.f24886h) {
                }
                i15 = 0;
                while (true) {
                    if (i15 != 0) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = i14;
                j6 = -1;
            }
        }
        return;
        i14 = i11;
    }

    public final C2994bJ b(String str, long j6) {
        Map map = FQ.f25555p0;
        if (str != null && !str.startsWith("W/")) {
            C3516l5 c3516l5 = new C3516l5(4);
            c3516l5.m(map.entrySet());
            c3516l5.e("If-Range", str);
            map = c3516l5.s(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.f24879a;
        AbstractC2792Sd.J(uri, "The uri must be set.");
        return new C2994bJ(uri, map, j6, -1L, 6);
    }
}
