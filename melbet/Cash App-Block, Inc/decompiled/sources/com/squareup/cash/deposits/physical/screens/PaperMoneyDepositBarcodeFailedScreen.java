package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaperMoneyDepositBarcodeFailedScreen implements BlockersScreens.SwappingBlockersScreens, Screen {
    public static final Parcelable.Creator<PaperMoneyDepositBarcodeFailedScreen> CREATOR = new Recipient.Creator(18);
    public final BlockersData blockersData;
    public final String closeText;
    public final String detailText;
    public final PaperCashDepositBlocker paperCashDepositBlocker;
    public final boolean reload;
    public final String titleText;

    public PaperMoneyDepositBarcodeFailedScreen(String str, String str2, String str3, boolean z, PaperCashDepositBlocker paperCashDepositBlocker, BlockersData blockersData) {
        paperCashDepositBlocker.getClass();
        blockersData.getClass();
        this.titleText = str;
        this.detailText = str2;
        this.closeText = str3;
        this.reload = z;
        this.paperCashDepositBlocker = paperCashDepositBlocker;
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
        if (!(obj instanceof PaperMoneyDepositBarcodeFailedScreen)) {
            return false;
        }
        PaperMoneyDepositBarcodeFailedScreen paperMoneyDepositBarcodeFailedScreen = (PaperMoneyDepositBarcodeFailedScreen) obj;
        return Intrinsics.areEqual(this.titleText, paperMoneyDepositBarcodeFailedScreen.titleText) && Intrinsics.areEqual(this.detailText, paperMoneyDepositBarcodeFailedScreen.detailText) && Intrinsics.areEqual(this.closeText, paperMoneyDepositBarcodeFailedScreen.closeText) && this.reload == paperMoneyDepositBarcodeFailedScreen.reload && Intrinsics.areEqual(this.paperCashDepositBlocker, paperMoneyDepositBarcodeFailedScreen.paperCashDepositBlocker) && Intrinsics.areEqual(this.blockersData, paperMoneyDepositBarcodeFailedScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.closeText;
        return this.blockersData.hashCode() + ((this.paperCashDepositBlocker.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.reload)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaperMoneyDepositBarcodeFailedScreen(titleText=", this.titleText, ", detailText=", this.detailText, ", closeText=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.closeText, ", reload=", this.reload, ", paperCashDepositBlocker=");
        m.append(this.paperCashDepositBlocker);
        m.append(", blockersData=");
        m.append(this.blockersData);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.titleText);
        parcel.writeString(this.detailText);
        parcel.writeString(this.closeText);
        parcel.writeInt(this.reload ? 1 : 0);
        parcel.writeParcelable(this.paperCashDepositBlocker, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
