package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class f3j extends bfu {
    public final sdk k;
    public final z03 l;
    public final voi m;
    public final voi n;
    public final voi o;
    public final boolean p;

    public f3j(sdk sdkVar, hek hekVar, z03 z03Var, osh oshVar, noo nooVar) {
        sdkVar.getClass();
        hekVar.getClass();
        z03Var.getClass();
        oshVar.getClass();
        this.k = sdkVar;
        this.l = z03Var;
        voi voiVar = new voi();
        this.m = voiVar;
        voi voiVar2 = new voi();
        this.n = voiVar2;
        this.o = new voi();
        String str = (String) nooVar.a("ARG_VERIFY_CARD_ID");
        if (str == null || StringsKt.U(str)) {
            this.p = false;
            z03Var.h = new g8c(this);
            z03Var.a(oshVar, new efo(10, z03Var), new sld(12, z03Var), new ix6(11, z03Var));
            hek.f(hekVar, (lw3) z03Var.b);
            return;
        }
        this.p = true;
        hek.f(hekVar, new lw3(3, this));
        voiVar.l(ox3.a);
        voiVar2.l(kv3.a);
        ((tdk) sdkVar).h.e(new hw3(str), new qzc(17, this));
    }
}
