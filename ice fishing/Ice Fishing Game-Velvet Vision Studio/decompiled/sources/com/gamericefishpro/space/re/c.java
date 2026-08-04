package com.gamericefishpro.space.re;

import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient realInstance) {
        Intrinsics.checkNotNullParameter(realInstance, "realInstance");
        this.realInstance = realInstance;
        this.googleApiClientListenerClass = realInstance.getClass();
    }

    public final com.gamericefishpro.space.s8.b blockingConnect() {
        try {
            Object objInvoke = this.googleApiClientListenerClass.getMethod("blockingConnect", null).invoke(this.realInstance, null);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (com.gamericefishpro.space.s8.b) objInvoke;
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
