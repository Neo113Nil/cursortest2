package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Question;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositEditCompanyNameScreen implements DirectDepositManualSetupScreen, NeverInBackStackScreen {
    public static final Parcelable.Creator<DirectDepositEditCompanyNameScreen> CREATOR = new Limit.Creator(7);
    public final Redacted inputText;
    public final AskedQuestion question;
    public final String token;

    /* loaded from: classes6.dex */
    public final class CompanyNameQuestion implements Question {
        public static final CompanyNameQuestion INSTANCE = new CompanyNameQuestion();
        public static final Parcelable.Creator<CompanyNameQuestion> CREATOR = new Limit.Creator(6);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CompanyNameQuestion);
        }

        public final int hashCode() {
            return -1872790969;
        }

        public final String toString() {
            return "CompanyNameQuestion";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public DirectDepositEditCompanyNameScreen(String str, Redacted redacted, AskedQuestion askedQuestion) {
        str.getClass();
        redacted.getClass();
        this.token = str;
        this.inputText = redacted;
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
        if (!(obj instanceof DirectDepositEditCompanyNameScreen)) {
            return false;
        }
        DirectDepositEditCompanyNameScreen directDepositEditCompanyNameScreen = (DirectDepositEditCompanyNameScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositEditCompanyNameScreen.token) && Intrinsics.areEqual(this.inputText, directDepositEditCompanyNameScreen.inputText) && Intrinsics.areEqual(this.question, directDepositEditCompanyNameScreen.question);
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualSetupScreen
    public final String getToken() {
        throw null;
    }

    public final int hashCode() {
        int m = re$$ExternalSyntheticOutline0.m(this.inputText, this.token.hashCode() * 31, 31);
        AskedQuestion askedQuestion = this.question;
        return m + (askedQuestion == null ? 0 : askedQuestion.hashCode());
    }

    public final String toString() {
        return "DirectDepositEditCompanyNameScreen(token=" + this.token + ", inputText=" + this.inputText + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.inputText, i);
        parcel.writeParcelable(this.question, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DirectDepositEditCompanyNameScreen(String str, String str2, AskedQuestion askedQuestion) {
        this(str, new RedactedString(str2), askedQuestion);
        str.getClass();
        str2.getClass();
    }
}
