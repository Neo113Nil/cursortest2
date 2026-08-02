package com.squareup.cash.boost.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Slots {
    public final Long activation_date_time_ms;
    public final String affiliate_link_url;
    public final AppLinks app_links;
    public final UiRewardAvatars avatars;
    public final List boost_attributes;
    public final UiRewardProgramDetails.BottomUpsell boost_detail_bottom_upsell;
    public final List boost_detail_rows;
    public final String category;
    public final String discount_text;
    public final Boolean draggable;
    public final Long expiration_date_time_ms;
    public final String footer_text;
    public final String full_title_text;
    public final Boolean is_custom_offer;
    public final String main_text;
    public final String offerly_token;
    public final List program_detail_rows;
    public final Boolean redeemable_with_cash_app_pay;
    public final Boolean redeemable_with_cash_card;
    public final UiRewardSelectionState reward_selection_state;
    public final String selected_reward_token;
    public final RewardSlotState state;
    public final String title;
    public final String token;
    public final String user_agent;

    public Slots(RewardSlotState rewardSlotState, String str, String str2, String str3, UiRewardAvatars uiRewardAvatars, String str4, String str5, List list, String str6, List list2, List list3, String str7, Long l, Long l2, String str8, UiRewardSelectionState uiRewardSelectionState, Boolean bool, String str9, String str10, String str11, Boolean bool2, UiRewardProgramDetails.BottomUpsell bottomUpsell, Boolean bool3, Boolean bool4, AppLinks appLinks) {
        this.state = rewardSlotState;
        this.selected_reward_token = str;
        this.token = str2;
        this.category = str3;
        this.avatars = uiRewardAvatars;
        this.title = str4;
        this.main_text = str5;
        this.program_detail_rows = list;
        this.footer_text = str6;
        this.boost_detail_rows = list2;
        this.boost_attributes = list3;
        this.full_title_text = str7;
        this.expiration_date_time_ms = l;
        this.activation_date_time_ms = l2;
        this.discount_text = str8;
        this.reward_selection_state = uiRewardSelectionState;
        this.draggable = bool;
        this.affiliate_link_url = str9;
        this.user_agent = str10;
        this.offerly_token = str11;
        this.is_custom_offer = bool2;
        this.boost_detail_bottom_upsell = bottomUpsell;
        this.redeemable_with_cash_app_pay = bool3;
        this.redeemable_with_cash_card = bool4;
        this.app_links = appLinks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slots)) {
            return false;
        }
        Slots slots = (Slots) obj;
        return this.state == slots.state && Intrinsics.areEqual(this.selected_reward_token, slots.selected_reward_token) && Intrinsics.areEqual(this.token, slots.token) && Intrinsics.areEqual(this.category, slots.category) && Intrinsics.areEqual(this.avatars, slots.avatars) && Intrinsics.areEqual(this.title, slots.title) && Intrinsics.areEqual(this.main_text, slots.main_text) && Intrinsics.areEqual(this.program_detail_rows, slots.program_detail_rows) && Intrinsics.areEqual(this.footer_text, slots.footer_text) && Intrinsics.areEqual(this.boost_detail_rows, slots.boost_detail_rows) && Intrinsics.areEqual(this.boost_attributes, slots.boost_attributes) && Intrinsics.areEqual(this.full_title_text, slots.full_title_text) && Intrinsics.areEqual(this.expiration_date_time_ms, slots.expiration_date_time_ms) && Intrinsics.areEqual(this.activation_date_time_ms, slots.activation_date_time_ms) && Intrinsics.areEqual(this.discount_text, slots.discount_text) && Intrinsics.areEqual(this.reward_selection_state, slots.reward_selection_state) && Intrinsics.areEqual(this.draggable, slots.draggable) && Intrinsics.areEqual(this.affiliate_link_url, slots.affiliate_link_url) && Intrinsics.areEqual(this.user_agent, slots.user_agent) && Intrinsics.areEqual(this.offerly_token, slots.offerly_token) && Intrinsics.areEqual(this.is_custom_offer, slots.is_custom_offer) && Intrinsics.areEqual(this.boost_detail_bottom_upsell, slots.boost_detail_bottom_upsell) && Intrinsics.areEqual(this.redeemable_with_cash_app_pay, slots.redeemable_with_cash_app_pay) && Intrinsics.areEqual(this.redeemable_with_cash_card, slots.redeemable_with_cash_card) && Intrinsics.areEqual(this.app_links, slots.app_links);
    }

    public final String getSelected_reward_token() {
        return this.selected_reward_token;
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        String str = this.selected_reward_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UiRewardAvatars uiRewardAvatars = this.avatars;
        int hashCode5 = (hashCode4 + (uiRewardAvatars == null ? 0 : uiRewardAvatars.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.main_text;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.program_detail_rows;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.footer_text;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.boost_detail_rows;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.boost_attributes;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str7 = this.full_title_text;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.expiration_date_time_ms;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.activation_date_time_ms;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.discount_text;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UiRewardSelectionState uiRewardSelectionState = this.reward_selection_state;
        int hashCode16 = (hashCode15 + (uiRewardSelectionState == null ? 0 : uiRewardSelectionState.hashCode())) * 31;
        Boolean bool = this.draggable;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.affiliate_link_url;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.user_agent;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.offerly_token;
        int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.is_custom_offer;
        int hashCode21 = (hashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        UiRewardProgramDetails.BottomUpsell bottomUpsell = this.boost_detail_bottom_upsell;
        int hashCode22 = (hashCode21 + (bottomUpsell == null ? 0 : bottomUpsell.hashCode())) * 31;
        Boolean bool3 = this.redeemable_with_cash_app_pay;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.redeemable_with_cash_card;
        int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        AppLinks appLinks = this.app_links;
        return hashCode24 + (appLinks != null ? appLinks.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slots(state=");
        sb.append(this.state);
        sb.append(", selected_reward_token=");
        sb.append(this.selected_reward_token);
        sb.append(", token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.token, ", category=", this.category, ", avatars=");
        sb.append(this.avatars);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", main_text=");
        NavAction$$ExternalSyntheticOutline0.m(this.main_text, ", program_detail_rows=", ", footer_text=", sb, this.program_detail_rows);
        NavAction$$ExternalSyntheticOutline0.m(this.footer_text, ", boost_detail_rows=", ", boost_attributes=", sb, this.boost_detail_rows);
        Recorder$$ExternalSyntheticOutline2.m(", full_title_text=", this.full_title_text, ", expiration_date_time_ms=", sb, this.boost_attributes);
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.expiration_date_time_ms, ", activation_date_time_ms=", this.activation_date_time_ms, ", discount_text=");
        sb.append(this.discount_text);
        sb.append(", reward_selection_state=");
        sb.append(this.reward_selection_state);
        sb.append(", draggable=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.draggable, ", affiliate_link_url=", this.affiliate_link_url, ", user_agent=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.user_agent, ", offerly_token=", this.offerly_token, ", is_custom_offer=");
        sb.append(this.is_custom_offer);
        sb.append(", boost_detail_bottom_upsell=");
        sb.append(this.boost_detail_bottom_upsell);
        sb.append(", redeemable_with_cash_app_pay=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.redeemable_with_cash_app_pay, ", redeemable_with_cash_card=", this.redeemable_with_cash_card, ", app_links=");
        sb.append(this.app_links);
        sb.append(")");
        return sb.toString();
    }
}
