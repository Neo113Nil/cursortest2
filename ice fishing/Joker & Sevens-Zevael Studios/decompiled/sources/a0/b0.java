package a0;

import b0.u0;
import m0.d1;
import m0.i1;
import m0.l1;
import m0.z0;
import w.p0;
import x.t0;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 implements t0 {

    /* renamed from: w, reason: collision with root package name */
    public static final v0.j f15w;

    /* renamed from: a, reason: collision with root package name */
    public final a f16a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17b;

    /* renamed from: c, reason: collision with root package name */
    public s f18c;

    /* renamed from: d, reason: collision with root package name */
    public final u f19d;

    /* renamed from: e, reason: collision with root package name */
    public final l1 f20e;

    /* renamed from: f, reason: collision with root package name */
    public final y.i f21f;

    /* renamed from: g, reason: collision with root package name */
    public float f22g;

    /* renamed from: h, reason: collision with root package name */
    public final d8.m f23h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24i;

    /* renamed from: j, reason: collision with root package name */
    public g0 f25j;

    /* renamed from: k, reason: collision with root package name */
    public final x f26k;

    /* renamed from: l, reason: collision with root package name */
    public final b0.d f27l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f28m;

    /* renamed from: n, reason: collision with root package name */
    public final b0.j f29n;

    /* renamed from: o, reason: collision with root package name */
    public final b0.d0 f30o;

    /* renamed from: p, reason: collision with root package name */
    public final f8.c f31p;

    /* renamed from: q, reason: collision with root package name */
    public final b0.a0 f32q;

    /* renamed from: r, reason: collision with root package name */
    public final d1 f33r;

    /* renamed from: s, reason: collision with root package name */
    public final l1 f34s;

    /* renamed from: t, reason: collision with root package name */
    public final l1 f35t;

    /* renamed from: u, reason: collision with root package name */
    public final d1 f36u;

    /* renamed from: v, reason: collision with root package name */
    public v.i f37v;

    static {
        q qVar = q.f97i;
        ae.b bVar = new ae.b(v.f140g);
        pc.v.c(1, qVar);
        f15w = new v0.j(bVar, qVar);
    }

    public b0(int i10, int i11) {
        a aVar = new a();
        aVar.f2a = -1;
        this.f16a = aVar;
        u uVar = new u();
        uVar.f136b = new i1(i10);
        uVar.f137c = new i1(i11);
        uVar.f139e = new b0.y(i10);
        this.f19d = uVar;
        s sVar = e0.f43b;
        z0 z0Var = z0.f4841i;
        this.f20e = new l1(sVar, z0Var);
        this.f21f = new y.i();
        this.f23h = new d8.m(new a0(0, this));
        this.f24i = true;
        this.f26k = new x(this);
        this.f27l = new b0.d();
        this.f28m = new androidx.compose.foundation.lazy.layout.a();
        this.f29n = new b0.j(0);
        this.f30o = new b0.d0(new w(this, i10));
        this.f31p = new f8.c(1, this);
        this.f32q = new b0.a0();
        ac.o oVar = ac.o.f277a;
        this.f33r = new l1(oVar, z0Var);
        Boolean bool = Boolean.FALSE;
        this.f34s = m0.z.s(bool);
        this.f35t = m0.z.s(bool);
        this.f36u = new l1(oVar, z0Var);
        this.f37v = new v.i(v.i1.f6863a, Float.valueOf(0.0f), new v.j(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // x.t0
    public final boolean a() {
        return ((Boolean) this.f35t.getValue()).booleanValue();
    }

    @Override // x.t0
    public final boolean b() {
        return this.f23h.b();
    }

    @Override // x.t0
    public final boolean c() {
        return ((Boolean) this.f34s.getValue()).booleanValue();
    }

    @Override // x.t0
    public final float d(float f10) {
        return this.f23h.d(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r8.e(r6, r7, r0) != r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // x.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(p0 p0Var, oc.e eVar, hc.c cVar) {
        y yVar;
        int i10;
        b0 b0Var;
        oc.e eVar2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.f149l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f149l = i11 - Integer.MIN_VALUE;
                Object obj = yVar.f147j;
                i10 = yVar.f149l;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    yVar.f144g = this;
                    yVar.f145h = p0Var;
                    yVar.f146i = (hc.j) eVar;
                    yVar.f149l = 1;
                    if (this.f27l.f(yVar) != aVar) {
                        b0Var = this;
                        eVar2 = eVar;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return ac.o.f277a;
                }
                oc.e eVar3 = (oc.e) yVar.f146i;
                p0Var = yVar.f145h;
                b0Var = yVar.f144g;
                v6.a.W(obj);
                eVar2 = eVar3;
                d8.m mVar = b0Var.f23h;
                yVar.f144g = null;
                yVar.f145h = null;
                yVar.f146i = null;
                yVar.f149l = 2;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f147j;
        i10 = yVar.f149l;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        d8.m mVar2 = b0Var.f23h;
        yVar.f144g = null;
        yVar.f145h = null;
        yVar.f146i = null;
        yVar.f149l = 2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(s sVar, boolean z10, boolean z11) {
        t tVar = sVar.f103a;
        if (!z10 && this.f17b) {
            this.f18c = sVar;
            return;
        }
        if (z10) {
            this.f17b = true;
        }
        ?? r42 = sVar.f112j;
        this.f35t.setValue(Boolean.valueOf(((tVar != null ? tVar.f120a : 0) == 0 && sVar.f104b == 0) ? false : true));
        this.f34s.setValue(Boolean.valueOf(sVar.f105c));
        this.f22g -= sVar.f106d;
        this.f20e.setValue(sVar);
        u uVar = this.f19d;
        fc.d dVar = null;
        if (z11) {
            int i10 = sVar.f104b;
            if (i10 < 0.0f) {
                uVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
            }
            ((i1) uVar.f137c).h(i10);
        } else {
            uVar.getClass();
            uVar.f138d = tVar != null ? tVar.f126g : null;
            if (uVar.f135a || sVar.f115m > 0) {
                uVar.f135a = true;
                int i11 = sVar.f104b;
                if (i11 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i11 + ')').toString());
                }
                uVar.h(tVar != null ? tVar.f120a : 0, i11);
            }
            if (this.f24i) {
                a aVar = this.f16a;
                if (aVar.f2a != -1 && !r42.isEmpty()) {
                    if (aVar.f2a != (aVar.f4c ? ((t) bc.m.X(r42)).f120a + 1 : ((t) bc.m.T(r42)).f120a - 1)) {
                        aVar.f2a = -1;
                        b0.c0 c0Var = aVar.f3b;
                        if (c0Var != null) {
                            c0Var.cancel();
                        }
                        aVar.f3b = null;
                    }
                }
            }
        }
        if (z10) {
            float f10 = sVar.f107e;
            s2.c cVar = sVar.f110h;
            yc.y yVar = sVar.f109g;
            if (f10 <= cVar.x(e0.f42a)) {
                return;
            }
            w0.g d10 = w0.r.d();
            oc.c e10 = d10 != null ? d10.e() : null;
            w0.g g8 = w0.r.g(d10);
            try {
                float floatValue = ((Number) this.f37v.f6857h.getValue()).floatValue();
                v.i iVar = this.f37v;
                boolean z12 = iVar.f6861l;
                if (z12) {
                    this.f37v = new v.i(iVar.f6856g, Float.valueOf(floatValue - f10), new v.j(((v.j) iVar.f6858i).f6872a), iVar.f6859j, iVar.f6860k, z12);
                    yc.a0.q(yVar, null, new z(this, dVar, 1), 3);
                } else {
                    this.f37v = new v.i(v.i1.f6863a, Float.valueOf(-f10), null, 60);
                    yc.a0.q(yVar, null, new z(this, dVar, 2), 3);
                }
                w0.r.j(d10, g8, e10);
            } catch (Throwable th) {
                w0.r.j(d10, g8, e10);
                throw th;
            }
        }
    }

    public final s g() {
        return (s) this.f20e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, s sVar) {
        b0.c0 c0Var;
        b0.c0 c0Var2;
        b0.c0 c0Var3;
        b0.c0 c0Var4;
        if (this.f24i) {
            ?? r02 = sVar.f112j;
            ?? r12 = sVar.f112j;
            if (r02.isEmpty()) {
                return;
            }
            boolean z10 = f10 < 0.0f;
            int i10 = z10 ? ((t) bc.m.X(r12)).f120a + 1 : ((t) bc.m.T(r12)).f120a - 1;
            if (i10 < 0 || i10 >= sVar.f115m) {
                return;
            }
            a aVar = this.f16a;
            if (i10 != aVar.f2a) {
                if (aVar.f4c != z10 && (c0Var4 = aVar.f3b) != null) {
                    c0Var4.cancel();
                }
                aVar.f4c = z10;
                aVar.f2a = i10;
                b0 b0Var = (b0) this.f31p.f2340h;
                w0.g d10 = w0.r.d();
                oc.c e10 = d10 != null ? d10.e() : null;
                w0.g g8 = w0.r.g(d10);
                try {
                    long j3 = ((s) b0Var.f20e.getValue()).f111i;
                    w0.r.j(d10, g8, e10);
                    b0.d0 d0Var = b0Var.f30o;
                    a5.c cVar = d0Var.f815c;
                    if (cVar != null) {
                        c0Var3 = new u0(cVar, i10, j3, d0Var.f814b);
                        b0.b bVar = (b0.b) cVar.f263i;
                        bVar.f800h.b(c0Var3);
                        if (!bVar.f801i) {
                            bVar.f801i = true;
                            bVar.f799g.post(bVar);
                        }
                    } else {
                        c0Var3 = b0.g.f821a;
                    }
                    aVar.f3b = c0Var3;
                } catch (Throwable th) {
                    w0.r.j(d10, g8, e10);
                    throw th;
                }
            }
            if (!z10) {
                if (sVar.f113k - ((t) bc.m.T(r12)).f129j >= f10 || (c0Var = aVar.f3b) == null) {
                    return;
                }
                c0Var.a();
                return;
            }
            t tVar = (t) bc.m.X(r12);
            if (((tVar.f129j + tVar.f130k) + sVar.f118p) - sVar.f114l >= (-f10) || (c0Var2 = aVar.f3b) == null) {
                return;
            }
            c0Var2.a();
        }
    }
}
