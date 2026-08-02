package com.squareup.cash.common.composeui;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class SegmentedCircleKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SegmentedCircleKt$$ExternalSyntheticLambda1(Placeable placeable, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = placeable;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Placeable placeable = this.f$0;
        int i3 = this.f$1;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.getClass();
                placementScope.place(placeable, i3, i2, RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                placementScope.place(placeable, MathKt__MathJVMKt.roundToInt((i3 - placeable.width) / 2.0f), MathKt__MathJVMKt.roundToInt((i2 - placeable.height) / 2.0f), RecyclerView.DECELERATION_RATE);
                break;
            default:
                placementScope.place(placeable, MathKt__MathJVMKt.roundToInt((i3 - placeable.width) / 2.0f), MathKt__MathJVMKt.roundToInt((i2 - placeable.height) / 2.0f), RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SegmentedCircleKt$$ExternalSyntheticLambda1(int i, int i2, int i3, Placeable placeable) {
        this.$r8$classId = i3;
        this.f$1 = i;
        this.f$0 = placeable;
        this.f$2 = i2;
    }
}
