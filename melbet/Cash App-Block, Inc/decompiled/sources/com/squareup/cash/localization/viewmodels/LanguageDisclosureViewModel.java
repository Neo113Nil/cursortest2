package com.squareup.cash.localization.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LanguageDisclosureViewModel {

    public final class Content implements LanguageDisclosureViewModel {
        public final Copy englishCopy;
        public final boolean isLocaleSettingsButtonEnabled;
        public final Copy spanishCopy;

        public final class Copy {
            public final String acceptCta;
            public final String disclaimer;
            public final String localeLabel;
            public final String subtitle;
            public final String termsBody;
            public final String termsHeader;
            public final String title;

            public Copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.localeLabel = str;
                this.title = str2;
                this.subtitle = str3;
                this.termsHeader = str4;
                this.termsBody = str5;
                this.disclaimer = str6;
                this.acceptCta = str7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Copy)) {
                    return false;
                }
                Copy copy = (Copy) obj;
                return this.localeLabel.equals(copy.localeLabel) && this.title.equals(copy.title) && this.subtitle.equals(copy.subtitle) && this.termsHeader.equals(copy.termsHeader) && this.termsBody.equals(copy.termsBody) && this.disclaimer.equals(copy.disclaimer) && this.acceptCta.equals(copy.acceptCta);
            }

            public final int hashCode() {
                return this.acceptCta.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.localeLabel.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.termsHeader), 31, this.termsBody), 31, this.disclaimer);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Copy(localeLabel=", this.localeLabel, ", title=", this.title, ", subtitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", termsHeader=", this.termsHeader, ", termsBody=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.termsBody, ", disclaimer=", this.disclaimer, ", acceptCta=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.acceptCta, ")");
            }
        }

        public Content(Copy copy, Copy copy2, boolean z) {
            copy.getClass();
            copy2.getClass();
            this.englishCopy = copy;
            this.spanishCopy = copy2;
            this.isLocaleSettingsButtonEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.englishCopy, content.englishCopy) && Intrinsics.areEqual(this.spanishCopy, content.spanishCopy) && this.isLocaleSettingsButtonEnabled == content.isLocaleSettingsButtonEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocaleSettingsButtonEnabled) + ((this.spanishCopy.hashCode() + (this.englishCopy.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(englishCopy=");
            sb.append(this.englishCopy);
            sb.append(", spanishCopy=");
            sb.append(this.spanishCopy);
            sb.append(", isLocaleSettingsButtonEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isLocaleSettingsButtonEnabled, ")");
        }
    }

    public final class Loading implements LanguageDisclosureViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 716928209;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
