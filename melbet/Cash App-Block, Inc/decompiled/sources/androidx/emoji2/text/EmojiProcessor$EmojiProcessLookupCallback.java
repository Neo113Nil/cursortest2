package androidx.emoji2.text;

/* loaded from: classes3.dex */
public final class EmojiProcessor$EmojiProcessLookupCallback implements EmojiProcessor$EmojiProcessCallback {
    public final int mOffset;
    public int start = -1;
    public int end = -1;

    public EmojiProcessor$EmojiProcessLookupCallback(int i) {
        this.mOffset = i;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final Object getResult() {
        return this;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        int i3 = this.mOffset;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.start = i;
        this.end = i2;
        return false;
    }
}
