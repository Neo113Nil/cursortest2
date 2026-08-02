package com.squareup.cash.bitcoin.applets.presenters.data;

import androidx.paging.PageFetcher$flow$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$2;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealBitcoinAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1(Continuation continuation, RealBitcoinAppletTileRepository realBitcoinAppletTileRepository, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realBitcoinAppletTileRepository;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealBitcoinAppletTileRepository realBitcoinAppletTileRepository = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1 realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1 = new RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realBitcoinAppletTileRepository, 0);
                realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1.L$1 = obj2;
                return realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1 realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$12 = new RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realBitcoinAppletTileRepository, 1);
                realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$12.L$1 = obj2;
                return realBitcoinAppletTileRepository$special$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealBitcoinAppletTileRepository realBitcoinAppletTileRepository = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow appLockMonitor$special$$inlined$map$2 = !((Boolean) obj2).booleanValue() ? new AppLockMonitor$special$$inlined$map$2(BitcoinRepositoryModel.Uninstalled.INSTANCE, 19) : FlowKt.transformLatest(FlowKt.distinctUntilChanged(new BitcoinDepositsPresenter$special$$inlined$filter$1(realBitcoinAppletTileRepository.activityLifecycleStates, 15)), new RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realBitcoinAppletTileRepository, i2));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
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
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flowKt__MergeKt$flatMapConcat$$inlined$map$1 = ((Boolean) obj3).booleanValue() ? new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(2, null, 6), FlowKt.combine(realBitcoinAppletTileRepository.graphModels, realBitcoinAppletTileRepository.convertedBitcoinBalance, realBitcoinAppletTileRepository.bitcoinValue, new AppMessageBadgeCounter$collect$2(realBitcoinAppletTileRepository, null, 1))) : new AppLockMonitor$special$$inlined$map$2(null, 19);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, flowKt__MergeKt$flatMapConcat$$inlined$map$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
