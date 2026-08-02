package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService implements FlowZiplineCollector, OutboundService {
    public final OutboundCallHandler callHandler;

    public FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // app.cash.zipline.internal.bridge.FlowZiplineCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1 flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1;
        int i;
        if (continuation instanceof FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1) {
            flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1 = (FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1) continuation;
            int i2 = flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.label = 1;
                    obj2 = this.callHandler.callSuspending(this, 0, new Object[]{obj}, flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj2.getClass();
                return (Unit) obj2;
            }
        }
        flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1 = new FlowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1(this, continuation);
        Object obj22 = flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowZiplineCollector$Companion$Adapter$GeneratedOutboundService$emit$1.label;
        if (i != 0) {
        }
        obj22.getClass();
        return (Unit) obj22;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
