package app.cash.molecule;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InputMethodSession;
import androidx.compose.ui.platform.MotionDurationScaleImpl;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.viewinterop.BringIntoViewNode;
import androidx.datastore.core.Data;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1;
import androidx.datastore.core.Message$Update;
import androidx.datastore.core.SimpleActor;
import androidx.datastore.preferences.core.Preferences;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.tracing.Trace;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.backend.jvm.FlushStrategyCoordinator;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.passcode.backend.AppLockMonitor;
import app.cash.passcode.backend.AppLockMonitor$setup$1$1$1;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler;
import app.cash.sqldelight.ExecutableQuery$$ExternalSyntheticLambda0;
import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b$$ExternalSyntheticLambda3;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorage$editSync$1$1;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.R;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker$setup$1$3;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.SetupTeardown;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.PapaEvent;
import papa.SafeTrace;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class GatedFrameClock implements MonotonicFrameClock {
    public final BroadcastFrameClock clock;
    public final BufferedChannel frameSends;
    public boolean isRunning;
    public long lastNanos;
    public int lastOffset;

    public GatedFrameClock(CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        coroutineContext.getClass();
        this.frameSends = PapaEvent.Channel$default(-1, null, null, 6);
        JobKt.launch$default(coroutineScope, coroutineContext, null, new AnonymousClass1(this, (Continuation) null, 0), 2);
        this.isRunning = true;
        this.clock = new BroadcastFrameClock(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 22));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final void sendFrame() {
        int i;
        long nanoTime = System.nanoTime();
        if (nanoTime == this.lastNanos) {
            i = this.lastOffset + 1;
        } else {
            this.lastNanos = nanoTime;
            i = 0;
        }
        this.lastOffset = i;
        this.clock.queue.flushAndDispatchAwaiters(new FlowKt__DelayKt$$ExternalSyntheticLambda0(nanoTime + i, 1));
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object withFrameNanos(Continuation continuation, Function1 function1) {
        return this.clock.withFrameNanos(continuation, function1);
    }

    /* renamed from: app.cash.molecule.GatedFrameClock$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((GatedFrameClock) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((BringIntoViewResponderNode) this.L$0, (LaunchTracker$$ExternalSyntheticLambda0) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((TransformedTextFieldState) this.L$0, (WorkLauncherImpl) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((MutableSharedFlow) this.L$0, (WorkLauncherImpl) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((Job) this.L$0, (CursorAnimationState) obj2, continuation, 4);
                case 5:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((TextFieldDecoratorModifierNode) obj2, continuation, 5);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 6:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((TextFieldMagnifierNodeImpl28) obj2, continuation, 6);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 7:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((AndroidRippleNode) obj2, continuation, 7);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 8:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((AndroidPlatformTextInputSession) obj2, continuation, 8);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 9:
                    return new AnonymousClass1((StateFlow) this.L$0, (MotionDurationScaleImpl) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1((Recomposer) this.L$0, (View) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((BringIntoViewNode) this.L$0, (Rect) obj2, continuation, 11);
                case 12:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((List) obj2, continuation, 12);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 13:
                    return new AnonymousClass1((Function2) this.L$0, (Data) obj2, continuation, 13);
                case 14:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((DataStoreImpl) obj2, continuation, 14);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                case 15:
                    return new AnonymousClass1((SimpleActor) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass1((TriggerBasedInvalidationTracker) this.L$0, (Function0) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass1((NetworkRequestConstraintController) this.L$0, (ProducerScope) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass1((FlushStrategyCoordinator) this.L$0, (FlushStrategy) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass1((SessionManager) this.L$0, (CashCdpConfigProvider) obj2, continuation, 19);
                case 20:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((LocalActivitySetupTeardown) obj2, continuation, 20);
                    anonymousClass17.L$0 = obj;
                    return anonymousClass17;
                case 21:
                    return new AnonymousClass1((FinishSetupTileBadgeCounter) this.L$0, (AppLockMonitor) obj2, continuation, 21);
                case 22:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1(continuation, (AppLockRecentScreenshotsDisabler) obj2, 22);
                    anonymousClass18.L$0 = obj;
                    return anonymousClass18;
                case 23:
                    return new AnonymousClass1((Query) this.L$0, obj2, continuation, 23);
                case 24:
                    return new AnonymousClass1((JavaDataStorage) this.L$0, (Function1) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((RealServiceContextManager) this.L$0, (RequestContext) obj2, continuation, 25);
                case 26:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1(continuation, (AppMessageSyncer) obj2, 26);
                    anonymousClass19.L$0 = obj;
                    return anonymousClass19;
                case 27:
                    AnonymousClass1 anonymousClass110 = new AnonymousClass1(continuation, (ActivityTransitionsSideEffectsPerformer) obj2, 27);
                    anonymousClass110.L$0 = obj;
                    return anonymousClass110;
                case 28:
                    AnonymousClass1 anonymousClass111 = new AnonymousClass1(continuation, (DeepLinkOnboardingContextWorker) obj2, 28);
                    anonymousClass111.L$0 = obj;
                    return anonymousClass111;
                default:
                    AnonymousClass1 anonymousClass112 = new AnonymousClass1((BeaconDetectionSetupTeardown) obj2, continuation, 29);
                    anonymousClass112.L$0 = obj;
                    return anonymousClass112;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 3:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 4:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 5:
                    ((AnonymousClass1) create((AndroidPlatformTextInputSession) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 6:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    ((AnonymousClass1) create((InputMethodSession) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 9:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 10:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass1) create((DataStoreImpl$InitDataStore$doRun$initData$1$api$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass1) create((Message$Update) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 22:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 23:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 25:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 28:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass1) create((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:212:0x03c1, code lost:
        
            if (r2 != r0) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:214:0x03cc, code lost:
        
            if (r1.invoke(r2, r24) == r0) goto L190;
         */
        /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:367:0x066f, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(500, r24) == r0) goto L335;
         */
        /* JADX WARN: Code restructure failed: missing block: B:384:0x064c, code lost:
        
            if (kotlinx.coroutines.JobKt.cancelAndJoin(r2, r24) == r0) goto L335;
         */
        /* JADX WARN: Code restructure failed: missing block: B:400:0x06b3, code lost:
        
            if (r1.collect(r2, r24) == r0) goto L353;
         */
        /* JADX WARN: Code restructure failed: missing block: B:402:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:404:0x069f, code lost:
        
            if (androidx.compose.runtime.Updater.withFrameMillis(r1, r24) == r0) goto L353;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:371:0x0665  */
        /* JADX WARN: Removed duplicated region for block: B:432:0x0741  */
        /* JADX WARN: Removed duplicated region for block: B:435:0x0737  */
        /* JADX WARN: Removed duplicated region for block: B:437:0x0748  */
        /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x03cc -> B:179:0x03d0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x066f -> B:309:0x0673). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:375:0x0735 -> B:371:0x0739). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
            Object hasNext;
            Object obj2;
            AnonymousClass1 anonymousClass1;
            Object access$notifyInvalidation;
            Object await;
            Object edit;
            int i = this.$r8$classId;
            int i2 = 6;
            int i3 = 12;
            int i4 = 5;
            int i5 = 7;
            int i6 = 8;
            int i7 = 4;
            int i8 = 9;
            int i9 = 3;
            int i10 = 0;
            int i11 = 2;
            Object obj3 = this.this$0;
            int i12 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    GatedFrameClock gatedFrameClock = (GatedFrameClock) obj3;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel = gatedFrameClock.frameSends;
                        bufferedChannel.getClass();
                        bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                        this.L$0 = bufferedChannelIterator;
                        this.label = 1;
                        hasNext = bufferedChannelIterator.hasNext(this);
                        if (hasNext == coroutineSingletons) {
                        }
                        if (((Boolean) hasNext).booleanValue()) {
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        hasNext = obj;
                        if (((Boolean) hasNext).booleanValue()) {
                            bufferedChannelIterator.next();
                            gatedFrameClock.sendFrame();
                            this.L$0 = bufferedChannelIterator;
                            this.label = 1;
                            hasNext = bufferedChannelIterator.hasNext(this);
                            if (hasNext == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (((Boolean) hasNext).booleanValue()) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (PlatformKt.bringIntoView((BringIntoViewResponderNode) this.L$0, (LaunchTracker$$ExternalSyntheticLambda0) obj3, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.L$0;
                    final WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) obj3;
                    ?? r2 = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0
                        @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                            long j = textFieldCharSequence.selection;
                            TextRange textRange = textFieldCharSequence.composition;
                            long j2 = textFieldCharSequence2.selection;
                            TextRange textRange2 = textFieldCharSequence2.composition;
                            WorkLauncherImpl workLauncherImpl2 = WorkLauncherImpl.this;
                            if (z) {
                                workLauncherImpl2.requireImm().restartInput((View) workLauncherImpl2.processor);
                                return;
                            }
                            if (TextRange.m986equalsimpl0(j, j2) && Intrinsics.areEqual(textRange, textRange2)) {
                                return;
                            }
                            workLauncherImpl2.requireImm().updateSelection((View) workLauncherImpl2.processor, TextRange.m990getMinimpl(j2), TextRange.m989getMaximpl(j2), textRange2 != null ? TextRange.m990getMinimpl(textRange2.packedValue) : -1, textRange2 != null ? TextRange.m989getMaximpl(textRange2.packedValue) : -1);
                        }
                    };
                    this.label = 1;
                    transformedTextFieldState.collectImeNotifications(r2, this);
                    return coroutineSingletons3;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = new SaversKt$$ExternalSyntheticLambda2(i4);
                        this.label = 1;
                        break;
                    } else {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            OptionalProvider$$ExternalSyntheticLambda0.m$1();
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.L$0;
                    RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1((WorkLauncherImpl) obj3, i12);
                    this.label = 2;
                    break;
                case 4:
                    CursorAnimationState cursorAnimationState = (CursorAnimationState) obj3;
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = cursorAnimationState.cursorAlpha$delegate;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    try {
                        if (i17 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Job job = (Job) this.L$0;
                            if (job != null) {
                                this.label = 1;
                                break;
                            }
                        } else if (i17 == 1) {
                            SafeTrace.throwOnFailure(obj);
                        } else {
                            if (i17 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                throw new KotlinNothingValueException();
                            }
                            if (i17 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                parcelableSnapshotMutableFloatState.setFloatValue(RecyclerView.DECELERATION_RATE);
                                this.label = 4;
                            } else {
                                if (i17 != 4) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                parcelableSnapshotMutableFloatState.setFloatValue(1.0f);
                                this.label = 3;
                                if (JobKt.delay(500L, this) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                parcelableSnapshotMutableFloatState.setFloatValue(RecyclerView.DECELERATION_RATE);
                                this.label = 4;
                                break;
                            }
                        }
                        parcelableSnapshotMutableFloatState.setFloatValue(1.0f);
                        if (!cursorAnimationState.animate) {
                            this.label = 2;
                            JobKt.awaitCancellation(this);
                            return coroutineSingletons5;
                        }
                        this.label = 3;
                        if (JobKt.delay(500L, this) == coroutineSingletons5) {
                        }
                        parcelableSnapshotMutableFloatState.setFloatValue(RecyclerView.DECELERATION_RATE);
                        this.label = 4;
                    } catch (Throwable th) {
                        parcelableSnapshotMutableFloatState.setFloatValue(RecyclerView.DECELERATION_RATE);
                        throw th;
                    }
                case 5:
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) obj3;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) this.L$0;
                    TransformedTextFieldState transformedTextFieldState2 = textFieldDecoratorModifierNode.textFieldState;
                    TextLayoutState textLayoutState = textFieldDecoratorModifierNode.textLayoutState;
                    ImeOptions imeOptions$foundation = textFieldDecoratorModifierNode.keyboardOptions.toImeOptions$foundation(textFieldDecoratorModifierNode.singleLine);
                    TextFieldDecoratorModifierNode$startInputSession$1$1$1 textFieldDecoratorModifierNode$startInputSession$1$1$1 = new TextFieldDecoratorModifierNode$startInputSession$1$1$1(1, 8, TextFieldDecoratorModifierNode.class, textFieldDecoratorModifierNode, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z");
                    TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 textFieldDecoratorModifierNode$$ExternalSyntheticLambda1 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(textFieldDecoratorModifierNode, i8);
                    MutableSharedFlow mutableSharedFlow2 = textFieldDecoratorModifierNode.stylusHandwritingTrigger;
                    ViewConfiguration viewConfiguration = (ViewConfiguration) DepthSortedSetKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.LocalViewConfiguration);
                    TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda2 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(textFieldDecoratorModifierNode, i6);
                    this.label = 1;
                    Trace.platformSpecificTextInputSession(androidPlatformTextInputSession, transformedTextFieldState2, textLayoutState, imeOptions$foundation, textFieldDecoratorModifierNode$startInputSession$1$1$1, textFieldDecoratorModifierNode$$ExternalSyntheticLambda1, mutableSharedFlow2, viewConfiguration, textFieldDecoratorModifierNode$$ExternalSyntheticLambda2, this);
                    return coroutineSingletons6;
                case 6:
                    TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = (TextFieldMagnifierNodeImpl28) obj3;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new ImageLoader$Builder$$ExternalSyntheticLambda1(textFieldMagnifierNodeImpl28, i8));
                        CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(i12, textFieldMagnifierNodeImpl28, coroutineScope);
                        this.label = 1;
                        if (snapshotFlow.collect(cashCdpConfigProvider$1$2, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    AndroidRippleNode androidRippleNode = (AndroidRippleNode) obj3;
                    SharedFlowImpl sharedFlowImpl = androidRippleNode.interactionSource.interactions;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$22 = new CashCdpConfigProvider$1$2(i11, androidRippleNode, coroutineScope2);
                    this.label = 1;
                    sharedFlowImpl.collect(cashCdpConfigProvider$1$22, this);
                    return coroutineSingletons8;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                        AndroidPlatformTextInputSession androidPlatformTextInputSession2 = (AndroidPlatformTextInputSession) obj3;
                        this.L$0 = inputMethodSession;
                        this.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                        cancellableContinuationImpl.initCancellability();
                        TextInputService textInputService = androidPlatformTextInputSession2.textInputService;
                        PlatformTextInputService platformTextInputService = textInputService.platformTextInputService;
                        platformTextInputService.startInput();
                        textInputService._currentInputSession.set(new TextInputSession(textInputService, platformTextInputService));
                        cancellableContinuationImpl.invokeOnCancellation(new SimpleActor.AnonymousClass1(i2, inputMethodSession, androidPlatformTextInputSession2));
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow stateFlow = (StateFlow) this.L$0;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$12 = new RealRegionProvider$1$1$1((MotionDurationScaleImpl) obj3, i9);
                        this.label = 1;
                        if (stateFlow.collect(realRegionProvider$1$1$12, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 10:
                    Recomposer recomposer = (Recomposer) this.L$0;
                    View view = (View) obj3;
                    Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    try {
                        if (i23 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            Object first = FlowKt.first(recomposer._state, new Recomposer$join$2(i11, continuation, i10), this);
                            if (first != obj4) {
                                first = Unit.INSTANCE;
                            }
                            if (first == obj4) {
                                return obj4;
                            }
                        } else {
                            if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    } finally {
                        if (WindowRecomposer_androidKt.getCompositionContext(view) == recomposer) {
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                        }
                    }
                case 11:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BringIntoViewNode bringIntoViewNode = (BringIntoViewNode) this.L$0;
                        ContourLayout$geometry$1 contourLayout$geometry$1 = new ContourLayout$geometry$1((Rect) obj3, i3);
                        this.label = 1;
                        if (PlatformKt.bringIntoView(bringIntoViewNode, contourLayout$geometry$1, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$0;
                        this.label = 1;
                        if (TransactorKt.access$runMigrations((List) obj3, dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Function2 function2 = (Function2) this.L$0;
                    Object obj5 = ((Data) obj3).value;
                    this.label = 1;
                    Object invoke = function2.invoke(obj5, this);
                    return invoke == coroutineSingletons13 ? coroutineSingletons13 : invoke;
                case 14:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Message$Update message$Update = (Message$Update) this.L$0;
                        this.label = 1;
                        if (DataStoreImpl.access$handleUpdate((DataStoreImpl) obj3, message$Update, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    SimpleActor simpleActor = (SimpleActor) obj3;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((AtomicInteger) ((MemoryCacheService) simpleActor.remainingMessages).imageLoader).get() <= 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        JobKt.ensureActive(((CoroutineScope) simpleActor.scope).getCoroutineContext());
                        anonymousClass1 = (AnonymousClass1) simpleActor.consumeMessage;
                        BufferedChannel bufferedChannel2 = (BufferedChannel) simpleActor.messageQueue;
                        this.L$0 = anonymousClass1;
                        this.label = 1;
                        bufferedChannel2.getClass();
                        obj2 = BufferedChannel.receive$suspendImpl(bufferedChannel2, this);
                    } else if (i28 == 1) {
                        anonymousClass1 = (AnonymousClass1) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    } else {
                        if (i28 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        if (((AtomicInteger) ((MemoryCacheService) simpleActor.remainingMessages).imageLoader).decrementAndGet() == 0) {
                            return Unit.INSTANCE;
                        }
                        JobKt.ensureActive(((CoroutineScope) simpleActor.scope).getCoroutineContext());
                        anonymousClass1 = (AnonymousClass1) simpleActor.consumeMessage;
                        BufferedChannel bufferedChannel22 = (BufferedChannel) simpleActor.messageQueue;
                        this.L$0 = anonymousClass1;
                        this.label = 1;
                        bufferedChannel22.getClass();
                        obj2 = BufferedChannel.receive$suspendImpl(bufferedChannel22, this);
                        break;
                    }
                case 16:
                    Function0 function0 = (Function0) obj3;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    try {
                        if (i29 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) this.L$0;
                            this.label = 1;
                            access$notifyInvalidation = TriggerBasedInvalidationTracker.access$notifyInvalidation(triggerBasedInvalidationTracker, this);
                            if (access$notifyInvalidation == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        } else {
                            if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            access$notifyInvalidation = obj;
                        }
                        function0.invoke();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        function0.invoke();
                        throw th2;
                    }
                case 17:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(1000L, this) == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                    ((ProducerCoroutine) ((ProducerScope) obj3)).mo1159trySendJP2dKIU(new ConstraintsState.ConstraintsNotMet(7));
                    return Unit.INSTANCE;
                case 18:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlushStrategyCoordinator flushStrategyCoordinator = (FlushStrategyCoordinator) this.L$0;
                        FlushStrategy flushStrategy = (FlushStrategy) obj3;
                        this.label = 1;
                        Object collect = flushStrategy.getTriggers().collect(new CashCdpConfigProvider$1$2(i7, flushStrategy, flushStrategyCoordinator), this);
                        if (collect != coroutineSingletons18) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 19:
                    SessionManager sessionManager = (SessionManager) this.L$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(i11, sessionManager.getSessionState(), sessionManager));
                        CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$23 = new CashCdpConfigProvider$1$2(i10, (CashCdpConfigProvider) obj3, sessionManager);
                        this.label = 1;
                        if (distinctUntilChanged.collect(cashCdpConfigProvider$1$23, this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    LocalActivitySetupTeardown localActivitySetupTeardown = (LocalActivitySetupTeardown) obj3;
                    String str = (String) this.L$0;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = localActivitySetupTeardown.shortlinkHandler;
                        ShortlinkAction shortlinkAction = new ShortlinkAction(str, null);
                        Navigator navigator = localActivitySetupTeardown.navigator;
                        GetShortlinkRequest.InvocationContext invocationContext = GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_AUTO_DISPLAY;
                        b$$ExternalSyntheticLambda3 b__externalsyntheticlambda3 = new b$$ExternalSyntheticLambda3(i7);
                        this.L$0 = null;
                        this.label = 1;
                        if (realCashLocalShortlinkHandler.handleShortlink(shortlinkAction, navigator, invocationContext, b__externalsyntheticlambda3, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    AppLockMonitor appLockMonitor = (AppLockMonitor) obj3;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowBuilder merge = FlowKt.merge((FinishSetupTileBadgeCounter) this.L$0, appLockMonitor.customerToggleEvents, appLockMonitor.featureFlagEvents);
                        AppLockMonitor$setup$1$1$1 appLockMonitor$setup$1$1$1 = new AppLockMonitor$setup$1$1$1(appLockMonitor.appLockState, i10);
                        this.label = 1;
                        if (merge.collect(appLockMonitor$setup$1$1$1, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AppLockRecentScreenshotsDisabler appLockRecentScreenshotsDisabler = (AppLockRecentScreenshotsDisabler) obj3;
                        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = appLockRecentScreenshotsDisabler.shouldDisableScreenshots;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$13 = new RealRegionProvider$1$1$1(appLockRecentScreenshotsDisabler, i2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(realRegionProvider$1$1$13, this) == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Query query = (Query) this.L$0;
                        this.label = 1;
                        await = query.execute(new ExecutableQuery$$ExternalSyntheticLambda0(query, 3)).await(this);
                        if (await == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i36 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        await = obj;
                    }
                    return await == null ? obj3 : await;
                case 24:
                    JavaDataStorage javaDataStorage = (JavaDataStorage) this.L$0;
                    ThreadLocal threadLocal = javaDataStorage.editLock;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    try {
                        if (i37 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Object obj6 = threadLocal.get();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.areEqual(obj6, bool)) {
                                a$$ExternalSyntheticBUOutline0.m$1("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                                return null;
                            }
                            threadLocal.set(bool);
                            DataStore dataStore = javaDataStorage.dataStore;
                            JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$1 = new JavaDataStorage$editSync$1$1((Function1) obj3, (Continuation) null);
                            this.label = 1;
                            edit = DimensionKt.edit(dataStore, javaDataStorage$editSync$1$1, this);
                            if (edit == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        } else {
                            if (i37 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            edit = obj;
                        }
                        return (Preferences) edit;
                    } finally {
                        threadLocal.set(Boolean.FALSE);
                    }
                case 25:
                    RequestContext requestContext = (RequestContext) obj3;
                    RealServiceContextManager realServiceContextManager = (RealServiceContextManager) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PaymentManager paymentManager = (PaymentManager) realServiceContextManager.paymentManager.getValue();
                        Set set = CollectionsKt.toSet(requestContext.payment_tokens);
                        RealPaymentManager realPaymentManager = (RealPaymentManager) paymentManager;
                        realPaymentManager.getClass();
                        set.getClass();
                        realPaymentManager.pendingPaymentTokens.removeAll(set);
                        if (!requestContext.payment_tokens.isEmpty()) {
                            RealReferralManager realReferralManager = (RealReferralManager) realServiceContextManager.referralManager.getValue();
                            this.label = 1;
                            if (realReferralManager.refresh(true, this) == coroutineSingletons25) {
                                return coroutineSingletons25;
                            }
                        }
                    } else {
                        if (i38 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    AppMessageSyncer appMessageSyncer = (AppMessageSyncer) obj3;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = this.label;
                    if (i39 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(i4, FlowKt.merge(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(appMessageSyncer.activityEvents, 2), PlatformKt.getOnAuthenticated(appMessageSyncer.sessionManager)), appMessageSyncer);
                        CashApp$onCreate$4$1$1 cashApp$onCreate$4$1$1 = new CashApp$onCreate$4$1$1(appMessageSyncer, continuation, i3);
                        this.L$0 = null;
                        this.label = 1;
                        if (FlowKt.collectLatest(finishSetupTileBadgeCounter, cashApp$onCreate$4$1$1, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i39 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i40 = this.label;
                    if (i40 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = (ActivityTransitionsSideEffectsPerformer) obj3;
                        Flow flow = (Flow) activityTransitionsSideEffectsPerformer.activityEvents;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$14 = new RealRegionProvider$1$1$1(activityTransitionsSideEffectsPerformer, i5);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow.collect(realRegionProvider$1$1$14, this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i40 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 28:
                    Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i41 = this.label;
                    if (i41 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DeepLinkOnboardingContextWorker deepLinkOnboardingContextWorker = (DeepLinkOnboardingContextWorker) obj3;
                        SharedFlow sharedFlow = deepLinkOnboardingContextWorker.deepLinkState;
                        ReadonlyStateFlow readonlyStateFlow = deepLinkOnboardingContextWorker.onboardingFlowTokenManager.flowToken;
                        DeepLinkOnboardingContextWorker$setup$1$3 deepLinkOnboardingContextWorker$setup$1$3 = DeepLinkOnboardingContextWorker$setup$1$3.INSTANCE;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$15 = new RealRegionProvider$1$1$1(deepLinkOnboardingContextWorker, i8);
                        this.L$0 = null;
                        this.label = 1;
                        Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(deepLinkOnboardingContextWorker$setup$1$3, continuation, i10), new Badger$collect$$inlined$map$1.AnonymousClass2(realRegionProvider$1$1$15, i6), new Flow[]{sharedFlow, readonlyStateFlow});
                        if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            combineInternal = Unit.INSTANCE;
                        }
                        if (combineInternal != obj7) {
                            combineInternal = Unit.INSTANCE;
                        }
                        if (combineInternal == obj7) {
                            return obj7;
                        }
                    } else {
                        if (i41 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$0;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i42 = this.label;
                    if (i42 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (featureFlag$EnabledDisabledFeatureFlag$Options.enabled()) {
                            this.L$0 = null;
                            this.label = 1;
                            if (BeaconDetectionSetupTeardown.access$runDetection((BeaconDetectionSetupTeardown) obj3, this) == coroutineSingletons28) {
                                return coroutineSingletons28;
                            }
                        }
                    } else {
                        if (i42 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Continuation continuation, SetupTeardown setupTeardown, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = setupTeardown;
        }
    }
}
