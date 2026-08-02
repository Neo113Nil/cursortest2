package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cfm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ efm b;

    public /* synthetic */ cfm(efm efmVar, int i) {
        this.a = i;
        this.b = efmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                efm efmVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(wdm.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                wdm wdmVar = (wdm) qdcVar.C(I);
                mem memVar = efmVar.k;
                break;
            case 1:
                this.b.q.g();
                break;
            default:
                efm efmVar2 = this.b;
                efmVar2.q.f();
                x97.y(ot0.F(efmVar2), null, null, new g2l(efmVar2, null, 18), 3);
                break;
        }
        return Unit.a;
    }
}
