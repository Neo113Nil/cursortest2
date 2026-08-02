package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class k0 implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ zls b;
    public final /* synthetic */ vpr c;

    public k0(zls zlsVar, Ref$ObjectRef ref$ObjectRef, vpr vprVar) {
        this.a = ref$ObjectRef;
        this.b = zlsVar;
        this.c = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r7.c.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            int i2 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef2 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ref$ObjectRef2.element;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = ref$ObjectRef2;
                    flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
                    Object invoke = this.b.invoke(obj3, obj, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (invoke != coroutineSingletons) {
                        ref$ObjectRef = ref$ObjectRef2;
                        t = invoke;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                kotlin.b.b(obj2);
                t = obj2;
                ref$ObjectRef.element = t;
                Object obj4 = ref$ObjectRef2.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef22 = this.a;
        if (i != 0) {
        }
        ref$ObjectRef.element = t;
        Object obj42 = ref$ObjectRef22.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
    }
}
