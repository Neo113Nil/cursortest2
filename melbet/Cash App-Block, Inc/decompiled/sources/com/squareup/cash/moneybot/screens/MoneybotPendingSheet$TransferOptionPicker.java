package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotPendingSheet$TransferOptionPicker implements Parcelable {
    public static final Parcelable.Creator<MoneybotPendingSheet$TransferOptionPicker> CREATOR = new MusicScreen.Creator(12);
    public final Money amount;
    public final boolean balanceGatingEnabled;
    public final String cta;
    public final boolean forceDarkMode;
    public final List hiddenOptionValues;
    public final String placeholderKey;
    public final String renderableKey;
    public final TransferOptionPickerSelection selectedOption;
    public final String title;
    public final List transferOptions;

    public MoneybotPendingSheet$TransferOptionPicker(String str, String str2, Money money, List list, String str3, String str4, TransferOptionPickerSelection transferOptionPickerSelection, boolean z, List list2, boolean z2) {
        str.getClass();
        money.getClass();
        list2.getClass();
        this.placeholderKey = str;
        this.renderableKey = str2;
        this.amount = money;
        this.transferOptions = list;
        this.title = str3;
        this.cta = str4;
        this.selectedOption = transferOptionPickerSelection;
        this.forceDarkMode = z;
        this.hiddenOptionValues = list2;
        this.balanceGatingEnabled = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotPendingSheet$TransferOptionPicker)) {
            return false;
        }
        MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker = (MoneybotPendingSheet$TransferOptionPicker) obj;
        return Intrinsics.areEqual(this.placeholderKey, moneybotPendingSheet$TransferOptionPicker.placeholderKey) && Intrinsics.areEqual(this.renderableKey, moneybotPendingSheet$TransferOptionPicker.renderableKey) && Intrinsics.areEqual(this.amount, moneybotPendingSheet$TransferOptionPicker.amount) && this.transferOptions.equals(moneybotPendingSheet$TransferOptionPicker.transferOptions) && Intrinsics.areEqual(this.title, moneybotPendingSheet$TransferOptionPicker.title) && Intrinsics.areEqual(this.cta, moneybotPendingSheet$TransferOptionPicker.cta) && Intrinsics.areEqual(this.selectedOption, moneybotPendingSheet$TransferOptionPicker.selectedOption) && this.forceDarkMode == moneybotPendingSheet$TransferOptionPicker.forceDarkMode && Intrinsics.areEqual(this.hiddenOptionValues, moneybotPendingSheet$TransferOptionPicker.hiddenOptionValues) && this.balanceGatingEnabled == moneybotPendingSheet$TransferOptionPicker.balanceGatingEnabled;
    }

    public final int hashCode() {
        int hashCode = this.placeholderKey.hashCode() * 31;
        String str = this.renderableKey;
        int m = Recorder$$ExternalSyntheticOutline2.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.transferOptions);
        String str2 = this.title;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cta;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TransferOptionPickerSelection transferOptionPickerSelection = this.selectedOption;
        return Boolean.hashCode(this.balanceGatingEnabled) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (transferOptionPickerSelection != null ? transferOptionPickerSelection.hashCode() : 0)) * 31, 31, this.forceDarkMode), 31, this.hiddenOptionValues);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TransferOptionPicker(placeholderKey=", this.placeholderKey, ", renderableKey=", this.renderableKey, ", amount=");
        m.append(this.amount);
        m.append(", transferOptions=");
        m.append(this.transferOptions);
        m.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", cta=", this.cta, ", selectedOption=");
        m.append(this.selectedOption);
        m.append(", forceDarkMode=");
        m.append(this.forceDarkMode);
        m.append(", hiddenOptionValues=");
        m.append(this.hiddenOptionValues);
        m.append(", balanceGatingEnabled=");
        m.append(this.balanceGatingEnabled);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.placeholderKey);
        parcel.writeString(this.renderableKey);
        parcel.writeParcelable(this.amount, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.transferOptions, parcel);
        while (m.hasNext()) {
            parcel.writeString(((TransferOptions) m.next()).name());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.cta);
        parcel.writeParcelable(this.selectedOption, i);
        parcel.writeInt(this.forceDarkMode ? 1 : 0);
        parcel.writeStringList(this.hiddenOptionValues);
        parcel.writeInt(this.balanceGatingEnabled ? 1 : 0);
    }
}
