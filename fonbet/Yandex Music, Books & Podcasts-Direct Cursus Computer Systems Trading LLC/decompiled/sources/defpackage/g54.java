package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class g54 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g54(gq4 gq4Var, int i, float f, Function1 function1, Function0 function0) {
        this.d = gq4Var;
        this.b = i;
        this.c = f;
        this.e = function1;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.d;
                sdr sdrVar = (sdr) this.e;
                sdr sdrVar2 = (sdr) this.f;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float m = o3kVar.m(this.b);
                zcoVar.k(((Number) sdrVar.getValue()).floatValue());
                zcoVar.n(((Number) sdrVar.getValue()).floatValue());
                zcoVar.a(((Number) sdrVar2.getValue()).floatValue());
                zcoVar.y(Math.abs(yhn.c(m, -1.0f, 1.0f)) * zcoVar.q.getDensity() * this.c);
                zcoVar.j(yhn.c(m, -1.0f, 1.0f) * 5.0f);
                return Unit.a;
            default:
                gq4 gq4Var = (gq4) this.d;
                Function1 function1 = (Function1) this.e;
                Function0 function0 = (Function0) this.f;
                float c = yhn.c(((Float) obj).floatValue(), ((Number) gq4Var.g()).floatValue(), ((Number) gq4Var.m()).floatValue());
                int i2 = this.b;
                boolean z = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float f = c;
                    float f2 = f;
                    int i3 = 0;
                    while (true) {
                        float I = fxf.I(((Number) gq4Var.g()).floatValue(), ((Number) gq4Var.m()).floatValue(), i3 / i);
                        float f3 = I - c;
                        if (Math.abs(f3) <= f) {
                            f = Math.abs(f3);
                            f2 = I;
                        }
                        if (i3 != i) {
                            i3++;
                        } else {
                            c = f2;
                        }
                    }
                }
                if (c != this.c) {
                    function1.invoke(Float.valueOf(c));
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ g54(o3k o3kVar, int i, sdr sdrVar, sdr sdrVar2, float f) {
        this.d = o3kVar;
        this.b = i;
        this.e = sdrVar;
        this.f = sdrVar2;
        this.c = f;
    }
}
