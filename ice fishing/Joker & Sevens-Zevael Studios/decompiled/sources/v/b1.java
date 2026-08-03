package v;

import m0.n2;
import m0.p2;
import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b1 implements w2 {

    /* renamed from: g, reason: collision with root package name */
    public final x4.s f6777g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.l1 f6778h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.l1 f6779i;

    /* renamed from: j, reason: collision with root package name */
    public final m0.l1 f6780j;

    /* renamed from: k, reason: collision with root package name */
    public final m0.l1 f6781k;

    /* renamed from: l, reason: collision with root package name */
    public final m0.h1 f6782l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6783m;

    /* renamed from: n, reason: collision with root package name */
    public final m0.l1 f6784n;

    /* renamed from: o, reason: collision with root package name */
    public n f6785o;

    /* renamed from: p, reason: collision with root package name */
    public final m0.j1 f6786p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6787q;

    /* renamed from: r, reason: collision with root package name */
    public final o0 f6788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e1 f6789s;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public b1(e1 e1Var, Object obj, n nVar, x4.s sVar) {
        this.f6789s = e1Var;
        this.f6777g = sVar;
        m0.l1 s10 = m0.z.s(obj);
        this.f6778h = s10;
        Object obj2 = null;
        m0.l1 s11 = m0.z.s(d.i(0.0f, 0.0f, null, 7));
        this.f6779i = s11;
        this.f6780j = m0.z.s(new w0((x) s11.getValue(), sVar, obj, s10.getValue(), nVar));
        this.f6781k = m0.z.s(Boolean.TRUE);
        this.f6782l = new m0.h1(-1.0f);
        this.f6784n = m0.z.s(obj);
        this.f6785o = nVar;
        this.f6786p = new m0.j1(a().c());
        Float f10 = (Float) p1.f6943a.get(sVar);
        if (f10 != null) {
            float floatValue = f10.floatValue();
            n nVar2 = (n) ((oc.c) sVar.f8356h).invoke(obj);
            int b2 = nVar2.b();
            for (int i10 = 0; i10 < b2; i10++) {
                nVar2.e(i10, floatValue);
            }
            obj2 = ((oc.c) this.f6777g.f8357i).invoke(nVar2);
        }
        this.f6788r = d.i(0.0f, 0.0f, obj2, 3);
    }

    public final w0 a() {
        return (w0) this.f6780j.getValue();
    }

    public final float b() {
        m0.h1 h1Var = this.f6782l;
        return ((n2) w0.m.t(h1Var.f4604h, h1Var)).f4687c;
    }

    public final void c() {
        if (b() == -1.0f) {
            this.f6787q = true;
            boolean a6 = pc.j.a(a().f7006c, a().f7007d);
            m0.l1 l1Var = this.f6784n;
            if (a6) {
                l1Var.setValue(a().f7006c);
            } else {
                l1Var.setValue(a().b(0L));
                this.f6785o = a().f(0L);
            }
        }
    }

    public final void e(Object obj, boolean z10) {
        e1 e1Var = this.f6789s;
        m0.l1 l1Var = e1Var.f6830h;
        m0.l1 l1Var2 = this.f6778h;
        boolean a6 = pc.j.a(null, l1Var2.getValue());
        m0.j1 j1Var = this.f6786p;
        m0.l1 l1Var3 = this.f6780j;
        x xVar = this.f6788r;
        if (a6) {
            l1Var3.setValue(new w0(xVar, this.f6777g, obj, obj, this.f6785o.c()));
            this.f6783m = true;
            j1Var.g(a().c());
            return;
        }
        m0.l1 l1Var4 = this.f6779i;
        if (!z10 || this.f6787q) {
            xVar = (x) l1Var4.getValue();
        } else if (((x) l1Var4.getValue()) instanceof o0) {
            xVar = (x) l1Var4.getValue();
        }
        l1Var3.setValue(new w0(e1Var.e() <= 0 ? xVar : new p0(xVar, e1Var.e()), this.f6777g, obj, l1Var2.getValue(), this.f6785o));
        j1Var.g(a().c());
        this.f6783m = false;
        l1Var.setValue(Boolean.TRUE);
        if (e1Var.g()) {
            w0.q qVar = e1Var.f6831i;
            int size = qVar.size();
            long j3 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                b1 b1Var = (b1) qVar.get(i10);
                m0.j1 j1Var2 = b1Var.f6786p;
                j3 = Math.max(j3, ((p2) w0.m.t(j1Var2.f4630h, j1Var2)).f4710c);
                b1Var.c();
            }
            l1Var.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, x xVar) {
        this.f6778h.setValue(obj2);
        this.f6779i.setValue(xVar);
        if (pc.j.a(a().f7007d, obj) && pc.j.a(a().f7006c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // m0.w2
    public final Object getValue() {
        return this.f6784n.getValue();
    }

    public final String toString() {
        return "current value: " + this.f6784n.getValue() + ", target: " + this.f6778h.getValue() + ", spec: " + ((x) this.f6779i.getValue());
    }
}
