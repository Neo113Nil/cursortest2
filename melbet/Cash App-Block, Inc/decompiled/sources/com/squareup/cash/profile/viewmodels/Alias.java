package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.promotions.PromotionsSourceScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.ProfileUnavailableScreen;
import com.squareup.cash.profile.screens.ReferralStatusPresentationArgs$RewardInfo;
import com.squareup.cash.profile.screens.SearchVisibilityScreen;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutResult;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.CashQrShortcutsOnboardingSheet;
import com.squareup.cash.qrcodes.screens.CashtagQrScanQuestion;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RewardStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Alias implements Parcelable {
    public static final Parcelable.Creator<Alias> CREATOR = new Creator(0);
    public final boolean isChecked;
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AccountSwitchAccountViewSwitcher.Entrypoint entrypoint;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Alias(parcel.readString(), parcel.readInt() != 0);
                case 1:
                    parcel.getClass();
                    return new ProfileScreens.ProfileScreen.Customer.CashCustomer.MerchantData(parcel.readString());
                case 2:
                    parcel.getClass();
                    return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail((Redacted) parcel.readParcelable(ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail.class.getClassLoader()), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber((Redacted) parcel.readParcelable(ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber.class.getClassLoader()), parcel.readString());
                case 4:
                    parcel.getClass();
                    SuggestionStrategy valueOf = parcel.readInt() == 0 ? null : SuggestionStrategy.valueOf(parcel.readString());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString3 = parcel.readString();
                    Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString6 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt);
                        for (int i = 0; i != readInt; i++) {
                            linkedHashMap.put(parcel.readString(), parcel.readString());
                        }
                    }
                    return new ProfileScreens.ProfileScreen.ProfileAnalytics(valueOf, readString, readString2, valueOf2, valueOf3, valueOf4, readString3, valueOf5, readString4, readString5, valueOf6, readString6, linkedHashMap, (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : ContactStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new ProfileScreens.ReferralStatusScreen(ReferralStatusPresentationArgs$RewardInfo.CREATOR.createFromParcel(parcel));
                case 6:
                    ArrayList arrayList = null;
                    Uri uri = (Uri) NavAction$$ExternalSyntheticOutline0.m(parcel, ProfileScreens.RingtoneScreen.class);
                    boolean z2 = parcel.readInt() != 0;
                    boolean z3 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        int readInt2 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt2);
                        int i2 = 0;
                        while (i2 != readInt2) {
                            i2 = CameraState$Type$EnumUnboxingLocalUtility.m(ProfileScreens.RingtoneScreen.class, parcel, arrayList2, i2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new ProfileScreens.RingtoneScreen(uri, arrayList, z2, z3);
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return ProfileScreens.SecurityLockScreen.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new ProfileScreens.SecurityScreen(parcel.readInt() == 0 ? null : ProfileScreens.SecurityScreen.Section.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return ProfileScreens.TaxesPasswordScreen.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    Parcelable.Creator<ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration> creator = ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration.CREATOR;
                    ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration createFromParcel = creator.createFromParcel(parcel);
                    ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration createFromParcel2 = creator.createFromParcel(parcel);
                    AccountSwitchAccountViewSwitcher.Entrypoint valueOf7 = AccountSwitchAccountViewSwitcher.Entrypoint.valueOf(parcel.readString());
                    Screen screen = (Screen) parcel.readParcelable(ProfileScreens.UnsupportedSettingScreen.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                        entrypoint = valueOf7;
                    } else {
                        entrypoint = valueOf7;
                        z = false;
                    }
                    return new ProfileScreens.UnsupportedSettingScreen(createFromParcel, createFromParcel2, entrypoint, screen, z);
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return ProfileUnavailableScreen.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new ReferralStatusPresentationArgs$RewardInfo(parcel.readInt(), parcel.readInt(), (Money) parcel.readParcelable(ReferralStatusPresentationArgs$RewardInfo.class.getClassLoader()), parcel.readInt() != 0 ? RewardStatus.Expiration.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return SearchVisibilityScreen.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return Accessory.AddButton.INSTANCE;
                case 16:
                    parcel.getClass();
                    return new Accessory.Toggle(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                case 17:
                    parcel.getClass();
                    return AddressSheetResponse.valueOf(parcel.readString());
                case 18:
                    parcel.getClass();
                    return AliasItem.valueOf(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new Channel(ChannelType.valueOf(parcel.readString()), (Accessory) parcel.readParcelable(Channel.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return ProfileConfirmSignOutResult.Negative.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return ProfileConfirmSignOutResult.Positive.INSTANCE;
                case 22:
                    parcel.getClass();
                    return ProfileHeaderMenuSheetResult.valueOf(parcel.readString());
                case 23:
                    parcel.getClass();
                    return new RingtoneItem(parcel.readInt(), (Uri) parcel.readParcelable(RingtoneItem.class.getClassLoader()), (Uri) parcel.readParcelable(RingtoneItem.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new RingtoneResult((Uri) parcel.readParcelable(RingtoneResult.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new SponsoredAccount(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new PromotionsReferralsScreen$PromotionsReferralsHomeScreen(PromotionsSourceScreen.valueOf(parcel.readString()));
                case 27:
                    parcel.getClass();
                    return new CashQrCodeScanner((Screen) parcel.readParcelable(CashQrCodeScanner.class.getClassLoader()), parcel.readInt() != 0);
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return CashQrShortcutsOnboardingSheet.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return CashtagQrScanQuestion.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Alias[i];
                case 1:
                    return new ProfileScreens.ProfileScreen.Customer.CashCustomer.MerchantData[i];
                case 2:
                    return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail[i];
                case 3:
                    return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber[i];
                case 4:
                    return new ProfileScreens.ProfileScreen.ProfileAnalytics[i];
                case 5:
                    return new ProfileScreens.ReferralStatusScreen[i];
                case 6:
                    return new ProfileScreens.RingtoneScreen[i];
                case 7:
                    return new ProfileScreens.SecurityLockScreen[i];
                case 8:
                    return new ProfileScreens.SecurityScreen[i];
                case 9:
                    return new ProfileScreens.TaxesPasswordScreen[i];
                case 10:
                    return new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration[i];
                case 11:
                    return new ProfileScreens.UnsupportedSettingScreen[i];
                case 12:
                    return new ProfileUnavailableScreen[i];
                case 13:
                    return new ReferralStatusPresentationArgs$RewardInfo[i];
                case 14:
                    return new SearchVisibilityScreen[i];
                case 15:
                    return new Accessory.AddButton[i];
                case 16:
                    return new Accessory.Toggle[i];
                case 17:
                    return new AddressSheetResponse[i];
                case 18:
                    return new AliasItem[i];
                case 19:
                    return new Channel[i];
                case 20:
                    return new ProfileConfirmSignOutResult.Negative[i];
                case 21:
                    return new ProfileConfirmSignOutResult.Positive[i];
                case 22:
                    return new ProfileHeaderMenuSheetResult[i];
                case 23:
                    return new RingtoneItem[i];
                case 24:
                    return new RingtoneResult[i];
                case 25:
                    return new SponsoredAccount[i];
                case 26:
                    return new PromotionsReferralsScreen$PromotionsReferralsHomeScreen[i];
                case 27:
                    return new CashQrCodeScanner[i];
                case 28:
                    return new CashQrShortcutsOnboardingSheet[i];
                default:
                    return new CashtagQrScanQuestion[i];
            }
        }
    }

    public Alias(String str, boolean z) {
        str.getClass();
        this.value = str;
        this.isChecked = z;
    }

    public static Alias copy$default(Alias alias, boolean z) {
        String str = alias.value;
        alias.getClass();
        str.getClass();
        return new Alias(str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alias)) {
            return false;
        }
        Alias alias = (Alias) obj;
        return Intrinsics.areEqual(this.value, alias.value) && this.isChecked == alias.isChecked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isChecked) + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("Alias(value=", this.value, ", isChecked=", ")", this.isChecked);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
        parcel.writeInt(this.isChecked ? 1 : 0);
    }
}
