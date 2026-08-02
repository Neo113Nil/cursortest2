package com.squareup.cash.payments.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrument;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentRouterData implements Parcelable {
    public static final Parcelable.Creator<PaymentRouterData> CREATOR = new Creator(0);
    public final Money amount;
    public final boolean createLinkErrored;
    public final boolean createLinkInProgress;
    public final boolean expandedSheet;
    public final ExpressivePreviewData expressivePreview;
    public final InstrumentSelectionRowViewModel instrumentRowModel;
    public final boolean loading;
    public final PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus;
    public final String note;
    public final Orientation orientation;
    public final String payLinkToken;
    public final PaymentConfigurationFlow paymentConfigurationFlow;
    public final RecipientViewModel recipient;
    public final RecurringDisabledInstrument recurringDisabledToast;
    public final boolean recurringP2pEligible;
    public final PaymentScheduleSelection scheduleSelection;
    public final String searchQuery;
    public final List sections;
    public final ShareLink shareLink;
    public final boolean showContactPermissionPrompt;
    public final boolean showNoContactsFoundCard;
    public final boolean showSearchTooltip;
    public final boolean showSyncContactsRow;
    public final List stablecoinWithdrawalOptions;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    PaymentConfigurationFlow paymentConfigurationFlow = (PaymentConfigurationFlow) NavAction$$ExternalSyntheticOutline0.m(parcel, PaymentRouterData.class);
                    RecipientViewModel recipientViewModel = (RecipientViewModel) parcel.readParcelable(PaymentRouterData.class.getClassLoader());
                    String readString = parcel.readString();
                    Orientation valueOf = Orientation.valueOf(parcel.readString());
                    Money money = (Money) parcel.readParcelable(PaymentRouterData.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    boolean z2 = parcel.readInt() != 0;
                    boolean z3 = parcel.readInt() != 0;
                    String readString2 = parcel.readString();
                    boolean z4 = parcel.readInt() != 0;
                    boolean z5 = parcel.readInt() != 0;
                    boolean z6 = parcel.readInt() != 0;
                    boolean z7 = parcel.readInt() != 0;
                    ShareLink createFromParcel = parcel.readInt() == 0 ? null : ShareLink.CREATOR.createFromParcel(parcel);
                    String readString3 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentRouterData.class, parcel, arrayList, i, 1);
                    }
                    return new PaymentRouterData(paymentConfigurationFlow, recipientViewModel, readString, valueOf, money, z, z2, z3, readString2, z4, z5, z6, z7, createFromParcel, readString3, z8, arrayList, (PaymentScheduleSelection) parcel.readParcelable(PaymentRouterData.class.getClassLoader()), parcel.readInt() == 0 ? null : RecurringDisabledInstrument.valueOf(parcel.readString()), parcel.readInt() != 0, 332032);
                case 1:
                    parcel.getClass();
                    return new ShareLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                default:
                    parcel.getClass();
                    return new StickerSelectedResult((Sticker) parcel.readParcelable(StickerSelectedResult.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PaymentRouterData[i];
                case 1:
                    return new ShareLink[i];
                default:
                    return new StickerSelectedResult[i];
            }
        }
    }

    public final class ShareLink implements Parcelable {
        public static final Parcelable.Creator<ShareLink> CREATOR = new Creator(1);
        public final String link;
        public final String note;
        public final boolean wasShared;

        public ShareLink(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.link = str;
            this.note = str2;
            this.wasShared = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareLink)) {
                return false;
            }
            ShareLink shareLink = (ShareLink) obj;
            return Intrinsics.areEqual(this.link, shareLink.link) && Intrinsics.areEqual(this.note, shareLink.note) && this.wasShared == shareLink.wasShared;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.wasShared) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.link.hashCode() * 31, 31, this.note);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShareLink(link=", this.link, ", note=", this.note, ", wasShared="), this.wasShared, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.link);
            parcel.writeString(this.note);
            parcel.writeInt(this.wasShared ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentRouterData(PaymentConfigurationFlow paymentConfigurationFlow, RecipientViewModel recipientViewModel, String str, Orientation orientation, Money money, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, ShareLink shareLink, String str3, boolean z8, ArrayList arrayList, PaymentScheduleSelection paymentScheduleSelection, RecurringDisabledInstrument recurringDisabledInstrument, boolean z9, int i) {
        this(paymentConfigurationFlow, recipientViewModel, str, orientation, money, z, r10, r11, null, r13, r14, r15, r16, (i & PKIFailureInfo.certRevoked) != 0 ? false : z6, (i & 16384) != 0 ? false : z7, shareLink, null, str3, null, z8, (1048576 & i) != 0 ? r16 : arrayList, (2097152 & i) != 0 ? null : paymentScheduleSelection, (4194304 & i) != 0 ? null : recurringDisabledInstrument, (i & 8388608) != 0 ? false : z9);
        boolean z10 = (i & 64) != 0 ? false : z2;
        boolean z11 = (i & 128) != 0 ? false : z3;
        String str4 = (i & 512) != 0 ? "" : str2;
        boolean z12 = (i & 1024) != 0 ? false : z4;
        boolean z13 = (i & 2048) != 0 ? true : z5;
        List list = EmptyList.INSTANCE;
    }

    public static PaymentRouterData copy$default(PaymentRouterData paymentRouterData, RecipientViewModel recipientViewModel, String str, Money money, boolean z, boolean z2, boolean z3, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, String str2, boolean z4, List list, boolean z5, boolean z6, ShareLink shareLink, PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus, ExpressivePreviewData expressivePreviewData, List list2, PaymentScheduleSelection paymentScheduleSelection, RecurringDisabledInstrument recurringDisabledInstrument, boolean z7, int i) {
        String str3;
        ExpressivePreviewData expressivePreviewData2;
        PaymentConfigurationFlow paymentConfigurationFlow = paymentRouterData.paymentConfigurationFlow;
        RecipientViewModel recipientViewModel2 = (i & 2) != 0 ? paymentRouterData.recipient : recipientViewModel;
        String str4 = (i & 4) != 0 ? paymentRouterData.note : str;
        Orientation orientation = paymentRouterData.orientation;
        Money money2 = (i & 16) != 0 ? paymentRouterData.amount : money;
        boolean z8 = (i & 32) != 0 ? paymentRouterData.showContactPermissionPrompt : z;
        boolean z9 = (i & 64) != 0 ? paymentRouterData.showSyncContactsRow : z2;
        boolean z10 = (i & 128) != 0 ? paymentRouterData.showNoContactsFoundCard : z3;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = (i & 256) != 0 ? paymentRouterData.instrumentRowModel : instrumentSelectionRowViewModel;
        String str5 = (i & 512) != 0 ? paymentRouterData.searchQuery : str2;
        boolean z11 = (i & 1024) != 0 ? paymentRouterData.expandedSheet : false;
        boolean z12 = (i & 2048) != 0 ? paymentRouterData.loading : z4;
        List list3 = (i & 4096) != 0 ? paymentRouterData.sections : list;
        boolean z13 = (i & PKIFailureInfo.certRevoked) != 0 ? paymentRouterData.createLinkInProgress : z5;
        boolean z14 = (i & 16384) != 0 ? paymentRouterData.createLinkErrored : z6;
        ShareLink shareLink2 = (i & 32768) != 0 ? paymentRouterData.shareLink : shareLink;
        PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus2 = (i & 65536) != 0 ? paymentRouterData.loadingStatus : loadingStatus;
        String str6 = paymentRouterData.payLinkToken;
        if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
            str3 = str6;
            expressivePreviewData2 = paymentRouterData.expressivePreview;
        } else {
            str3 = str6;
            expressivePreviewData2 = expressivePreviewData;
        }
        boolean z15 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? paymentRouterData.showSearchTooltip : false;
        List list4 = (i & PKIFailureInfo.badCertTemplate) != 0 ? paymentRouterData.stablecoinWithdrawalOptions : list2;
        PaymentScheduleSelection paymentScheduleSelection2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? paymentRouterData.scheduleSelection : paymentScheduleSelection;
        RecurringDisabledInstrument recurringDisabledInstrument2 = (i & 4194304) != 0 ? paymentRouterData.recurringDisabledToast : recurringDisabledInstrument;
        boolean z16 = (i & 8388608) != 0 ? paymentRouterData.recurringP2pEligible : z7;
        paymentRouterData.getClass();
        paymentConfigurationFlow.getClass();
        orientation.getClass();
        money2.getClass();
        str5.getClass();
        list3.getClass();
        list4.getClass();
        return new PaymentRouterData(paymentConfigurationFlow, recipientViewModel2, str4, orientation, money2, z8, z9, z10, instrumentSelectionRowViewModel2, str5, z11, z12, list3, z13, z14, shareLink2, loadingStatus2, str3, expressivePreviewData2, z15, list4, paymentScheduleSelection2, recurringDisabledInstrument2, z16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentRouterData)) {
            return false;
        }
        PaymentRouterData paymentRouterData = (PaymentRouterData) obj;
        return Intrinsics.areEqual(this.paymentConfigurationFlow, paymentRouterData.paymentConfigurationFlow) && Intrinsics.areEqual(this.recipient, paymentRouterData.recipient) && Intrinsics.areEqual(this.note, paymentRouterData.note) && this.orientation == paymentRouterData.orientation && Intrinsics.areEqual(this.amount, paymentRouterData.amount) && this.showContactPermissionPrompt == paymentRouterData.showContactPermissionPrompt && this.showSyncContactsRow == paymentRouterData.showSyncContactsRow && this.showNoContactsFoundCard == paymentRouterData.showNoContactsFoundCard && Intrinsics.areEqual(this.instrumentRowModel, paymentRouterData.instrumentRowModel) && Intrinsics.areEqual(this.searchQuery, paymentRouterData.searchQuery) && this.expandedSheet == paymentRouterData.expandedSheet && this.loading == paymentRouterData.loading && Intrinsics.areEqual(this.sections, paymentRouterData.sections) && this.createLinkInProgress == paymentRouterData.createLinkInProgress && this.createLinkErrored == paymentRouterData.createLinkErrored && Intrinsics.areEqual(this.shareLink, paymentRouterData.shareLink) && Intrinsics.areEqual(this.loadingStatus, paymentRouterData.loadingStatus) && Intrinsics.areEqual(this.payLinkToken, paymentRouterData.payLinkToken) && Intrinsics.areEqual(this.expressivePreview, paymentRouterData.expressivePreview) && this.showSearchTooltip == paymentRouterData.showSearchTooltip && Intrinsics.areEqual(this.stablecoinWithdrawalOptions, paymentRouterData.stablecoinWithdrawalOptions) && Intrinsics.areEqual(this.scheduleSelection, paymentRouterData.scheduleSelection) && this.recurringDisabledToast == paymentRouterData.recurringDisabledToast && this.recurringP2pEligible == paymentRouterData.recurringP2pEligible;
    }

    public final int hashCode() {
        int hashCode = this.paymentConfigurationFlow.hashCode() * 31;
        RecipientViewModel recipientViewModel = this.recipient;
        int hashCode2 = (hashCode + (recipientViewModel == null ? 0 : recipientViewModel.hashCode())) * 31;
        String str = this.note;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, (this.orientation.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.showContactPermissionPrompt), 31, this.showSyncContactsRow), 31, this.showNoContactsFoundCard);
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = this.instrumentRowModel;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (instrumentSelectionRowViewModel == null ? 0 : instrumentSelectionRowViewModel.hashCode())) * 31, 31, this.searchQuery), 31, this.expandedSheet), 31, this.loading), 31, this.sections), 31, this.createLinkInProgress), 31, this.createLinkErrored);
        ShareLink shareLink = this.shareLink;
        int hashCode3 = (m2 + (shareLink == null ? 0 : shareLink.hashCode())) * 31;
        PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus = this.loadingStatus;
        int hashCode4 = (hashCode3 + (loadingStatus == null ? 0 : loadingStatus.hashCode())) * 31;
        String str2 = this.payLinkToken;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExpressivePreviewData expressivePreviewData = this.expressivePreview;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (expressivePreviewData == null ? 0 : expressivePreviewData.hashCode())) * 31, 31, this.showSearchTooltip), 31, this.stablecoinWithdrawalOptions);
        PaymentScheduleSelection paymentScheduleSelection = this.scheduleSelection;
        int hashCode6 = (m3 + (paymentScheduleSelection == null ? 0 : paymentScheduleSelection.hashCode())) * 31;
        RecurringDisabledInstrument recurringDisabledInstrument = this.recurringDisabledToast;
        return Boolean.hashCode(this.recurringP2pEligible) + ((hashCode6 + (recurringDisabledInstrument != null ? recurringDisabledInstrument.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentRouterData(paymentConfigurationFlow=");
        sb.append(this.paymentConfigurationFlow);
        sb.append(", recipient=");
        sb.append(this.recipient);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", showContactPermissionPrompt=");
        sb.append(this.showContactPermissionPrompt);
        sb.append(", showSyncContactsRow=");
        re$$ExternalSyntheticOutline0.m(sb, this.showSyncContactsRow, ", showNoContactsFoundCard=", this.showNoContactsFoundCard, ", instrumentRowModel=");
        sb.append(this.instrumentRowModel);
        sb.append(", searchQuery=");
        sb.append(this.searchQuery);
        sb.append(", expandedSheet=");
        re$$ExternalSyntheticOutline0.m(sb, this.expandedSheet, ", loading=", this.loading, ", sections=");
        sb.append(this.sections);
        sb.append(", createLinkInProgress=");
        sb.append(this.createLinkInProgress);
        sb.append(", createLinkErrored=");
        sb.append(this.createLinkErrored);
        sb.append(", shareLink=");
        sb.append(this.shareLink);
        sb.append(", loadingStatus=");
        sb.append(this.loadingStatus);
        sb.append(", payLinkToken=");
        sb.append(this.payLinkToken);
        sb.append(", expressivePreview=");
        sb.append(this.expressivePreview);
        sb.append(", showSearchTooltip=");
        sb.append(this.showSearchTooltip);
        sb.append(", stablecoinWithdrawalOptions=");
        sb.append(this.stablecoinWithdrawalOptions);
        sb.append(", scheduleSelection=");
        sb.append(this.scheduleSelection);
        sb.append(", recurringDisabledToast=");
        sb.append(this.recurringDisabledToast);
        sb.append(", recurringP2pEligible=");
        sb.append(this.recurringP2pEligible);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paymentConfigurationFlow, i);
        parcel.writeParcelable(this.recipient, i);
        parcel.writeString(this.note);
        parcel.writeString(this.orientation.name());
        parcel.writeParcelable(this.amount, i);
        parcel.writeInt(this.showContactPermissionPrompt ? 1 : 0);
        parcel.writeInt(this.showSyncContactsRow ? 1 : 0);
        parcel.writeInt(this.showNoContactsFoundCard ? 1 : 0);
        parcel.writeString(this.searchQuery);
        parcel.writeInt(this.expandedSheet ? 1 : 0);
        parcel.writeInt(this.loading ? 1 : 0);
        parcel.writeInt(this.createLinkInProgress ? 1 : 0);
        parcel.writeInt(this.createLinkErrored ? 1 : 0);
        ShareLink shareLink = this.shareLink;
        if (shareLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareLink.writeToParcel(parcel, i);
        }
        parcel.writeString(this.payLinkToken);
        parcel.writeInt(this.showSearchTooltip ? 1 : 0);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.stablecoinWithdrawalOptions, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.scheduleSelection, i);
        RecurringDisabledInstrument recurringDisabledInstrument = this.recurringDisabledToast;
        if (recurringDisabledInstrument == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(recurringDisabledInstrument.name());
        }
        parcel.writeInt(this.recurringP2pEligible ? 1 : 0);
    }

    public PaymentRouterData(PaymentConfigurationFlow paymentConfigurationFlow, RecipientViewModel recipientViewModel, String str, Orientation orientation, Money money, boolean z, boolean z2, boolean z3, InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, String str2, boolean z4, boolean z5, List list, boolean z6, boolean z7, ShareLink shareLink, PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus, String str3, ExpressivePreviewData expressivePreviewData, boolean z8, List list2, PaymentScheduleSelection paymentScheduleSelection, RecurringDisabledInstrument recurringDisabledInstrument, boolean z9) {
        paymentConfigurationFlow.getClass();
        orientation.getClass();
        money.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.paymentConfigurationFlow = paymentConfigurationFlow;
        this.recipient = recipientViewModel;
        this.note = str;
        this.orientation = orientation;
        this.amount = money;
        this.showContactPermissionPrompt = z;
        this.showSyncContactsRow = z2;
        this.showNoContactsFoundCard = z3;
        this.instrumentRowModel = instrumentSelectionRowViewModel;
        this.searchQuery = str2;
        this.expandedSheet = z4;
        this.loading = z5;
        this.sections = list;
        this.createLinkInProgress = z6;
        this.createLinkErrored = z7;
        this.shareLink = shareLink;
        this.loadingStatus = loadingStatus;
        this.payLinkToken = str3;
        this.expressivePreview = expressivePreviewData;
        this.showSearchTooltip = z8;
        this.stablecoinWithdrawalOptions = list2;
        this.scheduleSelection = paymentScheduleSelection;
        this.recurringDisabledToast = recurringDisabledInstrument;
        this.recurringP2pEligible = z9;
    }
}
