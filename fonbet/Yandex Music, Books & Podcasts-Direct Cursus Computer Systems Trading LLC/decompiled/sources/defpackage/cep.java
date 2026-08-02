package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cep implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ has b;

    public /* synthetic */ cep(has hasVar, int i) {
        this.a = i;
        this.b = hasVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object w = ezf.w(pfmVar, this.b, continuation);
                if (w != nm6.a) {
                    break;
                }
                break;
            default:
                Object w2 = ezf.w(pfmVar, this.b, continuation);
                if (w2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
