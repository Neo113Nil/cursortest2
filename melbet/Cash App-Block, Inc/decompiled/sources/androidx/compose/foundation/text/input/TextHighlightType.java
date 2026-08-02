package androidx.compose.foundation.text.input;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class TextHighlightType {
    public final int value;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m383equalsimpl0(int i) {
        return i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextHighlightType) {
            return this.value == ((TextHighlightType) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextHighlightType(value=", this.value, ')');
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m384unboximpl() {
        return this.value;
    }
}
