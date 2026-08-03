package cd;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f implements s {

    /* renamed from: g, reason: collision with root package name */
    public final fc.i f1348g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1349h;

    /* renamed from: i, reason: collision with root package name */
    public final ad.a f1350i;

    /* renamed from: j, reason: collision with root package name */
    public final bd.e f1351j;

    public f(bd.e eVar, fc.i iVar, int i10, ad.a aVar) {
        this.f1348g = iVar;
        this.f1349h = i10;
        this.f1350i = aVar;
        this.f1351j = eVar;
    }

    public abstract f a(fc.i iVar, int i10, ad.a aVar);

    public bd.e b() {
        return null;
    }

    @Override // bd.e
    public final Object c(bd.f fVar, fc.d dVar) {
        int i10 = this.f1349h;
        gc.a aVar = gc.a.f2559g;
        fc.d dVar2 = null;
        ac.o oVar = ac.o.f277a;
        if (i10 == -3) {
            fc.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            yc.r rVar = yc.r.f8894i;
            fc.i iVar = this.f1348g;
            fc.i d10 = !((Boolean) iVar.i(bool, rVar)).booleanValue() ? context.d(iVar) : yc.a0.h(context, iVar, false);
            if (pc.j.a(d10, context)) {
                Object d11 = d(fVar, dVar);
                if (d11 == aVar) {
                    return d11;
                }
            } else {
                fc.e eVar = fc.e.f2347g;
                if (pc.j.a(d10.v(eVar), context.v(eVar))) {
                    fc.i context2 = dVar.getContext();
                    if (!(fVar instanceof z ? true : fVar instanceof u)) {
                        fVar = new bd.i(fVar, context2);
                    }
                    Object a6 = c.a(d10, fVar, dd.a.k(d10), new e(this, dVar2, 1), dVar);
                    if (a6 == aVar) {
                        return a6;
                    }
                }
            }
        }
        Object e10 = yc.a0.e(new c0.c(fVar, this, dVar2, 1), dVar);
        if (e10 != aVar) {
            e10 = oVar;
        }
        return e10 == aVar ? e10 : oVar;
    }

    public abstract Object d(bd.f fVar, fc.d dVar);

    public final String e() {
        ArrayList arrayList = new ArrayList(4);
        fc.j jVar = fc.j.f2348g;
        fc.i iVar = this.f1348g;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i10 = this.f1349h;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        ad.a aVar = ad.a.f280g;
        ad.a aVar2 = this.f1350i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + bc.m.W(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // cd.s
    public final bd.e l(fc.i iVar, int i10, ad.a aVar) {
        fc.i iVar2 = this.f1348g;
        fc.i d10 = iVar.d(iVar2);
        ad.a aVar2 = ad.a.f280g;
        ad.a aVar3 = this.f1350i;
        int i11 = this.f1349h;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = aVar3;
        }
        return (pc.j.a(d10, iVar2) && i10 == i11 && aVar == aVar3) ? this : a(d10, i10, aVar);
    }

    public final String toString() {
        return this.f1351j + " -> " + e();
    }
}
