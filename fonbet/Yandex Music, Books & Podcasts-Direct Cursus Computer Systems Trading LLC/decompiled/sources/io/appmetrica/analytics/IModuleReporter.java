package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface IModuleReporter {
    void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z);

    void reportEvent(@NonNull ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(@NonNull String str, byte[] bArr);
}
