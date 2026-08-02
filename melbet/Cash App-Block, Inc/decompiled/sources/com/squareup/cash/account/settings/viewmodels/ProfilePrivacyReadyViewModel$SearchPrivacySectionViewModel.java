package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel {

    /* loaded from: classes7.dex */
    public final class Content implements ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel {
        public final PrivacySetting searchByEmail;
        public final PrivacySetting searchByName;
        public final PrivacySetting searchByPhone;

        public final class PrivacySetting {
            public final List aliases;
            public final boolean isChecked;
            public final boolean isEnabled;

            public PrivacySetting(List list, boolean z, boolean z2) {
                list.getClass();
                this.isEnabled = z;
                this.isChecked = z2;
                this.aliases = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrivacySetting)) {
                    return false;
                }
                PrivacySetting privacySetting = (PrivacySetting) obj;
                return this.isEnabled == privacySetting.isEnabled && this.isChecked == privacySetting.isChecked && Intrinsics.areEqual(this.aliases, privacySetting.aliases);
            }

            public final int hashCode() {
                return this.aliases.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isEnabled) * 31, 31, this.isChecked);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("PrivacySetting(isEnabled=", ", isChecked=", ", aliases=", this.isEnabled, this.isChecked), this.aliases, ")");
            }
        }

        public Content(PrivacySetting privacySetting, PrivacySetting privacySetting2, PrivacySetting privacySetting3) {
            this.searchByName = privacySetting;
            this.searchByPhone = privacySetting2;
            this.searchByEmail = privacySetting3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.searchByName.equals(content.searchByName) && this.searchByPhone.equals(content.searchByPhone) && this.searchByEmail.equals(content.searchByEmail);
        }

        public final int hashCode() {
            return this.searchByEmail.hashCode() + ((this.searchByPhone.hashCode() + (this.searchByName.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Content(searchByName=" + this.searchByName + ", searchByPhone=" + this.searchByPhone + ", searchByEmail=" + this.searchByEmail + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class None implements ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 32544782;
        }

        public final String toString() {
            return "None";
        }
    }
}
