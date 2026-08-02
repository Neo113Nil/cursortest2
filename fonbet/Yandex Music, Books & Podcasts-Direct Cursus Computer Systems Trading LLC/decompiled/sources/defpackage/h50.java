package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h50(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.i(jfpVar, new ky4(1, this.b.size()));
                wfp.x(jfpVar, -2.0f);
                break;
            case 1:
                poa poaVar = (poa) obj;
                poaVar.getClass();
                for (Pair pair : this.b) {
                    poaVar.a(pair.a, ((Number) pair.b).floatValue());
                }
                break;
            case 2:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.l(jfpVar2, this.b);
                break;
            case 3:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.i(jfpVar3, new ky4(1, this.b.size()));
                break;
            case 4:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.i(jfpVar4, new ky4(this.b.size(), 1));
                break;
            case 5:
                sci sciVar = (sci) obj;
                sciVar.getClass();
                List list = this.b;
                if (!list.isEmpty()) {
                    rld[] rldVarArr = (rld[]) list.toArray(new rld[0]);
                    z75.u(sciVar.b, (rld[]) Arrays.copyOf(rldVarArr, rldVarArr.length));
                }
                break;
            case 6:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.l(jfpVar5, this.b);
                break;
            case 7:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.l(jfpVar6, this.b);
                break;
            case 8:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.i(jfpVar7, new ky4(1, this.b.size()));
                break;
            default:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.i(jfpVar8, new ky4(1, this.b.size()));
                break;
        }
        return Unit.a;
    }
}
