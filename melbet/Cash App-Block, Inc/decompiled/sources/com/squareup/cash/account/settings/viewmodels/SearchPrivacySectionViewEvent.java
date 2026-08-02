package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes5.dex */
public interface SearchPrivacySectionViewEvent {

    /* loaded from: classes7.dex */
    public final class GoBack implements SearchPrivacySectionViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 781770740;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class SearchSettingType {
        public static final /* synthetic */ SearchSettingType[] $VALUES;
        public static final SearchSettingType EMAIL;
        public static final SearchSettingType NAME;
        public static final SearchSettingType PHONE_NUMBER;

        static {
            SearchSettingType searchSettingType = new SearchSettingType("NAME", 0);
            NAME = searchSettingType;
            SearchSettingType searchSettingType2 = new SearchSettingType("PHONE_NUMBER", 1);
            PHONE_NUMBER = searchSettingType2;
            SearchSettingType searchSettingType3 = new SearchSettingType("EMAIL", 2);
            EMAIL = searchSettingType3;
            $VALUES = new SearchSettingType[]{searchSettingType, searchSettingType2, searchSettingType3};
        }

        public static SearchSettingType valueOf(String str) {
            return (SearchSettingType) Enum.valueOf(SearchSettingType.class, str);
        }

        public static SearchSettingType[] values() {
            return (SearchSettingType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes7.dex */
    public final class SettingToggled implements SearchPrivacySectionViewEvent {
        public final boolean isChecked;

        /* renamed from: type, reason: collision with root package name */
        public final SearchSettingType f1042type;

        public SettingToggled(SearchSettingType searchSettingType, boolean z) {
            this.f1042type = searchSettingType;
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingToggled)) {
                return false;
            }
            SettingToggled settingToggled = (SettingToggled) obj;
            return this.f1042type == settingToggled.f1042type && this.isChecked == settingToggled.isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked) + (this.f1042type.hashCode() * 31);
        }

        public final String toString() {
            return "SettingToggled(type=" + this.f1042type + ", isChecked=" + this.isChecked + ")";
        }
    }

    public final class SettingsViewed implements SearchPrivacySectionViewEvent {
        public static final SettingsViewed INSTANCE = new SettingsViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingsViewed);
        }

        public final int hashCode() {
            return 1975135500;
        }

        public final String toString() {
            return "SettingsViewed";
        }
    }
}
