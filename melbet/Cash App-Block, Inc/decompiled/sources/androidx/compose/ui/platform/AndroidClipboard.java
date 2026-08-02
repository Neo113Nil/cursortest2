package androidx.compose.ui.platform;

import com.google.android.gms.internal.mlkit_genai_prompt.zzagk;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AndroidClipboard {
    public final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    public final Unit setClipEntry(ClipEntry clipEntry) {
        AndroidClipboardManager androidClipboardManager = this.androidClipboardManager;
        if (clipEntry == null) {
            zzagk.clearPrimaryClip(androidClipboardManager.getClipboardManager());
        } else {
            androidClipboardManager.getClipboardManager().setPrimaryClip(clipEntry.getClipData());
        }
        return Unit.INSTANCE;
    }
}
