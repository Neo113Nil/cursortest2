package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends com.gamericefishpro.space.ui.p {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(CoroutineContext coroutineContext, com.gamericefishpro.space.th.a aVar, int i) {
        super(aVar, coroutineContext);
        this.w = i;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final boolean B(Throwable th) {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                if (th instanceof com.gamericefishpro.space.ti.k) {
                    return true;
                }
                return s(th);
        }
    }
}
