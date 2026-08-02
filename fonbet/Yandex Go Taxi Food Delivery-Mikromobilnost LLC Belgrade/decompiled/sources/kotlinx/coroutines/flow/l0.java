package kotlinx.coroutines.flow;

import defpackage.hrv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public final class l0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$IntRef b;

    public l0(vpr vprVar, Ref$IntRef ref$IntRef) {
        this.a = vprVar;
        this.b = ref$IntRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            int i2 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Ref$IntRef ref$IntRef = this.b;
                    int i3 = ref$IntRef.element;
                    ref$IntRef.element = i3 + 1;
                    if (i3 < 0) {
                        w511.w("Index overflow has happened");
                        return null;
                    }
                    hrv hrvVar = new hrv(i3, obj);
                    flowKt__TransformKt$withIndex$1$1$emit$1.L$0 = null;
                    flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
                    if (this.a.emit(hrvVar, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
