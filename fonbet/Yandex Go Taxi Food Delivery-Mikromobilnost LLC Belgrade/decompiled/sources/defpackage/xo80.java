package defpackage;

import com.yandex.go.places.impl.ui.organizations.d;
import com.yandex.go.places.impl.ui.organizations.e;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class xo80 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ xo80(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                Object Ng = d.Ng(dVar, (bn80) obj, continuation);
                return Ng == CoroutineSingletons.COROUTINE_SUSPENDED ? Ng : zy11Var;
            default:
                Pair pair = (Pair) obj;
                uc4 uc4Var = (uc4) pair.getFirst();
                float floatValue = ((Number) pair.getSecond()).floatValue();
                e eVar = dVar.L;
                boolean z = eVar.i;
                if (z) {
                    eVar.i = false;
                    z = true;
                }
                if (!z) {
                    dVar.Og(true, uc4Var, new Float(floatValue));
                }
                return zy11Var;
        }
    }
}
