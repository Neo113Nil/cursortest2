package com.squareup.cash.fileupload.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionResult$Positive;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.screens.FavoriteAdded;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfilePaymentHistory;
import com.squareup.cash.history.viewmodels.CancelPaymentResult$Negative;
import com.squareup.cash.history.viewmodels.CancelPaymentResult$Positive;
import com.squareup.cash.history.viewmodels.ReportAbuseResult;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeRequiredScreen;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeSuggestedScreen;
import com.squareup.cash.initialscreenloader.screens.GenericErrorScreen;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen$Result$Close;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen$Result$Retry;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class UriString implements Parcelable {
    public static final Parcelable.Creator<UriString> CREATOR = new Creator(0);
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    return new UriString(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return ContactPermissionResult$Positive.INSTANCE;
                case 2:
                    parcel.getClass();
                    return new SafetyHubScreens.SafetyEducationPageScreen((SafetyEducationPage) parcel.readParcelable(SafetyHubScreens.SafetyEducationPageScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new AddFavorites((UUID) parcel.readSerializable());
                case 4:
                    parcel.getClass();
                    return new FavoriteAdded(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(FavoriteAdded.class.getClassLoader()), (Color) parcel.readParcelable(FavoriteAdded.class.getClassLoader()), parcel.readInt() == 0 ? null : Character.valueOf((char) parcel.readInt()), parcel.readInt() != 0);
                case 5:
                    parcel.getClass();
                    return new FavoritesMessage(parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new ListFavorites((UUID) parcel.readSerializable());
                case 7:
                    parcel.getClass();
                    return new FidesmoDeprovisioningScreen((BlockersData) parcel.readParcelable(FidesmoDeprovisioningScreen.class.getClassLoader()), (FidesmoProvisioningBlocker) parcel.readParcelable(FidesmoDeprovisioningScreen.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new FidesmoProvisioningScreen((BlockersData) parcel.readParcelable(FidesmoProvisioningScreen.class.getClassLoader()), (FidesmoProvisioningBlocker) parcel.readParcelable(FidesmoProvisioningScreen.class.getClassLoader()), FidesmoFlowType.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    return new GenericTreeElementsScreen.GenericTreeElementsFullScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new GenericTreeElementsScreen.GenericTreeElementsSheet(parcel.readString(), parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new GlobalSearchScreen(SearchOrigin.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 12:
                    parcel.getClass();
                    return new GrowToolsCompleteActivityScreen((GrowToolsManagerScreen) parcel.readParcelable(GrowToolsCompleteActivityScreen.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    return new GrowToolsManagerScreen.ManageAutoInvestScreen(GrowToolsManagerScreen.Origin.valueOf(parcel.readString()));
                case 14:
                    parcel.getClass();
                    return new GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen(GrowToolsManagerScreen.Origin.valueOf(parcel.readString()));
                case 15:
                    parcel.getClass();
                    return new GrowToolsManagerScreen.ManageDirectDepositScreen(GrowToolsManagerScreen.Origin.valueOf(parcel.readString()));
                case 16:
                    parcel.getClass();
                    return new GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen(GrowToolsManagerScreen.Origin.valueOf(parcel.readString()));
                case 17:
                    parcel.getClass();
                    return new GrowToolsManagerScreen.ManageRoundUpsScreen(GrowToolsManagerScreen.Origin.valueOf(parcel.readString()));
                case 18:
                    parcel.getClass();
                    return new PaymentHistoryScreens$ProfileCompletePaymentHistory((Redacted) parcel.readParcelable(PaymentHistoryScreens$ProfileCompletePaymentHistory.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new PaymentHistoryScreens$ProfilePaymentHistory((Redacted) parcel.readParcelable(PaymentHistoryScreens$ProfilePaymentHistory.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return CancelPaymentResult$Negative.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return CancelPaymentResult$Positive.INSTANCE;
                case 22:
                    parcel.getClass();
                    return ReportAbuseResult.valueOf(parcel.readString());
                case 23:
                    parcel.getClass();
                    return new AppUpgradeRequiredScreen(parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    return new AppUpgradeSuggestedScreen(parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return GenericErrorScreen.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return InitiateSessionFailedScreen.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return InitiateSessionFailedScreen$Result$Close.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return InitiateSessionFailedScreen$Result$Retry.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return ScenarioPlanErrorScreen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new UriString[i];
                case 1:
                    return new ContactPermissionResult$Positive[i];
                case 2:
                    return new SafetyHubScreens.SafetyEducationPageScreen[i];
                case 3:
                    return new AddFavorites[i];
                case 4:
                    return new FavoriteAdded[i];
                case 5:
                    return new FavoritesMessage[i];
                case 6:
                    return new ListFavorites[i];
                case 7:
                    return new FidesmoDeprovisioningScreen[i];
                case 8:
                    return new FidesmoProvisioningScreen[i];
                case 9:
                    return new GenericTreeElementsScreen.GenericTreeElementsFullScreen[i];
                case 10:
                    return new GenericTreeElementsScreen.GenericTreeElementsSheet[i];
                case 11:
                    return new GlobalSearchScreen[i];
                case 12:
                    return new GrowToolsCompleteActivityScreen[i];
                case 13:
                    return new GrowToolsManagerScreen.ManageAutoInvestScreen[i];
                case 14:
                    return new GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen[i];
                case 15:
                    return new GrowToolsManagerScreen.ManageDirectDepositScreen[i];
                case 16:
                    return new GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen[i];
                case 17:
                    return new GrowToolsManagerScreen.ManageRoundUpsScreen[i];
                case 18:
                    return new PaymentHistoryScreens$ProfileCompletePaymentHistory[i];
                case 19:
                    return new PaymentHistoryScreens$ProfilePaymentHistory[i];
                case 20:
                    return new CancelPaymentResult$Negative[i];
                case 21:
                    return new CancelPaymentResult$Positive[i];
                case 22:
                    return new ReportAbuseResult[i];
                case 23:
                    return new AppUpgradeRequiredScreen[i];
                case 24:
                    return new AppUpgradeSuggestedScreen[i];
                case 25:
                    return new GenericErrorScreen[i];
                case 26:
                    return new InitiateSessionFailedScreen[i];
                case 27:
                    return new InitiateSessionFailedScreen$Result$Close[i];
                case 28:
                    return new InitiateSessionFailedScreen$Result$Retry[i];
                default:
                    return new ScenarioPlanErrorScreen[i];
            }
        }
    }

    public /* synthetic */ UriString(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UriString m3553boximpl(String str) {
        return new UriString(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3554toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UriString(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UriString) {
            return Intrinsics.areEqual(this.value, ((UriString) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m3554toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3555unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
