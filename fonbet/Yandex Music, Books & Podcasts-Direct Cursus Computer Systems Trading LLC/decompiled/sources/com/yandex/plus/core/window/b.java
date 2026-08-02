package com.yandex.plus.core.window;

/* loaded from: classes4.dex */
public final class b {
    public static final b b = new b(0);
    public static final b c = new b(1);
    public static final b d = new b(2);
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "WindowHeightSizeClass: ".concat(equals(b) ? "COMPACT" : equals(c) ? "MEDIUM" : equals(d) ? "EXPANDED" : "UNKNOWN");
    }
}
