package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface ColumnScope {
    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    Modifier weight(float f, Modifier modifier, boolean z);
}
