package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class r9b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ wn5 c;

    public /* synthetic */ r9b(Function0 function0, wn5 wn5Var, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u2x.o(this.b, this.c, hq5Var, rvf.R(49));
                break;
            default:
                s9b.a(this.b, this.c, hq5Var, rvf.R(49));
                break;
        }
        return Unit.a;
    }
}
