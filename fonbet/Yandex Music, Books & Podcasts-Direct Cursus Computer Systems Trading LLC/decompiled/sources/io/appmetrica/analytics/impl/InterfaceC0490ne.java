package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0490ne {
    void a(Location location);

    void a(@NonNull String str);

    void a(String str, String str2);

    void a(boolean z);

    void a(boolean z, boolean z2);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z);

    void setUserProfileID(String str);
}
