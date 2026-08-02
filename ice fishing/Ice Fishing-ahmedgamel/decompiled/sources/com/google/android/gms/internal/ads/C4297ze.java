package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import l.C4659e;
import m2.C4741a;
import r2.C4906k;
import s2.C4927e;
import s2.C4945n;
import s2.C4949p;
import x2.C5189a;
import z2.InterfaceC5231h;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4297ze implements InterfaceC3730p3, InterfaceC3598mg, InterfaceC5231h, z2.j, z2.l, InterfaceC2728Oh, Eu, InterfaceC2883Xl, At, InterfaceC3068cn {

    /* renamed from: x, reason: collision with root package name */
    public static InterfaceC2794Sf f36129x;

    /* renamed from: y, reason: collision with root package name */
    public static final D f36130y;

    /* renamed from: z, reason: collision with root package name */
    public static final D f36131z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36132n;

    /* renamed from: u, reason: collision with root package name */
    public Object f36133u;

    /* renamed from: v, reason: collision with root package name */
    public Object f36134v;

    /* renamed from: w, reason: collision with root package name */
    public Object f36135w;

    static {
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        f36130y = new D(2, j6);
        f36131z = new D(3, j6);
    }

    public /* synthetic */ C4297ze(int i, Object obj) {
        this.f36132n = i;
        this.f36133u = obj;
    }

    public static String z(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, read);
                }
                EC f2 = EC.f25318f.f();
                byte[] digest = messageDigest.digest();
                String g9 = f2.g(digest.length, digest);
                fileInputStream.close();
                return g9;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f36134v).iterator();
        while (it.hasNext()) {
            String str = (String) s2.r.f40506e.f40509c.a((C3324ha) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC3066cl.y(arrayList2, new C3516l5("gad:dynamite_module:experiment_id", "", 4));
        AbstractC3066cl.y(arrayList2, SK.f28145A);
        AbstractC3066cl.y(arrayList2, SK.f28146B);
        AbstractC3066cl.y(arrayList2, SK.f28147C);
        AbstractC3066cl.y(arrayList2, SK.f28148D);
        AbstractC3066cl.y(arrayList2, SK.f28149E);
        AbstractC3066cl.y(arrayList2, SK.f28164U);
        AbstractC3066cl.y(arrayList2, SK.f28150F);
        AbstractC3066cl.y(arrayList2, SK.f28156M);
        AbstractC3066cl.y(arrayList2, SK.f28157N);
        AbstractC3066cl.y(arrayList2, SK.f28158O);
        AbstractC3066cl.y(arrayList2, SK.f28159P);
        AbstractC3066cl.y(arrayList2, SK.f28160Q);
        AbstractC3066cl.y(arrayList2, SK.f28161R);
        AbstractC3066cl.y(arrayList2, SK.f28162S);
        AbstractC3066cl.y(arrayList2, SK.f28163T);
        AbstractC3066cl.y(arrayList2, SK.f28151G);
        AbstractC3066cl.y(arrayList2, SK.f28152H);
        AbstractC3066cl.y(arrayList2, SK.f28153I);
        AbstractC3066cl.y(arrayList2, SK.J);
        AbstractC3066cl.y(arrayList2, SK.f28154K);
        AbstractC3066cl.y(arrayList2, SK.f28155L);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public ArrayList B() {
        ArrayList A9 = A();
        Iterator it = ((ArrayList) this.f36135w).iterator();
        while (it.hasNext()) {
            String str = (String) s2.r.f40506e.f40509c.a((C3324ha) it.next());
            if (!TextUtils.isEmpty(str)) {
                A9.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3066cl.y(arrayList, AbstractC2659Kg.f26733x);
        A9.addAll(arrayList);
        return A9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public void C(String str, int i, String str2, boolean z6) {
        Z8 z82 = (Z8) this.f36135w;
        C3390in c3390in = (C3390in) this.f36133u;
        if (z6) {
            s2.Z0 z02 = c3390in.f31887a.f30390a;
            if (z02 != null) {
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f36134v;
                if (interfaceC4084vh.g() != null) {
                    interfaceC4084vh.g().V3(z02);
                }
            }
            z82.d();
            return;
        }
        c3390in.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        z82.c(new Zq(1, Wv.i(sb, ", Failing URL: ", str2)));
    }

    public void D() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33073k7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            C3989tu c3989tu = (C3989tu) this.f36134v;
            sb.append(c3989tu.f35194v);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            M4 m42 = (M4) this.f36135w;
            sb2.append(m42.f27032c);
            sb2.append("\n\tNew pools created: ");
            sb2.append(m42.f27030a);
            sb2.append("\n\tPools removed: ");
            sb2.append(m42.f27031b);
            sb2.append("\n\tEntries added: ");
            sb2.append(m42.f27034e);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(m42.f27033d);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f36133u).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC4097vu) entry.getKey()).hashCode());
                sb.append("    ");
                int i4 = 0;
                while (true) {
                    C3828qu c3828qu = (C3828qu) entry.getValue();
                    c3828qu.a();
                    if (i4 >= c3828qu.f34204a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i4++;
                }
                C3828qu c3828qu2 = (C3828qu) entry.getValue();
                c3828qu2.a();
                for (int size = c3828qu2.f34204a.size(); size < c3989tu.f35196x; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                C3828qu c3828qu3 = (C3828qu) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                Cu cu = c3828qu3.f34207d;
                sb3.append(cu.f25003a);
                sb3.append(" Last accessed: ");
                sb3.append(cu.f25005c);
                sb3.append(" Accesses: ");
                sb3.append(cu.f25006d);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(cu.f25007e);
                sb3.append(" Stale: ");
                sb3.append(cu.f25008f);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < c3989tu.f35195w) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb4 = sb.toString();
            int i6 = w2.z.f41712b;
            x2.i.a(sb4);
        }
    }

    public ID E(C2759Qe c2759Qe, InterfaceC2498Ap interfaceC2498Ap, InterfaceC2498Ap interfaceC2498Ap2, BD bd) {
        String str = c2759Qe.f27829w;
        w2.D d9 = C4906k.f40186C.f40191c;
        boolean e9 = w2.D.e(str);
        C3383ig c3383ig = (C3383ig) this.f36133u;
        return QC.r(QC.t(QC.t(ID.s(e9 ? QC.k(new C4254yp(1)) : QC.r(interfaceC2498Ap.d(c2759Qe), ExecutionException.class, C2576Fi.f25614g, c3383ig)), C2576Fi.f25612e, c3383ig), bd, c3383ig), C4254yp.class, new C3219fd(this, interfaceC2498Ap2, c2759Qe, bd, 3), c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        switch (this.f36132n) {
            case 12:
                return m((C2617Hp) obj);
            default:
                C2821Tp c2821Tp = (C2821Tp) this.f36133u;
                c2821Tp.getClass();
                c2821Tp.f28594u.execute(new RunnableC3888s0(7, (SQLiteDatabase) obj, (String) this.f36135w, (x2.l) this.f36134v));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public ArrayList b(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f36133u;
            if (i >= list.size()) {
                break;
            }
            int i4 = i + i;
            long[] jArr = (long[]) this.f36134v;
            if (jArr[i4] <= j6 && j6 < jArr[i4 + 1]) {
                W3 w3 = (W3) list.get(i);
                C4302zj c4302zj = w3.f29108a;
                if (c4302zj.f36205e == -3.4028235E38f) {
                    arrayList2.add(w3);
                } else {
                    arrayList.add(c4302zj);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, C3027c.f30173H);
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            C4302zj c4302zj2 = ((W3) arrayList2.get(i6)).f29108a;
            arrayList.add(new C4302zj(c4302zj2.f36201a, c4302zj2.f36202b, c4302zj2.f36203c, c4302zj2.f36204d, (-1) - i6, 1, c4302zj2.f36207g, c4302zj2.f36208h, c4302zj2.i, c4302zj2.f36211l, c4302zj2.f36212m, c4302zj2.f36209j, c4302zj2.f36210k, c4302zj2.f36213n, c4302zj2.f36214o, c4302zj2.f36215p));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public int c() {
        return ((long[]) this.f36135w).length;
    }

    public void d() {
        R2.w.d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        x2.i.a(sb.toString());
        try {
            ((InterfaceC3864rd) this.f36133u).j0(0);
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        C3290gu c3290gu;
        try {
            C3558lu c3558lu = (C3558lu) ((C3500kq) this.f36133u).f32421b;
            c3558lu.b(z6);
            int i = ((C5189a) ((C2499Aq) this.f36135w).f24526d).f41847v;
            int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33106o1)).intValue();
            InterfaceC3703od interfaceC3703od = c3558lu.f32644a;
            if (i < intValue) {
                try {
                    interfaceC3703od.g();
                    return;
                } finally {
                }
            } else {
                try {
                    interfaceC3703od.J3(new Y2.b(context));
                    return;
                } finally {
                }
            }
        } catch (C3290gu e9) {
            int i4 = w2.z.f41712b;
            x2.i.e("Cannot show interstitial.");
            throw new C2867Wl(e9.getCause());
        }
        int i42 = w2.z.f41712b;
        x2.i.e("Cannot show interstitial.");
        throw new C2867Wl(e9.getCause());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f36134v;
    }

    public void g(C4741a c4741a) {
        R2.w.d("#008 Must be called on the main UI thread.");
        int i = c4741a.f39357a;
        int length = String.valueOf(i).length();
        String str = c4741a.f39358b;
        int length2 = String.valueOf(str).length();
        String str2 = c4741a.f39359c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        x2.i.a(sb.toString());
        try {
            ((InterfaceC3864rd) this.f36133u).r0(c4741a.a());
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void h(C4741a c4741a) {
        R2.w.d("#008 Must be called on the main UI thread.");
        int i = c4741a.f39357a;
        int length = String.valueOf(i).length();
        String str = c4741a.f39358b;
        int length2 = String.valueOf(str).length();
        String str2 = c4741a.f39359c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        x2.i.a(sb.toString());
        try {
            ((InterfaceC3864rd) this.f36133u).r0(c4741a.a());
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void i(C4741a c4741a) {
        R2.w.d("#008 Must be called on the main UI thread.");
        int i = c4741a.f39357a;
        int length = String.valueOf(i).length();
        String str = c4741a.f39358b;
        int length2 = String.valueOf(str).length();
        String str2 = c4741a.f39359c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        x2.i.a(sb.toString());
        try {
            ((InterfaceC3864rd) this.f36133u).r0(c4741a.a());
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public ID j(InterfaceC3656nk interfaceC3656nk) {
        P3.a c9;
        P3.a q8;
        C4297ze c4297ze = (C4297ze) this.f36133u;
        RD rd = (RD) this.f36134v;
        C3504ku c3504ku = new C3504ku(c4297ze, interfaceC3656nk, rd);
        C4150wt c4150wt = (C4150wt) c3504ku.f32447w;
        if (c4150wt == null) {
            if (((Boolean) AbstractC2856Wa.f29154a.r()).booleanValue()) {
                C2730Oj c10 = interfaceC3656nk.c();
                Ju ju = Ju.GET_CACHE_KEY;
                Iu s9 = c10.f27417c.a(c10.i.d(), ju).j(new E2.r(4, c10, (C3989tu) c4297ze.f36134v)).s();
                s9.a(new LD(0, s9, new C3680o7(14, c10)), c10.f27423j);
                q8 = QC.q(QC.u(ID.s(s9), new C4096vt(c3504ku, 1), rd), C4254yp.class, new C4096vt(c3504ku, 0), rd);
            } else {
                C4150wt c4150wt2 = new C4150wt(null, c3504ku.y());
                c3504ku.f32447w = c4150wt2;
                q8 = QC.c(c4150wt2);
            }
            c9 = QC.u(q8, L2.f26835q, rd);
        } else {
            c9 = QC.c(c4150wt);
        }
        return QC.q(QC.t(ID.s(c9), new E2.r(14, this, interfaceC3656nk), rd), Exception.class, new L2(16), rd);
    }

    public void k(S0 s02, F4 f42) {
        int i = 0;
        while (true) {
            InterfaceC3566m1[] interfaceC3566m1Arr = (InterfaceC3566m1[]) this.f36134v;
            if (i >= interfaceC3566m1Arr.length) {
                return;
            }
            f42.a();
            f42.b();
            InterfaceC3566m1 C8 = s02.C(f42.f25501d, 3);
            DP dp = (DP) ((List) this.f36133u).get(i);
            String str = dp.f25176o;
            boolean z6 = true;
            if (!com.anythink.basead.exoplayer.k.o.f9227W.equals(str) && !com.anythink.basead.exoplayer.k.o.f9228X.equals(str)) {
                z6 = false;
            }
            AbstractC2792Sd.C(z6, "Invalid closed caption MIME type provided: %s", str);
            String str2 = dp.f25163a;
            if (str2 == null) {
                f42.b();
                str2 = f42.f25502e;
            }
            C3322hP c3322hP = new C3322hP();
            c3322hP.f31546a = str2;
            c3322hP.d("video/mp2t");
            c3322hP.e(str);
            c3322hP.f31550e = dp.f25167e;
            c3322hP.f31549d = dp.f25166d;
            c3322hP.f31543M = dp.f25159N;
            c3322hP.f31561q = dp.f25179r;
            C8.e(new DP(c3322hP));
            interfaceC3566m1Arr[i] = C8;
            i++;
        }
    }

    public void l(InterfaceC3636nH interfaceC3636nH, Uri uri, Map map, long j6, long j9, FQ fq) {
        boolean z6;
        boolean z9 = true;
        K0 k02 = new K0(interfaceC3636nH, j6, j9);
        this.f36135w = k02;
        if (((Q0) this.f36134v) != null) {
            return;
        }
        Q0[] d9 = ((T0) this.f36133u).d(uri, map);
        int length = d9.length;
        PB pb = RB.f27933u;
        MA.q(length, "expectedSize");
        OB ob = new OB(length);
        if (length == 1) {
            this.f36134v = d9[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Q0 q02 = d9[i];
                try {
                } catch (EOFException unused) {
                    z6 = ((Q0) this.f36134v) != null || k02.f26571w == j6;
                } catch (Throwable th) {
                    if (((Q0) this.f36134v) == null && k02.f26571w != j6) {
                        z9 = false;
                    }
                    AbstractC2792Sd.H(z9);
                    k02.f26573y = 0;
                    throw th;
                }
                if (q02.d(k02)) {
                    this.f36134v = q02;
                    k02.f26573y = 0;
                    break;
                } else {
                    ob.b(q02.f());
                    z6 = ((Q0) this.f36134v) != null || k02.f26571w == j6;
                    AbstractC2792Sd.H(z6);
                    k02.f26573y = 0;
                    i++;
                }
            }
            if (((Q0) this.f36134v) == null) {
                Iterator it = AbstractC2991bG.w(RB.o(d9), Oz.f27483e).iterator();
                StringBuilder sb = new StringBuilder();
                AbstractC2991bG.z(sb, it, ", ");
                String sb2 = sb.toString();
                throw new TQ(D.x.p(new StringBuilder(sb2.length() + 58), "None of the available extractors (", sb2, ") could read the stream."), ob.f());
            }
        }
        ((Q0) this.f36134v).b(fq);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0296, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        x2.i.f(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d1, code lost:
    
        throw new com.google.android.gms.internal.ads.C3231fp(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        r13.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f4, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2634Ip m(C2617Hp c2617Hp) {
        int i;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        C4297ze c4297ze = this;
        String str = c2617Hp.f26124a;
        int i4 = c2617Hp.f26125b;
        HashMap hashMap = c2617Hp.f26126c;
        byte[] bArr = c2617Hp.f26127d;
        String str2 = c2617Hp.f26128e;
        C4906k.f40186C.f40198k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C2634Ip c2634Ip = new C2634Ip();
            c2634Ip.f26345a = 0;
            c2634Ip.f26346b = new HashMap();
            c2634Ip.f26347c = "";
            c2634Ip.f26348d = -1L;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33015e3)).booleanValue() && C4949p.f40498g.f40501c) {
                c2634Ip.f26345a = 410;
                return c2634Ip;
            }
            String str3 = (String) c4297ze.f36134v;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String sb2 = sb.toString();
            int i6 = w2.z.f41712b;
            x2.i.e(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            x2.i.a(sb3.toString());
            URL url = new URL(str);
            HashMap hashMap2 = new HashMap();
            int i9 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = (String) c4297ze.f36135w;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        C4906k.f40186C.f40191c.B((Context) c4297ze.f36133u, str3, httpURLConnection, i4);
                        for (Iterator it = hashMap.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        x2.f fVar = new x2.f();
                        try {
                            fVar.a(httpURLConnection, bArr);
                            i = i4;
                        } catch (Throwable th) {
                            x2.i.d("Network request logging failed.", th);
                            i = i4;
                            C4906k.f40186C.f40196h.e("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i10 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    V2.b.c(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    V2.b.c(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Iterator<Map.Entry<String, List<String>>> it2 = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, List<String>> next = it2.next();
                            int i11 = i10;
                            String key = next.getKey();
                            Iterator<Map.Entry<String, List<String>>> it3 = it2;
                            List<String> value = next.getValue();
                            if (hashMap2.containsKey(key)) {
                                ((List) hashMap2.get(key)).addAll(value);
                            } else {
                                hashMap2.put(key, new ArrayList(value));
                                hashMap = hashMap;
                            }
                            it2 = it3;
                            i10 = i11;
                        }
                        int i12 = i10;
                        HashMap hashMap3 = hashMap;
                        fVar.b(httpURLConnection, responseCode);
                        c2634Ip.f26345a = responseCode;
                        c2634Ip.f26346b = hashMap2;
                        c2634Ip.f26347c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = null;
                            }
                            try {
                                w2.D d9 = C4906k.f40186C.f40191c;
                                StringBuilder sb4 = new StringBuilder(8192);
                                char[] cArr = new char[2048];
                                while (true) {
                                    int read = inputStreamReader2.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    sb4.append(cArr, 0, read);
                                }
                                String sb5 = sb4.toString();
                                V2.b.c(inputStreamReader2);
                                if (x2.f.c() && sb5 != null) {
                                    fVar.e("onNetworkResponseBody", new C4659e(10, sb5.getBytes()));
                                }
                                c2634Ip.f26347c = sb5;
                                if (TextUtils.isEmpty(sb5)) {
                                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33192x6)).booleanValue()) {
                                        throw new C3231fp(3);
                                    }
                                }
                                C4906k.f40186C.f40198k.getClass();
                                c2634Ip.f26348d = SystemClock.elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                V2.b.c(inputStreamReader);
                                throw th;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                x2.i.f("No location header to follow redirect.");
                                throw new C3231fp(1, "No location header to follow redirect");
                            }
                            C3324ha c3324ha = AbstractC3592ma.T8;
                            s2.r rVar = s2.r.f40506e;
                            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e9) {
                                    throw new C3231fp(e9.getMessage(), e9);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i9++;
                            if (i9 > ((Integer) rVar.f40509c.a(AbstractC3592ma.f33037g6)).intValue()) {
                                x2.i.f("Too many redirects.");
                                throw new C3231fp(i12, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            c4297ze = this;
                            i4 = i;
                            hashMap = hashMap3;
                        }
                    } catch (C3231fp e10) {
                        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.x9)).booleanValue()) {
                            throw e10;
                        }
                        C4906k.f40186C.f40198k.getClass();
                        c2634Ip.f26348d = SystemClock.elapsedRealtime() - elapsedRealtime;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
        } catch (IOException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            int i13 = w2.z.f41712b;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            x2.i.f(concat);
            throw new C3231fp(concat, e11);
        }
    }

    public void n(H2.b bVar) {
        InterfaceC2794Sf interfaceC2794Sf;
        Y2.b bVar2;
        InterfaceC2794Sf interfaceC2794Sf2;
        s2.c1 a9;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f36133u;
        synchronized (C4297ze.class) {
            try {
                if (f36129x == null) {
                    C4945n c4945n = C4949p.f40498g.f40500b;
                    BinderC3487kd binderC3487kd = new BinderC3487kd();
                    c4945n.getClass();
                    f36129x = (InterfaceC2794Sf) new C4927e(c4945n, context, binderC3487kd).d(context, false);
                }
                interfaceC2794Sf = f36129x;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC2794Sf == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Y2.b bVar3 = new Y2.b(context);
        s2.F0 f02 = (s2.F0) this.f36135w;
        if (f02 == null) {
            bVar2 = bVar3;
            interfaceC2794Sf2 = interfaceC2794Sf;
            a9 = new s2.c1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, currentTimeMillis, 0L, -1);
        } else {
            bVar2 = bVar3;
            interfaceC2794Sf2 = interfaceC2794Sf;
            f02.f40335n = currentTimeMillis;
            a9 = s2.e1.a(context, f02);
        }
        try {
            interfaceC2794Sf2.l2(bVar2, new C2861Wf(null, ((m2.b) this.f36134v).name(), null, a9), new BinderC4243ye(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ Object o() {
        return null;
    }

    public synchronized void p(InterfaceC4097vu interfaceC4097vu, C4043uu c4043uu) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f36133u;
            C3828qu c3828qu = (C3828qu) concurrentHashMap.get(interfaceC4097vu);
            C4906k.f40186C.f40198k.getClass();
            c4043uu.f35370d = System.currentTimeMillis();
            if (c3828qu == null) {
                C3989tu c3989tu = (C3989tu) this.f36134v;
                C3828qu c3828qu2 = new C3828qu(c3989tu.f35196x, c3989tu.f35197y * 1000);
                if (concurrentHashMap.size() == c3989tu.f35195w) {
                    int i = c3989tu.f35191C;
                    int i4 = i - 1;
                    InterfaceC4097vu interfaceC4097vu2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j6 = Long.MAX_VALUE;
                    if (i4 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((C3828qu) entry.getValue()).f34207d.f25003a < j6) {
                                j6 = ((C3828qu) entry.getValue()).f34207d.f25003a;
                                interfaceC4097vu2 = (InterfaceC4097vu) entry.getKey();
                            }
                        }
                        if (interfaceC4097vu2 != null) {
                            concurrentHashMap.remove(interfaceC4097vu2);
                        }
                    } else if (i4 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((C3828qu) entry2.getValue()).f34207d.f25005c < j6) {
                                j6 = ((C3828qu) entry2.getValue()).f34207d.f25005c;
                                interfaceC4097vu2 = (InterfaceC4097vu) entry2.getKey();
                            }
                        }
                        if (interfaceC4097vu2 != null) {
                            concurrentHashMap.remove(interfaceC4097vu2);
                        }
                    } else if (i4 == 2) {
                        int i6 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((C3828qu) entry3.getValue()).f34207d.f25006d < i6) {
                                i6 = ((C3828qu) entry3.getValue()).f34207d.f25006d;
                                interfaceC4097vu2 = (InterfaceC4097vu) entry3.getKey();
                            }
                        }
                        if (interfaceC4097vu2 != null) {
                            concurrentHashMap.remove(interfaceC4097vu2);
                        }
                    }
                    M4 m42 = (M4) this.f36135w;
                    m42.f27031b++;
                    ((C3881ru) m42.f27035f).f34541u = true;
                }
                concurrentHashMap.put(interfaceC4097vu, c3828qu2);
                M4 m43 = (M4) this.f36135w;
                m43.f27030a++;
                ((C3881ru) m43.f27035f).f34540n = true;
                c3828qu = c3828qu2;
            }
            Cu cu = c3828qu.f34207d;
            cu.getClass();
            C4906k.f40186C.f40198k.getClass();
            cu.f25005c = System.currentTimeMillis();
            cu.f25006d++;
            c3828qu.a();
            LinkedList linkedList = c3828qu.f34204a;
            if (linkedList.size() != c3828qu.f34205b) {
                linkedList.add(c4043uu);
            }
            M4 m44 = (M4) this.f36135w;
            m44.f27034e++;
            C3881ru c3881ru = (C3881ru) m44.f27035f;
            C3881ru clone = c3881ru.clone();
            c3881ru.f34540n = false;
            c3881ru.f34541u = false;
            Bu bu = c3828qu.f34207d.f25004b;
            Bu clone2 = bu.clone();
            bu.f24745n = false;
            bu.f24746u = 0;
            C9 A9 = H9.A();
            A9 B3 = B9.B();
            B3.h();
            ((B9) B3.f28504u).C();
            F9 B9 = G9.B();
            boolean z6 = clone.f34540n;
            B9.h();
            ((G9) B9.f28504u).C(z6);
            boolean z9 = clone.f34541u;
            B9.h();
            ((G9) B9.f28504u).D(z9);
            int i9 = clone2.f24746u;
            B9.h();
            ((G9) B9.f28504u).A(i9);
            B3.h();
            ((B9) B3.f28504u).A((G9) B9.j());
            A9.h();
            ((H9) A9.f28504u).B((B9) B3.j());
            c4043uu.f35367a.c().f27420f.A((H9) A9.j());
            D();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q(s2.c1 c1Var, int i) {
        this.f36135w = null;
        Jr jr = new Jr(i);
        C3717or c3717or = new C3717or(this);
        ((T8) this.f36133u).d(c1Var, (String) this.f36134v, jr, c3717or);
    }

    public long r() {
        K0 k02 = (K0) this.f36135w;
        if (k02 != null) {
            return k02.f26571w;
        }
        return -1L;
    }

    public HE s() {
        C3128du c3128du;
        C3263gK b9;
        JE je = (JE) this.f36133u;
        if (je == null || (c3128du = (C3128du) this.f36134v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (je.f26411a != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (je.a() && ((Integer) this.f36135w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((JE) this.f36133u).a() && ((Integer) this.f36135w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3902sE c3902sE = ((JE) this.f36133u).f26413c;
        if (c3902sE == C3902sE.f34683j) {
            b9 = AbstractC3367iG.f31791a;
        } else if (c3902sE == C3902sE.i) {
            b9 = AbstractC3367iG.a(((Integer) this.f36135w).intValue());
        } else {
            if (c3902sE != C3902sE.f34682h) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((JE) this.f36133u).f26413c)));
            }
            b9 = AbstractC3367iG.b(((Integer) this.f36135w).intValue());
        }
        return new HE((JE) this.f36133u, (C3128du) this.f36134v, b9, (Integer) this.f36135w);
    }

    public OE t() {
        C3128du c3128du;
        C3263gK b9;
        QE qe = (QE) this.f36133u;
        if (qe == null || (c3128du = (C3128du) this.f36134v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qe.f27793a != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qe.a() && ((Integer) this.f36135w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((QE) this.f36133u).a() && ((Integer) this.f36135w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        FE fe = ((QE) this.f36133u).f27794b;
        if (fe == FE.f25516C) {
            b9 = AbstractC3367iG.f31791a;
        } else if (fe == FE.f25515B) {
            b9 = AbstractC3367iG.a(((Integer) this.f36135w).intValue());
        } else {
            if (fe != FE.f25514A) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((QE) this.f36133u).f27794b)));
            }
            b9 = AbstractC3367iG.b(((Integer) this.f36135w).intValue());
        }
        return new OE((QE) this.f36133u, (C3128du) this.f36134v, b9, (Integer) this.f36135w);
    }

    public EG u() {
        C3128du c3128du;
        C3263gK a9;
        GG gg = (GG) this.f36133u;
        if (gg == null || (c3128du = (C3128du) this.f36134v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (gg.f25751a != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gg.a() && ((Integer) this.f36135w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((GG) this.f36133u).a() && ((Integer) this.f36135w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3956tE c3956tE = ((GG) this.f36133u).f25753c;
        if (c3956tE == C3956tE.f35032u) {
            a9 = AbstractC3367iG.f31791a;
        } else if (c3956tE == C3956tE.f35031t || c3956tE == C3956tE.f35030s) {
            a9 = AbstractC3367iG.a(((Integer) this.f36135w).intValue());
        } else {
            if (c3956tE != C3956tE.f35029r) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((GG) this.f36133u).f25753c)));
            }
            a9 = AbstractC3367iG.b(((Integer) this.f36135w).intValue());
        }
        return new EG((GG) this.f36133u, (C3128du) this.f36134v, a9, (Integer) this.f36135w);
    }

    public IG v() {
        C3128du c3128du;
        C3263gK a9;
        LG lg = (LG) this.f36133u;
        if (lg == null || (c3128du = (C3128du) this.f36134v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lg.f26887a != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (lg.a() && ((Integer) this.f36135w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((LG) this.f36133u).a() && ((Integer) this.f36135w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        FE fe = ((LG) this.f36133u).f26889c;
        if (fe == FE.f25522I) {
            a9 = AbstractC3367iG.f31791a;
        } else if (fe == FE.f25521H || fe == FE.f25520G) {
            a9 = AbstractC3367iG.a(((Integer) this.f36135w).intValue());
        } else {
            if (fe != FE.f25519F) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((LG) this.f36133u).f26889c)));
            }
            a9 = AbstractC3367iG.b(((Integer) this.f36135w).intValue());
        }
        return new IG((LG) this.f36133u, (C3128du) this.f36134v, a9, (Integer) this.f36135w);
    }

    public C3800qJ w() {
        C3263gK a9;
        if (((C3692oJ) this.f36133u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f36134v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        C3692oJ c3692oJ = (C3692oJ) this.f36133u;
        int i = c3692oJ.f33678a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.x.o(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (c3692oJ.a() && ((Integer) this.f36135w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C3692oJ) this.f36133u).a() && ((Integer) this.f36135w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3579mE c3579mE = ((C3692oJ) this.f36133u).f33680c;
        if (c3579mE == C3579mE.f32704M) {
            a9 = AbstractC3367iG.f31791a;
        } else if (c3579mE == C3579mE.f32703L || c3579mE == C3579mE.f32702K) {
            a9 = AbstractC3367iG.a(((Integer) this.f36135w).intValue());
        } else {
            if (c3579mE != C3579mE.J) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((C3692oJ) this.f36133u).f33680c)));
            }
            a9 = AbstractC3367iG.b(((Integer) this.f36135w).intValue());
        }
        return new C3800qJ((C3692oJ) this.f36133u, (BigInteger) this.f36134v, a9, (Integer) this.f36135w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public long x(int i) {
        AbstractC2792Sd.i(i >= 0);
        long[] jArr = (long[]) this.f36135w;
        AbstractC2792Sd.i(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ P3.a y(S0.e eVar, InterfaceC4312zt interfaceC4312zt) {
        return j(null);
    }

    public /* synthetic */ C4297ze(int i, Object obj, Object obj2, Object obj3) {
        this.f36132n = i;
        this.f36133u = obj;
        this.f36134v = obj2;
        this.f36135w = obj3;
    }

    public /* synthetic */ C4297ze(int i, boolean z6) {
        this.f36132n = i;
        this.f36133u = null;
        this.f36134v = null;
        this.f36135w = null;
    }

    public C4297ze(T8 t82, String str) {
        this.f36132n = 15;
        this.f36133u = t82;
        this.f36134v = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public /* synthetic */ void mo6a(Object obj) {
        Wu wu;
        switch (this.f36132n) {
            case 6:
                w2.z.k("loadNewJavascriptEngine (success): Trying to acquire lock");
                g7.m mVar = (g7.m) this.f36135w;
                synchronized (mVar.f37691d) {
                    try {
                        w2.z.k("loadNewJavascriptEngine (success): Lock acquired");
                        mVar.f37690c = 0;
                        C2874Xc c2874Xc = (C2874Xc) mVar.f37695h;
                        if (c2874Xc != null && ((C2874Xc) this.f36133u) != c2874Xc) {
                            w2.z.k("New JS engine is loaded, marking previous one as destroyable.");
                            ((C2874Xc) mVar.f37695h).u();
                        }
                        mVar.f37695h = (C2874Xc) this.f36133u;
                        if (((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue() && (wu = (Wu) mVar.f37694g) != null) {
                            Su su = (Su) this.f36134v;
                            su.a(true);
                            wu.b(su.q());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                w2.z.k("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((InterfaceC4022uQ) obj).q(0, ((AP) this.f36133u).f24455a, (C3429jQ) this.f36134v, (C3699oQ) this.f36135w);
                return;
        }
    }

    public C4297ze(C4026ud c4026ud, C3972td c3972td, InterfaceC4134wd interfaceC4134wd) {
        this.f36132n = 9;
        this.f36134v = c4026ud;
        this.f36135w = c3972td;
        this.f36133u = interfaceC4134wd;
    }

    public C4297ze(int i) {
        int i4 = 0;
        this.f36132n = i;
        switch (i) {
            case 5:
                this.f36133u = new ArrayList();
                this.f36134v = new ArrayList();
                this.f36135w = new ArrayList();
                break;
            case 18:
                this.f36134v = new ArrayDeque();
                this.f36135w = null;
                this.f36133u = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                String str = AbstractC3182eu.f30782a;
                this.f36133u = new J(i4, Executors.newSingleThreadExecutor(new Pt("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public C4297ze(Context context) {
        this.f36132n = 26;
        this.f36133u = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f36134v = KO.f26668f;
        }
    }

    public C4297ze(Context context, Executor executor, C3787q6 c3787q6, C3717or c3717or) {
        this.f36132n = 4;
        this.f36134v = c3717or;
        this.f36135w = c3787q6;
        this.f36133u = QC.o(new E2.w(1, this, context), executor);
    }

    public C4297ze(C4297ze c4297ze, RD rd) {
        this.f36132n = 16;
        this.f36135w = new C3609mr((byte) 0, 10);
        this.f36133u = c4297ze;
        this.f36134v = rd;
    }

    public C4297ze(C2499Aq c2499Aq, C3500kq c3500kq, St st) {
        this.f36132n = 14;
        this.f36133u = c3500kq;
        this.f36134v = st;
        Objects.requireNonNull(c2499Aq);
        this.f36135w = c2499Aq;
    }

    public C4297ze(C3989tu c3989tu) {
        this.f36132n = 17;
        this.f36133u = new ConcurrentHashMap(c3989tu.f35196x);
        this.f36134v = c3989tu;
        this.f36135w = new M4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.ON, java.lang.Object] */
    public /* synthetic */ C4297ze(PN pn, Context context) {
        this.f36132n = 25;
        Objects.requireNonNull(pn);
        this.f36135w = pn;
        this.f36133u = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.ON
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                PN pn2 = (PN) C4297ze.this.f36135w;
                if (pn2.f27588w0) {
                    return;
                }
                pn2.h2(1, 19, Integer.valueOf(i));
            }
        };
        this.f36134v = r02;
        context.registerDeviceIdChangeListener(new J(2, pn.f27561N.x(pn.f27559L, null)), r02);
    }

    public C4297ze(g7.m mVar, C2874Xc c2874Xc, Su su) {
        this.f36132n = 6;
        this.f36133u = c2874Xc;
        this.f36134v = su;
        Objects.requireNonNull(mVar);
        this.f36135w = mVar;
    }

    public C4297ze(ArrayList arrayList) {
        this.f36132n = 2;
        this.f36133u = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f36134v = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            W3 w3 = (W3) arrayList.get(i);
            long[] jArr = (long[]) this.f36134v;
            int i4 = i + i;
            jArr[i4] = w3.f29109b;
            jArr[i4 + 1] = w3.f29110c;
        }
        long[] jArr2 = (long[]) this.f36134v;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f36135w = copyOf;
        Arrays.sort(copyOf);
    }

    public C4297ze(List list) {
        this.f36132n = 3;
        this.f36133u = list;
        this.f36134v = new InterfaceC3566m1[list.size()];
        this.f36135w = new C2749Pl(new Ux(4, this));
    }
}
