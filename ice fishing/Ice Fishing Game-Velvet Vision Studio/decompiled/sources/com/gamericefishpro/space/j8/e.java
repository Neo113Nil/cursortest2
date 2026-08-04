package com.gamericefishpro.space.j8;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.e8.b {
    public final /* synthetic */ int d;
    public final com.gamericefishpro.space.nh.a e;

    public /* synthetic */ e(com.gamericefishpro.space.nh.a aVar, int i) {
        this.d = i;
        this.e = aVar;
    }

    @Override // com.gamericefishpro.space.nh.a
    public final Object get() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String packageName = ((Context) this.e.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new k(Integer.valueOf(k.v).intValue(), (Context) this.e.get(), "com.google.android.datatransport.events");
        }
    }
}
