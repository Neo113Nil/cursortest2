package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.screens.AccentedScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EditDistributionScreen implements PaychecksScreen, SingleInstanceScreen, AccentedScreen {
    public static final Parcelable.Creator<EditDistributionScreen> CREATOR = new PaymentRecipient.Creator(16);
    public final ColorModel accentColor;
    public final BlockersData blockersData;
    public final EditDistributionConfiguration config;
    public final AskedQuestion question;
    public final boolean shouldDisableCtaOnZeroAllocation;

    /* loaded from: classes6.dex */
    public final class UpdatedAllocationQuestion implements Question {
        public static final UpdatedAllocationQuestion INSTANCE = new UpdatedAllocationQuestion();
        public static final Parcelable.Creator<UpdatedAllocationQuestion> CREATOR = new PaymentRecipient.Creator(17);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public EditDistributionScreen(BlockersData blockersData, EditDistributionConfiguration editDistributionConfiguration, AskedQuestion askedQuestion, boolean z, ColorModel colorModel) {
        blockersData.getClass();
        editDistributionConfiguration.getClass();
        this.blockersData = blockersData;
        this.config = editDistributionConfiguration;
        this.question = askedQuestion;
        this.shouldDisableCtaOnZeroAllocation = z;
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
        if (!(obj instanceof EditDistributionScreen)) {
            return false;
        }
        EditDistributionScreen editDistributionScreen = (EditDistributionScreen) obj;
        return Intrinsics.areEqual(this.blockersData, editDistributionScreen.blockersData) && Intrinsics.areEqual(this.config, editDistributionScreen.config) && Intrinsics.areEqual(this.question, editDistributionScreen.question) && this.shouldDisableCtaOnZeroAllocation == editDistributionScreen.shouldDisableCtaOnZeroAllocation && Intrinsics.areEqual(this.accentColor, editDistributionScreen.accentColor);
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    public final int hashCode() {
        int hashCode = (this.config.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        AskedQuestion askedQuestion = this.question;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (askedQuestion == null ? 0 : askedQuestion.hashCode())) * 31, 31, this.shouldDisableCtaOnZeroAllocation);
        ColorModel colorModel = this.accentColor;
        return m + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditDistributionScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", shouldDisableCtaOnZeroAllocation=");
        sb.append(this.shouldDisableCtaOnZeroAllocation);
        sb.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.config, i);
        parcel.writeParcelable(this.question, i);
        parcel.writeInt(this.shouldDisableCtaOnZeroAllocation ? 1 : 0);
        parcel.writeParcelable(this.accentColor, i);
    }
}
