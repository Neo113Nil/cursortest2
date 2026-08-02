package com.squareup.cash.boost.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RewardWithSelection {
    public final Long activation_date_time_ms;
    public final String affiliate_link_url;
    public final AppLinks app_links;
    public final UiRewardAvatars avatars;
    public final List boost_attributes;
    public final UiRewardProgramDetails.BottomUpsell boost_detail_bottom_upsell;
    public final List boost_detail_rows;
    public final String category;
    public final String discount_text;
    public final boolean draggable;
    public final Long expiration_date_time_ms;
    public final String footer_text;
    public final String full_title_text;
    public final boolean is_custom_offer;
    public final String main_text;
    public final String offerly_token;
    public final List program_detail_rows;
    public final boolean redeemable_with_cash_app_pay;
    public final boolean redeemable_with_cash_card;
    public final RewardSelection reward_selection;
    public final UiRewardSelectionState reward_selection_state;
    public final String title;
    public final String token;
    public final String user_agent;

    public RewardWithSelection(String str, String str2, UiRewardAvatars uiRewardAvatars, String str3, String str4, List list, String str5, List list2, List list3, String str6, Long l, Long l2, String str7, UiRewardSelectionState uiRewardSelectionState, boolean z, String str8, String str9, String str10, boolean z2, UiRewardProgramDetails.BottomUpsell bottomUpsell, boolean z3, boolean z4, AppLinks appLinks, RewardSelection rewardSelection) {
        this.token = str;
        this.category = str2;
        this.avatars = uiRewardAvatars;
        this.title = str3;
        this.main_text = str4;
        this.program_detail_rows = list;
        this.footer_text = str5;
        this.boost_detail_rows = list2;
        this.boost_attributes = list3;
        this.full_title_text = str6;
        this.expiration_date_time_ms = l;
        this.activation_date_time_ms = l2;
        this.discount_text = str7;
        this.reward_selection_state = uiRewardSelectionState;
        this.draggable = z;
        this.affiliate_link_url = str8;
        this.user_agent = str9;
        this.offerly_token = str10;
        this.is_custom_offer = z2;
        this.boost_detail_bottom_upsell = bottomUpsell;
        this.redeemable_with_cash_app_pay = z3;
        this.redeemable_with_cash_card = z4;
        this.app_links = appLinks;
        this.reward_selection = rewardSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardWithSelection)) {
            return false;
        }
        RewardWithSelection rewardWithSelection = (RewardWithSelection) obj;
        return this.token.equals(rewardWithSelection.token) && Intrinsics.areEqual(this.category, rewardWithSelection.category) && Intrinsics.areEqual(this.avatars, rewardWithSelection.avatars) && Intrinsics.areEqual(this.title, rewardWithSelection.title) && Intrinsics.areEqual(this.main_text, rewardWithSelection.main_text) && Intrinsics.areEqual(this.program_detail_rows, rewardWithSelection.program_detail_rows) && Intrinsics.areEqual(this.footer_text, rewardWithSelection.footer_text) && Intrinsics.areEqual(this.boost_detail_rows, rewardWithSelection.boost_detail_rows) && Intrinsics.areEqual(this.boost_attributes, rewardWithSelection.boost_attributes) && Intrinsics.areEqual(this.full_title_text, rewardWithSelection.full_title_text) && Intrinsics.areEqual(this.expiration_date_time_ms, rewardWithSelection.expiration_date_time_ms) && Intrinsics.areEqual(this.activation_date_time_ms, rewardWithSelection.activation_date_time_ms) && Intrinsics.areEqual(this.discount_text, rewardWithSelection.discount_text) && Intrinsics.areEqual(this.reward_selection_state, rewardWithSelection.reward_selection_state) && this.draggable == rewardWithSelection.draggable && Intrinsics.areEqual(this.affiliate_link_url, rewardWithSelection.affiliate_link_url) && Intrinsics.areEqual(this.user_agent, rewardWithSelection.user_agent) && Intrinsics.areEqual(this.offerly_token, rewardWithSelection.offerly_token) && this.is_custom_offer == rewardWithSelection.is_custom_offer && Intrinsics.areEqual(this.boost_detail_bottom_upsell, rewardWithSelection.boost_detail_bottom_upsell) && this.redeemable_with_cash_app_pay == rewardWithSelection.redeemable_with_cash_app_pay && this.redeemable_with_cash_card == rewardWithSelection.redeemable_with_cash_card && Intrinsics.areEqual(this.app_links, rewardWithSelection.app_links) && Intrinsics.areEqual(this.reward_selection, rewardWithSelection.reward_selection);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.category;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiRewardAvatars uiRewardAvatars = this.avatars;
        int hashCode3 = (hashCode2 + (uiRewardAvatars == null ? 0 : uiRewardAvatars.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.main_text;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.program_detail_rows;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.footer_text;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.boost_detail_rows;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.boost_attributes;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.full_title_text;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.expiration_date_time_ms;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.activation_date_time_ms;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.discount_text;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UiRewardSelectionState uiRewardSelectionState = this.reward_selection_state;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode13 + (uiRewardSelectionState == null ? 0 : uiRewardSelectionState.hashCode())) * 31, 31, this.draggable);
        String str7 = this.affiliate_link_url;
        int hashCode14 = (m + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.user_agent;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.offerly_token;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.is_custom_offer);
        UiRewardProgramDetails.BottomUpsell bottomUpsell = this.boost_detail_bottom_upsell;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (bottomUpsell == null ? 0 : bottomUpsell.hashCode())) * 31, 31, this.redeemable_with_cash_app_pay), 31, this.redeemable_with_cash_card);
        AppLinks appLinks = this.app_links;
        int hashCode16 = (m3 + (appLinks == null ? 0 : appLinks.hashCode())) * 31;
        RewardSelection rewardSelection = this.reward_selection;
        return hashCode16 + (rewardSelection != null ? rewardSelection.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RewardWithSelection(token=", this.token, ", category=", this.category, ", avatars=");
        m.append(this.avatars);
        m.append(", title=");
        m.append(this.title);
        m.append(", main_text=");
        NavAction$$ExternalSyntheticOutline0.m(this.main_text, ", program_detail_rows=", ", footer_text=", m, this.program_detail_rows);
        NavAction$$ExternalSyntheticOutline0.m(this.footer_text, ", boost_detail_rows=", ", boost_attributes=", m, this.boost_detail_rows);
        Recorder$$ExternalSyntheticOutline2.m(", full_title_text=", this.full_title_text, ", expiration_date_time_ms=", m, this.boost_attributes);
        Thread$State$EnumUnboxingLocalUtility.m(m, this.expiration_date_time_ms, ", activation_date_time_ms=", this.activation_date_time_ms, ", discount_text=");
        m.append(this.discount_text);
        m.append(", reward_selection_state=");
        m.append(this.reward_selection_state);
        m.append(", draggable=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.draggable, ", affiliate_link_url=", this.affiliate_link_url, ", user_agent=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.user_agent, ", offerly_token=", this.offerly_token, ", is_custom_offer=");
        m.append(this.is_custom_offer);
        m.append(", boost_detail_bottom_upsell=");
        m.append(this.boost_detail_bottom_upsell);
        m.append(", redeemable_with_cash_app_pay=");
        re$$ExternalSyntheticOutline0.m(m, this.redeemable_with_cash_app_pay, ", redeemable_with_cash_card=", this.redeemable_with_cash_card, ", app_links=");
        m.append(this.app_links);
        m.append(", reward_selection=");
        m.append(this.reward_selection);
        m.append(")");
        return m.toString();
    }
}
