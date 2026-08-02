package com.squareup.cash.shopping.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.shopping.screens.EntityInformation;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentAnalyticsParam;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.cash.stablecoin.screens.StablecoinScreens$StablecoinHome;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$InitializationError;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$Unknown;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ErrorScreen implements DialogScreen {
    public static final Parcelable.Creator<ErrorScreen> CREATOR = new Creator(0);
    public final String message;
    public final String title;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ErrorScreen(parcel.readString(), parcel.readString());
                case 1:
                    EntityInformation entityInformation = null;
                    parcel.getClass();
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        entityInformation = EntityInformation.CREATOR.createFromParcel(parcel);
                    }
                    return new ShoppingScreenContext.ThirdPartyOffer(readString, entityInformation);
                case 2:
                    parcel.getClass();
                    return new ShoppingWebScreen.AffiliateShoppingScreen(parcel.readString(), (ShoppingScreenContext) parcel.readParcelable(ShoppingWebScreen.AffiliateShoppingScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new ShoppingWebScreen.AfterPayShoppingScreen(parcel.readString(), (ShoppingScreenContext) parcel.readParcelable(ShoppingWebScreen.AfterPayShoppingScreen.class.getClassLoader()), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new ShoppingWebScreen.IncentiveShoppingScreen(parcel.readString(), (ShoppingScreenContext) parcel.readParcelable(ShoppingWebScreen.IncentiveShoppingScreen.class.getClassLoader()), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new ShoppingWebScreen.ShoppingWebScreenV2(parcel.readString(), parcel.readString(), (ShoppingScreenContext) parcel.readParcelable(ShoppingWebScreen.ShoppingWebScreenV2.class.getClassLoader()), (InAppBrowserMetadata.EntityInformation) parcel.readParcelable(ShoppingWebScreen.ShoppingWebScreenV2.class.getClassLoader()), (IabMetadata) parcel.readParcelable(ShoppingWebScreen.ShoppingWebScreenV2.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new ShoppingWebScreen.SingleUsePaymentShoppingScreen(parcel.readString(), (ShoppingScreenContext) parcel.readParcelable(ShoppingWebScreen.SingleUsePaymentShoppingScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckoutScreenType.ConnectionFailedWarning.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new CheckoutScreenType.CreditLimitExceededWarning(parcel.readString(), parcel.readString());
                case 9:
                    parcel.getClass();
                    return new CheckoutScreenType.LoanLimitReached((Money) parcel.readParcelable(CheckoutScreenType.LoanLimitReached.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new CheckoutScreenType.LoanLimitReachedError((Money) parcel.readParcelable(CheckoutScreenType.LoanLimitReachedError.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new CheckoutScreenType.MinimumSpendRestrictedWarning(parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckoutScreenType.NonEmptyCartWarning.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new CheckoutScreenType.OneTimeCardContext(parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new CheckoutScreenType.ReviewPlan(parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckoutScreenType.SpendingLimitReached.INSTANCE;
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckoutScreenType.SpendingLimitReachedError.INSTANCE;
                case 17:
                    parcel.getClass();
                    BrowserOrigin browserOrigin = null;
                    String readString2 = parcel.readString();
                    InfoContext valueOf = InfoContext.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        browserOrigin = BrowserOrigin.valueOf(parcel.readString());
                    }
                    return new SingleUsePaymentAnalyticsParam(browserOrigin, valueOf, readString2, parcel.readString(), parcel.readString());
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen(parcel.readString(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleUsePaymentAnalyticsParam.CREATOR.createFromParcel(parcel) : null);
                case 21:
                    parcel.getClass();
                    return new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen((CheckoutScreenType) parcel.readParcelable(SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.class.getClassLoader()), parcel.readString(), (ShoppingWebScreen.ShoppingWebScreenV2) parcel.readParcelable(SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.class.getClassLoader()), parcel.readInt() != 0 ? SingleUsePaymentAnalyticsParam.CREATOR.createFromParcel(parcel) : null);
                case 22:
                    parcel.getClass();
                    return new SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleUsePaymentAnalyticsParam.CREATOR.createFromParcel(parcel) : null);
                case 23:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    boolean z4 = false;
                    boolean z5 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z4 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                        z5 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                        z2 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z3 = z;
                    }
                    return new ProductSearchViewState(readString3, z4, z5, z2, z3);
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return StablecoinScreens$StablecoinHome.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return StripeLinkActivityResult.Canceled.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return StripeLinkActivityResult$Failure$InitializationError.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return StripeLinkActivityResult$Failure$Unknown.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return StripeLinkActivityResult.ManualLink.INSTANCE;
                default:
                    parcel.getClass();
                    return new StripeLinkActivityResult.Success(parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ErrorScreen[i];
                case 1:
                    return new ShoppingScreenContext.ThirdPartyOffer[i];
                case 2:
                    return new ShoppingWebScreen.AffiliateShoppingScreen[i];
                case 3:
                    return new ShoppingWebScreen.AfterPayShoppingScreen[i];
                case 4:
                    return new ShoppingWebScreen.IncentiveShoppingScreen[i];
                case 5:
                    return new ShoppingWebScreen.ShoppingWebScreenV2[i];
                case 6:
                    return new ShoppingWebScreen.SingleUsePaymentShoppingScreen[i];
                case 7:
                    return new CheckoutScreenType.ConnectionFailedWarning[i];
                case 8:
                    return new CheckoutScreenType.CreditLimitExceededWarning[i];
                case 9:
                    return new CheckoutScreenType.LoanLimitReached[i];
                case 10:
                    return new CheckoutScreenType.LoanLimitReachedError[i];
                case 11:
                    return new CheckoutScreenType.MinimumSpendRestrictedWarning[i];
                case 12:
                    return new CheckoutScreenType.NonEmptyCartWarning[i];
                case 13:
                    return new CheckoutScreenType.OneTimeCardContext[i];
                case 14:
                    return new CheckoutScreenType.ReviewPlan[i];
                case 15:
                    return new CheckoutScreenType.SpendingLimitReached[i];
                case 16:
                    return new CheckoutScreenType.SpendingLimitReachedError[i];
                case 17:
                    return new SingleUsePaymentAnalyticsParam[i];
                case 18:
                    return new SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen[i];
                case 19:
                    return new SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen[i];
                case 20:
                    return new SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen[i];
                case 21:
                    return new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen[i];
                case 22:
                    return new SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen[i];
                case 23:
                    return new ProductSearchViewState[i];
                case 24:
                    return new StablecoinScreens$StablecoinHome[i];
                case 25:
                    return new StripeLinkActivityResult.Canceled[i];
                case 26:
                    return new StripeLinkActivityResult$Failure$InitializationError[i];
                case 27:
                    return new StripeLinkActivityResult$Failure$Unknown[i];
                case 28:
                    return new StripeLinkActivityResult.ManualLink[i];
                default:
                    return new StripeLinkActivityResult.Success[i];
            }
        }
    }

    public ErrorScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorScreen)) {
            return false;
        }
        ErrorScreen errorScreen = (ErrorScreen) obj;
        return Intrinsics.areEqual(this.title, errorScreen.title) && Intrinsics.areEqual(this.message, errorScreen.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ErrorScreen(title=", this.title, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
    }
}
