package com.squareup.cash.scrubbing;

/* loaded from: classes4.dex */
public final class UsSsnScrubber implements InsertingScrubber {
    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    public final String scrub(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        sb.append(sb2.toString());
        if (sb.length() > 5) {
            sb.insert(5, '-');
        }
        if (sb.length() > 3) {
            sb.insert(3, '-');
        }
        return sb.toString();
    }
}
