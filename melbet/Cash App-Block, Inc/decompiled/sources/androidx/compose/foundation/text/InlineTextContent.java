package androidx.compose.foundation.text;

import androidx.compose.ui.text.Placeholder;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class InlineTextContent {
    public final Function3 children;
    public final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, Function3 function3) {
        this.placeholder = placeholder;
        this.children = function3;
    }

    public final Function3 getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
