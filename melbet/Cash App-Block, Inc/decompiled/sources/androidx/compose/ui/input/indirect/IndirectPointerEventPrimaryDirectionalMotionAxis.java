package androidx.compose.ui.input.indirect;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {
    public final int value;

    public /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) {
            return this.value == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.value, ')');
    }
}
