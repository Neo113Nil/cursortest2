package com.squareup.cash.securityhub.viewmodels;

/* loaded from: classes7.dex */
public interface RecoveryGuideViewEvent {

    public final class BookletTapped implements RecoveryGuideViewEvent {
        public final EducationCardId id;

        public BookletTapped(EducationCardId educationCardId) {
            educationCardId.getClass();
            this.id = educationCardId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookletTapped) && this.id == ((BookletTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "BookletTapped(id=" + this.id + ")";
        }
    }

    public final class NavigateBack implements RecoveryGuideViewEvent {
        public static final NavigateBack INSTANCE = new NavigateBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -1481587260;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    public final class RowTapped implements RecoveryGuideViewEvent {
        public final RecoveryGuideRowId id;

        public RowTapped(RecoveryGuideRowId recoveryGuideRowId) {
            recoveryGuideRowId.getClass();
            this.id = recoveryGuideRowId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RowTapped) && this.id == ((RowTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "RowTapped(id=" + this.id + ")";
        }
    }
}
