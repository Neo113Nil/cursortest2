package com.google.common.base;

/* loaded from: classes4.dex */
public final class CharMatcher$Is extends CharMatcher$FastMatcher {
    public final char match;

    public CharMatcher$Is(char c) {
        this.match = c;
    }

    @Override // com.google.common.base.CharMatcher$FastMatcher
    public final boolean matches(char c) {
        return c == this.match;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.match;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
