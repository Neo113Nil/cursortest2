package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends o1 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Function0 function0) {
        super(function0);
        f fVar = f.z;
        this.c = fVar;
    }

    @Override // com.gamericefishpro.space.t0.o1
    public final com.gamericefishpro.space.n.p a(Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.n.p(this, obj, obj == null, null, true);
            default:
                return new com.gamericefishpro.space.n.p(this, obj, obj == null, (m2) this.c, true);
        }
    }

    @Override // com.gamericefishpro.space.t0.o1
    public v2 b() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (b0) this.c;
            default:
                return super.b();
        }
    }

    public a0(Function1 function1) {
        super(new com.gamericefishpro.space.q0.n(9));
        this.c = new b0(function1);
    }
}
