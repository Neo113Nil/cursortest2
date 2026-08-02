package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.core.propagation.ptags.TagElement;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzc;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class W3CPTagsCodec extends PTagsCodec {
    public static final RatelimitedLogger log = new RatelimitedLogger(new zzc(4), 5, TimeUnit.MINUTES);
    public static final int EMPTY_SIZE = 3;

    public final class W3CPTags extends PTagsFactory$PTags {
        public final int ddMemberStart;
        public final int ddMemberValueEnd;
        public final int maxUnknownSize;

        public W3CPTags(Sniffer sniffer, ArrayList arrayList, TagValue tagValue, TagValue tagValue2, int i, TagValue tagValue3, String str, int i2, int i3, int i4) {
            super(sniffer, arrayList, tagValue, tagValue2, i, tagValue3);
            this.tracestate = str;
            this.ddMemberStart = i2;
            this.ddMemberValueEnd = i3;
            this.maxUnknownSize = i4;
        }

        @Override // com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags
        public final void updateTraceIdHighOrderBits(long j) {
            long j2 = this.traceIdHighOrderBits;
            if (j2 != 0 && j2 != j) {
                LongStringUtils.toHexStringPadded(16, j2);
            }
            super.updateTraceIdHighOrderBits(j);
        }
    }

    public static W3CPTags empty(Sniffer sniffer, String str, int i, int i2) {
        return new W3CPTags(sniffer, null, null, null, -128, null, str, i, i2, 0);
    }

    public static int findNextMember(int i, String str) {
        int length = str.length();
        if (i < 0) {
            return -1;
        }
        if (i >= length) {
            return length;
        }
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t' && charAt != ',') {
                break;
            }
            i++;
        }
        return i;
    }

    public static int parseIntDecimal(int i, int i2, String str) {
        boolean z;
        int i3 = 0;
        if (i < 0 || i > i2 || i2 > str.length()) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            return 0;
        }
        if (i >= i2) {
            throw new NumberFormatException("");
        }
        char charAt = str.charAt(i);
        int i4 = -2147483647;
        if (charAt < '0') {
            if (charAt == '-') {
                z = true;
                i4 = PKIFailureInfo.systemUnavail;
            } else {
                if (charAt != '+') {
                    throw new NumberFormatException(str);
                }
                z = false;
            }
            i++;
            if (i == i2) {
                throw new NumberFormatException(str);
            }
        } else {
            z = false;
        }
        int i5 = i4 / 10;
        while (i < i2) {
            int charAt2 = str.charAt(i) - '0';
            if (charAt2 < 0 || charAt2 > 9 || i3 < i5) {
                throw new NumberFormatException(str);
            }
            int i6 = i3 * 10;
            if (i6 < i4 + charAt2) {
                throw new NumberFormatException(str);
            }
            i++;
            i3 = i6 - charAt2;
        }
        return z ? i3 : -i3;
    }

    public static int stripTrailingOWC(int i, int i2, String str) {
        int i3 = i2 - 1;
        char charAt = str.charAt(i3);
        while (true) {
            if ((charAt == ' ' || charAt == '\t') && i3 > i) {
                i3--;
                charAt = str.charAt(i3);
            }
        }
        return i3 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
    
        if (r0 <= '~') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0025, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002f, code lost:
    
        if (r0 != ':') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int validateCharsUntilSeparatorOrEnd(String str, int i, int i2, char c, boolean z, TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0) {
        if (i >= i2) {
            return -1;
        }
        char charAt = str.charAt(i);
        boolean z2 = false;
        do {
            if (z && (charAt == ' ' || charAt == '\t')) {
                if (charAt == '\t') {
                    z2 = true;
                }
            } else {
                if (z2) {
                    return -1;
                }
                switch (transportImpl$$ExternalSyntheticLambda0.$r8$classId) {
                    case 9:
                        if (charAt > ' ') {
                            if (charAt <= '~') {
                                break;
                            }
                        }
                        break;
                    default:
                        if (charAt >= ' ') {
                        }
                        break;
                }
                boolean z3 = false;
                if (!z3 || charAt == c) {
                    return -1;
                }
            }
            i++;
            if (i < i2) {
                charAt = str.charAt(i);
                if (i < i2 - 1 && charAt == c) {
                    return i;
                }
            }
        } while (i < i2);
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendPrefix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags) {
        sb.append("dd=");
        if (pTagsFactory$PTags.samplingPriority != -128) {
            sb.append("s:");
            sb.append(pTagsFactory$PTags.samplingPriority);
        }
        CharSequence charSequence = pTagsFactory$PTags.origin;
        if (charSequence != null) {
            if (sb.length() > EMPTY_SIZE) {
                sb.append(';');
            }
            sb.append("o:");
            if (charSequence instanceof TagValue) {
                sb.append(((TagValue) charSequence).forType(TagElement.Encoding.W3C));
            } else {
                sb.append(charSequence);
            }
        }
        return sb.length();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendSuffix(StringBuilder sb, PTagsFactory$PTags pTagsFactory$PTags, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i < 256 && (pTagsFactory$PTags instanceof W3CPTags)) {
            W3CPTags w3CPTags = (W3CPTags) pTagsFactory$PTags;
            if (w3CPTags.maxUnknownSize != 0 && (i3 = w3CPTags.ddMemberStart) != -1 && i3 < w3CPTags.ddMemberValueEnd) {
                String str = w3CPTags.tracestate;
                int i6 = w3CPTags.ddMemberStart + EMPTY_SIZE;
                int i7 = i;
                while (i6 < w3CPTags.ddMemberValueEnd && i < 256) {
                    int indexOf = str.indexOf(59, i6);
                    if (indexOf < 0) {
                        indexOf = w3CPTags.ddMemberValueEnd;
                    }
                    TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
                    if (!str.startsWith("t.", i6)) {
                        char charAt = str.charAt(i6);
                        if (str.charAt(i6 + 1) != ':' || (charAt != 'o' && charAt != 's')) {
                            if (sb.length() > EMPTY_SIZE) {
                                sb.append(';');
                                i5 = i + 1;
                            } else {
                                i5 = i;
                            }
                            int stripTrailingOWC = indexOf == w3CPTags.ddMemberValueEnd ? stripTrailingOWC(i6, indexOf, str) : indexOf;
                            sb.append((CharSequence) str, i6, stripTrailingOWC);
                            i4 = (stripTrailingOWC - i6) + i5;
                            i6 = indexOf + 1;
                            i7 = i;
                            i = i4;
                        }
                    }
                    i4 = i;
                    i6 = indexOf + 1;
                    i7 = i;
                    i = i4;
                }
                if (i > 256) {
                    sb.setLength(i7);
                    i = i7;
                }
            }
        }
        if (i == EMPTY_SIZE) {
            sb.setLength(0);
            i = 0;
        }
        String str2 = pTagsFactory$PTags.tracestate;
        if (str2 == null) {
            i2 = i;
        } else {
            int i8 = pTagsFactory$PTags instanceof W3CPTags ? ((W3CPTags) pTagsFactory$PTags).ddMemberStart : -1;
            int i9 = i == 0 ? 32 : 31;
            int length = str2.length();
            int findNextMember = findNextMember(0, str2);
            i2 = i;
            while (findNextMember < length) {
                int indexOf2 = str2.indexOf(44, findNextMember);
                if (indexOf2 < 0) {
                    indexOf2 = length;
                }
                if (i8 == -1 && str2.startsWith("dd=", findNextMember)) {
                    i8 = findNextMember;
                }
                if (findNextMember != i8) {
                    if (sb.length() > 0) {
                        sb.append(',');
                        i2++;
                    }
                    int stripTrailingOWC2 = stripTrailingOWC(findNextMember, indexOf2, str2);
                    sb.append((CharSequence) str2, findNextMember, stripTrailingOWC2);
                    i2 += stripTrailingOWC2 - findNextMember;
                    i9--;
                }
                findNextMember = i9 == 0 ? length : findNextMember(indexOf2 + 1, str2);
            }
        }
        return i2 != i ? Math.max(i, EMPTY_SIZE + 1) : i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int appendTag(StringBuilder sb, TagElement tagElement, TagElement tagElement2, int i) {
        int i2;
        TagElement.Encoding encoding2 = TagElement.Encoding.W3C;
        if (i >= 256) {
            return i;
        }
        if (i > EMPTY_SIZE) {
            sb.append(';');
            i2 = i + 1;
        } else {
            i2 = i;
        }
        CharSequence forType = tagElement.forType(encoding2);
        sb.append(forType);
        int length = forType.length() + i2;
        sb.append(':');
        CharSequence forType2 = tagElement2.forType(encoding2);
        sb.append(forType2);
        int length2 = forType2.length() + length + 1;
        if (length2 <= 256) {
            return length2;
        }
        sb.setLength(i);
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final int estimateHeaderSize(PTagsFactory$PTags pTagsFactory$PTags) {
        int length;
        int xDatadogTagsSize = pTagsFactory$PTags.getXDatadogTagsSize() + EMPTY_SIZE + 1;
        if (pTagsFactory$PTags.origin != null) {
            xDatadogTagsSize += pTagsFactory$PTags.origin.length() + 3;
        }
        if (pTagsFactory$PTags.samplingPriority != -128) {
            xDatadogTagsSize += 5;
        }
        if (pTagsFactory$PTags instanceof W3CPTags) {
            W3CPTags w3CPTags = (W3CPTags) pTagsFactory$PTags;
            xDatadogTagsSize += w3CPTags.maxUnknownSize;
            if (w3CPTags.ddMemberStart == -1) {
                return xDatadogTagsSize;
            }
            length = w3CPTags.tracestate.length() - (w3CPTags.ddMemberValueEnd - w3CPTags.ddMemberStart);
        } else {
            if (pTagsFactory$PTags.tracestate == null) {
                return xDatadogTagsSize;
            }
            length = pTagsFactory$PTags.tracestate.length();
        }
        return length + xDatadogTagsSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if (r18 == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r5 >= r15) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        if (r6 <= 15) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        r11 = r2.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        if (r11 < 'a') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (r11 > r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
    
        r5 = r5 + 1;
        r6 = r6 + 1;
        r0 = 'z';
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bd, code lost:
    
        if (r6 != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c4, code lost:
    
        if (com.datadog.trace.core.propagation.ptags.PTagsCodec.isDigit(r11) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
    
        if (r11 == '_') goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (r11 == '-') goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d0, code lost:
    
        if (r11 == '*') goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d4, code lost:
    
        if (r11 != '/') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d9, code lost:
    
        if (r11 != '=') goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00db, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e5, code lost:
    
        if (r5 < r15) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.datadog.trace.core.propagation.ptags.TagValue, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v31 */
    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PTagsFactory$PTags fromHeaderValue(Sniffer sniffer, String str) {
        int i;
        boolean z;
        boolean z2;
        String str2 = str;
        ?? r0 = 0;
        if (str2 == null || str2.isEmpty()) {
            return sniffer.createValid(null, null, null);
        }
        int length = str2.length();
        int findNextMember = findNextMember(0, str2);
        if (findNextMember == length) {
            return sniffer.createValid(null, null, null);
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int i8 = 1;
            if (findNextMember >= length) {
                int i9 = i2;
                if (i5 == i9) {
                    return empty(sniffer, str2, i9, i9);
                }
                int i10 = i6;
                TagValue tagValue = null;
                TagValue tagValue2 = null;
                TagValue tagValue3 = null;
                int i11 = 0;
                int i12 = -128;
                ArrayList arrayList = null;
                while (i10 < i4) {
                    int validateCharsUntilSeparatorOrEnd = validateCharsUntilSeparatorOrEnd(str2, i10, i4, ':', false, new TransportImpl$$ExternalSyntheticLambda0(9));
                    RatelimitedLogger ratelimitedLogger = log;
                    if (validateCharsUntilSeparatorOrEnd < 0 || validateCharsUntilSeparatorOrEnd == i4) {
                        ratelimitedLogger.warn("Invalid datadog tags header value: '{}' at {}", str, Integer.valueOf(i10));
                        return empty(sniffer, str, i7, i4);
                    }
                    int i13 = i10;
                    int i14 = validateCharsUntilSeparatorOrEnd + 1;
                    TagValue tagValue4 = tagValue;
                    str2 = str;
                    int validateCharsUntilSeparatorOrEnd2 = validateCharsUntilSeparatorOrEnd(str2, i14, i4, ';', true, new TransportImpl$$ExternalSyntheticLambda0(10));
                    if (validateCharsUntilSeparatorOrEnd2 < 0) {
                        ratelimitedLogger.warn("Invalid datadog tags header value: '{}' at {}", str2, Integer.valueOf(validateCharsUntilSeparatorOrEnd));
                        return empty(sniffer, str2, i7, i4);
                    }
                    int i15 = validateCharsUntilSeparatorOrEnd2 + 1;
                    if (validateCharsUntilSeparatorOrEnd2 == i4) {
                        validateCharsUntilSeparatorOrEnd2 = stripTrailingOWC(i14, validateCharsUntilSeparatorOrEnd2, str2);
                    }
                    TagElement.Encoding encoding2 = TagElement.Encoding.W3C;
                    TagKey from = TagKey.from(encoding2, str2, i13, validateCharsUntilSeparatorOrEnd);
                    if (from != null) {
                        TagValue from2 = TagValue.from(encoding2, str2, i14, validateCharsUntilSeparatorOrEnd2);
                        if (!from.equals(PTagsCodec.UPSTREAM_SERVICES_DEPRECATED_TAG)) {
                            boolean validateTagValue = PTagsCodec.validateTagValue(from, from2);
                            TagKey tagKey = PTagsCodec.TRACE_ID_TAG;
                            if (!validateTagValue) {
                                ratelimitedLogger.warn("Invalid datadog tags header value: '{}' invalid tag value at {}", str2, Integer.valueOf(i14));
                                if (!from.equals(tagKey)) {
                                    return empty(sniffer, str2, i7, i4);
                                }
                                Objects.toString(from2);
                                return sniffer.createInvalid();
                            }
                            if (from.equals(PTagsCodec.DECISION_MAKER_TAG)) {
                                tagValue = from2;
                                i10 = i15;
                            } else if (from.equals(tagKey)) {
                                tagValue2 = from2;
                            } else {
                                ArrayList arrayList2 = arrayList == null ? new ArrayList(6) : arrayList;
                                arrayList2.add(from);
                                arrayList2.add(from2);
                                arrayList = arrayList2;
                            }
                        }
                    } else {
                        int i16 = validateCharsUntilSeparatorOrEnd - i13;
                        char charAt = str2.charAt(i13);
                        int i17 = 1;
                        if (i16 == 1) {
                            if (charAt == 's') {
                                try {
                                    i12 = parseIntDecimal(i14, validateCharsUntilSeparatorOrEnd2, str2);
                                } catch (Exception unused) {
                                    i12 = -128;
                                }
                            } else {
                                i17 = 1;
                            }
                        }
                        if (i16 == i17 && charAt == 'o') {
                            tagValue3 = TagValue.from(encoding2, str2, i14, validateCharsUntilSeparatorOrEnd2);
                        } else {
                            if (i11 != 0) {
                                i11++;
                            }
                            i11 = (validateCharsUntilSeparatorOrEnd2 - i13) + i11;
                        }
                        tagValue = tagValue4;
                        i10 = i15;
                    }
                    tagValue = tagValue4;
                    i10 = i15;
                }
                return new W3CPTags(sniffer, arrayList, tagValue, tagValue2, i12, tagValue3, str2, i7, i4, i11);
            }
            if (i3 == 32) {
                return sniffer.createValid(r0, r0, r0);
            }
            if (i5 == i2 && str2.startsWith("dd=", findNextMember)) {
                i7 = findNextMember;
                i5 = i3;
            }
            int length2 = str2.length();
            int i18 = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            if (findNextMember >= 0 && findNextMember < length2) {
                int i19 = 1;
                int i20 = 0;
                while (true) {
                    char c = 'z';
                    if (findNextMember < length2) {
                        if (i19 > 242 && (i20 != 0 || i19 > i18)) {
                            break;
                        }
                        char charAt2 = str2.charAt(findNextMember);
                        if (charAt2 < 'a' || charAt2 > 'z') {
                            if (!PTagsCodec.isDigit(charAt2)) {
                                if (i19 == i8) {
                                    break;
                                }
                                if (charAt2 != '_' && charAt2 != '-' && charAt2 != '*' && charAt2 != '/') {
                                    if (charAt2 == '=') {
                                        if (i20 == 0) {
                                            findNextMember++;
                                        }
                                    } else if (charAt2 == '@' && i19 <= 242) {
                                        findNextMember++;
                                        i20 = 1;
                                    }
                                    if (findNextMember >= 0) {
                                        return sniffer.createValid(null, null, null);
                                    }
                                    if (i6 == -1 && i5 != -1) {
                                        i6 = findNextMember;
                                    }
                                    int length3 = str2.length();
                                    if (findNextMember >= 0 && findNextMember < length3) {
                                        int i21 = findNextMember;
                                        boolean z3 = true;
                                        boolean z4 = true;
                                        boolean z5 = false;
                                        int i22 = 1;
                                        int i23 = 0;
                                        while (i21 < length3) {
                                            if (!z5) {
                                                i23 = i22 - 1;
                                            }
                                            if (i23 > 256) {
                                                break;
                                            }
                                            char charAt3 = str2.charAt(i21);
                                            int i24 = length3;
                                            if (charAt3 != ' ') {
                                                if (charAt3 != '\t') {
                                                    if (charAt3 != ',') {
                                                        if (!z3 || charAt3 < ' ' || charAt3 > '~' || charAt3 == ',' || charAt3 == '=') {
                                                            break;
                                                        }
                                                        z = false;
                                                        z2 = false;
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    z = z4;
                                                    z3 = false;
                                                    z2 = true;
                                                }
                                            } else {
                                                z = z4;
                                                z2 = true;
                                            }
                                            i21++;
                                            i22++;
                                            z4 = z;
                                            z5 = z2;
                                            length3 = i24;
                                        }
                                        if (!z4 && (z5 || i22 <= 257)) {
                                            i = i21;
                                            if (i >= 0) {
                                                return sniffer.createValid(null, null, null);
                                            }
                                            if (i4 == -1 && i5 != -1) {
                                                i4 = i;
                                            }
                                            int findNextMember2 = findNextMember(i, str2);
                                            if (findNextMember2 < 0) {
                                                return sniffer.createValid(null, null, null);
                                            }
                                            i3++;
                                            findNextMember = findNextMember2;
                                            r0 = 0;
                                            i2 = -1;
                                        }
                                    }
                                    i = -1;
                                    if (i >= 0) {
                                    }
                                }
                            } else if (i19 == i8) {
                                i20 = i8;
                            }
                        }
                        findNextMember++;
                        i19++;
                        i18 = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        i8 = 1;
                    } else {
                        break;
                    }
                }
            }
            findNextMember = -1;
            if (findNextMember >= 0) {
            }
        }
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final boolean isEmpty(int i, StringBuilder sb) {
        return i <= EMPTY_SIZE;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    public final boolean isTooLarge(int i) {
        return i > 256;
    }
}
