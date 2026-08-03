package a0;

import java.util.List;
import v1.i0;
import v1.j0;
import v1.k0;
import v1.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f120a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.d f122c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.l f123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124e;

    /* renamed from: f, reason: collision with root package name */
    public final long f125f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f126g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f127h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f128i;

    /* renamed from: j, reason: collision with root package name */
    public int f129j;

    /* renamed from: k, reason: collision with root package name */
    public final int f130k;

    /* renamed from: l, reason: collision with root package name */
    public final int f131l;

    /* renamed from: m, reason: collision with root package name */
    public final int f132m;

    /* renamed from: n, reason: collision with root package name */
    public int f133n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f134o;

    public t(int i10, List list, y0.d dVar, s2.l lVar, int i11, int i12, int i13, long j3, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j6) {
        this.f120a = i10;
        this.f121b = list;
        this.f122c = dVar;
        this.f123d = lVar;
        this.f124e = i13;
        this.f125f = j3;
        this.f126g = obj;
        this.f127h = obj2;
        this.f128i = aVar;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            j0 j0Var = (j0) list.get(i16);
            i14 += j0Var.f7086h;
            i15 = Math.max(i15, j0Var.f7085g);
        }
        this.f130k = i14;
        int i17 = i14 + this.f124e;
        this.f131l = i17 >= 0 ? i17 : 0;
        this.f132m = i15;
        this.f134o = new int[this.f121b.size() * 2];
    }

    public final long a(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f134o;
        return x4.f.j(iArr[i11], iArr[i11 + 1]);
    }

    public final void b(i0 i0Var) {
        k0 k0Var = k0.f7091h;
        if (this.f133n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f121b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = (j0) list.get(i10);
            int i11 = j0Var.f7086h;
            long a6 = a(i10);
            a4.d.s(this.f128i.f549a.g(this.f126g));
            long c3 = s2.i.c(a6, this.f125f);
            int i12 = l0.f7097b;
            i0Var.getClass();
            i0.a(i0Var, j0Var);
            j0Var.P(s2.i.c(c3, j0Var.f7089k), 0.0f, k0Var);
        }
    }

    public final void c(int i10, int i11, int i12) {
        this.f129j = i10;
        this.f133n = i12;
        List list = this.f121b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            j0 j0Var = (j0) list.get(i13);
            int i14 = i13 * 2;
            y0.d dVar = this.f122c;
            if (dVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
            int a6 = dVar.a(j0Var.f7085g, i11, this.f123d);
            int[] iArr = this.f134o;
            iArr[i14] = a6;
            iArr[i14 + 1] = i10;
            i10 += j0Var.f7086h;
        }
    }
}
