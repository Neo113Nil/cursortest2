package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.screens.AccentedScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CustomAllocationScreen implements PaychecksScreen, AccentedScreen {
    public static final Parcelable.Creator<CustomAllocationScreen> CREATOR = new PaymentRecipient.Creator(14);
    public final ColorModel accentColor;
    public final String customAmountSubtitle;
    public final String header;
    public final long maxAllocation;
    public final AskedQuestion question;
    public final long startingAllocation;

    public CustomAllocationScreen(AskedQuestion askedQuestion, long j, long j2, String str, String str2, ColorModel colorModel) {
        askedQuestion.getClass();
        str.getClass();
        this.question = askedQuestion;
        this.startingAllocation = j;
        this.maxAllocation = j2;
        this.header = str;
        this.customAmountSubtitle = str2;
        this.accentColor = colorModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAllocationScreen)) {
            return false;
        }
        CustomAllocationScreen customAllocationScreen = (CustomAllocationScreen) obj;
        return Intrinsics.areEqual(this.question, customAllocationScreen.question) && this.startingAllocation == customAllocationScreen.startingAllocation && this.maxAllocation == customAllocationScreen.maxAllocation && Intrinsics.areEqual(this.header, customAllocationScreen.header) && Intrinsics.areEqual(this.customAmountSubtitle, customAllocationScreen.customAmountSubtitle) && Intrinsics.areEqual(this.accentColor, customAllocationScreen.accentColor);
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.question.hashCode() * 31, 31, this.startingAllocation), 31, this.maxAllocation), 31, this.header);
        String str = this.customAmountSubtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        return hashCode + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAllocationScreen(question=");
        sb.append(this.question);
        sb.append(", startingAllocation=");
        sb.append(this.startingAllocation);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.maxAllocation, ", maxAllocation=", ", header=", sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.header, ", customAmountSubtitle=", this.customAmountSubtitle, ", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
        parcel.writeLong(this.startingAllocation);
        parcel.writeLong(this.maxAllocation);
        parcel.writeString(this.header);
        parcel.writeString(this.customAmountSubtitle);
        parcel.writeParcelable(this.accentColor, i);
    }
}
