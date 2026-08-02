package defpackage;

import android.graphics.RuntimeShader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class kz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz4(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((aqi) this.c).setValue(yhn.a(new cma(((cma) obj).a - this.b), new cma(0)));
                return Unit.a;
            case 1:
                eoe eoeVar = (eoe) this.c;
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                return Integer.valueOf(jx7Var.L(eoeVar.d() + this.b));
            case 2:
                sdr sdrVar = (sdr) this.c;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.y(((Number) sdrVar.getValue()).floatValue() * this.b);
                return Unit.a;
            case 3:
                e2o e2oVar = (e2o) this.c;
                poa poaVar = (poa) obj;
                poaVar.getClass();
                d2o d2oVar = d2o.a;
                float e = e2oVar.c.e();
                float f = this.b;
                poaVar.a(d2oVar, f - (e * f));
                poaVar.a(d2o.b, f - (e2oVar.b.e() * f));
                poaVar.a(d2o.c, f);
                return Unit.a;
            case 4:
                fk0 fk0Var = (fk0) this.c;
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                float floatValue = ((Number) fk0Var.e()).floatValue();
                zcoVar2.a(floatValue);
                zcoVar2.y((1 - floatValue) * this.b);
                return Unit.a;
            default:
                return wjv.a((RuntimeShader) this.c, this.b, (zco) obj);
        }
    }

    public /* synthetic */ kz4(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
