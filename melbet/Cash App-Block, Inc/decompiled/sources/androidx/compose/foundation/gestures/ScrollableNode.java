package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.EdgeEffectWrapper;
import androidx.compose.foundation.GestureNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode {
    public final ContentInViewNode contentInViewNode;
    public final DefaultFlingBehavior defaultFlingBehavior;
    public FlingBehavior flingBehavior;
    public final FocusTargetNode focusTargetModifierNode;
    public MouseWheelScrollingLogic mouseWheelScrollingLogic;
    public final ScrollableNestedScrollConnection nestedScrollConnection;
    public final SimpleActor nestedScrollDispatcher;
    public AndroidEdgeEffectOverscrollEffect overscrollEffect;
    public ComposerKt$$ExternalSyntheticLambda0 scrollByAction;
    public ScrollableNode$setScrollSemanticsActions$2 scrollByOffsetAction;
    public final ScrollingLogic scrollingLogic;
    public TrackpadScrollingLogic trackpadScrollingLogic;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.foundation.gestures.ScrollableNode, androidx.compose.ui.node.DelegatingNode] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    public ScrollableNode(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        super(ScrollableKt.CanDragCalculation, z, mutableInteractionSourceImpl, orientation);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.flingBehavior = flingBehavior;
        SimpleActor simpleActor = new SimpleActor(3);
        this.nestedScrollDispatcher = simpleActor;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(new DecayAnimationSpecImpl(new Extras.Key((Density) ScrollableKt.UnityDensity)));
        this.defaultFlingBehavior = defaultFlingBehavior;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = this.overscrollEffect;
        ?? r1 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, androidEdgeEffectOverscrollEffect2, r1 == 0 ? defaultFlingBehavior : r1, orientation, z2, simpleActor, this, new ScrollableNode$$ExternalSyntheticLambda0(this, 0));
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        FocusTargetNode focusTargetNode = new FocusTargetNode(2, null, 10);
        delegate(focusTargetNode);
        this.focusTargetModifierNode = focusTargetNode;
        ContentInViewNode contentInViewNode = new ContentInViewNode(orientation, scrollingLogic, z2, bringIntoViewSpec, new ScrollableNode$$ExternalSyntheticLambda0(this, 1));
        delegate(contentInViewNode);
        this.contentInViewNode = contentInViewNode;
        delegate(new NestedScrollNode(scrollableNestedScrollConnection, simpleActor));
        BringIntoViewResponderNode bringIntoViewResponderNode = new BringIntoViewResponderNode();
        bringIntoViewResponderNode.responder = contentInViewNode;
        delegate(bringIntoViewResponderNode);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.enabled && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            this.scrollByAction = new ComposerKt$$ExternalSyntheticLambda0(this, 1);
            this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        ComposerKt$$ExternalSyntheticLambda0 composerKt$$ExternalSyntheticLambda0 = this.scrollByAction;
        if (composerKt$$ExternalSyntheticLambda0 != null) {
            KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
            semanticsPropertyReceiver.set(SemanticsActions.ScrollBy, new AccessibilityAction(null, composerKt$$ExternalSyntheticLambda0));
        }
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = this.scrollByOffsetAction;
        if (scrollableNode$setScrollSemanticsActions$2 != null) {
            KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
            semanticsPropertyReceiver.set(SemanticsActions.ScrollByOffset, scrollableNode$setScrollSemanticsActions$2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12) {
        MutatePriority mutatePriority = MutatePriority.UserInput;
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object scroll = scrollingLogic.scroll(mutatePriority, new SliderDraggableState$drag$2(dragGestureNode$startListeningForEvents$1, scrollingLogic, (Continuation) null, 21), dragGestureNode$startListeningForEvents$12);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (isAttached()) {
            Density density = DepthSortedSetKt.requireLayoutNode(this).density;
            DefaultFlingBehavior defaultFlingBehavior = this.defaultFlingBehavior;
            defaultFlingBehavior.getClass();
            defaultFlingBehavior.flingDecay = new DecayAnimationSpecImpl(new Extras.Key(density));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DepthSortedSetKt.requireLayoutNode(this).density);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.updateDensity(DepthSortedSetKt.requireLayoutNode(this).density);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            Density density = DepthSortedSetKt.requireLayoutNode(this).density;
            DefaultFlingBehavior defaultFlingBehavior = this.defaultFlingBehavior;
            defaultFlingBehavior.getClass();
            defaultFlingBehavior.flingDecay = new DecayAnimationSpecImpl(new Extras.Key(density));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DepthSortedSetKt.requireLayoutNode(this).density);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.updateDensity(DepthSortedSetKt.requireLayoutNode(this).density);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo192onDragStartedk4lQ0M(long j) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(DragEvent.DragStopped dragStopped) {
        JobKt.launch$default(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new VirtualCameraState$connect$2$1(dragStopped, this, null, 22), 3);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo161onKeyEventZmokQxo(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (this.enabled) {
            long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
            int i = Key.$r8$clinit;
            if ((Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m786getPageDownEK5gGoQ()) || Key.m771equalsimpl0(KeyEventType.m782getKeyZmokQxo(keyEvent), KeyEventType.m787getPageUpEK5gGoQ())) && KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 2) && !KeyEventType.m792isCtrlPressedZmokQxo(keyEvent)) {
                boolean z = this.scrollingLogic.orientation == Orientation.Vertical;
                ContentInViewNode contentInViewNode = this.contentInViewNode;
                if (z) {
                    int m195getViewportSizeOrZeroYbymL2g$foundation = (int) (contentInViewNode.m195getViewportSizeOrZeroYbymL2g$foundation() & BodyPartID.bodyIdMax);
                    floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Key.m771equalsimpl0(KeyEventType.m782getKeyZmokQxo(keyEvent), KeyEventType.m787getPageUpEK5gGoQ()) ? m195getViewportSizeOrZeroYbymL2g$foundation : -m195getViewportSizeOrZeroYbymL2g$foundation));
                } else {
                    int m195getViewportSizeOrZeroYbymL2g$foundation2 = (int) (contentInViewNode.m195getViewportSizeOrZeroYbymL2g$foundation() >> 32);
                    floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Key.m771equalsimpl0(KeyEventType.m782getKeyZmokQxo(keyEvent), KeyEventType.m787getPageUpEK5gGoQ()) ? m195getViewportSizeOrZeroYbymL2g$foundation2 : -m195getViewportSizeOrZeroYbymL2g$foundation2) << 32);
                }
                JobKt.launch$default(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, floatToRawIntBits, null, 0), 3);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        int i;
        List list = pointerEvent.changes;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.canDrag.invoke(PointerType.m827boximpl(((PointerInputChange) list.get(i2)).m818getTypeT8wyACA()))).booleanValue()) {
                super.mo162onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
                break;
            }
            i2++;
        }
        if (this.gestureNode == null) {
            GestureNode gestureNode = CanvasKt.gestureNode(this);
            delegate(gestureNode);
            this.gestureNode = gestureNode;
        }
        if (this.enabled) {
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            ScrollingLogic scrollingLogic = this.scrollingLogic;
            if (pointerEventPass == pointerEventPass2 && pointerEvent.f858type == 6) {
                if (this.mouseWheelScrollingLogic == null) {
                    this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(scrollingLogic, Draggable2DKt.platformScrollConfig(this), new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(this, 1), DepthSortedSetKt.requireLayoutNode(this).density);
                }
                MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
                if (mouseWheelScrollingLogic != null) {
                    mouseWheelScrollingLogic.startReceivingEvents(getCoroutineScope());
                }
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic2 != null) {
                mouseWheelScrollingLogic2.m228onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
            }
            if (pointerEventPass == pointerEventPass2 && ((i = pointerEvent.f858type) == 10 || i == 11 || i == 12)) {
                if (this.trackpadScrollingLogic == null) {
                    this.trackpadScrollingLogic = new TrackpadScrollingLogic(scrollingLogic, new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(this, 2), DepthSortedSetKt.requireLayoutNode(this).density);
                }
                TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
                if (trackpadScrollingLogic != null) {
                    trackpadScrollingLogic.startReceivingEvents(getCoroutineScope());
                }
            }
            TrackpadScrollingLogic trackpadScrollingLogic2 = this.trackpadScrollingLogic;
            if (trackpadScrollingLogic2 != null) {
                trackpadScrollingLogic2.m251onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo163onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        if (scrollingLogic.scrollableState.isScrollInProgress()) {
            return true;
        }
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = scrollingLogic.overscrollEffect;
        if (androidEdgeEffectOverscrollEffect == null) {
            return false;
        }
        EdgeEffectWrapper edgeEffectWrapper = androidEdgeEffectOverscrollEffect.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && CanvasKt.getDistanceCompat(edgeEffect) != RecyclerView.DECELERATION_RATE) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && CanvasKt.getDistanceCompat(edgeEffect2) != RecyclerView.DECELERATION_RATE) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && CanvasKt.getDistanceCompat(edgeEffect3) != RecyclerView.DECELERATION_RATE) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || CanvasKt.getDistanceCompat(edgeEffect4) == RecyclerView.DECELERATION_RATE) ? false : true;
    }

    public final void update(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.enabled != z) {
            this.nestedScrollConnection.enabled = z;
            z3 = true;
        } else {
            z3 = false;
        }
        FlingBehavior flingBehavior2 = flingBehavior == null ? this.defaultFlingBehavior : flingBehavior;
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        if (!Intrinsics.areEqual(scrollingLogic.scrollableState, scrollableState)) {
            scrollingLogic.scrollableState = scrollableState;
            z5 = true;
        }
        scrollingLogic.overscrollEffect = androidEdgeEffectOverscrollEffect;
        if (scrollingLogic.orientation != orientation) {
            scrollingLogic.orientation = orientation;
            z5 = true;
        }
        if (scrollingLogic.reverseDirection != z2) {
            scrollingLogic.reverseDirection = z2;
        } else {
            z4 = z5;
        }
        scrollingLogic.flingBehavior = flingBehavior2;
        scrollingLogic.nestedScrollDispatcher = this.nestedScrollDispatcher;
        ContentInViewNode contentInViewNode = this.contentInViewNode;
        contentInViewNode.orientation = orientation;
        contentInViewNode.reverseDirection = z2;
        contentInViewNode.bringIntoViewSpec = bringIntoViewSpec;
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.flingBehavior = flingBehavior;
        ScrollState$$ExternalSyntheticLambda4 scrollState$$ExternalSyntheticLambda4 = ScrollableKt.CanDragCalculation;
        Orientation orientation2 = scrollingLogic.orientation;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        update(scrollState$$ExternalSyntheticLambda4, z, mutableInteractionSourceImpl, orientation3, z4);
        if (z3) {
            this.scrollByAction = null;
            this.scrollByOffsetAction = null;
            DepthSortedSetKt.requireLayoutNode(this).invalidateSemantics$ui();
        }
    }
}
