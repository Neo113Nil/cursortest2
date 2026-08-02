package com.google.android.gms.internal.identity_credentials;

import com.google.android.gms.common.Feature;

/* loaded from: classes4.dex */
public abstract class zze {
    public static final Feature zza;
    public static final Feature zzf;
    public static final Feature[] zzo;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        zza = feature;
        Feature feature2 = new Feature("CREDENTIAL_REGISTRY", 1L);
        Feature feature3 = new Feature("CLEAR_REGISTRY", 2L);
        Feature feature4 = new Feature("CLEAR_CREATION_OPTIONS", 1L);
        Feature feature5 = new Feature("CLEAR_CREDENTIAL_STATE", 1L);
        Feature feature6 = new Feature("CREATE_CREDENTIAL", 3L);
        zzf = feature6;
        zzo = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, new Feature("REGISTER_CREATION_OPTIONS", 1L), new Feature("REGISTER_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS", 1L), new Feature("SIGNAL_CREDENTIAL_STATE", 1L), new Feature("CLEAR_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new Feature("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new Feature("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
