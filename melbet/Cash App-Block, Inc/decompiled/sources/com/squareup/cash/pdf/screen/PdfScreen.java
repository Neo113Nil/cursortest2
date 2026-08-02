package com.squareup.cash.pdf.screen;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberStart;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeView;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansHomeScreen;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleQuestion;
import com.squareup.cash.pools.screens.PoolInvitePeopleResult;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.profile.devicemanager.backend.DeviceInfoHash;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import com.squareup.protos.franklin.api.PhonePlanNewLineLoadingBlocker;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PdfScreen implements Screen {
    public static final Parcelable.Creator<PdfScreen> CREATOR = new Creator(0);
    public final String displayTitle;
    public final Uri fileUri;

    /* loaded from: classes6.dex */
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
                    return new PdfScreen((Uri) parcel.readParcelable(PdfScreen.class.getClassLoader()), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new PhonePlansEsimCheckBlockerScreen((BlockersData) parcel.readParcelable(PhonePlansEsimCheckBlockerScreen.class.getClassLoader()), (PhonePlanESimCheckBlocker) parcel.readParcelable(PhonePlansEsimCheckBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(PhonePlansEsimCheckBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(PhonePlansEsimCheckBlockerScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return PhonePlansHomeScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new PhonePlansNewLineLoadingBlockerScreen((BlockersData) parcel.readParcelable(PhonePlansNewLineLoadingBlockerScreen.class.getClassLoader()), (PhonePlanNewLineLoadingBlocker) parcel.readParcelable(PhonePlansNewLineLoadingBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(PhonePlansNewLineLoadingBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(PhonePlansNewLineLoadingBlockerScreen.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new WirelessProviderListBlockerScreen((BlockersData) parcel.readParcelable(WirelessProviderListBlockerScreen.class.getClassLoader()), (WirelessProviderListBlocker) parcel.readParcelable(WirelessProviderListBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(WirelessProviderListBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(WirelessProviderListBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(WirelessProviderListBlockerScreen.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new PoolContributeScreen((Redacted) parcel.readParcelable(PoolContributeScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(PoolContributeScreen.class.getClassLoader()), parcel.readString(), (Redacted) parcel.readParcelable(PoolContributeScreen.class.getClassLoader()), (Money) parcel.readParcelable(PoolContributeScreen.class.getClassLoader()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), (Redacted) parcel.readParcelable(PoolContributeScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new PoolDetailsScreen(parcel.readString(), parcel.readString(), (MoneyPool) parcel.readParcelable(PoolDetailsScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? AssetPoolPoolHomeView.ViewHomeSource.valueOf(parcel.readString()) : null, (Money) parcel.readParcelable(PoolDetailsScreen.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    return new PoolInvitePeopleListScreen(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (AskedQuestion) parcel.readParcelable(PoolInvitePeopleListScreen.class.getClassLoader()), AssetPoolAddMemberStart.AddMemberSource.valueOf(parcel.readString()), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new PoolInvitePeopleQuestion((Redacted) parcel.readParcelable(PoolInvitePeopleQuestion.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new PoolInvitePeopleResult((Redacted) parcel.readParcelable(PoolInvitePeopleResult.class.getClassLoader()), (Redacted) parcel.readParcelable(PoolInvitePeopleResult.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new PoolMemberListScreen(parcel.readString(), (Redacted) parcel.readParcelable(PoolMemberListScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(PoolMemberListScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0 ? MoneyPoolVisitOrigin.valueOf(parcel.readString()) : null);
                case 11:
                    boolean z = true;
                    parcel.getClass();
                    Redacted redacted = (Redacted) parcel.readParcelable(PoolMoreOptionsBottomSheet.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    return new PoolMoreOptionsBottomSheet(redacted, z, parcel.readString(), parcel.readInt() != 0 ? MoneyPoolVisitOrigin.valueOf(parcel.readString()) : null);
                case 12:
                    parcel.getClass();
                    return new PoolsListScreen(parcel.readString(), PoolsListScreen.AppletState.valueOf(parcel.readString()));
                case 13:
                    parcel.getClass();
                    return new StartPoolScreen((Money) parcel.readParcelable(StartPoolScreen.class.getClassLoader()), (UUID) parcel.readSerializable(), StartPoolScreen.EntryPoint.valueOf(parcel.readString()));
                case 14:
                    boolean z2 = true;
                    parcel.getClass();
                    Money money = (Money) parcel.readParcelable(PoolContributeWithNoteViewModel.AmountAtmPicker.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        z2 = false;
                    }
                    return new PoolContributeWithNoteViewModel.AmountAtmPicker(money, null, z2, 2);
                case 15:
                    parcel.getClass();
                    return new PoolContributeWithNoteViewModel.AmountCustomPicker((Money) parcel.readParcelable(PoolContributeWithNoteViewModel.AmountCustomPicker.class.getClassLoader()), CurrencyCode.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                case 16:
                    parcel.getClass();
                    return new PoolContributeWithNoteViewModel.InputNote((Money) parcel.readParcelable(PoolContributeWithNoteViewModel.InputNote.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), 32);
                case 17:
                    parcel.getClass();
                    Money money2 = (Money) parcel.readParcelable(PoolContributeWithNoteViewModel.Review.class.getClassLoader());
                    String readString = parcel.readString();
                    boolean z3 = true;
                    String readString2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z3 = false;
                    }
                    return new PoolContributeWithNoteViewModel.Review(money2, readString, readString2, z3, parcel.readString(), (InstrumentSelectionRowViewModel) parcel.readParcelable(PoolContributeWithNoteViewModel.Review.class.getClassLoader()), parcel.readString());
                case 18:
                    parcel.getClass();
                    return new StartPoolViewModel.Amount((Money) parcel.readParcelable(StartPoolViewModel.Amount.class.getClassLoader()), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new StartPoolViewModel.Error(parcel.readString(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new StartPoolViewModel.Name((Money) parcel.readParcelable(StartPoolViewModel.Name.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new StartPoolViewModel.Submit((Money) parcel.readParcelable(StartPoolViewModel.Submit.class.getClassLoader()), parcel.readString());
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return StartPoolViewModel.Success.INSTANCE;
                case 23:
                    parcel.getClass();
                    return new PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen((PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) parcel.readParcelable(PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.class.getClassLoader()));
                case 24:
                    return new DeviceInfoHash(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 25:
                    parcel.getClass();
                    return new DeviceManagerConfirmRemoveDevicesScreen((Redacted) parcel.readParcelable(DeviceManagerConfirmRemoveDevicesScreen.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceManagerConfirmRemoveDevicesScreen.Result.Cancel.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceManagerConfirmRemoveDevicesScreen.Result.Remove.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new DeviceManagerDeviceDetailsScreen(parcel.readString(), parcel.readInt());
                default:
                    parcel.getClass();
                    return new DeviceManagerDeviceRemovalFailedBottomSheetScreen(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0 ? DeviceManagerDeviceRemovalFailedScreen.ErrorReason.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readInt());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PdfScreen[i];
                case 1:
                    return new PhonePlansEsimCheckBlockerScreen[i];
                case 2:
                    return new PhonePlansHomeScreen[i];
                case 3:
                    return new PhonePlansNewLineLoadingBlockerScreen[i];
                case 4:
                    return new WirelessProviderListBlockerScreen[i];
                case 5:
                    return new PoolContributeScreen[i];
                case 6:
                    return new PoolDetailsScreen[i];
                case 7:
                    return new PoolInvitePeopleListScreen[i];
                case 8:
                    return new PoolInvitePeopleQuestion[i];
                case 9:
                    return new PoolInvitePeopleResult[i];
                case 10:
                    return new PoolMemberListScreen[i];
                case 11:
                    return new PoolMoreOptionsBottomSheet[i];
                case 12:
                    return new PoolsListScreen[i];
                case 13:
                    return new StartPoolScreen[i];
                case 14:
                    return new PoolContributeWithNoteViewModel.AmountAtmPicker[i];
                case 15:
                    return new PoolContributeWithNoteViewModel.AmountCustomPicker[i];
                case 16:
                    return new PoolContributeWithNoteViewModel.InputNote[i];
                case 17:
                    return new PoolContributeWithNoteViewModel.Review[i];
                case 18:
                    return new StartPoolViewModel.Amount[i];
                case 19:
                    return new StartPoolViewModel.Error[i];
                case 20:
                    return new StartPoolViewModel.Name[i];
                case 21:
                    return new StartPoolViewModel.Submit[i];
                case 22:
                    return new StartPoolViewModel.Success[i];
                case 23:
                    return new PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen[i];
                case 24:
                    return new DeviceInfoHash[i];
                case 25:
                    return new DeviceManagerConfirmRemoveDevicesScreen[i];
                case 26:
                    return new DeviceManagerConfirmRemoveDevicesScreen.Result.Cancel[i];
                case 27:
                    return new DeviceManagerConfirmRemoveDevicesScreen.Result.Remove[i];
                case 28:
                    return new DeviceManagerDeviceDetailsScreen[i];
                default:
                    return new DeviceManagerDeviceRemovalFailedBottomSheetScreen[i];
            }
        }
    }

    public PdfScreen(Uri uri, String str) {
        uri.getClass();
        this.displayTitle = str;
        this.fileUri = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdfScreen)) {
            return false;
        }
        PdfScreen pdfScreen = (PdfScreen) obj;
        return Intrinsics.areEqual(this.displayTitle, pdfScreen.displayTitle) && Intrinsics.areEqual(this.fileUri, pdfScreen.fileUri);
    }

    public final int hashCode() {
        String str = this.displayTitle;
        return this.fileUri.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PdfScreen(displayTitle=" + this.displayTitle + ", fileUri=" + this.fileUri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.displayTitle);
        parcel.writeParcelable(this.fileUri, i);
    }
}
