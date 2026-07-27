package O0;

import Q0.AbstractC0068a;
import r0.J;
import r0.K;
import t0.C0252g;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f787e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f788f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f789g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f790h;

    public l(E0.n nVar, e eVar, D.r rVar) {
        this.f788f = nVar;
        this.f789g = eVar;
        this.f790h = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // O0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        k kVar;
        int i2;
        l lVar;
        r0.q qVar;
        int i3;
        switch (this.f787e) {
            case 0:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i4 = kVar.f786l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.f786l = i4 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f784j;
                        w0.a aVar = w0.a.f3076e;
                        i2 = kVar.f786l;
                        C0252g c0252g = C0252g.f2994a;
                        if (i2 != 0) {
                            o.g.z(obj2);
                            if (((E0.n) this.f788f).f311e) {
                                kVar.f786l = 1;
                                if (((e) this.f789g).b(obj, kVar) == aVar) {
                                    return aVar;
                                }
                                return c0252g;
                            }
                            kVar.f782h = this;
                            kVar.f783i = obj;
                            kVar.f786l = 2;
                            obj2 = ((D.r) this.f790h).f(obj, kVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return c0252g;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f783i;
                                lVar = kVar.f782h;
                                o.g.z(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((E0.n) lVar.f788f).f311e = true;
                                    kVar.f782h = null;
                                    kVar.f783i = null;
                                    kVar.f786l = 3;
                                    if (((e) lVar.f789g).b(obj, kVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return c0252g;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        o.g.z(obj2);
                        return c0252g;
                    }
                }
                kVar = new k(this, dVar);
                Object obj22 = kVar.f784j;
                w0.a aVar2 = w0.a.f3076e;
                i2 = kVar.f786l;
                C0252g c0252g2 = C0252g.f2994a;
                if (i2 != 0) {
                }
            case 1:
                Object b2 = P0.l.b((v0.i) this.f788f, obj, this.f789g, (P0.t) this.f790h, dVar);
                return b2 == w0.a.f3076e ? b2 : C0252g.f2994a;
            default:
                if (dVar instanceof r0.q) {
                    qVar = (r0.q) dVar;
                    int i5 = qVar.f2915i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.f2915i = i5 - Integer.MIN_VALUE;
                        Object obj3 = qVar.f2914h;
                        w0.a aVar3 = w0.a.f3076e;
                        i3 = qVar.f2915i;
                        if (i3 != 0) {
                            o.g.z(obj3);
                            Double d2 = (Double) K.c(((G.b) obj).c((G.d) this.f788f), ((J) this.f790h).f2865g);
                            qVar.f2915i = 1;
                            if (((e) this.f789g).b(d2, qVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj3);
                        }
                        return C0252g.f2994a;
                    }
                }
                qVar = new r0.q(this, dVar);
                Object obj32 = qVar.f2914h;
                w0.a aVar32 = w0.a.f3076e;
                i3 = qVar.f2915i;
                if (i3 != 0) {
                }
                return C0252g.f2994a;
        }
    }

    public l(e eVar, G.d dVar, J j2) {
        this.f789g = eVar;
        this.f788f = dVar;
        this.f790h = j2;
    }

    public l(e eVar, v0.i iVar) {
        this.f788f = iVar;
        this.f789g = AbstractC0068a.m(iVar);
        this.f790h = new P0.t(eVar, null);
    }
}
