package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService implements StateFlowZiplineService, OutboundService {
    public final OutboundCallHandler callHandler;

    public StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // app.cash.zipline.internal.bridge.FlowZiplineService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowZiplineCollector flowZiplineCollector, ContinuationImpl continuationImpl) {
        StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1 stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1;
        int i;
        if (continuationImpl instanceof StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1) {
            stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1 = (StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1) continuationImpl;
            int i2 = stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{flowZiplineCollector}, stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1 = new StateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1(this, continuationImpl);
        Object obj2 = stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateFlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // app.cash.zipline.internal.bridge.StateFlowZiplineService
    public final Object getValue() {
        return this.callHandler.call(this, 2, new Object[0]);
    }
}
