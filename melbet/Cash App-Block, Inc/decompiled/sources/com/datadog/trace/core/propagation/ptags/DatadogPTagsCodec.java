package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.core.propagation.ptags.TagElement;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.google.mlkit.vision.text.zzc;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class DatadogPTagsCodec extends PTagsCodec {
    public static final RatelimitedLogger log = new RatelimitedLogger(new zzc(4), 5, TimeUnit.MINUTES);
    public final int xDatadogTagsLimit;

    public DatadogPTagsCodec(int i) {
        this.xDatadogTagsLimit = i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendPrefix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags) {
        return pTagsFactory$PTags.getXDatadogTagsSize();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendSuffix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags, int i) {
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendTag(StringBuilder sb, TagElement tagElement, TagElement tagElement2, int i) {
        if (i <= this.xDatadogTagsLimit) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
            sb.append(tagElement.forType(encoding2));
            sb.append('=');
            sb.append(tagElement2.forType(encoding2));
        }
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int estimateHeaderSize(PTagsFactory$PTags pTagsFactory$PTags) {
        return pTagsFactory$PTags.getXDatadogTagsSize();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final PTagsFactory$PTags fromHeaderValue(Sniffer sniffer, String str) {
        int i;
        int i2;
        ArrayList arrayList = null;
        if (str == null) {
            return sniffer.createValid(null, null, null);
        }
        if (str.length() > this.xDatadogTagsLimit) {
            return sniffer.createInvalid();
        }
        int length = str.length();
        TagValue tagValue = null;
        int i3 = 0;
        TagValue tagValue2 = null;
        while (i3 < length) {
            int length2 = str.length();
            char c = '~';
            if (i3 < length2) {
                char charAt = str.charAt(i3);
                i = i3;
                while (charAt > ' ' && charAt <= '~' && charAt != ',' && charAt != '=') {
                    i++;
                    if (i < length2) {
                        charAt = str.charAt(i);
                        if (i < length2 - 1 && charAt == '=') {
                            break;
                        }
                    }
                    if (i >= length2) {
                        break;
                    }
                }
            }
            i = -1;
            RatelimitedLogger ratelimitedLogger = log;
            if (i < 0 || i == length) {
                ratelimitedLogger.warn("Invalid datadog tags header value: '{}' at {}", str, Integer.valueOf(i3));
                return sniffer.createInvalid();
            }
            int i4 = i + 1;
            int length3 = str.length();
            if (i4 < length3) {
                char charAt2 = str.charAt(i4);
                int i5 = i4;
                for (char c2 = ' '; charAt2 >= c2 && charAt2 <= c && charAt2 != ','; c2 = ' ') {
                    int i6 = i5 + 1;
                    if (i6 < length3) {
                        charAt2 = str.charAt(i6);
                        if (i6 < length3 - 1 && charAt2 == ',') {
                            i2 = i6;
                            break;
                        }
                    }
                    if (i6 >= length3) {
                        i2 = i6;
                        break;
                    }
                    i5 = i6;
                    c = '~';
                }
            }
            i2 = -1;
            if (i2 < 0) {
                ratelimitedLogger.warn("Invalid datadog tags header value: '{}' at {}", str, Integer.valueOf(i));
                return sniffer.createInvalid();
            }
            TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
            TagKey from = TagKey.from(encoding2, str, i3, i);
            TagValue from2 = TagValue.from(encoding2, str, i4, i2);
            if (from != null && !from.equals(PTagsCodec.UPSTREAM_SERVICES_DEPRECATED_TAG)) {
                boolean validateTagValue = PTagsCodec.validateTagValue(from, from2);
                TagKey tagKey = PTagsCodec.TRACE_ID_TAG;
                if (!validateTagValue) {
                    ratelimitedLogger.warn("Invalid datadog tags header value: '{}' invalid tag value at {}", str, Integer.valueOf(i4));
                    if (!from.equals(tagKey)) {
                        return sniffer.createInvalid();
                    }
                    Objects.toString(from2);
                    return sniffer.createInvalid();
                }
                if (from.equals(PTagsCodec.DECISION_MAKER_TAG)) {
                    tagValue2 = from2;
                } else if (from.equals(tagKey)) {
                    tagValue = from2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(6);
                    }
                    arrayList.add(from);
                    arrayList.add(from2);
                }
            }
            i3 = i2 + 1;
        }
        return sniffer.createValid(arrayList, tagValue2, tagValue);
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final boolean isEmpty(int i, StringBuilder sb) {
        return sb.length() == 0;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final boolean isTooLarge(int i) {
        return i > this.xDatadogTagsLimit;
    }
}
