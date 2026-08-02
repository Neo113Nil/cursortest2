package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class iu4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ iu4(float f, float f2, int i, int i2, yci yciVar) {
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ild.f(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                weo.b(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
