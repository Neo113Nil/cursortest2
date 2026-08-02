package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class RootTelemetryConfigManager {
    public static RootTelemetryConfigManager zza;
    public static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration zzc;

    public static synchronized RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (zza == null) {
                    zza = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rootTelemetryConfigManager;
    }

    public final RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }
}
