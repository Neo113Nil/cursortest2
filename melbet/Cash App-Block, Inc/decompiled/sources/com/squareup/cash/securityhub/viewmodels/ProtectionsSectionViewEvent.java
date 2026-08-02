package com.squareup.cash.securityhub.viewmodels;

/* loaded from: classes7.dex */
public interface ProtectionsSectionViewEvent {

    public final class EducationCardTapped implements ProtectionsSectionViewEvent {
        public final EducationCardId id;

        public EducationCardTapped(EducationCardId educationCardId) {
            this.id = educationCardId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EducationCardTapped) && this.id == ((EducationCardTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "EducationCardTapped(id=" + this.id + ")";
        }
    }

    public final class SettingsRowTapped implements ProtectionsSectionViewEvent {
        public final ProtectionsSettingsRowId id;

        public SettingsRowTapped(ProtectionsSettingsRowId protectionsSettingsRowId) {
            this.id = protectionsSettingsRowId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SettingsRowTapped) && this.id == ((SettingsRowTapped) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "SettingsRowTapped(id=" + this.id + ")";
        }
    }

    public final class SupportRowTapped implements ProtectionsSectionViewEvent {
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
