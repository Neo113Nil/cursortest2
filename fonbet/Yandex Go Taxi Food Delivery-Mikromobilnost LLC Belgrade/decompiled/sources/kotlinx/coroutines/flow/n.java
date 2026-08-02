package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public final class n implements tpr {
    public final /* synthetic */ wls a;
    public final /* synthetic */ tpr b;

    public n(tpr tprVar, wls wlsVar) {
        this.a = wlsVar;
        this.b = tprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r7.b.collect(r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1;
        ?? r2;
        int i;
        try {
            if (continuation instanceof FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) {
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) continuation;
                int i2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
                    if (r2 != 0) {
                        kotlin.b.b(obj);
                        SafeCollector safeCollector = new SafeCollector(vprVar, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.get_context());
                        wls wlsVar = this.a;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = safeCollector;
                        i = 0;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = 0;
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 1;
                        Object invoke = wlsVar.invoke(safeCollector, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1);
                        r2 = safeCollector;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        int i3 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0;
                        SafeCollector safeCollector2 = (SafeCollector) flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3;
                        vpr vprVar2 = (vpr) flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2;
                        kotlin.b.b(obj);
                        i = i3;
                        vprVar = vprVar2;
                        r2 = safeCollector2;
                    }
                    r2.releaseIntercepted();
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = null;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = null;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = i;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 2;
                }
            }
            if (r2 != 0) {
            }
            r2.releaseIntercepted();
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$0 = null;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$1 = null;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$2 = null;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.L$3 = null;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.I$0 = i;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label = 2;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1.label;
    }
}
