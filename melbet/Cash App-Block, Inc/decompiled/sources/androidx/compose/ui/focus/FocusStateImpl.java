package androidx.compose.ui.focus;

import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FocusStateImpl {
    public static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active;
    public static final FocusStateImpl ActiveParent;
    public static final FocusStateImpl Captured;
    public static final FocusStateImpl Inactive;

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        Active = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        ActiveParent = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        Captured = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        Inactive = focusStateImpl4;
        $VALUES = new FocusStateImpl[]{focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    public final boolean getHasFocus() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    public final boolean isFocused() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return true;
    }
}
