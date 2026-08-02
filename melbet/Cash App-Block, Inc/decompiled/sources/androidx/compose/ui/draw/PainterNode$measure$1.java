package androidx.compose.ui.draw;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PainterNode$measure$1 extends Lambda implements Function1 {
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PainterNode$measure$1(Placeable placeable, int i) {
        super(1);
        this.$r8$classId = i;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Placeable placeable = this.$placeable;
        switch (i) {
            case 0:
                ((Placeable.PlacementScope) obj).placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                Placeable.PlacementScope.placeRelativeWithLayer$default((Placeable.PlacementScope) obj, this.$placeable, 0, 0, RecyclerView.DECELERATION_RATE, 12);
                break;
            default:
                ((Placeable.PlacementScope) obj).place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
