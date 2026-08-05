package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.WearableStatusCodes;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zziy {
    public static Status zza(int i) {
        return new Status(i, WearableStatusCodes.getStatusCodeString(i));
    }
}
