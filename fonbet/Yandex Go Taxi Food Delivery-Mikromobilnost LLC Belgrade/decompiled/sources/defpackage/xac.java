package defpackage;

import com.yandex.plus.home.common.utils.flow.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.v;

/* loaded from: classes2.dex */
public final class xac implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ xac(v vVar, int i) {
        this.a = i;
        this.b = vVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v vVar = this.b;
        switch (i) {
            case 0:
                Object collect = vVar.collect(new a(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = vVar.collect(new com.yandex.plus.core.data.pay.a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
