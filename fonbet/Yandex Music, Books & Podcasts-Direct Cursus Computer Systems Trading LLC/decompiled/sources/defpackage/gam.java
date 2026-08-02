package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class gam implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbm b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ thj d;
    public final /* synthetic */ u0s e;

    public /* synthetic */ gam(rbm rbmVar, jab jabVar, thj thjVar, u0s u0sVar, int i) {
        this.a = i;
        this.b = rbmVar;
        this.c = jabVar;
        this.d = thjVar;
        this.e = u0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                rbm.b(this.b, str, booleanValue, this.c, this.d, this.e);
                break;
            case 1:
                str.getClass();
                rbm.b(this.b, str, booleanValue, this.c, this.d, this.e);
                break;
            default:
                str.getClass();
                rbm.b(this.b, str, booleanValue, this.c, this.d, this.e);
                break;
        }
        return Unit.a;
    }
}
