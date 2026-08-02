package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface WindowInsets {
    int getBottom(Density density);

    int getLeft(Density density, LayoutDirection layoutDirection);

    int getRight(Density density, LayoutDirection layoutDirection);

    int getTop(Density density);
}
