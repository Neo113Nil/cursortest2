package androidx.compose.ui.node;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.OnVisibilityChangedNode;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.datadog.android.Datadog$getInstance$1$1;
import com.google.android.gms.dynamite.zzg;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public NodeCoordinator$drawBlock$1 _drawBlock;
    public MeasureResult _measureResult;
    public MutableRect _rectCache;
    public Canvas drawBlockCanvas;
    public GraphicsLayer drawBlockParentLayer;
    public GraphicsLayer explicitLayer;
    public boolean forceMeasureWithLookaheadConstraints;
    public boolean forcePlaceWithLookaheadOffset;
    public boolean isClipping;
    public boolean lastClip;
    public boolean lastLayerDrawingWasSkipped;
    public OwnedLayer layer;
    public Function1 layerBlock;
    public Density layerDensity;
    public LayoutDirection layerLayoutDirection;
    public LayerPositionalProperties layerPositionalProperties;
    public final LayoutNode layoutNode;
    public MutableObjectIntMap oldAlignmentLines;
    public boolean released;
    public boolean wasLayerBlockInvoked;
    public NodeCoordinator wrapped;
    public NodeCoordinator wrappedBy;
    public float zIndex;
    public static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    public static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    public static final float[] tmpMatrix = Matrix.m699constructorimpl$default();
    public static final NodeCoordinator$Companion$PointerInputSource$1 PointerInputSource = new NodeCoordinator$Companion$PointerInputSource$1();
    public static final NodeCoordinator$Companion$SemanticsSource$1 SemanticsSource = new NodeCoordinator$Companion$SemanticsSource$1();
    public float lastLayerAlpha = 0.8f;
    public long position = 0;
    public Shape lastShape = ColorKt.RectangleShape;
    public final NodeCoordinator$invalidateParentLayer$1 invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this, 0);

    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo905childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z);

        /* renamed from: entityType-OLwlOKw */
        int mo906entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode);

        default boolean shouldHitTest(Modifier.Node node) {
            return true;
        }

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        this.layerDensity = layoutNode.density;
        this.layerLayoutDirection = layoutNode.layoutDirection;
    }

    public static NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator nodeCoordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (nodeCoordinator = lookaheadLayoutCoordinates.lookaheadDelegate.coordinator) != null) {
            return nodeCoordinator;
        }
        layoutCoordinates.getClass();
        return (NodeCoordinator) layoutCoordinates;
    }

    public final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        long j = this.position;
        float f = (int) (j >> 32);
        mutableRect.left -= f;
        mutableRect.right -= f;
        float f2 = (int) (j & BodyPartID.bodyIdMax);
        mutableRect.top -= f2;
        mutableRect.bottom -= f2;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
            float[] m933getInverseMatrix3i98HWw = graphicsLayerOwnerLayer.m933getInverseMatrix3i98HWw();
            if (!graphicsLayerOwnerLayer.isIdentity) {
                if (m933getInverseMatrix3i98HWw == null) {
                    mutableRect.left = RecyclerView.DECELERATION_RATE;
                    mutableRect.top = RecyclerView.DECELERATION_RATE;
                    mutableRect.right = RecyclerView.DECELERATION_RATE;
                    mutableRect.bottom = RecyclerView.DECELERATION_RATE;
                } else {
                    Matrix.m701mapimpl(m933getInverseMatrix3i98HWw, mutableRect);
                }
            }
            if (this.isClipping && z) {
                long j2 = this.measuredSize;
                mutableRect.intersect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax));
            }
        }
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    public final long m890ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j, boolean z) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) ? m893fromParentPosition8S9VItk(j, z) : m893fromParentPosition8S9VItk(nodeCoordinator2.m890ancestorToLocalS_NoaFU(nodeCoordinator, j, z), z);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m891calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - getMeasuredWidth();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - getMeasuredHeight();
        float max = Math.max(RecyclerView.DECELERATION_RATE, intBitsToFloat / 2.0f);
        float max2 = Math.max(RecyclerView.DECELERATION_RATE, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m892distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j2 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
            return Float.POSITIVE_INFINITY;
        }
        long m891calculateMinimumTouchTargetPaddingE7KxVPU = m891calculateMinimumTouchTargetPaddingE7KxVPU(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (m891calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m891calculateMinimumTouchTargetPaddingE7KxVPU & BodyPartID.bodyIdMax));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(RecyclerView.DECELERATION_RATE, intBitsToFloat3 < RecyclerView.DECELERATION_RATE ? -intBitsToFloat3 : intBitsToFloat3 - getMeasuredWidth());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) < RecyclerView.DECELERATION_RATE ? -r8 : r8 - getMeasuredHeight())) & BodyPartID.bodyIdMax);
        if ((intBitsToFloat > RecyclerView.DECELERATION_RATE || intBitsToFloat2 > RecyclerView.DECELERATION_RATE) && Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)) <= intBitsToFloat2) {
            return Offset.m624getDistanceSquaredimpl(floatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            long j = this.position;
            float f = (int) (j >> 32);
            float f2 = (int) (j & BodyPartID.bodyIdMax);
            canvas.translate(f, f2);
            drawContainedDrawModifiers(canvas, graphicsLayer);
            canvas.translate(-f, -f2);
            return;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
        CanvasDrawScope canvasDrawScope = graphicsLayerOwnerLayer.scope;
        graphicsLayerOwnerLayer.updateDisplayList();
        graphicsLayerOwnerLayer.drawnWithEnabledZ = graphicsLayerOwnerLayer.graphicsLayer.impl.shadowElevation > RecyclerView.DECELERATION_RATE;
        GrpcMethod grpcMethod = canvasDrawScope.drawContext;
        grpcMethod.setCanvas(canvas);
        grpcMethod.requestAdapter = graphicsLayer;
        SizeKt.drawLayer(canvasDrawScope, graphicsLayerOwnerLayer.graphicsLayer);
    }

    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator;
        Canvas canvas2;
        GraphicsLayer graphicsLayer2;
        Modifier.Node m895headH91voCI = m895headH91voCI(4);
        if (m895headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
            return;
        }
        LayoutNode layoutNode = this.layoutNode;
        layoutNode.getClass();
        LayoutNodeDrawScope layoutNodeDrawScope = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).sharedDrawScope;
        long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(this.measuredSize);
        layoutNodeDrawScope.getClass();
        MutableVector mutableVector = null;
        while (m895headH91voCI != null) {
            if (m895headH91voCI instanceof DrawModifierNode) {
                nodeCoordinator = this;
                canvas2 = canvas;
                graphicsLayer2 = graphicsLayer;
                layoutNodeDrawScope.m874drawDirecteZhPAX0$ui(canvas2, m3991toSizeozmzZPI, nodeCoordinator, (DrawModifierNode) m895headH91voCI, graphicsLayer2);
            } else {
                nodeCoordinator = this;
                canvas2 = canvas;
                graphicsLayer2 = graphicsLayer;
                if ((m895headH91voCI.getKindSet$ui() & 4) != 0 && (m895headH91voCI instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node node = ((DelegatingNode) m895headH91voCI).delegate; node != null; node = node.getChild$ui()) {
                        if ((node.getKindSet$ui() & 4) != 0) {
                            i++;
                            if (i == 1) {
                                m895headH91voCI = node;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                }
                                if (m895headH91voCI != null) {
                                    mutableVector.add(m895headH91voCI);
                                    m895headH91voCI = null;
                                }
                                mutableVector.add(node);
                            }
                        }
                    }
                    if (i == 1) {
                        canvas = canvas2;
                        this = nodeCoordinator;
                        graphicsLayer = graphicsLayer2;
                    }
                }
            }
            m895headH91voCI = DepthSortedSetKt.access$pop(mutableVector);
            canvas = canvas2;
            this = nodeCoordinator;
            graphicsLayer = graphicsLayer2;
        }
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final NodeCoordinator findCommonAncestor$ui(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.layoutNode;
        LayoutNode layoutNode2 = this.layoutNode;
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui = tail2.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & 2) != 0 && parent$ui == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.depth > layoutNode2.depth) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode.getClass();
        }
        LayoutNode layoutNode3 = layoutNode2;
        while (layoutNode3.depth > layoutNode.depth) {
            layoutNode3 = layoutNode3.getParent$ui();
            layoutNode3.getClass();
        }
        while (layoutNode != layoutNode3) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode3 = layoutNode3.getParent$ui();
            if (layoutNode == null || layoutNode3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNode3 != layoutNode2) {
            if (layoutNode != nodeCoordinator.layoutNode) {
                return (InnerNodeCoordinator) layoutNode.nodes.innerCoordinator;
            }
            return nodeCoordinator;
        }
        return this;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public final long m893fromParentPosition8S9VItk(long j, boolean z) {
        if (z || !this.isPlacedUnderMotionFrameOfReference) {
            long j2 = this.position;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - ((int) (j2 & BodyPartID.bodyIdMax));
            j = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
            float[] m933getInverseMatrix3i98HWw = graphicsLayerOwnerLayer.m933getInverseMatrix3i98HWw();
            if (m933getInverseMatrix3i98HWw == null) {
                return 9187343241974906880L;
            }
            if (!graphicsLayerOwnerLayer.isIdentity) {
                return Matrix.m700mapMKHz9U(j, m933getInverseMatrix3i98HWw);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.layoutNode.density.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.layoutNode.density.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.layoutNode.layoutDirection;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m894getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo237toSizeXkaWNTQ(this.layoutNode.viewConfiguration.mo873getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        LayoutNode layoutNode = this.layoutNode;
        if (!layoutNode.nodes.m889hasH91voCI$ui(64)) {
            return null;
        }
        getTail();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Modifier.Node node = (TailModifierNode) layoutNode.nodes.tail; node != null; node = node.getParent$ui()) {
            if ((node.getKindSet$ui() & 64) != 0) {
                DelegatingNode delegatingNode = node;
                ?? r5 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        ref$ObjectRef.element = ((ParentDataModifierNode) delegatingNode).modifyParentData(layoutNode.density, ref$ObjectRef.element);
                    } else if ((delegatingNode.getKindSet$ui() & 64) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNode.delegate;
                        int i = 0;
                        delegatingNode = delegatingNode;
                        r5 = r5;
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    delegatingNode = node2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new MutableVector(0, new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r5.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r5.add(node2);
                                }
                            }
                            node2 = node2.getChild$ui();
                            delegatingNode = delegatingNode;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DepthSortedSetKt.access$pop(r5);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        boolean isAttached = isAttached();
        LayoutNode layoutNode = this.layoutNode;
        if (!isAttached) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNode2 = layoutNode; layoutNode2 != null; layoutNode2 = layoutNode2.getParent$ui()) {
                sb.append("\n|");
                sb.append(layoutNode2);
                sb.append(" isAttached=");
                sb.append(layoutNode2.isAttached());
                sb.append(" modifier=");
                sb.append(layoutNode2._modifier);
                sb.append(" tail=");
                sb.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        onCoordinatesUsed$ui();
        return ((NodeCoordinator) layoutNode.nodes.outerCoordinator).wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public final long mo879getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo838getSizeYbymL2g() {
        return this.measuredSize;
    }

    public abstract Modifier.Node getTail();

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m895headH91voCI(int i) {
        boolean m907getIncludeSelfInTraversalH91voCI = NodeKindKt.m907getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m907getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m907getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & i) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & i) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        NodeChain nodeChain = this.layoutNode.nodes;
        if (((NodeCoordinator) nodeChain.outerCoordinator) == this) {
            return (Modifier.Node) nodeChain.head;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (!z) {
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    public final void m896hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        long DistanceAndFlags;
        if (node == null) {
            mo871hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m896hit5ShdDok(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        MutableObjectList mutableObjectList = hitTestResult.values;
        hitTestResult.removeNodesInRange(i2 + 1, mutableObjectList._size);
        hitTestResult.hitDepth++;
        mutableObjectList.add(node);
        MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z, false);
        mutableLongList.add(DistanceAndFlags);
        m896hit5ShdDok(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z);
        hitTestResult.hitDepth = i2;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    public final void m897hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        long DistanceAndFlags;
        if (node == null) {
            mo871hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m897hitNearFh5PU_I(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        MutableObjectList mutableObjectList = hitTestResult.values;
        hitTestResult.removeNodesInRange(i2 + 1, mutableObjectList._size);
        hitTestResult.hitDepth++;
        mutableObjectList.add(node);
        MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
        mutableLongList.add(DistanceAndFlags);
        m899outOfBoundsHit8NAm7pk(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f, true);
        hitTestResult.hitDepth = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (androidx.compose.ui.node.DistanceAndFlags.m865compareTo9YPOF3E(r18.m870findBestHitDistancefn2tFes(), r9) > 0) goto L39;
     */
    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m898hitTestqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        boolean z2;
        boolean z3;
        long DistanceAndFlags;
        long DistanceAndFlags2;
        Modifier.Node m895headH91voCI = m895headH91voCI(hitTestSource.mo906entityTypeOLwlOKw());
        if (!m904withinLayerBoundsk4lQ0M(j)) {
            if (PointerType.m828equalsimpl0(i, 1)) {
                float m892distanceInMinimumTouchTargettz77jQw = m892distanceInMinimumTouchTargettz77jQw(j, m894getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(m892distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) < 2139095040) {
                    if (hitTestResult.hitDepth != hitTestResult.values._size - 1) {
                        DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(m892distanceInMinimumTouchTargettz77jQw, false, false);
                        if (DistanceAndFlags.m865compareTo9YPOF3E(hitTestResult.m870findBestHitDistancefn2tFes(), DistanceAndFlags2) <= 0) {
                            return;
                        }
                    }
                    m897hitNearFh5PU_I(m895headH91voCI, hitTestSource, j, hitTestResult, i, false, m892distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (m895headH91voCI == null) {
            mo871hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        if (intBitsToFloat >= RecyclerView.DECELERATION_RATE && intBitsToFloat2 >= RecyclerView.DECELERATION_RATE && intBitsToFloat < getMeasuredWidth() && intBitsToFloat2 < getMeasuredHeight()) {
            m896hit5ShdDok(m895headH91voCI, hitTestSource, j, hitTestResult, i, z);
            return;
        }
        float m892distanceInMinimumTouchTargettz77jQw2 = !PointerType.m828equalsimpl0(i, 1) ? Float.POSITIVE_INFINITY : m892distanceInMinimumTouchTargettz77jQw(j, m894getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(m892distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            if (hitTestResult.hitDepth == hitTestResult.values._size - 1) {
                z2 = z;
            } else {
                z2 = z;
                DistanceAndFlags = HitTestResultKt.DistanceAndFlags(m892distanceInMinimumTouchTargettz77jQw2, z2, false);
            }
            z3 = true;
            m899outOfBoundsHit8NAm7pk(m895headH91voCI, hitTestSource, j, hitTestResult, i, z2, m892distanceInMinimumTouchTargettz77jQw2, z3);
        }
        z2 = z;
        z3 = false;
        m899outOfBoundsHit8NAm7pk(m895headH91voCI, hitTestSource, j, hitTestResult, i, z2, m892distanceInMinimumTouchTargettz77jQw2, z3);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo871hitTestChildqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m898hitTestqzLsGqo(hitTestSource, nodeCoordinator.m893fromParentPosition8S9VItk(j, true), hitTestResult, i, z);
        }
    }

    public final void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ((GraphicsLayerOwnerLayer) ownedLayer).invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        return getTail().isAttached();
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= RecyclerView.DECELERATION_RATE) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !this.layoutNode.isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            mutableRect = new MutableRect();
            this._rectCache = mutableRect;
        }
        mutableRect.left = RecyclerView.DECELERATION_RATE;
        mutableRect.top = RecyclerView.DECELERATION_RATE;
        mutableRect.right = (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32);
        mutableRect.bottom = (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
        while (coordinator != findCommonAncestor$ui) {
            coordinator.rectInParent$ui(mutableRect, z, false);
            if (mutableRect.isEmpty()) {
                return Rect.Zero;
            }
            coordinator = coordinator.wrappedBy;
            coordinator.getClass();
        }
        ancestorToLocal(findCommonAncestor$ui, mutableRect, z);
        return new Rect(mutableRect.left, mutableRect.top, mutableRect.right, mutableRect.bottom);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public final long mo839localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo840localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public final long mo840localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
            lookaheadLayoutCoordinates.lookaheadDelegate.coordinator.onCoordinatesUsed$ui();
            return lookaheadLayoutCoordinates.mo840localPositionOfS_NoaFU(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != findCommonAncestor$ui) {
            OwnedLayer ownedLayer = coordinator.layer;
            if (ownedLayer != null) {
                GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
                float[] m934getMatrixsQKQjiQ = graphicsLayerOwnerLayer.m934getMatrixsQKQjiQ();
                if (!graphicsLayerOwnerLayer.isIdentity) {
                    j = Matrix.m700mapMKHz9U(j, m934getMatrixsQKQjiQ);
                }
            }
            if (z || !coordinator.isPlacedUnderMotionFrameOfReference) {
                j = PlatformKt.m1340plusNvtHpc(j, coordinator.position);
            }
            coordinator = coordinator.wrappedBy;
            coordinator.getClass();
        }
        return m890ancestorToLocalS_NoaFU(findCommonAncestor$ui, j, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public final long mo841localToRootMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        onCoordinatesUsed$ui();
        while (this != null) {
            LayoutNode layoutNode = this.layoutNode;
            if (this == ((NodeCoordinator) layoutNode.nodes.outerCoordinator) && !layoutNode.hasPositionalLayerTransformationsInOffsetFromRoot) {
                long m952getOffsetFromRectListForBjo55l4 = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).rectManager.m952getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m1047equalsimpl0(m952getOffsetFromRectListForBjo55l4, 9223372034707292159L)) {
                    return PlatformKt.m1340plusNvtHpc(j, m952getOffsetFromRectListForBjo55l4);
                }
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
                float[] m934getMatrixsQKQjiQ = graphicsLayerOwnerLayer.m934getMatrixsQKQjiQ();
                if (!graphicsLayerOwnerLayer.isIdentity) {
                    j = Matrix.m700mapMKHz9U(j, m934getMatrixsQKQjiQ);
                }
            }
            j = PlatformKt.m1340plusNvtHpc(j, this.position);
            this = this.wrappedBy;
        }
        return j;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo842localToScreenMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) LayoutNodeKt.requireOwner(this.layoutNode)).m916localToScreenMKHz9U(mo841localToRootMKHz9U(j));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public final long mo843localToWindowMKHz9U(long j) {
        long mo841localToRootMKHz9U = mo841localToRootMKHz9U(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this.layoutNode);
        androidComposeView.recalculateWindowPosition();
        return Matrix.m700mapMKHz9U(mo841localToRootMKHz9U, androidComposeView.viewToWindowMatrix);
    }

    public final void onCoordinatesUsed$ui() {
        this.layoutNode.layoutDelegate.onCoordinatesUsed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void onMeasured() {
        Modifier.Node parent$ui;
        boolean m907getIncludeSelfInTraversalH91voCI = NodeKindKt.m907getIncludeSelfInTraversalH91voCI(128);
        Modifier.Node headNode = headNode(m907getIncludeSelfInTraversalH91voCI);
        if (headNode == null || (headNode.getNode().getAggregateChildKindSet$ui() & 128) == 0) {
            return;
        }
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (m907getIncludeSelfInTraversalH91voCI) {
                parent$ui = getTail();
            } else {
                parent$ui = getTail().getParent$ui();
                if (parent$ui == null) {
                }
            }
            for (Modifier.Node headNode2 = headNode(m907getIncludeSelfInTraversalH91voCI); headNode2 != null; headNode2 = headNode2.getChild$ui()) {
                if ((headNode2.getAggregateChildKindSet$ui() & 128) == 0) {
                    break;
                }
                if ((headNode2.getKindSet$ui() & 128) != 0) {
                    DelegatingNode delegatingNode = headNode2;
                    ?? r8 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof MeasuredSizeAwareModifierNode) {
                            ((MeasuredSizeAwareModifierNode) delegatingNode).mo197onRemeasuredozmzZPI(this.measuredSize);
                        } else if ((delegatingNode.getKindSet$ui() & 128) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node = delegatingNode.delegate;
                            int i = 0;
                            delegatingNode = delegatingNode;
                            r8 = r8;
                            while (node != null) {
                                if ((node.getKindSet$ui() & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        delegatingNode = node;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r8.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r8.add(node);
                                    }
                                }
                                node = node.getChild$ui();
                                delegatingNode = delegatingNode;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DepthSortedSetKt.access$pop(r8);
                    }
                }
                if (headNode2 == parent$ui) {
                    break;
                }
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void onPlaced() {
        boolean m907getIncludeSelfInTraversalH91voCI = NodeKindKt.m907getIncludeSelfInTraversalH91voCI(4194304);
        Modifier.Node tail = getTail();
        if (!m907getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m907getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & 4194304) != 0; headNode = headNode.getChild$ui()) {
            if ((headNode.getKindSet$ui() & 4194304) != 0) {
                DelegatingNode delegatingNode = headNode;
                ?? r5 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
                    } else if ((delegatingNode.getKindSet$ui() & 4194304) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node = delegatingNode.delegate;
                        int i = 0;
                        delegatingNode = delegatingNode;
                        r5 = r5;
                        while (node != null) {
                            if ((node.getKindSet$ui() & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    delegatingNode = node;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new MutableVector(0, new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r5.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r5.add(node);
                                }
                            }
                            node = node.getChild$ui();
                            delegatingNode = delegatingNode;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DepthSortedSetKt.access$pop(r5);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m1047equalsimpl0(this.position, 0L)) {
            return;
        }
        this.layoutNode.onCoordinatorRectChanged$ui(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onUnplaced() {
        boolean m907getIncludeSelfInTraversalH91voCI = NodeKindKt.m907getIncludeSelfInTraversalH91voCI(PKIFailureInfo.badCertTemplate);
        Modifier.Node headNode = headNode(m907getIncludeSelfInTraversalH91voCI);
        if (headNode == null || (headNode.getNode().getAggregateChildKindSet$ui() & PKIFailureInfo.badCertTemplate) == 0) {
            return;
        }
        Modifier.Node tail = getTail();
        if (!m907getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node headNode2 = headNode(m907getIncludeSelfInTraversalH91voCI); headNode2 != null && (headNode2.getAggregateChildKindSet$ui() & PKIFailureInfo.badCertTemplate) != 0; headNode2 = headNode2.getChild$ui()) {
            if ((headNode2.getKindSet$ui() & PKIFailureInfo.badCertTemplate) != 0) {
                DelegatingNode delegatingNode = headNode2;
                ?? r4 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof UnplacedAwareModifierNode) {
                        ((OnVisibilityChangedNode) ((UnplacedAwareModifierNode) delegatingNode)).onUnplaced();
                    } else if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.badCertTemplate) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node = delegatingNode.delegate;
                        int i = 0;
                        delegatingNode = delegatingNode;
                        r4 = r4;
                        while (node != null) {
                            if ((node.getKindSet$ui() & PKIFailureInfo.badCertTemplate) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    delegatingNode = node;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new MutableVector(0, new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r4.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r4.add(node);
                                }
                            }
                            node = node.getChild$ui();
                            delegatingNode = delegatingNode;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DepthSortedSetKt.access$pop(r4);
                }
            }
            if (headNode2 == tail) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m899outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, int i, final boolean z, final float f, final boolean z2) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        long DistanceAndFlags3;
        Modifier.Node access$pop;
        if (node == null) {
            mo871hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m899outOfBoundsHit8NAm7pk(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (PointerType.m828equalsimpl0(i2, 3) || PointerType.m828equalsimpl0(i2, 4)) {
            DelegatingNode delegatingNode = node;
            MutableVector mutableVector = null;
            while (true) {
                if (delegatingNode == 0) {
                    break;
                }
                if (delegatingNode instanceof PointerInputModifierNode) {
                    long mo376getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) delegatingNode).mo376getTouchBoundsExpansionRZrCHBk();
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    LayoutNode layoutNode = this.layoutNode;
                    if (intBitsToFloat >= (-TouchBoundsExpansion.m908computeLeftimpl$ui(mo376getTouchBoundsExpansionRZrCHBk, layoutNode.layoutDirection))) {
                        if (Float.intBitsToFloat(i3) < TouchBoundsExpansion.m909computeRightimpl$ui(mo376getTouchBoundsExpansionRZrCHBk, layoutNode.layoutDirection) + getMeasuredWidth()) {
                            int i4 = (int) (BodyPartID.bodyIdMax & j);
                            if (Float.intBitsToFloat(i4) >= (-TouchBoundsExpansion.m911getTopimpl(mo376getTouchBoundsExpansionRZrCHBk))) {
                                if (Float.intBitsToFloat(i4) < TouchBoundsExpansion.m910getBottomimpl(mo376getTouchBoundsExpansionRZrCHBk) + getMeasuredHeight()) {
                                    final int i5 = i2;
                                    Function0 function0 = new Function0() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            NodeCoordinator.this.m899outOfBoundsHit8NAm7pk(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i5, z, f, z2);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
                                    MutableObjectList mutableObjectList = hitTestResult.values;
                                    int i6 = hitTestResult.hitDepth;
                                    int i7 = mutableObjectList._size;
                                    if (i6 == i7 - 1) {
                                        hitTestResult.removeNodesInRange(i6 + 1, i7);
                                        hitTestResult.hitDepth++;
                                        mutableObjectList.add(node);
                                        DistanceAndFlags3 = HitTestResultKt.DistanceAndFlags(RecyclerView.DECELERATION_RATE, z, true);
                                        mutableLongList.add(DistanceAndFlags3);
                                        function0.invoke();
                                        hitTestResult.hitDepth = i6;
                                        return;
                                    }
                                    long m870findBestHitDistancefn2tFes = hitTestResult.m870findBestHitDistancefn2tFes();
                                    int i8 = hitTestResult.hitDepth;
                                    if (!DistanceAndFlags.m867isInExpandedBoundsimpl(m870findBestHitDistancefn2tFes)) {
                                        if (DistanceAndFlags.m866getDistanceimpl(m870findBestHitDistancefn2tFes) > RecyclerView.DECELERATION_RATE) {
                                            int i9 = hitTestResult.hitDepth;
                                            hitTestResult.removeNodesInRange(i9 + 1, mutableObjectList._size);
                                            hitTestResult.hitDepth++;
                                            mutableObjectList.add(node);
                                            DistanceAndFlags = HitTestResultKt.DistanceAndFlags(RecyclerView.DECELERATION_RATE, z, true);
                                            mutableLongList.add(DistanceAndFlags);
                                            function0.invoke();
                                            hitTestResult.hitDepth = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = mutableObjectList._size;
                                    int i11 = i10 - 1;
                                    hitTestResult.hitDepth = i11;
                                    hitTestResult.removeNodesInRange(i10, mutableObjectList._size);
                                    hitTestResult.hitDepth++;
                                    mutableObjectList.add(node);
                                    DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(RecyclerView.DECELERATION_RATE, z, true);
                                    mutableLongList.add(DistanceAndFlags2);
                                    function0.invoke();
                                    hitTestResult.hitDepth = i11;
                                    if (DistanceAndFlags.m866getDistanceimpl(hitTestResult.m870findBestHitDistancefn2tFes()) < RecyclerView.DECELERATION_RATE) {
                                        hitTestResult.removeNodesInRange(i8 + 1, hitTestResult.hitDepth + 1);
                                    }
                                    hitTestResult.hitDepth = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNode.delegate;
                        int i12 = 0;
                        access$pop = delegatingNode;
                        mutableVector = mutableVector;
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 16) != 0) {
                                i12++;
                                mutableVector = mutableVector;
                                if (i12 == 1) {
                                    access$pop = node2;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                    }
                                    if (access$pop != null) {
                                        mutableVector.add(access$pop);
                                        access$pop = null;
                                    }
                                    mutableVector.add(node2);
                                }
                            }
                            node2 = node2.getChild$ui();
                            access$pop = access$pop;
                            mutableVector = mutableVector;
                        }
                        if (i12 == 1) {
                            i2 = i;
                            delegatingNode = access$pop;
                            mutableVector = mutableVector;
                        }
                    }
                    access$pop = DepthSortedSetKt.access$pop(mutableVector);
                    i2 = i;
                    delegatingNode = access$pop;
                    mutableVector = mutableVector;
                }
            }
        }
        if (z2) {
            m897hitNearFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        } else {
            m901speculativeHitFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        }
    }

    public abstract void performDraw(Canvas canvas, GraphicsLayer graphicsLayer);

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer);

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    public final void m900placeSelfMLgxB_4(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.layoutNode;
        if (graphicsLayer != null) {
            if (function1 != null) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock(false, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode);
                NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = this._drawBlock;
                int i = 1;
                if (nodeCoordinator$drawBlock$1 == null) {
                    NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$12 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$invalidateParentLayer$1(this, i));
                    this._drawBlock = nodeCoordinator$drawBlock$12;
                    nodeCoordinator$drawBlock$1 = nodeCoordinator$drawBlock$12;
                }
                NodeCoordinator$invalidateParentLayer$1 nodeCoordinator$invalidateParentLayer$1 = this.invalidateParentLayer;
                OwnedLayer createLayer = ((AndroidComposeView) requireOwner).createLayer(nodeCoordinator$drawBlock$1, nodeCoordinator$invalidateParentLayer$1, graphicsLayer);
                GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) createLayer;
                graphicsLayerOwnerLayer.m936resizeozmzZPI(this.measuredSize);
                graphicsLayerOwnerLayer.m935movegyyYBs(j);
                this.layer = createLayer;
                layoutNode.innerLayerCoordinatorIsDirty = true;
                nodeCoordinator$invalidateParentLayer$1.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock(false, null);
            }
            updateLayerBlock(false, function1);
        }
        if (!IntOffset.m1047equalsimpl0(this.position, j)) {
            ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).voteFrameRate(-4.0f);
            this.position = j;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ((GraphicsLayerOwnerLayer) ownedLayer).m935movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            layoutNode.onCoordinatorRectChanged$ui(this);
            LookaheadCapablePlaceable.invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = layoutNode.owner;
            if (owner != null) {
                ((AndroidComposeView) owner).onLayoutChange(layoutNode);
            }
        }
        this.zIndex = f;
        if (this == ((NodeCoordinator) layoutNode.nodes.outerCoordinator)) {
            ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).rectManager.recalculateRectIfDirty(layoutNode);
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    public final void rectInParent$ui(MutableRect mutableRect, boolean z, boolean z2) {
        long j;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long m894getMinimumTouchTargetSizeNHjbRc = m894getMinimumTouchTargetSizeNHjbRc();
                    float f = mutableRect.left;
                    float f2 = mutableRect.top;
                    if (mutableRect.right >= RecyclerView.DECELERATION_RATE) {
                        long j2 = this.measuredSize;
                        if (f <= ((int) (j2 >> 32)) && mutableRect.bottom >= RecyclerView.DECELERATION_RATE && f2 <= ((int) (j2 & BodyPartID.bodyIdMax))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (m894getMinimumTouchTargetSizeNHjbRc >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (m894getMinimumTouchTargetSizeNHjbRc & BodyPartID.bodyIdMax));
                            float f3 = (intBitsToFloat - (mutableRect.right - mutableRect.left)) / 2.0f;
                            if (f3 > RecyclerView.DECELERATION_RATE) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (mutableRect.bottom - mutableRect.top)) / 2.0f;
                            if (f5 > RecyclerView.DECELERATION_RATE) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long j3 = this.measuredSize;
                            int i = (int) (j3 >> 32);
                            int i2 = (int) (j3 & BodyPartID.bodyIdMax);
                            float f7 = i;
                            int i3 = (int) (m894getMinimumTouchTargetSizeNHjbRc >> 32);
                            float min = Math.min(Float.intBitsToFloat(i3) + f7, Math.max(f7, Float.intBitsToFloat(i3) + intBitsToFloat3));
                            float f8 = i2;
                            int i4 = (int) (m894getMinimumTouchTargetSizeNHjbRc & BodyPartID.bodyIdMax);
                            mutableRect.intersect(intBitsToFloat3, intBitsToFloat4, min, Math.min(Float.intBitsToFloat(i4) + f8, Math.max(f8, Float.intBitsToFloat(i4) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                    long j32 = this.measuredSize;
                    int i5 = (int) (j32 >> 32);
                    int i22 = (int) (j32 & BodyPartID.bodyIdMax);
                    float f72 = i5;
                    int i32 = (int) (m894getMinimumTouchTargetSizeNHjbRc >> 32);
                    float min2 = Math.min(Float.intBitsToFloat(i32) + f72, Math.max(f72, Float.intBitsToFloat(i32) + intBitsToFloat32));
                    float f82 = i22;
                    int i42 = (int) (m894getMinimumTouchTargetSizeNHjbRc & BodyPartID.bodyIdMax);
                    mutableRect.intersect(intBitsToFloat32, intBitsToFloat42, min2, Math.min(Float.intBitsToFloat(i42) + f82, Math.max(f82, Float.intBitsToFloat(i42) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.measuredSize;
                    mutableRect.intersect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (j4 >> 32), (int) (j4 & BodyPartID.bodyIdMax));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
            float[] m934getMatrixsQKQjiQ = graphicsLayerOwnerLayer.m934getMatrixsQKQjiQ();
            if (!graphicsLayerOwnerLayer.isIdentity) {
                if (m934getMatrixsQKQjiQ == null) {
                    mutableRect.left = RecyclerView.DECELERATION_RATE;
                    mutableRect.top = RecyclerView.DECELERATION_RATE;
                    mutableRect.right = RecyclerView.DECELERATION_RATE;
                    mutableRect.bottom = RecyclerView.DECELERATION_RATE;
                } else {
                    Matrix.m701mapimpl(m934getMatrixsQKQjiQ, mutableRect);
                }
            }
        }
        long j5 = this.position;
        float f9 = (int) (j5 >> 32);
        mutableRect.left += f9;
        mutableRect.right += f9;
        float f10 = (int) (j5 & BodyPartID.bodyIdMax);
        mutableRect.top += f10;
        mutableRect.bottom += f10;
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock(false, null);
            this.layoutNode.requestRelayout$ui(false);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        long j = this.position;
        if (graphicsLayer != null) {
            mo851placeAtf8xVGno(j, this.zIndex, graphicsLayer);
        } else {
            mo836placeAtf8xVGno(j, this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo844screenToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo840localPositionOfS_NoaFU(ValueInsets.findRootCoordinates(this), ((AndroidComposeView) LayoutNodeKt.requireOwner(this.layoutNode)).m920screenToLocalMKHz9U(j), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.collection.MutableVector] */
    public final void setMeasureResult$ui(MeasureResult measureResult) {
        NodeCoordinator nodeCoordinator;
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            LayoutNode layoutNode = this.layoutNode;
            int i = 0;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                int width = measureResult.getWidth();
                int height = measureResult.getHeight();
                OwnedLayer ownedLayer = this.layer;
                if (ownedLayer != null) {
                    ((GraphicsLayerOwnerLayer) ownedLayer).m936resizeozmzZPI((width << 32) | (height & BodyPartID.bodyIdMax));
                } else if (layoutNode.isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
                    nodeCoordinator.invalidateLayer();
                }
                m852setMeasuredSizeozmzZPI((height & BodyPartID.bodyIdMax) | (width << 32));
                if (this.layerBlock != null) {
                    updateLayerParameters(false);
                }
                boolean m907getIncludeSelfInTraversalH91voCI = NodeKindKt.m907getIncludeSelfInTraversalH91voCI(4);
                Modifier.Node tail = getTail();
                if (m907getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
                    for (Modifier.Node headNode = headNode(m907getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & 4) != 0; headNode = headNode.getChild$ui()) {
                        if ((headNode.getKindSet$ui() & 4) != 0) {
                            DelegatingNode delegatingNode = headNode;
                            ?? r9 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof DrawModifierNode) {
                                    ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                                } else if ((delegatingNode.getKindSet$ui() & 4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node = delegatingNode.delegate;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r9 = r9;
                                    while (node != null) {
                                        if ((node.getKindSet$ui() & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                delegatingNode = node;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r9.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r9.add(node);
                                            }
                                        }
                                        node = node.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r9);
                            }
                        }
                        if (headNode == tail) {
                            break;
                        }
                    }
                }
                Owner owner = layoutNode.owner;
                if (owner != null) {
                    ((AndroidComposeView) owner).onLayoutChange(layoutNode);
                }
                layoutNode.onCoordinatorRectChanged$ui(this);
            }
            MutableObjectIntMap mutableObjectIntMap = this.oldAlignmentLines;
            if ((mutableObjectIntMap == null || mutableObjectIntMap._size == 0) && measureResult.getAlignmentLines().isEmpty()) {
                return;
            }
            MutableObjectIntMap mutableObjectIntMap2 = this.oldAlignmentLines;
            Map alignmentLines = measureResult.getAlignmentLines();
            if (mutableObjectIntMap2 != null && mutableObjectIntMap2._size == alignmentLines.size()) {
                Object[] objArr = mutableObjectIntMap2.keys;
                int[] iArr = mutableObjectIntMap2.values;
                long[] jArr = mutableObjectIntMap2.metadata;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) alignmentLines.get((AlignmentLine) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            layoutNode.layoutDelegate.measurePassDelegate.alignmentLines.onAlignmentsChanged();
            MutableObjectIntMap mutableObjectIntMap3 = this.oldAlignmentLines;
            if (mutableObjectIntMap3 == null) {
                MutableObjectIntMap mutableObjectIntMap4 = ObjectIntMapKt.EmptyObjectIntMap;
                mutableObjectIntMap3 = new MutableObjectIntMap();
                this.oldAlignmentLines = mutableObjectIntMap3;
            }
            mutableObjectIntMap3.clear();
            for (Map.Entry entry : measureResult.getAlignmentLines().entrySet()) {
                mutableObjectIntMap3.set(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    public final void m901speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        int i2;
        if (node == null) {
            mo871hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m901speculativeHitFh5PU_I(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f);
            return;
        }
        if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m899outOfBoundsHit8NAm7pk(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f, false);
            return;
        }
        Function0 function0 = new Function0() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NodeCoordinator.this.m899outOfBoundsHit8NAm7pk(DepthSortedSetKt.m863access$nextUntilhw7D004(node, hitTestSource.mo906entityTypeOLwlOKw()), hitTestSource, j, hitTestResult, i, z, f, false);
                return Unit.INSTANCE;
            }
        };
        MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
        MutableObjectList mutableObjectList = hitTestResult.values;
        int i3 = hitTestResult.hitDepth;
        int i4 = mutableObjectList._size;
        if (i3 != i4 - 1) {
            long m870findBestHitDistancefn2tFes = hitTestResult.m870findBestHitDistancefn2tFes();
            int i5 = hitTestResult.hitDepth;
            int i6 = mutableObjectList._size;
            int i7 = i6 - 1;
            hitTestResult.hitDepth = i7;
            hitTestResult.removeNodesInRange(i6, mutableObjectList._size);
            hitTestResult.hitDepth++;
            mutableObjectList.add(node);
            DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
            mutableLongList.add(DistanceAndFlags);
            function0.invoke();
            hitTestResult.hitDepth = i7;
            long m870findBestHitDistancefn2tFes2 = hitTestResult.m870findBestHitDistancefn2tFes();
            if (hitTestResult.hitDepth + 1 >= mutableObjectList._size - 1 || DistanceAndFlags.m865compareTo9YPOF3E(m870findBestHitDistancefn2tFes, m870findBestHitDistancefn2tFes2) <= 0) {
                hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, mutableObjectList._size);
            } else {
                int i8 = i5 + 1;
                boolean m867isInExpandedBoundsimpl = DistanceAndFlags.m867isInExpandedBoundsimpl(m870findBestHitDistancefn2tFes2);
                int i9 = hitTestResult.hitDepth;
                hitTestResult.removeNodesInRange(i8, m867isInExpandedBoundsimpl ? i9 + 2 : i9 + 1);
            }
            hitTestResult.hitDepth = i5;
            return;
        }
        int i10 = i3 + 1;
        hitTestResult.removeNodesInRange(i10, i4);
        hitTestResult.hitDepth++;
        mutableObjectList.add(node);
        DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(f, z, false);
        mutableLongList.add(DistanceAndFlags2);
        function0.invoke();
        hitTestResult.hitDepth = i3;
        if (i10 == mutableObjectList._size - 1 || DistanceAndFlags.m867isInExpandedBoundsimpl(hitTestResult.m870findBestHitDistancefn2tFes())) {
            int i11 = hitTestResult.hitDepth;
            int i12 = i11 + 1;
            mutableObjectList.removeAt(i12);
            if (i12 < 0 || i12 >= (i2 = mutableLongList._size)) {
                RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = mutableLongList.content;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                ArraysKt___ArraysJvmKt.copyInto(i12, jArr, i11 + 2, jArr, i2);
            }
            mutableLongList._size--;
        }
    }

    public final Rect touchBoundsInRoot() {
        if (isAttached()) {
            LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(this);
            MutableRect mutableRect = this._rectCache;
            if (mutableRect == null) {
                mutableRect = new MutableRect();
                this._rectCache = mutableRect;
            }
            long m891calculateMinimumTouchTargetPaddingE7KxVPU = m891calculateMinimumTouchTargetPaddingE7KxVPU(m894getMinimumTouchTargetSizeNHjbRc());
            int i = (int) (m891calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
            mutableRect.left = -Float.intBitsToFloat(i);
            int i2 = (int) (m891calculateMinimumTouchTargetPaddingE7KxVPU & BodyPartID.bodyIdMax);
            mutableRect.top = -Float.intBitsToFloat(i2);
            mutableRect.right = Float.intBitsToFloat(i) + getMeasuredWidth();
            mutableRect.bottom = Float.intBitsToFloat(i2) + getMeasuredHeight();
            while (this != findRootCoordinates) {
                this.rectInParent$ui(mutableRect, false, true);
                if (!mutableRect.isEmpty()) {
                    this = this.wrappedBy;
                    this.getClass();
                }
            }
            return new Rect(mutableRect.left, mutableRect.top, mutableRect.right, mutableRect.bottom);
        }
        return Rect.Zero;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public final void mo845transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m702resetimpl(fArr);
        coordinator.m903transformToAncestorEL8BTi8(findCommonAncestor$ui, fArr);
        m902transformFromAncestorEL8BTi8(findCommonAncestor$ui, fArr);
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    public final void m902transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        float[] m933getInverseMatrix3i98HWw;
        if (Intrinsics.areEqual(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        nodeCoordinator2.getClass();
        nodeCoordinator2.m902transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m1047equalsimpl0(this.position, 0L)) {
            float[] fArr2 = tmpMatrix;
            Matrix.m702resetimpl(fArr2);
            long j = this.position;
            Matrix.m705translateimpl(fArr2, -((int) (j >> 32)), -((int) (j & BodyPartID.bodyIdMax)));
            Matrix.m704timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null || (m933getInverseMatrix3i98HWw = ((GraphicsLayerOwnerLayer) ownedLayer).m933getInverseMatrix3i98HWw()) == null) {
            return;
        }
        Matrix.m704timesAssign58bKbWc(fArr, m933getInverseMatrix3i98HWw);
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    public final void m903transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        while (!this.equals(nodeCoordinator)) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                Matrix.m704timesAssign58bKbWc(fArr, ((GraphicsLayerOwnerLayer) ownedLayer).m934getMatrixsQKQjiQ());
            }
            if (!IntOffset.m1047equalsimpl0(this.position, 0L)) {
                float[] fArr2 = tmpMatrix;
                Matrix.m702resetimpl(fArr2);
                Matrix.m705translateimpl(fArr2, (int) (r0 >> 32), (int) (r0 & BodyPartID.bodyIdMax));
                Matrix.m704timesAssign58bKbWc(fArr, fArr2);
            }
            this = this.wrappedBy;
            this.getClass();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public final void mo846transformToScreen58bKbWc(float[] fArr) {
        Owner requireOwner = LayoutNodeKt.requireOwner(this.layoutNode);
        NodeCoordinator coordinator = toCoordinator(ValueInsets.findRootCoordinates(this));
        m903transformToAncestorEL8BTi8(coordinator, fArr);
        if (requireOwner instanceof MatrixPositionCalculator) {
            ((AndroidComposeView) ((MatrixPositionCalculator) requireOwner)).m915localToScreen58bKbWc(fArr);
            return;
        }
        long mo842localToScreenMKHz9U = coordinator.mo842localToScreenMKHz9U(0L);
        if ((9223372034707292159L & mo842localToScreenMKHz9U) != 9205357640488583168L) {
            Matrix.m705translateimpl(fArr, Float.intBitsToFloat((int) (mo842localToScreenMKHz9U >> 32)), Float.intBitsToFloat((int) (mo842localToScreenMKHz9U & BodyPartID.bodyIdMax)));
        }
    }

    public final void updateLayerBlock(boolean z, Function1 function1) {
        Owner owner;
        MutableVector mutableVector;
        Reference poll;
        if (function1 != null && this.explicitLayer != null) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        int i = 1;
        LayoutNode layoutNode = this.layoutNode;
        boolean z2 = (!z && this.layerBlock == function1 && Intrinsics.areEqual(this.layerDensity, layoutNode.density) && this.layerLayoutDirection == layoutNode.layoutDirection) ? false : true;
        this.layerDensity = layoutNode.density;
        this.layerLayoutDirection = layoutNode.layoutDirection;
        boolean isAttached = layoutNode.isAttached();
        NodeCoordinator$invalidateParentLayer$1 nodeCoordinator$invalidateParentLayer$1 = this.invalidateParentLayer;
        if (isAttached && function1 != null) {
            this.layerBlock = function1;
            if (this.layer != null) {
                if (z2) {
                    updateLayerParameters(true);
                    return;
                }
                return;
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode);
            NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = this._drawBlock;
            if (nodeCoordinator$drawBlock$1 == null) {
                NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$12 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$invalidateParentLayer$1(this, i));
                this._drawBlock = nodeCoordinator$drawBlock$12;
                nodeCoordinator$drawBlock$1 = nodeCoordinator$drawBlock$12;
            }
            OwnedLayer createLayer = ((AndroidComposeView) requireOwner).createLayer(nodeCoordinator$drawBlock$1, nodeCoordinator$invalidateParentLayer$1, null);
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) createLayer;
            graphicsLayerOwnerLayer.m936resizeozmzZPI(this.measuredSize);
            graphicsLayerOwnerLayer.m935movegyyYBs(this.position);
            this.layer = createLayer;
            updateLayerParameters(true);
            layoutNode.innerLayerCoordinatorIsDirty = true;
            nodeCoordinator$invalidateParentLayer$1.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = (GraphicsLayerOwnerLayer) ownedLayer;
            if (!ColorKt.m688isIdentity58bKbWc(graphicsLayerOwnerLayer2.m934getMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorRectChanged$ui(this);
            }
            graphicsLayerOwnerLayer2.drawBlock = null;
            graphicsLayerOwnerLayer2.invalidateParentLayer = null;
            graphicsLayerOwnerLayer2.isDestroyed = true;
            graphicsLayerOwnerLayer2.setDirty(false);
            GraphicsContext graphicsContext = graphicsLayerOwnerLayer2.context;
            if (graphicsContext != null) {
                graphicsContext.releaseGraphicsLayer(graphicsLayerOwnerLayer2.graphicsLayer);
                AndroidComposeView androidComposeView = graphicsLayerOwnerLayer2.ownerView;
                WorkLauncherImpl workLauncherImpl = androidComposeView.layerCache;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) workLauncherImpl.workTaskExecutor;
                    mutableVector = (MutableVector) workLauncherImpl.processor;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        mutableVector.remove(poll);
                    }
                } while (poll != null);
                mutableVector.add(new java.lang.ref.WeakReference(graphicsLayerOwnerLayer2, (ReferenceQueue) workLauncherImpl.workTaskExecutor));
                androidComposeView.dirtyLayers.remove(graphicsLayerOwnerLayer2);
            }
            this.layer = null;
            layoutNode.innerLayerCoordinatorIsDirty = true;
            nodeCoordinator$invalidateParentLayer$1.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner = layoutNode.owner) != null) {
                ((AndroidComposeView) owner).onLayoutChange(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    public final void updateLayerParameters(boolean z) {
        char c;
        AndroidComposeView androidComposeView;
        boolean z2;
        AndroidComposeView androidComposeView2;
        Owner owner;
        Function0 function0;
        int i;
        Function0 function02;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        Function1 function1 = this.layerBlock;
        if (ownedLayer == null) {
            if (function1 == null) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("updateLayerParameters requires a non-null layerBlock");
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        LayoutNode layoutNode = this.layoutNode;
        reusableGraphicsLayerScope.graphicsDensity = layoutNode.density;
        reusableGraphicsLayerScope.layoutDirection = layoutNode.layoutDirection;
        reusableGraphicsLayerScope.size = Countries.m3991toSizeozmzZPI(this.measuredSize);
        ((SnapshotStateObserver) ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).snapshotObserver.application).observeReads(this, OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$4, new Datadog$getInstance$1$1(3, function1, this));
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.getClass();
        layerPositionalProperties2.scaleX = layerPositionalProperties.scaleX;
        layerPositionalProperties2.scaleY = layerPositionalProperties.scaleY;
        layerPositionalProperties2.translationX = layerPositionalProperties.translationX;
        layerPositionalProperties2.translationY = layerPositionalProperties.translationY;
        layerPositionalProperties2.rotationX = layerPositionalProperties.rotationX;
        layerPositionalProperties2.rotationY = layerPositionalProperties.rotationY;
        layerPositionalProperties2.rotationZ = layerPositionalProperties.rotationZ;
        layerPositionalProperties2.cameraDistance = layerPositionalProperties.cameraDistance;
        layerPositionalProperties2.transformOrigin = layerPositionalProperties.transformOrigin;
        float f = reusableGraphicsLayerScope.scaleX;
        layerPositionalProperties.scaleX = f;
        layerPositionalProperties.scaleY = reusableGraphicsLayerScope.scaleY;
        layerPositionalProperties.translationX = reusableGraphicsLayerScope.translationX;
        layerPositionalProperties.translationY = reusableGraphicsLayerScope.translationY;
        layerPositionalProperties.rotationX = reusableGraphicsLayerScope.rotationX;
        layerPositionalProperties.rotationY = reusableGraphicsLayerScope.rotationY;
        layerPositionalProperties.rotationZ = reusableGraphicsLayerScope.rotationZ;
        layerPositionalProperties.cameraDistance = reusableGraphicsLayerScope.cameraDistance;
        long j = reusableGraphicsLayerScope.transformOrigin;
        layerPositionalProperties.transformOrigin = j;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
        AndroidComposeView androidComposeView3 = graphicsLayerOwnerLayer.ownerView;
        int i2 = reusableGraphicsLayerScope.mutatedFields | graphicsLayerOwnerLayer.mutatedFields;
        graphicsLayerOwnerLayer.layoutDirection = reusableGraphicsLayerScope.layoutDirection;
        graphicsLayerOwnerLayer.density = reusableGraphicsLayerScope.graphicsDensity;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            graphicsLayerOwnerLayer.transformOrigin = j;
        }
        if ((i2 & 1) != 0) {
            GraphicsLayerV29 graphicsLayerV29 = graphicsLayerOwnerLayer.graphicsLayer.impl;
            if (graphicsLayerV29.scaleX != f) {
                graphicsLayerV29.scaleX = f;
                graphicsLayerV29.renderNode.setScaleX(f);
            }
        }
        if ((i2 & 2) != 0) {
            GraphicsLayer graphicsLayer = graphicsLayerOwnerLayer.graphicsLayer;
            float f2 = reusableGraphicsLayerScope.scaleY;
            GraphicsLayerV29 graphicsLayerV292 = graphicsLayer.impl;
            if (graphicsLayerV292.scaleY != f2) {
                graphicsLayerV292.scaleY = f2;
                graphicsLayerV292.renderNode.setScaleY(f2);
            }
        }
        if ((i2 & 4) != 0) {
            graphicsLayerOwnerLayer.graphicsLayer.setAlpha(reusableGraphicsLayerScope.alpha);
        }
        if ((i2 & 8) != 0) {
            GraphicsLayer graphicsLayer2 = graphicsLayerOwnerLayer.graphicsLayer;
            float f3 = reusableGraphicsLayerScope.translationX;
            GraphicsLayerV29 graphicsLayerV293 = graphicsLayer2.impl;
            if (graphicsLayerV293.translationX != f3) {
                graphicsLayerV293.translationX = f3;
                graphicsLayerV293.renderNode.setTranslationX(f3);
            }
        }
        if ((i2 & 16) != 0) {
            GraphicsLayer graphicsLayer3 = graphicsLayerOwnerLayer.graphicsLayer;
            float f4 = reusableGraphicsLayerScope.translationY;
            GraphicsLayerV29 graphicsLayerV294 = graphicsLayer3.impl;
            if (graphicsLayerV294.translationY != f4) {
                graphicsLayerV294.translationY = f4;
                graphicsLayerV294.renderNode.setTranslationY(f4);
            }
        }
        if ((i2 & 32) != 0) {
            GraphicsLayer graphicsLayer4 = graphicsLayerOwnerLayer.graphicsLayer;
            float f5 = reusableGraphicsLayerScope.shadowElevation;
            GraphicsLayerV29 graphicsLayerV295 = graphicsLayer4.impl;
            if (graphicsLayerV295.shadowElevation != f5) {
                graphicsLayerV295.shadowElevation = f5;
                graphicsLayerV295.renderNode.setElevation(f5);
                graphicsLayer4.outlineDirty = true;
                graphicsLayer4.configureOutlineAndClip();
            }
            if (reusableGraphicsLayerScope.shadowElevation > RecyclerView.DECELERATION_RATE && !graphicsLayerOwnerLayer.drawnWithEnabledZ && (function02 = graphicsLayerOwnerLayer.invalidateParentLayer) != null) {
                function02.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            GraphicsLayer graphicsLayer5 = graphicsLayerOwnerLayer.graphicsLayer;
            long j2 = reusableGraphicsLayerScope.ambientShadowColor;
            GraphicsLayerV29 graphicsLayerV296 = graphicsLayer5.impl;
            if (!Color.m676equalsimpl0(j2, graphicsLayerV296.ambientShadowColor)) {
                graphicsLayerV296.ambientShadowColor = j2;
                graphicsLayerV296.renderNode.setAmbientShadowColor(ColorKt.m694toArgb8_81llA(j2));
            }
        }
        if ((i2 & 128) != 0) {
            GraphicsLayer graphicsLayer6 = graphicsLayerOwnerLayer.graphicsLayer;
            long j3 = reusableGraphicsLayerScope.spotShadowColor;
            GraphicsLayerV29 graphicsLayerV297 = graphicsLayer6.impl;
            if (!Color.m676equalsimpl0(j3, graphicsLayerV297.spotShadowColor)) {
                graphicsLayerV297.spotShadowColor = j3;
                graphicsLayerV297.renderNode.setSpotShadowColor(ColorKt.m694toArgb8_81llA(j3));
            }
        }
        if ((i2 & 1024) != 0) {
            GraphicsLayer graphicsLayer7 = graphicsLayerOwnerLayer.graphicsLayer;
            float f6 = reusableGraphicsLayerScope.rotationZ;
            GraphicsLayerV29 graphicsLayerV298 = graphicsLayer7.impl;
            if (graphicsLayerV298.rotationZ != f6) {
                graphicsLayerV298.rotationZ = f6;
                graphicsLayerV298.renderNode.setRotationZ(f6);
            }
        }
        if ((i2 & 256) != 0) {
            GraphicsLayer graphicsLayer8 = graphicsLayerOwnerLayer.graphicsLayer;
            float f7 = reusableGraphicsLayerScope.rotationX;
            GraphicsLayerV29 graphicsLayerV299 = graphicsLayer8.impl;
            if (graphicsLayerV299.rotationX != f7) {
                graphicsLayerV299.rotationX = f7;
                graphicsLayerV299.renderNode.setRotationX(f7);
            }
        }
        if ((i2 & 512) != 0) {
            GraphicsLayer graphicsLayer9 = graphicsLayerOwnerLayer.graphicsLayer;
            float f8 = reusableGraphicsLayerScope.rotationY;
            GraphicsLayerV29 graphicsLayerV2910 = graphicsLayer9.impl;
            if (graphicsLayerV2910.rotationY != f8) {
                graphicsLayerV2910.rotationY = f8;
                graphicsLayerV2910.renderNode.setRotationY(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            GraphicsLayer graphicsLayer10 = graphicsLayerOwnerLayer.graphicsLayer;
            float f9 = reusableGraphicsLayerScope.cameraDistance;
            GraphicsLayerV29 graphicsLayerV2911 = graphicsLayer10.impl;
            if (graphicsLayerV2911.cameraDistance != f9) {
                graphicsLayerV2911.cameraDistance = f9;
                graphicsLayerV2911.renderNode.setCameraDistance(f9);
            }
        }
        if (i3 != 0) {
            c = ' ';
            boolean m714equalsimpl0 = TransformOrigin.m714equalsimpl0(graphicsLayerOwnerLayer.transformOrigin, TransformOrigin.Center);
            GraphicsLayer graphicsLayer11 = graphicsLayerOwnerLayer.graphicsLayer;
            if (m714equalsimpl0) {
                graphicsLayer11.m755setPivotOffsetk4lQ0M(9205357640488583168L);
            } else {
                graphicsLayer11.m755setPivotOffsetk4lQ0M((Float.floatToRawIntBits(Float.intBitsToFloat((int) (graphicsLayerOwnerLayer.transformOrigin & BodyPartID.bodyIdMax)) * ((int) (graphicsLayerOwnerLayer.size & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (graphicsLayerOwnerLayer.transformOrigin >> 32)) * ((int) (graphicsLayerOwnerLayer.size >> 32))) << 32));
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            graphicsLayerOwnerLayer.graphicsLayer.setClip(reusableGraphicsLayerScope.clip);
        }
        if ((131072 & i2) != 0) {
            graphicsLayerOwnerLayer.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.renderEffect);
        }
        if ((262144 & i2) != 0) {
            GraphicsLayerV29 graphicsLayerV2912 = graphicsLayerOwnerLayer.graphicsLayer.impl;
        }
        if ((524288 & i2) != 0) {
            GraphicsLayer graphicsLayer12 = graphicsLayerOwnerLayer.graphicsLayer;
            int i4 = reusableGraphicsLayerScope.blendMode;
            GraphicsLayerV29 graphicsLayerV2913 = graphicsLayer12.impl;
            if (graphicsLayerV2913.blendMode != i4) {
                graphicsLayerV2913.blendMode = i4;
                Paint paint = graphicsLayerV2913.layerPaint;
                if (paint == null) {
                    paint = new Paint();
                    graphicsLayerV2913.layerPaint = paint;
                }
                paint.setBlendMode(ColorKt.m693toAndroidBlendModes9anfk8(i4));
                graphicsLayerV2913.updateLayerProperties();
            }
        }
        if ((32768 & i2) != 0) {
            GraphicsLayer graphicsLayer13 = graphicsLayerOwnerLayer.graphicsLayer;
            int i5 = reusableGraphicsLayerScope.compositingStrategy;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Not supported composition strategy");
                    return;
                }
            }
            GraphicsLayerV29 graphicsLayerV2914 = graphicsLayer13.impl;
            if (graphicsLayerV2914.compositingStrategy != i) {
                graphicsLayerV2914.compositingStrategy = i;
                graphicsLayerV2914.updateLayerProperties();
            }
        }
        if ((i2 & 7963) != 0) {
            graphicsLayerOwnerLayer.isMatrixDirty = true;
            graphicsLayerOwnerLayer.isInverseMatrixDirty = true;
        }
        if (Intrinsics.areEqual(graphicsLayerOwnerLayer.outline, reusableGraphicsLayerScope.outline)) {
            androidComposeView = androidComposeView3;
            z2 = false;
        } else {
            ColorKt colorKt = reusableGraphicsLayerScope.outline;
            graphicsLayerOwnerLayer.outline = colorKt;
            if (colorKt == null) {
                androidComposeView = androidComposeView3;
            } else {
                GraphicsLayer graphicsLayer14 = graphicsLayerOwnerLayer.graphicsLayer;
                if (colorKt instanceof Outline$Rectangle) {
                    Rect rect = ((Outline$Rectangle) colorKt).rect;
                    float f10 = rect.left;
                    float f11 = rect.top;
                    androidComposeView = androidComposeView3;
                    graphicsLayer14.m757setRoundRectOutlineTNW_H78(RecyclerView.DECELERATION_RATE, (Float.floatToRawIntBits(f10) << c) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(rect.right - f10) << c) | (Float.floatToRawIntBits(rect.bottom - f11) & BodyPartID.bodyIdMax));
                } else {
                    androidComposeView = androidComposeView3;
                    if (colorKt instanceof Outline$Generic) {
                        AndroidPath androidPath = ((Outline$Generic) colorKt).path;
                        graphicsLayer14.internalOutline = null;
                        graphicsLayer14.roundRectOutlineSize = 9205357640488583168L;
                        graphicsLayer14.roundRectOutlineTopLeft = 0L;
                        graphicsLayer14.roundRectCornerRadius = RecyclerView.DECELERATION_RATE;
                        graphicsLayer14.outlineDirty = true;
                        graphicsLayer14.usePathForClip = false;
                        graphicsLayer14.outlinePath = androidPath;
                        graphicsLayer14.configureOutlineAndClip();
                    } else {
                        if (!(colorKt instanceof Outline$Rounded)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        Outline$Rounded outline$Rounded = (Outline$Rounded) colorKt;
                        AndroidPath androidPath2 = outline$Rounded.roundRectPath;
                        if (androidPath2 != null) {
                            graphicsLayer14.internalOutline = null;
                            graphicsLayer14.roundRectOutlineSize = 9205357640488583168L;
                            graphicsLayer14.roundRectOutlineTopLeft = 0L;
                            graphicsLayer14.roundRectCornerRadius = RecyclerView.DECELERATION_RATE;
                            graphicsLayer14.outlineDirty = true;
                            graphicsLayer14.usePathForClip = false;
                            graphicsLayer14.outlinePath = androidPath2;
                            graphicsLayer14.configureOutlineAndClip();
                        } else {
                            graphicsLayer14.m757setRoundRectOutlineTNW_H78(Float.intBitsToFloat((int) (outline$Rounded.roundRect.bottomLeftCornerRadius >> c)), (Float.floatToRawIntBits(r8.left) << c) | (Float.floatToRawIntBits(r8.top) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(r8.getWidth()) << c) | (Float.floatToRawIntBits(r8.getHeight()) & BodyPartID.bodyIdMax));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((colorKt instanceof Outline$Generic) || ((colorKt instanceof Outline$Rounded) && !Strings.isSimple(((Outline$Rounded) colorKt).roundRect))) && (function0 = graphicsLayerOwnerLayer.invalidateParentLayer) != null)) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        graphicsLayerOwnerLayer.mutatedFields = reusableGraphicsLayerScope.mutatedFields;
        if (i2 != 0 || z2) {
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                androidComposeView2 = androidComposeView;
                parent.onDescendantInvalidated(androidComposeView2, androidComposeView2);
            } else {
                androidComposeView2 = androidComposeView;
            }
            if (AndroidComposeView.isArrEnabled$ui()) {
                androidComposeView2.voteFrameRate(RecyclerView.DECELERATION_RATE);
            }
        }
        boolean z3 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.clip;
        this.lastLayerAlpha = reusableGraphicsLayerScope.alpha;
        boolean z4 = layerPositionalProperties2.scaleX == layerPositionalProperties.scaleX && layerPositionalProperties2.scaleY == layerPositionalProperties.scaleY && layerPositionalProperties2.translationX == layerPositionalProperties.translationX && layerPositionalProperties2.translationY == layerPositionalProperties.translationY && layerPositionalProperties2.rotationX == layerPositionalProperties.rotationX && layerPositionalProperties2.rotationY == layerPositionalProperties.rotationY && layerPositionalProperties2.rotationZ == layerPositionalProperties.rotationZ && layerPositionalProperties2.cameraDistance == layerPositionalProperties.cameraDistance && TransformOrigin.m714equalsimpl0(layerPositionalProperties2.transformOrigin, layerPositionalProperties.transformOrigin);
        if (z && ((!z4 || z3 != this.isClipping) && (owner = layoutNode.owner) != null)) {
            ((AndroidComposeView) owner).onLayoutChange(layoutNode);
        }
        if (z4) {
            return;
        }
        layoutNode.onCoordinatorRectChanged$ui(this);
        if (layoutNode.globallyPositionedObservers > 0) {
            AndroidComposeView androidComposeView4 = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode);
            WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) androidComposeView4.measureAndLayoutDelegate.createdAtMillis;
            workLauncherImpl.getClass();
            if (layoutNode.globallyPositionedObservers > 0) {
                ((MutableVector) workLauncherImpl.processor).add(layoutNode);
                layoutNode.needsOnGloballyPositionedDispatch = true;
            }
            androidComposeView4.scheduleMeasureAndLayout(null);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public final long mo847windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this.layoutNode);
        androidComposeView.recalculateWindowPosition();
        return mo840localPositionOfS_NoaFU(findRootCoordinates, Offset.m625minusMKHz9U(Matrix.m700mapMKHz9U(j, androidComposeView.windowToViewMatrix), findRootCoordinates.mo841localToRootMKHz9U(0L)), true);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m904withinLayerBoundsk4lQ0M(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null && this.isClipping) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            GraphicsLayer graphicsLayer = ((GraphicsLayerOwnerLayer) ownedLayer).graphicsLayer;
            if (!(graphicsLayer.clip ? ShapeContainingUtilKt.isInOutline$default(graphicsLayer.getOutline(), intBitsToFloat, intBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }
}
