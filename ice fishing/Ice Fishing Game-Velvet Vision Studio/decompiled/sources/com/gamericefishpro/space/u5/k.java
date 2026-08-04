package com.gamericefishpro.space.u5;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements r, com.gamericefishpro.space.s5.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.s5.m
    public final Object c(String str, Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((q) this.b).c(str, function1, cVar);
            default:
                return ((com.gamericefishpro.space.v5.d) this.b).c(str, function1, cVar);
        }
    }

    @Override // com.gamericefishpro.space.u5.r
    public final com.gamericefishpro.space.c6.a d() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((q) this.b).a;
            default:
                return ((com.gamericefishpro.space.v5.d) this.b).a;
        }
    }
}
