package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.Feature;

/* loaded from: classes4.dex */
public abstract class zbas {
    public static final Feature zbb;
    public static final Feature[] zbi;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        zbb = feature2;
        zbi = new Feature[]{feature, feature2, new Feature("auth_api_credentials_authorize", 1L), new Feature("auth_api_credentials_revoke_access", 1L), new Feature("auth_api_credentials_save_password", 4L), new Feature("auth_api_credentials_get_sign_in_intent", 6L), new Feature("auth_api_credentials_save_account_linking_token", 3L), new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
