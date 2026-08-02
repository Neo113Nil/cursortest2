package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.viewmodels.BusinessDetailsBackConfirmResult$Positive;
import com.squareup.cash.blockers.viewmodels.CameraErrorResult$Cancel;
import com.squareup.cash.blockers.viewmodels.CameraErrorResult$Retry;
import com.squareup.cash.blockers.viewmodels.CameraPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.CameraPermissionResult$Positive;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationResult$Negative;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationResult$Positive;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorResult$Negative;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorResult$Positive;
import com.squareup.cash.blockers.viewmodels.FilesetUploadLoadingResult$Negative;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsSheetResult;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeResult;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionResult$Positive;
import com.squareup.cash.blockers.viewmodels.SkipVerifyResult$Negative;
import com.squareup.cash.blockers.viewmodels.SkipVerifyResult$Positive;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationResult$Negative;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationResult$Positive;
import com.squareup.cash.blockers.viewmodels.VerifyHelpItem;
import com.squareup.cash.blockers.views.navigation.FlowData;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BorrowHome implements BorrowLandingScreen {
    public static final Parcelable.Creator<BorrowHome> CREATOR = new Creator(0);
    public final InitialState initialState;

    /* loaded from: classes4.dex */
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
                    return new BorrowHome((InitialState) parcel.readParcelable(BorrowHome.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return BusinessDetailsBackConfirmResult$Positive.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return CameraErrorResult$Cancel.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return CameraErrorResult$Retry.INSTANCE;
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return CameraPermissionResult$Negative.INSTANCE;
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return CameraPermissionResult$Positive.INSTANCE;
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return FileBlockerExplanationResult$Negative.INSTANCE;
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return FileBlockerExplanationResult$Positive.INSTANCE;
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return FilesetUploadErrorResult$Negative.INSTANCE;
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return FilesetUploadErrorResult$Positive.INSTANCE;
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return FilesetUploadLoadingResult$Negative.INSTANCE;
                case 11:
                    parcel.getClass();
                    return FilesetUploadOptionsSheetResult.valueOf(parcel.readString());
                case 12:
                    parcel.getClass();
                    return new FilesetUploadViewModel.FileViewModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return IneligibleMergeResult.Negative.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return IneligibleMergeResult.Positive.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return ReadContactsPermissionResult$Negative.INSTANCE;
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return ReadContactsPermissionResult$Positive.INSTANCE;
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return SkipVerifyResult$Negative.INSTANCE;
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return SkipVerifyResult$Positive.INSTANCE;
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return UpgradeConfirmationResult$Negative.INSTANCE;
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return UpgradeConfirmationResult$Positive.INSTANCE;
                case 21:
                    parcel.getClass();
                    return VerifyHelpItem.valueOf(parcel.readString());
                case 22:
                    parcel.getClass();
                    return new FlowData(BlockersData.Flow.valueOf(parcel.readString()));
                case 23:
                    parcel.getClass();
                    return new InitialState.DisplayingLoanDetails(parcel.readString());
                case 24:
                    parcel.getClass();
                    return new InitialState.DisplayingRepaymentOptions(parcel.readString());
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return InitialState.Standard.INSTANCE;
                case 26:
                    parcel.getClass();
                    return new BorrowHomeAmountPickerSheet((InitiateLoanData) parcel.readParcelable(BorrowHomeAmountPickerSheet.class.getClassLoader()), (Screen) parcel.readParcelable(BorrowHomeAmountPickerSheet.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new BorrowHomeOverlay.BulletinInfo((BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) parcel.readParcelable(BorrowHomeOverlay.BulletinInfo.class.getClassLoader()), (Screen) parcel.readParcelable(BorrowHomeOverlay.BulletinInfo.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new BorrowHomeOverlay.LoanDetails((BorrowAppletLoanHistoryTile.Data.Loan.Details) parcel.readParcelable(BorrowHomeOverlay.LoanDetails.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(BorrowHomeOverlay.LoanDetails.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new BorrowHomeOverlay.RepaymentSelection((LoanRepaymentSelectionData) parcel.readParcelable(BorrowHomeOverlay.RepaymentSelection.class.getClassLoader()), (Screen) parcel.readParcelable(BorrowHomeOverlay.RepaymentSelection.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new BorrowHome[i];
                case 1:
                    return new BusinessDetailsBackConfirmResult$Positive[i];
                case 2:
                    return new CameraErrorResult$Cancel[i];
                case 3:
                    return new CameraErrorResult$Retry[i];
                case 4:
                    return new CameraPermissionResult$Negative[i];
                case 5:
                    return new CameraPermissionResult$Positive[i];
                case 6:
                    return new FileBlockerExplanationResult$Negative[i];
                case 7:
                    return new FileBlockerExplanationResult$Positive[i];
                case 8:
                    return new FilesetUploadErrorResult$Negative[i];
                case 9:
                    return new FilesetUploadErrorResult$Positive[i];
                case 10:
                    return new FilesetUploadLoadingResult$Negative[i];
                case 11:
                    return new FilesetUploadOptionsSheetResult[i];
                case 12:
                    return new FilesetUploadViewModel.FileViewModel[i];
                case 13:
                    return new IneligibleMergeResult.Negative[i];
                case 14:
                    return new IneligibleMergeResult.Positive[i];
                case 15:
                    return new ReadContactsPermissionResult$Negative[i];
                case 16:
                    return new ReadContactsPermissionResult$Positive[i];
                case 17:
                    return new SkipVerifyResult$Negative[i];
                case 18:
                    return new SkipVerifyResult$Positive[i];
                case 19:
                    return new UpgradeConfirmationResult$Negative[i];
                case 20:
                    return new UpgradeConfirmationResult$Positive[i];
                case 21:
                    return new VerifyHelpItem[i];
                case 22:
                    return new FlowData[i];
                case 23:
                    return new InitialState.DisplayingLoanDetails[i];
                case 24:
                    return new InitialState.DisplayingRepaymentOptions[i];
                case 25:
                    return new InitialState.Standard[i];
                case 26:
                    return new BorrowHomeAmountPickerSheet[i];
                case 27:
                    return new BorrowHomeOverlay.BulletinInfo[i];
                case 28:
                    return new BorrowHomeOverlay.LoanDetails[i];
                default:
                    return new BorrowHomeOverlay.RepaymentSelection[i];
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface InitialState extends Parcelable {

        /* loaded from: classes4.dex */
        public final class DisplayingLoanDetails implements InitialState {
            public static final Parcelable.Creator<DisplayingLoanDetails> CREATOR = new Creator(23);
            public final String token;

            public DisplayingLoanDetails(String str) {
                str.getClass();
                this.token = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayingLoanDetails) && Intrinsics.areEqual(this.token, ((DisplayingLoanDetails) obj).token);
            }

            public final int hashCode() {
                return this.token.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayingLoanDetails(token=", this.token, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.token);
            }
        }

        public final class DisplayingRepaymentOptions implements InitialState {
            public static final Parcelable.Creator<DisplayingRepaymentOptions> CREATOR = new Creator(24);
            public final String identifier;

            public DisplayingRepaymentOptions(String str) {
                str.getClass();
                this.identifier = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayingRepaymentOptions) && Intrinsics.areEqual(this.identifier, ((DisplayingRepaymentOptions) obj).identifier);
            }

            public final int hashCode() {
                return this.identifier.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayingRepaymentOptions(identifier=", this.identifier, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.identifier);
            }
        }

        public final class Standard implements InitialState {
            public static final Standard INSTANCE = new Standard();
            public static final Parcelable.Creator<Standard> CREATOR = new Creator(25);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Standard);
            }

            public final int hashCode() {
                return 1856515250;
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

    public BorrowHome(InitialState initialState) {
        initialState.getClass();
        this.initialState = initialState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowHome) && Intrinsics.areEqual(this.initialState, ((BorrowHome) obj).initialState);
    }

    public final int hashCode() {
        return this.initialState.hashCode();
    }

    public final String toString() {
        return "BorrowHome(initialState=" + this.initialState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.initialState, i);
    }

    public /* synthetic */ BorrowHome() {
        this(InitialState.Standard.INSTANCE);
    }
}
