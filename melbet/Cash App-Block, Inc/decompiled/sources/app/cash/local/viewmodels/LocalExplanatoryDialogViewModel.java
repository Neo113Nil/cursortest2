package app.cash.local.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalExplanatoryDialogViewModel {
    public final String message;
    public final PositiveButtonType positiveButtonType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PositiveButtonType {
        public static final /* synthetic */ PositiveButtonType[] $VALUES;
        public static final PositiveButtonType OK;
        public static final PositiveButtonType OPEN_SETTINGS;

        static {
            PositiveButtonType positiveButtonType = new PositiveButtonType("OK", 0);
            OK = positiveButtonType;
            PositiveButtonType positiveButtonType2 = new PositiveButtonType("OPEN_SETTINGS", 1);
            OPEN_SETTINGS = positiveButtonType2;
            $VALUES = new PositiveButtonType[]{positiveButtonType, positiveButtonType2};
        }

        public static PositiveButtonType valueOf(String str) {
            return (PositiveButtonType) Enum.valueOf(PositiveButtonType.class, str);
        }

        public static PositiveButtonType[] values() {
            return (PositiveButtonType[]) $VALUES.clone();
        }
    }

    public LocalExplanatoryDialogViewModel(String str, PositiveButtonType positiveButtonType) {
        str.getClass();
        this.message = str;
        this.positiveButtonType = positiveButtonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalExplanatoryDialogViewModel)) {
            return false;
        }
        LocalExplanatoryDialogViewModel localExplanatoryDialogViewModel = (LocalExplanatoryDialogViewModel) obj;
        return Intrinsics.areEqual(this.message, localExplanatoryDialogViewModel.message) && this.positiveButtonType == localExplanatoryDialogViewModel.positiveButtonType;
    }

    public final int hashCode() {
        return this.positiveButtonType.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "LocalExplanatoryDialogViewModel(message=" + this.message + ", positiveButtonType=" + this.positiveButtonType + ")";
    }
}
