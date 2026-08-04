package com.gamericefishpro.space.lb;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.bb.v;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.gamericefishpro.space.bb.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ v e;

    public /* synthetic */ b(v vVar, int i) {
        this.d = i;
        this.e = vVar;
    }

    @Override // com.gamericefishpro.space.bb.e
    public final Object a(com.gamericefishpro.space.b1.d dVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d((Context) dVar.b(Context.class), ((com.gamericefishpro.space.wa.g) dVar.b(com.gamericefishpro.space.wa.g.class)).d(), dVar.h(v.a(e.class)), dVar.e(com.gamericefishpro.space.vb.b.class), (Executor) dVar.f(this.e));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.e, dVar);
        }
    }
}
