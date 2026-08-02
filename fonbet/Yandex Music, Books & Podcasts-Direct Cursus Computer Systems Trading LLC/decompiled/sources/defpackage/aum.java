package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class aum implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ cum b;

    public /* synthetic */ aum(cum cumVar, int i) {
        this.a = i;
        this.b = cumVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                x66 x66Var = (x66) obj;
                cum cumVar = this.b;
                gum gumVar = cumVar.k;
                if (gumVar != null) {
                    gumVar.a(x66Var.a);
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (!((h9m) ((byb) qdcVar.C(I)).b(h9m.class)).h() && x66Var.a) {
                    ((g5k) cumVar.m.getValue()).a();
                }
                break;
            default:
                ((Boolean) obj).getClass();
                cum cumVar2 = this.b;
                gum gumVar2 = cumVar2.k;
                if (gumVar2 != null) {
                    gumVar2.i.v(cumVar2.a());
                }
                break;
        }
        return Unit.a;
    }
}
