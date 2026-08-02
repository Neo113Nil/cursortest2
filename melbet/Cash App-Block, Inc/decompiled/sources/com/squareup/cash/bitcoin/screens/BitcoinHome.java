package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.screens.MainScreens;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinHome extends MainScreens {
    public static final Parcelable.Creator<BitcoinHome> CREATOR = new Creator(0);
    public final String dependentCustomerToken;
    public final BitcoinOverlay overlayToLaunchOnStart;
    public final AppNavigateOpenSpace.Source source;
    public final AppNavigateOpenSpace.SourceTab sourceTab;

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BitcoinAmountPickerScreen.AmountPickerPurpose amountPickerPurpose;
            Money money;
            AskedQuestion askedQuestion;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new BitcoinHome(parcel.readInt() == 0 ? null : AppNavigateOpenSpace.SourceTab.valueOf(parcel.readString()), parcel.readInt() != 0 ? AppNavigateOpenSpace.Source.valueOf(parcel.readString()) : null, parcel.readString(), (BitcoinOverlay) parcel.readParcelable(BitcoinHome.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    BitcoinAmountPickerScreen.AmountPickerPurpose valueOf = BitcoinAmountPickerScreen.AmountPickerPurpose.valueOf(parcel.readString());
                    Money money2 = (Money) parcel.readParcelable(BitcoinAmountPickerScreen.class.getClassLoader());
                    String readString = parcel.readString();
                    AskedQuestion askedQuestion2 = (AskedQuestion) parcel.readParcelable(BitcoinAmountPickerScreen.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                        amountPickerPurpose = valueOf;
                        money = money2;
                        askedQuestion = askedQuestion2;
                    } else {
                        amountPickerPurpose = valueOf;
                        money = money2;
                        askedQuestion = askedQuestion2;
                        z = false;
                    }
                    return new BitcoinAmountPickerScreen(amountPickerPurpose, money, readString, askedQuestion, z);
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinAutoWithdrawUpsellScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new BitcoinDependentWelcomeScreen(parcel.readInt() != 0);
                case 4:
                    parcel.getClass();
                    return new BitcoinDepositCopyScreen((BitcoinPayments) parcel.readParcelable(BitcoinDepositCopyScreen.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new BitcoinDepositNoteScreen((AskedQuestion) parcel.readParcelable(BitcoinDepositNoteScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new BitcoinDepositsScreen(CryptoPaymentOrigin.valueOf(parcel.readString()), (Money) parcel.readParcelable(BitcoinDepositsScreen.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinDisplayCurrencyScreen.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new BitcoinExchangeFullScreen(BitcoinTransferScreen.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinFeatureUnavailableScreen.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer((Screen) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer.class.getClassLoader()), (BitcoinExchangeType) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer.class.getClassLoader()), parcel.readString(), parcel.readString(), (Instrument) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer.class.getClassLoader()), (Money) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer.class.getClassLoader()), (Order.RecurringSchedule) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount((Screen) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount.class.getClassLoader()), (Money) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount.class.getClassLoader()), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount((Screen) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    return new BitcoinInstrumentRecommendationScreen((Screen) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.class.getClassLoader()), (BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.class.getClassLoader()), (BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption) parcel.readParcelable(BitcoinInstrumentRecommendationScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new BitcoinInvoiceEntryScreen((CryptoPayment) parcel.readParcelable(BitcoinInvoiceEntryScreen.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinLimitsLoadingScreen.INSTANCE;
                case 16:
                    parcel.getClass();
                    return new BitcoinLocationScreen((BitcoinSellerLocation) parcel.readParcelable(BitcoinLocationScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinMapErrorQuestion.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new BitcoinMapErrorScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AskedQuestion) parcel.readParcelable(BitcoinMapErrorScreen.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new BitcoinMapOnboardingScreen(parcel.readInt() != 0 ? BitcoinMapScreen.Source.valueOf(parcel.readString()) : null);
                case 20:
                    parcel.getClass();
                    return new BitcoinMapScreen(parcel.readInt() != 0 ? BitcoinMapScreen.Source.valueOf(parcel.readString()) : null);
                case 21:
                    parcel.getClass();
                    return new BitcoinNoteQuestion(parcel.readString());
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinPayInUsdSettingsScreen.INSTANCE;
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinPerformanceDetailsScreen.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new BitcoinPeriodSelectionScreen((ColorModel) parcel.readParcelable(BitcoinPeriodSelectionScreen.class.getClassLoader()), BitcoinTransferScreen.OrderType.CustomOrder.CREATOR.createFromParcel(parcel), (BitcoinExchangeType) parcel.readParcelable(BitcoinPeriodSelectionScreen.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(BitcoinPeriodSelectionScreen.class.getClassLoader()), (Screen) parcel.readParcelable(BitcoinPeriodSelectionScreen.class.getClassLoader()), parcel.readInt() != 0 ? CurrencyCode.valueOf(parcel.readString()) : null);
                case 25:
                    parcel.getClass();
                    return new BitcoinQrCodeScannerScreen(CryptoPaymentOrigin.valueOf(parcel.readString()), (Money) parcel.readParcelable(BitcoinQrCodeScannerScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinRoundUpsCardUpsellScreen.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinSendReceiveBottomSheetScreen.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new BitcoinSendRestrictionScreen((Money) parcel.readParcelable(BitcoinSendRestrictionScreen.class.getClassLoader()), (Screen) parcel.readParcelable(BitcoinSendRestrictionScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.valueOf(parcel.readString()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new BitcoinHome[i];
                case 1:
                    return new BitcoinAmountPickerScreen[i];
                case 2:
                    return new BitcoinAutoWithdrawUpsellScreen[i];
                case 3:
                    return new BitcoinDependentWelcomeScreen[i];
                case 4:
                    return new BitcoinDepositCopyScreen[i];
                case 5:
                    return new BitcoinDepositNoteScreen[i];
                case 6:
                    return new BitcoinDepositsScreen[i];
                case 7:
                    return new BitcoinDisplayCurrencyScreen[i];
                case 8:
                    return new BitcoinExchangeFullScreen[i];
                case 9:
                    return new BitcoinFeatureUnavailableScreen[i];
                case 10:
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer[i];
                case 11:
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount[i];
                case 12:
                    return new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount[i];
                case 13:
                    return new BitcoinInstrumentRecommendationScreen[i];
                case 14:
                    return new BitcoinInvoiceEntryScreen[i];
                case 15:
                    return new BitcoinLimitsLoadingScreen[i];
                case 16:
                    return new BitcoinLocationScreen[i];
                case 17:
                    return new BitcoinMapErrorQuestion[i];
                case 18:
                    return new BitcoinMapErrorScreen[i];
                case 19:
                    return new BitcoinMapOnboardingScreen[i];
                case 20:
                    return new BitcoinMapScreen[i];
                case 21:
                    return new BitcoinNoteQuestion[i];
                case 22:
                    return new BitcoinPayInUsdSettingsScreen[i];
                case 23:
                    return new BitcoinPerformanceDetailsScreen[i];
                case 24:
                    return new BitcoinPeriodSelectionScreen[i];
                case 25:
                    return new BitcoinQrCodeScannerScreen[i];
                case 26:
                    return new BitcoinRoundUpsCardUpsellScreen[i];
                case 27:
                    return new BitcoinSendReceiveBottomSheetScreen[i];
                case 28:
                    return new BitcoinSendRestrictionScreen[i];
                default:
                    return new BitcoinStackingToolsInfoScreen[i];
            }
        }
    }

    public /* synthetic */ BitcoinHome(AppNavigateOpenSpace.SourceTab sourceTab, AppNavigateOpenSpace.Source source, String str, BitcoinTransferScreen bitcoinTransferScreen, int i) {
        this((i & 1) != 0 ? null : sourceTab, (i & 2) != 0 ? null : source, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bitcoinTransferScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinHome)) {
            return false;
        }
        BitcoinHome bitcoinHome = (BitcoinHome) obj;
        return this.sourceTab == bitcoinHome.sourceTab && this.source == bitcoinHome.source && Intrinsics.areEqual(this.dependentCustomerToken, bitcoinHome.dependentCustomerToken) && Intrinsics.areEqual(this.overlayToLaunchOnStart, bitcoinHome.overlayToLaunchOnStart);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        AppNavigateOpenSpace.SourceTab sourceTab = this.sourceTab;
        int hashCode = (sourceTab == null ? 0 : sourceTab.hashCode()) * 31;
        AppNavigateOpenSpace.Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        String str = this.dependentCustomerToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BitcoinOverlay bitcoinOverlay = this.overlayToLaunchOnStart;
        return hashCode3 + (bitcoinOverlay != null ? bitcoinOverlay.hashCode() : 0);
    }

    public final String toString() {
        return "BitcoinHome(sourceTab=" + this.sourceTab + ", source=" + this.source + ", dependentCustomerToken=" + this.dependentCustomerToken + ", overlayToLaunchOnStart=" + this.overlayToLaunchOnStart + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        AppNavigateOpenSpace.SourceTab sourceTab = this.sourceTab;
        if (sourceTab == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sourceTab.name());
        }
        AppNavigateOpenSpace.Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(source.name());
        }
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeParcelable(this.overlayToLaunchOnStart, i);
    }

    public BitcoinHome(AppNavigateOpenSpace.SourceTab sourceTab, AppNavigateOpenSpace.Source source, String str, BitcoinOverlay bitcoinOverlay) {
        super(1);
        this.sourceTab = sourceTab;
        this.source = source;
        this.dependentCustomerToken = str;
        this.overlayToLaunchOnStart = bitcoinOverlay;
    }
}
