package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface RowScope {
    Modifier align(Modifier modifier, BiasAlignment.Vertical vertical);

    Modifier weight(float f, Modifier modifier, boolean z);
}
