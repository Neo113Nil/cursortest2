package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class whs implements PointerInputEventHandler {
    public final /* synthetic */ yhs a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public whs(yhs yhsVar, Function1 function1, boolean z) {
        this.a = yhsVar;
        this.b = function1;
        this.c = z;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        Object f;
        yhs yhsVar = this.a;
        Function1 function1 = this.b;
        boolean z = this.c;
        f = wna.f(pfmVar, jx9.C, new axb(yhsVar, function1, z, 2), bs5.Z, new s43(yhsVar, pfmVar, function1, z, 25), continuation);
        return f == nm6.a ? f : Unit.a;
    }
}
