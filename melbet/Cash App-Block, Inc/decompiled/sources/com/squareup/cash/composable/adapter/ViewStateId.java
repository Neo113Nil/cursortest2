package com.squareup.cash.composable.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.core.navigationcontainer.navigator.PresentersSavedState;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.navigation.StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll;
import com.squareup.cash.crypto.scenarioplans.models.ConfirmBitcoinDepositIntentScenarioPlanInput;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class ViewStateId implements Parcelable {
    public static final Parcelable.Creator<ViewStateId> CREATOR = new Creator(0);
    public final long adapterId;
    public final int viewType;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ViewStateId(parcel.readLong(), parcel.readInt());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Icon.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Investing.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.PrimaryButtonBackground.INSTANCE;
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.SecondaryButtonBackground.INSTANCE;
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.SecondaryLabel.INSTANCE;
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Warning.INSTANCE;
                case 7:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                    while (i != readInt) {
                        ViewStateId createFromParcel = ViewStateId.CREATOR.createFromParcel(parcel);
                        int readInt2 = parcel.readInt();
                        SparseArray sparseArray = new SparseArray(readInt2);
                        while (readInt2 != 0) {
                            sparseArray.put(parcel.readInt(), parcel.readParcelable(AdapterSavedState.class.getClassLoader()));
                            readInt2--;
                        }
                        linkedHashMap.put(createFromParcel, sparseArray);
                        i++;
                    }
                    return new AdapterSavedState(linkedHashMap);
                case 8:
                    parcel.getClass();
                    return new ScrimScreen.ManagedAccountSwitchScrimScreen((ManagedAccountAnimationInfo) parcel.readParcelable(ScrimScreen.ManagedAccountSwitchScrimScreen.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new ScrimScreen.SwitchFullAccountLoadingScrimScreen((FullAccount) parcel.readParcelable(ScrimScreen.SwitchFullAccountLoadingScrimScreen.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                    while (i != readInt3) {
                        linkedHashMap2.put(parcel.readString(), parcel.readParcelable(PresentersSavedState.class.getClassLoader()));
                        i++;
                    }
                    return new PresentersSavedState(linkedHashMap2);
                case 11:
                    parcel.getClass();
                    return new CryptoAddress$BitcoinAddress(parcel.readString());
                case 12:
                    parcel.getClass();
                    return new StablecoinDepositOption(StablecoinNetwork.CREATOR.createFromParcel(parcel), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new StablecoinNetwork(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new StablecoinWithdrawalOption(StablecoinNetwork.CREATOR.createFromParcel(parcel), (Money) parcel.readParcelable(StablecoinWithdrawalOption.class.getClassLoader()), parcel.readString(), (Money) parcel.readParcelable(StablecoinWithdrawalOption.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen((BlockersData) parcel.readParcelable(CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new CryptoCommonScreens.BitcoinP2pConversionPercentageScreen((BlockersData) parcel.readParcelable(CryptoCommonScreens.BitcoinP2pConversionPercentageScreen.class.getClassLoader()), (BitcoinP2pConversionPercentageBlocker) parcel.readParcelable(CryptoCommonScreens.BitcoinP2pConversionPercentageScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new CryptoCommonScreens.CryptoCommonInsufficientFunds((CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin) parcel.readParcelable(CryptoCommonScreens.CryptoCommonInsufficientFunds.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new BitcoinExchangeType.BuyBitcoin((Money) parcel.readParcelable(BitcoinExchangeType.BuyBitcoin.class.getClassLoader()), CurrencyCode.valueOf(parcel.readString()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertAll.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome((Money) parcel.readParcelable(BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new BitcoinExchangeType.ConvertToBitcoin((BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType) parcel.readParcelable(BitcoinExchangeType.ConvertToBitcoin.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new BitcoinExchangeType.SellAllBitcoin(CurrencyCode.valueOf(parcel.readString()), CurrencyCode.valueOf(parcel.readString()));
                case 24:
                    parcel.getClass();
                    return new BitcoinExchangeType.SellBitcoin((Money) parcel.readParcelable(BitcoinExchangeType.SellBitcoin.class.getClassLoader()), CurrencyCode.valueOf(parcel.readString()));
                case 25:
                    parcel.getClass();
                    return new CryptoPayment.InvoiceIdPayment(parcel.readString(), (UUID) parcel.readSerializable());
                case 26:
                    parcel.getClass();
                    return new CryptoPayment.InvoicePayment((BitcoinPayments) parcel.readParcelable(CryptoPayment.InvoicePayment.class.getClassLoader()), CryptoPaymentSource.valueOf(parcel.readString()), (Money) parcel.readParcelable(CryptoPayment.InvoicePayment.class.getClassLoader()), (UUID) parcel.readSerializable());
                case 27:
                    parcel.getClass();
                    return new CryptoPayment.TokenPayment(parcel.readString(), (UUID) parcel.readSerializable());
                case 28:
                    parcel.getClass();
                    return new StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll(parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new ConfirmBitcoinDepositIntentScenarioPlanInput(parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ViewStateId[i];
                case 1:
                    return new ColorModel.Icon[i];
                case 2:
                    return new ColorModel.Investing[i];
                case 3:
                    return new ColorModel.PrimaryButtonBackground[i];
                case 4:
                    return new ColorModel.SecondaryButtonBackground[i];
                case 5:
                    return new ColorModel.SecondaryLabel[i];
                case 6:
                    return new ColorModel.Warning[i];
                case 7:
                    return new AdapterSavedState[i];
                case 8:
                    return new ScrimScreen.ManagedAccountSwitchScrimScreen[i];
                case 9:
                    return new ScrimScreen.SwitchFullAccountLoadingScrimScreen[i];
                case 10:
                    return new PresentersSavedState[i];
                case 11:
                    return new CryptoAddress$BitcoinAddress[i];
                case 12:
                    return new StablecoinDepositOption[i];
                case 13:
                    return new StablecoinNetwork[i];
                case 14:
                    return new StablecoinWithdrawalOption[i];
                case 15:
                    return new CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen[i];
                case 16:
                    return new CryptoCommonScreens.BitcoinP2pConversionPercentageScreen[i];
                case 17:
                    return new CryptoCommonScreens.CryptoCommonInsufficientFunds[i];
                case 18:
                    return new CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin[i];
                case 19:
                    return new BitcoinExchangeType.BuyBitcoin[i];
                case 20:
                    return new BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertAll[i];
                case 21:
                    return new BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome[i];
                case 22:
                    return new BitcoinExchangeType.ConvertToBitcoin[i];
                case 23:
                    return new BitcoinExchangeType.SellAllBitcoin[i];
                case 24:
                    return new BitcoinExchangeType.SellBitcoin[i];
                case 25:
                    return new CryptoPayment.InvoiceIdPayment[i];
                case 26:
                    return new CryptoPayment.InvoicePayment[i];
                case 27:
                    return new CryptoPayment.TokenPayment[i];
                case 28:
                    return new StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll[i];
                default:
                    return new ConfirmBitcoinDepositIntentScenarioPlanInput[i];
            }
        }
    }

    public ViewStateId(long j, int i) {
        this.adapterId = j;
        this.viewType = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewStateId)) {
            return false;
        }
        ViewStateId viewStateId = (ViewStateId) obj;
        return this.adapterId == viewStateId.adapterId && this.viewType == viewStateId.viewType;
    }

    public final int hashCode() {
        return Integer.hashCode(this.viewType) + (Long.hashCode(this.adapterId) * 31);
    }

    public final String toString() {
        return "ViewStateId(adapterId=" + this.adapterId + ", viewType=" + this.viewType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.adapterId);
        parcel.writeInt(this.viewType);
    }
}
