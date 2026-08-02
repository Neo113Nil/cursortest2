package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransferOptionPickerScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<TransferOptionPickerScreen> CREATOR = new Instrument.Creator(16);
    public final Money amount;
    public final AskedQuestion askedQuestion;
    public final boolean balanceGatingEnabled;
    public final String cta;
    public final boolean forceDarkMode;
    public final List hiddenOptionValues;
    public final Screen linkDebitExitScreen;
    public final TransferOptionPickerSelection selectedOption;
    public final String title;
    public final List transferOptions;

    public TransferOptionPickerScreen(Money money, List list, AskedQuestion askedQuestion, String str, String str2, TransferOptionPickerSelection transferOptionPickerSelection, List list2, boolean z, boolean z2, Screen screen) {
        money.getClass();
        askedQuestion.getClass();
        list2.getClass();
        this.amount = money;
        this.transferOptions = list;
        this.askedQuestion = askedQuestion;
        this.title = str;
        this.cta = str2;
        this.selectedOption = transferOptionPickerSelection;
        this.hiddenOptionValues = list2;
        this.balanceGatingEnabled = z;
        this.forceDarkMode = z2;
        this.linkDebitExitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOptionPickerScreen)) {
            return false;
        }
        TransferOptionPickerScreen transferOptionPickerScreen = (TransferOptionPickerScreen) obj;
        return Intrinsics.areEqual(this.amount, transferOptionPickerScreen.amount) && this.transferOptions.equals(transferOptionPickerScreen.transferOptions) && Intrinsics.areEqual(this.askedQuestion, transferOptionPickerScreen.askedQuestion) && Intrinsics.areEqual(this.title, transferOptionPickerScreen.title) && Intrinsics.areEqual(this.cta, transferOptionPickerScreen.cta) && Intrinsics.areEqual(this.selectedOption, transferOptionPickerScreen.selectedOption) && Intrinsics.areEqual(this.hiddenOptionValues, transferOptionPickerScreen.hiddenOptionValues) && this.balanceGatingEnabled == transferOptionPickerScreen.balanceGatingEnabled && this.forceDarkMode == transferOptionPickerScreen.forceDarkMode && Intrinsics.areEqual(this.linkDebitExitScreen, transferOptionPickerScreen.linkDebitExitScreen);
    }

    public final int hashCode() {
        int hashCode = (this.askedQuestion.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.amount.hashCode() * 31, 31, this.transferOptions)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cta;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TransferOptionPickerSelection transferOptionPickerSelection = this.selectedOption;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (transferOptionPickerSelection == null ? 0 : transferOptionPickerSelection.hashCode())) * 31, 31, this.hiddenOptionValues), 31, this.balanceGatingEnabled), 31, this.forceDarkMode);
        Screen screen = this.linkDebitExitScreen;
        return m + (screen != null ? screen.hashCode() : 0);
    }

    public final String toString() {
        return "TransferOptionPickerScreen(amount=" + this.amount + ", transferOptions=" + this.transferOptions + ", askedQuestion=" + this.askedQuestion + ", title=" + this.title + ", cta=" + this.cta + ", selectedOption=" + this.selectedOption + ", hiddenOptionValues=" + this.hiddenOptionValues + ", balanceGatingEnabled=" + this.balanceGatingEnabled + ", forceDarkMode=" + this.forceDarkMode + ", linkDebitExitScreen=" + this.linkDebitExitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.amount, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.transferOptions, parcel);
        while (m.hasNext()) {
            parcel.writeString(((TransferOptions) m.next()).name());
        }
        parcel.writeParcelable(this.askedQuestion, i);
        parcel.writeString(this.title);
        parcel.writeString(this.cta);
        TransferOptionPickerSelection transferOptionPickerSelection = this.selectedOption;
        if (transferOptionPickerSelection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferOptionPickerSelection.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.hiddenOptionValues);
        parcel.writeInt(this.balanceGatingEnabled ? 1 : 0);
        parcel.writeInt(this.forceDarkMode ? 1 : 0);
        parcel.writeParcelable(this.linkDebitExitScreen, i);
    }
}
