package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.d;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.f;

/* loaded from: classes5.dex */
public final class sip0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4u0 b;

    public /* synthetic */ sip0(n4u0 n4u0Var, int i) {
        this.a = i;
        this.b = n4u0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n4u0 n4u0Var = this.b;
        switch (i) {
            case 0:
                Object collect = n4u0Var.collect(new d(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = n4u0Var.collect(new f(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
