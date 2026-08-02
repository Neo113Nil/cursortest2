package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public class ypi extends b2r {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public upi h;
    public ArrayList i;
    public f2r j;
    public int[] k;
    public int l;
    public boolean m;

    public ypi(long j, f2r f2rVar, Function1 function1, Function1 function12) {
        super(j, f2rVar);
        this.e = function1;
        this.f = function12;
        this.j = f2r.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (g2r.b) {
            this.j = this.j.q(j);
        }
    }

    public void B(upi upiVar) {
        this.h = upiVar;
    }

    public ypi C(Function1 function1, Function1 function12) {
        if (this.c) {
            llm.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            llm.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = g2r.b;
        synchronized (obj) {
            try {
                long j = g2r.d;
                g2r.d = j + 1;
                g2r.c = g2r.c.q(j);
                f2r d = d();
                r(d.q(j));
                try {
                    uxi uxiVar = new uxi(j, g2r.e(d, g() + 1, j), g2r.l(function1, e(), true), g2r.b(function12, i()), this);
                    if (this.m || this.c) {
                        return uxiVar;
                    }
                    long g = g();
                    synchronized (obj) {
                        long j2 = g2r.d;
                        g2r.d = j2 + 1;
                        s(j2);
                        g2r.c = g2r.c.q(g());
                    }
                    r(g2r.e(d(), g + 1, g()));
                    return uxiVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.b2r
    public final void b() {
        g2r.c = g2r.c.g(g()).a(this.j);
    }

    @Override // defpackage.b2r
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (g2r.b) {
            o();
        }
        l();
    }

    @Override // defpackage.b2r
    public boolean f() {
        return false;
    }

    @Override // defpackage.b2r
    public int h() {
        return this.g;
    }

    @Override // defpackage.b2r
    public Function1 i() {
        return this.f;
    }

    @Override // defpackage.b2r
    public void k() {
        this.l++;
    }

    @Override // defpackage.b2r
    public void l() {
        if (this.l <= 0) {
            llm.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        upi x = x();
        if (x != null) {
            if (this.m) {
                llm.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (per g2 = ((mer) objArr[(i2 << 3) + i4]).g(); g2 != null; g2 = g2.b) {
                                    long j2 = g2.a;
                                    if (j2 == g || CollectionsKt.I(this.j, Long.valueOf(j2))) {
                                        sfm sfmVar = g2r.a;
                                        g2.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.b2r
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.b2r
    public void n(mer merVar) {
        upi x = x();
        if (x == null) {
            int i = xso.a;
            x = new upi();
            B(x);
        }
        x.a(merVar);
    }

    @Override // defpackage.b2r
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            g2r.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.b2r
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.b2r
    public b2r u(Function1 function1) {
        if (this.c) {
            llm.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            llm.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = g2r.b;
        synchronized (obj) {
            try {
                long j = g2r.d;
                g2r.d = j + 1;
                g2r.c = g2r.c.q(j);
                try {
                    vxi vxiVar = new vxi(j, g2r.e(d(), g + 1, j), g2r.l(function1, e(), true), this);
                    if (this.m || this.c) {
                        return vxiVar;
                    }
                    long g2 = g();
                    synchronized (obj) {
                        long j2 = g2r.d;
                        g2r.d = j2 + 1;
                        s(j2);
                        g2r.c = g2r.c.q(g());
                    }
                    r(g2r.e(d(), g2 + 1, g()));
                    return vxiVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (g2r.b) {
            long j = g2r.d;
            g2r.d = j + 1;
            s(j);
            g2r.c = g2r.c.q(g());
        }
        r(g2r.e(d(), g + 1, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8 A[LOOP:1: B:31:0x00f6->B:32:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164 A[Catch: all -> 0x014d, TryCatch #1 {all -> 0x014d, blocks: (B:37:0x0107, B:39:0x0116, B:42:0x0124, B:44:0x0131, B:46:0x013b, B:48:0x0141, B:50:0x0150, B:56:0x0164, B:59:0x016e, B:61:0x0179, B:63:0x0183, B:65:0x0189, B:67:0x0193, B:73:0x019b, B:75:0x019e, B:77:0x01a2, B:79:0x01a9, B:81:0x01b5, B:87:0x0158), top: B:36:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2 A[Catch: all -> 0x014d, TryCatch #1 {all -> 0x014d, blocks: (B:37:0x0107, B:39:0x0116, B:42:0x0124, B:44:0x0131, B:46:0x013b, B:48:0x0141, B:50:0x0150, B:56:0x0164, B:59:0x016e, B:61:0x0179, B:63:0x0183, B:65:0x0189, B:67:0x0193, B:73:0x019b, B:75:0x019e, B:77:0x01a2, B:79:0x01a9, B:81:0x01b5, B:87:0x0158), top: B:36:0x0107 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bzf w() {
        HashMap hashMap;
        c5b c5bVar;
        upi upiVar;
        long j;
        long j2;
        char c;
        ArrayList arrayList;
        int size;
        int i;
        upi x = x();
        if (x != null) {
            long j3 = g2r.i.b;
            hashMap = g2r.c(j3, this, g2r.c.g(j3));
        } else {
            hashMap = null;
        }
        c5b c5bVar2 = c5b.a;
        synchronized (g2r.b) {
            try {
                g2r.d(this);
                if (x != null && x.d != 0) {
                    emd emdVar = g2r.i;
                    bzf z = z(g2r.d, x, hashMap, g2r.c.g(emdVar.b));
                    if (!z.equals(d2r.b)) {
                        return z;
                    }
                    b();
                    upiVar = emdVar.h;
                    long j4 = emdVar.b;
                    g2r.c.g(j4);
                    long j5 = g2r.d;
                    g2r.d = 1 + j5;
                    f2r g = g2r.c.g(j4);
                    g2r.c = g;
                    emdVar.b = j5;
                    emdVar.a = g;
                    emdVar.g = 0;
                    emdVar.h = null;
                    emdVar.o();
                    g2r.c = g2r.c.q(j5);
                    B(null);
                    emdVar.h = null;
                    c5bVar = g2r.g;
                    this.m = true;
                    if (upiVar != null) {
                        yso ysoVar = new yso(upiVar);
                        if (!upiVar.h()) {
                            int size2 = c5bVar.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) c5bVar.get(i2)).invoke(ysoVar, this);
                            }
                        }
                    }
                    if (x != null && x.i()) {
                        yso ysoVar2 = new yso(x);
                        size = c5bVar.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) c5bVar.get(i)).invoke(ysoVar2, this);
                        }
                    }
                    synchronized (g2r.b) {
                        try {
                            p();
                            g2r.g();
                            if (upiVar != null) {
                                Object[] objArr = upiVar.b;
                                long[] jArr = upiVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    j2 = 255;
                                    while (true) {
                                        long j6 = jArr[i3];
                                        c = 7;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j6 & 255) < 128) {
                                                    g2r.q((mer) objArr[(i3 << 3) + i5]);
                                                }
                                                j6 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j7 = jArr2[i6];
                                                if ((((~j7) << c) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j7 & j2) < j) {
                                                            g2r.q((mer) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j7 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            g2r.q((mer) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            c = 7;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return d2r.b;
                }
                b();
                emd emdVar2 = g2r.i;
                upi upiVar2 = emdVar2.h;
                long j8 = emdVar2.b;
                g2r.c.g(j8);
                long j9 = g2r.d;
                g2r.d = 1 + j9;
                f2r g2 = g2r.c.g(j8);
                g2r.c = g2;
                emdVar2.b = j9;
                emdVar2.a = g2;
                emdVar2.g = 0;
                emdVar2.h = null;
                emdVar2.o();
                g2r.c = g2r.c.q(j9);
                if (upiVar2 == null || !upiVar2.i()) {
                    c5bVar = c5bVar2;
                    upiVar = null;
                } else {
                    c5bVar = g2r.g;
                    upiVar = upiVar2;
                }
                this.m = true;
                if (upiVar != null) {
                }
                if (x != null) {
                    yso ysoVar22 = new yso(x);
                    size = c5bVar.size();
                    while (i < size) {
                    }
                }
                synchronized (g2r.b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public upi x() {
        return this.h;
    }

    @Override // defpackage.b2r
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    public final bzf z(long j, upi upiVar, HashMap hashMap, f2r f2rVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        f2r f2rVar2;
        Object[] objArr;
        long[] jArr;
        f2r f2rVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        per m;
        f2r o = d().q(g()).o(this.j);
        Object[] objArr3 = upiVar.b;
        long[] jArr3 = upiVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            mer merVar = (mer) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            per g = merVar.g();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            per s = g2r.s(g, j, f2rVar);
                            if (s == null) {
                                f2rVar3 = o;
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                per s2 = g2r.s(g, g(), o);
                                if (s2 == null) {
                                    f2rVar3 = o;
                                } else {
                                    f2rVar3 = o;
                                    if (s2.a != 1 && !s.equals(s2)) {
                                        per s3 = g2r.s(g, g(), d());
                                        if (s3 == null) {
                                            g2r.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (m = (per) hashMap.get(s)) == null) {
                                            m = merVar.m(s2, s, s3);
                                        }
                                        if (m == null) {
                                            return new c2r(this);
                                        }
                                        if (!m.equals(s3)) {
                                            if (m.equals(s)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new Pair(merVar, s.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(merVar);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!m.equals(s2) ? new Pair(merVar, m) : new Pair(merVar, s2.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            f2rVar3 = o;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        o = f2rVar3;
                    }
                    f2rVar2 = o;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    f2rVar2 = o;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                o = f2rVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                mer merVar2 = (mer) pair.a;
                per perVar = (per) pair.b;
                perVar.a = j;
                synchronized (g2r.b) {
                    perVar.b = merVar2.g();
                    merVar2.a(perVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                upiVar.m((mer) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.g0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return d2r.b;
    }
}
