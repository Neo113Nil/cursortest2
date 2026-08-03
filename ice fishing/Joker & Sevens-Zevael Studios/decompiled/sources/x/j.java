package x;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public pc.p f7822g;

    /* renamed from: h, reason: collision with root package name */
    public v.i f7823h;

    /* renamed from: i, reason: collision with root package name */
    public int f7824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7825j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f7826k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v0 f7827l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(float f10, k kVar, v0 v0Var, fc.d dVar) {
        super(2, dVar);
        this.f7825j = f10;
        this.f7826k = kVar;
        this.f7827l = v0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new j(this.f7825j, this.f7826k, this.f7827l, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        v.i iVar;
        pc.p pVar;
        int i10 = this.f7824i;
        if (i10 == 0) {
            v6.a.W(obj);
            f10 = this.f7825j;
            if (Math.abs(f10) > 1.0f) {
                pc.p pVar2 = new pc.p();
                pVar2.f5680g = f10;
                pc.p pVar3 = new pc.p();
                x4.s sVar = v.i1.f6863a;
                iVar = new v.i(sVar, Float.valueOf(0.0f), new v.j(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    k kVar = this.f7826k;
                    v.t tVar = kVar.f7834a;
                    b0.v vVar = new b0.v(pVar3, this.f7827l, pVar2, kVar, 4);
                    this.f7822g = pVar2;
                    this.f7823h = iVar;
                    this.f7824i = 1;
                    Object b2 = v.d.b(iVar, new v.s(tVar, sVar, iVar.f6857h.getValue(), iVar.f6858i), Long.MIN_VALUE, vVar, this);
                    Object obj2 = gc.a.f2559g;
                    if (b2 != obj2) {
                        b2 = ac.o.f277a;
                    }
                    if (b2 == obj2) {
                        return obj2;
                    }
                    pVar = pVar2;
                } catch (CancellationException unused) {
                    pVar = pVar2;
                    pVar.f5680g = ((Number) ((oc.c) iVar.f6856g.f8357i).invoke(iVar.f6858i)).floatValue();
                    f10 = pVar.f5680g;
                    return new Float(f10);
                }
            }
            return new Float(f10);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iVar = this.f7823h;
        pVar = this.f7822g;
        try {
            v6.a.W(obj);
        } catch (CancellationException unused2) {
            pVar.f5680g = ((Number) ((oc.c) iVar.f6856g.f8357i).invoke(iVar.f6858i)).floatValue();
            f10 = pVar.f5680g;
            return new Float(f10);
        }
        f10 = pVar.f5680g;
        return new Float(f10);
    }
}
