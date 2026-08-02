package androidx.compose.ui.text;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class EmojiSupportMatch {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m963toStringimpl(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EmojiSupportMatch) {
            return this.value == ((EmojiSupportMatch) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m963toStringimpl(this.value);
    }
}
