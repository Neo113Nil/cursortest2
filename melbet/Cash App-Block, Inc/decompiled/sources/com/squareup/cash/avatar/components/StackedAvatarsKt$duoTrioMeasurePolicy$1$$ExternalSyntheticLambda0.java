package com.squareup.cash.avatar.components;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Placeable f$0;
    public final /* synthetic */ Placeable f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Placeable f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3) {
        this.f$0 = placeable;
        this.f$1 = placeable2;
        this.f$2 = i;
        this.f$4 = i2;
        this.f$3 = placeable3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Placeable placeable = this.f$3;
        int i2 = this.f$4;
        int i3 = this.f$2;
        Placeable placeable2 = this.f$1;
        Placeable placeable3 = this.f$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.getClass();
                placementScope.placeRelative(placeable3, 0, 0, RecyclerView.DECELERATION_RATE);
                if (placeable2 != null) {
                    placementScope.placeRelative(placeable2, i3, i3, RecyclerView.DECELERATION_RATE);
                }
                placementScope.placeRelative(placeable, i2, i2, RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.getClass();
                placementScope.placeRelative(placeable3, 0, 0, RecyclerView.DECELERATION_RATE);
                int i4 = i3 + i2;
                placementScope.placeRelative(placeable2, i4, 0, RecyclerView.DECELERATION_RATE);
                placementScope.placeRelative(placeable, i4 * 2, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StackedAvatarsKt$duoTrioMeasurePolicy$1$$ExternalSyntheticLambda0(Placeable placeable, Placeable placeable2, int i, Placeable placeable3, int i2) {
        this.f$0 = placeable;
        this.f$1 = placeable2;
        this.f$2 = i;
        this.f$3 = placeable3;
        this.f$4 = i2;
    }
}
