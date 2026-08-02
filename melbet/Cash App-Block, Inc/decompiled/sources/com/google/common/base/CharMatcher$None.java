package com.google.common.base;

/* loaded from: classes4.dex */
public final class CharMatcher$None extends CharMatcher$NamedFastMatcher {
    public static final CharMatcher$None INSTANCE = new CharMatcher$None("CharMatcher.none()");

    @Override // com.google.common.base.CharMatcher$FastMatcher
    public final int countIn(CharSequence charSequence) {
        charSequence.getClass();
        return 0;
    }

    @Override // com.google.common.base.CharMatcher$FastMatcher
    public final boolean matches(char c) {
        return false;
    }
}
