package com.squareup.cash.investing.backend.real;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.google.mlkit.vision.face.FaceDetection;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.investing.backend.api.InvestingDataRefresher;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.ui.ScreenshotReportingManager$initialize$3$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealEntityPriceRefresher implements InvestingDataRefresher {
    public final AndroidClock clock;
    public final CoroutineContext computationDispatcher;
    public final StateFlowImpl networkStatus = FlowKt.MutableStateFlow(NetworkStatus.Available.INSTANCE);
    public final MarketPricesAppService service;
    public final ReadonlySharedFlow sharedPriceCache;
    public final Signal signOut;
    public final CoroutineContext singleDispatcher;
    public final SharedFlowImpl tickerFlow;
    public final SharedFlowImpl tokenOperations;

    /* loaded from: classes6.dex */
    public abstract class TokenOperation {

        public final class AddAll extends TokenOperation {
            public final List tokens;

            public AddAll(List list) {
                list.getClass();
                this.tokens = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddAll) && Intrinsics.areEqual(this.tokens, ((AddAll) obj).tokens);
            }

            public final List getTokens() {
                return this.tokens;
            }

            public final int hashCode() {
                return this.tokens.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("AddAll(tokens=", ")", this.tokens);
            }
        }

        public final class RemoveAllOnce extends TokenOperation {
            public final List tokens;

            public RemoveAllOnce(List list) {
                list.getClass();
                this.tokens = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveAllOnce) && Intrinsics.areEqual(this.tokens, ((RemoveAllOnce) obj).tokens);
            }

            public final List getTokens() {
                return this.tokens;
            }

            public final int hashCode() {
                return this.tokens.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("RemoveAllOnce(tokens=", ")", this.tokens);
            }
        }
    }

    public RealEntityPriceRefresher(MarketPricesAppService marketPricesAppService, PersistentEntityPriceCache persistentEntityPriceCache, AndroidClock androidClock, Signal signal, CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.service = marketPricesAppService;
        this.clock = androidClock;
        this.signOut = signal;
        this.singleDispatcher = coroutineContext;
        this.computationDispatcher = coroutineContext2;
        int i = 1;
        SharedFlowImpl MutableSharedFlow = FlowKt.MutableSharedFlow(1, 50, BufferOverflow.DROP_OLDEST);
        this.tokenOperations = MutableSharedFlow;
        Continuation continuation = null;
        this.sharedPriceCache = FlowKt.shareIn(FlowKt.channelFlow(new CoroutinesKt$until$2(persistentEntityPriceCache, new CryptoBalanceRepoKt$asMoney$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealFeatureFlagManager$values$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.transformLatest(FlowKt.flowOn(FlowKt.distinctUntilChanged(new FlowUtil$createFlow$$inlined$map$1(EmptyList.INSTANCE, MutableSharedFlow, new ScreenshotReportingManager$initialize$3$1(3, continuation, 4))), coroutineContext), new Badger$collect$$inlined$combine$2$3(continuation, this, 5)), new RealGcmRegistrar$unregister$2(this, continuation, 19), 3), 2), 24), i), continuation, i)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
        this.tickerFlow = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
    }

    public final Flow observe(List list) {
        list.getClass();
        HashSet hashSet = CollectionsKt.toHashSet(list);
        Continuation continuation = null;
        CallbackFlowBuilder callbackFlow = FlowKt.callbackFlow(new PasscodeDialogPresenter$models$1$1(this, list, continuation, 29));
        return StateFlowKt.runUntil(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new Transform$special$$inlined$map$1(FlowKt.merge(this.sharedPriceCache, callbackFlow), hashSet, 25), FaceDetection.m2065timerForAgeWn2Vu4Y(this.networkStatus, this.clock, this.computationDispatcher, RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD), new CardModelView$getActiveHeat$2$2(this, continuation, 9), 0)), this.signOut);
    }

    @Override // com.squareup.cash.investing.backend.api.InvestingDataRefresher
    public final Object refresh(InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1 investingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1) {
        Unit unit = Unit.INSTANCE;
        Object emit = this.tickerFlow.emit(unit, investingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : unit;
    }
}
