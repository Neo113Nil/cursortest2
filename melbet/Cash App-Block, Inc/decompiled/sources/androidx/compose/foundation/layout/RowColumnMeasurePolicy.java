package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;

/* loaded from: classes.dex */
public interface RowColumnMeasurePolicy {
    /* renamed from: createConstraints-xF2OJ5Q */
    long mo260createConstraintsxF2OJ5Q(int i, int i2, boolean z, int i3);

    int crossAxisSize(Placeable placeable);

    int mainAxisSize(Placeable placeable);

    MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6);

    void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope);
}
