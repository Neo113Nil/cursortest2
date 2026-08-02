package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Question;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotStaticPickerQuestion implements Question {
    public static final Parcelable.Creator<MoneybotStaticPickerQuestion> CREATOR = new MusicScreen.Creator(18);
    public final String cta;
    public final Money linkedAmount;
    public final ArrayList options;
    public final String selectedValue;
    public final String title;

    public MoneybotStaticPickerQuestion(String str, String str2, ArrayList arrayList, String str3, Money money) {
        this.title = str;
        this.cta = str2;
        this.options = arrayList;
        this.selectedValue = str3;
        this.linkedAmount = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotStaticPickerQuestion)) {
            return false;
        }
        MoneybotStaticPickerQuestion moneybotStaticPickerQuestion = (MoneybotStaticPickerQuestion) obj;
        return Intrinsics.areEqual(this.title, moneybotStaticPickerQuestion.title) && Intrinsics.areEqual(this.cta, moneybotStaticPickerQuestion.cta) && this.options.equals(moneybotStaticPickerQuestion.options) && Intrinsics.areEqual(this.selectedValue, moneybotStaticPickerQuestion.selectedValue) && Intrinsics.areEqual(this.linkedAmount, moneybotStaticPickerQuestion.linkedAmount);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cta;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.selectedValue;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        Money money = this.linkedAmount;
        return hashCode2 + (money != null ? money.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotStaticPickerQuestion(title=", this.title, ", cta=", this.cta, ", options=");
        m.append(this.options);
        m.append(", selectedValue=");
        m.append(this.selectedValue);
        m.append(", linkedAmount=");
        m.append(this.linkedAmount);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.cta);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.options, parcel);
        while (m.hasNext()) {
            ((MoneybotStaticPickerOption) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectedValue);
        parcel.writeParcelable(this.linkedAmount, i);
    }
}
