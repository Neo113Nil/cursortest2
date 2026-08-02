package androidx.compose.foundation;

import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.camera.camera2.compat.EvCompImpl;
import androidx.camera.camera2.compat.EvCompImpl$applyAsync$3;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.video.Recorder;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.OffsetNode;
import androidx.compose.foundation.layout.OffsetPxNode;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.provider.FontsContractCompat;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$4$1$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class ClickableKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ClickableKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 3;
        Continuation continuation = null;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) this.f$0;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f$1;
                boolean z = ref$BooleanRef.element || ((GestureConnection) obj).isInterested(indirectPointerInputChange);
                ref$BooleanRef.element = z;
                return Boolean.valueOf(!z);
            case 1:
                BackHandlerDispatcherCompat backHandlerDispatcherCompat = (BackHandlerDispatcherCompat) this.f$0;
                ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) this.f$1;
                backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i3, backHandlerDispatcherCompat, composePredictiveBackHandler);
            case 2:
                Deferred deferred = (Deferred) this.f$0;
                CompletableDeferred completableDeferred = (CompletableDeferred) this.f$1;
                Throwable th = (Throwable) obj;
                deferred.getClass();
                completableDeferred.getClass();
                if (th == null) {
                    completableDeferred.complete(deferred.getCompleted());
                } else if (th instanceof CancellationException) {
                    completableDeferred.cancel((CancellationException) th);
                } else {
                    completableDeferred.completeExceptionally(th);
                }
                return Unit.INSTANCE;
            case 3:
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.f$0;
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) this.f$1;
                Throwable th2 = (Throwable) obj;
                if (th2 == null) {
                    callbackToFutureAdapter$Completer.set(completableDeferredImpl.getCompletedInternal$kotlinx_coroutines_core());
                } else if (th2 instanceof CancellationException) {
                    callbackToFutureAdapter$Completer.setCancelled();
                } else {
                    callbackToFutureAdapter$Completer.setException(th2);
                }
                return Unit.INSTANCE;
            case 4:
                ((EvCompImpl) this.f$0).comboRequestListener.removeListener((EvCompImpl$applyAsync$3) this.f$1);
                return Unit.INSTANCE;
            case 5:
                List list = (List) this.f$0;
                State3AControl state3AControl = (State3AControl) this.f$1;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((CompletableDeferred) it.next()).completeExceptionally(th3);
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((CompletableDeferred) it2.next()).complete(Unit.INSTANCE);
                    }
                }
                synchronized (state3AControl.lock) {
                    state3AControl.pendingSignals.removeAll(list);
                }
                return Unit.INSTANCE;
            case 6:
                UseCaseManager useCaseManager = (UseCaseManager) this.f$0;
                JobSupport jobSupport = (JobSupport) this.f$1;
                synchronized (useCaseManager.lock) {
                    useCaseManager.closingCameraJobs.remove(jobSupport);
                }
                return Unit.INSTANCE;
            case 7:
                HashMap hashMap = (HashMap) this.f$0;
                CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) this.f$1;
                UseCase useCase = (UseCase) obj;
                useCase.getClass();
                Object obj2 = hashMap.get(useCase);
                if (obj2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                CameraUseCaseAdapter.ConfigPair configPair = (CameraUseCaseAdapter.ConfigPair) obj2;
                UseCaseConfig mergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                mergeConfigs.getClass();
                return mergeConfigs;
            case 8:
                InfiniteTransition infiniteTransition = (InfiniteTransition) this.f$0;
                InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) this.f$1;
                infiniteTransition._animations.add(transitionAnimationState);
                infiniteTransition.refreshChildNeeded$delegate.setValue(Boolean.TRUE);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i, infiniteTransition, transitionAnimationState);
            case 9:
                Object obj3 = this.f$0;
                CoroutineScope coroutineScope = (CoroutineScope) this.f$1;
                Function0 function0 = (Function0) obj;
                if (obj3 == Thread.currentThread()) {
                    function0.invoke();
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new CardTransitionKt$sceneCache$4$1$1(function0, continuation, i3), 3);
                }
                return Unit.INSTANCE;
            case 10:
                Transition transition = (Transition) this.f$0;
                Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) this.f$1;
                transition._animations.add(transitionAnimationState2);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i2, transition, transitionAnimationState2);
            case 11:
                InteractionResult interactionResult = (InteractionResult) this.f$0;
                ((SeekableTransitionState) interactionResult).setSnapshotStateObserver$animation_core(new SnapshotStateObserver(new ClickableKt$$ExternalSyntheticLambda0(9, Thread.currentThread(), (CoroutineScope) this.f$1)));
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(interactionResult, i2);
            case 12:
                ((MutableInteractionSourceImpl) this.f$0).tryEmit((PressInteraction.Cancel) this.f$1);
                return Unit.INSTANCE;
            case 13:
                Outline$Generic outline$Generic = (Outline$Generic) this.f$0;
                Brush brush = (Brush) this.f$1;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                DrawScope.m744drawPathGBMwjPU$default(layoutNodeDrawScope, outline$Generic.path, brush, RecyclerView.DECELERATION_RATE, null, 60);
                return Unit.INSTANCE;
            case 14:
                PointerInputChange pointerInputChange = (PointerInputChange) this.f$0;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.f$1;
                boolean z2 = ref$BooleanRef2.element || ((GestureConnection) obj).isInterested(pointerInputChange);
                ref$BooleanRef2.element = z2;
                return Boolean.valueOf(!z2);
            case 15:
                AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) this.f$0;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) this.f$1;
                long j = ((DragEvent.DragDelta) obj).delta;
                long m627timestuRUvjQ = anchoredDraggableNode.isReverseDirection$1() ? Offset.m627timestuRUvjQ(j, -1.0f) : Offset.m627timestuRUvjQ(j, 1.0f);
                anchoredDraggableState$anchoredDragScope$1.dragTo(anchoredDraggableNode.state.newOffsetForDelta$foundation(Float.intBitsToFloat((int) (anchoredDraggableNode.orientation == Orientation.Vertical ? m627timestuRUvjQ & BodyPartID.bodyIdMax : m627timestuRUvjQ >> 32))), RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 16:
                ((MutableVector) ((MemoryCacheService) this.f$0).imageLoader).remove((ContentInViewNode.Request) this.f$1);
                return Unit.INSTANCE;
            case 17:
                SliderState$dragScope$1 sliderState$dragScope$1 = (SliderState$dragScope$1) this.f$0;
                DraggableNode draggableNode = (DraggableNode) this.f$1;
                long j2 = ((DragEvent.DragDelta) obj).delta;
                long m627timestuRUvjQ2 = draggableNode.reverseDirection ? Offset.m627timestuRUvjQ(j2, -1.0f) : Offset.m627timestuRUvjQ(j2, 1.0f);
                Orientation orientation = draggableNode.orientation;
                CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
                sliderState$dragScope$1.dragBy(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? m627timestuRUvjQ2 & BodyPartID.bodyIdMax : m627timestuRUvjQ2 >> 32)));
                return Unit.INSTANCE;
            case 18:
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.f$0;
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.f$1;
                DragEvent.DragDelta dragDelta = (DragEvent.DragDelta) obj;
                float f = dragDelta.isIndirectPointerEvent ? -1.0f : 1.0f;
                long j3 = dragDelta.delta;
                scrollingLogic$nestedScrollScope$1.m250scrollByWithOverscrollOzD1aCk(1, Offset.m627timestuRUvjQ(scrollingLogic.orientation == Orientation.Horizontal ? Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1, j3) : Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2, j3), f));
                return Unit.INSTANCE;
            case 19:
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) this.f$0;
                Function1 function1 = (Function1) this.f$1;
                ((Long) obj).getClass();
                float f2 = updatableAnimationState.value;
                updatableAnimationState.value = RecyclerView.DECELERATION_RATE;
                function1.invoke(Float.valueOf(f2));
                return Unit.INSTANCE;
            case 20:
                OffsetNode offsetNode = (OffsetNode) this.f$0;
                Placeable placeable = (Placeable) this.f$1;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                boolean z3 = offsetNode.rtlAware;
                float f3 = offsetNode.x;
                if (z3) {
                    placementScope.placeRelative(placeable, placementScope.mo230roundToPx0680j_4(f3), placementScope.mo230roundToPx0680j_4(offsetNode.y), RecyclerView.DECELERATION_RATE);
                } else {
                    placementScope.place(placeable, placementScope.mo230roundToPx0680j_4(f3), placementScope.mo230roundToPx0680j_4(offsetNode.y), RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 21:
                OffsetPxNode offsetPxNode = (OffsetPxNode) this.f$0;
                Placeable placeable2 = (Placeable) this.f$1;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                long j4 = ((IntOffset) offsetPxNode.offset.invoke(placementScope2)).packedValue;
                if (offsetPxNode.rtlAware) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, placeable2, (int) (j4 >> 32), (int) (j4 & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, 12);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope2, placeable2, (int) (j4 >> 32), (int) (j4 & BodyPartID.bodyIdMax), null, 12);
                }
                return Unit.INSTANCE;
            case 22:
                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = (LazyGridSpanLayoutProvider) this.f$0;
                LruArrayPool lruArrayPool = (LruArrayPool) this.f$1;
                FontsContractCompat.FontFamilyResult lineConfiguration = lazyGridSpanLayoutProvider.getLineConfiguration(((Integer) obj).intValue());
                int i4 = lineConfiguration.mStatusCode;
                List list2 = lineConfiguration.mFonts;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    int i7 = (int) ((GridItemSpan) list2.get(i6)).packedValue;
                    arrayList.add(new Pair(Integer.valueOf(i4), new Constraints(lruArrayPool.m1910childConstraintsJhjzzOo$foundation(i5, i7))));
                    i4++;
                    i5 += i7;
                }
                return arrayList;
            case 23:
                LruArrayPool lruArrayPool2 = (LruArrayPool) this.f$0;
                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = (LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1) this.f$1;
                int intValue = ((Integer) obj).intValue();
                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = (LazyGridSpanLayoutProvider) lruArrayPool2.sortedSizes;
                int i8 = lazyGridSpanLayoutProvider2.slotsPerLine;
                int spanOf = lazyGridSpanLayoutProvider2.spanOf(intValue);
                return lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.m316getAndMeasurem8Kt_7k(intValue, 0, spanOf, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.defaultMainAxisSpacing, lruArrayPool2.m1910childConstraintsJhjzzOo$foundation(0, spanOf));
            case 24:
                AwaitFirstLayoutModifier.Node node = (AwaitFirstLayoutModifier.Node) this.f$0;
                AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier) this.f$1;
                ThrottledCallbacks.Entry entry = node.handle;
                if (entry != null) {
                    entry.unregister();
                }
                node.handle = null;
                CompletableDeferredImpl completableDeferredImpl2 = awaitFirstLayoutModifier.lock;
                if (completableDeferredImpl2 != null) {
                    completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                }
                awaitFirstLayoutModifier.lock = null;
                return Unit.INSTANCE;
            case 25:
                LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) this.f$0;
                Object obj4 = this.f$1;
                lazySaveableStateHolder.previouslyComposedKeys.minusAssign(obj4);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(4, lazySaveableStateHolder, obj4);
            case 26:
                return new LazySaveableStateHolder((SaveableStateRegistry) this.f$0, (Map) obj, (SaveableStateHolder) this.f$1);
            case 27:
                ((Function2) this.f$0).invoke(Integer.valueOf(((PrefetchHandleProvider$HandleAndRequestImpl) obj).index), Integer.valueOf(((Recorder.AnonymousClass3) this.f$1).getLayoutInfo().pageSize));
                return Unit.INSTANCE;
            case 28:
                MutableState mutableState = (MutableState) this.f$0;
                Placeable.PlacementScope placementScope3 = (Placeable.PlacementScope) obj;
                TextStreamsKt$$ExternalSyntheticLambda0 textStreamsKt$$ExternalSyntheticLambda0 = new TextStreamsKt$$ExternalSyntheticLambda0(i3, (ArrayList) this.f$1);
                placementScope3.motionFrameOfReferencePlacement = true;
                textStreamsKt$$ExternalSyntheticLambda0.invoke(placementScope3);
                placementScope3.motionFrameOfReferencePlacement = false;
                mutableState.getValue();
                return Unit.INSTANCE;
            default:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) this.f$0;
                Brush brush2 = (Brush) this.f$1;
                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope2.drawContent();
                if (((Boolean) legacyTextFieldState.autofillHighlightOn$delegate.getValue()).booleanValue() || ((Boolean) legacyTextFieldState.justAutofilled$delegate.getValue()).booleanValue()) {
                    DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope2, brush2, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                }
                return Unit.INSTANCE;
        }
    }
}
