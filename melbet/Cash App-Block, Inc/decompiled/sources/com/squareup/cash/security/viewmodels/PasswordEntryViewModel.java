package com.squareup.cash.security.viewmodels;

import androidx.core.widget.PopupWindowCompat;
import com.squareup.cash.security.screens.PasswordScreenData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PasswordEntryViewModel {

    public final class Content implements PasswordEntryViewModel {
        public final PopupWindowCompat biometricsCheckboxModel;
        public final PasswordScreenData passwordScreenData;

        public Content(PasswordScreenData passwordScreenData, PopupWindowCompat popupWindowCompat) {
            passwordScreenData.getClass();
            this.passwordScreenData = passwordScreenData;
            this.biometricsCheckboxModel = popupWindowCompat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.passwordScreenData, content.passwordScreenData) && this.biometricsCheckboxModel.equals(content.biometricsCheckboxModel);
        }

        public final int hashCode() {
            return this.biometricsCheckboxModel.hashCode() + (this.passwordScreenData.hashCode() * 31);
        }

        public final String toString() {
            return "Content(passwordScreenData=" + this.passwordScreenData + ", biometricsCheckboxModel=" + this.biometricsCheckboxModel + ")";
        }
    }

    public final class Loading implements PasswordEntryViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1456177214;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
