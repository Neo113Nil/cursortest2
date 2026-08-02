package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class p24 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ p24(float f, Function0 function0) {
        this.c = f;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                float d = (nmq.d(np3Var.a.e()) - (((Number) this.b.invoke()).floatValue() * (np3Var.getDensity() * this.c))) / 2.0f;
                long j = d85.m;
                d85 d85Var = new d85(j);
                long j2 = d85.b;
                return np3Var.b(new s24(y9w.F(u75.h(d85Var, new d85(j2)), 0.0f, d, 10), y9w.F(u75.h(new d85(j2), new d85(j)), nmq.d(np3Var.a.e()) - d, 0.0f, 12), 0));
            default:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float c = yhn.c(((Number) this.b.invoke()).floatValue(), 0.0f, 1.0f);
                float f = this.c;
                float f2 = ((1.0f - f) * c) + f;
                zcoVar.k(f2);
                zcoVar.n(f2);
                zcoVar.a(c);
                zcoVar.y(zcoVar.q.getDensity() * 16 * (1.0f - c));
                return Unit.a;
        }
    }

    public /* synthetic */ p24(Function0 function0, float f) {
        this.b = function0;
        this.c = f;
    }
}
