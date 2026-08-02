package com.squareup.cash.invitations;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.versioned.Versioned;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class InviteContactsViewModel {
    public final ImmutableList all_contacts;
    public final String contactRequestButtonText;
    public final String contactRequestText;
    public final String formattedText;
    public final InviteContactsHeaderViewModel headerViewModel;
    public final Versioned invitationSuccessToastViewModel;
    public final Versioned inviteConsentBottomSheetModel;
    public final String inviteContactButtonText;
    public final boolean isSearchFocused;
    public final PromotionUpsellViewModel promotionUpsellViewModel;
    public final ImmutableList recommended_contacts;
    public final String searchPlaceholder;
    public final String sendInviteButtonText;
    public final String shareReferralLinkButtonText;
    public final InviteErrorDialogKt state;

    public final class Contact {
        public final String description;
        public final InviteContactsViewEvent onInvite;
        public final ImmutableList recipients;
        public final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status CASH_CUSTOMER;
            public static final Status INVITED;
            public static final Status NOT_INVITED;

            static {
                Status status = new Status("NOT_INVITED", 0);
                NOT_INVITED = status;
                Status status2 = new Status("INVITED", 1);
                INVITED = status2;
                Status status3 = new Status("CASH_CUSTOMER", 2);
                CASH_CUSTOMER = status3;
                $VALUES = new Status[]{status, status2, status3};
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Contact(ImmutableList immutableList, Status status, String str, InviteContactsViewEvent inviteContactsViewEvent) {
            immutableList.getClass();
            status.getClass();
            str.getClass();
            this.recipients = immutableList;
            this.status = status;
            this.description = str;
            this.onInvite = inviteContactsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            return Intrinsics.areEqual(this.recipients, contact.recipients) && this.status == contact.status && Intrinsics.areEqual(this.description, contact.description) && this.onInvite.equals(contact.onInvite);
        }

        public final String getDisplayName() {
            return ((Recipient) CollectionsKt.first((List) this.recipients)).displayName;
        }

        public final int hashCode() {
            return this.onInvite.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.status.hashCode() + (this.recipients.hashCode() * 31)) * 31, 31, this.description);
        }

        public final String toString() {
            return "Contact(recipients=" + this.recipients + ", status=" + this.status + ", description=" + this.description + ", onInvite=" + this.onInvite + ")";
        }
    }

    public final class InviteConsentBottomSheetViewModel {
        public final RedactedParcelableList aliases;
        public final String buttonLabel;
        public final String description;
        public final RedactedString phoneNumber;
        public final InviteContactsViewEvent.SendInvite.ContactSection section;
        public final String title;

        public InviteConsentBottomSheetViewModel(String str, String str2, String str3, RedactedParcelableList redactedParcelableList, InviteContactsViewEvent.SendInvite.ContactSection contactSection, RedactedString redactedString) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.description = str2;
            this.buttonLabel = str3;
            this.aliases = redactedParcelableList;
            this.section = contactSection;
            this.phoneNumber = redactedString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteConsentBottomSheetViewModel)) {
                return false;
            }
            InviteConsentBottomSheetViewModel inviteConsentBottomSheetViewModel = (InviteConsentBottomSheetViewModel) obj;
            return Intrinsics.areEqual(this.title, inviteConsentBottomSheetViewModel.title) && this.description.equals(inviteConsentBottomSheetViewModel.description) && Intrinsics.areEqual(this.buttonLabel, inviteConsentBottomSheetViewModel.buttonLabel) && this.aliases.equals(inviteConsentBottomSheetViewModel.aliases) && this.section == inviteConsentBottomSheetViewModel.section && this.phoneNumber.equals(inviteConsentBottomSheetViewModel.phoneNumber);
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode() + ((this.section.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.buttonLabel), 31, this.aliases.value)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteConsentBottomSheetViewModel(title=", this.title, ", description=", this.description, ", buttonLabel=");
            m.append(this.buttonLabel);
            m.append(", aliases=");
            m.append(this.aliases);
            m.append(", section=");
            m.append(this.section);
            m.append(", phoneNumber=");
            m.append(this.phoneNumber);
            m.append(")");
            return m.toString();
        }
    }

    public final class PromotionUpsellViewModel {
        public final String body;
        public final String cta;
        public final String ctaClientRoute;
        public final PromotionIllustration promotionIllustration;
        public final String title;

        public final class PromotionIllustration {
            public final Integer imageHeight;
            public final String imageUrlDark;
            public final String imageUrlLight;
            public final Integer imageWidth;

            public PromotionIllustration(String str, String str2, Integer num, Integer num2) {
                this.imageUrlLight = str;
                this.imageUrlDark = str2;
                this.imageHeight = num;
                this.imageWidth = num2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PromotionIllustration)) {
                    return false;
                }
                PromotionIllustration promotionIllustration = (PromotionIllustration) obj;
                return Intrinsics.areEqual(this.imageUrlLight, promotionIllustration.imageUrlLight) && Intrinsics.areEqual(this.imageUrlDark, promotionIllustration.imageUrlDark) && Intrinsics.areEqual(this.imageHeight, promotionIllustration.imageHeight) && Intrinsics.areEqual(this.imageWidth, promotionIllustration.imageWidth);
            }

            public final int hashCode() {
                String str = this.imageUrlLight;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.imageUrlDark;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.imageHeight;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.imageWidth;
                return hashCode3 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromotionIllustration(imageUrlLight=", this.imageUrlLight, ", imageUrlDark=", this.imageUrlDark, ", imageHeight=");
                m.append(this.imageHeight);
                m.append(", imageWidth=");
                m.append(this.imageWidth);
                m.append(")");
                return m.toString();
            }
        }

        public PromotionUpsellViewModel(String str, String str2, String str3, String str4, PromotionIllustration promotionIllustration) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
            this.cta = str3;
            this.ctaClientRoute = str4;
            this.promotionIllustration = promotionIllustration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionUpsellViewModel)) {
                return false;
            }
            PromotionUpsellViewModel promotionUpsellViewModel = (PromotionUpsellViewModel) obj;
            return Intrinsics.areEqual(this.title, promotionUpsellViewModel.title) && Intrinsics.areEqual(this.body, promotionUpsellViewModel.body) && Intrinsics.areEqual(this.cta, promotionUpsellViewModel.cta) && Intrinsics.areEqual(this.ctaClientRoute, promotionUpsellViewModel.ctaClientRoute) && this.promotionIllustration.equals(promotionUpsellViewModel.promotionIllustration);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            String str = this.cta;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ctaClientRoute;
            return this.promotionIllustration.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromotionUpsellViewModel(title=", this.title, ", body=", this.body, ", cta=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.cta, ", ctaClientRoute=", this.ctaClientRoute, ", promotionIllustration=");
            m.append(this.promotionIllustration);
            m.append(")");
            return m.toString();
        }
    }

    public final class RecommendedContact {
        public final Contact contact;
        public final String hashedAliasId;

        public RecommendedContact(String str, Contact contact) {
            this.hashedAliasId = str;
            this.contact = contact;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendedContact)) {
                return false;
            }
            RecommendedContact recommendedContact = (RecommendedContact) obj;
            return Intrinsics.areEqual(this.hashedAliasId, recommendedContact.hashedAliasId) && this.contact.equals(recommendedContact.contact);
        }

        public final int hashCode() {
            String str = this.hashedAliasId;
            return this.contact.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "RecommendedContact(hashedAliasId=" + this.hashedAliasId + ", contact=" + this.contact + ")";
        }
    }

    public final class RecommendedContacts {
        public final int allContactsCount;
        public final int filteredRecommendedContactsCount;
        public final List recommendations;
        public final int recommendedCashCustomersIdsCount;
        public final int recommendedEmailIdsCount;
        public final int unmappedRecommendedIdsCount;

        public RecommendedContacts(List list, int i, int i2, int i3, int i4, int i5) {
            list.getClass();
            this.recommendations = list;
            this.allContactsCount = i;
            this.recommendedCashCustomersIdsCount = i2;
            this.recommendedEmailIdsCount = i3;
            this.unmappedRecommendedIdsCount = i4;
            this.filteredRecommendedContactsCount = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendedContacts)) {
                return false;
            }
            RecommendedContacts recommendedContacts = (RecommendedContacts) obj;
            return Intrinsics.areEqual(this.recommendations, recommendedContacts.recommendations) && this.allContactsCount == recommendedContacts.allContactsCount && this.recommendedCashCustomersIdsCount == recommendedContacts.recommendedCashCustomersIdsCount && this.recommendedEmailIdsCount == recommendedContacts.recommendedEmailIdsCount && this.unmappedRecommendedIdsCount == recommendedContacts.unmappedRecommendedIdsCount && this.filteredRecommendedContactsCount == recommendedContacts.filteredRecommendedContactsCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.filteredRecommendedContactsCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.unmappedRecommendedIdsCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recommendedEmailIdsCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recommendedCashCustomersIdsCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.allContactsCount, this.recommendations.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendedContacts(recommendations=");
            sb.append(this.recommendations);
            sb.append(", allContactsCount=");
            sb.append(this.allContactsCount);
            sb.append(", recommendedCashCustomersIdsCount=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.recommendedCashCustomersIdsCount, this.recommendedEmailIdsCount, ", recommendedEmailIdsCount=", ", unmappedRecommendedIdsCount=", sb);
            return Recorder$$ExternalSyntheticOutline1.m(this.unmappedRecommendedIdsCount, this.filteredRecommendedContactsCount, ", filteredRecommendedContactsCount=", ")", sb);
        }
    }

    public InviteContactsViewModel(String str, String str2, String str3, String str4, String str5, ImmutableList immutableList, ImmutableList immutableList2, InviteErrorDialogKt inviteErrorDialogKt, String str6, String str7, InviteContactsHeaderViewModel inviteContactsHeaderViewModel, Versioned versioned, Versioned versioned2, PromotionUpsellViewModel promotionUpsellViewModel, boolean z) {
        immutableList.getClass();
        immutableList2.getClass();
        inviteErrorDialogKt.getClass();
        str7.getClass();
        inviteContactsHeaderViewModel.getClass();
        versioned.getClass();
        versioned2.getClass();
        this.inviteContactButtonText = str;
        this.sendInviteButtonText = str2;
        this.shareReferralLinkButtonText = str3;
        this.contactRequestText = str4;
        this.contactRequestButtonText = str5;
        this.all_contacts = immutableList;
        this.recommended_contacts = immutableList2;
        this.state = inviteErrorDialogKt;
        this.formattedText = str6;
        this.searchPlaceholder = str7;
        this.headerViewModel = inviteContactsHeaderViewModel;
        this.invitationSuccessToastViewModel = versioned;
        this.inviteConsentBottomSheetModel = versioned2;
        this.promotionUpsellViewModel = promotionUpsellViewModel;
        this.isSearchFocused = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteContactsViewModel)) {
            return false;
        }
        InviteContactsViewModel inviteContactsViewModel = (InviteContactsViewModel) obj;
        return Intrinsics.areEqual(this.inviteContactButtonText, inviteContactsViewModel.inviteContactButtonText) && Intrinsics.areEqual(this.sendInviteButtonText, inviteContactsViewModel.sendInviteButtonText) && Intrinsics.areEqual(this.shareReferralLinkButtonText, inviteContactsViewModel.shareReferralLinkButtonText) && Intrinsics.areEqual(this.contactRequestText, inviteContactsViewModel.contactRequestText) && Intrinsics.areEqual(this.contactRequestButtonText, inviteContactsViewModel.contactRequestButtonText) && Intrinsics.areEqual(this.all_contacts, inviteContactsViewModel.all_contacts) && Intrinsics.areEqual(this.recommended_contacts, inviteContactsViewModel.recommended_contacts) && Intrinsics.areEqual(this.state, inviteContactsViewModel.state) && Intrinsics.areEqual(this.formattedText, inviteContactsViewModel.formattedText) && Intrinsics.areEqual(this.searchPlaceholder, inviteContactsViewModel.searchPlaceholder) && Intrinsics.areEqual(this.headerViewModel, inviteContactsViewModel.headerViewModel) && Intrinsics.areEqual(this.invitationSuccessToastViewModel, inviteContactsViewModel.invitationSuccessToastViewModel) && Intrinsics.areEqual(this.inviteConsentBottomSheetModel, inviteContactsViewModel.inviteConsentBottomSheetModel) && Intrinsics.areEqual(this.promotionUpsellViewModel, inviteContactsViewModel.promotionUpsellViewModel) && this.isSearchFocused == inviteContactsViewModel.isSearchFocused;
    }

    public final int hashCode() {
        String str = this.inviteContactButtonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sendInviteButtonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareReferralLinkButtonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactRequestText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contactRequestButtonText;
        int hashCode5 = (this.state.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.recommended_contacts, BalanceFeedKt$$ExternalSyntheticOutline0.m(this.all_contacts, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31)) * 31;
        String str6 = this.formattedText;
        int hashCode6 = (this.inviteConsentBottomSheetModel.hashCode() + ((this.invitationSuccessToastViewModel.hashCode() + ((this.headerViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.searchPlaceholder)) * 31)) * 31)) * 31;
        PromotionUpsellViewModel promotionUpsellViewModel = this.promotionUpsellViewModel;
        return Boolean.hashCode(this.isSearchFocused) + ((hashCode6 + (promotionUpsellViewModel != null ? promotionUpsellViewModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteContactsViewModel(inviteContactButtonText=", this.inviteContactButtonText, ", sendInviteButtonText=", this.sendInviteButtonText, ", shareReferralLinkButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.shareReferralLinkButtonText, ", contactRequestText=", this.contactRequestText, ", contactRequestButtonText=");
        m.append(this.contactRequestButtonText);
        m.append(", all_contacts=");
        m.append(this.all_contacts);
        m.append(", recommended_contacts=");
        m.append(this.recommended_contacts);
        m.append(", state=");
        m.append(this.state);
        m.append(", formattedText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.formattedText, ", searchPlaceholder=", this.searchPlaceholder, ", headerViewModel=");
        m.append(this.headerViewModel);
        m.append(", invitationSuccessToastViewModel=");
        m.append(this.invitationSuccessToastViewModel);
        m.append(", inviteConsentBottomSheetModel=");
        m.append(this.inviteConsentBottomSheetModel);
        m.append(", promotionUpsellViewModel=");
        m.append(this.promotionUpsellViewModel);
        m.append(", isSearchFocused=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSearchFocused, ")");
    }
}
