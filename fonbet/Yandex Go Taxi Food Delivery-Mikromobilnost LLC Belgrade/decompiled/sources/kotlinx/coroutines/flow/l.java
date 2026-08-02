package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ wls b;

    public l(tpr tprVar, wls wlsVar) {
        this.a = tprVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r7.a.collect(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        int i2;
        SafeCollector safeCollector;
        if (continuation instanceof FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) {
            flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) continuation;
            int i3 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = i3 - Integer.MIN_VALUE;
                Object obj = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    m mVar = new m(vprVar, ref$BooleanRef);
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$0 = null;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2 = vprVar;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3 = ref$BooleanRef;
                    i2 = 0;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0 = 0;
                    flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        safeCollector = (SafeCollector) flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$4;
                        try {
                            kotlin.b.b(obj);
                            safeCollector.releaseIntercepted();
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            safeCollector.releaseIntercepted();
                            throw th;
                        }
                    }
                    int i4 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0;
                    ref$BooleanRef = (Ref$BooleanRef) flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3;
                    vpr vprVar2 = (vpr) flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2;
                    kotlin.b.b(obj);
                    i2 = i4;
                    vprVar = vprVar2;
                }
                if (ref$BooleanRef.element) {
                    SafeCollector safeCollector2 = new SafeCollector(vprVar, flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.get_context());
                    try {
                        wls wlsVar = this.b;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$2 = null;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$3 = null;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.L$4 = safeCollector2;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.I$0 = i2;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label = 2;
                        if (wlsVar.invoke(safeCollector2, flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                            safeCollector = safeCollector2;
                            safeCollector.releaseIntercepted();
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                return zy11.a;
            }
        }
        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        if (ref$BooleanRef.element) {
        }
        return zy11.a;
    }
}
