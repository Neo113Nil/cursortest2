package com.onesignal.core.internal.backend.impl;

import Q7.i;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {
    private static final int BYTE_MASK = 255;
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    private static final int HEX_NYBBLE_MASK = 15;
    private static final int HEX_NYBBLE_SHIFT = 4;
    private static final int PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE = 3;
    public static final d INSTANCE = new d();
    private static final i FEATURES_SDK_VERSION_LABEL_REGEX = new i("^\\d{6}(-[^/\\s]+)?$");

    private d() {
    }

    private final boolean isUnreservedByte(int i) {
        if (65 <= i && i < 91) {
            return true;
        }
        if (97 > i || i >= 123) {
            return (48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126;
        }
        return true;
    }

    public final String buildGetPath(String appId, String platform, String sdkVersion) {
        h.e(appId, "appId");
        h.e(platform, "platform");
        h.e(sdkVersion, "sdkVersion");
        return "apps/" + appId + "/sdk/features/" + percentEncodePathSegmentUtf8$com_onesignal_core(platform) + '/' + percentEncodePathSegmentUtf8$com_onesignal_core(sdkVersion);
    }

    public final boolean isValidFeaturesSdkVersionLabel(String label) {
        h.e(label, "label");
        i iVar = FEATURES_SDK_VERSION_LABEL_REGEX;
        iVar.getClass();
        return iVar.f2685n.matcher(label).matches();
    }

    public final String percentEncodePathSegmentUtf8$com_onesignal_core(String segment) {
        h.e(segment, "segment");
        byte[] bytes = segment.getBytes(Q7.a.f2664a);
        h.d(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder(bytes.length * 3);
        for (byte b9 : bytes) {
            int i = b9 & 255;
            if (INSTANCE.isUnreservedByte(i)) {
                sb.append((char) i);
            } else {
                sb.append('%');
                sb.append(HEX_DIGITS.charAt(i >> 4));
                sb.append(HEX_DIGITS.charAt(b9 & 15));
            }
        }
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }
}
