package i0;

import android.view.ViewGroup;
import b0.p0;
import bc.a0;
import java.util.LinkedHashMap;
import m0.d1;
import m0.e2;
import m0.l1;
import m0.z;
import w.j0;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements e2, m, j0 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2931g;

    /* renamed from: h, reason: collision with root package name */
    public final a0.u f2932h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2933i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2934j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f2935k;

    /* renamed from: l, reason: collision with root package name */
    public final d1 f2936l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewGroup f2937m;

    /* renamed from: n, reason: collision with root package name */
    public l f2938n;

    /* renamed from: o, reason: collision with root package name */
    public final l1 f2939o = z.s(null);

    /* renamed from: p, reason: collision with root package name */
    public final l1 f2940p = z.s(Boolean.TRUE);

    /* renamed from: q, reason: collision with root package name */
    public long f2941q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2942r = -1;

    /* renamed from: s, reason: collision with root package name */
    public final p0 f2943s = new p0(5, this);

    public a(boolean z10, float f10, d1 d1Var, d1 d1Var2, ViewGroup viewGroup) {
        this.f2931g = z10;
        this.f2932h = new a0.u(z10, new a0.k(d1Var2, 2));
        this.f2933i = z10;
        this.f2934j = f10;
        this.f2935k = d1Var;
        this.f2936l = d1Var2;
        this.f2937m = viewGroup;
    }

    @Override // i0.m
    public final void S() {
        this.f2939o.setValue(null);
    }

    @Override // w.j0
    public final void d(i0 i0Var) {
        h1.b bVar = i0Var.f8081g;
        this.f2941q = bVar.d();
        float f10 = this.f2934j;
        this.f2942r = Float.isNaN(f10) ? a0.I(k.a(i0Var, this.f2933i, bVar.d())) : bVar.D(f10);
        long j3 = ((f1.q) this.f2935k.getValue()).f2285a;
        float f11 = ((f) this.f2936l.getValue()).f2951d;
        i0Var.a();
        this.f2932h.d(i0Var, Float.isNaN(f10) ? k.a(i0Var, this.f2931g, bVar.d()) : i0Var.x(f10), j3);
        f1.o t3 = bVar.f2596h.t();
        ((Boolean) this.f2940p.getValue()).booleanValue();
        n nVar = (n) this.f2939o.getValue();
        if (nVar != null) {
            nVar.e(bVar.d(), j3, f11);
            nVar.draw(f1.c.a(t3));
        }
    }

    @Override // m0.e2
    public final void e() {
        l lVar = this.f2938n;
        if (lVar != null) {
            S();
            x4.c cVar = lVar.f2977j;
            n nVar = (n) ((LinkedHashMap) cVar.f8290g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f8290g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f2976i.add(nVar);
            }
        }
    }

    @Override // m0.e2
    public final void h() {
        l lVar = this.f2938n;
        if (lVar != null) {
            S();
            x4.c cVar = lVar.f2977j;
            n nVar = (n) ((LinkedHashMap) cVar.f8290g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f8290g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f2976i.add(nVar);
            }
        }
    }

    @Override // m0.e2
    public final void c() {
    }
}
