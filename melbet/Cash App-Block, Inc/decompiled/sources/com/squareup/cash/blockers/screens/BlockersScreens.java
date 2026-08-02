package com.squareup.cash.blockers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.common.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.navigation.ReceivesStockSelectionResult;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.screens.AccentedScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.AddMoneyBlocker;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CalendarBlocker;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.CashtagBlocker;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.ContactAccessPreparationScreen;
import com.squareup.protos.franklin.api.CreditFirstTimeBorrowBlocker;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import com.squareup.protos.franklin.api.FileBlocker;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.InviteFriendsOpportunityScreen;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import com.squareup.protos.franklin.api.PaymentPlanDataBlocker;
import com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker;
import com.squareup.protos.franklin.api.RequestPushNotificationsScreen;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SelectionOption;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;
import com.squareup.protos.franklin.api.WebviewBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import com.squareup.protos.franklin.blockers.EarnerUpsellBlocker;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
import com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker;
import com.squareup.protos.franklin.blockers.PersonaDidvBlocker;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.InviteFriendsData;
import com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public interface BlockersScreens extends Screen {

    public final class ActivityPickerScreen implements BlockersScreens {
        public static final Parcelable.Creator<ActivityPickerScreen> CREATOR = new MoveBitcoinScreen.Creator(25);
        public final BlockersData blockersData;
        public final String paymentTokenRegex;
        public final String title;

        public ActivityPickerScreen(BlockersData blockersData, String str, String str2) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.paymentTokenRegex = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityPickerScreen)) {
                return false;
            }
            ActivityPickerScreen activityPickerScreen = (ActivityPickerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, activityPickerScreen.blockersData) && Intrinsics.areEqual(this.title, activityPickerScreen.title) && Intrinsics.areEqual(this.paymentTokenRegex, activityPickerScreen.paymentTokenRegex);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.paymentTokenRegex;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ActivityPickerScreen(blockersData=", ", title=", this.title, ", paymentTokenRegex="), this.paymentTokenRegex, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            parcel.writeString(this.paymentTokenRegex);
        }
    }

    public final class AddMoneyBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<AddMoneyBlockerScreen> CREATOR = new MoveBitcoinScreen.Creator(26);
        public final AddMoneyBlocker blocker;
        public final BlockersData blockersData;

        public AddMoneyBlockerScreen(BlockersData blockersData, AddMoneyBlocker addMoneyBlocker) {
            blockersData.getClass();
            addMoneyBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = addMoneyBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddMoneyBlockerScreen)) {
                return false;
            }
            AddMoneyBlockerScreen addMoneyBlockerScreen = (AddMoneyBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, addMoneyBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, addMoneyBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "AddMoneyBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class AmountScreen implements BlockersScreens {
        public static final Parcelable.Creator<AmountScreen> CREATOR = new MoveBitcoinScreen.Creator(29);
        public final BlockersData blockersData;
        public final String buttonLabel;
        public final Config config;
        public final BlockerAction dismissAction;
        public final BlockerAction helpAction;
        public final String subtitle;
        public final String title;

        /* loaded from: classes4.dex */
        public abstract class Config implements Parcelable {

            public final class PercentConfig extends Config {
                public static final Parcelable.Creator<PercentConfig> CREATOR = new MoveBitcoinScreen.Creator(28);
                public final ScientificNumber maximumAmount;
                public final ScientificNumber minimumAmount;

                public PercentConfig(ScientificNumber scientificNumber, ScientificNumber scientificNumber2) {
                    scientificNumber.getClass();
                    scientificNumber2.getClass();
                    this.minimumAmount = scientificNumber;
                    this.maximumAmount = scientificNumber2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Object getMaximumAmount() {
                    return this.maximumAmount;
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Object getMinimumAmount() {
                    return this.minimumAmount;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.minimumAmount, i);
                    parcel.writeParcelable(this.maximumAmount, i);
                }
            }

            public abstract Object getMaximumAmount();

            public abstract Object getMinimumAmount();

            public final class MoneyConfig extends Config {
                public static final Parcelable.Creator<MoneyConfig> CREATOR = new MoveBitcoinScreen.Creator(27);
                public final Money maximumAmount;
                public final Money minimumAmount;
                public final Money prefilledAmount;

                public MoneyConfig(Money money, Money money2, Money money3) {
                    money.getClass();
                    money2.getClass();
                    this.minimumAmount = money;
                    this.maximumAmount = money2;
                    this.prefilledAmount = money3;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Money getMaximumAmount() {
                    return this.maximumAmount;
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Money getMinimumAmount() {
                    return this.minimumAmount;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.minimumAmount, i);
                    parcel.writeParcelable(this.maximumAmount, i);
                    parcel.writeParcelable(this.prefilledAmount, i);
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Object getMaximumAmount() {
                    return this.maximumAmount;
                }

                @Override // com.squareup.cash.blockers.screens.BlockersScreens.AmountScreen.Config
                public final Object getMinimumAmount() {
                    return this.minimumAmount;
                }
            }
        }

        public AmountScreen(BlockersData blockersData, String str, String str2, String str3, Config config, BlockerAction blockerAction, BlockerAction blockerAction2) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            config.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.config = config;
            this.dismissAction = blockerAction;
            this.helpAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountScreen)) {
                return false;
            }
            AmountScreen amountScreen = (AmountScreen) obj;
            return Intrinsics.areEqual(this.blockersData, amountScreen.blockersData) && Intrinsics.areEqual(this.title, amountScreen.title) && Intrinsics.areEqual(this.subtitle, amountScreen.subtitle) && Intrinsics.areEqual(this.buttonLabel, amountScreen.buttonLabel) && Intrinsics.areEqual(this.config, amountScreen.config) && Intrinsics.areEqual(this.dismissAction, amountScreen.dismissAction) && Intrinsics.areEqual(this.helpAction, amountScreen.helpAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int hashCode = (this.dismissAction.hashCode() + ((this.config.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.buttonLabel)) * 31)) * 31;
            BlockerAction blockerAction = this.helpAction;
            return hashCode + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "AmountScreen(blockersData=", ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", buttonLabel=", this.buttonLabel, ", config=");
            m.append(this.config);
            m.append(", dismissAction=");
            m.append(this.dismissAction);
            m.append(", helpAction=");
            m.append(this.helpAction);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.buttonLabel);
            parcel.writeParcelable(this.config, i);
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeParcelable(this.helpAction, i);
        }
    }

    public interface AtmPickerAmountBlockerScreen extends BlockersScreens {

        /* loaded from: classes4.dex */
        public final class BottomSheet implements AtmPickerAmountBlockerScreen, Screen, OnlyOneOverlayTreatment {
            public static final Parcelable.Creator<BottomSheet> CREATOR = new CameraError.Creator(1);
            public final AtmPickerAmountBlocker blocker;
            public final BlockersData blockersData;
            public final BlockerAction dismissAction;
            public final BlockerAction retreatAction;

            public BottomSheet(BlockersData blockersData, AtmPickerAmountBlocker atmPickerAmountBlocker, BlockerAction blockerAction, BlockerAction blockerAction2) {
                blockersData.getClass();
                atmPickerAmountBlocker.getClass();
                this.blockersData = blockersData;
                this.blocker = atmPickerAmountBlocker;
                this.retreatAction = blockerAction;
                this.dismissAction = blockerAction2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomSheet)) {
                    return false;
                }
                BottomSheet bottomSheet = (BottomSheet) obj;
                return Intrinsics.areEqual(this.blockersData, bottomSheet.blockersData) && Intrinsics.areEqual(this.blocker, bottomSheet.blocker) && Intrinsics.areEqual(this.retreatAction, bottomSheet.retreatAction) && Intrinsics.areEqual(this.dismissAction, bottomSheet.dismissAction);
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens.AtmPickerAmountBlockerScreen
            public final AtmPickerAmountBlocker getBlocker() {
                return this.blocker;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockerAction getDismissAction() {
                return this.dismissAction;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockerAction getRetreatAction() {
                return this.retreatAction;
            }

            public final int hashCode() {
                int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
                BlockerAction blockerAction = this.retreatAction;
                int hashCode2 = (hashCode + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
                BlockerAction blockerAction2 = this.dismissAction;
                return hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
            }

            public final String toString() {
                return "BottomSheet(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ", dismissAction=" + this.dismissAction + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.blockersData, i);
                parcel.writeParcelable(this.blocker, i);
                parcel.writeParcelable(this.retreatAction, i);
                parcel.writeParcelable(this.dismissAction, i);
            }
        }

        /* loaded from: classes4.dex */
        public final class Fullscreen implements AtmPickerAmountBlockerScreen {
            public static final Parcelable.Creator<Fullscreen> CREATOR = new CameraError.Creator(2);
            public final AtmPickerAmountBlocker blocker;
            public final BlockersData blockersData;
            public final BlockerAction dismissAction;
            public final BlockerAction retreatAction;

            public Fullscreen(BlockersData blockersData, AtmPickerAmountBlocker atmPickerAmountBlocker, BlockerAction blockerAction, BlockerAction blockerAction2) {
                blockersData.getClass();
                atmPickerAmountBlocker.getClass();
                this.blockersData = blockersData;
                this.blocker = atmPickerAmountBlocker;
                this.retreatAction = blockerAction;
                this.dismissAction = blockerAction2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fullscreen)) {
                    return false;
                }
                Fullscreen fullscreen = (Fullscreen) obj;
                return Intrinsics.areEqual(this.blockersData, fullscreen.blockersData) && Intrinsics.areEqual(this.blocker, fullscreen.blocker) && Intrinsics.areEqual(this.retreatAction, fullscreen.retreatAction) && Intrinsics.areEqual(this.dismissAction, fullscreen.dismissAction);
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens.AtmPickerAmountBlockerScreen
            public final AtmPickerAmountBlocker getBlocker() {
                return this.blocker;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockerAction getDismissAction() {
                return this.dismissAction;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockerAction getRetreatAction() {
                return this.retreatAction;
            }

            public final int hashCode() {
                int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
                BlockerAction blockerAction = this.retreatAction;
                int hashCode2 = (hashCode + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
                BlockerAction blockerAction2 = this.dismissAction;
                return hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
            }

            public final String toString() {
                return "Fullscreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ", dismissAction=" + this.dismissAction + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.blockersData, i);
                parcel.writeParcelable(this.blocker, i);
                parcel.writeParcelable(this.retreatAction, i);
                parcel.writeParcelable(this.dismissAction, i);
            }
        }

        AtmPickerAmountBlocker getBlocker();
    }

    public final class AuthorizeGooglePayScreen implements BlockersScreens {
        public static final Parcelable.Creator<AuthorizeGooglePayScreen> CREATOR = new CameraError.Creator(3);
        public final Money amount;
        public final BlockersData blockersData;
        public final String subtitle;
        public final String title;

        public AuthorizeGooglePayScreen(BlockersData blockersData, Money money, String str, String str2) {
            blockersData.getClass();
            money.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.amount = money;
            this.title = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthorizeGooglePayScreen)) {
                return false;
            }
            AuthorizeGooglePayScreen authorizeGooglePayScreen = (AuthorizeGooglePayScreen) obj;
            return Intrinsics.areEqual(this.blockersData, authorizeGooglePayScreen.blockersData) && Intrinsics.areEqual(this.amount, authorizeGooglePayScreen.amount) && Intrinsics.areEqual(this.title, authorizeGooglePayScreen.title) && Intrinsics.areEqual(this.subtitle, authorizeGooglePayScreen.subtitle);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, this.blockersData.hashCode() * 31, 31), 31, this.title);
            String str = this.subtitle;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorizeGooglePayScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", title=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", subtitle=", this.subtitle, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    public final class BalanceTransferLoading implements BlockersScreens {
        public static final Parcelable.Creator<BalanceTransferLoading> CREATOR = new CameraError.Creator(4);
        public final BlockersData blockersData;

        public BalanceTransferLoading(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BalanceTransferLoading) && Intrinsics.areEqual(this.blockersData, ((BalanceTransferLoading) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "BalanceTransferLoading(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class BirthdayScreen implements BlockersScreens {
        public static final Parcelable.Creator<BirthdayScreen> CREATOR = new CameraError.Creator(6);
        public final Redacted birthday;
        public final BlockersData blockersData;
        public final Redacted titleOverride;

        public BirthdayScreen(BlockersData blockersData, Redacted redacted, Redacted redacted2) {
            blockersData.getClass();
            redacted.getClass();
            redacted2.getClass();
            this.blockersData = blockersData;
            this.titleOverride = redacted;
            this.birthday = redacted2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BirthdayScreen)) {
                return false;
            }
            BirthdayScreen birthdayScreen = (BirthdayScreen) obj;
            return Intrinsics.areEqual(this.blockersData, birthdayScreen.blockersData) && Intrinsics.areEqual(this.titleOverride, birthdayScreen.titleOverride) && Intrinsics.areEqual(this.birthday, birthdayScreen.birthday);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.birthday.hashCode() + re$$ExternalSyntheticOutline0.m(this.titleOverride, this.blockersData.hashCode() * 31, 31);
        }

        public final String toString() {
            return "BirthdayScreen(blockersData=" + this.blockersData + ", titleOverride=" + this.titleOverride + ", birthday=" + this.birthday + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.titleOverride, i);
            parcel.writeParcelable(this.birthday, i);
        }
    }

    public final class BitcoinAmountScreen implements BlockersScreens {
        public static final Parcelable.Creator<BitcoinAmountScreen> CREATOR = new CameraError.Creator(7);
        public final BlockersData blockersData;
        public final String buttonLabel;
        public final BlockerAction dismissAction;
        public final Money maximumAmount;
        public final Money minimumAmount;
        public final String subtitle;
        public final String title;

        public BitcoinAmountScreen(BlockersData blockersData, String str, String str2, String str3, Money money, Money money2, BlockerAction blockerAction) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            money.getClass();
            money2.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.minimumAmount = money;
            this.maximumAmount = money2;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinAmountScreen)) {
                return false;
            }
            BitcoinAmountScreen bitcoinAmountScreen = (BitcoinAmountScreen) obj;
            return Intrinsics.areEqual(this.blockersData, bitcoinAmountScreen.blockersData) && Intrinsics.areEqual(this.title, bitcoinAmountScreen.title) && Intrinsics.areEqual(this.subtitle, bitcoinAmountScreen.subtitle) && Intrinsics.areEqual(this.buttonLabel, bitcoinAmountScreen.buttonLabel) && Intrinsics.areEqual(this.minimumAmount, bitcoinAmountScreen.minimumAmount) && Intrinsics.areEqual(this.maximumAmount, bitcoinAmountScreen.maximumAmount) && Intrinsics.areEqual(this.dismissAction, bitcoinAmountScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            return this.dismissAction.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.maximumAmount, NavAction$$ExternalSyntheticOutline0.m(this.minimumAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.buttonLabel), 31), 31);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "BitcoinAmountScreen(blockersData=", ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", buttonLabel=", this.buttonLabel, ", minimumAmount=");
            m.append(this.minimumAmount);
            m.append(", maximumAmount=");
            m.append(this.maximumAmount);
            m.append(", dismissAction=");
            m.append(this.dismissAction);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.buttonLabel);
            parcel.writeParcelable(this.minimumAmount, i);
            parcel.writeParcelable(this.maximumAmount, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class BlockerActionConfirmDialogScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<BlockerActionConfirmDialogScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final BlockerAction.ConfirmationDialog confirmationDialog;
        public final BlockerAction positiveAction;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BlockerActionConfirmDialogScreen((BlockersData) parcel.readParcelable(BlockerActionConfirmDialogScreen.class.getClassLoader()), (BlockerAction.ConfirmationDialog) parcel.readParcelable(BlockerActionConfirmDialogScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockerActionConfirmDialogScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockerActionConfirmDialogScreen[i];
            }
        }

        public BlockerActionConfirmDialogScreen(BlockersData blockersData, BlockerAction.ConfirmationDialog confirmationDialog, BlockerAction blockerAction) {
            blockersData.getClass();
            confirmationDialog.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.confirmationDialog = confirmationDialog;
            this.positiveAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionConfirmDialogScreen)) {
                return false;
            }
            BlockerActionConfirmDialogScreen blockerActionConfirmDialogScreen = (BlockerActionConfirmDialogScreen) obj;
            return Intrinsics.areEqual(this.blockersData, blockerActionConfirmDialogScreen.blockersData) && Intrinsics.areEqual(this.confirmationDialog, blockerActionConfirmDialogScreen.confirmationDialog) && Intrinsics.areEqual(this.positiveAction, blockerActionConfirmDialogScreen.positiveAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.positiveAction.hashCode() + ((this.confirmationDialog.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "BlockerActionConfirmDialogScreen(blockersData=" + this.blockersData + ", confirmationDialog=" + this.confirmationDialog + ", positiveAction=" + this.positiveAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.confirmationDialog, i);
            parcel.writeParcelable(this.positiveAction, i);
        }
    }

    public final class BlockerActionConfirmSheetScreen implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<BlockerActionConfirmSheetScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final BlockerAction.ConfirmationSheet confirmationSheet;
        public final BlockerAction dismissAction;
        public final Screen goBackArgs;
        public final BlockerAction positiveAction;
        public final boolean showSuccessAnimation;
        public final SubmitFormRequest submitFormRequest;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BlockerActionConfirmSheetScreen((BlockersData) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()), (BlockerAction.ConfirmationSheet) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()), (SubmitFormRequest) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()), (Screen) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()), parcel.readInt() != 0, (BlockerAction) parcel.readParcelable(BlockerActionConfirmSheetScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockerActionConfirmSheetScreen[i];
            }
        }

        public BlockerActionConfirmSheetScreen(BlockersData blockersData, BlockerAction.ConfirmationSheet confirmationSheet, BlockerAction blockerAction, SubmitFormRequest submitFormRequest, Screen screen, boolean z, BlockerAction blockerAction2) {
            blockersData.getClass();
            confirmationSheet.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.confirmationSheet = confirmationSheet;
            this.positiveAction = blockerAction;
            this.submitFormRequest = submitFormRequest;
            this.goBackArgs = screen;
            this.showSuccessAnimation = z;
            this.dismissAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionConfirmSheetScreen)) {
                return false;
            }
            BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = (BlockerActionConfirmSheetScreen) obj;
            return Intrinsics.areEqual(this.blockersData, blockerActionConfirmSheetScreen.blockersData) && Intrinsics.areEqual(this.confirmationSheet, blockerActionConfirmSheetScreen.confirmationSheet) && Intrinsics.areEqual(this.positiveAction, blockerActionConfirmSheetScreen.positiveAction) && Intrinsics.areEqual(this.submitFormRequest, blockerActionConfirmSheetScreen.submitFormRequest) && Intrinsics.areEqual(this.goBackArgs, blockerActionConfirmSheetScreen.goBackArgs) && this.showSuccessAnimation == blockerActionConfirmSheetScreen.showSuccessAnimation && Intrinsics.areEqual(this.dismissAction, blockerActionConfirmSheetScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int hashCode = (this.positiveAction.hashCode() + ((this.confirmationSheet.hashCode() + (this.blockersData.hashCode() * 31)) * 31)) * 31;
            SubmitFormRequest submitFormRequest = this.submitFormRequest;
            int hashCode2 = (hashCode + (submitFormRequest == null ? 0 : submitFormRequest.hashCode())) * 31;
            Screen screen = this.goBackArgs;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.showSuccessAnimation);
            BlockerAction blockerAction = this.dismissAction;
            return m + (blockerAction != null ? blockerAction.hashCode() : 0);
        }

        public final String toString() {
            return "BlockerActionConfirmSheetScreen(blockersData=" + this.blockersData + ", confirmationSheet=" + this.confirmationSheet + ", positiveAction=" + this.positiveAction + ", submitFormRequest=" + this.submitFormRequest + ", goBackArgs=" + this.goBackArgs + ", showSuccessAnimation=" + this.showSuccessAnimation + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.confirmationSheet, i);
            parcel.writeParcelable(this.positiveAction, i);
            parcel.writeParcelable(this.submitFormRequest, i);
            parcel.writeParcelable(this.goBackArgs, i);
            parcel.writeInt(this.showSuccessAnimation ? 1 : 0);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class BlockerActionDialogActionScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<BlockerActionDialogActionScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final BlockerAction.DialogAction dialogAction;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BlockerActionDialogActionScreen((BlockersData) parcel.readParcelable(BlockerActionDialogActionScreen.class.getClassLoader()), (BlockerAction.DialogAction) parcel.readParcelable(BlockerActionDialogActionScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockerActionDialogActionScreen[i];
            }
        }

        public BlockerActionDialogActionScreen(BlockersData blockersData, BlockerAction.DialogAction dialogAction) {
            blockersData.getClass();
            dialogAction.getClass();
            this.blockersData = blockersData;
            this.dialogAction = dialogAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionDialogActionScreen)) {
                return false;
            }
            BlockerActionDialogActionScreen blockerActionDialogActionScreen = (BlockerActionDialogActionScreen) obj;
            return Intrinsics.areEqual(this.blockersData, blockerActionDialogActionScreen.blockersData) && Intrinsics.areEqual(this.dialogAction, blockerActionDialogActionScreen.dialogAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.dialogAction.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "BlockerActionDialogActionScreen(blockersData=" + this.blockersData + ", dialogAction=" + this.dialogAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.dialogAction, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class BlockerActionFileDownloadDialogScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<BlockerActionFileDownloadDialogScreen> CREATOR = new CameraError.Creator(8);
        public final BlockersData blockersData;
        public final String title;

        public BlockerActionFileDownloadDialogScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.title = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionFileDownloadDialogScreen)) {
                return false;
            }
            BlockerActionFileDownloadDialogScreen blockerActionFileDownloadDialogScreen = (BlockerActionFileDownloadDialogScreen) obj;
            return Intrinsics.areEqual(this.blockersData, blockerActionFileDownloadDialogScreen.blockersData) && Intrinsics.areEqual(this.title, blockerActionFileDownloadDialogScreen.title);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "BlockerActionFileDownloadDialogScreen(blockersData=" + this.blockersData + ", title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
        }
    }

    /* loaded from: classes4.dex */
    public final class BlockerActionFileDownloadFailureDialogScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<BlockerActionFileDownloadFailureDialogScreen> CREATOR = new CameraError.Creator(9);
        public final BlockersData blockersData;
        public final BlockerAction positiveAction;

        public BlockerActionFileDownloadFailureDialogScreen(BlockersData blockersData, BlockerAction blockerAction) {
            blockersData.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.positiveAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionFileDownloadFailureDialogScreen)) {
                return false;
            }
            BlockerActionFileDownloadFailureDialogScreen blockerActionFileDownloadFailureDialogScreen = (BlockerActionFileDownloadFailureDialogScreen) obj;
            return Intrinsics.areEqual(this.blockersData, blockerActionFileDownloadFailureDialogScreen.blockersData) && Intrinsics.areEqual(this.positiveAction, blockerActionFileDownloadFailureDialogScreen.positiveAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.positiveAction.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "BlockerActionFileDownloadFailureDialogScreen(blockersData=" + this.blockersData + ", positiveAction=" + this.positiveAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.positiveAction, i);
        }
    }

    public abstract class BlockerContainerScreen implements BlockersScreens {

        /* loaded from: classes4.dex */
        public final class BlockerContainerBottomSheet extends BlockerContainerScreen implements BottomSheetScreen {
            public static final Parcelable.Creator<BlockerContainerBottomSheet> CREATOR = new CameraError.Creator(10);
            public final BlockersData blockersData;
            public final BlockerAction dismissAction;
            public final Screen screen;

            public BlockerContainerBottomSheet(BlockersData blockersData, Screen screen, BlockerAction blockerAction) {
                blockersData.getClass();
                screen.getClass();
                blockerAction.getClass();
                this.blockersData = blockersData;
                this.screen = screen;
                this.dismissAction = blockerAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BlockerContainerBottomSheet)) {
                    return false;
                }
                BlockerContainerBottomSheet blockerContainerBottomSheet = (BlockerContainerBottomSheet) obj;
                return Intrinsics.areEqual(this.blockersData, blockerContainerBottomSheet.blockersData) && Intrinsics.areEqual(this.screen, blockerContainerBottomSheet.screen) && Intrinsics.areEqual(this.dismissAction, blockerContainerBottomSheet.dismissAction);
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens.BlockerContainerScreen, com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockerAction getDismissAction() {
                return this.dismissAction;
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens.BlockerContainerScreen
            public final Screen getScreen() {
                return this.screen;
            }

            public final int hashCode() {
                return this.dismissAction.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.screen, this.blockersData.hashCode() * 31, 31);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return Recorder$$ExternalSyntheticOutline2.m("BlockerContainerBottomSheet : ", Reflection.factory.getOrCreateKotlinClass(this.screen.getClass()).getSimpleName());
            }

            public final String toString() {
                return "BlockerContainerBottomSheet(blockersData=" + this.blockersData + ", screen=" + this.screen + ", dismissAction=" + this.dismissAction + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.blockersData, i);
                parcel.writeParcelable(this.screen, i);
                parcel.writeParcelable(this.dismissAction, i);
            }
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public abstract BlockerAction getDismissAction();

        public abstract Screen getScreen();
    }

    public interface BlockersDialogScreens extends BlockersScreens, DialogScreen {
    }

    public final class BusinessBackConfirmationScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<BusinessBackConfirmationScreen> CREATOR = new CameraError.Creator(11);
        public final BlockersData blockersData;

        public BusinessBackConfirmationScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BusinessBackConfirmationScreen) && Intrinsics.areEqual(this.blockersData, ((BusinessBackConfirmationScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "BusinessBackConfirmationScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class CalendarBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<CalendarBlockerScreen> CREATOR = new CameraError.Creator(12);
        public final BlockersData blockersData;
        public final CalendarBlocker calendarBlocker;
        public final BlockerAction dismissAction;
        public final BlockerAction retreatAction;

        public CalendarBlockerScreen(BlockersData blockersData, CalendarBlocker calendarBlocker, BlockerAction blockerAction, BlockerAction blockerAction2) {
            blockersData.getClass();
            calendarBlocker.getClass();
            this.blockersData = blockersData;
            this.calendarBlocker = calendarBlocker;
            this.retreatAction = blockerAction;
            this.dismissAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarBlockerScreen)) {
                return false;
            }
            CalendarBlockerScreen calendarBlockerScreen = (CalendarBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, calendarBlockerScreen.blockersData) && Intrinsics.areEqual(this.calendarBlocker, calendarBlockerScreen.calendarBlocker) && Intrinsics.areEqual(this.retreatAction, calendarBlockerScreen.retreatAction) && Intrinsics.areEqual(this.dismissAction, calendarBlockerScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getRetreatAction() {
            throw null;
        }

        public final int hashCode() {
            int hashCode = (this.calendarBlocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            BlockerAction blockerAction = this.retreatAction;
            int hashCode2 = (hashCode + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            BlockerAction blockerAction2 = this.dismissAction;
            return hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
        }

        public final String toString() {
            return "CalendarBlockerScreen(blockersData=" + this.blockersData + ", calendarBlocker=" + this.calendarBlocker + ", retreatAction=" + this.retreatAction + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.calendarBlocker, i);
            parcel.writeParcelable(this.retreatAction, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class CameraError implements BlockersDialogScreens {
        public static final Parcelable.Creator<CameraError> CREATOR = new Creator(0);
        public final BlockersData blockersData;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                int i = 0;
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        return new CameraError((BlockersData) parcel.readParcelable(CameraError.class.getClassLoader()));
                    case 1:
                        parcel.getClass();
                        return new AtmPickerAmountBlockerScreen.BottomSheet((BlockersData) parcel.readParcelable(AtmPickerAmountBlockerScreen.BottomSheet.class.getClassLoader()), (AtmPickerAmountBlocker) parcel.readParcelable(AtmPickerAmountBlockerScreen.BottomSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(AtmPickerAmountBlockerScreen.BottomSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(AtmPickerAmountBlockerScreen.BottomSheet.class.getClassLoader()));
                    case 2:
                        parcel.getClass();
                        return new AtmPickerAmountBlockerScreen.Fullscreen((BlockersData) parcel.readParcelable(AtmPickerAmountBlockerScreen.Fullscreen.class.getClassLoader()), (AtmPickerAmountBlocker) parcel.readParcelable(AtmPickerAmountBlockerScreen.Fullscreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(AtmPickerAmountBlockerScreen.Fullscreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(AtmPickerAmountBlockerScreen.Fullscreen.class.getClassLoader()));
                    case 3:
                        parcel.getClass();
                        return new AuthorizeGooglePayScreen((BlockersData) parcel.readParcelable(AuthorizeGooglePayScreen.class.getClassLoader()), (Money) parcel.readParcelable(AuthorizeGooglePayScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                    case 4:
                        parcel.getClass();
                        return new BalanceTransferLoading((BlockersData) parcel.readParcelable(BalanceTransferLoading.class.getClassLoader()));
                    case 5:
                        BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, BankAccountLinkingScreen.class);
                        Redacted redacted = (Redacted) parcel.readParcelable(BankAccountLinkingScreen.class.getClassLoader());
                        boolean z = parcel.readInt() != 0;
                        boolean z2 = parcel.readInt() != 0;
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(readInt);
                            while (i != readInt) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(BankAccountLinkingScreen.class, parcel, arrayList3, i, 1);
                            }
                            arrayList = arrayList3;
                        }
                        return new BankAccountLinkingScreen(blockersData, redacted, z, z2, arrayList, parcel.readString());
                    case 6:
                        parcel.getClass();
                        return new BirthdayScreen((BlockersData) parcel.readParcelable(BirthdayScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(BirthdayScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(BirthdayScreen.class.getClassLoader()));
                    case 7:
                        parcel.getClass();
                        return new BitcoinAmountScreen((BlockersData) parcel.readParcelable(BitcoinAmountScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Money) parcel.readParcelable(BitcoinAmountScreen.class.getClassLoader()), (Money) parcel.readParcelable(BitcoinAmountScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BitcoinAmountScreen.class.getClassLoader()));
                    case 8:
                        parcel.getClass();
                        return new BlockerActionFileDownloadDialogScreen((BlockersData) parcel.readParcelable(BlockerActionFileDownloadDialogScreen.class.getClassLoader()), parcel.readString());
                    case 9:
                        parcel.getClass();
                        return new BlockerActionFileDownloadFailureDialogScreen((BlockersData) parcel.readParcelable(BlockerActionFileDownloadFailureDialogScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockerActionFileDownloadFailureDialogScreen.class.getClassLoader()));
                    case 10:
                        parcel.getClass();
                        return new BlockerContainerScreen.BlockerContainerBottomSheet((BlockersData) parcel.readParcelable(BlockerContainerScreen.BlockerContainerBottomSheet.class.getClassLoader()), (Screen) parcel.readParcelable(BlockerContainerScreen.BlockerContainerBottomSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(BlockerContainerScreen.BlockerContainerBottomSheet.class.getClassLoader()));
                    case 11:
                        parcel.getClass();
                        return new BusinessBackConfirmationScreen((BlockersData) parcel.readParcelable(BusinessBackConfirmationScreen.class.getClassLoader()));
                    case 12:
                        parcel.getClass();
                        return new CalendarBlockerScreen((BlockersData) parcel.readParcelable(CalendarBlockerScreen.class.getClassLoader()), (CalendarBlocker) parcel.readParcelable(CalendarBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(CalendarBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(CalendarBlockerScreen.class.getClassLoader()));
                    case 13:
                        parcel.getClass();
                        return new CameraPermissionScreen((BlockersData) parcel.readParcelable(CameraPermissionScreen.class.getClassLoader()));
                    case 14:
                        parcel.getClass();
                        return new CardActivationQrScreen((BlockersData) parcel.readParcelable(CardActivationQrScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                    case 15:
                        parcel.getClass();
                        parcel.readInt();
                        return CardActivationScreen.CardActivationData.SkipToCvv.INSTANCE;
                    case 16:
                        parcel.getClass();
                        return new CardActivationScreen.CardActivationData.WithCode(parcel.readString());
                    case 17:
                        parcel.getClass();
                        return new CardActivationScreen((BlockersData) parcel.readParcelable(CardActivationScreen.class.getClassLoader()), (CardActivationScreen.CardActivationData) parcel.readParcelable(CardActivationScreen.class.getClassLoader()));
                    case 18:
                        parcel.getClass();
                        return new CashtagConfirmationScreen((BlockersData) parcel.readParcelable(CashtagConfirmationScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                    case 19:
                        parcel.getClass();
                        return new CashtagErrorScreen((BlockersData) parcel.readParcelable(CashtagErrorScreen.class.getClassLoader()), parcel.readString());
                    case 20:
                        parcel.getClass();
                        return new CheckmarkScreen((BlockersData) parcel.readParcelable(CheckmarkScreen.class.getClassLoader()));
                    case 21:
                        parcel.getClass();
                        return new ClientScenarioLauncher(BlockersData.Flow.valueOf(parcel.readString()), ClientScenario.valueOf(parcel.readString()), (Screen) parcel.readParcelable(ClientScenarioLauncher.class.getClassLoader()), (Screen) parcel.readParcelable(ClientScenarioLauncher.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, (BlockersData.AnalyticsData) parcel.readParcelable(ClientScenarioLauncher.class.getClassLoader()), (BlockersData.MoneybotContext) parcel.readParcelable(ClientScenarioLauncher.class.getClassLoader()), parcel.readInt() != 0);
                    case 22:
                        parcel.getClass();
                        return new ConfirmCvvScreen((BlockersData) parcel.readParcelable(ConfirmCvvScreen.class.getClassLoader()), parcel.readString(), SetPinScreen.TextOverrides.CREATOR.createFromParcel(parcel));
                    case 23:
                        parcel.getClass();
                        return new ConfirmExitOnboardingFlowScreen((BlockersData) parcel.readParcelable(ConfirmExitOnboardingFlowScreen.class.getClassLoader()));
                    case 24:
                        parcel.getClass();
                        return new ConfirmFirstScheduledReloadNoticeScreen((BlockersData) parcel.readParcelable(ConfirmFirstScheduledReloadNoticeScreen.class.getClassLoader()), parcel.readInt());
                    case 25:
                        parcel.getClass();
                        return new ConfirmHelp((BlockersData) parcel.readParcelable(ConfirmHelp.class.getClassLoader()), (HelpItem) parcel.readParcelable(ConfirmHelp.class.getClassLoader()));
                    case 26:
                        parcel.getClass();
                        return new ConfirmPaymentScreen((BlockersData) parcel.readParcelable(ConfirmPaymentScreen.class.getClassLoader()), (ConfirmBlockerSupplement) parcel.readParcelable(ConfirmPaymentScreen.class.getClassLoader()), parcel.readInt() != 0 ? PasscodeScreen.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (InstrumentSelection) parcel.readParcelable(ConfirmPaymentScreen.class.getClassLoader()));
                    case 27:
                        parcel.getClass();
                        return new ConfirmableOptionDialog((BlockersData) parcel.readParcelable(ConfirmableOptionDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    case 28:
                        BlockersData blockersData2 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, ContactVerificationScreen.class);
                        int readInt2 = parcel.readInt();
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int readInt3 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(readInt3);
                            while (i != readInt3) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(ContactVerificationScreen.class, parcel, arrayList4, i, 1);
                            }
                            arrayList2 = arrayList4;
                        }
                        return new ContactVerificationScreen(blockersData2, readInt2, readString, readString2, arrayList2, parcel.readString(), (BlockerAction) parcel.readParcelable(ContactVerificationScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(ContactVerificationScreen.class.getClassLoader()));
                    default:
                        parcel.getClass();
                        return new ContactsPermissionExplanationSheet((BlockersData) parcel.readParcelable(ContactsPermissionExplanationSheet.class.getClassLoader()));
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new CameraError[i];
                    case 1:
                        return new AtmPickerAmountBlockerScreen.BottomSheet[i];
                    case 2:
                        return new AtmPickerAmountBlockerScreen.Fullscreen[i];
                    case 3:
                        return new AuthorizeGooglePayScreen[i];
                    case 4:
                        return new BalanceTransferLoading[i];
                    case 5:
                        return new BankAccountLinkingScreen[i];
                    case 6:
                        return new BirthdayScreen[i];
                    case 7:
                        return new BitcoinAmountScreen[i];
                    case 8:
                        return new BlockerActionFileDownloadDialogScreen[i];
                    case 9:
                        return new BlockerActionFileDownloadFailureDialogScreen[i];
                    case 10:
                        return new BlockerContainerScreen.BlockerContainerBottomSheet[i];
                    case 11:
                        return new BusinessBackConfirmationScreen[i];
                    case 12:
                        return new CalendarBlockerScreen[i];
                    case 13:
                        return new CameraPermissionScreen[i];
                    case 14:
                        return new CardActivationQrScreen[i];
                    case 15:
                        return new CardActivationScreen.CardActivationData.SkipToCvv[i];
                    case 16:
                        return new CardActivationScreen.CardActivationData.WithCode[i];
                    case 17:
                        return new CardActivationScreen[i];
                    case 18:
                        return new CashtagConfirmationScreen[i];
                    case 19:
                        return new CashtagErrorScreen[i];
                    case 20:
                        return new CheckmarkScreen[i];
                    case 21:
                        return new ClientScenarioLauncher[i];
                    case 22:
                        return new ConfirmCvvScreen[i];
                    case 23:
                        return new ConfirmExitOnboardingFlowScreen[i];
                    case 24:
                        return new ConfirmFirstScheduledReloadNoticeScreen[i];
                    case 25:
                        return new ConfirmHelp[i];
                    case 26:
                        return new ConfirmPaymentScreen[i];
                    case 27:
                        return new ConfirmableOptionDialog[i];
                    case 28:
                        return new ContactVerificationScreen[i];
                    default:
                        return new ContactsPermissionExplanationSheet[i];
                }
            }
        }

        public CameraError(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraError) && Intrinsics.areEqual(this.blockersData, ((CameraError) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CameraError(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class CameraPermissionScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<CameraPermissionScreen> CREATOR = new CameraError.Creator(13);
        public final BlockersData blockersData;

        public CameraPermissionScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraPermissionScreen) && Intrinsics.areEqual(this.blockersData, ((CameraPermissionScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CameraPermissionScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class CardActivationQrScreen implements BlockersScreens {
        public static final Parcelable.Creator<CardActivationQrScreen> CREATOR = new CameraError.Creator(14);
        public final BlockersData blockersData;
        public final String buttonText;
        public final String instructionText;
        public final String titleText;

        public CardActivationQrScreen(BlockersData blockersData, String str, String str2, String str3) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.titleText = str;
            this.instructionText = str2;
            this.buttonText = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardActivationQrScreen)) {
                return false;
            }
            CardActivationQrScreen cardActivationQrScreen = (CardActivationQrScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cardActivationQrScreen.blockersData) && Intrinsics.areEqual(this.titleText, cardActivationQrScreen.titleText) && Intrinsics.areEqual(this.instructionText, cardActivationQrScreen.instructionText) && Intrinsics.areEqual(this.buttonText, cardActivationQrScreen.buttonText);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.titleText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.instructionText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CardActivationQrScreen(blockersData=", ", titleText=", this.titleText, ", instructionText="), this.instructionText, ", buttonText=", this.buttonText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.titleText);
            parcel.writeString(this.instructionText);
            parcel.writeString(this.buttonText);
        }
    }

    public final class CardActivationScreen implements BlockersScreens {
        public static final Parcelable.Creator<CardActivationScreen> CREATOR = new CameraError.Creator(17);
        public final CardActivationData activationData;
        public final BlockersData blockersData;

        /* loaded from: classes4.dex */
        public abstract class CardActivationData implements Parcelable {

            public final class SkipToCvv extends CardActivationData {
                public static final SkipToCvv INSTANCE = new SkipToCvv();
                public static final Parcelable.Creator<SkipToCvv> CREATOR = new CameraError.Creator(15);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SkipToCvv);
                }

                public final int hashCode() {
                    return -2025161443;
                }

                public final String toString() {
                    return "SkipToCvv";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class WithCode extends CardActivationData {
                public static final Parcelable.Creator<WithCode> CREATOR = new CameraError.Creator(16);
                public final String code;

                public WithCode(String str) {
                    str.getClass();
                    this.code = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.code);
                }
            }
        }

        public CardActivationScreen(BlockersData blockersData, CardActivationData cardActivationData) {
            blockersData.getClass();
            cardActivationData.getClass();
            this.blockersData = blockersData;
            this.activationData = cardActivationData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardActivationScreen)) {
                return false;
            }
            CardActivationScreen cardActivationScreen = (CardActivationScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cardActivationScreen.blockersData) && Intrinsics.areEqual(this.activationData, cardActivationScreen.activationData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.activationData.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "CardActivationScreen(blockersData=" + this.blockersData + ", activationData=" + this.activationData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.activationData, i);
        }
    }

    public interface CashAppPayGrant extends BlockersScreens {
        BlockerAction getAutoDismissAction();

        Long getAutoDismissDelayMs();

        PayWithCashAuthorizationBlocker.Avatar getAvatar();

        FormBlocker.Element.CallToActionElement getCallToActionElement();

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        BlockerAction getDismissAction();

        PayWithCashAuthorizationBlocker.Footer getFooter();

        Money getMoneyAmount();

        PayWithCashAuthorizationBlocker.Interstitial getOnDisplayInterstitial();

        String getSubtitle();

        String getTitle();
    }

    public final class CashAppPayGrantScreen implements CashAppPayGrant {
        public static final Parcelable.Creator<CashAppPayGrantScreen> CREATOR = new Creator();
        public final BlockerAction autoDismissAction;
        public final Long autoDismissDelayMs;
        public final PayWithCashAuthorizationBlocker.Avatar avatar;
        public final BlockersData blockersData;
        public final FormBlocker.Element.CallToActionElement callToActionElement;
        public final BlockerAction dismissAction;
        public final PayWithCashAuthorizationBlocker.Footer footer;
        public final Money moneyAmount;
        public final PayWithCashAuthorizationBlocker.Interstitial onDisplayInterstitial;
        public final String subtitle;
        public final String title;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CashAppPayGrantScreen((BlockersData) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), (PayWithCashAuthorizationBlocker.Avatar) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), (PayWithCashAuthorizationBlocker.Interstitial) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), (Money) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), (FormBlocker.Element.CallToActionElement) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), (PayWithCashAuthorizationBlocker.Footer) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BlockerAction) parcel.readParcelable(CashAppPayGrantScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashAppPayGrantScreen[i];
            }
        }

        public CashAppPayGrantScreen(BlockersData blockersData, PayWithCashAuthorizationBlocker.Avatar avatar, String str, String str2, PayWithCashAuthorizationBlocker.Interstitial interstitial, Money money, FormBlocker.Element.CallToActionElement callToActionElement, PayWithCashAuthorizationBlocker.Footer footer, BlockerAction blockerAction, Long l, BlockerAction blockerAction2) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.avatar = avatar;
            this.title = str;
            this.subtitle = str2;
            this.onDisplayInterstitial = interstitial;
            this.moneyAmount = money;
            this.callToActionElement = callToActionElement;
            this.footer = footer;
            this.dismissAction = blockerAction;
            this.autoDismissDelayMs = l;
            this.autoDismissAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashAppPayGrantScreen)) {
                return false;
            }
            CashAppPayGrantScreen cashAppPayGrantScreen = (CashAppPayGrantScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cashAppPayGrantScreen.blockersData) && Intrinsics.areEqual(this.avatar, cashAppPayGrantScreen.avatar) && Intrinsics.areEqual(this.title, cashAppPayGrantScreen.title) && Intrinsics.areEqual(this.subtitle, cashAppPayGrantScreen.subtitle) && Intrinsics.areEqual(this.onDisplayInterstitial, cashAppPayGrantScreen.onDisplayInterstitial) && Intrinsics.areEqual(this.moneyAmount, cashAppPayGrantScreen.moneyAmount) && Intrinsics.areEqual(this.callToActionElement, cashAppPayGrantScreen.callToActionElement) && Intrinsics.areEqual(this.footer, cashAppPayGrantScreen.footer) && Intrinsics.areEqual(this.dismissAction, cashAppPayGrantScreen.dismissAction) && Intrinsics.areEqual(this.autoDismissDelayMs, cashAppPayGrantScreen.autoDismissDelayMs) && Intrinsics.areEqual(this.autoDismissAction, cashAppPayGrantScreen.autoDismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final BlockerAction getAutoDismissAction() {
            return this.autoDismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final Long getAutoDismissDelayMs() {
            return this.autoDismissDelayMs;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Avatar getAvatar() {
            return this.avatar;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final FormBlocker.Element.CallToActionElement getCallToActionElement() {
            return this.callToActionElement;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant, com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Footer getFooter() {
            return this.footer;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final Money getMoneyAmount() {
            return this.moneyAmount;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Interstitial getOnDisplayInterstitial() {
            return this.onDisplayInterstitial;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            PayWithCashAuthorizationBlocker.Avatar avatar = this.avatar;
            int hashCode2 = (hashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PayWithCashAuthorizationBlocker.Interstitial interstitial = this.onDisplayInterstitial;
            int hashCode5 = (hashCode4 + (interstitial == null ? 0 : interstitial.hashCode())) * 31;
            Money money = this.moneyAmount;
            int hashCode6 = (hashCode5 + (money == null ? 0 : money.hashCode())) * 31;
            FormBlocker.Element.CallToActionElement callToActionElement = this.callToActionElement;
            int hashCode7 = (hashCode6 + (callToActionElement == null ? 0 : callToActionElement.hashCode())) * 31;
            PayWithCashAuthorizationBlocker.Footer footer = this.footer;
            int hashCode8 = (hashCode7 + (footer == null ? 0 : footer.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            int hashCode9 = (hashCode8 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            Long l = this.autoDismissDelayMs;
            int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
            BlockerAction blockerAction2 = this.autoDismissAction;
            return hashCode10 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CashAppPayGrantScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", onDisplayInterstitial=");
            sb.append(this.onDisplayInterstitial);
            sb.append(", moneyAmount=");
            sb.append(this.moneyAmount);
            sb.append(", callToActionElement=");
            sb.append(this.callToActionElement);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(", autoDismissDelayMs=");
            sb.append(this.autoDismissDelayMs);
            sb.append(", autoDismissAction=");
            sb.append(this.autoDismissAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.avatar, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.onDisplayInterstitial, i);
            parcel.writeParcelable(this.moneyAmount, i);
            parcel.writeParcelable(this.callToActionElement, i);
            parcel.writeParcelable(this.footer, i);
            parcel.writeParcelable(this.dismissAction, i);
            Long l = this.autoDismissDelayMs;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeParcelable(this.autoDismissAction, i);
        }
    }

    public final class CashAppPayGrantSheet implements CashAppPayGrant, BottomSheetScreen {
        public static final Parcelable.Creator<CashAppPayGrantSheet> CREATOR = new Creator();
        public final BlockerAction autoDismissAction;
        public final Long autoDismissDelayMs;
        public final PayWithCashAuthorizationBlocker.Avatar avatar;
        public final BlockersData blockersData;
        public final FormBlocker.Element.CallToActionElement callToActionElement;
        public final BlockerAction dismissAction;
        public final PayWithCashAuthorizationBlocker.Footer footer;
        public final Money moneyAmount;
        public final PayWithCashAuthorizationBlocker.Interstitial onDisplayInterstitial;
        public final String subtitle;
        public final String title;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CashAppPayGrantSheet((BlockersData) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), (PayWithCashAuthorizationBlocker.Avatar) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), parcel.readString(), parcel.readString(), (PayWithCashAuthorizationBlocker.Interstitial) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), (Money) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), (FormBlocker.Element.CallToActionElement) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), (PayWithCashAuthorizationBlocker.Footer) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BlockerAction) parcel.readParcelable(CashAppPayGrantSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashAppPayGrantSheet[i];
            }
        }

        public CashAppPayGrantSheet(BlockersData blockersData, PayWithCashAuthorizationBlocker.Avatar avatar, String str, String str2, PayWithCashAuthorizationBlocker.Interstitial interstitial, Money money, FormBlocker.Element.CallToActionElement callToActionElement, PayWithCashAuthorizationBlocker.Footer footer, BlockerAction blockerAction, Long l, BlockerAction blockerAction2) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.avatar = avatar;
            this.title = str;
            this.subtitle = str2;
            this.onDisplayInterstitial = interstitial;
            this.moneyAmount = money;
            this.callToActionElement = callToActionElement;
            this.footer = footer;
            this.dismissAction = blockerAction;
            this.autoDismissDelayMs = l;
            this.autoDismissAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashAppPayGrantSheet)) {
                return false;
            }
            CashAppPayGrantSheet cashAppPayGrantSheet = (CashAppPayGrantSheet) obj;
            return Intrinsics.areEqual(this.blockersData, cashAppPayGrantSheet.blockersData) && Intrinsics.areEqual(this.avatar, cashAppPayGrantSheet.avatar) && Intrinsics.areEqual(this.title, cashAppPayGrantSheet.title) && Intrinsics.areEqual(this.subtitle, cashAppPayGrantSheet.subtitle) && Intrinsics.areEqual(this.onDisplayInterstitial, cashAppPayGrantSheet.onDisplayInterstitial) && Intrinsics.areEqual(this.moneyAmount, cashAppPayGrantSheet.moneyAmount) && Intrinsics.areEqual(this.callToActionElement, cashAppPayGrantSheet.callToActionElement) && Intrinsics.areEqual(this.footer, cashAppPayGrantSheet.footer) && Intrinsics.areEqual(this.dismissAction, cashAppPayGrantSheet.dismissAction) && Intrinsics.areEqual(this.autoDismissDelayMs, cashAppPayGrantSheet.autoDismissDelayMs) && Intrinsics.areEqual(this.autoDismissAction, cashAppPayGrantSheet.autoDismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final BlockerAction getAutoDismissAction() {
            return this.autoDismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final Long getAutoDismissDelayMs() {
            return this.autoDismissDelayMs;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Avatar getAvatar() {
            return this.avatar;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final FormBlocker.Element.CallToActionElement getCallToActionElement() {
            return this.callToActionElement;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant, com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Footer getFooter() {
            return this.footer;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final Money getMoneyAmount() {
            return this.moneyAmount;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final PayWithCashAuthorizationBlocker.Interstitial getOnDisplayInterstitial() {
            return this.onDisplayInterstitial;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.CashAppPayGrant
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            PayWithCashAuthorizationBlocker.Avatar avatar = this.avatar;
            int hashCode2 = (hashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PayWithCashAuthorizationBlocker.Interstitial interstitial = this.onDisplayInterstitial;
            int hashCode5 = (hashCode4 + (interstitial == null ? 0 : interstitial.hashCode())) * 31;
            Money money = this.moneyAmount;
            int hashCode6 = (hashCode5 + (money == null ? 0 : money.hashCode())) * 31;
            FormBlocker.Element.CallToActionElement callToActionElement = this.callToActionElement;
            int hashCode7 = (hashCode6 + (callToActionElement == null ? 0 : callToActionElement.hashCode())) * 31;
            PayWithCashAuthorizationBlocker.Footer footer = this.footer;
            int hashCode8 = (hashCode7 + (footer == null ? 0 : footer.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            int hashCode9 = (hashCode8 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            Long l = this.autoDismissDelayMs;
            int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
            BlockerAction blockerAction2 = this.autoDismissAction;
            return hashCode10 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CashAppPayGrantSheet(blockersData=");
            sb.append(this.blockersData);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", onDisplayInterstitial=");
            sb.append(this.onDisplayInterstitial);
            sb.append(", moneyAmount=");
            sb.append(this.moneyAmount);
            sb.append(", callToActionElement=");
            sb.append(this.callToActionElement);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(", autoDismissDelayMs=");
            sb.append(this.autoDismissDelayMs);
            sb.append(", autoDismissAction=");
            sb.append(this.autoDismissAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.avatar, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.onDisplayInterstitial, i);
            parcel.writeParcelable(this.moneyAmount, i);
            parcel.writeParcelable(this.callToActionElement, i);
            parcel.writeParcelable(this.footer, i);
            parcel.writeParcelable(this.dismissAction, i);
            Long l = this.autoDismissDelayMs;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeParcelable(this.autoDismissAction, i);
        }
    }

    public final class CashtagConfirmationScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<CashtagConfirmationScreen> CREATOR = new CameraError.Creator(18);
        public final BlockersData blockersData;
        public final String cashtag;
        public final String message;

        public CashtagConfirmationScreen(BlockersData blockersData, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            this.blockersData = blockersData;
            this.message = str;
            this.cashtag = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashtagConfirmationScreen)) {
                return false;
            }
            CashtagConfirmationScreen cashtagConfirmationScreen = (CashtagConfirmationScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cashtagConfirmationScreen.blockersData) && Intrinsics.areEqual(this.message, cashtagConfirmationScreen.message) && Intrinsics.areEqual(this.cashtag, cashtagConfirmationScreen.cashtag);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.cashtag.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.message);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CashtagConfirmationScreen(blockersData=", ", message=", this.message, ", cashtag="), this.cashtag, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
            parcel.writeString(this.cashtag);
        }
    }

    public final class CashtagErrorScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<CashtagErrorScreen> CREATOR = new CameraError.Creator(19);
        public final BlockersData blockersData;
        public final String message;

        public CashtagErrorScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashtagErrorScreen)) {
                return false;
            }
            CashtagErrorScreen cashtagErrorScreen = (CashtagErrorScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cashtagErrorScreen.blockersData) && Intrinsics.areEqual(this.message, cashtagErrorScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "CashtagErrorScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class CashtagScreen implements BlockersScreens {
        public static final Parcelable.Creator<CashtagScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final String buttonText;
        public final CashtagBlocker.CashtagRestriction cashtagRestriction;
        public final BlockerAction dismissAction;
        public final boolean dismissButtonEnabled;
        public final String labelText;
        public final String subtitle;
        public final Redacted suggestedCashTag;
        public final String title;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CashtagScreen((BlockersData) parcel.readParcelable(CashtagScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(CashtagScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : CashtagBlocker.CashtagRestriction.valueOf(parcel.readString()), (BlockerAction) parcel.readParcelable(CashtagScreen.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashtagScreen[i];
            }
        }

        public CashtagScreen(BlockersData blockersData, String str, String str2, String str3, String str4, Redacted redacted, CashtagBlocker.CashtagRestriction cashtagRestriction, BlockerAction blockerAction, boolean z) {
            blockersData.getClass();
            redacted.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.subtitle = str2;
            this.labelText = str3;
            this.buttonText = str4;
            this.suggestedCashTag = redacted;
            this.cashtagRestriction = cashtagRestriction;
            this.dismissAction = blockerAction;
            this.dismissButtonEnabled = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashtagScreen)) {
                return false;
            }
            CashtagScreen cashtagScreen = (CashtagScreen) obj;
            return Intrinsics.areEqual(this.blockersData, cashtagScreen.blockersData) && Intrinsics.areEqual(this.title, cashtagScreen.title) && Intrinsics.areEqual(this.subtitle, cashtagScreen.subtitle) && Intrinsics.areEqual(this.labelText, cashtagScreen.labelText) && Intrinsics.areEqual(this.buttonText, cashtagScreen.buttonText) && Intrinsics.areEqual(this.suggestedCashTag, cashtagScreen.suggestedCashTag) && this.cashtagRestriction == cashtagScreen.cashtagRestriction && Intrinsics.areEqual(this.dismissAction, cashtagScreen.dismissAction) && this.dismissButtonEnabled == cashtagScreen.dismissButtonEnabled;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.labelText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonText;
            int m = re$$ExternalSyntheticOutline0.m(this.suggestedCashTag, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            CashtagBlocker.CashtagRestriction cashtagRestriction = this.cashtagRestriction;
            int hashCode5 = (m + (cashtagRestriction == null ? 0 : cashtagRestriction.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            return Boolean.hashCode(this.dismissButtonEnabled) + ((hashCode5 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CashtagScreen(blockersData=", ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", labelText=", this.labelText, ", buttonText=");
            m.append(this.buttonText);
            m.append(", suggestedCashTag=");
            m.append(this.suggestedCashTag);
            m.append(", cashtagRestriction=");
            m.append(this.cashtagRestriction);
            m.append(", dismissAction=");
            m.append(this.dismissAction);
            m.append(", dismissButtonEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.dismissButtonEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.labelText);
            parcel.writeString(this.buttonText);
            parcel.writeParcelable(this.suggestedCashTag, i);
            CashtagBlocker.CashtagRestriction cashtagRestriction = this.cashtagRestriction;
            if (cashtagRestriction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cashtagRestriction.name());
            }
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeInt(this.dismissButtonEnabled ? 1 : 0);
        }
    }

    public final class CheckmarkScreen implements BlockersScreens {
        public static final Parcelable.Creator<CheckmarkScreen> CREATOR = new CameraError.Creator(20);
        public final BlockersData blockersData;

        public CheckmarkScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckmarkScreen) && Intrinsics.areEqual(this.blockersData, ((CheckmarkScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CheckmarkScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public interface ChildBlockersScreens extends BlockersScreens {
    }

    public final class ClientScenarioLauncher implements Screen, NeverInBackStackScreen {
        public static final Parcelable.Creator<ClientScenarioLauncher> CREATOR = new CameraError.Creator(21);
        public final BlockersData.AnalyticsData analyticsData;
        public final ClientScenario clientScenario;
        public final String customFlowToken;
        public final Screen exitOnSuccess;
        public final BlockersData.Flow flow;
        public final boolean foreground;
        public final boolean goToRequesterOnError;
        public final BlockersData.MoneybotContext moneybotContext;
        public final List paymentTokens;
        public final String promotionToken;
        public final Screen requester;
        public final boolean skipBiometrics;

        public ClientScenarioLauncher(BlockersData.Flow flow, ClientScenario clientScenario, Screen screen, Screen screen2, boolean z, String str, String str2, List list, boolean z2, BlockersData.AnalyticsData analyticsData, BlockersData.MoneybotContext moneybotContext, boolean z3) {
            flow.getClass();
            clientScenario.getClass();
            screen.getClass();
            list.getClass();
            this.flow = flow;
            this.clientScenario = clientScenario;
            this.requester = screen;
            this.exitOnSuccess = screen2;
            this.foreground = z;
            this.customFlowToken = str;
            this.promotionToken = str2;
            this.paymentTokens = list;
            this.goToRequesterOnError = z2;
            this.analyticsData = analyticsData;
            this.moneybotContext = moneybotContext;
            this.skipBiometrics = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientScenarioLauncher)) {
                return false;
            }
            ClientScenarioLauncher clientScenarioLauncher = (ClientScenarioLauncher) obj;
            return this.flow == clientScenarioLauncher.flow && this.clientScenario == clientScenarioLauncher.clientScenario && Intrinsics.areEqual(this.requester, clientScenarioLauncher.requester) && Intrinsics.areEqual(this.exitOnSuccess, clientScenarioLauncher.exitOnSuccess) && this.foreground == clientScenarioLauncher.foreground && Intrinsics.areEqual(this.customFlowToken, clientScenarioLauncher.customFlowToken) && Intrinsics.areEqual(this.promotionToken, clientScenarioLauncher.promotionToken) && Intrinsics.areEqual(this.paymentTokens, clientScenarioLauncher.paymentTokens) && this.goToRequesterOnError == clientScenarioLauncher.goToRequesterOnError && Intrinsics.areEqual(this.analyticsData, clientScenarioLauncher.analyticsData) && Intrinsics.areEqual(this.moneybotContext, clientScenarioLauncher.moneybotContext) && this.skipBiometrics == clientScenarioLauncher.skipBiometrics;
        }

        public final int hashCode() {
            int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.requester, (this.clientScenario.hashCode() + (this.flow.hashCode() * 31)) * 31, 31);
            Screen screen = this.exitOnSuccess;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.foreground);
            String str = this.customFlowToken;
            int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promotionToken;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.paymentTokens), 31, this.goToRequesterOnError);
            BlockersData.AnalyticsData analyticsData = this.analyticsData;
            int hashCode2 = (m3 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
            return Boolean.hashCode(this.skipBiometrics) + ((hashCode2 + (moneybotContext != null ? moneybotContext.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClientScenarioLauncher(flow=");
            sb.append(this.flow);
            sb.append(", clientScenario=");
            sb.append(this.clientScenario);
            sb.append(", requester=");
            sb.append(this.requester);
            sb.append(", exitOnSuccess=");
            sb.append(this.exitOnSuccess);
            sb.append(", foreground=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.foreground, ", customFlowToken=", this.customFlowToken, ", promotionToken=");
            NavAction$$ExternalSyntheticOutline0.m(this.promotionToken, ", paymentTokens=", ", goToRequesterOnError=", sb, this.paymentTokens);
            sb.append(this.goToRequesterOnError);
            sb.append(", analyticsData=");
            sb.append(this.analyticsData);
            sb.append(", moneybotContext=");
            sb.append(this.moneybotContext);
            sb.append(", skipBiometrics=");
            sb.append(this.skipBiometrics);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flow.name());
            parcel.writeString(this.clientScenario.name());
            parcel.writeParcelable(this.requester, i);
            parcel.writeParcelable(this.exitOnSuccess, i);
            parcel.writeInt(this.foreground ? 1 : 0);
            parcel.writeString(this.customFlowToken);
            parcel.writeString(this.promotionToken);
            parcel.writeStringList(this.paymentTokens);
            parcel.writeInt(this.goToRequesterOnError ? 1 : 0);
            parcel.writeParcelable(this.analyticsData, i);
            parcel.writeParcelable(this.moneybotContext, i);
            parcel.writeInt(this.skipBiometrics ? 1 : 0);
        }
    }

    public final class ConfirmCvvScreen implements BlockersScreens {
        public static final Parcelable.Creator<ConfirmCvvScreen> CREATOR = new CameraError.Creator(22);
        public final BlockersData blockersData;
        public final String instrumentToken;
        public final SetPinScreen.TextOverrides setPinTextOverrides;

        public ConfirmCvvScreen(BlockersData blockersData, String str, SetPinScreen.TextOverrides textOverrides) {
            blockersData.getClass();
            textOverrides.getClass();
            this.blockersData = blockersData;
            this.instrumentToken = str;
            this.setPinTextOverrides = textOverrides;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmCvvScreen)) {
                return false;
            }
            ConfirmCvvScreen confirmCvvScreen = (ConfirmCvvScreen) obj;
            return Intrinsics.areEqual(this.blockersData, confirmCvvScreen.blockersData) && Intrinsics.areEqual(this.instrumentToken, confirmCvvScreen.instrumentToken) && Intrinsics.areEqual(this.setPinTextOverrides, confirmCvvScreen.setPinTextOverrides);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.instrumentToken;
            return this.setPinTextOverrides.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ConfirmCvvScreen(blockersData=", ", instrumentToken=", this.instrumentToken, ", setPinTextOverrides=");
            m.append(this.setPinTextOverrides);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.instrumentToken);
            this.setPinTextOverrides.writeToParcel(parcel, i);
        }
    }

    public final class ConfirmExitOnboardingFlowScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<ConfirmExitOnboardingFlowScreen> CREATOR = new CameraError.Creator(23);
        public final BlockersData blockersData;

        public ConfirmExitOnboardingFlowScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmExitOnboardingFlowScreen) && Intrinsics.areEqual(this.blockersData, ((ConfirmExitOnboardingFlowScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ConfirmExitOnboardingFlowScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class ConfirmFirstScheduledReloadNoticeScreen implements BlockersDialogScreens, DialogScreen {
        public static final Parcelable.Creator<ConfirmFirstScheduledReloadNoticeScreen> CREATOR = new CameraError.Creator(24);
        public final BlockersData blockersData;
        public final int selectedDate;

        public ConfirmFirstScheduledReloadNoticeScreen(BlockersData blockersData, int i) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.selectedDate = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmFirstScheduledReloadNoticeScreen)) {
                return false;
            }
            ConfirmFirstScheduledReloadNoticeScreen confirmFirstScheduledReloadNoticeScreen = (ConfirmFirstScheduledReloadNoticeScreen) obj;
            return Intrinsics.areEqual(this.blockersData, confirmFirstScheduledReloadNoticeScreen.blockersData) && this.selectedDate == confirmFirstScheduledReloadNoticeScreen.selectedDate;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return Integer.hashCode(this.selectedDate) + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmFirstScheduledReloadNoticeScreen(blockersData=" + this.blockersData + ", selectedDate=" + this.selectedDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.selectedDate);
        }
    }

    public final class ConfirmHelp implements BlockersDialogScreens {
        public static final Parcelable.Creator<ConfirmHelp> CREATOR = new CameraError.Creator(25);
        public final BlockersData blockersData;
        public final HelpItem item;

        public ConfirmHelp(BlockersData blockersData, HelpItem helpItem) {
            blockersData.getClass();
            helpItem.getClass();
            this.blockersData = blockersData;
            this.item = helpItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmHelp)) {
                return false;
            }
            ConfirmHelp confirmHelp = (ConfirmHelp) obj;
            return Intrinsics.areEqual(this.blockersData, confirmHelp.blockersData) && Intrinsics.areEqual(this.item, confirmHelp.item);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmHelp(blockersData=" + this.blockersData + ", item=" + this.item + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.item, i);
        }
    }

    public final class ConfirmPaymentScreen implements BlockersScreens {
        public static final Parcelable.Creator<ConfirmPaymentScreen> CREATOR = new CameraError.Creator(26);
        public final BlockersData blockersData;
        public final String duplicatePaymentToken;
        public final InstrumentSelection instrumentSelection;
        public final PasscodeScreen passcodeScreen;
        public final ConfirmBlockerSupplement supplement;

        public ConfirmPaymentScreen(BlockersData blockersData, ConfirmBlockerSupplement confirmBlockerSupplement, PasscodeScreen passcodeScreen, String str, InstrumentSelection instrumentSelection) {
            blockersData.getClass();
            confirmBlockerSupplement.getClass();
            this.blockersData = blockersData;
            this.supplement = confirmBlockerSupplement;
            this.passcodeScreen = passcodeScreen;
            this.duplicatePaymentToken = str;
            this.instrumentSelection = instrumentSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmPaymentScreen)) {
                return false;
            }
            ConfirmPaymentScreen confirmPaymentScreen = (ConfirmPaymentScreen) obj;
            return Intrinsics.areEqual(this.blockersData, confirmPaymentScreen.blockersData) && Intrinsics.areEqual(this.supplement, confirmPaymentScreen.supplement) && Intrinsics.areEqual(this.passcodeScreen, confirmPaymentScreen.passcodeScreen) && Intrinsics.areEqual(this.duplicatePaymentToken, confirmPaymentScreen.duplicatePaymentToken) && Intrinsics.areEqual(this.instrumentSelection, confirmPaymentScreen.instrumentSelection);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = (this.supplement.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            PasscodeScreen passcodeScreen = this.passcodeScreen;
            int hashCode2 = (hashCode + (passcodeScreen == null ? 0 : passcodeScreen.hashCode())) * 31;
            String str = this.duplicatePaymentToken;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            InstrumentSelection instrumentSelection = this.instrumentSelection;
            return hashCode3 + (instrumentSelection != null ? instrumentSelection.hashCode() : 0);
        }

        public final String toString() {
            return "ConfirmPaymentScreen(blockersData=" + this.blockersData + ", supplement=" + this.supplement + ", passcodeScreen=" + this.passcodeScreen + ", duplicatePaymentToken=" + this.duplicatePaymentToken + ", instrumentSelection=" + this.instrumentSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.supplement, i);
            PasscodeScreen passcodeScreen = this.passcodeScreen;
            if (passcodeScreen == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                passcodeScreen.writeToParcel(parcel, i);
            }
            parcel.writeString(this.duplicatePaymentToken);
            parcel.writeParcelable(this.instrumentSelection, i);
        }
    }

    public final class ConfirmableOptionDialog implements BlockersDialogScreens {
        public static final Parcelable.Creator<ConfirmableOptionDialog> CREATOR = new CameraError.Creator(27);
        public final BlockersData blockersData;
        public final String cancelButtonText;
        public final String confirmButtonText;
        public final String formElementId;
        public final String message;
        public final String optionId;
        public final String title;

        public ConfirmableOptionDialog(BlockersData blockersData, String str, String str2, String str3, String str4, String str5, String str6) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            this.blockersData = blockersData;
            this.formElementId = str;
            this.optionId = str2;
            this.title = str3;
            this.message = str4;
            this.confirmButtonText = str5;
            this.cancelButtonText = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmableOptionDialog)) {
                return false;
            }
            ConfirmableOptionDialog confirmableOptionDialog = (ConfirmableOptionDialog) obj;
            return Intrinsics.areEqual(this.blockersData, confirmableOptionDialog.blockersData) && Intrinsics.areEqual(this.formElementId, confirmableOptionDialog.formElementId) && Intrinsics.areEqual(this.optionId, confirmableOptionDialog.optionId) && Intrinsics.areEqual(this.title, confirmableOptionDialog.title) && Intrinsics.areEqual(this.message, confirmableOptionDialog.message) && Intrinsics.areEqual(this.confirmButtonText, confirmableOptionDialog.confirmButtonText) && Intrinsics.areEqual(this.cancelButtonText, confirmableOptionDialog.cancelButtonText);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.formElementId), 31, this.optionId), 31, this.title), 31, this.message), 31, this.confirmButtonText);
            String str = this.cancelButtonText;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ConfirmableOptionDialog(blockersData=", ", formElementId=", this.formElementId, ", optionId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.optionId, ", title=", this.title, ", message=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.message, ", confirmButtonText=", this.confirmButtonText, ", cancelButtonText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.cancelButtonText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.formElementId);
            parcel.writeString(this.optionId);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeString(this.confirmButtonText);
            parcel.writeString(this.cancelButtonText);
        }
    }

    public final class ContactVerificationScreen implements BlockersScreens {
        public static final Parcelable.Creator<ContactVerificationScreen> CREATOR = new CameraError.Creator(28);
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final List helpItems;
        public final int maxContacts;
        public final String primaryButtonText;
        public final BlockerAction retreatAction;
        public final String subtitle;
        public final String titleOverride;

        public ContactVerificationScreen(BlockersData blockersData, int i, String str, String str2, List list, String str3, BlockerAction blockerAction, BlockerAction blockerAction2) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.maxContacts = i;
            this.titleOverride = str;
            this.subtitle = str2;
            this.helpItems = list;
            this.primaryButtonText = str3;
            this.dismissAction = blockerAction;
            this.retreatAction = blockerAction2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactVerificationScreen)) {
                return false;
            }
            ContactVerificationScreen contactVerificationScreen = (ContactVerificationScreen) obj;
            return Intrinsics.areEqual(this.blockersData, contactVerificationScreen.blockersData) && this.maxContacts == contactVerificationScreen.maxContacts && Intrinsics.areEqual(this.titleOverride, contactVerificationScreen.titleOverride) && Intrinsics.areEqual(this.subtitle, contactVerificationScreen.subtitle) && Intrinsics.areEqual(this.helpItems, contactVerificationScreen.helpItems) && Intrinsics.areEqual(this.primaryButtonText, contactVerificationScreen.primaryButtonText) && Intrinsics.areEqual(this.dismissAction, contactVerificationScreen.dismissAction) && Intrinsics.areEqual(this.retreatAction, contactVerificationScreen.retreatAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getRetreatAction() {
            throw null;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxContacts, this.blockersData.hashCode() * 31, 31);
            String str = this.titleOverride;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.helpItems;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.primaryButtonText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            int hashCode5 = (hashCode4 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            BlockerAction blockerAction2 = this.retreatAction;
            return hashCode5 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContactVerificationScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", maxContacts=");
            sb.append(this.maxContacts);
            sb.append(", titleOverride=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.titleOverride, ", subtitle=", this.subtitle, ", helpItems=");
            Recorder$$ExternalSyntheticOutline2.m(", primaryButtonText=", this.primaryButtonText, ", dismissAction=", sb, this.helpItems);
            sb.append(this.dismissAction);
            sb.append(", retreatAction=");
            sb.append(this.retreatAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.maxContacts);
            parcel.writeString(this.titleOverride);
            parcel.writeString(this.subtitle);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.primaryButtonText);
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeParcelable(this.retreatAction, i);
        }
    }

    public final class ContactsPermissionExplanationSheet implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<ContactsPermissionExplanationSheet> CREATOR = new CameraError.Creator(29);
        public final BlockersData blockersData;

        public ContactsPermissionExplanationSheet(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactsPermissionExplanationSheet) && Intrinsics.areEqual(this.blockersData, ((ContactsPermissionExplanationSheet) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ContactsPermissionExplanationSheet(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class CreditFirstTimeBorrowBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<CreditFirstTimeBorrowBlockerScreen> CREATOR = new Error.Creator(1);
        public final CreditFirstTimeBorrowBlocker blocker;
        public final BlockersData blockersData;

        public CreditFirstTimeBorrowBlockerScreen(BlockersData blockersData, CreditFirstTimeBorrowBlocker creditFirstTimeBorrowBlocker) {
            blockersData.getClass();
            creditFirstTimeBorrowBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = creditFirstTimeBorrowBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditFirstTimeBorrowBlockerScreen)) {
                return false;
            }
            CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen = (CreditFirstTimeBorrowBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, creditFirstTimeBorrowBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, creditFirstTimeBorrowBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "CreditFirstTimeBorrowBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class CreditMultiStepLoadingBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<CreditMultiStepLoadingBlockerScreen> CREATOR = new Error.Creator(2);
        public final BlockersData blockersData;
        public final CreditMultiStepLoadingBlocker data;

        public CreditMultiStepLoadingBlockerScreen(BlockersData blockersData, CreditMultiStepLoadingBlocker creditMultiStepLoadingBlocker) {
            blockersData.getClass();
            creditMultiStepLoadingBlocker.getClass();
            this.blockersData = blockersData;
            this.data = creditMultiStepLoadingBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditMultiStepLoadingBlockerScreen)) {
                return false;
            }
            CreditMultiStepLoadingBlockerScreen creditMultiStepLoadingBlockerScreen = (CreditMultiStepLoadingBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, creditMultiStepLoadingBlockerScreen.blockersData) && Intrinsics.areEqual(this.data, creditMultiStepLoadingBlockerScreen.data);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "CreditMultiStepLoadingBlockerScreen(blockersData=" + this.blockersData + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.data, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class EarnerEnrollmentBlockerScreen implements EarnerEnrollmentBlockerScreenArgs {
        public static final Parcelable.Creator<EarnerEnrollmentBlockerScreen> CREATOR = new Error.Creator(3);
        public final EarnerEnrollmentBlocker blocker;
        public final BlockersData blockersData;

        public EarnerEnrollmentBlockerScreen(BlockersData blockersData, EarnerEnrollmentBlocker earnerEnrollmentBlocker) {
            blockersData.getClass();
            earnerEnrollmentBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerEnrollmentBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerEnrollmentBlockerScreen)) {
                return false;
            }
            EarnerEnrollmentBlockerScreen earnerEnrollmentBlockerScreen = (EarnerEnrollmentBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, earnerEnrollmentBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, earnerEnrollmentBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerEnrollmentBlockerScreenArgs
        public final EarnerEnrollmentBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerEnrollmentBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public interface EarnerEnrollmentBlockerScreenArgs extends BlockersScreens {
        EarnerEnrollmentBlocker getBlocker();
    }

    /* loaded from: classes4.dex */
    public final class EarnerEnrollmentBlockerSheet implements EarnerEnrollmentBlockerScreenArgs, Screen, OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<EarnerEnrollmentBlockerSheet> CREATOR = new Error.Creator(4);
        public final EarnerEnrollmentBlocker blocker;
        public final BlockersData blockersData;

        public EarnerEnrollmentBlockerSheet(BlockersData blockersData, EarnerEnrollmentBlocker earnerEnrollmentBlocker) {
            blockersData.getClass();
            earnerEnrollmentBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerEnrollmentBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerEnrollmentBlockerSheet)) {
                return false;
            }
            EarnerEnrollmentBlockerSheet earnerEnrollmentBlockerSheet = (EarnerEnrollmentBlockerSheet) obj;
            return Intrinsics.areEqual(this.blockersData, earnerEnrollmentBlockerSheet.blockersData) && Intrinsics.areEqual(this.blocker, earnerEnrollmentBlockerSheet.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerEnrollmentBlockerScreenArgs
        public final EarnerEnrollmentBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerEnrollmentBlockerSheet(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class EarnerEnrollmentSuccessBlockerScreen implements EarnerEnrollmentSuccessBlockerScreenArgs {
        public static final Parcelable.Creator<EarnerEnrollmentSuccessBlockerScreen> CREATOR = new Error.Creator(5);
        public final EarnerEnrollmentSuccessBlocker blocker;
        public final BlockersData blockersData;

        public EarnerEnrollmentSuccessBlockerScreen(BlockersData blockersData, EarnerEnrollmentSuccessBlocker earnerEnrollmentSuccessBlocker) {
            blockersData.getClass();
            earnerEnrollmentSuccessBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerEnrollmentSuccessBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerEnrollmentSuccessBlockerScreen)) {
                return false;
            }
            EarnerEnrollmentSuccessBlockerScreen earnerEnrollmentSuccessBlockerScreen = (EarnerEnrollmentSuccessBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, earnerEnrollmentSuccessBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, earnerEnrollmentSuccessBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs
        public final EarnerEnrollmentSuccessBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerEnrollmentSuccessBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public interface EarnerEnrollmentSuccessBlockerScreenArgs extends BlockersScreens {
        EarnerEnrollmentSuccessBlocker getBlocker();
    }

    /* loaded from: classes4.dex */
    public final class EarnerEnrollmentSuccessBlockerSheet implements EarnerEnrollmentSuccessBlockerScreenArgs, Screen, OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<EarnerEnrollmentSuccessBlockerSheet> CREATOR = new Error.Creator(6);
        public final EarnerEnrollmentSuccessBlocker blocker;
        public final BlockersData blockersData;

        public EarnerEnrollmentSuccessBlockerSheet(BlockersData blockersData, EarnerEnrollmentSuccessBlocker earnerEnrollmentSuccessBlocker) {
            blockersData.getClass();
            earnerEnrollmentSuccessBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerEnrollmentSuccessBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerEnrollmentSuccessBlockerSheet)) {
                return false;
            }
            EarnerEnrollmentSuccessBlockerSheet earnerEnrollmentSuccessBlockerSheet = (EarnerEnrollmentSuccessBlockerSheet) obj;
            return Intrinsics.areEqual(this.blockersData, earnerEnrollmentSuccessBlockerSheet.blockersData) && Intrinsics.areEqual(this.blocker, earnerEnrollmentSuccessBlockerSheet.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs
        public final EarnerEnrollmentSuccessBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerEnrollmentSuccessBlockerSheet(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class EarnerUpsellBlockerScreen implements EarnerUpsellBlockerScreenArgs {
        public static final Parcelable.Creator<EarnerUpsellBlockerScreen> CREATOR = new Error.Creator(7);
        public final EarnerUpsellBlocker blocker;
        public final BlockersData blockersData;

        public EarnerUpsellBlockerScreen(BlockersData blockersData, EarnerUpsellBlocker earnerUpsellBlocker) {
            blockersData.getClass();
            earnerUpsellBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerUpsellBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerUpsellBlockerScreen)) {
                return false;
            }
            EarnerUpsellBlockerScreen earnerUpsellBlockerScreen = (EarnerUpsellBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, earnerUpsellBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, earnerUpsellBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerUpsellBlockerScreenArgs
        public final EarnerUpsellBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerUpsellBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public interface EarnerUpsellBlockerScreenArgs extends BlockersScreens {
        EarnerUpsellBlocker getBlocker();
    }

    /* loaded from: classes4.dex */
    public final class EarnerUpsellBlockerSheet implements EarnerUpsellBlockerScreenArgs, Screen, OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<EarnerUpsellBlockerSheet> CREATOR = new Error.Creator(8);
        public final EarnerUpsellBlocker blocker;
        public final BlockersData blockersData;

        public EarnerUpsellBlockerSheet(BlockersData blockersData, EarnerUpsellBlocker earnerUpsellBlocker) {
            blockersData.getClass();
            earnerUpsellBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = earnerUpsellBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerUpsellBlockerSheet)) {
                return false;
            }
            EarnerUpsellBlockerSheet earnerUpsellBlockerSheet = (EarnerUpsellBlockerSheet) obj;
            return Intrinsics.areEqual(this.blockersData, earnerUpsellBlockerSheet.blockersData) && Intrinsics.areEqual(this.blocker, earnerUpsellBlockerSheet.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.EarnerUpsellBlockerScreenArgs
        public final EarnerUpsellBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerUpsellBlockerSheet(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class Error implements BlockersDialogScreens {
        public static final Parcelable.Creator<Error> CREATOR = new Creator(0);
        public final BlockersData blockersData;
        public final String message;
        public final String title;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                BlockersData blockersData;
                boolean z6;
                InstrumentSelectionData.InstrumentOption instrumentOption;
                InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog optionDialog;
                boolean z7;
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        return new Error((BlockersData) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString(), parcel.readString());
                    case 1:
                        parcel.getClass();
                        return new CreditFirstTimeBorrowBlockerScreen((BlockersData) parcel.readParcelable(CreditFirstTimeBorrowBlockerScreen.class.getClassLoader()), (CreditFirstTimeBorrowBlocker) parcel.readParcelable(CreditFirstTimeBorrowBlockerScreen.class.getClassLoader()));
                    case 2:
                        parcel.getClass();
                        return new CreditMultiStepLoadingBlockerScreen((BlockersData) parcel.readParcelable(CreditMultiStepLoadingBlockerScreen.class.getClassLoader()), (CreditMultiStepLoadingBlocker) parcel.readParcelable(CreditMultiStepLoadingBlockerScreen.class.getClassLoader()));
                    case 3:
                        parcel.getClass();
                        return new EarnerEnrollmentBlockerScreen((BlockersData) parcel.readParcelable(EarnerEnrollmentBlockerScreen.class.getClassLoader()), (EarnerEnrollmentBlocker) parcel.readParcelable(EarnerEnrollmentBlockerScreen.class.getClassLoader()));
                    case 4:
                        parcel.getClass();
                        return new EarnerEnrollmentBlockerSheet((BlockersData) parcel.readParcelable(EarnerEnrollmentBlockerSheet.class.getClassLoader()), (EarnerEnrollmentBlocker) parcel.readParcelable(EarnerEnrollmentBlockerSheet.class.getClassLoader()));
                    case 5:
                        parcel.getClass();
                        return new EarnerEnrollmentSuccessBlockerScreen((BlockersData) parcel.readParcelable(EarnerEnrollmentSuccessBlockerScreen.class.getClassLoader()), (EarnerEnrollmentSuccessBlocker) parcel.readParcelable(EarnerEnrollmentSuccessBlockerScreen.class.getClassLoader()));
                    case 6:
                        parcel.getClass();
                        return new EarnerEnrollmentSuccessBlockerSheet((BlockersData) parcel.readParcelable(EarnerEnrollmentSuccessBlockerSheet.class.getClassLoader()), (EarnerEnrollmentSuccessBlocker) parcel.readParcelable(EarnerEnrollmentSuccessBlockerSheet.class.getClassLoader()));
                    case 7:
                        parcel.getClass();
                        return new EarnerUpsellBlockerScreen((BlockersData) parcel.readParcelable(EarnerUpsellBlockerScreen.class.getClassLoader()), (EarnerUpsellBlocker) parcel.readParcelable(EarnerUpsellBlockerScreen.class.getClassLoader()));
                    case 8:
                        parcel.getClass();
                        return new EarnerUpsellBlockerSheet((BlockersData) parcel.readParcelable(EarnerUpsellBlockerSheet.class.getClassLoader()), (EarnerUpsellBlocker) parcel.readParcelable(EarnerUpsellBlockerSheet.class.getClassLoader()));
                    case 9:
                        parcel.getClass();
                        return new FileBlockerExplanation((BlockersData) parcel.readParcelable(FileBlockerExplanation.class.getClassLoader()), parcel.readInt());
                    case 10:
                        parcel.getClass();
                        return new FilesetUploadErrorDialog((BlockersData) parcel.readParcelable(FilesetUploadErrorDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    case 11:
                        parcel.getClass();
                        return new FilesetUploadLoadingDialog((BlockersData) parcel.readParcelable(FilesetUploadLoadingDialog.class.getClassLoader()));
                    case 12:
                        parcel.getClass();
                        return new FilesetUploadOptionsBottomSheet((BlockersData) parcel.readParcelable(FilesetUploadOptionsBottomSheet.class.getClassLoader()));
                    case 13:
                        int i = 0;
                        BlockersData blockersData2 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, FilesetUploadScreen.class);
                        BlockerAction blockerAction = (BlockerAction) parcel.readParcelable(FilesetUploadScreen.class.getClassLoader());
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        long readLong = parcel.readLong();
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        String readString3 = parcel.readString();
                        BlockerAction blockerAction2 = (BlockerAction) parcel.readParcelable(FilesetUploadScreen.class.getClassLoader());
                        BlockerAction blockerAction3 = (BlockerAction) parcel.readParcelable(FilesetUploadScreen.class.getClassLoader());
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt3);
                        while (i != readInt3) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(FilesetUploadScreen.class, parcel, arrayList2, i, 1);
                        }
                        return new FilesetUploadScreen(blockersData2, blockerAction, readString, readString2, readLong, readInt, readInt2, readString3, blockerAction2, blockerAction3, arrayList2);
                    case 14:
                        parcel.getClass();
                        return new GooglePayActivationScreen((BlockersData) parcel.readParcelable(GooglePayActivationScreen.class.getClassLoader()), parcel.readString());
                    case 15:
                        parcel.getClass();
                        return new GooglePayCompleteProvisioningScreen((BlockersData) parcel.readParcelable(GooglePayCompleteProvisioningScreen.class.getClassLoader()));
                    case 16:
                        boolean z8 = true;
                        parcel.getClass();
                        if (parcel.readInt() == 0) {
                            z8 = false;
                        }
                        return new GooglePayProvisioningExitScreen(z8);
                    case 17:
                        parcel.getClass();
                        return new GpsLocationConsentBlockerScreen((BlockersData) parcel.readParcelable(GpsLocationConsentBlockerScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(GpsLocationConsentBlockerScreen.class.getClassLoader()), (GpsLocationConsentBlocker) parcel.readParcelable(GpsLocationConsentBlockerScreen.class.getClassLoader()));
                    case 18:
                        parcel.getClass();
                        return new HelpItemMessage((BlockersData) parcel.readParcelable(HelpItemMessage.class.getClassLoader()), parcel.readString(), parcel.readString());
                    case 19:
                        int i2 = 0;
                        BlockersData blockersData3 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, HelpOptions.Impl.class);
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt4 = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(readInt4);
                            while (i2 != readInt4) {
                                i2 = CameraState$Type$EnumUnboxingLocalUtility.m(HelpOptions.Impl.class, parcel, arrayList3, i2, 1);
                            }
                            arrayList = arrayList3;
                        }
                        return new HelpOptions.Impl(blockersData3, arrayList);
                    case 20:
                        parcel.getClass();
                        return new IneligibleMergeScreen((BlockersData) parcel.readParcelable(IneligibleMergeScreen.class.getClassLoader()), parcel.readString());
                    case 21:
                        boolean z9 = false;
                        parcel.getClass();
                        BlockersData blockersData4 = (BlockersData) parcel.readParcelable(InputCardInfoScreen.class.getClassLoader());
                        CashInstrumentType valueOf = CashInstrumentType.valueOf(parcel.readString());
                        Redacted redacted = (Redacted) parcel.readParcelable(InputCardInfoScreen.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z = false;
                            z9 = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = z;
                            z = true;
                        } else {
                            z2 = z;
                        }
                        if (parcel.readInt() != 0) {
                            z3 = z2;
                            z2 = true;
                        } else {
                            z3 = z2;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = z3;
                            z3 = true;
                        } else {
                            z4 = z3;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        return new InputCardInfoScreen(blockersData4, valueOf, redacted, z9, z, z2, z3, z4, (BlockerAction) parcel.readParcelable(InputCardInfoScreen.class.getClassLoader()));
                    case 22:
                        parcel.getClass();
                        return new InstrumentSelectionDetailsDialogScreen((BlockersData) parcel.readParcelable(InstrumentSelectionDetailsDialogScreen.class.getClassLoader()), InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog.CREATOR.createFromParcel(parcel));
                    case 23:
                        parcel.getClass();
                        BlockersData blockersData5 = (BlockersData) parcel.readParcelable(InstrumentSelectionDetailsScreen.class.getClassLoader());
                        InstrumentSelectionData.InstrumentOption instrumentOption2 = (InstrumentSelectionData.InstrumentOption) parcel.readParcelable(InstrumentSelectionDetailsScreen.class.getClassLoader());
                        InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog createFromParcel = InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() != 0) {
                            z5 = false;
                            blockersData = blockersData5;
                            z6 = true;
                        } else {
                            z5 = false;
                            blockersData = blockersData5;
                            z6 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z7 = true;
                            instrumentOption = instrumentOption2;
                            optionDialog = createFromParcel;
                        } else {
                            instrumentOption = instrumentOption2;
                            optionDialog = createFromParcel;
                            z7 = z5;
                        }
                        return new InstrumentSelectionDetailsScreen(blockersData, instrumentOption, optionDialog, z6, z7);
                    case 24:
                        parcel.getClass();
                        parcel.readInt();
                        return InstrumentSelectionDetailsScreen.Result.Cancel.INSTANCE;
                    case 25:
                        parcel.getClass();
                        return new InstrumentSelectionDetailsScreen.Result.InstrumentResult(parcel.readInt(), (BlockerAction) parcel.readParcelable(InstrumentSelectionDetailsScreen.Result.InstrumentResult.class.getClassLoader()));
                    case 26:
                        BlockersData blockersData6 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, InstrumentSelectionListScreen.class);
                        String readString4 = parcel.readString();
                        int readInt5 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(readInt5);
                        int i3 = 0;
                        while (i3 != readInt5) {
                            i3 = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionListScreen.class, parcel, arrayList4, i3, 1);
                        }
                        return new InstrumentSelectionListScreen(blockersData6, readString4, arrayList4, parcel.readString(), parcel.readInt() != 0);
                    case 27:
                        parcel.getClass();
                        return new InstrumentSelectionListScreen.InstrumentResult(parcel.readInt());
                    case 28:
                        parcel.getClass();
                        return new InstrumentSelectionScreen((BlockersData) parcel.readParcelable(InstrumentSelectionScreen.class.getClassLoader()), InstrumentSelectionData.CREATOR.createFromParcel(parcel));
                    default:
                        parcel.getClass();
                        return new InvalidInputScreen((BlockersData) parcel.readParcelable(InvalidInputScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new Error[i];
                    case 1:
                        return new CreditFirstTimeBorrowBlockerScreen[i];
                    case 2:
                        return new CreditMultiStepLoadingBlockerScreen[i];
                    case 3:
                        return new EarnerEnrollmentBlockerScreen[i];
                    case 4:
                        return new EarnerEnrollmentBlockerSheet[i];
                    case 5:
                        return new EarnerEnrollmentSuccessBlockerScreen[i];
                    case 6:
                        return new EarnerEnrollmentSuccessBlockerSheet[i];
                    case 7:
                        return new EarnerUpsellBlockerScreen[i];
                    case 8:
                        return new EarnerUpsellBlockerSheet[i];
                    case 9:
                        return new FileBlockerExplanation[i];
                    case 10:
                        return new FilesetUploadErrorDialog[i];
                    case 11:
                        return new FilesetUploadLoadingDialog[i];
                    case 12:
                        return new FilesetUploadOptionsBottomSheet[i];
                    case 13:
                        return new FilesetUploadScreen[i];
                    case 14:
                        return new GooglePayActivationScreen[i];
                    case 15:
                        return new GooglePayCompleteProvisioningScreen[i];
                    case 16:
                        return new GooglePayProvisioningExitScreen[i];
                    case 17:
                        return new GpsLocationConsentBlockerScreen[i];
                    case 18:
                        return new HelpItemMessage[i];
                    case 19:
                        return new HelpOptions.Impl[i];
                    case 20:
                        return new IneligibleMergeScreen[i];
                    case 21:
                        return new InputCardInfoScreen[i];
                    case 22:
                        return new InstrumentSelectionDetailsDialogScreen[i];
                    case 23:
                        return new InstrumentSelectionDetailsScreen[i];
                    case 24:
                        return new InstrumentSelectionDetailsScreen.Result.Cancel[i];
                    case 25:
                        return new InstrumentSelectionDetailsScreen.Result.InstrumentResult[i];
                    case 26:
                        return new InstrumentSelectionListScreen[i];
                    case 27:
                        return new InstrumentSelectionListScreen.InstrumentResult[i];
                    case 28:
                        return new InstrumentSelectionScreen[i];
                    default:
                        return new InvalidInputScreen[i];
                }
            }
        }

        public Error(BlockersData blockersData, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.blockersData, error.blockersData) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.title, error.title);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.message);
            String str = this.title;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "Error(blockersData=", ", message=", this.message, ", title="), this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
            parcel.writeString(this.title);
        }
    }

    public final class FileBlockerExplanation implements BlockersDialogScreens {
        public static final Parcelable.Creator<FileBlockerExplanation> CREATOR = new Error.Creator(9);
        public final BlockersData blockersData;
        public final int message;

        public FileBlockerExplanation(BlockersData blockersData, int i) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.message = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileBlockerExplanation)) {
                return false;
            }
            FileBlockerExplanation fileBlockerExplanation = (FileBlockerExplanation) obj;
            return Intrinsics.areEqual(this.blockersData, fileBlockerExplanation.blockersData) && this.message == fileBlockerExplanation.message;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return Integer.hashCode(this.message) + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "FileBlockerExplanation(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.message);
        }
    }

    public final class FileBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<FileBlockerScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final FileCategory category;
        public final String confirmationMainText;
        public final FileBlocker.FooterIcon footerIcon;
        public final String footerText;
        public final List helpItems;
        public final String mainText;

        /* loaded from: classes8.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, FileBlockerScreen.class);
                FileCategory valueOf = FileCategory.valueOf(parcel.readString());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ArrayList arrayList = null;
                FileBlocker.FooterIcon valueOf2 = parcel.readInt() == 0 ? null : FileBlocker.FooterIcon.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(FileBlockerScreen.class, parcel, arrayList, i, 1);
                    }
                }
                return new FileBlockerScreen(blockersData, valueOf, readString, readString2, readString3, valueOf2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FileBlockerScreen[i];
            }
        }

        public FileBlockerScreen(BlockersData blockersData, FileCategory fileCategory, String str, String str2, String str3, FileBlocker.FooterIcon footerIcon, List list) {
            blockersData.getClass();
            fileCategory.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.category = fileCategory;
            this.mainText = str;
            this.confirmationMainText = str2;
            this.footerText = str3;
            this.footerIcon = footerIcon;
            this.helpItems = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileBlockerScreen)) {
                return false;
            }
            FileBlockerScreen fileBlockerScreen = (FileBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, fileBlockerScreen.blockersData) && this.category == fileBlockerScreen.category && Intrinsics.areEqual(this.mainText, fileBlockerScreen.mainText) && Intrinsics.areEqual(this.confirmationMainText, fileBlockerScreen.confirmationMainText) && Intrinsics.areEqual(this.footerText, fileBlockerScreen.footerText) && this.footerIcon == fileBlockerScreen.footerIcon && Intrinsics.areEqual(this.helpItems, fileBlockerScreen.helpItems);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.category.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31, this.mainText);
            String str = this.confirmationMainText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.footerText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            FileBlocker.FooterIcon footerIcon = this.footerIcon;
            int hashCode3 = (hashCode2 + (footerIcon == null ? 0 : footerIcon.hashCode())) * 31;
            List list = this.helpItems;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FileBlockerScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", category=");
            sb.append(this.category);
            sb.append(", mainText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.mainText, ", confirmationMainText=", this.confirmationMainText, ", footerText=");
            sb.append(this.footerText);
            sb.append(", footerIcon=");
            sb.append(this.footerIcon);
            sb.append(", helpItems=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.helpItems, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.category.name());
            parcel.writeString(this.mainText);
            parcel.writeString(this.confirmationMainText);
            parcel.writeString(this.footerText);
            FileBlocker.FooterIcon footerIcon = this.footerIcon;
            if (footerIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(footerIcon.name());
            }
            List list = this.helpItems;
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

    public final class FilesetUploadErrorDialog implements BlockersDialogScreens {
        public static final Parcelable.Creator<FilesetUploadErrorDialog> CREATOR = new Error.Creator(10);
        public final BlockersData blockersData;
        public final String cancelButtonText;
        public final String message;
        public final boolean showRetryButton;
        public final String title;

        public FilesetUploadErrorDialog(BlockersData blockersData, String str, String str2, String str3, boolean z) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.message = str2;
            this.cancelButtonText = str3;
            this.showRetryButton = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilesetUploadErrorDialog)) {
                return false;
            }
            FilesetUploadErrorDialog filesetUploadErrorDialog = (FilesetUploadErrorDialog) obj;
            return Intrinsics.areEqual(this.blockersData, filesetUploadErrorDialog.blockersData) && Intrinsics.areEqual(this.title, filesetUploadErrorDialog.title) && Intrinsics.areEqual(this.message, filesetUploadErrorDialog.message) && Intrinsics.areEqual(this.cancelButtonText, filesetUploadErrorDialog.cancelButtonText) && this.showRetryButton == filesetUploadErrorDialog.showRetryButton;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showRetryButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.message), 31, this.cancelButtonText);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "FilesetUploadErrorDialog(blockersData=", ", title=", this.title, ", message=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.message, ", cancelButtonText=", this.cancelButtonText, ", showRetryButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showRetryButton, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeString(this.cancelButtonText);
            parcel.writeInt(this.showRetryButton ? 1 : 0);
        }
    }

    public final class FilesetUploadLoadingDialog implements BlockersDialogScreens {
        public static final Parcelable.Creator<FilesetUploadLoadingDialog> CREATOR = new Error.Creator(11);
        public final BlockersData blockersData;

        public FilesetUploadLoadingDialog(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilesetUploadLoadingDialog) && Intrinsics.areEqual(this.blockersData, ((FilesetUploadLoadingDialog) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "FilesetUploadLoadingDialog(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class FilesetUploadOptionsBottomSheet implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<FilesetUploadOptionsBottomSheet> CREATOR = new Error.Creator(12);
        public final BlockersData blockersData;

        public FilesetUploadOptionsBottomSheet(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilesetUploadOptionsBottomSheet) && Intrinsics.areEqual(this.blockersData, ((FilesetUploadOptionsBottomSheet) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "FilesetUploadOptionsBottomSheet(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class FilesetUploadScreen implements BlockersScreens {
        public static final Parcelable.Creator<FilesetUploadScreen> CREATOR = new Error.Creator(13);
        public final BlockersData blockersData;
        public final String detailText;
        public final BlockerAction dismissAction;
        public final List existingFiles;
        public final int fileCountLimit;
        public final long fileSizeLimitBytes;
        public final int minimumFileCount;
        public final BlockerAction primaryAction;
        public final BlockerAction secondaryAction;
        public final String title;
        public final String uploadContext;

        public FilesetUploadScreen(BlockersData blockersData, BlockerAction blockerAction, String str, String str2, long j, int i, int i2, String str3, BlockerAction blockerAction2, BlockerAction blockerAction3, List list) {
            blockersData.getClass();
            blockerAction.getClass();
            str.getClass();
            list.getClass();
            this.blockersData = blockersData;
            this.dismissAction = blockerAction;
            this.title = str;
            this.detailText = str2;
            this.fileSizeLimitBytes = j;
            this.fileCountLimit = i;
            this.minimumFileCount = i2;
            this.uploadContext = str3;
            this.primaryAction = blockerAction2;
            this.secondaryAction = blockerAction3;
            this.existingFiles = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilesetUploadScreen)) {
                return false;
            }
            FilesetUploadScreen filesetUploadScreen = (FilesetUploadScreen) obj;
            return Intrinsics.areEqual(this.blockersData, filesetUploadScreen.blockersData) && Intrinsics.areEqual(this.dismissAction, filesetUploadScreen.dismissAction) && Intrinsics.areEqual(this.title, filesetUploadScreen.title) && Intrinsics.areEqual(this.detailText, filesetUploadScreen.detailText) && this.fileSizeLimitBytes == filesetUploadScreen.fileSizeLimitBytes && this.fileCountLimit == filesetUploadScreen.fileCountLimit && this.minimumFileCount == filesetUploadScreen.minimumFileCount && Intrinsics.areEqual(this.uploadContext, filesetUploadScreen.uploadContext) && Intrinsics.areEqual(this.primaryAction, filesetUploadScreen.primaryAction) && Intrinsics.areEqual(this.secondaryAction, filesetUploadScreen.secondaryAction) && Intrinsics.areEqual(this.existingFiles, filesetUploadScreen.existingFiles);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.dismissAction.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31, this.title);
            String str = this.detailText;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minimumFileCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fileCountLimit, Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.fileSizeLimitBytes), 31), 31);
            String str2 = this.uploadContext;
            int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BlockerAction blockerAction = this.primaryAction;
            int hashCode2 = (hashCode + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            BlockerAction blockerAction2 = this.secondaryAction;
            return this.existingFiles.hashCode() + ((hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilesetUploadScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", detailText=", this.detailText, ", fileSizeLimitBytes=");
            sb.append(this.fileSizeLimitBytes);
            sb.append(", fileCountLimit=");
            sb.append(this.fileCountLimit);
            sb.append(", minimumFileCount=");
            sb.append(this.minimumFileCount);
            sb.append(", uploadContext=");
            sb.append(this.uploadContext);
            sb.append(", primaryAction=");
            sb.append(this.primaryAction);
            sb.append(", secondaryAction=");
            sb.append(this.secondaryAction);
            sb.append(", existingFiles=");
            sb.append(this.existingFiles);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeString(this.title);
            parcel.writeString(this.detailText);
            parcel.writeLong(this.fileSizeLimitBytes);
            parcel.writeInt(this.fileCountLimit);
            parcel.writeInt(this.minimumFileCount);
            parcel.writeString(this.uploadContext);
            parcel.writeParcelable(this.primaryAction, i);
            parcel.writeParcelable(this.secondaryAction, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.existingFiles, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public final class FormMenuActionSheet implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<FormMenuActionSheet> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final BlockerAction.MenuAction menuAction;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FormMenuActionSheet((BlockersData) parcel.readParcelable(FormMenuActionSheet.class.getClassLoader()), (BlockerAction.MenuAction) parcel.readParcelable(FormMenuActionSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FormMenuActionSheet[i];
            }
        }

        public FormMenuActionSheet(BlockersData blockersData, BlockerAction.MenuAction menuAction) {
            blockersData.getClass();
            menuAction.getClass();
            this.blockersData = blockersData;
            this.menuAction = menuAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormMenuActionSheet)) {
                return false;
            }
            FormMenuActionSheet formMenuActionSheet = (FormMenuActionSheet) obj;
            return Intrinsics.areEqual(this.blockersData, formMenuActionSheet.blockersData) && Intrinsics.areEqual(this.menuAction, formMenuActionSheet.menuAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.menuAction.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "FormMenuActionSheet(blockersData=" + this.blockersData + ", menuAction=" + this.menuAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.menuAction, i);
        }
    }

    public final class GooglePayActivationScreen implements BlockersScreens {
        public static final Parcelable.Creator<GooglePayActivationScreen> CREATOR = new Error.Creator(14);
        public final String activationData;
        public final BlockersData blockersData;

        public GooglePayActivationScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.activationData = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePayActivationScreen)) {
                return false;
            }
            GooglePayActivationScreen googlePayActivationScreen = (GooglePayActivationScreen) obj;
            return Intrinsics.areEqual(this.blockersData, googlePayActivationScreen.blockersData) && Intrinsics.areEqual(this.activationData, googlePayActivationScreen.activationData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.activationData.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "GooglePayActivationScreen(blockersData=" + this.blockersData + ", activationData=" + this.activationData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.activationData);
        }
    }

    public final class GooglePayCompleteProvisioningScreen implements BlockersScreens {
        public static final Parcelable.Creator<GooglePayCompleteProvisioningScreen> CREATOR = new Error.Creator(15);
        public final BlockersData blockersData;

        public GooglePayCompleteProvisioningScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePayCompleteProvisioningScreen) && Intrinsics.areEqual(this.blockersData, ((GooglePayCompleteProvisioningScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "GooglePayCompleteProvisioningScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class GooglePayProvisioningExitScreen implements Screen {
        public static final Parcelable.Creator<GooglePayProvisioningExitScreen> CREATOR = new Error.Creator(16);
        public final boolean success;

        public GooglePayProvisioningExitScreen(boolean z) {
            this.success = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePayProvisioningExitScreen) && this.success == ((GooglePayProvisioningExitScreen) obj).success;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("GooglePayProvisioningExitScreen(success=", ")", this.success);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.success ? 1 : 0);
        }
    }

    public final class GpsExplainerSheetScreen implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<GpsExplainerSheetScreen> CREATOR = new Creator();
        public final GpsLocationConsentBlocker.InfoHalfSheet blocker;
        public final BlockersData blockersData;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GpsExplainerSheetScreen((BlockersData) parcel.readParcelable(GpsExplainerSheetScreen.class.getClassLoader()), (GpsLocationConsentBlocker.InfoHalfSheet) parcel.readParcelable(GpsExplainerSheetScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GpsExplainerSheetScreen[i];
            }
        }

        public GpsExplainerSheetScreen(BlockersData blockersData, GpsLocationConsentBlocker.InfoHalfSheet infoHalfSheet) {
            blockersData.getClass();
            infoHalfSheet.getClass();
            this.blockersData = blockersData;
            this.blocker = infoHalfSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GpsExplainerSheetScreen)) {
                return false;
            }
            GpsExplainerSheetScreen gpsExplainerSheetScreen = (GpsExplainerSheetScreen) obj;
            return Intrinsics.areEqual(this.blockersData, gpsExplainerSheetScreen.blockersData) && Intrinsics.areEqual(this.blocker, gpsExplainerSheetScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "GpsExplainerSheetScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class GpsLocationConsentBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<GpsLocationConsentBlockerScreen> CREATOR = new Error.Creator(17);
        public final GpsLocationConsentBlocker blocker;
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;

        public GpsLocationConsentBlockerScreen(BlockersData blockersData, BlockerAction blockerAction, GpsLocationConsentBlocker gpsLocationConsentBlocker) {
            blockersData.getClass();
            gpsLocationConsentBlocker.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.blocker = gpsLocationConsentBlocker;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GpsLocationConsentBlockerScreen)) {
                return false;
            }
            GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen = (GpsLocationConsentBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, gpsLocationConsentBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, gpsLocationConsentBlockerScreen.blocker) && Intrinsics.areEqual(this.dismissAction, gpsLocationConsentBlockerScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            return this.dismissAction.hashCode() + ((this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "GpsLocationConsentBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class HelpItemMessage implements BlockersDialogScreens {
        public static final Parcelable.Creator<HelpItemMessage> CREATOR = new Error.Creator(18);
        public final BlockersData blockersData;
        public final String messageText;
        public final String messageTitle;

        public HelpItemMessage(BlockersData blockersData, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            this.blockersData = blockersData;
            this.messageTitle = str;
            this.messageText = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpItemMessage)) {
                return false;
            }
            HelpItemMessage helpItemMessage = (HelpItemMessage) obj;
            return Intrinsics.areEqual(this.blockersData, helpItemMessage.blockersData) && Intrinsics.areEqual(this.messageTitle, helpItemMessage.messageTitle) && Intrinsics.areEqual(this.messageText, helpItemMessage.messageText);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.messageText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.messageTitle);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "HelpItemMessage(blockersData=", ", messageTitle=", this.messageTitle, ", messageText="), this.messageText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.messageTitle);
            parcel.writeString(this.messageText);
        }
    }

    public interface HelpOptions extends BlockersScreens, BottomSheetScreen {

        /* loaded from: classes4.dex */
        public final class Impl implements HelpOptions {
            public static final Parcelable.Creator<Impl> CREATOR = new Error.Creator(19);
            public final BlockersData blockersData;
            public final List helpItems;

            public Impl(BlockersData blockersData, List list) {
                blockersData.getClass();
                this.blockersData = blockersData;
                this.helpItems = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Impl)) {
                    return false;
                }
                Impl impl = (Impl) obj;
                return Intrinsics.areEqual(this.blockersData, impl.blockersData) && Intrinsics.areEqual(this.helpItems, impl.helpItems);
            }

            @Override // com.squareup.cash.blockers.screens.BlockersScreens
            public final BlockersData getBlockersData() {
                return this.blockersData;
            }

            public final int hashCode() {
                int hashCode = this.blockersData.hashCode() * 31;
                List list = this.helpItems;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                return "Impl(blockersData=" + this.blockersData + ", helpItems=" + this.helpItems + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.blockersData, i);
                List list = this.helpItems;
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
    }

    public final class IneligibleMergeScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<IneligibleMergeScreen> CREATOR = new Error.Creator(20);
        public final BlockersData blockersData;
        public final String message;

        public IneligibleMergeScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IneligibleMergeScreen)) {
                return false;
            }
            IneligibleMergeScreen ineligibleMergeScreen = (IneligibleMergeScreen) obj;
            return Intrinsics.areEqual(this.blockersData, ineligibleMergeScreen.blockersData) && Intrinsics.areEqual(this.message, ineligibleMergeScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.message;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "IneligibleMergeScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class InstrumentSelectionDetailsDialogScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<InstrumentSelectionDetailsDialogScreen> CREATOR = new Error.Creator(22);
        public final BlockersData blockersData;
        public final InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog dialog;

        public InstrumentSelectionDetailsDialogScreen(BlockersData blockersData, InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog) {
            blockersData.getClass();
            detailInfoDialog.getClass();
            this.blockersData = blockersData;
            this.dialog = detailInfoDialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentSelectionDetailsDialogScreen)) {
                return false;
            }
            InstrumentSelectionDetailsDialogScreen instrumentSelectionDetailsDialogScreen = (InstrumentSelectionDetailsDialogScreen) obj;
            return Intrinsics.areEqual(this.blockersData, instrumentSelectionDetailsDialogScreen.blockersData) && Intrinsics.areEqual(this.dialog, instrumentSelectionDetailsDialogScreen.dialog);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.dialog.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "InstrumentSelectionDetailsDialogScreen(blockersData=" + this.blockersData + ", dialog=" + this.dialog + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            this.dialog.writeToParcel(parcel, i);
        }
    }

    public final class InstrumentSelectionDetailsScreen implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<InstrumentSelectionDetailsScreen> CREATOR = new Error.Creator(23);
        public final BlockersData blockersData;
        public final InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog dialog;
        public final boolean enabled;
        public final boolean isSecondaryOption;
        public final InstrumentSelectionData.InstrumentOption option;

        /* loaded from: classes4.dex */
        public abstract class Result implements Parcelable {

            public final class Cancel extends Result {
                public static final Cancel INSTANCE = new Cancel();
                public static final Parcelable.Creator<Cancel> CREATOR = new Error.Creator(24);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Cancel);
                }

                public final int hashCode() {
                    return 495849264;
                }

                public final String toString() {
                    return "Cancel";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class InstrumentResult extends Result {
                public static final Parcelable.Creator<InstrumentResult> CREATOR = new Error.Creator(25);
                public final BlockerAction blockerAction;
                public final int id;

                public InstrumentResult(int i, BlockerAction blockerAction) {
                    blockerAction.getClass();
                    this.id = i;
                    this.blockerAction = blockerAction;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InstrumentResult)) {
                        return false;
                    }
                    InstrumentResult instrumentResult = (InstrumentResult) obj;
                    return this.id == instrumentResult.id && Intrinsics.areEqual(this.blockerAction, instrumentResult.blockerAction);
                }

                public final int hashCode() {
                    return this.blockerAction.hashCode() + (Integer.hashCode(this.id) * 31);
                }

                public final String toString() {
                    return "InstrumentResult(id=" + this.id + ", blockerAction=" + this.blockerAction + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.id);
                    parcel.writeParcelable(this.blockerAction, i);
                }
            }
        }

        public InstrumentSelectionDetailsScreen(BlockersData blockersData, InstrumentSelectionData.InstrumentOption instrumentOption, InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog optionDialog, boolean z, boolean z2) {
            blockersData.getClass();
            instrumentOption.getClass();
            optionDialog.getClass();
            this.blockersData = blockersData;
            this.option = instrumentOption;
            this.dialog = optionDialog;
            this.enabled = z;
            this.isSecondaryOption = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentSelectionDetailsScreen)) {
                return false;
            }
            InstrumentSelectionDetailsScreen instrumentSelectionDetailsScreen = (InstrumentSelectionDetailsScreen) obj;
            return Intrinsics.areEqual(this.blockersData, instrumentSelectionDetailsScreen.blockersData) && Intrinsics.areEqual(this.option, instrumentSelectionDetailsScreen.option) && Intrinsics.areEqual(this.dialog, instrumentSelectionDetailsScreen.dialog) && this.enabled == instrumentSelectionDetailsScreen.enabled && this.isSecondaryOption == instrumentSelectionDetailsScreen.isSecondaryOption;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSecondaryOption) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.dialog.hashCode() + ((this.option.hashCode() + (this.blockersData.hashCode() * 31)) * 31)) * 31, 31, this.enabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InstrumentSelectionDetailsScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", option=");
            sb.append(this.option);
            sb.append(", dialog=");
            sb.append(this.dialog);
            sb.append(", enabled=");
            sb.append(this.enabled);
            sb.append(", isSecondaryOption=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isSecondaryOption, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.option, i);
            this.dialog.writeToParcel(parcel, i);
            parcel.writeInt(this.enabled ? 1 : 0);
            parcel.writeInt(this.isSecondaryOption ? 1 : 0);
        }
    }

    public final class InstrumentSelectionListScreen implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<InstrumentSelectionListScreen> CREATOR = new Error.Creator(26);
        public final BlockersData blockersData;
        public final String closeButtonText;
        public final boolean isSecondaryOption;
        public final List options;
        public final String title;

        /* loaded from: classes4.dex */
        public final class InstrumentResult implements Parcelable {
            public static final Parcelable.Creator<InstrumentResult> CREATOR = new Error.Creator(27);
            public final int id;

            public InstrumentResult(int i) {
                this.id = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstrumentResult) && this.id == ((InstrumentResult) obj).id;
            }

            public final int hashCode() {
                return Integer.hashCode(this.id);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "InstrumentResult(id=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.id);
            }
        }

        public InstrumentSelectionListScreen(BlockersData blockersData, String str, List list, String str2, boolean z) {
            blockersData.getClass();
            list.getClass();
            str2.getClass();
            this.blockersData = blockersData;
            this.title = str;
            this.options = list;
            this.closeButtonText = str2;
            this.isSecondaryOption = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentSelectionListScreen)) {
                return false;
            }
            InstrumentSelectionListScreen instrumentSelectionListScreen = (InstrumentSelectionListScreen) obj;
            return Intrinsics.areEqual(this.blockersData, instrumentSelectionListScreen.blockersData) && Intrinsics.areEqual(this.title, instrumentSelectionListScreen.title) && Intrinsics.areEqual(this.options, instrumentSelectionListScreen.options) && Intrinsics.areEqual(this.closeButtonText, instrumentSelectionListScreen.closeButtonText) && this.isSecondaryOption == instrumentSelectionListScreen.isSecondaryOption;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.title;
            return Boolean.hashCode(this.isSecondaryOption) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.options), 31, this.closeButtonText);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "InstrumentSelectionListScreen(blockersData=", ", title=", this.title, ", options=");
            Recorder$$ExternalSyntheticOutline2.m(", closeButtonText=", this.closeButtonText, ", isSecondaryOption=", m, this.options);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSecondaryOption, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.title);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.closeButtonText);
            parcel.writeInt(this.isSecondaryOption ? 1 : 0);
        }
    }

    public final class InstrumentSelectionScreen implements BlockersScreens {
        public static final Parcelable.Creator<InstrumentSelectionScreen> CREATOR = new Error.Creator(28);
        public final BlockersData blockersData;
        public final InstrumentSelectionData data;

        public InstrumentSelectionScreen(BlockersData blockersData, InstrumentSelectionData instrumentSelectionData) {
            blockersData.getClass();
            instrumentSelectionData.getClass();
            this.blockersData = blockersData;
            this.data = instrumentSelectionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentSelectionScreen)) {
                return false;
            }
            InstrumentSelectionScreen instrumentSelectionScreen = (InstrumentSelectionScreen) obj;
            return Intrinsics.areEqual(this.blockersData, instrumentSelectionScreen.blockersData) && Intrinsics.areEqual(this.data, instrumentSelectionScreen.data);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "InstrumentSelectionScreen(blockersData=" + this.blockersData + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            this.data.writeToParcel(parcel, i);
        }
    }

    public final class InvalidInputScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<InvalidInputScreen> CREATOR = new Error.Creator(29);
        public final BlockersData blockersData;
        public final String message;
        public final String title;

        public InvalidInputScreen(BlockersData blockersData, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidInputScreen)) {
                return false;
            }
            InvalidInputScreen invalidInputScreen = (InvalidInputScreen) obj;
            return Intrinsics.areEqual(this.blockersData, invalidInputScreen.blockersData) && Intrinsics.areEqual(this.message, invalidInputScreen.message) && Intrinsics.areEqual(this.title, invalidInputScreen.title);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.message);
            String str = this.title;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "InvalidInputScreen(blockersData=", ", message=", this.message, ", title="), this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
            parcel.writeString(this.title);
        }
    }

    public final class InviteContactsScreen implements BlockersScreens {
        public static final Parcelable.Creator<InviteContactsScreen> CREATOR = new SetPinScreen.Creator(1);
        public final BlockersData blockersData;
        public final InviteFriendsData inviteFriendsData;
        public final InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen;
        public final com.squareup.protos.franklin.api.InviteFriendsScreen inviteFriendsScreen;
        public final StartFlowEntryPointScreen.Origin plasmaOrigin;
        public final boolean promptForPermissions;
        public final List recommendedContactsHashedAliasIds;

        public InviteContactsScreen(BlockersData blockersData, boolean z, InviteFriendsData inviteFriendsData, InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen, com.squareup.protos.franklin.api.InviteFriendsScreen inviteFriendsScreen, List list, StartFlowEntryPointScreen.Origin origin) {
            blockersData.getClass();
            inviteFriendsScreen.getClass();
            list.getClass();
            this.blockersData = blockersData;
            this.promptForPermissions = z;
            this.inviteFriendsData = inviteFriendsData;
            this.inviteFriendsOpportunityScreen = inviteFriendsOpportunityScreen;
            this.inviteFriendsScreen = inviteFriendsScreen;
            this.recommendedContactsHashedAliasIds = list;
            this.plasmaOrigin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteContactsScreen)) {
                return false;
            }
            InviteContactsScreen inviteContactsScreen = (InviteContactsScreen) obj;
            return Intrinsics.areEqual(this.blockersData, inviteContactsScreen.blockersData) && this.promptForPermissions == inviteContactsScreen.promptForPermissions && Intrinsics.areEqual(this.inviteFriendsData, inviteContactsScreen.inviteFriendsData) && Intrinsics.areEqual(this.inviteFriendsOpportunityScreen, inviteContactsScreen.inviteFriendsOpportunityScreen) && Intrinsics.areEqual(this.inviteFriendsScreen, inviteContactsScreen.inviteFriendsScreen) && Intrinsics.areEqual(this.recommendedContactsHashedAliasIds, inviteContactsScreen.recommendedContactsHashedAliasIds) && this.plasmaOrigin == inviteContactsScreen.plasmaOrigin;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.promptForPermissions);
            InviteFriendsData inviteFriendsData = this.inviteFriendsData;
            int hashCode = (m + (inviteFriendsData == null ? 0 : inviteFriendsData.hashCode())) * 31;
            InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = this.inviteFriendsOpportunityScreen;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((this.inviteFriendsScreen.hashCode() + ((hashCode + (inviteFriendsOpportunityScreen == null ? 0 : inviteFriendsOpportunityScreen.hashCode())) * 31)) * 31, 31, this.recommendedContactsHashedAliasIds);
            StartFlowEntryPointScreen.Origin origin = this.plasmaOrigin;
            return m2 + (origin != null ? origin.hashCode() : 0);
        }

        public final String toString() {
            return "InviteContactsScreen(blockersData=" + this.blockersData + ", promptForPermissions=" + this.promptForPermissions + ", inviteFriendsData=" + this.inviteFriendsData + ", inviteFriendsOpportunityScreen=" + this.inviteFriendsOpportunityScreen + ", inviteFriendsScreen=" + this.inviteFriendsScreen + ", recommendedContactsHashedAliasIds=" + this.recommendedContactsHashedAliasIds + ", plasmaOrigin=" + this.plasmaOrigin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.promptForPermissions ? 1 : 0);
            parcel.writeParcelable(this.inviteFriendsData, i);
            parcel.writeParcelable(this.inviteFriendsOpportunityScreen, i);
            parcel.writeParcelable(this.inviteFriendsScreen, i);
            parcel.writeStringList(this.recommendedContactsHashedAliasIds);
            StartFlowEntryPointScreen.Origin origin = this.plasmaOrigin;
            if (origin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(origin.name());
            }
        }
    }

    public final class InviteErrorScreen implements BlockersScreens, DialogScreen {
        public static final Parcelable.Creator<InviteErrorScreen> CREATOR = new SetPinScreen.Creator(2);
        public final BlockersData blockersData;
        public final String message;

        public InviteErrorScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteErrorScreen)) {
                return false;
            }
            InviteErrorScreen inviteErrorScreen = (InviteErrorScreen) obj;
            return Intrinsics.areEqual(this.blockersData, inviteErrorScreen.blockersData) && Intrinsics.areEqual(this.message, inviteErrorScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "InviteErrorScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class InviteFriendsScreen implements BlockersScreens {
        public static final Parcelable.Creator<InviteFriendsScreen> CREATOR = new SetPinScreen.Creator(3);
        public final BlockersData blockersData;
        public final ContactAccessPreparationScreen contactAccessPreparationScreen;
        public final InviteFriendsData inviteFriendsData;
        public final InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen;
        public final com.squareup.protos.franklin.api.InviteFriendsScreen inviteFriendsScreen;
        public final StartFlowEntryPointScreen.Origin plasmaOrigin;
        public final List recommendedContactsHashedAliasIds;

        public InviteFriendsScreen(BlockersData blockersData, InviteFriendsData inviteFriendsData, InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen, com.squareup.protos.franklin.api.InviteFriendsScreen inviteFriendsScreen, ContactAccessPreparationScreen contactAccessPreparationScreen, List list, StartFlowEntryPointScreen.Origin origin) {
            blockersData.getClass();
            inviteFriendsData.getClass();
            inviteFriendsScreen.getClass();
            list.getClass();
            this.blockersData = blockersData;
            this.inviteFriendsData = inviteFriendsData;
            this.inviteFriendsOpportunityScreen = inviteFriendsOpportunityScreen;
            this.inviteFriendsScreen = inviteFriendsScreen;
            this.contactAccessPreparationScreen = contactAccessPreparationScreen;
            this.recommendedContactsHashedAliasIds = list;
            this.plasmaOrigin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteFriendsScreen)) {
                return false;
            }
            InviteFriendsScreen inviteFriendsScreen = (InviteFriendsScreen) obj;
            return Intrinsics.areEqual(this.blockersData, inviteFriendsScreen.blockersData) && Intrinsics.areEqual(this.inviteFriendsData, inviteFriendsScreen.inviteFriendsData) && Intrinsics.areEqual(this.inviteFriendsOpportunityScreen, inviteFriendsScreen.inviteFriendsOpportunityScreen) && Intrinsics.areEqual(this.inviteFriendsScreen, inviteFriendsScreen.inviteFriendsScreen) && Intrinsics.areEqual(this.contactAccessPreparationScreen, inviteFriendsScreen.contactAccessPreparationScreen) && Intrinsics.areEqual(this.recommendedContactsHashedAliasIds, inviteFriendsScreen.recommendedContactsHashedAliasIds) && this.plasmaOrigin == inviteFriendsScreen.plasmaOrigin;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = (this.inviteFriendsData.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = this.inviteFriendsOpportunityScreen;
            int hashCode2 = (this.inviteFriendsScreen.hashCode() + ((hashCode + (inviteFriendsOpportunityScreen == null ? 0 : inviteFriendsOpportunityScreen.hashCode())) * 31)) * 31;
            ContactAccessPreparationScreen contactAccessPreparationScreen = this.contactAccessPreparationScreen;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (contactAccessPreparationScreen == null ? 0 : contactAccessPreparationScreen.hashCode())) * 31, 31, this.recommendedContactsHashedAliasIds);
            StartFlowEntryPointScreen.Origin origin = this.plasmaOrigin;
            return m + (origin != null ? origin.hashCode() : 0);
        }

        public final String toString() {
            return "InviteFriendsScreen(blockersData=" + this.blockersData + ", inviteFriendsData=" + this.inviteFriendsData + ", inviteFriendsOpportunityScreen=" + this.inviteFriendsOpportunityScreen + ", inviteFriendsScreen=" + this.inviteFriendsScreen + ", contactAccessPreparationScreen=" + this.contactAccessPreparationScreen + ", recommendedContactsHashedAliasIds=" + this.recommendedContactsHashedAliasIds + ", plasmaOrigin=" + this.plasmaOrigin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.inviteFriendsData, i);
            parcel.writeParcelable(this.inviteFriendsOpportunityScreen, i);
            parcel.writeParcelable(this.inviteFriendsScreen, i);
            parcel.writeParcelable(this.contactAccessPreparationScreen, i);
            parcel.writeStringList(this.recommendedContactsHashedAliasIds);
            StartFlowEntryPointScreen.Origin origin = this.plasmaOrigin;
            if (origin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(origin.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class ManagedAccountLoginQrCodeProviderBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<ManagedAccountLoginQrCodeProviderBlockerScreen> CREATOR = new SetPinScreen.Creator(4);
        public final UiAvatar avatar;
        public final BlockersData blockersData;
        public final String body;
        public final BlockerAction buttonAction;
        public final String buttonText;
        public final String qrCodeUrl;
        public final String title;

        public ManagedAccountLoginQrCodeProviderBlockerScreen(BlockersData blockersData, UiAvatar uiAvatar, String str, String str2, String str3, String str4, BlockerAction blockerAction) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.avatar = uiAvatar;
            this.title = str;
            this.body = str2;
            this.qrCodeUrl = str3;
            this.buttonText = str4;
            this.buttonAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccountLoginQrCodeProviderBlockerScreen)) {
                return false;
            }
            ManagedAccountLoginQrCodeProviderBlockerScreen managedAccountLoginQrCodeProviderBlockerScreen = (ManagedAccountLoginQrCodeProviderBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, managedAccountLoginQrCodeProviderBlockerScreen.blockersData) && Intrinsics.areEqual(this.avatar, managedAccountLoginQrCodeProviderBlockerScreen.avatar) && Intrinsics.areEqual(this.title, managedAccountLoginQrCodeProviderBlockerScreen.title) && Intrinsics.areEqual(this.body, managedAccountLoginQrCodeProviderBlockerScreen.body) && Intrinsics.areEqual(this.qrCodeUrl, managedAccountLoginQrCodeProviderBlockerScreen.qrCodeUrl) && Intrinsics.areEqual(this.buttonText, managedAccountLoginQrCodeProviderBlockerScreen.buttonText) && Intrinsics.areEqual(this.buttonAction, managedAccountLoginQrCodeProviderBlockerScreen.buttonAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.qrCodeUrl;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonText;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BlockerAction blockerAction = this.buttonAction;
            return hashCode6 + (blockerAction != null ? blockerAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ManagedAccountLoginQrCodeProviderBlockerScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", body=", this.body, ", qrCodeUrl=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.qrCodeUrl, ", buttonText=", this.buttonText, ", buttonAction=");
            sb.append(this.buttonAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.avatar, i);
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeString(this.qrCodeUrl);
            parcel.writeString(this.buttonText);
            parcel.writeParcelable(this.buttonAction, i);
        }
    }

    public final class OnboardingInternalRouteScreen implements BlockersScreens {
        public static final Parcelable.Creator<OnboardingInternalRouteScreen> CREATOR = new SetPinScreen.Creator(5);
        public final BlockersData blockersData;
        public final OnboardingInternalRouteBlocker data;

        public OnboardingInternalRouteScreen(BlockersData blockersData, OnboardingInternalRouteBlocker onboardingInternalRouteBlocker) {
            blockersData.getClass();
            onboardingInternalRouteBlocker.getClass();
            this.blockersData = blockersData;
            this.data = onboardingInternalRouteBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingInternalRouteScreen)) {
                return false;
            }
            OnboardingInternalRouteScreen onboardingInternalRouteScreen = (OnboardingInternalRouteScreen) obj;
            return Intrinsics.areEqual(this.blockersData, onboardingInternalRouteScreen.blockersData) && Intrinsics.areEqual(this.data, onboardingInternalRouteScreen.data);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "OnboardingInternalRouteScreen(blockersData=" + this.blockersData + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.data, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class OptionPickerConfirmationResult implements Screen {
        public static final Parcelable.Creator<OptionPickerConfirmationResult> CREATOR = new SetPinScreen.Creator(6);
        public final String formElementId;
        public final String optionId;

        public OptionPickerConfirmationResult(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.formElementId = str;
            this.optionId = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionPickerConfirmationResult)) {
                return false;
            }
            OptionPickerConfirmationResult optionPickerConfirmationResult = (OptionPickerConfirmationResult) obj;
            return Intrinsics.areEqual(this.formElementId, optionPickerConfirmationResult.formElementId) && Intrinsics.areEqual(this.optionId, optionPickerConfirmationResult.optionId);
        }

        public final int hashCode() {
            return this.optionId.hashCode() + (this.formElementId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("OptionPickerConfirmationResult(formElementId=", this.formElementId, ", optionId=", this.optionId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.formElementId);
            parcel.writeString(this.optionId);
        }
    }

    public final class PasscodeHelpScreen implements BlockersScreens, BottomSheetScreen {
        public static final Parcelable.Creator<PasscodeHelpScreen> CREATOR = new SetPinScreen.Creator(7);
        public final BlockersData blockersData;

        public PasscodeHelpScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasscodeHelpScreen) && Intrinsics.areEqual(this.blockersData, ((PasscodeHelpScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "PasscodeHelpScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class PasscodeScreen implements BlockersScreens {
        public static final Parcelable.Creator<PasscodeScreen> CREATOR = new SetPinScreen.Creator(8);
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final List helpItems;
        public final InstrumentType instrumentType;
        public final String subText;
        public final String suffix;
        public final boolean suppressForgotPasscode;
        public final Redacted titleOverride;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1062type;
        public final String verificationInstrumentToken;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type CONFIRM;
            public static final Type DISABLE_APP_LOCK;
            public static final Type ENABLE_APP_LOCK;
            public static final Type UNLOCK_APP;
            public static final Type VERIFY;

            static {
                Type type2 = new Type("VERIFY", 0);
                VERIFY = type2;
                Type type3 = new Type("CONFIRM", 1);
                CONFIRM = type3;
                Type type4 = new Type("ENABLE_APP_LOCK", 2);
                ENABLE_APP_LOCK = type4;
                Type type5 = new Type("DISABLE_APP_LOCK", 3);
                DISABLE_APP_LOCK = type5;
                Type type6 = new Type("UNLOCK_APP", 4);
                UNLOCK_APP = type6;
                $VALUES = new Type[]{type2, type3, type4, type5, type6};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public PasscodeScreen(BlockersData blockersData, InstrumentType instrumentType, String str, String str2, BlockerAction blockerAction, Type type2, Redacted redacted, boolean z, List list, String str3) {
            blockersData.getClass();
            type2.getClass();
            this.blockersData = blockersData;
            this.instrumentType = instrumentType;
            this.suffix = str;
            this.verificationInstrumentToken = str2;
            this.dismissAction = blockerAction;
            this.f1062type = type2;
            this.titleOverride = redacted;
            this.suppressForgotPasscode = z;
            this.helpItems = list;
            this.subText = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasscodeScreen)) {
                return false;
            }
            PasscodeScreen passcodeScreen = (PasscodeScreen) obj;
            return Intrinsics.areEqual(this.blockersData, passcodeScreen.blockersData) && this.instrumentType == passcodeScreen.instrumentType && Intrinsics.areEqual(this.suffix, passcodeScreen.suffix) && Intrinsics.areEqual(this.verificationInstrumentToken, passcodeScreen.verificationInstrumentToken) && Intrinsics.areEqual(this.dismissAction, passcodeScreen.dismissAction) && this.f1062type == passcodeScreen.f1062type && Intrinsics.areEqual(this.titleOverride, passcodeScreen.titleOverride) && this.suppressForgotPasscode == passcodeScreen.suppressForgotPasscode && Intrinsics.areEqual(this.helpItems, passcodeScreen.helpItems) && Intrinsics.areEqual(this.subText, passcodeScreen.subText);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            InstrumentType instrumentType = this.instrumentType;
            int hashCode2 = (hashCode + (instrumentType == null ? 0 : instrumentType.hashCode())) * 31;
            String str = this.suffix;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.verificationInstrumentToken;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            int hashCode5 = (this.f1062type.hashCode() + ((hashCode4 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31)) * 31;
            Redacted redacted = this.titleOverride;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (redacted == null ? 0 : redacted.hashCode())) * 31, 31, this.suppressForgotPasscode);
            List list = this.helpItems;
            int hashCode6 = (m + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.subText;
            return hashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PasscodeScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", instrumentType=");
            sb.append(this.instrumentType);
            sb.append(", suffix=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.suffix, ", verificationInstrumentToken=", this.verificationInstrumentToken, ", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(", type=");
            sb.append(this.f1062type);
            sb.append(", titleOverride=");
            sb.append(this.titleOverride);
            sb.append(", suppressForgotPasscode=");
            sb.append(this.suppressForgotPasscode);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", subText=");
            sb.append(this.subText);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            InstrumentType instrumentType = this.instrumentType;
            if (instrumentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(instrumentType.name());
            }
            parcel.writeString(this.suffix);
            parcel.writeString(this.verificationInstrumentToken);
            parcel.writeParcelable(this.dismissAction, i);
            parcel.writeString(this.f1062type.name());
            parcel.writeParcelable(this.titleOverride, i);
            parcel.writeInt(this.suppressForgotPasscode ? 1 : 0);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.subText);
        }
    }

    public final class PaymentPlanDataBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<PaymentPlanDataBlockerScreen> CREATOR = new SetPinScreen.Creator(9);
        public final BlockersData blockersData;
        public final PaymentPlanDataBlocker data;

        public PaymentPlanDataBlockerScreen(BlockersData blockersData, PaymentPlanDataBlocker paymentPlanDataBlocker) {
            blockersData.getClass();
            paymentPlanDataBlocker.getClass();
            this.blockersData = blockersData;
            this.data = paymentPlanDataBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentPlanDataBlockerScreen)) {
                return false;
            }
            PaymentPlanDataBlockerScreen paymentPlanDataBlockerScreen = (PaymentPlanDataBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, paymentPlanDataBlockerScreen.blockersData) && Intrinsics.areEqual(this.data, paymentPlanDataBlockerScreen.data);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentPlanDataBlockerScreen(blockersData=" + this.blockersData + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.data, i);
        }
    }

    public final class PersonaDidvScreen implements BlockersScreens {
        public static final Parcelable.Creator<PersonaDidvScreen> CREATOR = new Creator();
        public final boolean biometricConsentCollected;
        public final BlockersData blockersData;
        public final boolean fallbackModeEnabled;
        public final String fallbackTemplateId;
        public final String inquiryId;
        public final PersonaDidvBlocker.FlowType personaFlowType;
        public final boolean resolveBlockerOnCancel;
        public final String sessionToken;
        public final String subFlowToken;

        /* loaded from: classes8.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                PersonaDidvBlocker.FlowType flowType;
                String str;
                boolean z3;
                String str2;
                boolean z4;
                parcel.getClass();
                BlockersData blockersData = (BlockersData) parcel.readParcelable(PersonaDidvScreen.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z5 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                PersonaDidvBlocker.FlowType valueOf = parcel.readInt() == 0 ? null : PersonaDidvBlocker.FlowType.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                    flowType = valueOf;
                    str = readString3;
                    z3 = true;
                } else {
                    z2 = true;
                    flowType = valueOf;
                    str = readString3;
                    z3 = z;
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = z2;
                    str2 = readString4;
                } else {
                    str2 = readString4;
                    z4 = z;
                }
                return new PersonaDidvScreen(blockersData, readString, readString2, z5, flowType, str, z3, str2, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonaDidvScreen[i];
            }
        }

        public PersonaDidvScreen(BlockersData blockersData, String str, String str2, boolean z, PersonaDidvBlocker.FlowType flowType, String str3, boolean z2, String str4, boolean z3) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.sessionToken = str;
            this.inquiryId = str2;
            this.resolveBlockerOnCancel = z;
            this.personaFlowType = flowType;
            this.subFlowToken = str3;
            this.fallbackModeEnabled = z2;
            this.fallbackTemplateId = str4;
            this.biometricConsentCollected = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonaDidvScreen)) {
                return false;
            }
            PersonaDidvScreen personaDidvScreen = (PersonaDidvScreen) obj;
            return Intrinsics.areEqual(this.blockersData, personaDidvScreen.blockersData) && Intrinsics.areEqual(this.sessionToken, personaDidvScreen.sessionToken) && Intrinsics.areEqual(this.inquiryId, personaDidvScreen.inquiryId) && this.resolveBlockerOnCancel == personaDidvScreen.resolveBlockerOnCancel && this.personaFlowType == personaDidvScreen.personaFlowType && Intrinsics.areEqual(this.subFlowToken, personaDidvScreen.subFlowToken) && this.fallbackModeEnabled == personaDidvScreen.fallbackModeEnabled && Intrinsics.areEqual(this.fallbackTemplateId, personaDidvScreen.fallbackTemplateId) && this.biometricConsentCollected == personaDidvScreen.biometricConsentCollected;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.sessionToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inquiryId;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.resolveBlockerOnCancel);
            PersonaDidvBlocker.FlowType flowType = this.personaFlowType;
            int hashCode3 = (m + (flowType == null ? 0 : flowType.hashCode())) * 31;
            String str3 = this.subFlowToken;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.fallbackModeEnabled);
            String str4 = this.fallbackTemplateId;
            return Boolean.hashCode(this.biometricConsentCollected) + ((m2 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "PersonaDidvScreen(blockersData=", ", sessionToken=", this.sessionToken, ", inquiryId=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.inquiryId, ", resolveBlockerOnCancel=", this.resolveBlockerOnCancel, ", personaFlowType=");
            m.append(this.personaFlowType);
            m.append(", subFlowToken=");
            m.append(this.subFlowToken);
            m.append(", fallbackModeEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.fallbackModeEnabled, ", fallbackTemplateId=", this.fallbackTemplateId, ", biometricConsentCollected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.biometricConsentCollected, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.inquiryId);
            parcel.writeInt(this.resolveBlockerOnCancel ? 1 : 0);
            PersonaDidvBlocker.FlowType flowType = this.personaFlowType;
            if (flowType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(flowType.name());
            }
            parcel.writeString(this.subFlowToken);
            parcel.writeInt(this.fallbackModeEnabled ? 1 : 0);
            parcel.writeString(this.fallbackTemplateId);
            parcel.writeInt(this.biometricConsentCollected ? 1 : 0);
        }
    }

    public final class PlaidLinkScreen implements BlockersScreens, NeverInBackStackScreen {
        public static final Parcelable.Creator<PlaidLinkScreen> CREATOR = new SetPinScreen.Creator(10);
        public final BlockersData blockersData;
        public final PlaidLinkingConfig plaidLinkingConfig;

        public PlaidLinkScreen(BlockersData blockersData, PlaidLinkingConfig plaidLinkingConfig) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.plaidLinkingConfig = plaidLinkingConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaidLinkScreen)) {
                return false;
            }
            PlaidLinkScreen plaidLinkScreen = (PlaidLinkScreen) obj;
            return Intrinsics.areEqual(this.blockersData, plaidLinkScreen.blockersData) && Intrinsics.areEqual(this.plaidLinkingConfig, plaidLinkScreen.plaidLinkingConfig);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            PlaidLinkingConfig plaidLinkingConfig = this.plaidLinkingConfig;
            return hashCode + (plaidLinkingConfig == null ? 0 : plaidLinkingConfig.hashCode());
        }

        public final String toString() {
            return "PlaidLinkScreen(blockersData=" + this.blockersData + ", plaidLinkingConfig=" + this.plaidLinkingConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.plaidLinkingConfig, i);
        }
    }

    public final class PrepurchaseCashCardFAQBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<PrepurchaseCashCardFAQBlockerScreen> CREATOR = new SetPinScreen.Creator(11);
        public final PrepurchaseCashCardFAQBlocker blocker;
        public final BlockersData blockersData;

        public PrepurchaseCashCardFAQBlockerScreen(BlockersData blockersData, PrepurchaseCashCardFAQBlocker prepurchaseCashCardFAQBlocker) {
            blockersData.getClass();
            prepurchaseCashCardFAQBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = prepurchaseCashCardFAQBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepurchaseCashCardFAQBlockerScreen)) {
                return false;
            }
            PrepurchaseCashCardFAQBlockerScreen prepurchaseCashCardFAQBlockerScreen = (PrepurchaseCashCardFAQBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, prepurchaseCashCardFAQBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, prepurchaseCashCardFAQBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "PrepurchaseCashCardFAQBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class ProvisionGooglePayScreen implements BlockersScreens {
        public static final Parcelable.Creator<ProvisionGooglePayScreen> CREATOR = new SetPinScreen.Creator(12);
        public final BlockersData blockersData;
        public final boolean reportAllProvisioningFailures;

        public ProvisionGooglePayScreen(BlockersData blockersData, boolean z) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.reportAllProvisioningFailures = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProvisionGooglePayScreen)) {
                return false;
            }
            ProvisionGooglePayScreen provisionGooglePayScreen = (ProvisionGooglePayScreen) obj;
            return Intrinsics.areEqual(this.blockersData, provisionGooglePayScreen.blockersData) && this.reportAllProvisioningFailures == provisionGooglePayScreen.reportAllProvisioningFailures;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.reportAllProvisioningFailures) + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "ProvisionGooglePayScreen(blockersData=" + this.blockersData + ", reportAllProvisioningFailures=" + this.reportAllProvisioningFailures + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.reportAllProvisioningFailures ? 1 : 0);
        }
    }

    public final class ReferralCodeScreen implements BlockersScreens {
        public static final Parcelable.Creator<ReferralCodeScreen> CREATOR = new SetPinScreen.Creator(14);
        public final BlockersData blockersData;
        public final int minimumCodeLength;
        public final boolean skippable;
        public final String suggestedCode;

        public ReferralCodeScreen(BlockersData blockersData, String str, boolean z, int i) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.suggestedCode = str;
            this.skippable = z;
            this.minimumCodeLength = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferralCodeScreen)) {
                return false;
            }
            ReferralCodeScreen referralCodeScreen = (ReferralCodeScreen) obj;
            return Intrinsics.areEqual(this.blockersData, referralCodeScreen.blockersData) && Intrinsics.areEqual(this.suggestedCode, referralCodeScreen.suggestedCode) && this.skippable == referralCodeScreen.skippable && this.minimumCodeLength == referralCodeScreen.minimumCodeLength;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.suggestedCode;
            return Integer.hashCode(this.minimumCodeLength) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.skippable);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ReferralCodeScreen(blockersData=", ", suggestedCode=", this.suggestedCode, ", skippable=");
            m.append(this.skippable);
            m.append(", minimumCodeLength=");
            m.append(this.minimumCodeLength);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.suggestedCode);
            parcel.writeInt(this.skippable ? 1 : 0);
            parcel.writeInt(this.minimumCodeLength);
        }
    }

    public final class RegisterErrorScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<RegisterErrorScreen> CREATOR = new SetPinScreen.Creator(17);
        public final BlockersData blockersData;
        public final String message;

        public RegisterErrorScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterErrorScreen)) {
                return false;
            }
            RegisterErrorScreen registerErrorScreen = (RegisterErrorScreen) obj;
            return Intrinsics.areEqual(this.blockersData, registerErrorScreen.blockersData) && Intrinsics.areEqual(this.message, registerErrorScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "RegisterErrorScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class RemoteSkipErrorScreen implements DialogScreen {
        public static final Parcelable.Creator<RemoteSkipErrorScreen> CREATOR = new SetPinScreen.Creator(18);
        public final String message;

        public RemoteSkipErrorScreen(String str) {
            str.getClass();
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteSkipErrorScreen) && Intrinsics.areEqual(this.message, ((RemoteSkipErrorScreen) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoteSkipErrorScreen(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.message);
        }
    }

    public final class RemoteSkipScreen implements BlockersScreens {
        public static final Parcelable.Creator<RemoteSkipScreen> CREATOR = new SetPinScreen.Creator(19);
        public final BlockersData blockersData;
        public final Screen current;

        public RemoteSkipScreen(Screen screen, BlockersData blockersData) {
            blockersData.getClass();
            screen.getClass();
            this.blockersData = blockersData;
            this.current = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteSkipScreen)) {
                return false;
            }
            RemoteSkipScreen remoteSkipScreen = (RemoteSkipScreen) obj;
            return Intrinsics.areEqual(this.blockersData, remoteSkipScreen.blockersData) && Intrinsics.areEqual(this.current, remoteSkipScreen.current);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.current.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "RemoteSkipScreen(blockersData=" + this.blockersData + ", current=" + this.current + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.current, i);
        }
    }

    public final class RequestPushNotificationsBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<RequestPushNotificationsBlockerScreen> CREATOR = new SetPinScreen.Creator(20);
        public final RequestPushNotificationsScreen blocker;
        public final BlockersData blockersData;

        public RequestPushNotificationsBlockerScreen(BlockersData blockersData, RequestPushNotificationsScreen requestPushNotificationsScreen) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.blocker = requestPushNotificationsScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestPushNotificationsBlockerScreen)) {
                return false;
            }
            RequestPushNotificationsBlockerScreen requestPushNotificationsBlockerScreen = (RequestPushNotificationsBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, requestPushNotificationsBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, requestPushNotificationsBlockerScreen.blocker);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            RequestPushNotificationsScreen requestPushNotificationsScreen = this.blocker;
            return hashCode + (requestPushNotificationsScreen == null ? 0 : requestPushNotificationsScreen.hashCode());
        }

        public final String toString() {
            return "RequestPushNotificationsBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
        }
    }

    public final class SavingsTransferOptionSelectionFullScreen implements SavingsTransferOptionSelectionScreen {
        public static final Parcelable.Creator<SavingsTransferOptionSelectionFullScreen> CREATOR = new SetPinScreen.Creator(21);
        public final TransferOptionSelectionBlocker blocker;
        public final BlockersData blockersData;
        public final BlockerAction retreatAction;

        public SavingsTransferOptionSelectionFullScreen(BlockersData blockersData, TransferOptionSelectionBlocker transferOptionSelectionBlocker, BlockerAction blockerAction) {
            blockersData.getClass();
            transferOptionSelectionBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = transferOptionSelectionBlocker;
            this.retreatAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsTransferOptionSelectionFullScreen)) {
                return false;
            }
            SavingsTransferOptionSelectionFullScreen savingsTransferOptionSelectionFullScreen = (SavingsTransferOptionSelectionFullScreen) obj;
            return Intrinsics.areEqual(this.blockersData, savingsTransferOptionSelectionFullScreen.blockersData) && Intrinsics.areEqual(this.blocker, savingsTransferOptionSelectionFullScreen.blocker) && Intrinsics.areEqual(this.retreatAction, savingsTransferOptionSelectionFullScreen.retreatAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.SavingsTransferOptionSelectionScreen
        public final TransferOptionSelectionBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getRetreatAction() {
            return this.retreatAction;
        }

        public final int hashCode() {
            int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            BlockerAction blockerAction = this.retreatAction;
            return hashCode + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            return "SavingsTransferOptionSelectionFullScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
            parcel.writeParcelable(this.retreatAction, i);
        }
    }

    public interface SavingsTransferOptionSelectionScreen extends BlockersScreens {
        TransferOptionSelectionBlocker getBlocker();
    }

    public final class SavingsTransferOptionSelectionSheet implements SavingsTransferOptionSelectionScreen, Screen, OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<SavingsTransferOptionSelectionSheet> CREATOR = new SetPinScreen.Creator(22);
        public final TransferOptionSelectionBlocker blocker;
        public final BlockersData blockersData;
        public final BlockerAction retreatAction;

        public SavingsTransferOptionSelectionSheet(BlockersData blockersData, TransferOptionSelectionBlocker transferOptionSelectionBlocker, BlockerAction blockerAction) {
            blockersData.getClass();
            transferOptionSelectionBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = transferOptionSelectionBlocker;
            this.retreatAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsTransferOptionSelectionSheet)) {
                return false;
            }
            SavingsTransferOptionSelectionSheet savingsTransferOptionSelectionSheet = (SavingsTransferOptionSelectionSheet) obj;
            return Intrinsics.areEqual(this.blockersData, savingsTransferOptionSelectionSheet.blockersData) && Intrinsics.areEqual(this.blocker, savingsTransferOptionSelectionSheet.blocker) && Intrinsics.areEqual(this.retreatAction, savingsTransferOptionSelectionSheet.retreatAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.SavingsTransferOptionSelectionScreen
        public final TransferOptionSelectionBlocker getBlocker() {
            return this.blocker;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getRetreatAction() {
            return this.retreatAction;
        }

        public final int hashCode() {
            int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            BlockerAction blockerAction = this.retreatAction;
            return hashCode + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            return "SavingsTransferOptionSelectionSheet(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", retreatAction=" + this.retreatAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
            parcel.writeParcelable(this.retreatAction, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class SelectAllowlistCustomerBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<SelectAllowlistCustomerBlockerScreen> CREATOR = new SetPinScreen.Creator(23);
        public final BlockerAction backAction;
        public final BlockersData blockersData;
        public final String firstName;
        public final String forCustomerToken;
        public final Integer limit;

        public SelectAllowlistCustomerBlockerScreen(BlockersData blockersData, String str, BlockerAction blockerAction, String str2, Integer num) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.forCustomerToken = str;
            this.backAction = blockerAction;
            this.firstName = str2;
            this.limit = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectAllowlistCustomerBlockerScreen)) {
                return false;
            }
            SelectAllowlistCustomerBlockerScreen selectAllowlistCustomerBlockerScreen = (SelectAllowlistCustomerBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, selectAllowlistCustomerBlockerScreen.blockersData) && Intrinsics.areEqual(this.forCustomerToken, selectAllowlistCustomerBlockerScreen.forCustomerToken) && Intrinsics.areEqual(this.backAction, selectAllowlistCustomerBlockerScreen.backAction) && Intrinsics.areEqual(this.firstName, selectAllowlistCustomerBlockerScreen.firstName) && Intrinsics.areEqual(this.limit, selectAllowlistCustomerBlockerScreen.limit);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.forCustomerToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BlockerAction blockerAction = this.backAction;
            int hashCode3 = (hashCode2 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            String str2 = this.firstName;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.limit;
            return hashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "SelectAllowlistCustomerBlockerScreen(blockersData=", ", forCustomerToken=", this.forCustomerToken, ", backAction=");
            m.append(this.backAction);
            m.append(", firstName=");
            m.append(this.firstName);
            m.append(", limit=");
            return NavAction$$ExternalSyntheticOutline0.m(m, this.limit, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.forCustomerToken);
            parcel.writeParcelable(this.backAction, i);
            parcel.writeString(this.firstName);
            Integer num = this.limit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
        }
    }

    public final class SelectPaymentPlanBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<SelectPaymentPlanBlockerScreen> CREATOR = new SetPinScreen.Creator(24);
        public final BlockersData blockersData;
        public final SelectPaymentPlanBlocker data;

        public SelectPaymentPlanBlockerScreen(BlockersData blockersData, SelectPaymentPlanBlocker selectPaymentPlanBlocker) {
            blockersData.getClass();
            selectPaymentPlanBlocker.getClass();
            this.blockersData = blockersData;
            this.data = selectPaymentPlanBlocker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPaymentPlanBlockerScreen)) {
                return false;
            }
            SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen = (SelectPaymentPlanBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, selectPaymentPlanBlockerScreen.blockersData) && Intrinsics.areEqual(this.data, selectPaymentPlanBlockerScreen.data);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "SelectPaymentPlanBlockerScreen(blockersData=" + this.blockersData + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.data, i);
        }
    }

    public final class SelectionFullScreen implements SelectionScreen {
        public static final Parcelable.Creator<SelectionFullScreen> CREATOR = new Creator();
        public final Money amount;
        public final BlockersData blockersData;
        public final List detailRows;
        public final String footerText;
        public final String headerText;
        public final List helpItems;
        public final SelectionBlocker.Icon icon;
        public final Redacted mainText;
        public final List options;
        public final SelectionOption primaryOption;
        public final SelectionOption secondaryOption;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, SelectionFullScreen.class);
                ArrayList arrayList2 = null;
                SelectionBlocker.Icon valueOf = parcel.readInt() == 0 ? null : SelectionBlocker.Icon.valueOf(parcel.readString());
                String readString = parcel.readString();
                Redacted redacted = (Redacted) parcel.readParcelable(SelectionFullScreen.class.getClassLoader());
                String readString2 = parcel.readString();
                SelectionOption selectionOption = (SelectionOption) parcel.readParcelable(SelectionFullScreen.class.getClassLoader());
                SelectionOption selectionOption2 = (SelectionOption) parcel.readParcelable(SelectionFullScreen.class.getClassLoader());
                int i = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(SelectionFullScreen.class, parcel, arrayList, i2, 1);
                    }
                }
                Money money = (Money) parcel.readParcelable(SelectionFullScreen.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(SelectionFullScreen.class, parcel, arrayList3, i3, 1);
                    }
                    arrayList2 = arrayList3;
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(SelectionFullScreen.class, parcel, arrayList4, i, 1);
                }
                return new SelectionFullScreen(blockersData, valueOf, readString, redacted, readString2, selectionOption, selectionOption2, arrayList, money, arrayList2, arrayList4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectionFullScreen[i];
            }
        }

        public SelectionFullScreen(BlockersData blockersData, SelectionBlocker.Icon icon, String str, Redacted redacted, String str2, SelectionOption selectionOption, SelectionOption selectionOption2, List list, Money money, List list2, List list3) {
            blockersData.getClass();
            list3.getClass();
            this.blockersData = blockersData;
            this.icon = icon;
            this.headerText = str;
            this.mainText = redacted;
            this.footerText = str2;
            this.primaryOption = selectionOption;
            this.secondaryOption = selectionOption2;
            this.options = list;
            this.amount = money;
            this.helpItems = list2;
            this.detailRows = list3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionFullScreen)) {
                return false;
            }
            SelectionFullScreen selectionFullScreen = (SelectionFullScreen) obj;
            return Intrinsics.areEqual(this.blockersData, selectionFullScreen.blockersData) && this.icon == selectionFullScreen.icon && Intrinsics.areEqual(this.headerText, selectionFullScreen.headerText) && Intrinsics.areEqual(this.mainText, selectionFullScreen.mainText) && Intrinsics.areEqual(this.footerText, selectionFullScreen.footerText) && Intrinsics.areEqual(this.primaryOption, selectionFullScreen.primaryOption) && Intrinsics.areEqual(this.secondaryOption, selectionFullScreen.secondaryOption) && Intrinsics.areEqual(this.options, selectionFullScreen.options) && Intrinsics.areEqual(this.amount, selectionFullScreen.amount) && Intrinsics.areEqual(this.helpItems, selectionFullScreen.helpItems) && Intrinsics.areEqual(this.detailRows, selectionFullScreen.detailRows);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            SelectionBlocker.Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            String str = this.headerText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Redacted redacted = this.mainText;
            int hashCode4 = (hashCode3 + (redacted == null ? 0 : redacted.hashCode())) * 31;
            String str2 = this.footerText;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SelectionOption selectionOption = this.primaryOption;
            int hashCode6 = (hashCode5 + (selectionOption == null ? 0 : selectionOption.hashCode())) * 31;
            SelectionOption selectionOption2 = this.secondaryOption;
            int hashCode7 = (hashCode6 + (selectionOption2 == null ? 0 : selectionOption2.hashCode())) * 31;
            List list = this.options;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            Money money = this.amount;
            int hashCode9 = (hashCode8 + (money == null ? 0 : money.hashCode())) * 31;
            List list2 = this.helpItems;
            return this.detailRows.hashCode() + ((hashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectionFullScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", headerText=");
            sb.append(this.headerText);
            sb.append(", mainText=");
            sb.append(this.mainText);
            sb.append(", footerText=");
            sb.append(this.footerText);
            sb.append(", primaryOption=");
            sb.append(this.primaryOption);
            sb.append(", secondaryOption=");
            sb.append(this.secondaryOption);
            sb.append(", options=");
            sb.append(this.options);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", detailRows=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.detailRows, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            SelectionBlocker.Icon icon = this.icon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(icon.name());
            }
            parcel.writeString(this.headerText);
            parcel.writeParcelable(this.mainText, i);
            parcel.writeString(this.footerText);
            parcel.writeParcelable(this.primaryOption, i);
            parcel.writeParcelable(this.secondaryOption, i);
            List list = this.options;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeParcelable(this.amount, i);
            List list2 = this.helpItems;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list2);
                while (m2.hasNext()) {
                    parcel.writeParcelable((Parcelable) m2.next(), i);
                }
            }
            Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.detailRows, parcel);
            while (m3.hasNext()) {
                parcel.writeParcelable((Parcelable) m3.next(), i);
            }
        }
    }

    public interface SelectionScreen extends BlockersScreens {
    }

    public final class SetNameScreen implements BlockersScreens {
        public static final Parcelable.Creator<SetNameScreen> CREATOR = new SetPinScreen.Creator(25);
        public final BlockersData blockersData;
        public final boolean canExit;
        public final String footerText;
        public final List helpItems;
        public final Redacted hintOverride;
        public final String instructionLabel;
        public final int maxLength;
        public final int minLength;
        public final Redacted namePrefill;
        public final NameType nameType;
        public final SetNameType setNameType;
        public final boolean showBusinessName;
        public final Redacted titleOverride;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class NameType {
            public static final /* synthetic */ NameType[] $VALUES;
            public static final NameType DISPLAY;
            public static final NameType LEGAL;

            static {
                NameType nameType = new NameType("DISPLAY", 0);
                DISPLAY = nameType;
                NameType nameType2 = new NameType("LEGAL", 1);
                LEGAL = nameType2;
                $VALUES = new NameType[]{nameType, nameType2};
            }

            public static NameType valueOf(String str) {
                return (NameType) Enum.valueOf(NameType.class, str);
            }

            public static NameType[] values() {
                return (NameType[]) $VALUES.clone();
            }
        }

        /* loaded from: classes4.dex */
        public interface SetNameType extends Parcelable {

            public final class CreateShippingAddressWithName implements SetNameType {
                public static final Parcelable.Creator<CreateShippingAddressWithName> CREATOR = new SetPinScreen.Creator(26);
                public final String profileId;

                public CreateShippingAddressWithName(String str) {
                    str.getClass();
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CreateShippingAddressWithName) && Intrinsics.areEqual(this.profileId, ((CreateShippingAddressWithName) obj).profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateShippingAddressWithName(profileId=", this.profileId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.profileId);
                }
            }

            public final class SetNameOnly implements SetNameType {
                public static final SetNameOnly INSTANCE = new SetNameOnly();
                public static final Parcelable.Creator<SetNameOnly> CREATOR = new SetPinScreen.Creator(27);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SetNameOnly);
                }

                public final int hashCode() {
                    return 1850455603;
                }

                public final String toString() {
                    return "SetNameOnly";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class SetShippingAddressName implements SetNameType {
                public static final Parcelable.Creator<SetShippingAddressName> CREATOR = new SetPinScreen.Creator(28);
                public final String profileId;
                public final ShippingAddress shippingAddress;

                public SetShippingAddressName(ShippingAddress shippingAddress, String str) {
                    shippingAddress.getClass();
                    str.getClass();
                    this.shippingAddress = shippingAddress;
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SetShippingAddressName)) {
                        return false;
                    }
                    SetShippingAddressName setShippingAddressName = (SetShippingAddressName) obj;
                    return Intrinsics.areEqual(this.shippingAddress, setShippingAddressName.shippingAddress) && Intrinsics.areEqual(this.profileId, setShippingAddressName.profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode() + (this.shippingAddress.hashCode() * 31);
                }

                public final String toString() {
                    return "SetShippingAddressName(shippingAddress=" + this.shippingAddress + ", profileId=" + this.profileId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.shippingAddress, i);
                    parcel.writeString(this.profileId);
                }
            }
        }

        public SetNameScreen(BlockersData blockersData, NameType nameType, Redacted redacted, Redacted redacted2, Redacted redacted3, int i, int i2, List list, String str, boolean z, String str2, boolean z2, SetNameType setNameType) {
            blockersData.getClass();
            nameType.getClass();
            redacted.getClass();
            redacted2.getClass();
            redacted3.getClass();
            setNameType.getClass();
            this.blockersData = blockersData;
            this.nameType = nameType;
            this.titleOverride = redacted;
            this.namePrefill = redacted2;
            this.hintOverride = redacted3;
            this.minLength = i;
            this.maxLength = i2;
            this.helpItems = list;
            this.footerText = str;
            this.showBusinessName = z;
            this.instructionLabel = str2;
            this.canExit = z2;
            this.setNameType = setNameType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetNameScreen)) {
                return false;
            }
            SetNameScreen setNameScreen = (SetNameScreen) obj;
            return Intrinsics.areEqual(this.blockersData, setNameScreen.blockersData) && this.nameType == setNameScreen.nameType && Intrinsics.areEqual(this.titleOverride, setNameScreen.titleOverride) && Intrinsics.areEqual(this.namePrefill, setNameScreen.namePrefill) && Intrinsics.areEqual(this.hintOverride, setNameScreen.hintOverride) && this.minLength == setNameScreen.minLength && this.maxLength == setNameScreen.maxLength && Intrinsics.areEqual(this.helpItems, setNameScreen.helpItems) && Intrinsics.areEqual(this.footerText, setNameScreen.footerText) && this.showBusinessName == setNameScreen.showBusinessName && Intrinsics.areEqual(this.instructionLabel, setNameScreen.instructionLabel) && this.canExit == setNameScreen.canExit && Intrinsics.areEqual(this.setNameType, setNameScreen.setNameType);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxLength, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minLength, re$$ExternalSyntheticOutline0.m(this.hintOverride, re$$ExternalSyntheticOutline0.m(this.namePrefill, re$$ExternalSyntheticOutline0.m(this.titleOverride, (this.nameType.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
            List list = this.helpItems;
            int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.footerText;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showBusinessName);
            String str2 = this.instructionLabel;
            return this.setNameType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.canExit);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetNameScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", nameType=");
            sb.append(this.nameType);
            sb.append(", titleOverride=");
            sb.append(this.titleOverride);
            sb.append(", namePrefill=");
            sb.append(this.namePrefill);
            sb.append(", hintOverride=");
            sb.append(this.hintOverride);
            sb.append(", minLength=");
            sb.append(this.minLength);
            sb.append(", maxLength=");
            sb.append(this.maxLength);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", footerText=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.footerText, ", showBusinessName=", this.showBusinessName, ", instructionLabel=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.instructionLabel, ", canExit=", this.canExit, ", setNameType=");
            sb.append(this.setNameType);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.nameType.name());
            parcel.writeParcelable(this.titleOverride, i);
            parcel.writeParcelable(this.namePrefill, i);
            parcel.writeParcelable(this.hintOverride, i);
            parcel.writeInt(this.minLength);
            parcel.writeInt(this.maxLength);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.footerText);
            parcel.writeInt(this.showBusinessName ? 1 : 0);
            parcel.writeString(this.instructionLabel);
            parcel.writeInt(this.canExit ? 1 : 0);
            parcel.writeParcelable(this.setNameType, i);
        }
    }

    public final class SetPinMessageScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<SetPinMessageScreen> CREATOR = new SetPinScreen.Creator(29);
        public final BlockersData blockersData;
        public final String message;
        public final Screen nextScreen;

        public SetPinMessageScreen(BlockersData blockersData, String str, Screen screen) {
            blockersData.getClass();
            str.getClass();
            screen.getClass();
            this.blockersData = blockersData;
            this.message = str;
            this.nextScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetPinMessageScreen)) {
                return false;
            }
            SetPinMessageScreen setPinMessageScreen = (SetPinMessageScreen) obj;
            return Intrinsics.areEqual(this.blockersData, setPinMessageScreen.blockersData) && Intrinsics.areEqual(this.message, setPinMessageScreen.message) && Intrinsics.areEqual(this.nextScreen, setPinMessageScreen.nextScreen);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.nextScreen.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.message);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "SetPinMessageScreen(blockersData=", ", message=", this.message, ", nextScreen=");
            m.append(this.nextScreen);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
            parcel.writeParcelable(this.nextScreen, i);
        }
    }

    public final class SignatureScreen implements BlockersScreens {
        public static final Parcelable.Creator<SignatureScreen> CREATOR = new Spinner.Creator(2);
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;

        public SignatureScreen(BlockersData blockersData, BlockerAction blockerAction) {
            blockersData.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignatureScreen)) {
                return false;
            }
            SignatureScreen signatureScreen = (SignatureScreen) obj;
            return Intrinsics.areEqual(this.blockersData, signatureScreen.blockersData) && Intrinsics.areEqual(this.dismissAction, signatureScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            return this.dismissAction.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "SignatureScreen(blockersData=" + this.blockersData + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class SkipVerifyScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<SkipVerifyScreen> CREATOR = new Spinner.Creator(3);
        public final BlockersData blockersData;
        public final String message;

        public SkipVerifyScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkipVerifyScreen)) {
                return false;
            }
            SkipVerifyScreen skipVerifyScreen = (SkipVerifyScreen) obj;
            return Intrinsics.areEqual(this.blockersData, skipVerifyScreen.blockersData) && Intrinsics.areEqual(this.message, skipVerifyScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "SkipVerifyScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class Spinner implements Screen {
        public static final Parcelable.Creator<Spinner> CREATOR = new Creator(0);

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                int i = 0;
                ArrayList arrayList5 = null;
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        parcel.readInt();
                        return new Spinner();
                    case 1:
                        parcel.getClass();
                        return new SetPinScreen.TextOverrides(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    case 2:
                        parcel.getClass();
                        return new SignatureScreen((BlockersData) parcel.readParcelable(SignatureScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(SignatureScreen.class.getClassLoader()));
                    case 3:
                        parcel.getClass();
                        return new SkipVerifyScreen((BlockersData) parcel.readParcelable(SkipVerifyScreen.class.getClassLoader()), parcel.readString());
                    case 4:
                        BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, SsnScreen.class);
                        boolean z = parcel.readInt() != 0;
                        boolean z2 = parcel.readInt() != 0;
                        Redacted redacted = (Redacted) parcel.readParcelable(SsnScreen.class.getClassLoader());
                        Redacted redacted2 = (Redacted) parcel.readParcelable(SsnScreen.class.getClassLoader());
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt = parcel.readInt();
                            ArrayList arrayList6 = new ArrayList(readInt);
                            while (i != readInt) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(SsnScreen.class, parcel, arrayList6, i, 1);
                            }
                            arrayList = arrayList6;
                        }
                        return new SsnScreen(blockersData, z, z2, redacted, redacted2, arrayList);
                    case 5:
                        parcel.getClass();
                        return new StartFlowEntryPointScreen((BlockersData) parcel.readParcelable(StartFlowEntryPointScreen.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(StartFlowEntryPointScreen.class.getClassLoader()), StartFlowEntryPoint.Route.valueOf(parcel.readString()), parcel.readInt() != 0 ? StartFlowEntryPointScreen.Origin.valueOf(parcel.readString()) : null);
                    case 6:
                        parcel.getClass();
                        return new StartFlowEntryPointSheet((BlockersData) parcel.readParcelable(StartFlowEntryPointSheet.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(StartFlowEntryPointSheet.class.getClassLoader()), StartFlowEntryPoint.Route.valueOf(parcel.readString()));
                    case 7:
                        parcel.getClass();
                        return new StatusInterstitialScreen((BlockersData) parcel.readParcelable(StatusInterstitialScreen.class.getClassLoader()), (StatusInterstitialBlocker) parcel.readParcelable(StatusInterstitialScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(StatusInterstitialScreen.class.getClassLoader()));
                    case 8:
                        parcel.getClass();
                        return new StatusInterstitialSheet((BlockersData) parcel.readParcelable(StatusInterstitialSheet.class.getClassLoader()), (StatusInterstitialBlocker) parcel.readParcelable(StatusInterstitialSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(StatusInterstitialSheet.class.getClassLoader()));
                    case 9:
                        parcel.getClass();
                        return new StatusResultDialog((BlockersData) parcel.readParcelable(StatusResultDialog.class.getClassLoader()), BlockersData.Flow.valueOf(parcel.readString()), (StatusResult) parcel.readParcelable(StatusResultDialog.class.getClassLoader()));
                    case 10:
                        parcel.getClass();
                        return new StatusResultFullScreen((BlockersData) parcel.readParcelable(StatusResultFullScreen.class.getClassLoader()), BlockersData.Flow.valueOf(parcel.readString()), (StatusResult) parcel.readParcelable(StatusResultFullScreen.class.getClassLoader()));
                    case 11:
                        parcel.getClass();
                        return new StockSelectionBlockerScreen((BlockersData) parcel.readParcelable(StockSelectionBlockerScreen.class.getClassLoader()), (InvestmentEntitySelectionBlocker) parcel.readParcelable(StockSelectionBlockerScreen.class.getClassLoader()), (InvestmentEntityToken) parcel.readParcelable(StockSelectionBlockerScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(StockSelectionBlockerScreen.class.getClassLoader()));
                    case 12:
                        BlockersData blockersData2 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, StreetAddressScreen.class);
                        StreetAddressScreen.FormType valueOf = StreetAddressScreen.FormType.valueOf(parcel.readString());
                        Redacted redacted3 = (Redacted) parcel.readParcelable(StreetAddressScreen.class.getClassLoader());
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        boolean z3 = parcel.readInt() != 0;
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int readInt2 = parcel.readInt();
                            ArrayList arrayList7 = new ArrayList(readInt2);
                            int i2 = 0;
                            while (i2 != readInt2) {
                                i2 = CameraState$Type$EnumUnboxingLocalUtility.m(StreetAddressScreen.class, parcel, arrayList7, i2, 1);
                            }
                            arrayList2 = arrayList7;
                        }
                        return new StreetAddressScreen(blockersData2, valueOf, redacted3, readString, readString2, readString3, z3, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, (StreetAddressScreen.SetStreetAddressType) parcel.readParcelable(StreetAddressScreen.class.getClassLoader()), parcel.readInt() != 0);
                    case 13:
                        parcel.getClass();
                        return new StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress(parcel.readString());
                    case 14:
                        parcel.getClass();
                        return new StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress((ShippingAddress) parcel.readParcelable(StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress.class.getClassLoader()), parcel.readString());
                    case 15:
                        parcel.getClass();
                        parcel.readInt();
                        return StreetAddressScreen.SetStreetAddressType.SetStreetAddressOnly.INSTANCE;
                    case 16:
                        parcel.getClass();
                        return new StripeLinkScreen((BlockersData) parcel.readParcelable(StripeLinkScreen.class.getClassLoader()));
                    case 17:
                        parcel.getClass();
                        return new SuccessMessageScreen((BlockersData) parcel.readParcelable(SuccessMessageScreen.class.getClassLoader()), (Screen) parcel.readParcelable(SuccessMessageScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                    case 18:
                        parcel.getClass();
                        return new TaxWebViewScreen((BlockersData) parcel.readParcelable(TaxWebViewScreen.class.getClassLoader()), parcel.readString());
                    case 19:
                        parcel.getClass();
                        BlockersData blockersData3 = (BlockersData) parcel.readParcelable(ThreeDsAuthenticationScreen.class.getClassLoader());
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        Long l = null;
                        String readString6 = parcel.readString();
                        Image image = (Image) parcel.readParcelable(ThreeDsAuthenticationScreen.class.getClassLoader());
                        Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                        if (parcel.readInt() != 0) {
                            l = Long.valueOf(parcel.readLong());
                        }
                        return new ThreeDsAuthenticationScreen(blockersData3, readString4, readString5, readString6, image, valueOf2, l, parcel.readString());
                    case 20:
                        parcel.getClass();
                        return new TreehouseBlockerQuestion(parcel.readInt());
                    case 21:
                        BlockersData blockersData4 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, TreehouseBlockerScreen.class);
                        String readString7 = parcel.readString();
                        ByteString byteString = (ByteString) parcel.readSerializable();
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        ArrayList arrayList8 = new ArrayList(readInt4);
                        while (i != readInt4) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(TreehouseBlockerScreen.class, parcel, arrayList8, i, 1);
                        }
                        return new TreehouseBlockerScreen(blockersData4, readString7, byteString, readInt3, arrayList8, parcel.readString(), parcel.readString());
                    case 22:
                        parcel.getClass();
                        return new U13CelebrationBlockerScreen((BlockersData) parcel.readParcelable(U13CelebrationBlockerScreen.class.getClassLoader()), (UiAvatar) parcel.readParcelable(U13CelebrationBlockerScreen.class.getClassLoader()), parcel.readString(), (BlockerAction) parcel.readParcelable(U13CelebrationBlockerScreen.class.getClassLoader()));
                    case 23:
                        parcel.getClass();
                        return new UnselectableOptionDialog((BlockersData) parcel.readParcelable(UnselectableOptionDialog.class.getClassLoader()), parcel.readString());
                    case 24:
                        parcel.getClass();
                        return new UpgradeConfirmationScreen((BlockersData) parcel.readParcelable(UpgradeConfirmationScreen.class.getClassLoader()));
                    case 25:
                        BlockersData blockersData5 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, VerifyAliasScreen.class);
                        VerifyAliasScreen.AliasType valueOf3 = VerifyAliasScreen.AliasType.valueOf(parcel.readString());
                        Redacted redacted4 = (Redacted) parcel.readParcelable(VerifyAliasScreen.class.getClassLoader());
                        String readString8 = parcel.readString();
                        Redacted redacted5 = (Redacted) parcel.readParcelable(VerifyAliasScreen.class.getClassLoader());
                        if (parcel.readInt() == 0) {
                            arrayList3 = null;
                        } else {
                            int readInt5 = parcel.readInt();
                            ArrayList arrayList9 = new ArrayList(readInt5);
                            int i3 = 0;
                            while (i3 != readInt5) {
                                i3 = CameraState$Type$EnumUnboxingLocalUtility.m(VerifyAliasScreen.class, parcel, arrayList9, i3, 1);
                            }
                            arrayList3 = arrayList9;
                        }
                        return new VerifyAliasScreen(blockersData5, valueOf3, redacted4, readString8, redacted5, arrayList3, parcel.readInt() != 0, parcel.readString(), (BlockerAction) parcel.readParcelable(VerifyAliasScreen.class.getClassLoader()));
                    case 26:
                        BlockersData blockersData6 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, VerifyCardScreen.class);
                        Redacted redacted6 = (Redacted) parcel.readParcelable(VerifyCardScreen.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            int readInt6 = parcel.readInt();
                            ArrayList arrayList10 = new ArrayList(readInt6);
                            while (i != readInt6) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(VerifyCardScreen.class, parcel, arrayList10, i, 1);
                            }
                            arrayList5 = arrayList10;
                        }
                        return new VerifyCardScreen(blockersData6, redacted6, arrayList5, parcel.readString());
                    case 27:
                        parcel.getClass();
                        return new VerifyErrorScreen((BlockersData) parcel.readParcelable(VerifyErrorScreen.class.getClassLoader()), parcel.readString());
                    case 28:
                        BlockersData blockersData7 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, VerifyHelpScreen.class);
                        if (parcel.readInt() == 0) {
                            arrayList4 = null;
                        } else {
                            int readInt7 = parcel.readInt();
                            ArrayList arrayList11 = new ArrayList(readInt7);
                            int i4 = 0;
                            while (i4 != readInt7) {
                                i4 = CameraState$Type$EnumUnboxingLocalUtility.m(VerifyHelpScreen.class, parcel, arrayList11, i4, 1);
                            }
                            arrayList4 = arrayList11;
                        }
                        return new VerifyHelpScreen(blockersData7, arrayList4, VerifyHelpScreen.Type.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                    default:
                        parcel.getClass();
                        return new VerifyMagic((BlockersData) parcel.readParcelable(VerifyMagic.class.getClassLoader()), parcel.readString());
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new Spinner[i];
                    case 1:
                        return new SetPinScreen.TextOverrides[i];
                    case 2:
                        return new SignatureScreen[i];
                    case 3:
                        return new SkipVerifyScreen[i];
                    case 4:
                        return new SsnScreen[i];
                    case 5:
                        return new StartFlowEntryPointScreen[i];
                    case 6:
                        return new StartFlowEntryPointSheet[i];
                    case 7:
                        return new StatusInterstitialScreen[i];
                    case 8:
                        return new StatusInterstitialSheet[i];
                    case 9:
                        return new StatusResultDialog[i];
                    case 10:
                        return new StatusResultFullScreen[i];
                    case 11:
                        return new StockSelectionBlockerScreen[i];
                    case 12:
                        return new StreetAddressScreen[i];
                    case 13:
                        return new StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress[i];
                    case 14:
                        return new StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress[i];
                    case 15:
                        return new StreetAddressScreen.SetStreetAddressType.SetStreetAddressOnly[i];
                    case 16:
                        return new StripeLinkScreen[i];
                    case 17:
                        return new SuccessMessageScreen[i];
                    case 18:
                        return new TaxWebViewScreen[i];
                    case 19:
                        return new ThreeDsAuthenticationScreen[i];
                    case 20:
                        return new TreehouseBlockerQuestion[i];
                    case 21:
                        return new TreehouseBlockerScreen[i];
                    case 22:
                        return new U13CelebrationBlockerScreen[i];
                    case 23:
                        return new UnselectableOptionDialog[i];
                    case 24:
                        return new UpgradeConfirmationScreen[i];
                    case 25:
                        return new VerifyAliasScreen[i];
                    case 26:
                        return new VerifyCardScreen[i];
                    case 27:
                        return new VerifyErrorScreen[i];
                    case 28:
                        return new VerifyHelpScreen[i];
                    default:
                        return new VerifyMagic[i];
                }
            }
        }

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

    public interface StartFlowEntryPoint extends BlockersScreens {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class Route {
            public static final /* synthetic */ Route[] $VALUES;
            public static final Route FRANKLIN;
            public static final Route INVESTING;

            static {
                Route route = new Route("FRANKLIN", 0);
                FRANKLIN = route;
                Route route2 = new Route("INVESTING", 1);
                INVESTING = route2;
                $VALUES = new Route[]{route, route2};
            }

            public static Route valueOf(String str) {
                return (Route) Enum.valueOf(Route.class, str);
            }

            public static Route[] values() {
                return (Route[]) $VALUES.clone();
            }
        }

        String getInitiationData();

        Screen getOnErrorExitScreen();

        Route getRoute();
    }

    public final class StartFlowEntryPointSheet implements StartFlowEntryPoint, BottomSheetScreen {
        public static final Parcelable.Creator<StartFlowEntryPointSheet> CREATOR = new Spinner.Creator(6);
        public final BlockersData blockersData;
        public final String initiationData;
        public final Screen onErrorExitScreen;
        public final StartFlowEntryPoint.Route route;

        public StartFlowEntryPointSheet(BlockersData blockersData, String str, Screen screen, StartFlowEntryPoint.Route route) {
            blockersData.getClass();
            route.getClass();
            this.blockersData = blockersData;
            this.initiationData = str;
            this.onErrorExitScreen = screen;
            this.route = route;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartFlowEntryPointSheet)) {
                return false;
            }
            StartFlowEntryPointSheet startFlowEntryPointSheet = (StartFlowEntryPointSheet) obj;
            return Intrinsics.areEqual(this.blockersData, startFlowEntryPointSheet.blockersData) && Intrinsics.areEqual(this.initiationData, startFlowEntryPointSheet.initiationData) && Intrinsics.areEqual(this.onErrorExitScreen, startFlowEntryPointSheet.onErrorExitScreen) && this.route == startFlowEntryPointSheet.route;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final String getInitiationData() {
            return this.initiationData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final Screen getOnErrorExitScreen() {
            return this.onErrorExitScreen;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final StartFlowEntryPoint.Route getRoute() {
            return this.route;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.initiationData;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Screen screen = this.onErrorExitScreen;
            return this.route.hashCode() + ((hashCode2 + (screen != null ? screen.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "StartFlowEntryPointSheet(blockersData=", ", initiationData=", this.initiationData, ", onErrorExitScreen=");
            m.append(this.onErrorExitScreen);
            m.append(", route=");
            m.append(this.route);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.initiationData);
            parcel.writeParcelable(this.onErrorExitScreen, i);
            parcel.writeString(this.route.name());
        }
    }

    public interface StatusInterstitial extends BlockersScreens {
        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        BlockerAction getDismissAction();

        StatusInterstitialBlocker getStatusInterstitialBlocker();
    }

    public final class StatusInterstitialScreen implements StatusInterstitial {
        public static final Parcelable.Creator<StatusInterstitialScreen> CREATOR = new Spinner.Creator(7);
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final StatusInterstitialBlocker statusInterstitialBlocker;

        public StatusInterstitialScreen(BlockersData blockersData, StatusInterstitialBlocker statusInterstitialBlocker, BlockerAction blockerAction) {
            blockersData.getClass();
            statusInterstitialBlocker.getClass();
            this.blockersData = blockersData;
            this.statusInterstitialBlocker = statusInterstitialBlocker;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusInterstitialScreen)) {
                return false;
            }
            StatusInterstitialScreen statusInterstitialScreen = (StatusInterstitialScreen) obj;
            return Intrinsics.areEqual(this.blockersData, statusInterstitialScreen.blockersData) && Intrinsics.areEqual(this.statusInterstitialBlocker, statusInterstitialScreen.statusInterstitialBlocker) && Intrinsics.areEqual(this.dismissAction, statusInterstitialScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusInterstitial, com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusInterstitial
        public final StatusInterstitialBlocker getStatusInterstitialBlocker() {
            return this.statusInterstitialBlocker;
        }

        public final int hashCode() {
            int hashCode = (this.statusInterstitialBlocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            BlockerAction blockerAction = this.dismissAction;
            return hashCode + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            return "StatusInterstitialScreen(blockersData=" + this.blockersData + ", statusInterstitialBlocker=" + this.statusInterstitialBlocker + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.statusInterstitialBlocker, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class StatusInterstitialSheet implements StatusInterstitial, BottomSheetScreen {
        public static final Parcelable.Creator<StatusInterstitialSheet> CREATOR = new Spinner.Creator(8);
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final StatusInterstitialBlocker statusInterstitialBlocker;

        public StatusInterstitialSheet(BlockersData blockersData, StatusInterstitialBlocker statusInterstitialBlocker, BlockerAction blockerAction) {
            blockersData.getClass();
            statusInterstitialBlocker.getClass();
            this.blockersData = blockersData;
            this.statusInterstitialBlocker = statusInterstitialBlocker;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusInterstitialSheet)) {
                return false;
            }
            StatusInterstitialSheet statusInterstitialSheet = (StatusInterstitialSheet) obj;
            return Intrinsics.areEqual(this.blockersData, statusInterstitialSheet.blockersData) && Intrinsics.areEqual(this.statusInterstitialBlocker, statusInterstitialSheet.statusInterstitialBlocker) && Intrinsics.areEqual(this.dismissAction, statusInterstitialSheet.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusInterstitial, com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusInterstitial
        public final StatusInterstitialBlocker getStatusInterstitialBlocker() {
            return this.statusInterstitialBlocker;
        }

        public final int hashCode() {
            int hashCode = (this.statusInterstitialBlocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            BlockerAction blockerAction = this.dismissAction;
            return hashCode + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            return "StatusInterstitialSheet(blockersData=" + this.blockersData + ", statusInterstitialBlocker=" + this.statusInterstitialBlocker + ", dismissAction=" + this.dismissAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.statusInterstitialBlocker, i);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class StatusResultDialog implements StatusResultScreen, BlockersDialogScreens {
        public static final Parcelable.Creator<StatusResultDialog> CREATOR = new Spinner.Creator(9);
        public final BlockersData blockersData;
        public final BlockersData.Flow flow;
        public final StatusResult statusResult;

        public StatusResultDialog(BlockersData blockersData, BlockersData.Flow flow, StatusResult statusResult) {
            blockersData.getClass();
            flow.getClass();
            statusResult.getClass();
            this.blockersData = blockersData;
            this.flow = flow;
            this.statusResult = statusResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusResultDialog)) {
                return false;
            }
            StatusResultDialog statusResultDialog = (StatusResultDialog) obj;
            return Intrinsics.areEqual(this.blockersData, statusResultDialog.blockersData) && this.flow == statusResultDialog.flow && Intrinsics.areEqual(this.statusResult, statusResultDialog.statusResult);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusResultScreen
        public final BlockersData.Flow getFlow() {
            return this.flow;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusResultScreen
        public final StatusResult getStatusResult() {
            return this.statusResult;
        }

        public final int hashCode() {
            return this.statusResult.hashCode() + ((this.flow.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "StatusResultDialog(blockersData=" + this.blockersData + ", flow=" + this.flow + ", statusResult=" + this.statusResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.flow.name());
            parcel.writeParcelable(this.statusResult, i);
        }
    }

    public final class StatusResultFullScreen implements StatusResultScreen {
        public static final Parcelable.Creator<StatusResultFullScreen> CREATOR = new Spinner.Creator(10);
        public final BlockersData blockersData;
        public final BlockersData.Flow flow;
        public final StatusResult statusResult;

        public StatusResultFullScreen(BlockersData blockersData, BlockersData.Flow flow, StatusResult statusResult) {
            blockersData.getClass();
            flow.getClass();
            statusResult.getClass();
            this.blockersData = blockersData;
            this.flow = flow;
            this.statusResult = statusResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusResultFullScreen)) {
                return false;
            }
            StatusResultFullScreen statusResultFullScreen = (StatusResultFullScreen) obj;
            return Intrinsics.areEqual(this.blockersData, statusResultFullScreen.blockersData) && this.flow == statusResultFullScreen.flow && Intrinsics.areEqual(this.statusResult, statusResultFullScreen.statusResult);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusResultScreen
        public final BlockersData.Flow getFlow() {
            return this.flow;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StatusResultScreen
        public final StatusResult getStatusResult() {
            return this.statusResult;
        }

        public final int hashCode() {
            return this.statusResult.hashCode() + ((this.flow.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "StatusResultFullScreen(blockersData=" + this.blockersData + ", flow=" + this.flow + ", statusResult=" + this.statusResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.flow.name());
            parcel.writeParcelable(this.statusResult, i);
        }
    }

    public interface StatusResultScreen extends BlockersScreens {
        BlockersData.Flow getFlow();

        StatusResult getStatusResult();
    }

    public final class StripeLinkScreen implements BlockersScreens, NeverInBackStackScreen {
        public static final Parcelable.Creator<StripeLinkScreen> CREATOR = new Spinner.Creator(16);
        public final BlockersData blockersData;

        public StripeLinkScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StripeLinkScreen) && Intrinsics.areEqual(this.blockersData, ((StripeLinkScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "StripeLinkScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public interface SwappingBlockersScreens extends ChildBlockersScreens {
    }

    public final class TaxWebViewScreen implements BlockersScreens {
        public static final Parcelable.Creator<TaxWebViewScreen> CREATOR = new Spinner.Creator(18);
        public final BlockersData blockersData;
        public final String url;

        public TaxWebViewScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.url = str;
        }

        public static TaxWebViewScreen copy$default(TaxWebViewScreen taxWebViewScreen, String str) {
            BlockersData blockersData = taxWebViewScreen.blockersData;
            taxWebViewScreen.getClass();
            blockersData.getClass();
            return new TaxWebViewScreen(blockersData, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaxWebViewScreen)) {
                return false;
            }
            TaxWebViewScreen taxWebViewScreen = (TaxWebViewScreen) obj;
            return Intrinsics.areEqual(this.blockersData, taxWebViewScreen.blockersData) && Intrinsics.areEqual(this.url, taxWebViewScreen.url);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "TaxWebViewScreen(blockersData=" + this.blockersData + ", url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.url);
        }
    }

    public final class ThreeDsAuthenticationScreen implements BlockersScreens {
        public static final Parcelable.Creator<ThreeDsAuthenticationScreen> CREATOR = new Spinner.Creator(19);
        public final BlockersData blockersData;
        public final String directoryServerId;
        public final Image issuerLogo;
        public final String messageVersion;
        public final Long minimumDelayMs;
        public final String progressMessage;
        public final String publicIpAddress;
        public final Long timeoutMs;

        public ThreeDsAuthenticationScreen(BlockersData blockersData, String str, String str2, String str3, Image image, Long l, Long l2, String str4) {
            blockersData.getClass();
            str.getClass();
            str2.getClass();
            this.blockersData = blockersData;
            this.directoryServerId = str;
            this.messageVersion = str2;
            this.progressMessage = str3;
            this.issuerLogo = image;
            this.minimumDelayMs = l;
            this.timeoutMs = l2;
            this.publicIpAddress = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreeDsAuthenticationScreen)) {
                return false;
            }
            ThreeDsAuthenticationScreen threeDsAuthenticationScreen = (ThreeDsAuthenticationScreen) obj;
            return Intrinsics.areEqual(this.blockersData, threeDsAuthenticationScreen.blockersData) && Intrinsics.areEqual(this.directoryServerId, threeDsAuthenticationScreen.directoryServerId) && Intrinsics.areEqual(this.messageVersion, threeDsAuthenticationScreen.messageVersion) && Intrinsics.areEqual(this.progressMessage, threeDsAuthenticationScreen.progressMessage) && Intrinsics.areEqual(this.issuerLogo, threeDsAuthenticationScreen.issuerLogo) && Intrinsics.areEqual(this.minimumDelayMs, threeDsAuthenticationScreen.minimumDelayMs) && Intrinsics.areEqual(this.timeoutMs, threeDsAuthenticationScreen.timeoutMs) && Intrinsics.areEqual(this.publicIpAddress, threeDsAuthenticationScreen.publicIpAddress);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.directoryServerId), 31, this.messageVersion);
            String str = this.progressMessage;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.issuerLogo;
            int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
            Long l = this.minimumDelayMs;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.timeoutMs;
            int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str2 = this.publicIpAddress;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ThreeDsAuthenticationScreen(blockersData=", ", directoryServerId=", this.directoryServerId, ", messageVersion=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.messageVersion, ", progressMessage=", this.progressMessage, ", issuerLogo=");
            m.append(this.issuerLogo);
            m.append(", minimumDelayMs=");
            m.append(this.minimumDelayMs);
            m.append(", timeoutMs=");
            m.append(this.timeoutMs);
            m.append(", publicIpAddress=");
            m.append(this.publicIpAddress);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.directoryServerId);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.progressMessage);
            parcel.writeParcelable(this.issuerLogo, i);
            Long l = this.minimumDelayMs;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            Long l2 = this.timeoutMs;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l2);
            }
            parcel.writeString(this.publicIpAddress);
        }
    }

    /* loaded from: classes4.dex */
    public final class TreehouseBlockerQuestion implements Question {
        public static final Parcelable.Creator<TreehouseBlockerQuestion> CREATOR = new Spinner.Creator(20);
        public final int stackSize;

        public TreehouseBlockerQuestion(int i) {
            this.stackSize = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TreehouseBlockerQuestion) && this.stackSize == ((TreehouseBlockerQuestion) obj).stackSize;
        }

        public final int hashCode() {
            return Integer.hashCode(this.stackSize);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stackSize, "TreehouseBlockerQuestion(stackSize=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.stackSize);
        }
    }

    public final class U13CelebrationBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<U13CelebrationBlockerScreen> CREATOR = new Spinner.Creator(22);
        public final UiAvatar avatar;
        public final BlockersData blockersData;
        public final BlockerAction ctaButtonAction;
        public final String title;

        public U13CelebrationBlockerScreen(BlockersData blockersData, UiAvatar uiAvatar, String str, BlockerAction blockerAction) {
            blockersData.getClass();
            str.getClass();
            blockerAction.getClass();
            this.blockersData = blockersData;
            this.avatar = uiAvatar;
            this.title = str;
            this.ctaButtonAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof U13CelebrationBlockerScreen)) {
                return false;
            }
            U13CelebrationBlockerScreen u13CelebrationBlockerScreen = (U13CelebrationBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, u13CelebrationBlockerScreen.blockersData) && Intrinsics.areEqual(this.avatar, u13CelebrationBlockerScreen.avatar) && Intrinsics.areEqual(this.title, u13CelebrationBlockerScreen.title) && Intrinsics.areEqual(this.ctaButtonAction, u13CelebrationBlockerScreen.ctaButtonAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            UiAvatar uiAvatar = this.avatar;
            return this.ctaButtonAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31, 31, this.title);
        }

        public final String toString() {
            return "U13CelebrationBlockerScreen(blockersData=" + this.blockersData + ", avatar=" + this.avatar + ", title=" + this.title + ", ctaButtonAction=" + this.ctaButtonAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.avatar, i);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.ctaButtonAction, i);
        }
    }

    public final class UnselectableOptionDialog implements BlockersDialogScreens {
        public static final Parcelable.Creator<UnselectableOptionDialog> CREATOR = new Spinner.Creator(23);
        public final BlockersData blockersData;
        public final String message;

        public UnselectableOptionDialog(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnselectableOptionDialog)) {
                return false;
            }
            UnselectableOptionDialog unselectableOptionDialog = (UnselectableOptionDialog) obj;
            return Intrinsics.areEqual(this.blockersData, unselectableOptionDialog.blockersData) && Intrinsics.areEqual(this.message, unselectableOptionDialog.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "UnselectableOptionDialog(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    public final class UpgradeConfirmationScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<UpgradeConfirmationScreen> CREATOR = new Spinner.Creator(24);
        public final BlockersData blockersData;

        public UpgradeConfirmationScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpgradeConfirmationScreen) && Intrinsics.areEqual(this.blockersData, ((UpgradeConfirmationScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "UpgradeConfirmationScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    public final class VerifyAliasScreen implements BlockersScreens {
        public static final Parcelable.Creator<VerifyAliasScreen> CREATOR = new Spinner.Creator(25);
        public final Redacted alias;
        public final AliasType aliasType;
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final String headline;
        public final List helpItems;
        public final Redacted mainText;
        public final String skipMessage;
        public final boolean suppressEdit;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class AliasType {
            public static final /* synthetic */ AliasType[] $VALUES;
            public static final AliasType EMAIL;
            public static final AliasType SMS;

            static {
                AliasType aliasType = new AliasType("EMAIL", 0);
                EMAIL = aliasType;
                AliasType aliasType2 = new AliasType("SMS", 1);
                SMS = aliasType2;
                $VALUES = new AliasType[]{aliasType, aliasType2};
            }

            public static AliasType valueOf(String str) {
                return (AliasType) Enum.valueOf(AliasType.class, str);
            }

            public static AliasType[] values() {
                return (AliasType[]) $VALUES.clone();
            }
        }

        public VerifyAliasScreen(BlockersData blockersData, AliasType aliasType, Redacted redacted, String str, Redacted redacted2, List list, boolean z, String str2, BlockerAction blockerAction) {
            blockersData.getClass();
            aliasType.getClass();
            redacted.getClass();
            redacted2.getClass();
            this.blockersData = blockersData;
            this.aliasType = aliasType;
            this.alias = redacted;
            this.skipMessage = str;
            this.mainText = redacted2;
            this.helpItems = list;
            this.suppressEdit = z;
            this.headline = str2;
            this.dismissAction = blockerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyAliasScreen)) {
                return false;
            }
            VerifyAliasScreen verifyAliasScreen = (VerifyAliasScreen) obj;
            return Intrinsics.areEqual(this.blockersData, verifyAliasScreen.blockersData) && this.aliasType == verifyAliasScreen.aliasType && Intrinsics.areEqual(this.alias, verifyAliasScreen.alias) && Intrinsics.areEqual(this.skipMessage, verifyAliasScreen.skipMessage) && Intrinsics.areEqual(this.mainText, verifyAliasScreen.mainText) && Intrinsics.areEqual(this.helpItems, verifyAliasScreen.helpItems) && this.suppressEdit == verifyAliasScreen.suppressEdit && Intrinsics.areEqual(this.headline, verifyAliasScreen.headline) && Intrinsics.areEqual(this.dismissAction, verifyAliasScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int m = re$$ExternalSyntheticOutline0.m(this.alias, (this.aliasType.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31);
            String str = this.skipMessage;
            int m2 = re$$ExternalSyntheticOutline0.m(this.mainText, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
            List list = this.helpItems;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.suppressEdit);
            String str2 = this.headline;
            int hashCode = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BlockerAction blockerAction = this.dismissAction;
            return hashCode + (blockerAction != null ? blockerAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VerifyAliasScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", aliasType=");
            sb.append(this.aliasType);
            sb.append(", alias=");
            sb.append(this.alias);
            sb.append(", skipMessage=");
            sb.append(this.skipMessage);
            sb.append(", mainText=");
            sb.append(this.mainText);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", suppressEdit=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.suppressEdit, ", headline=", this.headline, ", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.aliasType.name());
            parcel.writeParcelable(this.alias, i);
            parcel.writeString(this.skipMessage);
            parcel.writeParcelable(this.mainText, i);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeInt(this.suppressEdit ? 1 : 0);
            parcel.writeString(this.headline);
            parcel.writeParcelable(this.dismissAction, i);
        }
    }

    public final class VerifyCardScreen implements BlockersScreens {
        public static final Parcelable.Creator<VerifyCardScreen> CREATOR = new Spinner.Creator(26);
        public final BlockersData blockersData;
        public final List helpItems;
        public final String inputHint;
        public final Redacted title;

        public VerifyCardScreen(BlockersData blockersData, Redacted redacted, List list, String str) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.title = redacted;
            this.helpItems = list;
            this.inputHint = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyCardScreen)) {
                return false;
            }
            VerifyCardScreen verifyCardScreen = (VerifyCardScreen) obj;
            return Intrinsics.areEqual(this.blockersData, verifyCardScreen.blockersData) && Intrinsics.areEqual(this.title, verifyCardScreen.title) && Intrinsics.areEqual(this.helpItems, verifyCardScreen.helpItems) && Intrinsics.areEqual(this.inputHint, verifyCardScreen.inputHint);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            Redacted redacted = this.title;
            int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
            List list = this.helpItems;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.inputHint;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "VerifyCardScreen(blockersData=" + this.blockersData + ", title=" + this.title + ", helpItems=" + this.helpItems + ", inputHint=" + this.inputHint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.title, i);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.inputHint);
        }
    }

    public final class VerifyErrorScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<VerifyErrorScreen> CREATOR = new Spinner.Creator(27);
        public final BlockersData blockersData;
        public final String message;

        public VerifyErrorScreen(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyErrorScreen)) {
                return false;
            }
            VerifyErrorScreen verifyErrorScreen = (VerifyErrorScreen) obj;
            return Intrinsics.areEqual(this.blockersData, verifyErrorScreen.blockersData) && Intrinsics.areEqual(this.message, verifyErrorScreen.message);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "VerifyErrorScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.message);
        }
    }

    /* loaded from: classes4.dex */
    public final class VerifyHelpScreen implements HelpOptions {
        public static final Parcelable.Creator<VerifyHelpScreen> CREATOR = new Spinner.Creator(28);
        public final BlockersData blockersData;
        public final List helpItems;
        public final boolean showSkip;
        public final boolean suppressEditEmail;
        public final boolean suppressEditSms;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1063type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type EMAIL;
            public static final Type PHONE;

            static {
                Type type2 = new Type("EMAIL", 0);
                EMAIL = type2;
                Type type3 = new Type("PHONE", 1);
                PHONE = type3;
                $VALUES = new Type[]{type2, type3};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public VerifyHelpScreen(BlockersData blockersData, List list, Type type2, boolean z, boolean z2, boolean z3) {
            blockersData.getClass();
            type2.getClass();
            this.blockersData = blockersData;
            this.helpItems = list;
            this.f1063type = type2;
            this.showSkip = z;
            this.suppressEditEmail = z2;
            this.suppressEditSms = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyHelpScreen)) {
                return false;
            }
            VerifyHelpScreen verifyHelpScreen = (VerifyHelpScreen) obj;
            return Intrinsics.areEqual(this.blockersData, verifyHelpScreen.blockersData) && Intrinsics.areEqual(this.helpItems, verifyHelpScreen.helpItems) && this.f1063type == verifyHelpScreen.f1063type && this.showSkip == verifyHelpScreen.showSkip && this.suppressEditEmail == verifyHelpScreen.suppressEditEmail && this.suppressEditSms == verifyHelpScreen.suppressEditSms;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            List list = this.helpItems;
            return Boolean.hashCode(this.suppressEditSms) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1063type.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.showSkip), 31, this.suppressEditEmail);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VerifyHelpScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", type=");
            sb.append(this.f1063type);
            sb.append(", showSkip=");
            sb.append(this.showSkip);
            sb.append(", suppressEditEmail=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.suppressEditEmail, ", suppressEditSms=", this.suppressEditSms, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.f1063type.name());
            parcel.writeInt(this.showSkip ? 1 : 0);
            parcel.writeInt(this.suppressEditEmail ? 1 : 0);
            parcel.writeInt(this.suppressEditSms ? 1 : 0);
        }
    }

    public final class VerifyMagic implements BlockersScreens {
        public static final Parcelable.Creator<VerifyMagic> CREATOR = new Spinner.Creator(29);
        public final BlockersData blockersData;
        public final String verificationToken;

        public VerifyMagic(BlockersData blockersData, String str) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.verificationToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyMagic)) {
                return false;
            }
            VerifyMagic verifyMagic = (VerifyMagic) obj;
            return Intrinsics.areEqual(this.blockersData, verifyMagic.blockersData) && Intrinsics.areEqual(this.verificationToken, verifyMagic.verificationToken);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.verificationToken.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "VerifyMagic(blockersData=" + this.blockersData + ", verificationToken=" + this.verificationToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.verificationToken);
        }
    }

    public final class WebViewBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<WebViewBlockerScreen> CREATOR = new Creator();
        public final boolean allowPopups;
        public final BlockersData blockersData;
        public final String callbackUrl;
        public final List cookies;
        public final Map metadata;
        public final WebviewBlocker.NavigationFooter navigationFooter;
        public final WebviewBlocker.NavigationHeader navigationHeader;
        public final String url;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, WebViewBlockerScreen.class);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (true) {
                    if (i == readInt) {
                        break;
                    }
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(WebViewBlockerScreen.class, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new WebViewBlockerScreen(blockersData, readString, readString2, arrayList, linkedHashMap, parcel.readInt() != 0, (WebviewBlocker.NavigationHeader) parcel.readParcelable(WebViewBlockerScreen.class.getClassLoader()), (WebviewBlocker.NavigationFooter) parcel.readParcelable(WebViewBlockerScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WebViewBlockerScreen[i];
            }
        }

        public WebViewBlockerScreen(BlockersData blockersData, String str, String str2, List list, Map map, boolean z, WebviewBlocker.NavigationHeader navigationHeader, WebviewBlocker.NavigationFooter navigationFooter) {
            blockersData.getClass();
            str.getClass();
            list.getClass();
            map.getClass();
            this.blockersData = blockersData;
            this.url = str;
            this.callbackUrl = str2;
            this.cookies = list;
            this.metadata = map;
            this.allowPopups = z;
            this.navigationHeader = navigationHeader;
            this.navigationFooter = navigationFooter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewBlockerScreen)) {
                return false;
            }
            WebViewBlockerScreen webViewBlockerScreen = (WebViewBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, webViewBlockerScreen.blockersData) && Intrinsics.areEqual(this.url, webViewBlockerScreen.url) && Intrinsics.areEqual(this.callbackUrl, webViewBlockerScreen.callbackUrl) && Intrinsics.areEqual(this.cookies, webViewBlockerScreen.cookies) && Intrinsics.areEqual(this.metadata, webViewBlockerScreen.metadata) && this.allowPopups == webViewBlockerScreen.allowPopups && Intrinsics.areEqual(this.navigationHeader, webViewBlockerScreen.navigationHeader) && Intrinsics.areEqual(this.navigationFooter, webViewBlockerScreen.navigationFooter);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.url);
            String str = this.callbackUrl;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.cookies), this.metadata, 31), 31, this.allowPopups);
            WebviewBlocker.NavigationHeader navigationHeader = this.navigationHeader;
            int hashCode = (m2 + (navigationHeader == null ? 0 : navigationHeader.hashCode())) * 31;
            WebviewBlocker.NavigationFooter navigationFooter = this.navigationFooter;
            return hashCode + (navigationFooter != null ? navigationFooter.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "WebViewBlockerScreen(blockersData=", ", url=", this.url, ", callbackUrl=");
            NavAction$$ExternalSyntheticOutline0.m(this.callbackUrl, ", cookies=", ", metadata=", m, this.cookies);
            m.append(this.metadata);
            m.append(", allowPopups=");
            m.append(this.allowPopups);
            m.append(", navigationHeader=");
            m.append(this.navigationHeader);
            m.append(", navigationFooter=");
            m.append(this.navigationFooter);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.url);
            parcel.writeString(this.callbackUrl);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.cookies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.metadata, parcel);
            while (m2.hasNext()) {
                Map.Entry entry = (Map.Entry) m2.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            parcel.writeInt(this.allowPopups ? 1 : 0);
            parcel.writeParcelable(this.navigationHeader, i);
            parcel.writeParcelable(this.navigationFooter, i);
        }
    }

    public final class WelcomeScreen implements BlockersScreens, NeverInBackStackScreen {
        public static final Parcelable.Creator<WelcomeScreen> CREATOR = new PasscodeHelpResult.Creator(1);
        public final BlockersData blockersData;

        public WelcomeScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WelcomeScreen) && Intrinsics.areEqual(this.blockersData, ((WelcomeScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "WelcomeScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }
    }

    BlockersData getBlockersData();

    default BlockerAction getDismissAction() {
        return null;
    }

    BlockerAction getRetreatAction();

    public final class ReadContactsPermissionScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<ReadContactsPermissionScreen> CREATOR = new SetPinScreen.Creator(13);
        public final BlockersData blockersData;

        public ReadContactsPermissionScreen(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReadContactsPermissionScreen) && Intrinsics.areEqual(this.blockersData, ((ReadContactsPermissionScreen) obj).blockersData);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ReadContactsPermissionScreen(blockersData=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
        }

        public /* synthetic */ ReadContactsPermissionScreen() {
            this(BlockersData.DUMMY);
        }
    }

    /* loaded from: classes4.dex */
    public final class StockSelectionBlockerScreen implements BlockersScreens, ReceivesStockSelectionResult, AccentedScreen {
        public static final Parcelable.Creator<StockSelectionBlockerScreen> CREATOR = new Spinner.Creator(11);
        public final ColorModel accentColor;
        public final InvestmentEntitySelectionBlocker blocker;
        public final BlockersData blockersData;
        public final InvestmentEntityToken stockSelectionResult;

        public StockSelectionBlockerScreen(BlockersData blockersData, InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker, InvestmentEntityToken investmentEntityToken, ColorModel colorModel) {
            blockersData.getClass();
            investmentEntitySelectionBlocker.getClass();
            this.blockersData = blockersData;
            this.blocker = investmentEntitySelectionBlocker;
            this.stockSelectionResult = investmentEntityToken;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockSelectionBlockerScreen)) {
                return false;
            }
            StockSelectionBlockerScreen stockSelectionBlockerScreen = (StockSelectionBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, stockSelectionBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, stockSelectionBlockerScreen.blocker) && Intrinsics.areEqual(this.stockSelectionResult, stockSelectionBlockerScreen.stockSelectionResult) && Intrinsics.areEqual(this.accentColor, stockSelectionBlockerScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = (this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            InvestmentEntityToken investmentEntityToken = this.stockSelectionResult;
            int hashCode2 = (hashCode + (investmentEntityToken == null ? 0 : investmentEntityToken.value.hashCode())) * 31;
            ColorModel colorModel = this.accentColor;
            return hashCode2 + (colorModel != null ? colorModel.hashCode() : 0);
        }

        public final String toString() {
            return "StockSelectionBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", stockSelectionResult=" + this.stockSelectionResult + ", accentColor=" + this.accentColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.blocker, i);
            parcel.writeParcelable(this.stockSelectionResult, i);
            parcel.writeParcelable(this.accentColor, i);
        }

        public /* synthetic */ StockSelectionBlockerScreen(BlockersData blockersData, InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker, ColorModel.Accented accented) {
            this(blockersData, investmentEntitySelectionBlocker, null, accented);
        }
    }

    public final class SuccessMessageScreen implements BlockersDialogScreens {
        public static final Parcelable.Creator<SuccessMessageScreen> CREATOR = new Spinner.Creator(17);
        public final BlockersData blockersData;
        public final String message;
        public final Screen next;
        public final String title;

        public SuccessMessageScreen(BlockersData blockersData, Screen screen, String str, String str2) {
            blockersData.getClass();
            str.getClass();
            this.blockersData = blockersData;
            this.next = screen;
            this.message = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessMessageScreen)) {
                return false;
            }
            SuccessMessageScreen successMessageScreen = (SuccessMessageScreen) obj;
            return Intrinsics.areEqual(this.blockersData, successMessageScreen.blockersData) && Intrinsics.areEqual(this.next, successMessageScreen.next) && Intrinsics.areEqual(this.message, successMessageScreen.message) && Intrinsics.areEqual(this.title, successMessageScreen.title);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            Screen screen = this.next;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.message);
            String str = this.title;
            return m + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessMessageScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", next=");
            sb.append(this.next);
            sb.append(", message=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.message, ", title=", this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.next, i);
            parcel.writeString(this.message);
            parcel.writeString(this.title);
        }

        public /* synthetic */ SuccessMessageScreen(BlockersData blockersData, Screen screen, String str, String str2, int i) {
            this(blockersData, (i & 2) != 0 ? null : screen, str, (i & 8) != 0 ? null : str2);
        }
    }

    public final class BankAccountLinkingScreen implements BlockersScreens {
        public static final Parcelable.Creator<BankAccountLinkingScreen> CREATOR = new CameraError.Creator(5);
        public final BlockersData blockersData;
        public final boolean fromLinkCardScreen;
        public final List helpItems;
        public final String inputHint;
        public final Redacted titleOverride;
        public final boolean verifyingAcount;

        public BankAccountLinkingScreen(BlockersData blockersData, Redacted redacted, boolean z, boolean z2, List list, String str) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.titleOverride = redacted;
            this.fromLinkCardScreen = z;
            this.verifyingAcount = z2;
            this.helpItems = list;
            this.inputHint = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BankAccountLinkingScreen)) {
                return false;
            }
            BankAccountLinkingScreen bankAccountLinkingScreen = (BankAccountLinkingScreen) obj;
            return Intrinsics.areEqual(this.blockersData, bankAccountLinkingScreen.blockersData) && Intrinsics.areEqual(this.titleOverride, bankAccountLinkingScreen.titleOverride) && this.fromLinkCardScreen == bankAccountLinkingScreen.fromLinkCardScreen && this.verifyingAcount == bankAccountLinkingScreen.verifyingAcount && Intrinsics.areEqual(this.helpItems, bankAccountLinkingScreen.helpItems) && Intrinsics.areEqual(this.inputHint, bankAccountLinkingScreen.inputHint);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            Redacted redacted = this.titleOverride;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31, 31, this.fromLinkCardScreen), 31, this.verifyingAcount);
            List list = this.helpItems;
            int hashCode2 = (m + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.inputHint;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BankAccountLinkingScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", titleOverride=");
            sb.append(this.titleOverride);
            sb.append(", fromLinkCardScreen=");
            re$$ExternalSyntheticOutline0.m(sb, this.fromLinkCardScreen, ", verifyingAcount=", this.verifyingAcount, ", helpItems=");
            sb.append(this.helpItems);
            sb.append(", inputHint=");
            sb.append(this.inputHint);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.titleOverride, i);
            parcel.writeInt(this.fromLinkCardScreen ? 1 : 0);
            parcel.writeInt(this.verifyingAcount ? 1 : 0);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.inputHint);
        }

        public /* synthetic */ BankAccountLinkingScreen(BlockersData blockersData, RedactedString redactedString, boolean z, int i) {
            this(blockersData, (i & 2) != 0 ? null : redactedString, z, false, null, null);
        }
    }

    public final class SsnScreen implements BlockersScreens {
        public static final Parcelable.Creator<SsnScreen> CREATOR = new Spinner.Creator(4);
        public final BlockersData blockersData;
        public final boolean fullSsn;
        public final List helpItems;
        public final boolean idvFlow;
        public final Redacted ssn;
        public final Redacted titleOverride;

        public SsnScreen(BlockersData blockersData, boolean z, boolean z2, Redacted redacted, Redacted redacted2, List list) {
            blockersData.getClass();
            redacted.getClass();
            redacted2.getClass();
            this.blockersData = blockersData;
            this.fullSsn = z;
            this.idvFlow = z2;
            this.ssn = redacted;
            this.titleOverride = redacted2;
            this.helpItems = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SsnScreen)) {
                return false;
            }
            SsnScreen ssnScreen = (SsnScreen) obj;
            return Intrinsics.areEqual(this.blockersData, ssnScreen.blockersData) && this.fullSsn == ssnScreen.fullSsn && this.idvFlow == ssnScreen.idvFlow && Intrinsics.areEqual(this.ssn, ssnScreen.ssn) && Intrinsics.areEqual(this.titleOverride, ssnScreen.titleOverride) && Intrinsics.areEqual(this.helpItems, ssnScreen.helpItems);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = re$$ExternalSyntheticOutline0.m(this.titleOverride, re$$ExternalSyntheticOutline0.m(this.ssn, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.fullSsn), 31, this.idvFlow), 31), 31);
            List list = this.helpItems;
            return m + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "SsnScreen(blockersData=" + this.blockersData + ", fullSsn=" + this.fullSsn + ", idvFlow=" + this.idvFlow + ", ssn=" + this.ssn + ", titleOverride=" + this.titleOverride + ", helpItems=" + this.helpItems + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.fullSsn ? 1 : 0);
            parcel.writeInt(this.idvFlow ? 1 : 0);
            parcel.writeParcelable(this.ssn, i);
            parcel.writeParcelable(this.titleOverride, i);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SsnScreen(BlockersData blockersData, boolean z, Redacted redacted, RedactedString redactedString, List list) {
            this(blockersData, z, true, redacted, redactedString, list);
            blockersData.getClass();
            redacted.getClass();
        }
    }

    public final class StartFlowEntryPointScreen implements StartFlowEntryPoint {
        public static final Parcelable.Creator<StartFlowEntryPointScreen> CREATOR = new Spinner.Creator(5);
        public final BlockersData blockersData;
        public final String initiationData;
        public final Screen onErrorExitScreen;
        public final Origin origin;
        public final StartFlowEntryPoint.Route route;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class Origin {
            public static final /* synthetic */ Origin[] $VALUES;
            public static final Origin ACTIVITY;
            public static final Origin FAMILIES;
            public static final Origin ONBOARDING;
            public static final Origin PAYMENT;
            public static final Origin PROFILE;
            public static final Origin PROMOTION_HUB;

            static {
                Origin origin = new Origin("PROFILE", 0);
                PROFILE = origin;
                Origin origin2 = new Origin("ACTIVITY", 1);
                ACTIVITY = origin2;
                Origin origin3 = new Origin("ONBOARDING", 2);
                ONBOARDING = origin3;
                Origin origin4 = new Origin("DISCOVER", 3);
                Origin origin5 = new Origin("PAYMENT", 4);
                PAYMENT = origin5;
                Origin origin6 = new Origin("PROMOTION_HUB", 5);
                PROMOTION_HUB = origin6;
                Origin origin7 = new Origin("FAMILIES", 6);
                FAMILIES = origin7;
                $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5, origin6, origin7};
            }

            public static Origin valueOf(String str) {
                return (Origin) Enum.valueOf(Origin.class, str);
            }

            public static Origin[] values() {
                return (Origin[]) $VALUES.clone();
            }
        }

        public /* synthetic */ StartFlowEntryPointScreen(BlockersData blockersData, String str, Screen screen, Origin origin, int i) {
            this(blockersData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : screen, (i & 8) != 0 ? StartFlowEntryPoint.Route.FRANKLIN : StartFlowEntryPoint.Route.INVESTING, (i & 16) != 0 ? null : origin);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartFlowEntryPointScreen)) {
                return false;
            }
            StartFlowEntryPointScreen startFlowEntryPointScreen = (StartFlowEntryPointScreen) obj;
            return Intrinsics.areEqual(this.blockersData, startFlowEntryPointScreen.blockersData) && Intrinsics.areEqual(this.initiationData, startFlowEntryPointScreen.initiationData) && Intrinsics.areEqual(this.onErrorExitScreen, startFlowEntryPointScreen.onErrorExitScreen) && this.route == startFlowEntryPointScreen.route && this.origin == startFlowEntryPointScreen.origin;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final String getInitiationData() {
            return this.initiationData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final Screen getOnErrorExitScreen() {
            return this.onErrorExitScreen;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPoint
        public final StartFlowEntryPoint.Route getRoute() {
            return this.route;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            String str = this.initiationData;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Screen screen = this.onErrorExitScreen;
            int hashCode3 = (this.route.hashCode() + ((hashCode2 + (screen == null ? 0 : screen.hashCode())) * 31)) * 31;
            Origin origin = this.origin;
            return hashCode3 + (origin != null ? origin.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "StartFlowEntryPointScreen(blockersData=", ", initiationData=", this.initiationData, ", onErrorExitScreen=");
            m.append(this.onErrorExitScreen);
            m.append(", route=");
            m.append(this.route);
            m.append(", origin=");
            m.append(this.origin);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.initiationData);
            parcel.writeParcelable(this.onErrorExitScreen, i);
            parcel.writeString(this.route.name());
            Origin origin = this.origin;
            if (origin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(origin.name());
            }
        }

        public StartFlowEntryPointScreen(BlockersData blockersData, String str, Screen screen, StartFlowEntryPoint.Route route, Origin origin) {
            blockersData.getClass();
            route.getClass();
            this.blockersData = blockersData;
            this.initiationData = str;
            this.onErrorExitScreen = screen;
            this.route = route;
            this.origin = origin;
        }
    }

    public final class TreehouseBlockerScreen implements BlockersScreens {
        public static final Parcelable.Creator<TreehouseBlockerScreen> CREATOR = new Spinner.Creator(21);
        public final List askedQuestions;
        public final BlockersData blockersData;
        public final ByteString parameters;
        public final String path;
        public final String plasmaFlowToken;
        public final String proposedTreehouseFlowToken;
        public final int stackSize;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public TreehouseBlockerScreen(com.squareup.cash.blockers.data.BlockersData r9, java.lang.String r10, okio.ByteString r11, int r12, java.lang.String r13, java.lang.String r14, int r15) {
            /*
                r8 = this;
                r0 = r15 & 8
                if (r0 == 0) goto L5
                r12 = 0
            L5:
                r4 = r12
                kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
                r12 = r15 & 32
                r0 = 0
                if (r12 == 0) goto Lf
                r6 = r0
                goto L10
            Lf:
                r6 = r13
            L10:
                r12 = r15 & 64
                if (r12 == 0) goto L1a
                r7 = r0
                r1 = r9
                r2 = r10
                r3 = r11
                r0 = r8
                goto L1f
            L1a:
                r7 = r14
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
            L1f:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.blockers.screens.BlockersScreens.TreehouseBlockerScreen.<init>(com.squareup.cash.blockers.data.BlockersData, java.lang.String, okio.ByteString, int, java.lang.String, java.lang.String, int):void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TreehouseBlockerScreen)) {
                return false;
            }
            TreehouseBlockerScreen treehouseBlockerScreen = (TreehouseBlockerScreen) obj;
            return Intrinsics.areEqual(this.blockersData, treehouseBlockerScreen.blockersData) && Intrinsics.areEqual(this.path, treehouseBlockerScreen.path) && Intrinsics.areEqual(this.parameters, treehouseBlockerScreen.parameters) && this.stackSize == treehouseBlockerScreen.stackSize && Intrinsics.areEqual(this.askedQuestions, treehouseBlockerScreen.askedQuestions) && Intrinsics.areEqual(this.proposedTreehouseFlowToken, treehouseBlockerScreen.proposedTreehouseFlowToken) && Intrinsics.areEqual(this.plasmaFlowToken, treehouseBlockerScreen.plasmaFlowToken);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.path);
            ByteString byteString = this.parameters;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stackSize, (m + (byteString == null ? 0 : byteString.hashCode())) * 31, 31), 31, this.askedQuestions);
            String str = this.proposedTreehouseFlowToken;
            int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.plasmaFlowToken;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "TreehouseBlockerScreen(blockersData=", ", path=", this.path, ", parameters=");
            m.append(this.parameters);
            m.append(", stackSize=");
            m.append(this.stackSize);
            m.append(", askedQuestions=");
            Recorder$$ExternalSyntheticOutline2.m(", proposedTreehouseFlowToken=", this.proposedTreehouseFlowToken, ", plasmaFlowToken=", m, this.askedQuestions);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.plasmaFlowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.path);
            parcel.writeSerializable(this.parameters);
            parcel.writeInt(this.stackSize);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.askedQuestions, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.proposedTreehouseFlowToken);
            parcel.writeString(this.plasmaFlowToken);
        }

        public TreehouseBlockerScreen(BlockersData blockersData, String str, ByteString byteString, int i, List list, String str2, String str3) {
            blockersData.getClass();
            str.getClass();
            list.getClass();
            this.blockersData = blockersData;
            this.path = str;
            this.parameters = byteString;
            this.stackSize = i;
            this.askedQuestions = list;
            this.proposedTreehouseFlowToken = str2;
            this.plasmaFlowToken = str3;
        }
    }

    public final class SetPinScreen implements BlockersScreens {
        public static final Parcelable.Creator<SetPinScreen> CREATOR = new Creator(0);
        public final BlockersData blockersData;
        public final boolean changingPin;
        public final Redacted cvv;
        public final String instrumentToken;
        public final Redacted oldPin;
        public final boolean resettingPin;
        public final boolean skippable;
        public final TextOverrides textOverrides;
        public final Redacted unconfirmedPin;

        /* loaded from: classes4.dex */
        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Class cls;
                ArrayList arrayList;
                ArrayList arrayList2;
                int i = 0;
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        return new SetPinScreen((BlockersData) parcel.readParcelable(SetPinScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Redacted) parcel.readParcelable(SetPinScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(SetPinScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(SetPinScreen.class.getClassLoader()), TextOverrides.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    case 1:
                        parcel.getClass();
                        BlockersData blockersData = (BlockersData) parcel.readParcelable(InviteContactsScreen.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            cls = InviteContactsScreen.class;
                            z = true;
                        } else {
                            z = false;
                            cls = InviteContactsScreen.class;
                        }
                        return new InviteContactsScreen(blockersData, z, (InviteFriendsData) parcel.readParcelable(cls.getClassLoader()), (InviteFriendsOpportunityScreen) parcel.readParcelable(cls.getClassLoader()), (com.squareup.protos.franklin.api.InviteFriendsScreen) parcel.readParcelable(cls.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0 ? StartFlowEntryPointScreen.Origin.valueOf(parcel.readString()) : null);
                    case 2:
                        parcel.getClass();
                        return new InviteErrorScreen((BlockersData) parcel.readParcelable(InviteErrorScreen.class.getClassLoader()), parcel.readString());
                    case 3:
                        parcel.getClass();
                        return new InviteFriendsScreen((BlockersData) parcel.readParcelable(InviteFriendsScreen.class.getClassLoader()), (InviteFriendsData) parcel.readParcelable(InviteFriendsScreen.class.getClassLoader()), (InviteFriendsOpportunityScreen) parcel.readParcelable(InviteFriendsScreen.class.getClassLoader()), (com.squareup.protos.franklin.api.InviteFriendsScreen) parcel.readParcelable(InviteFriendsScreen.class.getClassLoader()), (ContactAccessPreparationScreen) parcel.readParcelable(InviteFriendsScreen.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0 ? StartFlowEntryPointScreen.Origin.valueOf(parcel.readString()) : null);
                    case 4:
                        parcel.getClass();
                        return new ManagedAccountLoginQrCodeProviderBlockerScreen((BlockersData) parcel.readParcelable(ManagedAccountLoginQrCodeProviderBlockerScreen.class.getClassLoader()), (UiAvatar) parcel.readParcelable(ManagedAccountLoginQrCodeProviderBlockerScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BlockerAction) parcel.readParcelable(ManagedAccountLoginQrCodeProviderBlockerScreen.class.getClassLoader()));
                    case 5:
                        parcel.getClass();
                        return new OnboardingInternalRouteScreen((BlockersData) parcel.readParcelable(OnboardingInternalRouteScreen.class.getClassLoader()), (OnboardingInternalRouteBlocker) parcel.readParcelable(OnboardingInternalRouteScreen.class.getClassLoader()));
                    case 6:
                        parcel.getClass();
                        return new OptionPickerConfirmationResult(parcel.readString(), parcel.readString());
                    case 7:
                        parcel.getClass();
                        return new PasscodeHelpScreen((BlockersData) parcel.readParcelable(PasscodeHelpScreen.class.getClassLoader()));
                    case 8:
                        BlockersData blockersData2 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, PasscodeScreen.class);
                        InstrumentType valueOf = parcel.readInt() == 0 ? null : InstrumentType.valueOf(parcel.readString());
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        BlockerAction blockerAction = (BlockerAction) parcel.readParcelable(PasscodeScreen.class.getClassLoader());
                        PasscodeScreen.Type valueOf2 = PasscodeScreen.Type.valueOf(parcel.readString());
                        Redacted redacted = (Redacted) parcel.readParcelable(PasscodeScreen.class.getClassLoader());
                        boolean z2 = parcel.readInt() != 0;
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(readInt);
                            while (i != readInt) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(PasscodeScreen.class, parcel, arrayList3, i, 1);
                            }
                            arrayList = arrayList3;
                        }
                        return new PasscodeScreen(blockersData2, valueOf, readString, readString2, blockerAction, valueOf2, redacted, z2, arrayList, parcel.readString());
                    case 9:
                        parcel.getClass();
                        return new PaymentPlanDataBlockerScreen((BlockersData) parcel.readParcelable(PaymentPlanDataBlockerScreen.class.getClassLoader()), (PaymentPlanDataBlocker) parcel.readParcelable(PaymentPlanDataBlockerScreen.class.getClassLoader()));
                    case 10:
                        parcel.getClass();
                        return new PlaidLinkScreen((BlockersData) parcel.readParcelable(PlaidLinkScreen.class.getClassLoader()), (PlaidLinkingConfig) parcel.readParcelable(PlaidLinkScreen.class.getClassLoader()));
                    case 11:
                        parcel.getClass();
                        return new PrepurchaseCashCardFAQBlockerScreen((BlockersData) parcel.readParcelable(PrepurchaseCashCardFAQBlockerScreen.class.getClassLoader()), (PrepurchaseCashCardFAQBlocker) parcel.readParcelable(PrepurchaseCashCardFAQBlockerScreen.class.getClassLoader()));
                    case 12:
                        parcel.getClass();
                        return new ProvisionGooglePayScreen((BlockersData) parcel.readParcelable(ProvisionGooglePayScreen.class.getClassLoader()), parcel.readInt() != 0);
                    case 13:
                        parcel.getClass();
                        return new ReadContactsPermissionScreen((BlockersData) parcel.readParcelable(ReadContactsPermissionScreen.class.getClassLoader()));
                    case 14:
                        parcel.getClass();
                        return new ReferralCodeScreen((BlockersData) parcel.readParcelable(ReferralCodeScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    case 15:
                        parcel.getClass();
                        return new RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias(parcel.readString());
                    case 16:
                        parcel.getClass();
                        return new RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias((ShippingAddress) parcel.readParcelable(RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias.class.getClassLoader()), parcel.readString());
                    case 17:
                        parcel.getClass();
                        return new RegisterErrorScreen((BlockersData) parcel.readParcelable(RegisterErrorScreen.class.getClassLoader()), parcel.readString());
                    case 18:
                        parcel.getClass();
                        return new RemoteSkipErrorScreen(parcel.readString());
                    case 19:
                        parcel.getClass();
                        return new RemoteSkipScreen((Screen) parcel.readParcelable(RemoteSkipScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(RemoteSkipScreen.class.getClassLoader()));
                    case 20:
                        parcel.getClass();
                        return new RequestPushNotificationsBlockerScreen((BlockersData) parcel.readParcelable(RequestPushNotificationsBlockerScreen.class.getClassLoader()), (RequestPushNotificationsScreen) parcel.readParcelable(RequestPushNotificationsBlockerScreen.class.getClassLoader()));
                    case 21:
                        parcel.getClass();
                        return new SavingsTransferOptionSelectionFullScreen((BlockersData) parcel.readParcelable(SavingsTransferOptionSelectionFullScreen.class.getClassLoader()), (TransferOptionSelectionBlocker) parcel.readParcelable(SavingsTransferOptionSelectionFullScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(SavingsTransferOptionSelectionFullScreen.class.getClassLoader()));
                    case 22:
                        parcel.getClass();
                        return new SavingsTransferOptionSelectionSheet((BlockersData) parcel.readParcelable(SavingsTransferOptionSelectionSheet.class.getClassLoader()), (TransferOptionSelectionBlocker) parcel.readParcelable(SavingsTransferOptionSelectionSheet.class.getClassLoader()), (BlockerAction) parcel.readParcelable(SavingsTransferOptionSelectionSheet.class.getClassLoader()));
                    case 23:
                        parcel.getClass();
                        return new SelectAllowlistCustomerBlockerScreen((BlockersData) parcel.readParcelable(SelectAllowlistCustomerBlockerScreen.class.getClassLoader()), parcel.readString(), (BlockerAction) parcel.readParcelable(SelectAllowlistCustomerBlockerScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                    case 24:
                        parcel.getClass();
                        return new SelectPaymentPlanBlockerScreen((BlockersData) parcel.readParcelable(SelectPaymentPlanBlockerScreen.class.getClassLoader()), (SelectPaymentPlanBlocker) parcel.readParcelable(SelectPaymentPlanBlockerScreen.class.getClassLoader()));
                    case 25:
                        BlockersData blockersData3 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, SetNameScreen.class);
                        SetNameScreen.NameType valueOf3 = SetNameScreen.NameType.valueOf(parcel.readString());
                        Redacted redacted2 = (Redacted) parcel.readParcelable(SetNameScreen.class.getClassLoader());
                        Redacted redacted3 = (Redacted) parcel.readParcelable(SetNameScreen.class.getClassLoader());
                        Redacted redacted4 = (Redacted) parcel.readParcelable(SetNameScreen.class.getClassLoader());
                        int readInt2 = parcel.readInt();
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int readInt4 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(readInt4);
                            int i2 = 0;
                            while (i2 != readInt4) {
                                i2 = CameraState$Type$EnumUnboxingLocalUtility.m(SetNameScreen.class, parcel, arrayList4, i2, 1);
                            }
                            arrayList2 = arrayList4;
                        }
                        return new SetNameScreen(blockersData3, valueOf3, redacted2, redacted3, redacted4, readInt2, readInt3, arrayList2, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (SetNameScreen.SetNameType) parcel.readParcelable(SetNameScreen.class.getClassLoader()));
                    case 26:
                        parcel.getClass();
                        return new SetNameScreen.SetNameType.CreateShippingAddressWithName(parcel.readString());
                    case 27:
                        parcel.getClass();
                        parcel.readInt();
                        return SetNameScreen.SetNameType.SetNameOnly.INSTANCE;
                    case 28:
                        parcel.getClass();
                        return new SetNameScreen.SetNameType.SetShippingAddressName((ShippingAddress) parcel.readParcelable(SetNameScreen.SetNameType.SetShippingAddressName.class.getClassLoader()), parcel.readString());
                    default:
                        parcel.getClass();
                        return new SetPinMessageScreen((BlockersData) parcel.readParcelable(SetPinMessageScreen.class.getClassLoader()), parcel.readString(), (Screen) parcel.readParcelable(SetPinMessageScreen.class.getClassLoader()));
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new SetPinScreen[i];
                    case 1:
                        return new InviteContactsScreen[i];
                    case 2:
                        return new InviteErrorScreen[i];
                    case 3:
                        return new InviteFriendsScreen[i];
                    case 4:
                        return new ManagedAccountLoginQrCodeProviderBlockerScreen[i];
                    case 5:
                        return new OnboardingInternalRouteScreen[i];
                    case 6:
                        return new OptionPickerConfirmationResult[i];
                    case 7:
                        return new PasscodeHelpScreen[i];
                    case 8:
                        return new PasscodeScreen[i];
                    case 9:
                        return new PaymentPlanDataBlockerScreen[i];
                    case 10:
                        return new PlaidLinkScreen[i];
                    case 11:
                        return new PrepurchaseCashCardFAQBlockerScreen[i];
                    case 12:
                        return new ProvisionGooglePayScreen[i];
                    case 13:
                        return new ReadContactsPermissionScreen[i];
                    case 14:
                        return new ReferralCodeScreen[i];
                    case 15:
                        return new RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias[i];
                    case 16:
                        return new RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias[i];
                    case 17:
                        return new RegisterErrorScreen[i];
                    case 18:
                        return new RemoteSkipErrorScreen[i];
                    case 19:
                        return new RemoteSkipScreen[i];
                    case 20:
                        return new RequestPushNotificationsBlockerScreen[i];
                    case 21:
                        return new SavingsTransferOptionSelectionFullScreen[i];
                    case 22:
                        return new SavingsTransferOptionSelectionSheet[i];
                    case 23:
                        return new SelectAllowlistCustomerBlockerScreen[i];
                    case 24:
                        return new SelectPaymentPlanBlockerScreen[i];
                    case 25:
                        return new SetNameScreen[i];
                    case 26:
                        return new SetNameScreen.SetNameType.CreateShippingAddressWithName[i];
                    case 27:
                        return new SetNameScreen.SetNameType.SetNameOnly[i];
                    case 28:
                        return new SetNameScreen.SetNameType.SetShippingAddressName[i];
                    default:
                        return new SetPinMessageScreen[i];
                }
            }
        }

        /* loaded from: classes4.dex */
        public final class TextOverrides implements Parcelable {
            public static final Parcelable.Creator<TextOverrides> CREATOR = new Spinner.Creator(1);
            public final String confirmSubtext;
            public final String confirmTitle;
            public final String mainSubtext;
            public final String mainTitle;

            public TextOverrides(String str, String str2, String str3, String str4) {
                this.mainTitle = str;
                this.confirmTitle = str2;
                this.mainSubtext = str3;
                this.confirmSubtext = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TextOverrides)) {
                    return false;
                }
                TextOverrides textOverrides = (TextOverrides) obj;
                return Intrinsics.areEqual(this.mainTitle, textOverrides.mainTitle) && Intrinsics.areEqual(this.confirmTitle, textOverrides.confirmTitle) && Intrinsics.areEqual(this.mainSubtext, textOverrides.mainSubtext) && Intrinsics.areEqual(this.confirmSubtext, textOverrides.confirmSubtext);
            }

            public final int hashCode() {
                String str = this.mainTitle;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.confirmTitle;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.mainSubtext;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.confirmSubtext;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextOverrides(mainTitle=", this.mainTitle, ", confirmTitle=", this.confirmTitle, ", mainSubtext="), this.mainSubtext, ", confirmSubtext=", this.confirmSubtext, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mainTitle);
                parcel.writeString(this.confirmTitle);
                parcel.writeString(this.mainSubtext);
                parcel.writeString(this.confirmSubtext);
            }
        }

        public SetPinScreen(BlockersData blockersData, boolean z, boolean z2, String str, Redacted redacted, Redacted redacted2, Redacted redacted3, TextOverrides textOverrides, boolean z3) {
            blockersData.getClass();
            redacted.getClass();
            redacted2.getClass();
            redacted3.getClass();
            textOverrides.getClass();
            this.blockersData = blockersData;
            this.changingPin = z;
            this.resettingPin = z2;
            this.instrumentToken = str;
            this.cvv = redacted;
            this.oldPin = redacted2;
            this.unconfirmedPin = redacted3;
            this.textOverrides = textOverrides;
            this.skippable = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetPinScreen)) {
                return false;
            }
            SetPinScreen setPinScreen = (SetPinScreen) obj;
            return Intrinsics.areEqual(this.blockersData, setPinScreen.blockersData) && this.changingPin == setPinScreen.changingPin && this.resettingPin == setPinScreen.resettingPin && Intrinsics.areEqual(this.instrumentToken, setPinScreen.instrumentToken) && Intrinsics.areEqual(this.cvv, setPinScreen.cvv) && Intrinsics.areEqual(this.oldPin, setPinScreen.oldPin) && Intrinsics.areEqual(this.unconfirmedPin, setPinScreen.unconfirmedPin) && Intrinsics.areEqual(this.textOverrides, setPinScreen.textOverrides) && this.skippable == setPinScreen.skippable;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.changingPin), 31, this.resettingPin);
            String str = this.instrumentToken;
            return Boolean.hashCode(this.skippable) + ((this.textOverrides.hashCode() + re$$ExternalSyntheticOutline0.m(this.unconfirmedPin, re$$ExternalSyntheticOutline0.m(this.oldPin, re$$ExternalSyntheticOutline0.m(this.cvv, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetPinScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", changingPin=");
            sb.append(this.changingPin);
            sb.append(", resettingPin=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.resettingPin, ", instrumentToken=", this.instrumentToken, ", cvv=");
            sb.append(this.cvv);
            sb.append(", oldPin=");
            sb.append(this.oldPin);
            sb.append(", unconfirmedPin=");
            sb.append(this.unconfirmedPin);
            sb.append(", textOverrides=");
            sb.append(this.textOverrides);
            sb.append(", skippable=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.skippable, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeInt(this.changingPin ? 1 : 0);
            parcel.writeInt(this.resettingPin ? 1 : 0);
            parcel.writeString(this.instrumentToken);
            parcel.writeParcelable(this.cvv, i);
            parcel.writeParcelable(this.oldPin, i);
            parcel.writeParcelable(this.unconfirmedPin, i);
            this.textOverrides.writeToParcel(parcel, i);
            parcel.writeInt(this.skippable ? 1 : 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SetPinScreen(BlockersData blockersData, boolean z, boolean z2, String str, TextOverrides textOverrides, boolean z3) {
            this(blockersData, z, z2, str, new RedactedString(null), new RedactedString(null), new RedactedString(null), textOverrides, z3);
            blockersData.getClass();
            textOverrides.getClass();
        }
    }

    public final class InputCardInfoScreen implements BlockersScreens {
        public static final Parcelable.Creator<InputCardInfoScreen> CREATOR = new Error.Creator(21);
        public final boolean bankAccountAllowed;
        public final BlockersData blockersData;
        public final BlockerAction dismissAction;
        public final boolean expired;
        public final boolean fromPasscodeScreen;
        public final CashInstrumentType instrumentType;
        public final Redacted paymentInitiatorData;
        public final boolean sendingToBusinessWithCredit;
        public final boolean skippable;

        public InputCardInfoScreen(BlockersData blockersData, CashInstrumentType cashInstrumentType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BlockerAction blockerAction, int i) {
            this(blockersData, cashInstrumentType, new RedactedParcelable(null), (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? null : blockerAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputCardInfoScreen)) {
                return false;
            }
            InputCardInfoScreen inputCardInfoScreen = (InputCardInfoScreen) obj;
            return Intrinsics.areEqual(this.blockersData, inputCardInfoScreen.blockersData) && this.instrumentType == inputCardInfoScreen.instrumentType && Intrinsics.areEqual(this.paymentInitiatorData, inputCardInfoScreen.paymentInitiatorData) && this.bankAccountAllowed == inputCardInfoScreen.bankAccountAllowed && this.sendingToBusinessWithCredit == inputCardInfoScreen.sendingToBusinessWithCredit && this.fromPasscodeScreen == inputCardInfoScreen.fromPasscodeScreen && this.skippable == inputCardInfoScreen.skippable && this.expired == inputCardInfoScreen.expired && Intrinsics.areEqual(this.dismissAction, inputCardInfoScreen.dismissAction);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m(this.paymentInitiatorData, (this.instrumentType.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31), 31, this.bankAccountAllowed), 31, this.sendingToBusinessWithCredit), 31, this.fromPasscodeScreen), 31, this.skippable), 31, this.expired);
            BlockerAction blockerAction = this.dismissAction;
            return m + (blockerAction == null ? 0 : blockerAction.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InputCardInfoScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", instrumentType=");
            sb.append(this.instrumentType);
            sb.append(", paymentInitiatorData=");
            sb.append(this.paymentInitiatorData);
            sb.append(", bankAccountAllowed=");
            sb.append(this.bankAccountAllowed);
            sb.append(", sendingToBusinessWithCredit=");
            re$$ExternalSyntheticOutline0.m(sb, this.sendingToBusinessWithCredit, ", fromPasscodeScreen=", this.fromPasscodeScreen, ", skippable=");
            re$$ExternalSyntheticOutline0.m(sb, this.skippable, ", expired=", this.expired, ", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.instrumentType.name());
            parcel.writeParcelable(this.paymentInitiatorData, i);
            parcel.writeInt(this.bankAccountAllowed ? 1 : 0);
            parcel.writeInt(this.sendingToBusinessWithCredit ? 1 : 0);
            parcel.writeInt(this.fromPasscodeScreen ? 1 : 0);
            parcel.writeInt(this.skippable ? 1 : 0);
            parcel.writeInt(this.expired ? 1 : 0);
            parcel.writeParcelable(this.dismissAction, i);
        }

        public InputCardInfoScreen(BlockersData blockersData, CashInstrumentType cashInstrumentType, Redacted redacted, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BlockerAction blockerAction) {
            blockersData.getClass();
            cashInstrumentType.getClass();
            redacted.getClass();
            this.blockersData = blockersData;
            this.instrumentType = cashInstrumentType;
            this.paymentInitiatorData = redacted;
            this.bankAccountAllowed = z;
            this.sendingToBusinessWithCredit = z2;
            this.fromPasscodeScreen = z3;
            this.skippable = z4;
            this.expired = z5;
            this.dismissAction = blockerAction;
        }
    }

    public final class StreetAddressScreen implements BlockersScreens {
        public static final Parcelable.Creator<StreetAddressScreen> CREATOR = new Spinner.Creator(12);
        public final Redacted address;
        public final boolean addressTypeaheadEnabled;
        public final boolean autofill;
        public final BlockersData blockersData;
        public final boolean canExit;
        public final FormType formType;
        public final List helpItems;
        public final String hintOverride;
        public final boolean idvFlow;
        public final SetStreetAddressType setStreetAddressType;
        public final String subtitleOverride;
        public final String titleOverride;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class FormType {
            public static final /* synthetic */ FormType[] $VALUES;
            public static final FormType FULL_ADDRESS;
            public static final FormType POSTAL_CODE;
            public static final FormType STREET_ADDRESS;

            static {
                FormType formType = new FormType("POSTAL_CODE", 0);
                POSTAL_CODE = formType;
                FormType formType2 = new FormType("STREET_ADDRESS", 1);
                STREET_ADDRESS = formType2;
                FormType formType3 = new FormType("FULL_ADDRESS", 2);
                FULL_ADDRESS = formType3;
                $VALUES = new FormType[]{formType, formType2, formType3};
            }

            public static FormType valueOf(String str) {
                return (FormType) Enum.valueOf(FormType.class, str);
            }

            public static FormType[] values() {
                return (FormType[]) $VALUES.clone();
            }
        }

        /* loaded from: classes4.dex */
        public interface SetStreetAddressType extends Parcelable {

            public final class CreateShippingAddressWithStreetAddress implements SetStreetAddressType {
                public static final Parcelable.Creator<CreateShippingAddressWithStreetAddress> CREATOR = new Spinner.Creator(13);
                public final String profileId;

                public CreateShippingAddressWithStreetAddress(String str) {
                    str.getClass();
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CreateShippingAddressWithStreetAddress) && Intrinsics.areEqual(this.profileId, ((CreateShippingAddressWithStreetAddress) obj).profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateShippingAddressWithStreetAddress(profileId=", this.profileId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.profileId);
                }
            }

            public final class SetShippingStreetAddress implements SetStreetAddressType {
                public static final Parcelable.Creator<SetShippingStreetAddress> CREATOR = new Spinner.Creator(14);
                public final String profileId;
                public final ShippingAddress shippingAddress;

                public SetShippingStreetAddress(ShippingAddress shippingAddress, String str) {
                    shippingAddress.getClass();
                    str.getClass();
                    this.shippingAddress = shippingAddress;
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SetShippingStreetAddress)) {
                        return false;
                    }
                    SetShippingStreetAddress setShippingStreetAddress = (SetShippingStreetAddress) obj;
                    return Intrinsics.areEqual(this.shippingAddress, setShippingStreetAddress.shippingAddress) && Intrinsics.areEqual(this.profileId, setShippingStreetAddress.profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode() + (this.shippingAddress.hashCode() * 31);
                }

                public final String toString() {
                    return "SetShippingStreetAddress(shippingAddress=" + this.shippingAddress + ", profileId=" + this.profileId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.shippingAddress, i);
                    parcel.writeString(this.profileId);
                }
            }

            public final class SetStreetAddressOnly implements SetStreetAddressType {
                public static final SetStreetAddressOnly INSTANCE = new SetStreetAddressOnly();
                public static final Parcelable.Creator<SetStreetAddressOnly> CREATOR = new Spinner.Creator(15);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SetStreetAddressOnly);
                }

                public final int hashCode() {
                    return -129227131;
                }

                public final String toString() {
                    return "SetStreetAddressOnly";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }
        }

        public /* synthetic */ StreetAddressScreen(BlockersData blockersData, FormType formType, Redacted redacted, String str, String str2, String str3, boolean z, List list, boolean z2, boolean z3, int i) {
            this(blockersData, formType, redacted, str, str2, str3, z, (i & 128) != 0 ? null : list, (i & 256) == 0, (i & 512) != 0 ? false : z2, SetStreetAddressType.SetStreetAddressOnly.INSTANCE, z3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StreetAddressScreen)) {
                return false;
            }
            StreetAddressScreen streetAddressScreen = (StreetAddressScreen) obj;
            return Intrinsics.areEqual(this.blockersData, streetAddressScreen.blockersData) && this.formType == streetAddressScreen.formType && Intrinsics.areEqual(this.address, streetAddressScreen.address) && Intrinsics.areEqual(this.titleOverride, streetAddressScreen.titleOverride) && Intrinsics.areEqual(this.subtitleOverride, streetAddressScreen.subtitleOverride) && Intrinsics.areEqual(this.hintOverride, streetAddressScreen.hintOverride) && this.addressTypeaheadEnabled == streetAddressScreen.addressTypeaheadEnabled && Intrinsics.areEqual(this.helpItems, streetAddressScreen.helpItems) && this.idvFlow == streetAddressScreen.idvFlow && this.canExit == streetAddressScreen.canExit && Intrinsics.areEqual(this.setStreetAddressType, streetAddressScreen.setStreetAddressType) && this.autofill == streetAddressScreen.autofill;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int m = re$$ExternalSyntheticOutline0.m(this.address, (this.formType.hashCode() + (this.blockersData.hashCode() * 31)) * 31, 31);
            String str = this.titleOverride;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitleOverride;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.hintOverride;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.addressTypeaheadEnabled);
            List list = this.helpItems;
            return Boolean.hashCode(this.autofill) + ((this.setStreetAddressType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.idvFlow), 31, this.canExit)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StreetAddressScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", formType=");
            sb.append(this.formType);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", titleOverride=");
            sb.append(this.titleOverride);
            sb.append(", subtitleOverride=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitleOverride, ", hintOverride=", this.hintOverride, ", addressTypeaheadEnabled=");
            sb.append(this.addressTypeaheadEnabled);
            sb.append(", helpItems=");
            sb.append(this.helpItems);
            sb.append(", idvFlow=");
            re$$ExternalSyntheticOutline0.m(sb, this.idvFlow, ", canExit=", this.canExit, ", setStreetAddressType=");
            sb.append(this.setStreetAddressType);
            sb.append(", autofill=");
            sb.append(this.autofill);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.formType.name());
            parcel.writeParcelable(this.address, i);
            parcel.writeString(this.titleOverride);
            parcel.writeString(this.subtitleOverride);
            parcel.writeString(this.hintOverride);
            parcel.writeInt(this.addressTypeaheadEnabled ? 1 : 0);
            List list = this.helpItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeInt(this.idvFlow ? 1 : 0);
            parcel.writeInt(this.canExit ? 1 : 0);
            parcel.writeParcelable(this.setStreetAddressType, i);
            parcel.writeInt(this.autofill ? 1 : 0);
        }

        public StreetAddressScreen(BlockersData blockersData, FormType formType, Redacted redacted, String str, String str2, String str3, boolean z, List list, boolean z2, boolean z3, SetStreetAddressType setStreetAddressType, boolean z4) {
            blockersData.getClass();
            formType.getClass();
            redacted.getClass();
            setStreetAddressType.getClass();
            this.blockersData = blockersData;
            this.formType = formType;
            this.address = redacted;
            this.titleOverride = str;
            this.subtitleOverride = str2;
            this.hintOverride = str3;
            this.addressTypeaheadEnabled = z;
            this.helpItems = list;
            this.idvFlow = z2;
            this.canExit = z3;
            this.setStreetAddressType = setStreetAddressType;
            this.autofill = z4;
        }
    }

    public final class RegisterAliasScreen implements BlockersScreens {
        public static final Parcelable.Creator<RegisterAliasScreen> CREATOR = new zza(15);
        public final BlockersData blockersData;
        public final boolean dismissButtonEnabled;
        public final String emailInputHint;
        public final String headline;
        public final String inputHint;
        public final String legalAgreementText;
        public final Mode mode;
        public final RegisterAliasType registerAliasType;
        public final boolean skippable;
        public final String smsInputHint;
        public final Redacted title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Mode {
            public static final /* synthetic */ Mode[] $VALUES;
            public static final Mode REGISTER_EMAIL;
            public static final Mode REGISTER_SMS;
            public static final Mode SIGN_IN;

            static {
                Mode mode = new Mode("SIGN_IN", 0);
                SIGN_IN = mode;
                Mode mode2 = new Mode("REGISTER_EMAIL", 1);
                REGISTER_EMAIL = mode2;
                Mode mode3 = new Mode("REGISTER_SMS", 2);
                REGISTER_SMS = mode3;
                $VALUES = new Mode[]{mode, mode2, mode3, new Mode("REGISTER_ALIAS", 3)};
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public interface RegisterAliasType extends Parcelable {

            /* loaded from: classes4.dex */
            public final class CreateShippingAddressWithAlias implements RegisterAliasType {
                public static final Parcelable.Creator<CreateShippingAddressWithAlias> CREATOR = new SetPinScreen.Creator(15);
                public final String profileId;

                public CreateShippingAddressWithAlias(String str) {
                    str.getClass();
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CreateShippingAddressWithAlias) && Intrinsics.areEqual(this.profileId, ((CreateShippingAddressWithAlias) obj).profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateShippingAddressWithAlias(profileId=", this.profileId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.profileId);
                }
            }

            public final class RegisterAliasOnly implements RegisterAliasType {
                public static final RegisterAliasOnly INSTANCE = new RegisterAliasOnly();
                public static final Parcelable.Creator<RegisterAliasOnly> CREATOR = new zza(16);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof RegisterAliasOnly);
                }

                public final int hashCode() {
                    return 941668243;
                }

                public final String toString() {
                    return "RegisterAliasOnly";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* loaded from: classes4.dex */
            public final class SetShippingAddressAlias implements RegisterAliasType {
                public static final Parcelable.Creator<SetShippingAddressAlias> CREATOR = new SetPinScreen.Creator(16);
                public final String profileId;
                public final ShippingAddress shippingAddress;

                public SetShippingAddressAlias(ShippingAddress shippingAddress, String str) {
                    shippingAddress.getClass();
                    str.getClass();
                    this.shippingAddress = shippingAddress;
                    this.profileId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SetShippingAddressAlias)) {
                        return false;
                    }
                    SetShippingAddressAlias setShippingAddressAlias = (SetShippingAddressAlias) obj;
                    return Intrinsics.areEqual(this.shippingAddress, setShippingAddressAlias.shippingAddress) && Intrinsics.areEqual(this.profileId, setShippingAddressAlias.profileId);
                }

                public final int hashCode() {
                    return this.profileId.hashCode() + (this.shippingAddress.hashCode() * 31);
                }

                public final String toString() {
                    return "SetShippingAddressAlias(shippingAddress=" + this.shippingAddress + ", profileId=" + this.profileId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.shippingAddress, i);
                    parcel.writeString(this.profileId);
                }
            }
        }

        public /* synthetic */ RegisterAliasScreen(BlockersData blockersData, Mode mode, RedactedString redactedString, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, RegisterAliasType registerAliasType, int i) {
            this(blockersData, (i & 2) != 0 ? Mode.SIGN_IN : mode, (i & 4) != 0 ? null : redactedString, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? RegisterAliasType.RegisterAliasOnly.INSTANCE : registerAliasType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterAliasScreen)) {
                return false;
            }
            RegisterAliasScreen registerAliasScreen = (RegisterAliasScreen) obj;
            return Intrinsics.areEqual(this.blockersData, registerAliasScreen.blockersData) && this.mode == registerAliasScreen.mode && Intrinsics.areEqual(this.title, registerAliasScreen.title) && Intrinsics.areEqual(this.headline, registerAliasScreen.headline) && Intrinsics.areEqual(this.inputHint, registerAliasScreen.inputHint) && Intrinsics.areEqual(this.smsInputHint, registerAliasScreen.smsInputHint) && Intrinsics.areEqual(this.emailInputHint, registerAliasScreen.emailInputHint) && Intrinsics.areEqual(this.legalAgreementText, registerAliasScreen.legalAgreementText) && this.skippable == registerAliasScreen.skippable && this.dismissButtonEnabled == registerAliasScreen.dismissButtonEnabled && Intrinsics.areEqual(this.registerAliasType, registerAliasScreen.registerAliasType);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        public final int hashCode() {
            int hashCode = (this.mode.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
            Redacted redacted = this.title;
            int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
            String str = this.headline;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inputHint;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.smsInputHint;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.emailInputHint;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.legalAgreementText;
            return this.registerAliasType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.skippable), 31, this.dismissButtonEnabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegisterAliasScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", mode=");
            sb.append(this.mode);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", headline=");
            sb.append(this.headline);
            sb.append(", inputHint=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.inputHint, ", smsInputHint=", this.smsInputHint, ", emailInputHint=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.emailInputHint, ", legalAgreementText=", this.legalAgreementText, ", skippable=");
            re$$ExternalSyntheticOutline0.m(sb, this.skippable, ", dismissButtonEnabled=", this.dismissButtonEnabled, ", registerAliasType=");
            sb.append(this.registerAliasType);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeString(this.mode.name());
            parcel.writeParcelable(this.title, i);
            parcel.writeString(this.headline);
            parcel.writeString(this.inputHint);
            parcel.writeString(this.smsInputHint);
            parcel.writeString(this.emailInputHint);
            parcel.writeString(this.legalAgreementText);
            parcel.writeInt(this.skippable ? 1 : 0);
            parcel.writeInt(this.dismissButtonEnabled ? 1 : 0);
            parcel.writeParcelable(this.registerAliasType, i);
        }

        public RegisterAliasScreen(BlockersData blockersData, Mode mode, Redacted redacted, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, RegisterAliasType registerAliasType) {
            blockersData.getClass();
            mode.getClass();
            registerAliasType.getClass();
            this.blockersData = blockersData;
            this.mode = mode;
            this.title = redacted;
            this.headline = str;
            this.inputHint = str2;
            this.smsInputHint = str3;
            this.emailInputHint = str4;
            this.legalAgreementText = str5;
            this.skippable = z;
            this.dismissButtonEnabled = z2;
            this.registerAliasType = registerAliasType;
        }
    }

    public final class FormScreen implements BlockersScreens {
        public static final Parcelable.Creator<FormScreen> CREATOR = new Creator();
        public final BlockersData blockersData;
        public final String disclaimer_text;
        public final BlockerAction dismissAction;
        public final boolean dismissButtonEnabled;
        public final List elements;
        public final BlockerAction help_action;
        public final List onAppearActions;
        public final FormBlocker.OnDisplayEffect onDisplayEffect;
        public final BlockerAction primary_action;
        public final FormBlocker.Icon primary_action_icon;
        public final FormBlocker.Element.ButtonElement.Style primary_action_style;
        public final FormBlocker.Element.ButtonElement.Type primary_action_type;
        public final FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect;
        public final boolean requiresFullScroll;
        public final BlockerAction retreatAction;
        public final BlockerAction secondary_action;
        public final FormBlocker.Element.ButtonElement.Style secondary_action_style;
        public final Map subforms;
        public final String titleBarAccessoryText;

        /* loaded from: classes8.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, FormScreen.class);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(FormScreen.class, parcel, arrayList, i, 1);
                }
                BlockerAction blockerAction = (BlockerAction) parcel.readParcelable(FormScreen.class.getClassLoader());
                FormBlocker.Icon icon = (FormBlocker.Icon) parcel.readParcelable(FormScreen.class.getClassLoader());
                BlockerAction blockerAction2 = (BlockerAction) parcel.readParcelable(FormScreen.class.getClassLoader());
                String readString = parcel.readString();
                BlockerAction blockerAction3 = (BlockerAction) parcel.readParcelable(FormScreen.class.getClassLoader());
                BlockerAction blockerAction4 = (BlockerAction) parcel.readParcelable(FormScreen.class.getClassLoader());
                FormBlocker.OnDisplayEffect valueOf = parcel.readInt() == 0 ? null : FormBlocker.OnDisplayEffect.valueOf(parcel.readString());
                FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect = (FormBlocker.RemoteOnDisplayEffect) parcel.readParcelable(FormScreen.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                FormBlocker.Element.ButtonElement.Type valueOf2 = FormBlocker.Element.ButtonElement.Type.valueOf(parcel.readString());
                FormBlocker.Element.ButtonElement.Style valueOf3 = FormBlocker.Element.ButtonElement.Style.valueOf(parcel.readString());
                FormBlocker.Element.ButtonElement.Style valueOf4 = FormBlocker.Element.ButtonElement.Style.valueOf(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                BlockerAction blockerAction5 = (BlockerAction) parcel.readParcelable(FormScreen.class.getClassLoader());
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(FormScreen.class, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                }
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(FormScreen.class.getClassLoader()));
                    i3++;
                    readInt3 = readInt3;
                }
                return new FormScreen(blockersData, arrayList, blockerAction, icon, blockerAction2, readString, blockerAction3, blockerAction4, valueOf, remoteOnDisplayEffect, z, valueOf2, valueOf3, valueOf4, z2, blockerAction5, readString2, arrayList2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FormScreen[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FormScreen(BlockersData blockersData, List list, BlockerAction blockerAction, FormBlocker.Icon icon, BlockerAction blockerAction2, String str, BlockerAction blockerAction3, boolean z, FormBlocker.Element.ButtonElement.Type type2, FormBlocker.Element.ButtonElement.Style style, FormBlocker.Element.ButtonElement.Style style2, int i) {
            this(blockersData, list, blockerAction, r7, blockerAction2, r9, r10, null, r12, null, r14, r15, r16, r17, true, null, null, r21, r22);
            FormBlocker.Icon icon2 = (i & 8) != 0 ? null : icon;
            String str2 = (i & 32) != 0 ? null : str;
            BlockerAction blockerAction4 = (i & 64) != 0 ? null : blockerAction3;
            FormBlocker.OnDisplayEffect onDisplayEffect = FormBlocker.OnDisplayEffect.NONE;
            boolean z2 = (i & 1024) != 0 ? false : z;
            FormBlocker.Element.ButtonElement.Type type3 = (i & 2048) != 0 ? FormBlocker.Element.ButtonElement.Type.NORMAL : type2;
            FormBlocker.Element.ButtonElement.Style style3 = (i & 4096) != 0 ? FormBlocker.Element.ButtonElement.Style.PRIMARY : style;
            FormBlocker.Element.ButtonElement.Style style4 = (i & PKIFailureInfo.certRevoked) != 0 ? FormBlocker.Element.ButtonElement.Style.SECONDARY : style2;
            EmptyList emptyList = EmptyList.INSTANCE;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormScreen)) {
                return false;
            }
            FormScreen formScreen = (FormScreen) obj;
            return Intrinsics.areEqual(this.blockersData, formScreen.blockersData) && Intrinsics.areEqual(this.elements, formScreen.elements) && Intrinsics.areEqual(this.primary_action, formScreen.primary_action) && Intrinsics.areEqual(this.primary_action_icon, formScreen.primary_action_icon) && Intrinsics.areEqual(this.secondary_action, formScreen.secondary_action) && Intrinsics.areEqual(this.disclaimer_text, formScreen.disclaimer_text) && Intrinsics.areEqual(this.help_action, formScreen.help_action) && Intrinsics.areEqual(this.dismissAction, formScreen.dismissAction) && this.onDisplayEffect == formScreen.onDisplayEffect && Intrinsics.areEqual(this.remoteOnDisplayEffect, formScreen.remoteOnDisplayEffect) && this.requiresFullScroll == formScreen.requiresFullScroll && this.primary_action_type == formScreen.primary_action_type && this.primary_action_style == formScreen.primary_action_style && this.secondary_action_style == formScreen.secondary_action_style && this.dismissButtonEnabled == formScreen.dismissButtonEnabled && Intrinsics.areEqual(this.retreatAction, formScreen.retreatAction) && Intrinsics.areEqual(this.titleBarAccessoryText, formScreen.titleBarAccessoryText) && Intrinsics.areEqual(this.onAppearActions, formScreen.onAppearActions) && Intrinsics.areEqual(this.subforms, formScreen.subforms);
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockersData getBlockersData() {
            return this.blockersData;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getDismissAction() {
            return this.dismissAction;
        }

        @Override // com.squareup.cash.blockers.screens.BlockersScreens
        public final BlockerAction getRetreatAction() {
            throw null;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.blockersData.hashCode() * 31, 31, this.elements);
            BlockerAction blockerAction = this.primary_action;
            int hashCode = (m + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
            FormBlocker.Icon icon = this.primary_action_icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            BlockerAction blockerAction2 = this.secondary_action;
            int hashCode3 = (hashCode2 + (blockerAction2 == null ? 0 : blockerAction2.hashCode())) * 31;
            String str = this.disclaimer_text;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            BlockerAction blockerAction3 = this.help_action;
            int hashCode5 = (hashCode4 + (blockerAction3 == null ? 0 : blockerAction3.hashCode())) * 31;
            BlockerAction blockerAction4 = this.dismissAction;
            int hashCode6 = (hashCode5 + (blockerAction4 == null ? 0 : blockerAction4.hashCode())) * 31;
            FormBlocker.OnDisplayEffect onDisplayEffect = this.onDisplayEffect;
            int hashCode7 = (hashCode6 + (onDisplayEffect == null ? 0 : onDisplayEffect.hashCode())) * 31;
            FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect = this.remoteOnDisplayEffect;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.secondary_action_style.hashCode() + ((this.primary_action_style.hashCode() + ((this.primary_action_type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (remoteOnDisplayEffect == null ? 0 : remoteOnDisplayEffect.hashCode())) * 31, 31, this.requiresFullScroll)) * 31)) * 31)) * 31, 31, this.dismissButtonEnabled);
            BlockerAction blockerAction5 = this.retreatAction;
            int hashCode8 = (m2 + (blockerAction5 == null ? 0 : blockerAction5.hashCode())) * 31;
            String str2 = this.titleBarAccessoryText;
            return this.subforms.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.onAppearActions);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FormScreen(blockersData=");
            sb.append(this.blockersData);
            sb.append(", elements=");
            sb.append(this.elements);
            sb.append(", primary_action=");
            sb.append(this.primary_action);
            sb.append(", primary_action_icon=");
            sb.append(this.primary_action_icon);
            sb.append(", secondary_action=");
            sb.append(this.secondary_action);
            sb.append(", disclaimer_text=");
            sb.append(this.disclaimer_text);
            sb.append(", help_action=");
            sb.append(this.help_action);
            sb.append(", dismissAction=");
            sb.append(this.dismissAction);
            sb.append(", onDisplayEffect=");
            sb.append(this.onDisplayEffect);
            sb.append(", remoteOnDisplayEffect=");
            sb.append(this.remoteOnDisplayEffect);
            sb.append(", requiresFullScroll=");
            sb.append(this.requiresFullScroll);
            sb.append(", primary_action_type=");
            sb.append(this.primary_action_type);
            sb.append(", primary_action_style=");
            sb.append(this.primary_action_style);
            sb.append(", secondary_action_style=");
            sb.append(this.secondary_action_style);
            sb.append(", dismissButtonEnabled=");
            sb.append(this.dismissButtonEnabled);
            sb.append(", retreatAction=");
            sb.append(this.retreatAction);
            sb.append(", titleBarAccessoryText=");
            NavAction$$ExternalSyntheticOutline0.m(this.titleBarAccessoryText, ", onAppearActions=", ", subforms=", sb, this.onAppearActions);
            return re$$ExternalSyntheticOutline0.m(")", sb, this.subforms);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.primary_action, i);
            parcel.writeParcelable(this.primary_action_icon, i);
            parcel.writeParcelable(this.secondary_action, i);
            parcel.writeString(this.disclaimer_text);
            parcel.writeParcelable(this.help_action, i);
            parcel.writeParcelable(this.dismissAction, i);
            FormBlocker.OnDisplayEffect onDisplayEffect = this.onDisplayEffect;
            if (onDisplayEffect == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(onDisplayEffect.name());
            }
            parcel.writeParcelable(this.remoteOnDisplayEffect, i);
            parcel.writeInt(this.requiresFullScroll ? 1 : 0);
            parcel.writeString(this.primary_action_type.name());
            parcel.writeString(this.primary_action_style.name());
            parcel.writeString(this.secondary_action_style.name());
            parcel.writeInt(this.dismissButtonEnabled ? 1 : 0);
            parcel.writeParcelable(this.retreatAction, i);
            parcel.writeString(this.titleBarAccessoryText);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.onAppearActions, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.subforms, parcel);
            while (m3.hasNext()) {
                Map.Entry entry = (Map.Entry) m3.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
        }

        public FormScreen(BlockersData blockersData, List list, BlockerAction blockerAction, FormBlocker.Icon icon, BlockerAction blockerAction2, String str, BlockerAction blockerAction3, BlockerAction blockerAction4, FormBlocker.OnDisplayEffect onDisplayEffect, FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect, boolean z, FormBlocker.Element.ButtonElement.Type type2, FormBlocker.Element.ButtonElement.Style style, FormBlocker.Element.ButtonElement.Style style2, boolean z2, BlockerAction blockerAction5, String str2, List list2, Map map) {
            blockersData.getClass();
            list.getClass();
            type2.getClass();
            style.getClass();
            style2.getClass();
            list2.getClass();
            map.getClass();
            this.blockersData = blockersData;
            this.elements = list;
            this.primary_action = blockerAction;
            this.primary_action_icon = icon;
            this.secondary_action = blockerAction2;
            this.disclaimer_text = str;
            this.help_action = blockerAction3;
            this.dismissAction = blockerAction4;
            this.onDisplayEffect = onDisplayEffect;
            this.remoteOnDisplayEffect = remoteOnDisplayEffect;
            this.requiresFullScroll = z;
            this.primary_action_type = type2;
            this.primary_action_style = style;
            this.secondary_action_style = style2;
            this.dismissButtonEnabled = z2;
            this.retreatAction = blockerAction5;
            this.titleBarAccessoryText = str2;
            this.onAppearActions = list2;
            this.subforms = map;
        }
    }
}
