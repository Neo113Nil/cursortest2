package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class BoxMeasurePolicy$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ MeasureScope f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ BoxMeasurePolicy$$ExternalSyntheticLambda1(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i, int i2, BoxMeasurePolicy boxMeasurePolicy) {
        this.f$0 = placeable;
        this.f$1 = measurable;
        this.f$2 = measureScope;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = boxMeasurePolicy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$5;
        MeasureScope measureScope = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                BoxKt.access$placeInBox((Placeable.PlacementScope) obj, (Placeable) obj4, (Measurable) obj3, measureScope.getLayoutDirection(), this.f$3, this.f$4, ((BoxMeasurePolicy) obj2).alignment);
                break;
            default:
                Placeable[] placeableArr = (Placeable[]) obj4;
                ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj3;
                int[] iArr = (int[]) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int length = placeableArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Placeable placeable = placeableArr[i2];
                    int i4 = i3 + 1;
                    placeable.getClass();
                    Object parentData = placeable.getParentData();
                    RowColumnParentData rowColumnParentData = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
                    LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                    SpacerKt spacerKt = rowColumnParentData != null ? rowColumnParentData.crossAxisAlignment : null;
                    int i5 = this.f$3;
                    placementScope.place(placeable, spacerKt != null ? spacerKt.align$foundation_layout(i5, placeable.width, layoutDirection, placeable, this.f$4) : columnMeasurePolicy.horizontalAlignment.align(placeable.width, i5, layoutDirection), iArr[i3], RecyclerView.DECELERATION_RATE);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BoxMeasurePolicy$$ExternalSyntheticLambda1(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr) {
        this.f$0 = placeableArr;
        this.f$1 = columnMeasurePolicy;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$2 = measureScope;
        this.f$5 = iArr;
    }
}
