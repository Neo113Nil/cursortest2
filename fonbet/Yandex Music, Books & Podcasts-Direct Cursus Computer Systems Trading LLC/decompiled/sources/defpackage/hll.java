package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class hll implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ hll(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object h = wna.h(pfmVar, null, new zk(27, this.b), continuation, 7);
                if (h != nm6.a) {
                    break;
                }
                break;
            default:
                Object h2 = wna.h(pfmVar, null, new zk(28, this.b), continuation, 7);
                if (h2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
