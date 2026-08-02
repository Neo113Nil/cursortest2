package defpackage;

import android.os.Trace;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oq5 implements hq5 {
    public int A;
    public boolean B;
    public final nq5 C;
    public final ArrayList D;
    public boolean E;
    public exq F;
    public fxq G;
    public oxq H;
    public boolean I;
    public a J;
    public wb4 K;
    public final iq5 L;
    public w80 M;
    public ngc N;
    public boolean O;
    public int P;
    public vr5 Q;
    public final j5 a;
    public final tr5 b;
    public final fxq c;
    public final wpi d;
    public final wb4 e;
    public final wb4 f;
    public final wr5 g;
    public wjk i;
    public int j;
    public int k;
    public int l;
    public int[] n;
    public qoi o;
    public boolean p;
    public boolean q;
    public soi u;
    public boolean v;
    public boolean x;
    public int z;
    public final ArrayList h = new ArrayList();
    public final iqe m = new iqe(1, false);
    public final ArrayList r = new ArrayList();
    public final iqe s = new iqe(1, false);
    public a t = a.g;
    public final iqe w = new iqe(1, false);
    public int y = -1;

    public oq5(j5 j5Var, tr5 tr5Var, fxq fxqVar, wpi wpiVar, wb4 wb4Var, wb4 wb4Var2, wr5 wr5Var) {
        this.a = j5Var;
        this.b = tr5Var;
        this.c = fxqVar;
        this.d = wpiVar;
        this.e = wb4Var;
        this.f = wb4Var2;
        this.g = wr5Var;
        this.B = tr5Var.f() || tr5Var.d();
        this.C = new nq5(0, this);
        this.D = new ArrayList();
        exq m = fxqVar.m();
        m.c();
        this.F = m;
        fxq fxqVar2 = new fxq();
        if (tr5Var.f()) {
            fxqVar2.g();
        }
        if (tr5Var.d()) {
            fxqVar2.k = new soi();
        }
        this.G = fxqVar2;
        oxq o = fxqVar2.o();
        o.e(true);
        this.H = o;
        this.L = new iq5(this, wb4Var);
        exq m2 = this.G.m();
        try {
            w80 a = m2.a(0);
            m2.c();
            this.M = a;
            this.N = new ngc();
        } catch (Throwable th) {
            m2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[LOOP:1: B:21:0x0086->B:22:0x0088, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mfi M(int i, oq5 oq5Var) {
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int g;
        int size;
        exq exqVar = oq5Var.F;
        int[] iArr = exqVar.b;
        int i3 = i * 5;
        int i4 = iArr[i3];
        Object n = exqVar.n(iArr, i);
        if (i4 != 126665345 || !(n instanceof jfi)) {
            return null;
        }
        if (oq5Var.F.d(i)) {
            ArrayList arrayList3 = new ArrayList();
            N(oq5Var, arrayList3, i);
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
                exq exqVar2 = oq5Var.F;
                Object n2 = exqVar2.n(exqVar2.b, i);
                n2.getClass();
                jfi jfiVar = (jfi) n2;
                Object h = oq5Var.F.h(i, 0);
                w80 a = oq5Var.F.a(i);
                int i5 = oq5Var.F.b[i3 + 3] + i;
                arrayList2 = oq5Var.r;
                ArrayList arrayList4 = new ArrayList();
                g = pq5.g(arrayList2, i);
                if (g < 0) {
                    g = -(g + 1);
                }
                while (g < arrayList2.size()) {
                    fye fyeVar = (fye) arrayList2.get(g);
                    if (fyeVar.b >= i5) {
                        break;
                    }
                    arrayList4.add(fyeVar);
                    g++;
                }
                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                size = arrayList4.size();
                for (i2 = 0; i2 < size; i2++) {
                    fye fyeVar2 = (fye) arrayList4.get(i2);
                    arrayList5.add(new Pair(fyeVar2.a, fyeVar2.c));
                }
                return new mfi(jfiVar, h, oq5Var.g, oq5Var.c, a, arrayList5, oq5Var.m(i), arrayList);
            }
        }
        arrayList = null;
        exq exqVar22 = oq5Var.F;
        Object n22 = exqVar22.n(exqVar22.b, i);
        n22.getClass();
        jfi jfiVar2 = (jfi) n22;
        Object h2 = oq5Var.F.h(i, 0);
        w80 a2 = oq5Var.F.a(i);
        int i52 = oq5Var.F.b[i3 + 3] + i;
        arrayList2 = oq5Var.r;
        ArrayList arrayList42 = new ArrayList();
        g = pq5.g(arrayList2, i);
        if (g < 0) {
        }
        while (g < arrayList2.size()) {
        }
        ArrayList arrayList52 = new ArrayList(arrayList42.size());
        size = arrayList42.size();
        while (i2 < size) {
        }
        return new mfi(jfiVar2, h2, oq5Var.g, oq5Var.c, a2, arrayList52, oq5Var.m(i), arrayList);
    }

    public static final void N(oq5 oq5Var, ArrayList arrayList, int i) {
        int i2 = oq5Var.F.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            exq exqVar = oq5Var.F;
            int i4 = i3 * 5;
            if ((exqVar.b[i4 + 1] & 134217728) != 0) {
                mfi M = M(i3, oq5Var);
                if (M != null) {
                    arrayList.add(M);
                }
            } else if (exqVar.d(i3)) {
                N(oq5Var, arrayList, i3);
            }
            i3 += oq5Var.F.b[i4 + 3];
        }
    }

    public static final int O(oq5 oq5Var, int i, int i2, boolean z, int i3) {
        exq exqVar = oq5Var.F;
        tr5 tr5Var = oq5Var.b;
        iq5 iq5Var = oq5Var.L;
        int[] iArr = exqVar.b;
        int i4 = i2 * 5;
        if ((iArr[i4 + 1] & 134217728) != 0) {
            int i5 = iArr[i4];
            Object n = exqVar.n(iArr, i2);
            if (i5 == 126665345 && (n instanceof jfi)) {
                mfi M = M(i2, oq5Var);
                if (M != null) {
                    tr5Var.b(M);
                    iq5Var.e();
                    wr5 wr5Var = oq5Var.g;
                    tr5 tr5Var2 = oq5Var.b;
                    puj pujVar = iq5Var.b.a;
                    pujVar.G0(ytj.d);
                    q5g.L(pujVar, wr5Var, tr5Var2, M);
                }
                if (!z || i2 == i) {
                    return exqVar.m(i2);
                }
                iq5Var.c();
                iq5Var.b();
                oq5 oq5Var2 = iq5Var.a;
                int m = oq5Var2.F.j(i2) ? 1 : oq5Var2.F.m(i2);
                if (m > 0) {
                    iq5Var.f(i3, m);
                }
                return 0;
            }
            if (i5 == 206 && Intrinsics.d(n, pq5.e)) {
                Object h = exqVar.h(i2, 0);
                lq5 lq5Var = h instanceof lq5 ? (lq5) h : null;
                if (lq5Var != null) {
                    for (oq5 oq5Var3 : lq5Var.a.e) {
                        fxq fxqVar = oq5Var3.c;
                        if (fxqVar.b > 0 && (fxqVar.a[1] & 67108864) != 0) {
                            wr5 wr5Var2 = oq5Var3.g;
                            synchronized (wr5Var2.d) {
                                wr5Var2.r();
                                tpi tpiVar = wr5Var2.n;
                                wr5Var2.n = ldg.n();
                                try {
                                    wr5Var2.s.g0(tpiVar);
                                } catch (Exception e) {
                                    wr5Var2.n = tpiVar;
                                    throw e;
                                }
                            }
                            wb4 wb4Var = new wb4();
                            oq5Var3.K = wb4Var;
                            exq m2 = oq5Var3.c.m();
                            try {
                                oq5Var3.F = m2;
                                iq5 iq5Var2 = oq5Var3.L;
                                wb4 wb4Var2 = iq5Var2.b;
                                try {
                                    iq5Var2.b = wb4Var;
                                    oq5Var3.L(0);
                                    iq5 iq5Var3 = oq5Var3.L;
                                    iq5Var3.b();
                                    if (iq5Var3.c) {
                                        iq5Var3.b.a.G0(euj.d);
                                        if (iq5Var3.c) {
                                            iq5Var3.d(false);
                                            iq5Var3.d(false);
                                            iq5Var3.b.a.G0(otj.d);
                                            iq5Var3.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                m2.c();
                            }
                        }
                        tr5Var.p(oq5Var3.g);
                    }
                }
                return exqVar.m(i2);
            }
            if (!exqVar.j(i2)) {
                return exqVar.m(i2);
            }
        } else if (exqVar.d(i2)) {
            int i6 = iArr[i4 + 3] + i2;
            int i7 = 0;
            for (int i8 = i2 + 1; i8 < i6; i8 += iArr[(i8 * 5) + 3]) {
                boolean j = exqVar.j(i8);
                if (j) {
                    iq5Var.c();
                    Object l = exqVar.l(i8);
                    iq5Var.c();
                    iq5Var.h.add(l);
                }
                i7 += O(oq5Var, i, i8, j || z, j ? 0 : i3 + i7);
                if (j) {
                    iq5Var.c();
                    iq5Var.a();
                }
            }
            if (!exqVar.j(i2)) {
                return i7;
            }
        } else if (!exqVar.j(i2)) {
            return exqVar.m(i2);
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: all -> 0x00b0, TryCatch #5 {all -> 0x00b0, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x004f, B:9:0x0057, B:11:0x005d, B:12:0x0062, B:13:0x0065, B:24:0x00a4, B:25:0x0202, B:29:0x00ba, B:30:0x00bd, B:38:0x00be, B:40:0x00c6, B:42:0x00cd, B:44:0x00d5, B:45:0x00da, B:48:0x00e4, B:50:0x00f1, B:53:0x0111, B:54:0x0113, B:57:0x0123, B:59:0x012c, B:61:0x0137, B:62:0x0148, B:64:0x014e, B:65:0x0161, B:96:0x01ff, B:98:0x0253, B:99:0x0256, B:138:0x0258, B:139:0x025b, B:140:0x00ff, B:141:0x00df, B:143:0x00c9, B:145:0x025c, B:56:0x011c), top: B:2:0x000c, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #8 {all -> 0x0216, blocks: (B:91:0x01e0, B:93:0x01ed, B:105:0x0242, B:106:0x0244), top: B:90:0x01e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(ArrayList arrayList) {
        lfi lfiVar;
        tr5 tr5Var;
        int i;
        w80 w80Var;
        ArrayList arrayList2;
        exq m;
        int i2;
        exq m2;
        exq exqVar;
        exq exqVar2;
        int[] iArr;
        soi soiVar;
        soi soiVar2;
        wb4 wb4Var;
        wb4 wb4Var2;
        wb4 wb4Var3;
        boolean z;
        boolean z2;
        fxq fxqVar;
        exq exqVar3;
        oq5 oq5Var = this;
        fxq fxqVar2 = oq5Var.c;
        tr5 tr5Var2 = oq5Var.b;
        wb4 wb4Var4 = oq5Var.f;
        iq5 iq5Var = oq5Var.L;
        wb4 wb4Var5 = iq5Var.b;
        try {
            iq5Var.b = wb4Var4;
            wb4Var4.a.G0(cuj.d);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Pair pair = (Pair) arrayList.get(i3);
                mfi mfiVar = (mfi) pair.a;
                mfi mfiVar2 = (mfi) pair.b;
                w80 w80Var2 = mfiVar.e;
                fxq fxqVar3 = mfiVar.d;
                int a = fxqVar3.a(w80Var2);
                bqe bqeVar = new bqe();
                iq5Var.b();
                puj pujVar = iq5Var.b.a;
                pujVar.G0(ltj.d);
                q5g.K(pujVar, 0, bqeVar, 1, w80Var2);
                if (mfiVar2 == null) {
                    if (fxqVar3.equals(oq5Var.G)) {
                        if (!oq5Var.H.w) {
                            pq5.c("Check failed");
                        }
                        oq5Var.v();
                    }
                    exq m3 = fxqVar3.m();
                    try {
                        m3.p(a);
                        iq5Var.f = a;
                        wb4 wb4Var6 = new wb4();
                        zg zgVar = new zg(oq5Var, wb4Var6, m3, mfiVar, 2);
                        exqVar3 = m3;
                        try {
                            oq5Var = this;
                            try {
                                oq5Var.F(null, null, null, c5b.a, zgVar);
                                wb4 wb4Var7 = iq5Var.b;
                                wb4Var7.getClass();
                                if (wb4Var6.a.F0()) {
                                    puj pujVar2 = wb4Var7.a;
                                    pujVar2.G0(gtj.d);
                                    q5g.K(pujVar2, 0, wb4Var6, 1, bqeVar);
                                }
                                exqVar3.c();
                                fxqVar = fxqVar2;
                                tr5Var = tr5Var2;
                                i = size;
                                i2 = i3;
                            } catch (Throwable th) {
                                th = th;
                                exqVar3.c();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        exqVar3 = m3;
                    }
                } else {
                    lfi m4 = tr5Var2.m(mfiVar2);
                    fxq fxqVar4 = m4 != null ? m4.a : mfiVar2.d;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (m4 != null) {
                                                                        fxq fxqVar5 = m4.a;
                                                                        lfiVar = m4;
                                                                        if (fxqVar5.g) {
                                                                            pq5.c("use active SlotWriter to create an anchor location instead");
                                                                        }
                                                                        if (fxqVar5.b <= 0) {
                                                                            llm.a("Parameter index is out of range");
                                                                        }
                                                                        ArrayList arrayList3 = fxqVar5.i;
                                                                        tr5Var = tr5Var2;
                                                                        int d = hxq.d(arrayList3, 0, fxqVar5.b);
                                                                        if (d < 0) {
                                                                            i = size;
                                                                            w80Var = new w80(0);
                                                                            arrayList3.add(-(d + 1), w80Var);
                                                                        } else {
                                                                            i = size;
                                                                            w80Var = (w80) arrayList3.get(d);
                                                                        }
                                                                        if (w80Var == null) {
                                                                        }
                                                                        arrayList2 = new ArrayList();
                                                                        m = fxqVar4.m();
                                                                        pq5.b(m, arrayList2, fxqVar4.a(w80Var));
                                                                        m.c();
                                                                        if (arrayList2.isEmpty()) {
                                                                            wb4 wb4Var8 = iq5Var.b;
                                                                            wb4Var8.getClass();
                                                                            if (arrayList2.isEmpty()) {
                                                                                i2 = i3;
                                                                            } else {
                                                                                puj pujVar3 = wb4Var8.a;
                                                                                pujVar3.G0(htj.d);
                                                                                i2 = i3;
                                                                                q5g.K(pujVar3, 1, arrayList2, 0, bqeVar);
                                                                            }
                                                                            if (fxqVar3.equals(fxqVar2)) {
                                                                                int a2 = fxqVar2.a(w80Var2);
                                                                                oq5Var.h0(a2, oq5Var.m0(a2) + arrayList2.size());
                                                                            }
                                                                        } else {
                                                                            i2 = i3;
                                                                        }
                                                                        puj pujVar4 = iq5Var.b.a;
                                                                        pujVar4.G0(itj.d);
                                                                        int i4 = pujVar4.f - pujVar4.a[pujVar4.b - 1].c;
                                                                        Object[] objArr = pujVar4.e;
                                                                        objArr[i4] = lfiVar;
                                                                        objArr[i4 + 1] = tr5Var;
                                                                        objArr[i4 + 3] = mfiVar;
                                                                        objArr[i4 + 2] = mfiVar2;
                                                                        m2 = fxqVar4.m();
                                                                        exqVar2 = oq5Var.F;
                                                                        iArr = oq5Var.n;
                                                                        soiVar = oq5Var.u;
                                                                        oq5Var.n = null;
                                                                        oq5Var.u = null;
                                                                        oq5Var.F = m2;
                                                                        int a3 = fxqVar4.a(w80Var);
                                                                        m2.p(a3);
                                                                        iq5Var.f = a3;
                                                                        wb4Var = new wb4();
                                                                        wb4Var2 = iq5Var.b;
                                                                        iq5Var.b = wb4Var;
                                                                        z = iq5Var.e;
                                                                        iq5Var.e = false;
                                                                        wr5 wr5Var = mfiVar2.c;
                                                                        wr5 wr5Var2 = mfiVar.c;
                                                                        Integer valueOf = Integer.valueOf(m2.g);
                                                                        List list = mfiVar2.f;
                                                                        exqVar = m2;
                                                                        wb4Var3 = wb4Var2;
                                                                        z2 = z;
                                                                        fxqVar = fxqVar2;
                                                                        soiVar2 = soiVar;
                                                                        oq5Var.F(wr5Var, wr5Var2, valueOf, list, new ha0(25, oq5Var, mfiVar));
                                                                        iq5Var.e = z2;
                                                                        iq5Var.b = wb4Var3;
                                                                        wb4Var3.getClass();
                                                                        if (wb4Var.a.F0()) {
                                                                            puj pujVar5 = wb4Var3.a;
                                                                            pujVar5.G0(gtj.d);
                                                                            q5g.K(pujVar5, 0, wb4Var, 1, bqeVar);
                                                                        }
                                                                        oq5Var.F = exqVar2;
                                                                        oq5Var.n = iArr;
                                                                        oq5Var.u = soiVar2;
                                                                        exqVar.c();
                                                                    } else {
                                                                        lfiVar = m4;
                                                                        tr5Var = tr5Var2;
                                                                        i = size;
                                                                    }
                                                                    oq5Var.F = exqVar2;
                                                                    oq5Var.n = iArr;
                                                                    oq5Var.u = soiVar2;
                                                                    exqVar.c();
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    exqVar.c();
                                                                    throw th;
                                                                }
                                                                iq5Var.b = wb4Var3;
                                                                wb4Var3.getClass();
                                                                if (wb4Var.a.F0()) {
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                oq5Var.F = exqVar2;
                                                                oq5Var.n = iArr;
                                                                oq5Var.u = soiVar2;
                                                                throw th;
                                                            }
                                                            iq5Var.e = z2;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            iq5Var.b = wb4Var3;
                                                            throw th;
                                                        }
                                                        oq5Var.F(wr5Var, wr5Var2, valueOf, list, new ha0(25, oq5Var, mfiVar));
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        iq5Var.e = z2;
                                                        throw th;
                                                    }
                                                    exqVar = m2;
                                                    wb4Var3 = wb4Var2;
                                                    z2 = z;
                                                    fxqVar = fxqVar2;
                                                    soiVar2 = soiVar;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    exqVar = m2;
                                                    wb4Var3 = wb4Var2;
                                                    z2 = z;
                                                    soiVar2 = soiVar;
                                                }
                                                wr5 wr5Var22 = mfiVar.c;
                                                Integer valueOf2 = Integer.valueOf(m2.g);
                                                List list2 = mfiVar2.f;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                exqVar = m2;
                                                wb4Var3 = wb4Var2;
                                                z2 = z;
                                                soiVar2 = soiVar;
                                            }
                                            wr5 wr5Var3 = mfiVar2.c;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            z2 = z;
                                            soiVar2 = soiVar;
                                            exqVar = m2;
                                            wb4Var3 = wb4Var2;
                                            iq5Var.e = z2;
                                            throw th;
                                        }
                                        iq5Var.e = false;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        soiVar2 = soiVar;
                                        z2 = z;
                                    }
                                    iq5Var.b = wb4Var;
                                    z = iq5Var.e;
                                } catch (Throwable th12) {
                                    th = th12;
                                    soiVar2 = soiVar;
                                    exqVar = m2;
                                    wb4Var3 = wb4Var2;
                                }
                                oq5Var.F = m2;
                                int a32 = fxqVar4.a(w80Var);
                                m2.p(a32);
                                iq5Var.f = a32;
                                wb4Var = new wb4();
                                wb4Var2 = iq5Var.b;
                            } catch (Throwable th13) {
                                th = th13;
                                soiVar2 = soiVar;
                                exqVar = m2;
                            }
                            exqVar2 = oq5Var.F;
                            iArr = oq5Var.n;
                            soiVar = oq5Var.u;
                            oq5Var.n = null;
                            oq5Var.u = null;
                        } catch (Throwable th14) {
                            th = th14;
                            exqVar = m2;
                        }
                        pq5.b(m, arrayList2, fxqVar4.a(w80Var));
                        m.c();
                        if (arrayList2.isEmpty()) {
                        }
                        puj pujVar42 = iq5Var.b.a;
                        pujVar42.G0(itj.d);
                        int i42 = pujVar42.f - pujVar42.a[pujVar42.b - 1].c;
                        Object[] objArr2 = pujVar42.e;
                        objArr2[i42] = lfiVar;
                        objArr2[i42 + 1] = tr5Var;
                        objArr2[i42 + 3] = mfiVar;
                        objArr2[i42 + 2] = mfiVar2;
                        m2 = fxqVar4.m();
                    } catch (Throwable th15) {
                        m.c();
                        throw th15;
                    }
                    w80Var = mfiVar2.e;
                    arrayList2 = new ArrayList();
                    m = fxqVar4.m();
                }
                iq5Var.b.a.G0(euj.d);
                i3 = i2 + 1;
                fxqVar2 = fxqVar;
                tr5Var2 = tr5Var;
                size = i;
            }
            iq5Var.b.a.G0(ptj.d);
            iq5Var.f = 0;
            iq5Var.b = wb4Var5;
        } catch (Throwable th16) {
            iq5Var.b = wb4Var5;
            throw th16;
        }
    }

    public final void B(jfi jfiVar, a aVar, Object obj, boolean z) {
        W(126665345, jfiVar);
        C();
        l0(obj);
        int i = this.P;
        try {
            this.P = 126665345;
            if (this.O) {
                oxq.x(this.H);
            }
            boolean z2 = (this.O || Intrinsics.d(this.F.f(), aVar)) ? false : true;
            if (z2) {
                I(aVar);
            }
            T(202, pq5.c, aVar, 0);
            this.J = null;
            if (!this.O || z) {
                boolean z3 = this.v;
                this.v = z2;
                fxf.D(this, new wn5(new s30(14, jfiVar, obj), 316014703, true));
                this.v = z3;
            } else {
                this.I = true;
                oxq oxqVar = this.H;
                this.b.j(new mfi(jfiVar, obj, this.g, this.G, oxqVar.b(oxqVar.E(oxqVar.b, oxqVar.v)), c5b.a, l(), null));
            }
            p(false);
            this.J = null;
            this.P = i;
            p(false);
        } catch (Throwable th) {
            p(false);
            this.J = null;
            this.P = i;
            p(false);
            throw th;
        }
    }

    public final Object C() {
        boolean z = this.O;
        kjn kjnVar = gq5.a;
        if (!z) {
            Object k = this.F.k();
            if (!this.x || (k instanceof lq5)) {
                return k;
            }
        } else if (this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected");
            return kjnVar;
        }
        return kjnVar;
    }

    public final int D(int i) {
        int o = this.F.o(i) + 1;
        int i2 = 0;
        while (o < i) {
            if (!this.F.i(o)) {
                i2++;
            }
            o += this.F.b[(o * 5) + 3];
        }
        return i2;
    }

    public final boolean E(tpi tpiVar) {
        puj pujVar = this.e.a;
        if (!pujVar.E0()) {
            pq5.c("Expected applyChanges() to have been called");
        }
        if (tpiVar.e <= 0 && this.r.isEmpty()) {
            return false;
        }
        n(tpiVar, null);
        return pujVar.F0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(wr5 wr5Var, wr5 wr5Var2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z = this.E;
        int i = this.j;
        try {
            this.E = true;
            this.j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                xmn xmnVar = (xmn) pair.a;
                Object obj = pair.b;
                if (obj != null) {
                    f0(xmnVar, obj);
                } else {
                    f0(xmnVar, null);
                }
            }
            if (wr5Var != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (wr5Var2 == null || wr5Var2.equals(wr5Var) || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    wr5Var.p = wr5Var2;
                    wr5Var.q = intValue;
                    try {
                        invoke = function0.invoke();
                        wr5Var.p = null;
                        wr5Var.q = 0;
                    } catch (Throwable th) {
                        wr5Var.p = null;
                        wr5Var.q = 0;
                        throw th;
                    }
                }
            }
            invoke = function0.invoke();
            this.E = z;
            this.j = i;
            return invoke;
        } catch (Throwable th2) {
            this.E = z;
            this.j = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        fye fyeVar;
        ehv ehvVar;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        xmn xmnVar;
        boolean z;
        long[] jArr;
        long[] jArr2;
        long j;
        int i5;
        boolean z2;
        cpi cpiVar;
        ArrayList arrayList2;
        int g;
        xmn xmnVar2;
        boolean z3;
        Function2 function2;
        Unit unit;
        int rotateLeft;
        int hashCode;
        Object b;
        ehv ehvVar2 = ehv.h;
        boolean z4 = this.E;
        boolean z5 = true;
        this.E = true;
        exq exqVar = this.F;
        int i6 = exqVar.i;
        int i7 = (i6 * 5) + 3;
        int i8 = exqVar.b[i7] + i6;
        int i9 = this.j;
        int i10 = this.P;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = exqVar.g;
        ArrayList arrayList3 = this.r;
        int g2 = pq5.g(arrayList3, i13);
        if (g2 < 0) {
            g2 = -(g2 + 1);
        }
        if (g2 < arrayList3.size()) {
            fyeVar = (fye) arrayList3.get(g2);
        }
        fyeVar = null;
        boolean z6 = false;
        int i14 = i6;
        while (fyeVar != null) {
            xmn xmnVar3 = fyeVar.a;
            boolean z7 = z5;
            int i15 = fyeVar.b;
            int g3 = pq5.g(arrayList3, i15);
            if (g3 >= 0) {
            }
            Object obj = fyeVar.c;
            if (obj == null) {
                xmnVar3.getClass();
                ehvVar = ehvVar2;
                i = i7;
            } else {
                int i16 = 8;
                tpi tpiVar = xmnVar3.g;
                if (tpiVar == null) {
                    ehvVar = ehvVar2;
                    i = i7;
                } else {
                    ehvVar = ehvVar2;
                    if (obj instanceof zx7) {
                        zx7 zx7Var = (zx7) obj;
                        n2r n2rVar = zx7Var.c;
                        if (n2rVar == null) {
                            n2rVar = ehvVar;
                        }
                        i = i7;
                        z = !n2rVar.J(zx7Var.i().f, tpiVar.g(zx7Var));
                        i2 = i9;
                        i3 = i11;
                        i4 = i12;
                        arrayList = arrayList3;
                        xmnVar = xmnVar3;
                    } else {
                        i = i7;
                        if (obj instanceof upi) {
                            upi upiVar = (upi) obj;
                            if (upiVar.i()) {
                                Object[] objArr = upiVar.b;
                                long[] jArr3 = upiVar.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    i3 = i11;
                                    i4 = i12;
                                    int i17 = 0;
                                    while (true) {
                                        long j2 = jArr3[i17];
                                        arrayList = arrayList3;
                                        xmnVar = xmnVar3;
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j2 & 255) < 128) {
                                                    jArr2 = jArr3;
                                                    Object obj2 = objArr[(i17 << 3) + i19];
                                                    i2 = i9;
                                                    if (!(obj2 instanceof zx7)) {
                                                        break;
                                                    }
                                                    zx7 zx7Var2 = (zx7) obj2;
                                                    n2r n2rVar2 = zx7Var2.c;
                                                    if (n2rVar2 == null) {
                                                        n2rVar2 = ehvVar;
                                                    }
                                                    j = j2;
                                                    if (!n2rVar2.J(zx7Var2.i().f, tpiVar.g(zx7Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr3;
                                                    i2 = i9;
                                                    j = j2;
                                                }
                                                j2 = j >> i16;
                                                i19++;
                                                i9 = i2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            i2 = i9;
                                            if (i18 != i16) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            i2 = i9;
                                        }
                                        if (i17 == length) {
                                            break;
                                        }
                                        i17++;
                                        arrayList3 = arrayList;
                                        xmnVar3 = xmnVar;
                                        i9 = i2;
                                        jArr3 = jArr;
                                        i16 = 8;
                                    }
                                    z = z7 ? 1 : 0;
                                }
                            }
                            i2 = i9;
                            i3 = i11;
                            i4 = i12;
                            arrayList = arrayList3;
                            xmnVar = xmnVar3;
                            z = false;
                        }
                    }
                    if (z) {
                        xmn xmnVar4 = xmnVar;
                        ArrayList arrayList4 = this.D;
                        arrayList4.add(xmnVar4);
                        ymn ymnVar = xmnVar4.b;
                        if (ymnVar == null || (cpiVar = xmnVar4.f) == null) {
                            i5 = i6;
                        } else {
                            xmnVar4.d(true);
                            try {
                                Object[] objArr2 = cpiVar.b;
                                int[] iArr = cpiVar.c;
                                long[] jArr4 = cpiVar.a;
                                int length2 = jArr4.length - 2;
                                i5 = i6;
                                if (length2 >= 0) {
                                    int i20 = 0;
                                    while (true) {
                                        long j3 = jArr4[i20];
                                        Object[] objArr3 = objArr2;
                                        int[] iArr2 = iArr;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                            long j4 = j3;
                                            for (int i22 = 0; i22 < i21; i22++) {
                                                if ((j4 & 255) < 128) {
                                                    int i23 = (i20 << 3) + i22;
                                                    Object obj3 = objArr3[i23];
                                                    int i24 = iArr2[i23];
                                                    ymnVar.f(obj3);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i21 != 8) {
                                                break;
                                            }
                                        }
                                        if (i20 == length2) {
                                            break;
                                        }
                                        i20++;
                                        objArr2 = objArr3;
                                        iArr = iArr2;
                                    }
                                }
                                xmnVar4.d(false);
                            } catch (Throwable th) {
                                xmnVar4.d(false);
                                throw th;
                            }
                        }
                        z2 = true;
                        arrayList4.remove(arrayList4.size() - 1);
                    } else {
                        this.F.p(i15);
                        int i25 = this.F.g;
                        J(i14, i25, i6);
                        int o = this.F.o(i25);
                        while (o != i6 && !this.F.j(o)) {
                            o = this.F.o(o);
                        }
                        int i26 = this.F.j(o) ? 0 : i2;
                        if (o != i25) {
                            int m0 = (m0(o) - this.F.m(i25)) + i26;
                            while (i26 < m0 && o != i15) {
                                o++;
                                while (o < i15) {
                                    exq exqVar2 = this.F;
                                    int i27 = exqVar2.b[(o * 5) + 3] + o;
                                    if (i15 >= i27) {
                                        i26 += exqVar2.j(o) ? z7 ? 1 : 0 : m0(o);
                                        o = i27;
                                    }
                                }
                                break;
                            }
                        }
                        this.j = i26;
                        this.l = D(i25);
                        int o2 = this.F.o(i25);
                        int i28 = 3;
                        int i29 = 0;
                        int i30 = 0;
                        while (o2 >= 0) {
                            if (o2 == i6) {
                                rotateLeft = Integer.rotateLeft(i10, i30);
                            } else {
                                exq exqVar3 = this.F;
                                boolean i31 = exqVar3.i(o2);
                                int[] iArr3 = exqVar3.b;
                                if (i31) {
                                    Object n = exqVar3.n(iArr3, o2);
                                    hashCode = n != null ? n instanceof Enum ? ((Enum) n).ordinal() : n instanceof jfi ? 126665345 : n.hashCode() : 0;
                                } else {
                                    int i32 = iArr3[o2 * 5];
                                    hashCode = (i32 != 207 || (b = exqVar3.b(iArr3, o2)) == null || b.equals(gq5.a)) ? i32 : b.hashCode();
                                }
                                if (hashCode == 126665345) {
                                    rotateLeft = Integer.rotateLeft(hashCode, i30);
                                } else {
                                    i29 = (i29 ^ Integer.rotateLeft(hashCode, i28)) ^ Integer.rotateLeft(this.F.i(o2) ? 0 : D(o2), i30);
                                    i28 = (i28 + 6) % 32;
                                    i30 = (i30 + 6) % 32;
                                    o2 = this.F.o(o2);
                                }
                            }
                            i29 ^= rotateLeft;
                            break;
                        }
                        this.P = i29;
                        this.J = null;
                        if (this.x) {
                            xmnVar2 = xmnVar;
                        } else {
                            xmnVar2 = xmnVar;
                            if ((xmnVar2.a & 128) != 0 ? z7 ? 1 : 0 : false) {
                                z3 = z7 ? 1 : 0;
                                if (z3) {
                                    this.x = z7;
                                }
                                function2 = xmnVar2.d;
                                if (function2 == null) {
                                    function2.invoke(this, Integer.valueOf(z7 ? 1 : 0));
                                    unit = Unit.a;
                                } else {
                                    unit = null;
                                }
                                if (unit != null) {
                                    xq0.q("Invalid restart scope");
                                    return;
                                }
                                if (z3) {
                                    this.x = false;
                                }
                                this.J = null;
                                exq exqVar4 = this.F;
                                int i33 = exqVar4.b[i] + i6;
                                int i34 = exqVar4.g;
                                if (!(i34 >= i6 && i34 <= i33)) {
                                    pq5.c("Index " + i6 + " is not a parent of " + i34);
                                }
                                exqVar4.i = i6;
                                exqVar4.h = i33;
                                exqVar4.l = 0;
                                exqVar4.m = 0;
                                i14 = i25;
                                i5 = i6;
                                z6 = true;
                                z2 = true;
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                        function2 = xmnVar2.d;
                        if (function2 == null) {
                        }
                        if (unit != null) {
                        }
                    }
                    arrayList2 = arrayList;
                    g = pq5.g(arrayList2, this.F.g);
                    if (g < 0) {
                        g = -(g + 1);
                    }
                    if (g < arrayList2.size()) {
                        fye fyeVar2 = (fye) arrayList2.get(g);
                        if (fyeVar2.b < i8) {
                            fyeVar = fyeVar2;
                            arrayList3 = arrayList2;
                            i6 = i5;
                            z5 = z2;
                            ehvVar2 = ehvVar;
                            i7 = i;
                            i11 = i3;
                            i12 = i4;
                            i9 = i2;
                        }
                    }
                    fyeVar = null;
                    arrayList3 = arrayList2;
                    i6 = i5;
                    z5 = z2;
                    ehvVar2 = ehvVar;
                    i7 = i;
                    i11 = i3;
                    i12 = i4;
                    i9 = i2;
                }
            }
            i2 = i9;
            i3 = i11;
            i4 = i12;
            arrayList = arrayList3;
            xmnVar = xmnVar3;
            z = z7 ? 1 : 0;
            if (z) {
            }
            arrayList2 = arrayList;
            g = pq5.g(arrayList2, this.F.g);
            if (g < 0) {
            }
            if (g < arrayList2.size()) {
            }
            fyeVar = null;
            arrayList3 = arrayList2;
            i6 = i5;
            z5 = z2;
            ehvVar2 = ehvVar;
            i7 = i;
            i11 = i3;
            i12 = i4;
            i9 = i2;
        }
        int i35 = i6;
        int i36 = i9;
        int i37 = i11;
        int i38 = i12;
        if (z6) {
            J(i14, i35, i35);
            this.F.r();
            int m02 = m0(i35);
            this.j = i36 + m02;
            this.k = i37 + m02;
            this.l = i38;
        } else {
            R();
        }
        this.P = i10;
        this.E = z4;
    }

    public final void H() {
        L(this.F.g);
        iq5 iq5Var = this.L;
        iq5Var.d(false);
        iq5Var.e();
        iq5Var.b.a.G0(auj.d);
        int i = iq5Var.f;
        exq exqVar = iq5Var.a.F;
        iq5Var.f = exqVar.b[(exqVar.g * 5) + 3] + i;
    }

    public final void I(a aVar) {
        soi soiVar = this.u;
        if (soiVar == null) {
            soiVar = new soi();
            this.u = soiVar;
        }
        soiVar.h(this.F.g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i, int i2, int i3) {
        exq exqVar = this.F;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (exqVar.o(i) == i2) {
                    i3 = i2;
                } else if (exqVar.o(i2) != i) {
                    if (exqVar.o(i) == exqVar.o(i2)) {
                        i3 = exqVar.o(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = exqVar.o(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = exqVar.o(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = exqVar.o(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = exqVar.o(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = exqVar.o(i14)) {
                            i3 = exqVar.o(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!exqVar.j(i)) {
                    this.L.a();
                }
                i = exqVar.o(i);
            }
            o(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!exqVar.j(i)) {
            }
            i = exqVar.o(i);
        }
        o(i2, i3);
    }

    public final Object K() {
        boolean z = this.O;
        kjn kjnVar = gq5.a;
        if (!z) {
            Object k = this.F.k();
            if (!this.x || (k instanceof lq5)) {
                return k instanceof fun ? ((fun) k).a : k;
            }
        } else if (this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected");
            return kjnVar;
        }
        return kjnVar;
    }

    public final void L(int i) {
        boolean j = this.F.j(i);
        iq5 iq5Var = this.L;
        if (j) {
            iq5Var.c();
            Object l = this.F.l(i);
            iq5Var.c();
            iq5Var.h.add(l);
        }
        O(this, i, i, j, 0);
        iq5Var.c();
        if (j) {
            iq5Var.a();
        }
    }

    public final boolean P(int i, boolean z) {
        return ((i & 1) == 0 && (this.O || this.x)) || z || !z();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int rotateLeft;
        if (this.r.isEmpty()) {
            this.k = this.F.q() + this.k;
            return;
        }
        exq exqVar = this.F;
        int g = exqVar.g();
        int[] iArr = exqVar.b;
        int i = exqVar.g;
        Object n = i < exqVar.h ? exqVar.n(iArr, i) : null;
        Object f = exqVar.f();
        int i2 = this.l;
        kjn kjnVar = gq5.a;
        if (n != null) {
            rotateLeft = Integer.rotateLeft((n instanceof Enum ? ((Enum) n).ordinal() : n.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        } else {
            if (f != null && g == 207 && !f.equals(kjnVar)) {
                this.P = Integer.rotateLeft(f.hashCode() ^ Integer.rotateLeft(this.P, 3), 3) ^ i2;
                Y(null, (iArr[(exqVar.g * 5) + 1] & 1073741824) != 0);
                G();
                exqVar.e();
                if (n == null) {
                    if (n instanceof Enum) {
                        this.P = Integer.rotateRight(Integer.hashCode(((Enum) n).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    } else {
                        this.P = Integer.rotateRight(Integer.hashCode(n.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(kjnVar)) {
                    this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i2, 3) ^ Integer.hashCode(g), 3);
                    return;
                } else {
                    this.P = Integer.rotateRight(Integer.hashCode(f.hashCode()) ^ Integer.rotateRight(this.P ^ i2, 3), 3);
                    return;
                }
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ g, 3) ^ i2;
        }
        this.P = rotateLeft;
        Y(null, (iArr[(exqVar.g * 5) + 1] & 1073741824) != 0);
        G();
        exqVar.e();
        if (n == null) {
        }
    }

    public final void R() {
        exq exqVar = this.F;
        int i = exqVar.i;
        this.k = i >= 0 ? exqVar.b[(i * 5) + 1] & 67108863 : 0;
        exqVar.r();
    }

    public final void S() {
        if (this.k != 0) {
            pq5.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.O) {
            return;
        }
        xmn x = x();
        if (x != null) {
            int i = x.a;
            if ((i & 128) == 0) {
                x.a = i | 16;
            }
        }
        if (this.r.isEmpty()) {
            R();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, Object obj, Object obj2, int i2) {
        int rotateLeft;
        boolean z;
        wjk wjkVar;
        wjk wjkVar2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Object obj3 = obj;
        if (this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i8 = this.l;
        Object obj4 = gq5.a;
        if (obj3 != null) {
            rotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.P = i8 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.P, 3), 3);
                if (obj3 == null) {
                    this.l++;
                }
                boolean z3 = i2 == 0;
                if (!this.O) {
                    this.F.k++;
                    oxq oxqVar = this.H;
                    int i9 = oxqVar.t;
                    if (z3) {
                        oxqVar.Q(obj4, obj4, true, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        oxqVar.Q(obj3, obj2, false, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        oxqVar.Q(obj3, obj4, false, i);
                    }
                    wjk wjkVar3 = this.i;
                    if (wjkVar3 != null) {
                        int i10 = (-2) - i9;
                        vaf vafVar = new vaf(i, i10, -1, -1);
                        wjkVar3.e.h(i10, new oqd(-1, this.j - wjkVar3.b, 0));
                        wjkVar3.d.add(vafVar);
                    }
                    u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.x;
                if (this.i == null) {
                    int g = this.F.g();
                    if (!z4 && g == i) {
                        exq exqVar = this.F;
                        int i11 = exqVar.g;
                        if (Intrinsics.d(obj3, i11 < exqVar.h ? exqVar.n(exqVar.b, i11) : null)) {
                            Y(obj2, z3);
                        }
                    }
                    exq exqVar2 = this.F;
                    int[] iArr = exqVar2.b;
                    ArrayList arrayList = new ArrayList();
                    if (exqVar2.k <= 0) {
                        int i12 = exqVar2.g;
                        while (i12 < exqVar2.h) {
                            int i13 = i12 * 5;
                            int i14 = iArr[i13];
                            Object n = exqVar2.n(iArr, i12);
                            int i15 = iArr[i13 + 1];
                            if ((i15 & 1073741824) != 0) {
                                z2 = z4;
                                i7 = 1;
                            } else {
                                z2 = z4;
                                i7 = i15 & 67108863;
                            }
                            arrayList.add(new vaf(i14, i12, n, i7));
                            i12 += iArr[i13 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.i = new wjk(arrayList, this.j);
                    wjkVar = this.i;
                    if (wjkVar != null) {
                        ArrayList arrayList2 = wjkVar.d;
                        soi soiVar = wjkVar.e;
                        int i16 = wjkVar.b;
                        Object n3fVar = obj3 != null ? new n3f(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        tpi tpiVar = ((sgi) wjkVar.f.getValue()).a;
                        Object g2 = tpiVar.g(n3fVar);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof gpi) {
                            gpi gpiVar = (gpi) g2;
                            Object i17 = gpiVar.i(0);
                            if (gpiVar.g()) {
                                tpiVar.k(n3fVar);
                            }
                            if (gpiVar.b == 1) {
                                tpiVar.m(n3fVar, gpiVar.d());
                            }
                            g2 = i17;
                        } else {
                            tpiVar.k(n3fVar);
                        }
                        vaf vafVar2 = (vaf) g2;
                        if (z || vafVar2 == null) {
                            this.F.k++;
                            this.O = true;
                            this.J = null;
                            if (this.H.w) {
                                oxq o = this.G.o();
                                this.H = o;
                                o.L();
                                this.I = false;
                                this.J = null;
                            }
                            this.H.d();
                            oxq oxqVar2 = this.H;
                            int i18 = oxqVar2.t;
                            if (z3) {
                                oxqVar2.Q(obj4, obj4, true, i);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                oxqVar2.Q(obj4, obj2, false, i);
                            } else {
                                i3 = 0;
                                oxqVar2.Q(obj == null ? obj4 : obj, obj4, false, i);
                            }
                            this.M = this.H.b(i18);
                            int i19 = (-2) - i18;
                            vaf vafVar3 = new vaf(i, i19, -1, -1);
                            soiVar.h(i19, new oqd(-1, this.j - i16, i3));
                            arrayList2.add(vafVar3);
                            wjkVar2 = new wjk(new ArrayList(), z3 ? i3 : this.j);
                            u(z3, wjkVar2);
                            return;
                        }
                        int i20 = vafVar2.c;
                        arrayList2.add(vafVar2);
                        oqd oqdVar = (oqd) soiVar.b(i20);
                        this.j = (oqdVar != null ? oqdVar.b : -1) + i16;
                        oqd oqdVar2 = (oqd) soiVar.b(i20);
                        int i21 = oqdVar2 != null ? oqdVar2.a : -1;
                        int i22 = wjkVar.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = soiVar.c;
                            long[] jArr = soiVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i6 = i24;
                                                oqd oqdVar3 = (oqd) objArr3[(i25 << 3) + i27];
                                                i5 = i23;
                                                int i28 = oqdVar3.a;
                                                if (i28 == i21) {
                                                    oqdVar3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    oqdVar3.a = i28 + 1;
                                                }
                                            } else {
                                                i5 = i23;
                                                i6 = i24;
                                            }
                                            j >>= i6;
                                            i27++;
                                            i24 = i6;
                                            i23 = i5;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = soiVar.c;
                                long[] jArr2 = soiVar.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) < 128) {
                                                    oqd oqdVar4 = (oqd) objArr4[(i29 << 3) + i31];
                                                    int i32 = oqdVar4.a;
                                                    if (i32 == i21) {
                                                        oqdVar4.a = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            oqdVar4.a = i32 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        iq5 iq5Var = this.L;
                        iq5Var.f = (i20 - iq5Var.a.F.g) + iq5Var.f;
                        this.F.p(i20);
                        if (i4 > 0) {
                            iq5Var.d(false);
                            iq5Var.e();
                            puj pujVar = iq5Var.b.a;
                            pujVar.G0(wtj.d);
                            pujVar.c[pujVar.d - pujVar.a[pujVar.b - 1].b] = i4;
                        }
                        Y(obj2, z3);
                    }
                    wjkVar2 = null;
                    u(z3, wjkVar2);
                    return;
                }
                z = z4;
                wjkVar = this.i;
                if (wjkVar != null) {
                }
                wjkVar2 = null;
                u(z3, wjkVar2);
                return;
            }
            rotateLeft = i8 ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i, 3);
        }
        this.P = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.O) {
        }
    }

    public final void U() {
        T(-127, null, null, 0);
    }

    public final void V(int i, csj csjVar) {
        T(i, csjVar, null, 0);
    }

    public final void W(int i, Object obj) {
        T(i, obj, null, 0);
    }

    public final void X() {
        T(125, null, null, 1);
        this.q = true;
    }

    public final void Y(Object obj, boolean z) {
        if (z) {
            exq exqVar = this.F;
            if (exqVar.k <= 0) {
                if ((exqVar.b[(exqVar.g * 5) + 1] & 1073741824) == 0) {
                    llm.a("Expected a node group");
                }
                exqVar.s();
                return;
            }
            return;
        }
        if (obj != null && this.F.f() != obj) {
            iq5 iq5Var = this.L;
            iq5Var.getClass();
            iq5Var.d(false);
            puj pujVar = iq5Var.b.a;
            pujVar.G0(juj.d);
            q5g.J(pujVar, 0, obj);
        }
        this.F.s();
    }

    public final void Z(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            T(i, null, null, 0);
            return;
        }
        if (this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.P = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i, 3);
        this.l++;
        exq exqVar = this.F;
        boolean z = this.O;
        kjn kjnVar = gq5.a;
        if (z) {
            exqVar.k++;
            this.H.Q(kjnVar, kjnVar, false, i);
            u(false, null);
            return;
        }
        if (exqVar.g() == i && ((i3 = exqVar.g) >= exqVar.h || (exqVar.b[(i3 * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0)) {
            exqVar.s();
            u(false, null);
            return;
        }
        if (exqVar.k <= 0 && (i2 = exqVar.g) != exqVar.h) {
            int i4 = this.j;
            H();
            this.L.f(i4, exqVar.q());
            pq5.a(i2, exqVar.g, this.r);
        }
        exqVar.k++;
        this.O = true;
        this.J = null;
        if (this.H.w) {
            oxq o = this.G.o();
            this.H = o;
            o.L();
            this.I = false;
            this.J = null;
        }
        oxq oxqVar = this.H;
        oxqVar.d();
        int i5 = oxqVar.t;
        oxqVar.Q(kjnVar, kjnVar, false, i);
        this.M = oxqVar.b(i5);
        u(false, null);
    }

    public final void a() {
        i();
        this.h.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        ngc ngcVar = this.N;
        ngcVar.b.C0();
        ngcVar.a.C0();
        this.P = 0;
        this.z = 0;
        this.q = false;
        this.O = false;
        this.x = false;
        this.E = false;
        this.y = -1;
        exq exqVar = this.F;
        if (!exqVar.f) {
            exqVar.c();
        }
        if (this.H.w) {
            return;
        }
        v();
    }

    public final void a0(int i) {
        T(i, null, null, 0);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.O) {
            puj pujVar = this.N.a;
            pujVar.G0(kuj.d);
            q5g.J(pujVar, 0, obj);
            function2.getClass();
            wct.o(2, function2);
            q5g.J(pujVar, 1, function2);
            return;
        }
        iq5 iq5Var = this.L;
        iq5Var.b();
        puj pujVar2 = iq5Var.b.a;
        pujVar2.G0(kuj.d);
        function2.getClass();
        wct.o(2, function2);
        q5g.K(pujVar2, 0, obj, 1, function2);
    }

    public final oq5 b0(int i) {
        xmn xmnVar;
        Z(i);
        boolean z = this.O;
        ArrayList arrayList = this.D;
        wr5 wr5Var = this.g;
        if (z) {
            xmn xmnVar2 = new xmn(wr5Var);
            arrayList.add(xmnVar2);
            l0(xmnVar2);
            xmnVar2.e = this.A;
            xmnVar2.a &= -17;
            return this;
        }
        int i2 = this.F.i;
        ArrayList arrayList2 = this.r;
        int g = pq5.g(arrayList2, i2);
        fye fyeVar = g >= 0 ? (fye) arrayList2.remove(g) : null;
        Object k = this.F.k();
        if (Intrinsics.d(k, gq5.a)) {
            xmnVar = new xmn(wr5Var);
            l0(xmnVar);
        } else {
            k.getClass();
            xmnVar = (xmn) k;
        }
        boolean z2 = true;
        if (fyeVar == null) {
            int i3 = xmnVar.a;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                xmnVar.a = i3 & (-65);
            }
            if (!z3) {
                z2 = false;
            }
        }
        int i4 = xmnVar.a;
        if (z2) {
            xmnVar.a = i4 | 8;
        } else {
            xmnVar.a = i4 & (-9);
        }
        arrayList.add(xmnVar);
        xmnVar.e = this.A;
        int i5 = xmnVar.a;
        xmnVar.a = i5 & (-17);
        if ((i5 & 256) != 0) {
            xmnVar.a = (i5 & (-273)) | RemoteCameraConfig.Mic.BUFFER_SIZE;
            puj pujVar = this.L.b.a;
            pujVar.G0(fuj.d);
            q5g.J(pujVar, 0, xmnVar);
        }
        return this;
    }

    public final boolean c(float f) {
        Object C = C();
        if ((C instanceof Float) && f == ((Number) C).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f));
        return true;
    }

    public final void c0(Object obj) {
        if (!this.O && this.F.g() == 207 && !Intrinsics.d(this.F.f(), obj) && this.y < 0) {
            this.y = this.F.g;
            this.x = true;
        }
        T(207, null, obj, 0);
    }

    public final boolean d(int i) {
        Object C = C();
        if ((C instanceof Integer) && i == ((Number) C).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i));
        return true;
    }

    public final void d0() {
        T(125, null, null, 2);
        this.q = true;
    }

    public final boolean e(long j) {
        Object C = C();
        if ((C instanceof Long) && j == ((Number) C).longValue()) {
            return false;
        }
        l0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        this.l = 0;
        this.F = this.c.m();
        T(100, null, null, 0);
        tr5 tr5Var = this.b;
        tr5Var.q();
        this.t = tr5Var.g();
        this.w.d(this.v ? 1 : 0);
        this.v = f(this.t);
        this.J = null;
        if (!this.p) {
            this.p = tr5Var.e();
        }
        if (!this.B) {
            this.B = tr5Var.f();
        }
        Set set = (Set) weo.L(this.t, loe.a);
        if (set != null) {
            vr5 vr5Var = this.Q;
            if (vr5Var == null) {
                vr5Var = new vr5(this.g);
                this.Q = vr5Var;
            }
            set.add(vr5Var);
            tr5Var.n(set);
        }
        T(tr5Var.h(), null, null, 0);
    }

    public final boolean f(Object obj) {
        if (Intrinsics.d(C(), obj)) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final boolean f0(xmn xmnVar, Object obj) {
        w80 w80Var = xmnVar.c;
        if (w80Var == null) {
            return false;
        }
        int a = this.F.a.a(w80Var);
        if (!this.E || a < this.F.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int g = pq5.g(arrayList, a);
        if (g < 0) {
            int i = -(g + 1);
            if (!(obj instanceof zx7)) {
                obj = null;
            }
            arrayList.add(i, new fye(xmnVar, a, obj));
            return true;
        }
        fye fyeVar = (fye) arrayList.get(g);
        if (!(obj instanceof zx7)) {
            fyeVar.c = null;
            return true;
        }
        Object obj2 = fyeVar.c;
        if (obj2 == null) {
            fyeVar.c = obj;
            return true;
        }
        if (obj2 instanceof upi) {
            ((upi) obj2).a(obj);
            return true;
        }
        int i2 = xso.a;
        upi upiVar = new upi(2);
        upiVar.l(obj2);
        upiVar.l(obj);
        fyeVar.c = upiVar;
        return true;
    }

    public final boolean g(boolean z) {
        Object C = C();
        if ((C instanceof Boolean) && z == ((Boolean) C).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(tpi tpiVar) {
        Object[] objArr = tpiVar.b;
        Object[] objArr2 = tpiVar.c;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.r;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            obj.getClass();
                            xmn xmnVar = (xmn) obj;
                            w80 w80Var = xmnVar.c;
                            if (w80Var != null) {
                                int i5 = w80Var.a;
                                if (obj2 == ehv.g) {
                                    obj2 = null;
                                }
                                arrayList.add(new fye(xmnVar, i5, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        y75.s(arrayList, pq5.f);
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final void h0(int i, int i2) {
        if (m0(i) != i2) {
            if (i < 0) {
                qoi qoiVar = this.o;
                if (qoiVar == null) {
                    qoiVar = new qoi();
                    this.o = qoiVar;
                }
                qoiVar.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.F.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void i() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.P = 0;
        this.q = false;
        iq5 iq5Var = this.L;
        iq5Var.c = false;
        iq5Var.d.b = 0;
        iq5Var.f = 0;
        this.D.clear();
        this.n = null;
        this.o = null;
    }

    public final void i0(int i, int i2) {
        int m0 = m0(i);
        if (m0 != i2) {
            int i3 = i2 - m0;
            ArrayList arrayList = this.h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int m02 = m0(i) + i3;
                h0(i, m02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        wjk wjkVar = (wjk) arrayList.get(i4);
                        if (wjkVar != null && wjkVar.a(i, m02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                exq exqVar = this.F;
                if (i < 0) {
                    i = exqVar.i;
                } else if (exqVar.j(i)) {
                    return;
                } else {
                    i = this.F.o(i);
                }
            }
        }
    }

    public final Object j(ozm ozmVar) {
        return weo.L(l(), ozmVar);
    }

    public final a j0(a aVar, a aVar2) {
        aVar.getClass();
        qlk qlkVar = new qlk(aVar);
        qlkVar.g = aVar;
        qlkVar.putAll(aVar2);
        a d = qlkVar.d();
        V(204, pq5.d);
        C();
        l0(d);
        C();
        l0(aVar2);
        p(false);
        return d;
    }

    public final void k(Function0 function0) {
        if (!this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (!this.O) {
            pq5.c("createNode() can only be called when inserting");
        }
        iqe iqeVar = this.m;
        int i = iqeVar.a[iqeVar.b - 1];
        oxq oxqVar = this.H;
        w80 b = oxqVar.b(oxqVar.v);
        this.k++;
        ngc ngcVar = this.N;
        puj pujVar = ngcVar.a;
        pujVar.G0(ttj.e);
        q5g.J(pujVar, 0, function0);
        pujVar.c[pujVar.d - pujVar.a[pujVar.b - 1].b] = i;
        q5g.J(pujVar, 1, b);
        puj pujVar2 = ngcVar.b;
        pujVar2.G0(ttj.f);
        pujVar2.c[pujVar2.d - pujVar2.a[pujVar2.b - 1].b] = i;
        q5g.J(pujVar2, 0, b);
    }

    public final void k0(Object obj) {
        int i;
        exq exqVar;
        int i2;
        oxq oxqVar;
        if (obj instanceof eun) {
            eun eunVar = (eun) obj;
            w80 w80Var = null;
            if (this.O) {
                oxq oxqVar2 = this.H;
                int i3 = oxqVar2.t;
                if (i3 > oxqVar2.v + 1) {
                    int i4 = i3 - 1;
                    int E = oxqVar2.E(oxqVar2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = E;
                        oxqVar = this.H;
                        if (i4 == oxqVar.v || i4 < 0) {
                            break;
                        } else {
                            E = oxqVar.E(oxqVar.b, i4);
                        }
                    }
                    w80Var = oxqVar.b(i2);
                }
            } else {
                exq exqVar2 = this.F;
                int i5 = exqVar2.g;
                if (i5 > exqVar2.i + 1) {
                    int i6 = i5 - 1;
                    int o = exqVar2.o(i6);
                    while (true) {
                        i = i6;
                        i6 = o;
                        exqVar = this.F;
                        if (i6 == exqVar.i || i6 < 0) {
                            break;
                        } else {
                            o = exqVar.o(i6);
                        }
                    }
                    w80Var = exqVar.a(i);
                }
            }
            fun funVar = new fun(eunVar, w80Var);
            if (this.O) {
                puj pujVar = this.L.b.a;
                pujVar.G0(ztj.d);
                q5g.J(pujVar, 0, funVar);
            }
            this.d.add(obj);
            obj = funVar;
        }
        l0(obj);
    }

    public final a l() {
        a aVar = this.J;
        return aVar != null ? aVar : m(this.F.i);
    }

    public final void l0(Object obj) {
        if (this.O) {
            this.H.S(obj);
            return;
        }
        exq exqVar = this.F;
        boolean z = exqVar.n;
        iq5 iq5Var = this.L;
        if (!z) {
            w80 a = exqVar.a(exqVar.i);
            puj pujVar = iq5Var.b.a;
            pujVar.G0(ftj.d);
            q5g.K(pujVar, 0, a, 1, obj);
            return;
        }
        int b = (exqVar.l - hxq.b(exqVar.b, exqVar.i)) - 1;
        if (iq5Var.a.F.i - iq5Var.f >= 0) {
            iq5Var.d(true);
            puj pujVar2 = iq5Var.b.a;
            pujVar2.G0(ttj.h);
            q5g.J(pujVar2, 0, obj);
            pujVar2.c[pujVar2.d - pujVar2.a[pujVar2.b - 1].b] = b;
            return;
        }
        exq exqVar2 = this.F;
        w80 a2 = exqVar2.a(exqVar2.i);
        puj pujVar3 = iq5Var.b.a;
        pujVar3.G0(ttj.g);
        q5g.K(pujVar3, 0, obj, 1, a2);
        pujVar3.c[pujVar3.d - pujVar3.a[pujVar3.b - 1].b] = b;
    }

    public final a m(int i) {
        a aVar;
        boolean z = this.O;
        csj csjVar = pq5.c;
        if (z && this.I) {
            int i2 = this.H.v;
            while (i2 > 0) {
                oxq oxqVar = this.H;
                if (oxqVar.b[oxqVar.q(i2) * 5] == 202 && Intrinsics.d(this.H.r(i2), csjVar)) {
                    Object p = this.H.p(i2);
                    p.getClass();
                    a aVar2 = (a) p;
                    this.J = aVar2;
                    return aVar2;
                }
                oxq oxqVar2 = this.H;
                i2 = oxqVar2.E(oxqVar2.b, i2);
            }
        }
        if (this.F.c > 0) {
            while (i > 0) {
                exq exqVar = this.F;
                int[] iArr = exqVar.b;
                if (iArr[i * 5] == 202 && Intrinsics.d(exqVar.n(iArr, i), csjVar)) {
                    soi soiVar = this.u;
                    if (soiVar == null || (aVar = (a) soiVar.b(i)) == null) {
                        exq exqVar2 = this.F;
                        Object b = exqVar2.b(exqVar2.b, i);
                        b.getClass();
                        aVar = (a) b;
                    }
                    this.J = aVar;
                    return aVar;
                }
                i = this.F.o(i);
            }
        }
        a aVar3 = this.t;
        this.J = aVar3;
        return aVar3;
    }

    public final int m0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.F.m(i) : i2;
        }
        qoi qoiVar = this.o;
        if (qoiVar == null || qoiVar.c(i) < 0) {
            return 0;
        }
        int c = qoiVar.c(i);
        if (c >= 0) {
            return qoiVar.c[c];
        }
        wvs.h(k5r.i(i, "Cannot find value for key "));
        return 0;
    }

    public final void n(tpi tpiVar, wn5 wn5Var) {
        ArrayList arrayList = this.r;
        if (this.E) {
            pq5.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = Long.hashCode(g2r.k().g());
            this.u = null;
            g0(tpiVar);
            this.j = 0;
            this.E = true;
            try {
                e0();
                Object C = C();
                if (C != wn5Var && wn5Var != null) {
                    l0(wn5Var);
                }
                nq5 nq5Var = this.C;
                eqi S = szf.S();
                try {
                    S.d(nq5Var);
                    csj csjVar = pq5.a;
                    if (wn5Var != null) {
                        V(200, csjVar);
                        fxf.D(this, wn5Var);
                        p(false);
                    } else if (!this.v || C == null || C.equals(gq5.a)) {
                        Q();
                    } else {
                        V(200, csjVar);
                        wct.o(2, C);
                        fxf.D(this, (Function2) C);
                        p(false);
                    }
                    S.m(S.c - 1);
                    s();
                    this.E = false;
                    arrayList.clear();
                    if (!this.H.w) {
                        pq5.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    S.m(S.c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.E = false;
                arrayList.clear();
                a();
                if (!this.H.w) {
                    pq5.c("Check failed");
                }
                v();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n0() {
        if (!this.q) {
            pq5.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (this.O) {
            pq5.c("useNode() called while inserting");
        }
        exq exqVar = this.F;
        Object l = exqVar.l(exqVar.i);
        iq5 iq5Var = this.L;
        iq5Var.c();
        iq5Var.h.add(l);
        if (this.x && (l instanceof op5)) {
            iq5Var.b();
            iq5Var.b.a.G0(muj.d);
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.F.o(i), i2);
        if (this.F.j(i)) {
            Object l = this.F.l(i);
            iq5 iq5Var = this.L;
            iq5Var.c();
            iq5Var.h.add(l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d9  */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        int hashCode;
        iqe iqeVar;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        int i3;
        exq exqVar;
        wjk wjkVar;
        ?? r5;
        int i4;
        iqe iqeVar2;
        int i5;
        int i6;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i7;
        int i8;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i9;
        wjk wjkVar2;
        int i10;
        Object[] objArr;
        long[] jArr;
        int i11;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        long[] jArr3;
        int i13;
        Object[] objArr4;
        long[] jArr4;
        int hashCode2;
        iqe iqeVar3 = this.m;
        int i14 = iqeVar3.a[iqeVar3.b - 2] - 1;
        boolean z3 = this.O;
        kjn kjnVar = gq5.a;
        if (z3) {
            oxq oxqVar = this.H;
            int i15 = oxqVar.v;
            int i16 = oxqVar.b[oxqVar.q(i15) * 5];
            Object r = this.H.r(i15);
            Object p = this.H.p(i15);
            if (r != null) {
                hashCode2 = Integer.hashCode(r instanceof Enum ? ((Enum) r).ordinal() : r.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (p == null || i16 != 207 || p.equals(kjnVar)) {
                hashCode2 = Integer.rotateRight(i14 ^ this.P, 3) ^ Integer.hashCode(i16);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i14 ^ this.P, 3) ^ Integer.hashCode(p.hashCode()), 3);
            }
            this.P = Integer.rotateRight(hashCode2, 3);
        } else {
            exq exqVar2 = this.F;
            int i17 = exqVar2.i;
            int[] iArr = exqVar2.b;
            int i18 = iArr[i17 * 5];
            Object n = exqVar2.n(iArr, i17);
            exq exqVar3 = this.F;
            Object b = exqVar3.b(exqVar3.b, i17);
            if (n != null) {
                hashCode = Integer.hashCode(n instanceof Enum ? ((Enum) n).ordinal() : n.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (b == null || i18 != 207 || b.equals(kjnVar)) {
                hashCode = Integer.rotateRight(i14 ^ this.P, 3) ^ Integer.hashCode(i18);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i14 ^ this.P, 3) ^ Integer.hashCode(b.hashCode()), 3);
            }
            this.P = Integer.rotateRight(hashCode, 3);
        }
        int i19 = this.k;
        wjk wjkVar3 = this.i;
        ArrayList arrayList5 = this.r;
        iq5 iq5Var = this.L;
        if (wjkVar3 != null) {
            soi soiVar = wjkVar3.e;
            int i20 = wjkVar3.b;
            ArrayList arrayList6 = wjkVar3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = wjkVar3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList7.get(i21));
                }
                i2 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                i = 1;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    vaf vafVar = (vaf) arrayList6.get(i22);
                    if (hashSet2.contains(vafVar)) {
                        iqeVar2 = iqeVar3;
                        i5 = i22;
                        if (!linkedHashSet2.contains(vafVar)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                vaf vafVar2 = (vaf) arrayList7.get(i25);
                                if (vafVar2 != vafVar) {
                                    oqd oqdVar = (oqd) soiVar.b(vafVar2.c);
                                    int i26 = oqdVar != null ? oqdVar.b : -1;
                                    linkedHashSet2.add(vafVar2);
                                    i6 = i25;
                                    i9 = i24;
                                    wjkVar2 = wjkVar3;
                                    if (i26 != i9) {
                                        oqd oqdVar2 = (oqd) soiVar.b(vafVar2.c);
                                        int i27 = oqdVar2 != null ? oqdVar2.c : vafVar2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i28 = i26 + i20;
                                        i7 = size2;
                                        int i29 = i9 + i20;
                                        if (i27 > 0) {
                                            i8 = i20;
                                            int i30 = iq5Var.l;
                                            if (i30 > 0) {
                                                arrayList3 = arrayList6;
                                                if (iq5Var.j == i28 - i30 && iq5Var.k == i29 - i30) {
                                                    iq5Var.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            iq5Var.c();
                                            iq5Var.j = i28;
                                            iq5Var.k = i29;
                                            iq5Var.l = i27;
                                        } else {
                                            i8 = i20;
                                            arrayList3 = arrayList6;
                                            iq5Var.getClass();
                                        }
                                        if (i26 > i9) {
                                            Object[] objArr5 = soiVar.c;
                                            long[] jArr5 = soiVar.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i31 = 0;
                                                while (true) {
                                                    long j = jArr5[i31];
                                                    int i32 = i27;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                        int i34 = 0;
                                                        while (i34 < i33) {
                                                            if ((j & 255) < 128) {
                                                                i13 = i34;
                                                                oqd oqdVar3 = (oqd) objArr5[(i31 << 3) + i34];
                                                                objArr4 = objArr5;
                                                                int i35 = oqdVar3.b;
                                                                jArr4 = jArr5;
                                                                if (i26 <= i35 && i35 < i26 + i32) {
                                                                    oqdVar3.b = (i35 - i26) + i9;
                                                                } else if (i9 <= i35 && i35 < i26) {
                                                                    oqdVar3.b = i35 + i32;
                                                                }
                                                            } else {
                                                                i13 = i34;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i34 = i13 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i31 == length) {
                                                        break;
                                                    }
                                                    i31++;
                                                    arrayList5 = arrayList2;
                                                    i27 = i32;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i36 = i27;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i9 > i26) {
                                                Object[] objArr6 = soiVar.c;
                                                long[] jArr6 = soiVar.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i37 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i37];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                                            int i39 = 0;
                                                            while (i39 < i38) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    oqd oqdVar4 = (oqd) objArr6[(i37 << 3) + i39];
                                                                    jArr2 = jArr6;
                                                                    int i40 = oqdVar4.b;
                                                                    i12 = i26;
                                                                    if (i26 <= i40 && i40 < i12 + i36) {
                                                                        oqdVar4.b = (i40 - i12) + i9;
                                                                    } else if (i12 + 1 <= i40 && i40 < i9) {
                                                                        oqdVar4.b = i40 - i36;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i12 = i26;
                                                                }
                                                                j2 >>= 8;
                                                                i39++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i26 = i12;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i26;
                                                            if (i38 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i11 = i26;
                                                        }
                                                        if (i37 == length2) {
                                                            break;
                                                        }
                                                        i37++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i26 = i11;
                                                    }
                                                }
                                            }
                                        }
                                        i10 = i5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i7 = size2;
                                        i8 = i20;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i10 = i5;
                                } else {
                                    i6 = i25;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i7 = size2;
                                    i8 = i20;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i9 = i24;
                                    wjkVar2 = wjkVar3;
                                    i10 = i5 + 1;
                                }
                                i23 = i6 + 1;
                                oqd oqdVar5 = (oqd) soiVar.b(vafVar2.c);
                                int i41 = i9 + (oqdVar5 != null ? oqdVar5.c : vafVar2.d);
                                i22 = i10;
                                wjkVar3 = wjkVar2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i7;
                                i20 = i8;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i24 = i41;
                                iqeVar3 = iqeVar2;
                            } else {
                                i23 = i25;
                                iqeVar3 = iqeVar2;
                                i22 = i5;
                            }
                        }
                    } else {
                        iqeVar2 = iqeVar3;
                        oqd oqdVar6 = (oqd) soiVar.b(vafVar.c);
                        int i42 = oqdVar6 != null ? oqdVar6.b : -1;
                        int i43 = vafVar.c;
                        i5 = i22;
                        iq5Var.f(i42 + i20, vafVar.d);
                        wjkVar3.a(i43, 0);
                        iq5Var.f = (i43 - iq5Var.a.F.g) + iq5Var.f;
                        this.F.p(i43);
                        H();
                        this.F.q();
                        pq5.a(i43, this.F.b[(i43 * 5) + 3] + i43, arrayList5);
                    }
                    i22 = i5 + 1;
                    iqeVar3 = iqeVar2;
                }
                iqeVar = iqeVar3;
                arrayList = arrayList5;
                iq5Var.c();
                if (arrayList6.size() > 0) {
                    exq exqVar4 = this.F;
                    iq5Var.f = (exqVar4.h - iq5Var.a.F.g) + iq5Var.f;
                    exqVar4.r();
                }
                z2 = this.O;
                if (!z2) {
                    exq exqVar5 = this.F;
                    int i44 = exqVar5.m - exqVar5.l;
                    if (i44 > 0) {
                        if (i44 > 0) {
                            iq5Var.d(false);
                            iq5Var.e();
                            puj pujVar = iq5Var.b.a;
                            pujVar.G0(iuj.d);
                            pujVar.c[pujVar.d - pujVar.a[pujVar.b - 1].b] = i44;
                        } else {
                            iq5Var.getClass();
                        }
                    }
                }
                i3 = this.j;
                while (true) {
                    exqVar = this.F;
                    if (exqVar.k > 0 && (i4 = exqVar.g) != exqVar.h) {
                        H();
                        iq5Var.f(i3, this.F.q());
                        pq5.a(i4, this.F.g, arrayList);
                    }
                }
                if (z2) {
                    if (z) {
                        iq5Var.a();
                    }
                    int i45 = iq5Var.a.F.i;
                    iqe iqeVar4 = iq5Var.d;
                    int i46 = i2;
                    if (iqeVar4.b(i46) > i45) {
                        pq5.c("Missed recording an endGroup");
                    }
                    if (iqeVar4.b(i46) == i45) {
                        iq5Var.d(false);
                        iqeVar4.c();
                        iq5Var.b.a.G0(otj.d);
                    }
                    int i47 = this.F.i;
                    if (i19 != m0(i47)) {
                        i0(i47, i19);
                    }
                    if (z) {
                        i19 = 1;
                    }
                    this.F.e();
                    iq5Var.c();
                } else {
                    if (z) {
                        ngc ngcVar = this.N;
                        puj pujVar2 = ngcVar.b;
                        if (!pujVar2.F0()) {
                            pq5.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        puj pujVar3 = ngcVar.a;
                        s17[] s17VarArr = pujVar2.a;
                        int i48 = pujVar2.b - 1;
                        pujVar2.b = i48;
                        s17 s17Var = s17VarArr[i48];
                        s17VarArr[i48] = null;
                        pujVar3.G0(s17Var);
                        Object[] objArr7 = pujVar2.e;
                        Object[] objArr8 = pujVar3.e;
                        int i49 = pujVar3.f;
                        int i50 = s17Var.c;
                        int i51 = pujVar2.f;
                        int i52 = i51 - i50;
                        System.arraycopy(objArr7, i52, objArr8, i49 - i50, i51 - i52);
                        Object[] objArr9 = pujVar2.e;
                        int i53 = pujVar2.f;
                        Arrays.fill(objArr9, i53 - i50, i53, (Object) null);
                        int[] iArr2 = pujVar2.c;
                        int[] iArr3 = pujVar3.c;
                        int i54 = pujVar3.d;
                        int i55 = s17Var.b;
                        int i56 = pujVar2.d;
                        uz0.e(i54 - i55, i56 - i55, i56, iArr2, iArr3);
                        pujVar2.f -= i50;
                        pujVar2.d -= i55;
                        i19 = i;
                    }
                    if (this.F.k <= 0) {
                        llm.a("Unbalanced begin/end empty");
                    }
                    r3.k--;
                    oxq oxqVar2 = this.H;
                    int i57 = oxqVar2.v;
                    oxqVar2.i();
                    if (this.F.k <= 0) {
                        int i58 = (-2) - i57;
                        this.H.j();
                        this.H.e(i);
                        w80 w80Var = this.M;
                        boolean E0 = this.N.a.E0();
                        fxq fxqVar = this.G;
                        if (E0) {
                            iq5Var.b();
                            r5 = 0;
                            iq5Var.d(false);
                            iq5Var.e();
                            iq5Var.c();
                            puj pujVar4 = iq5Var.b.a;
                            pujVar4.G0(utj.d);
                            q5g.K(pujVar4, 0, w80Var, 1, fxqVar);
                        } else {
                            ngc ngcVar2 = this.N;
                            iq5Var.b();
                            iq5Var.d(false);
                            iq5Var.e();
                            iq5Var.c();
                            puj pujVar5 = iq5Var.b.a;
                            pujVar5.G0(vtj.d);
                            q5g.L(pujVar5, w80Var, fxqVar, ngcVar2);
                            this.N = new ngc();
                            r5 = 0;
                        }
                        this.O = r5;
                        if (this.c.b != 0) {
                            h0(i58, r5);
                            i0(i58, i19);
                        }
                    }
                }
                wjkVar = (wjk) this.h.remove(r3.size() - 1);
                if (wjkVar != null && !z2) {
                    wjkVar.c++;
                }
                this.i = wjkVar;
                this.j = iqeVar.c() + i19;
                this.l = iqeVar.c();
                this.k = iqeVar.c() + i19;
            }
        }
        iqeVar = iqeVar3;
        i = 1;
        arrayList = arrayList5;
        i2 = -1;
        z2 = this.O;
        if (!z2) {
        }
        i3 = this.j;
        while (true) {
            exqVar = this.F;
            if (exqVar.k > 0) {
                break;
            }
            H();
            iq5Var.f(i3, this.F.q());
            pq5.a(i4, this.F.g, arrayList);
        }
        if (z2) {
        }
        wjkVar = (wjk) this.h.remove(r3.size() - 1);
        if (wjkVar != null) {
            wjkVar.c++;
        }
        this.i = wjkVar;
        this.j = iqeVar.c() + i19;
        this.l = iqeVar.c();
        this.k = iqeVar.c() + i19;
    }

    public final void q() {
        p(false);
        xmn x = x();
        if (x != null) {
            int i = x.a;
            if ((i & 1) != 0) {
                x.a = i | 2;
            }
        }
    }

    public final xmn r() {
        xmn xmnVar;
        w80 a;
        vk8 vk8Var;
        ArrayList arrayList = this.D;
        xmn xmnVar2 = !arrayList.isEmpty() ? (xmn) arrayList.remove(arrayList.size() - 1) : null;
        if (xmnVar2 != null) {
            int i = xmnVar2.a;
            xmnVar2.a = i & (-9);
            int i2 = this.A;
            cpi cpiVar = xmnVar2.f;
            if (cpiVar != null && (i & 16) == 0) {
                Object[] objArr = cpiVar.b;
                int[] iArr = cpiVar.c;
                long[] jArr = cpiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        vk8Var = new vk8(xmnVar2, i2, cpiVar, 2);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
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
                }
            }
            vk8Var = null;
            iq5 iq5Var = this.L;
            if (vk8Var != null) {
                puj pujVar = iq5Var.b.a;
                pujVar.G0(ntj.d);
                q5g.K(pujVar, 0, vk8Var, 1, this.g);
            }
            int i7 = xmnVar2.a;
            if ((i7 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                xmnVar2.a = i7 & (-513);
                puj pujVar2 = iq5Var.b.a;
                pujVar2.G0(qtj.d);
                q5g.J(pujVar2, 0, xmnVar2);
            }
        }
        if (xmnVar2 != null) {
            int i8 = xmnVar2.a;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.p)) {
                if (xmnVar2.c == null) {
                    if (this.O) {
                        oxq oxqVar = this.H;
                        a = oxqVar.b(oxqVar.v);
                    } else {
                        exq exqVar = this.F;
                        a = exqVar.a(exqVar.i);
                    }
                    xmnVar2.c = a;
                }
                xmnVar2.a &= -5;
                xmnVar = xmnVar2;
                p(false);
                return xmnVar;
            }
        }
        xmnVar = null;
        p(false);
        return xmnVar;
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        iq5 iq5Var = this.L;
        if (iq5Var.c) {
            iq5Var.d(false);
            iq5Var.d(false);
            iq5Var.b.a.G0(otj.d);
            iq5Var.c = false;
        }
        iq5Var.b();
        if (iq5Var.d.b != 0) {
            pq5.c("Missed recording an endGroup()");
        }
        if (!this.h.isEmpty()) {
            pq5.c("Start/end imbalance");
        }
        i();
        this.F.c();
        this.v = this.w.c() != 0;
    }

    public final void t(int i) {
        if (i < 0) {
            int i2 = -i;
            oxq oxqVar = this.H;
            while (true) {
                int i3 = oxqVar.v;
                if (i3 <= i2) {
                    return;
                } else {
                    p(oxqVar.w(i3));
                }
            }
        } else {
            if (this.O) {
                oxq oxqVar2 = this.H;
                while (this.O) {
                    p(oxqVar2.w(oxqVar2.v));
                }
            }
            exq exqVar = this.F;
            while (true) {
                int i4 = exqVar.i;
                if (i4 <= i) {
                    return;
                } else {
                    p(exqVar.j(i4));
                }
            }
        }
    }

    public final void u(boolean z, wjk wjkVar) {
        this.h.add(this.i);
        this.i = wjkVar;
        int i = this.k;
        iqe iqeVar = this.m;
        iqeVar.d(i);
        iqeVar.d(this.l);
        iqeVar.d(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final void v() {
        fxq fxqVar = new fxq();
        if (this.B) {
            fxqVar.g();
        }
        if (this.b.d()) {
            fxqVar.k = new soi();
        }
        this.G = fxqVar;
        oxq o = fxqVar.o();
        o.e(true);
        this.H = o;
    }

    public final int w() {
        return this.O ? -this.H.v : this.F.i;
    }

    public final xmn x() {
        if (this.z != 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (xmn) vz1.m(arrayList, 1);
    }

    public final boolean y() {
        if (!z() || this.v) {
            return true;
        }
        xmn x = x();
        return (x == null || (x.a & 4) == 0) ? false : true;
    }

    public final boolean z() {
        xmn x;
        return (this.O || this.x || this.v || (x = x()) == null || (x.a & 8) != 0) ? false : true;
    }
}
