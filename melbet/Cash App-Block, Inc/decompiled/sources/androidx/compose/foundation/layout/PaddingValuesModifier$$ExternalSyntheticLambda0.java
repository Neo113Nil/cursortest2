package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class PaddingValuesModifier$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PaddingValuesModifier$$ExternalSyntheticLambda0(int i, int i2, int i3, Placeable placeable) {
        this.$r8$classId = i3;
        this.f$0 = placeable;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        int i3 = this.f$1;
        Placeable placeable = this.f$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.place(placeable, i3, i2, RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.place(placeable, i3, i2, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
