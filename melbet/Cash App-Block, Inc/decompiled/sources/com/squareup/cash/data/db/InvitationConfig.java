package com.squareup.cash.data.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvitationConfig {
    public final String activity_button_text;
    public final Money bounty_amount;
    public final boolean enabled;
    public final String header;
    public final String header_link_display_text;
    public final boolean invite_all_enabled;
    public final String message_template;
    public final String preview_message;
    public final List preview_message_by_country;
    public final String profile_button_text;
    public final String profile_row_subtitle;
    public final String profile_row_title;
    public final String reward_code;
    public final String reward_code_url;
    public final String share_text;
    public final String short_invite_friends_cta;
    public final String standalone_invite_friends_cta;
    public final Money welcome_amount;

    public InvitationConfig(boolean z, Money money, Money money2, String str, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str8, str9);
        list.getClass();
        this.enabled = z;
        this.bounty_amount = money;
        this.welcome_amount = money2;
        this.header = str;
        this.preview_message = str2;
        this.message_template = str3;
        this.invite_all_enabled = z2;
        this.reward_code = str4;
        this.reward_code_url = str5;
        this.share_text = str6;
        this.header_link_display_text = str7;
        this.profile_button_text = str8;
        this.activity_button_text = str9;
        this.preview_message_by_country = list;
        this.profile_row_title = str10;
        this.profile_row_subtitle = str11;
        this.standalone_invite_friends_cta = str12;
        this.short_invite_friends_cta = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationConfig)) {
            return false;
        }
        InvitationConfig invitationConfig = (InvitationConfig) obj;
        return this.enabled == invitationConfig.enabled && this.bounty_amount.equals(invitationConfig.bounty_amount) && this.welcome_amount.equals(invitationConfig.welcome_amount) && Intrinsics.areEqual(this.header, invitationConfig.header) && Intrinsics.areEqual(this.preview_message, invitationConfig.preview_message) && Intrinsics.areEqual(this.message_template, invitationConfig.message_template) && this.invite_all_enabled == invitationConfig.invite_all_enabled && Intrinsics.areEqual(this.reward_code, invitationConfig.reward_code) && Intrinsics.areEqual(this.reward_code_url, invitationConfig.reward_code_url) && Intrinsics.areEqual(this.share_text, invitationConfig.share_text) && Intrinsics.areEqual(this.header_link_display_text, invitationConfig.header_link_display_text) && Intrinsics.areEqual(this.profile_button_text, invitationConfig.profile_button_text) && Intrinsics.areEqual(this.activity_button_text, invitationConfig.activity_button_text) && Intrinsics.areEqual(this.preview_message_by_country, invitationConfig.preview_message_by_country) && Intrinsics.areEqual(this.profile_row_title, invitationConfig.profile_row_title) && Intrinsics.areEqual(this.profile_row_subtitle, invitationConfig.profile_row_subtitle) && Intrinsics.areEqual(this.standalone_invite_friends_cta, invitationConfig.standalone_invite_friends_cta) && Intrinsics.areEqual(this.short_invite_friends_cta, invitationConfig.short_invite_friends_cta);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.welcome_amount, NavAction$$ExternalSyntheticOutline0.m(this.bounty_amount, Boolean.hashCode(this.enabled) * 31, 31), 31), 31, this.header), 31, this.preview_message), 31, this.message_template), 31, this.invite_all_enabled);
        String str = this.reward_code;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reward_code_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.share_text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.header_link_display_text;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.profile_button_text), 31, this.activity_button_text), 31, this.preview_message_by_country);
        String str5 = this.profile_row_title;
        int hashCode4 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.profile_row_subtitle;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.standalone_invite_friends_cta;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.short_invite_friends_cta;
        return hashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvitationConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", bounty_amount=");
        sb.append(this.bounty_amount);
        sb.append(", welcome_amount=");
        sb.append(this.welcome_amount);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", preview_message=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.preview_message, ", message_template=", this.message_template, ", invite_all_enabled=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.invite_all_enabled, ", reward_code=", this.reward_code, ", reward_code_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.reward_code_url, ", share_text=", this.share_text, ", header_link_display_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.header_link_display_text, ", profile_button_text=", this.profile_button_text, ", activity_button_text=");
        NavAction$$ExternalSyntheticOutline0.m(this.activity_button_text, ", preview_message_by_country=", ", profile_row_title=", sb, this.preview_message_by_country);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.profile_row_title, ", profile_row_subtitle=", this.profile_row_subtitle, ", standalone_invite_friends_cta=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.standalone_invite_friends_cta, ", short_invite_friends_cta=", this.short_invite_friends_cta, ")");
    }
}
