package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class StampGridCells implements GridCells {
    public static final StampGridCells INSTANCE = new StampGridCells();
    public static final GridCells.Fixed sevenCells = new GridCells.Fixed(7);
    public static final GridCells.Fixed sixCells = new GridCells.Fixed(6);

    @Override // androidx.compose.foundation.lazy.grid.GridCells
    public final ArrayList calculateCrossAxisCellSizes(Density density, int i, int i2) {
        density.getClass();
        return (((float) ((i - (i2 * 6)) / 7)) >= density.mo236toPx0680j_4(88.0f) ? sevenCells : sixCells).calculateCrossAxisCellSizes(density, i, i2);
    }
}
