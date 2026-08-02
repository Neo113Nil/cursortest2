package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.a;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public final class rol0 extends a {
    public final wls a;

    public rol0(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public final Object d(SafeCollector safeCollector, Continuation continuation) {
        Object invoke = this.a.invoke(safeCollector, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : zy11.a;
    }
}
