package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ul6 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ul6(bfi bfiVar, has hasVar) {
        this.a = 1;
        this.c = bfiVar;
        this.b = hasVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object Q = gld.Q(new v24(pfmVar, (has) this.b, (qbs) this.c, (Continuation) null, 2), continuation);
                if (Q != nm6.a) {
                    break;
                }
                break;
            case 1:
                iur iurVar = (iur) pfmVar;
                iurVar.getClass();
                Object v = xee.v(pfmVar, new rna((bfi) this.c, new x0(bcx.F(iurVar).A), (has) this.b, null), continuation);
                if (v != nm6.a) {
                    break;
                }
                break;
            default:
                Object v2 = xee.v(pfmVar, new zqc((xep) this.b, (dep) this.c, null, 5), continuation);
                if (v2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ul6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
