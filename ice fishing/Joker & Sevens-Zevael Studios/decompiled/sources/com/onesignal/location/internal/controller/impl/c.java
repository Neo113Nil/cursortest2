package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.api.GoogleApiClient;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient googleApiClient) {
        j.e(googleApiClient, "realInstance");
        this.realInstance = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public final m6.b blockingConnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("blockingConnect", null).invoke(this.realInstance, null);
            j.c(invoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (m6.b) invoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", null).invoke(this.realInstance, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", null).invoke(this.realInstance, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
