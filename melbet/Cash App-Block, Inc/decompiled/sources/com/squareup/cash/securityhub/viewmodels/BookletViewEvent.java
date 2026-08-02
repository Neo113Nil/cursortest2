package com.squareup.cash.securityhub.viewmodels;

import com.squareup.cash.securityhub.screens.BookletId;

/* loaded from: classes7.dex */
public interface BookletViewEvent {

    public final class FeatureCardLinkTapped implements BookletViewEvent {
        public final BookletFeatureCardId cardId;

        public FeatureCardLinkTapped(BookletFeatureCardId bookletFeatureCardId) {
            bookletFeatureCardId.getClass();
            this.cardId = bookletFeatureCardId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeatureCardLinkTapped) && this.cardId == ((FeatureCardLinkTapped) obj).cardId;
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final String toString() {
            return "FeatureCardLinkTapped(cardId=" + this.cardId + ")";
        }
    }

    public final class NavigateBack implements BookletViewEvent {
        public static final NavigateBack INSTANCE = new NavigateBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 984862383;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    public final class RelatedBookletTapped implements BookletViewEvent {
        public final BookletId id;

        public RelatedBookletTapped(BookletId bookletId) {
            bookletId.getClass();
            this.id = bookletId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelatedBookletTapped) && this.id == ((RelatedBookletTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "RelatedBookletTapped(id=" + this.id + ")";
        }
    }

    public final class SupportRowTapped implements BookletViewEvent {
        public final SecurityEducationSupportRowId id;

        public SupportRowTapped(SecurityEducationSupportRowId securityEducationSupportRowId) {
            securityEducationSupportRowId.getClass();
            this.id = securityEducationSupportRowId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportRowTapped) && this.id == ((SupportRowTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "SupportRowTapped(id=" + this.id + ")";
        }
    }
}
