package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.trace.core.propagation.ptags.TagElement;

/* loaded from: classes4.dex */
public abstract class PTagsCodec {
    public static final TagKey DECISION_MAKER_TAG = TagKey.from("dm");
    public static final TagKey TRACE_ID_TAG = TagKey.from("tid");
    public static final TagKey UPSTREAM_SERVICES_DEPRECATED_TAG = TagKey.from("upstream_services");

    public static int calcXDatadogTagsSize(int i, TagKey tagKey, TagValue tagValue) {
        if (tagValue == null) {
            return i;
        }
        if (i > 0) {
            i++;
        }
        int length = tagValue.length() + Boxes$$ExternalSyntheticOutline1.m(i, 1, tagKey.none);
        TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
        return length + 6;
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean validateTagValue(TagKey tagKey, TagValue tagValue) {
        int i;
        int length;
        if (tagKey.equals(DECISION_MAKER_TAG)) {
            int i2 = tagValue.source;
            char convertDDtoW3C = i2 != 0 ? TagValue.convertDDtoW3C('-') : '-';
            CharSequence charSequence = tagValue.values[i2];
            int length2 = charSequence.length();
            int i3 = -1;
            for (int i4 = 0; i4 < length2; i4++) {
                if (charSequence.charAt(i4) == convertDDtoW3C) {
                    i3 = i4;
                }
            }
            if (i3 >= 0 && ((i3 == 0 || i3 == 10) && (i = i3 + 1) != (length = tagValue.length()))) {
                for (int i5 = 0; i5 < i3; i5++) {
                    char charAt = tagValue.charAt(i5);
                    if ((charAt < 'a' || charAt > 'f') && !isDigit(charAt)) {
                        return false;
                    }
                }
                for (i = i3 + 1; i < length; i++) {
                    if (!isDigit(tagValue.charAt(i))) {
                        break;
                    }
                }
            }
            return false;
        }
        if (!tagKey.equals(TRACE_ID_TAG)) {
            return true;
        }
        if (tagValue.length() == 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                char charAt2 = tagValue.charAt(i6);
                if ((charAt2 < 'a' || charAt2 > 'f') && !isDigit(charAt2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int appendPrefix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags);

    public abstract int appendSuffix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags, int i);

    public abstract int appendTag(StringBuilder sb, TagElement tagElement, TagElement tagElement2, int i);

    public abstract int estimateHeaderSize(PTagsFactory$PTags pTagsFactory$PTags);

    public abstract PTagsFactory$PTags fromHeaderValue(Sniffer sniffer, String str);

    public abstract boolean isEmpty(int i, StringBuilder sb);

    public abstract boolean isTooLarge(int i);
}
