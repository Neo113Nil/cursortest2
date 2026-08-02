package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class v implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ wls b;

    public v(tpr tprVar, wls wlsVar) {
        this.a = tprVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1;
        int i;
        w wVar;
        if (continuation instanceof FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) {
            flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 = (FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) continuation;
            int i2 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr tprVar = this.a;
                    w wVar2 = new w(vprVar, this.b);
                    try {
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$3 = null;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$4 = null;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$5 = wVar2;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.I$0 = 0;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.I$1 = 0;
                        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label = 1;
                        if (tprVar.collect(wVar2, flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (AbortFlowException e) {
                        e = e;
                        wVar = wVar2;
                        if (e.a == wVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.get_context());
                        return zy11.a;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wVar = (w) flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$5;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.a == wVar) {
                        }
                    }
                }
                return zy11.a;
            }
        }
        flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
