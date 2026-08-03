package v1;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import x1.k1;
import y1.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements m0.j {

    /* renamed from: g, reason: collision with root package name */
    public final x1.g0 f7052g;

    /* renamed from: h, reason: collision with root package name */
    public m0.v f7053h;

    /* renamed from: i, reason: collision with root package name */
    public x4.l f7054i;

    /* renamed from: j, reason: collision with root package name */
    public int f7055j;

    /* renamed from: k, reason: collision with root package name */
    public int f7056k;

    /* renamed from: l, reason: collision with root package name */
    public final s.g0 f7057l;

    /* renamed from: m, reason: collision with root package name */
    public final s.g0 f7058m;

    /* renamed from: n, reason: collision with root package name */
    public final v f7059n;

    /* renamed from: o, reason: collision with root package name */
    public final s f7060o;

    /* renamed from: p, reason: collision with root package name */
    public final s.g0 f7061p;

    /* renamed from: q, reason: collision with root package name */
    public final s.s0 f7062q;

    /* renamed from: r, reason: collision with root package name */
    public final s.g0 f7063r;

    /* renamed from: s, reason: collision with root package name */
    public final o0.e f7064s;

    /* renamed from: t, reason: collision with root package name */
    public int f7065t;

    /* renamed from: u, reason: collision with root package name */
    public int f7066u;

    public a0(x1.g0 g0Var, x4.l lVar) {
        this.f7052g = g0Var;
        this.f7054i = lVar;
        long[] jArr = s.o0.f6312a;
        this.f7057l = new s.g0();
        this.f7058m = new s.g0();
        this.f7059n = new v(this);
        this.f7060o = new s(this);
        this.f7061p = new s.g0();
        this.f7062q = new s.s0();
        this.f7063r = new s.g0();
        this.f7064s = new o0.e(new Object[16]);
    }

    @Override // m0.j
    public final void a() {
        m0.y yVar;
        x1.g0 g0Var = this.f7052g;
        g0Var.f8055u = true;
        s.g0 g0Var2 = this.f7057l;
        Object[] objArr = g0Var2.f6268c;
        long[] jArr = g0Var2.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128 && (yVar = ((t) objArr[(i10 << 3) + i12]).f7130c) != null) {
                            yVar.l();
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
        g0Var.N();
        g0Var.f8055u = false;
        g0Var2.a();
        this.f7058m.a();
        this.f7066u = 0;
        this.f7065t = 0;
        this.f7061p.a();
        d();
    }

    @Override // m0.j
    public final void b() {
        e(true);
    }

    public final void c(int i10) {
        boolean z10;
        boolean z11 = false;
        this.f7065t = 0;
        List n7 = this.f7052g.n();
        o0.b bVar = (o0.b) n7;
        int i11 = (bVar.f5128g.f5136i - this.f7066u) - 1;
        if (i10 <= i11) {
            this.f7062q.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object g8 = this.f7057l.g((x1.g0) bVar.get(i12));
                    pc.j.b(g8);
                    ((s.c0) this.f7062q.f6340h).a(((t) g8).f7128a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            x4.l lVar = this.f7054i;
            s.s0 s0Var = this.f7062q;
            LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f8313i;
            linkedHashMap.clear();
            Iterator it = s0Var.iterator();
            while (true) {
                s.e0 e0Var = (s.e0) it;
                if (!((wc.f) e0Var.f6256i).hasNext()) {
                    break;
                }
                Object b2 = ((b0.s) lVar.f8312h).b(((wc.f) e0Var.f6256i).next());
                Integer num = (Integer) linkedHashMap.get(b2);
                int intValue = num != null ? num.intValue() : 0;
                if (intValue == 7) {
                    e0Var.remove();
                } else {
                    linkedHashMap.put(b2, Integer.valueOf(intValue + 1));
                }
            }
            w0.g d10 = w0.r.d();
            oc.c e10 = d10 != null ? d10.e() : null;
            w0.g g10 = w0.r.g(d10);
            z10 = false;
            while (i11 >= i10) {
                try {
                    x1.g0 g0Var = (x1.g0) ((o0.b) n7).get(i11);
                    Object g11 = this.f7057l.g(g0Var);
                    pc.j.b(g11);
                    t tVar = (t) g11;
                    Object obj = tVar.f7128a;
                    if (((s.c0) this.f7062q.f6340h).c(obj)) {
                        this.f7065t++;
                        if (((Boolean) tVar.f7133f.getValue()).booleanValue()) {
                            x1.k0 k0Var = g0Var.J;
                            x1.x0 x0Var = k0Var.f8103p;
                            x1.e0 e0Var2 = x1.e0.f8021i;
                            x0Var.f8207r = e0Var2;
                            x1.t0 t0Var = k0Var.f8104q;
                            if (t0Var != null) {
                                t0Var.f8170p = e0Var2;
                            }
                            g(tVar, false);
                            if (tVar.f7134g) {
                                z10 = true;
                            }
                        }
                    } else {
                        x1.g0 g0Var2 = this.f7052g;
                        g0Var2.f8055u = true;
                        this.f7057l.k(g0Var);
                        m0.y yVar = tVar.f7130c;
                        if (yVar != null) {
                            yVar.l();
                        }
                        this.f7052g.O(i11, 1);
                        g0Var2.f8055u = false;
                    }
                    this.f7058m.k(obj);
                    i11--;
                } catch (Throwable th) {
                    w0.r.j(d10, g10, e10);
                    throw th;
                }
            }
            w0.r.j(d10, g10, e10);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (w0.m.f7580c) {
                s.h0 h0Var = w0.m.f7587j.f7547h;
                if (h0Var != null) {
                    if (h0Var.h()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                w0.m.a();
            }
        }
        d();
    }

    public final void d() {
        int i10 = ((o0.b) this.f7052g.n()).f5128g.f5136i;
        s.g0 g0Var = this.f7057l;
        if (g0Var.f6270e != i10) {
            u1.a.a("Inconsistency between the count of nodes tracked by the state (" + g0Var.f6270e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f7065t) - this.f7066u < 0) {
            u1.a.a("Incorrect state. Total children " + i10 + ". Reusable children " + this.f7065t + ". Precomposed children " + this.f7066u);
        }
        s.g0 g0Var2 = this.f7061p;
        if (g0Var2.f6270e == this.f7066u) {
            return;
        }
        u1.a.a("Incorrect state. Precomposed children " + this.f7066u + ". Map size " + g0Var2.f6270e);
    }

    public final void e(boolean z10) {
        this.f7066u = 0;
        this.f7061p.a();
        List n7 = this.f7052g.n();
        int i10 = ((o0.b) n7).f5128g.f5136i;
        if (this.f7065t != i10) {
            this.f7065t = i10;
            w0.g d10 = w0.r.d();
            oc.c e10 = d10 != null ? d10.e() : null;
            w0.g g8 = w0.r.g(d10);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    x1.g0 g0Var = (x1.g0) ((o0.b) n7).get(i11);
                    t tVar = (t) this.f7057l.g(g0Var);
                    if (tVar != null && ((Boolean) tVar.f7133f.getValue()).booleanValue()) {
                        x1.k0 k0Var = g0Var.J;
                        x1.x0 x0Var = k0Var.f8103p;
                        x1.e0 e0Var = x1.e0.f8021i;
                        x0Var.f8207r = e0Var;
                        x1.t0 t0Var = k0Var.f8104q;
                        if (t0Var != null) {
                            t0Var.f8170p = e0Var;
                        }
                        g(tVar, z10);
                        tVar.f7128a = p0.f7117a;
                    }
                } catch (Throwable th) {
                    w0.r.j(d10, g8, e10);
                    throw th;
                }
            }
            w0.r.j(d10, g8, e10);
            this.f7058m.a();
        }
        d();
    }

    public final q0 f(Object obj, oc.e eVar) {
        x1.g0 g0Var = this.f7052g;
        if (g0Var.G()) {
            d();
            if (!this.f7058m.c(obj)) {
                this.f7063r.k(obj);
                s.g0 g0Var2 = this.f7061p;
                Object g8 = g0Var2.g(obj);
                if (g8 == null) {
                    g8 = i(obj);
                    if (g8 != null) {
                        int i10 = ((o0.b) g0Var.n()).f5128g.i(g8);
                        int i11 = ((o0.b) g0Var.n()).f5128g.f5136i;
                        g0Var.f8055u = true;
                        g0Var.K(i10, i11, 1);
                        g0Var.f8055u = false;
                        this.f7066u++;
                    } else {
                        int i12 = ((o0.b) g0Var.n()).f5128g.f5136i;
                        x1.g0 g0Var3 = new x1.g0(2);
                        g0Var.f8055u = true;
                        g0Var.z(i12, g0Var3);
                        g0Var.f8055u = false;
                        this.f7066u++;
                        g8 = g0Var3;
                    }
                    g0Var2.m(obj, g8);
                }
                h((x1.g0) g8, obj, eVar);
            }
        }
        return !g0Var.G() ? new y() : new z(this, obj);
    }

    public final void g(t tVar, boolean z10) {
        m0.y yVar;
        if (z10 || !tVar.f7134g) {
            tVar.f7133f = m0.z.s(Boolean.FALSE);
        } else {
            tVar.f7133f.setValue(Boolean.FALSE);
        }
        tVar.getClass();
        if (z10) {
            m0.y yVar2 = tVar.f7130c;
            if (yVar2 != null) {
                yVar2.k();
                return;
            }
            return;
        }
        k1 outOfFrameExecutor = ((y1.r) x1.j0.a(this.f7052g)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (tVar.f7134g || (yVar = tVar.f7130c) == null) {
                return;
            }
            yVar.k();
            return;
        }
        b0.p0 p0Var = new b0.p0(15, tVar);
        Handler handler = ((y1.r) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new a1.a(14, p0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(x1.g0 g0Var, Object obj, oc.e eVar) {
        boolean z10;
        s.g0 g0Var2 = this.f7057l;
        Object g8 = g0Var2.g(g0Var);
        Object obj2 = g8;
        if (g8 == null) {
            u0.d dVar = h.f7078a;
            t tVar = new t();
            tVar.f7128a = obj;
            tVar.f7129b = dVar;
            tVar.f7130c = null;
            tVar.f7133f = m0.z.s(Boolean.TRUE);
            g0Var2.m(g0Var, tVar);
            obj2 = tVar;
        }
        t tVar2 = (t) obj2;
        boolean z11 = tVar2.f7129b != eVar;
        m0.y yVar = tVar2.f7130c;
        if (yVar != null) {
            synchronized (yVar.f4816j) {
                z10 = yVar.f4826t.f6270e > 0;
            }
        } else {
            z10 = true;
        }
        if (z11 || z10 || tVar2.f7131d) {
            tVar2.f7129b = eVar;
            w0.g d10 = w0.r.d();
            oc.c e10 = d10 != null ? d10.e() : null;
            w0.g g10 = w0.r.g(d10);
            try {
                x1.g0 g0Var3 = this.f7052g;
                g0Var3.f8055u = true;
                m0.y yVar2 = tVar2.f7130c;
                m0.v vVar = this.f7053h;
                if (vVar == null) {
                    u1.a.c("parent composition reference not set");
                    throw new ac.d();
                }
                if (yVar2 != null) {
                    if (yVar2.A == 3) {
                    }
                    tVar2.f7130c = yVar2;
                    oc.e eVar2 = tVar2.f7129b;
                    if (((y1.r) x1.j0.a(this.f7052g)).getOutOfFrameExecutor() == null) {
                        tVar2.f7134g = false;
                    } else {
                        tVar2.f7134g = true;
                        eVar2 = new u0.d(1524156494, new a1.f(8, tVar2, eVar2), true);
                    }
                    if (tVar2.f7132e) {
                        yVar2.A(eVar2);
                    } else {
                        yVar2.i();
                        yVar2.p();
                        m0.r rVar = yVar2.f4832z;
                        rVar.f4746z = 100;
                        rVar.f4745y = true;
                        yVar2.f4813g.a(yVar2, eVar2);
                        rVar.u();
                    }
                    tVar2.f7132e = false;
                    g0Var3.f8055u = false;
                    w0.r.j(d10, g10, e10);
                    tVar2.f7131d = false;
                }
                ViewGroup.LayoutParams layoutParams = b2.f8479a;
                yVar2 = new m0.y(vVar, new a5.c(g0Var));
                tVar2.f7130c = yVar2;
                oc.e eVar22 = tVar2.f7129b;
                if (((y1.r) x1.j0.a(this.f7052g)).getOutOfFrameExecutor() == null) {
                }
                if (tVar2.f7132e) {
                }
                tVar2.f7132e = false;
                g0Var3.f8055u = false;
                w0.r.j(d10, g10, e10);
                tVar2.f7131d = false;
            } catch (Throwable th) {
                w0.r.j(d10, g10, e10);
                throw th;
            }
        }
    }

    public final x1.g0 i(Object obj) {
        s.g0 g0Var;
        int i10;
        if (this.f7065t == 0) {
            return null;
        }
        x1.g0 g0Var2 = this.f7052g;
        o0.b bVar = (o0.b) g0Var2.n();
        int i11 = bVar.f5128g.f5136i - this.f7066u;
        int i12 = i11 - this.f7065t;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            g0Var = this.f7057l;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object g8 = g0Var.g((x1.g0) bVar.get(i14));
            pc.j.b(g8);
            if (((t) g8).f7128a.equals(obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                Object g10 = g0Var.g((x1.g0) bVar.get(i13));
                pc.j.b(g10);
                t tVar = (t) g10;
                Object obj2 = tVar.f7128a;
                if (obj2 != p0.f7117a) {
                    b0.s sVar = (b0.s) this.f7054i.f8312h;
                    if (!pc.j.a(sVar.b(obj), sVar.b(obj2))) {
                        i13--;
                    }
                }
                tVar.f7128a = obj;
                i14 = i13;
                i10 = i14;
                break;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            g0Var2.f8055u = true;
            g0Var2.K(i14, i12, 1);
            g0Var2.f8055u = false;
        }
        this.f7065t--;
        x1.g0 g0Var3 = (x1.g0) bVar.get(i12);
        Object g11 = g0Var.g(g0Var3);
        pc.j.b(g11);
        t tVar2 = (t) g11;
        tVar2.f7133f = m0.z.s(Boolean.TRUE);
        tVar2.f7132e = true;
        tVar2.f7131d = true;
        return g0Var3;
    }
}
