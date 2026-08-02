package androidx.compose.ui.input.pointer;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {

    /* renamed from: type, reason: collision with root package name */
    public final int f857type;

    public AndroidPointerIconType(int i) {
        this.f857type = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f857type == ((AndroidPointerIconType) obj).f857type;
    }

    public final int hashCode() {
        return this.f857type;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("AndroidPointerIcon(type="), this.f857type, ')');
    }
}
