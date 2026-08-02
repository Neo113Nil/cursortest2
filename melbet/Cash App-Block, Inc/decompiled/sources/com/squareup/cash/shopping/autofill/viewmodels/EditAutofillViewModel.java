package com.squareup.cash.shopping.autofill.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class EditAutofillViewModel {

    public final class Content extends EditAutofillViewModel {
        public final boolean buttonEnabled;
        public final String buttonText;
        public final DialogViewModel dialogViewModel;
        public final String footer;
        public final ArrayList inputFields;
        public final String subTitle;
        public final String title;

        public Content(String str, String str2, String str3, String str4, boolean z, ArrayList arrayList, DialogViewModel dialogViewModel) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.title = str;
            this.subTitle = str2;
            this.footer = str3;
            this.buttonText = str4;
            this.buttonEnabled = z;
            this.inputFields = arrayList;
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
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subTitle, content.subTitle) && Intrinsics.areEqual(this.footer, content.footer) && Intrinsics.areEqual(this.buttonText, content.buttonText) && this.buttonEnabled == content.buttonEnabled && this.inputFields.equals(content.inputFields) && Intrinsics.areEqual(this.dialogViewModel, content.dialogViewModel);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.inputFields, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subTitle), 31, this.footer), 31, this.buttonText), 31, this.buttonEnabled), 31);
            DialogViewModel dialogViewModel = this.dialogViewModel;
            return m + (dialogViewModel == null ? 0 : dialogViewModel.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subTitle=", this.subTitle, ", footer=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.footer, ", buttonText=", this.buttonText, ", buttonEnabled=");
            m.append(this.buttonEnabled);
            m.append(", inputFields=");
            m.append(this.inputFields);
            m.append(", dialogViewModel=");
            m.append(this.dialogViewModel);
            m.append(")");
            return m.toString();
        }
    }

    public final class ErrorViewModel extends EditAutofillViewModel {
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

    public final class LoadingViewModel extends EditAutofillViewModel {
        public static final LoadingViewModel INSTANCE = new LoadingViewModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingViewModel);
        }

        public final int hashCode() {
            return -431768859;
        }

        public final String toString() {
            return "LoadingViewModel";
        }
    }

    public final class SuccessViewModel extends EditAutofillViewModel {
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
