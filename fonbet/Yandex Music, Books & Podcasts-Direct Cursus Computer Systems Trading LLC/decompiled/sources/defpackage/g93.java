package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va3 b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ thj d;
    public final /* synthetic */ u0s e;

    public /* synthetic */ g93(va3 va3Var, jab jabVar, thj thjVar, u0s u0sVar, int i) {
        this.a = i;
        this.b = va3Var;
        this.c = jabVar;
        this.d = thjVar;
        this.e = u0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        str.getClass();
        switch (i) {
            case 0:
                this.b.b(this.c, this.d, this.e, str, booleanValue);
                break;
            default:
                this.b.b(this.c, this.d, this.e, str, booleanValue);
                break;
        }
        return Unit.a;
    }
}
