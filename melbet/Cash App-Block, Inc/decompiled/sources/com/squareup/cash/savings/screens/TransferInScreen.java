package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TransferInScreen extends SavingsScreen {

    public final class Condensed implements TransferInScreen, Screen, OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<Condensed> CREATOR = new BoostDetailsScreen.Creator(2);
        public final TransferConfig.TransferInConfig config;
        public final SavingsTransferContext context;
        public final SavingsScreen origin;
        public final String savingsFolderToken;

        public Condensed(TransferConfig.TransferInConfig transferInConfig, String str, SavingsScreen savingsScreen, SavingsTransferContext savingsTransferContext) {
            transferInConfig.getClass();
            str.getClass();
            savingsScreen.getClass();
            this.config = transferInConfig;
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
            if (!(obj instanceof Condensed)) {
                return false;
            }
            Condensed condensed = (Condensed) obj;
            return Intrinsics.areEqual(this.config, condensed.config) && Intrinsics.areEqual(this.savingsFolderToken, condensed.savingsFolderToken) && Intrinsics.areEqual(this.origin, condensed.origin) && Intrinsics.areEqual(this.context, condensed.context);
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final TransferConfig.TransferInConfig getConfig() {
            return this.config;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final SavingsTransferContext getContext() {
            return this.context;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final SavingsScreen getOrigin() {
            return this.origin;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final String getSavingsFolderToken() {
            return this.savingsFolderToken;
        }

        public final int hashCode() {
            int hashCode = (this.origin.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.config.hashCode() * 31, 31, this.savingsFolderToken)) * 31;
            SavingsTransferContext savingsTransferContext = this.context;
            return hashCode + (savingsTransferContext == null ? 0 : savingsTransferContext.hashCode());
        }

        public final String toString() {
            return "Condensed(config=" + this.config + ", savingsFolderToken=" + this.savingsFolderToken + ", origin=" + this.origin + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.config, i);
            parcel.writeString(this.savingsFolderToken);
            parcel.writeParcelable(this.origin, i);
            parcel.writeParcelable(this.context, i);
        }
    }

    public final class Full implements TransferInScreen {
        public static final Parcelable.Creator<Full> CREATOR = new BoostDetailsScreen.Creator(3);
        public final TransferConfig.TransferInConfig config;
        public final SavingsTransferContext context;
        public final SavingsScreen origin;
        public final String savingsFolderToken;

        public Full(TransferConfig.TransferInConfig transferInConfig, String str, SavingsScreen savingsScreen, SavingsTransferContext savingsTransferContext) {
            transferInConfig.getClass();
            str.getClass();
            savingsScreen.getClass();
            this.config = transferInConfig;
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
            if (!(obj instanceof Full)) {
                return false;
            }
            Full full = (Full) obj;
            return Intrinsics.areEqual(this.config, full.config) && Intrinsics.areEqual(this.savingsFolderToken, full.savingsFolderToken) && Intrinsics.areEqual(this.origin, full.origin) && Intrinsics.areEqual(this.context, full.context);
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final TransferConfig.TransferInConfig getConfig() {
            return this.config;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final SavingsTransferContext getContext() {
            return this.context;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final SavingsScreen getOrigin() {
            return this.origin;
        }

        @Override // com.squareup.cash.savings.screens.TransferInScreen
        public final String getSavingsFolderToken() {
            return this.savingsFolderToken;
        }

        public final int hashCode() {
            int hashCode = (this.origin.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.config.hashCode() * 31, 31, this.savingsFolderToken)) * 31;
            SavingsTransferContext savingsTransferContext = this.context;
            return hashCode + (savingsTransferContext == null ? 0 : savingsTransferContext.hashCode());
        }

        public final String toString() {
            return "Full(config=" + this.config + ", savingsFolderToken=" + this.savingsFolderToken + ", origin=" + this.origin + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.config, i);
            parcel.writeString(this.savingsFolderToken);
            parcel.writeParcelable(this.origin, i);
            parcel.writeParcelable(this.context, i);
        }
    }

    TransferConfig.TransferInConfig getConfig();

    SavingsTransferContext getContext();

    SavingsScreen getOrigin();

    String getSavingsFolderToken();
}
