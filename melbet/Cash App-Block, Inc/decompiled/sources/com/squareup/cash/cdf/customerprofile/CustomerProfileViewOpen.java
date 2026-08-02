package com.squareup.cash.cdf.customerprofile;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerProfileViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String account_holder_token;
    public final String app_message_token;
    public final ContactStatus contact_status;
    public final Context context;
    public final EntryPoint entry_point;
    public final String external_id;
    public final Boolean has_bio;
    public final Boolean has_business_badge;
    public final Boolean has_verified_badge;
    public final Boolean is_first_linked_account;
    public final Boolean is_multiple_account_holder;
    public final LinkedHashMap parameters;
    public final String profile_customer_token;
    public final String profile_directory_flow_token;
    public final String profile_elements_data;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Context {
        public static final /* synthetic */ Context[] $VALUES;
        public static final Context ACTIVITY;
        public static final Context BTC_PAYMENT_FLOW;
        public static final Context LAUNCHER;
        public static final Context PAYMENT_FLOW;
        public static final Context PROFILE_DIRECTORY;

        static {
            Context context = new Context("ACTIVITY", 0);
            ACTIVITY = context;
            Context context2 = new Context("PAYMENT_FLOW", 1);
            PAYMENT_FLOW = context2;
            Context context3 = new Context("BTC_PAYMENT_FLOW", 2);
            BTC_PAYMENT_FLOW = context3;
            Context context4 = new Context("PROFILE_DIRECTORY", 3);
            PROFILE_DIRECTORY = context4;
            Context context5 = new Context("GLOBAL_SEARCH", 4);
            Context context6 = new Context("LAUNCHER", 5);
            LAUNCHER = context6;
            $VALUES = new Context[]{context, context2, context3, context4, context5, context6, new Context("INVESTING_PAYMENT_FLOW", 6), new Context("GIFT_CARD", 7), new Context("THREAD", 8), new Context("BLOCK_CUSTOMER_FLOW", 9), new Context("BLOCK_CUSTOMER_FOR_DEPENDENT_FLOW", 10)};
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntryPoint {
        public static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint APP_MESSAGE;
        public static final EntryPoint C4B_EARNINGS_TRACKER;
        public static final EntryPoint CELL;
        public static final EntryPoint CELL_AVATAR;
        public static final EntryPoint LAUNCHER_SHORTCUT;
        public static final EntryPoint P2P_PAYMENT_SHEET;
        public static final EntryPoint QUICK_ACCESS_AVATAR;
        public static final EntryPoint QUICK_PAY_AVATAR;
        public static final EntryPoint SCAN_QR;
        public static final EntryPoint SHARE_DEEP_LINK;
        public static final EntryPoint VIEW_PROFILE_OVERFLOW_BUTTON;

        static {
            EntryPoint entryPoint = new EntryPoint("CELL_AVATAR", 0);
            CELL_AVATAR = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("CELL_AFFORDANCE", 1);
            EntryPoint entryPoint3 = new EntryPoint("RECEIPT_HEADER", 2);
            EntryPoint entryPoint4 = new EntryPoint("QUICK_ACCESS_AVATAR", 3);
            QUICK_ACCESS_AVATAR = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("VIEW_PROFILE_OVERFLOW_BUTTON", 4);
            VIEW_PROFILE_OVERFLOW_BUTTON = entryPoint5;
            EntryPoint entryPoint6 = new EntryPoint("CONFIRMATION_DIALOG", 5);
            EntryPoint entryPoint7 = new EntryPoint("LOYALTY_DEEP_LINK", 6);
            EntryPoint entryPoint8 = new EntryPoint("CELL", 7);
            CELL = entryPoint8;
            EntryPoint entryPoint9 = new EntryPoint("QUICK_PAY_AVATAR", 8);
            QUICK_PAY_AVATAR = entryPoint9;
            EntryPoint entryPoint10 = new EntryPoint("LAUNCHER_SHORTCUT", 9);
            LAUNCHER_SHORTCUT = entryPoint10;
            EntryPoint entryPoint11 = new EntryPoint("SCAN_QR", 10);
            SCAN_QR = entryPoint11;
            EntryPoint entryPoint12 = new EntryPoint("SHARE_DEEP_LINK", 11);
            SHARE_DEEP_LINK = entryPoint12;
            EntryPoint entryPoint13 = new EntryPoint("APP_MESSAGE", 12);
            APP_MESSAGE = entryPoint13;
            EntryPoint entryPoint14 = new EntryPoint("FAVORITES_CELL_AVATAR", 13);
            EntryPoint entryPoint15 = new EntryPoint("THREAD_HEADER", 14);
            EntryPoint entryPoint16 = new EntryPoint("BLOCKED_CUSTOMER_LIST", 15);
            EntryPoint entryPoint17 = new EntryPoint("SEARCH_CUSTOMER_TO_BLOCK_LIST", 16);
            EntryPoint entryPoint18 = new EntryPoint("C4B_EARNINGS_TRACKER", 17);
            C4B_EARNINGS_TRACKER = entryPoint18;
            EntryPoint entryPoint19 = new EntryPoint("P2P_PAYMENT_SHEET", 18);
            P2P_PAYMENT_SHEET = entryPoint19;
            $VALUES = new EntryPoint[]{entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5, entryPoint6, entryPoint7, entryPoint8, entryPoint9, entryPoint10, entryPoint11, entryPoint12, entryPoint13, entryPoint14, entryPoint15, entryPoint16, entryPoint17, entryPoint18, entryPoint19};
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public CustomerProfileViewOpen(ContactStatus contactStatus, Context context, EntryPoint entryPoint, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, Boolean bool4, Boolean bool5, String str6) {
        this.contact_status = contactStatus;
        this.context = context;
        this.entry_point = entryPoint;
        this.external_id = str;
        this.has_bio = bool;
        this.has_business_badge = bool2;
        this.has_verified_badge = bool3;
        this.profile_customer_token = str2;
        this.profile_directory_flow_token = str3;
        this.profile_elements_data = str4;
        this.app_message_token = str5;
        this.is_first_linked_account = bool4;
        this.is_multiple_account_holder = bool5;
        this.account_holder_token = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 22, "CustomerProfile", "cdf_action", "View");
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "context", context);
        Countries.putSafe(m, "entry_point", entryPoint);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "has_bio", bool);
        Countries.putSafe(m, "has_business_badge", bool2);
        Countries.putSafe(m, "has_verified_badge", bool3);
        Countries.putSafe(m, "profile_customer_token", str2);
        Countries.putSafe(m, "profile_directory_flow_token", str3);
        Countries.putSafe(m, "profile_elements_data", str4);
        Countries.putSafe(m, "app_message_token", str5);
        Countries.putSafe(m, "is_first_linked_account", bool4);
        Countries.putSafe(m, "is_multiple_account_holder", bool5);
        Countries.putSafe(m, "account_holder_token", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileViewOpen)) {
            return false;
        }
        CustomerProfileViewOpen customerProfileViewOpen = (CustomerProfileViewOpen) obj;
        return this.contact_status == customerProfileViewOpen.contact_status && this.context == customerProfileViewOpen.context && this.entry_point == customerProfileViewOpen.entry_point && Intrinsics.areEqual(this.external_id, customerProfileViewOpen.external_id) && this.has_bio.equals(customerProfileViewOpen.has_bio) && this.has_business_badge.equals(customerProfileViewOpen.has_business_badge) && this.has_verified_badge.equals(customerProfileViewOpen.has_verified_badge) && Intrinsics.areEqual(this.profile_customer_token, customerProfileViewOpen.profile_customer_token) && Intrinsics.areEqual(this.profile_directory_flow_token, customerProfileViewOpen.profile_directory_flow_token) && Intrinsics.areEqual(this.profile_elements_data, customerProfileViewOpen.profile_elements_data) && Intrinsics.areEqual(this.app_message_token, customerProfileViewOpen.app_message_token) && Intrinsics.areEqual(this.is_first_linked_account, customerProfileViewOpen.is_first_linked_account) && Intrinsics.areEqual(this.is_multiple_account_holder, customerProfileViewOpen.is_multiple_account_holder) && Intrinsics.areEqual(this.account_holder_token, customerProfileViewOpen.account_holder_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerProfile View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.contact_status.hashCode() * 31;
        Context context = this.context;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        EntryPoint entryPoint = this.entry_point;
        int hashCode3 = (hashCode2 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        String str = this.external_id;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_verified_badge, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_business_badge, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_bio, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.profile_customer_token;
        int hashCode4 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profile_directory_flow_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profile_elements_data;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 923521;
        String str5 = this.app_message_token;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 29791;
        Boolean bool = this.is_first_linked_account;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is_multiple_account_holder;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.account_holder_token;
        return (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerProfileViewOpen(contact_status=");
        sb.append(this.contact_status);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", has_bio=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_bio, ", has_business_badge=", this.has_business_badge, ", has_verified_badge=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_verified_badge, ", profile_customer_token=", this.profile_customer_token, ", profile_directory_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.profile_directory_flow_token, ", profile_elements_data=", this.profile_elements_data, ", paid_by_ppl_you_know=null, in_your_contacts=null, is_favorite=null, app_message_token=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.app_message_token, ", is_treehouse=null, is_secondary_account=null, is_first_linked_account=", this.is_first_linked_account, ", is_multiple_account_holder=");
        sb.append(this.is_multiple_account_holder);
        sb.append(", account_holder_token=");
        sb.append(this.account_holder_token);
        sb.append(", experience_type=null)");
        return sb.toString();
    }
}
