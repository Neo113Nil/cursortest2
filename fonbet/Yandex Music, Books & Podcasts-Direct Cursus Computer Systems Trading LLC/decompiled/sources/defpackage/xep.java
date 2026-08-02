package defpackage;

import android.view.ActionMode;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xep {
    public final bfp a;
    public msd e;
    public Function1 f;
    public hes g;
    public enj j;
    public wof k;
    public qep r;
    public boolean s;
    public final x6k b = szf.g0(null);
    public final x6k c = szf.g0(Boolean.TRUE);
    public uif d = new fep(this, 8);
    public final yoc h = new yoc();
    public final x6k i = szf.g0(Boolean.FALSE);
    public final x6k l = szf.g0(new enj(0));
    public final x6k m = szf.g0(new enj(0));
    public final x6k n = szf.g0(null);
    public final x6k o = szf.g0(null);
    public final x6k p = szf.g0(null);
    public final x6k q = szf.g0(null);

    public xep(bfp bfpVar) {
        this.a = bfpVar;
        bfpVar.e = new fep(this, 1);
        bfpVar.f = new lh0(5, this);
        bfpVar.g = new vep(this);
        bfpVar.h = new dep(this, 2);
        bfpVar.i = new fep(this, 2);
        bfpVar.j = new fep(this, 3);
    }

    public static final long a(xep xepVar, wof wofVar, long j) {
        wof wofVar2 = xepVar.k;
        if (wofVar2 == null || !wofVar2.d()) {
            return 9205357640488583168L;
        }
        return xepVar.j().v(wofVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        mn0 mn0Var;
        Function1 function1;
        if (e() != null) {
            bfp bfpVar = this.a;
            if (bfpVar.a().e != 0) {
                kn0 kn0Var = new kn0();
                ArrayList c = bfpVar.c(j());
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    ugi ugiVar = (ugi) c.get(i);
                    ydp ydpVar = (ydp) bfpVar.a().e(ugiVar.a);
                    if (ydpVar != null) {
                        xdp xdpVar = ydpVar.a;
                        xdp xdpVar2 = ydpVar.b;
                        mn0 d = ugiVar.d();
                        kn0Var.b(ydpVar.c ? d.subSequence(xdpVar2.b, xdpVar.b) : d.subSequence(xdpVar.b, xdpVar2.b));
                    }
                }
                mn0Var = kn0Var.h();
                if (mn0Var == null) {
                    mn0 mn0Var2 = mn0Var.b.length() > 0 ? mn0Var : null;
                    if (mn0Var2 == null || (function1 = this.f) == null) {
                        return;
                    }
                    function1.invoke(mn0Var2);
                    return;
                }
                return;
            }
        }
        mn0Var = null;
        if (mn0Var == null) {
        }
    }

    public final ugi c(xdp xdpVar) {
        return (ugi) this.a.c.e(xdpVar.c);
    }

    public final xrd d() {
        return (xrd) this.p.getValue();
    }

    public final ydp e() {
        return (ydp) this.b.getValue();
    }

    public final boolean f() {
        ydp ydpVar;
        wof j = j();
        bfp bfpVar = this.a;
        ArrayList c = bfpVar.c(j);
        if (c.isEmpty()) {
            return true;
        }
        int size = c.size();
        for (int i = 0; i < size; i++) {
            ugi ugiVar = (ugi) c.get(i);
            mn0 d = ugiVar.d();
            if (d.b.length() != 0 && ((ydpVar = (ydp) bfpVar.a().e(ugiVar.a)) == null || Math.abs(ydpVar.a.b - ydpVar.b.b) != d.b.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        ydp e = e();
        if (e != null) {
            xdp xdpVar = e.b;
            xdp xdpVar2 = e.a;
            if (!Intrinsics.d(xdpVar2, xdpVar)) {
                if (xdpVar2.c == xdpVar.c) {
                    return true;
                }
                wof j = j();
                bfp bfpVar = this.a;
                ArrayList c = bfpVar.c(j);
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    ydp ydpVar = (ydp) bfpVar.a().e(((ugi) c.get(i)).a);
                    if (ydpVar != null && ydpVar.a.b != ydpVar.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, uif] */
    public final void i() {
        msd msdVar;
        yoi yoiVar = yug.a;
        yoiVar.getClass();
        this.a.k.setValue(yoiVar);
        n(false);
        if (e() != null) {
            this.d.invoke(null);
            if (!g() || (msdVar = this.e) == null) {
                return;
            }
            msdVar.a(9);
        }
    }

    public final wof j() {
        wof wofVar = this.k;
        if (wofVar != null) {
            if (!wofVar.d()) {
                vme.a("unattached coordinates");
            }
            return wofVar;
        }
        vme.b("null coordinates");
        rj7.f();
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, uif] */
    public final void k() {
        ydp ydpVar;
        ArrayList arrayList;
        int i;
        wof j = j();
        bfp bfpVar = this.a;
        ArrayList c = bfpVar.c(j);
        if (c.isEmpty()) {
            return;
        }
        yoi yoiVar = yug.a;
        yoi yoiVar2 = new yoi();
        int size = c.size();
        int i2 = 0;
        ydp ydpVar2 = null;
        ydp ydpVar3 = null;
        while (i2 < size) {
            ugi ugiVar = (ugi) c.get(i2);
            long j2 = ugiVar.a;
            cds cdsVar = (cds) ugiVar.c.invoke();
            if (cdsVar == null) {
                arrayList = c;
                i = size;
                ydpVar = null;
            } else {
                int length = cdsVar.a.a.b.length();
                arrayList = c;
                i = size;
                ydpVar = new ydp(new xdp(cdsVar.a(0), 0, j2), new xdp(cdsVar.a(Math.max(length - 1, 0)), length, j2), false);
            }
            if (ydpVar != null) {
                if (ydpVar2 == null) {
                    ydpVar2 = ydpVar;
                }
                long j3 = ugiVar.a;
                int c2 = yoiVar2.c(j3);
                Object[] objArr = yoiVar2.c;
                Object obj = objArr[c2];
                yoiVar2.b[c2] = j3;
                objArr[c2] = ydpVar;
                ydpVar3 = ydpVar;
            }
            i2++;
            c = arrayList;
            size = i;
        }
        if (yoiVar2.e == 0) {
            return;
        }
        if (ydpVar2 != ydpVar3) {
            ydpVar2.getClass();
            xdp xdpVar = ydpVar2.a;
            ydpVar3.getClass();
            ydpVar2 = new ydp(xdpVar, ydpVar3.b, false);
        }
        bfpVar.k.setValue(yoiVar2);
        this.d.invoke(ydpVar2);
        this.r = null;
    }

    public final void l(boolean z) {
        x6k x6kVar = this.c;
        if (((Boolean) x6kVar.getValue()).booleanValue() != z) {
            x6kVar.setValue(Boolean.valueOf(z));
            q();
        }
    }

    public final void m(ydp ydpVar) {
        this.b.setValue(ydpVar);
        if (ydpVar != null) {
            o();
        }
    }

    public final void n(boolean z) {
        this.s = z;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (defpackage.weo.n(r10, r11) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        long j;
        enj enjVar;
        xdp xdpVar;
        xdp xdpVar2;
        ydp e = e();
        wof wofVar = this.k;
        enj enjVar2 = null;
        ugi c = (e == null || (xdpVar2 = e.a) == null) ? null : c(xdpVar2);
        ugi c2 = (e == null || (xdpVar = e.b) == null) ? null : c(xdpVar);
        wof c3 = c != null ? c.c() : null;
        wof c4 = c2 != null ? c2.c() : null;
        x6k x6kVar = this.o;
        x6k x6kVar2 = this.n;
        if (e == null || wofVar == null || !wofVar.d() || (c3 == null && c4 == null)) {
            x6kVar2.setValue(null);
            x6kVar.setValue(null);
            return;
        }
        ynn U = weo.U(wofVar);
        if (c3 != null) {
            j = 9205357640488583168L;
            long a = c.a(e, true);
            if ((a & 9223372034707292159L) != 9205357640488583168L) {
                long v = wofVar.v(c3, a);
                enjVar = new enj(v);
                if (d() != xrd.b) {
                }
                x6kVar2.setValue(enjVar);
                if (c4 != null) {
                    long a2 = c2.a(e, false);
                    if ((a2 & 9223372034707292159L) != j) {
                        long v2 = wofVar.v(c4, a2);
                        enj enjVar3 = new enj(v2);
                        if (d() == xrd.c || weo.n(U, v2)) {
                            enjVar2 = enjVar3;
                        }
                    }
                }
                x6kVar.setValue(enjVar2);
            }
        } else {
            j = 9205357640488583168L;
        }
        enjVar = null;
        x6kVar2.setValue(enjVar);
        if (c4 != null) {
        }
        x6kVar.setValue(enjVar2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, uif] */
    public final boolean p(long j, long j2, boolean z, zdp zdpVar) {
        ArrayList arrayList;
        qep qepVar;
        cds cdsVar;
        long j3;
        int i;
        rep repVar;
        long j4;
        long j5;
        j48 x;
        j48 j48Var;
        j48 j48Var2;
        boolean z2;
        int i2;
        ArrayList arrayList2;
        j48 j48Var3;
        ArrayList arrayList3;
        j48 j48Var4;
        j48 j48Var5;
        j48 j48Var6;
        rep repVar2;
        int i3;
        int i4;
        int i5;
        xdp xdpVar;
        int i6;
        xdp xdpVar2;
        this.p.setValue(z ? xrd.b : xrd.c);
        this.q.setValue(new enj(j));
        wof j6 = j();
        bfp bfpVar = this.a;
        ArrayList c = bfpVar.c(j6);
        int i7 = vug.a;
        woi woiVar = new woi(6);
        int size = c.size();
        for (int i8 = 0; i8 < size; i8++) {
            woiVar.e(i8, ((ugi) c.get(i8)).a);
        }
        long j7 = 9223372034707292159L;
        long j8 = 9205357640488583168L;
        rep repVar3 = new rep(j, j2, j6, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : e(), new eh(15, woiVar));
        int size2 = c.size();
        int i9 = 0;
        while (true) {
            arrayList = repVar3.h;
            if (i9 >= size2) {
                break;
            }
            ugi ugiVar = (ugi) c.get(i9);
            wof c2 = ugiVar.c();
            if (c2 == null || (cdsVar = (cds) ugiVar.c.invoke()) == null) {
                i = size2;
                i2 = i9;
                arrayList2 = c;
                j3 = j7;
                j5 = j8;
                repVar2 = repVar3;
            } else {
                j3 = j7;
                long v = repVar3.c.v(c2, 0L);
                ArrayList arrayList4 = c;
                long g = enj.g(repVar3.a, v);
                long j9 = repVar3.b;
                long g2 = (j9 & j3) == j8 ? j8 : enj.g(j9, v);
                long j10 = ugiVar.a;
                i = size2;
                int i10 = i9;
                long j11 = cdsVar.c;
                float f = (int) (j11 >> 32);
                float f2 = (int) (j11 & 4294967295L);
                int i11 = (int) (g >> 32);
                j48 j48Var7 = Float.intBitsToFloat(i11) < 0.0f ? j48.a : Float.intBitsToFloat(i11) > f ? j48.c : j48.b;
                int i12 = (int) (g & 4294967295L);
                j48 j48Var8 = Float.intBitsToFloat(i12) < 0.0f ? j48.a : Float.intBitsToFloat(i12) > f2 ? j48.c : j48.b;
                boolean z3 = repVar3.d;
                ydp ydpVar = repVar3.e;
                if (z3) {
                    j5 = j8;
                    repVar = repVar3;
                    j4 = j10;
                    x = p1g.x(j48Var7, j48Var8, repVar, j4, ydpVar != null ? ydpVar.b : null);
                    z2 = z3;
                    i2 = i10;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList;
                    j48Var4 = j48Var7;
                    j48Var = j48Var4;
                    j48Var5 = j48Var8;
                    j48Var2 = j48Var5;
                    j48Var3 = x;
                    j48Var6 = j48Var3;
                } else {
                    repVar = repVar3;
                    j4 = j10;
                    j5 = j8;
                    x = p1g.x(j48Var7, j48Var8, repVar, j4, ydpVar != null ? ydpVar.a : null);
                    j48Var = j48Var7;
                    j48Var2 = j48Var8;
                    z2 = z3;
                    i2 = i10;
                    arrayList2 = arrayList4;
                    j48Var3 = j48Var;
                    arrayList3 = arrayList;
                    j48Var4 = x;
                    j48Var5 = j48Var4;
                    j48Var6 = j48Var2;
                }
                repVar2 = repVar;
                j48 F = ldg.F(j48Var, j48Var2);
                if (F == j48.b || F != x) {
                    int length = cdsVar.a.a.b.length();
                    eh ehVar = repVar2.f;
                    if (z2) {
                        int C = p1g.C(g, cdsVar);
                        if (ydpVar == null || (xdpVar2 = ydpVar.b) == null) {
                            i6 = C;
                            length = i6;
                        } else {
                            i6 = C;
                            int compare = ehVar.compare(Long.valueOf(xdpVar2.c), Long.valueOf(j4));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = xdpVar2.b;
                            }
                        }
                        i5 = length;
                        i4 = i6;
                    } else {
                        int C2 = p1g.C(g, cdsVar);
                        if (ydpVar == null || (xdpVar = ydpVar.a) == null) {
                            i3 = C2;
                            i4 = i3;
                        } else {
                            i3 = C2;
                            int compare2 = ehVar.compare(Long.valueOf(xdpVar.c), Long.valueOf(j4));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = xdpVar.b;
                            }
                            i4 = length;
                        }
                        i5 = i3;
                    }
                    int C3 = (g2 & j3) == j5 ? -1 : p1g.C(g2, cdsVar);
                    int i13 = repVar2.k + 2;
                    repVar2.k = i13;
                    long j12 = j4;
                    idp idpVar = new idp(j12, i13, i4, i5, C3, cdsVar);
                    repVar2.i = repVar2.a(repVar2.i, j48Var4, j48Var5);
                    repVar2.j = repVar2.a(repVar2.j, j48Var3, j48Var6);
                    repVar2.g.e(arrayList3.size(), j12);
                    arrayList3.add(idpVar);
                }
            }
            i9 = i2 + 1;
            size2 = i;
            c = arrayList2;
            repVar3 = repVar2;
            j7 = j3;
            j8 = j5;
        }
        rep repVar4 = repVar3;
        int i14 = repVar4.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            qepVar = null;
        } else if (size3 != 1) {
            int i15 = repVar4.i;
            int i16 = i15 == -1 ? i14 : i15;
            int i17 = repVar4.j;
            qepVar = new rgi(repVar4.g, arrayList, i16, i17 == -1 ? i14 : i17, repVar4.d, repVar4.e);
        } else {
            idp idpVar2 = (idp) CollectionsKt.k0(arrayList);
            int i18 = repVar4.i;
            int i19 = i18 == -1 ? i14 : i18;
            int i20 = repVar4.j;
            qepVar = new xlq(repVar4.d, i19, i20 == -1 ? i14 : i20, repVar4.e, idpVar2);
        }
        if (qepVar == null || !qepVar.l(this.r)) {
            return false;
        }
        ydp a = zdpVar.a(qepVar);
        if (!Intrinsics.d(a, e())) {
            if (g()) {
                ArrayList arrayList5 = bfpVar.b;
                int size4 = arrayList5.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size4) {
                        break;
                    }
                    if (((ugi) arrayList5.get(i21)).d().b.length() > 0) {
                        msd msdVar = this.e;
                        if (msdVar != null) {
                            msdVar.a(9);
                        }
                    } else {
                        i21++;
                    }
                }
            }
            bfpVar.k.setValue(qepVar.m(a));
            this.d.invoke(a);
        }
        this.r = qepVar;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        hes hesVar;
        wof wofVar;
        hes hesVar2;
        ynn ynnVar;
        hes hesVar3;
        ArrayList arrayList;
        int i;
        int[] iArr;
        int i2;
        ugi ugiVar;
        int i3;
        ynn b;
        if (!((Boolean) this.i.getValue()).booleanValue() || (hesVar = this.g) == null) {
            return;
        }
        if (!this.s || !g()) {
            zi0 zi0Var = (zi0) hesVar;
            if (zi0Var.d == ies.a) {
                zi0Var.d = ies.b;
                ActionMode actionMode = zi0Var.b;
                if (actionMode != null) {
                    actionMode.finish();
                }
                zi0Var.b = null;
                return;
            }
            return;
        }
        ynn ynnVar2 = weo.h;
        if (e() != null && (wofVar = this.k) != null && wofVar.d()) {
            wof j = j();
            bfp bfpVar = this.a;
            ArrayList c = bfpVar.c(j);
            ArrayList arrayList2 = new ArrayList(c.size());
            int size = c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ugi ugiVar2 = (ugi) c.get(i4);
                ydp ydpVar = (ydp) bfpVar.a().e(ugiVar2.a);
                Pair pair = ydpVar != null ? new Pair(ugiVar2, ydpVar) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            int size2 = arrayList2.size();
            int i5 = 1;
            ArrayList arrayList3 = arrayList2;
            arrayList3 = arrayList2;
            if (size2 != 0 && size2 != 1) {
                arrayList3 = u75.h(CollectionsKt.Q(arrayList2), CollectionsKt.Y(arrayList2));
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    ynnVar = ynnVar2;
                    hesVar2 = hesVar;
                } else {
                    int size3 = arrayList3.size();
                    int i6 = 0;
                    float f = Float.POSITIVE_INFINITY;
                    float f2 = Float.POSITIVE_INFINITY;
                    float f3 = Float.NEGATIVE_INFINITY;
                    float f4 = Float.NEGATIVE_INFINITY;
                    ArrayList arrayList4 = arrayList3;
                    while (i6 < size3) {
                        Pair pair2 = (Pair) arrayList4.get(i6);
                        ugi ugiVar3 = (ugi) pair2.a;
                        ydp ydpVar2 = (ydp) pair2.b;
                        int i7 = ydpVar2.a.b;
                        int i8 = ydpVar2.b.b;
                        if (i7 != i8) {
                            int i9 = 0;
                            wof c2 = ugiVar3.c();
                            if (c2 != null) {
                                int i10 = i5;
                                int min = Math.min(i7, i8);
                                int max = Math.max(i7, i8) - 1;
                                if (min == max) {
                                    iArr = new int[i10];
                                    iArr[0] = min;
                                } else {
                                    int[] iArr2 = new int[2];
                                    iArr2[0] = min;
                                    iArr2[i10] = max;
                                    iArr = iArr2;
                                }
                                int length = iArr.length;
                                i = size3;
                                arrayList = arrayList4;
                                int[] iArr3 = iArr;
                                int i11 = 0;
                                float f5 = Float.POSITIVE_INFINITY;
                                float f6 = Float.POSITIVE_INFINITY;
                                float f7 = Float.NEGATIVE_INFINITY;
                                float f8 = Float.NEGATIVE_INFINITY;
                                while (i11 < length) {
                                    int i12 = length;
                                    int i13 = iArr3[i11];
                                    hes hesVar4 = hesVar;
                                    cds cdsVar = (cds) ugiVar3.c.invoke();
                                    ynn ynnVar3 = ynn.e;
                                    if (cdsVar == null) {
                                        i2 = i11;
                                        ugiVar = ugiVar3;
                                    } else {
                                        i2 = i11;
                                        int length2 = cdsVar.a.a.b.length();
                                        ugiVar = ugiVar3;
                                        if (length2 >= 1) {
                                            i3 = i9;
                                            ynnVar3 = cdsVar.b(yhn.d(i13, i3, length2 - 1));
                                            ynn ynnVar4 = ynnVar3;
                                            f5 = Math.min(f5, ynnVar4.a);
                                            f6 = Math.min(f6, ynnVar4.b);
                                            f7 = Math.max(f7, ynnVar4.c);
                                            f8 = Math.max(f8, ynnVar4.d);
                                            i11 = i2 + 1;
                                            i9 = i3;
                                            length = i12;
                                            hesVar = hesVar4;
                                            ugiVar3 = ugiVar;
                                        }
                                    }
                                    i3 = i9;
                                    ynn ynnVar42 = ynnVar3;
                                    f5 = Math.min(f5, ynnVar42.a);
                                    f6 = Math.min(f6, ynnVar42.b);
                                    f7 = Math.max(f7, ynnVar42.c);
                                    f8 = Math.max(f8, ynnVar42.d);
                                    i11 = i2 + 1;
                                    i9 = i3;
                                    length = i12;
                                    hesVar = hesVar4;
                                    ugiVar3 = ugiVar;
                                }
                                hesVar3 = hesVar;
                                long floatToRawIntBits = Float.floatToRawIntBits(f7);
                                long v = wofVar.v(c2, (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
                                long v2 = wofVar.v(c2, (Float.floatToRawIntBits(f8) & 4294967295L) | (floatToRawIntBits << 32));
                                f = Math.min(f, Float.intBitsToFloat((int) (v >> 32)));
                                f2 = Math.min(f2, Float.intBitsToFloat((int) (v & 4294967295L)));
                                f3 = Math.max(f3, Float.intBitsToFloat((int) (v2 >> 32)));
                                f4 = Math.max(f4, Float.intBitsToFloat((int) (v2 & 4294967295L)));
                                i6++;
                                size3 = i;
                                arrayList4 = arrayList;
                                hesVar = hesVar3;
                                i5 = 1;
                            }
                        }
                        i = size3;
                        arrayList = arrayList4;
                        hesVar3 = hesVar;
                        i6++;
                        size3 = i;
                        arrayList4 = arrayList;
                        hesVar = hesVar3;
                        i5 = 1;
                    }
                    hesVar2 = hesVar;
                    ynnVar = new ynn(f, f2, f3, f4);
                }
                if (!ynnVar.equals(ynnVar2)) {
                    ynn h = weo.U(wofVar).h(ynnVar);
                    if (h.c - h.a >= 0.0f && h.d - h.b >= 0.0f) {
                        ynn l = h.l(wofVar.S(0L));
                        b = ynn.b(l, 0.0f, 0.0f, (pep.b * 4) + l.d, 7);
                        if (b == null) {
                            return;
                        }
                        ((zi0) hesVar2).a(b, h() ? new qbp(0, this, xep.class, "toolbarCopy", "toolbarCopy()V", 0, 2) : null, null, null, f() ? null : new qbp(0, this, xep.class, "selectAll", "selectAll$foundation_release()V", 0, 3), null);
                        return;
                    }
                }
                b = null;
                if (b == null) {
                }
            }
        }
        hesVar2 = hesVar;
        b = null;
        if (b == null) {
        }
    }
}
