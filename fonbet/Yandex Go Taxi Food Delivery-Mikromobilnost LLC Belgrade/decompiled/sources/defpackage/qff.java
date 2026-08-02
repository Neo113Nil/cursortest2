package defpackage;

import com.yandex.messaging.domain.folders.b;
import com.ybsdk.screens.upgrade.domain.interactors.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class qff implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ gci0 b;

    public /* synthetic */ qff(gci0 gci0Var, int i) {
        this.a = i;
        this.b = gci0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gci0 gci0Var = this.b;
        switch (i) {
            case 0:
                Object collect = gci0Var.a.collect(new b(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = gci0Var.a.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
