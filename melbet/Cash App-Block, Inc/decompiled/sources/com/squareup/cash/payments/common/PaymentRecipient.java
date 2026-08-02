package com.squareup.cash.payments.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.DistributePaycheckScreen;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.HelpSheetScreen;
import com.squareup.cash.paychecks.screens.OverallocationAlertDialogScreen;
import com.squareup.cash.paychecks.screens.PaycheckActivityListScreen;
import com.squareup.cash.paychecks.screens.PaycheckAggregationReceiptScreen;
import com.squareup.cash.paychecks.screens.PaycheckAlertDialogScreen;
import com.squareup.cash.paychecks.screens.PaycheckReceiptScreen;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.paymentpad.screens.LowDiskSpaceAlertDialogScreen;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes6.dex */
public final class PaymentRecipient implements Parcelable {
    public static final Parcelable.Creator<PaymentRecipient> CREATOR = new Creator(0);
    public final Recipient.CryptoRecipientPayment cryptoInvoice;
    public final Redacted displayName;
    public final RecipientPaymentInfo paymentInfo;
    public final RecipientType recipientType;
    public final UiCustomer sendableUiCustomer;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Class cls;
            EditDistributionConfiguration editDistributionConfiguration;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new PaymentRecipient((UiCustomer) parcel.readParcelable(PaymentRecipient.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentRecipient.class.getClassLoader()), (RecipientPaymentInfo) parcel.readParcelable(PaymentRecipient.class.getClassLoader()), RecipientType.valueOf(parcel.readString()), (Recipient.CryptoRecipientPayment) parcel.readParcelable(PaymentRecipient.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new PaychecksAlertUi(parcel.readString(), parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return new PaychecksUiState.CalendarMonthPaychecksAggregation(parcel.readLong(), parcel.readLong(), PaychecksUiState.TimeBoundedPaychecksAggregation.CREATOR.createFromParcel(parcel));
                case 3:
                    parcel.getClass();
                    return new PaychecksUiState.Deduction((Money) parcel.readParcelable(PaychecksUiState.Deduction.class.getClassLoader()), parcel.readString(), parcel.readString(), (Color) parcel.readParcelable(PaychecksUiState.Deduction.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new PaychecksUiState.Employer(parcel.readInt() != 0 ? PaychecksUiState.Employer.EmployerUiConfiguration.CREATOR.createFromParcel(parcel) : null);
                case 5:
                    parcel.getClass();
                    return new PaychecksUiState.Employer.EmployerUiConfiguration((Color) parcel.readParcelable(PaychecksUiState.Employer.EmployerUiConfiguration.class.getClassLoader()), (Image) parcel.readParcelable(PaychecksUiState.Employer.EmployerUiConfiguration.class.getClassLoader()), parcel.readString());
                case 6:
                    int i = 0;
                    parcel.getClass();
                    String readString = parcel.readString();
                    PaychecksUiState.Paycheck.SettlementDate createFromParcel = PaychecksUiState.Paycheck.SettlementDate.CREATOR.createFromParcel(parcel);
                    PaychecksUiState.Employer createFromParcel2 = parcel.readInt() != 0 ? PaychecksUiState.Employer.CREATOR.createFromParcel(parcel) : null;
                    PaycheckAllocationDistribution createFromParcel3 = PaycheckAllocationDistribution.CREATOR.createFromParcel(parcel);
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(PaychecksUiState.Deduction.CREATOR, parcel, arrayList, i2, 1);
                    }
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(PaychecksUiState.RealizedAllocationAmount.CREATOR, parcel, arrayList2, i, 1);
                    }
                    return new PaychecksUiState.Paycheck(readString, createFromParcel, createFromParcel2, createFromParcel3, arrayList, arrayList2);
                case 7:
                    parcel.getClass();
                    return new PaychecksUiState.Paycheck.SettlementDate(PaychecksUiState.Paycheck.SettlementDate.Type.valueOf(parcel.readString()), parcel.readLong());
                case 8:
                    parcel.getClass();
                    return new PaychecksUiState.PaychecksBenefitsStatusSection.Button(parcel.readString(), parcel.readString());
                case 9:
                    parcel.getClass();
                    return new PaychecksUiState.PaychecksBenefitsStatusSection(PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText.CREATOR.createFromParcel(parcel), parcel.readString(), PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.valueOf(parcel.readString()), parcel.readInt() != 0 ? PaychecksUiState.PaychecksBenefitsStatusSection.Button.CREATOR.createFromParcel(parcel) : null);
                case 10:
                    parcel.getClass();
                    return new PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText(parcel.readString(), parcel.readString(), (Color) parcel.readParcelable(PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText.class.getClassLoader()), parcel.createStringArrayList());
                case 11:
                    parcel.getClass();
                    return new PaychecksUiState.RealizedAllocationAmount((AllocationDestination) parcel.readParcelable(PaychecksUiState.RealizedAllocationAmount.class.getClassLoader()), (Money) parcel.readParcelable(PaychecksUiState.RealizedAllocationAmount.class.getClassLoader()), PaychecksUiState.RealizedAllocationAmount.State.valueOf(parcel.readString()), parcel.readString());
                case 12:
                    int i3 = 0;
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(PaychecksUiState.Employer.CREATOR, parcel, arrayList3, i4, 1);
                    }
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(PaychecksUiState.Deduction.CREATOR, parcel, arrayList4, i5, 1);
                    }
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt5);
                    while (i3 != readInt5) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(PaychecksUiState.RealizedAllocationAmount.CREATOR, parcel, arrayList5, i3, 1);
                    }
                    return new PaychecksUiState.TimeBoundedPaychecksAggregation(readString2, readLong, readLong2, arrayList3, arrayList4, arrayList5);
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return new CustomAllocationQuestion();
                case 14:
                    parcel.getClass();
                    return new CustomAllocationScreen((AskedQuestion) parcel.readParcelable(CustomAllocationScreen.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), (ColorModel) parcel.readParcelable(CustomAllocationScreen.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return DistributePaycheckScreen.INSTANCE;
                case 16:
                    parcel.getClass();
                    BlockersData blockersData = (BlockersData) parcel.readParcelable(EditDistributionScreen.class.getClassLoader());
                    EditDistributionConfiguration editDistributionConfiguration2 = (EditDistributionConfiguration) parcel.readParcelable(EditDistributionScreen.class.getClassLoader());
                    AskedQuestion askedQuestion = (AskedQuestion) parcel.readParcelable(EditDistributionScreen.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        cls = EditDistributionScreen.class;
                        editDistributionConfiguration = editDistributionConfiguration2;
                        z = true;
                    } else {
                        z = false;
                        cls = EditDistributionScreen.class;
                        editDistributionConfiguration = editDistributionConfiguration2;
                    }
                    return new EditDistributionScreen(blockersData, editDistributionConfiguration, askedQuestion, z, (ColorModel) parcel.readParcelable(cls.getClassLoader()));
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return EditDistributionScreen.UpdatedAllocationQuestion.INSTANCE;
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return HelpSheetScreen.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new OverallocationAlertDialogScreen((PaychecksAlertUi) parcel.readParcelable(OverallocationAlertDialogScreen.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return PaycheckActivityListScreen.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new PaycheckAggregationReceiptScreen((PaychecksUiState.CalendarMonthPaychecksAggregation) parcel.readParcelable(PaycheckAggregationReceiptScreen.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new PaycheckAlertDialogScreen.Result(parcel.readInt() != 0);
                case 23:
                    parcel.getClass();
                    return new PaycheckReceiptScreen((Paycheck) parcel.readParcelable(PaycheckReceiptScreen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return PaychecksHomeScreen.INSTANCE;
                case 25:
                    parcel.getClass();
                    return new SetPaycheckMultipleAllocationScreen((BlockersData) parcel.readParcelable(SetPaycheckMultipleAllocationScreen.class.getClassLoader()), (SetPaycheckMultiAllocationBlocker) parcel.readParcelable(SetPaycheckMultipleAllocationScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(SetPaycheckMultipleAllocationScreen.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    return new LitePaymentPadSheetScreen(parcel.readInt() != 0);
                case 27:
                    parcel.getClass();
                    return new LowDiskSpaceAlertDialogScreen(parcel.readDouble());
                case 28:
                    parcel.getClass();
                    return new InstrumentSelectionData(parcel.readString(), parcel.readInt() == 0 ? null : InstrumentType.valueOf(parcel.readString()), parcel.readInt() != 0 ? CashInstrumentType.valueOf(parcel.readString()) : null, (Money) parcel.readParcelable(InstrumentSelectionData.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new NearbyAvatarInfo(parcel.readInt() != 0 ? Character.valueOf((char) parcel.readInt()) : null, (Color) parcel.readParcelable(NearbyAvatarInfo.class.getClassLoader()), (Image) parcel.readParcelable(NearbyAvatarInfo.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PaymentRecipient[i];
                case 1:
                    return new PaychecksAlertUi[i];
                case 2:
                    return new PaychecksUiState.CalendarMonthPaychecksAggregation[i];
                case 3:
                    return new PaychecksUiState.Deduction[i];
                case 4:
                    return new PaychecksUiState.Employer[i];
                case 5:
                    return new PaychecksUiState.Employer.EmployerUiConfiguration[i];
                case 6:
                    return new PaychecksUiState.Paycheck[i];
                case 7:
                    return new PaychecksUiState.Paycheck.SettlementDate[i];
                case 8:
                    return new PaychecksUiState.PaychecksBenefitsStatusSection.Button[i];
                case 9:
                    return new PaychecksUiState.PaychecksBenefitsStatusSection[i];
                case 10:
                    return new PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText[i];
                case 11:
                    return new PaychecksUiState.RealizedAllocationAmount[i];
                case 12:
                    return new PaychecksUiState.TimeBoundedPaychecksAggregation[i];
                case 13:
                    return new CustomAllocationQuestion[i];
                case 14:
                    return new CustomAllocationScreen[i];
                case 15:
                    return new DistributePaycheckScreen[i];
                case 16:
                    return new EditDistributionScreen[i];
                case 17:
                    return new EditDistributionScreen.UpdatedAllocationQuestion[i];
                case 18:
                    return new HelpSheetScreen[i];
                case 19:
                    return new OverallocationAlertDialogScreen[i];
                case 20:
                    return new PaycheckActivityListScreen[i];
                case 21:
                    return new PaycheckAggregationReceiptScreen[i];
                case 22:
                    return new PaycheckAlertDialogScreen.Result[i];
                case 23:
                    return new PaycheckReceiptScreen[i];
                case 24:
                    return new PaychecksHomeScreen[i];
                case 25:
                    return new SetPaycheckMultipleAllocationScreen[i];
                case 26:
                    return new LitePaymentPadSheetScreen[i];
                case 27:
                    return new LowDiskSpaceAlertDialogScreen[i];
                case 28:
                    return new InstrumentSelectionData[i];
                default:
                    return new NearbyAvatarInfo[i];
            }
        }
    }

    public PaymentRecipient(UiCustomer uiCustomer, Redacted redacted, RecipientPaymentInfo recipientPaymentInfo, RecipientType recipientType, Recipient.CryptoRecipientPayment cryptoRecipientPayment) {
        uiCustomer.getClass();
        redacted.getClass();
        recipientPaymentInfo.getClass();
        recipientType.getClass();
        this.sendableUiCustomer = uiCustomer;
        this.displayName = redacted;
        this.paymentInfo = recipientPaymentInfo;
        this.recipientType = recipientType;
        this.cryptoInvoice = cryptoRecipientPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentRecipient)) {
            return false;
        }
        PaymentRecipient paymentRecipient = (PaymentRecipient) obj;
        return Intrinsics.areEqual(this.sendableUiCustomer, paymentRecipient.sendableUiCustomer) && Intrinsics.areEqual(this.displayName, paymentRecipient.displayName) && Intrinsics.areEqual(this.paymentInfo, paymentRecipient.paymentInfo) && this.recipientType == paymentRecipient.recipientType && Intrinsics.areEqual(this.cryptoInvoice, paymentRecipient.cryptoInvoice);
    }

    public final int hashCode() {
        int hashCode = (this.recipientType.hashCode() + ((this.paymentInfo.hashCode() + re$$ExternalSyntheticOutline0.m(this.displayName, this.sendableUiCustomer.hashCode() * 31, 31)) * 31)) * 31;
        Recipient.CryptoRecipientPayment cryptoRecipientPayment = this.cryptoInvoice;
        return hashCode + (cryptoRecipientPayment == null ? 0 : cryptoRecipientPayment.hashCode());
    }

    public final String toString() {
        return "PaymentRecipient(sendableUiCustomer=" + this.sendableUiCustomer + ", displayName=" + this.displayName + ", paymentInfo=" + this.paymentInfo + ", recipientType=" + this.recipientType + ", cryptoInvoice=" + this.cryptoInvoice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.sendableUiCustomer, i);
        parcel.writeParcelable(this.displayName, i);
        parcel.writeParcelable(this.paymentInfo, i);
        parcel.writeString(this.recipientType.name());
        parcel.writeParcelable(this.cryptoInvoice, i);
    }
}
