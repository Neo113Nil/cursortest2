package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface ProfileHeaderMenuViewEvent {

    /* loaded from: classes6.dex */
    public final class CancelClicked implements ProfileHeaderMenuViewEvent {
        public static final CancelClicked INSTANCE = new CancelClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return -1433893497;
        }

        public final String toString() {
            return "CancelClicked";
        }
    }

    public final class Complete implements ProfileHeaderMenuViewEvent {
        public final ProfileHeaderMenuSheetResult result;

        public Complete(ProfileHeaderMenuSheetResult profileHeaderMenuSheetResult) {
            this.result = profileHeaderMenuSheetResult;
        }
    }
}
