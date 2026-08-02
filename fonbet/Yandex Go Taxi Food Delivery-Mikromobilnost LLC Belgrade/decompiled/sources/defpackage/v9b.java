package defpackage;

import com.yandex.messaging.internal.authorized.chat.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class v9b implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ rol0 b;

    public /* synthetic */ v9b(rol0 rol0Var, int i) {
        this.a = i;
        this.b = rol0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        rol0 rol0Var = this.b;
        switch (i) {
            case 0:
                Object collect = rol0Var.collect(new d(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = rol0Var.collect(new androidx.compose.material.d(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
