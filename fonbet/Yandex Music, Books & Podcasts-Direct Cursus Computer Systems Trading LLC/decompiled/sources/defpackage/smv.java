package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class smv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q0v d;

    public /* synthetic */ smv(List list, boolean z, q0v q0vVar, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = z;
        this.d = q0vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u1g.t(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            case 1:
                u1g.s(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                u1g.u(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
