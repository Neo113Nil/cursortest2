package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class umb implements Function0 {
    public final /* synthetic */ cvo a;
    public final /* synthetic */ nab b;
    public final /* synthetic */ thj c;
    public final /* synthetic */ int d;
    public final /* synthetic */ u0s e;
    public final /* synthetic */ fcc f;
    public final /* synthetic */ kmb g;
    public final /* synthetic */ sjb h;

    public umb(cvo cvoVar, nab nabVar, thj thjVar, int i, u0s u0sVar, fcc fccVar, kmb kmbVar, sjb sjbVar) {
        this.a = cvoVar;
        this.b = nabVar;
        this.c = thjVar;
        this.d = i;
        this.e = u0sVar;
        this.f = fccVar;
        this.g = kmbVar;
        this.h = sjbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String concat = " on ".concat(zwf.J(this.a));
        nab nabVar = this.b;
        String concat2 = " in ".concat(zwf.H(nabVar));
        thj thjVar = this.c;
        String concat3 = thjVar == null ? "" : " for ".concat(zwf.S(thjVar, nabVar, Integer.valueOf(this.d)));
        u0s u0sVar = this.e;
        String concat4 = u0sVar == null ? "" : " with ".concat(zwf.K(u0sVar));
        fcc fccVar = this.f;
        return ((Object) (avf.z(this.g.a) + "(type=" + this.h + ")")) + concat2 + concat3 + concat4 + (fccVar != null ? " by ".concat(zwf.I(fccVar)) : "") + concat;
    }
}
