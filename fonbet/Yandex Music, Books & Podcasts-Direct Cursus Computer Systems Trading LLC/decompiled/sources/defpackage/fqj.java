package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class fqj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dzf b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ fqj(dzf dzfVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = dzfVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oa8 oa8Var = (oa8) obj;
        switch (this.a) {
            case 0:
                oa8Var.getClass();
                nyf lifecycle = this.b.getLifecycle();
                ltb ltbVar = new ltb(this.c, 1);
                lifecycle.a(ltbVar);
                return new mf0(9, lifecycle, ltbVar);
            default:
                oa8Var.getClass();
                nyf lifecycle2 = this.b.getLifecycle();
                ltb ltbVar2 = new ltb(this.c, 2);
                lifecycle2.a(ltbVar2);
                return new mf0(9, lifecycle2, ltbVar2);
        }
    }
}
