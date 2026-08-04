package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends h {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(String str, int i) {
        super(str);
        this.i = i;
    }

    @Override // com.gamericefishpro.space.i9.h
    public final n a(com.gamericefishpro.space.u6.n nVar, List list) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return n.j;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.j;
        }
    }
}
