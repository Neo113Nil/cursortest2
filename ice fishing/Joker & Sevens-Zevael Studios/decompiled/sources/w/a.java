package w;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import v.i1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7360g;

    /* renamed from: h, reason: collision with root package name */
    public int f7361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7362i;

    /* renamed from: j, reason: collision with root package name */
    public Object f7363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7364k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, long j3, Object obj2, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7360g = i10;
        this.f7364k = obj;
        this.f7362i = j3;
        this.f7365l = obj2;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7360g) {
            case 0:
                return new a((q) this.f7364k, this.f7362i, (y.i) this.f7365l, dVar, 0);
            default:
                a aVar = new a((x.z0) this.f7364k, this.f7362i, (pc.p) this.f7365l, dVar, 1);
                aVar.f7363j = obj;
                return aVar;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7360g) {
            case 0:
                return ((a) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            default:
                return ((a) create((x.x0) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        x1.c1 c1Var;
        y0.m mVar;
        y.k kVar;
        int i10 = this.f7360g;
        o0.e eVar = null;
        Object obj2 = this.f7365l;
        long j3 = this.f7362i;
        gc.a aVar = gc.a.f2559g;
        int i11 = 1;
        Object obj3 = this.f7364k;
        ac.o oVar = ac.o.f277a;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                int i12 = this.f7361h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    pc.o oVar2 = new pc.o();
                    b1.d dVar = new b1.d(oVar2);
                    if (!qVar.f8443g.f8456t) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    y0.m mVar2 = qVar.f8443g.f8447k;
                    x1.g0 v10 = x1.f.v(qVar);
                    while (v10 != null) {
                        if ((v10.I.f7991f.f8446j & 262144) != 0) {
                            while (mVar2 != null) {
                                if ((mVar2.f8445i & 262144) != 0) {
                                    o0.e eVar2 = eVar;
                                    x1.m mVar3 = mVar2;
                                    while (mVar3 != 0) {
                                        if (mVar3 instanceof z1) {
                                            z1 z1Var = (z1) mVar3;
                                            if ((x.j0.f7828v.equals(z1Var.r()) ? ((Boolean) dVar.invoke(z1Var)).booleanValue() : i11) == 0) {
                                                if (!oVar2.f5679g) {
                                                    int i13 = r.f7490b;
                                                    if (!qVar.f8443g.f8456t) {
                                                        u1.a.b("Cannot get View because the Modifier node is not currently attached.");
                                                    }
                                                    ViewParent parent = ((View) x1.j0.a(x1.f.v(qVar))).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (viewGroup.shouldDelayChildPressedState()) {
                                                            z11 = true;
                                                            if (!z11) {
                                                                z10 = false;
                                                                if (z10) {
                                                                    long j6 = r.f7489a;
                                                                    this.f7361h = 1;
                                                                    if (yc.a0.f(j6, this) == aVar) {
                                                                        return aVar;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                    z11 = false;
                                                    if (!z11) {
                                                    }
                                                }
                                                z10 = true;
                                                if (z10) {
                                                }
                                            }
                                        } else {
                                            if (((mVar3.f8445i & 262144) != 0 ? i11 : 0) != 0 && (mVar3 instanceof x1.m)) {
                                                y0.m mVar4 = mVar3.f8110v;
                                                int i14 = 0;
                                                mVar = mVar3;
                                                while (mVar4 != null) {
                                                    if (((mVar4.f8445i & 262144) != 0 ? i11 : 0) != 0) {
                                                        i14++;
                                                        if (i14 == i11) {
                                                            mVar = mVar4;
                                                        } else {
                                                            o0.e eVar3 = eVar2 == null ? new o0.e(new y0.m[16]) : eVar2;
                                                            if (mVar != null) {
                                                                eVar3.b(mVar);
                                                                mVar = null;
                                                            }
                                                            eVar3.b(mVar4);
                                                            eVar2 = eVar3;
                                                        }
                                                    }
                                                    mVar4 = mVar4.f8448l;
                                                    i11 = 1;
                                                    mVar = mVar;
                                                }
                                                int i15 = i11;
                                                if (i14 == i15) {
                                                    i11 = i15;
                                                    mVar3 = mVar;
                                                }
                                            }
                                        }
                                        mVar = x1.f.f(eVar2);
                                        i11 = 1;
                                        mVar3 = mVar;
                                    }
                                }
                                mVar2 = mVar2.f8447k;
                                eVar = null;
                                i11 = 1;
                            }
                        }
                        v10 = v10.s();
                        mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
                        eVar = null;
                        i11 = 1;
                    }
                    if (!oVar2.f5679g) {
                    }
                    z10 = true;
                    if (z10) {
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar = (y.k) this.f7363j;
                        v6.a.W(obj);
                        qVar.F = kVar;
                        return oVar;
                    }
                    v6.a.W(obj);
                }
                kVar = new y.k(j3);
                this.f7363j = kVar;
                this.f7361h = 2;
                if (((y.i) obj2).a(kVar, this) == aVar) {
                    return aVar;
                }
                qVar.F = kVar;
                return oVar;
            default:
                x.z0 z0Var = (x.z0) obj3;
                int i16 = this.f7361h;
                if (i16 == 0) {
                    v6.a.W(obj);
                    x.x0 x0Var = (x.x0) this.f7363j;
                    float f10 = z0Var.f(j3);
                    j5.e eVar4 = new j5.e((pc.p) obj2, z0Var, x0Var, 4);
                    this.f7361h = 1;
                    v.o0 i17 = v.d.i(0.0f, 0.0f, null, 7);
                    x4.s sVar = i1.f6863a;
                    Float f11 = new Float(0.0f);
                    Float f12 = new Float(f10);
                    v.j jVar = new v.j(new Float(0.0f).floatValue());
                    Object b2 = v.d.b(new v.i(sVar, f11, jVar, 56), new v.w0(i17, sVar, f11, f12, jVar), Long.MIN_VALUE, new a0.a0(eVar4), this);
                    if (b2 != aVar) {
                        b2 = oVar;
                    }
                    if (b2 != aVar) {
                        b2 = oVar;
                    }
                    if (b2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return oVar;
        }
    }
}
