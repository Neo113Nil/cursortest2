package com.squareup.cash.profile.repo.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.cash.Cashtags;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CustomerProfileData {
    public final Color accentColor;
    public final BlockState blockState;
    public final String businessCategory;
    public final Boolean canAcceptPayments;
    public final String cashtag;
    public final Long creditCardFee;
    public final String customerId;
    public final String displayName;
    public final String email;
    public final String firstName;
    public final boolean isBusiness;
    public final boolean isCashCustomer;
    public final ContactsStatus isInContacts;
    public final boolean isMerchantCustomer;
    public final boolean isVerified;
    public final String lookupKey;
    public final String merchantCategory;
    public final Image photo;
    public final String rawDisplayName;
    public final Region region;
    public final boolean requiresConfirmation;
    public final Boolean shouldColorizeAvatar;
    public final String sms;

    public /* synthetic */ CustomerProfileData(String str, String str2, String str3, String str4, String str5, String str6, Image image, boolean z, ContactsStatus contactsStatus, boolean z2, boolean z3, Color color, Region region, Long l, BlockState blockState, boolean z4, String str7, Boolean bool, Boolean bool2, String str8, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, str6, (i & 64) != 0 ? null : image, (i & 128) != 0 ? false : z, (i & 256) != 0 ? ContactsStatus.NOT_IN_CONTACTS : contactsStatus, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : color, (i & 4096) != 0 ? null : region, (i & PKIFailureInfo.certRevoked) != 0 ? null : l, (i & 16384) != 0 ? null : blockState, (32768 & i) != 0 ? false : z4, false, (131072 & i) != 0 ? null : str7, (262144 & i) != 0 ? Boolean.FALSE : bool, (524288 & i) != 0 ? Boolean.TRUE : bool2, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str8);
    }

    public static CustomerProfileData copy$default(CustomerProfileData customerProfileData, ContactsStatus contactsStatus, boolean z) {
        String str = customerProfileData.customerId;
        String str2 = customerProfileData.lookupKey;
        String str3 = customerProfileData.rawDisplayName;
        String str4 = customerProfileData.cashtag;
        String str5 = customerProfileData.email;
        String str6 = customerProfileData.sms;
        Image image = customerProfileData.photo;
        boolean z2 = customerProfileData.isCashCustomer;
        boolean z3 = customerProfileData.isBusiness;
        boolean z4 = customerProfileData.isVerified;
        Color color = customerProfileData.accentColor;
        Region region = customerProfileData.region;
        Long l = customerProfileData.creditCardFee;
        BlockState blockState = customerProfileData.blockState;
        boolean z5 = customerProfileData.isMerchantCustomer;
        String str7 = customerProfileData.merchantCategory;
        Boolean bool = customerProfileData.shouldColorizeAvatar;
        Boolean bool2 = customerProfileData.canAcceptPayments;
        String str8 = customerProfileData.businessCategory;
        customerProfileData.getClass();
        contactsStatus.getClass();
        return new CustomerProfileData(str, str2, str3, str4, str5, str6, image, z2, contactsStatus, z3, z4, color, region, l, blockState, z5, z, str7, bool, bool2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileData)) {
            return false;
        }
        CustomerProfileData customerProfileData = (CustomerProfileData) obj;
        return Intrinsics.areEqual(this.customerId, customerProfileData.customerId) && Intrinsics.areEqual(this.lookupKey, customerProfileData.lookupKey) && Intrinsics.areEqual(this.rawDisplayName, customerProfileData.rawDisplayName) && Intrinsics.areEqual(this.cashtag, customerProfileData.cashtag) && Intrinsics.areEqual(this.email, customerProfileData.email) && Intrinsics.areEqual(this.sms, customerProfileData.sms) && Intrinsics.areEqual(this.photo, customerProfileData.photo) && this.isCashCustomer == customerProfileData.isCashCustomer && this.isInContacts == customerProfileData.isInContacts && this.isBusiness == customerProfileData.isBusiness && this.isVerified == customerProfileData.isVerified && Intrinsics.areEqual(this.accentColor, customerProfileData.accentColor) && this.region == customerProfileData.region && Intrinsics.areEqual(this.creditCardFee, customerProfileData.creditCardFee) && this.blockState == customerProfileData.blockState && this.isMerchantCustomer == customerProfileData.isMerchantCustomer && this.requiresConfirmation == customerProfileData.requiresConfirmation && Intrinsics.areEqual(this.merchantCategory, customerProfileData.merchantCategory) && Intrinsics.areEqual(this.shouldColorizeAvatar, customerProfileData.shouldColorizeAvatar) && Intrinsics.areEqual(this.canAcceptPayments, customerProfileData.canAcceptPayments) && Intrinsics.areEqual(this.businessCategory, customerProfileData.businessCategory);
    }

    public final int hashCode() {
        String str = this.customerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lookupKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rawDisplayName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cashtag;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sms;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.photo;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.isInContacts.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (image == null ? 0 : image.hashCode())) * 31, 31, this.isCashCustomer)) * 31, 31, this.isBusiness), 31, this.isVerified);
        Color color = this.accentColor;
        int hashCode7 = (m + (color == null ? 0 : color.hashCode())) * 31;
        Region region = this.region;
        int hashCode8 = (hashCode7 + (region == null ? 0 : region.hashCode())) * 31;
        Long l = this.creditCardFee;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        BlockState blockState = this.blockState;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode9 + (blockState == null ? 0 : blockState.hashCode())) * 31, 31, this.isMerchantCustomer), 31, this.requiresConfirmation);
        String str7 = this.merchantCategory;
        int hashCode10 = (m2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.shouldColorizeAvatar;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAcceptPayments;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.businessCategory;
        return hashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Recipient toRecipient() {
        Long l = this.creditCardFee;
        return new Recipient(this.lookupKey, false, false, this.customerId, null, this.cashtag, this.isCashCustomer, this.isVerified, this.isBusiness, this.email, this.sms, this.photo, null, null, false, l != null ? l.longValue() : 0L, this.blockState, null, false, null, this.accentColor, this.region, null, null, this.rawDisplayName, null, null, null, this.isInContacts == ContactsStatus.IN_CONTACTS, null, false, false, null, null, -288460778, 63);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerProfileData(customerId=", this.customerId, ", lookupKey=", this.lookupKey, ", rawDisplayName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.rawDisplayName, ", cashtag=", this.cashtag, ", email=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", sms=", this.sms, ", photo=");
        m.append(this.photo);
        m.append(", isCashCustomer=");
        m.append(this.isCashCustomer);
        m.append(", isInContacts=");
        m.append(this.isInContacts);
        m.append(", isBusiness=");
        m.append(this.isBusiness);
        m.append(", isVerified=");
        m.append(this.isVerified);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(", region=");
        m.append(this.region);
        m.append(", creditCardFee=");
        m.append(this.creditCardFee);
        m.append(", blockState=");
        m.append(this.blockState);
        m.append(", isMerchantCustomer=");
        m.append(this.isMerchantCustomer);
        m.append(", requiresConfirmation=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.requiresConfirmation, ", merchantCategory=", this.merchantCategory, ", shouldColorizeAvatar=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.shouldColorizeAvatar, ", canAcceptPayments=", this.canAcceptPayments, ", businessCategory=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.businessCategory, ")");
    }

    public CustomerProfileData(String str, String str2, String str3, String str4, String str5, String str6, Image image, boolean z, ContactsStatus contactsStatus, boolean z2, boolean z3, Color color, Region region, Long l, BlockState blockState, boolean z4, boolean z5, String str7, Boolean bool, Boolean bool2, String str8) {
        List split$default;
        String str9;
        contactsStatus.getClass();
        this.customerId = str;
        this.lookupKey = str2;
        this.rawDisplayName = str3;
        this.cashtag = str4;
        this.email = str5;
        this.sms = str6;
        this.photo = image;
        this.isCashCustomer = z;
        this.isInContacts = contactsStatus;
        this.isBusiness = z2;
        this.isVerified = z3;
        this.accentColor = color;
        this.region = region;
        this.creditCardFee = l;
        this.blockState = blockState;
        this.isMerchantCustomer = z4;
        this.requiresConfirmation = z5;
        this.merchantCategory = str7;
        this.shouldColorizeAvatar = bool;
        this.canAcceptPayments = bool2;
        this.businessCategory = str8;
        String fromString = Cashtags.fromString(str4, region);
        if (fromString == null) {
            fromString = null;
            String displayText = str6 != null ? AliasFormatter.getDisplayText(str6, UiAlias.Type.SMS, null) : null;
            if (displayText != null) {
                fromString = displayText;
            } else if (str5 != null) {
                fromString = AliasFormatter.getDisplayText(str5, UiAlias.Type.EMAIL, null);
            }
        }
        str3 = str3 == null ? fromString : str3;
        this.displayName = str3;
        this.firstName = (str3 == null || (split$default = StringsKt.split$default(str3, new char[]{' '}, 6)) == null || (str9 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str9;
    }
}
