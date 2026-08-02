package androidx.compose.ui.input.pointer;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    public final int packedValue;

    public /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PointerKeyboardModifiers) {
            return this.packedValue == ((PointerKeyboardModifiers) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.packedValue);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PointerKeyboardModifiers(packedValue=", this.packedValue, ')');
    }
}
