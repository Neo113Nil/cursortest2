package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes9.dex */
public final class s implements vpr {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ vpr b;
    public final /* synthetic */ wls c;

    public s(Ref$BooleanRef ref$BooleanRef, vpr vprVar, wls wlsVar) {
        this.a = ref$BooleanRef;
        this.b = vprVar;
        this.c = wlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        Object obj2;
        int i;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                vpr vprVar = this.b;
                Ref$BooleanRef ref$BooleanRef = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (ref$BooleanRef.element) {
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                        if (vprVar.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                            return zy11Var;
                        }
                    } else {
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = obj;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                        obj2 = this.c.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                kotlin.b.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    ref$BooleanRef.element = true;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                    if (vprVar.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        vpr vprVar2 = this.b;
        Ref$BooleanRef ref$BooleanRef2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return zy11Var2;
    }
}
