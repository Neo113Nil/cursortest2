package kotlinx.coroutines.flow;

import defpackage.j0z0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zls b;

    public k(tpr tprVar, zls zlsVar) {
        this.a = tprVar;
        this.b = zlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zls zlsVar;
        int i2;
        int i3;
        j0z0 j0z0Var;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
        try {
            if (continuation instanceof FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) {
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) continuation;
                int i4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
                    zlsVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        i2 = 0;
                        try {
                            tpr tprVar = this.a;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = 0;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 1;
                            if (tprVar.collect(vprVar, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                                i3 = 0;
                            }
                        } catch (Throwable th) {
                            th = th;
                            j0z0Var = new j0z0(th);
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = th;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i2;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 2;
                            if (e.b(j0z0Var, zlsVar, th, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th2 = (Throwable) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3;
                            kotlin.b.b(obj);
                            throw th2;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        safeCollector2 = (SafeCollector) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3;
                        try {
                            kotlin.b.b(obj);
                            safeCollector2.releaseIntercepted();
                            return zy11.a;
                        } catch (Throwable th3) {
                            th = th3;
                            safeCollector2.releaseIntercepted();
                            throw th;
                        }
                    }
                    i3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0;
                    vprVar = (vpr) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th4) {
                        i2 = i3;
                        th = th4;
                        j0z0Var = new j0z0(th);
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = th;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i2;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 2;
                        if (e.b(j0z0Var, zlsVar, th, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw th;
                    }
                    safeCollector = new SafeCollector(vprVar, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.get_context());
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = safeCollector;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i3;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
                    if (zlsVar.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = null;
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = safeCollector;
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i3;
            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
            if (zlsVar.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            th = th5;
            safeCollector2 = safeCollector;
            safeCollector2.releaseIntercepted();
            throw th;
        }
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
        zlsVar = this.b;
        if (i != 0) {
        }
        safeCollector = new SafeCollector(vprVar, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.get_context());
    }
}
