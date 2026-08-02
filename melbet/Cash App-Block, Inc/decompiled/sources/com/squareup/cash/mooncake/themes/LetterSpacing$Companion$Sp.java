package com.squareup.cash.mooncake.themes;

/* loaded from: classes.dex */
public final class LetterSpacing$Companion$Sp implements LetterSpacing {
    public final float value;

    public final boolean equals(Object obj) {
        if (obj instanceof LetterSpacing$Companion$Sp) {
            return Float.compare(this.value, ((LetterSpacing$Companion$Sp) obj).value) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return this.value + "sp";
    }
}
