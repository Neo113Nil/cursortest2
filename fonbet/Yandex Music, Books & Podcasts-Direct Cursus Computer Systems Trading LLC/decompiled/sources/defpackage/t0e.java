package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t0e implements hgg, kgg, ahp, t2c, yno {
    public static final Set E0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public boolean A0;
    public int B;
    public long B0;
    public boolean C;
    public pqa C0;
    public boolean D;
    public ozd D0;
    public int E;
    public dsc F;
    public dsc G;
    public boolean H;
    public yvs I;
    public Set J;
    public int[] K;
    public int L;
    public boolean X;
    public boolean[] Y;
    public boolean[] Z;
    public final String a;
    public final int b;
    public final n7b c;
    public final lzd d;
    public final zi7 e;
    public final dsc f;
    public final gra g;
    public final cra h;
    public final xeg i;
    public final osh j = new osh("Loader:HlsSampleStreamWrapper");
    public final x0 k;
    public final int l;
    public final r0o m;
    public final ArrayList n;
    public final List o;
    public final q0e p;
    public final q0e q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public sk4 u;
    public s0e[] v;
    public long v0;
    public int[] w;
    public long w0;
    public final HashSet x;
    public boolean x0;
    public final SparseIntArray y;
    public boolean y0;
    public r0e z;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [q0e] */
    /* JADX WARN: Type inference failed for: r1v13, types: [q0e] */
    public t0e(String str, int i, n7b n7bVar, lzd lzdVar, Map map, zi7 zi7Var, long j, dsc dscVar, gra graVar, cra craVar, xeg xegVar, x0 x0Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = n7bVar;
        this.d = lzdVar;
        this.t = map;
        this.e = zi7Var;
        this.f = dscVar;
        this.g = graVar;
        this.h = craVar;
        this.i = xegVar;
        this.k = x0Var;
        this.l = i2;
        r0o r0oVar = new r0o();
        r0oVar.c = null;
        final int i3 = 0;
        r0oVar.b = false;
        r0oVar.d = null;
        this.m = r0oVar;
        this.w = new int[0];
        Set set = E0;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new s0e[0];
        this.Z = new boolean[0];
        this.Y = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new Runnable(this) { // from class: q0e
            public final /* synthetic */ t0e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        t0e t0eVar = this.b;
                        t0eVar.C = true;
                        t0eVar.B();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.q = new Runnable(this) { // from class: q0e
            public final /* synthetic */ t0e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        t0e t0eVar = this.b;
                        t0eVar.C = true;
                        t0eVar.B();
                        break;
                }
            }
        };
        this.r = dvt.p(null);
        this.v0 = j;
        this.w0 = j;
    }

    public static z48 q(int i, int i2) {
        vq1.n0("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new z48();
    }

    public static dsc w(dsc dscVar, dsc dscVar2, boolean z) {
        String c;
        if (dscVar == null) {
            return dscVar2;
        }
        String str = dscVar.k;
        String str2 = dscVar2.n;
        int i = l5i.i(str2);
        if (dvt.x(i, str) == 1) {
            c = dvt.y(i, str);
            str2 = l5i.e(c);
        } else {
            c = l5i.c(str, str2);
        }
        bsc a = dscVar2.a();
        a.a = dscVar.a;
        a.b = dscVar.b;
        a.c = yde.v(dscVar.c);
        a.d = dscVar.d;
        a.e = dscVar.e;
        a.f = dscVar.f;
        a.h = z ? dscVar.h : -1;
        a.i = z ? dscVar.i : -1;
        a.j = c;
        if (i == 2) {
            a.t = dscVar.u;
            a.u = dscVar.v;
            a.v = dscVar.w;
        }
        if (str2 != null) {
            a.m = l5i.p(str2);
        }
        int i2 = dscVar.D;
        if (i2 != -1 && i == 1) {
            a.C = i2;
        }
        u2i u2iVar = dscVar.l;
        if (u2iVar != null) {
            u2i u2iVar2 = dscVar2.l;
            if (u2iVar2 != null) {
                u2iVar = u2iVar2.b(u2iVar);
            }
            a.k = u2iVar;
        }
        return new dsc(a);
    }

    public static int z(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.w0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        int i;
        if (!this.H && this.K == null && this.C) {
            int i2 = 0;
            for (s0e s0eVar : this.v) {
                if (s0eVar.s() == null) {
                    return;
                }
            }
            yvs yvsVar = this.I;
            if (yvsVar != null) {
                int i3 = yvsVar.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        s0e[] s0eVarArr = this.v;
                        if (i5 < s0eVarArr.length) {
                            dsc s = s0eVarArr[i5].s();
                            vq1.B(s);
                            dsc dscVar = this.I.a(i4).d[0];
                            String str = s.n;
                            String str2 = dscVar.n;
                            int i6 = l5i.i(str);
                            if (i6 == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || s.I == dscVar.I) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (i6 == l5i.i(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.K[i4] = i5;
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((p0e) it.next()).a();
                }
                return;
            }
            int length = this.v.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                dsc s2 = this.v[i7].s();
                vq1.B(s2);
                String str3 = s2.n;
                if (l5i.o(str3)) {
                    i10 = 2;
                } else if (!l5i.k(str3)) {
                    i10 = l5i.n(str3) ? 3 : -2;
                }
                if (z(i10) > z(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            xvs xvsVar = this.d.h;
            int i11 = xvsVar.a;
            this.L = -1;
            this.K = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.K[i12] = i12;
            }
            xvs[] xvsVarArr = new xvs[length];
            int i13 = 0;
            while (i13 < length) {
                dsc s3 = this.v[i13].s();
                vq1.B(s3);
                String str4 = this.a;
                dsc dscVar2 = this.f;
                if (i13 == i8) {
                    dsc[] dscVarArr = new dsc[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        dsc dscVar3 = xvsVar.d[i14];
                        if (i9 == 1 && dscVar2 != null) {
                            dscVar3 = dscVar3.d(dscVar2);
                        }
                        dscVarArr[i14] = i11 == 1 ? s3.d(dscVar3) : w(dscVar3, s3, true);
                    }
                    xvsVarArr[i13] = new xvs(str4, dscVarArr);
                    this.L = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !l5i.k(s3.n)) {
                        dscVar2 = null;
                    }
                    StringBuilder m = tlm.m(str4, ":muxed:");
                    m.append(i13 < i8 ? i13 : i13 - 1);
                    i = 0;
                    xvsVarArr[i13] = new xvs(m.toString(), w(dscVar2, s3, false));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.I = u(xvsVarArr);
            vq1.A(this.J == null ? 1 : i15);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.c.k();
        }
    }

    public final void C() {
        this.j.b();
        lzd lzdVar = this.d;
        yy2 yy2Var = lzdVar.n;
        if (yy2Var != null) {
            throw yy2Var;
        }
        Uri uri = lzdVar.o;
        if (uri == null || !lzdVar.s) {
            return;
        }
        xm7 xm7Var = (xm7) lzdVar.g.d.get(uri);
        xm7Var.b.b();
        IOException iOException = xm7Var.j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void D(xvs[] xvsVarArr, int... iArr) {
        this.I = u(xvsVarArr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        this.r.post(new sr7(21, this.c));
        this.D = true;
    }

    public final void F() {
        for (s0e s0eVar : this.v) {
            s0eVar.A(this.x0);
        }
        this.x0 = false;
    }

    public final boolean G(long j, boolean z) {
        ozd ozdVar;
        boolean z2;
        this.v0 = j;
        if (A()) {
            this.w0 = j;
            return true;
        }
        boolean z3 = this.d.p;
        ArrayList arrayList = this.n;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                ozdVar = (ozd) arrayList.get(i);
                if (ozdVar.g == j) {
                    break;
                }
            }
        }
        ozdVar = null;
        if (this.C && !z) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                s0e s0eVar = this.v[i2];
                if (!(ozdVar != null ? s0eVar.B(ozdVar.g(i2)) : s0eVar.C(j, false)) && (this.Z[i2] || !this.X)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.w0 = j;
        this.z0 = false;
        arrayList.clear();
        osh oshVar = this.j;
        if (!oshVar.I()) {
            oshVar.c = null;
            F();
            return true;
        }
        if (this.C) {
            for (s0e s0eVar2 : this.v) {
                s0eVar2.h();
            }
        }
        oshVar.w();
        return true;
    }

    @Override // defpackage.t2c
    public final void K() {
        this.A0 = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [s0e[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s0e[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [azs] */
    /* JADX WARN: Type inference failed for: r5v4, types: [s0e, zno] */
    /* JADX WARN: Type inference failed for: r5v6, types: [z48] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.t2c
    public final azs M(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = E0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            vq1.v(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                r5 = this.w[i3] == i ? this.v[i3] : q(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.A0) {
                return q(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new s0e(this.e, this.g, this.h, this.t);
            r5.t = this.v0;
            if (z) {
                r5.I = this.C0;
                r5.z = true;
            }
            long j = this.B0;
            if (r5.F != j) {
                r5.F = j;
                r5.z = true;
            }
            if (this.D0 != null) {
                r5.C = r6.k;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.w, i5);
            this.w = copyOf;
            copyOf[length] = i;
            s0e[] s0eVarArr = this.v;
            int i6 = dvt.a;
            ?? copyOf2 = Arrays.copyOf(s0eVarArr, s0eVarArr.length + 1);
            copyOf2[s0eVarArr.length] = r5;
            this.v = (s0e[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.Z, i5);
            this.Z = copyOf3;
            copyOf3[length] = z;
            this.X |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (z(i2) > z(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.Y = Arrays.copyOf(this.Y, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        if (this.z == null) {
            this.z = new r0e(r5, this.l);
        }
        return this.z;
    }

    @Override // defpackage.yno
    public final void b() {
        this.r.post(this.p);
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        sk4 sk4Var = (sk4) jggVar;
        this.u = null;
        long j3 = sk4Var.a;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.i.getClass();
        this.k.L(cfgVar, sk4Var.c, this.b, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h);
        if (z) {
            return;
        }
        if (A() || this.E == 0) {
            F();
        }
        if (this.E > 0) {
            this.c.b(this);
        }
    }

    @Override // defpackage.ahp
    public final long e() {
        if (A()) {
            return this.w0;
        }
        if (this.z0) {
            return Long.MIN_VALUE;
        }
        return y().h;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.j.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        sk4 sk4Var = (sk4) jggVar;
        this.u = null;
        if (sk4Var instanceof hzd) {
            hzd hzdVar = (hzd) sk4Var;
            byte[] bArr = hzdVar.j;
            lzd lzdVar = this.d;
            lzdVar.m = bArr;
            qec qecVar = lzdVar.j;
            Uri uri = hzdVar.b.a;
            byte[] bArr2 = hzdVar.l;
            bArr2.getClass();
            xxc xxcVar = (xxc) qecVar.b;
            uri.getClass();
        }
        long j3 = sk4Var.a;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.i.getClass();
        this.k.N(cfgVar, sk4Var.c, this.b, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h);
        if (this.D) {
            this.c.b(this);
            return;
        }
        chg chgVar = new chg();
        chgVar.a = this.v0;
        n(new dhg(chgVar));
    }

    @Override // defpackage.kgg
    public final void j() {
        for (s0e s0eVar : this.v) {
            s0eVar.z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    @Override // defpackage.ahp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(dhg dhgVar) {
        long max;
        List list;
        qec qecVar;
        long j;
        ym7 ym7Var;
        r0o r0oVar;
        r0o r0oVar2;
        int i;
        ozd ozdVar;
        long j2;
        Uri uri;
        int i2;
        kzd kzdVar;
        hzd d;
        boolean z;
        List list2;
        boolean z2;
        qec qecVar2;
        byte[] bArr;
        osh oshVar;
        boolean z3;
        byte[] bArr2;
        db7 db7Var;
        uzd uzdVar;
        ndl ndlVar;
        f4m f4mVar;
        Uri uri2;
        nb7 nb7Var;
        db7 db7Var2;
        boolean z4;
        Uri uri3;
        pae paeVar;
        d7k d7kVar;
        yk3 yk3Var;
        ojs ojsVar;
        byte[] bArr3;
        db7 db7Var3;
        String str;
        boolean z5;
        if (!this.z0) {
            osh oshVar2 = this.j;
            if (!oshVar2.I() && !oshVar2.H()) {
                if (A()) {
                    list = Collections.EMPTY_LIST;
                    max = this.w0;
                    for (s0e s0eVar : this.v) {
                        s0eVar.t = this.w0;
                    }
                } else {
                    ozd y = y();
                    max = y.H ? y.h : Math.max(this.v0, y.g);
                    list = this.o;
                }
                List list3 = list;
                r0o r0oVar3 = this.m;
                r0oVar3.c = null;
                r0oVar3.b = false;
                r0oVar3.d = null;
                boolean z6 = this.D || !list3.isEmpty();
                lzd lzdVar = this.d;
                qec qecVar3 = lzdVar.j;
                Uri[] uriArr = lzdVar.e;
                ym7 ym7Var2 = lzdVar.g;
                ozd ozdVar2 = list3.isEmpty() ? null : (ozd) ild.x(list3);
                int b = ozdVar2 == null ? -1 : lzdVar.h.b(ozdVar2.d);
                long j3 = dhgVar.a;
                long j4 = max - j3;
                int i3 = b;
                long j5 = lzdVar.r;
                long j6 = j5 != -9223372036854775807L ? j5 - j3 : -9223372036854775807L;
                if (ozdVar2 == null || lzdVar.p) {
                    qecVar = qecVar3;
                    j = j3;
                    ym7Var = ym7Var2;
                    r0oVar = r0oVar3;
                } else {
                    r0oVar = r0oVar3;
                    qecVar = qecVar3;
                    j = j3;
                    long j7 = ozdVar2.h - ozdVar2.g;
                    ym7Var = ym7Var2;
                    j4 = Math.max(0L, j4 - j7);
                    if (j6 != -9223372036854775807L) {
                        j6 = Math.max(0L, j6 - j7);
                    }
                }
                eih[] a = lzdVar.a(ozdVar2, max);
                long j8 = max;
                ozd ozdVar3 = ozdVar2;
                qec qecVar4 = qecVar;
                ym7 ym7Var3 = ym7Var;
                lzdVar.q.m(j, j4, j6, list3, a);
                int r = lzdVar.q.r();
                boolean z7 = i3 != r;
                Uri uri4 = uriArr[r];
                if (ym7Var3.c(uri4)) {
                    r0oVar2 = r0oVar;
                    xzd a2 = ym7Var3.a(true, uri4);
                    a2.getClass();
                    long j9 = a2.h;
                    lzdVar.p = a2.c;
                    if (a2.o) {
                        i = i3;
                        ozdVar = ozdVar3;
                        j2 = -9223372036854775807L;
                    } else {
                        i = i3;
                        ozdVar = ozdVar3;
                        j2 = (a2.u + j9) - ym7Var3.n;
                    }
                    lzdVar.r = j2;
                    boolean z8 = z7;
                    xzd xzdVar = a2;
                    long j10 = j9 - ym7Var3.n;
                    int i4 = i;
                    ozd ozdVar4 = ozdVar;
                    Pair c = lzdVar.c(ozdVar4, z8, xzdVar, j10, j8);
                    long longValue = ((Long) c.first).longValue();
                    int intValue = ((Integer) c.second).intValue();
                    if (longValue >= xzdVar.k || ozdVar4 == null || !z8) {
                        uri = uri4;
                        i2 = r;
                    } else {
                        uri = uriArr[i4];
                        xzd a3 = ym7Var3.a(true, uri);
                        a3.getClass();
                        j10 = a3.h - ym7Var3.n;
                        xzdVar = a3;
                        Pair c2 = lzdVar.c(ozdVar4, false, xzdVar, j10, j8);
                        longValue = ((Long) c2.first).longValue();
                        intValue = ((Integer) c2.second).intValue();
                        i2 = i4;
                    }
                    long j11 = j10;
                    xzd xzdVar2 = xzdVar;
                    long j12 = longValue;
                    String str2 = xzdVar2.a;
                    boolean z9 = xzdVar2.c;
                    long j13 = xzdVar2.k;
                    yde ydeVar = xzdVar2.r;
                    if (i2 != i4 && i4 != -1) {
                        xm7 xm7Var = (xm7) ym7Var3.d.get(uriArr[i4]);
                        if (xm7Var != null) {
                            xm7Var.k = false;
                        }
                    }
                    if (j12 < j13) {
                        lzdVar.n = new yy2();
                    } else {
                        yde ydeVar2 = xzdVar2.s;
                        int i5 = (int) (j12 - j13);
                        if (i5 == ydeVar.size()) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            if (intValue < ydeVar2.size()) {
                                kzdVar = new kzd((vzd) ydeVar2.get(intValue), j12, intValue);
                                if (kzdVar == null) {
                                    if (!xzdVar2.o) {
                                        r0oVar2.d = uri;
                                        lzdVar.s &= uri.equals(lzdVar.o);
                                        lzdVar.o = uri;
                                    } else if (z6 || ydeVar.isEmpty()) {
                                        r0oVar2.b = true;
                                    } else {
                                        kzdVar = new kzd((vzd) ild.x(ydeVar), (j13 + ydeVar.size()) - 1, -1);
                                    }
                                }
                                boolean z10 = kzdVar.d;
                                vzd vzdVar = kzdVar.a;
                                lzdVar.s = false;
                                lzdVar.o = null;
                                SystemClock.elapsedRealtime();
                                uzd uzdVar2 = vzdVar.b;
                                long j14 = vzdVar.e;
                                Uri N = (uzdVar2 != null || (str = uzdVar2.g) == null) ? null : p1g.N(str2, str);
                                d = lzdVar.d(N, i2, true);
                                r0oVar2.c = d;
                                if (d == null) {
                                    String str3 = vzdVar.g;
                                    Uri N2 = str3 == null ? null : p1g.N(str2, str3);
                                    hzd d2 = lzdVar.d(N2, i2, false);
                                    r0oVar2.c = d2;
                                    if (d2 == null) {
                                        if (ozdVar4 == null) {
                                            AtomicInteger atomicInteger = ozd.L;
                                        } else if (!uri.equals(ozdVar4.m) || !ozdVar4.H) {
                                            long j15 = j11 + j14;
                                            if (vzdVar instanceof szd) {
                                                z9 = ((szd) vzdVar).l || (kzdVar.c == 0 && z9);
                                            }
                                            if (!z9 || j15 < ozdVar4.h) {
                                                z = true;
                                                if (z || !z10) {
                                                    vm7 vm7Var = lzdVar.a;
                                                    db7 db7Var4 = lzdVar.b;
                                                    dsc dscVar = lzdVar.f[i2];
                                                    List list4 = lzdVar.i;
                                                    int t = lzdVar.q.t();
                                                    Object j16 = lzdVar.q.j();
                                                    boolean z11 = lzdVar.l;
                                                    f4m f4mVar2 = lzdVar.d;
                                                    if (N2 != null) {
                                                        qecVar4.getClass();
                                                        list2 = list4;
                                                        z2 = z11;
                                                        bArr = null;
                                                        qecVar2 = qecVar4;
                                                    } else {
                                                        list2 = list4;
                                                        z2 = z11;
                                                        qecVar2 = qecVar4;
                                                        bArr = (byte[]) ((xxc) qecVar2.b).get(N2);
                                                    }
                                                    byte[] bArr4 = N != null ? null : (byte[]) ((xxc) qecVar2.b).get(N);
                                                    ndl ndlVar2 = lzdVar.k;
                                                    AtomicInteger atomicInteger2 = ozd.L;
                                                    Map map = Collections.EMPTY_MAP;
                                                    Uri N3 = p1g.N(str2, vzdVar.a);
                                                    oshVar = oshVar2;
                                                    long j17 = vzdVar.i;
                                                    long j18 = vzdVar.j;
                                                    int i6 = !z10 ? 8 : 0;
                                                    vq1.C(N3, "The uri must be set.");
                                                    nb7 nb7Var2 = new nb7(N3, 0L, 1, null, map, j17, j18, null, i6);
                                                    z3 = bArr == null;
                                                    if (z3) {
                                                        bArr2 = null;
                                                    } else {
                                                        String str4 = vzdVar.h;
                                                        str4.getClass();
                                                        bArr2 = ozd.e(str4);
                                                    }
                                                    if (bArr == null) {
                                                        bArr2.getClass();
                                                        db7Var = new yn(db7Var4, bArr, bArr2);
                                                    } else {
                                                        db7Var = db7Var4;
                                                    }
                                                    uzdVar = vzdVar.b;
                                                    if (uzdVar == null) {
                                                        boolean z12 = bArr4 != null;
                                                        if (z12) {
                                                            String str5 = uzdVar.h;
                                                            str5.getClass();
                                                            bArr3 = ozd.e(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        ndlVar = ndlVar2;
                                                        Uri N4 = p1g.N(str2, uzdVar.a);
                                                        f4mVar = f4mVar2;
                                                        uri2 = uri;
                                                        long j19 = uzdVar.i;
                                                        long j20 = uzdVar.j;
                                                        vq1.C(N4, "The uri must be set.");
                                                        nb7 nb7Var3 = new nb7(N4, 0L, 1, null, map, j19, j20, null, 0);
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            db7Var3 = new yn(db7Var4, bArr4, bArr3);
                                                        } else {
                                                            db7Var3 = db7Var4;
                                                        }
                                                        db7Var2 = db7Var3;
                                                        z4 = z12;
                                                        nb7Var = nb7Var3;
                                                    } else {
                                                        ndlVar = ndlVar2;
                                                        f4mVar = f4mVar2;
                                                        uri2 = uri;
                                                        nb7Var = null;
                                                        db7Var2 = null;
                                                        z4 = false;
                                                    }
                                                    long j21 = j11 + j14;
                                                    long j22 = j21 + vzdVar.c;
                                                    int i7 = xzdVar2.j + vzdVar.d;
                                                    if (ozdVar4 == null) {
                                                        nb7 nb7Var4 = ozdVar4.q;
                                                        boolean z13 = nb7Var == nb7Var4 || (nb7Var != null && nb7Var4 != null && nb7Var.a.equals(nb7Var4.a) && nb7Var.f == nb7Var4.f);
                                                        uri3 = uri2;
                                                        boolean z14 = uri3.equals(ozdVar4.m) && ozdVar4.H;
                                                        paeVar = ozdVar4.y;
                                                        d7k d7kVar2 = ozdVar4.z;
                                                        yk3Var = (z13 && z14 && !ozdVar4.J && ozdVar4.l == i7) ? ozdVar4.C : null;
                                                        d7kVar = d7kVar2;
                                                    } else {
                                                        uri3 = uri2;
                                                        paeVar = new pae(null);
                                                        d7kVar = new d7k(10);
                                                        yk3Var = null;
                                                    }
                                                    pae paeVar2 = paeVar;
                                                    long j23 = kzdVar.b;
                                                    int i8 = kzdVar.c;
                                                    boolean z15 = !z10;
                                                    boolean z16 = vzdVar.k;
                                                    SparseArray sparseArray = (SparseArray) f4mVar.b;
                                                    ojsVar = (ojs) sparseArray.get(i7);
                                                    if (ojsVar == null) {
                                                        ojsVar = new ojs(9223372036854775806L);
                                                        sparseArray.put(i7, ojsVar);
                                                    }
                                                    r0oVar2.c = new ozd(vm7Var, db7Var, nb7Var2, dscVar, z3, db7Var2, nb7Var, z4, uri3, list2, t, j16, j21, j22, j23, i8, z15, i7, z16, z2, ojsVar, vzdVar.f, yk3Var, paeVar2, d7kVar, z, ndlVar);
                                                    z5 = r0oVar2.b;
                                                    sk4 sk4Var = (sk4) r0oVar2.c;
                                                    Uri uri5 = (Uri) r0oVar2.d;
                                                    if (z5) {
                                                        this.w0 = -9223372036854775807L;
                                                        this.z0 = true;
                                                        return true;
                                                    }
                                                    if (sk4Var == null) {
                                                        if (uri5 == null) {
                                                            return false;
                                                        }
                                                        ((xm7) ((pzd) this.c.a).b.d.get(uri5)).c(true);
                                                        return false;
                                                    }
                                                    if (sk4Var instanceof ozd) {
                                                        ozd ozdVar5 = (ozd) sk4Var;
                                                        this.D0 = ozdVar5;
                                                        this.F = ozdVar5.d;
                                                        this.w0 = -9223372036854775807L;
                                                        this.n.add(ozdVar5);
                                                        tde u = yde.u();
                                                        for (s0e s0eVar2 : this.v) {
                                                            u.a(Integer.valueOf(s0eVar2.q + s0eVar2.p));
                                                        }
                                                        qsn f = u.f();
                                                        ozdVar5.D = this;
                                                        ozdVar5.I = f;
                                                        for (s0e s0eVar3 : this.v) {
                                                            s0eVar3.getClass();
                                                            s0eVar3.C = ozdVar5.k;
                                                            if (ozdVar5.n) {
                                                                s0eVar3.G = true;
                                                            }
                                                        }
                                                    }
                                                    this.u = sk4Var;
                                                    oshVar.X(sk4Var, this, this.i.r(sk4Var.c));
                                                    return true;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        vm7 vm7Var2 = lzdVar.a;
                                        db7 db7Var42 = lzdVar.b;
                                        dsc dscVar2 = lzdVar.f[i2];
                                        List list42 = lzdVar.i;
                                        int t2 = lzdVar.q.t();
                                        Object j162 = lzdVar.q.j();
                                        boolean z112 = lzdVar.l;
                                        f4m f4mVar22 = lzdVar.d;
                                        if (N2 != null) {
                                        }
                                        if (N != null) {
                                        }
                                        ndl ndlVar22 = lzdVar.k;
                                        AtomicInteger atomicInteger22 = ozd.L;
                                        Map map2 = Collections.EMPTY_MAP;
                                        Uri N32 = p1g.N(str2, vzdVar.a);
                                        oshVar = oshVar2;
                                        long j172 = vzdVar.i;
                                        long j182 = vzdVar.j;
                                        if (!z10) {
                                        }
                                        vq1.C(N32, "The uri must be set.");
                                        nb7 nb7Var22 = new nb7(N32, 0L, 1, null, map2, j172, j182, null, i6);
                                        if (bArr == null) {
                                        }
                                        if (z3) {
                                        }
                                        if (bArr == null) {
                                        }
                                        uzdVar = vzdVar.b;
                                        if (uzdVar == null) {
                                        }
                                        long j212 = j11 + j14;
                                        long j222 = j212 + vzdVar.c;
                                        int i72 = xzdVar2.j + vzdVar.d;
                                        if (ozdVar4 == null) {
                                        }
                                        pae paeVar22 = paeVar;
                                        long j232 = kzdVar.b;
                                        int i82 = kzdVar.c;
                                        boolean z152 = !z10;
                                        boolean z162 = vzdVar.k;
                                        SparseArray sparseArray2 = (SparseArray) f4mVar.b;
                                        ojsVar = (ojs) sparseArray2.get(i72);
                                        if (ojsVar == null) {
                                        }
                                        r0oVar2.c = new ozd(vm7Var2, db7Var, nb7Var22, dscVar2, z3, db7Var2, nb7Var, z4, uri3, list2, t2, j162, j212, j222, j232, i82, z152, i72, z162, z2, ojsVar, vzdVar.f, yk3Var, paeVar22, d7kVar, z, ndlVar);
                                        z5 = r0oVar2.b;
                                        sk4 sk4Var2 = (sk4) r0oVar2.c;
                                        Uri uri52 = (Uri) r0oVar2.d;
                                        if (z5) {
                                        }
                                    }
                                }
                            }
                            kzdVar = null;
                            if (kzdVar == null) {
                            }
                            boolean z102 = kzdVar.d;
                            vzd vzdVar2 = kzdVar.a;
                            lzdVar.s = false;
                            lzdVar.o = null;
                            SystemClock.elapsedRealtime();
                            uzd uzdVar22 = vzdVar2.b;
                            long j142 = vzdVar2.e;
                            if (uzdVar22 != null) {
                            }
                            d = lzdVar.d(N, i2, true);
                            r0oVar2.c = d;
                            if (d == null) {
                            }
                        } else {
                            uzd uzdVar3 = (uzd) ydeVar.get(i5);
                            if (intValue == -1) {
                                kzdVar = new kzd(uzdVar3, j12, -1);
                            } else if (intValue < uzdVar3.m.size()) {
                                kzdVar = new kzd((vzd) uzdVar3.m.get(intValue), j12, intValue);
                            } else {
                                int i9 = i5 + 1;
                                if (i9 < ydeVar.size()) {
                                    kzdVar = new kzd((vzd) ydeVar.get(i9), j12 + 1, -1);
                                } else {
                                    if (!ydeVar2.isEmpty()) {
                                        kzdVar = new kzd((vzd) ydeVar2.get(0), j12 + 1, 0);
                                    }
                                    kzdVar = null;
                                }
                            }
                            if (kzdVar == null) {
                            }
                            boolean z1022 = kzdVar.d;
                            vzd vzdVar22 = kzdVar.a;
                            lzdVar.s = false;
                            lzdVar.o = null;
                            SystemClock.elapsedRealtime();
                            uzd uzdVar222 = vzdVar22.b;
                            long j1422 = vzdVar22.e;
                            if (uzdVar222 != null) {
                            }
                            d = lzdVar.d(N, i2, true);
                            r0oVar2.c = d;
                            if (d == null) {
                            }
                        }
                    }
                } else {
                    r0oVar2 = r0oVar;
                    r0oVar2.d = uri4;
                    lzdVar.s &= uri4.equals(lzdVar.o);
                    lzdVar.o = uri4;
                }
                oshVar = oshVar2;
                z5 = r0oVar2.b;
                sk4 sk4Var22 = (sk4) r0oVar2.c;
                Uri uri522 = (Uri) r0oVar2.d;
                if (z5) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        cfg cfgVar;
        sk4 sk4Var = (sk4) jggVar;
        if (i == 0) {
            long j3 = sk4Var.a;
            cfgVar = new cfg(sk4Var.b);
        } else {
            long j4 = sk4Var.a;
            nb7 nb7Var = sk4Var.b;
            ngr ngrVar = sk4Var.i;
            cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        }
        this.k.R(cfgVar, sk4Var.c, this.b, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h, i);
    }

    public final void p() {
        vq1.A(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    @Override // defpackage.ahp
    public final long r() {
        if (this.z0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.w0;
        }
        long j = this.v0;
        ozd y = y();
        if (!y.H) {
            ArrayList arrayList = this.n;
            y = arrayList.size() > 1 ? (ozd) vz1.m(arrayList, 2) : null;
        }
        if (y != null) {
            j = Math.max(j, y.h);
        }
        if (this.C) {
            for (s0e s0eVar : this.v) {
                j = Math.max(j, s0eVar.n());
            }
        }
        return j;
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        osh oshVar = this.j;
        if (oshVar.H() || A()) {
            return;
        }
        boolean I = oshVar.I();
        lzd lzdVar = this.d;
        List list = this.o;
        if (I) {
            this.u.getClass();
            if (lzdVar.n != null ? false : lzdVar.q.d(j, this.u, list)) {
                oshVar.w();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && lzdVar.b((ozd) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            x(size);
        }
        int size2 = (lzdVar.n != null || lzdVar.q.length() < 2) ? list.size() : lzdVar.q.v(list, j);
        if (size2 < this.n.size()) {
            x(size2);
        }
    }

    public final yvs u(xvs[] xvsVarArr) {
        for (int i = 0; i < xvsVarArr.length; i++) {
            xvs xvsVar = xvsVarArr[i];
            dsc[] dscVarArr = new dsc[xvsVar.a];
            for (int i2 = 0; i2 < xvsVar.a; i2++) {
                dsc dscVar = xvsVar.d[i2];
                int t = this.g.t(dscVar);
                bsc a = dscVar.a();
                a.L = t;
                dscVarArr[i2] = new dsc(a);
            }
            xvsVarArr[i] = new xvs(xvsVar.b, dscVarArr);
        }
        return new yvs(xvsVarArr);
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        mdr mdrVar;
        int i2;
        sk4 sk4Var = (sk4) jggVar;
        boolean z2 = sk4Var instanceof ozd;
        if (z2 && !((ozd) sk4Var).K && (iOException instanceof i6e) && ((i2 = ((i6e) iOException).d) == 410 || i2 == 404)) {
            return osh.k;
        }
        long j3 = sk4Var.i.b;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, j3);
        dvt.m0(sk4Var.g);
        dvt.m0(sk4Var.h);
        j4x j4xVar = new j4x(iOException, i, 9);
        lzd lzdVar = this.d;
        weg r = wxf.r(lzdVar.q);
        xeg xegVar = this.i;
        mdr L = xegVar.L(r, j4xVar);
        if (L == null || L.a != 2) {
            z = false;
        } else {
            long j4 = L.b;
            zsb zsbVar = lzdVar.q;
            z = zsbVar.h(zsbVar.l(lzdVar.h.b(sk4Var.d)), j4);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.n;
                vq1.A(((ozd) arrayList.remove(arrayList.size() - 1)) == sk4Var);
                if (arrayList.isEmpty()) {
                    this.w0 = this.v0;
                } else {
                    ((ozd) ild.x(arrayList)).J = true;
                }
            }
            mdrVar = osh.l;
        } else {
            long C = xegVar.C(j4xVar);
            mdrVar = C != -9223372036854775807L ? new mdr(0, C, false) : osh.m;
        }
        mdr mdrVar2 = mdrVar;
        boolean b = mdrVar2.b();
        this.k.O(cfgVar, sk4Var.c, this.b, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h, iOException, !b);
        if (!b) {
            this.u = null;
        }
        if (z) {
            if (!this.D) {
                chg chgVar = new chg();
                chgVar.a = this.v0;
                n(new dhg(chgVar));
                return mdrVar2;
            }
            this.c.b(this);
        }
        return mdrVar2;
    }

    public final void x(int i) {
        ArrayList arrayList;
        vq1.A(!this.j.I());
        loop0: while (true) {
            arrayList = this.n;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            int i2 = i;
            while (true) {
                if (i2 >= arrayList.size()) {
                    ozd ozdVar = (ozd) arrayList.get(i);
                    for (int i3 = 0; i3 < this.v.length; i3++) {
                        if (this.v[i3].p() > ozdVar.g(i3)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((ozd) arrayList.get(i2)).n) {
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        long j = y().h;
        ozd ozdVar2 = (ozd) arrayList.get(i);
        dvt.d0(i, arrayList.size(), arrayList);
        for (int i4 = 0; i4 < this.v.length; i4++) {
            this.v[i4].k(ozdVar2.g(i4));
        }
        if (arrayList.isEmpty()) {
            this.w0 = this.v0;
        } else {
            ((ozd) ild.x(arrayList)).J = true;
        }
        this.z0 = false;
        this.k.e0(this.A, ozdVar2.g, j);
    }

    public final ozd y() {
        return (ozd) vz1.m(this.n, 1);
    }

    @Override // defpackage.t2c
    public final void E(fap fapVar) {
    }
}
