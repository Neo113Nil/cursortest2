package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final /* synthetic */ int a;

    public static final int a(int i, long j) {
        int i2 = a2.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public int b() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 16;
            default:
                return 8;
        }
    }
}
