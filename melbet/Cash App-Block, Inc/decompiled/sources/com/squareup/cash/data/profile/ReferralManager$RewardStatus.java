package com.squareup.cash.data.profile;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RewardStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ReferralManager$RewardStatus {
    public final int available_reward_payments;
    public final String code_entry_client_route;
    public final boolean code_entry_enabled;
    public final int completed_reward_payments;
    public final RewardStatus.Expiration expiration;
    public final int minimum_code_length;
    public final ProfileRow referral_status_screen;
    public final String reward_header_text;
    public final String reward_main_text;
    public final Money reward_payment_amount;
    public final boolean reward_screen_enabled;
    public final boolean showReferralStatusBadge;

    public ReferralManager$RewardStatus(int i, int i2, Money money, RewardStatus.Expiration expiration, String str, String str2, int i3, boolean z, boolean z2, String str3, ProfileRow profileRow, boolean z3) {
        money.getClass();
        this.available_reward_payments = i;
        this.completed_reward_payments = i2;
        this.reward_payment_amount = money;
        this.expiration = expiration;
        this.reward_header_text = str;
        this.reward_main_text = str2;
        this.minimum_code_length = i3;
        this.code_entry_enabled = z;
        this.reward_screen_enabled = z2;
        this.code_entry_client_route = str3;
        this.referral_status_screen = profileRow;
        this.showReferralStatusBadge = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralManager$RewardStatus)) {
            return false;
        }
        ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) obj;
        return this.available_reward_payments == referralManager$RewardStatus.available_reward_payments && this.completed_reward_payments == referralManager$RewardStatus.completed_reward_payments && Intrinsics.areEqual(this.reward_payment_amount, referralManager$RewardStatus.reward_payment_amount) && this.expiration == referralManager$RewardStatus.expiration && Intrinsics.areEqual(this.reward_header_text, referralManager$RewardStatus.reward_header_text) && Intrinsics.areEqual(this.reward_main_text, referralManager$RewardStatus.reward_main_text) && this.minimum_code_length == referralManager$RewardStatus.minimum_code_length && this.code_entry_enabled == referralManager$RewardStatus.code_entry_enabled && this.reward_screen_enabled == referralManager$RewardStatus.reward_screen_enabled && Intrinsics.areEqual(this.code_entry_client_route, referralManager$RewardStatus.code_entry_client_route) && Intrinsics.areEqual(this.referral_status_screen, referralManager$RewardStatus.referral_status_screen) && this.showReferralStatusBadge == referralManager$RewardStatus.showReferralStatusBadge;
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.reward_payment_amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.completed_reward_payments, Integer.hashCode(this.available_reward_payments) * 31, 31), 31);
        RewardStatus.Expiration expiration = this.expiration;
        int hashCode = (m + (expiration == null ? 0 : expiration.hashCode())) * 31;
        String str = this.reward_header_text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reward_main_text;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minimum_code_length, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.code_entry_enabled), 31, this.reward_screen_enabled);
        String str3 = this.code_entry_client_route;
        int hashCode3 = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProfileRow profileRow = this.referral_status_screen;
        return Boolean.hashCode(this.showReferralStatusBadge) + ((hashCode3 + (profileRow != null ? profileRow.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.available_reward_payments, this.completed_reward_payments, "RewardStatus(available_reward_payments=", ", completed_reward_payments=", ", reward_payment_amount=");
        m107m.append(this.reward_payment_amount);
        m107m.append(", expiration=");
        m107m.append(this.expiration);
        m107m.append(", reward_header_text=");
        Boxes$$ExternalSyntheticOutline1.m(m107m, this.reward_header_text, ", reward_main_text=", this.reward_main_text, ", minimum_code_length=");
        m107m.append(this.minimum_code_length);
        m107m.append(", code_entry_enabled=");
        m107m.append(this.code_entry_enabled);
        m107m.append(", reward_screen_enabled=");
        NavAction$$ExternalSyntheticOutline0.m(m107m, this.reward_screen_enabled, ", code_entry_client_route=", this.code_entry_client_route, ", referral_status_screen=");
        m107m.append(this.referral_status_screen);
        m107m.append(", showReferralStatusBadge=");
        m107m.append(this.showReferralStatusBadge);
        m107m.append(")");
        return m107m.toString();
    }
}
