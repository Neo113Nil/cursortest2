package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class vmb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cvo b;
    public final /* synthetic */ nab c;
    public final /* synthetic */ thj d;
    public final /* synthetic */ int e;
    public final /* synthetic */ u0s f;
    public final /* synthetic */ fcc g;

    public /* synthetic */ vmb(cvo cvoVar, nab nabVar, thj thjVar, int i, u0s u0sVar, fcc fccVar, int i2) {
        this.a = i2;
        this.b = cvoVar;
        this.c = nabVar;
        this.d = thjVar;
        this.e = i;
        this.f = u0sVar;
        this.g = fccVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                String concat = " on ".concat(zwf.J(this.b));
                nab nabVar = this.c;
                String concat2 = " in ".concat(zwf.H(nabVar));
                thj thjVar = this.d;
                String concat3 = thjVar == null ? "" : " for ".concat(zwf.S(thjVar, nabVar, Integer.valueOf(this.e)));
                u0s u0sVar = this.f;
                String concat4 = u0sVar == null ? "" : " with ".concat(zwf.K(u0sVar));
                fcc fccVar = this.g;
                StringBuilder m = f1d.m("Hidden", concat2, concat3, concat4, fccVar != null ? " by ".concat(zwf.I(fccVar)) : "");
                m.append(concat);
                return m.toString();
            default:
                String concat5 = " on ".concat(zwf.J(this.b));
                nab nabVar2 = this.c;
                String concat6 = " in ".concat(zwf.H(nabVar2));
                thj thjVar2 = this.d;
                String concat7 = thjVar2 == null ? "" : " for ".concat(zwf.S(thjVar2, nabVar2, Integer.valueOf(this.e)));
                u0s u0sVar2 = this.f;
                String concat8 = u0sVar2 == null ? "" : " with ".concat(zwf.K(u0sVar2));
                fcc fccVar2 = this.g;
                StringBuilder m2 = f1d.m("Showed", concat6, concat7, concat8, fccVar2 != null ? " by ".concat(zwf.I(fccVar2)) : "");
                m2.append(concat5);
                return m2.toString();
        }
    }
}
