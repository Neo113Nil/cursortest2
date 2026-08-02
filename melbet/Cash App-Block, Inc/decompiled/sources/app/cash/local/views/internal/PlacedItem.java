package app.cash.local.views.internal;

import androidx.compose.ui.layout.Placeable;

/* loaded from: classes3.dex */
public final class PlacedItem {
    public final int lineIndex;
    public final Placeable placeable;
    public final int x;

    public PlacedItem(Placeable placeable, int i, int i2) {
        placeable.getClass();
        this.placeable = placeable;
        this.x = i;
        this.lineIndex = i2;
    }
}
