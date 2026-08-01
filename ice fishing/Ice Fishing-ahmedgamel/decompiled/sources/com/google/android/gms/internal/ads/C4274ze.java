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
import k2.C4631a;
import p2.C4835j;
import q2.C4878e;
import q2.C4896n;
import q2.C4900p;
import t0.C4986A;
import v2.C5110a;
import x2.InterfaceC5194h;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4274ze implements InterfaceC3707p3, InterfaceC3575mg, InterfaceC5194h, x2.k, x2.m, InterfaceC2708Oh, Eu, InterfaceC2844Wl, At, InterfaceC2992bn {

    /* renamed from: x, reason: collision with root package name */
    public static InterfaceC2774Sf f35356x;

    /* renamed from: y, reason: collision with root package name */
    public static final D f35357y;

    /* renamed from: z, reason: collision with root package name */
    public static final D f35358z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35359n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35360u;

    /* renamed from: v, reason: collision with root package name */
    public Object f35361v;

    /* renamed from: w, reason: collision with root package name */
    public Object f35362w;

    static {
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        f35357y = new D(2, j6);
        f35358z = new D(3, j6);
    }

    public /* synthetic */ C4274ze(int i, Object obj) {
        this.f35359n = i;
        this.f35360u = obj;
    }

    public static String A(Context context) {
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
                EC f3 = EC.f24557f.f();
                byte[] digest = messageDigest.digest();
                String g4 = f3.g(digest.length, digest);
                fileInputStream.close();
                return g4;
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

    public ArrayList B() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f35361v).iterator();
        while (it.hasNext()) {
            String str = (String) q2.r.f40207e.f40210c.a((C3301ha) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC3043cl.y(arrayList2, new C3493l5("gad:dynamite_module:experiment_id", "", 4));
        AbstractC3043cl.y(arrayList2, SK.f27431A);
        AbstractC3043cl.y(arrayList2, SK.f27432B);
        AbstractC3043cl.y(arrayList2, SK.f27433C);
        AbstractC3043cl.y(arrayList2, SK.f27434D);
        AbstractC3043cl.y(arrayList2, SK.f27435E);
        AbstractC3043cl.y(arrayList2, SK.f27450U);
        AbstractC3043cl.y(arrayList2, SK.f27436F);
        AbstractC3043cl.y(arrayList2, SK.f27442M);
        AbstractC3043cl.y(arrayList2, SK.f27443N);
        AbstractC3043cl.y(arrayList2, SK.f27444O);
        AbstractC3043cl.y(arrayList2, SK.f27445P);
        AbstractC3043cl.y(arrayList2, SK.f27446Q);
        AbstractC3043cl.y(arrayList2, SK.f27447R);
        AbstractC3043cl.y(arrayList2, SK.f27448S);
        AbstractC3043cl.y(arrayList2, SK.f27449T);
        AbstractC3043cl.y(arrayList2, SK.f27437G);
        AbstractC3043cl.y(arrayList2, SK.f27438H);
        AbstractC3043cl.y(arrayList2, SK.f27439I);
        AbstractC3043cl.y(arrayList2, SK.J);
        AbstractC3043cl.y(arrayList2, SK.f27440K);
        AbstractC3043cl.y(arrayList2, SK.f27441L);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public ArrayList C() {
        ArrayList B9 = B();
        Iterator it = ((ArrayList) this.f35362w).iterator();
        while (it.hasNext()) {
            String str = (String) q2.r.f40207e.f40210c.a((C3301ha) it.next());
            if (!TextUtils.isEmpty(str)) {
                B9.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3043cl.y(arrayList, AbstractC2639Kg.f25955x);
        B9.addAll(arrayList);
        return B9;
    }

    public void D() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32294k7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            C3966tu c3966tu = (C3966tu) this.f35361v;
            sb.append(c3966tu.f34420v);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            M4 m4 = (M4) this.f35362w;
            sb2.append(m4.f26241c);
            sb2.append("\n\tNew pools created: ");
            sb2.append(m4.f26239a);
            sb2.append("\n\tPools removed: ");
            sb2.append(m4.f26240b);
            sb2.append("\n\tEntries added: ");
            sb2.append(m4.f26243e);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(m4.f26242d);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f35360u).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC4074vu) entry.getKey()).hashCode());
                sb.append("    ");
                int i6 = 0;
                while (true) {
                    C3805qu c3805qu = (C3805qu) entry.getValue();
                    c3805qu.a();
                    if (i6 >= c3805qu.f33437a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i6++;
                }
                C3805qu c3805qu2 = (C3805qu) entry.getValue();
                c3805qu2.a();
                for (int size = c3805qu2.f33437a.size(); size < c3966tu.f34422x; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                C3805qu c3805qu3 = (C3805qu) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                Cu cu = c3805qu3.f33440d;
                sb3.append(cu.f24258a);
                sb3.append(" Last accessed: ");
                sb3.append(cu.f24260c);
                sb3.append(" Accesses: ");
                sb3.append(cu.f24261d);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(cu.f24262e);
                sb3.append(" Stale: ");
                sb3.append(cu.f24263f);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < c3966tu.f34421w) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb4 = sb.toString();
            int i9 = u2.z.f41322b;
            v2.i.a(sb4);
        }
    }

    public ID E(C2739Qe c2739Qe, InterfaceC2478Ap interfaceC2478Ap, InterfaceC2478Ap interfaceC2478Ap2, BD bd) {
        String str = c2739Qe.f27044w;
        u2.D d2 = C4835j.f39733C.f39738c;
        boolean e9 = u2.D.e(str);
        C3360ig c3360ig = (C3360ig) this.f35360u;
        return QC.r(QC.t(QC.t(ID.s(e9 ? QC.k(new C4231yp(1)) : QC.r(interfaceC2478Ap.d(c2739Qe), ExecutionException.class, C2556Fi.f24825g, c3360ig)), C2556Fi.f24823e, c3360ig), bd, c3360ig), C4231yp.class, new C3196fd(this, interfaceC2478Ap2, c2739Qe, bd, 3), c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        switch (this.f35359n) {
            case 12:
                return m((C2597Hp) obj);
            default:
                C2800Tp c2800Tp = (C2800Tp) this.f35360u;
                c2800Tp.getClass();
                c2800Tp.f27797u.execute(new RunnableC3865s0(7, (SQLiteDatabase) obj, (String) this.f35362w, (v2.l) this.f35361v));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public ArrayList b(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f35360u;
            if (i >= list.size()) {
                break;
            }
            int i6 = i + i;
            long[] jArr = (long[]) this.f35361v;
            if (jArr[i6] <= j6 && j6 < jArr[i6 + 1]) {
                W3 w32 = (W3) list.get(i);
                C4279zj c4279zj = w32.f28310a;
                if (c4279zj.f35432e == -3.4028235E38f) {
                    arrayList2.add(w32);
                } else {
                    arrayList.add(c4279zj);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, C3004c.f29390H);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            C4279zj c4279zj2 = ((W3) arrayList2.get(i9)).f28310a;
            arrayList.add(new C4279zj(c4279zj2.f35428a, c4279zj2.f35429b, c4279zj2.f35430c, c4279zj2.f35431d, (-1) - i9, 1, c4279zj2.f35434g, c4279zj2.f35435h, c4279zj2.i, c4279zj2.f35438l, c4279zj2.f35439m, c4279zj2.f35436j, c4279zj2.f35437k, c4279zj2.f35440n, c4279zj2.f35441o, c4279zj2.f35442p));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public int c() {
        return ((long[]) this.f35362w).length;
    }

    public void d() {
        P2.w.d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        v2.i.a(sb.toString());
        try {
            ((InterfaceC3841rd) this.f35360u).j0(0);
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        C3267gu c3267gu;
        try {
            C3535lu c3535lu = (C3535lu) ((C3477kq) this.f35360u).f31639b;
            c3535lu.b(z3);
            int i = ((C5110a) ((C2479Aq) this.f35362w).f23754d).f41393v;
            int intValue = ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32325o1)).intValue();
            InterfaceC3680od interfaceC3680od = c3535lu.f31864a;
            if (i < intValue) {
                try {
                    interfaceC3680od.g();
                    return;
                } finally {
                }
            } else {
                try {
                    interfaceC3680od.I3(new W2.b(context));
                    return;
                } finally {
                }
            }
        } catch (C3267gu e9) {
            int i6 = u2.z.f41322b;
            v2.i.e("Cannot show interstitial.");
            throw new C2828Vl(e9.getCause());
        }
        int i62 = u2.z.f41322b;
        v2.i.e("Cannot show interstitial.");
        throw new C2828Vl(e9.getCause());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f35361v;
    }

    public void g(C4631a c4631a) {
        P2.w.d("#008 Must be called on the main UI thread.");
        int i = c4631a.f38568a;
        int length = String.valueOf(i).length();
        String str = c4631a.f38569b;
        int length2 = String.valueOf(str).length();
        String str2 = c4631a.f38570c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        v2.i.a(sb.toString());
        try {
            ((InterfaceC3841rd) this.f35360u).n3(c4631a.a());
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void h(C4631a c4631a) {
        P2.w.d("#008 Must be called on the main UI thread.");
        int i = c4631a.f38568a;
        int length = String.valueOf(i).length();
        String str = c4631a.f38569b;
        int length2 = String.valueOf(str).length();
        String str2 = c4631a.f38570c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        v2.i.a(sb.toString());
        try {
            ((InterfaceC3841rd) this.f35360u).n3(c4631a.a());
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void i(C4631a c4631a) {
        P2.w.d("#008 Must be called on the main UI thread.");
        int i = c4631a.f38568a;
        int length = String.valueOf(i).length();
        String str = c4631a.f38569b;
        int length2 = String.valueOf(str).length();
        String str2 = c4631a.f38570c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        v2.i.a(sb.toString());
        try {
            ((InterfaceC3841rd) this.f35360u).n3(c4631a.a());
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public ID j(InterfaceC3633nk interfaceC3633nk) {
        N3.a c9;
        N3.a q8;
        C4274ze c4274ze = (C4274ze) this.f35360u;
        RD rd = (RD) this.f35361v;
        C3481ku c3481ku = new C3481ku(c4274ze, interfaceC3633nk, rd);
        C4127wt c4127wt = (C4127wt) c3481ku.f31665w;
        if (c4127wt == null) {
            if (((Boolean) AbstractC2833Wa.f28355a.r()).booleanValue()) {
                C2710Oj c10 = interfaceC3633nk.c();
                Ju ju = Ju.GET_CACHE_KEY;
                Iu s9 = c10.f26641c.a(c10.i.d(), ju).j(new C2.s(4, c10, (C3966tu) c4274ze.f35361v)).s();
                s9.a(new LD(0, s9, new C3657o7(14, c10)), c10.f26647j);
                q8 = QC.q(QC.u(ID.s(s9), new C4073vt(c3481ku, 1), rd), C4231yp.class, new C4073vt(c3481ku, 0), rd);
            } else {
                C4127wt c4127wt2 = new C4127wt(null, c3481ku.A());
                c3481ku.f31665w = c4127wt2;
                q8 = QC.c(c4127wt2);
            }
            c9 = QC.u(q8, L2.f26035q, rd);
        } else {
            c9 = QC.c(c4127wt);
        }
        return QC.q(QC.t(ID.s(c9), new C2.s(14, this, interfaceC3633nk), rd), Exception.class, new L2(16), rd);
    }

    public void k(S0 s02, F4 f42) {
        int i = 0;
        while (true) {
            InterfaceC3543m1[] interfaceC3543m1Arr = (InterfaceC3543m1[]) this.f35361v;
            if (i >= interfaceC3543m1Arr.length) {
                return;
            }
            f42.a();
            f42.b();
            InterfaceC3543m1 C8 = s02.C(f42.f24745d, 3);
            DP dp = (DP) ((List) this.f35360u).get(i);
            String str = dp.f24431o;
            boolean z3 = true;
            if (!com.anythink.basead.exoplayer.k.o.f8441W.equals(str) && !com.anythink.basead.exoplayer.k.o.f8442X.equals(str)) {
                z3 = false;
            }
            AbstractC2772Sd.C(z3, "Invalid closed caption MIME type provided: %s", str);
            String str2 = dp.f24418a;
            if (str2 == null) {
                f42.b();
                str2 = f42.f24746e;
            }
            C3299hP c3299hP = new C3299hP();
            c3299hP.f30780a = str2;
            c3299hP.d("video/mp2t");
            c3299hP.e(str);
            c3299hP.f30784e = dp.f24422e;
            c3299hP.f30783d = dp.f24421d;
            c3299hP.f30777M = dp.f24414N;
            c3299hP.f30795q = dp.f24434r;
            C8.e(new DP(c3299hP));
            interfaceC3543m1Arr[i] = C8;
            i++;
        }
    }

    public void l(InterfaceC3613nH interfaceC3613nH, Uri uri, Map map, long j6, long j9, CQ cq) {
        boolean z3;
        boolean z6 = true;
        K0 k02 = new K0(interfaceC3613nH, j6, j9);
        this.f35362w = k02;
        if (((Q0) this.f35361v) != null) {
            return;
        }
        Q0[] d2 = ((T0) this.f35360u).d(uri, map);
        int length = d2.length;
        PB pb = RB.f27177u;
        MA.q(length, "expectedSize");
        OB ob = new OB(length);
        if (length == 1) {
            this.f35361v = d2[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Q0 q02 = d2[i];
                try {
                } catch (EOFException unused) {
                    z3 = ((Q0) this.f35361v) != null || k02.f25819w == j6;
                } catch (Throwable th) {
                    if (((Q0) this.f35361v) == null && k02.f25819w != j6) {
                        z6 = false;
                    }
                    AbstractC2772Sd.H(z6);
                    k02.f25821y = 0;
                    throw th;
                }
                if (q02.d(k02)) {
                    this.f35361v = q02;
                    k02.f25821y = 0;
                    break;
                } else {
                    ob.b(q02.f());
                    z3 = ((Q0) this.f35361v) != null || k02.f25819w == j6;
                    AbstractC2772Sd.H(z3);
                    k02.f25821y = 0;
                    i++;
                }
            }
            if (((Q0) this.f35361v) == null) {
                Iterator it = AbstractC2968bG.w(RB.o(d2), Oz.f26700e).iterator();
                StringBuilder sb = new StringBuilder();
                AbstractC2968bG.z(sb, it, ", ");
                String sb2 = sb.toString();
                throw new QQ(D.y.s(new StringBuilder(sb2.length() + 58), "None of the available extractors (", sb2, ") could read the stream."), ob.f());
            }
        }
        ((Q0) this.f35361v).b(cq);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0294, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        v2.i.f(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02cf, code lost:
    
        throw new com.google.android.gms.internal.ads.C3208fp(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020d, code lost:
    
        r13.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f2, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2614Ip m(C2597Hp c2597Hp) {
        int i;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        C4274ze c4274ze = this;
        String str = c2597Hp.f25381a;
        int i6 = c2597Hp.f25382b;
        HashMap hashMap = c2597Hp.f25383c;
        byte[] bArr = c2597Hp.f25384d;
        String str2 = c2597Hp.f25385e;
        C4835j.f39733C.f39745k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C2614Ip c2614Ip = new C2614Ip();
            c2614Ip.f25592a = 0;
            c2614Ip.f25593b = new HashMap();
            c2614Ip.f25594c = "";
            c2614Ip.f25595d = -1L;
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32235e3)).booleanValue() && C4900p.f40199g.f40202c) {
                c2614Ip.f25592a = 410;
                return c2614Ip;
            }
            String str3 = (String) c4274ze.f35361v;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String sb2 = sb.toString();
            int i9 = u2.z.f41322b;
            v2.i.e(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            v2.i.a(sb3.toString());
            URL url = new URL(str);
            HashMap hashMap2 = new HashMap();
            int i10 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = (String) c4274ze.f35362w;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        C4835j.f39733C.f39738c.B((Context) c4274ze.f35360u, str3, httpURLConnection, i6);
                        for (Iterator it = hashMap.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        v2.f fVar = new v2.f();
                        try {
                            fVar.a(httpURLConnection, bArr);
                            i = i6;
                        } catch (Throwable th) {
                            v2.i.d("Network request logging failed.", th);
                            i = i6;
                            C4835j.f39733C.f39743h.e("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i11 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    T2.b.c(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    T2.b.c(bufferedOutputStream);
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
                            int i12 = i11;
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
                            i11 = i12;
                        }
                        int i13 = i11;
                        HashMap hashMap3 = hashMap;
                        fVar.b(httpURLConnection, responseCode);
                        c2614Ip.f25592a = responseCode;
                        c2614Ip.f25593b = hashMap2;
                        c2614Ip.f25594c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = null;
                            }
                            try {
                                u2.D d2 = C4835j.f39733C.f39738c;
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
                                T2.b.c(inputStreamReader2);
                                if (v2.f.c() && sb5 != null) {
                                    fVar.e("onNetworkResponseBody", new C4986A(sb5.getBytes()));
                                }
                                c2614Ip.f25594c = sb5;
                                if (TextUtils.isEmpty(sb5)) {
                                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32413x6)).booleanValue()) {
                                        throw new C3208fp(3);
                                    }
                                }
                                C4835j.f39733C.f39745k.getClass();
                                c2614Ip.f25595d = SystemClock.elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                T2.b.c(inputStreamReader);
                                throw th;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                v2.i.f("No location header to follow redirect.");
                                throw new C3208fp(1, "No location header to follow redirect");
                            }
                            C3301ha c3301ha = AbstractC3569ma.T8;
                            q2.r rVar = q2.r.f40207e;
                            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e9) {
                                    throw new C3208fp(e9.getMessage(), e9);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i10++;
                            if (i10 > ((Integer) rVar.f40210c.a(AbstractC3569ma.f32256g6)).intValue()) {
                                v2.i.f("Too many redirects.");
                                throw new C3208fp(i13, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            c4274ze = this;
                            i6 = i;
                            hashMap = hashMap3;
                        }
                    } catch (C3208fp e10) {
                        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.x9)).booleanValue()) {
                            throw e10;
                        }
                        C4835j.f39733C.f39745k.getClass();
                        c2614Ip.f25595d = SystemClock.elapsedRealtime() - elapsedRealtime;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
        } catch (IOException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            int i14 = u2.z.f41322b;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            v2.i.f(concat);
            throw new C3208fp(concat, e11);
        }
    }

    public void n(F2.b bVar) {
        InterfaceC2774Sf interfaceC2774Sf;
        W2.b bVar2;
        InterfaceC2774Sf interfaceC2774Sf2;
        q2.c1 a9;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f35360u;
        synchronized (C4274ze.class) {
            try {
                if (f35356x == null) {
                    C4896n c4896n = C4900p.f40199g.f40201b;
                    BinderC3464kd binderC3464kd = new BinderC3464kd();
                    c4896n.getClass();
                    f35356x = (InterfaceC2774Sf) new C4878e(c4896n, context, binderC3464kd).d(context, false);
                }
                interfaceC2774Sf = f35356x;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC2774Sf == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        W2.b bVar3 = new W2.b(context);
        q2.F0 f02 = (q2.F0) this.f35362w;
        if (f02 == null) {
            bVar2 = bVar3;
            interfaceC2774Sf2 = interfaceC2774Sf;
            a9 = new q2.c1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, currentTimeMillis, 0L, -1);
        } else {
            bVar2 = bVar3;
            interfaceC2774Sf2 = interfaceC2774Sf;
            f02.f40036n = currentTimeMillis;
            a9 = q2.e1.a(context, f02);
        }
        try {
            interfaceC2774Sf2.r0(bVar2, new C2838Wf(null, ((k2.b) this.f35361v).name(), null, a9), new BinderC4220ye(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ Object o() {
        return null;
    }

    public synchronized void p(InterfaceC4074vu interfaceC4074vu, C4020uu c4020uu) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f35360u;
            C3805qu c3805qu = (C3805qu) concurrentHashMap.get(interfaceC4074vu);
            C4835j.f39733C.f39745k.getClass();
            c4020uu.f34607d = System.currentTimeMillis();
            if (c3805qu == null) {
                C3966tu c3966tu = (C3966tu) this.f35361v;
                C3805qu c3805qu2 = new C3805qu(c3966tu.f34422x, c3966tu.f34423y * 1000);
                if (concurrentHashMap.size() == c3966tu.f34421w) {
                    int i = c3966tu.f34417C;
                    int i6 = i - 1;
                    InterfaceC4074vu interfaceC4074vu2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j6 = Long.MAX_VALUE;
                    if (i6 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((C3805qu) entry.getValue()).f33440d.f24258a < j6) {
                                j6 = ((C3805qu) entry.getValue()).f33440d.f24258a;
                                interfaceC4074vu2 = (InterfaceC4074vu) entry.getKey();
                            }
                        }
                        if (interfaceC4074vu2 != null) {
                            concurrentHashMap.remove(interfaceC4074vu2);
                        }
                    } else if (i6 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((C3805qu) entry2.getValue()).f33440d.f24260c < j6) {
                                j6 = ((C3805qu) entry2.getValue()).f33440d.f24260c;
                                interfaceC4074vu2 = (InterfaceC4074vu) entry2.getKey();
                            }
                        }
                        if (interfaceC4074vu2 != null) {
                            concurrentHashMap.remove(interfaceC4074vu2);
                        }
                    } else if (i6 == 2) {
                        int i9 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((C3805qu) entry3.getValue()).f33440d.f24261d < i9) {
                                i9 = ((C3805qu) entry3.getValue()).f33440d.f24261d;
                                interfaceC4074vu2 = (InterfaceC4074vu) entry3.getKey();
                            }
                        }
                        if (interfaceC4074vu2 != null) {
                            concurrentHashMap.remove(interfaceC4074vu2);
                        }
                    }
                    M4 m4 = (M4) this.f35362w;
                    m4.f26240b++;
                    ((C3858ru) m4.f26244f).f33773u = true;
                }
                concurrentHashMap.put(interfaceC4074vu, c3805qu2);
                M4 m42 = (M4) this.f35362w;
                m42.f26239a++;
                ((C3858ru) m42.f26244f).f33772n = true;
                c3805qu = c3805qu2;
            }
            Cu cu = c3805qu.f33440d;
            cu.getClass();
            C4835j.f39733C.f39745k.getClass();
            cu.f24260c = System.currentTimeMillis();
            cu.f24261d++;
            c3805qu.a();
            LinkedList linkedList = c3805qu.f33437a;
            if (linkedList.size() != c3805qu.f33438b) {
                linkedList.add(c4020uu);
            }
            M4 m43 = (M4) this.f35362w;
            m43.f26243e++;
            C3858ru c3858ru = (C3858ru) m43.f26244f;
            C3858ru clone = c3858ru.clone();
            c3858ru.f33772n = false;
            c3858ru.f33773u = false;
            Bu bu = c3805qu.f33440d.f24259b;
            Bu clone2 = bu.clone();
            bu.f23982n = false;
            bu.f23983u = 0;
            C9 A9 = H9.A();
            A9 B9 = B9.B();
            B9.h();
            ((B9) B9.f27721u).C();
            F9 B10 = G9.B();
            boolean z3 = clone.f33772n;
            B10.h();
            ((G9) B10.f27721u).C(z3);
            boolean z6 = clone.f33773u;
            B10.h();
            ((G9) B10.f27721u).D(z6);
            int i10 = clone2.f23983u;
            B10.h();
            ((G9) B10.f27721u).A(i10);
            B9.h();
            ((B9) B9.f27721u).A((G9) B10.j());
            A9.h();
            ((H9) A9.f27721u).B((B9) B9.j());
            c4020uu.f34604a.c().f26644f.B((H9) A9.j());
            D();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q(q2.c1 c1Var, int i) {
        this.f35362w = null;
        Jr jr = new Jr(i);
        C3694or c3694or = new C3694or(this);
        ((T8) this.f35360u).d(c1Var, (String) this.f35361v, jr, c3694or);
    }

    public long r() {
        K0 k02 = (K0) this.f35362w;
        if (k02 != null) {
            return k02.f25819w;
        }
        return -1L;
    }

    public HE s() {
        C3105du c3105du;
        C3240gK b9;
        JE je = (JE) this.f35360u;
        if (je == null || (c3105du = (C3105du) this.f35361v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (je.f25658a != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (je.a() && ((Integer) this.f35362w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((JE) this.f35360u).a() && ((Integer) this.f35362w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3879sE c3879sE = ((JE) this.f35360u).f25660c;
        if (c3879sE == C3879sE.f33915j) {
            b9 = AbstractC3344iG.f31018a;
        } else if (c3879sE == C3879sE.i) {
            b9 = AbstractC3344iG.a(((Integer) this.f35362w).intValue());
        } else {
            if (c3879sE != C3879sE.f33914h) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((JE) this.f35360u).f25660c)));
            }
            b9 = AbstractC3344iG.b(((Integer) this.f35362w).intValue());
        }
        return new HE((JE) this.f35360u, (C3105du) this.f35361v, b9, (Integer) this.f35362w);
    }

    public OE t() {
        C3105du c3105du;
        C3240gK b9;
        QE qe = (QE) this.f35360u;
        if (qe == null || (c3105du = (C3105du) this.f35361v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qe.f27006a != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qe.a() && ((Integer) this.f35362w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((QE) this.f35360u).a() && ((Integer) this.f35362w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        FE fe = ((QE) this.f35360u).f27007b;
        if (fe == FE.f24760C) {
            b9 = AbstractC3344iG.f31018a;
        } else if (fe == FE.f24759B) {
            b9 = AbstractC3344iG.a(((Integer) this.f35362w).intValue());
        } else {
            if (fe != FE.f24758A) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((QE) this.f35360u).f27007b)));
            }
            b9 = AbstractC3344iG.b(((Integer) this.f35362w).intValue());
        }
        return new OE((QE) this.f35360u, (C3105du) this.f35361v, b9, (Integer) this.f35362w);
    }

    public EG u() {
        C3105du c3105du;
        C3240gK a9;
        GG gg = (GG) this.f35360u;
        if (gg == null || (c3105du = (C3105du) this.f35361v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (gg.f24961a != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gg.a() && ((Integer) this.f35362w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((GG) this.f35360u).a() && ((Integer) this.f35362w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3933tE c3933tE = ((GG) this.f35360u).f24963c;
        if (c3933tE == C3933tE.f34246u) {
            a9 = AbstractC3344iG.f31018a;
        } else if (c3933tE == C3933tE.f34245t || c3933tE == C3933tE.f34244s) {
            a9 = AbstractC3344iG.a(((Integer) this.f35362w).intValue());
        } else {
            if (c3933tE != C3933tE.f34243r) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((GG) this.f35360u).f24963c)));
            }
            a9 = AbstractC3344iG.b(((Integer) this.f35362w).intValue());
        }
        return new EG((GG) this.f35360u, (C3105du) this.f35361v, a9, (Integer) this.f35362w);
    }

    public IG v() {
        C3105du c3105du;
        C3240gK a9;
        LG lg = (LG) this.f35360u;
        if (lg == null || (c3105du = (C3105du) this.f35361v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lg.f26087a != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (lg.a() && ((Integer) this.f35362w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((LG) this.f35360u).a() && ((Integer) this.f35362w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        FE fe = ((LG) this.f35360u).f26089c;
        if (fe == FE.f24766I) {
            a9 = AbstractC3344iG.f31018a;
        } else if (fe == FE.f24765H || fe == FE.f24764G) {
            a9 = AbstractC3344iG.a(((Integer) this.f35362w).intValue());
        } else {
            if (fe != FE.f24763F) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((LG) this.f35360u).f26089c)));
            }
            a9 = AbstractC3344iG.b(((Integer) this.f35362w).intValue());
        }
        return new IG((LG) this.f35360u, (C3105du) this.f35361v, a9, (Integer) this.f35362w);
    }

    public C3777qJ w() {
        C3240gK a9;
        if (((C3669oJ) this.f35360u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f35361v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        C3669oJ c3669oJ = (C3669oJ) this.f35360u;
        int i = c3669oJ.f32891a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.y.r(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (c3669oJ.a() && ((Integer) this.f35362w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C3669oJ) this.f35360u).a() && ((Integer) this.f35362w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3556mE c3556mE = ((C3669oJ) this.f35360u).f32893c;
        if (c3556mE == C3556mE.f31924M) {
            a9 = AbstractC3344iG.f31018a;
        } else if (c3556mE == C3556mE.f31923L || c3556mE == C3556mE.f31922K) {
            a9 = AbstractC3344iG.a(((Integer) this.f35362w).intValue());
        } else {
            if (c3556mE != C3556mE.J) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((C3669oJ) this.f35360u).f32893c)));
            }
            a9 = AbstractC3344iG.b(((Integer) this.f35362w).intValue());
        }
        return new C3777qJ((C3669oJ) this.f35360u, (BigInteger) this.f35361v, a9, (Integer) this.f35362w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public long x(int i) {
        AbstractC2772Sd.i(i >= 0);
        long[] jArr = (long[]) this.f35362w;
        AbstractC2772Sd.i(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ N3.a y(S0.e eVar, InterfaceC4289zt interfaceC4289zt) {
        return j(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public void z(String str, int i, String str2, boolean z3) {
        Z8 z82 = (Z8) this.f35362w;
        C3314hn c3314hn = (C3314hn) this.f35360u;
        if (z3) {
            q2.Z0 z02 = c3314hn.f30930a.f29620a;
            if (z02 != null) {
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f35361v;
                if (interfaceC4061vh.g() != null) {
                    interfaceC4061vh.g().V3(z02);
                }
            }
            z82.d();
            return;
        }
        c3314hn.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        z82.c(new Zq(1, u1.h.g(sb, ", Failing URL: ", str2)));
    }

    public /* synthetic */ C4274ze(int i, Object obj, Object obj2, Object obj3) {
        this.f35359n = i;
        this.f35360u = obj;
        this.f35361v = obj2;
        this.f35362w = obj3;
    }

    public /* synthetic */ C4274ze(int i, boolean z3) {
        this.f35359n = i;
        this.f35360u = null;
        this.f35361v = null;
        this.f35362w = null;
    }

    public C4274ze(T8 t82, String str) {
        this.f35359n = 15;
        this.f35360u = t82;
        this.f35361v = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        Wu wu;
        switch (this.f35359n) {
            case 6:
                u2.z.k("loadNewJavascriptEngine (success): Trying to acquire lock");
                g7.m mVar = (g7.m) this.f35362w;
                synchronized (mVar.f37666d) {
                    try {
                        u2.z.k("loadNewJavascriptEngine (success): Lock acquired");
                        mVar.f37665c = 0;
                        C2851Xc c2851Xc = (C2851Xc) mVar.f37670h;
                        if (c2851Xc != null && ((C2851Xc) this.f35360u) != c2851Xc) {
                            u2.z.k("New JS engine is loaded, marking previous one as destroyable.");
                            ((C2851Xc) mVar.f37670h).u();
                        }
                        mVar.f37670h = (C2851Xc) this.f35360u;
                        if (((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue() && (wu = (Wu) mVar.f37669g) != null) {
                            Su su = (Su) this.f35361v;
                            su.a(true);
                            wu.b(su.q());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u2.z.k("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((InterfaceC3837rQ) obj).q(0, ((AP) this.f35360u).f23675a, (C3246gQ) this.f35361v, (C3514lQ) this.f35362w);
                return;
        }
    }

    public C4274ze(C4003ud c4003ud, C3949td c3949td, InterfaceC4111wd interfaceC4111wd) {
        this.f35359n = 9;
        this.f35361v = c4003ud;
        this.f35362w = c3949td;
        this.f35360u = interfaceC4111wd;
    }

    public C4274ze(int i) {
        int i6 = 0;
        this.f35359n = i;
        switch (i) {
            case 5:
                this.f35360u = new ArrayList();
                this.f35361v = new ArrayList();
                this.f35362w = new ArrayList();
                break;
            case 18:
                this.f35361v = new ArrayDeque();
                this.f35362w = null;
                this.f35360u = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                String str = AbstractC3159eu.f29993a;
                this.f35360u = new J(i6, Executors.newSingleThreadExecutor(new Pt("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public C4274ze(Context context) {
        this.f35359n = 26;
        this.f35360u = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f35361v = KO.f25916f;
        }
    }

    public C4274ze(Context context, Executor executor, C3764q6 c3764q6, C3694or c3694or) {
        this.f35359n = 4;
        this.f35361v = c3694or;
        this.f35362w = c3764q6;
        this.f35360u = QC.o(new C2.x(1, this, context), executor);
    }

    public C4274ze(C4274ze c4274ze, RD rd) {
        this.f35359n = 16;
        this.f35362w = new C3586mr((byte) 0, 10);
        this.f35360u = c4274ze;
        this.f35361v = rd;
    }

    public C4274ze(C2479Aq c2479Aq, C3477kq c3477kq, St st) {
        this.f35359n = 14;
        this.f35360u = c3477kq;
        this.f35361v = st;
        Objects.requireNonNull(c2479Aq);
        this.f35362w = c2479Aq;
    }

    public C4274ze(C3966tu c3966tu) {
        this.f35359n = 17;
        this.f35360u = new ConcurrentHashMap(c3966tu.f34422x);
        this.f35361v = c3966tu;
        this.f35362w = new M4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.ON, java.lang.Object] */
    public /* synthetic */ C4274ze(PN pn, Context context) {
        this.f35359n = 25;
        Objects.requireNonNull(pn);
        this.f35362w = pn;
        this.f35360u = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.ON
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                PN pn2 = (PN) C4274ze.this.f35362w;
                if (pn2.f26768B0) {
                    return;
                }
                pn2.h2(1, 19, Integer.valueOf(i));
            }
        };
        this.f35361v = r02;
        context.registerDeviceIdChangeListener(new J(2, pn.f26783N.x(pn.f26781L, null)), r02);
    }

    public C4274ze(g7.m mVar, C2851Xc c2851Xc, Su su) {
        this.f35359n = 6;
        this.f35360u = c2851Xc;
        this.f35361v = su;
        Objects.requireNonNull(mVar);
        this.f35362w = mVar;
    }

    public C4274ze(ArrayList arrayList) {
        this.f35359n = 2;
        this.f35360u = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f35361v = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            W3 w32 = (W3) arrayList.get(i);
            long[] jArr = (long[]) this.f35361v;
            int i6 = i + i;
            jArr[i6] = w32.f28311b;
            jArr[i6 + 1] = w32.f28312c;
        }
        long[] jArr2 = (long[]) this.f35361v;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f35362w = copyOf;
        Arrays.sort(copyOf);
    }

    public C4274ze(List list) {
        this.f35359n = 3;
        this.f35360u = list;
        this.f35361v = new InterfaceC3543m1[list.size()];
        this.f35362w = new C2712Ol(new Ux(4, this));
    }
}
