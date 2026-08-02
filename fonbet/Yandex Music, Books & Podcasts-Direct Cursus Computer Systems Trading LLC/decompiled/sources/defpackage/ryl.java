package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ryl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ fvf c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ryl(yci yciVar, fvf fvfVar, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = yciVar;
        this.c = fvfVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                azl.a(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                zyl.a(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
