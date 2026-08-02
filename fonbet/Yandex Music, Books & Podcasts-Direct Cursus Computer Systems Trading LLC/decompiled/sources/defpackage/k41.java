package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k41 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;
    public final /* synthetic */ r21 c;
    public final /* synthetic */ int d;

    public /* synthetic */ k41(d41 d41Var, r21 r21Var, int i, int i2) {
        this.a = i2;
        this.b = d41Var;
        this.c = r21Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                this.b.d(this.c.a, this.d, booleanValue, str);
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                this.b.d(this.c.a, this.d, booleanValue2, str2);
                break;
        }
        return Unit.a;
    }
}
