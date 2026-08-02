package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationResult;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlInfo;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Enabled;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Gone;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$InitialLoading;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectContactMethodScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionResult$Negative;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FamilyHome implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<FamilyHome> CREATOR = new Creator(0);
    public final Screen exitScreen;
    public final FamilyAccountsParameters familyAccountsParameters;
    public final String highlightedDependentToken;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            DependentControlInfo dependentControlInfo;
            boolean z2;
            boolean z3 = true;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new FamilyHome((FamilyAccountsParameters) parcel.readParcelable(FamilyHome.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(FamilyHome.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new DependentControlScreen.Toggle(ControlType.valueOf(parcel.readString()), parcel.readString());
                case 2:
                    boolean z4 = false;
                    parcel.getClass();
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    return new DependentControlsAndLimitsScreen(readString, z4);
                case 3:
                    parcel.getClass();
                    return new DependentDetailIntroductionDialog((Image) parcel.readParcelable(DependentDetailIntroductionDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new DependentDetailScreen(parcel.readString());
                case 5:
                    parcel.getClass();
                    return new DependentGeneralSavingsScreen(parcel.readString(), (SavingsScreen.ScreenType) parcel.readParcelable(DependentGeneralSavingsScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new DependentTeenQrCodeShareSheetScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new FamilyPendingRequestsScreen((PendingRequestsParams) parcel.readParcelable(FamilyPendingRequestsScreen.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new ManagedAccountTransferLoadingScreen(ManagedAccountTransferScreen.TransferType.valueOf(parcel.readString()), (Money) parcel.readParcelable(ManagedAccountTransferLoadingScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), (Screen) parcel.readParcelable(ManagedAccountTransferLoadingScreen.class.getClassLoader()));
                case 9:
                    boolean z5 = false;
                    parcel.getClass();
                    ManagedAccountTransferScreen.TransferType valueOf = ManagedAccountTransferScreen.TransferType.valueOf(parcel.readString());
                    Money money = (Money) parcel.readParcelable(ManagedAccountTransferScreen.class.getClassLoader());
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    return new ManagedAccountTransferScreen(valueOf, money, readString2, z5);
                case 10:
                    parcel.getClass();
                    return new SetDependentCustomLimitErrorScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new SetDependentCustomLimitScreen(parcel.readString(), (SetDependentCustomLimitScreen.LimitCategory) parcel.readParcelable(SetDependentCustomLimitScreen.class.getClassLoader()), ControlType.valueOf(parcel.readString()));
                case 12:
                    int i = 0;
                    parcel.getClass();
                    CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency valueOf2 = CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.valueOf(parcel.readString());
                    Money money2 = (Money) parcel.readParcelable(SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin.class.getClassLoader());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (true) {
                        long readLong = parcel.readLong();
                        if (i == readInt) {
                            return new SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin(valueOf2, money2, arrayList, readLong);
                        }
                        arrayList.add(Long.valueOf(readLong));
                        i++;
                    }
                case 13:
                    int i2 = 0;
                    parcel.getClass();
                    CustomerLimit.Frequency valueOf3 = CustomerLimit.Frequency.valueOf(parcel.readString());
                    Money money3 = (Money) parcel.readParcelable(SetDependentCustomLimitScreen.LimitCategory.BuyStock.class.getClassLoader());
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (true) {
                        long readLong2 = parcel.readLong();
                        if (i2 == readInt2) {
                            return new SetDependentCustomLimitScreen.LimitCategory.BuyStock(valueOf3, money3, arrayList2, readLong2);
                        }
                        arrayList2.add(Long.valueOf(readLong2));
                        i2++;
                    }
                case 14:
                    int i3 = 0;
                    Money money4 = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, SetDependentCustomLimitScreen.LimitCategory.CashCardSpend.class);
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (true) {
                        long readLong3 = parcel.readLong();
                        if (i3 == readInt3) {
                            return new SetDependentCustomLimitScreen.LimitCategory.CashCardSpend(money4, arrayList3, readLong3, parcel.readString());
                        }
                        arrayList3.add(Long.valueOf(readLong3));
                        i3++;
                    }
                case 15:
                    int i4 = 0;
                    Money money5 = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, SetDependentCustomLimitScreen.LimitCategory.P2PSend.class);
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    while (true) {
                        long readLong4 = parcel.readLong();
                        if (i4 == readInt4) {
                            return new SetDependentCustomLimitScreen.LimitCategory.P2PSend(money5, arrayList4, readLong4, parcel.readString());
                        }
                        arrayList4.add(Long.valueOf(readLong4));
                        i4++;
                    }
                case 16:
                    parcel.getClass();
                    return new SponsorDetailScreen((Sponsor) parcel.readParcelable(SponsorDetailScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new SponsorLedInviteScreen((Sponsor) parcel.readParcelable(SponsorLedInviteScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return SponsorResourcesScreen.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new ControlDisablingConfirmationResult.Negative((Money) parcel.readParcelable(ControlDisablingConfirmationResult.Negative.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new ControlDisablingConfirmationResult.Positive((Money) parcel.readParcelable(ControlDisablingConfirmationResult.Positive.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    return DependentControlInfo.valueOf(parcel.readString());
                case 22:
                    parcel.getClass();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z3 = false;
                    }
                    String readString3 = parcel.readString();
                    boolean z6 = z;
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    DependentControlInfo createFromParcel = parcel.readInt() == 0 ? null : DependentControlInfo.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z2 = z6;
                        dependentControlInfo = createFromParcel;
                    } else {
                        dependentControlInfo = createFromParcel;
                        z2 = false;
                    }
                    return new DependentControlRowState$Enabled(z3, readString3, readString4, readString5, dependentControlInfo, z2);
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return DependentControlRowState$Gone.INSTANCE;
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return DependentControlRowState$InitialLoading.INSTANCE;
                case 25:
                    parcel.getClass();
                    return new ContactPermissionDialogScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 26:
                    parcel.getClass();
                    return new SelectContactMethodScreen((BlockersData) parcel.readParcelable(SelectContactMethodScreen.class.getClassLoader()), (Recipient) parcel.readParcelable(SelectContactMethodScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 27:
                    parcel.getClass();
                    return new SelectSponsorErrorScreen((BlockersData) parcel.readParcelable(SelectSponsorErrorScreen.class.getClassLoader()), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new SponsorSelectionDetailsScreen((BlockersData) parcel.readParcelable(SponsorSelectionDetailsScreen.class.getClassLoader()), (SponsorSelectionDetailsBlocker) parcel.readParcelable(SponsorSelectionDetailsScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return ContactPermissionResult$Negative.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new FamilyHome[i];
                case 1:
                    return new DependentControlScreen.Toggle[i];
                case 2:
                    return new DependentControlsAndLimitsScreen[i];
                case 3:
                    return new DependentDetailIntroductionDialog[i];
                case 4:
                    return new DependentDetailScreen[i];
                case 5:
                    return new DependentGeneralSavingsScreen[i];
                case 6:
                    return new DependentTeenQrCodeShareSheetScreen[i];
                case 7:
                    return new FamilyPendingRequestsScreen[i];
                case 8:
                    return new ManagedAccountTransferLoadingScreen[i];
                case 9:
                    return new ManagedAccountTransferScreen[i];
                case 10:
                    return new SetDependentCustomLimitErrorScreen[i];
                case 11:
                    return new SetDependentCustomLimitScreen[i];
                case 12:
                    return new SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin[i];
                case 13:
                    return new SetDependentCustomLimitScreen.LimitCategory.BuyStock[i];
                case 14:
                    return new SetDependentCustomLimitScreen.LimitCategory.CashCardSpend[i];
                case 15:
                    return new SetDependentCustomLimitScreen.LimitCategory.P2PSend[i];
                case 16:
                    return new SponsorDetailScreen[i];
                case 17:
                    return new SponsorLedInviteScreen[i];
                case 18:
                    return new SponsorResourcesScreen[i];
                case 19:
                    return new ControlDisablingConfirmationResult.Negative[i];
                case 20:
                    return new ControlDisablingConfirmationResult.Positive[i];
                case 21:
                    return new DependentControlInfo[i];
                case 22:
                    return new DependentControlRowState$Enabled[i];
                case 23:
                    return new DependentControlRowState$Gone[i];
                case 24:
                    return new DependentControlRowState$InitialLoading[i];
                case 25:
                    return new ContactPermissionDialogScreen[i];
                case 26:
                    return new SelectContactMethodScreen[i];
                case 27:
                    return new SelectSponsorErrorScreen[i];
                case 28:
                    return new SponsorSelectionDetailsScreen[i];
                default:
                    return new ContactPermissionResult$Negative[i];
            }
        }
    }

    public /* synthetic */ FamilyHome(FamilyAccountsParameters familyAccountsParameters, String str, Screen screen, int i) {
        this((i & 1) != 0 ? null : familyAccountsParameters, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : screen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyHome)) {
            return false;
        }
        FamilyHome familyHome = (FamilyHome) obj;
        return Intrinsics.areEqual(this.familyAccountsParameters, familyHome.familyAccountsParameters) && Intrinsics.areEqual(this.highlightedDependentToken, familyHome.highlightedDependentToken) && Intrinsics.areEqual(this.exitScreen, familyHome.exitScreen);
    }

    public final int hashCode() {
        FamilyAccountsParameters familyAccountsParameters = this.familyAccountsParameters;
        int hashCode = (familyAccountsParameters == null ? 0 : familyAccountsParameters.hashCode()) * 31;
        String str = this.highlightedDependentToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Screen screen = this.exitScreen;
        return hashCode2 + (screen != null ? screen.hashCode() : 0);
    }

    public final String toString() {
        return "FamilyHome(familyAccountsParameters=" + this.familyAccountsParameters + ", highlightedDependentToken=" + this.highlightedDependentToken + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.familyAccountsParameters, i);
        parcel.writeString(this.highlightedDependentToken);
        parcel.writeParcelable(this.exitScreen, i);
    }

    public FamilyHome(FamilyAccountsParameters familyAccountsParameters, String str, Screen screen) {
        this.familyAccountsParameters = familyAccountsParameters;
        this.highlightedDependentToken = str;
        this.exitScreen = screen;
    }
}
