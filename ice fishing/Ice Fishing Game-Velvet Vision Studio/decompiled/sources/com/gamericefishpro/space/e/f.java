package com.gamericefishpro.space.e;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d.s;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(int i, Object obj, boolean z) {
        this.d = i;
        this.i = obj;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) this.i;
                s sVar = (s) jVar.a;
                boolean z = this.e;
                sVar.b(z);
                ((com.gamericefishpro.space.f.a) jVar.b).f(z);
                return new h((com.gamericefishpro.space.a5.g) obj, jVar, 0);
            case 1:
                m mVar = (m) this.i;
                mVar.y(this.e);
                return new h((com.gamericefishpro.space.a5.g) obj, mVar, 1);
            default:
                com.gamericefishpro.space.h7.a aVar = (com.gamericefishpro.space.h7.a) this.i;
                ((com.gamericefishpro.space.t7.c) obj).getClass();
                return new com.gamericefishpro.space.t7.c(false, aVar, this.e);
        }
    }
}
