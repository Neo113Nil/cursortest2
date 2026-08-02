package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n83 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jab b;
    public final /* synthetic */ thj c;
    public final /* synthetic */ u0s d;
    public final /* synthetic */ bcj e;

    public /* synthetic */ n83(bcj bcjVar, jab jabVar, thj thjVar, u0s u0sVar, int i) {
        this.a = i;
        this.e = bcjVar;
        this.b = jabVar;
        this.c = thjVar;
        this.d = u0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ((va3) this.e).b(this.b, this.c, this.d, str, booleanValue);
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                rbm.b((rbm) this.e, str2, booleanValue2, this.b, this.c, this.d);
                break;
        }
        return Unit.a;
    }
}
