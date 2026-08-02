package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class myl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzl b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ thj d;

    public /* synthetic */ myl(qzl qzlVar, jab jabVar, thj thjVar, int i) {
        this.a = i;
        this.b = qzlVar;
        this.c = jabVar;
        this.d = thjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                this.b.c(this.c, this.d, null, str, booleanValue);
                break;
            default:
                str.getClass();
                this.b.c(this.c, this.d, null, str, booleanValue);
                break;
        }
        return Unit.a;
    }
}
