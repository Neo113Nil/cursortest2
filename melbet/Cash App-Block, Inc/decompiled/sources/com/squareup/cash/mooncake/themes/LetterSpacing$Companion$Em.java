package com.squareup.cash.mooncake.themes;

/* loaded from: classes.dex */
public final class LetterSpacing$Companion$Em implements LetterSpacing {
    public final float value;

    public final boolean equals(Object obj) {
        if (obj instanceof LetterSpacing$Companion$Em) {
            return Float.compare(this.value, ((LetterSpacing$Companion$Em) obj).value) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return this.value + "em";
    }
}
