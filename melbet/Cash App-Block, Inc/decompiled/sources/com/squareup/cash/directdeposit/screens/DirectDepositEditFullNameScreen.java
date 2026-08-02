package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositEditFullNameScreen implements DirectDepositManualSetupScreen {
    public static final Parcelable.Creator<DirectDepositEditFullNameScreen> CREATOR = new Limit.Creator(8);
    public final Redacted inputText;
    public final AskedQuestion question;
    public final String token;

    /* loaded from: classes6.dex */
    public final class FullNameQuestion implements Question {
        public static final FullNameQuestion INSTANCE = new FullNameQuestion();
        public static final Parcelable.Creator<FullNameQuestion> CREATOR = new Limit.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FullNameQuestion);
        }

        public final int hashCode() {
            return -1303483461;
        }

        public final String toString() {
            return "FullNameQuestion";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public DirectDepositEditFullNameScreen(String str, Redacted redacted, AskedQuestion askedQuestion) {
        str.getClass();
        redacted.getClass();
        askedQuestion.getClass();
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
        if (!(obj instanceof DirectDepositEditFullNameScreen)) {
            return false;
        }
        DirectDepositEditFullNameScreen directDepositEditFullNameScreen = (DirectDepositEditFullNameScreen) obj;
        return Intrinsics.areEqual(this.token, directDepositEditFullNameScreen.token) && Intrinsics.areEqual(this.inputText, directDepositEditFullNameScreen.inputText) && Intrinsics.areEqual(this.question, directDepositEditFullNameScreen.question);
    }

    public final int hashCode() {
        return this.question.hashCode() + re$$ExternalSyntheticOutline0.m(this.inputText, this.token.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DirectDepositEditFullNameScreen(token=" + this.token + ", inputText=" + this.inputText + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeParcelable(this.inputText, i);
        parcel.writeParcelable(this.question, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DirectDepositEditFullNameScreen(String str, String str2, AskedQuestion askedQuestion) {
        this(str, new RedactedString(str2), askedQuestion);
        str.getClass();
        str2.getClass();
        askedQuestion.getClass();
    }
}
