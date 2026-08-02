package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.payments.viewmodels.Size;

/* loaded from: classes6.dex */
public interface SkippableStep extends PaymentConfigurationStep.NavigableStep {

    public final class InputAmount implements SkippableStep {
        public static final InputAmount INSTANCE = new InputAmount();
        public static final Parcelable.Creator<InputAmount> CREATOR = new ScenarioInitiator.Creator(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InputAmount);
        }

        @Override // com.squareup.cash.payments.screens.SkippableStep
        public final /* bridge */ /* synthetic */ SkipRequirement getSkipRequirement() {
            return SkipRequirement.AmountAlreadySet.INSTANCE;
        }

        public final int hashCode() {
            return -1993899531;
        }

        public final String toString() {
            return "InputAmount";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class InputNote implements SkippableStep {
        public static final InputNote INSTANCE = new InputNote();
        public static final Parcelable.Creator<InputNote> CREATOR = new ScenarioInitiator.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InputNote);
        }

        @Override // com.squareup.cash.payments.screens.SkippableStep
        public final /* bridge */ /* synthetic */ SkipRequirement getSkipRequirement() {
            return SkipRequirement.RecipientIsCrypto.INSTANCE;
        }

        public final int hashCode() {
            return 1468703951;
        }

        public final String toString() {
            return "InputNote";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class SelectStablecoinWithdrawalOption implements SkippableStep {
        public static final SelectStablecoinWithdrawalOption INSTANCE = new SelectStablecoinWithdrawalOption();
        public static final Parcelable.Creator<SelectStablecoinWithdrawalOption> CREATOR = new ScenarioInitiator.Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectStablecoinWithdrawalOption);
        }

        @Override // com.squareup.cash.payments.screens.SkippableStep
        public final /* bridge */ /* synthetic */ SkipRequirement getSkipRequirement() {
            return SkipRequirement.StablecoinSelectionNotRequired.INSTANCE;
        }

        public final int hashCode() {
            return -533441345;
        }

        public final String toString() {
            return "SelectStablecoinWithdrawalOption";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public interface SkipRequirement extends Parcelable {

        public final class AmountAlreadySet implements SkipRequirement {
            public static final AmountAlreadySet INSTANCE = new AmountAlreadySet();
            public static final Parcelable.Creator<AmountAlreadySet> CREATOR = new ScenarioInitiator.Creator(29);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AmountAlreadySet);
            }

            public final int hashCode() {
                return -531700839;
            }

            public final String toString() {
                return "AmountAlreadySet";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class RecipientIsCrypto implements SkipRequirement {
            public static final RecipientIsCrypto INSTANCE = new RecipientIsCrypto();
            public static final Parcelable.Creator<RecipientIsCrypto> CREATOR = new Size.Creator(1);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RecipientIsCrypto);
            }

            public final int hashCode() {
                return 1479468653;
            }

            public final String toString() {
                return "RecipientIsCrypto";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class StablecoinSelectionNotRequired implements SkipRequirement {
            public static final StablecoinSelectionNotRequired INSTANCE = new StablecoinSelectionNotRequired();
            public static final Parcelable.Creator<StablecoinSelectionNotRequired> CREATOR = new Size.Creator(2);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof StablecoinSelectionNotRequired);
            }

            public final int hashCode() {
                return 1631550665;
            }

            public final String toString() {
                return "StablecoinSelectionNotRequired";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    SkipRequirement getSkipRequirement();
}
