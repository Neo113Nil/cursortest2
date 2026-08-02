package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.e;
import ru.yandex.taxi.logistics.sdk.management.c;

/* loaded from: classes9.dex */
public final class rth implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0v0 b;

    public /* synthetic */ rth(k0v0 k0v0Var, int i) {
        this.a = i;
        this.b = k0v0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k0v0 k0v0Var = this.b;
        switch (i) {
            case 0:
                CoroutineSingletons m = n0.m(k0v0Var, new c(vprVar), continuation);
                return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11Var;
            default:
                CoroutineSingletons m2 = n0.m(k0v0Var, new e(vprVar), continuation);
                return m2 == CoroutineSingletons.COROUTINE_SUSPENDED ? m2 : zy11Var;
        }
    }
}
