package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rmb b;
    public final /* synthetic */ thj c;

    public /* synthetic */ ae5(rmb rmbVar, thj thjVar, int i) {
        this.a = i;
        this.b = rmbVar;
        this.c = thjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                rmb rmbVar = this.b;
                thj thjVar = this.c;
                if (booleanValue) {
                    rmb.a(rmbVar, sjb.Pause, thjVar, null, 10);
                } else {
                    rmbVar.m(null, thjVar, str);
                }
                break;
            default:
                str.getClass();
                rmb rmbVar2 = this.b;
                thj thjVar2 = this.c;
                if (booleanValue) {
                    rmb.a(rmbVar2, sjb.Pause, thjVar2, null, 10);
                } else {
                    rmbVar2.m(null, thjVar2, str);
                }
                break;
        }
        return Unit.a;
    }
}
