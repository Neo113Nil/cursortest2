package defpackage;

import com.yandex.messaging.internal.translator.c;
import com.yandex.messaging.internal.translator.d;
import com.yandex.messaging.internal.translator.g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class z4t implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ g c;

    public /* synthetic */ z4t(tpr tprVar, g gVar, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = gVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new c(vprVar, gVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new d(vprVar, gVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
