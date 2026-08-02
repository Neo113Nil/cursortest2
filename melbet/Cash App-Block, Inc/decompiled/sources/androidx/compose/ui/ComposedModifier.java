package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class ComposedModifier extends TestTagKt implements Modifier.Element {
    public final Function3 factory;

    public ComposedModifier(Function3 function3) {
        this.factory = function3;
    }
}
