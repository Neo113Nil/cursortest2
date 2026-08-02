package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class d0 implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ zls b;

    public d0(Ref$ObjectRef ref$ObjectRef, zls zlsVar) {
        this.a = ref$ObjectRef;
        this.b = zlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            int i2 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = flowKt__ReduceKt$reduce$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$reduce$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ref$ObjectRef = this.a;
                    Object obj4 = ref$ObjectRef.element;
                    t = obj;
                    if (obj4 != vez0.b) {
                        flowKt__ReduceKt$reduce$2$emit$1.L$0 = null;
                        flowKt__ReduceKt$reduce$2$emit$1.L$1 = ref$ObjectRef;
                        flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                        Object invoke = this.b.invoke(obj4, obj, flowKt__ReduceKt$reduce$2$emit$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj2 = invoke;
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.element = t;
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$1;
                kotlin.b.b(obj3);
                obj2 = obj3;
                ref$ObjectRef = ref$ObjectRef2;
                t = obj2;
                ref$ObjectRef.element = t;
                return zy11.a;
            }
        }
        flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        Object obj32 = flowKt__ReduceKt$reduce$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i != 0) {
        }
        ref$ObjectRef = ref$ObjectRef2;
        t = obj2;
        ref$ObjectRef.element = t;
        return zy11.a;
    }
}
