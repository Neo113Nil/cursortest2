package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransferProcessingScreen implements SavingsScreen {
    public static final Parcelable.Creator<TransferProcessingScreen> CREATOR = new BoostDetailsScreen.Creator(5);
    public final Money amount;
    public final SavingsTransferContext context;
    public final Direction direction;
    public final SavingsScreen origin;
    public final String savingsFolderToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Direction {
        public static final /* synthetic */ Direction[] $VALUES;
        public static final Direction IN;
        public static final Direction OUT;

        static {
            Direction direction = new Direction("IN", 0);
            IN = direction;
            Direction direction2 = new Direction("OUT", 1);
            OUT = direction2;
            $VALUES = new Direction[]{direction, direction2};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public TransferProcessingScreen(Direction direction, Money money, String str, SavingsScreen savingsScreen, SavingsTransferContext savingsTransferContext) {
        direction.getClass();
        money.getClass();
        str.getClass();
        savingsScreen.getClass();
        this.direction = direction;
        this.amount = money;
        this.savingsFolderToken = str;
        this.origin = savingsScreen;
        this.context = savingsTransferContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferProcessingScreen)) {
            return false;
        }
        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) obj;
        return this.direction == transferProcessingScreen.direction && Intrinsics.areEqual(this.amount, transferProcessingScreen.amount) && Intrinsics.areEqual(this.savingsFolderToken, transferProcessingScreen.savingsFolderToken) && Intrinsics.areEqual(this.origin, transferProcessingScreen.origin) && Intrinsics.areEqual(this.context, transferProcessingScreen.context);
    }

    public final int hashCode() {
        int hashCode = (this.origin.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, this.direction.hashCode() * 31, 31), 31, this.savingsFolderToken)) * 31;
        SavingsTransferContext savingsTransferContext = this.context;
        return hashCode + (savingsTransferContext == null ? 0 : savingsTransferContext.hashCode());
    }

    public final String toString() {
        return "TransferProcessingScreen(direction=" + this.direction + ", amount=" + this.amount + ", savingsFolderToken=" + this.savingsFolderToken + ", origin=" + this.origin + ", context=" + this.context + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.direction.name());
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.savingsFolderToken);
        parcel.writeParcelable(this.origin, i);
        parcel.writeParcelable(this.context, i);
    }
}
