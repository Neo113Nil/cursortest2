package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ thj d;

    public /* synthetic */ bv(j00 j00Var, jab jabVar, thj thjVar, int i) {
        this.a = i;
        this.b = j00Var;
        this.c = jabVar;
        this.d = thjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        str.getClass();
        switch (i) {
            case 0:
                this.b.b(this.c, this.d, str, booleanValue);
                break;
            case 1:
                this.b.b(this.c, this.d, str, booleanValue);
                break;
            case 2:
                this.b.b(this.c, this.d, str, booleanValue);
                break;
            default:
                this.b.b(this.c, this.d, str, booleanValue);
                break;
        }
        return Unit.a;
    }
}
