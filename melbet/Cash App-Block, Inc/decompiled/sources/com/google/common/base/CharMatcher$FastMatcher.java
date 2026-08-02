package com.google.common.base;

/* loaded from: classes4.dex */
public abstract class CharMatcher$FastMatcher implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return matches(((Character) obj).charValue());
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public abstract boolean matches(char c);
}
