package androidx.compose.foundation.text.contextmenu.builder;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;

/* loaded from: classes3.dex */
public final class TextContextMenuBuilderScope {
    public final MutableObjectList components = new MutableObjectList();
    public final MutableObjectList filters = new MutableObjectList();

    public final void separator() {
        this.components.add(TextContextMenuSeparator.INSTANCE);
    }
}
