package a0;

import java.util.List;
import java.util.Map;
import v1.f0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f103a;

    /* renamed from: b, reason: collision with root package name */
    public int f104b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f105c;

    /* renamed from: d, reason: collision with root package name */
    public float f106d;

    /* renamed from: e, reason: collision with root package name */
    public final float f107e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f108f;

    /* renamed from: g, reason: collision with root package name */
    public final yc.y f109g;

    /* renamed from: h, reason: collision with root package name */
    public final s2.c f110h;

    /* renamed from: i, reason: collision with root package name */
    public final long f111i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f112j;

    /* renamed from: k, reason: collision with root package name */
    public final int f113k;

    /* renamed from: l, reason: collision with root package name */
    public final int f114l;

    /* renamed from: m, reason: collision with root package name */
    public final int f115m;

    /* renamed from: n, reason: collision with root package name */
    public final x.e0 f116n;

    /* renamed from: o, reason: collision with root package name */
    public final int f117o;

    /* renamed from: p, reason: collision with root package name */
    public final int f118p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f0 f119q;

    public s(t tVar, int i10, boolean z10, float f10, f0 f0Var, float f11, boolean z11, yc.y yVar, s2.c cVar, long j3, List list, int i11, int i12, int i13, x.e0 e0Var, int i14, int i15) {
        this.f103a = tVar;
        this.f104b = i10;
        this.f105c = z10;
        this.f106d = f10;
        this.f107e = f11;
        this.f108f = z11;
        this.f109g = yVar;
        this.f110h = cVar;
        this.f111i = j3;
        this.f112j = list;
        this.f113k = i11;
        this.f114l = i12;
        this.f115m = i13;
        this.f116n = e0Var;
        this.f117o = i14;
        this.f118p = i15;
        this.f119q = f0Var;
    }

    @Override // v1.f0
    public final Map a() {
        return this.f119q.a();
    }

    @Override // v1.f0
    public final void b() {
        this.f119q.b();
    }

    @Override // v1.f0
    public final int c() {
        return this.f119q.c();
    }

    @Override // v1.f0
    public final oc.c d() {
        return this.f119q.d();
    }

    @Override // v1.f0
    public final int e() {
        return this.f119q.e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean f(int i10, boolean z10) {
        t tVar;
        if (!this.f108f) {
            ?? r02 = this.f112j;
            if (!r02.isEmpty() && (tVar = this.f103a) != null) {
                int i11 = tVar.f131l;
                int i12 = this.f104b - i10;
                if (i12 >= 0 && i12 < i11) {
                    t tVar2 = (t) bc.m.T(r02);
                    t tVar3 = (t) bc.m.X(r02);
                    tVar2.getClass();
                    tVar3.getClass();
                    int i13 = this.f114l;
                    int i14 = this.f113k;
                    if (i10 >= 0 ? Math.min(i14 - tVar2.f129j, i13 - tVar3.f129j) > i10 : Math.min((tVar2.f129j + tVar2.f131l) - i14, (tVar3.f129j + tVar3.f131l) - i13) > (-i10)) {
                        this.f104b -= i10;
                        int size = r02.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            t tVar4 = (t) r02.get(i15);
                            int[] iArr = tVar4.f134o;
                            tVar4.f129j += i10;
                            int length = iArr.length;
                            for (int i16 = 0; i16 < length; i16++) {
                                if (i16 % 2 == 1) {
                                    iArr[i16] = iArr[i16] + i10;
                                }
                            }
                            if (z10) {
                                int size2 = tVar4.f121b.size();
                                for (int i17 = 0; i17 < size2; i17++) {
                                    a4.d.s(tVar4.f128i.f549a.g(tVar4.f126g));
                                }
                            }
                        }
                        this.f106d = i10;
                        if (!this.f105c && i10 > 0) {
                            this.f105c = true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
