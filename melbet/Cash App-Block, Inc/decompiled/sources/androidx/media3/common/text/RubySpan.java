package androidx.media3.common.text;

import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class RubySpan implements LanguageFeatureSpan {
    public static final String FIELD_POSITION;
    public static final String FIELD_TEXT;
    public final int position;
    public final String rubyText;

    static {
        String str = Util.DEVICE_DEBUG_INFO;
        FIELD_TEXT = Integer.toString(0, 36);
        FIELD_POSITION = Integer.toString(1, 36);
    }

    public RubySpan(String str, int i) {
        this.rubyText = str;
        this.position = i;
    }
}
