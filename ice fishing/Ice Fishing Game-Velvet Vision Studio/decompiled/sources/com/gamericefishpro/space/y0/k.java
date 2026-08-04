package com.gamericefishpro.space.y0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j {
    public final /* synthetic */ int v;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.i;
                this.i = i + 2;
                Object[] objArr = this.d;
                return new s(1, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.i;
                this.i = i2 + 2;
                return this.d[i2];
            default:
                int i3 = this.i;
                this.i = i3 + 2;
                return this.d[i3 + 1];
        }
    }
}
