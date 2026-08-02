package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class v34 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kkp b;

    public /* synthetic */ v34(kkp kkpVar, int i) {
        this.a = i;
        this.b = kkpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new x34(this.b);
            default:
                kkp kkpVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(t35.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ikg a = ((t35) qdcVar.C(I)).a();
                bdt I2 = hag.I(q34.class);
                qdc qdcVar2 = a.a;
                qdcVar2.getClass();
                fnb fnbVar = (fnb) kkpVar.c;
                fnbVar.getClass();
                return new y34(fnbVar);
        }
    }
}
