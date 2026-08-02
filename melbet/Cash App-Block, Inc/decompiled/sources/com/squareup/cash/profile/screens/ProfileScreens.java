package com.squareup.cash.profile.screens;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.notificationssettings.AliasType;
import com.squareup.cash.cdf.notificationssettings.ConfirmationSheetOrigin;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.ui.BlockState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ProfileScreens implements Screen {

    public final class AccountInfoScreen extends ProfileScreens {
        public static final AccountInfoScreen INSTANCE = new AccountInfoScreen();
        public static final Parcelable.Creator<AccountInfoScreen> CREATOR = new CropScreen.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class AccountSwitchInfoDialogScreen extends ProfileDialogScreens {
        public static final Parcelable.Creator<AccountSwitchInfoDialogScreen> CREATOR = new CropScreen.Creator(3);
        public final String confirmationButtonText;
        public final String subtitle;
        public final String title;

        public AccountSwitchInfoDialogScreen(String str, String str2, String str3) {
            str2.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.confirmationButtonText = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountSwitchInfoDialogScreen)) {
                return false;
            }
            AccountSwitchInfoDialogScreen accountSwitchInfoDialogScreen = (AccountSwitchInfoDialogScreen) obj;
            return Intrinsics.areEqual(this.title, accountSwitchInfoDialogScreen.title) && Intrinsics.areEqual(this.subtitle, accountSwitchInfoDialogScreen.subtitle) && Intrinsics.areEqual(this.confirmationButtonText, accountSwitchInfoDialogScreen.confirmationButtonText);
        }

        public final int hashCode() {
            String str = this.title;
            return this.confirmationButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.subtitle);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitchInfoDialogScreen(title=", this.title, ", subtitle=", this.subtitle, ", confirmationButtonText="), this.confirmationButtonText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.confirmationButtonText);
        }
    }

    public final class AddAliasScreen extends ProfileBottomSheets {
        public static final AddAliasScreen INSTANCE = new AddAliasScreen();
        public static final Parcelable.Creator<AddAliasScreen> CREATOR = new CropScreen.Creator(4);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class AdjustableThresholdScreen extends ProfileBottomSheets {
        public static final Parcelable.Creator<AdjustableThresholdScreen> CREATOR = new CropScreen.Creator(5);
        public final Redacted accountToken;
        public final int currentValue;
        public final int maxValue;
        public final int minValue;
        public final NotificationCategory notificationCategory;
        public final Integer version;

        public AdjustableThresholdScreen(Integer num, NotificationCategory notificationCategory, int i, int i2, int i3, Redacted redacted) {
            notificationCategory.getClass();
            redacted.getClass();
            this.version = num;
            this.notificationCategory = notificationCategory;
            this.currentValue = i;
            this.minValue = i2;
            this.maxValue = i3;
            this.accountToken = redacted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdjustableThresholdScreen)) {
                return false;
            }
            AdjustableThresholdScreen adjustableThresholdScreen = (AdjustableThresholdScreen) obj;
            return Intrinsics.areEqual(this.version, adjustableThresholdScreen.version) && this.notificationCategory == adjustableThresholdScreen.notificationCategory && this.currentValue == adjustableThresholdScreen.currentValue && this.minValue == adjustableThresholdScreen.minValue && this.maxValue == adjustableThresholdScreen.maxValue && Intrinsics.areEqual(this.accountToken, adjustableThresholdScreen.accountToken);
        }

        public final int hashCode() {
            Integer num = this.version;
            return this.accountToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxValue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minValue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentValue, (this.notificationCategory.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdjustableThresholdScreen(version=");
            sb.append(this.version);
            sb.append(", notificationCategory=");
            sb.append(this.notificationCategory);
            sb.append(", currentValue=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.currentValue, this.minValue, ", minValue=", ", maxValue=", sb);
            sb.append(this.maxValue);
            sb.append(", accountToken=");
            sb.append(this.accountToken);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.version;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.notificationCategory.name());
            parcel.writeInt(this.currentValue);
            parcel.writeInt(this.minValue);
            parcel.writeInt(this.maxValue);
            parcel.writeParcelable(this.accountToken, i);
        }
    }

    public final class AppMessagesOptions extends ProfileScreens {
        public static final AppMessagesOptions INSTANCE = new AppMessagesOptions();
        public static final Parcelable.Creator<AppMessagesOptions> CREATOR = new CropScreen.Creator(6);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class CategoryListScreen extends ProfileScreens {
        public static final Parcelable.Creator<CategoryListScreen> CREATOR = new CropScreen.Creator(7);
        public final CategoryListType categoryListType;
        public final String ownerAccountToken;
        public final String title;

        public CategoryListScreen(String str, CategoryListType categoryListType, String str2) {
            categoryListType.getClass();
            str2.getClass();
            this.title = str;
            this.categoryListType = categoryListType;
            this.ownerAccountToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryListScreen)) {
                return false;
            }
            CategoryListScreen categoryListScreen = (CategoryListScreen) obj;
            return Intrinsics.areEqual(this.title, categoryListScreen.title) && this.categoryListType == categoryListScreen.categoryListType && Intrinsics.areEqual(this.ownerAccountToken, categoryListScreen.ownerAccountToken);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = str == null ? 0 : str.hashCode();
            return this.ownerAccountToken.hashCode() + ((this.categoryListType.hashCode() + (hashCode * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CategoryListScreen(title=");
            sb.append(this.title);
            sb.append(", categoryListType=");
            sb.append(this.categoryListType);
            sb.append(", ownerAccountToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ownerAccountToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.categoryListType.name());
            parcel.writeString(this.ownerAccountToken);
        }
    }

    public final class ChannelListScreen extends ProfileScreens {
        public static final Parcelable.Creator<ChannelListScreen> CREATOR = new CropScreen.Creator(8);
        public final NotificationCategory categoryType;
        public final String ownerAccountToken;

        public ChannelListScreen(NotificationCategory notificationCategory, String str) {
            notificationCategory.getClass();
            str.getClass();
            this.categoryType = notificationCategory;
            this.ownerAccountToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChannelListScreen)) {
                return false;
            }
            ChannelListScreen channelListScreen = (ChannelListScreen) obj;
            return this.categoryType == channelListScreen.categoryType && Intrinsics.areEqual(this.ownerAccountToken, channelListScreen.ownerAccountToken);
        }

        public final int hashCode() {
            return this.ownerAccountToken.hashCode() + (this.categoryType.hashCode() * 31);
        }

        public final String toString() {
            return "ChannelListScreen(categoryType=" + this.categoryType + ", ownerAccountToken=" + this.ownerAccountToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.categoryType.name());
            parcel.writeString(this.ownerAccountToken);
        }
    }

    public final class ConfirmRemoveAliasScreen extends ProfileScreens implements DialogScreen {
        public static final Parcelable.Creator<ConfirmRemoveAliasScreen> CREATOR = new CropScreen.Creator(9);
        public final Redacted text;

        /* renamed from: type, reason: collision with root package name */
        public final UiAlias.Type f1189type;
        public final boolean verified;

        public ConfirmRemoveAliasScreen(UiAlias.Type type2, Redacted redacted, boolean z) {
            type2.getClass();
            redacted.getClass();
            this.f1189type = type2;
            this.text = redacted;
            this.verified = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmRemoveAliasScreen)) {
                return false;
            }
            ConfirmRemoveAliasScreen confirmRemoveAliasScreen = (ConfirmRemoveAliasScreen) obj;
            return this.f1189type == confirmRemoveAliasScreen.f1189type && Intrinsics.areEqual(this.text, confirmRemoveAliasScreen.text) && this.verified == confirmRemoveAliasScreen.verified;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.verified) + re$$ExternalSyntheticOutline0.m(this.text, this.f1189type.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmRemoveAliasScreen(type=");
            sb.append(this.f1189type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", verified=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.verified, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f1189type.name());
            parcel.writeParcelable(this.text, i);
            parcel.writeInt(this.verified ? 1 : 0);
        }
    }

    public final class ConfirmReplaceInfoSheet extends ProfileBottomSheets {
        public static final Parcelable.Creator<ConfirmReplaceInfoSheet> CREATOR = new CropScreen.Creator(10);
        public final Redacted infoText;

        /* renamed from: type, reason: collision with root package name */
        public final InfoType f1190type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class InfoType implements Parcelable {
            public static final /* synthetic */ InfoType[] $VALUES = {new InfoType("Name", 0), new InfoType("Email", 1), new InfoType("PhoneNumber", 2), new InfoType("Address", 3)};
            public static final Parcelable.Creator<InfoType> CREATOR = new CropScreen.Creator(11);

            /* JADX INFO: Fake field, exist only in values array */
            InfoType EF5;

            public static InfoType valueOf(String str) {
                return (InfoType) Enum.valueOf(InfoType.class, str);
            }

            public static InfoType[] values() {
                return (InfoType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        public ConfirmReplaceInfoSheet(Redacted redacted, InfoType infoType) {
            redacted.getClass();
            infoType.getClass();
            this.infoText = redacted;
            this.f1190type = infoType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmReplaceInfoSheet)) {
                return false;
            }
            ConfirmReplaceInfoSheet confirmReplaceInfoSheet = (ConfirmReplaceInfoSheet) obj;
            return Intrinsics.areEqual(this.infoText, confirmReplaceInfoSheet.infoText) && this.f1190type == confirmReplaceInfoSheet.f1190type;
        }

        public final int hashCode() {
            return this.f1190type.hashCode() + (this.infoText.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmReplaceInfoSheet(infoText=" + this.infoText + ", type=" + this.f1190type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.infoText, i);
            this.f1190type.writeToParcel(parcel, i);
        }
    }

    public final class ConfirmSignOutScreen extends ProfileScreens implements DialogScreen {
        public static final ConfirmSignOutScreen INSTANCE = new ConfirmSignOutScreen();
        public static final Parcelable.Creator<ConfirmSignOutScreen> CREATOR = new CropScreen.Creator(12);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ContactMethodDetailsScreen extends ProfileScreens {
        public static final Parcelable.Creator<ContactMethodDetailsScreen> CREATOR = new CropScreen.Creator(13);
        public final UiAlias.Type aliasType;
        public final Redacted aliases;
        public final String body;
        public final String title;

        public ContactMethodDetailsScreen(String str, String str2, Redacted redacted, UiAlias.Type type2) {
            str.getClass();
            str2.getClass();
            redacted.getClass();
            type2.getClass();
            this.title = str;
            this.body = str2;
            this.aliases = redacted;
            this.aliasType = type2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactMethodDetailsScreen)) {
                return false;
            }
            ContactMethodDetailsScreen contactMethodDetailsScreen = (ContactMethodDetailsScreen) obj;
            return Intrinsics.areEqual(this.title, contactMethodDetailsScreen.title) && Intrinsics.areEqual(this.body, contactMethodDetailsScreen.body) && Intrinsics.areEqual(this.aliases, contactMethodDetailsScreen.aliases) && this.aliasType == contactMethodDetailsScreen.aliasType;
        }

        public final int hashCode() {
            return this.aliasType.hashCode() + re$$ExternalSyntheticOutline0.m(this.aliases, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactMethodDetailsScreen(title=", this.title, ", body=", this.body, ", aliases=");
            m.append(this.aliases);
            m.append(", aliasType=");
            m.append(this.aliasType);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeParcelable(this.aliases, i);
            parcel.writeString(this.aliasType.name());
        }
    }

    public final class CropScreen extends ProfileDialogScreens {
        public static final Parcelable.Creator<CropScreen> CREATOR = new Creator(0);
        public final String photoUri;

        /* loaded from: classes6.dex */
        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean valueOf = null;
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        return new CropScreen(parcel.readString());
                    case 1:
                        parcel.getClass();
                        parcel.readInt();
                        return PersonalInfoConfirmationDialogScreen.INSTANCE;
                    case 2:
                        parcel.getClass();
                        parcel.readInt();
                        return AccountInfoScreen.INSTANCE;
                    case 3:
                        parcel.getClass();
                        return new AccountSwitchInfoDialogScreen(parcel.readString(), parcel.readString(), parcel.readString());
                    case 4:
                        parcel.getClass();
                        parcel.readInt();
                        return AddAliasScreen.INSTANCE;
                    case 5:
                        parcel.getClass();
                        return new AdjustableThresholdScreen(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, NotificationCategory.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Redacted) parcel.readParcelable(AdjustableThresholdScreen.class.getClassLoader()));
                    case 6:
                        parcel.getClass();
                        parcel.readInt();
                        return AppMessagesOptions.INSTANCE;
                    case 7:
                        parcel.getClass();
                        return new CategoryListScreen(parcel.readString(), CategoryListType.valueOf(parcel.readString()), parcel.readString());
                    case 8:
                        parcel.getClass();
                        return new ChannelListScreen(NotificationCategory.valueOf(parcel.readString()), parcel.readString());
                    case 9:
                        parcel.getClass();
                        return new ConfirmRemoveAliasScreen(UiAlias.Type.valueOf(parcel.readString()), (Redacted) parcel.readParcelable(ConfirmRemoveAliasScreen.class.getClassLoader()), parcel.readInt() != 0);
                    case 10:
                        parcel.getClass();
                        return new ConfirmReplaceInfoSheet((Redacted) parcel.readParcelable(ConfirmReplaceInfoSheet.class.getClassLoader()), ConfirmReplaceInfoSheet.InfoType.CREATOR.createFromParcel(parcel));
                    case 11:
                        parcel.getClass();
                        return ConfirmReplaceInfoSheet.InfoType.valueOf(parcel.readString());
                    case 12:
                        parcel.getClass();
                        parcel.readInt();
                        return ConfirmSignOutScreen.INSTANCE;
                    case 13:
                        parcel.getClass();
                        return new ContactMethodDetailsScreen(parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(ContactMethodDetailsScreen.class.getClassLoader()), UiAlias.Type.valueOf(parcel.readString()));
                    case 14:
                        parcel.getClass();
                        return new EnableAliasSheetScreen(parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(EnableAliasSheetScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(EnableAliasSheetScreen.class.getClassLoader()), ConfirmationSheetOrigin.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AliasType.valueOf(parcel.readString()), parcel.readInt() != 0 ? NotificationCategory.valueOf(parcel.readString()) : null);
                    case 15:
                        parcel.getClass();
                        return new ErrorScreen(parcel.readString(), parcel.readString(), (ColorModel) parcel.readParcelable(ErrorScreen.class.getClassLoader()), parcel.readInt() != 0);
                    case 16:
                        parcel.getClass();
                        parcel.readInt();
                        return FamilyEligibilityLoadingScreen.INSTANCE;
                    case 17:
                        parcel.getClass();
                        return new GenericProfileElementsSection((ProfileScreen.Customer) parcel.readParcelable(GenericProfileElementsSection.class.getClassLoader()), parcel.readInt() != 0 ? GenericProfileElementsSection.ExtraPaymentInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                    case 18:
                        parcel.getClass();
                        return new GenericProfileElementsSection.ExtraPaymentInfo((UUID) parcel.readSerializable(), GetProfileDetailsContext.valueOf(parcel.readString()), CustomerProfileViewOpen.EntryPoint.valueOf(parcel.readString()), (Screen) parcel.readParcelable(GenericProfileElementsSection.ExtraPaymentInfo.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? ProfileScreen.ProfileAnalytics.CREATOR.createFromParcel(parcel) : null);
                    case 19:
                        parcel.getClass();
                        return new HeaderMenuScreen(parcel.readInt() != 0);
                    case 20:
                        parcel.getClass();
                        parcel.readInt();
                        return IncomingRequestsScreen.INSTANCE;
                    case 21:
                        parcel.getClass();
                        parcel.readInt();
                        return NotificationsScreen.INSTANCE;
                    case 22:
                        parcel.getClass();
                        parcel.readInt();
                        return PaymentNotificationOptions.INSTANCE;
                    case 23:
                        parcel.getClass();
                        parcel.readInt();
                        return PrivacyScreen.INSTANCE;
                    case 24:
                        parcel.getClass();
                        return new ProfileAddressSheet((GlobalAddress) parcel.readParcelable(ProfileAddressSheet.class.getClassLoader()));
                    case 25:
                        parcel.getClass();
                        parcel.readInt();
                        return ProfilePreview.INSTANCE;
                    case 26:
                        parcel.getClass();
                        return new ProfileScreen.Action(ProfileScreen.Action.ActionType.valueOf(parcel.readString()), parcel.readParcelable(ProfileScreen.Action.class.getClassLoader()));
                    case 27:
                        parcel.getClass();
                        return new ProfileScreen((ProfileScreen.Customer) parcel.readParcelable(ProfileScreen.class.getClassLoader()), ProfileScreen.Action.CREATOR.createFromParcel(parcel), ProfileScreen.BackNavigationAction.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), GetProfileDetailsContext.valueOf(parcel.readString()), CustomerProfileViewOpen.EntryPoint.valueOf(parcel.readString()), (Screen) parcel.readParcelable(ProfileScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? ProfileScreen.ProfileAnalytics.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (BlockersData.MoneybotContext) parcel.readParcelable(ProfileScreen.class.getClassLoader()));
                    case 28:
                        parcel.getClass();
                        Redacted redacted = (Redacted) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Redacted redacted2 = (Redacted) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Redacted redacted3 = (Redacted) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Redacted redacted4 = (Redacted) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Image image = (Image) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Color color = (Color) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.CashCustomerData.class.getClassLoader());
                        Region valueOf2 = parcel.readInt() == 0 ? null : Region.valueOf(parcel.readString());
                        boolean z = parcel.readInt() != 0;
                        boolean z2 = parcel.readInt() != 0;
                        boolean z3 = parcel.readInt() != 0;
                        boolean z4 = parcel.readInt() != 0;
                        Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                        BlockState valueOf4 = parcel.readInt() == 0 ? null : BlockState.valueOf(parcel.readString());
                        String readString = parcel.readString();
                        boolean z5 = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            valueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new ProfileScreen.Customer.CashCustomer.CashCustomerData(redacted, redacted2, redacted3, redacted4, image, color, valueOf2, z, z2, z3, z4, valueOf3, valueOf4, readString, z5, valueOf);
                    default:
                        parcel.getClass();
                        return new ProfileScreen.Customer.CashCustomer((Redacted) parcel.readParcelable(ProfileScreen.Customer.CashCustomer.class.getClassLoader()), parcel.readInt() == 0 ? null : ProfileScreen.Customer.CashCustomer.CashCustomerData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? ProfileScreen.Customer.CashCustomer.MerchantData.CREATOR.createFromParcel(parcel) : null);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new CropScreen[i];
                    case 1:
                        return new PersonalInfoConfirmationDialogScreen[i];
                    case 2:
                        return new AccountInfoScreen[i];
                    case 3:
                        return new AccountSwitchInfoDialogScreen[i];
                    case 4:
                        return new AddAliasScreen[i];
                    case 5:
                        return new AdjustableThresholdScreen[i];
                    case 6:
                        return new AppMessagesOptions[i];
                    case 7:
                        return new CategoryListScreen[i];
                    case 8:
                        return new ChannelListScreen[i];
                    case 9:
                        return new ConfirmRemoveAliasScreen[i];
                    case 10:
                        return new ConfirmReplaceInfoSheet[i];
                    case 11:
                        return new ConfirmReplaceInfoSheet.InfoType[i];
                    case 12:
                        return new ConfirmSignOutScreen[i];
                    case 13:
                        return new ContactMethodDetailsScreen[i];
                    case 14:
                        return new EnableAliasSheetScreen[i];
                    case 15:
                        return new ErrorScreen[i];
                    case 16:
                        return new FamilyEligibilityLoadingScreen[i];
                    case 17:
                        return new GenericProfileElementsSection[i];
                    case 18:
                        return new GenericProfileElementsSection.ExtraPaymentInfo[i];
                    case 19:
                        return new HeaderMenuScreen[i];
                    case 20:
                        return new IncomingRequestsScreen[i];
                    case 21:
                        return new NotificationsScreen[i];
                    case 22:
                        return new PaymentNotificationOptions[i];
                    case 23:
                        return new PrivacyScreen[i];
                    case 24:
                        return new ProfileAddressSheet[i];
                    case 25:
                        return new ProfilePreview[i];
                    case 26:
                        return new ProfileScreen.Action[i];
                    case 27:
                        return new ProfileScreen[i];
                    case 28:
                        return new ProfileScreen.Customer.CashCustomer.CashCustomerData[i];
                    default:
                        return new ProfileScreen.Customer.CashCustomer[i];
                }
            }
        }

        public CropScreen(String str) {
            str.getClass();
            this.photoUri = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CropScreen) && Intrinsics.areEqual(this.photoUri, ((CropScreen) obj).photoUri);
        }

        public final int hashCode() {
            return this.photoUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CropScreen(photoUri=", this.photoUri, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.photoUri);
        }
    }

    public final class FamilyEligibilityLoadingScreen extends ProfileScreens implements NeverInBackStackScreen {
        public static final FamilyEligibilityLoadingScreen INSTANCE = new FamilyEligibilityLoadingScreen();
        public static final Parcelable.Creator<FamilyEligibilityLoadingScreen> CREATOR = new CropScreen.Creator(16);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class HeaderMenuScreen extends ProfileBottomSheets {
        public static final Parcelable.Creator<HeaderMenuScreen> CREATOR = new CropScreen.Creator(19);
        public final boolean showClear;

        public HeaderMenuScreen(boolean z) {
            this.showClear = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderMenuScreen) && this.showClear == ((HeaderMenuScreen) obj).showClear;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showClear);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("HeaderMenuScreen(showClear=", ")", this.showClear);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.showClear ? 1 : 0);
        }
    }

    public final class IncomingRequestsScreen extends ProfileScreens {
        public static final IncomingRequestsScreen INSTANCE = new IncomingRequestsScreen();
        public static final Parcelable.Creator<IncomingRequestsScreen> CREATOR = new CropScreen.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class NotificationsScreen extends ProfileScreens {
        public static final NotificationsScreen INSTANCE = new NotificationsScreen();
        public static final Parcelable.Creator<NotificationsScreen> CREATOR = new CropScreen.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class PaymentNotificationOptions extends ProfileScreens {
        public static final PaymentNotificationOptions INSTANCE = new PaymentNotificationOptions();
        public static final Parcelable.Creator<PaymentNotificationOptions> CREATOR = new CropScreen.Creator(22);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class PrivacyScreen extends ProfileScreens {
        public static final PrivacyScreen INSTANCE = new PrivacyScreen();
        public static final Parcelable.Creator<PrivacyScreen> CREATOR = new CropScreen.Creator(23);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ProfileAddressSheet extends ProfileBottomSheets {
        public static final Parcelable.Creator<ProfileAddressSheet> CREATOR = new CropScreen.Creator(24);
        public final GlobalAddress address;

        public ProfileAddressSheet(GlobalAddress globalAddress) {
            globalAddress.getClass();
            this.address = globalAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileAddressSheet) && Intrinsics.areEqual(this.address, ((ProfileAddressSheet) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return "ProfileAddressSheet(address=" + this.address + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.address, i);
        }
    }

    public abstract class ProfileBottomSheets extends ProfileScreens implements BottomSheetScreen {
    }

    public abstract class ProfileDialogScreens extends ProfileScreens implements DialogScreen {
    }

    /* loaded from: classes6.dex */
    public final class ProfilePreview extends ProfileScreens {
        public static final ProfilePreview INSTANCE = new ProfilePreview();
        public static final Parcelable.Creator<ProfilePreview> CREATOR = new CropScreen.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ReferralStatusScreen extends ProfileScreens {
        public static final Parcelable.Creator<ReferralStatusScreen> CREATOR = new Alias.Creator(5);
        public final ReferralStatusPresentationArgs$RewardInfo rewardInfo;

        public ReferralStatusScreen(ReferralStatusPresentationArgs$RewardInfo referralStatusPresentationArgs$RewardInfo) {
            referralStatusPresentationArgs$RewardInfo.getClass();
            this.rewardInfo = referralStatusPresentationArgs$RewardInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReferralStatusScreen) && Intrinsics.areEqual(this.rewardInfo, ((ReferralStatusScreen) obj).rewardInfo);
        }

        public final int hashCode() {
            return this.rewardInfo.hashCode();
        }

        public final String toString() {
            return "ReferralStatusScreen(rewardInfo=" + this.rewardInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.rewardInfo.writeToParcel(parcel, i);
        }
    }

    public final class RingtoneScreen extends ProfileDialogScreens {
        public static final Parcelable.Creator<RingtoneScreen> CREATOR = new Alias.Creator(6);
        public final List additionalItems;
        public final Uri currentRingtone;
        public final boolean showDefault;
        public final boolean showSilent;

        public RingtoneScreen(Uri uri, List list, boolean z, boolean z2) {
            this.currentRingtone = uri;
            this.showDefault = z;
            this.showSilent = z2;
            this.additionalItems = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RingtoneScreen)) {
                return false;
            }
            RingtoneScreen ringtoneScreen = (RingtoneScreen) obj;
            return Intrinsics.areEqual(this.currentRingtone, ringtoneScreen.currentRingtone) && this.showDefault == ringtoneScreen.showDefault && this.showSilent == ringtoneScreen.showSilent && Intrinsics.areEqual(this.additionalItems, ringtoneScreen.additionalItems);
        }

        public final int hashCode() {
            Uri uri = this.currentRingtone;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uri == null ? 0 : uri.hashCode()) * 31, 31, this.showDefault), 31, this.showSilent);
            List list = this.additionalItems;
            return m + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "RingtoneScreen(currentRingtone=" + this.currentRingtone + ", showDefault=" + this.showDefault + ", showSilent=" + this.showSilent + ", additionalItems=" + this.additionalItems + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.currentRingtone, i);
            parcel.writeInt(this.showDefault ? 1 : 0);
            parcel.writeInt(this.showSilent ? 1 : 0);
            List list = this.additionalItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public final class SecurityLockScreen extends ProfileScreens {
        public static final SecurityLockScreen INSTANCE = new SecurityLockScreen();
        public static final Parcelable.Creator<SecurityLockScreen> CREATOR = new Alias.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class SecurityScreen extends ProfileScreens {
        public static final Parcelable.Creator<SecurityScreen> CREATOR = new Alias.Creator(8);
        public final Section focusSection;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class Section {
            public static final /* synthetic */ Section[] $VALUES;
            public static final Section INVESTING;
            public static final Section SECURITY;
            public static final Section TAXES;

            static {
                Section section = new Section("SECURITY", 0);
                SECURITY = section;
                Section section2 = new Section("CASHTAG", 1);
                Section section3 = new Section("REQUESTS", 2);
                Section section4 = new Section("INVESTING", 3);
                INVESTING = section4;
                Section section5 = new Section("TAXES", 4);
                TAXES = section5;
                $VALUES = new Section[]{section, section2, section3, section4, section5};
            }

            public static Section valueOf(String str) {
                return (Section) Enum.valueOf(Section.class, str);
            }

            public static Section[] values() {
                return (Section[]) $VALUES.clone();
            }
        }

        public SecurityScreen(Section section) {
            this.focusSection = section;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecurityScreen) && this.focusSection == ((SecurityScreen) obj).focusSection;
        }

        public final int hashCode() {
            Section section = this.focusSection;
            if (section == null) {
                return 0;
            }
            return section.hashCode();
        }

        public final String toString() {
            return "SecurityScreen(focusSection=" + this.focusSection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Section section = this.focusSection;
            if (section == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(section.name());
            }
        }
    }

    public final class TaxesPasswordScreen extends ProfileScreens {
        public static final TaxesPasswordScreen INSTANCE = new TaxesPasswordScreen();
        public static final Parcelable.Creator<TaxesPasswordScreen> CREATOR = new Alias.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class UnsupportedSettingScreen extends ProfileScreens {
        public static final Parcelable.Creator<UnsupportedSettingScreen> CREATOR = new Alias.Creator(11);
        public final AccountTypeSpecificConfiguration businessAccountConfiguration;
        public final AccountSwitchAccountViewSwitcher.Entrypoint entrypoint;
        public final Screen exitScreen;
        public final AccountTypeSpecificConfiguration personalAccountConfiguration;
        public final boolean shouldNavigateBack;

        /* loaded from: classes7.dex */
        public final class AccountTypeSpecificConfiguration implements Parcelable {
            public static final Parcelable.Creator<AccountTypeSpecificConfiguration> CREATOR = new Alias.Creator(10);
            public final String message;
            public final String title;

            public AccountTypeSpecificConfiguration(String str, String str2) {
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
                if (!(obj instanceof AccountTypeSpecificConfiguration)) {
                    return false;
                }
                AccountTypeSpecificConfiguration accountTypeSpecificConfiguration = (AccountTypeSpecificConfiguration) obj;
                return Intrinsics.areEqual(this.title, accountTypeSpecificConfiguration.title) && Intrinsics.areEqual(this.message, accountTypeSpecificConfiguration.message);
            }

            public final int hashCode() {
                return this.message.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("AccountTypeSpecificConfiguration(title=", this.title, ", message=", this.message, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeString(this.message);
            }
        }

        public UnsupportedSettingScreen(AccountTypeSpecificConfiguration accountTypeSpecificConfiguration, AccountTypeSpecificConfiguration accountTypeSpecificConfiguration2, AccountSwitchAccountViewSwitcher.Entrypoint entrypoint, Screen screen, boolean z) {
            accountTypeSpecificConfiguration.getClass();
            accountTypeSpecificConfiguration2.getClass();
            entrypoint.getClass();
            this.personalAccountConfiguration = accountTypeSpecificConfiguration;
            this.businessAccountConfiguration = accountTypeSpecificConfiguration2;
            this.entrypoint = entrypoint;
            this.exitScreen = screen;
            this.shouldNavigateBack = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsupportedSettingScreen)) {
                return false;
            }
            UnsupportedSettingScreen unsupportedSettingScreen = (UnsupportedSettingScreen) obj;
            return Intrinsics.areEqual(this.personalAccountConfiguration, unsupportedSettingScreen.personalAccountConfiguration) && Intrinsics.areEqual(this.businessAccountConfiguration, unsupportedSettingScreen.businessAccountConfiguration) && this.entrypoint == unsupportedSettingScreen.entrypoint && Intrinsics.areEqual(this.exitScreen, unsupportedSettingScreen.exitScreen) && this.shouldNavigateBack == unsupportedSettingScreen.shouldNavigateBack;
        }

        public final boolean getShouldNavigateBack() {
            return this.shouldNavigateBack;
        }

        public final int hashCode() {
            int hashCode = (this.entrypoint.hashCode() + ((this.businessAccountConfiguration.hashCode() + (this.personalAccountConfiguration.hashCode() * 31)) * 31)) * 31;
            Screen screen = this.exitScreen;
            return Boolean.hashCode(this.shouldNavigateBack) + ((hashCode + (screen == null ? 0 : screen.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnsupportedSettingScreen(personalAccountConfiguration=");
            sb.append(this.personalAccountConfiguration);
            sb.append(", businessAccountConfiguration=");
            sb.append(this.businessAccountConfiguration);
            sb.append(", entrypoint=");
            sb.append(this.entrypoint);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", shouldNavigateBack=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldNavigateBack, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.personalAccountConfiguration.writeToParcel(parcel, i);
            this.businessAccountConfiguration.writeToParcel(parcel, i);
            parcel.writeString(this.entrypoint.name());
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeInt(this.shouldNavigateBack ? 1 : 0);
        }
    }

    public final class ProfileScreen extends ProfileScreens {
        public static final Parcelable.Creator<ProfileScreen> CREATOR = new CropScreen.Creator(27);
        public final ProfileAnalytics analytics;
        public final BackNavigationAction backNavigationAction;
        public final boolean confirmRecipient;
        public final Customer customer;
        public final CustomerProfileViewOpen.EntryPoint entryPoint;
        public final Screen exitScreen;
        public final UUID externalPaymentId;
        public final String launchUrl;
        public final boolean loadInitialDetailsFromCache;
        public final BlockersData.MoneybotContext moneybotContext;
        public final GetProfileDetailsContext originContext;
        public final boolean previewMode;
        public final Action primaryAction;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class BackNavigationAction {
            public static final /* synthetic */ BackNavigationAction[] $VALUES;
            public static final BackNavigationAction BACK;
            public static final BackNavigationAction CLOSE;

            static {
                BackNavigationAction backNavigationAction = new BackNavigationAction("CLOSE", 0);
                CLOSE = backNavigationAction;
                BackNavigationAction backNavigationAction2 = new BackNavigationAction("BACK", 1);
                BACK = backNavigationAction2;
                $VALUES = new BackNavigationAction[]{backNavigationAction, backNavigationAction2};
            }

            public static BackNavigationAction valueOf(String str) {
                return (BackNavigationAction) Enum.valueOf(BackNavigationAction.class, str);
            }

            public static BackNavigationAction[] values() {
                return (BackNavigationAction[]) $VALUES.clone();
            }
        }

        /* loaded from: classes6.dex */
        public final class ProfileAnalytics implements Parcelable {
            public static final Parcelable.Creator<ProfileAnalytics> CREATOR = new Alias.Creator(4);
            public final Integer absoluteIndex;
            public final String accountHolderToken;
            public final ContactStatus contactStatus;
            public final UUID externalId;
            public final Map genericCDFEventParameters;
            public final Boolean isC4bBusiness;
            public final Boolean isFirstLinkedAccount;
            public final Boolean isMultipleAccountHolder;
            public final Integer matchedAliasLength;
            public final String matchedFields;
            public final String messageToken;
            public final String queryToken;
            public final String remoteSuggestionType;
            public final Integer searchTextLength;
            public final UUID searchToken;
            public final String searchType;
            public final String section;
            public final String sectionId;
            public final Integer sectionIndex;
            public final Integer sectionTotal;
            public final SuggestionStrategy suggestionStrategy;

            public ProfileAnalytics(SuggestionStrategy suggestionStrategy, String str, String str2, Integer num, Integer num2, Integer num3, String str3, Integer num4, String str4, String str5, Integer num5, String str6, Map map, UUID uuid, UUID uuid2, String str7, ContactStatus contactStatus, Boolean bool, Boolean bool2, Boolean bool3, String str8) {
                this.suggestionStrategy = suggestionStrategy;
                this.sectionId = str;
                this.section = str2;
                this.sectionIndex = num;
                this.sectionTotal = num2;
                this.searchTextLength = num3;
                this.searchType = str3;
                this.matchedAliasLength = num4;
                this.matchedFields = str4;
                this.remoteSuggestionType = str5;
                this.absoluteIndex = num5;
                this.messageToken = str6;
                this.genericCDFEventParameters = map;
                this.searchToken = uuid;
                this.externalId = uuid2;
                this.queryToken = str7;
                this.contactStatus = contactStatus;
                this.isC4bBusiness = bool;
                this.isMultipleAccountHolder = bool2;
                this.isFirstLinkedAccount = bool3;
                this.accountHolderToken = str8;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProfileAnalytics)) {
                    return false;
                }
                ProfileAnalytics profileAnalytics = (ProfileAnalytics) obj;
                return this.suggestionStrategy == profileAnalytics.suggestionStrategy && Intrinsics.areEqual(this.sectionId, profileAnalytics.sectionId) && Intrinsics.areEqual(this.section, profileAnalytics.section) && Intrinsics.areEqual(this.sectionIndex, profileAnalytics.sectionIndex) && Intrinsics.areEqual(this.sectionTotal, profileAnalytics.sectionTotal) && Intrinsics.areEqual(this.searchTextLength, profileAnalytics.searchTextLength) && Intrinsics.areEqual(this.searchType, profileAnalytics.searchType) && Intrinsics.areEqual(this.matchedAliasLength, profileAnalytics.matchedAliasLength) && Intrinsics.areEqual(this.matchedFields, profileAnalytics.matchedFields) && Intrinsics.areEqual(this.remoteSuggestionType, profileAnalytics.remoteSuggestionType) && Intrinsics.areEqual(this.absoluteIndex, profileAnalytics.absoluteIndex) && Intrinsics.areEqual(this.messageToken, profileAnalytics.messageToken) && Intrinsics.areEqual(this.genericCDFEventParameters, profileAnalytics.genericCDFEventParameters) && Intrinsics.areEqual(this.searchToken, profileAnalytics.searchToken) && Intrinsics.areEqual(this.externalId, profileAnalytics.externalId) && Intrinsics.areEqual(this.queryToken, profileAnalytics.queryToken) && this.contactStatus == profileAnalytics.contactStatus && Intrinsics.areEqual(this.isC4bBusiness, profileAnalytics.isC4bBusiness) && Intrinsics.areEqual(this.isMultipleAccountHolder, profileAnalytics.isMultipleAccountHolder) && Intrinsics.areEqual(this.isFirstLinkedAccount, profileAnalytics.isFirstLinkedAccount) && Intrinsics.areEqual(this.accountHolderToken, profileAnalytics.accountHolderToken);
            }

            public final int hashCode() {
                SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
                int hashCode = (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode()) * 31;
                String str = this.sectionId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.section;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.sectionIndex;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.sectionTotal;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.searchTextLength;
                int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
                String str3 = this.searchType;
                int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num4 = this.matchedAliasLength;
                int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                String str4 = this.matchedFields;
                int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.remoteSuggestionType;
                int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Integer num5 = this.absoluteIndex;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                String str6 = this.messageToken;
                int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
                Map map = this.genericCDFEventParameters;
                int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
                UUID uuid = this.searchToken;
                int hashCode14 = (hashCode13 + (uuid == null ? 0 : uuid.hashCode())) * 31;
                UUID uuid2 = this.externalId;
                int hashCode15 = (hashCode14 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
                String str7 = this.queryToken;
                int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
                ContactStatus contactStatus = this.contactStatus;
                int hashCode17 = (hashCode16 + (contactStatus == null ? 0 : contactStatus.hashCode())) * 31;
                Boolean bool = this.isC4bBusiness;
                int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isMultipleAccountHolder;
                int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.isFirstLinkedAccount;
                int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str8 = this.accountHolderToken;
                return hashCode20 + (str8 != null ? str8.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ProfileAnalytics(suggestionStrategy=");
                sb.append(this.suggestionStrategy);
                sb.append(", sectionId=");
                sb.append(this.sectionId);
                sb.append(", section=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", sectionIndex=", this.sectionIndex, ", sectionTotal=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.sectionTotal, ", searchTextLength=", this.searchTextLength, ", searchType=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.searchType, ", matchedAliasLength=", this.matchedAliasLength, ", matchedFields=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.matchedFields, ", remoteSuggestionType=", this.remoteSuggestionType, ", absoluteIndex=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.absoluteIndex, ", messageToken=", this.messageToken, ", genericCDFEventParameters=");
                sb.append(this.genericCDFEventParameters);
                sb.append(", searchToken=");
                sb.append(this.searchToken);
                sb.append(", externalId=");
                sb.append(this.externalId);
                sb.append(", queryToken=");
                sb.append(this.queryToken);
                sb.append(", contactStatus=");
                sb.append(this.contactStatus);
                sb.append(", isC4bBusiness=");
                sb.append(this.isC4bBusiness);
                sb.append(", isMultipleAccountHolder=");
                Thread$State$EnumUnboxingLocalUtility.m(sb, this.isMultipleAccountHolder, ", isFirstLinkedAccount=", this.isFirstLinkedAccount, ", accountHolderToken=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accountHolderToken, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
                if (suggestionStrategy == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(suggestionStrategy.name());
                }
                parcel.writeString(this.sectionId);
                parcel.writeString(this.section);
                Integer num = this.sectionIndex;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
                Integer num2 = this.sectionTotal;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
                }
                Integer num3 = this.searchTextLength;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num3);
                }
                parcel.writeString(this.searchType);
                Integer num4 = this.matchedAliasLength;
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num4);
                }
                parcel.writeString(this.matchedFields);
                parcel.writeString(this.remoteSuggestionType);
                Integer num5 = this.absoluteIndex;
                if (num5 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num5);
                }
                parcel.writeString(this.messageToken);
                Map map = this.genericCDFEventParameters;
                if (map == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                    while (m.hasNext()) {
                        Map.Entry entry = (Map.Entry) m.next();
                        parcel.writeString((String) entry.getKey());
                        parcel.writeString((String) entry.getValue());
                    }
                }
                parcel.writeSerializable(this.searchToken);
                parcel.writeSerializable(this.externalId);
                parcel.writeString(this.queryToken);
                ContactStatus contactStatus = this.contactStatus;
                if (contactStatus == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(contactStatus.name());
                }
                Boolean bool = this.isC4bBusiness;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                }
                Boolean bool2 = this.isMultipleAccountHolder;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
                }
                Boolean bool3 = this.isFirstLinkedAccount;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool3);
                }
                parcel.writeString(this.accountHolderToken);
            }
        }

        public ProfileScreen(Customer customer, Action action, BackNavigationAction backNavigationAction, UUID uuid, GetProfileDetailsContext getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint entryPoint, Screen screen, boolean z, ProfileAnalytics profileAnalytics, String str, boolean z2, boolean z3, BlockersData.MoneybotContext moneybotContext) {
            customer.getClass();
            action.getClass();
            backNavigationAction.getClass();
            uuid.getClass();
            getProfileDetailsContext.getClass();
            entryPoint.getClass();
            screen.getClass();
            this.customer = customer;
            this.primaryAction = action;
            this.backNavigationAction = backNavigationAction;
            this.externalPaymentId = uuid;
            this.originContext = getProfileDetailsContext;
            this.entryPoint = entryPoint;
            this.exitScreen = screen;
            this.confirmRecipient = z;
            this.analytics = profileAnalytics;
            this.launchUrl = str;
            this.previewMode = z2;
            this.loadInitialDetailsFromCache = z3;
            this.moneybotContext = moneybotContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileScreen)) {
                return false;
            }
            ProfileScreen profileScreen = (ProfileScreen) obj;
            return Intrinsics.areEqual(this.customer, profileScreen.customer) && Intrinsics.areEqual(this.primaryAction, profileScreen.primaryAction) && this.backNavigationAction == profileScreen.backNavigationAction && Intrinsics.areEqual(this.externalPaymentId, profileScreen.externalPaymentId) && this.originContext == profileScreen.originContext && this.entryPoint == profileScreen.entryPoint && Intrinsics.areEqual(this.exitScreen, profileScreen.exitScreen) && this.confirmRecipient == profileScreen.confirmRecipient && Intrinsics.areEqual(this.analytics, profileScreen.analytics) && Intrinsics.areEqual(this.launchUrl, profileScreen.launchUrl) && this.previewMode == profileScreen.previewMode && this.loadInitialDetailsFromCache == profileScreen.loadInitialDetailsFromCache && Intrinsics.areEqual(this.moneybotContext, profileScreen.moneybotContext);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (this.entryPoint.hashCode() + ((this.originContext.hashCode() + ((this.externalPaymentId.hashCode() + ((this.backNavigationAction.hashCode() + ((this.primaryAction.hashCode() + (this.customer.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.confirmRecipient);
            ProfileAnalytics profileAnalytics = this.analytics;
            int hashCode = (m + (profileAnalytics == null ? 0 : profileAnalytics.hashCode())) * 31;
            String str = this.launchUrl;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.previewMode), 31, this.loadInitialDetailsFromCache);
            BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
            return m2 + (moneybotContext != null ? moneybotContext.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileScreen(customer=");
            sb.append(this.customer);
            sb.append(", primaryAction=");
            sb.append(this.primaryAction);
            sb.append(", backNavigationAction=");
            sb.append(this.backNavigationAction);
            sb.append(", externalPaymentId=");
            sb.append(this.externalPaymentId);
            sb.append(", originContext=");
            sb.append(this.originContext);
            sb.append(", entryPoint=");
            sb.append(this.entryPoint);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", confirmRecipient=");
            sb.append(this.confirmRecipient);
            sb.append(", analytics=");
            sb.append(this.analytics);
            sb.append(", launchUrl=");
            sb.append(this.launchUrl);
            sb.append(", previewMode=");
            re$$ExternalSyntheticOutline0.m(sb, this.previewMode, ", loadInitialDetailsFromCache=", this.loadInitialDetailsFromCache, ", moneybotContext=");
            sb.append(this.moneybotContext);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.customer, i);
            this.primaryAction.writeToParcel(parcel, i);
            parcel.writeString(this.backNavigationAction.name());
            parcel.writeSerializable(this.externalPaymentId);
            parcel.writeString(this.originContext.name());
            parcel.writeString(this.entryPoint.name());
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeInt(this.confirmRecipient ? 1 : 0);
            ProfileAnalytics profileAnalytics = this.analytics;
            if (profileAnalytics == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                profileAnalytics.writeToParcel(parcel, i);
            }
            parcel.writeString(this.launchUrl);
            parcel.writeInt(this.previewMode ? 1 : 0);
            parcel.writeInt(this.loadInitialDetailsFromCache ? 1 : 0);
            parcel.writeParcelable(this.moneybotContext, i);
        }

        /* loaded from: classes7.dex */
        public abstract class Customer implements Parcelable {

            public abstract class NonCashCustomer extends Customer {
                public abstract Redacted getAlias();

                public abstract String getLookupKey();

                public final class WithEmail extends NonCashCustomer {
                    public static final Parcelable.Creator<WithEmail> CREATOR = new Alias.Creator(2);
                    public final Redacted alias;
                    public final String lookupKey;

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public WithEmail(String str, String str2) {
                        this(new RedactedString(str), str2);
                        str.getClass();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof WithEmail)) {
                            return false;
                        }
                        WithEmail withEmail = (WithEmail) obj;
                        return Intrinsics.areEqual(this.alias, withEmail.alias) && Intrinsics.areEqual(this.lookupKey, withEmail.lookupKey);
                    }

                    @Override // com.squareup.cash.profile.screens.ProfileScreens.ProfileScreen.Customer.NonCashCustomer
                    public final Redacted getAlias() {
                        return this.alias;
                    }

                    @Override // com.squareup.cash.profile.screens.ProfileScreens.ProfileScreen.Customer.NonCashCustomer
                    public final String getLookupKey() {
                        return this.lookupKey;
                    }

                    public final int hashCode() {
                        int hashCode = this.alias.hashCode() * 31;
                        String str = this.lookupKey;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        return "WithEmail(alias=" + this.alias + ", lookupKey=" + this.lookupKey + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeParcelable(this.alias, i);
                        parcel.writeString(this.lookupKey);
                    }

                    public WithEmail(Redacted redacted, String str) {
                        redacted.getClass();
                        this.alias = redacted;
                        this.lookupKey = str;
                    }
                }

                public final class WithPhoneNumber extends NonCashCustomer {
                    public static final Parcelable.Creator<WithPhoneNumber> CREATOR = new Alias.Creator(3);
                    public final Redacted alias;
                    public final String lookupKey;

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public WithPhoneNumber(String str, String str2) {
                        this(new RedactedString(str), str2);
                        str.getClass();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof WithPhoneNumber)) {
                            return false;
                        }
                        WithPhoneNumber withPhoneNumber = (WithPhoneNumber) obj;
                        return Intrinsics.areEqual(this.alias, withPhoneNumber.alias) && Intrinsics.areEqual(this.lookupKey, withPhoneNumber.lookupKey);
                    }

                    @Override // com.squareup.cash.profile.screens.ProfileScreens.ProfileScreen.Customer.NonCashCustomer
                    public final Redacted getAlias() {
                        return this.alias;
                    }

                    @Override // com.squareup.cash.profile.screens.ProfileScreens.ProfileScreen.Customer.NonCashCustomer
                    public final String getLookupKey() {
                        return this.lookupKey;
                    }

                    public final int hashCode() {
                        int hashCode = this.alias.hashCode() * 31;
                        String str = this.lookupKey;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        return "WithPhoneNumber(alias=" + this.alias + ", lookupKey=" + this.lookupKey + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeParcelable(this.alias, i);
                        parcel.writeString(this.lookupKey);
                    }

                    public WithPhoneNumber(Redacted redacted, String str) {
                        redacted.getClass();
                        this.alias = redacted;
                        this.lookupKey = str;
                    }
                }
            }

            public final class CashCustomer extends Customer {
                public static final Parcelable.Creator<CashCustomer> CREATOR = new CropScreen.Creator(29);
                public final CashCustomerData customerData;
                public final Redacted customerId;
                public final boolean isBusiness;
                public final MerchantData merchantData;

                public final class MerchantData implements Parcelable {
                    public static final Parcelable.Creator<MerchantData> CREATOR = new Alias.Creator(1);
                    public final String genericElementsContext;

                    public MerchantData(String str) {
                        str.getClass();
                        this.genericElementsContext = str;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof MerchantData) && Intrinsics.areEqual(this.genericElementsContext, ((MerchantData) obj).genericElementsContext);
                    }

                    public final int hashCode() {
                        return this.genericElementsContext.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantData(genericElementsContext=", this.genericElementsContext, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.genericElementsContext);
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public CashCustomer(String str) {
                    this(new RedactedString(str), (CashCustomerData) null, false, 14);
                    str.getClass();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CashCustomer)) {
                        return false;
                    }
                    CashCustomer cashCustomer = (CashCustomer) obj;
                    return Intrinsics.areEqual(this.customerId, cashCustomer.customerId) && Intrinsics.areEqual(this.customerData, cashCustomer.customerData) && this.isBusiness == cashCustomer.isBusiness && Intrinsics.areEqual(this.merchantData, cashCustomer.merchantData);
                }

                public final int hashCode() {
                    int hashCode = this.customerId.hashCode() * 31;
                    CashCustomerData cashCustomerData = this.customerData;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (cashCustomerData == null ? 0 : cashCustomerData.hashCode())) * 31, 31, this.isBusiness);
                    MerchantData merchantData = this.merchantData;
                    return m + (merchantData != null ? merchantData.genericElementsContext.hashCode() : 0);
                }

                public final String toString() {
                    return "CashCustomer(customerId=" + this.customerId + ", customerData=" + this.customerData + ", isBusiness=" + this.isBusiness + ", merchantData=" + this.merchantData + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.customerId, i);
                    CashCustomerData cashCustomerData = this.customerData;
                    if (cashCustomerData == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        cashCustomerData.writeToParcel(parcel, i);
                    }
                    parcel.writeInt(this.isBusiness ? 1 : 0);
                    MerchantData merchantData = this.merchantData;
                    if (merchantData == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(merchantData.genericElementsContext);
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public CashCustomer(String str, boolean z) {
                    this(new RedactedString(str), (CashCustomerData) null, z, 10);
                    str.getClass();
                }

                public CashCustomer(Redacted redacted, CashCustomerData cashCustomerData, boolean z, MerchantData merchantData) {
                    redacted.getClass();
                    this.customerId = redacted;
                    this.customerData = cashCustomerData;
                    this.isBusiness = z;
                    this.merchantData = merchantData;
                }

                public /* synthetic */ CashCustomer(RedactedString redactedString, CashCustomerData cashCustomerData, boolean z, int i) {
                    this(redactedString, (i & 2) != 0 ? null : cashCustomerData, (i & 4) != 0 ? false : z, (MerchantData) null);
                }

                /* loaded from: classes6.dex */
                public final class CashCustomerData implements Parcelable {
                    public static final Parcelable.Creator<CashCustomerData> CREATOR = new CropScreen.Creator(28);
                    public final Color accentColor;
                    public final BlockState blockState;
                    public final boolean canAcceptPayments;
                    public final Redacted cashtag;
                    public final Boolean colorizeAvatar;
                    public final Long creditCardFee;
                    public final Redacted displayName;
                    public final Redacted email;
                    public final boolean isBusiness;
                    public final boolean isCashCustomer;
                    public final boolean isMerchantCustomer;
                    public final boolean isVerified;
                    public final String merchantCategory;
                    public final Image photo;
                    public final Region region;
                    public final Redacted sms;

                    public CashCustomerData(Redacted redacted, Redacted redacted2, Redacted redacted3, Redacted redacted4, Image image, Color color, Region region, boolean z, boolean z2, boolean z3, boolean z4, Long l, BlockState blockState, String str, boolean z5, Boolean bool) {
                        redacted.getClass();
                        this.displayName = redacted;
                        this.cashtag = redacted2;
                        this.email = redacted3;
                        this.sms = redacted4;
                        this.photo = image;
                        this.accentColor = color;
                        this.region = region;
                        this.isCashCustomer = z;
                        this.isMerchantCustomer = z2;
                        this.isBusiness = z3;
                        this.isVerified = z4;
                        this.creditCardFee = l;
                        this.blockState = blockState;
                        this.merchantCategory = str;
                        this.canAcceptPayments = z5;
                        this.colorizeAvatar = bool;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CashCustomerData)) {
                            return false;
                        }
                        CashCustomerData cashCustomerData = (CashCustomerData) obj;
                        return Intrinsics.areEqual(this.displayName, cashCustomerData.displayName) && Intrinsics.areEqual(this.cashtag, cashCustomerData.cashtag) && Intrinsics.areEqual(this.email, cashCustomerData.email) && Intrinsics.areEqual(this.sms, cashCustomerData.sms) && Intrinsics.areEqual(this.photo, cashCustomerData.photo) && Intrinsics.areEqual(this.accentColor, cashCustomerData.accentColor) && this.region == cashCustomerData.region && this.isCashCustomer == cashCustomerData.isCashCustomer && this.isMerchantCustomer == cashCustomerData.isMerchantCustomer && this.isBusiness == cashCustomerData.isBusiness && this.isVerified == cashCustomerData.isVerified && Intrinsics.areEqual(this.creditCardFee, cashCustomerData.creditCardFee) && this.blockState == cashCustomerData.blockState && Intrinsics.areEqual(this.merchantCategory, cashCustomerData.merchantCategory) && this.canAcceptPayments == cashCustomerData.canAcceptPayments && Intrinsics.areEqual(this.colorizeAvatar, cashCustomerData.colorizeAvatar);
                    }

                    public final int hashCode() {
                        int hashCode = this.displayName.hashCode() * 31;
                        Redacted redacted = this.cashtag;
                        int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
                        Redacted redacted2 = this.email;
                        int hashCode3 = (hashCode2 + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
                        Redacted redacted3 = this.sms;
                        int hashCode4 = (hashCode3 + (redacted3 == null ? 0 : redacted3.hashCode())) * 31;
                        Image image = this.photo;
                        int hashCode5 = (hashCode4 + (image == null ? 0 : image.hashCode())) * 31;
                        Color color = this.accentColor;
                        int hashCode6 = (hashCode5 + (color == null ? 0 : color.hashCode())) * 31;
                        Region region = this.region;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (region == null ? 0 : region.hashCode())) * 31, 31, this.isCashCustomer), 31, this.isMerchantCustomer), 31, this.isBusiness), 31, this.isVerified);
                        Long l = this.creditCardFee;
                        int hashCode7 = (m + (l == null ? 0 : l.hashCode())) * 31;
                        BlockState blockState = this.blockState;
                        int hashCode8 = (hashCode7 + (blockState == null ? 0 : blockState.hashCode())) * 31;
                        String str = this.merchantCategory;
                        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (str == null ? 0 : str.hashCode())) * 31, 31, this.canAcceptPayments);
                        Boolean bool = this.colorizeAvatar;
                        return m2 + (bool != null ? bool.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("CashCustomerData(displayName=");
                        sb.append(this.displayName);
                        sb.append(", cashtag=");
                        sb.append(this.cashtag);
                        sb.append(", email=");
                        sb.append(this.email);
                        sb.append(", sms=");
                        sb.append(this.sms);
                        sb.append(", photo=");
                        sb.append(this.photo);
                        sb.append(", accentColor=");
                        sb.append(this.accentColor);
                        sb.append(", region=");
                        sb.append(this.region);
                        sb.append(", isCashCustomer=");
                        sb.append(this.isCashCustomer);
                        sb.append(", isMerchantCustomer=");
                        re$$ExternalSyntheticOutline0.m(sb, this.isMerchantCustomer, ", isBusiness=", this.isBusiness, ", isVerified=");
                        sb.append(this.isVerified);
                        sb.append(", creditCardFee=");
                        sb.append(this.creditCardFee);
                        sb.append(", blockState=");
                        sb.append(this.blockState);
                        sb.append(", merchantCategory=");
                        sb.append(this.merchantCategory);
                        sb.append(", canAcceptPayments=");
                        sb.append(this.canAcceptPayments);
                        sb.append(", colorizeAvatar=");
                        sb.append(this.colorizeAvatar);
                        sb.append(")");
                        return sb.toString();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeParcelable(this.displayName, i);
                        parcel.writeParcelable(this.cashtag, i);
                        parcel.writeParcelable(this.email, i);
                        parcel.writeParcelable(this.sms, i);
                        parcel.writeParcelable(this.photo, i);
                        parcel.writeParcelable(this.accentColor, i);
                        Region region = this.region;
                        if (region == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            parcel.writeString(region.name());
                        }
                        parcel.writeInt(this.isCashCustomer ? 1 : 0);
                        parcel.writeInt(this.isMerchantCustomer ? 1 : 0);
                        parcel.writeInt(this.isBusiness ? 1 : 0);
                        parcel.writeInt(this.isVerified ? 1 : 0);
                        Long l = this.creditCardFee;
                        if (l == null) {
                            parcel.writeInt(0);
                        } else {
                            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
                        }
                        BlockState blockState = this.blockState;
                        if (blockState == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            parcel.writeString(blockState.name());
                        }
                        parcel.writeString(this.merchantCategory);
                        parcel.writeInt(this.canAcceptPayments ? 1 : 0);
                        Boolean bool = this.colorizeAvatar;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                        }
                    }

                    public /* synthetic */ CashCustomerData(RedactedString redactedString, RedactedString redactedString2, RedactedString redactedString3, RedactedString redactedString4, Image image, Color color, Region region, boolean z, boolean z2, boolean z3, Long l, BlockState blockState, String str, boolean z4) {
                        this(redactedString, redactedString2, redactedString3, redactedString4, image, color, region, z, false, z2, z3, l, blockState, str, z4, Boolean.FALSE);
                    }
                }
            }
        }

        /* loaded from: classes6.dex */
        public final class Action implements Parcelable {
            public static final Parcelable.Creator<Action> CREATOR = new CropScreen.Creator(26);
            public final ActionType actionType;
            public final Parcelable result;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes7.dex */
            public final class ActionType {
                public static final /* synthetic */ ActionType[] $VALUES;
                public static final ActionType NONE;
                public static final ActionType PAY;
                public static final ActionType PAY_OR_REQUEST;
                public static final ActionType REQUEST;

                static {
                    ActionType actionType = new ActionType("PAY", 0);
                    PAY = actionType;
                    ActionType actionType2 = new ActionType("REQUEST", 1);
                    REQUEST = actionType2;
                    ActionType actionType3 = new ActionType("PAY_OR_REQUEST", 2);
                    PAY_OR_REQUEST = actionType3;
                    ActionType actionType4 = new ActionType("NONE", 3);
                    NONE = actionType4;
                    $VALUES = new ActionType[]{actionType, actionType2, actionType3, actionType4};
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) $VALUES.clone();
                }
            }

            public Action(ActionType actionType, Parcelable parcelable) {
                actionType.getClass();
                this.actionType = actionType;
                this.result = parcelable;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return this.actionType == action.actionType && Intrinsics.areEqual(this.result, action.result);
            }

            public final int hashCode() {
                int hashCode = this.actionType.hashCode() * 31;
                Parcelable parcelable = this.result;
                return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
            }

            public final String toString() {
                return "Action(actionType=" + this.actionType + ", result=" + this.result + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.actionType.name());
                parcel.writeParcelable(this.result, i);
            }

            public /* synthetic */ Action(ActionType actionType) {
                this(actionType, null);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class GenericProfileElementsSection implements Parcelable {
        public static final Parcelable.Creator<GenericProfileElementsSection> CREATOR = new CropScreen.Creator(17);
        public final ProfileScreen.Customer customer;
        public final ExtraPaymentInfo extraPaymentInfo;
        public final boolean isMyOwnProfile;
        public final boolean loadInitialDetailsFromCache;
        public final boolean logViewCustomerProfile;

        public final class ExtraPaymentInfo implements Parcelable {
            public static final Parcelable.Creator<ExtraPaymentInfo> CREATOR = new CropScreen.Creator(18);
            public final ProfileScreen.ProfileAnalytics analytics;
            public final boolean confirmRecipient;
            public final CustomerProfileViewOpen.EntryPoint entryPoint;
            public final Screen exitScreen;
            public final UUID externalPaymentId;
            public final GetProfileDetailsContext originContext;

            public ExtraPaymentInfo(UUID uuid, GetProfileDetailsContext getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint entryPoint, Screen screen, boolean z, ProfileScreen.ProfileAnalytics profileAnalytics) {
                uuid.getClass();
                getProfileDetailsContext.getClass();
                entryPoint.getClass();
                screen.getClass();
                this.externalPaymentId = uuid;
                this.originContext = getProfileDetailsContext;
                this.entryPoint = entryPoint;
                this.exitScreen = screen;
                this.confirmRecipient = z;
                this.analytics = profileAnalytics;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraPaymentInfo)) {
                    return false;
                }
                ExtraPaymentInfo extraPaymentInfo = (ExtraPaymentInfo) obj;
                return Intrinsics.areEqual(this.externalPaymentId, extraPaymentInfo.externalPaymentId) && this.originContext == extraPaymentInfo.originContext && this.entryPoint == extraPaymentInfo.entryPoint && Intrinsics.areEqual(this.exitScreen, extraPaymentInfo.exitScreen) && this.confirmRecipient == extraPaymentInfo.confirmRecipient && Intrinsics.areEqual(this.analytics, extraPaymentInfo.analytics);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (this.entryPoint.hashCode() + ((this.originContext.hashCode() + (this.externalPaymentId.hashCode() * 31)) * 31)) * 31, 31), 31, this.confirmRecipient);
                ProfileScreen.ProfileAnalytics profileAnalytics = this.analytics;
                return m + (profileAnalytics == null ? 0 : profileAnalytics.hashCode());
            }

            public final String toString() {
                return "ExtraPaymentInfo(externalPaymentId=" + this.externalPaymentId + ", originContext=" + this.originContext + ", entryPoint=" + this.entryPoint + ", exitScreen=" + this.exitScreen + ", confirmRecipient=" + this.confirmRecipient + ", analytics=" + this.analytics + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeSerializable(this.externalPaymentId);
                parcel.writeString(this.originContext.name());
                parcel.writeString(this.entryPoint.name());
                parcel.writeParcelable(this.exitScreen, i);
                parcel.writeInt(this.confirmRecipient ? 1 : 0);
                ProfileScreen.ProfileAnalytics profileAnalytics = this.analytics;
                if (profileAnalytics == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    profileAnalytics.writeToParcel(parcel, i);
                }
            }
        }

        public GenericProfileElementsSection(ProfileScreen.Customer customer, ExtraPaymentInfo extraPaymentInfo, boolean z, boolean z2, boolean z3) {
            customer.getClass();
            this.customer = customer;
            this.extraPaymentInfo = extraPaymentInfo;
            this.logViewCustomerProfile = z;
            this.isMyOwnProfile = z2;
            this.loadInitialDetailsFromCache = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericProfileElementsSection)) {
                return false;
            }
            GenericProfileElementsSection genericProfileElementsSection = (GenericProfileElementsSection) obj;
            return Intrinsics.areEqual(this.customer, genericProfileElementsSection.customer) && Intrinsics.areEqual(this.extraPaymentInfo, genericProfileElementsSection.extraPaymentInfo) && this.logViewCustomerProfile == genericProfileElementsSection.logViewCustomerProfile && this.isMyOwnProfile == genericProfileElementsSection.isMyOwnProfile && this.loadInitialDetailsFromCache == genericProfileElementsSection.loadInitialDetailsFromCache;
        }

        public final int hashCode() {
            int hashCode = this.customer.hashCode() * 31;
            ExtraPaymentInfo extraPaymentInfo = this.extraPaymentInfo;
            return Boolean.hashCode(this.loadInitialDetailsFromCache) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (extraPaymentInfo == null ? 0 : extraPaymentInfo.hashCode())) * 31, 31, this.logViewCustomerProfile), 31, this.isMyOwnProfile);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GenericProfileElementsSection(customer=");
            sb.append(this.customer);
            sb.append(", extraPaymentInfo=");
            sb.append(this.extraPaymentInfo);
            sb.append(", logViewCustomerProfile=");
            re$$ExternalSyntheticOutline0.m(sb, this.logViewCustomerProfile, ", isMyOwnProfile=", this.isMyOwnProfile, ", loadInitialDetailsFromCache=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.loadInitialDetailsFromCache, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.customer, i);
            ExtraPaymentInfo extraPaymentInfo = this.extraPaymentInfo;
            if (extraPaymentInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extraPaymentInfo.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.logViewCustomerProfile ? 1 : 0);
            parcel.writeInt(this.isMyOwnProfile ? 1 : 0);
            parcel.writeInt(this.loadInitialDetailsFromCache ? 1 : 0);
        }

        public /* synthetic */ GenericProfileElementsSection(ProfileScreen.Customer customer, ExtraPaymentInfo extraPaymentInfo, boolean z, int i) {
            this(customer, extraPaymentInfo, true, false, (i & 16) != 0 ? true : z);
        }
    }

    public final class ErrorScreen extends ProfileDialogScreens implements AccentedScreen {
        public static final Parcelable.Creator<ErrorScreen> CREATOR = new CropScreen.Creator(15);
        public final ColorModel accentColor;
        public final boolean closeParentScreen;
        public final String message;
        public final String title;

        public /* synthetic */ ErrorScreen(String str, String str2, int i) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? ColorModel.Bitcoin.INSTANCE : null, (i & 8) == 0);
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
            return Intrinsics.areEqual(this.message, errorScreen.message) && Intrinsics.areEqual(this.title, errorScreen.title) && Intrinsics.areEqual(this.accentColor, errorScreen.accentColor) && this.closeParentScreen == errorScreen.closeParentScreen;
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ColorModel colorModel = this.accentColor;
            return Boolean.hashCode(this.closeParentScreen) + ((hashCode2 + (colorModel != null ? colorModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorScreen(message=", this.message, ", title=", this.title, ", accentColor=");
            m.append(this.accentColor);
            m.append(", closeParentScreen=");
            m.append(this.closeParentScreen);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.message);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeInt(this.closeParentScreen ? 1 : 0);
        }

        public ErrorScreen(String str, String str2, ColorModel colorModel, boolean z) {
            str.getClass();
            this.message = str;
            this.title = str2;
            this.accentColor = colorModel;
            this.closeParentScreen = z;
        }
    }

    public final class EnableAliasSheetScreen extends ProfileScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<EnableAliasSheetScreen> CREATOR = new CropScreen.Creator(14);
        public final AliasType aliasType;
        public final String body;
        public final Redacted emailAliases;
        public final NotificationCategory notificationSettingsName;
        public final ConfirmationSheetOrigin origin;
        public final Redacted phoneAliases;
        public final String title;

        public EnableAliasSheetScreen(String str, String str2, Redacted redacted, Redacted redacted2, ConfirmationSheetOrigin confirmationSheetOrigin, AliasType aliasType, NotificationCategory notificationCategory) {
            redacted.getClass();
            redacted2.getClass();
            confirmationSheetOrigin.getClass();
            this.title = str;
            this.body = str2;
            this.phoneAliases = redacted;
            this.emailAliases = redacted2;
            this.origin = confirmationSheetOrigin;
            this.aliasType = aliasType;
            this.notificationSettingsName = notificationCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnableAliasSheetScreen)) {
                return false;
            }
            EnableAliasSheetScreen enableAliasSheetScreen = (EnableAliasSheetScreen) obj;
            return Intrinsics.areEqual(this.title, enableAliasSheetScreen.title) && Intrinsics.areEqual(this.body, enableAliasSheetScreen.body) && Intrinsics.areEqual(this.phoneAliases, enableAliasSheetScreen.phoneAliases) && Intrinsics.areEqual(this.emailAliases, enableAliasSheetScreen.emailAliases) && this.origin == enableAliasSheetScreen.origin && this.aliasType == enableAliasSheetScreen.aliasType && this.notificationSettingsName == enableAliasSheetScreen.notificationSettingsName;
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.body;
            int hashCode2 = (this.origin.hashCode() + re$$ExternalSyntheticOutline0.m(this.emailAliases, re$$ExternalSyntheticOutline0.m(this.phoneAliases, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31)) * 31;
            AliasType aliasType = this.aliasType;
            int hashCode3 = (hashCode2 + (aliasType == null ? 0 : aliasType.hashCode())) * 31;
            NotificationCategory notificationCategory = this.notificationSettingsName;
            return hashCode3 + (notificationCategory != null ? notificationCategory.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EnableAliasSheetScreen(title=", this.title, ", body=", this.body, ", phoneAliases=");
            m.append(this.phoneAliases);
            m.append(", emailAliases=");
            m.append(this.emailAliases);
            m.append(", origin=");
            m.append(this.origin);
            m.append(", aliasType=");
            m.append(this.aliasType);
            m.append(", notificationSettingsName=");
            m.append(this.notificationSettingsName);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeParcelable(this.phoneAliases, i);
            parcel.writeParcelable(this.emailAliases, i);
            parcel.writeString(this.origin.name());
            AliasType aliasType = this.aliasType;
            if (aliasType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(aliasType.name());
            }
            NotificationCategory notificationCategory = this.notificationSettingsName;
            if (notificationCategory == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(notificationCategory.name());
            }
        }

        public /* synthetic */ EnableAliasSheetScreen(RedactedParcelableList redactedParcelableList, RedactedParcelableList redactedParcelableList2, ConfirmationSheetOrigin confirmationSheetOrigin, AliasType aliasType, int i) {
            this(null, null, redactedParcelableList, redactedParcelableList2, confirmationSheetOrigin, (i & 32) != 0 ? null : aliasType, null);
        }
    }
}
