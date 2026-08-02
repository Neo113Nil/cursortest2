package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalLoyaltySheet implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalLoyaltySheet> CREATOR = new Creator(0);
    public final String currentlySelectedRewardToken;
    public final AskedQuestion question;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel r27) {
            /*
                Method dump skipped, instructions count: 1462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.cash.local.screens.app.LocalLoyaltySheet.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalLoyaltySheet[i];
                case 1:
                    return new LocalAddBrandsScreen[i];
                case 2:
                    return new LocalBrandLocationCartScreen[i];
                case 3:
                    return new LocalBrandLocationCheckoutScreen[i];
                case 4:
                    return new LocalBrandLocationMenuScreen[i];
                case 5:
                    return new LocalBrandLocationOpenTabCheckoutScreen[i];
                case 6:
                    return new LocalBrandLocationOpenTabScreen[i];
                case 7:
                    return new LocalBrandProfileScreen[i];
                case 8:
                    return new LocalCashAllActivityScreen[i];
                case 9:
                    return new LocalCashBalanceScreen[i];
                case 10:
                    return new LocalCheckoutDeeplinkScreen[i];
                case 11:
                    return new LocalCurbsidePickupCarScreen[i];
                case 12:
                    return new LocalEditorialScreen[i];
                case 13:
                    return new LocalEducationalSheet[i];
                case 14:
                    return new LocalExplanatoryDialog[i];
                case 15:
                    return new LocalExplanatoryDialog.PositiveAction.Ok[i];
                case 16:
                    return new LocalExplanatoryDialog.PositiveAction.OpenSettings[i];
                case 17:
                    return new LocalFulfillmentPickerScreen[i];
                case 18:
                    return new LocalMarketingMessageScreen[i];
                case 19:
                    return new LocalMarketingMessagesScreen[i];
                case 20:
                    return new LocalMenuComboDetailsScreen[i];
                case 21:
                    return new LocalMenuComboDetailsScreen.Mode.Add[i];
                case 22:
                    return new LocalMenuComboDetailsScreen.Mode.Edit[i];
                case 23:
                    return new LocalMenuItemDetailsScreen.ComboData[i];
                case 24:
                    return new LocalMenuItemDetailsScreen[i];
                case 25:
                    return new LocalMenuItemDetailsScreen.Mode.Add[i];
                case 26:
                    return new LocalMenuItemDetailsScreen.Mode.EditFromCart[i];
                case 27:
                    return new LocalMenuItemDetailsScreen.Mode.Update[i];
                case 28:
                    return new LocalMenuPickerScreen[i];
                default:
                    return new LocalNeighborhoodsMapScreen[i];
            }
        }
    }

    public LocalLoyaltySheet(String str, AskedQuestion askedQuestion) {
        askedQuestion.getClass();
        this.currentlySelectedRewardToken = str;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalLoyaltySheet)) {
            return false;
        }
        LocalLoyaltySheet localLoyaltySheet = (LocalLoyaltySheet) obj;
        String str = localLoyaltySheet.currentlySelectedRewardToken;
        String str2 = this.currentlySelectedRewardToken;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        return areEqual && Intrinsics.areEqual(this.question, localLoyaltySheet.question);
    }

    public final int hashCode() {
        String str = this.currentlySelectedRewardToken;
        return this.question.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        String str = this.currentlySelectedRewardToken;
        return "LocalLoyaltySheet(currentlySelectedRewardToken=" + (str == null ? "null" : RewardToken.m1283toStringimpl(str)) + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.currentlySelectedRewardToken;
        parcel.writeParcelable(str != null ? new RewardToken(str) : null, i);
        parcel.writeParcelable(this.question, i);
    }
}
