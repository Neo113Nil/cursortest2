package defpackage;

import androidx.datastore.core.e;
import com.yandex.quark.webchat.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class vpg implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jqr b;

    public /* synthetic */ vpg(jqr jqrVar, int i) {
        this.a = i;
        this.b = jqrVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jqr jqrVar = this.b;
        switch (i) {
            case 0:
                Object collect = jqrVar.collect(new e(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = jqrVar.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
