package com.google.common.base;

import android.text.TextUtils;
import androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback;
import androidx.emoji2.text.TypefaceEmojiRasterizer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class Joiner implements EmojiProcessor$EmojiProcessCallback, CaptchaAnalyticsEvent {
    public final String separator;

    public Joiner(String str) {
        str.getClass();
        this.separator = str;
    }

    public static Joiner on() {
        return new Joiner(Marker.ANY_NON_NULL_MARKER);
    }

    public static Joiner parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte >> 1;
        int readUnsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((readUnsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        m.append(i < 10 ? ".0" : ".");
        m.append(i);
        return new Joiner(Boxes$$ExternalSyntheticOutline1.m(readUnsignedByte2, readUnsignedByte2 < 10 ? ".0" : ".", m), false);
    }

    public static CharSequence toString(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void appendTo$1(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(toString(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.separator);
                    sb.append(toString(it.next()));
                }
            }
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
        }
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return "elements.captcha.passive.success";
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public Object getResult() {
        return this;
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public String getSiteKey() {
        return this.separator;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.separator)) {
            return true;
        }
        typefaceEmojiRasterizer.mCache = (typefaceEmojiRasterizer.mCache & 3) | 4;
        return false;
    }

    public boolean isValid() {
        return !this.separator.isEmpty();
    }

    public String join(Iterator it) {
        StringBuilder sb = new StringBuilder();
        appendTo$1(sb, it);
        return sb.toString();
    }

    public /* synthetic */ Joiner(String str, boolean z) {
        this.separator = str;
    }

    public String join(Iterable iterable) {
        return join(iterable.iterator());
    }
}
