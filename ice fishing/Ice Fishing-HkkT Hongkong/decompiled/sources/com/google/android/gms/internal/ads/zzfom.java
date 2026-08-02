package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.AnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public enum zzfom {
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    JAVASCRIPT("javascript"),
    NONE(IntegrityManager.INTEGRITY_TYPE_NONE);

    private final String zze;

    zzfom(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
