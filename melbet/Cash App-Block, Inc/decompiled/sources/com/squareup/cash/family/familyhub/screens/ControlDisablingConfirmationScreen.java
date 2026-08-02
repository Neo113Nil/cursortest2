package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Question;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ControlDisablingConfirmationScreen implements DialogScreen {
    public static final Parcelable.Creator<ControlDisablingConfirmationScreen> CREATOR = new AddPayerCustomersScreen.Creator(24);
    public final AskedQuestion askedQuestion;
    public final String cancelButtonText;
    public final String confirmButtonText;
    public final ControlType fromControl;
    public final Money limit;
    public final String message;
    public final boolean showDarkConfirm;
    public final String title;

    /* loaded from: classes6.dex */
    public final class DisablingConfirmationQuestion implements Question {
        public static final DisablingConfirmationQuestion INSTANCE = new DisablingConfirmationQuestion();
        public static final Parcelable.Creator<DisablingConfirmationQuestion> CREATOR = new AddPayerCustomersScreen.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisablingConfirmationQuestion);
        }

        public final int hashCode() {
            return -2047040617;
        }

        public final String toString() {
            return "DisablingConfirmationQuestion";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public ControlDisablingConfirmationScreen(String str, String str2, String str3, String str4, ControlType controlType, boolean z, Money money, AskedQuestion askedQuestion) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        controlType.getClass();
        askedQuestion.getClass();
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
        this.cancelButtonText = str4;
        this.fromControl = controlType;
        this.showDarkConfirm = z;
        this.limit = money;
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlDisablingConfirmationScreen)) {
            return false;
        }
        ControlDisablingConfirmationScreen controlDisablingConfirmationScreen = (ControlDisablingConfirmationScreen) obj;
        return Intrinsics.areEqual(this.title, controlDisablingConfirmationScreen.title) && Intrinsics.areEqual(this.message, controlDisablingConfirmationScreen.message) && Intrinsics.areEqual(this.confirmButtonText, controlDisablingConfirmationScreen.confirmButtonText) && Intrinsics.areEqual(this.cancelButtonText, controlDisablingConfirmationScreen.cancelButtonText) && this.fromControl == controlDisablingConfirmationScreen.fromControl && this.showDarkConfirm == controlDisablingConfirmationScreen.showDarkConfirm && Intrinsics.areEqual(this.limit, controlDisablingConfirmationScreen.limit) && Intrinsics.areEqual(this.askedQuestion, controlDisablingConfirmationScreen.askedQuestion);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.fromControl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.confirmButtonText), 31, this.cancelButtonText)) * 31, 31, this.showDarkConfirm);
        Money money = this.limit;
        return this.askedQuestion.hashCode() + ((m + (money == null ? 0 : money.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ControlDisablingConfirmationScreen(title=", this.title, ", message=", this.message, ", confirmButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.confirmButtonText, ", cancelButtonText=", this.cancelButtonText, ", fromControl=");
        m.append(this.fromControl);
        m.append(", showDarkConfirm=");
        m.append(this.showDarkConfirm);
        m.append(", limit=");
        m.append(this.limit);
        m.append(", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.confirmButtonText);
        parcel.writeString(this.cancelButtonText);
        parcel.writeString(this.fromControl.name());
        parcel.writeInt(this.showDarkConfirm ? 1 : 0);
        parcel.writeParcelable(this.limit, i);
        parcel.writeParcelable(this.askedQuestion, i);
    }

    public /* synthetic */ ControlDisablingConfirmationScreen(String str, String str2, String str3, String str4, ControlType controlType, AskedQuestion askedQuestion, int i) {
        this(str, str2, str3, str4, controlType, (i & 32) == 0, null, askedQuestion);
    }
}
