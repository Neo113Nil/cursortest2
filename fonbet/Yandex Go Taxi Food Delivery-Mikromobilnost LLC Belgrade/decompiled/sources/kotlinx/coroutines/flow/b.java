package kotlinx.coroutines.flow;

import defpackage.fi9;
import defpackage.fse;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class b extends fi9 {
    public final wls x;

    public b(wls wlsVar, fse fseVar, int i, BufferOverflow bufferOverflow) {
        super(wlsVar, fseVar, i, bufferOverflow);
        this.x = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.fi9, kotlinx.coroutines.flow.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(y6f0 y6f0Var, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        int i;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i2 = callbackFlowBuilder$collectTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callbackFlowBuilder$collectTo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callbackFlowBuilder$collectTo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    callbackFlowBuilder$collectTo$1.L$0 = y6f0Var;
                    callbackFlowBuilder$collectTo$1.label = 1;
                    if (super.e(y6f0Var, callbackFlowBuilder$collectTo$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6f0Var = (y6f0) callbackFlowBuilder$collectTo$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((x6f0) y6f0Var).y.E()) {
                    return zy11.a;
                }
                ny61.r("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
        Object obj3 = callbackFlowBuilder$collectTo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callbackFlowBuilder$collectTo$1.label;
        if (i != 0) {
        }
        if (!((x6f0) y6f0Var).y.E()) {
        }
    }

    @Override // defpackage.fi9, kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new b(this.x, fseVar, i, bufferOverflow);
    }
}
