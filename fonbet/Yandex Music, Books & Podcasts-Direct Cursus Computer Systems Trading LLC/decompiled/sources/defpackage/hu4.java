package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hu4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ hu4(float f, float f2, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ild.n(this.b, this.c, hq5Var, rvf.R(55));
                break;
            default:
                weo.m(this.b, this.c, hq5Var, rvf.R(55));
                break;
        }
        return Unit.a;
    }
}
