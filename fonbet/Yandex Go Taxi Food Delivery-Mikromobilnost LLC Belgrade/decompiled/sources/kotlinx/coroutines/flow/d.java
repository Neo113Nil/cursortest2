package kotlinx.coroutines.flow;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ vpr c;

    public d(b2k b2kVar, Ref$ObjectRef ref$ObjectRef, vpr vprVar) {
        this.a = b2kVar;
        this.b = ref$ObjectRef;
        this.c = vprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = distinctFlowImpl$collect$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = distinctFlowImpl$collect$2$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                b2k b2kVar = this.a;
                ?? invoke = b2kVar.b.invoke(obj);
                Ref$ObjectRef ref$ObjectRef = this.b;
                T t = ref$ObjectRef.element;
                if (t == vez0.b || !((Boolean) b2kVar.c.invoke(t, invoke)).booleanValue()) {
                    ref$ObjectRef.element = invoke;
                    distinctFlowImpl$collect$2$emit$1.L$0 = null;
                    distinctFlowImpl$collect$2$emit$1.L$1 = null;
                    distinctFlowImpl$collect$2$emit$1.label = 1;
                    if (this.c.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
        Object obj22 = distinctFlowImpl$collect$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = distinctFlowImpl$collect$2$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
