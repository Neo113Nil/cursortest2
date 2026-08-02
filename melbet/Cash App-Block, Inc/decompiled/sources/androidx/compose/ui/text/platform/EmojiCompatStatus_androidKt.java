package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;

/* loaded from: classes.dex */
public abstract class EmojiCompatStatus_androidKt {
    public static final ImmutableBool Falsey = new ImmutableBool(false);

    public static final boolean access$getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle platformParagraphStyle;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        EmojiSupportMatch emojiSupportMatch = (platformTextStyle == null || (platformParagraphStyle = platformTextStyle.paragraphStyle) == null) ? null : new EmojiSupportMatch(platformParagraphStyle.emojiSupportMatch);
        boolean z = false;
        if (emojiSupportMatch != null && emojiSupportMatch.value == 1) {
            z = true;
        }
        return !z;
    }
}
