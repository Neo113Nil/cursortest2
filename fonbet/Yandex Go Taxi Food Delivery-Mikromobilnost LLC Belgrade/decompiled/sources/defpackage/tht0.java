package defpackage;

import com.yandex.go.preorder.navigation.n;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class tht0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ tht0(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ut utVar;
        ut utVar2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                ac60 ac60Var = (ac60) obj;
                ite0 ite0Var = new ite0(ac60Var.a, ac60Var.b);
                h0g h0gVar = nVar.s0;
                if (h0gVar != null && (utVar = h0gVar.g6) != null) {
                    nVar.D((m950) utVar.get(), ite0Var, new sht0(nVar));
                    break;
                }
                break;
            default:
                mte0 mte0Var = new mte0((q521) obj);
                h0g h0gVar2 = nVar.s0;
                if (h0gVar2 != null && (utVar2 = h0gVar2.g6) != null) {
                    nVar.D((m950) utVar2.get(), mte0Var, new sht0(nVar));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
