package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wls b;

    public z(vpr vprVar, wls wlsVar) {
        this.a = vprVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1) {
            flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 = (FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1) continuation;
            int i3 = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$0 = null;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$1 = null;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$2 = null;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$4 = vprVar2;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.I$0 = 0;
                    flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label = 1;
                    Object invoke = this.b.invoke(obj, flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1);
                    if (invoke != coroutineSingletons) {
                        vprVar = vprVar2;
                        obj2 = invoke;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.I$0;
                vprVar = (vpr) flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$0 = null;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$1 = null;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$2 = null;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$3 = null;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$4 = null;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.I$0 = i2;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label = 2;
            }
        }
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1(this, continuation);
        Object obj22 = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$0 = null;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$1 = null;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$2 = null;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$3 = null;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.L$4 = null;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.I$0 = i2;
        flowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1.label = 2;
    }
}
