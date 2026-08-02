package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements tpr {
    public final /* synthetic */ tls a;

    public f(tls tlsVar) {
        this.a = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1;
        int i;
        int i2;
        if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1) {
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1) continuation;
            int i3 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$0 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$1 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$2 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = vprVar;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = 0;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 1;
                    Object invoke = this.a.invoke(flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1);
                    if (invoke != coroutineSingletons) {
                        obj = invoke;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                i2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0;
                vprVar = (vpr) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3;
                kotlin.b.b(obj);
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$0 = null;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$1 = null;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$2 = null;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = null;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = i2;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 2;
            }
        }
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1(this, continuation);
        Object obj2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
        if (i != 0) {
        }
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$0 = null;
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$1 = null;
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$2 = null;
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = null;
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = i2;
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 2;
    }
}
