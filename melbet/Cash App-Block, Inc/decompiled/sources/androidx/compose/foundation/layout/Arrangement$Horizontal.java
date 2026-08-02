package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface Arrangement$Horizontal {
    void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

    /* renamed from: getSpacing-D9Ej5fM */
    default float mo252getSpacingD9Ej5fM() {
        return RecyclerView.DECELERATION_RATE;
    }
}
