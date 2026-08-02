package io.appmetrica.analytics.impl;

import defpackage.gvu0;
import kotlin.text.Regex;

/* renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0596oh implements Y2 {
    public final int a = 10;
    public final int b = 13;
    public final Regex c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.Y2
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        Character v0 = gvu0.v0(str);
        Character v02 = gvu0.v0(sb2);
        if (length2 < this.a || length2 > this.b || ((v02 != null && v02.charValue() == '0') || !this.c.h(str))) {
            return null;
        }
        if (length2 == 10 && (v0 == null || v0.charValue() != '+')) {
            return "7".concat(sb2);
        }
        if (length2 == 11) {
            if (v0 != null && v0.charValue() == '+' && v02 != null && v02.charValue() == '8') {
                return null;
            }
            if (v02 != null && v02.charValue() == '8') {
                return "7".concat(sb2.substring(1));
            }
        }
        if (length2 < 12 || v0 == null || v0.charValue() != '+' || v02 == null || v02.charValue() != '7') {
            return sb2;
        }
        return null;
    }
}
