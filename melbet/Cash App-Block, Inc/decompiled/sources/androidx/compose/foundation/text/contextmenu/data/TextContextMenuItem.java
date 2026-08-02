package androidx.compose.foundation.text.contextmenu.data;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TextContextMenuItem extends TextContextMenuComponent {
    public final String label;
    public final int leadingIcon;
    public final Function1 onClick;

    public TextContextMenuItem(int i, Object obj, String str, Function1 function1) {
        super(obj);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.key);
        sb.append(", label=\"");
        sb.append(this.label);
        sb.append("\", leadingIcon=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.leadingIcon, ')');
    }
}
