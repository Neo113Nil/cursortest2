package com.squareup.cash.investing.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.investing.presenters.InvestmentOrderPresenter$Empty;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.scenarioplans.models.InitiateInvestmentOrderScenarioPlanInput;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterToken implements Parcelable {
    public static final Parcelable.Creator<FilterToken> CREATOR = new Creator(0);
    public final String value;

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
                    return new FilterToken(parcel.readString());
                case 1:
                    int i2 = 0;
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(SelectPaymentInstrumentViewModel.class, parcel, arrayList, i2, 1);
                    }
                    return new SelectPaymentInstrumentViewModel(readString, arrayList, parcel.readInt());
                case 2:
                    parcel.getClass();
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (BalanceSnapshot) parcel.readParcelable(SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance.class.getClassLoader()), (Money) parcel.readParcelable(SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InstrumentAvatarViewModel.CREATOR.createFromParcel(parcel));
                case 3:
                    boolean z = false;
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument(readString2, readString3, z, (Instrument) parcel.readParcelable(SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument.class.getClassLoader()), (Money) parcel.readParcelable(SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument.class.getClassLoader()), parcel.readInt() == 0 ? null : InstrumentAvatarViewModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    InstrumentAvatarViewModel instrumentAvatarViewModel = null;
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    CashInstrumentType valueOf = parcel.readInt() == 0 ? null : CashInstrumentType.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        instrumentAvatarViewModel = InstrumentAvatarViewModel.CREATOR.createFromParcel(parcel);
                    }
                    InstrumentAvatarViewModel instrumentAvatarViewModel2 = instrumentAvatarViewModel;
                    CashInstrumentType cashInstrumentType = valueOf;
                    String readString6 = parcel.readString();
                    boolean z2 = true;
                    String readString7 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z2 = false;
                    }
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument(readString4, readString5, cashInstrumentType, instrumentAvatarViewModel2, readString6, readString7, z2);
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestmentOrderPresenter$Empty.INSTANCE;
                case 6:
                    parcel.getClass();
                    return new CategoryToken(parcel.readString());
                case 7:
                    parcel.getClass();
                    FilterToken createFromParcel = FilterToken.CREATOR.createFromParcel(parcel);
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(CategoryToken.CREATOR, parcel, arrayList2, i, 1);
                    }
                    return new FilterConfiguration.Categories(createFromParcel, arrayList2);
                case 8:
                    parcel.getClass();
                    return new FilterConfiguration.Empty(FilterToken.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    FilterToken createFromParcel2 = FilterToken.CREATOR.createFromParcel(parcel);
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
                    while (i != readInt3) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                    return new FilterConfiguration.SubFilters(createFromParcel2, linkedHashMap);
                case 10:
                    parcel.getClass();
                    return new InvestmentEntityToken(parcel.readString());
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return NewsKind.BitcoinPortfolio.INSTANCE;
                case 12:
                    parcel.getClass();
                    return new NewsKind.Stock(InvestmentEntityToken.CREATOR.createFromParcel(parcel));
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return NewsKind.StocksPortfolio.INSTANCE;
                case 14:
                    parcel.getClass();
                    return new InitiateInvestmentOrderScenarioPlanInput((InitiateInvestmentOrderRequest) parcel.readParcelable(InitiateInvestmentOrderScenarioPlanInput.class.getClassLoader()), (ColorModel) parcel.readParcelable(InitiateInvestmentOrderScenarioPlanInput.class.getClassLoader()), parcel.readString());
                case 15:
                    parcel.getClass();
                    return new InvestingScreens.CancelScheduledOrderScreen(parcel.readString(), parcel.readString(), parcel.readString(), InvestingScreens.CancelScheduledOrderScreen.CancelType.valueOf(parcel.readString()), (ColorModel) parcel.readParcelable(InvestingScreens.CancelScheduledOrderScreen.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new InvestingScreens.CategoryDetailScreen((CategoryToken) parcel.readParcelable(InvestingScreens.CategoryDetailScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new InvestingScreens.CustomOrderScreen((InvestingScreens.OrderTypeSelectionScreen.Type) parcel.readParcelable(InvestingScreens.CustomOrderScreen.class.getClassLoader()), OrderSide.valueOf(parcel.readString()), (ColorModel) parcel.readParcelable(InvestingScreens.CustomOrderScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new InvestingScreens.CustomSharePriceScreen((InvestingScreens.OrderTypeSelectionScreen.Type) parcel.readParcelable(InvestingScreens.CustomSharePriceScreen.class.getClassLoader()), OrderSide.valueOf(parcel.readString()), (ColorModel) parcel.readParcelable(InvestingScreens.CustomSharePriceScreen.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new InvestingScreens.DependentAutoInvestBottomSheet(parcel.readString());
                case 20:
                    parcel.getClass();
                    return new InvestingScreens.DependentWelcomeScreen(parcel.readInt() != 0);
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.DividendReinvestmentLearnMoreSheet.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.DividendReinvestmentLearnMoreSheetV2.INSTANCE;
                case 23:
                    parcel.getClass();
                    return new InvestingScreens.DividendReinvestmentSettingScreen(ScreenSource.valueOf(parcel.readString()));
                case 24:
                    parcel.getClass();
                    return new InvestingScreens.DividendReinvestmentWelcomeScreen((Screen) parcel.readParcelable(InvestingScreens.DividendReinvestmentWelcomeScreen.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new InvestingScreens.EtfHoldingsDetailsScreen((InvestmentEntityToken) parcel.readParcelable(InvestingScreens.EtfHoldingsDetailsScreen.class.getClassLoader()), parcel.readString());
                case 26:
                    parcel.getClass();
                    return new InvestingScreens.FilterCategoriesScreen((ColorModel) parcel.readParcelable(InvestingScreens.FilterCategoriesScreen.class.getClassLoader()), (FilterConfiguration.Categories) parcel.readParcelable(InvestingScreens.FilterCategoriesScreen.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new InvestingScreens.FilterSubFiltersScreen((ColorModel) parcel.readParcelable(InvestingScreens.FilterSubFiltersScreen.class.getClassLoader()), (FilterConfiguration.SubFilters) parcel.readParcelable(InvestingScreens.FilterSubFiltersScreen.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new InvestingScreens.InvestingActivityHistoryScreen((InvestmentEntityToken) parcel.readParcelable(InvestingScreens.InvestingActivityHistoryScreen.class.getClassLoader()));
                default:
                    CategoryToken categoryToken = (CategoryToken) NavAction$$ExternalSyntheticOutline0.m(parcel, InvestingScreens.InvestingCategoryFilterScreen.class);
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                    while (i != readInt4) {
                        linkedHashMap2.put(parcel.readParcelable(InvestingScreens.InvestingCategoryFilterScreen.class.getClassLoader()), parcel.readParcelable(InvestingScreens.InvestingCategoryFilterScreen.class.getClassLoader()));
                        i++;
                    }
                    return new InvestingScreens.InvestingCategoryFilterScreen(categoryToken, linkedHashMap2, (AskedQuestion) parcel.readParcelable(InvestingScreens.InvestingCategoryFilterScreen.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new FilterToken[i];
                case 1:
                    return new SelectPaymentInstrumentViewModel[i];
                case 2:
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance[i];
                case 3:
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument[i];
                case 4:
                    return new SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument[i];
                case 5:
                    return new InvestmentOrderPresenter$Empty[i];
                case 6:
                    return new CategoryToken[i];
                case 7:
                    return new FilterConfiguration.Categories[i];
                case 8:
                    return new FilterConfiguration.Empty[i];
                case 9:
                    return new FilterConfiguration.SubFilters[i];
                case 10:
                    return new InvestmentEntityToken[i];
                case 11:
                    return new NewsKind.BitcoinPortfolio[i];
                case 12:
                    return new NewsKind.Stock[i];
                case 13:
                    return new NewsKind.StocksPortfolio[i];
                case 14:
                    return new InitiateInvestmentOrderScenarioPlanInput[i];
                case 15:
                    return new InvestingScreens.CancelScheduledOrderScreen[i];
                case 16:
                    return new InvestingScreens.CategoryDetailScreen[i];
                case 17:
                    return new InvestingScreens.CustomOrderScreen[i];
                case 18:
                    return new InvestingScreens.CustomSharePriceScreen[i];
                case 19:
                    return new InvestingScreens.DependentAutoInvestBottomSheet[i];
                case 20:
                    return new InvestingScreens.DependentWelcomeScreen[i];
                case 21:
                    return new InvestingScreens.DividendReinvestmentLearnMoreSheet[i];
                case 22:
                    return new InvestingScreens.DividendReinvestmentLearnMoreSheetV2[i];
                case 23:
                    return new InvestingScreens.DividendReinvestmentSettingScreen[i];
                case 24:
                    return new InvestingScreens.DividendReinvestmentWelcomeScreen[i];
                case 25:
                    return new InvestingScreens.EtfHoldingsDetailsScreen[i];
                case 26:
                    return new InvestingScreens.FilterCategoriesScreen[i];
                case 27:
                    return new InvestingScreens.FilterSubFiltersScreen[i];
                case 28:
                    return new InvestingScreens.InvestingActivityHistoryScreen[i];
                default:
                    return new InvestingScreens.InvestingCategoryFilterScreen[i];
            }
        }
    }

    public FilterToken(String str) {
        str.getClass();
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterToken) && Intrinsics.areEqual(this.value, ((FilterToken) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterToken(value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
