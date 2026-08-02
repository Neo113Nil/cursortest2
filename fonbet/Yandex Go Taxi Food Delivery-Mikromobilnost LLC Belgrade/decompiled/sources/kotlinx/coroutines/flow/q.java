package kotlinx.coroutines.flow;

import defpackage.bms;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ bms b;

    public q(tpr tprVar, bms bmsVar) {
        this.a = tprVar;
        this.b = bmsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:14:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:11:0x00a4). Please report as a decompilation issue!!! */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        vpr vprVar2;
        Object obj;
        Throwable th;
        if (continuation instanceof FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) {
            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) continuation;
            int i5 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j = 0;
                    i2 = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0 = i2;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0 = j;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1 = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = 1;
                    obj = e.h(this.a, vprVar, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0;
                    i4 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0;
                    th = (Throwable) flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3;
                    vprVar2 = (vpr) flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2;
                    kotlin.b.b(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        throw th;
                    }
                    j++;
                    i3 = 1;
                    FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                    int i6 = i4;
                    vprVar = vprVar2;
                    if (i3 == 0) {
                        return zy11.a;
                    }
                    i2 = i6;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3 = null;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0 = i2;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0 = j;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1 = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = 1;
                    obj = e.h(this.a, vprVar, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1);
                    if (obj != coroutineSingletons) {
                        vprVar2 = vprVar;
                        i4 = i2;
                        i3 = 0;
                        th = (Throwable) obj;
                        if (th != null) {
                            Long l = new Long(j);
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$0 = null;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$1 = null;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2 = vprVar2;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3 = th;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0 = i4;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0 = j;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1 = i3;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = 2;
                            obj2 = this.b.invoke(vprVar2, th, l, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1);
                        }
                        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$122 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                        int i62 = i4;
                        vprVar = vprVar2;
                        if (i3 == 0) {
                        }
                    }
                    return coroutineSingletons;
                }
                int i7 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1;
                j = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0;
                int i8 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0;
                vprVar2 = (vpr) flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2;
                kotlin.b.b(obj2);
                i3 = i7;
                i4 = i8;
                obj = obj2;
                th = (Throwable) obj;
                if (th != null) {
                }
                FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1222 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                int i622 = i4;
                vprVar = vprVar2;
                if (i3 == 0) {
                }
            }
        }
        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj22 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
    }
}
