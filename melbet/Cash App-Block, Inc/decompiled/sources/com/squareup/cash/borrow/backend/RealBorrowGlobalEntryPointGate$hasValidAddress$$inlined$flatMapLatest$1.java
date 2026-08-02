package com.squareup.cash.borrow.backend;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.protos.common.location.GlobalAddress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1(int i, n nVar, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        n nVar = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1 realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1 = new RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1(0, nVar, continuation);
                realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1.L$1 = obj2;
                return realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1 realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$12 = new RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1(1, nVar, continuation);
                realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$12.L$1 = obj2;
                return realBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        n nVar = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GlobalAddress globalAddress = (GlobalAddress) obj2;
                    Flow appLockMonitor$special$$inlined$map$2 = globalAddress == null ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new RealTransferManager$addCash$$inlined$map$1(((SyncValueReader) nVar.a).getSingleValue(AndroidSyncValueSpecs.GlobalBorrowData), globalAddress, 8);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow transformLatest = ((Boolean) obj3).booleanValue() ? FlowKt.transformLatest(((RealAddressManager) nVar.b).address(), new RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1(0, nVar, continuation)) : new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, transformLatest, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
