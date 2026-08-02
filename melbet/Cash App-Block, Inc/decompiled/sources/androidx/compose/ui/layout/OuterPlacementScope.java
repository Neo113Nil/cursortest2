package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.RulerTrackingMap;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class OuterPlacementScope extends Placeable.PlacementScope {
    public final /* synthetic */ int $r8$classId;
    public final Object owner;

    public /* synthetic */ OuterPlacementScope(Object obj, int i) {
        this.$r8$classId = i;
        this.owner = obj;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public float current(VerticalRuler verticalRuler) {
        float intBitsToFloat;
        int indexOf;
        switch (this.$r8$classId) {
            case 1:
                Function2 function2 = verticalRuler.calculate;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                LookaheadCapablePlaceable lookaheadCapablePlaceable = (LookaheadCapablePlaceable) this.owner;
                if (lookaheadCapablePlaceable.isPlacingForAlignment) {
                    return Float.NaN;
                }
                LookaheadCapablePlaceable lookaheadCapablePlaceable2 = lookaheadCapablePlaceable;
                while (true) {
                    RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable2.rulerValues;
                    if (!Float.isNaN((rulerTrackingMap == null || (indexOf = ArraysKt___ArraysKt.indexOf((VerticalRuler[]) rulerTrackingMap.rulers, verticalRuler)) < 0) ? Float.NaN : ((float[]) rulerTrackingMap.values)[indexOf])) {
                        lookaheadCapablePlaceable2.addRulerReader(lookaheadCapablePlaceable.getLayoutNode(), verticalRuler);
                        LayoutCoordinates coordinates = lookaheadCapablePlaceable2.getCoordinates();
                        LayoutCoordinates coordinates2 = lookaheadCapablePlaceable.getCoordinates();
                        switch (verticalRuler.$r8$classId) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (coordinates2.mo839localPositionOfR5De75A(coordinates, (Float.floatToRawIntBits(r2) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(((int) (coordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) / 2.0f))) >> 32));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (coordinates2.mo839localPositionOfR5De75A(coordinates, (Float.floatToRawIntBits(r2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((int) (coordinates.mo838getSizeYbymL2g() >> 32)) / 2.0f) << 32)) & BodyPartID.bodyIdMax));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    LookaheadCapablePlaceable parent = lookaheadCapablePlaceable2.getParent();
                    if (parent == null) {
                        lookaheadCapablePlaceable2.addRulerReader(lookaheadCapablePlaceable.getLayoutNode(), verticalRuler);
                        return Float.NaN;
                    }
                    lookaheadCapablePlaceable2 = parent;
                }
                break;
            default:
                return super.current(verticalRuler);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutCoordinates getCoordinates() {
        int i = this.$r8$classId;
        Object obj = this.owner;
        switch (i) {
            case 0:
                return (NodeCoordinator) ((AndroidComposeView) obj).root.nodes.outerCoordinator;
            default:
                LookaheadCapablePlaceable lookaheadCapablePlaceable = (LookaheadCapablePlaceable) obj;
                LayoutCoordinates coordinates = lookaheadCapablePlaceable.isPlacingForAlignment ? null : lookaheadCapablePlaceable.getCoordinates();
                if (coordinates == null) {
                    lookaheadCapablePlaceable.getLayoutNode().layoutDelegate.onCoordinatesUsed();
                }
                return coordinates;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        int i = this.$r8$classId;
        Object obj = this.owner;
        switch (i) {
            case 0:
                return ((AndroidComposeView) obj).getDensity().getDensity();
            default:
                return ((LookaheadCapablePlaceable) obj).getDensity();
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        int i = this.$r8$classId;
        Object obj = this.owner;
        switch (i) {
            case 0:
                return ((AndroidComposeView) obj).getDensity().getFontScale();
            default:
                return ((LookaheadCapablePlaceable) obj).getFontScale();
        }
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutDirection getParentLayoutDirection() {
        int i = this.$r8$classId;
        Object obj = this.owner;
        switch (i) {
            case 0:
                return (LayoutDirection) ((AndroidComposeView) obj).layoutDirection$delegate.getValue();
            default:
                return ((LookaheadCapablePlaceable) obj).getLayoutDirection();
        }
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final int getParentWidth() {
        int i = this.$r8$classId;
        Object obj = this.owner;
        switch (i) {
            case 0:
                return ((AndroidComposeView) obj).root.getWidth();
            default:
                return ((LookaheadCapablePlaceable) obj).getMeasuredWidth();
        }
    }
}
