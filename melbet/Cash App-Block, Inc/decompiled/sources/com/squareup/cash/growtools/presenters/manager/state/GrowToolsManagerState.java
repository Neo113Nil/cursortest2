package com.squareup.cash.growtools.presenters.manager.state;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes6.dex */
public final class GrowToolsManagerState {
    public final ParcelableSnapshotMutableState showDialog$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState isInteractive$delegate = Updater.mutableStateOf$default(Boolean.TRUE);

    public final class ShowDialog {

        /* renamed from: type, reason: collision with root package name */
        public final DialogType f1143type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DialogType {
            public static final /* synthetic */ DialogType[] $VALUES;
            public static final DialogType ERROR;
            public static final DialogType TOGGLE_OFF_CONFIRMATION;

            static {
                DialogType dialogType = new DialogType("TOGGLE_OFF_CONFIRMATION", 0);
                TOGGLE_OFF_CONFIRMATION = dialogType;
                DialogType dialogType2 = new DialogType("ERROR", 1);
                ERROR = dialogType2;
                $VALUES = new DialogType[]{dialogType, dialogType2};
            }

            public static DialogType valueOf(String str) {
                return (DialogType) Enum.valueOf(DialogType.class, str);
            }

            public static DialogType[] values() {
                return (DialogType[]) $VALUES.clone();
            }
        }

        public ShowDialog(DialogType dialogType) {
            this.f1143type = dialogType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDialog) && this.f1143type == ((ShowDialog) obj).f1143type;
        }

        public final int hashCode() {
            return this.f1143type.hashCode();
        }

        public final String toString() {
            return "ShowDialog(type=" + this.f1143type + ")";
        }
    }

    public final boolean isInteractive() {
        return ((Boolean) this.isInteractive$delegate.getValue()).booleanValue();
    }

    public final void setInteractive(boolean z) {
        this.isInteractive$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowDialog(ShowDialog showDialog) {
        this.showDialog$delegate.setValue(showDialog);
    }
}
