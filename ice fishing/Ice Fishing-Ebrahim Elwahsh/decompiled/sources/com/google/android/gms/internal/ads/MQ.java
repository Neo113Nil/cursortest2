package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MQ {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26339a;

    /* renamed from: b, reason: collision with root package name */
    public final C4164xG f26340b;

    /* renamed from: c, reason: collision with root package name */
    public final C4017ue f26341c;

    /* renamed from: d, reason: collision with root package name */
    public final PQ f26342d;

    /* renamed from: e, reason: collision with root package name */
    public final C2865Xm f26343e;

    /* renamed from: f, reason: collision with root package name */
    public final S0 f26344f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f26345g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26346h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public C3197fJ f26347j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3448k1 f26348k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PQ f26350m;

    public MQ(PQ pq, Uri uri, InterfaceC3572mH interfaceC3572mH, C4017ue c4017ue, PQ pq2, C2865Xm c2865Xm) {
        Objects.requireNonNull(pq);
        this.f26350m = pq;
        this.f26339a = uri;
        this.f26340b = new C4164xG(interfaceC3572mH);
        this.f26341c = c4017ue;
        this.f26342d = pq2;
        this.f26343e = c2865Xm;
        this.f26344f = new S0();
        this.f26346h = true;
        C3958tQ.f34415a.getAndIncrement();
        this.f26347j = b(null, 0L);
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
    
        if (r8.s() == (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026e, code lost:
    
        r27.f26344f.f27467n = r8.s();
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
        long j9;
        int i4;
        int i9;
        int i10;
        boolean z8;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z9;
        List list5;
        int i11;
        C4164xG c4164xG;
        PQ pq;
        R1 r12;
        C4164xG c4164xG2;
        int i12;
        O0 o02;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        String str4 = null;
        while (i16 == 0 && !this.f26345g) {
            try {
                long j10 = this.f26344f.f27467n;
                C3197fJ b9 = b(str4, j10);
                this.f26347j = b9;
                C4164xG c4164xG3 = this.f26340b;
                long F8 = c4164xG3.F(b9);
                if (this.f26345g) {
                    C4017ue c4017ue = this.f26341c;
                    if (c4017ue.s() != -1) {
                        this.f26344f.f27467n = c4017ue.s();
                    }
                    try {
                        this.f26340b.o();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                List list6 = (List) ((InterfaceC3572mH) c4164xG3.f35132u).h().get("ETag");
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i15);
                if (F8 != -1) {
                    F8 += j10;
                    PQ pq2 = this.f26350m;
                    pq2.getClass();
                    pq2.f26937H.post(new E(pq2, 2));
                }
                long j11 = F8;
                PQ pq3 = this.f26350m;
                Map h9 = ((InterfaceC3572mH) c4164xG3.f35132u).h();
                List list7 = (List) h9.get("icy-br");
                j9 = -1;
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
                            z8 = true;
                            list = (List) h9.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z8 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) h9.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z8 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) h9.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z8 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) h9.get("icy-pub");
                            if (list4 != null) {
                                z9 = ((String) list4.get(0)).equals("1");
                                z8 = true;
                            } else {
                                z9 = false;
                            }
                            list5 = (List) h9.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i14 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused3) {
                                    i14 = -1;
                                }
                                if (i14 > 0) {
                                    i11 = i14;
                                    z8 = true;
                                    pq3.J = z8 ? new R1(i10, i11, str, str2, str3, z9) : null;
                                    c4164xG = this.f26340b;
                                    pq = this.f26350m;
                                    r12 = pq.J;
                                    if (r12 != null || (i13 = r12.f27299f) == -1) {
                                        c4164xG2 = c4164xG;
                                    } else {
                                        C2561Fo c2561Fo = new C2561Fo();
                                        PA.n(i13 > 0);
                                        c2561Fo.f25019v = c4164xG;
                                        c2561Fo.f25017n = i13;
                                        c2561Fo.f25020w = this;
                                        c2561Fo.f25021x = new byte[1];
                                        c2561Fo.f25018u = i13;
                                        InterfaceC3448k1 r9 = pq.r(new OQ(0, true));
                                        this.f26348k = r9;
                                        r9.e(PQ.f26929v0);
                                        c4164xG2 = c2561Fo;
                                    }
                                    C4017ue c4017ue2 = this.f26341c;
                                    c4017ue2.m(c4164xG2, this.f26339a, ((InterfaceC3572mH) c4164xG.f35132u).h(), j10, j11, this.f26342d);
                                    if (pq.J != null && (o02 = (O0) c4017ue2.f34631v) != null && (o02 instanceof C3988u2)) {
                                        ((C3988u2) o02).f34523q = true;
                                    }
                                    if (this.f26346h) {
                                        long j12 = this.i;
                                        O0 o03 = (O0) c4017ue2.f34631v;
                                        o03.getClass();
                                        o03.c(j10, j12);
                                        this.f26346h = false;
                                    }
                                    i16 = 0;
                                    while (true) {
                                        if (i16 != 0) {
                                            i12 = 0;
                                            break;
                                        }
                                        try {
                                            if (this.f26345g) {
                                                i12 = 0;
                                                i16 = 0;
                                                break;
                                            }
                                            try {
                                                C2865Xm c2865Xm = this.f26343e;
                                                synchronized (c2865Xm) {
                                                    while (!c2865Xm.f28692a) {
                                                        c2865Xm.wait();
                                                    }
                                                }
                                                S0 s02 = this.f26344f;
                                                O0 o04 = (O0) c4017ue2.f34631v;
                                                if (o04 == null) {
                                                    throw null;
                                                }
                                                J0 j02 = (J0) c4017ue2.f34632w;
                                                if (j02 == null) {
                                                    throw null;
                                                }
                                                i16 = o04.e(j02, s02);
                                                long s3 = c4017ue2.s();
                                                if (s3 > pq.f26930A + j10) {
                                                    synchronized (c2865Xm) {
                                                        c2865Xm.f28692a = false;
                                                    }
                                                    pq.f26937H.post(pq.f26936G);
                                                    j10 = s3;
                                                }
                                            } catch (InterruptedException unused4) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i4 = i16;
                                            if (i4 != 1) {
                                            }
                                            try {
                                                this.f26340b.o();
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
                                        AbstractC3217fl.I("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused6) {
                                        AbstractC3217fl.I("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i11 = i14;
                                        pq3.J = z8 ? new R1(i10, i11, str, str2, str3, z9) : null;
                                        c4164xG = this.f26340b;
                                        pq = this.f26350m;
                                        r12 = pq.J;
                                        if (r12 != null) {
                                        }
                                        c4164xG2 = c4164xG;
                                        C4017ue c4017ue22 = this.f26341c;
                                        c4017ue22.m(c4164xG2, this.f26339a, ((InterfaceC3572mH) c4164xG.f35132u).h(), j10, j11, this.f26342d);
                                        if (pq.J != null) {
                                        }
                                        if (this.f26346h) {
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
                            pq3.J = z8 ? new R1(i10, i11, str, str2, str3, z9) : null;
                            c4164xG = this.f26340b;
                            pq = this.f26350m;
                            r12 = pq.J;
                            if (r12 != null) {
                            }
                            c4164xG2 = c4164xG;
                            C4017ue c4017ue222 = this.f26341c;
                            c4017ue222.m(c4164xG2, this.f26339a, ((InterfaceC3572mH) c4164xG.f35132u).h(), j10, j11, this.f26342d);
                            if (pq.J != null) {
                                ((C3988u2) o02).f34523q = true;
                            }
                            if (this.f26346h) {
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
                                AbstractC3217fl.I("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused7) {
                                AbstractC3217fl.I("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i10 = i9;
                                z8 = false;
                                list = (List) h9.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) h9.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) h9.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) h9.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) h9.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i11 = -1;
                                pq3.J = z8 ? new R1(i10, i11, str, str2, str3, z9) : null;
                                c4164xG = this.f26340b;
                                pq = this.f26350m;
                                r12 = pq.J;
                                if (r12 != null) {
                                }
                                c4164xG2 = c4164xG;
                                C4017ue c4017ue2222 = this.f26341c;
                                c4017ue2222.m(c4164xG2, this.f26339a, ((InterfaceC3572mH) c4164xG.f35132u).h(), j10, j11, this.f26342d);
                                if (pq.J != null) {
                                }
                                if (this.f26346h) {
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
                        i4 = i;
                        if (i4 != 1) {
                            C4017ue c4017ue3 = this.f26341c;
                            if (c4017ue3.s() != j9) {
                                this.f26344f.f27467n = c4017ue3.s();
                            }
                        }
                        this.f26340b.o();
                        throw th;
                    }
                }
                z8 = false;
                i10 = -1;
                list = (List) h9.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) h9.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) h9.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) h9.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) h9.get("icy-metaint");
                if (list5 != null) {
                }
                i11 = -1;
                pq3.J = z8 ? new R1(i10, i11, str, str2, str3, z9) : null;
                c4164xG = this.f26340b;
                pq = this.f26350m;
                r12 = pq.J;
                if (r12 != null) {
                }
                c4164xG2 = c4164xG;
                C4017ue c4017ue22222 = this.f26341c;
                c4017ue22222.m(c4164xG2, this.f26339a, ((InterfaceC3572mH) c4164xG.f35132u).h(), j10, j11, this.f26342d);
                if (pq.J != null) {
                }
                if (this.f26346h) {
                }
                i16 = 0;
                while (true) {
                    if (i16 != 0) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = i15;
                j9 = -1;
            }
        }
        return;
        i15 = i12;
    }

    public final C3197fJ b(String str, long j9) {
        Map map = PQ.f26928u0;
        if (str != null && !str.startsWith("W/")) {
            C3398j5 c3398j5 = new C3398j5(4);
            c3398j5.n(map.entrySet());
            c3398j5.h("If-Range", str);
            map = c3398j5.s(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.f26339a;
        PA.X(uri, "The uri must be set.");
        return new C3197fJ(uri, map, j9, -1L, 6);
    }
}
