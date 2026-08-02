package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class o implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zls b;

    public o(tpr tprVar, zls zlsVar) {
        this.a = tprVar;
        this.b = zlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r7.b.invoke(r8, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
        int i;
        int i2;
        Object h;
        Throwable th;
        if (continuation instanceof FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) {
            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) continuation;
            int i3 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = i3 - Integer.MIN_VALUE;
                Object obj = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    i2 = 0;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0 = 0;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = 1;
                    h = e.h(this.a, vprVar, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    int i4 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0;
                    vpr vprVar2 = (vpr) flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2;
                    kotlin.b.b(obj);
                    i2 = i4;
                    vprVar = vprVar2;
                    h = obj;
                }
                th = (Throwable) h;
                if (th != null) {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$3 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0 = i2;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = 2;
                }
                return zy11.a;
            }
        }
        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        th = (Throwable) h;
        if (th != null) {
        }
        return zy11.a;
    }
}
