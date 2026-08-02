package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d2d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2d b;

    public /* synthetic */ d2d(g2d g2dVar, int i, int i2) {
        this.a = i2;
        this.b = g2dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                y2x.g(this.b, hq5Var, rvf.R(1));
                break;
            default:
                bcx.i(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
