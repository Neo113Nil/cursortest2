package androidx.datastore.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.camera2.pipe.compat.CameraState;
import androidx.camera.camera2.pipe.compat.CameraStateClosed;
import androidx.camera.camera2.pipe.compat.CameraStateClosing;
import androidx.camera.camera2.pipe.compat.CameraStateUnopened;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.SharedTransitionScopeRootModifierNode$onAttach$1;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.GlobalSnapshotManager;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.PageEvent;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.ObservedTableVersions;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import androidx.work.NetworkType;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.SharedNetworkCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.badging.backend.Badger$collect$$inlined$combine$1;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.badging.backend.RealBadger2$setup$1$2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.molecule.GatedFrameClock;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import app.cash.util.leakdetector.api.LeakDetector;
import app.cash.util.leakdetector.api.NoOpLeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.memory.MemoryCacheService;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.datadog.android.Datadog$getInstance$1$1;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.SandboxedSetupTeardowns;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.appmessages.db.InlineMessage;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.appmessages.treehouse.AndroidAppMessagingService;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.cdf.account.AccountSignInStart;
import com.squareup.cash.cdf.alias.AliasRegisterStart;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.errors.ClientSyncServerPushError;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.core.presenters.MainScreensPresenter;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.family.db.GetDependentSavingsBalance;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.history.navigation.PaymentActionNavigator;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker;
import com.squareup.cash.initialscreenloader.backend.InitialScreenLoader$TriggeredBy;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourneyActivity;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAccess;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
import com.squareup.util.android.ActivityResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.DistinctFlowImpl$collect$2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.ConnectionPool;
import okhttp3.Handshake$$ExternalSyntheticLambda0;
import okhttp3.Headers;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class DataStoreImpl$data$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public Object L$1;
    public int label;
    public Object this$0;

    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ DataStoreImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(DataStoreImpl dataStoreImpl, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            DataStoreImpl dataStoreImpl = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(dataStoreImpl, continuation, 0);
                case 1:
                    return new AnonymousClass1(dataStoreImpl, continuation, 1);
                default:
                    return new AnonymousClass1(dataStoreImpl, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r10 == r7) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        
            if (r5.readAndInitOrPropagateAndThrowFailure(r9) == r7) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        
            if (r10.collect(r1, r9) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
        
            if (r10 == r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            DataStoreImpl dataStoreImpl = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (DataStoreImpl.access$incrementCollector(dataStoreImpl, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SimpleActor simpleActor = dataStoreImpl.readAndInit;
                        this.label = 1;
                        Object awaitInternal = ((CompletableDeferredImpl) simpleActor.consumeMessage).awaitInternal(this);
                        if (awaitInternal != coroutineSingletons2) {
                            awaitInternal = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Flow buffer$default = FlowKt.buffer$default(dataStoreImpl.getCoordinator().updateNotifications, -1, 2);
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(dataStoreImpl, 6);
                    this.label = 2;
                    break;
                default:
                    ObservedTableVersions observedTableVersions = dataStoreImpl.inMemoryCache;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    try {
                        if (i4 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (!(observedTableVersions.getCurrentState() instanceof Final)) {
                                this.label = 1;
                                break;
                            } else {
                                return observedTableVersions.getCurrentState();
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return (State) obj;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        this.label = 2;
                        obj = DataStoreImpl.access$readDataAndUpdateCache(dataStoreImpl, false, this);
                        break;
                    } catch (Throwable th) {
                        return new ReadException(th, -1);
                    }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl dataStoreImpl, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.this$0 = dataStoreImpl;
        this.L$1 = function2;
    }

    private final Object invokeSuspend$com$squareup$cash$clientsync$CustomerStreamingSubscriber$setup$1$1(Object obj) {
        Reward$Adapter reward$Adapter = (Reward$Adapter) this.L$1;
        CustomerStreamingSubscriber customerStreamingSubscriber = (CustomerStreamingSubscriber) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                reward$Adapter.boost_detail_bottom_upsellAdapter = new Long(customerStreamingSubscriber.clock.millis());
                Timber.Forest forest = Timber.Forest;
                forest.tag("CLIENTSYNC");
                forest.d("Starting work.", new Object[0]);
                StateFlow stateFlow = customerStreamingSubscriber.requestMetadata;
                FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1(customerStreamingSubscriber, reward$Adapter, (Lifecycle) this.this$0, (Continuation) null, 7);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, flowQuery$asFlow$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        } catch (CancellationException e) {
            Timber.Forest forest2 = Timber.Forest;
            forest2.tag("CLIENTSYNC");
            forest2.d("Stopping work as a result of cancellation", new Object[0], e);
            throw e;
        } catch (Exception e2) {
            customerStreamingSubscriber.errorReporter.report(new ClientSyncServerPushError(e2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$history$navigation$PaymentActionNavigator$setup$lambda$0$$inlined$transform$1(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(19, flowCollector, (PaymentActionNavigator) this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(cashCdpConfigProvider$1$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$initialscreenloader$backend$AppVersionCheckerActivityWorker$setup$$inlined$setupSingleCoroutine$default$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lifecycle lifecycle = (Lifecycle) this.L$1;
            Lifecycle.State state = Lifecycle.State.STARTED;
            CashApp$onCreate$4$1$1 cashApp$onCreate$4$1$1 = new CashApp$onCreate$4$1$1((AppVersionCheckerActivityWorker) this.this$0, continuation, 21);
            this.L$0 = null;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, cashApp$onCreate$4$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$initialscreenloader$backend$RealInitialScreenLoader$loadInitialScreen$3(Object obj) {
        RealInitialScreenLoader realInitialScreenLoader = (RealInitialScreenLoader) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Timber.Forest.d("Resolving initial screen", new Object[0]);
            Intent intent = ((InitialScreenLoader$TriggeredBy.ActivityLaunch) ((InitialScreenLoader$TriggeredBy) this.L$0)).launchingIntent;
            Function2 function2 = (Function2) this.this$0;
            this.label = 1;
            obj = RealInitialScreenLoader.m3567access$resolveInitialScreenzO7DZzo(realInitialScreenLoader, intent, function2, this);
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
        if (((RealInitialScreenLoader.ScreenLoaded) obj).loaded) {
            Timber.Forest.d("initialScreenLoaded: Complete", new Object[0]);
            return Boolean.valueOf(realInitialScreenLoader.initialScreenLoaded.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE));
        }
        Timber.Forest.d("initialScreenLoaded: Not complete", new Object[0]);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1((DataStoreImpl) this.this$0, continuation, 0);
                dataStoreImpl$data$1.L$0 = obj;
                return dataStoreImpl$data$1;
            case 1:
                DataStoreImpl$data$1 dataStoreImpl$data$12 = new DataStoreImpl$data$1((Transition) this.L$1, (MutableState) this.this$0, continuation, 1);
                dataStoreImpl$data$12.L$0 = obj;
                return dataStoreImpl$data$12;
            case 2:
                return new DataStoreImpl$data$1((MutableInteractionSourceImpl) this.L$1, (Interaction) this.L$0, (DisposableHandle) this.this$0, continuation, 2);
            case 3:
                DataStoreImpl$data$1 dataStoreImpl$data$13 = new DataStoreImpl$data$1((DefaultScrollableState) this.L$1, (Function2) this.this$0, continuation, 3);
                dataStoreImpl$data$13.L$0 = obj;
                return dataStoreImpl$data$13;
            case 4:
                return new DataStoreImpl$data$1((DefaultScrollableState) this.L$1, (MutatePriority) this.L$0, (Function2) this.this$0, continuation, 4);
            case 5:
                return new DataStoreImpl$data$1((BringIntoViewResponderNode) this.L$1, (NodeCoordinator) this.L$0, (Datadog$getInstance$1$1) this.this$0, continuation, 5);
            case 6:
                DataStoreImpl$data$1 dataStoreImpl$data$14 = new DataStoreImpl$data$1(this.L$1, this.this$0, continuation, 6);
                dataStoreImpl$data$14.L$0 = obj;
                return dataStoreImpl$data$14;
            case 7:
                DataStoreImpl$data$1 dataStoreImpl$data$15 = new DataStoreImpl$data$1((CoroutineContext) this.L$1, (Flow) this.this$0, continuation, 7);
                dataStoreImpl$data$15.L$0 = obj;
                return dataStoreImpl$data$15;
            case 8:
                return new DataStoreImpl$data$1((BufferedChannel) this.this$0, continuation, 8);
            case 9:
                DataStoreImpl$data$1 dataStoreImpl$data$16 = new DataStoreImpl$data$1((DataStoreImpl) this.this$0, (Function2) this.L$1, continuation);
                dataStoreImpl$data$16.L$0 = obj;
                return dataStoreImpl$data$16;
            case 10:
                DataStoreImpl$data$1 dataStoreImpl$data$17 = new DataStoreImpl$data$1((CompletableDeferredImpl) this.L$1, (Function2) this.this$0, continuation, 10);
                dataStoreImpl$data$17.L$0 = obj;
                return dataStoreImpl$data$17;
            case 11:
                DataStoreImpl$data$1 dataStoreImpl$data$18 = new DataStoreImpl$data$1((Function2) this.L$1, (CallbackToFutureAdapter$Completer) this.this$0, continuation, 11);
                dataStoreImpl$data$18.L$0 = obj;
                return dataStoreImpl$data$18;
            case 12:
                return new DataStoreImpl$data$1((WorkerWrapper) this.L$1, (ListenableWorker) this.L$0, (WorkForegroundUpdater) this.this$0, continuation, 12);
            case 13:
                DataStoreImpl$data$1 dataStoreImpl$data$19 = new DataStoreImpl$data$1((Constraints) this.L$1, (NetworkRequestConstraintController) this.this$0, continuation, 13);
                dataStoreImpl$data$19.L$0 = obj;
                return dataStoreImpl$data$19;
            case 14:
                return new DataStoreImpl$data$1((Headers.Builder) this.L$1, (WorkSpec) this.L$0, (OnConstraintsStateChangedListener) this.this$0, continuation, 14);
            case 15:
                DataStoreImpl$data$1 dataStoreImpl$data$110 = new DataStoreImpl$data$1(continuation, (RealBadger2) this.L$1);
                dataStoreImpl$data$110.L$0 = obj;
                return dataStoreImpl$data$110;
            case 16:
                return new DataStoreImpl$data$1((Recomposer) this.L$1, (CompositionImpl) this.L$0, (Ref$ObjectRef) this.this$0, continuation, 16);
            case 17:
                return new DataStoreImpl$data$1((VariantSandboxedComponent) this.L$1, (LeakDetector) this.L$0, (StorageLink) this.this$0, continuation, 17);
            case 18:
                DataStoreImpl$data$1 dataStoreImpl$data$111 = new DataStoreImpl$data$1((Flow) this.L$1, continuation, (RealInAppNotificationPresenter) this.this$0, 18);
                dataStoreImpl$data$111.L$0 = obj;
                return dataStoreImpl$data$111;
            case 19:
                DataStoreImpl$data$1 dataStoreImpl$data$112 = new DataStoreImpl$data$1((Flow) this.L$1, continuation, (RealTooltipAppMessagePresenter) this.this$0, 19);
                dataStoreImpl$data$112.L$0 = obj;
                return dataStoreImpl$data$112;
            case 20:
                DataStoreImpl$data$1 dataStoreImpl$data$113 = new DataStoreImpl$data$1((AndroidAppMessagingService) this.this$0, continuation, 20);
                dataStoreImpl$data$113.L$0 = obj;
                return dataStoreImpl$data$113;
            case 21:
                return new DataStoreImpl$data$1((InstallAttributer) this.L$1, (String) this.L$0, (String) this.this$0, continuation, 21);
            case 22:
                return new DataStoreImpl$data$1((RegisterAliasPresenter) this.L$1, (Function1) this.L$0, (MutableState) this.this$0, continuation, 22);
            case 23:
                DataStoreImpl$data$1 dataStoreImpl$data$114 = new DataStoreImpl$data$1(continuation, (CustomerStreamingSubscriber) this.L$1, (Lifecycle) this.this$0, 23);
                dataStoreImpl$data$114.L$0 = obj;
                return dataStoreImpl$data$114;
            case 24:
                return new DataStoreImpl$data$1((Reward$Adapter) this.L$1, (CustomerStreamingSubscriber) this.L$0, (Lifecycle) this.this$0, continuation, 24);
            case 25:
                DataStoreImpl$data$1 dataStoreImpl$data$115 = new DataStoreImpl$data$1((Flow) this.L$1, continuation, (MainScreensPresenter) this.this$0, 25);
                dataStoreImpl$data$115.L$0 = obj;
                return dataStoreImpl$data$115;
            case 26:
                DataStoreImpl$data$1 dataStoreImpl$data$116 = new DataStoreImpl$data$1((Flow) this.L$1, continuation, (PaymentActionNavigator) this.this$0, 26);
                dataStoreImpl$data$116.L$0 = obj;
                return dataStoreImpl$data$116;
            case 27:
                DataStoreImpl$data$1 dataStoreImpl$data$117 = new DataStoreImpl$data$1(continuation, (Lifecycle) this.L$1, (AppVersionCheckerActivityWorker) this.this$0, 27);
                dataStoreImpl$data$117.L$0 = obj;
                return dataStoreImpl$data$117;
            case 28:
                return new DataStoreImpl$data$1((RealInitialScreenLoader) this.L$1, (InitialScreenLoader$TriggeredBy) this.L$0, (Function2) this.this$0, continuation, 28);
            default:
                DataStoreImpl$data$1 dataStoreImpl$data$118 = new DataStoreImpl$data$1((ConnectionPool) this.L$1, (WebLoginConfigQueries$$ExternalSyntheticLambda0) this.this$0, continuation, 29);
                dataStoreImpl$data$118.L$0 = obj;
                return dataStoreImpl$data$118;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DataStoreImpl$data$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((DataStoreImpl$data$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((DataStoreImpl$data$1) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((DataStoreImpl$data$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((DataStoreImpl$data$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((DataStoreImpl$data$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((DataStoreImpl$data$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((DataStoreImpl$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DataStoreImpl$data$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0209, code lost:
    
        if (r2.emit(r4, r18) == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f5, code lost:
    
        if (r4 == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x05ea, code lost:
    
        if (r1 == r9) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07e7, code lost:
    
        if (r1.collect(r2, r18) == r3) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x07f6, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r6, r18) == r3) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0ac6, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r1, r18) == r2) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0a55, code lost:
    
        if (r4 == r2) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0220, code lost:
    
        if (r1 != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023e, code lost:
    
        if (r2.emit(r1, r18) == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x077a A[Catch: all -> 0x074d, TryCatch #9 {all -> 0x074d, blocks: (B:385:0x0747, B:387:0x0772, B:389:0x077a, B:390:0x0787, B:398:0x0798, B:400:0x0763, B:404:0x079b, B:408:0x07a0, B:409:0x07a1, B:416:0x075e, B:392:0x0788, B:394:0x078e), top: B:380:0x073a, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x07a2  */
    /* JADX WARN: Type inference failed for: r0v74, types: [timber.log.Timber$Forest] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v31, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r3v33, types: [kotlinx.coroutines.channels.BufferedChannel] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r3v70, types: [app.cash.util.leakdetector.api.LeakDetector] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:355:0x076e -> B:341:0x0772). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x023e -> B:79:0x0216). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object withContext;
        State state;
        FlowCollector flowCollector2;
        State state2;
        Object obj2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object hasNext;
        boolean z;
        CompletableDeferred completableDeferred;
        Object invoke;
        Throwable m4120exceptionOrNullimpl;
        Object invoke2;
        Object obj3;
        Function0 addCallback;
        NetworkRequest build;
        Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda0;
        Object first;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        Object obj4;
        Object access$maybeLoginWithDiscoverablePasskey;
        int i = 15;
        ?? r3 = 16;
        char c = 16;
        int i2 = 12;
        int i3 = 25;
        int i4 = 14;
        int i5 = 7;
        int i6 = 13;
        int i7 = 4;
        int i8 = 3;
        int i9 = 2;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i10 = 1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                DataStoreImpl dataStoreImpl = (DataStoreImpl) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    withContext = JobKt.withContext(dataStoreImpl.scope.getCoroutineContext(), new AnonymousClass1(dataStoreImpl, continuation, i9), this);
                    break;
                } else if (i11 == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state2 = (Data) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector3 = flowCollector2;
                    state = state2;
                    flowCollector = flowCollector3;
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i7, new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AnonymousClass1(dataStoreImpl, continuation, z5 ? 1 : 0), dataStoreImpl.inMemoryCache.versions), new AnonymousClass2(z4 ? 1 : 0), z3 ? 1 : 0), new RealBadger2$clear$2(state, continuation, i4), i9), z2 ? 1 : 0), new AnonymousClass5(dataStoreImpl, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    break;
                }
                state = (State) withContext;
                if (state instanceof Data) {
                    Data data = (Data) state;
                    Object obj5 = data.value;
                    this.L$0 = flowCollector;
                    this.L$1 = data;
                    this.label = 2;
                    if (flowCollector.emit(obj5, this) != coroutineSingletons) {
                        flowCollector2 = flowCollector;
                        state2 = state;
                        FlowCollector flowCollector32 = flowCollector2;
                        state = state2;
                        flowCollector = flowCollector32;
                        FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$12 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i7, new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AnonymousClass1(dataStoreImpl, continuation, z5 ? 1 : 0), dataStoreImpl.inMemoryCache.versions), new AnonymousClass2(z4 ? 1 : 0), z3 ? 1 : 0), new RealBadger2$clear$2(state, continuation, i4), i9), z2 ? 1 : 0), new AnonymousClass5(dataStoreImpl, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (state instanceof UnInitialized) {
                    a$$ExternalSyntheticBUOutline0.m$1("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                if (state instanceof ReadException) {
                    throw ((ReadException) state).readException;
                }
                if (state instanceof Final) {
                    return Unit.INSTANCE;
                }
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$122 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i7, new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AnonymousClass1(dataStoreImpl, continuation, z5 ? 1 : 0), dataStoreImpl.inMemoryCache.versions), new AnonymousClass2(z4 ? 1 : 0), z3 ? 1 : 0), new RealBadger2$clear$2(state, continuation, i4), i9), z2 ? 1 : 0), new AnonymousClass5(dataStoreImpl, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            case 1:
                Transition transition = (Transition) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                int i13 = 1;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new SharedTransitionScopeRootModifierNode$onAttach$1(transition, i13));
                    DistinctFlowImpl$collect$2 distinctFlowImpl$collect$2 = new DistinctFlowImpl$collect$2(i13, produceStateScope, transition, (MutableState) this.this$0);
                    this.label = 1;
                    if (snapshotFlow.collect(distinctFlowImpl$collect$2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.L$1;
                    Interaction interaction = (Interaction) this.L$0;
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(interaction, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DisposableHandle disposableHandle = (DisposableHandle) this.this$0;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
                return Unit.INSTANCE;
            case 3:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((DefaultScrollableState) this.L$1).isScrollingState;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ScrollScope scrollScope = (ScrollScope) this.L$0;
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                        Function2 function2 = (Function2) this.this$0;
                        this.label = 1;
                        if (function2.invoke(scrollScope, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    throw th;
                }
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScrollableState defaultScrollableState = (DefaultScrollableState) this.L$1;
                    MutatorMutex mutatorMutex = defaultScrollableState.scrollMutex;
                    DefaultScrollableState$scrollScope$1 defaultScrollableState$scrollScope$1 = defaultScrollableState.scrollScope;
                    MutatePriority mutatePriority = (MutatePriority) this.L$0;
                    DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(defaultScrollableState, (Function2) this.this$0, continuation, i8);
                    this.label = 1;
                    if (mutatorMutex.mutateWith(defaultScrollableState$scrollScope$1, mutatePriority, dataStoreImpl$data$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                BringIntoViewResponderNode bringIntoViewResponderNode = (BringIntoViewResponderNode) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ContentInViewNode contentInViewNode = bringIntoViewResponderNode.responder;
                    BringIntoViewResponderNode$bringIntoView$2$1$1 bringIntoViewResponderNode$bringIntoView$2$1$1 = new BringIntoViewResponderNode$bringIntoView$2$1$1(bringIntoViewResponderNode, (NodeCoordinator) this.L$0, (Datadog$getInstance$1$1) this.this$0);
                    this.label = 1;
                    contentInViewNode.getClass();
                    Rect rect = (Rect) bringIntoViewResponderNode$bringIntoView$2$1$1.invoke();
                    if (rect == null || ContentInViewNode.m194isMaxVisibleEQwtKw$default(contentInViewNode, rect, 0L, 0L, 3)) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                        cancellableContinuationImpl.initCancellability();
                        ContentInViewNode.Request request = new ContentInViewNode.Request(bringIntoViewResponderNode$bringIntoView$2$1$1, cancellableContinuationImpl);
                        MemoryCacheService memoryCacheService = contentInViewNode.bringIntoViewRequests;
                        MutableVector mutableVector = (MutableVector) memoryCacheService.imageLoader;
                        Rect rect2 = (Rect) bringIntoViewResponderNode$bringIntoView$2$1$1.invoke();
                        if (rect2 == null) {
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                        } else {
                            cancellableContinuationImpl.invokeOnCancellation(new ClickableKt$$ExternalSyntheticLambda0(c, memoryCacheService, request));
                            IntRange until = RangesKt___RangesKt.until(0, mutableVector.size);
                            int i18 = until.first;
                            int i19 = until.last;
                            if (i18 <= i19) {
                                while (true) {
                                    Rect rect3 = (Rect) ((ContentInViewNode.Request) mutableVector.content[i19]).currentBounds.invoke();
                                    if (rect3 != null) {
                                        Rect intersect = rect2.intersect(rect3);
                                        if (intersect.equals(rect2)) {
                                            mutableVector.add(i19 + 1, request);
                                        } else if (!intersect.equals(rect3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i20 = mutableVector.size - 1;
                                            if (i20 <= i19) {
                                                while (true) {
                                                    ((ContentInViewNode.Request) mutableVector.content[i19]).continuation.cancel(cancellationException);
                                                    if (i20 != i19) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i19 != i18) {
                                        i19--;
                                    }
                                }
                            }
                            mutableVector.add(0, request);
                            if (!contentInViewNode.isAnimationRunning) {
                                contentInViewNode.m196launchAnimationgyyYBs(0L);
                            }
                        }
                        obj2 = cancellableContinuationImpl.getResult();
                        if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                    if (obj2 == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 != 0) {
                    if (i21 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = (Recomposer$runRecomposeAndApplyChanges$2) this.L$1;
                MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.this$0;
                this.label = 1;
                recomposer$runRecomposeAndApplyChanges$2.invoke(coroutineScope, monotonicFrameClock, this);
                return coroutineSingletons7;
            case 7:
                Flow flow = (Flow) this.this$0;
                CoroutineContext coroutineContext = (CoroutineContext) this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                    if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1(produceStateScope2, i9);
                        this.label = 1;
                        break;
                    } else {
                        FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 flowExtKt$collectAsStateWithLifecycle$1$1$1$2 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(flow, produceStateScope2, continuation, 1);
                        this.label = 2;
                        break;
                    }
                } else {
                    if (i22 != 1 && i22 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                try {
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        r3 = (BufferedChannel) this.this$0;
                        bufferedChannelIterator = new BufferedChannel.BufferedChannelIterator();
                        this.L$1 = r3;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 1;
                        hasNext = bufferedChannelIterator.hasNext(this);
                        r3 = r3;
                        if (hasNext == coroutineSingletons9) {
                        }
                        if (((Boolean) hasNext).booleanValue()) {
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        ReceiveChannel receiveChannel = (ReceiveChannel) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        hasNext = obj;
                        r3 = receiveChannel;
                        if (((Boolean) hasNext).booleanValue()) {
                            GlobalSnapshotManager.sent.set(false);
                            synchronized (SnapshotKt.lock) {
                                MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                                z = mutableScatterSet != null && mutableScatterSet.isNotEmpty();
                            }
                            if (z) {
                                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                            }
                            this.L$1 = r3;
                            this.L$0 = bufferedChannelIterator;
                            this.label = 1;
                            hasNext = bufferedChannelIterator.hasNext(this);
                            r3 = r3;
                            if (hasNext == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                            if (((Boolean) hasNext).booleanValue()) {
                                r3.cancel(null);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        SafeTrace.cancelConsumed(r3, th2);
                        throw th3;
                    }
                }
                break;
            case 9:
                DataStoreImpl dataStoreImpl2 = (DataStoreImpl) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 != 0) {
                    if (i24 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
                Message$Update message$Update = new Message$Update((Function2) this.L$1, completableDeferredImpl, dataStoreImpl2.inMemoryCache.getCurrentState(), coroutineScope2.getCoroutineContext());
                SimpleActor simpleActor = dataStoreImpl2.writeActor;
                Object mo1159trySendJP2dKIU = ((BufferedChannel) simpleActor.messageQueue).mo1159trySendJP2dKIU(message$Update);
                if (mo1159trySendJP2dKIU instanceof ChannelResult.Closed) {
                    Throwable m4190exceptionOrNullimpl = ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU);
                    if (m4190exceptionOrNullimpl == null) {
                        throw new ClosedSendChannelException("Channel was closed normally");
                    }
                    throw m4190exceptionOrNullimpl;
                }
                if (mo1159trySendJP2dKIU instanceof ChannelResult.Failed) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((MemoryCacheService) simpleActor.remainingMessages).imageLoader).getAndIncrement() == 0) {
                    JobKt.launch$default((CoroutineScope) simpleActor.scope, null, null, new GatedFrameClock.AnonymousClass1(simpleActor, continuation, i), 3);
                }
                this.label = 1;
                Object awaitInternal = completableDeferredImpl.awaitInternal(this);
                return awaitInternal == coroutineSingletons10 ? coroutineSingletons10 : awaitInternal;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    CompletableDeferredImpl completableDeferredImpl2 = (CompletableDeferredImpl) this.L$1;
                    Function2 function22 = (Function2) this.this$0;
                    try {
                        Result.Companion companion2 = Result.Companion;
                        this.L$0 = completableDeferredImpl2;
                        this.label = 1;
                        invoke = function22.invoke(coroutineScope3, this);
                        if (invoke == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                        completableDeferred = completableDeferredImpl2;
                    } catch (Throwable th4) {
                        th = th4;
                        completableDeferred = completableDeferredImpl2;
                        Result.Companion companion3 = Result.Companion;
                        invoke = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(invoke);
                        if (m4120exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    completableDeferred = (CompletableDeferred) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                    } catch (Throwable th5) {
                        th = th5;
                        Result.Companion companion32 = Result.Companion;
                        invoke = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(invoke);
                        if (m4120exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                Result.Companion companion4 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(invoke);
                if (m4120exceptionOrNullimpl == null) {
                    completableDeferred.complete(invoke);
                } else {
                    completableDeferred.completeExceptionally(m4120exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            case 11:
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                try {
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                        Function2 function23 = (Function2) this.L$1;
                        this.label = 1;
                        invoke2 = function23.invoke(coroutineScope4, this);
                        if (invoke2 == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke2 = obj;
                    }
                    callbackToFutureAdapter$Completer.set(invoke2);
                } catch (CancellationException unused) {
                    callbackToFutureAdapter$Completer.setCancelled();
                } catch (Throwable th6) {
                    callbackToFutureAdapter$Completer.setException(th6);
                }
                return Unit.INSTANCE;
            case 12:
                ListenableWorker listenableWorker = (ListenableWorker) this.L$0;
                WorkerWrapper workerWrapper = (WorkerWrapper) this.L$1;
                WorkSpec workSpec = workerWrapper.workSpec;
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Context context = workerWrapper.appContext;
                    WorkForegroundUpdater workForegroundUpdater = (WorkForegroundUpdater) this.this$0;
                    WorkManagerTaskExecutor workManagerTaskExecutor = workerWrapper.workTaskExecutor;
                    this.label = 1;
                    String str = WorkForegroundKt.TAG;
                    if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
                        obj3 = Unit.INSTANCE;
                        break;
                    } else {
                        AndroidMainExecutor androidMainExecutor = workManagerTaskExecutor.mMainThreadExecutor;
                        androidMainExecutor.getClass();
                        Object withContext2 = JobKt.withContext(JobKt.from(androidMainExecutor), new FlowExtKt$simpleScan$1(listenableWorker, workSpec, workForegroundUpdater, context, (Continuation) null, 28), this);
                        obj3 = withContext2;
                        if (withContext2 != obj6) {
                            obj3 = Unit.INSTANCE;
                            break;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = WorkerWrapperKt.TAG;
                Logger$LogcatLogger.get().debug(str2, "Starting work for " + workSpec.workerClassName);
                ListenableFuture startWork = listenableWorker.startWork();
                startWork.getClass();
                this.label = 2;
                Object awaitWithin = WorkerWrapperKt.awaitWithin(startWork, listenableWorker, this);
                if (awaitWithin != obj6) {
                    return awaitWithin;
                }
                return obj6;
            case 13:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerScope producerScope = (ProducerScope) this.L$0;
                    NetworkRequest requiredNetworkRequest = ((Constraints) this.L$1).getRequiredNetworkRequest();
                    if (requiredNetworkRequest == null) {
                        NetworkType networkType = ((Constraints) this.L$1).requiredNetworkType;
                        networkType.getClass();
                        if (networkType == NetworkType.NOT_REQUIRED) {
                            requiredNetworkRequest = null;
                        } else {
                            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                                int ordinal = networkType.ordinal();
                                if (ordinal == 2) {
                                    removeCapability = removeCapability.addCapability(11);
                                } else if (ordinal == 3) {
                                    removeCapability = removeCapability.addCapability(18);
                                } else if (ordinal == 4) {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                                build = removeCapability.build();
                            } else {
                                build = removeCapability.addCapability(25).build();
                            }
                            requiredNetworkRequest = build;
                        }
                    }
                    if (requiredNetworkRequest == null) {
                        ProducerCoroutine producerCoroutine = (ProducerCoroutine) producerScope;
                        producerCoroutine.getClass();
                        producerCoroutine.close(null);
                        return Unit.INSTANCE;
                    }
                    Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(i6, JobKt.launch$default(producerScope, null, null, new GatedFrameClock.AnonymousClass1((NetworkRequestConstraintController) this.this$0, producerScope, continuation, 17), 3), producerScope);
                    if (Build.VERSION.SDK_INT >= 30) {
                        SharedNetworkCallback sharedNetworkCallback = SharedNetworkCallback.INSTANCE;
                        ConnectivityManager connectivityManager = ((NetworkRequestConstraintController) this.this$0).connManager;
                        sharedNetworkCallback.getClass();
                        synchronized (SharedNetworkCallback.requestsLock) {
                            try {
                                LinkedHashMap linkedHashMap = SharedNetworkCallback.requests;
                                boolean isEmpty = linkedHashMap.isEmpty();
                                linkedHashMap.put(recomposer$$ExternalSyntheticLambda4, requiredNetworkRequest);
                                if (isEmpty) {
                                    Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                                    connectivityManager.registerDefaultNetworkCallback(sharedNetworkCallback);
                                } else if (SharedNetworkCallback.capabilitiesInitialized && SharedNetworkCallback.isBlocked != null) {
                                    Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController send initial capabilities");
                                    recomposer$$ExternalSyntheticLambda4.invoke(SharedNetworkCallback.areNetworkConstraintsSatisfied(requiredNetworkRequest, SharedNetworkCallback.cachedCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
                                }
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                        addCallback = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(10, recomposer$$ExternalSyntheticLambda4, connectivityManager);
                    } else {
                        int i29 = IndividualNetworkCallback.$r8$clinit;
                        addCallback = CashAppTagKt.addCallback(((NetworkRequestConstraintController) this.this$0).connManager, requiredNetworkRequest, recomposer$$ExternalSyntheticLambda4);
                    }
                    Handshake$$ExternalSyntheticLambda0 handshake$$ExternalSyntheticLambda0 = new Handshake$$ExternalSyntheticLambda0(1, addCallback);
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, handshake$$ExternalSyntheticLambda0, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                WorkSpec workSpec2 = (WorkSpec) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Headers.Builder builder = (Headers.Builder) this.L$1;
                    builder.getClass();
                    ArrayList arrayList = builder.namesAndValues;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : arrayList) {
                        if (((ConstraintController) obj7).hasConstraint(workSpec2)) {
                            arrayList2.add(obj7);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ConstraintController) it.next()).track(workSpec2.constraints));
                    }
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Badger$collect$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList3).toArray(new Flow[0]), i10));
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(i8, (OnConstraintsStateChangedListener) this.this$0, workSpec2);
                    this.label = 1;
                    if (distinctUntilChanged.collect(cashCdpConfigProvider$1$2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                RealBadger2 realBadger2 = (RealBadger2) this.L$1;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realBadger2.sessionManager.getSessionState(), z6 ? 1 : 0);
                    this.L$0 = null;
                    this.this$0 = coroutineScope5;
                    this.label = 1;
                    if (FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope5 = (CoroutineScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.launch$default(coroutineScope5, null, null, new RealBadger2$setup$1$2(realBadger2, continuation, z7 ? 1 : 0), 3);
                JobKt.launch$default(coroutineScope5, null, null, new RealBadger2$setup$1$2(realBadger2, continuation, i10), 3);
                JobKt.launch$default(coroutineScope5, null, null, new RealBadger2$setup$1$2(realBadger2, continuation, i9), 3);
                return Unit.INSTANCE;
            case 16:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.this$0;
                CompositionImpl compositionImpl = (CompositionImpl) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                try {
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Recomposer recomposer = (Recomposer) this.L$1;
                        this.label = 1;
                        if (recomposer.runRecomposeAndApplyChanges(this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (snapshot$Companion$$ExternalSyntheticLambda0 != null) {
                        snapshot$Companion$$ExternalSyntheticLambda0.dispose();
                    }
                    return Unit.INSTANCE;
                } finally {
                    compositionImpl.dispose();
                    Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda02 = (Snapshot$Companion$$ExternalSyntheticLambda0) ref$ObjectRef.element;
                    if (snapshot$Companion$$ExternalSyntheticLambda02 != null) {
                        snapshot$Companion$$ExternalSyntheticLambda02.dispose();
                    }
                }
            case 17:
                String str3 = " being torn down";
                ?? r2 = "Sandbox: Sandboxed component for ";
                ?? r32 = (LeakDetector) this.L$0;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.L$1;
                StorageLink storageLink = (StorageLink) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                try {
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.i("Sandbox: Running sandboxed workers", new Object[0]);
                        SandboxedSetupTeardowns sandboxedSetupTeardowns = ((VariantSandboxedComponent.Impl) variantSandboxedComponent).sandboxedSetupTeardowns();
                        this.label = 1;
                        if (sandboxedSetupTeardowns.work(this) == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Objects.toString(storageLink);
                    ((NoOpLeakDetector) r32).getClass();
                    variantSandboxedComponent.getClass();
                    ?? r0 = Timber.Forest;
                    r32 = new StringBuilder("Sandbox: Sandboxed component for ");
                    r32.append(storageLink);
                    r32.append(" being torn down");
                    str3 = r32.toString();
                    r2 = new Object[0];
                    r0.i(str3, r2);
                    return Unit.INSTANCE;
                } catch (Throwable th8) {
                    Objects.toString(storageLink);
                    ((NoOpLeakDetector) r32).getClass();
                    variantSandboxedComponent.getClass();
                    Timber.Forest.i(((String) r2) + storageLink + str3, new Object[0]);
                    throw th8;
                }
            case 18:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$22 = new CashCdpConfigProvider$1$2(i2, coroutineScope6, (RealInAppNotificationPresenter) this.this$0);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(cashCdpConfigProvider$1$22, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$23 = new CashCdpConfigProvider$1$2(i6, coroutineScope7, (RealTooltipAppMessagePresenter) this.this$0);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(cashCdpConfigProvider$1$23, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                AndroidAppMessagingService androidAppMessagingService = (AndroidAppMessagingService) this.this$0;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 != 0) {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            if (i36 != 3) {
                                if (i36 != 4) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = (BufferedChannel.BufferedChannelIterator) this.L$1;
                                SafeTrace.throwOnFailure(obj);
                                bufferedChannelIterator2 = bufferedChannelIterator3;
                                this.L$0 = flowCollector4;
                                this.L$1 = bufferedChannelIterator2;
                                this.label = 3;
                                obj4 = bufferedChannelIterator2.hasNext(this);
                                break;
                            } else {
                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator4 = (BufferedChannel.BufferedChannelIterator) this.L$1;
                                SafeTrace.throwOnFailure(obj);
                                bufferedChannelIterator2 = bufferedChannelIterator4;
                                obj4 = obj;
                                if (!((Boolean) obj4).booleanValue()) {
                                    return Unit.INSTANCE;
                                }
                                Boolean bool = (Boolean) bufferedChannelIterator2.next();
                                bool.booleanValue();
                                this.L$0 = flowCollector4;
                                this.L$1 = bufferedChannelIterator2;
                                this.label = 4;
                                break;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            BufferedChannel bufferedChannel = androidAppMessagingService.notifyBuffer;
                            bufferedChannel.getClass();
                            bufferedChannelIterator2 = bufferedChannel.new BufferedChannelIterator();
                            this.L$0 = flowCollector4;
                            this.L$1 = bufferedChannelIterator2;
                            this.label = 3;
                            obj4 = bufferedChannelIterator2.hasNext(this);
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = androidAppMessagingService.pendingMessages;
                    this.L$0 = flowCollector4;
                    this.label = 1;
                    first = FlowKt.first(flow4, this);
                    break;
                }
                Boolean valueOf = Boolean.valueOf(((InlineMessage) first) != null);
                this.L$0 = flowCollector4;
                this.label = 2;
                break;
            case 21:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 != 0) {
                    if (i37 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                InstallAttributer installAttributer = (InstallAttributer) this.L$1;
                Pair pair = new Pair(installAttributer.advertisingIds.get(), (String) this.L$0);
                String str4 = (String) this.this$0;
                this.label = 1;
                Object sendToPeddle = installAttributer.sendToPeddle(pair, str4, this);
                return sendToPeddle == coroutineSingletons21 ? coroutineSingletons21 : sendToPeddle;
            case 22:
                Function1 function1 = (Function1) this.L$0;
                RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) this.L$1;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    registerAliasPresenter.analytics.track(registerAliasPresenter.isSignIn() ? new AccountSignInStart(registerAliasPresenter.aliasType, Boolean.valueOf(((RegisterAliasViewModel) ((MutableState) this.this$0).getValue()).useSmsEditorV2), registerAliasPresenter.flowToken) : new AliasRegisterStart(registerAliasPresenter.aliasType, Boolean.FALSE, registerAliasPresenter.flowToken), null);
                    if (registerAliasPresenter.isSignIn()) {
                        this.label = 1;
                        access$maybeLoginWithDiscoverablePasskey = RegisterAliasPresenter.access$maybeLoginWithDiscoverablePasskey(registerAliasPresenter, function1, this);
                        if (access$maybeLoginWithDiscoverablePasskey == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                access$maybeLoginWithDiscoverablePasskey = obj;
                AliasRegistrar$Result aliasRegistrar$Result = (AliasRegistrar$Result) access$maybeLoginWithDiscoverablePasskey;
                if (aliasRegistrar$Result != null) {
                    registerAliasPresenter.processResult(aliasRegistrar$Result, "", AliasRegistrar$Args.DeliveryMechanism.SMS, registerAliasPresenter.flowToken, (Function1) this.L$0);
                } else {
                    function1.invoke(new SvgDecoder$$ExternalSyntheticLambda0(i3));
                }
                return Unit.INSTANCE;
            case 23:
                CustomerStreamingSubscriber customerStreamingSubscriber = (CustomerStreamingSubscriber) this.L$1;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Reward$Adapter reward$Adapter = new Reward$Adapter();
                    reward$Adapter.avatarsAdapter = new Long(customerStreamingSubscriber.clock.millis());
                    Lifecycle lifecycle = (Lifecycle) this.this$0;
                    Lifecycle.State state3 = Lifecycle.State.RESUMED;
                    DataStoreImpl$data$1 dataStoreImpl$data$12 = new DataStoreImpl$data$1(reward$Adapter, customerStreamingSubscriber, lifecycle, null, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state3, dataStoreImpl$data$12, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                return invokeSuspend$com$squareup$cash$clientsync$CustomerStreamingSubscriber$setup$1$1(obj);
            case 25:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    RealRegionProvider$1$1$1 realRegionProvider$1$1$12 = new RealRegionProvider$1$1$1(coroutineScope8, (MainScreensPresenter) this.this$0, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(realRegionProvider$1$1$12, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                return invokeSuspend$com$squareup$cash$history$navigation$PaymentActionNavigator$setup$lambda$0$$inlined$transform$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$initialscreenloader$backend$AppVersionCheckerActivityWorker$setup$$inlined$setupSingleCoroutine$default$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$initialscreenloader$backend$RealInitialScreenLoader$loadInitialScreen$3(obj);
            default:
                ConnectionPool connectionPool = (ConnectionPool) this.L$1;
                final ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = (WebLoginConfigQueries$$ExternalSyntheticLambda0) this.this$0;
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(webLoginConfigQueries$$ExternalSyntheticLambda0, producerScope2) { // from class: com.squareup.cash.initialscreenloader.backend.util.AndroidAppProcessInfo$activityLifecycleEvents$1$callback$1
                        public final /* synthetic */ ProducerScope $$this$callbackFlow;

                        {
                            this.$$this$callbackFlow = producerScope2;
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            activity.getClass();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                            activity.getClass();
                            if (Boolean.valueOf(activity instanceof OpenTheAppUserJourneyActivity).booleanValue()) {
                                ((ProducerCoroutine) this.$$this$callbackFlow).mo1159trySendJP2dKIU(AppProcessInfo$ActivityEvent.DESTROYED);
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                            activity.getClass();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
                            activity.getClass();
                            if (bundle != null) {
                                ((ProducerCoroutine) this.$$this$callbackFlow).mo1159trySendJP2dKIU(AppProcessInfo$ActivityEvent.POST_CREATED_HAS_STATE);
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                            activity.getClass();
                            if (Boolean.valueOf(activity instanceof OpenTheAppUserJourneyActivity).booleanValue() && bundle == null) {
                                ((ProducerCoroutine) this.$$this$callbackFlow).mo1159trySendJP2dKIU(AppProcessInfo$ActivityEvent.PRE_CREATED_NO_STATE);
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                            activity.getClass();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            activity.getClass();
                            bundle.getClass();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                            activity.getClass();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            activity.getClass();
                        }
                    };
                    ((Application) connectionPool.delegate).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    InteractionRuleClient$$ExternalSyntheticLambda0 interactionRuleClient$$ExternalSyntheticLambda0 = new InteractionRuleClient$$ExternalSyntheticLambda0(i5, connectionPool, activityLifecycleCallbacks);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope2, interactionRuleClient$$ExternalSyntheticLambda0, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(int i) {
            super(2, null);
            this.$r8$classId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation, 0);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                case 1:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(2, continuation, 1);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
                case 2:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2(2, continuation, 2);
                    anonymousClass23.L$0 = obj;
                    return anonymousClass23;
                case 3:
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2(2, continuation, 3);
                    anonymousClass24.L$0 = obj;
                    return anonymousClass24;
                case 4:
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2(2, continuation, 4);
                    anonymousClass25.L$0 = obj;
                    return anonymousClass25;
                case 5:
                    AnonymousClass2 anonymousClass26 = new AnonymousClass2(2, continuation, 5);
                    anonymousClass26.L$0 = obj;
                    return anonymousClass26;
                case 6:
                    AnonymousClass2 anonymousClass27 = new AnonymousClass2(2, continuation, 6);
                    anonymousClass27.L$0 = obj;
                    return anonymousClass27;
                case 7:
                    AnonymousClass2 anonymousClass28 = new AnonymousClass2(2, continuation, 7);
                    anonymousClass28.L$0 = obj;
                    return anonymousClass28;
                case 8:
                    AnonymousClass2 anonymousClass29 = new AnonymousClass2(2, continuation, 8);
                    anonymousClass29.L$0 = obj;
                    return anonymousClass29;
                case 9:
                    AnonymousClass2 anonymousClass210 = new AnonymousClass2(2, continuation, 9);
                    anonymousClass210.L$0 = obj;
                    return anonymousClass210;
                case 10:
                    AnonymousClass2 anonymousClass211 = new AnonymousClass2(2, continuation, 10);
                    anonymousClass211.L$0 = obj;
                    return anonymousClass211;
                case 11:
                    AnonymousClass2 anonymousClass212 = new AnonymousClass2(2, continuation, 11);
                    anonymousClass212.L$0 = obj;
                    return anonymousClass212;
                case 12:
                    AnonymousClass2 anonymousClass213 = new AnonymousClass2(2, continuation, 12);
                    anonymousClass213.L$0 = obj;
                    return anonymousClass213;
                case 13:
                    AnonymousClass2 anonymousClass214 = new AnonymousClass2(2, continuation, 13);
                    anonymousClass214.L$0 = obj;
                    return anonymousClass214;
                case 14:
                    AnonymousClass2 anonymousClass215 = new AnonymousClass2(2, continuation, 14);
                    anonymousClass215.L$0 = obj;
                    return anonymousClass215;
                case 15:
                    AnonymousClass2 anonymousClass216 = new AnonymousClass2(2, continuation, 15);
                    anonymousClass216.L$0 = obj;
                    return anonymousClass216;
                case 16:
                    AnonymousClass2 anonymousClass217 = new AnonymousClass2(2, continuation, 16);
                    anonymousClass217.L$0 = obj;
                    return anonymousClass217;
                case 17:
                    AnonymousClass2 anonymousClass218 = new AnonymousClass2(2, continuation, 17);
                    anonymousClass218.L$0 = obj;
                    return anonymousClass218;
                case 18:
                    AnonymousClass2 anonymousClass219 = new AnonymousClass2(2, continuation, 18);
                    anonymousClass219.L$0 = obj;
                    return anonymousClass219;
                case 19:
                    AnonymousClass2 anonymousClass220 = new AnonymousClass2(2, continuation, 19);
                    anonymousClass220.L$0 = obj;
                    return anonymousClass220;
                case 20:
                    AnonymousClass2 anonymousClass221 = new AnonymousClass2(2, continuation, 20);
                    anonymousClass221.L$0 = obj;
                    return anonymousClass221;
                case 21:
                    AnonymousClass2 anonymousClass222 = new AnonymousClass2(2, continuation, 21);
                    anonymousClass222.L$0 = obj;
                    return anonymousClass222;
                case 22:
                    AnonymousClass2 anonymousClass223 = new AnonymousClass2(2, continuation, 22);
                    anonymousClass223.L$0 = obj;
                    return anonymousClass223;
                case 23:
                    AnonymousClass2 anonymousClass224 = new AnonymousClass2(2, continuation, 23);
                    anonymousClass224.L$0 = obj;
                    return anonymousClass224;
                case 24:
                    AnonymousClass2 anonymousClass225 = new AnonymousClass2(2, continuation, 24);
                    anonymousClass225.L$0 = obj;
                    return anonymousClass225;
                case 25:
                    AnonymousClass2 anonymousClass226 = new AnonymousClass2(2, continuation, 25);
                    anonymousClass226.L$0 = obj;
                    return anonymousClass226;
                case 26:
                    AnonymousClass2 anonymousClass227 = new AnonymousClass2(2, continuation, 26);
                    anonymousClass227.L$0 = obj;
                    return anonymousClass227;
                case 27:
                    AnonymousClass2 anonymousClass228 = new AnonymousClass2(2, continuation, 27);
                    anonymousClass228.L$0 = obj;
                    return anonymousClass228;
                case 28:
                    AnonymousClass2 anonymousClass229 = new AnonymousClass2(2, continuation, 28);
                    anonymousClass229.L$0 = obj;
                    return anonymousClass229;
                default:
                    AnonymousClass2 anonymousClass230 = new AnonymousClass2(2, continuation, 29);
                    anonymousClass230.L$0 = obj;
                    return anonymousClass230;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass2) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass2) create((CameraState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass2) create((CameraState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass2) create((CameraState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass2) create((SliderState$dragScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass2) create((IndexedValue) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass2) create((PageEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass2) create((RealAppLockState.InternalState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass2) create((AcceptableScrim) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass2) create((SyncValueAccounts) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass2) create((SheetPosition) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass2) create((AcceptableScrim) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass2) create((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass2) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass2) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass2) create((AddressResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass2) create((GetDependentSavingsBalance) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    return ((AnonymousClass2) create((GetDependentSavingsBalance) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 22:
                    return ((AnonymousClass2) create((TextFieldValue) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 23:
                    return ((AnonymousClass2) create((ActivityResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    return ((AnonymousClass2) create((ActivityResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 25:
                    return ((AnonymousClass2) create((RenderedPayment) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass2) create((UiAccess) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    return ((AnonymousClass2) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 28:
                    return ((AnonymousClass2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass2) create((SupOffersTabCreditLine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PaymentHistoryData paymentHistoryData;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CameraState cameraState = (CameraState) this.L$0;
                    return Boolean.valueOf((cameraState instanceof CameraStateClosing) || (cameraState instanceof CameraStateClosed));
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(((CameraState) this.L$0) instanceof CameraStateClosed);
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(!(((CameraState) this.L$0) instanceof CameraStateUnopened));
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((SliderState$dragScope$1) this.L$0).dragBy(RecyclerView.DECELERATION_RATE);
                    return Unit.INSTANCE;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(((IndexedValue) this.L$0) != null);
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PageEvent pageEvent = (PageEvent) this.L$0;
                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                        r3 = true;
                    }
                    if (r3) {
                        Log.v("Paging", "Sent " + pageEvent, null);
                    }
                    return Unit.INSTANCE;
                case 7:
                    RealAppLockState.InternalState internalState = (RealAppLockState.InternalState) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if ((internalState.appState instanceof RealAppLockState.AppState.Foreground) && !(internalState.lockState instanceof RealAppLockState.LockState.Locked)) {
                        r3 = true;
                    }
                    return Boolean.valueOf(r3);
                case 8:
                    AcceptableScrim acceptableScrim = (AcceptableScrim) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = acceptableScrim.activeScrim;
                    if (parcelableSnapshotMutableState.getValue() instanceof ScrimScreen.ManagedAccountSwitchScrimScreen) {
                        acceptableScrim.managedDismissRequested.setValue(Boolean.TRUE);
                    } else {
                        parcelableSnapshotMutableState.setValue(null);
                    }
                    return Unit.INSTANCE;
                case 9:
                    SyncValueAccounts syncValueAccounts = (SyncValueAccounts) this.L$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(syncValueAccounts != null);
                case 10:
                    SheetPosition sheetPosition = (SheetPosition) this.L$0;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(sheetPosition == SheetPosition.Expanded);
                case 11:
                    AcceptableScrim acceptableScrim2 = (AcceptableScrim) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = acceptableScrim2.activeScrim;
                    if (parcelableSnapshotMutableState2.getValue() instanceof ScrimScreen.ManagedAccountSwitchScrimScreen) {
                        acceptableScrim2.managedDismissRequested.setValue(Boolean.TRUE);
                    } else {
                        parcelableSnapshotMutableState2.setValue(null);
                    }
                    return Unit.INSTANCE;
                case 12:
                    FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) this.L$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled());
                case 13:
                    Object obj2 = this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = (Boolean) obj2;
                    bool.booleanValue();
                    return bool;
                case 14:
                    Object obj3 = this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = (Boolean) obj3;
                    bool2.booleanValue();
                    return bool2;
                case 15:
                    Object obj4 = this.L$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool3 = (Boolean) obj4;
                    bool3.booleanValue();
                    return bool3;
                case 16:
                    Map map = (Map) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(!map.isEmpty());
                case 17:
                    Map map2 = (Map) this.L$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(!map2.isEmpty());
                case 18:
                    List list = (List) this.L$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return new StartedLazily$command$$inlined$unsafeFlow$1(list, 3);
                case 19:
                    AddressResult addressResult = (AddressResult) this.L$0;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(Intrinsics.areEqual(addressResult, NoAddressResult.INSTANCE));
                case 20:
                    GetDependentSavingsBalance getDependentSavingsBalance = (GetDependentSavingsBalance) this.L$0;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (getDependentSavingsBalance != null) {
                        return getDependentSavingsBalance.general_balance;
                    }
                    return null;
                case 21:
                    GetDependentSavingsBalance getDependentSavingsBalance2 = (GetDependentSavingsBalance) this.L$0;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (getDependentSavingsBalance2 != null) {
                        return getDependentSavingsBalance2.balance;
                    }
                    return null;
                case 22:
                    TextFieldValue textFieldValue = (TextFieldValue) this.L$0;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(!StringsKt.isBlank(textFieldValue.annotatedString.text));
                case 23:
                    ActivityResult activityResult = (ActivityResult) this.L$0;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int i = activityResult.resultCode;
                    if (i == -1) {
                        Timber.Forest.d("Created wallet", new Object[0]);
                    } else if (i != 0) {
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Failed to create wallet, resultCode = "), new Object[0]);
                    } else {
                        Timber.Forest.d("User canceled while creating wallet", new Object[0]);
                    }
                    return Unit.INSTANCE;
                case 24:
                    ActivityResult activityResult2 = (ActivityResult) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int i2 = activityResult2.resultCode;
                    if (i2 == -1) {
                        Timber.Forest.d("Added card to wallet", new Object[0]);
                    } else if (i2 != 0) {
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Failed to add card to wallet, resultCode = "), new Object[0]);
                    } else {
                        Timber.Forest.d("User canceled adding card to wallet", new Object[0]);
                    }
                    return Unit.INSTANCE;
                case 25:
                    RenderedPayment renderedPayment = (RenderedPayment) this.L$0;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (renderedPayment == null || (paymentHistoryData = renderedPayment.historyData) == null) {
                        return null;
                    }
                    return paymentHistoryData.confirm_cancellation_text;
                case 26:
                    UiAccess uiAccess = (UiAccess) this.L$0;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(uiAccess != null);
                case 27:
                    SharingCommand sharingCommand = (SharingCommand) this.L$0;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return Boolean.valueOf(sharingCommand != SharingCommand.START);
                case 28:
                    List list2 = (List) this.L$0;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list3 = list2;
                    return Boolean.valueOf(!(list3 == null || list3.isEmpty()));
                default:
                    SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) this.L$0;
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (supOffersTabCreditLine != null) {
                        return supOffersTabCreditLine.credit_limit;
                    }
                    return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }
    }

    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass5 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DataStoreImpl dataStoreImpl, Continuation continuation) {
            super(3, continuation);
            this.$r8$classId = 0;
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 3;
            FlowCollector flowCollector = (FlowCollector) obj;
            Continuation continuation = (Continuation) obj3;
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass5((DataStoreImpl) this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
                case 1:
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(i, continuation, 1);
                    anonymousClass5.this$0 = flowCollector;
                    return anonymousClass5.invokeSuspend(Unit.INSTANCE);
                default:
                    AnonymousClass5 anonymousClass52 = new AnonymousClass5(i, continuation, 2);
                    anonymousClass52.this$0 = flowCollector;
                    return anonymousClass52.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DataStoreImpl dataStoreImpl = (DataStoreImpl) this.this$0;
                        this.label = 1;
                        if (DataStoreImpl.access$decrementCollector(dataStoreImpl, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f = new Float(1.0f);
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector.emit(f, this) == coroutineSingletons2) {
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
                    FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector2.emit(null, this) == coroutineSingletons3) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass5(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5() {
            super(3, null);
            this.$r8$classId = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$data$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$0 = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$data$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$data$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(Continuation continuation, RealBadger2 realBadger2) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.L$1 = realBadger2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$data$1(Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$data$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
    }
}
