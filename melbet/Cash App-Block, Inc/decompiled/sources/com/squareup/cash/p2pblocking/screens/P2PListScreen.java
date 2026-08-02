package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.onboarding.screens.SelectedCountry;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.PasskeyUpsellBlocker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListScreen implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<P2PListScreen> CREATOR = new Creator(0);
    public final BlockingContext context;
    public final String forCustomerToken;
    public final P2PListData prefilledData;
    public final P2PScreenMode screenMode;

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
                    return new P2PListScreen(parcel.readString(), (P2PListData) parcel.readParcelable(P2PListScreen.class.getClassLoader()), (P2PScreenMode) parcel.readParcelable(P2PListScreen.class.getClassLoader()), parcel.readInt() != 0 ? BlockingContext.valueOf(parcel.readString()) : null);
                case 1:
                    parcel.getClass();
                    return new OnboardingLandingScreen((Screen) parcel.readParcelable(OnboardingLandingScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return new SelectedCountry(Country.valueOf(parcel.readString()));
                case 3:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (i != readInt) {
                        linkedHashSet.add(parcel.readString());
                        i++;
                    }
                    return new P2PAllowlistScreen(readString, readString2, valueOf, linkedHashSet, (Screen) parcel.readParcelable(P2PAllowlistScreen.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(P2PListData.AllowListData.class, parcel, arrayList, i, 1);
                    }
                    return new P2PListData.AllowListData(arrayList);
                case 5:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(P2PListData.BlockListData.class, parcel, arrayList2, i, 1);
                    }
                    return new P2PListData.BlockListData(arrayList2, parcel.readString());
                case 6:
                    parcel.getClass();
                    return new P2PScreenMode.AllowList(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return P2PScreenMode.BlockList.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new P2PSearchData.AllowSearchData((AllowlistSearchResponse) parcel.readParcelable(P2PSearchData.AllowSearchData.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new P2PSearchData.BlockSearchData((BlockSearchResponse) parcel.readParcelable(P2PSearchData.BlockSearchData.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new SelectCustomerScreen(parcel.readString(), parcel.readInt() != 0 ? BlockingContext.valueOf(parcel.readString()) : null, (Screen) parcel.readParcelable(SelectCustomerScreen.class.getClassLoader()), (P2PScreenMode) parcel.readParcelable(SelectCustomerScreen.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return PasskeyManagementScreen.INSTANCE;
                case 12:
                    parcel.getClass();
                    return new PasskeyUpsellScreen((BlockersData) parcel.readParcelable(PasskeyUpsellScreen.class.getClassLoader()), (PasskeyUpsellBlocker) parcel.readParcelable(PasskeyUpsellScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.BitcoinDestination.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.CashBalanceDestination.INSTANCE;
                case 15:
                    parcel.getClass();
                    return new AllocationDestination.InvestingDestination(parcel.readString(), parcel.readInt() != 0 ? AllocationDestination.InvestingDestination.UiSpecification.CREATOR.createFromParcel(parcel) : null);
                case 16:
                    parcel.getClass();
                    return new AllocationDestination.InvestingDestination.UiSpecification((Image) parcel.readParcelable(AllocationDestination.InvestingDestination.UiSpecification.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination((AllocationDestination.SavingsDestination.Identifier) parcel.readParcelable(AllocationDestination.SavingsDestination.class.getClassLoader()), parcel.readInt() != 0 ? AllocationDestination.SavingsDestination.UiSpecification.CREATOR.createFromParcel(parcel) : null);
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.SavingsDestination.Identifier.GeneralFolder.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination.Identifier.GoalFolder(parcel.readString());
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.SavingsDestination.Identifier.None.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination.UiSpecification(parcel.readString(), parcel.readString());
                case 22:
                    parcel.getClass();
                    return new BottomSheet(parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt4);
                    while (i != readInt4) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(EditDistributionConfiguration.DestinationUiConfiguration.CREATOR, parcel, arrayList3, i, 1);
                    }
                    return new EditDistributionConfiguration(arrayList3, parcel.readInt(), PaychecksAlertUi.CREATOR.createFromParcel(parcel), (Money) parcel.readParcelable(EditDistributionConfiguration.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new EditDistributionConfiguration.DestinationUiConfiguration((AllocationDestination) parcel.readParcelable(EditDistributionConfiguration.DestinationUiConfiguration.class.getClassLoader()), parcel.readLong(), (Color) parcel.readParcelable(EditDistributionConfiguration.DestinationUiConfiguration.class.getClassLoader()), parcel.readInt() != 0 ? EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                case 25:
                    parcel.getClass();
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button(EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.ButtonAction.valueOf(parcel.readString()), parcel.readString());
                case 26:
                    parcel.getClass();
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow((Image) parcel.readParcelable(EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 27:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior valueOf2 = EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.valueOf(parcel.readString());
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt5);
                    while (i != readInt5) {
                        arrayList4.add(Long.valueOf(parcel.readLong()));
                        i++;
                    }
                    Parcelable.Creator<EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button> creator = EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.CREATOR;
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements(readString3, readString4, valueOf2, arrayList4, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? BottomSheet.CREATOR.createFromParcel(parcel) : null);
                case 28:
                    parcel.getClass();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt6);
                    while (i != readInt6) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(PaycheckAllocationDistribution.DestinationAndShare.CREATOR, parcel, arrayList5, i, 1);
                    }
                    return new PaycheckAllocationDistribution(arrayList5);
                default:
                    parcel.getClass();
                    return new PaycheckAllocationDistribution.DestinationAndShare((AllocationDestination) parcel.readParcelable(PaycheckAllocationDistribution.DestinationAndShare.class.getClassLoader()), parcel.readLong());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new P2PListScreen[i];
                case 1:
                    return new OnboardingLandingScreen[i];
                case 2:
                    return new SelectedCountry[i];
                case 3:
                    return new P2PAllowlistScreen[i];
                case 4:
                    return new P2PListData.AllowListData[i];
                case 5:
                    return new P2PListData.BlockListData[i];
                case 6:
                    return new P2PScreenMode.AllowList[i];
                case 7:
                    return new P2PScreenMode.BlockList[i];
                case 8:
                    return new P2PSearchData.AllowSearchData[i];
                case 9:
                    return new P2PSearchData.BlockSearchData[i];
                case 10:
                    return new SelectCustomerScreen[i];
                case 11:
                    return new PasskeyManagementScreen[i];
                case 12:
                    return new PasskeyUpsellScreen[i];
                case 13:
                    return new AllocationDestination.BitcoinDestination[i];
                case 14:
                    return new AllocationDestination.CashBalanceDestination[i];
                case 15:
                    return new AllocationDestination.InvestingDestination[i];
                case 16:
                    return new AllocationDestination.InvestingDestination.UiSpecification[i];
                case 17:
                    return new AllocationDestination.SavingsDestination[i];
                case 18:
                    return new AllocationDestination.SavingsDestination.Identifier.GeneralFolder[i];
                case 19:
                    return new AllocationDestination.SavingsDestination.Identifier.GoalFolder[i];
                case 20:
                    return new AllocationDestination.SavingsDestination.Identifier.None[i];
                case 21:
                    return new AllocationDestination.SavingsDestination.UiSpecification[i];
                case 22:
                    return new BottomSheet[i];
                case 23:
                    return new EditDistributionConfiguration[i];
                case 24:
                    return new EditDistributionConfiguration.DestinationUiConfiguration[i];
                case 25:
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button[i];
                case 26:
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow[i];
                case 27:
                    return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements[i];
                case 28:
                    return new PaycheckAllocationDistribution[i];
                default:
                    return new PaycheckAllocationDistribution.DestinationAndShare[i];
            }
        }
    }

    public P2PListScreen(String str, P2PListData p2PListData, P2PScreenMode p2PScreenMode, BlockingContext blockingContext) {
        str.getClass();
        p2PScreenMode.getClass();
        this.forCustomerToken = str;
        this.prefilledData = p2PListData;
        this.screenMode = p2PScreenMode;
        this.context = blockingContext;
    }

    public static P2PListScreen copy$default(P2PListScreen p2PListScreen) {
        String str = p2PListScreen.forCustomerToken;
        P2PScreenMode p2PScreenMode = p2PListScreen.screenMode;
        BlockingContext blockingContext = p2PListScreen.context;
        p2PListScreen.getClass();
        str.getClass();
        p2PScreenMode.getClass();
        return new P2PListScreen(str, null, p2PScreenMode, blockingContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PListScreen)) {
            return false;
        }
        P2PListScreen p2PListScreen = (P2PListScreen) obj;
        return Intrinsics.areEqual(this.forCustomerToken, p2PListScreen.forCustomerToken) && Intrinsics.areEqual(this.prefilledData, p2PListScreen.prefilledData) && Intrinsics.areEqual(this.screenMode, p2PListScreen.screenMode) && this.context == p2PListScreen.context;
    }

    public final int hashCode() {
        int hashCode = this.forCustomerToken.hashCode() * 31;
        P2PListData p2PListData = this.prefilledData;
        int hashCode2 = (this.screenMode.hashCode() + ((hashCode + (p2PListData == null ? 0 : p2PListData.hashCode())) * 31)) * 31;
        BlockingContext blockingContext = this.context;
        return hashCode2 + (blockingContext != null ? blockingContext.hashCode() : 0);
    }

    public final String toString() {
        return "P2PListScreen(forCustomerToken=" + this.forCustomerToken + ", prefilledData=" + this.prefilledData + ", screenMode=" + this.screenMode + ", context=" + this.context + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.forCustomerToken);
        parcel.writeParcelable(this.prefilledData, i);
        parcel.writeParcelable(this.screenMode, i);
        BlockingContext blockingContext = this.context;
        if (blockingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blockingContext.name());
        }
    }
}
