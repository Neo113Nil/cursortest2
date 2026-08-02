package androidx.compose.ui.platform;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoClearFocusBehavior {
    public final int value;

    public /* synthetic */ AutoClearFocusBehavior(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AutoClearFocusBehavior m924boximpl(int i) {
        return new AutoClearFocusBehavior(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AutoClearFocusBehavior) {
            return this.value == ((AutoClearFocusBehavior) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AutoClearFocusBehavior(value=", this.value, ')');
    }
}
