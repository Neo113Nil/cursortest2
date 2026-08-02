package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ArcadeAutofillSettingsDetailViewModel {

    public final class Content implements ArcadeAutofillSettingsDetailViewModel {
        public final boolean autofillEnabled;
        public final boolean buttonEnabled;
        public final String buttonText;
        public final DialogViewModel dialogViewModel;
        public final String footer;
        public final List inputFields;
        public final String subTitle;
        public final String title;

        public Content(String str, String str2, String str3, boolean z, String str4, boolean z2, List list, DialogViewModel dialogViewModel) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str4, list);
            this.title = str;
            this.subTitle = str2;
            this.footer = str3;
            this.autofillEnabled = z;
            this.buttonText = str4;
            this.buttonEnabled = z2;
            this.inputFields = list;
            this.dialogViewModel = dialogViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subTitle, content.subTitle) && Intrinsics.areEqual(this.footer, content.footer) && this.autofillEnabled == content.autofillEnabled && Intrinsics.areEqual(this.buttonText, content.buttonText) && this.buttonEnabled == content.buttonEnabled && Intrinsics.areEqual(this.inputFields, content.inputFields) && Intrinsics.areEqual(this.dialogViewModel, content.dialogViewModel);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.footer;
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.autofillEnabled), 31, this.buttonText), 31, this.buttonEnabled), 31, this.inputFields);
            DialogViewModel dialogViewModel = this.dialogViewModel;
            return m + (dialogViewModel != null ? dialogViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subTitle=", this.subTitle, ", footer=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.footer, ", autofillEnabled=", this.autofillEnabled, ", buttonText=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.buttonText, ", buttonEnabled=", this.buttonEnabled, ", inputFields=");
            m.append(this.inputFields);
            m.append(", dialogViewModel=");
            m.append(this.dialogViewModel);
            m.append(")");
            return m.toString();
        }
    }

    public final class ErrorViewModel implements ArcadeAutofillSettingsDetailViewModel {
        public final String ctaButton;
        public final String subtitle;
        public final String title;

        public ErrorViewModel(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.subtitle = str2;
            this.ctaButton = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorViewModel)) {
                return false;
            }
            ErrorViewModel errorViewModel = (ErrorViewModel) obj;
            return Intrinsics.areEqual(this.title, errorViewModel.title) && Intrinsics.areEqual(this.subtitle, errorViewModel.subtitle) && Intrinsics.areEqual(this.ctaButton, errorViewModel.ctaButton);
        }

        public final int hashCode() {
            return this.ctaButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorViewModel(title=", this.title, ", subtitle=", this.subtitle, ", ctaButton="), this.ctaButton, ")");
        }
    }

    public final class LoadingViewModel implements ArcadeAutofillSettingsDetailViewModel {
        public static final LoadingViewModel INSTANCE = new LoadingViewModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingViewModel);
        }

        public final int hashCode() {
            return 1832883279;
        }

        public final String toString() {
            return "LoadingViewModel";
        }
    }

    public final class SuccessViewModel implements ArcadeAutofillSettingsDetailViewModel {
        public final String title;

        public SuccessViewModel(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessViewModel) && Intrinsics.areEqual(this.title, ((SuccessViewModel) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuccessViewModel(title=", this.title, ")");
        }
    }
}
