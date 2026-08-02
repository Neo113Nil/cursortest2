package com.squareup.cash.investing.screen.keys;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.nimbusds.jose.util.Base64Codec;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.navigation.ReceivesStockSelectionResult;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.invitations.SmsInvitation;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class InvestingScreens implements Screen {

    public abstract class CancelRecurringPurchase extends InvestingScreens implements AccentedScreen {

        /* loaded from: classes6.dex */
        public final class Bitcoin extends CancelRecurringPurchase {
            public static final Parcelable.Creator<Bitcoin> CREATOR = new Creator();
            public final String flowToken;
            public final RecurringSchedule.Frequency frequency;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Bitcoin(parcel.readString(), RecurringSchedule.Frequency.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Bitcoin[i];
                }
            }

            public Bitcoin(String str, RecurringSchedule.Frequency frequency) {
                str.getClass();
                frequency.getClass();
                this.flowToken = str;
                this.frequency = frequency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Bitcoin)) {
                    return false;
                }
                Bitcoin bitcoin = (Bitcoin) obj;
                return Intrinsics.areEqual(this.flowToken, bitcoin.flowToken) && this.frequency == bitcoin.frequency;
            }

            @Override // com.squareup.cash.screens.AccentedScreen
            public final /* bridge */ /* synthetic */ ColorModel getAccentColor() {
                return ColorModel.Bitcoin.INSTANCE;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final int hashCode() {
                return this.frequency.hashCode() + (this.flowToken.hashCode() * 31);
            }

            public final String toString() {
                return "Bitcoin(flowToken=" + this.flowToken + ", frequency=" + this.frequency + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeString(this.frequency.name());
            }
        }

        /* loaded from: classes6.dex */
        public final class Equity extends CancelRecurringPurchase {
            public static final Parcelable.Creator<Equity> CREATOR = new Creator();
            public final ColorModel accentColor;
            public final Money amount;
            public final RecurringSchedule.Frequency frequency;
            public final InvestmentEntityToken token;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Equity(RecurringSchedule.Frequency.valueOf(parcel.readString()), (InvestmentEntityToken) parcel.readParcelable(Equity.class.getClassLoader()), (Money) parcel.readParcelable(Equity.class.getClassLoader()), (ColorModel) parcel.readParcelable(Equity.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Equity[i];
                }
            }

            public Equity(RecurringSchedule.Frequency frequency, InvestmentEntityToken investmentEntityToken, Money money, ColorModel colorModel) {
                frequency.getClass();
                investmentEntityToken.getClass();
                money.getClass();
                this.frequency = frequency;
                this.token = investmentEntityToken;
                this.amount = money;
                this.accentColor = colorModel;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Equity)) {
                    return false;
                }
                Equity equity = (Equity) obj;
                return this.frequency == equity.frequency && Intrinsics.areEqual(this.token, equity.token) && Intrinsics.areEqual(this.amount, equity.amount) && Intrinsics.areEqual(this.accentColor, equity.accentColor);
            }

            @Override // com.squareup.cash.screens.AccentedScreen
            public final ColorModel getAccentColor() {
                return this.accentColor;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final int hashCode() {
                int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.frequency.hashCode() * 31, 31, this.token.value), 31);
                ColorModel colorModel = this.accentColor;
                return m + (colorModel == null ? 0 : colorModel.hashCode());
            }

            public final String toString() {
                return "Equity(frequency=" + this.frequency + ", token=" + this.token + ", amount=" + this.amount + ", accentColor=" + this.accentColor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.frequency.name());
                parcel.writeParcelable(this.token, i);
                parcel.writeParcelable(this.amount, i);
                parcel.writeParcelable(this.accentColor, i);
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class CancelScheduledOrderScreen extends InvestingDialogs implements AccentedScreen {
        public static final Parcelable.Creator<CancelScheduledOrderScreen> CREATOR = new FilterToken.Creator(15);
        public final ColorModel accentColor;
        public final String flowToken;
        public final String message;
        public final String paymentToken;

        /* renamed from: type, reason: collision with root package name */
        public final CancelType f1156type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CancelType {
            public static final /* synthetic */ CancelType[] $VALUES;
            public static final CancelType CRYPTO;
            public static final CancelType STOCK;

            static {
                CancelType cancelType = new CancelType("STOCK", 0);
                STOCK = cancelType;
                CancelType cancelType2 = new CancelType("CRYPTO", 1);
                CRYPTO = cancelType2;
                $VALUES = new CancelType[]{cancelType, cancelType2};
            }

            public static CancelType valueOf(String str) {
                return (CancelType) Enum.valueOf(CancelType.class, str);
            }

            public static CancelType[] values() {
                return (CancelType[]) $VALUES.clone();
            }
        }

        public CancelScheduledOrderScreen(String str, String str2, String str3, CancelType cancelType, ColorModel colorModel) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            cancelType.getClass();
            colorModel.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.message = str3;
            this.f1156type = cancelType;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelScheduledOrderScreen)) {
                return false;
            }
            CancelScheduledOrderScreen cancelScheduledOrderScreen = (CancelScheduledOrderScreen) obj;
            return Intrinsics.areEqual(this.flowToken, cancelScheduledOrderScreen.flowToken) && Intrinsics.areEqual(this.paymentToken, cancelScheduledOrderScreen.paymentToken) && Intrinsics.areEqual(this.message, cancelScheduledOrderScreen.message) && this.f1156type == cancelScheduledOrderScreen.f1156type && Intrinsics.areEqual(this.accentColor, cancelScheduledOrderScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.accentColor.hashCode() + ((this.f1156type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken), 31, this.message)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelScheduledOrderScreen(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", message=");
            m.append(this.message);
            m.append(", type=");
            m.append(this.f1156type);
            m.append(", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.accentColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentToken);
            parcel.writeString(this.message);
            parcel.writeString(this.f1156type.name());
            parcel.writeParcelable(this.accentColor, i);
        }
    }

    public final class CategoryDetailScreen extends InvestingScreens {
        public static final Parcelable.Creator<CategoryDetailScreen> CREATOR = new FilterToken.Creator(16);
        public final CategoryToken token;

        public CategoryDetailScreen(CategoryToken categoryToken) {
            categoryToken.getClass();
            this.token = categoryToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryDetailScreen) && Intrinsics.areEqual(this.token, ((CategoryDetailScreen) obj).token);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return "CategoryDetailScreen(token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.token, i);
        }
    }

    public final class CustomOrderScreen extends InvestingScreens implements AccentedScreen {
        public static final Parcelable.Creator<CustomOrderScreen> CREATOR = new FilterToken.Creator(17);
        public final ColorModel accentColor;
        public final OrderSide side;

        /* renamed from: type, reason: collision with root package name */
        public final OrderTypeSelectionScreen.Type f1157type;

        public CustomOrderScreen(OrderTypeSelectionScreen.Type type2, OrderSide orderSide, ColorModel colorModel) {
            type2.getClass();
            orderSide.getClass();
            colorModel.getClass();
            this.f1157type = type2;
            this.side = orderSide;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomOrderScreen)) {
                return false;
            }
            CustomOrderScreen customOrderScreen = (CustomOrderScreen) obj;
            return Intrinsics.areEqual(this.f1157type, customOrderScreen.f1157type) && this.side == customOrderScreen.side && Intrinsics.areEqual(this.accentColor, customOrderScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.accentColor.hashCode() + ((this.side.hashCode() + (this.f1157type.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomOrderScreen(type=");
            sb.append(this.f1157type);
            sb.append(", side=");
            sb.append(this.side);
            sb.append(", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f1157type, i);
            parcel.writeString(this.side.name());
            parcel.writeParcelable(this.accentColor, i);
        }
    }

    public final class CustomSharePriceScreen extends InvestingScreens implements AccentedScreen {
        public static final Parcelable.Creator<CustomSharePriceScreen> CREATOR = new FilterToken.Creator(18);
        public final ColorModel accentColor;
        public final OrderSide orderSide;

        /* renamed from: type, reason: collision with root package name */
        public final OrderTypeSelectionScreen.Type f1158type;

        public CustomSharePriceScreen(OrderTypeSelectionScreen.Type type2, OrderSide orderSide, ColorModel colorModel) {
            type2.getClass();
            orderSide.getClass();
            colorModel.getClass();
            this.f1158type = type2;
            this.orderSide = orderSide;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomSharePriceScreen)) {
                return false;
            }
            CustomSharePriceScreen customSharePriceScreen = (CustomSharePriceScreen) obj;
            return Intrinsics.areEqual(this.f1158type, customSharePriceScreen.f1158type) && this.orderSide == customSharePriceScreen.orderSide && Intrinsics.areEqual(this.accentColor, customSharePriceScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.accentColor.hashCode() + ((this.orderSide.hashCode() + (this.f1158type.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomSharePriceScreen(type=");
            sb.append(this.f1158type);
            sb.append(", orderSide=");
            sb.append(this.orderSide);
            sb.append(", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f1158type, i);
            parcel.writeString(this.orderSide.name());
            parcel.writeParcelable(this.accentColor, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class DependentAutoInvestBottomSheet extends InvestingScreens implements BottomSheetScreen {
        public static final Parcelable.Creator<DependentAutoInvestBottomSheet> CREATOR = new FilterToken.Creator(19);
        public final String dependentName;

        public DependentAutoInvestBottomSheet(String str) {
            str.getClass();
            this.dependentName = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DependentAutoInvestBottomSheet) && Intrinsics.areEqual(this.dependentName, ((DependentAutoInvestBottomSheet) obj).dependentName);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.dependentName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentAutoInvestBottomSheet(dependentName=", this.dependentName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dependentName);
        }
    }

    public final class DependentWelcomeScreen extends InvestingScreens {
        public static final Parcelable.Creator<DependentWelcomeScreen> CREATOR = new FilterToken.Creator(20);
        public final boolean checkDependentStatus;

        public DependentWelcomeScreen(boolean z) {
            this.checkDependentStatus = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DependentWelcomeScreen) && this.checkDependentStatus == ((DependentWelcomeScreen) obj).checkDependentStatus;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return Boolean.hashCode(this.checkDependentStatus);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("DependentWelcomeScreen(checkDependentStatus=", ")", this.checkDependentStatus);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.checkDependentStatus ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public final class DividendReinvestmentLearnMoreSheet extends InvestingSheets {
        public static final DividendReinvestmentLearnMoreSheet INSTANCE = new DividendReinvestmentLearnMoreSheet();
        public static final Parcelable.Creator<DividendReinvestmentLearnMoreSheet> CREATOR = new FilterToken.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DividendReinvestmentLearnMoreSheet);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return 696180932;
        }

        public final String toString() {
            return "DividendReinvestmentLearnMoreSheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class DividendReinvestmentLearnMoreSheetV2 extends InvestingScreens implements OnlyOneOverlayTreatment {
        public static final DividendReinvestmentLearnMoreSheetV2 INSTANCE = new DividendReinvestmentLearnMoreSheetV2();
        public static final Parcelable.Creator<DividendReinvestmentLearnMoreSheetV2> CREATOR = new FilterToken.Creator(22);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DividendReinvestmentLearnMoreSheetV2);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return -985019808;
        }

        public final String toString() {
            return "DividendReinvestmentLearnMoreSheetV2";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class DividendReinvestmentSettingScreen extends InvestingScreens implements RestoringScreen, AccentedScreen {
        public static final Parcelable.Creator<DividendReinvestmentSettingScreen> CREATOR = new FilterToken.Creator(23);
        public final ScreenSource screenSource;

        public DividendReinvestmentSettingScreen(ScreenSource screenSource) {
            screenSource.getClass();
            this.screenSource = screenSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DividendReinvestmentSettingScreen) && this.screenSource == ((DividendReinvestmentSettingScreen) obj).screenSource;
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return ColorModel.Investing.INSTANCE;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.screenSource.hashCode();
        }

        public final String toString() {
            return "DividendReinvestmentSettingScreen(screenSource=" + this.screenSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.screenSource.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class DividendReinvestmentWelcomeScreen extends InvestingScreens implements NeverInBackStackScreen {
        public static final Parcelable.Creator<DividendReinvestmentWelcomeScreen> CREATOR = new FilterToken.Creator(24);
        public final Screen exitScreen;

        public DividendReinvestmentWelcomeScreen(Screen screen) {
            screen.getClass();
            this.exitScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DividendReinvestmentWelcomeScreen) && Intrinsics.areEqual(this.exitScreen, ((DividendReinvestmentWelcomeScreen) obj).exitScreen);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.exitScreen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.exitScreen, "DividendReinvestmentWelcomeScreen(exitScreen=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
        }
    }

    public final class EtfHoldingsDetailsScreen extends InvestingScreens {
        public static final Parcelable.Creator<EtfHoldingsDetailsScreen> CREATOR = new FilterToken.Creator(25);
        public final InvestmentEntityToken investmentEntityToken;
        public final String tickerSymbol;

        public EtfHoldingsDetailsScreen(InvestmentEntityToken investmentEntityToken, String str) {
            investmentEntityToken.getClass();
            str.getClass();
            this.investmentEntityToken = investmentEntityToken;
            this.tickerSymbol = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EtfHoldingsDetailsScreen)) {
                return false;
            }
            EtfHoldingsDetailsScreen etfHoldingsDetailsScreen = (EtfHoldingsDetailsScreen) obj;
            return Intrinsics.areEqual(this.investmentEntityToken, etfHoldingsDetailsScreen.investmentEntityToken) && Intrinsics.areEqual(this.tickerSymbol, etfHoldingsDetailsScreen.tickerSymbol);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.tickerSymbol.hashCode() + (this.investmentEntityToken.hashCode() * 31);
        }

        public final String toString() {
            return "EtfHoldingsDetailsScreen(investmentEntityToken=" + this.investmentEntityToken + ", tickerSymbol=" + this.tickerSymbol + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.investmentEntityToken, i);
            parcel.writeString(this.tickerSymbol);
        }
    }

    /* loaded from: classes6.dex */
    public final class FilterCategoriesScreen extends InvestingSheets implements AccentedScreen {
        public static final Parcelable.Creator<FilterCategoriesScreen> CREATOR = new FilterToken.Creator(26);
        public final ColorModel accentColor;
        public final FilterConfiguration.Categories filterConfiguration;

        public FilterCategoriesScreen(ColorModel colorModel, FilterConfiguration.Categories categories) {
            colorModel.getClass();
            categories.getClass();
            this.accentColor = colorModel;
            this.filterConfiguration = categories;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterCategoriesScreen)) {
                return false;
            }
            FilterCategoriesScreen filterCategoriesScreen = (FilterCategoriesScreen) obj;
            return Intrinsics.areEqual(this.accentColor, filterCategoriesScreen.accentColor) && Intrinsics.areEqual(this.filterConfiguration, filterCategoriesScreen.filterConfiguration);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.filterConfiguration.hashCode() + (this.accentColor.hashCode() * 31);
        }

        public final String toString() {
            return "FilterCategoriesScreen(accentColor=" + this.accentColor + ", filterConfiguration=" + this.filterConfiguration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.filterConfiguration, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class FilterSubFiltersScreen extends InvestingSheets implements AccentedScreen {
        public static final Parcelable.Creator<FilterSubFiltersScreen> CREATOR = new FilterToken.Creator(27);
        public final ColorModel accentColor;
        public final FilterConfiguration.SubFilters filterConfiguration;

        public FilterSubFiltersScreen(ColorModel colorModel, FilterConfiguration.SubFilters subFilters) {
            colorModel.getClass();
            subFilters.getClass();
            this.accentColor = colorModel;
            this.filterConfiguration = subFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterSubFiltersScreen)) {
                return false;
            }
            FilterSubFiltersScreen filterSubFiltersScreen = (FilterSubFiltersScreen) obj;
            return Intrinsics.areEqual(this.accentColor, filterSubFiltersScreen.accentColor) && Intrinsics.areEqual(this.filterConfiguration, filterSubFiltersScreen.filterConfiguration);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.filterConfiguration.hashCode() + (this.accentColor.hashCode() * 31);
        }

        public final String toString() {
            return "FilterSubFiltersScreen(accentColor=" + this.accentColor + ", filterConfiguration=" + this.filterConfiguration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.filterConfiguration, i);
        }
    }

    public interface HasEntityToken extends Screen {
    }

    public interface HasFrequency extends HasEntityToken {
        Screen copyWithFrequency(RecurringSchedule.Frequency frequency);

        RecurringSchedule.Frequency getFrequency();
    }

    public final class InvestingActivityHistoryScreen extends InvestingScreens {
        public static final Parcelable.Creator<InvestingActivityHistoryScreen> CREATOR = new FilterToken.Creator(28);
        public final InvestmentEntityToken investmentEntityToken;

        public InvestingActivityHistoryScreen(InvestmentEntityToken investmentEntityToken) {
            investmentEntityToken.getClass();
            this.investmentEntityToken = investmentEntityToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvestingActivityHistoryScreen) && Intrinsics.areEqual(this.investmentEntityToken, ((InvestingActivityHistoryScreen) obj).investmentEntityToken);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.investmentEntityToken.hashCode();
        }

        public final String toString() {
            return "InvestingActivityHistoryScreen(investmentEntityToken=" + this.investmentEntityToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.investmentEntityToken, i);
        }
    }

    public final class InvestingCategoryFilterScreen extends InvestingScreens {
        public static final Parcelable.Creator<InvestingCategoryFilterScreen> CREATOR = new FilterToken.Creator(29);
        public final AskedQuestion askedQuestion;
        public final Map filterMap;
        public final CategoryToken token;

        public InvestingCategoryFilterScreen(CategoryToken categoryToken, Map map, AskedQuestion askedQuestion) {
            categoryToken.getClass();
            map.getClass();
            askedQuestion.getClass();
            this.token = categoryToken;
            this.filterMap = map;
            this.askedQuestion = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingCategoryFilterScreen)) {
                return false;
            }
            InvestingCategoryFilterScreen investingCategoryFilterScreen = (InvestingCategoryFilterScreen) obj;
            return Intrinsics.areEqual(this.token, investingCategoryFilterScreen.token) && Intrinsics.areEqual(this.filterMap, investingCategoryFilterScreen.filterMap) && Intrinsics.areEqual(this.askedQuestion, investingCategoryFilterScreen.askedQuestion);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.askedQuestion.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.token.hashCode() * 31, this.filterMap, 31);
        }

        public final String toString() {
            return "InvestingCategoryFilterScreen(token=" + this.token + ", filterMap=" + this.filterMap + ", askedQuestion=" + this.askedQuestion + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.token, i);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.filterMap, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeParcelable((Parcelable) entry.getKey(), i);
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
            parcel.writeParcelable(this.askedQuestion, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class InvestingExplanatoryDialogScreen extends InvestingDialogs implements AccentedScreen {
        public static final Parcelable.Creator<InvestingExplanatoryDialogScreen> CREATOR = new SmsInvitation.Creator(1);
        public final ColorModel accentColor;
        public final String content;

        public InvestingExplanatoryDialogScreen(String str, ColorModel colorModel) {
            str.getClass();
            colorModel.getClass();
            this.content = str;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingExplanatoryDialogScreen)) {
                return false;
            }
            InvestingExplanatoryDialogScreen investingExplanatoryDialogScreen = (InvestingExplanatoryDialogScreen) obj;
            return Intrinsics.areEqual(this.content, investingExplanatoryDialogScreen.content) && Intrinsics.areEqual(this.accentColor, investingExplanatoryDialogScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.accentColor.hashCode() + (this.content.hashCode() * 31);
        }

        public final String toString() {
            return "InvestingExplanatoryDialogScreen(content=" + this.content + ", accentColor=" + this.accentColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.content);
            parcel.writeParcelable(this.accentColor, i);
        }
    }

    public final class InvestingPeriodSelectionScreen extends InvestingScreens implements OnlyOneOverlayTreatment, AccentedScreen {
        public static final Parcelable.Creator<InvestingPeriodSelectionScreen> CREATOR = new SmsInvitation.Creator(3);
        public final ColorModel accentColor;
        public final Long amount;
        public final String balanceToken;
        public final OrderType.CustomOrder customOrder;
        public final InvestmentEntityToken investmentEntityToken;
        public final OrderSide orderSide;
        public final HasEntityToken prevScreenBottomSheet;
        public final String shares;
        public final String symbol;

        public InvestingPeriodSelectionScreen(ColorModel colorModel, OrderType.CustomOrder customOrder, OrderSide orderSide, String str, Long l, HasEntityToken hasEntityToken, InvestmentEntityToken investmentEntityToken, String str2, String str3) {
            colorModel.getClass();
            customOrder.getClass();
            orderSide.getClass();
            str.getClass();
            hasEntityToken.getClass();
            investmentEntityToken.getClass();
            str2.getClass();
            this.accentColor = colorModel;
            this.customOrder = customOrder;
            this.orderSide = orderSide;
            this.balanceToken = str;
            this.amount = l;
            this.prevScreenBottomSheet = hasEntityToken;
            this.investmentEntityToken = investmentEntityToken;
            this.symbol = str2;
            this.shares = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingPeriodSelectionScreen)) {
                return false;
            }
            InvestingPeriodSelectionScreen investingPeriodSelectionScreen = (InvestingPeriodSelectionScreen) obj;
            return Intrinsics.areEqual(this.accentColor, investingPeriodSelectionScreen.accentColor) && Intrinsics.areEqual(this.customOrder, investingPeriodSelectionScreen.customOrder) && this.orderSide == investingPeriodSelectionScreen.orderSide && Intrinsics.areEqual(this.balanceToken, investingPeriodSelectionScreen.balanceToken) && Intrinsics.areEqual(this.amount, investingPeriodSelectionScreen.amount) && Intrinsics.areEqual(this.prevScreenBottomSheet, investingPeriodSelectionScreen.prevScreenBottomSheet) && Intrinsics.areEqual(this.investmentEntityToken, investingPeriodSelectionScreen.investmentEntityToken) && Intrinsics.areEqual(this.symbol, investingPeriodSelectionScreen.symbol) && Intrinsics.areEqual(this.shares, investingPeriodSelectionScreen.shares);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orderSide.hashCode() + ((this.customOrder.hashCode() + (this.accentColor.hashCode() * 31)) * 31)) * 31, 31, this.balanceToken);
            Long l = this.amount;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.investmentEntityToken.hashCode() + ((this.prevScreenBottomSheet.hashCode() + ((m + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31, 31, this.symbol);
            String str = this.shares;
            return m2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InvestingPeriodSelectionScreen(accentColor=");
            sb.append(this.accentColor);
            sb.append(", customOrder=");
            sb.append(this.customOrder);
            sb.append(", orderSide=");
            sb.append(this.orderSide);
            sb.append(", balanceToken=");
            sb.append(this.balanceToken);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", prevScreenBottomSheet=");
            sb.append(this.prevScreenBottomSheet);
            sb.append(", investmentEntityToken=");
            sb.append(this.investmentEntityToken);
            sb.append(", symbol=");
            sb.append(this.symbol);
            sb.append(", shares=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shares, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.accentColor, i);
            this.customOrder.writeToParcel(parcel, i);
            parcel.writeString(this.orderSide.name());
            parcel.writeString(this.balanceToken);
            Long l = this.amount;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeParcelable(this.prevScreenBottomSheet, i);
            parcel.writeParcelable(this.investmentEntityToken, i);
            parcel.writeString(this.symbol);
            parcel.writeString(this.shares);
        }
    }

    /* loaded from: classes6.dex */
    public final class InvestingSearch extends InvestingScreens implements AccentedScreen {
        public static final Parcelable.Creator<InvestingSearch> CREATOR = new SmsInvitation.Creator(4);
        public final boolean showKeypad;

        public InvestingSearch(boolean z) {
            this.showKeypad = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvestingSearch) && this.showKeypad == ((InvestingSearch) obj).showKeypad;
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return ColorModel.Investing.INSTANCE;
        }

        public final boolean getShowKeypad() {
            return this.showKeypad;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return Boolean.hashCode(this.showKeypad);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("InvestingSearch(showKeypad=", ")", this.showKeypad);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.showKeypad ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public final class InvestingSettingsScreen extends InvestingScreens implements AccentedScreen {
        public static final InvestingSettingsScreen INSTANCE = new InvestingSettingsScreen();
        public static final Parcelable.Creator<InvestingSettingsScreen> CREATOR = new SmsInvitation.Creator(5);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return ColorModel.Investing.INSTANCE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class KeyStatsDetailsScreen extends InvestingScreens {
        public static final Parcelable.Creator<KeyStatsDetailsScreen> CREATOR = new SmsInvitation.Creator(6);
        public final InvestmentEntityToken investmentEntityToken;

        public KeyStatsDetailsScreen(InvestmentEntityToken investmentEntityToken) {
            investmentEntityToken.getClass();
            this.investmentEntityToken = investmentEntityToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeyStatsDetailsScreen) && Intrinsics.areEqual(this.investmentEntityToken, ((KeyStatsDetailsScreen) obj).investmentEntityToken);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.investmentEntityToken.hashCode();
        }

        public final String toString() {
            return "KeyStatsDetailsScreen(investmentEntityToken=" + this.investmentEntityToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.investmentEntityToken, i);
        }
    }

    public final class MoreInfoSheet extends InvestingScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<MoreInfoSheet> CREATOR = new SmsInvitation.Creator(7);
        public final Section.Row.MoreInfo moreInfo;

        public MoreInfoSheet(Section.Row.MoreInfo moreInfo) {
            moreInfo.getClass();
            this.moreInfo = moreInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoreInfoSheet) && Intrinsics.areEqual(this.moreInfo, ((MoreInfoSheet) obj).moreInfo);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.moreInfo.hashCode();
        }

        public final String toString() {
            return "MoreInfoSheet(moreInfo=" + this.moreInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.moreInfo, i);
        }
    }

    public final class NewsScreen extends InvestingScreens {
        public static final Parcelable.Creator<NewsScreen> CREATOR = new SmsInvitation.Creator(8);
        public final boolean isArcade;
        public final NewsKind kind;

        public NewsScreen(NewsKind newsKind, boolean z) {
            newsKind.getClass();
            this.kind = newsKind;
            this.isArcade = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsScreen)) {
                return false;
            }
            NewsScreen newsScreen = (NewsScreen) obj;
            return Intrinsics.areEqual(this.kind, newsScreen.kind) && this.isArcade == newsScreen.isArcade;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return Boolean.hashCode(this.isArcade) + (this.kind.hashCode() * 31);
        }

        public final String toString() {
            return "NewsScreen(kind=" + this.kind + ", isArcade=" + this.isArcade + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.kind, i);
            parcel.writeInt(this.isArcade ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public abstract class OrderType implements Parcelable {

        public final class CustomOrder extends OrderType {
            public static final Parcelable.Creator<CustomOrder> CREATOR = new SmsInvitation.Creator(9);
            public final long currentUsdPerShare;
            public final long targetUsdPerShare;

            public CustomOrder(long j, long j2) {
                this.currentUsdPerShare = j;
                this.targetUsdPerShare = j2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomOrder)) {
                    return false;
                }
                CustomOrder customOrder = (CustomOrder) obj;
                return this.currentUsdPerShare == customOrder.currentUsdPerShare && this.targetUsdPerShare == customOrder.targetUsdPerShare;
            }

            public final int hashCode() {
                return Long.hashCode(this.targetUsdPerShare) + (Long.hashCode(this.currentUsdPerShare) * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.targetUsdPerShare, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.currentUsdPerShare, "CustomOrder(currentUsdPerShare=", ", targetUsdPerShare="));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.currentUsdPerShare);
                parcel.writeLong(this.targetUsdPerShare);
            }
        }

        public final class Standard extends OrderType {
            public static final Standard INSTANCE = new Standard();
            public static final Parcelable.Creator<Standard> CREATOR = new SmsInvitation.Creator(10);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Standard);
            }

            public final int hashCode() {
                return -1656828468;
            }

            public final String toString() {
                return "Standard";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public final class OrderTypeSelectionScreen extends InvestingScreens implements AccentedScreen {
        public static final Parcelable.Creator<OrderTypeSelectionScreen> CREATOR = new SmsInvitation.Creator(11);
        public final ColorModel accentColor;
        public final Screen exitScreen;
        public final OrderSide orderSide;
        public final HasFrequency prevScreenBottomSheet;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1159type;

        /* loaded from: classes6.dex */
        public abstract class Type implements Parcelable {

            public final class Bitcoin extends Type {
                public static final Bitcoin INSTANCE = new Bitcoin();
                public static final Parcelable.Creator<Bitcoin> CREATOR = new SmsInvitation.Creator(12);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Bitcoin);
                }

                public final int hashCode() {
                    return 1670796607;
                }

                public final String toString() {
                    return "Bitcoin";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Equity extends Type {
                public static final Parcelable.Creator<Equity> CREATOR = new SmsInvitation.Creator(13);
                public final InvestmentEntityToken entityToken;
                public final String symbol;

                public Equity(InvestmentEntityToken investmentEntityToken, String str) {
                    investmentEntityToken.getClass();
                    str.getClass();
                    this.entityToken = investmentEntityToken;
                    this.symbol = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Equity)) {
                        return false;
                    }
                    Equity equity = (Equity) obj;
                    return Intrinsics.areEqual(this.entityToken, equity.entityToken) && Intrinsics.areEqual(this.symbol, equity.symbol);
                }

                public final int hashCode() {
                    return this.symbol.hashCode() + (this.entityToken.value.hashCode() * 31);
                }

                public final String toString() {
                    return "Equity(entityToken=" + this.entityToken + ", symbol=" + this.symbol + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.entityToken, i);
                    parcel.writeString(this.symbol);
                }
            }
        }

        public OrderTypeSelectionScreen(OrderSide orderSide, Type type2, ColorModel colorModel, HasFrequency hasFrequency, Screen screen) {
            orderSide.getClass();
            type2.getClass();
            colorModel.getClass();
            hasFrequency.getClass();
            screen.getClass();
            this.orderSide = orderSide;
            this.f1159type = type2;
            this.accentColor = colorModel;
            this.prevScreenBottomSheet = hasFrequency;
            this.exitScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderTypeSelectionScreen)) {
                return false;
            }
            OrderTypeSelectionScreen orderTypeSelectionScreen = (OrderTypeSelectionScreen) obj;
            return this.orderSide == orderTypeSelectionScreen.orderSide && Intrinsics.areEqual(this.f1159type, orderTypeSelectionScreen.f1159type) && Intrinsics.areEqual(this.accentColor, orderTypeSelectionScreen.accentColor) && Intrinsics.areEqual(this.prevScreenBottomSheet, orderTypeSelectionScreen.prevScreenBottomSheet) && Intrinsics.areEqual(this.exitScreen, orderTypeSelectionScreen.exitScreen);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.exitScreen.hashCode() + ((this.prevScreenBottomSheet.hashCode() + ((this.accentColor.hashCode() + ((this.f1159type.hashCode() + (this.orderSide.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "OrderTypeSelectionScreen(orderSide=" + this.orderSide + ", type=" + this.f1159type + ", accentColor=" + this.accentColor + ", prevScreenBottomSheet=" + this.prevScreenBottomSheet + ", exitScreen=" + this.exitScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.orderSide.name());
            parcel.writeParcelable(this.f1159type, i);
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.prevScreenBottomSheet, i);
            parcel.writeParcelable(this.exitScreen, i);
        }
    }

    public abstract class PerformanceScreens extends InvestingScreens {

        public final class PortfolioPerformanceScreen extends PerformanceScreens {
            public static final Parcelable.Creator<PortfolioPerformanceScreen> CREATOR = new SmsInvitation.Creator(14);
            public final String customerToken;

            public PortfolioPerformanceScreen(String str) {
                this.customerToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PortfolioPerformanceScreen) && Intrinsics.areEqual(this.customerToken, ((PortfolioPerformanceScreen) obj).customerToken);
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final int hashCode() {
                String str = this.customerToken;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PortfolioPerformanceScreen(customerToken=", this.customerToken, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.customerToken);
            }
        }

        public final class StockPerformanceScreen extends PerformanceScreens {
            public static final Parcelable.Creator<StockPerformanceScreen> CREATOR = new SmsInvitation.Creator(15);
            public final boolean isArcade;
            public final InvestmentEntityToken token;

            public StockPerformanceScreen(InvestmentEntityToken investmentEntityToken, boolean z) {
                investmentEntityToken.getClass();
                this.token = investmentEntityToken;
                this.isArcade = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StockPerformanceScreen)) {
                    return false;
                }
                StockPerformanceScreen stockPerformanceScreen = (StockPerformanceScreen) obj;
                return Intrinsics.areEqual(this.token, stockPerformanceScreen.token) && this.isArcade == stockPerformanceScreen.isArcade;
            }

            @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
            public final int hashCode() {
                return Boolean.hashCode(this.isArcade) + (this.token.hashCode() * 31);
            }

            public final String toString() {
                return "StockPerformanceScreen(token=" + this.token + ", isArcade=" + this.isArcade + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.token, i);
                parcel.writeInt(this.isArcade ? 1 : 0);
            }
        }
    }

    public final class RecurringPurchaseReceipt extends InvestingScreens implements OnlyOneOverlayTreatment, AccentedScreen {
        public static final Parcelable.Creator<RecurringPurchaseReceipt> CREATOR = new SmsInvitation.Creator(16);
        public final ColorModel accentColor;
        public final String preferenceId;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1161type;

        /* loaded from: classes6.dex */
        public abstract class Type implements Parcelable {

            public final class Bitcoin extends Type {
                public static final Bitcoin INSTANCE = new Bitcoin();
                public static final Parcelable.Creator<Bitcoin> CREATOR = new SmsInvitation.Creator(17);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Bitcoin);
                }

                public final int hashCode() {
                    return -1017498507;
                }

                public final String toString() {
                    return "Bitcoin";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Stock extends Type {
                public static final Parcelable.Creator<Stock> CREATOR = new SmsInvitation.Creator(18);
                public final InvestmentEntityToken entityToken;
                public final Image icon;

                public Stock(Image image, InvestmentEntityToken investmentEntityToken) {
                    investmentEntityToken.getClass();
                    this.icon = image;
                    this.entityToken = investmentEntityToken;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Stock)) {
                        return false;
                    }
                    Stock stock = (Stock) obj;
                    return Intrinsics.areEqual(this.icon, stock.icon) && Intrinsics.areEqual(this.entityToken, stock.entityToken);
                }

                public final int hashCode() {
                    Image image = this.icon;
                    return this.entityToken.value.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
                }

                public final String toString() {
                    return "Stock(icon=" + this.icon + ", entityToken=" + this.entityToken + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.icon, i);
                    parcel.writeParcelable(this.entityToken, i);
                }
            }
        }

        public RecurringPurchaseReceipt(String str, ColorModel colorModel, Type type2) {
            str.getClass();
            colorModel.getClass();
            type2.getClass();
            this.preferenceId = str;
            this.accentColor = colorModel;
            this.f1161type = type2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecurringPurchaseReceipt)) {
                return false;
            }
            RecurringPurchaseReceipt recurringPurchaseReceipt = (RecurringPurchaseReceipt) obj;
            return RecurringPreferenceId.m3730equalsimpl0(this.preferenceId, recurringPurchaseReceipt.preferenceId) && Intrinsics.areEqual(this.accentColor, recurringPurchaseReceipt.accentColor) && Intrinsics.areEqual(this.f1161type, recurringPurchaseReceipt.f1161type);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return this.f1161type.hashCode() + ((this.accentColor.hashCode() + (RecurringPreferenceId.m3731hashCodeimpl(this.preferenceId) * 31)) * 31);
        }

        public final String toString() {
            return "RecurringPurchaseReceipt(preferenceId=" + RecurringPreferenceId.m3732toStringimpl(this.preferenceId) + ", accentColor=" + this.accentColor + ", type=" + this.f1161type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Base64Codec.m2175write2ep6_7w(this.preferenceId, parcel);
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.f1161type, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class SelectStockQuestion implements Question {
        public static final Parcelable.Creator<SelectStockQuestion> CREATOR = new SmsInvitation.Creator(19);

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

    /* loaded from: classes6.dex */
    public final class StockMetricTypePicker extends InvestingSheets {
        public static final Parcelable.Creator<StockMetricTypePicker> CREATOR = new SmsInvitation.Creator(23);
        public final boolean isDependent;
        public final MetricType metricType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class MetricType {
            public static final /* synthetic */ MetricType[] $VALUES;
            public static final MetricType FOLLOWING;
            public static final MetricType PORTFOLIO;

            static {
                MetricType metricType = new MetricType("PORTFOLIO", 0);
                PORTFOLIO = metricType;
                MetricType metricType2 = new MetricType("FOLLOWING", 1);
                FOLLOWING = metricType2;
                $VALUES = new MetricType[]{metricType, metricType2};
            }

            public static MetricType valueOf(String str) {
                return (MetricType) Enum.valueOf(MetricType.class, str);
            }

            public static MetricType[] values() {
                return (MetricType[]) $VALUES.clone();
            }
        }

        public StockMetricTypePicker(MetricType metricType, boolean z) {
            metricType.getClass();
            this.metricType = metricType;
            this.isDependent = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockMetricTypePicker)) {
                return false;
            }
            StockMetricTypePicker stockMetricTypePicker = (StockMetricTypePicker) obj;
            return this.metricType == stockMetricTypePicker.metricType && this.isDependent == stockMetricTypePicker.isDependent;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            return Boolean.hashCode(this.isDependent) + (this.metricType.hashCode() * 31);
        }

        public final String toString() {
            return "StockMetricTypePicker(metricType=" + this.metricType + ", isDependent=" + this.isDependent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.metricType.name());
            parcel.writeInt(this.isDependent ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public final class StocksTransferEtaScreen extends InvestingScreens {
        public static final StocksTransferEtaScreen INSTANCE = new StocksTransferEtaScreen();
        public static final Parcelable.Creator<StocksTransferEtaScreen> CREATOR = new SmsInvitation.Creator(24);

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

    /* loaded from: classes6.dex */
    public final class StocksTransferEtaSheet extends InvestingSheets {
        public static final StocksTransferEtaSheet INSTANCE = new StocksTransferEtaSheet();
        public static final Parcelable.Creator<StocksTransferEtaSheet> CREATOR = new SmsInvitation.Creator(25);

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

    /* loaded from: classes6.dex */
    public final class UpdateCategoryFilterQuestion implements Question {
        public static final Parcelable.Creator<UpdateCategoryFilterQuestion> CREATOR = new SmsInvitation.Creator(26);

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

    public boolean equals(Object obj) {
        return Intrinsics.areEqual(obj != null ? obj.getClass() : null, getClass());
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public final class StockDetails extends InvestingScreens {
        public static final Parcelable.Creator<StockDetails> CREATOR = new SmsInvitation.Creator(20);
        public final InvestmentEntityToken investmentEntityToken;
        public final boolean isDependentCustomer;
        public final Origin origin;
        public final AskedQuestion question;
        public final UUID referrerFlowToken;
        public final StockViewViewStockDetails.InvestingScreenOrigin screenOrigin;

        public /* synthetic */ StockDetails(AskedQuestion askedQuestion, InvestmentEntityToken investmentEntityToken, StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin, Origin origin, UUID uuid, boolean z, int i) {
            this((i & 1) != 0 ? null : askedQuestion, investmentEntityToken, investingScreenOrigin, (i & 8) != 0 ? new Origin.Tradable() : origin, (i & 16) != 0 ? null : uuid, (i & 32) != 0 ? false : z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockDetails)) {
                return false;
            }
            StockDetails stockDetails = (StockDetails) obj;
            return Intrinsics.areEqual(this.question, stockDetails.question) && Intrinsics.areEqual(this.investmentEntityToken, stockDetails.investmentEntityToken) && this.screenOrigin == stockDetails.screenOrigin && Intrinsics.areEqual(this.origin, stockDetails.origin) && Intrinsics.areEqual(this.referrerFlowToken, stockDetails.referrerFlowToken) && this.isDependentCustomer == stockDetails.isDependentCustomer;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            AskedQuestion askedQuestion = this.question;
            int hashCode = (this.investmentEntityToken.hashCode() + ((askedQuestion == null ? 0 : askedQuestion.hashCode()) * 31)) * 31;
            StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin = this.screenOrigin;
            int hashCode2 = (this.origin.hashCode() + ((hashCode + (investingScreenOrigin == null ? 0 : investingScreenOrigin.hashCode())) * 31)) * 31;
            UUID uuid = this.referrerFlowToken;
            return Boolean.hashCode(this.isDependentCustomer) + ((hashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "StockDetails(question=" + this.question + ", investmentEntityToken=" + this.investmentEntityToken + ", screenOrigin=" + this.screenOrigin + ", origin=" + this.origin + ", referrerFlowToken=" + this.referrerFlowToken + ", isDependentCustomer=" + this.isDependentCustomer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.question, i);
            parcel.writeParcelable(this.investmentEntityToken, i);
            StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin = this.screenOrigin;
            if (investingScreenOrigin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(investingScreenOrigin.name());
            }
            parcel.writeParcelable(this.origin, i);
            parcel.writeSerializable(this.referrerFlowToken);
            parcel.writeInt(this.isDependentCustomer ? 1 : 0);
        }

        /* loaded from: classes6.dex */
        public abstract class Origin implements Parcelable {

            public final class StockSearch extends Origin {
                public static final Parcelable.Creator<StockSearch> CREATOR = new SmsInvitation.Creator(21);
                public final ReceivesStockSelectionResult exitScreen;

                public StockSearch(ReceivesStockSelectionResult receivesStockSelectionResult) {
                    receivesStockSelectionResult.getClass();
                    this.exitScreen = receivesStockSelectionResult;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof StockSearch) && Intrinsics.areEqual(this.exitScreen, ((StockSearch) obj).exitScreen);
                }

                public final int hashCode() {
                    return this.exitScreen.hashCode();
                }

                public final String toString() {
                    return "StockSearch(exitScreen=" + this.exitScreen + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.exitScreen, i);
                }
            }

            public final class Tradable extends Origin {
                public static final Parcelable.Creator<Tradable> CREATOR = new SmsInvitation.Creator(22);
                public final boolean fromTrade;

                public Tradable(boolean z) {
                    this.fromTrade = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Tradable) && this.fromTrade == ((Tradable) obj).fromTrade;
                }

                public final boolean getFromTrade() {
                    return this.fromTrade;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.fromTrade);
                }

                public final String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Tradable(fromTrade=", ")", this.fromTrade);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.fromTrade ? 1 : 0);
                }

                public /* synthetic */ Tradable() {
                    this(false);
                }
            }
        }

        public StockDetails(AskedQuestion askedQuestion, InvestmentEntityToken investmentEntityToken, StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin, Origin origin, UUID uuid, boolean z) {
            investmentEntityToken.getClass();
            origin.getClass();
            this.question = askedQuestion;
            this.investmentEntityToken = investmentEntityToken;
            this.screenOrigin = investingScreenOrigin;
            this.origin = origin;
            this.referrerFlowToken = uuid;
            this.isDependentCustomer = z;
        }
    }

    /* loaded from: classes6.dex */
    public final class TransferStock extends InvestingScreens implements OnlyOneOverlayTreatment, HasFrequency, AccentedScreen {
        public static final Parcelable.Creator<TransferStock> CREATOR = new Creator();
        public final ColorModel accentColor;
        public final RecurringSchedule.Frequency frequency;
        public final InvestmentEntityToken investmentEntityToken;
        public final UUID referrerFlowToken;
        public final AmountSheetSavedState savedState;
        public final OrderSide side;

        /* renamed from: type, reason: collision with root package name */
        public final OrderType f1162type;
        public final long usdPerShare;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TransferStock((InvestmentEntityToken) parcel.readParcelable(TransferStock.class.getClassLoader()), OrderSide.valueOf(parcel.readString()), parcel.readLong(), (ColorModel) parcel.readParcelable(TransferStock.class.getClassLoader()), parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString()), (AmountSheetSavedState) parcel.readParcelable(TransferStock.class.getClassLoader()), (OrderType) parcel.readParcelable(TransferStock.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferStock[i];
            }
        }

        public /* synthetic */ TransferStock(InvestmentEntityToken investmentEntityToken, OrderSide orderSide, long j, ColorModel colorModel, OrderType.CustomOrder customOrder, UUID uuid, int i) {
            this(investmentEntityToken, orderSide, j, colorModel, null, null, (i & 64) != 0 ? OrderType.Standard.INSTANCE : customOrder, (i & 128) != 0 ? null : uuid);
        }

        public static TransferStock copy$default(TransferStock transferStock, RecurringSchedule.Frequency frequency, AmountSheetSavedState amountSheetSavedState, int i) {
            InvestmentEntityToken investmentEntityToken = transferStock.investmentEntityToken;
            OrderSide orderSide = transferStock.side;
            long j = transferStock.usdPerShare;
            ColorModel colorModel = transferStock.accentColor;
            if ((i & 16) != 0) {
                frequency = transferStock.frequency;
            }
            RecurringSchedule.Frequency frequency2 = frequency;
            if ((i & 32) != 0) {
                amountSheetSavedState = transferStock.savedState;
            }
            OrderType orderType = transferStock.f1162type;
            UUID uuid = transferStock.referrerFlowToken;
            transferStock.getClass();
            investmentEntityToken.getClass();
            orderSide.getClass();
            colorModel.getClass();
            orderType.getClass();
            return new TransferStock(investmentEntityToken, orderSide, j, colorModel, frequency2, amountSheetSavedState, orderType, uuid);
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
        public final Screen copyWithFrequency(RecurringSchedule.Frequency frequency) {
            return copy$default(this, frequency, null, 239);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransferStock)) {
                return false;
            }
            TransferStock transferStock = (TransferStock) obj;
            return Intrinsics.areEqual(this.investmentEntityToken, transferStock.investmentEntityToken) && this.side == transferStock.side && this.usdPerShare == transferStock.usdPerShare && Intrinsics.areEqual(this.accentColor, transferStock.accentColor) && this.frequency == transferStock.frequency && Intrinsics.areEqual(this.savedState, transferStock.savedState) && Intrinsics.areEqual(this.f1162type, transferStock.f1162type) && Intrinsics.areEqual(this.referrerFlowToken, transferStock.referrerFlowToken);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
        public final RecurringSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            int hashCode = (this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.side.hashCode() + (this.investmentEntityToken.value.hashCode() * 31)) * 31, 31, this.usdPerShare)) * 31;
            RecurringSchedule.Frequency frequency = this.frequency;
            int hashCode2 = (hashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
            AmountSheetSavedState amountSheetSavedState = this.savedState;
            int hashCode3 = (this.f1162type.hashCode() + ((hashCode2 + (amountSheetSavedState == null ? 0 : amountSheetSavedState.hashCode())) * 31)) * 31;
            UUID uuid = this.referrerFlowToken;
            return hashCode3 + (uuid != null ? uuid.hashCode() : 0);
        }

        public final String toString() {
            return "TransferStock(investmentEntityToken=" + this.investmentEntityToken + ", side=" + this.side + ", usdPerShare=" + this.usdPerShare + ", accentColor=" + this.accentColor + ", frequency=" + this.frequency + ", savedState=" + this.savedState + ", type=" + this.f1162type + ", referrerFlowToken=" + this.referrerFlowToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.investmentEntityToken, i);
            parcel.writeString(this.side.name());
            parcel.writeLong(this.usdPerShare);
            parcel.writeParcelable(this.accentColor, i);
            RecurringSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            parcel.writeParcelable(this.savedState, i);
            parcel.writeParcelable(this.f1162type, i);
            parcel.writeSerializable(this.referrerFlowToken);
        }

        public TransferStock(InvestmentEntityToken investmentEntityToken, OrderSide orderSide, long j, ColorModel colorModel, RecurringSchedule.Frequency frequency, AmountSheetSavedState amountSheetSavedState, OrderType orderType, UUID uuid) {
            investmentEntityToken.getClass();
            orderSide.getClass();
            colorModel.getClass();
            orderType.getClass();
            this.investmentEntityToken = investmentEntityToken;
            this.side = orderSide;
            this.usdPerShare = j;
            this.accentColor = colorModel;
            this.frequency = frequency;
            this.savedState = amountSheetSavedState;
            this.f1162type = orderType;
            this.referrerFlowToken = uuid;
        }
    }

    public final class RecurringFrequencyPickerFullScreen extends InvestingScreens implements AccentedScreen {
        public static final Parcelable.Creator<RecurringFrequencyPickerFullScreen> CREATOR = new Creator();
        public final ColorModel accentColor;
        public final RecurringSchedule.Frequency currentFrequency;
        public final Screen exitScreen;
        public final OrderSide orderSide;
        public final HasFrequency prevScreenBottomSheet;
        public final boolean showOneTimeOrder;

        /* renamed from: type, reason: collision with root package name */
        public final OrderTypeSelectionScreen.Type f1160type;
        public final boolean useBackNavigationIcon;

        /* loaded from: classes6.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                OrderTypeSelectionScreen.Type type2 = (OrderTypeSelectionScreen.Type) parcel.readParcelable(RecurringFrequencyPickerFullScreen.class.getClassLoader());
                RecurringSchedule.Frequency valueOf = parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString());
                ColorModel colorModel = (ColorModel) parcel.readParcelable(RecurringFrequencyPickerFullScreen.class.getClassLoader());
                HasFrequency hasFrequency = (HasFrequency) parcel.readParcelable(RecurringFrequencyPickerFullScreen.class.getClassLoader());
                OrderSide valueOf2 = OrderSide.valueOf(parcel.readString());
                Screen screen = (Screen) parcel.readParcelable(RecurringFrequencyPickerFullScreen.class.getClassLoader());
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new RecurringFrequencyPickerFullScreen(type2, valueOf, colorModel, hasFrequency, valueOf2, screen, z2, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringFrequencyPickerFullScreen[i];
            }
        }

        public RecurringFrequencyPickerFullScreen(OrderTypeSelectionScreen.Type type2, RecurringSchedule.Frequency frequency, ColorModel colorModel, HasFrequency hasFrequency, OrderSide orderSide, Screen screen, boolean z, boolean z2) {
            type2.getClass();
            colorModel.getClass();
            hasFrequency.getClass();
            orderSide.getClass();
            screen.getClass();
            this.f1160type = type2;
            this.currentFrequency = frequency;
            this.accentColor = colorModel;
            this.prevScreenBottomSheet = hasFrequency;
            this.orderSide = orderSide;
            this.exitScreen = screen;
            this.showOneTimeOrder = z;
            this.useBackNavigationIcon = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecurringFrequencyPickerFullScreen)) {
                return false;
            }
            RecurringFrequencyPickerFullScreen recurringFrequencyPickerFullScreen = (RecurringFrequencyPickerFullScreen) obj;
            return Intrinsics.areEqual(this.f1160type, recurringFrequencyPickerFullScreen.f1160type) && this.currentFrequency == recurringFrequencyPickerFullScreen.currentFrequency && Intrinsics.areEqual(this.accentColor, recurringFrequencyPickerFullScreen.accentColor) && Intrinsics.areEqual(this.prevScreenBottomSheet, recurringFrequencyPickerFullScreen.prevScreenBottomSheet) && this.orderSide == recurringFrequencyPickerFullScreen.orderSide && Intrinsics.areEqual(this.exitScreen, recurringFrequencyPickerFullScreen.exitScreen) && this.showOneTimeOrder == recurringFrequencyPickerFullScreen.showOneTimeOrder && this.useBackNavigationIcon == recurringFrequencyPickerFullScreen.useBackNavigationIcon;
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            int hashCode = this.f1160type.hashCode() * 31;
            RecurringSchedule.Frequency frequency = this.currentFrequency;
            return Boolean.hashCode(this.useBackNavigationIcon) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (this.orderSide.hashCode() + ((this.prevScreenBottomSheet.hashCode() + ((this.accentColor.hashCode() + ((hashCode + (frequency == null ? 0 : frequency.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31, this.showOneTimeOrder);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecurringFrequencyPickerFullScreen(type=");
            sb.append(this.f1160type);
            sb.append(", currentFrequency=");
            sb.append(this.currentFrequency);
            sb.append(", accentColor=");
            sb.append(this.accentColor);
            sb.append(", prevScreenBottomSheet=");
            sb.append(this.prevScreenBottomSheet);
            sb.append(", orderSide=");
            sb.append(this.orderSide);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", showOneTimeOrder=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showOneTimeOrder, ", useBackNavigationIcon=", this.useBackNavigationIcon, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f1160type, i);
            RecurringSchedule.Frequency frequency = this.currentFrequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.prevScreenBottomSheet, i);
            parcel.writeString(this.orderSide.name());
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeInt(this.showOneTimeOrder ? 1 : 0);
            parcel.writeInt(this.useBackNavigationIcon ? 1 : 0);
        }

        public /* synthetic */ RecurringFrequencyPickerFullScreen(OrderTypeSelectionScreen.Type type2, RecurringSchedule.Frequency frequency, ColorModel colorModel, HasFrequency hasFrequency, OrderSide orderSide, Screen screen, int i) {
            this(type2, frequency, colorModel, hasFrequency, orderSide, screen, (i & 64) != 0, true);
        }
    }

    public final class InvestingHome extends InvestingScreens {
        public static final Parcelable.Creator<InvestingHome> CREATOR = new SmsInvitation.Creator(2);
        public final boolean dependentControlDisabled;
        public final String dependentCustomerToken;
        public final String dependentName;
        public final boolean resetScreen;
        public final AppNavigateOpenSpace.Source source;
        public final AppNavigateOpenSpace.SourceTab sourceTab;

        public /* synthetic */ InvestingHome(String str, String str2, int i, boolean z) {
            this((i & 1) == 0, (i & 2) != 0 ? null : AppNavigateOpenSpace.SourceTab.BANKING, (i & 4) != 0 ? null : AppNavigateOpenSpace.Source.APPLET_TILE, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingHome)) {
                return false;
            }
            InvestingHome investingHome = (InvestingHome) obj;
            return this.resetScreen == investingHome.resetScreen && this.sourceTab == investingHome.sourceTab && this.source == investingHome.source && Intrinsics.areEqual(this.dependentCustomerToken, investingHome.dependentCustomerToken) && Intrinsics.areEqual(this.dependentName, investingHome.dependentName) && this.dependentControlDisabled == investingHome.dependentControlDisabled;
        }

        @Override // com.squareup.cash.investing.screen.keys.InvestingScreens
        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.resetScreen) * 31;
            AppNavigateOpenSpace.SourceTab sourceTab = this.sourceTab;
            int hashCode2 = (hashCode + (sourceTab == null ? 0 : sourceTab.hashCode())) * 31;
            AppNavigateOpenSpace.Source source = this.source;
            int hashCode3 = (hashCode2 + (source == null ? 0 : source.hashCode())) * 31;
            String str = this.dependentCustomerToken;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.dependentName;
            return Boolean.hashCode(this.dependentControlDisabled) + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InvestingHome(resetScreen=");
            sb.append(this.resetScreen);
            sb.append(", sourceTab=");
            sb.append(this.sourceTab);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(", dependentCustomerToken=");
            sb.append(this.dependentCustomerToken);
            sb.append(", dependentName=");
            return re$$ExternalSyntheticOutline0.m(sb, this.dependentName, ", dependentControlDisabled=", this.dependentControlDisabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.resetScreen ? 1 : 0);
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
            parcel.writeString(this.dependentName);
            parcel.writeInt(this.dependentControlDisabled ? 1 : 0);
        }

        public InvestingHome(boolean z, AppNavigateOpenSpace.SourceTab sourceTab, AppNavigateOpenSpace.Source source, String str, String str2, boolean z2) {
            this.resetScreen = z;
            this.sourceTab = sourceTab;
            this.source = source;
            this.dependentCustomerToken = str;
            this.dependentName = str2;
            this.dependentControlDisabled = z2;
        }
    }
}
