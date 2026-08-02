package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProgressBarData implements Parcelable {
    public static final Parcelable.Creator<ProgressBarData> CREATOR = new LimitsScreen.Creator(4);
    public final String amountRemaining;
    public final String amountUsed;
    public final String color;
    public final Double consumedProportion;
    public final String header;
    public final String limitThresholdAmount;
    public final String primaryText;
    public final Double progress;
    public final ProgressType progressType;
    public final String secondaryText;

    public ProgressBarData(String str, String str2, Double d, String str3, ProgressType progressType, String str4, String str5, String str6, String str7, Double d2) {
        str.getClass();
        progressType.getClass();
        this.primaryText = str;
        this.secondaryText = str2;
        this.progress = d;
        this.color = str3;
        this.progressType = progressType;
        this.header = str4;
        this.amountUsed = str5;
        this.amountRemaining = str6;
        this.limitThresholdAmount = str7;
        this.consumedProportion = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarData)) {
            return false;
        }
        ProgressBarData progressBarData = (ProgressBarData) obj;
        return Intrinsics.areEqual(this.primaryText, progressBarData.primaryText) && Intrinsics.areEqual(this.secondaryText, progressBarData.secondaryText) && Intrinsics.areEqual((Object) this.progress, (Object) progressBarData.progress) && Intrinsics.areEqual(this.color, progressBarData.color) && this.progressType == progressBarData.progressType && Intrinsics.areEqual(this.header, progressBarData.header) && Intrinsics.areEqual(this.amountUsed, progressBarData.amountUsed) && Intrinsics.areEqual(this.amountRemaining, progressBarData.amountRemaining) && Intrinsics.areEqual(this.limitThresholdAmount, progressBarData.limitThresholdAmount) && Intrinsics.areEqual((Object) this.consumedProportion, (Object) progressBarData.consumedProportion);
    }

    public final int hashCode() {
        int hashCode = this.primaryText.hashCode() * 31;
        String str = this.secondaryText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.progress;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.color;
        int hashCode4 = (this.progressType.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.header;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amountUsed;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amountRemaining;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.limitThresholdAmount;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d2 = this.consumedProportion;
        return hashCode8 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProgressBarData(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ", progress=");
        m.append(this.progress);
        m.append(", color=");
        m.append(this.color);
        m.append(", progressType=");
        m.append(this.progressType);
        m.append(", header=");
        m.append(this.header);
        m.append(", amountUsed=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.amountUsed, ", amountRemaining=", this.amountRemaining, ", limitThresholdAmount=");
        m.append(this.limitThresholdAmount);
        m.append(", consumedProportion=");
        m.append(this.consumedProportion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.primaryText);
        parcel.writeString(this.secondaryText);
        Double d = this.progress;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.color);
        this.progressType.writeToParcel(parcel, i);
        parcel.writeString(this.header);
        parcel.writeString(this.amountUsed);
        parcel.writeString(this.amountRemaining);
        parcel.writeString(this.limitThresholdAmount);
        Double d2 = this.consumedProportion;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
    }
}
