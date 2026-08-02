package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;

/* loaded from: classes6.dex */
public final class RoadModifier implements ParentDataModifier {
    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(Density density, Object obj) {
        density.getClass();
        return new CollapsingToolbarRoadData();
    }
}
