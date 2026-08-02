package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public final class s0 implements vpr {
    public final vpr a;
    public final wls b;

    public s0(vpr vprVar, wls wlsVar) {
        this.a = vprVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        int i;
        vpr vprVar;
        Throwable th;
        SafeCollector safeCollector;
        if (continuationImpl instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuationImpl;
            int i2 = subscribedFlowCollector$onSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscribedFlowCollector$onSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribedFlowCollector$onSubscription$1.label;
                zy11 zy11Var = zy11.a;
                vprVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SafeCollector safeCollector2 = new SafeCollector(vprVar, subscribedFlowCollector$onSubscription$1.get_context());
                    try {
                        wls wlsVar = this.b;
                        subscribedFlowCollector$onSubscription$1.L$0 = safeCollector2;
                        subscribedFlowCollector$onSubscription$1.label = 1;
                        if (wlsVar.invoke(safeCollector2, subscribedFlowCollector$onSubscription$1) != coroutineSingletons) {
                            safeCollector = safeCollector2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    safeCollector.releaseIntercepted();
                    throw th;
                }
                safeCollector.releaseIntercepted();
                if (vprVar instanceof s0) {
                    subscribedFlowCollector$onSubscription$1.L$0 = null;
                    subscribedFlowCollector$onSubscription$1.label = 2;
                    if (((s0) vprVar).a(subscribedFlowCollector$onSubscription$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
        Object obj2 = subscribedFlowCollector$onSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribedFlowCollector$onSubscription$1.label;
        zy11 zy11Var2 = zy11.a;
        vprVar = this.a;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        if (vprVar instanceof s0) {
        }
        return zy11Var2;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        return this.a.emit(obj, continuation);
    }
}
