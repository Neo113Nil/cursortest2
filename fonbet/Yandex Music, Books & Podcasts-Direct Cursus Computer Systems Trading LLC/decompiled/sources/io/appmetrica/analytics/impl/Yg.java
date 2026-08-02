package io.appmetrica.analytics.impl;

import defpackage.mlr;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Yg implements Y2 {
    public final int a = 10;
    public final int b = 13;
    public final Regex c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.Y2
    public final String a(@NotNull String str) {
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
        Character H = mlr.H(str);
        Character H2 = mlr.H(sb2);
        if (length2 < this.a || length2 > this.b || ((H2 != null && H2.charValue() == '0') || !this.c.e(str))) {
            return null;
        }
        if (length2 == 10 && (H == null || H.charValue() != '+')) {
            return "7".concat(sb2);
        }
        if (length2 == 11) {
            if (H != null && H.charValue() == '+' && H2 != null && H2.charValue() == '8') {
                return null;
            }
            if (H2 != null && H2.charValue() == '8') {
                return "7".concat(sb2.substring(1));
            }
        }
        if (length2 < 12 || H == null || H.charValue() != '+' || H2 == null || H2.charValue() != '7') {
            return sb2;
        }
        return null;
    }
}
