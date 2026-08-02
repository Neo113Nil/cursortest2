package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SetPaycheckMultipleAllocationScreen implements PaychecksScreen, SingleInstanceScreen, AccentedScreen {
    public static final Parcelable.Creator<SetPaycheckMultipleAllocationScreen> CREATOR = new PaymentRecipient.Creator(25);
    public final ColorModel accentColor;
    public final SetPaycheckMultiAllocationBlocker blocker;
    public final BlockersData blockersData;

    public SetPaycheckMultipleAllocationScreen(BlockersData blockersData, SetPaycheckMultiAllocationBlocker setPaycheckMultiAllocationBlocker, ColorModel colorModel) {
        blockersData.getClass();
        setPaycheckMultiAllocationBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = setPaycheckMultiAllocationBlocker;
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
        if (!(obj instanceof SetPaycheckMultipleAllocationScreen)) {
            return false;
        }
        SetPaycheckMultipleAllocationScreen setPaycheckMultipleAllocationScreen = (SetPaycheckMultipleAllocationScreen) obj;
        return Intrinsics.areEqual(this.blockersData, setPaycheckMultipleAllocationScreen.blockersData) && Intrinsics.areEqual(this.blocker, setPaycheckMultipleAllocationScreen.blocker) && Intrinsics.areEqual(this.accentColor, setPaycheckMultipleAllocationScreen.accentColor);
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    public final int hashCode() {
        int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        ColorModel colorModel = this.accentColor;
        return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPaycheckMultipleAllocationScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", blocker=");
        sb.append(this.blocker);
        sb.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
        parcel.writeParcelable(this.accentColor, i);
    }
}
