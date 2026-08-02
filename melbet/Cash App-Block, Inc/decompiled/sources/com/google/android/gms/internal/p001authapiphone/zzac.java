package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.Feature;

/* loaded from: classes4.dex */
public abstract class zzac {
    public static final Feature zzc;
    public static final Feature[] zze;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        zzc = feature3;
        zze = new Feature[]{feature, feature2, feature3, new Feature("user_consent", 3L)};
    }
}
