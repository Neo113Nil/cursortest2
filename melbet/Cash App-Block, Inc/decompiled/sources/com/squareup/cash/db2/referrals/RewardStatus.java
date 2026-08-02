package com.squareup.cash.db2.referrals;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RewardStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RewardStatus {
    public final int available_reward_payments;
    public final String code_entry_client_route;
    public final boolean code_entry_enabled;
    public final int completed_reward_payments;
    public final RewardStatus.Expiration expiration;
    public final int id;
    public final int minimum_code_length;
    public final ProfileRow referral_status_screen;
    public final int reward_button_priority;
    public final String reward_button_text;
    public final String reward_header_text;
    public final String reward_main_text;
    public final Money reward_payment_amount;
    public final boolean reward_screen_enabled;

    public RewardStatus(int i, boolean z, int i2, boolean z2, String str, int i3, String str2, String str3, int i4, int i5, Money money, RewardStatus.Expiration expiration, String str4, ProfileRow profileRow) {
        money.getClass();
        this.id = i;
        this.code_entry_enabled = z;
        this.minimum_code_length = i2;
        this.reward_screen_enabled = z2;
        this.reward_button_text = str;
        this.reward_button_priority = i3;
        this.reward_header_text = str2;
        this.reward_main_text = str3;
        this.completed_reward_payments = i4;
        this.available_reward_payments = i5;
        this.reward_payment_amount = money;
        this.expiration = expiration;
        this.code_entry_client_route = str4;
        this.referral_status_screen = profileRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardStatus)) {
            return false;
        }
        RewardStatus rewardStatus = (RewardStatus) obj;
        return this.id == rewardStatus.id && this.code_entry_enabled == rewardStatus.code_entry_enabled && this.minimum_code_length == rewardStatus.minimum_code_length && this.reward_screen_enabled == rewardStatus.reward_screen_enabled && Intrinsics.areEqual(this.reward_button_text, rewardStatus.reward_button_text) && this.reward_button_priority == rewardStatus.reward_button_priority && Intrinsics.areEqual(this.reward_header_text, rewardStatus.reward_header_text) && Intrinsics.areEqual(this.reward_main_text, rewardStatus.reward_main_text) && this.completed_reward_payments == rewardStatus.completed_reward_payments && this.available_reward_payments == rewardStatus.available_reward_payments && Intrinsics.areEqual(this.reward_payment_amount, rewardStatus.reward_payment_amount) && this.expiration == rewardStatus.expiration && Intrinsics.areEqual(this.code_entry_client_route, rewardStatus.code_entry_client_route) && Intrinsics.areEqual(this.referral_status_screen, rewardStatus.referral_status_screen);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minimum_code_length, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.code_entry_enabled), 31), 31, this.reward_screen_enabled);
        String str = this.reward_button_text;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.reward_button_priority, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.reward_header_text;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reward_main_text;
        int m3 = NavAction$$ExternalSyntheticOutline0.m(this.reward_payment_amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.available_reward_payments, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.completed_reward_payments, (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31);
        RewardStatus.Expiration expiration = this.expiration;
        int hashCode2 = (m3 + (expiration == null ? 0 : expiration.hashCode())) * 31;
        String str4 = this.code_entry_client_route;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ProfileRow profileRow = this.referral_status_screen;
        return hashCode3 + (profileRow != null ? profileRow.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardStatus(id=");
        sb.append(this.id);
        sb.append(", code_entry_enabled=");
        sb.append(this.code_entry_enabled);
        sb.append(", minimum_code_length=");
        sb.append(this.minimum_code_length);
        sb.append(", reward_screen_enabled=");
        sb.append(this.reward_screen_enabled);
        sb.append(", reward_button_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.reward_button_text, ", reward_button_priority=", this.reward_button_priority, ", reward_header_text=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.reward_header_text, ", reward_main_text=", this.reward_main_text, ", completed_reward_payments=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.completed_reward_payments, this.available_reward_payments, ", available_reward_payments=", ", reward_payment_amount=", sb);
        sb.append(this.reward_payment_amount);
        sb.append(", expiration=");
        sb.append(this.expiration);
        sb.append(", code_entry_client_route=");
        sb.append(this.code_entry_client_route);
        sb.append(", referral_status_screen=");
        sb.append(this.referral_status_screen);
        sb.append(")");
        return sb.toString();
    }
}
