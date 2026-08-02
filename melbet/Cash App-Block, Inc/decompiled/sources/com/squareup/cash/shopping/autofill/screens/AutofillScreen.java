package com.squareup.cash.shopping.autofill.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.webview.android.WebViewUseCase;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class AutofillScreen implements Screen {

    /* loaded from: classes7.dex */
    public final class OfferAutofillScreen extends AutofillScreen implements BottomSheetScreen {
        public static final Parcelable.Creator<OfferAutofillScreen> CREATOR = new BoostDetailsScreen.Creator(28);
        public final AutofillAnalyticsParam analyticsParam;
        public final Redacted capturedData;
        public final Redacted cardData;
        public final WebViewUseCase paymentMethod;
        public final AskedQuestion question;
        public final String shippingAddressId;

        public OfferAutofillScreen(WebViewUseCase webViewUseCase, String str, Redacted redacted, Redacted redacted2, AutofillAnalyticsParam autofillAnalyticsParam, AskedQuestion askedQuestion) {
            webViewUseCase.getClass();
            str.getClass();
            redacted.getClass();
            redacted2.getClass();
            askedQuestion.getClass();
            this.paymentMethod = webViewUseCase;
            this.shippingAddressId = str;
            this.cardData = redacted;
            this.capturedData = redacted2;
            this.analyticsParam = autofillAnalyticsParam;
            this.question = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferAutofillScreen)) {
                return false;
            }
            OfferAutofillScreen offerAutofillScreen = (OfferAutofillScreen) obj;
            return this.paymentMethod == offerAutofillScreen.paymentMethod && Intrinsics.areEqual(this.shippingAddressId, offerAutofillScreen.shippingAddressId) && Intrinsics.areEqual(this.cardData, offerAutofillScreen.cardData) && Intrinsics.areEqual(this.capturedData, offerAutofillScreen.capturedData) && Intrinsics.areEqual(this.analyticsParam, offerAutofillScreen.analyticsParam) && Intrinsics.areEqual(this.question, offerAutofillScreen.question);
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AutofillAnalyticsParam getAnalyticsParam() {
            return this.analyticsParam;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final Redacted getCapturedData() {
            return this.capturedData;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AskedQuestion getQuestion() {
            return this.question;
        }

        public final int hashCode() {
            int m = re$$ExternalSyntheticOutline0.m(this.capturedData, re$$ExternalSyntheticOutline0.m(this.cardData, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.paymentMethod.hashCode() * 31, 31, this.shippingAddressId), 31), 31);
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            return this.question.hashCode() + ((m + (autofillAnalyticsParam == null ? 0 : autofillAnalyticsParam.hashCode())) * 31);
        }

        public final String toString() {
            return "OfferAutofillScreen(paymentMethod=" + this.paymentMethod + ", shippingAddressId=" + this.shippingAddressId + ", cardData=" + this.cardData + ", capturedData=" + this.capturedData + ", analyticsParam=" + this.analyticsParam + ", question=" + this.question + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentMethod.name());
            parcel.writeString(this.shippingAddressId);
            parcel.writeParcelable(this.cardData, i);
            parcel.writeParcelable(this.capturedData, i);
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            if (autofillAnalyticsParam == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autofillAnalyticsParam.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.question, i);
        }
    }

    /* loaded from: classes7.dex */
    public final class SaveAutofillScreen extends AutofillScreen implements BottomSheetScreen {
        public static final Parcelable.Creator<SaveAutofillScreen> CREATOR = new BoostDetailsScreen.Creator(29);
        public final AutofillAnalyticsParam analyticsParam;
        public final Redacted capturedData;
        public final AskedQuestion question;

        public SaveAutofillScreen(Redacted redacted, AutofillAnalyticsParam autofillAnalyticsParam, AskedQuestion askedQuestion) {
            redacted.getClass();
            askedQuestion.getClass();
            this.capturedData = redacted;
            this.analyticsParam = autofillAnalyticsParam;
            this.question = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveAutofillScreen)) {
                return false;
            }
            SaveAutofillScreen saveAutofillScreen = (SaveAutofillScreen) obj;
            return Intrinsics.areEqual(this.capturedData, saveAutofillScreen.capturedData) && Intrinsics.areEqual(this.analyticsParam, saveAutofillScreen.analyticsParam) && Intrinsics.areEqual(this.question, saveAutofillScreen.question);
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AutofillAnalyticsParam getAnalyticsParam() {
            return this.analyticsParam;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final Redacted getCapturedData() {
            return this.capturedData;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AskedQuestion getQuestion() {
            return this.question;
        }

        public final int hashCode() {
            int hashCode = this.capturedData.hashCode() * 31;
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            return this.question.hashCode() + ((hashCode + (autofillAnalyticsParam == null ? 0 : autofillAnalyticsParam.hashCode())) * 31);
        }

        public final String toString() {
            return "SaveAutofillScreen(capturedData=" + this.capturedData + ", analyticsParam=" + this.analyticsParam + ", question=" + this.question + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.capturedData, i);
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            if (autofillAnalyticsParam == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autofillAnalyticsParam.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.question, i);
        }
    }

    /* loaded from: classes7.dex */
    public final class UpdateAutofillScreen extends AutofillScreen implements BottomSheetScreen {
        public static final Parcelable.Creator<UpdateAutofillScreen> CREATOR = new AutofillQuestion.Creator(1);
        public final AutofillAnalyticsParam analyticsParam;
        public final Redacted capturedData;
        public final AskedQuestion question;
        public final String shippingAddressId;

        public UpdateAutofillScreen(Redacted redacted, String str, AutofillAnalyticsParam autofillAnalyticsParam, AskedQuestion askedQuestion) {
            redacted.getClass();
            str.getClass();
            askedQuestion.getClass();
            this.capturedData = redacted;
            this.shippingAddressId = str;
            this.analyticsParam = autofillAnalyticsParam;
            this.question = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateAutofillScreen)) {
                return false;
            }
            UpdateAutofillScreen updateAutofillScreen = (UpdateAutofillScreen) obj;
            return Intrinsics.areEqual(this.capturedData, updateAutofillScreen.capturedData) && Intrinsics.areEqual(this.shippingAddressId, updateAutofillScreen.shippingAddressId) && Intrinsics.areEqual(this.analyticsParam, updateAutofillScreen.analyticsParam) && Intrinsics.areEqual(this.question, updateAutofillScreen.question);
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AutofillAnalyticsParam getAnalyticsParam() {
            return this.analyticsParam;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final Redacted getCapturedData() {
            return this.capturedData;
        }

        @Override // com.squareup.cash.shopping.autofill.screens.AutofillScreen
        public final AskedQuestion getQuestion() {
            return this.question;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.capturedData.hashCode() * 31, 31, this.shippingAddressId);
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            return this.question.hashCode() + ((m + (autofillAnalyticsParam == null ? 0 : autofillAnalyticsParam.hashCode())) * 31);
        }

        public final String toString() {
            return "UpdateAutofillScreen(capturedData=" + this.capturedData + ", shippingAddressId=" + this.shippingAddressId + ", analyticsParam=" + this.analyticsParam + ", question=" + this.question + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.capturedData, i);
            parcel.writeString(this.shippingAddressId);
            AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
            if (autofillAnalyticsParam == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autofillAnalyticsParam.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.question, i);
        }
    }

    public abstract AutofillAnalyticsParam getAnalyticsParam();

    public abstract Redacted getCapturedData();

    public abstract AskedQuestion getQuestion();
}
