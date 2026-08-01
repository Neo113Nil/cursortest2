package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient realInstance) {
        kotlin.jvm.internal.h.e(realInstance, "realInstance");
        this.realInstance = realInstance;
        this.googleApiClientListenerClass = realInstance.getClass();
    }

    public final M2.b blockingConnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("blockingConnect", new Class[0]).invoke(this.realInstance, new Object[0]);
            kotlin.jvm.internal.h.c(invoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (M2.b) invoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
