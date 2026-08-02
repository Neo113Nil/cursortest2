package com.squareup.cash.activity.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.FormattingFailedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.screens.SponsorshipRequestContent;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.appmessages.ActivityTabPopupAppMessage;
import com.squareup.cash.appmessages.BalanceTabPopupAppMessage;
import com.squareup.cash.appmessages.CardTabPopupAppMessage;
import com.squareup.cash.appmessages.InvestingTabPopupAppMessage;
import com.squareup.cash.appmessages.OffersTabPopupAppMessage;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.outofnetworksponsor.Inviter;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes.dex */
public final class ActivityScreen implements Screen {
    public static final ActivityScreen INSTANCE = new ActivityScreen();
    public static final Parcelable.Creator<ActivityScreen> CREATOR = new Creator(0);

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            ArrayList arrayList = null;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return ActivityScreen.INSTANCE;
                case 1:
                    parcel.getClass();
                    return new ThemeSwitcherScreen(ThemeSwitcherScreen.Source.valueOf(parcel.readString()));
                case 2:
                    UiPayment uiPayment = (UiPayment) NavAction$$ExternalSyntheticOutline0.m(parcel, FormattedPaymentHistoryActivityData.class);
                    UiCustomer uiCustomer = (UiCustomer) parcel.readParcelable(FormattedPaymentHistoryActivityData.class.getClassLoader());
                    UiCustomer uiCustomer2 = (UiCustomer) parcel.readParcelable(FormattedPaymentHistoryActivityData.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    long readLong = parcel.readLong();
                    ActivityRowSection valueOf = parcel.readInt() != 0 ? ActivityRowSection.valueOf(parcel.readString()) : null;
                    ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) parcel.readParcelable(FormattedPaymentHistoryActivityData.class.getClassLoader());
                    String readString = parcel.readString();
                    PaymentHistoryData paymentHistoryData = (PaymentHistoryData) parcel.readParcelable(FormattedPaymentHistoryActivityData.class.getClassLoader());
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i2 = 0; i2 != readInt; i2++) {
                        linkedHashSet.add(ActivityProductClassifier.valueOf(parcel.readString()));
                    }
                    return new FormattedPaymentHistoryActivityData(uiPayment, uiCustomer, uiCustomer2, z, readLong, valueOf, activityItemGlobalId, readString, paymentHistoryData, linkedHashSet, (ActivityItemGlobalId) parcel.readParcelable(FormattedPaymentHistoryActivityData.class.getClassLoader()));
                case 3:
                    UiPayment uiPayment2 = (UiPayment) NavAction$$ExternalSyntheticOutline0.m(parcel, FormattingFailedPaymentHistoryActivityData.class);
                    UiCustomer uiCustomer3 = (UiCustomer) parcel.readParcelable(FormattingFailedPaymentHistoryActivityData.class.getClassLoader());
                    UiCustomer uiCustomer4 = (UiCustomer) parcel.readParcelable(FormattingFailedPaymentHistoryActivityData.class.getClassLoader());
                    boolean z2 = parcel.readInt() != 0;
                    long readLong2 = parcel.readLong();
                    ActivityRowSection valueOf2 = parcel.readInt() != 0 ? ActivityRowSection.valueOf(parcel.readString()) : null;
                    ActivityItemGlobalId activityItemGlobalId2 = (ActivityItemGlobalId) parcel.readParcelable(FormattingFailedPaymentHistoryActivityData.class.getClassLoader());
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                    for (int i3 = 0; i3 != readInt2; i3++) {
                        linkedHashSet2.add(ActivityProductClassifier.valueOf(parcel.readString()));
                    }
                    return new FormattingFailedPaymentHistoryActivityData(readLong2, activityItemGlobalId2, (ActivityItemGlobalId) parcel.readParcelable(FormattingFailedPaymentHistoryActivityData.class.getClassLoader()), valueOf2, uiCustomer3, uiCustomer4, uiPayment2, readString2, linkedHashSet2, z2);
                case 4:
                    Paycheck paycheck = (Paycheck) NavAction$$ExternalSyntheticOutline0.m(parcel, PaycheckActivityData.class);
                    ActivityItemGlobalId activityItemGlobalId3 = (ActivityItemGlobalId) parcel.readParcelable(PaycheckActivityData.class.getClassLoader());
                    long readLong3 = parcel.readLong();
                    CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) parcel.readParcelable(PaycheckActivityData.class.getClassLoader());
                    String readString3 = parcel.readString();
                    ActivityRowSection valueOf3 = parcel.readInt() != 0 ? ActivityRowSection.valueOf(parcel.readString()) : null;
                    int readInt3 = parcel.readInt();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt3);
                    for (int i4 = 0; i4 != readInt3; i4++) {
                        linkedHashSet3.add(ActivityProductClassifier.valueOf(parcel.readString()));
                    }
                    return new PaycheckActivityData(paycheck, activityItemGlobalId3, readLong3, calendarMonthPaychecksAggregation, readString3, valueOf3, linkedHashSet3, (ActivityItemGlobalId) parcel.readParcelable(PaycheckActivityData.class.getClassLoader()));
                case 5:
                    UiPayment uiPayment3 = (UiPayment) NavAction$$ExternalSyntheticOutline0.m(parcel, PaymentHistoryActivityData.class);
                    UiCustomer uiCustomer5 = (UiCustomer) parcel.readParcelable(PaymentHistoryActivityData.class.getClassLoader());
                    UiCustomer uiCustomer6 = (UiCustomer) parcel.readParcelable(PaymentHistoryActivityData.class.getClassLoader());
                    ActivityItemGlobalId activityItemGlobalId4 = (ActivityItemGlobalId) parcel.readParcelable(PaymentHistoryActivityData.class.getClassLoader());
                    boolean z3 = parcel.readInt() != 0;
                    long readLong4 = parcel.readLong();
                    String readString4 = parcel.readString();
                    ActivityRowSection valueOf4 = parcel.readInt() != 0 ? ActivityRowSection.valueOf(parcel.readString()) : null;
                    int readInt4 = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt4);
                    for (int i5 = 0; i5 != readInt4; i5++) {
                        linkedHashSet4.add(ActivityProductClassifier.valueOf(parcel.readString()));
                    }
                    return new PaymentHistoryActivityData(readLong4, activityItemGlobalId4, (ActivityItemGlobalId) parcel.readParcelable(PaymentHistoryActivityData.class.getClassLoader()), valueOf4, uiCustomer5, uiCustomer6, uiPayment3, readString4, linkedHashSet4, z3);
                case 6:
                    parcel.getClass();
                    return new ActivityItemKey((ActivityItemGlobalId) parcel.readParcelable(ActivityItemKey.class.getClassLoader()), (ActivityToken) parcel.readParcelable(ActivityItemKey.class.getClassLoader()), parcel.readInt() != 0 ? ActivityScope.valueOf(parcel.readString()) : null);
                case 7:
                    parcel.getClass();
                    return new BalanceFeedScreen(BalanceFeedScreen.BalanceType.valueOf(parcel.readString()));
                case 8:
                    parcel.getClass();
                    return new FullscreenAdScreen(parcel.readString());
                case 9:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.valueOf(parcel.readString()));
                case 10:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletHomeScreen(parcel.readString());
                case 11:
                    parcel.getClass();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt5 = parcel.readInt();
                        arrayList = new ArrayList(readInt5);
                        while (i != readInt5) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(AfterpayAppletScreen$AfterpayAppletInfoSheet.class, parcel, arrayList, i, 1);
                        }
                    }
                    return new AfterpayAppletScreen$AfterpayAppletInfoSheet(readString5, readString6, readString7, arrayList, (Button) parcel.readParcelable(AfterpayAppletScreen$AfterpayAppletInfoSheet.class.getClassLoader()), (AnalyticsEvent) parcel.readParcelable(AfterpayAppletScreen$AfterpayAppletInfoSheet.class.getClassLoader()), (AnalyticsEvent) parcel.readParcelable(AfterpayAppletScreen$AfterpayAppletInfoSheet.class.getClassLoader()), (UiAvatar) parcel.readParcelable(AfterpayAppletScreen$AfterpayAppletInfoSheet.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletNotificationScreen(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return AfterpayAppletScreen$AfterpayAppletPurchasesScreen.INSTANCE;
                case 15:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet(parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen(parcel.readString(), (AskedQuestion) parcel.readParcelable(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new AfterpayAppletScreen$AfterpaySearchScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new AgentsHomeScreen(parcel.readInt() != 0);
                case 21:
                    parcel.getClass();
                    return new AlternativeNewSponsorAliasScreen((GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog) parcel.readParcelable(AlternativeNewSponsorAliasScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Inviter.valueOf(parcel.readString()) : null);
                case 22:
                    parcel.getClass();
                    return new SponsorshipRequestContent.Sponsor((GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent) parcel.readParcelable(SponsorshipRequestContent.Sponsor.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new SponsorshipRequestContent.Teen((GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent) parcel.readParcelable(SponsorshipRequestContent.Teen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new SponsorshipRequestReferralIntroScreen((BlockersData) parcel.readParcelable(SponsorshipRequestReferralIntroScreen.class.getClassLoader()), (SponsorshipRequestContent) parcel.readParcelable(SponsorshipRequestReferralIntroScreen.class.getClassLoader()), parcel.readString());
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return ActivityTabPopupAppMessage.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return BalanceTabPopupAppMessage.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return CardTabPopupAppMessage.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingTabPopupAppMessage.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return OffersTabPopupAppMessage.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ActivityScreen[i];
                case 1:
                    return new ThemeSwitcherScreen[i];
                case 2:
                    return new FormattedPaymentHistoryActivityData[i];
                case 3:
                    return new FormattingFailedPaymentHistoryActivityData[i];
                case 4:
                    return new PaycheckActivityData[i];
                case 5:
                    return new PaymentHistoryActivityData[i];
                case 6:
                    return new ActivityItemKey[i];
                case 7:
                    return new BalanceFeedScreen[i];
                case 8:
                    return new FullscreenAdScreen[i];
                case 9:
                    return new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen[i];
                case 10:
                    return new AfterpayAppletScreen$AfterpayAppletHomeScreen[i];
                case 11:
                    return new AfterpayAppletScreen$AfterpayAppletInfoSheet[i];
                case 12:
                    return new AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen[i];
                case 13:
                    return new AfterpayAppletScreen$AfterpayAppletNotificationScreen[i];
                case 14:
                    return new AfterpayAppletScreen$AfterpayAppletPurchasesScreen[i];
                case 15:
                    return new AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet[i];
                case 16:
                    return new AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen[i];
                case 17:
                    return new AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion[i];
                case 18:
                    return new AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen[i];
                case 19:
                    return new AfterpayAppletScreen$AfterpaySearchScreen[i];
                case 20:
                    return new AgentsHomeScreen[i];
                case 21:
                    return new AlternativeNewSponsorAliasScreen[i];
                case 22:
                    return new SponsorshipRequestContent.Sponsor[i];
                case 23:
                    return new SponsorshipRequestContent.Teen[i];
                case 24:
                    return new SponsorshipRequestReferralIntroScreen[i];
                case 25:
                    return new ActivityTabPopupAppMessage[i];
                case 26:
                    return new BalanceTabPopupAppMessage[i];
                case 27:
                    return new CardTabPopupAppMessage[i];
                case 28:
                    return new InvestingTabPopupAppMessage[i];
                default:
                    return new OffersTabPopupAppMessage[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ActivityScreen);
    }

    public final int hashCode() {
        return -289693489;
    }

    public final String toString() {
        return "ActivityScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
