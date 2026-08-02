package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ff6 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ff6(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object v = xee.v(pfmVar, new gf6(this.b, null, 0), continuation);
                nm6 nm6Var = nm6.a;
                if (v != nm6Var) {
                    v = Unit.a;
                }
                if (v != nm6Var) {
                    break;
                }
                break;
            default:
                iur iurVar = (iur) pfmVar;
                Object S0 = iurVar.S0(new gf6(this.b, null, 1), continuation);
                if (S0 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
