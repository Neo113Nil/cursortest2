package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xgs implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ahs b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ xgs(ahs ahsVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = ahsVar;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                avf.l(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                avf.k(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
