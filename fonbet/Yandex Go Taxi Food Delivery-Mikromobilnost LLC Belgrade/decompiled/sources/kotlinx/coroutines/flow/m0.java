package kotlinx.coroutines.flow;

import defpackage.qqr;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class m0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ zls c;

    public m0(tpr tprVar, tpr tprVar2, zls zlsVar) {
        this.a = tprVar;
        this.b = tprVar2;
        this.c = zlsVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object a = kotlinx.coroutines.flow.internal.j.a(vprVar, qqr.b, new FlowKt__ZipKt$combine$1$1(this.c, null), continuation, new tpr[]{this.a, this.b});
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
