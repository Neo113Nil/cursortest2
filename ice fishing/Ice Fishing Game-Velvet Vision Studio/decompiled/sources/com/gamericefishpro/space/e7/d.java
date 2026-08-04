package com.gamericefishpro.space.e7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.b2.z;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Function2 {
    public int d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = context;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new d(this.e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        this.d = 1;
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(this));
        hVar.s();
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.e).build();
        installReferrerClientBuild.startConnection(new com.gamericefishpro.space.u6.e(2, installReferrerClientBuild, hVar));
        hVar.u(new z(1, installReferrerClientBuild));
        Object objR = hVar.r();
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return objR == aVar ? aVar : objR;
    }
}
