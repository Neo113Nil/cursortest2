package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$ObjectRef b;

    public p(vpr vprVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = vprVar;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, zy11] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Throwable] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        int i;
        try {
            if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
                int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        vpr vprVar = this.a;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = null;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        if (vprVar.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                    }
                    this = zy11.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.b.element = th;
            throw th;
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        Object obj22 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
    }
}
