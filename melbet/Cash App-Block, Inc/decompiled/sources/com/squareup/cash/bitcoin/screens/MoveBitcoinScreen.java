package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$Negative;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$Positive;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$SubmitActionResult;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetResult$SubmitActionResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AddMoneyBlocker;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ScientificNumber;

/* loaded from: classes.dex */
public final class MoveBitcoinScreen extends MainScreens {
    public static final Parcelable.Creator<MoveBitcoinScreen> CREATOR = new Creator(0);
    public final CryptoPaymentOrigin origin;

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new MoveBitcoinScreen(CryptoPaymentOrigin.valueOf(parcel.readString()));
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinSymbolLearnMoreSheetScreen.INSTANCE;
                case 2:
                    parcel.getClass();
                    return new BitcoinTransferScreen.OrderType.CustomOrder(parcel.readLong(), parcel.readLong());
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinTransferScreen.OrderType.Standard.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new BitcoinTransferScreen.SavedState((AmountSheetSavedState) parcel.readParcelable(BitcoinTransferScreen.SavedState.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return ChangeNetworkQuestion.INSTANCE;
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return PaidInBitcoinCardUpsellScreen.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new PaidInBitcoinLandingScreen((Screen) parcel.readParcelable(PaidInBitcoinLandingScreen.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return ReceiveStablecoinScreen.INSTANCE;
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return SatoshiLearnMoreSheetScreen.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new SendStablecoinScreen(parcel.readInt() != 0, (SolanaAddress) parcel.readParcelable(SendStablecoinScreen.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new StablecoinDepositCopyScreen(parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new StablecoinDepositOptionsScreen((Screen) parcel.readParcelable(StablecoinDepositOptionsScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(StablecoinDepositOptionsScreen.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    return new StablecoinDepositScreen((StablecoinDepositOption) parcel.readParcelable(StablecoinDepositScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new StablecoinOnboardingScreen(StablecoinOnboardingType.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return WalletAddressOptionsSheet.INSTANCE;
                case 16:
                    parcel.getClass();
                    return new BitcoinAmountPickerResult((Money) parcel.readParcelable(BitcoinAmountPickerResult.class.getClassLoader()), (Money) parcel.readParcelable(BitcoinAmountPickerResult.class.getClassLoader()), parcel.readString());
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return BlockerActionConfirmDialogResult$Negative.INSTANCE;
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return BlockerActionConfirmDialogResult$Positive.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new BlockerActionConfirmDialogResult$SubmitActionResult((BlockerAction) parcel.readParcelable(BlockerActionConfirmDialogResult$SubmitActionResult.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new BlockerActionConfirmSheetResult$SubmitActionResult((BlockerAction) parcel.readParcelable(BlockerActionConfirmSheetResult$SubmitActionResult.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    return new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : BlockerFlowReferrerType.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    return new BlockersData.MoneybotContext(parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new ScenarioPlanScreens.ScenarioPlanErrorScreen((ErrorMessaging) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanErrorScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanErrorScreen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new ScenarioPlanScreens.ScenarioPlanLoadingScreen((ScenarioPlans) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanLoadingScreen.class.getClassLoader()), (ScenarioPlanInput) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanLoadingScreen.class.getClassLoader()), (Screen) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanLoadingScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(ScenarioPlanScreens.ScenarioPlanLoadingScreen.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new BlockersScreens.ActivityPickerScreen((BlockersData) parcel.readParcelable(BlockersScreens.ActivityPickerScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 26:
                    parcel.getClass();
                    return new BlockersScreens.AddMoneyBlockerScreen((BlockersData) parcel.readParcelable(BlockersScreens.AddMoneyBlockerScreen.class.getClassLoader()), (AddMoneyBlocker) parcel.readParcelable(BlockersScreens.AddMoneyBlockerScreen.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new BlockersScreens.AmountScreen.Config.MoneyConfig((Money) parcel.readParcelable(BlockersScreens.AmountScreen.Config.MoneyConfig.class.getClassLoader()), (Money) parcel.readParcelable(BlockersScreens.AmountScreen.Config.MoneyConfig.class.getClassLoader()), (Money) parcel.readParcelable(BlockersScreens.AmountScreen.Config.MoneyConfig.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new BlockersScreens.AmountScreen.Config.PercentConfig((ScientificNumber) parcel.readParcelable(BlockersScreens.AmountScreen.Config.PercentConfig.class.getClassLoader()), (ScientificNumber) parcel.readParcelable(BlockersScreens.AmountScreen.Config.PercentConfig.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new BlockersScreens.AmountScreen((BlockersData) parcel.readParcelable(BlockersScreens.AmountScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (BlockersScreens.AmountScreen.Config) parcel.readParcelable(BlockersScreens.AmountScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockersScreens.AmountScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockersScreens.AmountScreen.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new MoveBitcoinScreen[i];
                case 1:
                    return new BitcoinSymbolLearnMoreSheetScreen[i];
                case 2:
                    return new BitcoinTransferScreen.OrderType.CustomOrder[i];
                case 3:
                    return new BitcoinTransferScreen.OrderType.Standard[i];
                case 4:
                    return new BitcoinTransferScreen.SavedState[i];
                case 5:
                    return new ChangeNetworkQuestion[i];
                case 6:
                    return new PaidInBitcoinCardUpsellScreen[i];
                case 7:
                    return new PaidInBitcoinLandingScreen[i];
                case 8:
                    return new ReceiveStablecoinScreen[i];
                case 9:
                    return new SatoshiLearnMoreSheetScreen[i];
                case 10:
                    return new SendStablecoinScreen[i];
                case 11:
                    return new StablecoinDepositCopyScreen[i];
                case 12:
                    return new StablecoinDepositOptionsScreen[i];
                case 13:
                    return new StablecoinDepositScreen[i];
                case 14:
                    return new StablecoinOnboardingScreen[i];
                case 15:
                    return new WalletAddressOptionsSheet[i];
                case 16:
                    return new BitcoinAmountPickerResult[i];
                case 17:
                    return new BlockerActionConfirmDialogResult$Negative[i];
                case 18:
                    return new BlockerActionConfirmDialogResult$Positive[i];
                case 19:
                    return new BlockerActionConfirmDialogResult$SubmitActionResult[i];
                case 20:
                    return new BlockerActionConfirmSheetResult$SubmitActionResult[i];
                case 21:
                    return new BlockersData.AnalyticsData[i];
                case 22:
                    return new BlockersData.MoneybotContext[i];
                case 23:
                    return new ScenarioPlanScreens.ScenarioPlanErrorScreen[i];
                case 24:
                    return new ScenarioPlanScreens.ScenarioPlanLoadingScreen[i];
                case 25:
                    return new BlockersScreens.ActivityPickerScreen[i];
                case 26:
                    return new BlockersScreens.AddMoneyBlockerScreen[i];
                case 27:
                    return new BlockersScreens.AmountScreen.Config.MoneyConfig[i];
                case 28:
                    return new BlockersScreens.AmountScreen.Config.PercentConfig[i];
                default:
                    return new BlockersScreens.AmountScreen[i];
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveBitcoinScreen(CryptoPaymentOrigin cryptoPaymentOrigin) {
        super(1);
        cryptoPaymentOrigin.getClass();
        this.origin = cryptoPaymentOrigin;
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
        return (obj instanceof MoveBitcoinScreen) && this.origin == ((MoveBitcoinScreen) obj).origin;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "MoveBitcoinScreen(origin=" + this.origin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.origin.name());
    }
}
