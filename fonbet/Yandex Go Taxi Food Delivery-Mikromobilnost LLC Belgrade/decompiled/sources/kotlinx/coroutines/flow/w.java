package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class w implements vpr {
    public final /* synthetic */ wls a;
    public final /* synthetic */ vpr b;

    public w(vpr vprVar, wls wlsVar) {
        this.a = wlsVar;
        this.b = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r7.b.emit(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1;
        int i;
        int i2;
        Object invoke;
        if (continuation instanceof FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1) {
            flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 = (FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1) continuation;
            int i3 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$0 = null;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$1 = null;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$2 = obj;
                    i2 = 0;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.I$0 = 0;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label = 1;
                    invoke = this.a.invoke(obj, flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    int i4 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.I$0;
                    Object obj3 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$2;
                    kotlin.b.b(obj2);
                    i2 = i4;
                    obj = obj3;
                    invoke = obj2;
                }
                if (((Boolean) invoke).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$0 = null;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$1 = null;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.L$2 = null;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.I$0 = i2;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label = 2;
            }
        }
        flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 = new FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(this, continuation);
        Object obj22 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.label;
        if (i != 0) {
        }
        if (((Boolean) invoke).booleanValue()) {
        }
    }
}
