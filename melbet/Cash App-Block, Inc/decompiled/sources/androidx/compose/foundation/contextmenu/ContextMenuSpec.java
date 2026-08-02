package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.text.font.FontWeight;
import androidx.room.Room;

/* loaded from: classes3.dex */
public abstract class ContextMenuSpec {
    public static final BiasAlignment.Vertical LabelVerticalTextAlignment = Alignment.Companion.CenterVertically;
    public static final int LabelHorizontalTextAlignment = 5;
    public static final float HorizontalPadding = 12.0f;
    public static final float VerticalPadding = 8.0f;
    public static final float IconSize = 24.0f;
    public static final float DividerHeight = 1.0f;
    public static final float DividerVerticalPadding = 8.0f;
    public static final long FontSize = Room.getSp(14);
    public static final FontWeight FontWeight = FontWeight.Medium;
    public static final long LineHeight = Room.getSp(20);
    public static final long LetterSpacing = Room.pack(4294967296L, 0.1f);

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public static float m191getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
