package coil3.compose;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ConstraintsSizeResolver$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;

    public /* synthetic */ ConstraintsSizeResolver$$ExternalSyntheticLambda0(Placeable placeable, int i) {
        this.$r8$classId = i;
        this.f$0 = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Placeable placeable = this.f$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 3:
                if (placementScope.getParentLayoutDirection() == LayoutDirection.Ltr || placementScope.getParentWidth() == 0) {
                    Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                    placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(0L, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, (Function1) null);
                } else {
                    Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                    placeable.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY((placementScope.getParentWidth() - placeable.width) << 32, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, (Function1) null);
                }
                break;
            case 4:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 5:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 6:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 7:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 8:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 9:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 10:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 11:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 12:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 13:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 14:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, -1.0f);
                break;
            case 15:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, 1.0f);
                break;
            case 16:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 17:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 18:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 19:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 20:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 21:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, 1.0f);
                break;
            case 22:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
