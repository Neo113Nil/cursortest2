package com.google.android.gms.tapandpay;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.zaa;

/* loaded from: classes4.dex */
public abstract class zza {
    public static final Api zza = new Api("TapAndPay.TAP_AND_PAY_API", new zaa(13), new Api.ClientKey());
    public static final Feature[] zzD = {new Feature("tapandpay", 1), new Feature("tapandpay_account_linking", 1), new Feature("tapandpay_block_payment_cards", 1), new Feature("tapandpay_check_contactless_eligibility", 1), new Feature("tapandpay_dismiss_quick_access_wallet", 1), new Feature("tapandpay_felica_tos", 1), new Feature("tapandpay_get_all_cards_for_account", 1), new Feature("tapandpay_get_contactless_setup_configuration", 1), new Feature("tapandpay_get_last_attestation_result", 1), new Feature("tapandpay_get_token_details", 1), new Feature("tapandpay_global_actions", 1), new Feature("tapandpay_issuer_api", 2), new Feature("tapandpay_perform_tokenization_operation", 1), new Feature("tapandpay_push_tokenize", 1), new Feature("tapandpay_push_tokenize_session", 6), new Feature("tapandpay_quick_access_wallet", 1), new Feature("tapandpay_report_unlock", 1), new Feature("tapandpay_secureelement", 1), new Feature("tapandpay_show_wear_card_management_view", 1), new Feature("tapandpay_send_wear_request_to_phone", 1), new Feature("tapandpay_sync_device_info", 1), new Feature("tapandpay_tokenize_account", 1), new Feature("tapandpay_tokenize_cache", 1), new Feature("tapandpay_tokenize_pan", 1), new Feature("tapandpay_transmission_event", 1), new Feature("tapandpay_token_listing", 3), new Feature("tapandpay_wallet_feedback_psd", 1), new Feature("tapandpay_wallet_set_tap_doodle_enabled", 1), new Feature("tapandpay_wallet_ui_shown_status", 1)};
}
