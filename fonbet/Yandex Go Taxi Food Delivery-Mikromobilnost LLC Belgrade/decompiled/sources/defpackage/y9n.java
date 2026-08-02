package defpackage;

import com.yandex.messaging.domain.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.logistics.sdk.cargo_form.core.impl.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.e;

/* loaded from: classes5.dex */
public final class y9n implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ y9n(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                Object collect = gVar.collect(new e(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = gVar.collect(new b(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            default:
                Object collect3 = gVar.collect(new c(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
        }
    }
}
