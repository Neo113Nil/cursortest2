package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.platform.AndroidClipboard;

/* loaded from: classes.dex */
public final class ClipboardPasteState {
    public boolean _hasText;
    public final AndroidClipboard clipboard;

    public ClipboardPasteState(AndroidClipboard androidClipboard) {
        this.clipboard = androidClipboard;
    }
}
