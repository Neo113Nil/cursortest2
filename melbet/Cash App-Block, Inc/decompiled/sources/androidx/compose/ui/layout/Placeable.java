package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class Placeable {
    public int height;
    public int width;
    public long measuredSize = 0;
    public long measurementConstraints = PlaceableKt.DefaultConstraints;
    public long apparentToRealOffset = 0;

    public abstract class PlacementScope implements Density {
        public boolean motionFrameOfReferencePlacement;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void access$handleMotionFrameOfReferencePlacement(PlacementScope placementScope, Placeable placeable) {
            placementScope.getClass();
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(placementScope.motionFrameOfReferencePlacement);
            }
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static void m854place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j) {
            placementScope.getClass();
            access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
            placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, (Function1) null);
        }

        public static void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3) {
            if ((i3 & 4) != 0) {
                f = RecyclerView.DECELERATION_RATE;
            }
            int i4 = PlaceableKt.$r8$clinit;
            RootMeasurePolicy$measure$1 rootMeasurePolicy$measure$1 = RootMeasurePolicy$measure$1.INSTANCE$2;
            long j = (i << 32) | (i2 & BodyPartID.bodyIdMax);
            if (placementScope.getParentLayoutDirection() == LayoutDirection.Ltr || placementScope.getParentWidth() == 0) {
                access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), f, rootMeasurePolicy$measure$1);
            } else {
                long parentWidth = (((placementScope.getParentWidth() - placeable.width) - ((int) (j >> 32))) << 32) | (((int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(parentWidth, placeable.apparentToRealOffset), f, rootMeasurePolicy$measure$1);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static void m855placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j) {
            int i = PlaceableKt.$r8$clinit;
            RootMeasurePolicy$measure$1 rootMeasurePolicy$measure$1 = RootMeasurePolicy$measure$1.INSTANCE$2;
            if (placementScope.getParentLayoutDirection() == LayoutDirection.Ltr || placementScope.getParentWidth() == 0) {
                access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, rootMeasurePolicy$measure$1);
            } else {
                int parentWidth = (placementScope.getParentWidth() - placeable.width) - ((int) (j >> 32));
                long j2 = ((int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax;
                access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j2 | (parentWidth << 32), placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, rootMeasurePolicy$measure$1);
            }
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, Function1 function1, int i3) {
            if ((i3 & 8) != 0) {
                int i4 = PlaceableKt.$r8$clinit;
                function1 = RootMeasurePolicy$measure$1.INSTANCE$2;
            }
            placementScope.placeWithLayer(placeable, i, i2, RecyclerView.DECELERATION_RATE, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static void m856placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, Function1 function1, int i) {
            if ((i & 4) != 0) {
                int i2 = PlaceableKt.$r8$clinit;
                function1 = RootMeasurePolicy$measure$1.INSTANCE$2;
            }
            placementScope.getClass();
            access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
            placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, function1);
        }

        public float current(VerticalRuler verticalRuler) {
            return Float.NaN;
        }

        public abstract LayoutCoordinates getCoordinates();

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i, int i2, float f) {
            long j = (i2 & BodyPartID.bodyIdMax) | (i << 32);
            access$handleMotionFrameOfReferencePlacement(this, placeable);
            placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), f, (Function1) null);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long j = (i << 32) | (i2 & BodyPartID.bodyIdMax);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                access$handleMotionFrameOfReferencePlacement(this, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), f, (Function1) null);
            } else {
                long parentWidth = (((getParentWidth() - placeable.width) - ((int) (j >> 32))) << 32) | (((int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                access$handleMotionFrameOfReferencePlacement(this, placeable);
                placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(parentWidth, placeable.apparentToRealOffset), f, (Function1) null);
            }
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, Function1 function1) {
            long j = (i2 & BodyPartID.bodyIdMax) | (i << 32);
            access$handleMotionFrameOfReferencePlacement(this, placeable);
            placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
        }
    }

    public abstract int get(AlignmentLine alignmentLine);

    public int getMeasuredHeight() {
        return (int) (this.measuredSize & BodyPartID.bodyIdMax);
    }

    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    public Object getParentData() {
        return null;
    }

    public final void onMeasuredSizeChanged() {
        this.width = RangesKt___RangesKt.coerceIn((int) (this.measuredSize >> 32), Constraints.m1027getMinWidthimpl(this.measurementConstraints), Constraints.m1025getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt___RangesKt.coerceIn((int) (this.measuredSize & BodyPartID.bodyIdMax), Constraints.m1026getMinHeightimpl(this.measurementConstraints), Constraints.m1024getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = (((i - ((int) (j >> 32))) / 2) << 32) | (BodyPartID.bodyIdMax & ((r0 - ((int) (j & BodyPartID.bodyIdMax))) / 2));
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        mo836placeAtf8xVGno(j, f, (Function1) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo836placeAtf8xVGno(long j, float f, Function1 function1);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m852setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m1055equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m853setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m1019equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }
}
