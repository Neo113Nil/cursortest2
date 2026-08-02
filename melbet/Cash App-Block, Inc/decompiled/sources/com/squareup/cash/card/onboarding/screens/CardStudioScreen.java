package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardStudioScreen implements BlockersScreens.ChildBlockersScreens {
    public static final Parcelable.Creator<CardStudioScreen> CREATOR = new Creator();
    public final List availableStamps;
    public final BlockersData blockersData;
    public final Redacted cashtag;
    public final CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay;
    public final boolean customizationEligible;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CardStudioScreen((BlockersData) parcel.readParcelable(CardStudioScreen.class.getClassLoader()), CardCustomizationBlocker.CardOption.CashtagDisplay.valueOf(parcel.readString()), (Redacted) parcel.readParcelable(CardStudioScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardStudioScreen[i];
        }
    }

    public CardStudioScreen(BlockersData blockersData, CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay, Redacted redacted, boolean z, List list) {
        blockersData.getClass();
        cashtagDisplay.getClass();
        list.getClass();
        this.blockersData = blockersData;
        this.cashtagDisplay = cashtagDisplay;
        this.cashtag = redacted;
        this.customizationEligible = z;
        this.availableStamps = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStudioScreen)) {
            return false;
        }
        CardStudioScreen cardStudioScreen = (CardStudioScreen) obj;
        return Intrinsics.areEqual(this.blockersData, cardStudioScreen.blockersData) && this.cashtagDisplay == cardStudioScreen.cashtagDisplay && Intrinsics.areEqual(this.cashtag, cardStudioScreen.cashtag) && this.customizationEligible == cardStudioScreen.customizationEligible && Intrinsics.areEqual(this.availableStamps, cardStudioScreen.availableStamps);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = (this.cashtagDisplay.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        Redacted redacted = this.cashtag;
        return this.availableStamps.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31, 31, this.customizationEligible);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardStudioScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", cashtagDisplay=");
        sb.append(this.cashtagDisplay);
        sb.append(", cashtag=");
        sb.append(this.cashtag);
        sb.append(", customizationEligible=");
        sb.append(this.customizationEligible);
        sb.append(", availableStamps=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.availableStamps, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.cashtagDisplay.name());
        parcel.writeParcelable(this.cashtag, i);
        parcel.writeInt(this.customizationEligible ? 1 : 0);
        parcel.writeStringList(this.availableStamps);
    }
}
