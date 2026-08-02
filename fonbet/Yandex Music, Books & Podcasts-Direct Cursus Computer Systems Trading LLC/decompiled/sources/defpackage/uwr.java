package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class uwr implements PointerInputEventHandler {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ ywr b;
    public final /* synthetic */ Function0 c;

    public uwr(Function1 function1, ywr ywrVar, Function0 function0) {
        this.a = function1;
        this.b = ywrVar;
        this.c = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        Object e = g6s.e(pfmVar, null, null, new twr(pfmVar, this.a, this.b, this.c), continuation, 7);
        return e == nm6.a ? e : Unit.a;
    }
}
