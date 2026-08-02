package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy$measure$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $placeables;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedEnterExitMeasurePolicy$measure$1(Object obj, int i) {
        super(1);
        this.$r8$classId = i;
        this.$placeables = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$placeables;
        switch (i) {
            case 0:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    placementScope.place((Placeable) arrayList.get(i2), 0, 0, RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            default:
                ((Placeable.PlacementScope) obj).place((Placeable) obj2, 0, 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
        }
    }
}
