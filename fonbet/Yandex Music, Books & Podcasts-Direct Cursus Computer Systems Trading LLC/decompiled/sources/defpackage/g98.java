package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g98 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvf b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ g98(fvf fvfVar, List list, Function1 function1, Function1 function12, int i, int i2) {
        this.a = i2;
        this.b = fvfVar;
        this.c = list;
        this.d = function1;
        this.e = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                irf.f(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                irf.A(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                irf.z(this.b, this.c, this.d, this.e, (hq5) obj, R3);
                break;
            default:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(1);
                irf.e(this.b, this.c, this.d, this.e, (hq5) obj, R4);
                break;
        }
        return Unit.a;
    }
}
