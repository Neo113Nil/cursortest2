package com.google.android.gms.location;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzae;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzo {
    public static final Feature[] zzp = {new Feature("name_ulr_private", 1), new Feature("name_sleep_segment_request", 1), new Feature("get_last_activity_feature_id", 1), new Feature("support_context_feature_id", 1), new Feature("get_current_location", 2), new Feature("get_last_location_with_request", 1), new Feature("set_mock_mode_with_callback", 1), new Feature("set_mock_location_with_callback", 1), new Feature("inject_location_with_callback", 1), new Feature("location_updates_with_callback", 1), new Feature("use_safe_parcelable_in_intents", 1), new Feature("flp_debug_updates", 1), new Feature("google_location_accuracy_enabled", 1), new Feature("geofences_with_callback", 1), new Feature("location_enabled", 1)};

    public static void zza(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        zzae.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String zzb(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public static String zzb$1(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }
}
