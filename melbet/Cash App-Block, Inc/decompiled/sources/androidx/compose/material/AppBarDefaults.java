package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class AppBarDefaults {
    public static final PaddingValuesImpl ContentPadding;

    static {
        Modifier modifier = AppBarKt.TitleInsetWithoutIcon;
        ContentPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(4.0f, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 10);
    }
}
