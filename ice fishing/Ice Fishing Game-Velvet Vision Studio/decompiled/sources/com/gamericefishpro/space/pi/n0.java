package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends h1 {
    public final /* synthetic */ int w;
    public final Object y;

    public /* synthetic */ n0(int i, Object obj) {
        this.w = i;
        this.y = obj;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final boolean k() {
        switch (this.w) {
        }
        return false;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final void l(Throwable th) {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((m0) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                i1 i1Var = (i1) obj;
                Object obj2 = l1.d.get(j());
                if (!(obj2 instanceof q)) {
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    i1Var.resumeWith(a0.C(obj2));
                } else {
                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                    i1Var.resumeWith(com.gamericefishpro.space.wa.b.q(((q) obj2).a));
                }
                break;
        }
    }
}
