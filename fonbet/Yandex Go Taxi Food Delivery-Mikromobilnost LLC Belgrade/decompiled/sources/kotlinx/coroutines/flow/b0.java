package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class b0 implements vpr {
    public final /* synthetic */ wls a;
    public final /* synthetic */ Ref$ObjectRef b;

    public b0(wls wlsVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = wlsVar;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 flowKt__ReduceKt$first$$inlined$collectWhile$2$1;
        Object obj2;
        int i;
        T t;
        if (continuation instanceof FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) {
            flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) continuation;
            int i2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$0 = null;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$1 = null;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$2 = obj;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.I$0 = 0;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label = 1;
                    obj2 = this.a.invoke(obj, flowKt__ReduceKt$first$$inlined$collectWhile$2$1);
                    t = obj;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$2;
                    kotlin.b.b(obj2);
                    t = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return zy11.a;
                }
                this.b.element = t;
                throw new AbortFlowException(this);
            }
        }
        flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
        obj2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
