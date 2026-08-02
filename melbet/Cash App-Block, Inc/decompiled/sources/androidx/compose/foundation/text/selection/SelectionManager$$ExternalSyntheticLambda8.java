package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function6;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionManager$$ExternalSyntheticLambda8 implements Function6 {
    public final /* synthetic */ SelectionManager f$0;

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
        long j = ((Offset) obj3).packedValue;
        SelectionManager selectionManager = this.f$0;
        long m443convertToContainerCoordinatesR5De75A = selectionManager.m443convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
        long m443convertToContainerCoordinatesR5De75A2 = selectionManager.m443convertToContainerCoordinatesR5De75A(layoutCoordinates, ((Offset) obj4).packedValue);
        selectionManager.setInTouchMode(booleanValue);
        return Boolean.valueOf(selectionManager.m444updateSelectionjyLRC_s$foundation(m443convertToContainerCoordinatesR5De75A, m443convertToContainerCoordinatesR5De75A2, ((Boolean) obj5).booleanValue(), (SelectionAdjustment$Companion$$ExternalSyntheticLambda0) obj6));
    }
}
