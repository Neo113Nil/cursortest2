package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qz3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b04 b;
    public final /* synthetic */ List c;

    public /* synthetic */ qz3(b04 b04Var, List list, int i, int i2) {
        this.a = i2;
        this.b = b04Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vq2.n(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                vq2.i(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
