package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.recipient.RecipientSearchViewBlocker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.payments.common.PaymentSessionScreen;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.recipients.backend.api.Bucket;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class PaymentScreens extends MainScreens {

    public final class ConfirmDuplicate extends PaymentScreens implements DialogScreen {
        public static final Parcelable.Creator<ConfirmDuplicate> CREATOR = new NearbyPayer.Creator(18);
        public final Money amount;
        public final Redacted recipients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmDuplicate(Money money, Redacted redacted) {
            super(0);
            money.getClass();
            redacted.getClass();
            this.amount = money;
            this.recipients = redacted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmDuplicate)) {
                return false;
            }
            ConfirmDuplicate confirmDuplicate = (ConfirmDuplicate) obj;
            return Intrinsics.areEqual(this.amount, confirmDuplicate.amount) && Intrinsics.areEqual(this.recipients, confirmDuplicate.recipients);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.recipients.hashCode() + (this.amount.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmDuplicate(amount=" + this.amount + ", recipients=" + this.recipients + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeParcelable(this.recipients, i);
        }
    }

    public final class ConfirmRecipient extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<ConfirmRecipient> CREATOR = new NearbyPayer.Creator(20);
        public final Analytics analytics;
        public final String flagEmoji;
        public final boolean includeViewProfileOption;
        public final boolean isBitcoin;
        public final Recipient recipient;
        public final RecipientConfirmationType recipientConfirmationType;

        /* loaded from: classes6.dex */
        public final class Analytics implements Parcelable {
            public static final Parcelable.Creator<Analytics> CREATOR = new NearbyPayer.Creator(19);
            public final Integer absoluteIndex;
            public final RecipientSearchViewBlocker.BlockerReason blockerReason;
            public final Bucket bucket;
            public final String entityToken;
            public final String externalId;
            public final GenerationStrategy generationStrategy;
            public boolean isRecipientSearchViewBlockerTracked;
            public final Integer matchedAliasLength;
            public final String matchedFields;
            public final Boolean mlSearchEnabled;
            public final RecipientSearchViewBlocker.Origin origin;
            public final String queryToken;
            public final String remoteSuggestionType;
            public final Integer searchTextLength;
            public final String searchType;
            public final String section;
            public final Integer sectionIndex;
            public final Integer sectionTotal;
            public final SuggestionStrategy suggestionStrategy;
            public final Integer total;
            public final Boolean useCashCustomerSearchServiceEnabled;

            public Analytics(Bucket bucket, GenerationStrategy generationStrategy, Integer num, Integer num2, Boolean bool, Boolean bool2, String str, Integer num3, Integer num4, Integer num5, Integer num6, SuggestionStrategy suggestionStrategy, String str2, String str3, String str4, String str5, String str6, String str7, RecipientSearchViewBlocker.Origin origin, RecipientSearchViewBlocker.BlockerReason blockerReason, boolean z) {
                this.bucket = bucket;
                this.generationStrategy = generationStrategy;
                this.absoluteIndex = num;
                this.total = num2;
                this.useCashCustomerSearchServiceEnabled = bool;
                this.mlSearchEnabled = bool2;
                this.section = str;
                this.sectionIndex = num3;
                this.sectionTotal = num4;
                this.searchTextLength = num5;
                this.matchedAliasLength = num6;
                this.suggestionStrategy = suggestionStrategy;
                this.remoteSuggestionType = str2;
                this.searchType = str3;
                this.entityToken = str4;
                this.matchedFields = str5;
                this.queryToken = str6;
                this.externalId = str7;
                this.origin = origin;
                this.blockerReason = blockerReason;
                this.isRecipientSearchViewBlockerTracked = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Analytics)) {
                    return false;
                }
                Analytics analytics = (Analytics) obj;
                return this.bucket == analytics.bucket && this.generationStrategy == analytics.generationStrategy && Intrinsics.areEqual(this.absoluteIndex, analytics.absoluteIndex) && Intrinsics.areEqual(this.total, analytics.total) && Intrinsics.areEqual(this.useCashCustomerSearchServiceEnabled, analytics.useCashCustomerSearchServiceEnabled) && Intrinsics.areEqual(this.mlSearchEnabled, analytics.mlSearchEnabled) && Intrinsics.areEqual(this.section, analytics.section) && Intrinsics.areEqual(this.sectionIndex, analytics.sectionIndex) && Intrinsics.areEqual(this.sectionTotal, analytics.sectionTotal) && Intrinsics.areEqual(this.searchTextLength, analytics.searchTextLength) && Intrinsics.areEqual(this.matchedAliasLength, analytics.matchedAliasLength) && this.suggestionStrategy == analytics.suggestionStrategy && Intrinsics.areEqual(this.remoteSuggestionType, analytics.remoteSuggestionType) && Intrinsics.areEqual(this.searchType, analytics.searchType) && Intrinsics.areEqual(this.entityToken, analytics.entityToken) && Intrinsics.areEqual(this.matchedFields, analytics.matchedFields) && Intrinsics.areEqual(this.queryToken, analytics.queryToken) && Intrinsics.areEqual(this.externalId, analytics.externalId) && this.origin == analytics.origin && this.blockerReason == analytics.blockerReason && this.isRecipientSearchViewBlockerTracked == analytics.isRecipientSearchViewBlockerTracked;
            }

            public final int hashCode() {
                Bucket bucket = this.bucket;
                int hashCode = (bucket == null ? 0 : bucket.hashCode()) * 31;
                GenerationStrategy generationStrategy = this.generationStrategy;
                int hashCode2 = (hashCode + (generationStrategy == null ? 0 : generationStrategy.hashCode())) * 31;
                Integer num = this.absoluteIndex;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.total;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.useCashCustomerSearchServiceEnabled;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.mlSearchEnabled;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.section;
                int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num3 = this.sectionIndex;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.sectionTotal;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.searchTextLength;
                int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Integer num6 = this.matchedAliasLength;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
                int hashCode12 = (hashCode11 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
                String str2 = this.remoteSuggestionType;
                int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.searchType;
                int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.entityToken;
                int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.matchedFields;
                int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.queryToken;
                int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.externalId;
                int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
                RecipientSearchViewBlocker.Origin origin = this.origin;
                int hashCode19 = (hashCode18 + (origin == null ? 0 : origin.hashCode())) * 31;
                RecipientSearchViewBlocker.BlockerReason blockerReason = this.blockerReason;
                return Boolean.hashCode(this.isRecipientSearchViewBlockerTracked) + ((hashCode19 + (blockerReason != null ? blockerReason.hashCode() : 0)) * 31);
            }

            public final String toString() {
                boolean z = this.isRecipientSearchViewBlockerTracked;
                StringBuilder sb = new StringBuilder("Analytics(bucket=");
                sb.append(this.bucket);
                sb.append(", generationStrategy=");
                sb.append(this.generationStrategy);
                sb.append(", absoluteIndex=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.absoluteIndex, ", total=", this.total, ", useCashCustomerSearchServiceEnabled=");
                Thread$State$EnumUnboxingLocalUtility.m(sb, this.useCashCustomerSearchServiceEnabled, ", mlSearchEnabled=", this.mlSearchEnabled, ", section=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", sectionIndex=", this.sectionIndex, ", sectionTotal=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.sectionTotal, ", searchTextLength=", this.searchTextLength, ", matchedAliasLength=");
                sb.append(this.matchedAliasLength);
                sb.append(", suggestionStrategy=");
                sb.append(this.suggestionStrategy);
                sb.append(", remoteSuggestionType=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.remoteSuggestionType, ", searchType=", this.searchType, ", entityToken=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.entityToken, ", matchedFields=", this.matchedFields, ", queryToken=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.queryToken, ", externalId=", this.externalId, ", origin=");
                sb.append(this.origin);
                sb.append(", blockerReason=");
                sb.append(this.blockerReason);
                sb.append(", isRecipientSearchViewBlockerTracked=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, z, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Bucket bucket = this.bucket;
                if (bucket == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(bucket.name());
                }
                GenerationStrategy generationStrategy = this.generationStrategy;
                if (generationStrategy == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(generationStrategy.name());
                }
                Integer num = this.absoluteIndex;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
                Integer num2 = this.total;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
                }
                Boolean bool = this.useCashCustomerSearchServiceEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                }
                Boolean bool2 = this.mlSearchEnabled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
                }
                parcel.writeString(this.section);
                Integer num3 = this.sectionIndex;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num3);
                }
                Integer num4 = this.sectionTotal;
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num4);
                }
                Integer num5 = this.searchTextLength;
                if (num5 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num5);
                }
                Integer num6 = this.matchedAliasLength;
                if (num6 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num6);
                }
                SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
                if (suggestionStrategy == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(suggestionStrategy.name());
                }
                parcel.writeString(this.remoteSuggestionType);
                parcel.writeString(this.searchType);
                parcel.writeString(this.entityToken);
                parcel.writeString(this.matchedFields);
                parcel.writeString(this.queryToken);
                parcel.writeString(this.externalId);
                RecipientSearchViewBlocker.Origin origin = this.origin;
                if (origin == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(origin.name());
                }
                RecipientSearchViewBlocker.BlockerReason blockerReason = this.blockerReason;
                if (blockerReason == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(blockerReason.name());
                }
                parcel.writeInt(this.isRecipientSearchViewBlockerTracked ? 1 : 0);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class RecipientConfirmationType {
            public static final /* synthetic */ RecipientConfirmationType[] $VALUES;
            public static final RecipientConfirmationType DOMESTIC_PAYMENT_UNKNOWN_RECIPIENT;

            static {
                RecipientConfirmationType recipientConfirmationType = new RecipientConfirmationType("DOMESTIC_PAYMENT_UNKNOWN_RECIPIENT", 0);
                DOMESTIC_PAYMENT_UNKNOWN_RECIPIENT = recipientConfirmationType;
                $VALUES = new RecipientConfirmationType[]{recipientConfirmationType, new RecipientConfirmationType("COUNTRY_REDIRECTION", 1)};
            }

            public static RecipientConfirmationType valueOf(String str) {
                return (RecipientConfirmationType) Enum.valueOf(RecipientConfirmationType.class, str);
            }

            public static RecipientConfirmationType[] values() {
                return (RecipientConfirmationType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmRecipient(Recipient recipient, Analytics analytics, boolean z, boolean z2, RecipientConfirmationType recipientConfirmationType, String str) {
            super(0);
            recipient.getClass();
            recipientConfirmationType.getClass();
            this.recipient = recipient;
            this.analytics = analytics;
            this.isBitcoin = z;
            this.includeViewProfileOption = z2;
            this.recipientConfirmationType = recipientConfirmationType;
            this.flagEmoji = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmRecipient)) {
                return false;
            }
            ConfirmRecipient confirmRecipient = (ConfirmRecipient) obj;
            return Intrinsics.areEqual(this.recipient, confirmRecipient.recipient) && Intrinsics.areEqual(this.analytics, confirmRecipient.analytics) && this.isBitcoin == confirmRecipient.isBitcoin && this.includeViewProfileOption == confirmRecipient.includeViewProfileOption && this.recipientConfirmationType == confirmRecipient.recipientConfirmationType && Intrinsics.areEqual(this.flagEmoji, confirmRecipient.flagEmoji);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = this.recipient.hashCode() * 31;
            Analytics analytics = this.analytics;
            int hashCode2 = (this.recipientConfirmationType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (analytics == null ? 0 : analytics.hashCode())) * 31, 31, this.isBitcoin), 31, this.includeViewProfileOption)) * 31;
            String str = this.flagEmoji;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmRecipient(recipient=");
            sb.append(this.recipient);
            sb.append(", analytics=");
            sb.append(this.analytics);
            sb.append(", isBitcoin=");
            re$$ExternalSyntheticOutline0.m(sb, this.isBitcoin, ", includeViewProfileOption=", this.includeViewProfileOption, ", recipientConfirmationType=");
            sb.append(this.recipientConfirmationType);
            sb.append(", flagEmoji=");
            sb.append(this.flagEmoji);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.recipient, i);
            Analytics analytics = this.analytics;
            if (analytics == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analytics.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isBitcoin ? 1 : 0);
            parcel.writeInt(this.includeViewProfileOption ? 1 : 0);
            parcel.writeString(this.recipientConfirmationType.name());
            parcel.writeString(this.flagEmoji);
        }
    }

    public final class ContactSyncPermissionScreen extends PaymentScreens implements DialogScreen {
        public static final ContactSyncPermissionScreen INSTANCE = new ContactSyncPermissionScreen(0);
        public static final Parcelable.Creator<ContactSyncPermissionScreen> CREATOR = new NearbyPayer.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSyncPermissionScreen);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return 1436592575;
        }

        public final String toString() {
            return "ContactSyncPermissionScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DuplicatePayment extends PaymentScreens implements Parcelable {
        public static final Parcelable.Creator<DuplicatePayment> CREATOR = new NearbyPayer.Creator(22);
        public final Money amount;
        public final Orientation orientation;
        public final AskedQuestion question;
        public final Redacted recipient;

        /* loaded from: classes6.dex */
        public final class DuplicatePaymentQuestion implements Question {
            public static final DuplicatePaymentQuestion INSTANCE = new DuplicatePaymentQuestion();
            public static final Parcelable.Creator<DuplicatePaymentQuestion> CREATOR = new NearbyPayer.Creator(23);

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

        /* loaded from: classes6.dex */
        public final class DuplicatePaymentResult implements Parcelable {
            public static final Parcelable.Creator<DuplicatePaymentResult> CREATOR = new NearbyPayer.Creator(24);
            public final Recipient recipient;

            public DuplicatePaymentResult(Recipient recipient) {
                recipient.getClass();
                this.recipient = recipient;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DuplicatePaymentResult) && Intrinsics.areEqual(this.recipient, ((DuplicatePaymentResult) obj).recipient);
            }

            public final int hashCode() {
                return this.recipient.hashCode();
            }

            public final String toString() {
                return "DuplicatePaymentResult(recipient=" + this.recipient + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.recipient, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicatePayment(Redacted redacted, Orientation orientation, Money money, AskedQuestion askedQuestion) {
            super(0);
            redacted.getClass();
            orientation.getClass();
            money.getClass();
            askedQuestion.getClass();
            this.recipient = redacted;
            this.orientation = orientation;
            this.amount = money;
            this.question = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DuplicatePayment)) {
                return false;
            }
            DuplicatePayment duplicatePayment = (DuplicatePayment) obj;
            return Intrinsics.areEqual(this.recipient, duplicatePayment.recipient) && this.orientation == duplicatePayment.orientation && Intrinsics.areEqual(this.amount, duplicatePayment.amount) && Intrinsics.areEqual(this.question, duplicatePayment.question);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.question.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, (this.orientation.hashCode() + (this.recipient.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "DuplicatePayment(recipient=" + this.recipient + ", orientation=" + this.orientation + ", amount=" + this.amount + ", question=" + this.question + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.recipient, i);
            parcel.writeString(this.orientation.name());
            parcel.writeParcelable(this.amount, i);
            parcel.writeParcelable(this.question, i);
        }
    }

    public final class NearbyPayRequest extends PaymentScreens implements Parcelable, SingleInstanceScreen {
        public static final Parcelable.Creator<NearbyPayRequest> CREATOR = new NearbyPayer.Creator(27);
        public final String flowToken;

        public NearbyPayRequest(String str) {
            super(0);
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearbyPayRequest) && Intrinsics.areEqual(this.flowToken, ((NearbyPayRequest) obj).flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPayRequest(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class NearbyPayRequestHelp extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<NearbyPayRequestHelp> CREATOR = new NearbyPayer.Creator(28);
        public final String flowToken;

        public NearbyPayRequestHelp(String str) {
            super(0);
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearbyPayRequestHelp) && Intrinsics.areEqual(this.flowToken, ((NearbyPayRequestHelp) obj).flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPayRequestHelp(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class NearbyPayersSheet extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<NearbyPayersSheet> CREATOR = new NearbyPayer.Creator(29);
        public final String flowToken;
        public final Redacted payers;
        public final Long totalAmountCents;
        public final String totalReceivedFormatted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearbyPayersSheet(Redacted redacted, String str, Long l, String str2) {
            super(0);
            redacted.getClass();
            str.getClass();
            this.payers = redacted;
            this.totalReceivedFormatted = str;
            this.totalAmountCents = l;
            this.flowToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyPayersSheet)) {
                return false;
            }
            NearbyPayersSheet nearbyPayersSheet = (NearbyPayersSheet) obj;
            return Intrinsics.areEqual(this.payers, nearbyPayersSheet.payers) && Intrinsics.areEqual(this.totalReceivedFormatted, nearbyPayersSheet.totalReceivedFormatted) && Intrinsics.areEqual(this.totalAmountCents, nearbyPayersSheet.totalAmountCents) && Intrinsics.areEqual(this.flowToken, nearbyPayersSheet.flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.payers.hashCode() * 31, 31, this.totalReceivedFormatted);
            Long l = this.totalAmountCents;
            int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.flowToken;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "NearbyPayersSheet(payers=" + this.payers + ", totalReceivedFormatted=" + this.totalReceivedFormatted + ", totalAmountCents=" + this.totalAmountCents + ", flowToken=" + this.flowToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.payers, i);
            parcel.writeString(this.totalReceivedFormatted);
            Long l = this.totalAmountCents;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeString(this.flowToken);
        }
    }

    public final class NearbyPaymentKeypad extends PaymentScreens implements SingleInstanceScreen {
        public static final Parcelable.Creator<NearbyPaymentKeypad> CREATOR = new ScenarioInitiator.Creator(1);
        public final Screen exitScreen;
        public final String flowToken;
        public final String nearbySessionToken;
        public final Redacted recipient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearbyPaymentKeypad(Screen screen, Redacted redacted, String str, String str2) {
            super(0);
            redacted.getClass();
            screen.getClass();
            this.recipient = redacted;
            this.exitScreen = screen;
            this.nearbySessionToken = str;
            this.flowToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyPaymentKeypad)) {
                return false;
            }
            NearbyPaymentKeypad nearbyPaymentKeypad = (NearbyPaymentKeypad) obj;
            return Intrinsics.areEqual(this.recipient, nearbyPaymentKeypad.recipient) && Intrinsics.areEqual(this.exitScreen, nearbyPaymentKeypad.exitScreen) && Intrinsics.areEqual(this.nearbySessionToken, nearbyPaymentKeypad.nearbySessionToken) && Intrinsics.areEqual(this.flowToken, nearbyPaymentKeypad.flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, this.recipient.hashCode() * 31, 31);
            String str = this.nearbySessionToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.flowToken;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NearbyPaymentKeypad(recipient=");
            sb.append(this.recipient);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", nearbySessionToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.nearbySessionToken, ", flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.recipient, i);
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.nearbySessionToken);
            parcel.writeString(this.flowToken);
        }
    }

    public final class NearbyPaymentsInfo extends PaymentScreens {
        public static final Parcelable.Creator<NearbyPaymentsInfo> CREATOR = new ScenarioInitiator.Creator(2);
        public final String flowToken;

        public NearbyPaymentsInfo(String str) {
            super(0);
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearbyPaymentsInfo) && Intrinsics.areEqual(this.flowToken, ((NearbyPaymentsInfo) obj).flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPaymentsInfo(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class NearbyPeopleOverflowSheet extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final NearbyPeopleOverflowSheet INSTANCE = new NearbyPeopleOverflowSheet(0);
        public static final Parcelable.Creator<NearbyPeopleOverflowSheet> CREATOR = new ScenarioInitiator.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NearbyPeopleOverflowSheet);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return -1010429160;
        }

        public final String toString() {
            return "NearbyPeopleOverflowSheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class NearbyPermissionsPromptSheet extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<NearbyPermissionsPromptSheet> CREATOR = new ScenarioInitiator.Creator(4);
        public final String flowToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearbyPermissionsPromptSheet(String str) {
            super(0);
            str.getClass();
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearbyPermissionsPromptSheet) && Intrinsics.areEqual(this.flowToken, ((NearbyPermissionsPromptSheet) obj).flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.flowToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPermissionsPromptSheet(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class PaymentClaim extends PaymentScreens {
        public static final Parcelable.Creator<PaymentClaim> CREATOR = new ScenarioInitiator.Creator(6);
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentClaim(String str) {
            super(0);
            str.getClass();
            this.paymentToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentClaim) && Intrinsics.areEqual(this.paymentToken, ((PaymentClaim) obj).paymentToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentClaim(paymentToken=", this.paymentToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentToken);
        }
    }

    public final class PaymentLoading extends PaymentScreens {
        public static final Parcelable.Creator<PaymentLoading> CREATOR = new ScenarioInitiator.Creator(8);
        public final BlockersData blockersData;
        public final Redacted paymentInitiatorData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentLoading(BlockersData blockersData, Redacted redacted) {
            super(0);
            blockersData.getClass();
            redacted.getClass();
            this.blockersData = blockersData;
            this.paymentInitiatorData = redacted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentLoading)) {
                return false;
            }
            PaymentLoading paymentLoading = (PaymentLoading) obj;
            return Intrinsics.areEqual(this.blockersData, paymentLoading.blockersData) && Intrinsics.areEqual(this.paymentInitiatorData, paymentLoading.paymentInitiatorData);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentInitiatorData.hashCode() + (this.blockersData.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentLoading(blockersData=" + this.blockersData + ", paymentInitiatorData=" + this.paymentInitiatorData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.paymentInitiatorData, i);
        }
    }

    public final class PersonalizePaymentRecipient extends PaymentScreens implements Parcelable {
        public static final Parcelable.Creator<PersonalizePaymentRecipient> CREATOR = new ScenarioInitiator.Creator(11);
        public final Entity entity;
        public final boolean showReceiptButton;
        public final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalizePaymentRecipient(Entity entity, String str, boolean z) {
            super(0);
            entity.getClass();
            str.getClass();
            this.entity = entity;
            this.source = str;
            this.showReceiptButton = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalizePaymentRecipient)) {
                return false;
            }
            PersonalizePaymentRecipient personalizePaymentRecipient = (PersonalizePaymentRecipient) obj;
            return Intrinsics.areEqual(this.entity, personalizePaymentRecipient.entity) && Intrinsics.areEqual(this.source, personalizePaymentRecipient.source) && this.showReceiptButton == personalizePaymentRecipient.showReceiptButton;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return Boolean.hashCode(this.showReceiptButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity.hashCode() * 31, 31, this.source);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PersonalizePaymentRecipient(entity=");
            sb.append(this.entity);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(", showReceiptButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showReceiptButton, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.entity, i);
            parcel.writeString(this.source);
            parcel.writeInt(this.showReceiptButton ? 1 : 0);
        }
    }

    public final class PersonalizePaymentStickers extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<PersonalizePaymentStickers> CREATOR = new ScenarioInitiator.Creator(12);
        public final String flowToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalizePaymentStickers(String str) {
            super(0);
            str.getClass();
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PersonalizePaymentStickers) && Intrinsics.areEqual(this.flowToken, ((PersonalizePaymentStickers) obj).flowToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.flowToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PersonalizePaymentStickers(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class QuickPayDetails extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<QuickPayDetails> CREATOR = new ScenarioInitiator.Creator(15);
        public final ColorModel accentColor;
        public final Money amountInProfileCurrency;
        public final Money amountInSelectedCurrency;
        public final QuickPay.QuickPayAnalytics analytics;
        public final Orientation paymentOrientation;
        public final List selectedRecipients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickPayDetails(Orientation orientation, QuickPay.QuickPayAnalytics quickPayAnalytics, List list, ColorModel colorModel, Money money, Money money2) {
            super(0);
            orientation.getClass();
            quickPayAnalytics.getClass();
            list.getClass();
            colorModel.getClass();
            this.paymentOrientation = orientation;
            this.analytics = quickPayAnalytics;
            this.selectedRecipients = list;
            this.accentColor = colorModel;
            this.amountInProfileCurrency = money;
            this.amountInSelectedCurrency = money2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayDetails)) {
                return false;
            }
            QuickPayDetails quickPayDetails = (QuickPayDetails) obj;
            return this.paymentOrientation == quickPayDetails.paymentOrientation && Intrinsics.areEqual(this.analytics, quickPayDetails.analytics) && Intrinsics.areEqual(this.selectedRecipients, quickPayDetails.selectedRecipients) && Intrinsics.areEqual(this.accentColor, quickPayDetails.accentColor) && Intrinsics.areEqual(this.amountInProfileCurrency, quickPayDetails.amountInProfileCurrency) && Intrinsics.areEqual(this.amountInSelectedCurrency, quickPayDetails.amountInSelectedCurrency);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = (this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.analytics.hashCode() + (this.paymentOrientation.hashCode() * 31)) * 31, 31, this.selectedRecipients)) * 31;
            Money money = this.amountInProfileCurrency;
            int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.amountInSelectedCurrency;
            return hashCode2 + (money2 != null ? money2.hashCode() : 0);
        }

        public final String toString() {
            return "QuickPayDetails(paymentOrientation=" + this.paymentOrientation + ", analytics=" + this.analytics + ", selectedRecipients=" + this.selectedRecipients + ", accentColor=" + this.accentColor + ", amountInProfileCurrency=" + this.amountInProfileCurrency + ", amountInSelectedCurrency=" + this.amountInSelectedCurrency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentOrientation.name());
            this.analytics.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedRecipients, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.accentColor, i);
            parcel.writeParcelable(this.amountInProfileCurrency, i);
            parcel.writeParcelable(this.amountInSelectedCurrency, i);
        }
    }

    public final class QuickPayExitRouterScreen extends PaymentScreens {
        public static final Parcelable.Creator<QuickPayExitRouterScreen> CREATOR = new ScenarioInitiator.Creator(17);
        public final String clientRoute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickPayExitRouterScreen(String str) {
            super(0);
            str.getClass();
            this.clientRoute = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPayExitRouterScreen) && Intrinsics.areEqual(this.clientRoute, ((QuickPayExitRouterScreen) obj).clientRoute);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("QuickPayExitRouterScreen(clientRoute=", this.clientRoute, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientRoute);
        }
    }

    public final class RecipientSelectionWarningScreen extends PaymentScreens implements DialogScreen {
        public static final Parcelable.Creator<RecipientSelectionWarningScreen> CREATOR = new ScenarioInitiator.Creator(18);
        public final Screen exitScreen;
        public final Redacted message;
        public final String positiveButtonText;
        public final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecipientSelectionWarningScreen(Screen screen, Redacted redacted, String str, String str2) {
            super(0);
            redacted.getClass();
            this.title = str;
            this.message = redacted;
            this.positiveButtonText = str2;
            this.exitScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipientSelectionWarningScreen)) {
                return false;
            }
            RecipientSelectionWarningScreen recipientSelectionWarningScreen = (RecipientSelectionWarningScreen) obj;
            return Intrinsics.areEqual(this.title, recipientSelectionWarningScreen.title) && Intrinsics.areEqual(this.message, recipientSelectionWarningScreen.message) && Intrinsics.areEqual(this.positiveButtonText, recipientSelectionWarningScreen.positiveButtonText) && Intrinsics.areEqual(this.exitScreen, recipientSelectionWarningScreen.exitScreen);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            String str = this.title;
            int m = re$$ExternalSyntheticOutline0.m(this.message, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.positiveButtonText;
            int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            Screen screen = this.exitScreen;
            return hashCode + (screen != null ? screen.hashCode() : 0);
        }

        public final String toString() {
            return "RecipientSelectionWarningScreen(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ", exitScreen=" + this.exitScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeParcelable(this.message, i);
            parcel.writeString(this.positiveButtonText);
            parcel.writeParcelable(this.exitScreen, i);
        }
    }

    public final class SchedulePayment extends PaymentScreens implements Parcelable {
        public static final Parcelable.Creator<SchedulePayment> CREATOR = new ScenarioInitiator.Creator(19);
        public final String flowToken;
        public final PaymentScheduleSelection initialSelection;
        public final Origin origin;
        public final String paymentToken;
        public final AskedQuestion question;
        public final CashInstrumentType selectedInstrumentType;

        /* loaded from: classes6.dex */
        public interface SchedulePaymentAnswer extends Parcelable {

            public final class Cleared implements SchedulePaymentAnswer {
                public static final Cleared INSTANCE = new Cleared();
                public static final Parcelable.Creator<Cleared> CREATOR = new ScenarioInitiator.Creator(20);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Cleared);
                }

                public final int hashCode() {
                    return 1011845557;
                }

                public final String toString() {
                    return "Cleared";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Selected implements SchedulePaymentAnswer {
                public static final Parcelable.Creator<Selected> CREATOR = new ScenarioInitiator.Creator(21);
                public final PaymentScheduleSelection selection;

                public Selected(PaymentScheduleSelection paymentScheduleSelection) {
                    paymentScheduleSelection.getClass();
                    this.selection = paymentScheduleSelection;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Selected) && Intrinsics.areEqual(this.selection, ((Selected) obj).selection);
                }

                public final int hashCode() {
                    return this.selection.hashCode();
                }

                public final String toString() {
                    return "Selected(selection=" + this.selection + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    this.selection.writeToParcel(parcel, i);
                }
            }
        }

        /* loaded from: classes6.dex */
        public final class SchedulePaymentQuestion implements Question {
            public static final SchedulePaymentQuestion INSTANCE = new SchedulePaymentQuestion();
            public static final Parcelable.Creator<SchedulePaymentQuestion> CREATOR = new ScenarioInitiator.Creator(22);

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SchedulePayment(AskedQuestion askedQuestion, String str, PaymentScheduleSelection paymentScheduleSelection, String str2, Origin origin, CashInstrumentType cashInstrumentType) {
            super(0);
            askedQuestion.getClass();
            str.getClass();
            this.question = askedQuestion;
            this.paymentToken = str;
            this.initialSelection = paymentScheduleSelection;
            this.flowToken = str2;
            this.origin = origin;
            this.selectedInstrumentType = cashInstrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SchedulePayment)) {
                return false;
            }
            SchedulePayment schedulePayment = (SchedulePayment) obj;
            return Intrinsics.areEqual(this.question, schedulePayment.question) && Intrinsics.areEqual(this.paymentToken, schedulePayment.paymentToken) && Intrinsics.areEqual(this.initialSelection, schedulePayment.initialSelection) && Intrinsics.areEqual(this.flowToken, schedulePayment.flowToken) && this.origin == schedulePayment.origin && this.selectedInstrumentType == schedulePayment.selectedInstrumentType;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.question.hashCode() * 31, 31, this.paymentToken);
            PaymentScheduleSelection paymentScheduleSelection = this.initialSelection;
            int hashCode = (m + (paymentScheduleSelection == null ? 0 : paymentScheduleSelection.hashCode())) * 31;
            String str = this.flowToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Origin origin = this.origin;
            int hashCode3 = (hashCode2 + (origin == null ? 0 : origin.hashCode())) * 31;
            CashInstrumentType cashInstrumentType = this.selectedInstrumentType;
            return hashCode3 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
        }

        public final String toString() {
            return "SchedulePayment(question=" + this.question + ", paymentToken=" + this.paymentToken + ", initialSelection=" + this.initialSelection + ", flowToken=" + this.flowToken + ", origin=" + this.origin + ", selectedInstrumentType=" + this.selectedInstrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.question, i);
            parcel.writeString(this.paymentToken);
            PaymentScheduleSelection paymentScheduleSelection = this.initialSelection;
            if (paymentScheduleSelection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                paymentScheduleSelection.writeToParcel(parcel, i);
            }
            parcel.writeString(this.flowToken);
            Origin origin = this.origin;
            if (origin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(origin.name());
            }
            CashInstrumentType cashInstrumentType = this.selectedInstrumentType;
            if (cashInstrumentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cashInstrumentType.name());
            }
        }
    }

    public final class NoteRequired extends PaymentScreens implements DialogScreen {
        public static final Parcelable.Creator<NoteRequired> CREATOR = new ScenarioInitiator.Creator(5);
        public final boolean isAmountFirst;
        public final Orientation orientation;
        public final Redacted recipients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoteRequired(Redacted redacted, Orientation orientation, boolean z) {
            super(0);
            redacted.getClass();
            this.recipients = redacted;
            this.orientation = orientation;
            this.isAmountFirst = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteRequired)) {
                return false;
            }
            NoteRequired noteRequired = (NoteRequired) obj;
            return Intrinsics.areEqual(this.recipients, noteRequired.recipients) && this.orientation == noteRequired.orientation && this.isAmountFirst == noteRequired.isAmountFirst;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = this.recipients.hashCode() * 31;
            Orientation orientation = this.orientation;
            return Boolean.hashCode(this.isAmountFirst) + ((hashCode + (orientation == null ? 0 : orientation.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteRequired(recipients=");
            sb.append(this.recipients);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", isAmountFirst=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isAmountFirst, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.recipients, i);
            Orientation orientation = this.orientation;
            if (orientation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(orientation.name());
            }
            parcel.writeInt(this.isAmountFirst ? 1 : 0);
        }

        public /* synthetic */ NoteRequired(RedactedParcelableList redactedParcelableList, Orientation orientation, int i) {
            this((Redacted) redactedParcelableList, (i & 2) != 0 ? null : orientation, true);
        }
    }

    public final class WarningDialog extends PaymentScreens implements DialogScreen {
        public static final Parcelable.Creator<WarningDialog> CREATOR = new ScenarioInitiator.Creator(24);
        public final Color color;
        public final Redacted cta;
        public final Redacted message;
        public final Redacted title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WarningDialog(Redacted redacted, Redacted redacted2, Redacted redacted3, Color color) {
            super(0);
            redacted2.getClass();
            this.title = redacted;
            this.message = redacted2;
            this.cta = redacted3;
            this.color = color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WarningDialog)) {
                return false;
            }
            WarningDialog warningDialog = (WarningDialog) obj;
            return Intrinsics.areEqual(this.title, warningDialog.title) && Intrinsics.areEqual(this.message, warningDialog.message) && Intrinsics.areEqual(this.cta, warningDialog.cta) && Intrinsics.areEqual(this.color, warningDialog.color);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            Redacted redacted = this.title;
            int m = re$$ExternalSyntheticOutline0.m(this.message, (redacted == null ? 0 : redacted.hashCode()) * 31, 31);
            Redacted redacted2 = this.cta;
            int hashCode = (m + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
            Color color = this.color;
            return hashCode + (color != null ? color.hashCode() : 0);
        }

        public final String toString() {
            return "WarningDialog(title=" + this.title + ", message=" + this.message + ", cta=" + this.cta + ", color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.title, i);
            parcel.writeParcelable(this.message, i);
            parcel.writeParcelable(this.cta, i);
            parcel.writeParcelable(this.color, i);
        }

        public /* synthetic */ WarningDialog(RedactedString redactedString, RedactedString redactedString2, RedactedString redactedString3, int i) {
            this((i & 1) != 0 ? null : redactedString, redactedString2, (i & 4) != 0 ? null : redactedString3, (Color) null);
        }
    }

    /* loaded from: classes6.dex */
    public final class SelectPaymentInstrument extends PaymentScreens implements SelectPaymentInstrumentArgs {
        public static final Parcelable.Creator<SelectPaymentInstrument> CREATOR = new ScenarioInitiator.Creator(23);
        public final Money amount;
        public final boolean cashBalanceEnabled;
        public final boolean confirmingPayment;
        public final long creditCardFeeBps;
        public final boolean creditCardLinkingEnabled;
        public final List instrumentTokens;
        public final List instrumentTypes;
        public final boolean isRequest;
        public final ArrayList recipients;
        public final String selectedInstrumentToken;
        public final boolean showDisabledOptions;

        /* renamed from: type, reason: collision with root package name */
        public final SelectPaymentInstrumentType f1184type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentInstrument(SelectPaymentInstrumentType selectPaymentInstrumentType, List list, ArrayList arrayList, Money money, boolean z, boolean z2, long j, List list2, boolean z3, boolean z4, String str, boolean z5) {
            super(0);
            selectPaymentInstrumentType.getClass();
            list.getClass();
            money.getClass();
            list2.getClass();
            this.f1184type = selectPaymentInstrumentType;
            this.instrumentTokens = list;
            this.recipients = arrayList;
            this.amount = money;
            this.creditCardLinkingEnabled = z;
            this.cashBalanceEnabled = z2;
            this.creditCardFeeBps = j;
            this.instrumentTypes = list2;
            this.confirmingPayment = z3;
            this.showDisabledOptions = z4;
            this.selectedInstrumentToken = str;
            this.isRequest = z5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPaymentInstrument)) {
                return false;
            }
            SelectPaymentInstrument selectPaymentInstrument = (SelectPaymentInstrument) obj;
            return this.f1184type == selectPaymentInstrument.f1184type && Intrinsics.areEqual(this.instrumentTokens, selectPaymentInstrument.instrumentTokens) && Intrinsics.areEqual(this.recipients, selectPaymentInstrument.recipients) && Intrinsics.areEqual(this.amount, selectPaymentInstrument.amount) && this.creditCardLinkingEnabled == selectPaymentInstrument.creditCardLinkingEnabled && this.cashBalanceEnabled == selectPaymentInstrument.cashBalanceEnabled && this.creditCardFeeBps == selectPaymentInstrument.creditCardFeeBps && Intrinsics.areEqual(this.instrumentTypes, selectPaymentInstrument.instrumentTypes) && this.confirmingPayment == selectPaymentInstrument.confirmingPayment && this.showDisabledOptions == selectPaymentInstrument.showDisabledOptions && Intrinsics.areEqual(this.selectedInstrumentToken, selectPaymentInstrument.selectedInstrumentToken) && this.isRequest == selectPaymentInstrument.isRequest;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final Money getAmount() {
            return this.amount;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getCashBalanceEnabled() {
            return this.cashBalanceEnabled;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getConfirmingPayment() {
            return this.confirmingPayment;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final long getCreditCardFeeBps() {
            return this.creditCardFeeBps;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getCreditCardLinkingEnabled() {
            return this.creditCardLinkingEnabled;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getInstrumentTokens() {
            return this.instrumentTokens;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getInstrumentTypes() {
            return this.instrumentTypes;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getRecipients() {
            return this.recipients;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final String getSelectedInstrumentToken() {
            return this.selectedInstrumentToken;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getShowDisabledOptions() {
            return this.showDisabledOptions;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final SelectPaymentInstrumentType getType() {
            return this.f1184type;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, CameraState$Type$EnumUnboxingLocalUtility.m(this.recipients, Recorder$$ExternalSyntheticOutline2.m(this.f1184type.hashCode() * 31, 31, this.instrumentTokens), 31), 31), 31, this.creditCardLinkingEnabled), 31, this.cashBalanceEnabled), 31, this.creditCardFeeBps), 31, this.instrumentTypes), 31, this.confirmingPayment), 31, this.showDisabledOptions);
            String str = this.selectedInstrumentToken;
            return Boolean.hashCode(this.isRequest) + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean isRequest() {
            return this.isRequest;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectPaymentInstrument(type=");
            sb.append(this.f1184type);
            sb.append(", instrumentTokens=");
            sb.append(this.instrumentTokens);
            sb.append(", recipients=");
            sb.append(this.recipients);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", creditCardLinkingEnabled=");
            re$$ExternalSyntheticOutline0.m(sb, this.creditCardLinkingEnabled, ", cashBalanceEnabled=", this.cashBalanceEnabled, ", creditCardFeeBps=");
            sb.append(this.creditCardFeeBps);
            sb.append(", instrumentTypes=");
            sb.append(this.instrumentTypes);
            sb.append(", confirmingPayment=");
            sb.append(this.confirmingPayment);
            sb.append(", showDisabledOptions=");
            sb.append(this.showDisabledOptions);
            sb.append(", selectedInstrumentToken=");
            sb.append(this.selectedInstrumentToken);
            sb.append(", isRequest=");
            sb.append(this.isRequest);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f1184type.name());
            parcel.writeStringList(this.instrumentTokens);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.recipients, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.amount, i);
            parcel.writeInt(this.creditCardLinkingEnabled ? 1 : 0);
            parcel.writeInt(this.cashBalanceEnabled ? 1 : 0);
            parcel.writeLong(this.creditCardFeeBps);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.instrumentTypes, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((CashInstrumentType) m2.next()).name());
            }
            parcel.writeInt(this.confirmingPayment ? 1 : 0);
            parcel.writeInt(this.showDisabledOptions ? 1 : 0);
            parcel.writeString(this.selectedInstrumentToken);
            parcel.writeInt(this.isRequest ? 1 : 0);
        }

        public /* synthetic */ SelectPaymentInstrument(List list, ArrayList arrayList, Money money, boolean z, boolean z2, long j, EmptyList emptyList, boolean z3, String str) {
            this(SelectPaymentInstrumentType.SELECT_FROM_ALL, list, arrayList, money, z, z2, j, emptyList, false, z3, str, false);
        }
    }

    public final class PaymentConfiguration extends PaymentScreens implements OnlyOneOverlayTreatment {
        public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new ScenarioInitiator.Creator(7);
        public final Money amount;
        public final AppCreationActivity appCreationActivity;
        public final Screen exitScreen;
        public final String flowToken;
        public final InstrumentSelectionData instrument;
        public final String launchUrl;
        public final BlockersData.MoneybotContext moneybotContext;
        public final Orientation orientation;
        public final PaymentConfigurationFlow paymentConfigurationFlow;
        public final UUID paymentToken;
        public final String referrer;

        public /* synthetic */ PaymentConfiguration(UUID uuid, Money money, Orientation orientation, Screen screen, AppCreationActivity appCreationActivity, String str, String str2, String str3, PaymentConfigurationFlow paymentConfigurationFlow, BlockersData.MoneybotContext moneybotContext, int i) {
            this(uuid, money, (InstrumentSelectionData) null, orientation, screen, (i & 32) != 0 ? AppCreationActivity.HOMESCREEN : appCreationActivity, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, paymentConfigurationFlow, (i & 1024) != 0 ? null : moneybotContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentConfiguration)) {
                return false;
            }
            PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj;
            return Intrinsics.areEqual(this.paymentToken, paymentConfiguration.paymentToken) && Intrinsics.areEqual(this.amount, paymentConfiguration.amount) && Intrinsics.areEqual(this.instrument, paymentConfiguration.instrument) && this.orientation == paymentConfiguration.orientation && Intrinsics.areEqual(this.exitScreen, paymentConfiguration.exitScreen) && this.appCreationActivity == paymentConfiguration.appCreationActivity && Intrinsics.areEqual(this.referrer, paymentConfiguration.referrer) && Intrinsics.areEqual(this.launchUrl, paymentConfiguration.launchUrl) && Intrinsics.areEqual(this.flowToken, paymentConfiguration.flowToken) && Intrinsics.areEqual(this.paymentConfigurationFlow, paymentConfiguration.paymentConfigurationFlow) && Intrinsics.areEqual(this.moneybotContext, paymentConfiguration.moneybotContext);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            UUID uuid = this.paymentToken;
            int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, (uuid == null ? 0 : uuid.hashCode()) * 31, 31);
            InstrumentSelectionData instrumentSelectionData = this.instrument;
            int hashCode = (this.orientation.hashCode() + ((m + (instrumentSelectionData == null ? 0 : instrumentSelectionData.hashCode())) * 31)) * 31;
            Screen screen = this.exitScreen;
            int hashCode2 = (this.appCreationActivity.hashCode() + ((hashCode + (screen == null ? 0 : screen.hashCode())) * 31)) * 31;
            String str = this.referrer;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.launchUrl;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.flowToken;
            int hashCode5 = (this.paymentConfigurationFlow.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
            return hashCode5 + (moneybotContext != null ? moneybotContext.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentConfiguration(paymentToken=");
            sb.append(this.paymentToken);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", instrument=");
            sb.append(this.instrument);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", appCreationActivity=");
            sb.append(this.appCreationActivity);
            sb.append(", referrer=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.referrer, ", launchUrl=", this.launchUrl, ", flowToken=");
            sb.append(this.flowToken);
            sb.append(", paymentConfigurationFlow=");
            sb.append(this.paymentConfigurationFlow);
            sb.append(", moneybotContext=");
            sb.append(this.moneybotContext);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.paymentToken);
            parcel.writeParcelable(this.amount, i);
            InstrumentSelectionData instrumentSelectionData = this.instrument;
            if (instrumentSelectionData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                instrumentSelectionData.writeToParcel(parcel, i);
            }
            parcel.writeString(this.orientation.name());
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.appCreationActivity.name());
            parcel.writeString(this.referrer);
            parcel.writeString(this.launchUrl);
            parcel.writeString(this.flowToken);
            parcel.writeParcelable(this.paymentConfigurationFlow, i);
            parcel.writeParcelable(this.moneybotContext, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentConfiguration(UUID uuid, Money money, InstrumentSelectionData instrumentSelectionData, Orientation orientation, Screen screen, AppCreationActivity appCreationActivity, String str, String str2, String str3, PaymentConfigurationFlow paymentConfigurationFlow, BlockersData.MoneybotContext moneybotContext) {
            super(0);
            money.getClass();
            orientation.getClass();
            appCreationActivity.getClass();
            paymentConfigurationFlow.getClass();
            this.paymentToken = uuid;
            this.amount = money;
            this.instrument = instrumentSelectionData;
            this.orientation = orientation;
            this.exitScreen = screen;
            this.appCreationActivity = appCreationActivity;
            this.referrer = str;
            this.launchUrl = str2;
            this.flowToken = str3;
            this.paymentConfigurationFlow = paymentConfigurationFlow;
            this.moneybotContext = moneybotContext;
        }
    }

    public final class QuickPay extends PaymentScreens implements PaymentSessionScreen {
        public static final Parcelable.Creator<QuickPay> CREATOR = new ScenarioInitiator.Creator(13);
        public final Money amount;
        public final QuickPayAnalytics analytics;
        public final AppCreationActivity appCreationActivity;
        public final Screen exitScreen;
        public final Screen exitScreenOnSuccess;
        public final boolean isBackNavigation;
        public final String launchUrl;
        public final BlockersData.MoneybotContext moneybotContext;
        public final Redacted note;
        public final Orientation orientation;
        public final List paymentGetters;
        public final String referrer;
        public final boolean showDetailsOverflow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickPay(Screen screen, Screen screen2, Orientation orientation, List list, Money money, AppCreationActivity appCreationActivity, String str, String str2, Redacted redacted, QuickPayAnalytics quickPayAnalytics, boolean z, boolean z2, BlockersData.MoneybotContext moneybotContext) {
            super(0);
            screen.getClass();
            screen2.getClass();
            orientation.getClass();
            list.getClass();
            money.getClass();
            appCreationActivity.getClass();
            redacted.getClass();
            quickPayAnalytics.getClass();
            this.exitScreen = screen;
            this.exitScreenOnSuccess = screen2;
            this.orientation = orientation;
            this.paymentGetters = list;
            this.amount = money;
            this.appCreationActivity = appCreationActivity;
            this.referrer = str;
            this.launchUrl = str2;
            this.note = redacted;
            this.analytics = quickPayAnalytics;
            this.isBackNavigation = z;
            this.showDetailsOverflow = z2;
            this.moneybotContext = moneybotContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPay)) {
                return false;
            }
            QuickPay quickPay = (QuickPay) obj;
            return Intrinsics.areEqual(this.exitScreen, quickPay.exitScreen) && Intrinsics.areEqual(this.exitScreenOnSuccess, quickPay.exitScreenOnSuccess) && this.orientation == quickPay.orientation && Intrinsics.areEqual(this.paymentGetters, quickPay.paymentGetters) && Intrinsics.areEqual(this.amount, quickPay.amount) && this.appCreationActivity == quickPay.appCreationActivity && Intrinsics.areEqual(this.referrer, quickPay.referrer) && Intrinsics.areEqual(this.launchUrl, quickPay.launchUrl) && Intrinsics.areEqual(this.note, quickPay.note) && Intrinsics.areEqual(this.analytics, quickPay.analytics) && this.isBackNavigation == quickPay.isBackNavigation && this.showDetailsOverflow == quickPay.showDetailsOverflow && Intrinsics.areEqual(this.moneybotContext, quickPay.moneybotContext);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = (this.appCreationActivity.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, Recorder$$ExternalSyntheticOutline2.m((this.orientation.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreenOnSuccess, this.exitScreen.hashCode() * 31, 31)) * 31, 31, this.paymentGetters), 31)) * 31;
            String str = this.referrer;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.launchUrl;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.analytics.hashCode() + re$$ExternalSyntheticOutline0.m(this.note, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31, this.isBackNavigation), 31, this.showDetailsOverflow);
            BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
            return m + (moneybotContext != null ? moneybotContext.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuickPay(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", exitScreenOnSuccess=");
            sb.append(this.exitScreenOnSuccess);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", paymentGetters=");
            sb.append(this.paymentGetters);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", appCreationActivity=");
            sb.append(this.appCreationActivity);
            sb.append(", referrer=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.referrer, ", launchUrl=", this.launchUrl, ", note=");
            sb.append(this.note);
            sb.append(", analytics=");
            sb.append(this.analytics);
            sb.append(", isBackNavigation=");
            re$$ExternalSyntheticOutline0.m(sb, this.isBackNavigation, ", showDetailsOverflow=", this.showDetailsOverflow, ", moneybotContext=");
            sb.append(this.moneybotContext);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeParcelable(this.exitScreenOnSuccess, i);
            parcel.writeString(this.orientation.name());
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.paymentGetters, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.appCreationActivity.name());
            parcel.writeString(this.referrer);
            parcel.writeString(this.launchUrl);
            parcel.writeParcelable(this.note, i);
            this.analytics.writeToParcel(parcel, i);
            parcel.writeInt(this.isBackNavigation ? 1 : 0);
            parcel.writeInt(this.showDetailsOverflow ? 1 : 0);
            parcel.writeParcelable(this.moneybotContext, i);
        }

        /* loaded from: classes6.dex */
        public final class QuickPayAnalytics implements Parcelable {
            public static final Parcelable.Creator<QuickPayAnalytics> CREATOR = new ScenarioInitiator.Creator(14);
            public final Integer absoluteIndex;
            public final ContactStatus contactStatus;
            public final UUID externalPaymentId;
            public final Integer matchedAliasLength;
            public final Origin origin;
            public final String remoteSuggestionType;
            public final Integer searchTextLength;
            public final String searchType;
            public final String section;
            public final String sectionId;
            public final Integer sectionIndex;
            public final Integer sectionTotal;
            public final SuggestionStrategy suggestionStrategy;

            public /* synthetic */ QuickPayAnalytics(UUID uuid, Origin origin, SuggestionStrategy suggestionStrategy, String str, String str2, Integer num, Integer num2, Integer num3, String str3, Integer num4, String str4, Integer num5, int i) {
                this(uuid, (ContactStatus) null, (i & 4) != 0 ? null : origin, (i & 8) != 0 ? null : suggestionStrategy, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : num5);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QuickPayAnalytics)) {
                    return false;
                }
                QuickPayAnalytics quickPayAnalytics = (QuickPayAnalytics) obj;
                return Intrinsics.areEqual(this.externalPaymentId, quickPayAnalytics.externalPaymentId) && this.contactStatus == quickPayAnalytics.contactStatus && this.origin == quickPayAnalytics.origin && this.suggestionStrategy == quickPayAnalytics.suggestionStrategy && Intrinsics.areEqual(this.sectionId, quickPayAnalytics.sectionId) && Intrinsics.areEqual(this.section, quickPayAnalytics.section) && Intrinsics.areEqual(this.sectionIndex, quickPayAnalytics.sectionIndex) && Intrinsics.areEqual(this.sectionTotal, quickPayAnalytics.sectionTotal) && Intrinsics.areEqual(this.searchTextLength, quickPayAnalytics.searchTextLength) && Intrinsics.areEqual(this.searchType, quickPayAnalytics.searchType) && Intrinsics.areEqual(this.matchedAliasLength, quickPayAnalytics.matchedAliasLength) && Intrinsics.areEqual(this.remoteSuggestionType, quickPayAnalytics.remoteSuggestionType) && Intrinsics.areEqual(this.absoluteIndex, quickPayAnalytics.absoluteIndex);
            }

            public final int hashCode() {
                int hashCode = this.externalPaymentId.hashCode() * 31;
                ContactStatus contactStatus = this.contactStatus;
                int hashCode2 = (hashCode + (contactStatus == null ? 0 : contactStatus.hashCode())) * 31;
                Origin origin = this.origin;
                int hashCode3 = (hashCode2 + (origin == null ? 0 : origin.hashCode())) * 31;
                SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
                int hashCode4 = (hashCode3 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
                String str = this.sectionId;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.section;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.sectionIndex;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.sectionTotal;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.searchTextLength;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                String str3 = this.searchType;
                int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num4 = this.matchedAliasLength;
                int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
                String str4 = this.remoteSuggestionType;
                int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num5 = this.absoluteIndex;
                return hashCode12 + (num5 != null ? num5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("QuickPayAnalytics(externalPaymentId=");
                sb.append(this.externalPaymentId);
                sb.append(", contactStatus=");
                sb.append(this.contactStatus);
                sb.append(", origin=");
                sb.append(this.origin);
                sb.append(", suggestionStrategy=");
                sb.append(this.suggestionStrategy);
                sb.append(", sectionId=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.sectionId, ", section=", this.section, ", sectionIndex=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.sectionIndex, ", sectionTotal=", this.sectionTotal, ", searchTextLength=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.searchTextLength, ", searchType=", this.searchType, ", matchedAliasLength=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.matchedAliasLength, ", remoteSuggestionType=", this.remoteSuggestionType, ", absoluteIndex=");
                return NavAction$$ExternalSyntheticOutline0.m(sb, this.absoluteIndex, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeSerializable(this.externalPaymentId);
                ContactStatus contactStatus = this.contactStatus;
                if (contactStatus == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(contactStatus.name());
                }
                Origin origin = this.origin;
                if (origin == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(origin.name());
                }
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
                parcel.writeString(this.remoteSuggestionType);
                Integer num5 = this.absoluteIndex;
                if (num5 == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num5);
                }
            }

            public QuickPayAnalytics(UUID uuid, ContactStatus contactStatus, Origin origin, SuggestionStrategy suggestionStrategy, String str, String str2, Integer num, Integer num2, Integer num3, String str3, Integer num4, String str4, Integer num5) {
                uuid.getClass();
                this.externalPaymentId = uuid;
                this.contactStatus = contactStatus;
                this.origin = origin;
                this.suggestionStrategy = suggestionStrategy;
                this.sectionId = str;
                this.section = str2;
                this.sectionIndex = num;
                this.sectionTotal = num2;
                this.searchTextLength = num3;
                this.searchType = str3;
                this.matchedAliasLength = num4;
                this.remoteSuggestionType = str4;
                this.absoluteIndex = num5;
            }
        }
    }

    public final class PersonalizePayment extends PaymentScreens implements Parcelable {
        public static final Parcelable.Creator<PersonalizePayment> CREATOR = new ScenarioInitiator.Creator(9);
        public final Money amount;
        public final AppCreationActivity appCreationActivity;
        public final boolean cashBalanceEnabled;
        public final ClientScenario clientScenario;
        public final long creditCardFeeBps;
        public final boolean creditCardLinkingEnabled;
        public final String exchangeRatesToken;
        public final Screen exitScreen;
        public final String flowToken;
        public final boolean forceHideTextOptions;
        public final boolean ignoreDuplicate;
        public final InstrumentSelectionData instrumentSelection;
        public final String launchUrl;
        public final BlockersData.MoneybotContext moneybotContext;
        public final Redacted note;
        public final PersonalizationOrigin origin;
        public final UUID paymentToken;
        public final AskedQuestion question;
        public final Redacted recipients;
        public final String referrer;

        /* loaded from: classes6.dex */
        public final class PersonalizePaymentQuestion implements Question {
            public static final PersonalizePaymentQuestion INSTANCE = new PersonalizePaymentQuestion();
            public static final Parcelable.Creator<PersonalizePaymentQuestion> CREATOR = new ScenarioInitiator.Creator(10);

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalizePayment(UUID uuid, Money money, Redacted redacted, Redacted redacted2, InstrumentSelectionData instrumentSelectionData, boolean z, String str, String str2, AppCreationActivity appCreationActivity, String str3, Screen screen, boolean z2, long j, boolean z3, ClientScenario clientScenario, String str4, BlockersData.MoneybotContext moneybotContext, boolean z4, PersonalizationOrigin personalizationOrigin, AskedQuestion askedQuestion) {
            super(0);
            uuid.getClass();
            money.getClass();
            redacted.getClass();
            redacted2.getClass();
            appCreationActivity.getClass();
            screen.getClass();
            clientScenario.getClass();
            str4.getClass();
            personalizationOrigin.getClass();
            this.paymentToken = uuid;
            this.amount = money;
            this.recipients = redacted;
            this.note = redacted2;
            this.instrumentSelection = instrumentSelectionData;
            this.ignoreDuplicate = z;
            this.referrer = str;
            this.launchUrl = str2;
            this.appCreationActivity = appCreationActivity;
            this.exchangeRatesToken = str3;
            this.exitScreen = screen;
            this.creditCardLinkingEnabled = z2;
            this.creditCardFeeBps = j;
            this.cashBalanceEnabled = z3;
            this.clientScenario = clientScenario;
            this.flowToken = str4;
            this.moneybotContext = moneybotContext;
            this.forceHideTextOptions = z4;
            this.origin = personalizationOrigin;
            this.question = askedQuestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalizePayment)) {
                return false;
            }
            PersonalizePayment personalizePayment = (PersonalizePayment) obj;
            return Intrinsics.areEqual(this.paymentToken, personalizePayment.paymentToken) && Intrinsics.areEqual(this.amount, personalizePayment.amount) && Intrinsics.areEqual(this.recipients, personalizePayment.recipients) && Intrinsics.areEqual(this.note, personalizePayment.note) && Intrinsics.areEqual(this.instrumentSelection, personalizePayment.instrumentSelection) && this.ignoreDuplicate == personalizePayment.ignoreDuplicate && Intrinsics.areEqual(this.referrer, personalizePayment.referrer) && Intrinsics.areEqual(this.launchUrl, personalizePayment.launchUrl) && this.appCreationActivity == personalizePayment.appCreationActivity && Intrinsics.areEqual(this.exchangeRatesToken, personalizePayment.exchangeRatesToken) && Intrinsics.areEqual(this.exitScreen, personalizePayment.exitScreen) && this.creditCardLinkingEnabled == personalizePayment.creditCardLinkingEnabled && this.creditCardFeeBps == personalizePayment.creditCardFeeBps && this.cashBalanceEnabled == personalizePayment.cashBalanceEnabled && this.clientScenario == personalizePayment.clientScenario && Intrinsics.areEqual(this.flowToken, personalizePayment.flowToken) && Intrinsics.areEqual(this.moneybotContext, personalizePayment.moneybotContext) && this.forceHideTextOptions == personalizePayment.forceHideTextOptions && this.origin == personalizePayment.origin && Intrinsics.areEqual(this.question, personalizePayment.question);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = re$$ExternalSyntheticOutline0.m(this.note, re$$ExternalSyntheticOutline0.m(this.recipients, NavAction$$ExternalSyntheticOutline0.m(this.amount, this.paymentToken.hashCode() * 31, 31), 31), 31);
            InstrumentSelectionData instrumentSelectionData = this.instrumentSelection;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (instrumentSelectionData == null ? 0 : instrumentSelectionData.hashCode())) * 31, 31, this.ignoreDuplicate);
            String str = this.referrer;
            int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.launchUrl;
            int hashCode2 = (this.appCreationActivity.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.exchangeRatesToken;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.clientScenario.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.creditCardLinkingEnabled), 31, this.creditCardFeeBps), 31, this.cashBalanceEnabled)) * 31, 31, this.flowToken);
            BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
            int hashCode3 = (this.origin.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (moneybotContext == null ? 0 : moneybotContext.hashCode())) * 31, 31, this.forceHideTextOptions)) * 31;
            AskedQuestion askedQuestion = this.question;
            return hashCode3 + (askedQuestion != null ? askedQuestion.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PersonalizePayment(paymentToken=");
            sb.append(this.paymentToken);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", recipients=");
            sb.append(this.recipients);
            sb.append(", note=");
            sb.append(this.note);
            sb.append(", instrumentSelection=");
            sb.append(this.instrumentSelection);
            sb.append(", ignoreDuplicate=");
            sb.append(this.ignoreDuplicate);
            sb.append(", referrer=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.referrer, ", launchUrl=", this.launchUrl, ", appCreationActivity=");
            sb.append(this.appCreationActivity);
            sb.append(", exchangeRatesToken=");
            sb.append(this.exchangeRatesToken);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", creditCardLinkingEnabled=");
            sb.append(this.creditCardLinkingEnabled);
            sb.append(", creditCardFeeBps=");
            sb.append(this.creditCardFeeBps);
            sb.append(", cashBalanceEnabled=");
            sb.append(this.cashBalanceEnabled);
            sb.append(", clientScenario=");
            sb.append(this.clientScenario);
            sb.append(", flowToken=");
            sb.append(this.flowToken);
            sb.append(", moneybotContext=");
            sb.append(this.moneybotContext);
            sb.append(", forceHideTextOptions=");
            sb.append(this.forceHideTextOptions);
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", question=");
            sb.append(this.question);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.paymentToken);
            parcel.writeParcelable(this.amount, i);
            parcel.writeParcelable(this.recipients, i);
            parcel.writeParcelable(this.note, i);
            InstrumentSelectionData instrumentSelectionData = this.instrumentSelection;
            if (instrumentSelectionData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                instrumentSelectionData.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.ignoreDuplicate ? 1 : 0);
            parcel.writeString(this.referrer);
            parcel.writeString(this.launchUrl);
            parcel.writeString(this.appCreationActivity.name());
            parcel.writeString(this.exchangeRatesToken);
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeInt(this.creditCardLinkingEnabled ? 1 : 0);
            parcel.writeLong(this.creditCardFeeBps);
            parcel.writeInt(this.cashBalanceEnabled ? 1 : 0);
            parcel.writeString(this.clientScenario.name());
            parcel.writeString(this.flowToken);
            parcel.writeParcelable(this.moneybotContext, i);
            parcel.writeInt(this.forceHideTextOptions ? 1 : 0);
            parcel.writeString(this.origin.name());
            parcel.writeParcelable(this.question, i);
        }

        public /* synthetic */ PersonalizePayment(UUID uuid, Money money, RedactedParcelableList redactedParcelableList, RedactedString redactedString, InstrumentSelectionData instrumentSelectionData, boolean z, String str, String str2, AppCreationActivity appCreationActivity, String str3, Screen screen, boolean z2, long j, boolean z3, ClientScenario clientScenario, String str4, BlockersData.MoneybotContext moneybotContext, boolean z4, PersonalizationOrigin personalizationOrigin, int i) {
            this(uuid, money, redactedParcelableList, redactedString, instrumentSelectionData, z, str, str2, appCreationActivity, str3, screen, z2, j, z3, clientScenario, str4, moneybotContext, (i & PKIFailureInfo.unsupportedVersion) != 0 ? false : z4, (i & PKIFailureInfo.transactionIdInUse) != 0 ? PersonalizationOrigin.BUTTON : personalizationOrigin, (AskedQuestion) null);
        }
    }

    public final class MainPayment extends PaymentScreens implements PaymentSessionScreen {
        public static final Parcelable.Creator<MainPayment> CREATOR = new NearbyPayer.Creator(26);
        public final Money amountInProfileCurrency;
        public final Money amountInSelectedCurrency;
        public final AppCreationActivity appCreationActivity;
        public final CryptoPaymentOrigin cryptoPaymentOrigin;
        public final String depositReversalToken;
        public final String exchangeRatesToken;
        public final Screen exitScreen;
        public final InstrumentSelection instrumentSelection;
        public final CashInstrumentType instrumentType;
        public final boolean isFiatPayment;
        public final boolean isFiatPaymentPadEntryPoint;
        public final String launchUrl;
        public final String note;
        public final Orientation orientation;
        public final UUID paymentToken;
        public final List recipients;
        public final String referrer;
        public final SendCryptoCurrencyType sendCryptoCurrencyType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class SendCryptoCurrencyType {
            public static final /* synthetic */ SendCryptoCurrencyType[] $VALUES;
            public static final SendCryptoCurrencyType BTC;
            public static final SendCryptoCurrencyType USDC;

            static {
                SendCryptoCurrencyType sendCryptoCurrencyType = new SendCryptoCurrencyType("BTC", 0);
                BTC = sendCryptoCurrencyType;
                SendCryptoCurrencyType sendCryptoCurrencyType2 = new SendCryptoCurrencyType("USDC", 1);
                USDC = sendCryptoCurrencyType2;
                $VALUES = new SendCryptoCurrencyType[]{sendCryptoCurrencyType, sendCryptoCurrencyType2};
            }

            public static SendCryptoCurrencyType valueOf(String str) {
                return (SendCryptoCurrencyType) Enum.valueOf(SendCryptoCurrencyType.class, str);
            }

            public static SendCryptoCurrencyType[] values() {
                return (SendCryptoCurrencyType[]) $VALUES.clone();
            }
        }

        /* loaded from: classes6.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SendCryptoCurrencyType.values().length];
                try {
                    SendCryptoCurrencyType sendCryptoCurrencyType = SendCryptoCurrencyType.BTC;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SendCryptoCurrencyType sendCryptoCurrencyType2 = SendCryptoCurrencyType.BTC;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainPayment(Money money, Orientation orientation, AppCreationActivity appCreationActivity, String str, CashInstrumentType cashInstrumentType, String str2, String str3, List list, InstrumentSelection instrumentSelection, UUID uuid, String str4, Money money2, SendCryptoCurrencyType sendCryptoCurrencyType, CryptoPaymentOrigin cryptoPaymentOrigin, String str5, Screen screen, boolean z) {
            super(0);
            money.getClass();
            orientation.getClass();
            appCreationActivity.getClass();
            str.getClass();
            list.getClass();
            uuid.getClass();
            money2.getClass();
            boolean z2 = false;
            this.amountInProfileCurrency = money;
            this.orientation = orientation;
            this.appCreationActivity = appCreationActivity;
            this.note = str;
            this.instrumentType = cashInstrumentType;
            this.referrer = str2;
            this.launchUrl = str3;
            this.recipients = list;
            this.instrumentSelection = instrumentSelection;
            this.paymentToken = uuid;
            this.exchangeRatesToken = str4;
            this.amountInSelectedCurrency = money2;
            this.sendCryptoCurrencyType = sendCryptoCurrencyType;
            this.cryptoPaymentOrigin = cryptoPaymentOrigin;
            this.depositReversalToken = str5;
            this.exitScreen = screen;
            this.isFiatPaymentPadEntryPoint = z;
            int i = sendCryptoCurrencyType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sendCryptoCurrencyType.ordinal()];
            if (i == -1) {
                z2 = true;
            } else if (i != 1 && i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            this.isFiatPayment = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainPayment)) {
                return false;
            }
            MainPayment mainPayment = (MainPayment) obj;
            return Intrinsics.areEqual(this.amountInProfileCurrency, mainPayment.amountInProfileCurrency) && this.orientation == mainPayment.orientation && this.appCreationActivity == mainPayment.appCreationActivity && Intrinsics.areEqual(this.note, mainPayment.note) && this.instrumentType == mainPayment.instrumentType && Intrinsics.areEqual(this.referrer, mainPayment.referrer) && Intrinsics.areEqual(this.launchUrl, mainPayment.launchUrl) && Intrinsics.areEqual(this.recipients, mainPayment.recipients) && Intrinsics.areEqual(this.instrumentSelection, mainPayment.instrumentSelection) && Intrinsics.areEqual(this.paymentToken, mainPayment.paymentToken) && Intrinsics.areEqual(this.exchangeRatesToken, mainPayment.exchangeRatesToken) && Intrinsics.areEqual(this.amountInSelectedCurrency, mainPayment.amountInSelectedCurrency) && this.sendCryptoCurrencyType == mainPayment.sendCryptoCurrencyType && this.cryptoPaymentOrigin == mainPayment.cryptoPaymentOrigin && Intrinsics.areEqual(this.depositReversalToken, mainPayment.depositReversalToken) && Intrinsics.areEqual(this.exitScreen, mainPayment.exitScreen) && this.isFiatPaymentPadEntryPoint == mainPayment.isFiatPaymentPadEntryPoint;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.appCreationActivity.hashCode() + ((this.orientation.hashCode() + (this.amountInProfileCurrency.hashCode() * 31)) * 31)) * 31, 31, this.note);
            CashInstrumentType cashInstrumentType = this.instrumentType;
            int hashCode = (m + (cashInstrumentType == null ? 0 : cashInstrumentType.hashCode())) * 31;
            String str = this.referrer;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.launchUrl;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.recipients);
            InstrumentSelection instrumentSelection = this.instrumentSelection;
            int hashCode3 = (this.paymentToken.hashCode() + ((m2 + (instrumentSelection == null ? 0 : instrumentSelection.hashCode())) * 31)) * 31;
            String str3 = this.exchangeRatesToken;
            int m3 = NavAction$$ExternalSyntheticOutline0.m(this.amountInSelectedCurrency, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            SendCryptoCurrencyType sendCryptoCurrencyType = this.sendCryptoCurrencyType;
            int hashCode4 = (m3 + (sendCryptoCurrencyType == null ? 0 : sendCryptoCurrencyType.hashCode())) * 31;
            CryptoPaymentOrigin cryptoPaymentOrigin = this.cryptoPaymentOrigin;
            int hashCode5 = (hashCode4 + (cryptoPaymentOrigin == null ? 0 : cryptoPaymentOrigin.hashCode())) * 31;
            String str4 = this.depositReversalToken;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Screen screen = this.exitScreen;
            return Boolean.hashCode(this.isFiatPaymentPadEntryPoint) + ((hashCode6 + (screen != null ? screen.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainPayment(amountInProfileCurrency=");
            sb.append(this.amountInProfileCurrency);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", appCreationActivity=");
            sb.append(this.appCreationActivity);
            sb.append(", note=");
            sb.append(this.note);
            sb.append(", instrumentType=");
            sb.append(this.instrumentType);
            sb.append(", referrer=");
            sb.append(this.referrer);
            sb.append(", launchUrl=");
            NavAction$$ExternalSyntheticOutline0.m(this.launchUrl, ", recipients=", ", instrumentSelection=", sb, this.recipients);
            sb.append(this.instrumentSelection);
            sb.append(", paymentToken=");
            sb.append(this.paymentToken);
            sb.append(", exchangeRatesToken=");
            sb.append(this.exchangeRatesToken);
            sb.append(", amountInSelectedCurrency=");
            sb.append(this.amountInSelectedCurrency);
            sb.append(", sendCryptoCurrencyType=");
            sb.append(this.sendCryptoCurrencyType);
            sb.append(", cryptoPaymentOrigin=");
            sb.append(this.cryptoPaymentOrigin);
            sb.append(", depositReversalToken=");
            sb.append(this.depositReversalToken);
            sb.append(", exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", isFiatPaymentPadEntryPoint=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isFiatPaymentPadEntryPoint, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amountInProfileCurrency, i);
            parcel.writeString(this.orientation.name());
            parcel.writeString(this.appCreationActivity.name());
            parcel.writeString(this.note);
            CashInstrumentType cashInstrumentType = this.instrumentType;
            if (cashInstrumentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cashInstrumentType.name());
            }
            parcel.writeString(this.referrer);
            parcel.writeString(this.launchUrl);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.recipients, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.instrumentSelection, i);
            parcel.writeSerializable(this.paymentToken);
            parcel.writeString(this.exchangeRatesToken);
            parcel.writeParcelable(this.amountInSelectedCurrency, i);
            SendCryptoCurrencyType sendCryptoCurrencyType = this.sendCryptoCurrencyType;
            if (sendCryptoCurrencyType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sendCryptoCurrencyType.name());
            }
            CryptoPaymentOrigin cryptoPaymentOrigin = this.cryptoPaymentOrigin;
            if (cryptoPaymentOrigin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cryptoPaymentOrigin.name());
            }
            parcel.writeString(this.depositReversalToken);
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeInt(this.isFiatPaymentPadEntryPoint ? 1 : 0);
        }

        public MainPayment(Money money, Orientation orientation, AppCreationActivity appCreationActivity, UUID uuid, SendCryptoCurrencyType sendCryptoCurrencyType, CryptoPaymentOrigin cryptoPaymentOrigin, String str, Screen screen, int i) {
            this(money, orientation, appCreationActivity, "", null, null, null, EmptyList.INSTANCE, null, uuid, null, money, (i & 4096) != 0 ? null : sendCryptoCurrencyType, (i & PKIFailureInfo.certRevoked) != 0 ? null : cryptoPaymentOrigin, (i & 16384) != 0 ? null : str, (32768 & i) != 0 ? null : screen, (i & 65536) == 0);
        }
    }
}
