package androidx.compose.animation;

import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.view.View;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.input.pointer.HoverIconModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutBoundsNode;
import androidx.compose.ui.layout.OnFirstVisibleNode;
import androidx.compose.ui.layout.OnVisibilityChangedNode;
import androidx.compose.ui.node.AlignmentLinesOwner;
import androidx.compose.ui.node.LookaheadAlignmentLines;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.core.view.ViewCompat;
import androidx.glance.session.InteractiveFrameClock;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi31Ext9Impl;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final class BoundsAnimation$animate$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoundsAnimation$animate$1(Object obj, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean offer;
        SessionEndedMetric sessionEndedMetric;
        switch (this.$r8$classId) {
            case 0:
                return ((BoundsAnimation) this.this$0).animationSpec;
            case 1:
                AnimationVector4D animationVector4D = (AnimationVector4D) obj;
                float f = animationVector4D.v2;
                float f2 = RecyclerView.DECELERATION_RATE;
                if (f < RecyclerView.DECELERATION_RATE) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f3 = animationVector4D.v3;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                float f4 = animationVector4D.v4;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = f5 <= 0.5f ? f5 : 0.5f;
                float f7 = animationVector4D.v1;
                if (f7 >= RecyclerView.DECELERATION_RATE) {
                    f2 = f7;
                }
                return new Color(Color.m674convertvNxB06k(ColorKt.Color(f, f3, f6, f2 <= 1.0f ? f2 : 1.0f, ColorSpaces.Oklab), (ColorSpace) this.this$0));
            case 2:
                return Boolean.valueOf(!Intrinsics.areEqual(obj, ((Transition) this.this$0).targetState$delegate.getValue()));
            case 3:
                ((ReusableGraphicsLayerScope) obj).setAlpha(((Number) ((State) this.this$0).getValue()).floatValue());
                return Unit.INSTANCE;
            case 4:
                ((ReusableGraphicsLayerScope) obj).setClip(((Boolean) ((Function0) this.this$0).invoke()).booleanValue());
                return Unit.INSTANCE;
            case 5:
                DragAndDropNode dragAndDropNode = (DragAndDropNode) obj;
                if (!dragAndDropNode.getNode().isAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                if (dragAndDropTarget != null) {
                    dragAndDropTarget.onEnded((DragAndDropEvent) this.this$0);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.this$0;
                reusableGraphicsLayerScope.setShadowElevation(reusableGraphicsLayerScope.graphicsDensity.getDensity() * shadowGraphicsLayerElement.elevation);
                reusableGraphicsLayerScope.setShape(shadowGraphicsLayerElement.shape);
                reusableGraphicsLayerScope.setClip(shadowGraphicsLayerElement.clip);
                reusableGraphicsLayerScope.m708setAmbientShadowColor8_81llA(shadowGraphicsLayerElement.ambientColor);
                reusableGraphicsLayerScope.m710setSpotShadowColor8_81llA(shadowGraphicsLayerElement.spotColor);
                return Unit.INSTANCE;
            case 7:
                if (!((HoverIconModifierNode) obj).cursorInBoundsOfNode) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                ((Ref$BooleanRef) this.this$0).element = false;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            case 8:
                Throwable th = (Throwable) obj;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.this$0;
                CancellableContinuationImpl cancellableContinuationImpl = pointerEventHandlerCoroutine.pointerAwaiter;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.cancel(th);
                }
                pointerEventHandlerCoroutine.pointerAwaiter = null;
                return Unit.INSTANCE;
            case 9:
                RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
                LayoutBoundsNode layoutBoundsNode = (LayoutBoundsNode) this.this$0;
                ((ParcelableSnapshotMutableState) layoutBoundsNode.holder.this$0).setValue(relativeLayoutBounds);
                layoutBoundsNode.lastBounds = relativeLayoutBounds;
                return Unit.INSTANCE;
            case 10:
                OnFirstVisibleNode onFirstVisibleNode = (OnFirstVisibleNode) this.this$0;
                onFirstVisibleNode.checkVisibility(1.0f, (RelativeLayoutBounds) obj, onFirstVisibleNode.lastViewport);
                return Unit.INSTANCE;
            case 11:
                OnVisibilityChangedNode onVisibilityChangedNode = (OnVisibilityChangedNode) this.this$0;
                onVisibilityChangedNode.lastViewport = null;
                onVisibilityChangedNode.checkVisibility(onVisibilityChangedNode.minFractionVisible, (RelativeLayoutBounds) obj, null);
                return Unit.INSTANCE;
            case 12:
                AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
                LookaheadAlignmentLines lookaheadAlignmentLines = (LookaheadAlignmentLines) this.this$0;
                if (alignmentLinesOwner.getPlaceOrder() != Integer.MAX_VALUE) {
                    if (alignmentLinesOwner.getAlignmentLines().dirty) {
                        alignmentLinesOwner.layoutChildren();
                    }
                    for (Map.Entry entry : alignmentLinesOwner.getAlignmentLines().alignmentLineMap.entrySet()) {
                        LookaheadAlignmentLines.access$addAlignmentLine(lookaheadAlignmentLines, (AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
                    }
                    NodeCoordinator nodeCoordinator = alignmentLinesOwner.getInnerCoordinator().wrappedBy;
                    nodeCoordinator.getClass();
                    while (!nodeCoordinator.equals(lookaheadAlignmentLines.alignmentLinesOwner.getInnerCoordinator())) {
                        for (AlignmentLine alignmentLine : lookaheadAlignmentLines.getAlignmentLinesMap(nodeCoordinator).keySet()) {
                            LookaheadAlignmentLines.access$addAlignmentLine(lookaheadAlignmentLines, alignmentLine, lookaheadAlignmentLines.getPositionFor(nodeCoordinator, alignmentLine), nodeCoordinator);
                        }
                        nodeCoordinator = nodeCoordinator.wrappedBy;
                        nodeCoordinator.getClass();
                    }
                }
                return Unit.INSTANCE;
            case 13:
                return Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(((FocusDirection) this.this$0).value));
            case 14:
                return Boolean.valueOf(((MutableIntObjectMap) this.this$0).containsKey(((SemanticsNode) obj).id));
            case 15:
                return Boolean.valueOf(LayoutUpdate.access$isScreenReaderFocusable((SemanticsNode) obj, (Resources) this.this$0));
            case 16:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.this$0).cancel();
                }
                return Unit.INSTANCE;
            case 17:
                SemanticsPropertiesKt.m950setRolekuIjeqM((SemanticsPropertyReceiver) obj, ((Role) this.this$0).value);
                return Unit.INSTANCE;
            case 18:
                ((List) obj).add((Float) ((LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda1) this.this$0).invoke());
                return true;
            case 19:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                WidgetFrame widgetFrame = (WidgetFrame) this.this$0;
                if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
                    reusableGraphicsLayerScope2.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
                }
                if (!Float.isNaN(widgetFrame.rotationX)) {
                    reusableGraphicsLayerScope2.setRotationX(widgetFrame.rotationX);
                }
                if (!Float.isNaN(widgetFrame.rotationY)) {
                    reusableGraphicsLayerScope2.setRotationY(widgetFrame.rotationY);
                }
                if (!Float.isNaN(widgetFrame.rotationZ)) {
                    reusableGraphicsLayerScope2.setRotationZ(widgetFrame.rotationZ);
                }
                if (!Float.isNaN(widgetFrame.translationX)) {
                    reusableGraphicsLayerScope2.setTranslationX(widgetFrame.translationX);
                }
                if (!Float.isNaN(widgetFrame.translationY)) {
                    reusableGraphicsLayerScope2.setTranslationY(widgetFrame.translationY);
                }
                if (!Float.isNaN(widgetFrame.translationZ)) {
                    reusableGraphicsLayerScope2.setShadowElevation(widgetFrame.translationZ);
                }
                if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
                    reusableGraphicsLayerScope2.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
                    reusableGraphicsLayerScope2.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
                }
                if (!Float.isNaN(widgetFrame.alpha)) {
                    reusableGraphicsLayerScope2.setAlpha(widgetFrame.alpha);
                }
                return Unit.INSTANCE;
            case 20:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Collection collection = (Collection) this.this$0;
                View view = (View) entry2.getValue();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                return Boolean.valueOf(CollectionsKt.contains(collection, view.getTransitionName()));
            case 21:
                ((ProducerCoroutine) ((ProducerScope) this.this$0)).mo1159trySendJP2dKIU(null);
                return Unit.INSTANCE;
            case 22:
                InteractiveFrameClock interactiveFrameClock = (InteractiveFrameClock) this.this$0;
                synchronized (interactiveFrameClock.lock) {
                    interactiveFrameClock.currentHz = 5;
                    interactiveFrameClock.interactiveCoroutine = null;
                }
                return Unit.INSTANCE;
            case 23:
                ((Job) this.this$0).cancel(null);
                return Unit.INSTANCE;
            case 24:
                ((Context) obj).getClass();
                return new MeasurementManagerApi31Ext9Impl((Context) this.this$0, 0);
            case 25:
                File file = (File) obj;
                file.getClass();
                return file.listFiles((FileFilter) this.this$0);
            case 26:
                File file2 = (File) obj;
                file2.getClass();
                return Boolean.valueOf(file2.renameTo((File) this.this$0));
            case 27:
                obj.getClass();
                offer = super/*java.util.concurrent.LinkedBlockingQueue*/.offer(obj);
                return Boolean.valueOf(offer);
            case 28:
                Map map = (Map) obj;
                map.getClass();
                map.remove(((RumViewScope) this.this$0).viewId);
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                if (str != null && (sessionEndedMetric = (SessionEndedMetric) ((DatadogRumMonitor) this.this$0).sessionEndedMetricDispatcher.metricsBySessionId.get(str)) != null) {
                    sessionEndedMetric.sessionReplaySkippedFramesCount.incrementAndGet();
                }
                return Unit.INSTANCE;
        }
    }
}
