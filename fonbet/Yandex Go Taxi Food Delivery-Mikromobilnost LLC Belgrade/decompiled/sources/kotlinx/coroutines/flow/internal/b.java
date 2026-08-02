package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.gwk0;
import defpackage.mqq0;
import defpackage.ny61;
import defpackage.syt0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ye60;
import defpackage.ym11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;

/* loaded from: classes4.dex */
public abstract class b {
    public static final vpr a(vpr vprVar, fse fseVar) {
        return ((vprVar instanceof mqq0) || (vprVar instanceof ye60)) ? vprVar : new m(vprVar, fseVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(fse fseVar, Object obj, Object obj2, wls wlsVar, Continuation continuation) {
        ChannelFlowKt$withContextUndispatched$1 channelFlowKt$withContextUndispatched$1;
        int i;
        Object H;
        Object invoke;
        if (continuation instanceof ChannelFlowKt$withContextUndispatched$1) {
            channelFlowKt$withContextUndispatched$1 = (ChannelFlowKt$withContextUndispatched$1) continuation;
            int i2 = channelFlowKt$withContextUndispatched$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelFlowKt$withContextUndispatched$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = channelFlowKt$withContextUndispatched$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowKt$withContextUndispatched$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    H = gwk0.H(fseVar, obj2);
                    try {
                        channelFlowKt$withContextUndispatched$1.L$0 = fseVar;
                        channelFlowKt$withContextUndispatched$1.L$1 = obj;
                        channelFlowKt$withContextUndispatched$1.L$2 = null;
                        channelFlowKt$withContextUndispatched$1.L$3 = wlsVar;
                        channelFlowKt$withContextUndispatched$1.L$4 = fseVar;
                        channelFlowKt$withContextUndispatched$1.L$5 = null;
                        channelFlowKt$withContextUndispatched$1.L$6 = H;
                        channelFlowKt$withContextUndispatched$1.L$7 = channelFlowKt$withContextUndispatched$1;
                        channelFlowKt$withContextUndispatched$1.I$0 = 0;
                        channelFlowKt$withContextUndispatched$1.I$1 = 0;
                        channelFlowKt$withContextUndispatched$1.label = 1;
                        syt0 syt0Var = new syt0(fseVar, channelFlowKt$withContextUndispatched$1);
                        if (wlsVar == null) {
                            fse fseVar2 = syt0Var.get_context();
                            Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = fseVar2 == EmptyCoroutineContext.a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(syt0Var) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(fseVar2, syt0Var);
                            ym11.e(2, wlsVar);
                            invoke = wlsVar.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                        } else {
                            ym11.e(2, wlsVar);
                            invoke = wlsVar.invoke(obj, syt0Var);
                        }
                        obj3 = invoke;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gwk0.x(fseVar, H);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = channelFlowKt$withContextUndispatched$1.L$6;
                    fse fseVar3 = (fse) channelFlowKt$withContextUndispatched$1.L$4;
                    try {
                        kotlin.b.b(obj3);
                        H = obj5;
                        fseVar = fseVar3;
                    } catch (Throwable th2) {
                        H = obj5;
                        fseVar = fseVar3;
                        th = th2;
                        gwk0.x(fseVar, H);
                        throw th;
                    }
                }
                gwk0.x(fseVar, H);
                return obj3;
            }
        }
        channelFlowKt$withContextUndispatched$1 = new ChannelFlowKt$withContextUndispatched$1(continuation);
        Object obj32 = channelFlowKt$withContextUndispatched$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelFlowKt$withContextUndispatched$1.label;
        if (i != 0) {
        }
        gwk0.x(fseVar, H);
        return obj32;
    }

    public static Object c(fse fseVar, vpr vprVar, wls wlsVar, Continuation continuation) {
        return b(fseVar, vprVar, fseVar.fold(0, gwk0.e), wlsVar, continuation);
    }
}
