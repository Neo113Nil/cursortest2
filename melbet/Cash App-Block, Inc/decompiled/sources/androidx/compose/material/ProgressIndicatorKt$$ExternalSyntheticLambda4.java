package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ProgressIndicatorKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ProgressIndicatorKt$$ExternalSyntheticLambda4(Placeable placeable, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = placeable;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Placeable placeable = this.f$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.place(placeable, 0, -i2, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                placementScope.place(placeable, 0, -i2, RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                placementScope.place(placeable, -i2, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 3:
                placementScope.getClass();
                placementScope.place(placeable, i2, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 4:
                placementScope.getClass();
                placementScope.place(placeable, (i2 - placeable.width) / 2, (i2 - placeable.height) / 2, RecyclerView.DECELERATION_RATE);
                break;
            case 5:
                placementScope.getClass();
                placementScope.place(placeable, 0, -i2, RecyclerView.DECELERATION_RATE);
                break;
            case 6:
                placementScope.getClass();
                placementScope.place(placeable, 0, -i2, RecyclerView.DECELERATION_RATE);
                break;
            case 7:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, i2, RecyclerView.DECELERATION_RATE);
                break;
            case 8:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, -((placeable.height - i2) / 2), RecyclerView.DECELERATION_RATE);
                break;
            case 9:
                placementScope.getClass();
                placementScope.place(placeable, -i2, 0, RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, -i2, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
