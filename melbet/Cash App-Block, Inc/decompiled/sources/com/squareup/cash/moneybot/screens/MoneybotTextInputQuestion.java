package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Question;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotTextInputQuestion implements Question {
    public static final Parcelable.Creator<MoneybotTextInputQuestion> CREATOR = new MusicScreen.Creator(22);
    public final String cta;
    public final String initialText;
    public final Integer maxLength;
    public final String placeholder;

    public MoneybotTextInputQuestion(Integer num, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.initialText = str;
        this.placeholder = str2;
        this.maxLength = num;
        this.cta = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotTextInputQuestion)) {
            return false;
        }
        MoneybotTextInputQuestion moneybotTextInputQuestion = (MoneybotTextInputQuestion) obj;
        return Intrinsics.areEqual(this.initialText, moneybotTextInputQuestion.initialText) && Intrinsics.areEqual(this.placeholder, moneybotTextInputQuestion.placeholder) && Intrinsics.areEqual(this.maxLength, moneybotTextInputQuestion.maxLength) && Intrinsics.areEqual(this.cta, moneybotTextInputQuestion.cta);
    }

    public final int hashCode() {
        int hashCode = this.initialText.hashCode() * 31;
        String str = this.placeholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxLength;
        return this.cta.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotTextInputQuestion(initialText=", this.initialText, ", placeholder=", this.placeholder, ", maxLength=");
        m.append(this.maxLength);
        m.append(", cta=");
        m.append(this.cta);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.initialText);
        parcel.writeString(this.placeholder);
        Integer num = this.maxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.cta);
    }
}
