package com.squareup.cash.pools.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;

/* loaded from: classes6.dex */
public interface PoolContributeWithNoteViewModel extends Parcelable {
    Money getAmount();

    public final class AmountAtmPicker implements PoolContributeWithNoteViewModel {
        public static final Parcelable.Creator<AmountAtmPicker> CREATOR = new PdfScreen.Creator(14);
        public final Money amount;
        public final List amountOptions;
        public final boolean buttonEnabled;

        public final class AmountPickerQuickAmount extends AmountSelectorWidgetModel.Item {
            public final String accessibilityLabel;
            public final AmountSelectorWidgetModel.Item.Icon icon;
            public final boolean isSelected;
            public final String label;

            public AmountPickerQuickAmount(String str, boolean z, String str2, int i) {
                AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
                z = (i & 2) != 0 ? false : z;
                icon = (i & 4) != 0 ? null : icon;
                str2 = (i & 8) != 0 ? null : str2;
                str.getClass();
                this.label = str;
                this.isSelected = z;
                this.icon = icon;
                this.accessibilityLabel = str2;
            }

            @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
            public final String getAccessibilityLabel() {
                return this.accessibilityLabel;
            }

            @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
            public final AmountSelectorWidgetModel.Item.Icon getIcon() {
                return this.icon;
            }

            @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
            public final String getLabel() {
                return this.label;
            }

            @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
            public final boolean isSelected() {
                return this.isSelected;
            }
        }

        public AmountAtmPicker(Money money, List list, boolean z) {
            money.getClass();
            list.getClass();
            this.amount = money;
            this.amountOptions = list;
            this.buttonEnabled = z;
        }

        public static AmountAtmPicker copy$default(AmountAtmPicker amountAtmPicker, Money money, int i) {
            List list = amountAtmPicker.amountOptions;
            boolean z = (i & 4) != 0 ? amountAtmPicker.buttonEnabled : true;
            money.getClass();
            list.getClass();
            return new AmountAtmPicker(money, list, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountAtmPicker)) {
                return false;
            }
            AmountAtmPicker amountAtmPicker = (AmountAtmPicker) obj;
            return Intrinsics.areEqual(this.amount, amountAtmPicker.amount) && Intrinsics.areEqual(this.amountOptions, amountAtmPicker.amountOptions) && this.buttonEnabled == amountAtmPicker.buttonEnabled;
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel
        public final Money getAmount() {
            return this.amount;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.buttonEnabled) + Recorder$$ExternalSyntheticOutline2.m(this.amount.hashCode() * 31, 31, this.amountOptions);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AmountAtmPicker(amount=");
            sb.append(this.amount);
            sb.append(", amountOptions=");
            sb.append(this.amountOptions);
            sb.append(", buttonEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeInt(this.buttonEnabled ? 1 : 0);
        }

        public AmountAtmPicker(Money money, ListBuilder listBuilder, boolean z, int i) {
            this(money, (i & 2) != 0 ? EmptyList.INSTANCE : listBuilder, (i & 4) != 0 ? false : z);
        }
    }

    public final class InputNote implements PoolContributeWithNoteViewModel {
        public static final Parcelable.Creator<InputNote> CREATOR = new PdfScreen.Creator(16);
        public final Money amount;
        public final String amountFormatted;
        public final boolean customAmount;
        public final String note;
        public final ImmutableList participants;
        public final String poolName;

        public InputNote(Money money, String str, String str2, boolean z, String str3, ImmutableList immutableList) {
            money.getClass();
            str.getClass();
            str2.getClass();
            immutableList.getClass();
            this.amount = money;
            this.amountFormatted = str;
            this.poolName = str2;
            this.customAmount = z;
            this.note = str3;
            this.participants = immutableList;
        }

        public static InputNote copy$default(InputNote inputNote, String str, ImmutableList immutableList, int i) {
            Money money = inputNote.amount;
            String str2 = inputNote.amountFormatted;
            String str3 = inputNote.poolName;
            boolean z = inputNote.customAmount;
            if ((i & 16) != 0) {
                str = inputNote.note;
            }
            String str4 = str;
            if ((i & 32) != 0) {
                immutableList = inputNote.participants;
            }
            ImmutableList immutableList2 = immutableList;
            money.getClass();
            str2.getClass();
            str3.getClass();
            immutableList2.getClass();
            return new InputNote(money, str2, str3, z, str4, immutableList2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputNote)) {
                return false;
            }
            InputNote inputNote = (InputNote) obj;
            return Intrinsics.areEqual(this.amount, inputNote.amount) && Intrinsics.areEqual(this.amountFormatted, inputNote.amountFormatted) && Intrinsics.areEqual(this.poolName, inputNote.poolName) && this.customAmount == inputNote.customAmount && Intrinsics.areEqual(this.note, inputNote.note) && Intrinsics.areEqual(this.participants, inputNote.participants);
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel
        public final Money getAmount() {
            return this.amount;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.amountFormatted), 31, this.poolName), 31, this.customAmount);
            String str = this.note;
            return this.participants.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InputNote(amount=");
            sb.append(this.amount);
            sb.append(", amountFormatted=");
            sb.append(this.amountFormatted);
            sb.append(", poolName=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.poolName, ", customAmount=", this.customAmount, ", note=");
            sb.append(this.note);
            sb.append(", participants=");
            sb.append(this.participants);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.amountFormatted);
            parcel.writeString(this.poolName);
            parcel.writeInt(this.customAmount ? 1 : 0);
            parcel.writeString(this.note);
        }

        public InputNote(Money money, String str, String str2, boolean z, String str3, int i) {
            this(money, str, str2, z, (i & 16) != 0 ? null : str3, SmallPersistentVector.EMPTY);
        }
    }

    public final class AmountCustomPicker implements PoolContributeWithNoteViewModel {
        public static final Parcelable.Creator<AmountCustomPicker> CREATOR = new PdfScreen.Creator(15);
        public final Money amount;
        public final boolean buttonEnabled;
        public final CurrencyCode currency;
        public final boolean isAmountInvalid;
        public final String rawAmount;

        public /* synthetic */ AmountCustomPicker(Money money, CurrencyCode currencyCode, String str, int i) {
            this(money, (i & 2) != 0 ? CurrencyCode.USD : currencyCode, (i & 4) != 0 ? "0" : str, false, (i & 16) == 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountCustomPicker)) {
                return false;
            }
            AmountCustomPicker amountCustomPicker = (AmountCustomPicker) obj;
            return Intrinsics.areEqual(this.amount, amountCustomPicker.amount) && this.currency == amountCustomPicker.currency && Intrinsics.areEqual(this.rawAmount, amountCustomPicker.rawAmount) && this.isAmountInvalid == amountCustomPicker.isAmountInvalid && this.buttonEnabled == amountCustomPicker.buttonEnabled;
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel
        public final Money getAmount() {
            return this.amount;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.buttonEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currency.hashCode() + (this.amount.hashCode() * 31)) * 31, 31, this.rawAmount), 31, this.isAmountInvalid);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AmountCustomPicker(amount=");
            sb.append(this.amount);
            sb.append(", currency=");
            sb.append(this.currency);
            sb.append(", rawAmount=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.rawAmount, ", isAmountInvalid=", this.isAmountInvalid, ", buttonEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.currency.name());
            parcel.writeString(this.rawAmount);
            parcel.writeInt(this.isAmountInvalid ? 1 : 0);
            parcel.writeInt(this.buttonEnabled ? 1 : 0);
        }

        public AmountCustomPicker(Money money, CurrencyCode currencyCode, String str, boolean z, boolean z2) {
            money.getClass();
            currencyCode.getClass();
            str.getClass();
            this.amount = money;
            this.currency = currencyCode;
            this.rawAmount = str;
            this.isAmountInvalid = z;
            this.buttonEnabled = z2;
        }
    }

    public final class Review implements PoolContributeWithNoteViewModel {
        public static final Parcelable.Creator<Review> CREATOR = new PdfScreen.Creator(17);
        public final Money amount;
        public final String amountFormatted;
        public final boolean customAmount;
        public final String disclaimerText;
        public final InstrumentSelectionRowViewModel instrumentModel;
        public final String note;
        public final ImmutableList participants;
        public final String poolName;

        public Review(Money money, String str, String str2, boolean z, String str3, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, String str4, ImmutableList immutableList) {
            money.getClass();
            str.getClass();
            str2.getClass();
            str4.getClass();
            immutableList.getClass();
            this.amount = money;
            this.amountFormatted = str;
            this.poolName = str2;
            this.customAmount = z;
            this.note = str3;
            this.instrumentModel = instrumentSelectionRowViewModel;
            this.disclaimerText = str4;
            this.participants = immutableList;
        }

        public static Review copy$default(Review review, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, ImmutableList immutableList, int i) {
            Money money = review.amount;
            String str = review.amountFormatted;
            String str2 = review.poolName;
            boolean z = review.customAmount;
            String str3 = review.note;
            if ((i & 32) != 0) {
                instrumentSelectionRowViewModel = review.instrumentModel;
            }
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = instrumentSelectionRowViewModel;
            String str4 = review.disclaimerText;
            if ((i & 128) != 0) {
                immutableList = review.participants;
            }
            ImmutableList immutableList2 = immutableList;
            money.getClass();
            str.getClass();
            str2.getClass();
            str4.getClass();
            immutableList2.getClass();
            return new Review(money, str, str2, z, str3, instrumentSelectionRowViewModel2, str4, immutableList2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Review)) {
                return false;
            }
            Review review = (Review) obj;
            return Intrinsics.areEqual(this.amount, review.amount) && Intrinsics.areEqual(this.amountFormatted, review.amountFormatted) && Intrinsics.areEqual(this.poolName, review.poolName) && this.customAmount == review.customAmount && Intrinsics.areEqual(this.note, review.note) && Intrinsics.areEqual(this.instrumentModel, review.instrumentModel) && Intrinsics.areEqual(this.disclaimerText, review.disclaimerText) && Intrinsics.areEqual(this.participants, review.participants);
        }

        @Override // com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel
        public final Money getAmount() {
            return this.amount;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.amountFormatted), 31, this.poolName), 31, this.customAmount);
            String str = this.note;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = this.instrumentModel;
            return this.participants.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.hashCode() : 0)) * 31, 31, this.disclaimerText);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Review(amount=");
            sb.append(this.amount);
            sb.append(", amountFormatted=");
            sb.append(this.amountFormatted);
            sb.append(", poolName=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.poolName, ", customAmount=", this.customAmount, ", note=");
            sb.append(this.note);
            sb.append(", instrumentModel=");
            sb.append(this.instrumentModel);
            sb.append(", disclaimerText=");
            sb.append(this.disclaimerText);
            sb.append(", participants=");
            sb.append(this.participants);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.amountFormatted);
            parcel.writeString(this.poolName);
            parcel.writeInt(this.customAmount ? 1 : 0);
            parcel.writeString(this.note);
            parcel.writeParcelable(this.instrumentModel, i);
            parcel.writeString(this.disclaimerText);
        }

        public Review(Money money, String str, String str2, boolean z, String str3, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, String str4) {
            this(money, str, str2, z, str3, instrumentSelectionRowViewModel, str4, SmallPersistentVector.EMPTY);
        }
    }
}
