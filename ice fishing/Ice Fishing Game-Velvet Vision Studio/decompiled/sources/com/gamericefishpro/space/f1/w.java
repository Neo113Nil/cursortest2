package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((x) this.b).k--;
                break;
            default:
                ((com.gamericefishpro.space.t0.r) this.b).A--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((x) this.b).k++;
                break;
            default:
                ((com.gamericefishpro.space.t0.r) this.b).A++;
                break;
        }
    }
}
