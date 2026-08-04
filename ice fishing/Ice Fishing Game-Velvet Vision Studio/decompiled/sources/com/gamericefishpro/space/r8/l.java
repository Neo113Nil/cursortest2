package com.gamericefishpro.space.r8;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final int a;
    public final com.gamericefishpro.space.r9.h b = new com.gamericefishpro.space.r9.h();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public l(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final void b(com.gamericefishpro.space.f1.h hVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            hVar.toString();
        }
        this.b.a.l(hVar);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
