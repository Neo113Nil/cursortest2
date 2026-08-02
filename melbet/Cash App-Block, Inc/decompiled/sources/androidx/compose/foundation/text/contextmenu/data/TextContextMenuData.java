package androidx.compose.foundation.text.contextmenu.data;

import androidx.compose.ui.util.ListUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class TextContextMenuData {
    public static final TextContextMenuData Empty = new TextContextMenuData(EmptyList.INSTANCE);
    public final List components;

    public TextContextMenuData(List list) {
        this.components = list;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "TextContextMenuData(components=", ListUtilsKt.fastJoinToString$default(56, "\n\t", this.components, null));
    }
}
