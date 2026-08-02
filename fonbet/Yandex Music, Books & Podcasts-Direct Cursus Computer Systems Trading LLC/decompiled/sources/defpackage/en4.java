package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class en4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ en4(fk0 fk0Var, int i) {
        this.a = i;
        this.b = fk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        switch (i) {
            case 0:
                fk0 fk0Var = this.b;
                zcoVar.n(((Number) fk0Var.e()).floatValue());
                zcoVar.k(((Number) fk0Var.e()).floatValue());
                break;
            case 1:
                zcoVar.a(((Number) this.b.e()).floatValue());
                break;
            default:
                zcoVar.v(v5g.g(0.65f, 0.5f));
                fk0 fk0Var2 = this.b;
                zcoVar.k(((Number) fk0Var2.e()).floatValue());
                zcoVar.n(((Number) fk0Var2.e()).floatValue());
                break;
        }
        return Unit.a;
    }
}
