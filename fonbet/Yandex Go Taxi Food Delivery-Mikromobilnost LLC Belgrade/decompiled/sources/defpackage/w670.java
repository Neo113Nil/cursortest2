package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.f;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.g;

/* loaded from: classes5.dex */
public final class w670 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ c9x0 c;

    public /* synthetic */ w670(n4u0 n4u0Var, c9x0 c9x0Var, int i) {
        this.a = i;
        this.b = n4u0Var;
        this.c = c9x0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c9x0 c9x0Var = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new f(vprVar, c9x0Var), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new g(vprVar, c9x0Var), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
