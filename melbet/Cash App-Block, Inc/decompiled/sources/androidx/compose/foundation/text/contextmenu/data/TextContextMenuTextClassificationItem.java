package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class TextContextMenuTextClassificationItem extends TextContextMenuComponent {
    public final int index;
    public final TextClassification textClassification;

    public TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.key);
        sb.append(", textClassification=");
        sb.append(this.textClassification);
        sb.append(", index=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.index, ')');
    }
}
