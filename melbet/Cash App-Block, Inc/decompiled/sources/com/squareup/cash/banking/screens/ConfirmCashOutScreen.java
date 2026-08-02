package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ConfirmCashOutScreen implements BlockersScreens, DialogScreen {
    public static final Parcelable.Creator<ConfirmCashOutScreen> CREATOR = new SheetAppMessage.Creator(15);
    public final BlockersData blockersData;

    public ConfirmCashOutScreen(BlockersData blockersData) {
        blockersData.getClass();
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmCashOutScreen) && Intrinsics.areEqual(this.blockersData, ((ConfirmCashOutScreen) obj).blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ConfirmCashOutScreen(blockersData=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
    }
}
