package androidx.collection;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureResult;
import android.view.Surface;
import android.view.TextureView;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.compat.ActiveCamera;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RequestClose;
import androidx.camera.camera2.pipe.compat.RequestCloseById;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1;
import androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerWrapperFlingBehavior;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsNode;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.nimbusds.jose.JWECryptoParts;
import com.stripe.hcaptcha.HCaptcha;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class ObjectList$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ObjectList$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CameraGraphImpl createCameraGraphLocked;
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder;
        LazyListMeasureResult lazyListMeasureResult;
        LazyGridMeasureResult lazyGridMeasureResult;
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        boolean z = false;
        LazyListMeasureResult lazyListMeasureResult2 = null;
        LazyGridMeasureResult lazyGridMeasureResult2 = null;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return obj == ((MutableObjectList) obj2) ? "(this)" : String.valueOf(obj);
            case 1:
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    callbackToFutureAdapter$Completer.set(null);
                } else if (th instanceof CancellationException) {
                    callbackToFutureAdapter$Completer.setCancelled();
                } else {
                    callbackToFutureAdapter$Completer.setException(th);
                }
                return Unit.INSTANCE;
            case 2:
                ((TorchControl) obj2)._updateTorchStrengthSignal = null;
                return Unit.INSTANCE;
            case 3:
                CameraGraph$Config cameraGraph$Config = (CameraGraph$Config) obj;
                cameraGraph$Config.getClass();
                CameraPipeImpl cameraPipeImpl = ((UseCaseManager) obj2).cameraPipe;
                synchronized (cameraPipeImpl.lock) {
                    if (cameraPipeImpl.shutdown) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb = new StringBuilder("CameraGraph-");
                    AtomicInt atomicInt = CameraGraphId.cameraGraphIds;
                    atomicInt.getClass();
                    sb.append(AtomicInt.FU.incrementAndGet(atomicInt));
                    createCameraGraphLocked = cameraPipeImpl.createCameraGraphLocked(cameraGraph$Config, new CameraGraphId(sb.toString()));
                }
                return createCameraGraphLocked;
            case 4:
                CompletableDeferredImpl completableDeferredImpl = ((RequestCloseById) obj2).deferred;
                Unit unit = Unit.INSTANCE;
                completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                return unit;
            case 5:
                ActiveCamera activeCamera = (ActiveCamera) obj;
                activeCamera.getClass();
                ((BufferedChannel) ((PruningCamera2DeviceManager) obj2).queue.f).mo1159trySendJP2dKIU(new RequestClose(activeCamera));
                return Unit.INSTANCE;
            case 6:
                ((ArrayDeque) ((JWECryptoParts) obj2).authenticationTag).addLast(obj);
                return Unit.INSTANCE;
            case 7:
                ((ArrayDeque) ((e0) obj2).h).addLast(obj);
                return Unit.INSTANCE;
            case 8:
                AndroidFrameMetadata androidFrameMetadata = (AndroidFrameMetadata) obj;
                androidFrameMetadata.getClass();
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!CollectionsKt.contains((List) entry.getValue(), androidFrameMetadata.get((CaptureResult.Key) entry.getKey()))) {
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(((CameraPresenceProvider.ListenerWrapper) obj).listener == ((HCaptcha) obj2));
            case 10:
                return ((CameraX) obj2).mInitInternalFuture;
            case 11:
                ((Surface) obj).release();
                ((SurfaceTexture) ((ViewfinderExternalSurfaceHolder) obj2).surfaceControl).release();
                return Unit.INSTANCE;
            case 12:
                ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = (ViewfinderEmbeddedExternalSurfaceState) obj2;
                ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 = (ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj;
                TextureView.SurfaceTextureListener surfaceTextureListener = viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTextureListener();
                if ((surfaceTextureListener instanceof ViewfinderEmbeddedExternalSurfaceState ? (ViewfinderEmbeddedExternalSurfaceState) surfaceTextureListener : null) != null && (viewfinderExternalSurfaceHolder = viewfinderEmbeddedExternalSurfaceState.viewfinderSurfaceHolder) != null && !viewfinderExternalSurfaceHolder.isDetached) {
                    viewfinderExternalSurfaceHolder.refCountedSurface.release();
                    viewfinderExternalSurfaceHolder.isDetached = true;
                }
                viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setSurfaceTextureListener(null);
                return Unit.INSTANCE;
            case 13:
                return obj == ((MutableScatterSet) obj2) ? "(this)" : String.valueOf(obj);
            case 14:
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((Transition) obj2, 4);
            case 15:
                ((Function1) ((DefaultDraggable2DState$drag2DScope$1) obj2).this$0.val$completer).invoke(new Offset(((DragEvent.DragDelta) obj).delta));
                return Unit.INSTANCE;
            case 16:
                MutableVector mutableVector = (MutableVector) obj2;
                Object[] objArr = mutableVector.content;
                int i2 = mutableVector.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((MeasureResult) objArr[i3]).placeChildren();
                }
                return Unit.INSTANCE;
            case 17:
                LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 = (LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1) obj2;
                return lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.m309getAndMeasure0kLqBqw(((Integer) obj).intValue(), lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.childConstraints);
            case 18:
                LazyListState lazyListState = (LazyListState) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= RecyclerView.DECELERATION_RATE || lazyListState.getCanScrollForward()) && (f2 <= RecyclerView.DECELERATION_RATE || lazyListState.getCanScrollBackward())) {
                    if (Math.abs(lazyListState.scrollToBeConsumed) > 0.5f) {
                        InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
                    }
                    lazyListState.executeRequestsInHighPriorityMode = true;
                    float f3 = lazyListState.scrollToBeConsumed + f2;
                    lazyListState.scrollToBeConsumed = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = lazyListState.scrollToBeConsumed;
                        int round = Math.round(f4);
                        LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure = ((LazyListMeasureResult) lazyListState.layoutInfoState.getValue()).copyWithScrollDeltaWithoutRemeasure(round, !lazyListState.hasLookaheadOccurred);
                        if (copyWithScrollDeltaWithoutRemeasure != null && (lazyListMeasureResult = lazyListState.approachLayoutInfo) != null) {
                            LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(round, true);
                            if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                                lazyListState.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                            }
                            if (lazyListMeasureResult2 == null) {
                                lazyListState.applyMeasureResult$foundation(lazyListMeasureResult2, lazyListState.hasLookaheadOccurred, true);
                                LazyLayoutKt.m324invalidateScopeimpl(lazyListState.placementScopeInvalidator);
                                lazyListState.notifyPrefetchOnScroll(f4 - lazyListState.scrollToBeConsumed, lazyListMeasureResult2);
                            } else {
                                LayoutNode layoutNode = lazyListState.remeasurement;
                                if (layoutNode != null) {
                                    layoutNode.forceRemeasure();
                                }
                                lazyListState.notifyPrefetchOnScroll(f4 - lazyListState.scrollToBeConsumed, lazyListState.getLayoutInfo());
                            }
                        }
                        lazyListMeasureResult2 = copyWithScrollDeltaWithoutRemeasure;
                        if (lazyListMeasureResult2 == null) {
                        }
                    }
                    if (Math.abs(lazyListState.scrollToBeConsumed) > 0.5f) {
                        f2 -= lazyListState.scrollToBeConsumed;
                        lazyListState.scrollToBeConsumed = RecyclerView.DECELERATION_RATE;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 19:
                return Integer.valueOf(((LazyGridSpanLayoutProvider) obj2).getLineIndexOfItem(((Integer) obj).intValue()));
            case 20:
                LazyGridState lazyGridState = (LazyGridState) obj2;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= RecyclerView.DECELERATION_RATE || lazyGridState.getCanScrollForward()) && (f5 <= RecyclerView.DECELERATION_RATE || lazyGridState.getCanScrollBackward())) {
                    if (Math.abs(lazyGridState.scrollToBeConsumed) > 0.5f) {
                        InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
                    }
                    float f6 = lazyGridState.scrollToBeConsumed + f5;
                    lazyGridState.scrollToBeConsumed = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = lazyGridState.scrollToBeConsumed;
                        int roundToInt = MathKt__MathJVMKt.roundToInt(f7);
                        LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure3 = ((LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue()).copyWithScrollDeltaWithoutRemeasure(roundToInt, !lazyGridState.hasLookaheadOccurred);
                        if (copyWithScrollDeltaWithoutRemeasure3 != null && (lazyGridMeasureResult = lazyGridState.approachLayoutInfo) != null) {
                            LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure4 = lazyGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(roundToInt, true);
                            if (copyWithScrollDeltaWithoutRemeasure4 != null) {
                                lazyGridState.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure4;
                            }
                            if (lazyGridMeasureResult2 == null) {
                                lazyGridState.applyMeasureResult$foundation(lazyGridMeasureResult2, lazyGridState.hasLookaheadOccurred, true);
                                LazyLayoutKt.m324invalidateScopeimpl(lazyGridState.placementScopeInvalidator);
                                lazyGridState.notifyPrefetchOnScroll(f7 - lazyGridState.scrollToBeConsumed, lazyGridMeasureResult2);
                            } else {
                                LayoutNode layoutNode2 = lazyGridState.remeasurement;
                                if (layoutNode2 != null) {
                                    layoutNode2.forceRemeasure();
                                }
                                lazyGridState.notifyPrefetchOnScroll(f7 - lazyGridState.scrollToBeConsumed, lazyGridState.getLayoutInfo());
                            }
                        }
                        lazyGridMeasureResult2 = copyWithScrollDeltaWithoutRemeasure3;
                        if (lazyGridMeasureResult2 == null) {
                        }
                    }
                    if (Math.abs(lazyGridState.scrollToBeConsumed) > 0.5f) {
                        f5 -= lazyGridState.scrollToBeConsumed;
                        lazyGridState.scrollToBeConsumed = RecyclerView.DECELERATION_RATE;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 21:
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((LazyLayoutItemContentFactory.CachedItemContent) obj2, 5);
            case 22:
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((LazyLayoutPinnableItem) obj2, 7);
            case 23:
                SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) obj2;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true);
            case 24:
                float floatValue = ((Float) obj).floatValue();
                PagerState pagerState = ((PagerWrapperFlingBehavior) obj2).pagerState;
                if (pagerState.getPageSizeWithSpacing$foundation() != 0) {
                    f = floatValue / pagerState.getPageSizeWithSpacing$foundation();
                }
                pagerState.programmaticScrollTargetPage$delegate.setIntValue(pagerState.coerceInPageRange(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() + MathKt__MathJVMKt.roundToInt(f)));
                return Unit.INSTANCE;
            case 25:
                ((SemanticsPropertyReceiver) obj).set(SelectionHandlesKt.SelectionHandleInfoKey, new SelectionHandleInfo(Handle.Cursor, ((OffsetProvider) obj2).mo345provideF1C5BW0(), SelectionHandleAnchor.Middle, true));
                return Unit.INSTANCE;
            case 26:
                TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = textFieldScrollerPosition.offset$delegate;
                float floatValue3 = parcelableSnapshotMutableFloatState.getFloatValue() + floatValue2;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = textFieldScrollerPosition.maximum$delegate;
                if (floatValue3 > parcelableSnapshotMutableFloatState2.getFloatValue()) {
                    floatValue2 = parcelableSnapshotMutableFloatState2.getFloatValue() - parcelableSnapshotMutableFloatState.getFloatValue();
                } else if (floatValue3 < RecyclerView.DECELERATION_RATE) {
                    floatValue2 = -parcelableSnapshotMutableFloatState.getFloatValue();
                }
                parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() + floatValue2);
                return Float.valueOf(floatValue2);
            case 27:
                Drawable drawable = (Drawable) obj2;
                DrawScope drawScope = (DrawScope) obj;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)));
                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
                return Unit.INSTANCE;
            case 28:
                ((Function1) obj).invoke((TextContextMenuBuilderScope) obj2);
                return Unit.INSTANCE;
            default:
                ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = (ObjectList$$ExternalSyntheticLambda0) obj2;
                TraversableNode traversableNode = (TraversableNode) obj;
                if (traversableNode instanceof AddTextContextMenuDataComponentsNode) {
                    objectList$$ExternalSyntheticLambda0.invoke(((AddTextContextMenuDataComponentsNode) traversableNode).builder);
                    return Boolean.TRUE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
        }
    }

    public /* synthetic */ ObjectList$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
