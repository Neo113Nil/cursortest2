package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public interface Hc {
    void a(Location location);

    void a(String str);

    void a(String str, String str2);

    void a(boolean z2);

    void a(boolean z2, boolean z3);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z2);

    void setUserProfileID(String str);
}
