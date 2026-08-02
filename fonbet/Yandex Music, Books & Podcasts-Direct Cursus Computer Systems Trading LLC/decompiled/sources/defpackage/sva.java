package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class sva implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e2o c;

    public /* synthetic */ sva(boolean z, e2o e2oVar, int i) {
        this.a = i;
        this.b = z;
        this.c = e2oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e2o e2oVar;
        e2o e2oVar2;
        int i = this.a;
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        switch (i) {
            case 0:
                float e = (!this.b || (e2oVar = this.c) == null) ? 0.0f : e2oVar.g.e();
                zcoVar.y(fxf.I(zcoVar.q.getDensity() * tva.e, zcoVar.q.getDensity() * tva.f, e));
                zcoVar.k(fxf.I(1.0f, (zcoVar.q.getDensity() * tva.c) / (zcoVar.q.getDensity() * tva.a), e));
                zcoVar.n(fxf.I(1.0f, (zcoVar.q.getDensity() * tva.d) / (zcoVar.q.getDensity() * tva.b), e));
                zcoVar.v(v5g.g(0.5f, 0.0f));
                break;
            case 1:
                float e2 = (!this.b || (e2oVar2 = this.c) == null) ? 0.0f : e2oVar2.g.e();
                zcoVar.y(fxf.I(zcoVar.q.getDensity() * tva.e, zcoVar.q.getDensity() * tva.f, e2));
                zcoVar.k(fxf.I(1.0f, (zcoVar.q.getDensity() * tva.c) / (zcoVar.q.getDensity() * tva.a), e2));
                zcoVar.n(fxf.I(1.0f, (zcoVar.q.getDensity() * tva.d) / (zcoVar.q.getDensity() * tva.b), e2));
                zcoVar.v(v5g.g(0.5f, 0.0f));
                break;
            default:
                float e3 = this.c.g.e();
                if (!this.b) {
                    e3 = 1.0f;
                }
                zcoVar.a(yhn.c((e3 - 0.375f) / 0.625f, 0.0f, 1.0f));
                break;
        }
        return Unit.a;
    }
}
