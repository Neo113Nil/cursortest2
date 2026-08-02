package com.squareup.cash.appmessages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appupdate.screen.AppUpdateDialogScreen;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.banking.backend.api.ConfirmCashOutVersionCode;
import com.squareup.cash.banking.presenters.DemandDepositDialogPresenter$Response;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import com.squareup.cash.benefits.screens.BankingBenefitsBookletScreen;
import com.squareup.cash.benefits.screens.BenefitDetailScreen;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.benefits.screens.BenefitsHomeScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.screens.PdsaBenefitsExplainerScreen;
import com.squareup.cash.billssubscriptions.screens.BillsSubscriptionsMerchantListScreen;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerQuestion;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.protos.cash.unicorn.balance_home_ui.BalanceHomeUi$FocusArea;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SheetAppMessage implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<SheetAppMessage> CREATOR = new Creator(0);
    public final String messageToken;
    public final DetailsPageInteractViewPage.DetailsPageOrigin origin;
    public final Screen parentScreen;

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
                    return new SheetAppMessage(parcel.readString(), DetailsPageInteractViewPage.DetailsPageOrigin.valueOf(parcel.readString()), (Screen) parcel.readParcelable(SheetAppMessage.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentPadTabPopupAppMessage.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return AppUpdateDialogScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new BackStack$ScreenEntry((Screen) parcel.readParcelable(BackStack$ScreenEntry.class.getClassLoader()), parcel.readString(), (SavedState) parcel.readParcelable(BackStack$ScreenEntry.class.getClassLoader()), parcel.readInt() != 0 ? BackStack$ScreenEntry.Overlay.CREATOR.createFromParcel(parcel) : null);
                case 4:
                    parcel.getClass();
                    return new BackStack$ScreenEntry.Overlay((Screen) parcel.readParcelable(BackStack$ScreenEntry.Overlay.class.getClassLoader()), parcel.readString(), (SavedState) parcel.readParcelable(BackStack$ScreenEntry.Overlay.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new RealBackStack.FlowEntry(parcel.readParcelable(RealBackStack.FlowEntry.class.getClassLoader()), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new RealBackStack.Mark(parcel.readString(), parcel.readString());
                case 7:
                    return new ConfirmCashOutVersionCode(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return DemandDepositDialogPresenter$Response.Dismiss.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new DemandDepositDialogPresenter$Response.DoClientScenario(ClientScenario.valueOf(parcel.readString()));
                case 10:
                    parcel.getClass();
                    return new BalanceHomeScreen(parcel.readInt() != 0 ? BalanceHomeUi$FocusArea.valueOf(parcel.readString()) : null);
                case 11:
                    parcel.getClass();
                    return new BankingDialogScreen(BankingDialogScreen.Dialog.CREATOR.createFromParcel(parcel), (Screen) parcel.readParcelable(BankingDialogScreen.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    return new BankingDialogScreen.Dialog.Button(parcel.readInt() != 0 ? ClientScenario.valueOf(parcel.readString()) : null, parcel.readString());
                case 13:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Parcelable.Creator<BankingDialogScreen.Dialog.Button> creator = BankingDialogScreen.Dialog.Button.CREATOR;
                    return new BankingDialogScreen.Dialog(readString, readString2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                case 14:
                    parcel.getClass();
                    return new BenefitsLeafletSheetScreen(PaycheckDepositStatusActiveBenefitType.valueOf(parcel.readString()));
                case 15:
                    parcel.getClass();
                    return new ConfirmCashOutScreen((BlockersData) parcel.readParcelable(ConfirmCashOutScreen.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new DemandDepositDialogScreen((BalanceData.Dialog) parcel.readParcelable(DemandDepositDialogScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new OverdraftCoverageSheetScreen((Screen) parcel.readParcelable(OverdraftCoverageSheetScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new RecurringDepositsFirstTimeUserScreen((Screen) parcel.readParcelable(RecurringDepositsFirstTimeUserScreen.class.getClassLoader()), (Screen) parcel.readParcelable(RecurringDepositsFirstTimeUserScreen.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new RecurringDepositsScreen((Screen) parcel.readParcelable(RecurringDepositsScreen.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new TransfersScreen(TransfersScreen.TransfersScreenTab.valueOf(parcel.readString()));
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return BankingBenefitsBookletScreen.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new BenefitDetailScreen((UiAvatar) parcel.readParcelable(BenefitDetailScreen.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                case 23:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel.readSerializable());
                    }
                    return new BenefitsExplanationScreen(readString3, arrayList, parcel.createStringArrayList());
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return BenefitsHomeScreen.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return BenefitsHubScreen.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return GreenEligibleTransactionsScreen.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return PdsaBenefitsExplainerScreen.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return BillsSubscriptionsMerchantListScreen.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return BitcoinAmountPickerQuestion.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new SheetAppMessage[i];
                case 1:
                    return new PaymentPadTabPopupAppMessage[i];
                case 2:
                    return new AppUpdateDialogScreen[i];
                case 3:
                    return new BackStack$ScreenEntry[i];
                case 4:
                    return new BackStack$ScreenEntry.Overlay[i];
                case 5:
                    return new RealBackStack.FlowEntry[i];
                case 6:
                    return new RealBackStack.Mark[i];
                case 7:
                    return new ConfirmCashOutVersionCode[i];
                case 8:
                    return new DemandDepositDialogPresenter$Response.Dismiss[i];
                case 9:
                    return new DemandDepositDialogPresenter$Response.DoClientScenario[i];
                case 10:
                    return new BalanceHomeScreen[i];
                case 11:
                    return new BankingDialogScreen[i];
                case 12:
                    return new BankingDialogScreen.Dialog.Button[i];
                case 13:
                    return new BankingDialogScreen.Dialog[i];
                case 14:
                    return new BenefitsLeafletSheetScreen[i];
                case 15:
                    return new ConfirmCashOutScreen[i];
                case 16:
                    return new DemandDepositDialogScreen[i];
                case 17:
                    return new OverdraftCoverageSheetScreen[i];
                case 18:
                    return new RecurringDepositsFirstTimeUserScreen[i];
                case 19:
                    return new RecurringDepositsScreen[i];
                case 20:
                    return new TransfersScreen[i];
                case 21:
                    return new BankingBenefitsBookletScreen[i];
                case 22:
                    return new BenefitDetailScreen[i];
                case 23:
                    return new BenefitsExplanationScreen[i];
                case 24:
                    return new BenefitsHomeScreen[i];
                case 25:
                    return new BenefitsHubScreen[i];
                case 26:
                    return new GreenEligibleTransactionsScreen[i];
                case 27:
                    return new PdsaBenefitsExplainerScreen[i];
                case 28:
                    return new BillsSubscriptionsMerchantListScreen[i];
                default:
                    return new BitcoinAmountPickerQuestion[i];
            }
        }
    }

    public SheetAppMessage(String str, DetailsPageInteractViewPage.DetailsPageOrigin detailsPageOrigin, Screen screen) {
        str.getClass();
        detailsPageOrigin.getClass();
        screen.getClass();
        this.messageToken = str;
        this.origin = detailsPageOrigin;
        this.parentScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetAppMessage)) {
            return false;
        }
        SheetAppMessage sheetAppMessage = (SheetAppMessage) obj;
        return Intrinsics.areEqual(this.messageToken, sheetAppMessage.messageToken) && this.origin == sheetAppMessage.origin && Intrinsics.areEqual(this.parentScreen, sheetAppMessage.parentScreen);
    }

    public final int hashCode() {
        return this.parentScreen.hashCode() + ((this.origin.hashCode() + (this.messageToken.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SheetAppMessage(messageToken=" + this.messageToken + ", origin=" + this.origin + ", parentScreen=" + this.parentScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.messageToken);
        parcel.writeString(this.origin.name());
        parcel.writeParcelable(this.parentScreen, i);
    }
}
