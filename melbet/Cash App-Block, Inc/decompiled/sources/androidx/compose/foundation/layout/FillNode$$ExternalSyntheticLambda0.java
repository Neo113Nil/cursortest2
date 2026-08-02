package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class FillNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;

    public /* synthetic */ FillNode$$ExternalSyntheticLambda0(Placeable placeable, int i) {
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
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 3:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 4:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 5:
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 6:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 7:
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 8:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 9:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.getClass();
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
