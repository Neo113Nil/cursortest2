package com.squareup.cash.nearby.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.nearby.screens.NearbyOrderedListsScreen;
import com.squareup.cash.nfc.screens.NfcNotAvailableScreen;
import com.squareup.cash.offers.backend.api.OffersAnalyticsState;
import com.squareup.cash.offers.screens.OffersFilterGroupSheetResult;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.offers.screens.SheetStyle;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerErrorScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Cancel;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Remove;
import com.squareup.cash.onboarding.screens.CountrySelectorScreen;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AccountListConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ListSection implements Parcelable {
    public static final Parcelable.Creator<ListSection> CREATOR = new Creator(0);
    public final String description;
    public final List items;
    public final String title;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            OfferSheetKey offerSheetKey;
            Screen screen;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ListSection(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                case 1:
                    int i = 0;
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(NearbyOrderedListsScreen.class, parcel, arrayList, i, 1);
                    }
                    return new NearbyOrderedListsScreen(readString, readString2, arrayList);
                case 2:
                    parcel.getClass();
                    return new NfcNotAvailableScreen((Screen) parcel.readParcelable(NfcNotAvailableScreen.class.getClassLoader()), (Screen) parcel.readParcelable(NfcNotAvailableScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                    }
                    return new OffersAnalyticsState(linkedHashSet);
                case 4:
                    parcel.getClass();
                    return new OffersFilterGroupSheetResult(parcel.readInt(), parcel.readString());
                case 5:
                    parcel.getClass();
                    OfferSheetKey offerSheetKey2 = (OfferSheetKey) parcel.readParcelable(OffersScreen$OffersDetailsScreen.class.getClassLoader());
                    Screen screen2 = (Screen) parcel.readParcelable(OffersScreen$OffersDetailsScreen.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                        offerSheetKey = offerSheetKey2;
                        screen = screen2;
                    } else {
                        offerSheetKey = offerSheetKey2;
                        screen = screen2;
                        z = false;
                    }
                    return new OffersScreen$OffersDetailsScreen(offerSheetKey, screen, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BlockersData.MoneybotContext) parcel.readParcelable(OffersScreen$OffersDetailsScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new OffersScreen$OffersDetailsScreenV2(parcel.readString(), (BlockersData.MoneybotContext) parcel.readParcelable(OffersScreen$OffersDetailsScreenV2.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    return new OffersScreen$OffersFilterGroupSheetScreen(parcel.readInt(), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new OffersScreen$OffersFullscreenCollectionScreen(parcel.readString());
                case 9:
                    parcel.getClass();
                    return new OffersScreen$OffersGreenStatusScreen(parcel.readString());
                case 10:
                    parcel.getClass();
                    return new OffersScreen$OffersHomeScreen((UUID) parcel.readSerializable(), parcel.readInt() != 0 ? OffersScreen$OffersHomeScreen.OriginInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                case 11:
                    parcel.getClass();
                    return new OffersScreen$OffersHomeScreen.OriginInfo(parcel.readInt() != 0 ? Origin.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0);
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return OffersScreen$OffersHomeScreenV2.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new OffersScreen$OffersNotificationScreen(parcel.readString(), parcel.readLong());
                case 14:
                    parcel.getClass();
                    return new OffersScreen$OffersRedemptionScreen((SheetStyle) parcel.readParcelable(OffersScreen$OffersRedemptionScreen.class.getClassLoader()), InfoContext.valueOf(parcel.readString()), parcel.readInt() != 0 ? BrowserOrigin.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    return new OffersScreen$OffersTimelineScreen((OfferSheetKey) parcel.readParcelable(OffersScreen$OffersTimelineScreen.class.getClassLoader()), (Screen) parcel.readParcelable(OffersScreen$OffersTimelineScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new OffersScreen$OffersTimelineScreenV2((Screen) parcel.readParcelable(OffersScreen$OffersTimelineScreenV2.class.getClassLoader()), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new SheetStyle.AffiliateSheet(parcel.readString());
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return SheetStyle.AfterPaySheet.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new SheetStyle.IncentiveSheet(parcel.readString());
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return SheetStyle.SUPSheet.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new OnboardingAccountPickerErrorScreen(parcel.readString());
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return OnboardingAccountPickerOptionsMenuScreen.INSTANCE;
                case 23:
                    parcel.getClass();
                    return OnboardingAccountPickerOptionsMenuScreen.Result.valueOf(parcel.readString());
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return OnboardingAccountPickerScreen.INSTANCE;
                case 25:
                    parcel.getClass();
                    return new OnboardingAliasPickerScreen((AccountListConfig.Account) parcel.readParcelable(OnboardingAliasPickerScreen.class.getClassLoader()), ClientScenario.valueOf(parcel.readString()));
                case 26:
                    parcel.getClass();
                    return new OnboardingConfirmAccountRemovalScreen((AccountListConfig.Account) parcel.readParcelable(OnboardingConfirmAccountRemovalScreen.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new OnboardingConfirmAccountRemovalScreen$Result$Cancel((AccountListConfig.Account) parcel.readParcelable(OnboardingConfirmAccountRemovalScreen$Result$Cancel.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new OnboardingConfirmAccountRemovalScreen$Result$Remove((AccountListConfig.Account) parcel.readParcelable(OnboardingConfirmAccountRemovalScreen$Result$Remove.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new CountrySelectorScreen(parcel.readInt() != 0 ? Country.valueOf(parcel.readString()) : null);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ListSection[i];
                case 1:
                    return new NearbyOrderedListsScreen[i];
                case 2:
                    return new NfcNotAvailableScreen[i];
                case 3:
                    return new OffersAnalyticsState[i];
                case 4:
                    return new OffersFilterGroupSheetResult[i];
                case 5:
                    return new OffersScreen$OffersDetailsScreen[i];
                case 6:
                    return new OffersScreen$OffersDetailsScreenV2[i];
                case 7:
                    return new OffersScreen$OffersFilterGroupSheetScreen[i];
                case 8:
                    return new OffersScreen$OffersFullscreenCollectionScreen[i];
                case 9:
                    return new OffersScreen$OffersGreenStatusScreen[i];
                case 10:
                    return new OffersScreen$OffersHomeScreen[i];
                case 11:
                    return new OffersScreen$OffersHomeScreen.OriginInfo[i];
                case 12:
                    return new OffersScreen$OffersHomeScreenV2[i];
                case 13:
                    return new OffersScreen$OffersNotificationScreen[i];
                case 14:
                    return new OffersScreen$OffersRedemptionScreen[i];
                case 15:
                    return new OffersScreen$OffersTimelineScreen[i];
                case 16:
                    return new OffersScreen$OffersTimelineScreenV2[i];
                case 17:
                    return new SheetStyle.AffiliateSheet[i];
                case 18:
                    return new SheetStyle.AfterPaySheet[i];
                case 19:
                    return new SheetStyle.IncentiveSheet[i];
                case 20:
                    return new SheetStyle.SUPSheet[i];
                case 21:
                    return new OnboardingAccountPickerErrorScreen[i];
                case 22:
                    return new OnboardingAccountPickerOptionsMenuScreen[i];
                case 23:
                    return new OnboardingAccountPickerOptionsMenuScreen.Result[i];
                case 24:
                    return new OnboardingAccountPickerScreen[i];
                case 25:
                    return new OnboardingAliasPickerScreen[i];
                case 26:
                    return new OnboardingConfirmAccountRemovalScreen[i];
                case 27:
                    return new OnboardingConfirmAccountRemovalScreen$Result$Cancel[i];
                case 28:
                    return new OnboardingConfirmAccountRemovalScreen$Result$Remove[i];
                default:
                    return new CountrySelectorScreen[i];
            }
        }
    }

    public ListSection(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.description = str2;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListSection)) {
            return false;
        }
        ListSection listSection = (ListSection) obj;
        return Intrinsics.areEqual(this.title, listSection.title) && Intrinsics.areEqual(this.description, listSection.description) && Intrinsics.areEqual(this.items, listSection.items);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        return this.items.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ListSection(title=", this.title, ", description=", this.description, ", items="), this.items, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeStringList(this.items);
    }

    public /* synthetic */ ListSection(List list) {
        this("", null, list);
    }
}
