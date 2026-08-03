package androidx.compose.foundation.lazy.layout;

import a0.o;
import a0.t;
import a4.d;
import b0.g;
import b0.p;
import b0.q0;
import b0.u;
import bc.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import pc.j;
import s.g0;
import s.h0;
import s.o0;
import s.p0;
import v1.j0;
import x1.y0;
import y0.m;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f549a;

    /* renamed from: b, reason: collision with root package name */
    public u f550b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f551c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f552d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f553e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f554f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f555g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f556h;

    /* renamed from: i, reason: collision with root package name */
    public final n f557i;

    public a() {
        long[] jArr = o0.f6312a;
        this.f549a = new g0();
        int i10 = p0.f6316a;
        this.f551c = new h0();
        this.f552d = new ArrayList();
        this.f553e = new ArrayList();
        this.f554f = new ArrayList();
        this.f555g = new ArrayList();
        this.f556h = new ArrayList();
        this.f557i = new y0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final a f543a;

            {
                this.f543a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && j.a(this.f543a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f543a);
            }

            @Override // x1.y0
            public final m f() {
                b0.n nVar = new b0.n();
                nVar.f859u = this.f543a;
                return nVar;
            }

            @Override // x1.y0
            public final void g(m mVar) {
                b0.n nVar = (b0.n) mVar;
                a aVar = nVar.f859u;
                a aVar2 = this.f543a;
                if (j.a(aVar, aVar2) || !nVar.f8443g.f8456t) {
                    return;
                }
                nVar.f859u.c();
                nVar.f859u = aVar2;
            }

            public final int hashCode() {
                return this.f543a.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f543a + ')';
            }
        };
    }

    public static int e(int[] iArr, t tVar) {
        tVar.getClass();
        int i10 = iArr[0] + tVar.f131l;
        iArr[0] = i10;
        return Math.max(0, i10);
    }

    public final long a() {
        ArrayList arrayList = this.f556h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        d.s(arrayList.get(0));
        throw null;
    }

    public final void b(int i10, int i11, ArrayList arrayList, q0 q0Var, o oVar, boolean z10, boolean z11, int i12, int i13) {
        long j3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j6;
        int i14;
        u uVar = this.f550b;
        this.f550b = q0Var;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            t tVar = (t) arrayList.get(i15);
            int size2 = tVar.f121b.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ((j0) tVar.f121b.get(i16)).g();
            }
        }
        g0 g0Var = this.f549a;
        if (g0Var.i()) {
            c();
            return;
        }
        boolean z12 = z10 || !z11;
        Object[] objArr = g0Var.f6267b;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        h0 h0Var = this.f551c;
        if (length >= 0) {
            int i17 = 0;
            j3 = 255;
            while (true) {
                long j10 = jArr[i17];
                int i18 = i17;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    long j11 = j10;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j11 & 255) < 128) {
                            h0Var.a(objArr[(i18 << 3) + i20]);
                        }
                        j11 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length) {
                    break;
                } else {
                    i17 = i18 + 1;
                }
            }
        } else {
            j3 = 255;
        }
        int size3 = arrayList.size();
        for (int i21 = 0; i21 < size3; i21++) {
            t tVar2 = (t) arrayList.get(i21);
            h0Var.k(tVar2.f126g);
            int size4 = tVar2.f121b.size();
            for (int i22 = 0; i22 < size4; i22++) {
                ((j0) tVar2.f121b.get(i22)).g();
            }
            d.s(this.f549a.k(tVar2.f126g));
        }
        int[] iArr = {0};
        ArrayList arrayList4 = this.f553e;
        ArrayList arrayList5 = this.f552d;
        if (z12 && uVar != null) {
            if (!arrayList5.isEmpty()) {
                if (arrayList5.size() > 1) {
                    r.P(arrayList5, new b0.o(uVar, 1));
                }
                if (arrayList5.size() > 0) {
                    t tVar3 = (t) arrayList5.get(0);
                    e(iArr, tVar3);
                    Object g8 = g0Var.g(tVar3.f126g);
                    j.b(g8);
                    d.s(g8);
                    tVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    r.P(arrayList4, new b0.o(uVar, 0));
                }
                if (arrayList4.size() > 0) {
                    t tVar4 = (t) arrayList4.get(0);
                    e(iArr, tVar4);
                    Object g10 = g0Var.g(tVar4.f126g);
                    j.b(g10);
                    d.s(g10);
                    tVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = h0Var.f6275b;
        long[] jArr2 = h0Var.f6274a;
        int length2 = jArr2.length - 2;
        boolean z13 = z12;
        if (length2 >= 0) {
            int i23 = 0;
            while (true) {
                long j12 = jArr2[i23];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i24 = 8;
                    int i25 = 8 - ((~(i23 - length2)) >>> 31);
                    long j13 = j12;
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j13 & j3) < 128) {
                            Object obj = objArr2[(i23 << 3) + i26];
                            Object g11 = g0Var.g(obj);
                            j.b(g11);
                            d.s(g11);
                            q0Var.b(obj);
                            throw null;
                        }
                        j13 >>= i24;
                        i26++;
                        i24 = 8;
                    }
                    if (i25 != i24) {
                        break;
                    }
                }
                if (i23 == length2) {
                    break;
                }
                i23++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = this.f554f;
        if (arrayList6.isEmpty()) {
            j6 = 4294967295L;
            i14 = 1;
        } else {
            if (arrayList6.size() > 1) {
                r.P(arrayList6, new p(q0Var, 1));
            }
            int size5 = arrayList6.size();
            for (int i27 = 0; i27 < size5; i27++) {
                t tVar5 = (t) arrayList6.get(i27);
                Object g12 = g0Var.g(tVar5.f126g);
                j.b(g12);
                d.s(g12);
                tVar5.c((z10 ? (int) (((t) bc.m.T(arrayList)).a(0) & 4294967295L) : 0) - e(iArr, tVar5), i10, i11);
                if (z13) {
                    d(tVar5, true);
                    throw null;
                }
            }
            j6 = 4294967295L;
            i14 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList7 = this.f555g;
        if (!arrayList7.isEmpty()) {
            if (arrayList7.size() > i14) {
                r.P(arrayList7, new p(q0Var, 0));
            }
            int size6 = arrayList7.size();
            for (int i28 = 0; i28 < size6; i28++) {
                t tVar6 = (t) arrayList7.get(i28);
                Object g13 = g0Var.g(tVar6.f126g);
                j.b(g13);
                d.s(g13);
                tVar6.c((z10 ? (int) (((t) bc.m.X(arrayList)).a(0) & j6) : 0 - tVar6.f131l) + e(iArr, tVar6), i10, i11);
                if (z13) {
                    d(tVar6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList7);
        arrayList3.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList7.clear();
        h0Var.b();
    }

    public final void c() {
        g0 g0Var = this.f549a;
        if (g0Var.j()) {
            Object[] objArr = g0Var.f6268c;
            long[] jArr = g0Var.f6266a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j3 = jArr[i10];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j3) < 128) {
                                d.s(objArr[(i10 << 3) + i12]);
                                throw null;
                            }
                            j3 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            g0Var.a();
        }
        this.f550b = g.f822b;
    }

    public final void d(t tVar, boolean z10) {
        Object g8 = this.f549a.g(tVar.f126g);
        j.b(g8);
        d.s(g8);
        throw null;
    }
}
