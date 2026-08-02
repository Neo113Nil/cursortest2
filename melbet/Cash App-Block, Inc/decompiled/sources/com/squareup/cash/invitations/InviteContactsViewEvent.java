package com.squareup.cash.invitations;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.vision.text.zza;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InviteContactsViewEvent {

    public final class Close extends InviteContactsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -11710915;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ConsentAccepted extends InviteContactsViewEvent {
        public final RedactedParcelableList alias;
        public final RedactedString phoneNumber;
        public final SendInvite.ContactSection section;

        public ConsentAccepted(RedactedString redactedString, RedactedParcelableList redactedParcelableList, SendInvite.ContactSection contactSection) {
            this.phoneNumber = redactedString;
            this.alias = redactedParcelableList;
            this.section = contactSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConsentAccepted)) {
                return false;
            }
            ConsentAccepted consentAccepted = (ConsentAccepted) obj;
            return this.phoneNumber.equals(consentAccepted.phoneNumber) && this.alias.equals(consentAccepted.alias) && this.section == consentAccepted.section;
        }

        public final int hashCode() {
            return this.section.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.phoneNumber.hashCode() * 31, 31, this.alias.value);
        }

        public final String toString() {
            return "ConsentAccepted(phoneNumber=" + this.phoneNumber + ", alias=" + this.alias + ", section=" + this.section + ")";
        }
    }

    public final class DismissBottomSheet extends InviteContactsViewEvent {
        public static final DismissBottomSheet INSTANCE = new DismissBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissBottomSheet);
        }

        public final int hashCode() {
            return 140589285;
        }

        public final String toString() {
            return "DismissBottomSheet";
        }
    }

    public final class RequestPermissions extends InviteContactsViewEvent {
        public static final RequestPermissions INSTANCE = new RequestPermissions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestPermissions);
        }

        public final int hashCode() {
            return 2050208336;
        }

        public final String toString() {
            return "RequestPermissions";
        }
    }

    public final class SearchFocusChanged extends InviteContactsViewEvent {
        public final boolean hasFocus;

        public SearchFocusChanged(boolean z) {
            this.hasFocus = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchFocusChanged) && this.hasFocus == ((SearchFocusChanged) obj).hasFocus;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasFocus);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("SearchFocusChanged(hasFocus=", ")", this.hasFocus);
        }
    }

    public final class Shared extends InviteContactsViewEvent {
        public static final Shared INSTANCE = new Shared();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Shared);
        }

        public final int hashCode() {
            return 90916032;
        }

        public final String toString() {
            return "Shared";
        }
    }

    public final class ShowConsent extends InviteContactsViewEvent {
        public final RedactedParcelableList alias;
        public final RedactedString entryMode;
        public final RedactedString phoneNumber;
        public final SendInvite.ContactSection section;
        public final AreaCodeStates state;

        public ShowConsent(RedactedString redactedString, AreaCodeStates areaCodeStates, RedactedParcelableList redactedParcelableList, RedactedString redactedString2, SendInvite.ContactSection contactSection) {
            this.phoneNumber = redactedString;
            this.state = areaCodeStates;
            this.alias = redactedParcelableList;
            this.entryMode = redactedString2;
            this.section = contactSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConsent)) {
                return false;
            }
            ShowConsent showConsent = (ShowConsent) obj;
            return this.phoneNumber.equals(showConsent.phoneNumber) && this.state == showConsent.state && this.alias.equals(showConsent.alias) && this.entryMode.equals(showConsent.entryMode) && this.section == showConsent.section;
        }

        public final int hashCode() {
            return this.section.hashCode() + ((this.entryMode.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.state.hashCode() + (this.phoneNumber.hashCode() * 31)) * 31, 31, this.alias.value)) * 31);
        }

        public final String toString() {
            return "ShowConsent(phoneNumber=" + this.phoneNumber + ", state=" + this.state + ", alias=" + this.alias + ", entryMode=" + this.entryMode + ", section=" + this.section + ")";
        }
    }

    public final class ShowReferralRules extends InviteContactsViewEvent {
        public static final ShowReferralRules INSTANCE = new ShowReferralRules();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowReferralRules);
        }

        public final int hashCode() {
            return 1531289634;
        }

        public final String toString() {
            return "ShowReferralRules";
        }
    }

    public final class TapPromotionUpSellCTA extends InviteContactsViewEvent {
        public final String clientRoute;

        public TapPromotionUpSellCTA(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapPromotionUpSellCTA) && Intrinsics.areEqual(this.clientRoute, ((TapPromotionUpSellCTA) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapPromotionUpSellCTA(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class TextChanged extends InviteContactsViewEvent {
        public final String newText;

        public TextChanged(String str) {
            str.getClass();
            this.newText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextChanged) && Intrinsics.areEqual(this.newText, ((TextChanged) obj).newText);
        }

        public final int hashCode() {
            return this.newText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextChanged(newText=", this.newText, ")");
        }
    }

    public final class SendInvite extends InviteContactsViewEvent {
        public final List alias;
        public final String entryMode;
        public final ContactSection section;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ContactSection {
            public static final /* synthetic */ ContactSection[] $VALUES;
            public static final ContactSection ALL_CONTACTS;
            public static final ContactSection NOT_IN_CONTACTS;
            public static final ContactSection RECOMMENDED;

            static {
                ContactSection contactSection = new ContactSection("RECOMMENDED", 0);
                RECOMMENDED = contactSection;
                ContactSection contactSection2 = new ContactSection("ALL_CONTACTS", 1);
                ALL_CONTACTS = contactSection2;
                ContactSection contactSection3 = new ContactSection("NOT_IN_CONTACTS", 2);
                NOT_IN_CONTACTS = contactSection3;
                $VALUES = new ContactSection[]{contactSection, contactSection2, contactSection3};
            }

            public static ContactSection valueOf(String str) {
                return (ContactSection) Enum.valueOf(ContactSection.class, str);
            }

            public static ContactSection[] values() {
                return (ContactSection[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SendInvite(String str, String str2, ContactSection contactSection, int i) {
            this(CollectionsKt__CollectionsJVMKt.listOf(r5), "type_ahead", contactSection);
            Recipient createEmailRecipient;
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            if (str != null && str2 != null) {
                a$$ExternalSyntheticBUOutline0.m$3("Expected only sms or email");
                throw null;
            }
            if (str != null) {
                Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                createEmailRecipient = zza.createPhoneRecipient(0L, "", str);
            } else {
                if (str2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected sms or email");
                    throw null;
                }
                Parcelable.Creator<Recipient> creator2 = Recipient.CREATOR;
                createEmailRecipient = zza.createEmailRecipient(0L, "", str2);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendInvite)) {
                return false;
            }
            SendInvite sendInvite = (SendInvite) obj;
            return Intrinsics.areEqual(this.alias, sendInvite.alias) && Intrinsics.areEqual(this.entryMode, sendInvite.entryMode) && this.section == sendInvite.section;
        }

        public final int hashCode() {
            return this.section.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.alias.hashCode() * 31, 31, this.entryMode);
        }

        public final String toString() {
            StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("SendInvite(alias=", ", entryMode=", this.entryMode, ", section=", this.alias);
            m.append(this.section);
            m.append(")");
            return m.toString();
        }

        public SendInvite(List list, String str, ContactSection contactSection) {
            list.getClass();
            this.alias = list;
            this.entryMode = str;
            this.section = contactSection;
        }
    }
}
