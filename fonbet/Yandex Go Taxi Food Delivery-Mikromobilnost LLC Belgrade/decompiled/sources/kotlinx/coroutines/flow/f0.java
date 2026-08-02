package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class f0 implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ vpr b;

    public f0(vpr vprVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
        this.b = vprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$chunked$2$1$emit$1 flowKt__TransformKt$chunked$2$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__TransformKt$chunked$2$1$emit$1) {
            flowKt__TransformKt$chunked$2$1$emit$1 = (FlowKt__TransformKt$chunked$2$1$emit$1) continuation;
            int i2 = flowKt__TransformKt$chunked$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__TransformKt$chunked$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$chunked$2$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = (ArrayList) ref$ObjectRef.element;
                    ArrayList arrayList2 = arrayList;
                    if (arrayList == null) {
                        ?? arrayList3 = new ArrayList(2);
                        ref$ObjectRef.element = arrayList3;
                        arrayList2 = arrayList3;
                    }
                    arrayList2.add(obj);
                    if (arrayList2.size() == 2) {
                        flowKt__TransformKt$chunked$2$1$emit$1.L$0 = null;
                        flowKt__TransformKt$chunked$2$1$emit$1.L$1 = null;
                        flowKt__TransformKt$chunked$2$1$emit$1.label = 1;
                        if (this.b.emit(arrayList2, flowKt__TransformKt$chunked$2$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                ref$ObjectRef.element = null;
                return zy11.a;
            }
        }
        flowKt__TransformKt$chunked$2$1$emit$1 = new FlowKt__TransformKt$chunked$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__TransformKt$chunked$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__TransformKt$chunked$2$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        if (i != 0) {
        }
        ref$ObjectRef2.element = null;
        return zy11.a;
    }
}
