package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ska implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vka b;

    public /* synthetic */ ska(vka vkaVar, int i) {
        this.a = i;
        this.b = vkaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        vka vkaVar = this.b;
        switch (i) {
            case 0:
                return (raa) vkaVar.k.getValue();
            case 1:
                return (z66) ((yka) vkaVar.a).h.getValue();
            case 2:
                return new wo6(((yka) vkaVar.a).d);
            case 3:
                return new aaa((wca) vkaVar.g.getValue(), ((yka) vkaVar.a).e);
            case 4:
                return new cba((sga) vkaVar.h.getValue(), ((yka) vkaVar.a).e);
            case 5:
                return Boolean.valueOf(((lwc) ((yka) vkaVar.a).i.getValue()).a());
            case 6:
                return new xba(vkaVar.c, vkaVar.d, vkaVar.j, vkaVar.i);
            case 7:
                yka ykaVar = (yka) vkaVar.a;
                cc7 cc7Var = ykaVar.g;
                frt frtVar = ykaVar.e;
                ska skaVar = new ska(vkaVar, 5);
                jyr jyrVar = dzq.f;
                return new z22(cc7Var, frtVar, skaVar, quk.f());
            case 8:
                return new o62(vkaVar.a, vkaVar.b, vkaVar.c, vkaVar.d, (raa) vkaVar.k.getValue(), (c72) vkaVar.m.getValue());
            default:
                uaa uaaVar = (uaa) vkaVar.d.getValue();
                aaa aaaVar = (aaa) vkaVar.i.getValue();
                cba cbaVar = (cba) vkaVar.j.getValue();
                yka ykaVar2 = (yka) vkaVar.a;
                return new yx4(uaaVar, aaaVar, cbaVar, ykaVar2.f, ykaVar2.e);
        }
    }
}
