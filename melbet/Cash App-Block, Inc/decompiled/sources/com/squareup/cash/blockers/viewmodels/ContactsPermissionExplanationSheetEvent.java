package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface ContactsPermissionExplanationSheetEvent {

    public final class OnCloseClick implements ContactsPermissionExplanationSheetEvent {
        public static final OnCloseClick INSTANCE = new OnCloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseClick);
        }

        public final int hashCode() {
            return 2027563975;
        }

        public final String toString() {
            return "OnCloseClick";
        }
    }

    /* loaded from: classes5.dex */
    public final class OnPrivacyNoticeClick implements ContactsPermissionExplanationSheetEvent {
        public static final OnPrivacyNoticeClick INSTANCE = new OnPrivacyNoticeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPrivacyNoticeClick);
        }

        public final int hashCode() {
            return -981059777;
        }

        public final String toString() {
            return "OnPrivacyNoticeClick";
        }
    }
}
