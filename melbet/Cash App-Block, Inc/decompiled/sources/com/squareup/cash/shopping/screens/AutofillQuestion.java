package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.MerchantBoostContext;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$Filter;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes7.dex */
public final class AutofillQuestion implements Question {
    public static final Parcelable.Creator<AutofillQuestion> CREATOR = new Creator(0);
    public final AutofillType autofillType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AutofillType {
        public static final /* synthetic */ AutofillType[] $VALUES;
        public static final AutofillType OFFER;
        public static final AutofillType OFFER_WITH_CARD;
        public static final AutofillType SAVE;
        public static final AutofillType UPDATE;

        static {
            AutofillType autofillType = new AutofillType("SAVE", 0);
            SAVE = autofillType;
            AutofillType autofillType2 = new AutofillType("UPDATE", 1);
            UPDATE = autofillType2;
            AutofillType autofillType3 = new AutofillType("OFFER", 2);
            OFFER = autofillType3;
            AutofillType autofillType4 = new AutofillType("OFFER_WITH_CARD", 3);
            OFFER_WITH_CARD = autofillType4;
            $VALUES = new AutofillType[]{autofillType, autofillType2, autofillType3, autofillType4};
        }

        public static AutofillType valueOf(String str) {
            return (AutofillType) Enum.valueOf(AutofillType.class, str);
        }

        public static AutofillType[] values() {
            return (AutofillType[]) $VALUES.clone();
        }
    }

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
                    return new AutofillQuestion(AutofillType.valueOf(parcel.readString()));
                case 1:
                    parcel.getClass();
                    return new AutofillScreen.UpdateAutofillScreen((Redacted) parcel.readParcelable(AutofillScreen.UpdateAutofillScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? AutofillAnalyticsParam.CREATOR.createFromParcel(parcel) : null, (AskedQuestion) parcel.readParcelable(AutofillScreen.UpdateAutofillScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new EditAutofillScreen((AskedQuestion) parcel.readParcelable(EditAutofillScreen.class.getClassLoader()), (Screen) parcel.readParcelable(EditAutofillScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AutofillAnalyticsParam.CREATOR.createFromParcel(parcel), (FullName) parcel.readParcelable(EditAutofillScreen.class.getClassLoader()), parcel.readString(), (Phone) parcel.readParcelable(EditAutofillScreen.class.getClassLoader()), (GlobalAddress) parcel.readParcelable(EditAutofillScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new CashAppPayIncentiveScreen$IncentivePromptSheetScreen((ShoppingScreenContext) parcel.readParcelable(CashAppPayIncentiveScreen$IncentivePromptSheetScreen.class.getClassLoader()), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog((ShoppingScreenContext) parcel.readParcelable(CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return ContinueWithCashAppPaySheetResult.valueOf(parcel.readString());
                case 6:
                    parcel.getClass();
                    return new EntityInformation(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? EntityType.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new IabMetadata.AffiliateBoostMetadata((RewardAmount) parcel.readParcelable(IabMetadata.AffiliateBoostMetadata.class.getClassLoader()), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new IabMetadata.AfterpayMetadata(parcel.readInt());
                case 9:
                    parcel.getClass();
                    return new IabMetadata.CashPayMetadata((RewardAmount) parcel.readParcelable(IabMetadata.CashPayMetadata.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new IabMetadata.SUPMetadata(parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new MerchantBoostContext.MerchantProfileBoost(parcel.readString());
                case 12:
                    parcel.getClass();
                    return new MerchantBoostContext.MerchantProfileDiscover(parcel.readString());
                case 13:
                    parcel.getClass();
                    return new ShoppingInfoSheetScreen.AfterPayInfoSheetScreen((ShoppingScreenContext) parcel.readParcelable(ShoppingInfoSheetScreen.AfterPayInfoSheetScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen((ShoppingScreenContext) parcel.readParcelable(ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new ShoppingScreen$BrandsSearchScreen((ShoppingScreenContext) parcel.readParcelable(ShoppingScreen$BrandsSearchScreen.class.getClassLoader()), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new ShoppingScreen$Filter.PriceRange(parcel.readString(), new IntRange(parcel.readInt(), parcel.readInt(), 1));
                case 17:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i2 = 0; i2 != readInt; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new ShoppingScreen$Filter.Selections(readString, linkedHashSet);
                case 18:
                    parcel.getClass();
                    return new ShoppingScreen$Filter.Toggle(parcel.readString(), parcel.readInt() != 0);
                case 19:
                    ShoppingScreenContext shoppingScreenContext = (ShoppingScreenContext) NavAction$$ExternalSyntheticOutline0.m(parcel, ShoppingScreen$ProductSearchScreen.class);
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(ShoppingScreen$ProductSearchScreen.class, parcel, arrayList, i, 1);
                    }
                    return new ShoppingScreen$ProductSearchScreen(shoppingScreenContext, readString2, arrayList);
                case 20:
                    parcel.getClass();
                    return new ShoppingScreen$RestrictedItemWarningSheetScreen((ShoppingScreenContext) parcel.readParcelable(ShoppingScreen$RestrictedItemWarningSheetScreen.class.getClassLoader()), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new ShoppingScreenContext.BrandsSearch(parcel.readString());
                case 22:
                    parcel.getClass();
                    return new ShoppingScreenContext.CardTab(parcel.readString(), parcel.readInt() != 0 ? EntityInformation.CREATOR.createFromParcel(parcel) : null);
                case 23:
                    parcel.getClass();
                    return new ShoppingScreenContext.Directory(parcel.readString(), parcel.readInt() != 0 ? EntityInformation.CREATOR.createFromParcel(parcel) : null);
                case 24:
                    parcel.getClass();
                    return new ShoppingScreenContext.DirectorySearch(parcel.readString(), parcel.readInt() != 0 ? EntityInformation.CREATOR.createFromParcel(parcel) : null);
                case 25:
                    parcel.getClass();
                    return new ShoppingScreenContext.DiscoverBnplCarousel(parcel.readString(), parcel.readString(), parcel.readString(), BrowserOrigin.valueOf(parcel.readString()));
                case 26:
                    parcel.getClass();
                    return new ShoppingScreenContext.MerchantProfile(parcel.readString(), (MerchantBoostContext) parcel.readParcelable(ShoppingScreenContext.MerchantProfile.class.getClassLoader()), parcel.readInt() != 0 ? EntityInformation.CREATOR.createFromParcel(parcel) : null);
                case 27:
                    parcel.getClass();
                    return new ShoppingScreenContext.OffersTab((Screen) parcel.readParcelable(ShoppingScreenContext.OffersTab.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new ShoppingScreenContext.OffersTimelineSheet((Screen) parcel.readParcelable(ShoppingScreenContext.OffersTimelineSheet.class.getClassLoader()), parcel.readString());
                default:
                    parcel.getClass();
                    return new ShoppingScreenContext.ProductSearch((ShoppingScreenContext) parcel.readParcelable(ShoppingScreenContext.ProductSearch.class.getClassLoader()), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new AutofillQuestion[i];
                case 1:
                    return new AutofillScreen.UpdateAutofillScreen[i];
                case 2:
                    return new EditAutofillScreen[i];
                case 3:
                    return new CashAppPayIncentiveScreen$IncentivePromptSheetScreen[i];
                case 4:
                    return new CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog[i];
                case 5:
                    return new ContinueWithCashAppPaySheetResult[i];
                case 6:
                    return new EntityInformation[i];
                case 7:
                    return new IabMetadata.AffiliateBoostMetadata[i];
                case 8:
                    return new IabMetadata.AfterpayMetadata[i];
                case 9:
                    return new IabMetadata.CashPayMetadata[i];
                case 10:
                    return new IabMetadata.SUPMetadata[i];
                case 11:
                    return new MerchantBoostContext.MerchantProfileBoost[i];
                case 12:
                    return new MerchantBoostContext.MerchantProfileDiscover[i];
                case 13:
                    return new ShoppingInfoSheetScreen.AfterPayInfoSheetScreen[i];
                case 14:
                    return new ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen[i];
                case 15:
                    return new ShoppingScreen$BrandsSearchScreen[i];
                case 16:
                    return new ShoppingScreen$Filter.PriceRange[i];
                case 17:
                    return new ShoppingScreen$Filter.Selections[i];
                case 18:
                    return new ShoppingScreen$Filter.Toggle[i];
                case 19:
                    return new ShoppingScreen$ProductSearchScreen[i];
                case 20:
                    return new ShoppingScreen$RestrictedItemWarningSheetScreen[i];
                case 21:
                    return new ShoppingScreenContext.BrandsSearch[i];
                case 22:
                    return new ShoppingScreenContext.CardTab[i];
                case 23:
                    return new ShoppingScreenContext.Directory[i];
                case 24:
                    return new ShoppingScreenContext.DirectorySearch[i];
                case 25:
                    return new ShoppingScreenContext.DiscoverBnplCarousel[i];
                case 26:
                    return new ShoppingScreenContext.MerchantProfile[i];
                case 27:
                    return new ShoppingScreenContext.OffersTab[i];
                case 28:
                    return new ShoppingScreenContext.OffersTimelineSheet[i];
                default:
                    return new ShoppingScreenContext.ProductSearch[i];
            }
        }
    }

    /* loaded from: classes6.dex */
    public abstract class Result {

        public final class AutofillConfirmed extends Result {
            public static final AutofillConfirmed INSTANCE = new AutofillConfirmed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AutofillConfirmed);
            }

            public final int hashCode() {
                return -405942057;
            }

            public final String toString() {
                return "AutofillConfirmed";
            }
        }

        public final class AutofillDismissed extends Result {
            public static final AutofillDismissed INSTANCE = new AutofillDismissed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AutofillDismissed);
            }

            public final int hashCode() {
                return 557634081;
            }

            public final String toString() {
                return "AutofillDismissed";
            }
        }

        public final class EditAutofillConfirmed extends Result {
            public final ShippingAddress shippingAddress;

            public EditAutofillConfirmed(ShippingAddress shippingAddress) {
                shippingAddress.getClass();
                this.shippingAddress = shippingAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditAutofillConfirmed) && Intrinsics.areEqual(this.shippingAddress, ((EditAutofillConfirmed) obj).shippingAddress);
            }

            public final int hashCode() {
                return this.shippingAddress.hashCode();
            }

            public final String toString() {
                return "EditAutofillConfirmed(shippingAddress=" + this.shippingAddress + ")";
            }
        }

        public final class EditAutofillDismissed extends Result {
            public static final EditAutofillDismissed INSTANCE = new EditAutofillDismissed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof EditAutofillDismissed);
            }

            public final int hashCode() {
                return 479110199;
            }

            public final String toString() {
                return "EditAutofillDismissed";
            }
        }
    }

    public AutofillQuestion(AutofillType autofillType) {
        autofillType.getClass();
        this.autofillType = autofillType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutofillQuestion) && this.autofillType == ((AutofillQuestion) obj).autofillType;
    }

    public final int hashCode() {
        return this.autofillType.hashCode();
    }

    public final String toString() {
        return "AutofillQuestion(autofillType=" + this.autofillType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.autofillType.name());
    }
}
