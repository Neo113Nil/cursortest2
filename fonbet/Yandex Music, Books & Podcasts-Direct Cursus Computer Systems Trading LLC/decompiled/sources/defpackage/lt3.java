package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class lt3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe3 b;
    public final /* synthetic */ m c;
    public final /* synthetic */ raa d;
    public final /* synthetic */ eca e;

    public /* synthetic */ lt3(qe3 qe3Var, m mVar, raa raaVar, eca ecaVar, int i) {
        this.a = i;
        this.b = qe3Var;
        this.c = mVar;
        this.d = raaVar;
        this.e = ecaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection collection;
        switch (this.a) {
            case 0:
                qe3 qe3Var = this.b;
                m mVar = this.c;
                raa raaVar = this.d;
                eca ecaVar = this.e;
                qe3Var.a(sjb.DeleteDownload);
                mVar.e();
                eca ecaVar2 = eca.d;
                ArrayList a = ecaVar.a();
                hca hcaVar = ecaVar.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(xba.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                wba a2 = ((xba) qdcVar.C(I)).a(a, hcaVar);
                if (!(a2 instanceof vba)) {
                    if (!(a2 instanceof tba)) {
                        if (!(a2 instanceof sba) && !a2.equals(uba.a)) {
                            b6e.s();
                            break;
                        } else {
                            collection = c5b.a;
                        }
                    } else {
                        collection = ((tba) a2).a;
                    }
                } else {
                    collection = ((vba) a2).b;
                }
                ((taa) raaVar).c(d51.j(collection));
                break;
            default:
                qe3 qe3Var2 = this.b;
                m mVar2 = this.c;
                raa raaVar2 = this.d;
                eca ecaVar3 = this.e;
                qe3Var2.a(sjb.DeleteDownload);
                mVar2.e();
                ((taa) raaVar2).c(ecaVar3);
                break;
        }
        return Unit.a;
    }
}
