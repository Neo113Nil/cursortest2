package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class t implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ int b;

    public t(tpr tprVar, int i) {
        this.a = tprVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1$1;
        int i;
        Object obj;
        if (continuation instanceof FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) {
            flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = (FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) continuation;
            int i2 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = new Object();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    try {
                        tpr tprVar = this.a;
                        u uVar = new u(ref$IntRef, this.b, vprVar, obj3);
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$3 = obj3;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$4 = null;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.I$0 = 0;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label = 1;
                        if (tprVar.collect(uVar, flowKt__LimitKt$take$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (AbortFlowException e) {
                        e = e;
                        obj = obj3;
                        if (e.a != obj) {
                            throw e;
                        }
                        return zy11.a;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$3;
                    try {
                        kotlin.b.b(obj2);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.a != obj) {
                        }
                        return zy11.a;
                    }
                }
                return zy11.a;
            }
        }
        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj22 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
