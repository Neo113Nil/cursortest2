package com.gamericefishpro.space.d;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ k e;

    public /* synthetic */ b(k kVar, int i) {
        this.d = i;
        this.e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.h(this.e);
                break;
            default:
                this.e.invalidateOptionsMenu();
                break;
        }
    }
}
