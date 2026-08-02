package kotlinx.coroutines.flow.internal;

import defpackage.sb2;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class k implements tpr {
    public final /* synthetic */ zls a;

    public k(zls zlsVar) {
        this.a = zlsVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.a, vprVar, null);
        zpr zprVar = new zpr(continuation.get_context(), continuation);
        Object H = sb2.H(zprVar, true, zprVar, flowCoroutineKt$scopedFlow$1$1);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : zy11.a;
    }
}
