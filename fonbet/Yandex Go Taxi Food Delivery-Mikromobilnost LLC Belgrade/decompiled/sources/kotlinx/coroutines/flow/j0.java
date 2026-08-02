package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class j0 implements tpr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ zls c;

    public j0(Object obj, tpr tprVar, zls zlsVar) {
        this.a = obj;
        this.b = tprVar;
        this.c = zlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r7.b.collect(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Object] */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
        int i;
        Ref$ObjectRef z;
        int i2;
        vpr vprVar2;
        if (continuation instanceof FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) {
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) continuation;
            int i3 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = i3 - Integer.MIN_VALUE;
                Object obj = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    z = qv10.z(obj);
                    ?? r9 = this.a;
                    z.element = r9;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = z;
                    i2 = 0;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = 0;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 1;
                    Object emit = vprVar.emit(r9, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1);
                    vprVar2 = vprVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    int i4 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0;
                    z = (Ref$ObjectRef) flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3;
                    vpr vprVar3 = (vpr) flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2;
                    kotlin.b.b(obj);
                    i2 = i4;
                    vprVar2 = vprVar3;
                }
                k0 k0Var = new k0(this.c, z, vprVar2);
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$0 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$1 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = null;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = i2;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 2;
            }
        }
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        k0 k0Var2 = new k0(this.c, z, vprVar2);
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$0 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$1 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$2 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.L$3 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.I$0 = i2;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = 2;
    }
}
