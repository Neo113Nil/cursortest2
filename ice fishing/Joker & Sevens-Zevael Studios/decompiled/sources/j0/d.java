package j0;

import v.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f3304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v.c f3305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f3306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f3307j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y.h f3308k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v.c cVar, float f10, boolean z10, g0 g0Var, y.h hVar, fc.d dVar) {
        super(2, dVar);
        this.f3305h = cVar;
        this.f3306i = f10;
        this.f3307j = z10;
        this.f3308k = hVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new d(this.f3305h, this.f3306i, this.f3307j, null, this.f3308k, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if ((r0 instanceof y.d) != false) goto L44;
     */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e10;
        int i10 = this.f3304g;
        ac.o oVar = ac.o.f277a;
        if (i10 == 0) {
            v6.a.W(obj);
            v.c cVar = this.f3305h;
            float f10 = ((s2.f) cVar.f6794e.getValue()).f6387g;
            float f11 = this.f3306i;
            if (!s2.f.a(f10, f11)) {
                boolean z10 = this.f3307j;
                gc.a aVar = gc.a.f2559g;
                if (z10) {
                    float f12 = ((s2.f) cVar.f6794e.getValue()).f6387g;
                    h1 h1Var = null;
                    y.h kVar = s2.f.a(f12, 0.0f) ? new y.k(0L) : s2.f.a(f12, 0.0f) ? new y.f() : s2.f.a(f12, 0.0f) ? new y.d() : null;
                    this.f3304g = 2;
                    h1 h1Var2 = k0.b.f3587b;
                    h1 h1Var3 = k0.b.f3586a;
                    y.h hVar = this.f3308k;
                    if (hVar != null) {
                        if ((hVar instanceof y.k) || (hVar instanceof y.b) || (hVar instanceof y.f) || (hVar instanceof y.d)) {
                            h1Var = h1Var3;
                        }
                    } else if (kVar != null) {
                        if (!(kVar instanceof y.k) && !(kVar instanceof y.b)) {
                            if (kVar instanceof y.f) {
                                h1Var = k0.b.f3588c;
                            }
                        }
                        h1Var = h1Var2;
                    }
                    if (h1Var == null ? (e10 = cVar.e(new s2.f(f11), this)) != aVar : (e10 = v.c.c(cVar, new s2.f(f11), h1Var, null, this, 12)) != aVar) {
                        e10 = oVar;
                    }
                    if (e10 != aVar) {
                        return oVar;
                    }
                } else {
                    s2.f fVar = new s2.f(f11);
                    this.f3304g = 1;
                    if (cVar.e(fVar, this) == aVar) {
                    }
                }
                return aVar;
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        return oVar;
    }
}
