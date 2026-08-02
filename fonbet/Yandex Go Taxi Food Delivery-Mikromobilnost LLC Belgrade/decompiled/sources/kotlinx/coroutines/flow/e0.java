package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class e0 implements tpr {
    public final /* synthetic */ o a;

    public e0(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1;
        int i;
        vpr vprVar2;
        Ref$ObjectRef ref$ObjectRef;
        int i2;
        ArrayList arrayList;
        if (continuation instanceof FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1) {
            flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1) continuation;
            int i3 = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label = i3 - Integer.MIN_VALUE;
                Object obj = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    f0 f0Var = new f0(vprVar, z);
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$3 = z;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.I$0 = 0;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label = 1;
                    if (this.a.collect(f0Var, flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                        vprVar2 = vprVar;
                        ref$ObjectRef = z;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                i2 = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.I$0;
                ref$ObjectRef = (Ref$ObjectRef) flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$3;
                vprVar2 = (vpr) flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$2;
                kotlin.b.b(obj);
                arrayList = (ArrayList) ref$ObjectRef.element;
                if (arrayList != null) {
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$2 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$3 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.L$4 = null;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.I$0 = i2;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.I$1 = 0;
                    flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label = 2;
                }
                return zy11.a;
            }
        }
        flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 = new FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        arrayList = (ArrayList) ref$ObjectRef.element;
        if (arrayList != null) {
        }
        return zy11.a;
    }
}
