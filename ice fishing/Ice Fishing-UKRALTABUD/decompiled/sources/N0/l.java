package N0;

import P0.AbstractC0068a;
import r0.AbstractC0239M;
import r0.C0238L;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f779f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f780g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f781h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f782i;

    public l(E0.n nVar, e eVar, D.r rVar) {
        this.f780g = nVar;
        this.f781h = eVar;
        this.f782i = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // N0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        k kVar;
        int i2;
        l lVar;
        r0.s sVar;
        int i3;
        switch (this.f779f) {
            case 0:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i4 = kVar.f778m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.f778m = i4 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f776k;
                        w0.a aVar = w0.a.f3071f;
                        i2 = kVar.f778m;
                        t0.g gVar = t0.g.f2989a;
                        if (i2 != 0) {
                            o.g.C(obj2);
                            if (((E0.n) this.f780g).f310f) {
                                kVar.f778m = 1;
                                if (((e) this.f781h).b(obj, kVar) == aVar) {
                                    return aVar;
                                }
                                return gVar;
                            }
                            kVar.f774i = this;
                            kVar.f775j = obj;
                            kVar.f778m = 2;
                            obj2 = ((D.r) this.f782i).f(obj, kVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return gVar;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f775j;
                                lVar = kVar.f774i;
                                o.g.C(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((E0.n) lVar.f780g).f310f = true;
                                    kVar.f774i = null;
                                    kVar.f775j = null;
                                    kVar.f778m = 3;
                                    if (((e) lVar.f781h).b(obj, kVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return gVar;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        o.g.C(obj2);
                        return gVar;
                    }
                }
                kVar = new k(this, dVar);
                Object obj22 = kVar.f776k;
                w0.a aVar2 = w0.a.f3071f;
                i2 = kVar.f778m;
                t0.g gVar2 = t0.g.f2989a;
                if (i2 != 0) {
                }
            case 1:
                Object b2 = O0.l.b((v0.i) this.f780g, obj, this.f781h, (O0.t) this.f782i, dVar);
                return b2 == w0.a.f3071f ? b2 : t0.g.f2989a;
            default:
                if (dVar instanceof r0.s) {
                    sVar = (r0.s) dVar;
                    int i5 = sVar.f2916j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sVar.f2916j = i5 - Integer.MIN_VALUE;
                        Object obj3 = sVar.f2915i;
                        w0.a aVar3 = w0.a.f3071f;
                        i3 = sVar.f2916j;
                        if (i3 != 0) {
                            o.g.C(obj3);
                            Double d2 = (Double) AbstractC0239M.c(((G.b) obj).c((G.d) this.f780g), ((C0238L) this.f782i).f2863h);
                            sVar.f2916j = 1;
                            if (((e) this.f781h).b(d2, sVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj3);
                        }
                        return t0.g.f2989a;
                    }
                }
                sVar = new r0.s(this, dVar);
                Object obj32 = sVar.f2915i;
                w0.a aVar32 = w0.a.f3071f;
                i3 = sVar.f2916j;
                if (i3 != 0) {
                }
                return t0.g.f2989a;
        }
    }

    public l(e eVar, G.d dVar, C0238L c0238l) {
        this.f781h = eVar;
        this.f780g = dVar;
        this.f782i = c0238l;
    }

    public l(e eVar, v0.i iVar) {
        this.f780g = iVar;
        this.f781h = AbstractC0068a.m(iVar);
        this.f782i = new O0.t(eVar, null);
    }
}
