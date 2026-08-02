package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SkipToLookaheadSizeNode$measure$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkipToLookaheadSizeNode$measure$1$1(Placeable placeable, int i) {
        super(1);
        this.$r8$classId = i;
        this.$this_run = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Placeable placeable = this.$this_run;
        switch (i) {
            case 0:
                ((Placeable.PlacementScope) obj).place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                ((Placeable.PlacementScope) obj).place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                ((Placeable.PlacementScope) obj).place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            default:
                ((Placeable.PlacementScope) obj).placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
