package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pn4 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ aqi c;

    public pn4(aqi aqiVar, Function1 function1) {
        this.c = aqiVar;
        this.b = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        Object f;
        switch (this.a) {
            case 0:
                Object e = g6s.e(pfmVar, null, null, new al(28, this.c, this.b), continuation, 7);
                if (e != nm6.a) {
                    break;
                }
                break;
            default:
                Function1 function1 = this.b;
                aqi aqiVar = this.c;
                f = wna.f(pfmVar, jx9.C, new ftr(1, pfmVar, function1, aqiVar), bs5.Z, new o7n(aqiVar, 3), continuation);
                if (f != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public pn4(Function1 function1, aqi aqiVar) {
        this.b = function1;
        this.c = aqiVar;
    }
}
