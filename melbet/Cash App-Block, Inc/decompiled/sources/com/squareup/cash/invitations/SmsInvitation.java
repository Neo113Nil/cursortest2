package com.squareup.cash.invitations;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.navigation.ReceivesStockSelectionResult;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.invitations.screens.InviteReferralsRulesBottomSheet;
import com.squareup.cash.limits.screens.LimitsCategoryData;
import com.squareup.cash.limits.screens.LimitsCategoryType;
import com.squareup.cash.limits.screens.ProgressBarData;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.InviteFriendsEnableReferralText;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.invest.ui.Section;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SmsInvitation implements Parcelable {
    public static final Parcelable.Creator<SmsInvitation> CREATOR = new Creator(0);
    public final Redacted message;
    public final Redacted number;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            InvestmentEntityToken investmentEntityToken;
            UUID uuid;
            ArrayList arrayList = null;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new SmsInvitation((Redacted) parcel.readParcelable(SmsInvitation.class.getClassLoader()), (Redacted) parcel.readParcelable(SmsInvitation.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new InvestingScreens.InvestingExplanatoryDialogScreen(parcel.readString(), (ColorModel) parcel.readParcelable(InvestingScreens.InvestingExplanatoryDialogScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new InvestingScreens.InvestingHome(parcel.readInt() != 0, parcel.readInt() == 0 ? null : AppNavigateOpenSpace.SourceTab.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AppNavigateOpenSpace.Source.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 3:
                    Long l = null;
                    parcel.getClass();
                    ColorModel colorModel = (ColorModel) parcel.readParcelable(InvestingScreens.InvestingPeriodSelectionScreen.class.getClassLoader());
                    InvestingScreens.OrderType.CustomOrder createFromParcel = InvestingScreens.OrderType.CustomOrder.CREATOR.createFromParcel(parcel);
                    OrderSide valueOf = OrderSide.valueOf(parcel.readString());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        l = Long.valueOf(parcel.readLong());
                    }
                    return new InvestingScreens.InvestingPeriodSelectionScreen(colorModel, createFromParcel, valueOf, readString, l, (InvestingScreens.HasEntityToken) parcel.readParcelable(InvestingScreens.InvestingPeriodSelectionScreen.class.getClassLoader()), (InvestmentEntityToken) parcel.readParcelable(InvestingScreens.InvestingPeriodSelectionScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new InvestingScreens.InvestingSearch(parcel.readInt() != 0);
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.InvestingSettingsScreen.INSTANCE;
                case 6:
                    parcel.getClass();
                    return new InvestingScreens.KeyStatsDetailsScreen((InvestmentEntityToken) parcel.readParcelable(InvestingScreens.KeyStatsDetailsScreen.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    return new InvestingScreens.MoreInfoSheet((Section.Row.MoreInfo) parcel.readParcelable(InvestingScreens.MoreInfoSheet.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new InvestingScreens.NewsScreen((NewsKind) parcel.readParcelable(InvestingScreens.NewsScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 9:
                    parcel.getClass();
                    return new InvestingScreens.OrderType.CustomOrder(parcel.readLong(), parcel.readLong());
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.OrderType.Standard.INSTANCE;
                case 11:
                    parcel.getClass();
                    return new InvestingScreens.OrderTypeSelectionScreen(OrderSide.valueOf(parcel.readString()), (InvestingScreens.OrderTypeSelectionScreen.Type) parcel.readParcelable(InvestingScreens.OrderTypeSelectionScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(InvestingScreens.OrderTypeSelectionScreen.class.getClassLoader()), (InvestingScreens.HasFrequency) parcel.readParcelable(InvestingScreens.OrderTypeSelectionScreen.class.getClassLoader()), (Screen) parcel.readParcelable(InvestingScreens.OrderTypeSelectionScreen.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new InvestingScreens.OrderTypeSelectionScreen.Type.Equity((InvestmentEntityToken) parcel.readParcelable(InvestingScreens.OrderTypeSelectionScreen.Type.Equity.class.getClassLoader()), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen(parcel.readString());
                case 15:
                    parcel.getClass();
                    return new InvestingScreens.PerformanceScreens.StockPerformanceScreen((InvestmentEntityToken) parcel.readParcelable(InvestingScreens.PerformanceScreens.StockPerformanceScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 16:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    return new InvestingScreens.RecurringPurchaseReceipt(readString2, (ColorModel) parcel.readParcelable(InvestingScreens.RecurringPurchaseReceipt.class.getClassLoader()), (InvestingScreens.RecurringPurchaseReceipt.Type) parcel.readParcelable(InvestingScreens.RecurringPurchaseReceipt.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new InvestingScreens.RecurringPurchaseReceipt.Type.Stock((Image) parcel.readParcelable(InvestingScreens.RecurringPurchaseReceipt.Type.Stock.class.getClassLoader()), (InvestmentEntityToken) parcel.readParcelable(InvestingScreens.RecurringPurchaseReceipt.Type.Stock.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return new InvestingScreens.SelectStockQuestion();
                case 20:
                    parcel.getClass();
                    StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin = null;
                    AskedQuestion askedQuestion = (AskedQuestion) parcel.readParcelable(InvestingScreens.StockDetails.class.getClassLoader());
                    InvestmentEntityToken investmentEntityToken2 = (InvestmentEntityToken) parcel.readParcelable(InvestingScreens.StockDetails.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        investingScreenOrigin = StockViewViewStockDetails.InvestingScreenOrigin.valueOf(parcel.readString());
                    }
                    InvestingScreens.StockDetails.Origin origin = (InvestingScreens.StockDetails.Origin) parcel.readParcelable(InvestingScreens.StockDetails.class.getClassLoader());
                    UUID uuid2 = (UUID) parcel.readSerializable();
                    if (parcel.readInt() != 0) {
                        investmentEntityToken = investmentEntityToken2;
                        uuid = uuid2;
                        z = true;
                    } else {
                        z = false;
                        investmentEntityToken = investmentEntityToken2;
                        uuid = uuid2;
                    }
                    return new InvestingScreens.StockDetails(askedQuestion, investmentEntityToken, investingScreenOrigin, origin, uuid, z);
                case 21:
                    parcel.getClass();
                    return new InvestingScreens.StockDetails.Origin.StockSearch((ReceivesStockSelectionResult) parcel.readParcelable(InvestingScreens.StockDetails.Origin.StockSearch.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new InvestingScreens.StockDetails.Origin.Tradable(parcel.readInt() != 0);
                case 23:
                    parcel.getClass();
                    return new InvestingScreens.StockMetricTypePicker(InvestingScreens.StockMetricTypePicker.MetricType.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.StocksTransferEtaScreen.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingScreens.StocksTransferEtaSheet.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return new InvestingScreens.UpdateCategoryFilterQuestion();
                case 27:
                    parcel.getClass();
                    return new InviteReferralsRulesBottomSheet((InviteFriendsEnableReferralText) parcel.readParcelable(InviteReferralsRulesBottomSheet.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    LimitsCategoryType createFromParcel2 = LimitsCategoryType.CREATOR.createFromParcel(parcel);
                    String readString3 = parcel.readString();
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt);
                        while (i != readInt) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(ProgressBarData.CREATOR, parcel, arrayList2, i, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new LimitsCategoryData(createFromParcel2, readString3, createStringArrayList, arrayList);
                default:
                    parcel.getClass();
                    return LimitsCategoryType.valueOf(parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new SmsInvitation[i];
                case 1:
                    return new InvestingScreens.InvestingExplanatoryDialogScreen[i];
                case 2:
                    return new InvestingScreens.InvestingHome[i];
                case 3:
                    return new InvestingScreens.InvestingPeriodSelectionScreen[i];
                case 4:
                    return new InvestingScreens.InvestingSearch[i];
                case 5:
                    return new InvestingScreens.InvestingSettingsScreen[i];
                case 6:
                    return new InvestingScreens.KeyStatsDetailsScreen[i];
                case 7:
                    return new InvestingScreens.MoreInfoSheet[i];
                case 8:
                    return new InvestingScreens.NewsScreen[i];
                case 9:
                    return new InvestingScreens.OrderType.CustomOrder[i];
                case 10:
                    return new InvestingScreens.OrderType.Standard[i];
                case 11:
                    return new InvestingScreens.OrderTypeSelectionScreen[i];
                case 12:
                    return new InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin[i];
                case 13:
                    return new InvestingScreens.OrderTypeSelectionScreen.Type.Equity[i];
                case 14:
                    return new InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen[i];
                case 15:
                    return new InvestingScreens.PerformanceScreens.StockPerformanceScreen[i];
                case 16:
                    return new InvestingScreens.RecurringPurchaseReceipt[i];
                case 17:
                    return new InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin[i];
                case 18:
                    return new InvestingScreens.RecurringPurchaseReceipt.Type.Stock[i];
                case 19:
                    return new InvestingScreens.SelectStockQuestion[i];
                case 20:
                    return new InvestingScreens.StockDetails[i];
                case 21:
                    return new InvestingScreens.StockDetails.Origin.StockSearch[i];
                case 22:
                    return new InvestingScreens.StockDetails.Origin.Tradable[i];
                case 23:
                    return new InvestingScreens.StockMetricTypePicker[i];
                case 24:
                    return new InvestingScreens.StocksTransferEtaScreen[i];
                case 25:
                    return new InvestingScreens.StocksTransferEtaSheet[i];
                case 26:
                    return new InvestingScreens.UpdateCategoryFilterQuestion[i];
                case 27:
                    return new InviteReferralsRulesBottomSheet[i];
                case 28:
                    return new LimitsCategoryData[i];
                default:
                    return new LimitsCategoryType[i];
            }
        }
    }

    public SmsInvitation(Redacted redacted, Redacted redacted2) {
        redacted.getClass();
        redacted2.getClass();
        this.message = redacted;
        this.number = redacted2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsInvitation)) {
            return false;
        }
        SmsInvitation smsInvitation = (SmsInvitation) obj;
        return Intrinsics.areEqual(this.message, smsInvitation.message) && Intrinsics.areEqual(this.number, smsInvitation.number);
    }

    public final int hashCode() {
        return this.number.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "SmsInvitation(message=" + this.message + ", number=" + this.number + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.message, i);
        parcel.writeParcelable(this.number, i);
    }
}
