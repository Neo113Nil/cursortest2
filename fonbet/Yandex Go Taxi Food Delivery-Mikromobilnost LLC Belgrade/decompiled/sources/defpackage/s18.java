package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.c;

/* loaded from: classes4.dex */
public final class s18 implements r18 {
    public final tpr a;

    public s18(tpr tprVar) {
        this.a = tprVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object collect = this.a.collect(new c(vprVar), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
