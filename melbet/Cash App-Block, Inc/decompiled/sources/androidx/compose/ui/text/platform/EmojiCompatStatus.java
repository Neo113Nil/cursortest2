package androidx.compose.ui.text.platform;

import androidx.emoji2.text.EmojiCompat;
import coil3.Extras;

/* loaded from: classes.dex */
public final class EmojiCompatStatus {
    public static final Extras.Key delegate;

    static {
        Extras.Key key = new Extras.Key();
        key.f61default = EmojiCompat.isConfigured() ? key.getFontLoadState() : null;
        delegate = key;
    }
}
