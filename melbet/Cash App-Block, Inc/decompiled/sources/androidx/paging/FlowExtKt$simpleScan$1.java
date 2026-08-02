package androidx.paging;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import android.view.textclassifier.TextClassifier;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.impl.UseCaseCameraState;
import androidx.camera.camera2.pipe.core.MutexesKt$lockAndSuspend$lockFn$1;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.compose.SurfaceRequestScope;
import androidx.camera.compose.SurfaceRequestScope$provideSurfaceAndWaitForCompletion$2$3;
import androidx.camera.core.AutoValue_SurfaceRequest_Result;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Config;
import androidx.camera.core.processing.Edge;
import androidx.camera.view.PreviewView;
import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition$run$1$1$3;
import androidx.compose.animation.core.MutatorMutex;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntRect;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.core.os.BundleKt;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.session.IdleEventBroadcastReceiver;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.glance.session.TimeoutCancellationException;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.glance.state.GlanceState;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcher$flow$1;
import androidx.paging.PageFetcherSnapshotState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.BuyerIntentType;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.RealBuyerIntentManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealCartBuilderManager$$ExternalSyntheticLambda1;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.FastCodeUpdatesKt$withDevelopmentServerPush$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.RealImageLoader$execute$result$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalInStoreOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalRemoteOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest$Update$InStoreOrdering;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest$Update$RemoteOrdering;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import kotlin.Function;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.Cache;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FlowExtKt$simpleScan$1 extends SuspendLambda implements Function2 {
    public Object $operation;
    public final /* synthetic */ int $r8$classId;
    public Object $this_simpleScan;
    public Object L$0;
    public Object L$1;
    public int label;

    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ FlowCollector $$this$flow;
        public final /* synthetic */ Ref$ObjectRef $accumulator;
        public final /* synthetic */ Function3 $operation;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(Ref$ObjectRef ref$ObjectRef, Function3 function3, FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$accumulator = ref$ObjectRef;
            this.$operation = function3;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (r1.emit(r11, r0) != r13) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        
            if (r11 == r13) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
        
            if (r1.emit(r11, r0) != r13) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
            int i;
            Ref$ObjectRef ref$ObjectRef;
            FlowExtKt$simpleRunningReduce$1$1$emit$1 flowExtKt$simpleRunningReduce$1$1$emit$1;
            int i2;
            Ref$ObjectRef ref$ObjectRef2;
            int i3 = this.$r8$classId;
            FlowCollector flowCollector = this.$$this$flow;
            Function3 function3 = this.$operation;
            Ref$ObjectRef ref$ObjectRef3 = this.$accumulator;
            switch (i3) {
                case 0:
                    if (continuation instanceof FlowExtKt$simpleScan$1$1$emit$1) {
                        flowExtKt$simpleScan$1$1$emit$1 = (FlowExtKt$simpleScan$1$1$emit$1) continuation;
                        int i4 = flowExtKt$simpleScan$1$1$emit$1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            flowExtKt$simpleScan$1$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = flowExtKt$simpleScan$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = flowExtKt$simpleScan$1$1$emit$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Object obj3 = ref$ObjectRef3.element;
                                flowExtKt$simpleScan$1$1$emit$1.L$0 = ref$ObjectRef3;
                                flowExtKt$simpleScan$1$1$emit$1.label = 1;
                                obj2 = ((PageFetcher$flow$1.AnonymousClass2) function3).invoke(obj3, obj, flowExtKt$simpleScan$1$1$emit$1);
                                if (obj2 != coroutineSingletons) {
                                    ref$ObjectRef = ref$ObjectRef3;
                                }
                                break;
                            } else if (i == 1) {
                                ref$ObjectRef = flowExtKt$simpleScan$1$1$emit$1.L$0;
                                SafeTrace.throwOnFailure(obj2);
                            } else if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                                break;
                            }
                            ref$ObjectRef.element = obj2;
                            Object obj4 = ref$ObjectRef3.element;
                            flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
                            flowExtKt$simpleScan$1$1$emit$1.label = 2;
                            break;
                        }
                    }
                    flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
                    Object obj22 = flowExtKt$simpleScan$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowExtKt$simpleScan$1$1$emit$1.label;
                    if (i != 0) {
                    }
                    ref$ObjectRef.element = obj22;
                    Object obj42 = ref$ObjectRef3.element;
                    flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
                    flowExtKt$simpleScan$1$1$emit$1.label = 2;
                default:
                    if (continuation instanceof FlowExtKt$simpleRunningReduce$1$1$emit$1) {
                        flowExtKt$simpleRunningReduce$1$1$emit$1 = (FlowExtKt$simpleRunningReduce$1$1$emit$1) continuation;
                        int i5 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            flowExtKt$simpleRunningReduce$1$1$emit$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj5 = flowExtKt$simpleRunningReduce$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                Object obj6 = ref$ObjectRef3.element;
                                if (obj6 != FlowExtKt.NULL) {
                                    flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = ref$ObjectRef3;
                                    flowExtKt$simpleRunningReduce$1$1$emit$1.label = 1;
                                    obj5 = function3.invoke(obj6, obj, flowExtKt$simpleRunningReduce$1$1$emit$1);
                                    break;
                                } else {
                                    obj5 = obj;
                                }
                                ref$ObjectRef2 = ref$ObjectRef3;
                            } else if (i2 == 1) {
                                ref$ObjectRef2 = flowExtKt$simpleRunningReduce$1$1$emit$1.L$0;
                                SafeTrace.throwOnFailure(obj5);
                            } else if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                                break;
                            }
                            ref$ObjectRef2.element = obj5;
                            Object obj7 = ref$ObjectRef3.element;
                            flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
                            flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
                            break;
                        }
                    }
                    flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, continuation);
                    Object obj52 = flowExtKt$simpleRunningReduce$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                    if (i2 != 0) {
                    }
                    ref$ObjectRef2.element = obj52;
                    Object obj72 = ref$ObjectRef3.element;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(int i, Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$1 = obj2;
        this.$this_simpleScan = obj3;
        this.$operation = obj4;
    }

    private final Object invokeSuspend$androidx$glance$appwidget$AppWidgetSession$provideGlance$1$1$configIsReady$2$1(Object obj) {
        ProduceStateScope produceStateScope;
        PreferencesGlanceStateDefinition preferencesGlanceStateDefinition;
        MutableSnapshot takeNestedMutableSnapshot;
        long m1091DpSizeYgX7TsA;
        Context context = (Context) this.$this_simpleScan;
        AppWidgetSession appWidgetSession = (AppWidgetSession) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
            if (appWidgetSession.glanceState$delegate.getValue() != null || (preferencesGlanceStateDefinition = appWidgetSession.widget.stateDefinition) == null) {
                produceStateScope = produceStateScope2;
                obj = null;
            } else {
                GlanceState glanceState = appWidgetSession.configManager;
                String str = appWidgetSession.key;
                this.L$0 = produceStateScope2;
                this.label = 1;
                Object value = glanceState.getValue(context, preferencesGlanceStateDefinition, str, this);
                if (value == coroutineSingletons) {
                    return coroutineSingletons;
                }
                produceStateScope = produceStateScope2;
                obj = value;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            produceStateScope = (ProduceStateScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        MutableState mutableState = (MutableState) this.$operation;
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
        if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(null, null)) == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
            try {
                AppWidgetId appWidgetId = appWidgetSession.id;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = appWidgetSession.options$delegate;
                int i2 = appWidgetId.appWidgetId;
                boolean z = false;
                if (Integer.MIN_VALUE <= i2 && i2 < -1) {
                    z = true;
                }
                if (!z) {
                    Object systemService = context.getSystemService("appwidget");
                    systemService.getClass();
                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(appWidgetId.appWidgetId);
                    if (appWidgetInfo == null) {
                        m1091DpSizeYgX7TsA = 0;
                    } else {
                        int min = Math.min(appWidgetInfo.minWidth, (1 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                        int min2 = Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                        float f = displayMetrics.density;
                        m1091DpSizeYgX7TsA = BundleKt.m1091DpSizeYgX7TsA(min / f, min2 / f);
                    }
                    mutableState.setValue(new DpSize(m1091DpSizeYgX7TsA));
                    if (((Bundle) parcelableSnapshotMutableState.getValue()) == null) {
                        parcelableSnapshotMutableState.setValue(appWidgetManager.getAppWidgetOptions(appWidgetId.appWidgetId));
                    }
                }
                if (obj != null) {
                    appWidgetSession.glanceState$delegate.setValue(obj);
                }
                produceStateScope.setValue(Boolean.TRUE);
                Snapshot.restoreCurrent(makeCurrent);
                takeNestedMutableSnapshot.apply().check();
                takeNestedMutableSnapshot.dispose();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Snapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            takeNestedMutableSnapshot.dispose();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$glance$appwidget$GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1(Object obj) {
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$12;
        AppWidgetId appWidgetId = (AppWidgetId) this.$this_simpleScan;
        GlanceRemoteViewsService glanceRemoteViewsService = ((GlanceRemoteViewsService.GlanceRemoteViewsFactory) this.L$1).context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SessionManagerImpl$scope$1 sessionManagerImpl$scope$13 = (SessionManagerImpl$scope$1) this.L$0;
            String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(appWidgetId.appWidgetId);
            this.L$0 = sessionManagerImpl$scope$13;
            this.label = 1;
            Object isSessionRunning = sessionManagerImpl$scope$13.isSessionRunning(glanceRemoteViewsService, createUniqueRemoteUiName, this);
            if (isSessionRunning != coroutineSingletons) {
                sessionManagerImpl$scope$1 = sessionManagerImpl$scope$13;
                obj = isSessionRunning;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sessionManagerImpl$scope$12 = (SessionManagerImpl$scope$1) this.L$0;
            SafeTrace.throwOnFailure(obj);
            AppWidgetSession appWidgetSession = (AppWidgetSession) sessionManagerImpl$scope$12.sessions.get(AppWidgetUtilsKt.createUniqueRemoteUiName(appWidgetId.appWidgetId));
            appWidgetSession.getClass();
            this.L$0 = null;
            this.label = 3;
            Object waitForReady = appWidgetSession.waitForReady(this);
            return waitForReady != coroutineSingletons ? coroutineSingletons : waitForReady;
        }
        sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) this.L$0;
        SafeTrace.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        AppWidgetSession appWidgetSession2 = new AppWidgetSession((CashQrWidget) this.$operation, appWidgetId, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        this.L$0 = sessionManagerImpl$scope$1;
        this.label = 2;
        if (sessionManagerImpl$scope$1.startSession(glanceRemoteViewsService, appWidgetSession2, this) != coroutineSingletons) {
            sessionManagerImpl$scope$12 = sessionManagerImpl$scope$1;
            AppWidgetSession appWidgetSession3 = (AppWidgetSession) sessionManagerImpl$scope$12.sessions.get(AppWidgetUtilsKt.createUniqueRemoteUiName(appWidgetId.appWidgetId));
            appWidgetSession3.getClass();
            this.L$0 = null;
            this.label = 3;
            Object waitForReady2 = appWidgetSession3.waitForReady(this);
            if (waitForReady2 != coroutineSingletons) {
            }
        }
    }

    private final Object invokeSuspend$androidx$glance$session$IdleEventBroadcastReceiverKt$observeIdleEvents$2(Object obj) {
        IdleEventBroadcastReceiver idleEventBroadcastReceiver;
        Context context = (Context) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            IdleEventBroadcastReceiver idleEventBroadcastReceiver2 = new IdleEventBroadcastReceiver(new ViewRegistryKt$buildView$1$2$1$1(6, (CoroutineScope) this.L$0, (SessionWorker$doWork$2$1) this.$operation));
            context.registerReceiver(idleEventBroadcastReceiver2, IdleEventBroadcastReceiver.filter);
            try {
                idleEventBroadcastReceiver2.checkIdleStatus$glance_release(context);
            } catch (Throwable th) {
                th = th;
            }
            try {
                SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = (SessionWorker$doWork$2$2) this.$this_simpleScan;
                this.L$0 = idleEventBroadcastReceiver2;
                this.label = 1;
                obj = sessionWorker$doWork$2$2.invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            } catch (Throwable th2) {
                th = th2;
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
                context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            idleEventBroadcastReceiver = (IdleEventBroadcastReceiver) this.L$0;
            try {
                SafeTrace.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        }
        context.unregisterReceiver(idleEventBroadcastReceiver);
        return obj;
    }

    private final Object invokeSuspend$androidx$glance$session$TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(Object obj) {
        long m1128getTimeLeftUwyO8pc;
        TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = (TimerScopeKt$withTimer$2$1$blockScope$1) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        do {
            Object obj2 = timerScopeKt$withTimer$2$1$blockScope$1.deadline.get();
            obj2.getClass();
            long longValue = ((Number) obj2).longValue();
            ((DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.L$0).getClass();
            if (longValue <= System.currentTimeMillis()) {
                JobKt.cancel((CoroutineScope) this.$this_simpleScan, new TimeoutCancellationException("Timed out of executing block.", ((Function2) this.$operation).hashCode()));
                return Unit.INSTANCE;
            }
            m1128getTimeLeftUwyO8pc = timerScopeKt$withTimer$2$1$blockScope$1.m1128getTimeLeftUwyO8pc();
            this.label = 1;
        } while (JobKt.m4182delayVtjQ1oo(m1128getTimeLeftUwyO8pc, this) != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0 == r12) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (androidx.compose.animation.core.AnimatableKt.animate$default(r6, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, r2, r3, r13, 4) == r12) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$navigation$compose$NavHostKt$NavHost$29$1(Object obj) {
        Object mutate$default;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$this_simpleScan;
        SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.L$1;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = seekableTransitionState.currentState$delegate;
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = seekableTransitionState.fraction$delegate;
            Object obj3 = null;
            if (Intrinsics.areEqual(parcelableSnapshotMutableState.getValue(), navBackStackEntry)) {
                long longValue = ((Number) ((Transition) this.$operation).totalDurationNanos$delegate.getValue()).longValue() / 1000000;
                float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                TweenSpec tween$default = AnimatableKt.tween$default((int) (parcelableSnapshotMutableFloatState.getFloatValue() * longValue), 0, null, 6);
                MenuKt$$ExternalSyntheticLambda1 menuKt$$ExternalSyntheticLambda1 = new MenuKt$$ExternalSyntheticLambda1(8, coroutineScope, seekableTransitionState, navBackStackEntry);
                this.label = 2;
            } else {
                this.label = 1;
                Transition transition = seekableTransitionState.transition;
                if (transition == null) {
                    mutate$default = Unit.INSTANCE;
                } else {
                    mutate$default = MutatorMutex.mutate$default(seekableTransitionState.mutatorMutex, new DataStoreImpl$readDataOrHandleCorruption$3(transition, seekableTransitionState, navBackStackEntry, obj3, null, 1), this);
                    if (mutate$default != obj2) {
                        mutate$default = Unit.INSTANCE;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r0.doInitialLoad(r8) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$paging$PageFetcherSnapshot$pageEventFlow$1(Object obj) {
        SimpleProducerScopeImpl simpleProducerScopeImpl;
        PageFetcherSnapshotState.Holder holder;
        SimpleProducerScopeImpl simpleProducerScopeImpl2;
        MutexImpl mutexImpl;
        LoadState loadState;
        PageFetcherSnapshot pageFetcherSnapshot = (PageFetcherSnapshot) this.$operation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            simpleProducerScopeImpl = (SimpleProducerScopeImpl) this.L$0;
            if (!pageFetcherSnapshot.pageEventChCollected.compareAndSet(false, true)) {
                a$$ExternalSyntheticBUOutline0.m$1("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                return null;
            }
            JobKt.launch$default(simpleProducerScopeImpl, null, null, new PageFetcher$flow$1(pageFetcherSnapshot, simpleProducerScopeImpl, objArr3 == true ? 1 : 0, 25), 3);
            BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 6);
            JobKt.launch$default(simpleProducerScopeImpl, null, null, new PageFetcher$flow$1(pageFetcherSnapshot, Channel$default, objArr2 == true ? 1 : 0, 26), 3);
            JobKt.launch$default(simpleProducerScopeImpl, null, null, new SliderState$drag$2((Object) Channel$default, (Object) pageFetcherSnapshot, (Continuation) (objArr == true ? 1 : 0), 10), 3);
            this.L$0 = simpleProducerScopeImpl;
            this.L$1 = null;
            this.$this_simpleScan = null;
            this.label = 2;
        } else {
            if (i == 1) {
                PageFetcherSnapshotState.Holder holder2 = (PageFetcherSnapshotState.Holder) ((MutexImpl) this.$this_simpleScan);
                if (((PageFetcherSnapshotState.Holder) this.L$1) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                holder2.state.currentPagingState$paging_common(null);
                throw null;
            }
            if (i != 2) {
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutexImpl = (MutexImpl) this.$this_simpleScan;
                holder = (PageFetcherSnapshotState.Holder) this.L$1;
                simpleProducerScopeImpl2 = (SimpleProducerScopeImpl) this.L$0;
                SafeTrace.throwOnFailure(obj);
                try {
                    loadState = holder.state.sourceLoadStates.get(LoadType.REFRESH);
                    mutexImpl.unlock(null);
                    if (!(loadState instanceof LoadState.Error)) {
                        PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot, simpleProducerScopeImpl2);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    mutexImpl.unlock(null);
                    throw th2;
                }
            }
            SimpleProducerScopeImpl simpleProducerScopeImpl3 = (SimpleProducerScopeImpl) this.L$0;
            SafeTrace.throwOnFailure(obj);
            simpleProducerScopeImpl = simpleProducerScopeImpl3;
        }
        holder = pageFetcherSnapshot.stateHolder;
        MutexImpl mutexImpl2 = holder.lock;
        this.L$0 = simpleProducerScopeImpl;
        this.L$1 = holder;
        this.$this_simpleScan = mutexImpl2;
        this.label = 3;
        if (mutexImpl2.lock(this) != coroutineSingletons) {
            simpleProducerScopeImpl2 = simpleProducerScopeImpl;
            mutexImpl = mutexImpl2;
            loadState = holder.state.sourceLoadStates.get(LoadType.REFRESH);
            mutexImpl.unlock(null);
            if (!(loadState instanceof LoadState.Error)) {
            }
            return Unit.INSTANCE;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$paging$PageFetcherSnapshot$pageEventFlow$2(Object obj) {
        FlowCollector flowCollector;
        PageFetcherSnapshotState.Holder holder;
        MutexImpl mutexImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                holder = ((PageFetcherSnapshot) this.$operation).stateHolder;
                MutexImpl mutexImpl2 = holder.lock;
                this.L$0 = holder;
                this.L$1 = mutexImpl2;
                this.$this_simpleScan = flowCollector;
                this.label = 1;
                if (mutexImpl2.lock(this) != coroutineSingletons) {
                    mutexImpl = mutexImpl2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowCollector) this.$this_simpleScan;
            mutexImpl = (MutexImpl) this.L$1;
            holder = (PageFetcherSnapshotState.Holder) this.L$0;
            SafeTrace.throwOnFailure(obj);
            LoadStates snapshot = holder.state.sourceLoadStates.snapshot();
            mutexImpl.unlock(null);
            PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(snapshot, null);
            this.L$0 = null;
            this.L$1 = null;
            this.$this_simpleScan = null;
            this.label = 2;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        if (r6.emit(r10, r9) == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /* JADX WARN: Type inference failed for: r5v11, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007a -> B:6:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$paging$SimpleChannelFlowKt$simpleChannelFlow$1$1(Object obj) {
        StandaloneCoroutine launch$default;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        StandaloneCoroutine standaloneCoroutine;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        Object hasNext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 6);
            launch$default = JobKt.launch$default(coroutineScope, null, null, new PageFetcher$flow$1(Channel$default, (Function2) this.$operation, continuation, 27), 3);
            bufferedChannelIterator = Channel$default.new BufferedChannelIterator();
            this.L$0 = launch$default;
            this.L$1 = bufferedChannelIterator;
            this.label = 1;
            hasNext = bufferedChannelIterator.hasNext(this);
            if (hasNext != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.L$1;
            ?? r5 = (Job) this.L$0;
            SafeTrace.throwOnFailure(obj);
            StandaloneCoroutine standaloneCoroutine2 = r5;
            launch$default = standaloneCoroutine2;
            bufferedChannelIterator = bufferedChannelIterator2;
            this.L$0 = launch$default;
            this.L$1 = bufferedChannelIterator;
            this.label = 1;
            hasNext = bufferedChannelIterator.hasNext(this);
            if (hasNext != coroutineSingletons) {
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = bufferedChannelIterator;
                standaloneCoroutine = launch$default;
                obj = hasNext;
                bufferedChannelIterator2 = bufferedChannelIterator3;
                if (((Boolean) obj).booleanValue()) {
                    standaloneCoroutine.cancel(null);
                    return Unit.INSTANCE;
                }
                Object next = bufferedChannelIterator2.next();
                FlowCollector flowCollector = (FlowCollector) this.$this_simpleScan;
                this.L$0 = standaloneCoroutine;
                this.L$1 = bufferedChannelIterator2;
                this.label = 2;
                standaloneCoroutine2 = standaloneCoroutine;
            }
            return coroutineSingletons;
        }
        bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.L$1;
        ?? r52 = (Job) this.L$0;
        SafeTrace.throwOnFailure(obj);
        standaloneCoroutine = r52;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r13 == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$androidx$work$impl$utils$WorkForegroundKt$workForeground$2(Object obj) {
        String str = ((WorkSpec) this.L$0).workerClassName;
        ListenableWorker listenableWorker = (ListenableWorker) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ListenableFuture foregroundInfoAsync = listenableWorker.getForegroundInfoAsync();
            foregroundInfoAsync.getClass();
            this.label = 1;
            obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, listenableWorker, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (foregroundInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
            return null;
        }
        String str2 = WorkForegroundKt.TAG;
        Logger$LogcatLogger.get().debug(str2, "Updating notification for " + str);
        WorkForegroundUpdater workForegroundUpdater = (WorkForegroundUpdater) this.$this_simpleScan;
        CallbackToFutureAdapter$SafeFuture executeAsync = DimensionKt.executeAsync(workForegroundUpdater.mTaskExecutor.mBackgroundExecutor, "setForegroundAsync", new l2$$ExternalSyntheticLambda7(workForegroundUpdater, listenableWorker.getId(), foregroundInfo, (Context) this.$operation, 4));
        this.label = 2;
        Object await = RecipientAvatars.await(executeAsync, this);
        return await == coroutineSingletons ? coroutineSingletons : await;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) this.$this_simpleScan, (PageFetcher$flow$1.AnonymousClass2) this.$operation, continuation, 0);
                flowExtKt$simpleScan$1.L$0 = obj;
                return flowExtKt$simpleScan$1;
            case 1:
                return new FlowExtKt$simpleScan$1(continuation, (CapturePipelineImpl) this.L$1, (ArrayList) this.L$0, (ArrayList) this.$this_simpleScan);
            case 2:
                return new FlowExtKt$simpleScan$1((DeferredUseCaseCameraRequestControl) this.L$1, continuation, (Map) this.L$0, (UseCaseCameraRequestControl.Type) this.$this_simpleScan, (Config.OptionPriority) this.$operation, 2);
            case 3:
                return new FlowExtKt$simpleScan$1((DeferredUseCaseCameraRequestControl) this.L$1, continuation, (List) this.L$0, (List) this.$this_simpleScan, (List) this.$operation, 3);
            case 4:
                return new FlowExtKt$simpleScan$1((UseCaseCameraRequestControlImpl) this.L$1, (UseCaseCameraRequestControl.Type) this.L$0, (Map) this.$this_simpleScan, (Config.OptionPriority) this.$operation, continuation, 4);
            case 5:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$12 = new FlowExtKt$simpleScan$1((PreviewView.AnonymousClass1) this.$this_simpleScan, (Function2) this.$operation, continuation, 5);
                flowExtKt$simpleScan$12.L$0 = obj;
                return flowExtKt$simpleScan$12;
            case 6:
                return new FlowExtKt$simpleScan$1((SurfaceRequestScope) this.L$1, (SurfaceRequest) this.L$0, (ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) this.$this_simpleScan, (StandaloneCoroutine) this.$operation, continuation, 6);
            case 7:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$13 = new FlowExtKt$simpleScan$1((SurfaceRequestScope) this.$operation, continuation, 7);
                flowExtKt$simpleScan$13.L$0 = obj;
                return flowExtKt$simpleScan$13;
            case 8:
                return new FlowExtKt$simpleScan$1(8, this.L$0, (Animatable) this.L$1, (MutableState) this.$this_simpleScan, (MutableState) this.$operation, continuation, false);
            case 9:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$14 = new FlowExtKt$simpleScan$1((MutableState) this.$this_simpleScan, (InfiniteTransition) this.$operation, continuation, 9);
                flowExtKt$simpleScan$14.L$0 = obj;
                return flowExtKt$simpleScan$14;
            case 10:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$15 = new FlowExtKt$simpleScan$1((TrackpadScrollingLogic) this.$operation, continuation, 10);
                flowExtKt$simpleScan$15.L$0 = obj;
                return flowExtKt$simpleScan$15;
            case 11:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$16 = new FlowExtKt$simpleScan$1((Function1) this.L$1, (AndroidLegacyPlatformTextInputServiceAdapter) this.$this_simpleScan, (LegacyAdaptingPlatformTextInputModifierNode) this.$operation, continuation, 11);
                flowExtKt$simpleScan$16.L$0 = obj;
                return flowExtKt$simpleScan$16;
            case 12:
                return new FlowExtKt$simpleScan$1((TextFieldDecoratorModifierNode) this.L$1, (TextFieldSelectionState) this.L$0, (PointerInputScope) this.$this_simpleScan, (DialogHostKt$$ExternalSyntheticLambda0) this.$operation, continuation, 12);
            case 13:
                return new FlowExtKt$simpleScan$1((PlatformSelectionBehaviorsImpl) this.$this_simpleScan, (Function2) this.$operation, continuation, 13);
            case 14:
                return new FlowExtKt$simpleScan$1(14, (SelectionManager) this.L$0, (Ref$ObjectRef) this.L$1, (Ref$ObjectRef) this.$this_simpleScan, (Ref$LongRef) this.$operation, continuation, false);
            case 15:
                return new FlowExtKt$simpleScan$1((LazyListState) this.L$1, (Function1) this.L$0, (CalendarModelImpl) this.$this_simpleScan, (IntRange) this.$operation, continuation, 15);
            case 16:
                return new FlowExtKt$simpleScan$1((ComposeScrollCaptureCallback) this.L$1, (ScrollCaptureSession) this.L$0, (Rect) this.$this_simpleScan, (Consumer) this.$operation, continuation, 16);
            case 17:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$17 = new FlowExtKt$simpleScan$1((AppWidgetSession) this.L$1, (Context) this.$this_simpleScan, (MutableState) this.$operation, continuation, 17);
                flowExtKt$simpleScan$17.L$0 = obj;
                return flowExtKt$simpleScan$17;
            case 18:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$18 = new FlowExtKt$simpleScan$1((Function2) this.L$1, (ContextScope) this.$this_simpleScan, (BroadcastReceiver.PendingResult) this.$operation, continuation, 18);
                flowExtKt$simpleScan$18.L$0 = obj;
                return flowExtKt$simpleScan$18;
            case 19:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$19 = new FlowExtKt$simpleScan$1((CashQrWidgetReceiver) this.L$1, (Context) this.$this_simpleScan, (int[]) this.$operation, continuation, 19);
                flowExtKt$simpleScan$19.L$0 = obj;
                return flowExtKt$simpleScan$19;
            case 20:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$110 = new FlowExtKt$simpleScan$1((GlanceRemoteViewsService.GlanceRemoteViewsFactory) this.L$1, (AppWidgetId) this.$this_simpleScan, (CashQrWidget) this.$operation, continuation, 20);
                flowExtKt$simpleScan$110.L$0 = obj;
                return flowExtKt$simpleScan$110;
            case 21:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$111 = new FlowExtKt$simpleScan$1((Context) this.L$1, (SessionWorker$doWork$2$2) this.$this_simpleScan, (SessionWorker$doWork$2$1) this.$operation, continuation, 21);
                flowExtKt$simpleScan$111.L$0 = obj;
                return flowExtKt$simpleScan$111;
            case 22:
                return new FlowExtKt$simpleScan$1((AppWidgetSession) this.L$1, (Context) this.L$0, (Throwable) this.$this_simpleScan, (TimerScopeKt$withTimer$2$1$blockScope$1) this.$operation, continuation, 22);
            case 23:
                return new FlowExtKt$simpleScan$1((TimerScopeKt$withTimer$2$1$blockScope$1) this.L$1, (DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.L$0, (CoroutineScope) this.$this_simpleScan, (Function2) this.$operation, continuation, 23);
            case 24:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$112 = new FlowExtKt$simpleScan$1((SeekableTransitionState) this.L$1, (NavBackStackEntry) this.$this_simpleScan, (Transition) this.$operation, continuation, 24);
                flowExtKt$simpleScan$112.L$0 = obj;
                return flowExtKt$simpleScan$112;
            case 25:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$113 = new FlowExtKt$simpleScan$1((PageFetcherSnapshot) this.$operation, continuation, 25);
                flowExtKt$simpleScan$113.L$0 = obj;
                return flowExtKt$simpleScan$113;
            case 26:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$114 = new FlowExtKt$simpleScan$1((PageFetcherSnapshot) this.$operation, continuation, 26);
                flowExtKt$simpleScan$114.L$0 = obj;
                return flowExtKt$simpleScan$114;
            case 27:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$115 = new FlowExtKt$simpleScan$1((FlowCollector) this.$this_simpleScan, (Function2) this.$operation, continuation, 27);
                flowExtKt$simpleScan$115.L$0 = obj;
                return flowExtKt$simpleScan$115;
            case 28:
                return new FlowExtKt$simpleScan$1((ListenableWorker) this.L$1, (WorkSpec) this.L$0, (WorkForegroundUpdater) this.$this_simpleScan, (Context) this.$operation, continuation, 28);
            default:
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$116 = new FlowExtKt$simpleScan$1((BuyerIntentSyncManager) this.L$1, (BuyerIntentScope) this.$this_simpleScan, (CartBuilder) this.$operation, continuation, 29);
                flowExtKt$simpleScan$116.L$0 = obj;
                return flowExtKt$simpleScan$116;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((FlowExtKt$simpleScan$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((FlowExtKt$simpleScan$1) create((ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 10:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                ((FlowExtKt$simpleScan$1) create((AndroidPlatformTextInputSession) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 12:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((FlowExtKt$simpleScan$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((FlowExtKt$simpleScan$1) create((SessionManagerImpl$scope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((FlowExtKt$simpleScan$1) create((SimpleProducerScopeImpl) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((FlowExtKt$simpleScan$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((FlowExtKt$simpleScan$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((FlowExtKt$simpleScan$1) create((BuyerIntentSyncManager.Combination) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0130, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.ordering_station_token, r11.inStoreOrderingToken) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return app.cash.local.backend.real.BuyerIntentSyncManager.BuyerIntentSyncResult.NoOp.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0176, code lost:
    
        if (r0 == true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0560, code lost:
    
        if (r3.lock(r33) == r0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0736, code lost:
    
        if (androidx.compose.animation.core.ArcSplineKt.withInfiniteAnimationFrameNanos(r33, r7) == r0) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x075a, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r2, r3, r33) == r0) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x075d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0856, code lost:
    
        if (kotlinx.coroutines.JobKt.isActive(r6) != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0819, code lost:
    
        if (r1 == r0) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0989, code lost:
    
        if (((kotlinx.coroutines.Deferred) r1).await(r33) == r0) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x097e, code lost:
    
        if (r1 == r0) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0b4b, code lost:
    
        if (r3.collect(r6, r33) == r0) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0b30, code lost:
    
        if (r2.emit(null, r33) == r0) goto L575;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:572:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x06d2 -> B:343:0x069a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:374:0x073e -> B:371:0x071b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:376:0x075a -> B:371:0x071b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:412:0x0850 -> B:403:0x0852). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        Ref$BooleanRef ref$BooleanRef;
        Object acquireSession;
        AutoCloseable autoCloseable;
        Object submitLatest;
        Object access$setParametersInternal;
        Object obj3;
        Mutex mutex;
        Object result;
        SurfaceRequestScope surfaceRequestScope;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;
        Object obj4;
        CoroutineScope coroutineScope;
        Ref$FloatRef ref$FloatRef;
        CoroutineScope coroutineScope2;
        TrackpadScrollingLogic trackpadScrollingLogic;
        Object obj5;
        CoroutineScope coroutineScope3;
        ScrollingLogic scrollingLogic;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        Mutex mutex2;
        Object withTimeoutOrNull;
        Mutex mutex3;
        Throwable th;
        Object withTimeoutOrNull2;
        TextRange textRange;
        Object m439suggestSelectionForLongPressOrDoubleClickpYaCww;
        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate;
        Object access$onScrollCaptureImageRequest;
        CancellationException cancellationException;
        ?? r15;
        LocalFulfillment localFulfillment;
        boolean equals;
        ByteString byteString;
        zzjh updateUserIntentRequest$Update$RemoteOrdering;
        String str;
        String str2;
        String str3;
        Object failure;
        Selection selection;
        int i = 13;
        int i2 = 3;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    ref$ObjectRef = new Ref$ObjectRef();
                    obj2 = null;
                    ref$ObjectRef.element = null;
                    this.L$0 = flowCollector;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = null;
                }
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = (FlowKt__MergeKt$flatMapConcat$$inlined$map$1) this.$this_simpleScan;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, (PageFetcher$flow$1.AnonymousClass2) this.$operation, flowCollector, 0);
                this.L$0 = obj2;
                this.L$1 = obj2;
                this.label = 2;
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.L$0;
                CapturePipelineImpl capturePipelineImpl = (CapturePipelineImpl) this.L$1;
                ArrayList arrayList2 = (ArrayList) this.$this_simpleScan;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                } catch (CancellationException unused) {
                    if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                        Log.i("CXCP", "CapturePipeline#submitRequestInternal: CameraGraph.Session could not be acquired, requests may need re-submission");
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((CompletableDeferred) it.next()).completeExceptionally(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                    }
                }
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#submitRequestInternal: Acquiring session for submitting requests");
                        }
                        ref$BooleanRef = new Ref$BooleanRef();
                        CameraGraphImpl graph = capturePipelineImpl.useCaseGraphContext.getGraph();
                        this.$operation = ref$BooleanRef;
                        this.label = 1;
                        acquireSession = graph.acquireSession(this);
                        if (acquireSession == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            UseCaseCameraState useCaseCameraState = (UseCaseCameraState) capturePipelineImpl.useCaseCameraState$delegate.getValue();
                            this.label = 3;
                            submitLatest = useCaseCameraState.submitLatest(this);
                            if (submitLatest != coroutineSingletons2) {
                                submitLatest = Unit.INSTANCE;
                            }
                            if (submitLatest == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            return Unit.INSTANCE;
                        }
                        ref$BooleanRef = (Ref$BooleanRef) this.$operation;
                        SafeTrace.throwOnFailure(obj);
                        acquireSession = obj;
                    }
                    CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                    boolean shouldStopRepeatingBeforeCapture = MoneyTabBookletKt.shouldStopRepeatingBeforeCapture(arrayList2);
                    ref$BooleanRef.element = shouldStopRepeatingBeforeCapture;
                    if (shouldStopRepeatingBeforeCapture) {
                        cameraGraphSessionImpl.stopRepeating();
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#submitRequestInternal: Submitting " + arrayList2);
                    }
                    cameraGraphSessionImpl.submit(arrayList2);
                    Cache.Companion.closeFinally(autoCloseable, null);
                    if (ref$BooleanRef.element) {
                        this.$operation = null;
                        this.label = 2;
                        if (AwaitKt.joinAll(arrayList, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        UseCaseCameraState useCaseCameraState2 = (UseCaseCameraState) capturePipelineImpl.useCaseCameraState$delegate.getValue();
                        this.label = 3;
                        submitLatest = useCaseCameraState2.submitLatest(this);
                        if (submitLatest != coroutineSingletons2) {
                        }
                        if (submitLatest == coroutineSingletons2) {
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                }
                autoCloseable = (AutoCloseable) acquireSession;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Deferred submitParameters = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) this.L$1).submitParameters((Map) this.L$0, (UseCaseCameraRequestControl.Type) this.$this_simpleScan, (Config.OptionPriority) this.$operation);
                this.label = 1;
                Object await = submitParameters.await(this);
                return await == coroutineSingletons3 ? coroutineSingletons3 : await;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Deferred update3aRegions = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) this.L$1).update3aRegions((List) this.L$0, (List) this.$this_simpleScan, (List) this.$operation);
                this.label = 1;
                Object awaitInternal = ((CompletableDeferredImpl) update3aRegions).awaitInternal(this);
                return awaitInternal == coroutineSingletons4 ? coroutineSingletons4 : awaitInternal;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) this.L$1;
                    UseCaseCameraRequestControl.Type type2 = (UseCaseCameraRequestControl.Type) this.L$0;
                    Map map = (Map) this.$this_simpleScan;
                    Config.OptionPriority optionPriority = (Config.OptionPriority) this.$operation;
                    this.label = 1;
                    access$setParametersInternal = UseCaseCameraRequestControlImpl.access$setParametersInternal(useCaseCameraRequestControlImpl, type2, map, optionPriority, this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$setParametersInternal = obj;
                }
                this.label = 2;
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Function2 function2 = (Function2) ((SuspendLambda) this.L$1);
                        Mutex mutex4 = (Mutex) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        try {
                            this.L$0 = mutex4;
                            obj3 = null;
                            try {
                                this.L$1 = null;
                                this.label = 2;
                                if (JobKt.coroutineScope(function2, this) != coroutineSingletons6) {
                                    mutex = mutex4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mutex = mutex4;
                                mutex.unlock(obj3);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj3 = null;
                        }
                    } else {
                        if (i8 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            obj3 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            obj3 = null;
                            mutex.unlock(obj3);
                            throw th;
                        }
                    }
                    mutex.unlock(obj3);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                JobKt.ensureActive((CoroutineScope) this.L$0);
                MutexImpl mutexImpl = (MutexImpl) ((PreviewView.AnonymousClass1) this.$this_simpleScan).this$0;
                Function function = (Function2) this.$operation;
                this.L$0 = mutexImpl;
                this.L$1 = (SuspendLambda) function;
                this.label = 1;
                if (IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(MutexesKt$lockAndSuspend$lockFn$1.INSTANCE, mutexImpl, this) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this);
                    Unit unit = Unit.INSTANCE;
                    Result.Companion companion = Result.Companion;
                    intercepted.resumeWith(unit);
                }
                return coroutineSingletons6;
            case 6:
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SurfaceRequestScope surfaceRequestScope2 = (SurfaceRequestScope) this.L$1;
                    Surface surface = ((ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) this.$this_simpleScan).surface;
                    this.label = 1;
                    surfaceRequestScope2.getClass();
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    surfaceRequest.provideSurface(surface, new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new Edge(cancellableContinuationImpl, 1));
                    cancellableContinuationImpl.invokeOnCancellation(SurfaceRequestScope$provideSurfaceAndWaitForCompletion$2$3.INSTANCE);
                    result = cancellableContinuationImpl.getResult();
                    if (result == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    result = obj;
                }
                ((StandaloneCoroutine) this.$operation).cancel(null);
                if (((AutoValue_SurfaceRequest_Result) result).resultCode != 3) {
                    return Unit.INSTANCE;
                }
                surfaceRequest.willNotProvideSurface();
                return Boolean.valueOf(surfaceRequest.mSurfaceRecreationCompleter.set(null));
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.$this_simpleScan;
                        surfaceRequestScope = (SurfaceRequestScope) this.L$1;
                        viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = (ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bufferedChannelIterator = bufferedChannelIterator2;
                        obj4 = obj;
                        SurfaceRequestScope surfaceRequestScope3 = surfaceRequestScope;
                        ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$12 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;
                        if (((Boolean) obj4).booleanValue()) {
                            SurfaceRequest surfaceRequest2 = (SurfaceRequest) bufferedChannelIterator.next();
                            StandaloneCoroutine launch$default = JobKt.launch$default(viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$12, null, null, new ThumbNode$onAttach$1(surfaceRequest2, (Continuation) null, 14), 3);
                            NonCancellable nonCancellable = NonCancellable.INSTANCE;
                            FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(surfaceRequestScope3, surfaceRequest2, viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$12, launch$default, (Continuation) null, 6);
                            this.L$0 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$12;
                            this.L$1 = surfaceRequestScope3;
                            this.$this_simpleScan = bufferedChannelIterator;
                            this.label = 2;
                            if (JobKt.withContext(nonCancellable, flowExtKt$simpleScan$1, this) != coroutineSingletons8) {
                                surfaceRequestScope = surfaceRequestScope3;
                                viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$12;
                            }
                            return coroutineSingletons8;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = (BufferedChannel.BufferedChannelIterator) this.$this_simpleScan;
                    surfaceRequestScope = (SurfaceRequestScope) this.L$1;
                    viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = (ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bufferedChannelIterator = bufferedChannelIterator3;
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$13 = (ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1) this.L$0;
                    surfaceRequestScope = (SurfaceRequestScope) this.$operation;
                    BufferedChannel bufferedChannel = surfaceRequestScope.requestChannel;
                    bufferedChannel.getClass();
                    bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                    viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$13;
                    this.L$0 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;
                    this.L$1 = surfaceRequestScope;
                    this.$this_simpleScan = bufferedChannelIterator;
                    this.label = 1;
                    obj4 = bufferedChannelIterator.hasNext(this);
                    break;
                }
            case 8:
                Animatable animatable = (Animatable) this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(this.L$0, animatable.targetValue$delegate.getValue())) {
                        Animatable animatable2 = (Animatable) this.L$1;
                        Object obj6 = this.L$0;
                        MutableState mutableState = (MutableState) this.$this_simpleScan;
                        SpringSpec springSpec = AnimateAsStateKt.defaultAnimation;
                        AnimationSpec animationSpec = (AnimationSpec) mutableState.getValue();
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable2, obj6, animationSpec, null, null, this, 12) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) this.$operation;
                SpringSpec springSpec2 = AnimateAsStateKt.defaultAnimation;
                Function1 function1 = (Function1) mutableState2.getValue();
                if (function1 != null) {
                    function1.invoke(animatable.getValue());
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = 1.0f;
                    coroutineScope = coroutineScope4;
                    ref$FloatRef = ref$FloatRef2;
                } else if (i12 == 1) {
                    Ref$FloatRef ref$FloatRef3 = (Ref$FloatRef) this.L$1;
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = ref$FloatRef3;
                    coroutineScope = coroutineScope5;
                    if (ref$FloatRef.element == RecyclerView.DECELERATION_RATE) {
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new Threads$$ExternalSyntheticLambda1(coroutineScope, i));
                        InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(2, null, 0);
                        this.L$0 = coroutineScope;
                        this.L$1 = ref$FloatRef;
                        this.label = 2;
                        break;
                    }
                } else {
                    if (i12 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) this.L$1;
                    CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = ref$FloatRef4;
                    coroutineScope = coroutineScope6;
                }
                n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0((MutableState) this.$this_simpleScan, (InfiniteTransition) this.$operation, ref$FloatRef, coroutineScope, 2);
                this.L$0 = coroutineScope;
                this.L$1 = ref$FloatRef;
                this.label = 1;
                break;
            case 10:
                TrackpadScrollingLogic trackpadScrollingLogic2 = (TrackpadScrollingLogic) this.$operation;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope2 = (CoroutineScope) this.L$0;
                    } else {
                        if (i13 == 1) {
                            scrollingLogic = (ScrollingLogic) this.$this_simpleScan;
                            TrackpadScrollingLogic trackpadScrollingLogic3 = (TrackpadScrollingLogic) this.L$1;
                            CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            trackpadScrollingLogic = trackpadScrollingLogic3;
                            coroutineScope3 = coroutineScope7;
                            obj5 = obj;
                            this.L$0 = coroutineScope3;
                            this.L$1 = null;
                            this.$this_simpleScan = null;
                            this.label = 2;
                            if (TrackpadScrollingLogic.access$dispatchTrackpadScroll(trackpadScrollingLogic, scrollingLogic, (TrackpadScrollingLogic.TrackpadScrollDelta) obj5, this) != coroutineSingletons11) {
                                coroutineScope2 = coroutineScope3;
                            }
                            return coroutineSingletons11;
                        }
                        if (i13 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (!JobKt.isActive(coroutineScope2.getCoroutineContext())) {
                        trackpadScrollingLogic2.receivingPanEventsJob = null;
                        return Unit.INSTANCE;
                    }
                    ScrollingLogic scrollingLogic2 = trackpadScrollingLogic2.scrollingLogic;
                    BufferedChannel bufferedChannel2 = trackpadScrollingLogic2.channel;
                    this.L$0 = coroutineScope2;
                    this.L$1 = trackpadScrollingLogic2;
                    this.$this_simpleScan = scrollingLogic2;
                    this.label = 1;
                    bufferedChannel2.getClass();
                    obj5 = BufferedChannel.receive$suspendImpl(bufferedChannel2, this);
                    if (obj5 == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                    coroutineScope3 = coroutineScope2;
                    scrollingLogic = scrollingLogic2;
                    trackpadScrollingLogic = trackpadScrollingLogic2;
                    this.L$0 = coroutineScope3;
                    this.L$1 = null;
                    this.$this_simpleScan = null;
                    this.label = 2;
                    if (TrackpadScrollingLogic.access$dispatchTrackpadScroll(trackpadScrollingLogic, scrollingLogic, (TrackpadScrollingLogic.TrackpadScrollDelta) obj5, this) != coroutineSingletons11) {
                    }
                    return coroutineSingletons11;
                } catch (Throwable th5) {
                    trackpadScrollingLogic2.receivingPanEventsJob = null;
                    throw th5;
                }
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1((AndroidPlatformTextInputSession) this.L$0, (Function1) this.L$1, (AndroidLegacyPlatformTextInputServiceAdapter) this.$this_simpleScan, (LegacyAdaptingPlatformTextInputModifierNode) this.$operation, (Continuation) null, 6);
                    this.label = 1;
                    if (JobKt.coroutineScope(realImageLoader$execute$result$1, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 12:
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.L$1;
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = textFieldDecoratorModifierNode.interactionSource;
                    TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.L$0;
                    PointerInputScope pointerInputScope = (PointerInputScope) this.$this_simpleScan;
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = (DialogHostKt$$ExternalSyntheticLambda0) this.$operation;
                    TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12 textFieldDecoratorModifierNode$$ExternalSyntheticLambda12 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12(textFieldDecoratorModifierNode, i2);
                    this.label = 1;
                    textFieldSelectionState.getClass();
                    FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$1 = new FastCodeUpdatesKt$withDevelopmentServerPush$1(mutableInteractionSourceImpl, textFieldSelectionState, (Continuation) null);
                    MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(i, dialogHostKt$$ExternalSyntheticLambda0, textFieldSelectionState, textFieldDecoratorModifierNode$$ExternalSyntheticLambda12);
                    CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = TapGestureDetectorKt.NoPressGesture;
                    Object coroutineScope8 = JobKt.coroutineScope(new RealImageLoader$execute$result$1(pointerInputScope, fastCodeUpdatesKt$withDevelopmentServerPush$1, menuKt$$ExternalSyntheticLambda0, new PressGestureScopeImpl(pointerInputScope), (Continuation) null, 1), this);
                    if (coroutineScope8 != obj7) {
                        coroutineScope8 = Unit.INSTANCE;
                    }
                    if (coroutineScope8 != obj7) {
                        coroutineScope8 = Unit.INSTANCE;
                    }
                    if (coroutineScope8 != obj7) {
                        coroutineScope8 = Unit.INSTANCE;
                    }
                    if (coroutineScope8 != obj7) {
                        coroutineScope8 = Unit.INSTANCE;
                    }
                    if (coroutineScope8 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                try {
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.$this_simpleScan;
                        mutex2 = platformSelectionBehaviorsImpl.mutex;
                        this.L$1 = mutex2;
                        this.L$0 = platformSelectionBehaviorsImpl;
                        this.label = 1;
                        break;
                    } else {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return obj;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex3 = (Mutex) this.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex2 = mutex3;
                                withTimeoutOrNull = obj;
                                r6 = (TextClassifier) withTimeoutOrNull;
                                Continuation continuation = null;
                                mutex2.unlock(null);
                                PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(r6, (Function2) this.$operation, continuation, 1);
                                this.L$1 = null;
                                this.L$0 = null;
                                this.label = 3;
                                withTimeoutOrNull2 = JobKt.withTimeoutOrNull(200L, pageFetcher$flow$1, this);
                                if (withTimeoutOrNull2 != coroutineSingletons13) {
                                    return withTimeoutOrNull2;
                                }
                                return coroutineSingletons13;
                            } catch (Throwable th6) {
                                th = th6;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$0;
                        mutex2 = (Mutex) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    TextClassifier textClassifier = platformSelectionBehaviorsImpl.textClassificationSession;
                    if (textClassifier != null) {
                        if (textClassifier.isDestroyed()) {
                        }
                        Continuation continuation2 = null;
                        mutex2.unlock(null);
                        PageFetcher$flow$1 pageFetcher$flow$12 = new PageFetcher$flow$1(textClassifier, (Function2) this.$operation, continuation2, 1);
                        this.L$1 = null;
                        this.L$0 = null;
                        this.label = 3;
                        withTimeoutOrNull2 = JobKt.withTimeoutOrNull(200L, pageFetcher$flow$12, this);
                        if (withTimeoutOrNull2 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    }
                    DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(platformSelectionBehaviorsImpl, (Continuation) null, 8);
                    this.L$1 = mutex2;
                    this.L$0 = null;
                    this.label = 2;
                    withTimeoutOrNull = JobKt.withTimeoutOrNull(300L, diskLruCache$launchCleanup$1, this);
                    if (withTimeoutOrNull == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                    textClassifier = (TextClassifier) withTimeoutOrNull;
                    Continuation continuation22 = null;
                    mutex2.unlock(null);
                    PageFetcher$flow$1 pageFetcher$flow$122 = new PageFetcher$flow$1(textClassifier, (Function2) this.$operation, continuation22, 1);
                    this.L$1 = null;
                    this.L$0 = null;
                    this.label = 3;
                    withTimeoutOrNull2 = JobKt.withTimeoutOrNull(200L, pageFetcher$flow$122, this);
                    if (withTimeoutOrNull2 != coroutineSingletons13) {
                    }
                    return coroutineSingletons13;
                } catch (Throwable th7) {
                    th = th7;
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    throw th;
                }
            case 14:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$this_simpleScan;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.$operation;
                SelectionManager selectionManager = (SelectionManager) this.L$0;
                SelectionRegistrarImpl selectionRegistrarImpl = selectionManager.selectionRegistrar;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = selectionManager.platformSelectionBehaviors;
                    if (platformSelectionBehaviorsImpl2 == null) {
                        textRange = null;
                        if (textRange != null) {
                            long j = textRange.packedValue;
                            if (!TextRange.m985equalsimpl(ref$ObjectRef2.element, j) && (multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) selectionRegistrarImpl._selectableMap.get(ref$LongRef.element)) != null && multiWidgetSelectionDelegate.getText() == ref$ObjectRef3.element) {
                                TextLayoutResult textLayoutResult = (TextLayoutResult) multiWidgetSelectionDelegate.layoutResultCallback.invoke();
                                if (textLayoutResult == null) {
                                    return Unit.INSTANCE;
                                }
                                int i18 = (int) (j >> 32);
                                Selection.AnchorInfo anchorInfo = new Selection.AnchorInfo(SimpleLayoutKt.getTextDirectionForOffset(textLayoutResult, i18), i18, ref$LongRef.element);
                                int i19 = (int) (j & BodyPartID.bodyIdMax);
                                ResolvedTextDirection textDirectionForOffset = SimpleLayoutKt.getTextDirectionForOffset(textLayoutResult, i19);
                                long j2 = ref$LongRef.element;
                                androidx.compose.foundation.text.selection.Selection selection2 = new androidx.compose.foundation.text.selection.Selection(anchorInfo, new Selection.AnchorInfo(textDirectionForOffset, i19, j2), false);
                                MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
                                MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
                                mutableLongObjectMap2.set(selection2, j2);
                                selectionRegistrarImpl.subselections$delegate.setValue(mutableLongObjectMap2);
                                selectionManager.onSelectionChange.invoke(selection2);
                                selectionManager.previousSelectionLayout = null;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    CharSequence charSequence = (CharSequence) ref$ObjectRef3.element;
                    long j3 = ((TextRange) ref$ObjectRef2.element).packedValue;
                    this.label = 1;
                    m439suggestSelectionForLongPressOrDoubleClickpYaCww = platformSelectionBehaviorsImpl2.m439suggestSelectionForLongPressOrDoubleClickpYaCww(charSequence, j3, this);
                    if (m439suggestSelectionForLongPressOrDoubleClickpYaCww == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m439suggestSelectionForLongPressOrDoubleClickpYaCww = obj;
                }
                textRange = (TextRange) m439suggestSelectionForLongPressOrDoubleClickpYaCww;
                if (textRange != null) {
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyListState lazyListState = (LazyListState) this.L$1;
                    Function1 function12 = (Function1) this.L$0;
                    CalendarModelImpl calendarModelImpl = (CalendarModelImpl) this.$this_simpleScan;
                    IntRange intRange = (IntRange) this.$operation;
                    this.label = 1;
                    PaddingValuesImpl paddingValuesImpl = DatePickerKt.DatePickerModeTogglePadding;
                    Object collect = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 0)).collect(new DatePickerKt$updateDisplayedMonth$3(lazyListState, function12, calendarModelImpl, intRange, 0), this);
                    if (collect != coroutineSingletons15) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ComposeScrollCaptureCallback composeScrollCaptureCallback = (ComposeScrollCaptureCallback) this.L$1;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.L$0;
                    Rect rect = (Rect) this.$this_simpleScan;
                    IntRect intRect = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
                    this.label = 1;
                    access$onScrollCaptureImageRequest = ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(composeScrollCaptureCallback, scrollCaptureSession, intRect, this);
                    if (access$onScrollCaptureImageRequest == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$onScrollCaptureImageRequest = obj;
                }
                ((Consumer) this.$operation).accept(ColorKt.toAndroidRect((IntRect) access$onScrollCaptureImageRequest));
                return Unit.INSTANCE;
            case 17:
                return invokeSuspend$androidx$glance$appwidget$AppWidgetSession$provideGlance$1$1$configIsReady$2$1(obj);
            case 18:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.$operation;
                ContextScope contextScope = (ContextScope) this.$this_simpleScan;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                try {
                    try {
                        if (i22 != 0) {
                            try {
                                if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                            } catch (Throwable th8) {
                                JobKt.cancel(contextScope, (CancellationException) null);
                                throw th8;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                            Function2 function22 = (Function2) this.L$1;
                            this.label = 1;
                            if (function22.invoke(coroutineScope9, this) == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        }
                        cancellationException = null;
                    } finally {
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th9) {
                    Log.e("GlanceAppWidget", "BroadcastReceiver execution failed", th9);
                    cancellationException = null;
                }
                JobKt.cancel(contextScope, cancellationException);
                try {
                    pendingResult.finish();
                } catch (IllegalStateException e2) {
                    Log.e("GlanceAppWidget", "Error thrown when trying to finish broadcast", e2);
                }
                return Unit.INSTANCE;
            case 19:
                Context context = (Context) this.$this_simpleScan;
                CashQrWidgetReceiver cashQrWidgetReceiver = (CashQrWidgetReceiver) this.L$1;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                    JobKt.launch$default(coroutineScope10, null, null, new PageFetcher$flow$1(context, cashQrWidgetReceiver, null, 11), 3);
                    int[] iArr = (int[]) this.$operation;
                    ArrayList arrayList3 = new ArrayList(iArr.length);
                    for (int i24 : iArr) {
                        arrayList3.add(JobKt.async$default(coroutineScope10, null, null, new MoneyTabUIKt$MoneyTabLoaded$1$1(cashQrWidgetReceiver, context, i24, (Continuation) null, 3), 3));
                    }
                    this.label = 1;
                    if (AwaitKt.awaitAll(arrayList3, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                return invokeSuspend$androidx$glance$appwidget$GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1(obj);
            case 21:
                return invokeSuspend$androidx$glance$session$IdleEventBroadcastReceiverKt$observeIdleEvents$2(obj);
            case 22:
                Throwable th10 = (Throwable) this.$this_simpleScan;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppWidgetSession appWidgetSession = (AppWidgetSession) this.L$1;
                    Context context2 = (Context) this.L$0;
                    this.label = 1;
                    appWidgetSession.notifyWidgetOfError(context2, th10);
                    if (Unit.INSTANCE == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.cancel((TimerScopeKt$withTimer$2$1$blockScope$1) this.$operation, JobKt.CancellationException("Error in composition effect coroutine", th10));
                return Unit.INSTANCE;
            case 23:
                return invokeSuspend$androidx$glance$session$TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(obj);
            case 24:
                return invokeSuspend$androidx$navigation$compose$NavHostKt$NavHost$29$1(obj);
            case 25:
                return invokeSuspend$androidx$paging$PageFetcherSnapshot$pageEventFlow$1(obj);
            case 26:
                return invokeSuspend$androidx$paging$PageFetcherSnapshot$pageEventFlow$2(obj);
            case 27:
                return invokeSuspend$androidx$paging$SimpleChannelFlowKt$simpleChannelFlow$1$1(obj);
            case 28:
                return invokeSuspend$androidx$work$impl$utils$WorkForegroundKt$workForeground$2(obj);
            default:
                BuyerIntentScope buyerIntentScope = (BuyerIntentScope) this.$this_simpleScan;
                BuyerIntentSyncManager buyerIntentSyncManager = (BuyerIntentSyncManager) this.L$1;
                BuyerIntentSyncManager.Combination combination = (BuyerIntentSyncManager.Combination) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BuyerIntentState current = ((RealBuyerIntentManager) buyerIntentSyncManager.buyerIntentManager).current(buyerIntentScope);
                    if (current == null) {
                        return BuyerIntentSyncManager.BuyerIntentSyncResult.ModeDisabled.INSTANCE;
                    }
                    String str4 = current.locationToken;
                    BuyerIntentScope buyerIntentScope2 = current.scope;
                    BuyerIntentType buyerIntentType = buyerIntentScope2.intentType;
                    List list = CollectionsKt.toList(((RealCartBuilder) ((CartBuilder) this.$operation)).buyerIntentErrorsState);
                    LocalShoppingCart shoppingCart = current.getShoppingCart();
                    if (shoppingCart != null) {
                        List list2 = shoppingCart.lines;
                        r15 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            LocalCart.Line.Selection selection3 = ((LocalCart.Line) it2.next()).selection;
                            if (selection3 == null || (str3 = selection3.menu_item_token) == null || StringsKt.isBlank(str3) || selection3.quantity == null) {
                                selection = null;
                            } else {
                                try {
                                    Result.Companion companion2 = Result.Companion;
                                    failure = SelectionKt.toSelection(selection3);
                                } catch (Throwable th11) {
                                    Result.Companion companion3 = Result.Companion;
                                    failure = new Result.Failure(th11);
                                }
                                if (failure instanceof Result.Failure) {
                                    failure = null;
                                }
                                selection = (app.cash.local.primitives.Selection) failure;
                            }
                            if (selection != null) {
                                r15.add(selection);
                            }
                        }
                    } else {
                        r15 = 0;
                    }
                    if (r15 == 0) {
                        r15 = EmptyList.INSTANCE;
                    }
                    List list3 = current.errors;
                    List list4 = combination.selections;
                    FulfillmentConfiguration fulfillmentConfiguration = combination.fulfillmentConfiguration;
                    List list5 = combination.discountCodes;
                    if (Intrinsics.areEqual(list4, (Object) r15) || (!list3.isEmpty() && Intrinsics.areEqual(list, list3) && list4.containsAll((Collection) r15))) {
                        List list6 = list5;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((DiscountCode) it3.next()).getCode());
                        }
                        List list7 = shoppingCart != null ? shoppingCart.applied_discount_codes : null;
                        if (list7 == null) {
                            list7 = EmptyList.INSTANCE;
                        }
                        if (arrayList4.equals(list7)) {
                            int ordinal = buyerIntentType.ordinal();
                            if (ordinal == 0) {
                                LocalRemoteOrderingIntent localRemoteOrderingIntent = current.remoteOrdering;
                                if (localRemoteOrderingIntent != null) {
                                    if (Intrinsics.areEqual(localRemoteOrderingIntent.location_token, str4 == null ? null : str4) && (localFulfillment = localRemoteOrderingIntent.fulfillment) != null) {
                                        String mo1238getLocationTokenVSCKlZI = fulfillmentConfiguration.mo1238getLocationTokenVSCKlZI();
                                        if (mo1238getLocationTokenVSCKlZI == null) {
                                            equals = false;
                                        } else {
                                            Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                                            FulfillmentConfiguration.Delivery asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
                                            equals = FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(fulfillment, mo1238getLocationTokenVSCKlZI, asDelivery != null ? asDelivery.deliveryFee : null)).equals(FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(fulfillmentConfiguration));
                                        }
                                        break;
                                    }
                                }
                            } else if (ordinal == 1) {
                                LocalInStoreOrderingIntent localInStoreOrderingIntent = current.inStoreOrdering;
                                if (localInStoreOrderingIntent != null) {
                                    if (Intrinsics.areEqual(localInStoreOrderingIntent.location_token, str4 == null ? null : str4)) {
                                        break;
                                    }
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                        }
                    }
                    long incrementAndGet = ((AtomicLong) buyerIntentSyncManager.requestIds.computeIfAbsent(buyerIntentScope, new RealCartBuilderManager$$ExternalSyntheticLambda1(1, new Data$$ExternalSyntheticLambda0(9)))).incrementAndGet();
                    List list8 = list4;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                    Iterator it4 = list8.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(new LocalCart.Line(null, SelectionKt.toProtoSelection((app.cash.local.primitives.Selection) it4.next()), null, null, null, null, null, null, null, null, null, 2045, null));
                    }
                    List list9 = list5;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                    Iterator it5 = list9.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(((DiscountCode) it5.next()).getCode());
                    }
                    ByteString byteString2 = ByteString.EMPTY;
                    LocalShoppingCart localShoppingCart = new LocalShoppingCart(arrayList5, null, null, arrayList6, byteString2);
                    int ordinal2 = buyerIntentType.ordinal();
                    if (ordinal2 == 0) {
                        byteString = byteString2;
                        if (str4 == null) {
                            str4 = null;
                        }
                        updateUserIntentRequest$Update$RemoteOrdering = new UpdateUserIntentRequest$Update$RemoteOrdering(new LocalRemoteOrderingIntent(str4, FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration), localShoppingCart, byteString));
                    } else if (ordinal2 == 1) {
                        byteString = byteString2;
                        updateUserIntentRequest$Update$RemoteOrdering = new UpdateUserIntentRequest$Update$InStoreOrdering(new LocalInStoreOrderingIntent(str4 == null ? null : str4, buyerIntentScope2.inStoreOrderingToken, localShoppingCart, null, byteString2));
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    SessionState currentSessionState = PlatformKt.getCurrentSessionState(buyerIntentSyncManager.sessionManager);
                    if (!(currentSessionState instanceof SessionState.Authenticated) && !(currentSessionState instanceof SwitchingState)) {
                        if (currentSessionState instanceof SessionState.Initiated) {
                            str2 = ((SessionState.Initiated) currentSessionState).getAppToken();
                        } else if (currentSessionState instanceof NotInitiatedState) {
                            str2 = ((NotInitiatedState) currentSessionState).appToken;
                        }
                        str = str2;
                        UpdateUserIntentRequest updateUserIntentRequest = new UpdateUserIntentRequest(null, str, current.brandToken, updateUserIntentRequest$Update$RemoteOrdering, byteString);
                        BuyerIntentScope buyerIntentScope3 = (BuyerIntentScope) this.$this_simpleScan;
                        String str5 = current.intentToken;
                        FulfillmentConfiguration fulfillmentConfiguration2 = combination.fulfillmentConfiguration;
                        this.L$0 = null;
                        this.label = 1;
                        Object access$performRequest = BuyerIntentSyncManager.access$performRequest(buyerIntentSyncManager, buyerIntentScope3, updateUserIntentRequest, incrementAndGet, str5, fulfillmentConfiguration2, this);
                        return access$performRequest != coroutineSingletons20 ? coroutineSingletons20 : access$performRequest;
                    }
                    str = null;
                    UpdateUserIntentRequest updateUserIntentRequest2 = new UpdateUserIntentRequest(null, str, current.brandToken, updateUserIntentRequest$Update$RemoteOrdering, byteString);
                    BuyerIntentScope buyerIntentScope32 = (BuyerIntentScope) this.$this_simpleScan;
                    String str52 = current.intentToken;
                    FulfillmentConfiguration fulfillmentConfiguration22 = combination.fulfillmentConfiguration;
                    this.L$0 = null;
                    this.label = 1;
                    Object access$performRequest2 = BuyerIntentSyncManager.access$performRequest(buyerIntentSyncManager, buyerIntentScope32, updateUserIntentRequest2, incrementAndGet, str52, fulfillmentConfiguration22, this);
                    if (access$performRequest2 != coroutineSingletons20) {
                    }
                } else {
                    if (i26 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = deferredUseCaseCameraRequestControl;
        this.L$0 = obj;
        this.$this_simpleScan = obj2;
        this.$operation = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$0 = obj2;
        this.$this_simpleScan = obj3;
        this.$operation = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$this_simpleScan = obj2;
        this.$operation = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_simpleScan = obj;
        this.$operation = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleScan$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$operation = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(Continuation continuation, CapturePipelineImpl capturePipelineImpl, ArrayList arrayList, ArrayList arrayList2) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$1 = capturePipelineImpl;
        this.L$0 = arrayList;
        this.$this_simpleScan = arrayList2;
    }
}
