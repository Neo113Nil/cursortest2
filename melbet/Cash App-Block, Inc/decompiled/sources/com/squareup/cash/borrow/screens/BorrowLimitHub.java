package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDocumentScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPaySheetAnalyticsContext;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.buynowpaylater.viewmodels.Alignment;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OrderPaymentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OverflowActionsModel;
import com.squareup.cash.buynowpaylater.viewmodels.StackableRow;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioExitQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioUndoDialogScreen;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseStart;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.lending.CustomRepaymentAmountSelectionData;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BorrowLimitHub implements BorrowScreen, RestoringScreen {
    public static final BorrowLimitHub INSTANCE = new BorrowLimitHub();
    public static final Parcelable.Creator<BorrowLimitHub> CREATOR = new Creator(0);

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Alignment alignment;
            boolean z;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return BorrowLimitHub.INSTANCE;
                case 1:
                    BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) NavAction$$ExternalSyntheticOutline0.m(parcel, ExpandedLoanHistory.class);
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(ExpandedLoanHistory.class, parcel, arrayList, i, 1);
                    }
                    return new ExpandedLoanHistory(expandedLoanListViewData, arrayList);
                case 2:
                    parcel.getClass();
                    return new LoanAmountPicker.LoanAmountPickerFull((InitiateLoanData) parcel.readParcelable(LoanAmountPicker.LoanAmountPickerFull.class.getClassLoader()), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new LoanAmountPicker.LoanAmountPickerSheet((InitiateLoanData) parcel.readParcelable(LoanAmountPicker.LoanAmountPickerSheet.class.getClassLoader()), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new RepayCustomAmountPicker((CustomRepaymentAmountSelectionData) parcel.readParcelable(RepayCustomAmountPicker.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i4 != readInt2) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(BugReportingScreen.class, parcel, arrayList2, i4, 1);
                    }
                    return new BugReportingScreen(arrayList2);
                case 6:
                    parcel.getClass();
                    return new DiagnosticAttachments(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                case 7:
                    parcel.getClass();
                    return new Screenshot(((UriString) parcel.readParcelable(Screenshot.class.getClassLoader())).value, parcel.readString(), parcel.readInt() != 0);
                case 8:
                    parcel.getClass();
                    return new KybRestrictionBannerScreen((Screen) parcel.readParcelable(KybRestrictionBannerScreen.class.getClassLoader()), KybEligibilityWarning.RestrictedFeature.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    return new AfterPayInfoSheetScreen((InfoSheetViewModel) parcel.readParcelable(AfterPayInfoSheetScreen.class.getClassLoader()), (AfterPaySheetAnalyticsContext) parcel.readParcelable(AfterPayInfoSheetScreen.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new AfterPayOrderDetailsScreen(parcel.readString(), parcel.readInt() != 0);
                case 11:
                    parcel.getClass();
                    return new AfterPayOrderDocumentScreen(parcel.readString(), parcel.readInt() != 0);
                case 12:
                    AfterpayHubBrowseStart.AppLocation appLocation = null;
                    parcel.getClass();
                    if (parcel.readInt() != 0) {
                        appLocation = AfterpayHubBrowseStart.AppLocation.valueOf(parcel.readString());
                    }
                    return new AfterPayOrderHubScreen(appLocation, parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return AfterPaySheetAnalyticsContext.AvailableCredit.INSTANCE;
                case 14:
                    parcel.getClass();
                    return new AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics(parcel.readString());
                case 15:
                    parcel.getClass();
                    return new AfterPaySheetAnalyticsContext.PaymentDetails(parcel.readString(), ScheduledPaymentStatus.valueOf(parcel.readString()));
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return AfterPaySheetAnalyticsContext.TotalOwed.INSTANCE;
                case 17:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(OrderDetailsOverflowActionSheetScreen.class, parcel, arrayList3, i3, 1);
                    }
                    return new OrderDetailsOverflowActionSheetScreen(arrayList3, AfterPayOrderDetailsScreen.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    while (i2 != readInt4) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(InfoSheetViewModel.class, parcel, arrayList4, i2, 1);
                    }
                    return new InfoSheetViewModel(arrayList4);
                case 19:
                    parcel.getClass();
                    return new OrderPaymentViewModel((Image) parcel.readParcelable(OrderPaymentViewModel.class.getClassLoader()), parcel.readInt() == 0 ? null : TextModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextModel.CREATOR.createFromParcel(parcel), parcel.readString());
                case 20:
                    TextModel textModel = null;
                    parcel.getClass();
                    if (parcel.readInt() != 0) {
                        textModel = TextModel.CREATOR.createFromParcel(parcel);
                    }
                    return new OverflowActionsModel(textModel, parcel.readString());
                case 21:
                    parcel.getClass();
                    return new StackableRow.PaymentStatusIcon(ScheduledPaymentStatus.valueOf(parcel.readString()));
                case 22:
                    TextModel textModel2 = null;
                    parcel.getClass();
                    TextModel createFromParcel = parcel.readInt() == 0 ? null : TextModel.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        textModel2 = TextModel.CREATOR.createFromParcel(parcel);
                    }
                    return new StackableRow.RowItem(createFromParcel, textModel2);
                case 23:
                    parcel.getClass();
                    return new StackableRow.Text(TextModel.CREATOR.createFromParcel(parcel));
                case 24:
                    parcel.getClass();
                    SemanticColor semanticColor = null;
                    String readString = parcel.readString();
                    TextStyle valueOf = TextStyle.valueOf(parcel.readString());
                    Alignment valueOf2 = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        semanticColor = SemanticColor.valueOf(parcel.readString());
                    }
                    if (parcel.readInt() != 0) {
                        Alignment alignment2 = valueOf2;
                        z = true;
                        alignment = alignment2;
                    } else {
                        alignment = valueOf2;
                        z = false;
                    }
                    return new TextModel(readString, valueOf, alignment, semanticColor, z);
                case 25:
                    parcel.getClass();
                    return new CardStudioExitDialogScreen((AskedQuestion) parcel.readParcelable(CardStudioExitDialogScreen.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioExitQuestion.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioMoreSheetQuestion.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new CardStudioMoreSheetScreen(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (AskedQuestion) parcel.readParcelable(CardStudioMoreSheetScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioUndoDialogScreen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new BorrowLimitHub[i];
                case 1:
                    return new ExpandedLoanHistory[i];
                case 2:
                    return new LoanAmountPicker.LoanAmountPickerFull[i];
                case 3:
                    return new LoanAmountPicker.LoanAmountPickerSheet[i];
                case 4:
                    return new RepayCustomAmountPicker[i];
                case 5:
                    return new BugReportingScreen[i];
                case 6:
                    return new DiagnosticAttachments[i];
                case 7:
                    return new Screenshot[i];
                case 8:
                    return new KybRestrictionBannerScreen[i];
                case 9:
                    return new AfterPayInfoSheetScreen[i];
                case 10:
                    return new AfterPayOrderDetailsScreen[i];
                case 11:
                    return new AfterPayOrderDocumentScreen[i];
                case 12:
                    return new AfterPayOrderHubScreen[i];
                case 13:
                    return new AfterPaySheetAnalyticsContext.AvailableCredit[i];
                case 14:
                    return new AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics[i];
                case 15:
                    return new AfterPaySheetAnalyticsContext.PaymentDetails[i];
                case 16:
                    return new AfterPaySheetAnalyticsContext.TotalOwed[i];
                case 17:
                    return new OrderDetailsOverflowActionSheetScreen[i];
                case 18:
                    return new InfoSheetViewModel[i];
                case 19:
                    return new OrderPaymentViewModel[i];
                case 20:
                    return new OverflowActionsModel[i];
                case 21:
                    return new StackableRow.PaymentStatusIcon[i];
                case 22:
                    return new StackableRow.RowItem[i];
                case 23:
                    return new StackableRow.Text[i];
                case 24:
                    return new TextModel[i];
                case 25:
                    return new CardStudioExitDialogScreen[i];
                case 26:
                    return new CardStudioExitQuestion[i];
                case 27:
                    return new CardStudioMoreSheetQuestion[i];
                case 28:
                    return new CardStudioMoreSheetScreen[i];
                default:
                    return new CardStudioUndoDialogScreen[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BorrowLimitHub);
    }

    public final int hashCode() {
        return -1110677859;
    }

    public final String toString() {
        return "BorrowLimitHub";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
