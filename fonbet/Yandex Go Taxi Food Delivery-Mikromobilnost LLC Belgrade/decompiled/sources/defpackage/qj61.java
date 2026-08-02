package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.monetization.ads.exo.source.dash.i;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import yads.aa2;
import yads.af1;
import yads.b01;
import yads.e01;
import yads.ef1;
import yads.h30;
import yads.lk0;
import yads.po;
import yads.t31;
import yads.yc2;

/* loaded from: classes7.dex */
public final class qj61 implements dg81, sn61, av81, mp61 {
    public final ll81 A;
    public final t671 B = new t671("ChunkSampleStream");
    public final hq81 C = new hq81();
    public final ArrayList D;
    public final List E;
    public final ed81 F;
    public final ed81[] G;
    public final gr81 H;
    public lg81 I;
    public qd81 J;
    public qw81 K;
    public long L;
    public long M;
    public int N;
    public lm81 O;
    public boolean P;
    public final int a;
    public final int[] b;
    public final qd81[] c;
    public final boolean[] w;
    public final di81 x;
    public final qw81 y;
    public final sc81 z;

    public qj61(int i, int[] iArr, qd81[] qd81VarArr, di81 di81Var, qw81 qw81Var, xi71 xi71Var, long j, c981 c981Var, cw71 cw71Var, ll81 ll81Var, sc81 sc81Var) {
        this.a = i;
        this.b = iArr;
        this.c = qd81VarArr;
        this.x = di81Var;
        this.y = qw81Var;
        this.z = sc81Var;
        this.A = ll81Var;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.G = new ed81[length];
        this.w = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        ed81[] ed81VarArr = new ed81[i2];
        c981Var.getClass();
        ed81 ed81Var = new ed81(xi71Var, c981Var, cw71Var);
        this.F = ed81Var;
        int i3 = 0;
        iArr2[0] = i;
        ed81VarArr[0] = ed81Var;
        while (i3 < length) {
            ed81 ed81Var2 = new ed81(xi71Var, null, null);
            this.G[i3] = ed81Var2;
            int i4 = i3 + 1;
            ed81VarArr[i4] = ed81Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.H = new gr81(1, iArr2, ed81VarArr);
        this.L = j;
        this.M = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d5  */
    /* JADX WARN: Type inference failed for: r1v1, types: [lg81] */
    @Override // defpackage.av81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m191 a(zl61 zl61Var, long j, long j2, IOException iOException, int i) {
        long j3;
        m191 m191Var;
        boolean z;
        ArrayList arrayList;
        ll81 ll81Var;
        boolean z2;
        long j4;
        nl81 nl81Var;
        h0n h0nVar;
        long j5;
        boolean c;
        int i2;
        m191 m191Var2;
        boolean z3;
        boolean z4;
        long j6;
        lg81 lg81Var = (lg81) zl61Var;
        bh81 bh81Var = lg81Var.i;
        long j7 = lg81Var.g;
        qd81 qd81Var = lg81Var.d;
        long j8 = bh81Var.b;
        boolean z5 = lg81Var instanceof lm81;
        ArrayList arrayList2 = this.D;
        int size = arrayList2.size() - 1;
        boolean z6 = (j8 != 0 && z5 && m(size)) ? false : true;
        Uri uri = lg81Var.i.c;
        nl81 nl81Var2 = new nl81();
        int i3 = rf71.a;
        ll81 ll81Var2 = this.A;
        if (z6) {
            j3 = -9223372036854775807L;
            di81 di81Var = this.x;
            m191Var = null;
            ds81 ds81Var = di81Var.h;
            sj8[] sj8VarArr = di81Var.i;
            mn71 mn71Var = di81Var.b;
            z = z6;
            if (ds81Var != null) {
                long j9 = ds81Var.d;
                boolean z7 = j9 != -9223372036854775807L && j9 < j7;
                yc2 yc2Var = ds81Var.e;
                if (yc2Var.g.d) {
                    if (!yc2Var.i) {
                        if (z7) {
                            if (yc2Var.h) {
                                yc2Var.i = true;
                                yc2Var.h = false;
                                i iVar = yc2Var.c.a;
                                iVar.D.removeCallbacks(iVar.w);
                                iVar.h();
                            }
                        }
                    }
                    z2 = z5;
                    j4 = j7;
                    arrayList = arrayList2;
                    ll81Var = ll81Var2;
                    nl81Var = nl81Var2;
                    c = true;
                    if (c) {
                        if (z) {
                            if (z2) {
                                if (l(size) != lg81Var) {
                                    ny61.k();
                                    return m191Var;
                                }
                                if (arrayList.isEmpty()) {
                                    this.L = this.M;
                                }
                            }
                            m191Var2 = t671.d;
                            if (m191Var2 == null) {
                                ll81Var.getClass();
                                if (!(iOException instanceof aa2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof b01) && !(iOException instanceof ef1)) {
                                    for (Throwable th = iOException; th != null; th = th.getCause()) {
                                        if (!(th instanceof h30) || ((h30) th).b != 2008) {
                                        }
                                    }
                                    j6 = Math.min((i - 1) * 1000, 5000);
                                    if (j6 == j3) {
                                        z3 = false;
                                        m191Var2 = new m191(0, j6);
                                    } else {
                                        z3 = false;
                                        m191Var2 = t671.e;
                                    }
                                }
                                j6 = j3;
                                if (j6 == j3) {
                                }
                            } else {
                                z3 = false;
                            }
                            int i4 = m191Var2.a;
                            z4 = (i4 != 0 || i4 == 1) ? true : z3;
                            int i5 = lg81Var.c;
                            qd81 qd81Var2 = lg81Var.d;
                            int i6 = lg81Var.e;
                            Object obj = lg81Var.f;
                            long j10 = lg81Var.h;
                            sc81 sc81Var = this.z;
                            sc81Var.d(nl81Var, new pil0(i5, this.a, qd81Var2, i6, obj, sc81Var.a(j4), sc81Var.a(j10)), iOException, !z4);
                            if (!z4) {
                                this.I = m191Var;
                                ll81Var.getClass();
                                qw81 qw81Var = this.y;
                                qw81Var.J.a((sn61) qw81Var);
                            }
                            return m191Var2;
                        }
                        nba1.e();
                    }
                    m191Var2 = m191Var;
                    if (m191Var2 == null) {
                    }
                    int i42 = m191Var2.a;
                    if (i42 != 0) {
                    }
                    int i52 = lg81Var.c;
                    qd81 qd81Var22 = lg81Var.d;
                    int i62 = lg81Var.e;
                    Object obj2 = lg81Var.f;
                    long j102 = lg81Var.h;
                    sc81 sc81Var2 = this.z;
                    sc81Var2.d(nl81Var, new pil0(i52, this.a, qd81Var22, i62, obj2, sc81Var2.a(j4), sc81Var2.a(j102)), iOException, !z4);
                    if (!z4) {
                    }
                    return m191Var2;
                }
            }
            if (!di81Var.k.d && z5 && (iOException instanceof e01) && ((e01) iOException).e == 404) {
                sj8 sj8Var = sj8VarArr[di81Var.j.k(qd81Var)];
                arrayList = arrayList2;
                long k = ((ng61) sj8Var.y).k(sj8Var.a);
                if (k != -1 && k != 0) {
                    if (((lm81) lg81Var).c() > ((((ng61) sj8Var.y).b() + sj8Var.b) + k) - 1) {
                        di81Var.n = true;
                        z2 = z5;
                        j4 = j7;
                        ll81Var = ll81Var2;
                        nl81Var = nl81Var2;
                        c = true;
                        if (c) {
                        }
                        m191Var2 = m191Var;
                        if (m191Var2 == null) {
                        }
                        int i422 = m191Var2.a;
                        if (i422 != 0) {
                        }
                        int i522 = lg81Var.c;
                        qd81 qd81Var222 = lg81Var.d;
                        int i622 = lg81Var.e;
                        Object obj22 = lg81Var.f;
                        long j1022 = lg81Var.h;
                        sc81 sc81Var22 = this.z;
                        sc81Var22.d(nl81Var, new pil0(i522, this.a, qd81Var222, i622, obj22, sc81Var22.a(j4), sc81Var22.a(j1022)), iOException, !z4);
                        if (!z4) {
                        }
                        return m191Var2;
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            sj8 sj8Var2 = sj8VarArr[di81Var.j.k(qd81Var)];
            x281 x281Var = (x281) sj8Var2.w;
            ik71 ik71Var = (ik71) sj8Var2.x;
            ik71 c2 = mn71Var.c(x281Var.b);
            if (c2 != null && !ik71Var.equals(c2)) {
                z2 = z5;
                j4 = j7;
                ll81Var = ll81Var2;
                nl81Var = nl81Var2;
                c = true;
                if (c) {
                }
                m191Var2 = m191Var;
                if (m191Var2 == null) {
                }
                int i4222 = m191Var2.a;
                if (i4222 != 0) {
                }
                int i5222 = lg81Var.c;
                qd81 qd81Var2222 = lg81Var.d;
                int i6222 = lg81Var.e;
                Object obj222 = lg81Var.f;
                long j10222 = lg81Var.h;
                sc81 sc81Var222 = this.z;
                sc81Var222.d(nl81Var, new pil0(i5222, this.a, qd81Var2222, i6222, obj222, sc81Var222.a(j4), sc81Var222.a(j10222)), iOException, !z4);
                if (!z4) {
                }
                return m191Var2;
            }
            gk71 gk71Var = di81Var.j;
            t31 t31Var = ((x281) sj8Var2.w).b;
            ll81Var = ll81Var2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            z2 = z5;
            int g = gk71Var.g();
            j4 = j7;
            nl81Var = nl81Var2;
            int i7 = 0;
            for (int i8 = 0; i8 < g; i8++) {
                if (gk71Var.q(i8, elapsedRealtime)) {
                    i7++;
                }
            }
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < t31Var.size(); i9++) {
                hashSet.add(Integer.valueOf(((ik71) t31Var.get(i9)).c));
            }
            int size2 = hashSet.size();
            HashSet hashSet2 = new HashSet();
            ArrayList a = mn71Var.a(t31Var);
            for (int i10 = 0; i10 < a.size(); i10++) {
                hashSet2.add(Integer.valueOf(((ik71) a.get(i10)).c));
            }
            l41 l41Var = new l41(size2, size2 - hashSet2.size(), g, i7);
            if (l41Var.a(2) || l41Var.a(1)) {
                ll81Var.getClass();
                if ((iOException instanceof e01) && ((i2 = ((e01) iOException).e) == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503)) {
                    if (l41Var.a(1)) {
                        h0nVar = new h0n(1, MapiClientImpl.RETRIES_TIME_MILLIS);
                    } else if (l41Var.a(2)) {
                        h0nVar = new h0n(2, 60000L);
                    }
                    if (h0nVar != null) {
                        long j11 = h0nVar.b;
                        int i11 = h0nVar.a;
                        if (l41Var.a(i11)) {
                            if (i11 == 2) {
                                gk71 gk71Var2 = di81Var.j;
                                c = gk71Var2.c(gk71Var2.k(qd81Var), j11);
                                if (c) {
                                }
                                m191Var2 = m191Var;
                                if (m191Var2 == null) {
                                }
                                int i42222 = m191Var2.a;
                                if (i42222 != 0) {
                                }
                                int i52222 = lg81Var.c;
                                qd81 qd81Var22222 = lg81Var.d;
                                int i62222 = lg81Var.e;
                                Object obj2222 = lg81Var.f;
                                long j102222 = lg81Var.h;
                                sc81 sc81Var2222 = this.z;
                                sc81Var2222.d(nl81Var, new pil0(i52222, this.a, qd81Var22222, i62222, obj2222, sc81Var2222.a(j4), sc81Var2222.a(j102222)), iOException, !z4);
                                if (!z4) {
                                }
                                return m191Var2;
                            }
                            if (i11 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j11;
                                String str = ik71Var.b;
                                HashMap hashMap = mn71Var.a;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    int i12 = rf71.a;
                                    j5 = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j5 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j5));
                                int i13 = ik71Var.c;
                                if (i13 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i13);
                                    HashMap hashMap2 = mn71Var.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        int i14 = rf71.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                c = true;
                                if (c) {
                                }
                                m191Var2 = m191Var;
                                if (m191Var2 == null) {
                                }
                                int i422222 = m191Var2.a;
                                if (i422222 != 0) {
                                }
                                int i522222 = lg81Var.c;
                                qd81 qd81Var222222 = lg81Var.d;
                                int i622222 = lg81Var.e;
                                Object obj22222 = lg81Var.f;
                                long j1022222 = lg81Var.h;
                                sc81 sc81Var22222 = this.z;
                                sc81Var22222.d(nl81Var, new pil0(i522222, this.a, qd81Var222222, i622222, obj22222, sc81Var22222.a(j4), sc81Var22222.a(j1022222)), iOException, !z4);
                                if (!z4) {
                                }
                                return m191Var2;
                            }
                        }
                    }
                }
                h0nVar = null;
                if (h0nVar != null) {
                }
            }
        } else {
            z2 = z5;
            j4 = j7;
            z = z6;
            arrayList = arrayList2;
            ll81Var = ll81Var2;
            nl81Var = nl81Var2;
            j3 = -9223372036854775807L;
            m191Var = null;
        }
        c = false;
        if (c) {
        }
        m191Var2 = m191Var;
        if (m191Var2 == null) {
        }
        int i4222222 = m191Var2.a;
        if (i4222222 != 0) {
        }
        int i5222222 = lg81Var.c;
        qd81 qd81Var2222222 = lg81Var.d;
        int i6222222 = lg81Var.e;
        Object obj222222 = lg81Var.f;
        long j10222222 = lg81Var.h;
        sc81 sc81Var222222 = this.z;
        sc81Var222222.d(nl81Var, new pil0(i5222222, this.a, qd81Var2222222, i6222222, obj222222, sc81Var222222.a(j4), sc81Var222222.a(j10222222)), iOException, !z4);
        if (!z4) {
        }
        return m191Var2;
    }

    @Override // defpackage.mp61
    public final void b() {
        ed81 ed81Var = this.F;
        ed81Var.n(true);
        ed81Var.r();
        for (ed81 ed81Var2 : this.G) {
            ed81Var2.n(true);
            ed81Var2.r();
        }
        for (sj8 sj8Var : this.x.i) {
            Object obj = sj8Var.c;
        }
        qw81 qw81Var = this.K;
        if (qw81Var != null) {
            synchronized (qw81Var) {
                ds81 ds81Var = (ds81) qw81Var.G.remove(this);
                if (ds81Var != null) {
                    ed81 ed81Var3 = ds81Var.a;
                    ed81Var3.n(true);
                    ed81Var3.r();
                }
            }
        }
    }

    public final int c(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.D;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((lm81) arrayList.get(i2)).a(0) <= i);
        return i2 - 1;
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        if (n()) {
            return 0;
        }
        int l = this.F.l(j, this.P);
        lm81 lm81Var = this.O;
        if (lm81Var != null) {
            int a = lm81Var.a(0);
            ed81 ed81Var = this.F;
            l = Math.min(l, a - (ed81Var.p + ed81Var.r));
        }
        ed81 ed81Var2 = this.F;
        synchronized (ed81Var2) {
            if (l >= 0) {
                int i = ed81Var2.r + l;
                if (i <= ed81Var2.o) {
                    ed81Var2.r = i;
                }
            }
            throw new IllegalArgumentException();
        }
        o();
        return l;
    }

    @Override // defpackage.sn61
    public final long g() {
        long j;
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.L;
        }
        long j2 = this.M;
        lm81 lm81Var = (lm81) unr0.k(1, this.D);
        if (!lm81Var.d()) {
            lm81Var = this.D.size() > 1 ? (lm81) unr0.k(2, this.D) : null;
        }
        if (lm81Var != null) {
            j2 = Math.max(j2, lm81Var.h);
        }
        ed81 ed81Var = this.F;
        synchronized (ed81Var) {
            j = ed81Var.u;
        }
        return Math.max(j2, j);
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        t671 t671Var = this.B;
        if (t671Var.c == null && !n()) {
            boolean e = t671Var.e();
            List list = this.E;
            di81 di81Var = this.x;
            ArrayList arrayList = this.D;
            if (e) {
                lg81 lg81Var = this.I;
                lg81Var.getClass();
                boolean z = lg81Var instanceof lm81;
                if (z && m(arrayList.size() - 1)) {
                    return;
                }
                if (di81Var.m != null ? false : di81Var.j.n(j, lg81Var, list)) {
                    af1 af1Var = t671Var.b;
                    if (af1Var == null) {
                        ny61.k();
                        return;
                    }
                    af1Var.a(false);
                    if (z) {
                        this.O = (lm81) lg81Var;
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (di81Var.m != null || di81Var.j.g() < 2) ? list.size() : di81Var.j.p(j, list);
            if (size < arrayList.size()) {
                if (t671Var.e()) {
                    ny61.k();
                    return;
                }
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!m(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j2 = ((lm81) unr0.k(1, arrayList)).h;
                lm81 l = l(size);
                if (arrayList.isEmpty()) {
                    this.L = this.M;
                }
                this.P = false;
                long j3 = l.g;
                sc81 sc81Var = this.z;
                sc81Var.e(new pil0(1, this.a, null, 3, null, sc81Var.a(j3), sc81Var.a(j2)));
            }
        }
    }

    @Override // defpackage.sn61
    public final long i() {
        if (n()) {
            return this.L;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return ((lm81) unr0.k(1, this.D)).h;
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        return this.B.e();
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        long j2;
        List list;
        long j3;
        ArrayList arrayList;
        long max;
        hq81 hq81Var;
        uz71 uz71Var;
        t671 t671Var;
        long j4;
        long max2;
        lg81 mn81Var;
        of81 of81Var;
        int i;
        ArrayList arrayList2;
        hq81 hq81Var2;
        long max3;
        long j5;
        sj8 sj8Var;
        if (this.P) {
            return false;
        }
        t671 t671Var2 = this.B;
        if (t671Var2.e() || t671Var2.c != null) {
            return false;
        }
        boolean n = n();
        ArrayList arrayList3 = this.D;
        if (n) {
            list = Collections.EMPTY_LIST;
            j2 = this.L;
        } else {
            j2 = ((lm81) unr0.k(1, arrayList3)).h;
            list = this.E;
        }
        di81 di81Var = this.x;
        po poVar = di81Var.m;
        mn71 mn71Var = di81Var.b;
        sj8[] sj8VarArr = di81Var.i;
        hq81 hq81Var3 = this.C;
        if (poVar != null) {
            t671Var = t671Var2;
            arrayList = arrayList3;
            hq81Var = hq81Var3;
            j3 = -9223372036854775807L;
        } else {
            hq81 hq81Var4 = hq81Var3;
            long j6 = j2 - j;
            j3 = -9223372036854775807L;
            long g = rf71.g(((ey71) di81Var.k.m.get(di81Var.l)).b) + rf71.g(di81Var.k.a) + j2;
            ds81 ds81Var = di81Var.h;
            if (ds81Var == null || !ds81Var.e.a(g)) {
                long j7 = di81Var.f;
                long g2 = rf71.g(j7 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j7);
                dh81 dh81Var = di81Var.k;
                long j8 = dh81Var.a;
                long g3 = j8 == -9223372036854775807L ? -9223372036854775807L : g2 - rf71.g(j8 + ((ey71) dh81Var.m.get(di81Var.l)).b);
                lm81 lm81Var = list.isEmpty() ? null : (lm81) b64.c(1, list);
                int g4 = di81Var.j.g();
                gc81[] gc81VarArr = new gc81[g4];
                int i2 = 0;
                while (i2 < g4) {
                    lm81 lm81Var2 = lm81Var;
                    sj8 sj8Var2 = sj8VarArr[i2];
                    List list2 = list;
                    ng61 ng61Var = (ng61) sj8Var2.y;
                    int i3 = g4;
                    gc81[] gc81VarArr2 = gc81VarArr;
                    long j9 = sj8Var2.b;
                    long j10 = sj8Var2.a;
                    if (ng61Var == null) {
                        gc81VarArr2[i2] = gc81.a;
                        arrayList2 = arrayList3;
                        i = i2;
                        hq81Var2 = hq81Var4;
                    } else {
                        i = i2;
                        long n2 = ng61Var.n(j10, g2) + j9;
                        arrayList2 = arrayList3;
                        hq81Var2 = hq81Var4;
                        long q = (ng61Var.q(j10, g2) + (ng61Var.n(j10, g2) + j9)) - 1;
                        if (lm81Var2 != null) {
                            max3 = lm81Var2.c();
                        } else {
                            long c = ng61Var.c(j2, j10) + j9;
                            int i4 = rf71.a;
                            max3 = Math.max(n2, Math.min(c, q));
                        }
                        long j11 = max3;
                        if (j11 < n2) {
                            gc81VarArr2[i] = gc81.a;
                        } else {
                            sj8 sj8Var3 = sj8VarArr[i];
                            ik71 c2 = mn71Var.c(((x281) sj8Var3.w).b);
                            if (c2 == null || c2.equals((ik71) sj8Var3.x)) {
                                j5 = q;
                                sj8Var = sj8Var3;
                            } else {
                                j5 = q;
                                sj8 sj8Var4 = new sj8(sj8Var3.a, (x281) sj8Var3.w, c2, (uz71) sj8Var3.c, sj8Var3.b, (ng61) sj8Var3.y);
                                sj8VarArr[i] = sj8Var4;
                                sj8Var = sj8Var4;
                            }
                            gc81VarArr2[i] = new v9u(sj8Var, j11, j5);
                        }
                    }
                    i2 = i + 1;
                    list = list2;
                    lm81Var = lm81Var2;
                    g4 = i3;
                    gc81VarArr = gc81VarArr2;
                    arrayList3 = arrayList2;
                    hq81Var4 = hq81Var2;
                }
                arrayList = arrayList3;
                lm81 lm81Var3 = lm81Var;
                List list3 = list;
                gc81[] gc81VarArr3 = gc81VarArr;
                hq81 hq81Var5 = hq81Var4;
                if (di81Var.k.d) {
                    sj8 sj8Var5 = sj8VarArr[0];
                    ng61 ng61Var2 = (ng61) sj8Var5.y;
                    long j12 = sj8Var5.a;
                    long a = sj8VarArr[0].a((((ng61) sj8Var5.y).q(j12, g2) + (ng61Var2.n(j12, g2) + sj8Var5.b)) - 1);
                    dh81 dh81Var2 = di81Var.k;
                    long j13 = dh81Var2.a;
                    max = Math.max(0L, Math.min(j13 == -9223372036854775807L ? -9223372036854775807L : g2 - rf71.g(j13 + ((ey71) dh81Var2.m.get(di81Var.l)).b), a) - j);
                } else {
                    max = -9223372036854775807L;
                }
                hq81Var = hq81Var5;
                di81Var.j.o(j, j6, max, list3, gc81VarArr3);
                int f = di81Var.j.f();
                sj8 sj8Var6 = sj8VarArr[f];
                ik71 c3 = mn71Var.c(((x281) sj8Var6.w).b);
                if (c3 != null && !c3.equals((ik71) sj8Var6.x)) {
                    sj8 sj8Var7 = new sj8(sj8Var6.a, (x281) sj8Var6.w, c3, (uz71) sj8Var6.c, sj8Var6.b, (ng61) sj8Var6.y);
                    sj8VarArr[f] = sj8Var7;
                    sj8Var6 = sj8Var7;
                }
                uz71 uz71Var2 = (uz71) sj8Var6.c;
                x281 x281Var = (x281) sj8Var6.w;
                ik71 ik71Var = (ik71) sj8Var6.x;
                long j14 = sj8Var6.a;
                long j15 = sj8Var6.b;
                ng61 ng61Var3 = (ng61) sj8Var6.y;
                if (uz71Var2 != null) {
                    of81 of81Var2 = uz71Var2.B == null ? x281Var.x : null;
                    if (ng61Var3 == null) {
                        uz71Var = uz71Var2;
                        of81Var = x281Var.f();
                    } else {
                        uz71Var = uz71Var2;
                        of81Var = null;
                    }
                    if (of81Var2 != null || of81Var != null) {
                        u871 u871Var = di81Var.e;
                        qd81 d = di81Var.j.d();
                        int e = di81Var.j.e();
                        Object h = di81Var.j.h();
                        if (of81Var2 != null) {
                            of81 a2 = of81Var2.a(of81Var, ik71Var.a);
                            if (a2 != null) {
                                of81Var2 = a2;
                            }
                        } else {
                            of81Var2 = of81Var;
                        }
                        hq81Var.a = new he81(u871Var, b4a1.a(x281Var, ik71Var.a, of81Var2, 0), d, e, h, (uz71) sj8Var6.c);
                        t671Var = t671Var2;
                    }
                } else {
                    uz71Var = uz71Var2;
                }
                boolean z = j14 != -9223372036854775807L;
                if (ng61Var3.k(j14) == 0) {
                    hq81Var.b = z;
                    t671Var = t671Var2;
                } else {
                    t671Var = t671Var2;
                    long n3 = ng61Var3.n(j14, g2) + j15;
                    long q2 = (ng61Var3.q(j14, g2) + (ng61Var3.n(j14, g2) + j15)) - 1;
                    if (lm81Var3 != null) {
                        max2 = lm81Var3.c();
                        j4 = j2;
                    } else {
                        j4 = j2;
                        long c4 = ng61Var3.c(j2, j14) + j15;
                        int i5 = rf71.a;
                        max2 = Math.max(n3, Math.min(c4, q2));
                    }
                    long j16 = max2;
                    if (j16 < n3) {
                        di81Var.m = new po();
                    } else if (j16 > q2 || (di81Var.n && j16 >= q2)) {
                        hq81Var.b = z;
                    } else if (!z || ng61Var3.a(j16 - j15) < j14) {
                        int min = (int) Math.min(di81Var.g, (q2 - j16) + 1);
                        if (j14 != -9223372036854775807L) {
                            while (min > 1 && ng61Var3.a(((min + j16) - 1) - j15) >= j14) {
                                min--;
                            }
                        }
                        long j17 = list3.isEmpty() ? j4 : -9223372036854775807L;
                        u871 u871Var2 = di81Var.e;
                        int i6 = di81Var.d;
                        qd81 d2 = di81Var.j.d();
                        int e2 = di81Var.j.e();
                        Object h2 = di81Var.j.h();
                        long j18 = j16 - j15;
                        long a3 = ng61Var3.a(j18);
                        of81 d3 = ng61Var3.d(j18);
                        if (uz71Var == null) {
                            mn81Var = new rt81(u871Var2, b4a1.a(x281Var, ik71Var.a, d3, (ng61Var3.mo485a() || g3 == -9223372036854775807L || sj8Var6.a(j16) <= g3) ? 0 : 8), d2, e2, h2, a3, sj8Var6.a(j16), j16, i6, d2);
                        } else {
                            int i7 = 1;
                            int i8 = 1;
                            while (i7 < min) {
                                of81 a4 = d3.a(ng61Var3.d((j16 + i7) - j15), ik71Var.a);
                                if (a4 == null) {
                                    break;
                                }
                                i8++;
                                i7++;
                                d3 = a4;
                            }
                            long j19 = (j16 + i8) - 1;
                            long a5 = sj8Var6.a(j19);
                            mn81Var = new mn81(u871Var2, b4a1.a(x281Var, ik71Var.a, d3, (ng61Var3.mo485a() || g3 == -9223372036854775807L || sj8Var6.a(j19) <= g3) ? 0 : 8), d2, e2, h2, a3, a5, j17, (j14 == -9223372036854775807L || j14 > a5) ? -9223372036854775807L : j14, j16, i8, -x281Var.c, (uz71) sj8Var6.c);
                        }
                        hq81Var.a = mn81Var;
                    } else {
                        hq81Var.b = true;
                    }
                }
            } else {
                t671Var = t671Var2;
                arrayList = arrayList3;
                hq81Var = hq81Var4;
            }
        }
        boolean z2 = hq81Var.b;
        lg81 lg81Var = hq81Var.a;
        hq81Var.a = null;
        hq81Var.b = false;
        if (z2) {
            this.L = j3;
            this.P = true;
            return true;
        }
        if (lg81Var == null) {
            return false;
        }
        this.I = lg81Var;
        boolean z3 = lg81Var instanceof lm81;
        gr81 gr81Var = this.H;
        if (z3) {
            lm81 lm81Var4 = (lm81) lg81Var;
            if (n) {
                long j20 = lm81Var4.g;
                long j21 = this.L;
                if (j20 != j21) {
                    this.F.s = j21;
                    for (ed81 ed81Var : this.G) {
                        ed81Var.s = this.L;
                    }
                }
                this.L = -9223372036854775807L;
            }
            lm81Var4.m = gr81Var;
            int[] iArr = new int[((ed81[]) gr81Var.c).length];
            int i9 = 0;
            while (true) {
                ed81[] ed81VarArr = (ed81[]) gr81Var.c;
                if (i9 >= ed81VarArr.length) {
                    break;
                }
                ed81 ed81Var2 = ed81VarArr[i9];
                iArr[i9] = ed81Var2.p + ed81Var2.o;
                i9++;
            }
            lm81Var4.n = iArr;
            arrayList.add(lm81Var4);
        } else if (lg81Var instanceof he81) {
            ((he81) lg81Var).k = gr81Var;
        }
        int i10 = lg81Var.c;
        this.A.getClass();
        t671Var.c(lg81Var, this, i10 == 7 ? 6 : 3);
        nl81 nl81Var = new nl81(lg81Var.b);
        int i11 = lg81Var.c;
        qd81 qd81Var = lg81Var.d;
        int i12 = lg81Var.e;
        Object obj = lg81Var.f;
        long j22 = lg81Var.g;
        long j23 = lg81Var.h;
        sc81 sc81Var = this.z;
        sc81Var.g(nl81Var, new pil0(i11, this.a, qd81Var, i12, obj, sc81Var.a(j22), sc81Var.a(j23)));
        return true;
    }

    public final lm81 l(int i) {
        ArrayList arrayList = this.D;
        lm81 lm81Var = (lm81) arrayList.get(i);
        int size = arrayList.size();
        int i2 = rf71.a;
        if (i < 0 || size > arrayList.size() || i > size) {
            w511.q();
            return null;
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        this.N = Math.max(this.N, arrayList.size());
        int i3 = 0;
        this.F.m(lm81Var.a(0));
        while (true) {
            ed81[] ed81VarArr = this.G;
            if (i3 >= ed81VarArr.length) {
                return lm81Var;
            }
            ed81 ed81Var = ed81VarArr[i3];
            i3++;
            ed81Var.m(lm81Var.a(i3));
        }
    }

    public final boolean m(int i) {
        ed81 ed81Var;
        lm81 lm81Var = (lm81) this.D.get(i);
        ed81 ed81Var2 = this.F;
        if (ed81Var2.p + ed81Var2.r > lm81Var.a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            ed81[] ed81VarArr = this.G;
            if (i2 >= ed81VarArr.length) {
                return false;
            }
            ed81Var = ed81VarArr[i2];
            i2++;
        } while (ed81Var.p + ed81Var.r <= lm81Var.a(i2));
        return true;
    }

    public final boolean n() {
        return this.L != -9223372036854775807L;
    }

    public final void o() {
        ed81 ed81Var = this.F;
        int c = c(ed81Var.p + ed81Var.r, this.N - 1);
        while (true) {
            int i = this.N;
            if (i > c) {
                return;
            }
            this.N = i + 1;
            lm81 lm81Var = (lm81) this.D.get(i);
            qd81 qd81Var = lm81Var.d;
            if (!qd81Var.equals(this.J)) {
                int i2 = lm81Var.e;
                Object obj = lm81Var.f;
                long j = lm81Var.g;
                sc81 sc81Var = this.z;
                sc81Var.b(new pil0(1, this.a, qd81Var, i2, obj, sc81Var.a(j), -9223372036854775807L));
            }
            this.J = qd81Var;
        }
    }

    @Override // defpackage.dg81
    public final boolean c() {
        return !n() && this.F.j(this.P);
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        if (n()) {
            return -3;
        }
        lm81 lm81Var = this.O;
        ed81 ed81Var = this.F;
        if (lm81Var != null && lm81Var.a(0) <= ed81Var.p + ed81Var.r) {
            return -3;
        }
        o();
        return ed81Var.e(og81Var, yh81Var, i, this.P);
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2) {
        lg81 lg81Var = (lg81) zl61Var;
        this.I = null;
        boolean z = lg81Var instanceof he81;
        di81 di81Var = this.x;
        if (z) {
            gk71 gk71Var = di81Var.j;
            sj8[] sj8VarArr = di81Var.i;
            int k = gk71Var.k(((he81) lg81Var).d);
            sj8 sj8Var = sj8VarArr[k];
            if (((ng61) sj8Var.y) == null) {
                uz71 uz71Var = (uz71) sj8Var.c;
                a871 a871Var = uz71Var.A;
                jt81 jt81Var = a871Var instanceof jt81 ? (jt81) a871Var : null;
                if (jt81Var != null) {
                    x281 x281Var = (x281) sj8Var.w;
                    sj8VarArr[k] = new sj8(sj8Var.a, x281Var, (ik71) sj8Var.x, uz71Var, sj8Var.b, new qgg(jt81Var, x281Var.c, 7));
                }
            }
        }
        ds81 ds81Var = di81Var.h;
        if (ds81Var != null) {
            long j3 = ds81Var.d;
            if (j3 == -9223372036854775807L || lg81Var.h > j3) {
                ds81Var.d = lg81Var.h;
            }
            ds81Var.e.h = true;
        }
        long j4 = lg81Var.a;
        Uri uri = lg81Var.i.c;
        nl81 nl81Var = new nl81();
        this.A.getClass();
        int i = lg81Var.c;
        qd81 qd81Var = lg81Var.d;
        int i2 = lg81Var.e;
        Object obj = lg81Var.f;
        long j5 = lg81Var.g;
        long j6 = lg81Var.h;
        sc81 sc81Var = this.z;
        sc81Var.f(nl81Var, new pil0(i, this.a, qd81Var, i2, obj, sc81Var.a(j5), sc81Var.a(j6)));
        qw81 qw81Var = this.y;
        qw81Var.J.a((sn61) qw81Var);
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2, boolean z) {
        lg81 lg81Var = (lg81) zl61Var;
        this.I = null;
        this.O = null;
        long j3 = lg81Var.a;
        Uri uri = lg81Var.i.c;
        nl81 nl81Var = new nl81();
        this.A.getClass();
        int i = lg81Var.c;
        qd81 qd81Var = lg81Var.d;
        int i2 = lg81Var.e;
        Object obj = lg81Var.f;
        long j4 = lg81Var.g;
        long j5 = lg81Var.h;
        sc81 sc81Var = this.z;
        sc81Var.c(nl81Var, new pil0(i, this.a, qd81Var, i2, obj, sc81Var.a(j4), sc81Var.a(j5)));
        if (z) {
            return;
        }
        if (n()) {
            this.F.n(false);
            for (ed81 ed81Var : this.G) {
                ed81Var.n(false);
            }
        } else if (lg81Var instanceof lm81) {
            ArrayList arrayList = this.D;
            l(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.L = this.M;
            }
        }
        qw81 qw81Var = this.y;
        qw81Var.J.a((sn61) qw81Var);
    }

    @Override // defpackage.dg81
    public final void a() {
        t671 t671Var = this.B;
        t671Var.b(Integer.MIN_VALUE);
        ji41 ji41Var = this.F.g;
        if (ji41Var == null) {
            if (t671Var.e()) {
                return;
            }
            di81 di81Var = this.x;
            po poVar = di81Var.m;
            if (poVar == null) {
                di81Var.a.a();
                return;
            }
            throw poVar;
        }
        throw ((lk0) ji41Var.b);
    }
}
