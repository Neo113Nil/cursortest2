package com.google.android.gms.wallet;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.zaa;

/* loaded from: classes4.dex */
public abstract class zzk {
    public static final Api API = new Api("Wallet.API", new zaa(14), new Api.ClientKey());
    public static final Feature zzc;
    public static final Feature[] zzi;

    static {
        Feature feature = new Feature("wallet", 1L);
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        zzc = feature3;
        zzi = new Feature[]{feature, feature2, feature3, new Feature("wallet_1p_initialize_buyflow", 1L), new Feature("wallet_warm_up_ui_process", 1L), new Feature("wallet_get_setup_wizard_intent", 4L), new Feature("wallet_get_payment_card_recognition_intent", 1L), new Feature("wallet_save_instrument", 1L)};
    }
}
