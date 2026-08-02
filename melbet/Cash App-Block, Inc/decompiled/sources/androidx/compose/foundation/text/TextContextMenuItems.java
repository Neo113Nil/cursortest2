package androidx.compose.foundation.text;

import android.R;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;

/* loaded from: classes3.dex */
public enum TextContextMenuItems {
    Cut(TextContextMenuKeys.CutKey, R.string.cut, R.attr.actionModeCutDrawable),
    Copy(TextContextMenuKeys.CopyKey, R.string.copy, R.attr.actionModeCopyDrawable),
    Paste(TextContextMenuKeys.PasteKey, R.string.paste, R.attr.actionModePasteDrawable),
    SelectAll(TextContextMenuKeys.SelectAllKey, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(TextContextMenuKeys.AutofillKey, R.string.autofill, 0);

    public final int drawableId;
    public final Object key;
    public final int stringId;

    TextContextMenuItems(Object obj, int i, int i2) {
        this.key = obj;
        this.stringId = i;
        this.drawableId = i2;
    }

    /* renamed from: getDrawableId-3I4p1mQ, reason: not valid java name */
    public final int m363getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc, reason: not valid java name */
    public final int m364getStringId9Hzcbyc() {
        return this.stringId;
    }
}
