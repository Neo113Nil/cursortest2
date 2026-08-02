package defpackage;

import com.yandex.passport.internal.ui.challenge.delete.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ai6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ai6(int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                cds cdsVar = (cds) obj2;
                ((mn0) obj).getClass();
                cdsVar.getClass();
                this.b.invoke(cdsVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                wyf.e(this.b, (hq5) obj, R);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                bzf.c(this.b, (hq5) obj, R2);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((String) obj2).getClass();
                this.b.invoke(bool);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                g.b(this.b, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ai6(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }
}
