package androidx.media3.common.text;

import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class VoiceSpan {
    public static final String FIELD_NAME;
    public final String name;

    static {
        String str = Util.DEVICE_DEBUG_INFO;
        FIELD_NAME = Integer.toString(0, 36);
    }

    public VoiceSpan(String str) {
        this.name = str;
    }
}
