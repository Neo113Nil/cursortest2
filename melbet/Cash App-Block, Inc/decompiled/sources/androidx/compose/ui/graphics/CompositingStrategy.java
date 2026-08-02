package androidx.compose.ui.graphics;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class CompositingStrategy {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m697toStringimpl(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CompositingStrategy(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CompositingStrategy) {
            return this.value == ((CompositingStrategy) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m697toStringimpl(this.value);
    }
}
