package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class AndroidClipboardManager {
    public ClipboardManager _clipboardManager;
    public final Context context;

    public AndroidClipboardManager(Context context) {
        this.context = context;
    }

    public final ClipboardManager getClipboardManager() {
        ClipboardManager clipboardManager = this._clipboardManager;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.context.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this._clipboardManager = clipboardManager2;
        return clipboardManager2;
    }
}
