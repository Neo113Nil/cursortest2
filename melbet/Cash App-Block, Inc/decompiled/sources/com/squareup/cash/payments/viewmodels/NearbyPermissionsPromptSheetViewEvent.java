package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface NearbyPermissionsPromptSheetViewEvent {

    public final class OnCloseClicked implements NearbyPermissionsPromptSheetViewEvent {
        public static final OnCloseClicked INSTANCE = new OnCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseClicked);
        }

        public final int hashCode() {
            return 452268685;
        }

        public final String toString() {
            return "OnCloseClicked";
        }
    }

    public final class OnPermissionsAction implements NearbyPermissionsPromptSheetViewEvent {
        public static final OnPermissionsAction INSTANCE = new OnPermissionsAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPermissionsAction);
        }

        public final int hashCode() {
            return -452986084;
        }

        public final String toString() {
            return "OnPermissionsAction";
        }
    }
}
