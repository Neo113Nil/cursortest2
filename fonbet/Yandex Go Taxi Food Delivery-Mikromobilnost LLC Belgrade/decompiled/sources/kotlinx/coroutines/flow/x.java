package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class x implements vpr {
    public final /* synthetic */ zls a;
    public final /* synthetic */ vpr b;

    public x(zls zlsVar, vpr vprVar) {
        this.a = zlsVar;
        this.b = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1;
        Object obj2;
        int i;
        if (continuation instanceof FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1) {
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1) continuation;
            int i2 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label = i2 - Integer.MIN_VALUE;
                obj2 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.L$0 = null;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.L$1 = null;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.L$2 = null;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.I$0 = 0;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label = 1;
                    obj2 = this.a.invoke(this.b, obj, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                return zy11.a;
            }
        }
        flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1(this, continuation);
        obj2 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
