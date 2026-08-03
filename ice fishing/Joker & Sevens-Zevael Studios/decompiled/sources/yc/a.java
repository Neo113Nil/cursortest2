package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a extends k1 implements fc.d, y {

    /* renamed from: i, reason: collision with root package name */
    public final fc.i f8817i;

    public a(fc.i iVar, boolean z10) {
        super(z10);
        P((b1) iVar.v(v.f8910h));
        this.f8817i = iVar.d(this);
    }

    @Override // yc.k1
    public final String D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // yc.k1
    public final void O(ac.d dVar) {
        a0.m(this.f8817i, dVar);
    }

    @Override // yc.k1
    public final void X(Object obj) {
        if (!(obj instanceof p)) {
            e0(obj);
        } else {
            p pVar = (p) obj;
            d0(pVar.f8889a, p.f8888b.get(pVar) != 0);
        }
    }

    @Override // yc.y
    public final fc.i f() {
        return this.f8817i;
    }

    public final void f0(z zVar, a aVar, oc.e eVar) {
        Object invoke;
        int ordinal = zVar.ordinal();
        if (ordinal == 0) {
            i7.b.E(eVar, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                pc.j.e(eVar, "<this>");
                bc.a0.w(bc.a0.h(aVar, this, eVar)).resumeWith(ac.o.f277a);
                return;
            }
            if (ordinal != 3) {
                throw new ac.d();
            }
            try {
                fc.i iVar = this.f8817i;
                Object l10 = dd.a.l(iVar, null);
                try {
                    if (eVar instanceof hc.a) {
                        pc.v.c(2, eVar);
                        invoke = eVar.invoke(aVar, this);
                    } else {
                        invoke = bc.a0.M(eVar, aVar, this);
                    }
                    dd.a.f(iVar, l10);
                    if (invoke != gc.a.f2559g) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    dd.a.f(iVar, l10);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(v6.a.s(th2));
            }
        }
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f8817i;
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        Throwable a6 = ac.l.a(obj);
        if (a6 != null) {
            obj = new p(a6, false);
        }
        Object T = T(obj);
        if (T == a0.f8822e) {
            return;
        }
        z(T);
    }

    public void e0(Object obj) {
    }

    public void d0(Throwable th, boolean z10) {
    }
}
