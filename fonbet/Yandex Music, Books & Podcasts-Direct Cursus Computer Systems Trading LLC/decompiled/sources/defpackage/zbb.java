package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class zbb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nyf b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ zbb(nyf nyfVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = nyfVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oa8 oa8Var = (oa8) obj;
        switch (this.a) {
            case 0:
                oa8Var.getClass();
                ru2 ru2Var = new ru2(1, this.c);
                nyf nyfVar = this.b;
                nyfVar.a(ru2Var);
                return new mf0(2, nyfVar, ru2Var);
            default:
                oa8Var.getClass();
                ltb ltbVar = new ltb(this.c, 0);
                nyf nyfVar2 = this.b;
                nyfVar2.a(ltbVar);
                return new mf0(3, nyfVar2, ltbVar);
        }
    }
}
