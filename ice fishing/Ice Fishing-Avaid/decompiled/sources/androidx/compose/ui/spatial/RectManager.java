package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: RectManager.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u001f\u001a\u00020\u0016J5\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0016J\u0006\u0010,\u001a\u00020\u0016J\u000e\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0018J\u0006\u0010/\u001a\u00020\u0016J\u0016\u00100\u001a\u0004\u0018\u00010\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J:\u00102\u001a\u0002032\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001609J:\u0010;\u001a\u0002032\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001609J\u0010\u0010<\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u0001J\u000e\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004J\u001e\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u0018J\u000e\u0010C\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004J\u0015\u0010D\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FJ\f\u0010G\u001a\u00020\u0016*\u00020\u0004H\u0002J\u0010\u0010H\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004H\u0002J\u0010\u0010K\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004H\u0002J\u0014\u0010L\u001a\u00020\u0016*\u00020M2\u0006\u0010N\u001a\u00020JH\u0002J\f\u0010O\u001a\u00020\u0018*\u00020MH\u0002J\u0013\u0010P\u001a\u00020\"*\u00020\u0004H\u0002¢\u0006\u0004\bQ\u0010FJ\u000e\u0010R\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004J\u001d\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020'2\u0006\u0010U\u001a\u00020'H\u0000¢\u0006\u0002\bVJ7\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\u0006\u0010]\u001a\u00020'H\u0000¢\u0006\u0002\b^J1\u0010_\u001a\u00020\u0018*\u0002082\u0006\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'H\u0000¢\u0006\u0002\b`J\u0019\u0010a\u001a\u00020\u0018*\u00020\u00042\u0006\u0010b\u001a\u00020\u0004H\u0000¢\u0006\u0002\bcJ\u000e\u0010d\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "executeDelayed", "Landroidx/compose/ui/spatial/ExecuteDelayed;", "<init>", "(Landroidx/collection/IntObjectMap;Landroidx/compose/ui/spatial/ExecuteDelayed;)V", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "getThrottledCallbacks$ui$annotations", "()V", "getThrottledCallbacks$ui", "()Landroidx/compose/ui/spatial/ThrottledCallbacks;", "callbacks", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "", "isDirty", "", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "scheduledDispatchDeadline", "", "dispatchLambda", "invalidate", "updateOffsets", "screenOffset", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "windowWidth", "", "windowHeight", "updateOffsets-gTq6Wqs", "(JJ[FII)V", "resetOffsets", "dispatchCallbacks", "scheduleDebounceCallback", "ensureSomethingScheduled", "removeScheduledCallback", "registerOnChangedCallback", "callback", "registerOnRectChangedCallback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "id", "throttleMillis", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "registerOnGlobalLayoutCallback", "unregisterOnChangedCallback", "token", "invalidateCallbacksFor", "layoutNode", "updateFlagsFor", "focusable", "gesturable", "recalculateRectIfDirty", "getOffsetFromRectListFor", "getOffsetFromRectListFor-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "resetHasPositionalLayerTransformationsForSubtreeIfNeeded", "insertOrUpdateTransformedNodeSubhierarchy", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "insertOrUpdateTransformedNode", "boundingRectInRoot", "Landroidx/compose/ui/node/NodeCoordinator;", "rect", "hasPositionalLayerTransformations", "outerToInnerOffset", "outerToInnerOffset-Bjo55l4", "remove", "isTargetDrawnFirst", "targetId", "otherId", "isTargetDrawnFirst$ui", "findFocusableNodeFromRect", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "left", "top", "right", "bottom", "containerId", "findFocusableNodeFromRect$ui", "intersects", "intersects$ui", "isDescendantOf", "container", "isDescendantOf$ui", "unsetHasCallbacksFor", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<Function0<Unit>> callbacks;
    private final Function0<Unit> dispatchLambda;
    private Object dispatchToken;
    private final ExecuteDelayed executeDelayed;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getThrottledCallbacks$ui$annotations() {
    }

    public RectManager(IntObjectMap<LayoutNode> intObjectMap, ExecuteDelayed executeDelayed) {
        this.layoutNodes = intObjectMap;
        this.executeDelayed = executeDelayed;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RectManager.this.dispatchToken = null;
                RectManager rectManager = RectManager.this;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, ExecuteDelayUsingPostAndRemove executeDelayUsingPostAndRemove, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap, (i & 2) != 0 ? ExecuteDelayUsingPostAndRemove.INSTANCE : executeDelayUsingPostAndRemove);
    }

    public final RectList getRects() {
        return this.rects;
    }

    /* renamed from: getThrottledCallbacks$ui, reason: from getter */
    public final ThrottledCallbacks getThrottledCallbacks() {
        return this.throttledCallbacks;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    /* renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m8905updateOffsetsgTq6Wqs(long screenOffset, long windowOffset, float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int m8908analyzeComponents58bKbWc;
        m8908analyzeComponents58bKbWc = RectManagerKt.m8908analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((m8908analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m8922updateOffsetsLDcG7Xg(screenOffset, windowOffset, viewToWindowMatrix, windowWidth, windowHeight) || this.isScreenOrWindowDirty;
    }

    public final void resetOffsets() {
        this.isScreenOrWindowDirty = this.throttledCallbacks.m8922updateOffsetsLDcG7Xg(IntOffset.INSTANCE.m9875getZeronOccac(), IntOffset.INSTANCE.m9875getZeronOccac(), null, 0, 0);
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long currentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            MutableObjectList<Function0<Unit>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(33554431 & ((int) j), jArr[i4], jArr[i4 + 1], currentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(currentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(currentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(currentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                this.executeDelayed.removeDelayedExecution(obj);
            }
            long currentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
            long max = Math.max(minDebounceDeadline, 16 + currentTimeMillis);
            this.scheduledDispatchDeadline = max;
            this.dispatchToken = this.executeDelayed.executeDelayed(max - currentTimeMillis, this.dispatchLambda);
        }
    }

    public final void removeScheduledCallback() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.removeDelayedExecution(obj);
            this.dispatchToken = null;
        }
    }

    public final Object registerOnChangedCallback(Function0<Unit> callback) {
        this.callbacks.add(callback);
        return callback;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        DelegatableNode.RegistrationHandle registerOnRectChanged = this.throttledCallbacks.registerOnRectChanged(id, throttleMillis, debounceMillis, node, callback);
        if (DelegatableNodeKt.requireLayoutNode(node.getNode()).getAddedToRectList()) {
            this.rects.updateHasCallbacks(id, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registerOnRectChanged;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return this.throttledCallbacks.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void unregisterOnChangedCallback(Object token) {
        if ((TypeIntrinsics.isFunctionOfArity(token, 0) ? (Function0) token : null) == null) {
            return;
        }
        this.callbacks.remove(token);
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.isDirty = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final void updateFlagsFor(LayoutNode layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    public final void recalculateRectIfDirty(LayoutNode layoutNode) {
        long m9874getMaxnOccac;
        boolean m8909isSetgyyYBs;
        if (layoutNode.isPlaced() && layoutNode.getRectInParentDirty()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui != null && !parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                if (parent$ui.getOuterToInnerOffsetDirty()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m8526setOuterToInnerOffsetgyyYBs$ui(m8903outerToInnerOffsetBjo55l4(parent$ui));
                }
                m9874getMaxnOccac = parent$ui.getOuterToInnerOffset();
            } else if (parent$ui == null) {
                m9874getMaxnOccac = IntOffset.INSTANCE.m9875getZeronOccac();
            } else {
                m9874getMaxnOccac = IntOffset.INSTANCE.m9874getMaxnOccac();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            m8909isSetgyyYBs = RectManagerKt.m8909isSetgyyYBs(m9874getMaxnOccac);
            if (m8909isSetgyyYBs && !hasPositionalLayerTransformations(outerCoordinator$ui)) {
                if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                    long m9868plusqkQi6aY = IntOffset.m9868plusqkQi6aY(m9874getMaxnOccac, outerCoordinator$ui.getPosition());
                    MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                    int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                    int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                    int semanticsId = layoutNode.getSemanticsId();
                    if (!layoutNode.getAddedToRectList()) {
                        layoutNode.setAddedToRectList$ui(true);
                        boolean m8572hasH91voCI$ui = layoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(1024));
                        boolean m8572hasH91voCI$ui2 = layoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(16));
                        boolean containsKey = this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId);
                        if (parent$ui != null) {
                            this.rects.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m9864getXimpl(m9868plusqkQi6aY), IntOffset.m9865getYimpl(m9868plusqkQi6aY), measuredWidth, measuredHeight, m8572hasH91voCI$ui, m8572hasH91voCI$ui2, containsKey);
                        } else {
                            RectList.insert$default(this.rects, semanticsId, IntOffset.m9864getXimpl(m9868plusqkQi6aY), IntOffset.m9865getYimpl(m9868plusqkQi6aY), IntOffset.m9864getXimpl(m9868plusqkQi6aY) + measuredWidth, IntOffset.m9865getYimpl(m9868plusqkQi6aY) + measuredHeight, 0, m8572hasH91voCI$ui, m8572hasH91voCI$ui2, containsKey, 0, 544, null);
                        }
                    } else if (parent$ui != null) {
                        this.rects.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m9864getXimpl(m9868plusqkQi6aY), IntOffset.m9865getYimpl(m9868plusqkQi6aY), measuredWidth, measuredHeight);
                    } else {
                        this.rects.move(semanticsId, IntOffset.m9864getXimpl(m9868plusqkQi6aY), IntOffset.m9865getYimpl(m9868plusqkQi6aY), IntOffset.m9864getXimpl(m9868plusqkQi6aY) + measuredWidth, IntOffset.m9865getYimpl(m9868plusqkQi6aY) + measuredHeight);
                    }
                } else {
                    insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                    resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
                }
            } else {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
            }
            layoutNode.setRectInParentDirty$ui(false);
            invalidate();
            scheduleDebounceCallback(true);
        }
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m8904getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        if (this.rects.getTopLeft(layoutNode.getSemanticsId()) == Long.MAX_VALUE) {
            return IntOffset.INSTANCE.m9874getMaxnOccac();
        }
        return IntOffset.m9858constructorimpl((((int) (r0 >> 32)) << 32) | (((int) r0) & 4294967295L));
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty()) {
            layoutNode.m8526setOuterToInnerOffsetgyyYBs$ui(m8903outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m9863equalsimpl0(layoutNode.getOuterToInnerOffset(), IntOffset.INSTANCE.m9874getMaxnOccac())) {
            return;
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNodeArr[i]);
        }
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList = layoutNode.getAddedToRectList();
        layoutNode.setAddedToRectList$ui(true);
        if (!addedToRectList || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui != null ? parent$ui.getSemanticsId() : -1, layoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(1024)), layoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(16)), this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId), 0, 512, null);
        }
        layoutNode.setRectInParentDirty$ui(false);
        invalidate();
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long m8904getOffsetFromRectListForBjo55l4 = m8904getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m9863equalsimpl0(m8904getOffsetFromRectListForBjo55l4, IntOffset.INSTANCE.m9874getMaxnOccac())) {
                    float m9864getXimpl = IntOffset.m9864getXimpl(m8904getOffsetFromRectListForBjo55l4);
                    float m9865getYimpl = IntOffset.m9865getYimpl(m8904getOffsetFromRectListForBjo55l4);
                    mutableRect.m6504translatek4lQ0M(Offset.m6511constructorimpl((Float.floatToRawIntBits(m9865getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m9864getXimpl) << 32)));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] mo8669getUnderlyingMatrixsQKQjiQ = layer.mo8669getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m7066isIdentity58bKbWc(mo8669getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m7049mapimpl(mo8669getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long position = nodeCoordinator.getPosition();
            float m9864getXimpl2 = IntOffset.m9864getXimpl(position);
            float m9865getYimpl2 = IntOffset.m9865getYimpl(position);
            mutableRect.m6504translatek4lQ0M(Offset.m6511constructorimpl((Float.floatToRawIntBits(m9865getYimpl2) & 4294967295L) | (Float.floatToRawIntBits(m9864getXimpl2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m7066isIdentity58bKbWc(layer.mo8669getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m8903outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long m9875getZeronOccac = IntOffset.INSTANCE.m9875getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.INSTANCE.m9874getMaxnOccac();
            }
            m9875getZeronOccac = IntOffset.m9868plusqkQi6aY(m9875getZeronOccac, innerCoordinator$ui.getPosition());
        }
        return m9875getZeronOccac;
    }

    public final void remove(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            layoutNode.setRectInParentDirty$ui(true);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final boolean isTargetDrawnFirst$ui(int targetId, int otherId) {
        LayoutNode layoutNode;
        LayoutNode parent$ui;
        LayoutNode layoutNode2 = this.layoutNodes.get(targetId);
        if (layoutNode2 != null && (layoutNode = this.layoutNodes.get(otherId)) != null && layoutNode2.getDepth() != 0 && layoutNode.getDepth() != 0) {
            while (layoutNode2.getDepth() > layoutNode.getDepth()) {
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode2 == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            while (layoutNode.getDepth() > layoutNode2.getDepth()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            LayoutNode layoutNode3 = layoutNode;
            LayoutNode layoutNode4 = layoutNode3;
            LayoutNode layoutNode5 = layoutNode2;
            while (layoutNode2 != layoutNode3) {
                LayoutNode parent$ui2 = layoutNode2.getParent$ui();
                if (parent$ui2 == null || (parent$ui = layoutNode3.getParent$ui()) == null) {
                    return false;
                }
                layoutNode5 = layoutNode2;
                layoutNode2 = parent$ui2;
                layoutNode4 = layoutNode3;
                layoutNode3 = parent$ui;
            }
            if (layoutNode5.getMeasurePassDelegate$ui().getZIndex() == layoutNode4.getMeasurePassDelegate$ui().getZIndex()) {
                return layoutNode5.getPlaceOrder$ui() < layoutNode4.getPlaceOrder$ui();
            }
            if (layoutNode5.getMeasurePassDelegate$ui().getZIndex() < layoutNode4.getMeasurePassDelegate$ui().getZIndex()) {
                return true;
            }
        }
        return false;
    }

    public final FocusTargetModifierNode findFocusableNodeFromRect$ui(int left, int top, int right, int bottom, int containerId) {
        int i;
        LayoutNode layoutNode;
        char c;
        Modifier.Node node;
        int i2;
        LayoutNode layoutNode2;
        boolean z;
        int i3;
        LayoutNode layoutNode3;
        int i4;
        MutableVector mutableVector;
        SemanticsInfo requireSemanticsInfo;
        RectManager rectManager = this;
        LayoutNode layoutNode4 = rectManager.layoutNodes.get(containerId);
        if (layoutNode4 == null) {
            return null;
        }
        FocusTargetNode activeFocusTargetNode = LayoutNodeKt.requireOwner(layoutNode4).getFocusOwner().getActiveFocusTargetNode();
        int semanticsId = (activeFocusTargetNode == null || (requireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(activeFocusTargetNode)) == null) ? -1 : requireSemanticsInfo.getSemanticsId();
        RectList rectList = rectManager.rects;
        int i5 = top;
        long j = (i5 & 4294967295L) | (left << 32);
        long j2 = (bottom & 4294967295L) | (right << 32);
        long[] jArr = rectList.items;
        int i6 = rectList.itemsSize;
        int i7 = Integer.MAX_VALUE;
        FocusTargetNode focusTargetNode = null;
        int i8 = 0;
        while (i8 < jArr.length - 2 && i8 < i6) {
            int i9 = i8;
            long j3 = jArr[i8 + 2];
            boolean z2 = true;
            if ((((int) (j3 >> 61)) & 1) != 0) {
                if (((((j2 - jArr[i9]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i9 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    int i10 = ((int) j3) & 33554431;
                    LayoutNode layoutNode5 = rectManager.layoutNodes.get(i10);
                    if (layoutNode5 != null) {
                        if (semanticsId == i10) {
                            c = 65535;
                            if (semanticsId != -1) {
                                return null;
                            }
                        } else {
                            c = 65535;
                        }
                        if (layoutNode5.getDepth() >= i7 || !rectManager.isDescendantOf$ui(layoutNode5, layoutNode4)) {
                            i = i7;
                            layoutNode = layoutNode4;
                        } else {
                            NodeChain nodes = layoutNode5.getNodes();
                            int m8612constructorimpl = NodeKind.m8612constructorimpl(1024);
                            if ((nodes.getAggregateChildKindSet() & m8612constructorimpl) != 0) {
                                Modifier.Node head = nodes.getHead();
                                while (head != null) {
                                    if ((head.getKindSet() & m8612constructorimpl) != 0) {
                                        MutableVector mutableVector2 = null;
                                        node = head;
                                        while (node != null) {
                                            if (node instanceof FocusTargetNode) {
                                                i = i7;
                                                layoutNode = layoutNode4;
                                                break;
                                            }
                                            if ((node.getKindSet() & m8612constructorimpl) == 0 || !(node instanceof DelegatingNode)) {
                                                i2 = i7;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                            } else {
                                                Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                                int i11 = 0;
                                                while (delegate != null) {
                                                    if ((delegate.getKindSet() & m8612constructorimpl) != 0) {
                                                        i11++;
                                                        i3 = i7;
                                                        if (i11 == 1) {
                                                            node = delegate;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                i4 = i11;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                i4 = i11;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = mutableVector2;
                                                            }
                                                            if (node != null) {
                                                                if (mutableVector != null) {
                                                                    mutableVector.add(node);
                                                                }
                                                                node = null;
                                                            }
                                                            if (mutableVector != null) {
                                                                mutableVector.add(delegate);
                                                            }
                                                            mutableVector2 = mutableVector;
                                                            i11 = i4;
                                                            delegate = delegate.getChild();
                                                            i7 = i3;
                                                            layoutNode4 = layoutNode3;
                                                        }
                                                    } else {
                                                        i3 = i7;
                                                    }
                                                    layoutNode3 = layoutNode4;
                                                    delegate = delegate.getChild();
                                                    i7 = i3;
                                                    layoutNode4 = layoutNode3;
                                                }
                                                i2 = i7;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                                if (i11 == 1) {
                                                    z2 = z;
                                                    i7 = i2;
                                                    layoutNode4 = layoutNode2;
                                                }
                                            }
                                            node = DelegatableNodeKt.pop(mutableVector2);
                                            z2 = z;
                                            i7 = i2;
                                            layoutNode4 = layoutNode2;
                                        }
                                    }
                                    i = i7;
                                    boolean z3 = z2;
                                    layoutNode = layoutNode4;
                                    if ((head.getAggregateChildKindSet() & m8612constructorimpl) == 0) {
                                        break;
                                    }
                                    head = head.getChild();
                                    z2 = z3;
                                    i7 = i;
                                    layoutNode4 = layoutNode;
                                }
                            }
                            i = i7;
                            layoutNode = layoutNode4;
                            node = null;
                            FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                            if (focusTargetNode2 != null) {
                                if (intersects$ui(focusTargetNode2, left, i5, right, bottom)) {
                                    i7 = layoutNode5.getDepth();
                                    focusTargetNode = focusTargetNode2;
                                    i8 = i9 + 3;
                                    rectManager = this;
                                    i5 = top;
                                    layoutNode4 = layoutNode;
                                }
                            }
                        }
                        i7 = i;
                        i8 = i9 + 3;
                        rectManager = this;
                        i5 = top;
                        layoutNode4 = layoutNode;
                    } else {
                        i = i7;
                        layoutNode = layoutNode4;
                    }
                    i7 = i;
                    i8 = i9 + 3;
                    rectManager = this;
                    i5 = top;
                    layoutNode4 = layoutNode;
                }
            }
            i = i7;
            layoutNode = layoutNode4;
            i7 = i;
            i8 = i9 + 3;
            rectManager = this;
            i5 = top;
            layoutNode4 = layoutNode;
        }
        return focusTargetNode;
    }

    public final boolean isDescendantOf$ui(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int depth = layoutNode.getDepth() - layoutNode2.getDepth();
        if (depth <= 0) {
            return false;
        }
        for (int i = 0; i < depth; i++) {
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        }
        return layoutNode == layoutNode2;
    }

    public final void unsetHasCallbacksFor(LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public final boolean intersects$ui(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        NodeCoordinator m8465requireCoordinator64DMado = DelegatableNodeKt.m8465requireCoordinator64DMado(delegatableNode, NodeKind.m8612constructorimpl(1024));
        LayoutNode layoutNode = m8465requireCoordinator64DMado.getLayoutNode();
        if (Intrinsics.areEqual(m8465requireCoordinator64DMado, layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long mo8290localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo8290localToRootMKHz9U(LayoutCoordinates.CC.m8307localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), m8465requireCoordinator64DMado, 0L, false, 6, null));
        long mo8287getSizeYbymL2g = m8465requireCoordinator64DMado.mo8287getSizeYbymL2g();
        int round = Math.round(Float.intBitsToFloat((int) (mo8290localToRootMKHz9U >> 32)));
        int i5 = ((int) (mo8287getSizeYbymL2g >> 32)) + round;
        int round2 = Math.round(Float.intBitsToFloat((int) (mo8290localToRootMKHz9U & 4294967295L)));
        return i < i5 && i3 > round && i2 < ((int) (mo8287getSizeYbymL2g & 4294967295L)) + round2 && i4 > round2;
    }
}
